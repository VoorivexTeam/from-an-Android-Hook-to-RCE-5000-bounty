package defpackage;

import android.text.Html;
import android.widget.TextView;
import com.google.zxing.client.android.j;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class rx extends qx {
    private static final Pattern f = Pattern.compile("<title>([^<]+)");
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rx(TextView textView, xy xyVar, zw zwVar) {
        super(textView, zwVar);
        this.e = xyVar.c();
    }

    @Override // defpackage.qx
    void a() {
        String group;
        try {
            CharSequence a = j.a(this.e, j.b.HTML, 4096);
            if (a == null || a.length() <= 0) {
                return;
            }
            Matcher matcher = f.matcher(a);
            if (!matcher.find() || (group = matcher.group(1)) == null || group.isEmpty()) {
                return;
            }
            String obj = Html.fromHtml(group).toString();
            if (obj.length() > 100) {
                obj = obj.substring(0, 100) + "...";
            }
            String str = this.e;
            a(str, (String) null, new String[]{obj}, str);
        } catch (IOException unused) {
        }
    }
}
