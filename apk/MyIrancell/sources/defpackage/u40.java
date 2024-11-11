package defpackage;

import android.content.Context;
import ir.tapsell.sdk.g;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.AdInfo;

/* loaded from: classes.dex */
public class u40 {

    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ Context b;

        a(Context context) {
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdInfo a = t40.a(this.b);
                if (a == null || a.getAdvertisingId() == null) {
                    return;
                }
                g.j().d(a.getAdvertisingId());
                g.j().b(a.getLimitAdTrackingEnabled().booleanValue());
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context) {
        if (g.j().e() == null || g.j().e().isEmpty()) {
            new Thread(new a(context)).start();
        }
    }
}
