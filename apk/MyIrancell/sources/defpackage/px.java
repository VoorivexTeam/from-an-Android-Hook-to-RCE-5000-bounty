package defpackage;

import android.content.Context;
import android.text.Html;
import android.widget.TextView;
import com.google.zxing.client.android.R$string;
import com.google.zxing.client.android.j;
import com.google.zxing.client.android.m;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class px extends qx {
    private static final Pattern[] h = {Pattern.compile(",event\\)\">([^<]+)</a></h3>.+<span class=psrp>([^<]+)</span>"), Pattern.compile("owb63p\">([^<]+).+zdi3pb\">([^<]+)")};
    private final String e;
    private final String f;
    private final Context g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public px(TextView textView, String str, zw zwVar, Context context) {
        super(textView, zwVar);
        this.e = str;
        this.f = context.getString(R$string.msg_google_product);
        this.g = context;
    }

    private static String a(String str) {
        return Html.fromHtml(str).toString();
    }

    @Override // defpackage.qx
    void a() {
        String str = "https://www.google." + m.d(this.g) + "/m/products?ie=utf8&oe=utf8&scoring=p&source=zxing&q=" + URLEncoder.encode(this.e, "UTF-8");
        CharSequence a = j.a(str, j.b.HTML);
        for (Pattern pattern : h) {
            Matcher matcher = pattern.matcher(a);
            if (matcher.find()) {
                a(this.e, this.f, new String[]{a(matcher.group(1)), a(matcher.group(2))}, str);
                return;
            }
        }
    }
}
