package p000;

import android.content.Context;
import android.widget.TextView;
import com.google.zxing.client.android.C2261j;
import com.google.zxing.client.android.R$string;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sx */
/* loaded from: classes.dex */
public final class AsyncTaskC3226sx extends AbstractAsyncTaskC3143qx {

    /* renamed from: e */
    private final C3455xy f13150e;

    /* renamed from: f */
    private final String f13151f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncTaskC3226sx(TextView textView, C3455xy c3455xy, C3544zw c3544zw, Context context) {
        super(textView, c3544zw);
        this.f13151f = context.getString(R$string.msg_redirect);
        this.f13150e = c3455xy;
    }

    @Override // p000.AbstractAsyncTaskC3143qx
    /* renamed from: a */
    void mo14667a() {
        try {
            URI uri = new URI(this.f13150e.m16523c());
            URI m10888a = C2261j.m10888a(uri);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i >= 5 || uri.equals(m10888a)) {
                    return;
                }
                m15152a(this.f13150e.mo3459a(), (String) null, new String[]{this.f13151f + " : " + m10888a}, m10888a.toString());
                i = i2;
                URI uri2 = m10888a;
                m10888a = C2261j.m10888a(m10888a);
                uri = uri2;
            }
        } catch (URISyntaxException unused) {
        }
    }
}
