package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ir.tapsell.sdk.C2687f;
import ir.tapsell.sdk.InterfaceC2685d;
import ir.tapsell.sdk.TapsellAd;
import ir.tapsell.sdk.TapsellAdRequestListener;
import ir.tapsell.sdk.TapsellAdShowListener;
import ir.tapsell.sdk.TapsellInjector;
import ir.tapsell.sdk.TapsellRewardListener;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class v40 {

    /* renamed from: c */
    private static final Semaphore f13582c = new Semaphore(1);

    /* renamed from: d */
    private static v40 f13583d;

    /* renamed from: a */
    private final InterfaceC2685d f13584a = new TapsellInjector().getDirectCommunicationService();

    /* renamed from: b */
    private final Handler f13585b = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v40$a */
    /* loaded from: classes.dex */
    public class RunnableC3331a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f13586b;

        RunnableC3331a(String str) {
            this.f13586b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.f13584a != null) {
                v40.this.f13584a.removeZoneListenerAfterDirectAdShowingWasCalled(this.f13586b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v40$b */
    /* loaded from: classes.dex */
    public class RunnableC3332b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ TapsellAd f13588b;

        /* renamed from: c */
        final /* synthetic */ boolean f13589c;

        RunnableC3332b(TapsellAd tapsellAd, boolean z) {
            this.f13588b = tapsellAd;
            this.f13589c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.f13584a != null) {
                if (v40.this.f13584a.needsDirectAdCaching()) {
                    C2687f.m12904b(this.f13588b);
                }
                v40.this.f13584a.onDirectAdShowFinished(this.f13588b.getZoneId(), this.f13588b, this.f13589c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v40$c */
    /* loaded from: classes.dex */
    public class RunnableC3333c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ TapsellAd f13591b;

        /* renamed from: c */
        final /* synthetic */ String f13592c;

        RunnableC3333c(TapsellAd tapsellAd, String str) {
            this.f13591b = tapsellAd;
            this.f13592c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.f13584a != null) {
                if (v40.this.f13584a.needsDirectAdCaching()) {
                    C2687f.m12896a(this.f13591b);
                }
                v40.this.f13584a.onDirectAdAvailable(this.f13592c, this.f13591b);
            }
        }
    }

    /* renamed from: v40$d */
    /* loaded from: classes.dex */
    class RunnableC3334d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f13594b;

        /* renamed from: c */
        final /* synthetic */ String f13595c;

        RunnableC3334d(String str, String str2) {
            this.f13594b = str;
            this.f13595c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.f13584a != null) {
                v40.this.f13584a.onDirectError(this.f13594b, this.f13595c);
            }
        }
    }

    /* renamed from: v40$e */
    /* loaded from: classes.dex */
    class RunnableC3335e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f13597b;

        RunnableC3335e(String str) {
            this.f13597b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.f13584a != null) {
                v40.this.f13584a.onDirectNoAdAvailable(this.f13597b);
            }
        }
    }

    /* renamed from: v40$f */
    /* loaded from: classes.dex */
    class RunnableC3336f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ TapsellAd f13599b;

        RunnableC3336f(TapsellAd tapsellAd) {
            this.f13599b = tapsellAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.f13584a != null) {
                if (v40.this.f13584a.needsDirectAdCaching()) {
                    C2687f.m12904b(this.f13599b);
                }
                v40.this.f13584a.onDirectAdExpiring(this.f13599b.getZoneId(), this.f13599b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v40$g */
    /* loaded from: classes.dex */
    public class RunnableC3337g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ TapsellAd f13601b;

        RunnableC3337g(TapsellAd tapsellAd) {
            this.f13601b = tapsellAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.f13584a != null) {
                v40.this.f13584a.onDirectAdOpened(this.f13601b.getId(), this.f13601b);
            }
        }
    }

    /* renamed from: v40$h */
    /* loaded from: classes.dex */
    class RunnableC3338h implements Runnable {

        /* renamed from: b */
        final /* synthetic */ TapsellAd f13603b;

        RunnableC3338h(TapsellAd tapsellAd) {
            this.f13603b = tapsellAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v40.this.f13584a != null) {
                v40.this.f13584a.onDirectAdClosed(this.f13603b.getId(), this.f13603b);
            }
        }
    }

    private v40() {
    }

    /* renamed from: a */
    public static v40 m15925a() {
        if (f13583d == null) {
            try {
                f13582c.acquire();
            } catch (Throwable th) {
                g50.m11895a(th);
            }
            if (f13583d == null) {
                f13583d = new v40();
            }
            f13582c.release();
        }
        return f13583d;
    }

    /* renamed from: a */
    public void m15926a(Context context, TapsellAd tapsellAd) {
        this.f13585b.post(new RunnableC3338h(tapsellAd));
    }

    /* renamed from: a */
    public void m15927a(Context context, TapsellAd tapsellAd, boolean z) {
        i50.m12368a("notifyOnAdShowFinished");
        this.f13585b.post(new RunnableC3332b(tapsellAd, z));
    }

    /* renamed from: a */
    public void m15928a(TapsellAd tapsellAd) {
        this.f13585b.post(new RunnableC3337g(tapsellAd));
    }

    /* renamed from: a */
    public void m15929a(TapsellRewardListener tapsellRewardListener) {
        InterfaceC2685d interfaceC2685d = this.f13584a;
        if (interfaceC2685d != null) {
            interfaceC2685d.setDirectAdRewardCallback(tapsellRewardListener);
        }
    }

    /* renamed from: a */
    public void m15930a(String str) {
        this.f13585b.post(new RunnableC3331a(str));
    }

    /* renamed from: a */
    public void m15931a(String str, TapsellAd tapsellAd) {
        this.f13585b.post(new RunnableC3333c(tapsellAd, str));
    }

    /* renamed from: a */
    public void m15932a(String str, TapsellAdRequestListener tapsellAdRequestListener) {
        InterfaceC2685d interfaceC2685d = this.f13584a;
        if (interfaceC2685d != null) {
            interfaceC2685d.subscribeDirectAdRequestCallbacks(str, tapsellAdRequestListener);
        }
    }

    /* renamed from: a */
    public void m15933a(String str, TapsellAdShowListener tapsellAdShowListener) {
        InterfaceC2685d interfaceC2685d = this.f13584a;
        if (interfaceC2685d != null) {
            interfaceC2685d.subscribeDirectAdShowCallbacks(str, tapsellAdShowListener);
        }
    }

    /* renamed from: a */
    public void m15934a(String str, String str2) {
        this.f13585b.post(new RunnableC3334d(str, str2));
    }

    /* renamed from: b */
    public void m15935b(String str) {
        this.f13585b.post(new RunnableC3335e(str));
    }

    /* renamed from: b */
    public void m15936b(String str, TapsellAd tapsellAd) {
        this.f13585b.post(new RunnableC3336f(tapsellAd));
    }
}
