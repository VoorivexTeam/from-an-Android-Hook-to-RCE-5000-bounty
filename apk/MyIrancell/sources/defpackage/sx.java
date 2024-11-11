package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.zxing.client.android.R$string;
import com.google.zxing.client.android.j;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class sx extends qx {
    private final xy e;
    private final String f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sx(TextView textView, xy xyVar, zw zwVar, Context context) {
        super(textView, zwVar);
        this.f = context.getString(R$string.msg_redirect);
        this.e = xyVar;
    }

    @Override // defpackage.qx
    void a() {
        try {
            URI uri = new URI(this.e.c());
            URI a = j.a(uri);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i >= 5 || uri.equals(a)) {
                    return;
                }
                a(this.e.a(), (String) null, new String[]{this.f + " : " + a}, a.toString());
                i = i2;
                URI uri2 = a;
                a = j.a(a);
                uri = uri2;
            }
        } catch (URISyntaxException unused) {
        }
    }
}
