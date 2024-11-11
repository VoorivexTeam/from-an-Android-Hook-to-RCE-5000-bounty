package p000;

import android.content.Context;
import android.text.Html;
import android.widget.TextView;
import com.google.zxing.client.android.C2261j;
import com.google.zxing.client.android.C2264m;
import com.google.zxing.client.android.R$string;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: px */
/* loaded from: classes.dex */
public final class AsyncTaskC3101px extends AbstractAsyncTaskC3143qx {

    /* renamed from: h */
    private static final Pattern[] f12640h = {Pattern.compile(",event\\)\">([^<]+)</a></h3>.+<span class=psrp>([^<]+)</span>"), Pattern.compile("owb63p\">([^<]+).+zdi3pb\">([^<]+)")};

    /* renamed from: e */
    private final String f12641e;

    /* renamed from: f */
    private final String f12642f;

    /* renamed from: g */
    private final Context f12643g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncTaskC3101px(TextView textView, String str, C3544zw c3544zw, Context context) {
        super(textView, c3544zw);
        this.f12641e = str;
        this.f12642f = context.getString(R$string.msg_google_product);
        this.f12643g = context;
    }

    /* renamed from: a */
    private static String m14841a(String str) {
        return Html.fromHtml(str).toString();
    }

    @Override // p000.AbstractAsyncTaskC3143qx
    /* renamed from: a */
    void mo14667a() {
        String str = "https://www.google." + C2264m.m10903d(this.f12643g) + "/m/products?ie=utf8&oe=utf8&scoring=p&source=zxing&q=" + URLEncoder.encode(this.f12641e, "UTF-8");
        CharSequence m10882a = C2261j.m10882a(str, C2261j.b.HTML);
        for (Pattern pattern : f12640h) {
            Matcher matcher = pattern.matcher(m10882a);
            if (matcher.find()) {
                m15152a(this.f12641e, this.f12642f, new String[]{m14841a(matcher.group(1)), m14841a(matcher.group(2))}, str);
                return;
            }
        }
    }
}
