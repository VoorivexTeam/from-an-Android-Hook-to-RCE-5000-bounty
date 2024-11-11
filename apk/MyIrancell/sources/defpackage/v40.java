package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ir.tapsell.sdk.TapsellAd;
import ir.tapsell.sdk.TapsellAdRequestListener;
import ir.tapsell.sdk.TapsellAdShowListener;
import ir.tapsell.sdk.TapsellInjector;
import ir.tapsell.sdk.TapsellRewardListener;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class v40 {
    private static final Semaphore c = new Semaphore(1);
    private static v40 d;
    private final ir.tapsell.sdk.d a = new TapsellInjector().getDirectCommunicationService();
    private final Handler b = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ String b;

        a(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.a != null) {
                v40.this.a.removeZoneListenerAfterDirectAdShowingWasCalled(this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ TapsellAd b;
        final /* synthetic */ boolean c;

        b(TapsellAd tapsellAd, boolean z) {
            this.b = tapsellAd;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.a != null) {
                if (v40.this.a.needsDirectAdCaching()) {
                    ir.tapsell.sdk.f.b(this.b);
                }
                v40.this.a.onDirectAdShowFinished(this.b.getZoneId(), this.b, this.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        final /* synthetic */ TapsellAd b;
        final /* synthetic */ String c;

        c(TapsellAd tapsellAd, String str) {
            this.b = tapsellAd;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.a != null) {
                if (v40.this.a.needsDirectAdCaching()) {
                    ir.tapsell.sdk.f.a(this.b);
                }
                v40.this.a.onDirectAdAvailable(this.c, this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        d(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.a != null) {
                v40.this.a.onDirectError(this.b, this.c);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {
        final /* synthetic */ String b;

        e(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.a != null) {
                v40.this.a.onDirectNoAdAvailable(this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {
        final /* synthetic */ TapsellAd b;

        f(TapsellAd tapsellAd) {
            this.b = tapsellAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.a != null) {
                if (v40.this.a.needsDirectAdCaching()) {
                    ir.tapsell.sdk.f.b(this.b);
                }
                v40.this.a.onDirectAdExpiring(this.b.getZoneId(), this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        final /* synthetic */ TapsellAd b;

        g(TapsellAd tapsellAd) {
            this.b = tapsellAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.a != null) {
                v40.this.a.onDirectAdOpened(this.b.getId(), this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {
        final /* synthetic */ TapsellAd b;

        h(TapsellAd tapsellAd) {
            this.b = tapsellAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.a != null) {
                v40.this.a.onDirectAdClosed(this.b.getId(), this.b);
            }
        }
    }

    private v40() {
    }

    public static v40 a() {
        if (d == null) {
            try {
                c.acquire();
            } catch (Throwable th) {
                g50.a(th);
            }
            if (d == null) {
                d = new v40();
            }
            c.release();
        }
        return d;
    }

    public void a(Context context, TapsellAd tapsellAd) {
        this.b.post(new h(tapsellAd));
    }

    public void a(Context context, TapsellAd tapsellAd, boolean z) {
        i50.a("notifyOnAdShowFinished");
        this.b.post(new b(tapsellAd, z));
    }

    public void a(TapsellAd tapsellAd) {
        this.b.post(new g(tapsellAd));
    }

    public void a(TapsellRewardListener tapsellRewardListener) {
        ir.tapsell.sdk.d dVar = this.a;
        if (dVar != null) {
            dVar.setDirectAdRewardCallback(tapsellRewardListener);
        }
    }

    public void a(String str) {
        this.b.post(new a(str));
    }

    public void a(String str, TapsellAd tapsellAd) {
        this.b.post(new c(tapsellAd, str));
    }

    public void a(String str, TapsellAdRequestListener tapsellAdRequestListener) {
        ir.tapsell.sdk.d dVar = this.a;
        if (dVar != null) {
            dVar.subscribeDirectAdRequestCallbacks(str, tapsellAdRequestListener);
        }
    }

    public void a(String str, TapsellAdShowListener tapsellAdShowListener) {
        ir.tapsell.sdk.d dVar = this.a;
        if (dVar != null) {
            dVar.subscribeDirectAdShowCallbacks(str, tapsellAdShowListener);
        }
    }

    public void a(String str, String str2) {
        this.b.post(new d(str, str2));
    }

    public void b(String str) {
        this.b.post(new e(str));
    }

    public void b(String str, TapsellAd tapsellAd) {
        this.b.post(new f(tapsellAd));
    }
}
