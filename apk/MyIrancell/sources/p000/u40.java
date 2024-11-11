package p000;

import android.content.Context;
import ir.tapsell.sdk.C2688g;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.AdInfo;

/* loaded from: classes.dex */
public class u40 {

    /* renamed from: u40$a */
    /* loaded from: classes.dex */
    class RunnableC3287a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f13409b;

        RunnableC3287a(Context context) {
            this.f13409b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdInfo m15513a = t40.m15513a(this.f13409b);
                if (m15513a == null || m15513a.getAdvertisingId() == null) {
                    return;
                }
                C2688g.m12913j().m12926d(m15513a.getAdvertisingId());
                C2688g.m12913j().m12920b(m15513a.getLimitAdTrackingEnabled().booleanValue());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m15721a(Context context) {
        if (C2688g.m12913j().m12927e() == null || C2688g.m12913j().m12927e().isEmpty()) {
            new Thread(new RunnableC3287a(context)).start();
        }
    }
}
