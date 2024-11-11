package p000;

import android.content.Context;
import android.widget.TextView;
import com.google.zxing.client.android.C2261j;
import com.google.zxing.client.android.C2264m;
import com.google.zxing.client.android.R$string;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ox */
/* loaded from: classes.dex */
public final class AsyncTaskC3062ox extends AbstractAsyncTaskC3143qx {

    /* renamed from: e */
    private final String f12537e;

    /* renamed from: f */
    private final String f12538f;

    /* renamed from: g */
    private final Context f12539g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncTaskC3062ox(TextView textView, String str, C3544zw c3544zw, Context context) {
        super(textView, c3544zw);
        this.f12537e = str;
        this.f12538f = context.getString(R$string.msg_google_books);
        this.f12539g = context;
    }

    @Override // p000.AbstractAsyncTaskC3143qx
    /* renamed from: a */
    void mo14667a() {
        JSONObject jSONObject;
        ArrayList arrayList;
        CharSequence m10882a = C2261j.m10882a("https://www.googleapis.com/books/v1/volumes?q=isbn:" + this.f12537e, C2261j.b.JSON);
        if (m10882a.length() == 0) {
            return;
        }
        try {
            JSONArray optJSONArray = ((JSONObject) new JSONTokener(m10882a.toString()).nextValue()).optJSONArray("items");
            if (optJSONArray != null) {
                if (optJSONArray.isNull(0) || (jSONObject = ((JSONObject) optJSONArray.get(0)).getJSONObject("volumeInfo")) == null) {
                    return;
                }
                String optString = jSONObject.optString("title");
                String optString2 = jSONObject.optString("pageCount");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("authors");
                String str = null;
                if (optJSONArray2 == null || optJSONArray2.isNull(0)) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(optJSONArray2.length());
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        arrayList.add(optJSONArray2.getString(i));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                AbstractAsyncTaskC3143qx.m15150a(optString, arrayList2);
                AbstractAsyncTaskC3143qx.m15151a(arrayList, arrayList2);
                if (optString2 != null && !optString2.isEmpty()) {
                    str = optString2 + "pp.";
                }
                AbstractAsyncTaskC3143qx.m15150a(str, arrayList2);
                String str2 = "http://www.google." + C2264m.m10898a(this.f12539g) + "/search?tbm=bks&source=zxing&q=";
                m15152a(this.f12537e, this.f12538f, (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2 + this.f12537e);
            }
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
