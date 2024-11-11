package p000;

import android.text.Html;
import android.widget.TextView;
import com.google.zxing.client.android.C2261j;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rx */
/* loaded from: classes.dex */
public final class AsyncTaskC3182rx extends AbstractAsyncTaskC3143qx {

    /* renamed from: f */
    private static final Pattern f12991f = Pattern.compile("<title>([^<]+)");

    /* renamed from: e */
    private final String f12992e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncTaskC3182rx(TextView textView, C3455xy c3455xy, C3544zw c3544zw) {
        super(textView, c3544zw);
        this.f12992e = c3455xy.m16523c();
    }

    @Override // p000.AbstractAsyncTaskC3143qx
    /* renamed from: a */
    void mo14667a() {
        String group;
        try {
            CharSequence m10883a = C2261j.m10883a(this.f12992e, C2261j.b.HTML, 4096);
            if (m10883a == null || m10883a.length() <= 0) {
                return;
            }
            Matcher matcher = f12991f.matcher(m10883a);
            if (!matcher.find() || (group = matcher.group(1)) == null || group.isEmpty()) {
                return;
            }
            String obj = Html.fromHtml(group).toString();
            if (obj.length() > 100) {
                obj = obj.substring(0, 100) + "...";
            }
            String str = this.f12992e;
            m15152a(str, (String) null, new String[]{obj}, str);
        } catch (IOException unused) {
        }
    }
}
