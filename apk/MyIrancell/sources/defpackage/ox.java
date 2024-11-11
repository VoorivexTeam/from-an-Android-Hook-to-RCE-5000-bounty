package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.zxing.client.android.R$string;
import com.google.zxing.client.android.j;
import com.google.zxing.client.android.m;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
final class ox extends qx {
    private final String e;
    private final String f;
    private final Context g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ox(TextView textView, String str, zw zwVar, Context context) {
        super(textView, zwVar);
        this.e = str;
        this.f = context.getString(R$string.msg_google_books);
        this.g = context;
    }

    @Override // defpackage.qx
    void a() {
        JSONObject jSONObject;
        ArrayList arrayList;
        CharSequence a = j.a("https://www.googleapis.com/books/v1/volumes?q=isbn:" + this.e, j.b.JSON);
        if (a.length() == 0) {
            return;
        }
        try {
            JSONArray optJSONArray = ((JSONObject) new JSONTokener(a.toString()).nextValue()).optJSONArray("items");
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
                qx.a(optString, arrayList2);
                qx.a(arrayList, arrayList2);
                if (optString2 != null && !optString2.isEmpty()) {
                    str = optString2 + "pp.";
                }
                qx.a(str, arrayList2);
                String str2 = "http://www.google." + m.a(this.g) + "/search?tbm=bks&source=zxing&q=";
                a(this.e, this.f, (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2 + this.e);
            }
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
