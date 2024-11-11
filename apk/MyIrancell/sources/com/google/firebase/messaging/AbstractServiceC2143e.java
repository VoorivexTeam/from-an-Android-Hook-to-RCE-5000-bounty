package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.iid.BinderC2083b0;
import com.google.firebase.iid.C2131y;
import com.google.firebase.iid.InterfaceC2092e0;
import java.util.concurrent.ExecutorService;
import p000.AbstractC2871ks;
import p000.C2908ls;
import p000.C3000ns;
import p000.C3271tq;
import p000.C3496yq;
import p000.InterfaceC2484fs;
import p000.InterfaceC3315uq;
import p000.ThreadFactoryC3536zo;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes.dex */
public abstract class AbstractServiceC2143e extends Service {

    /* renamed from: b */
    private final ExecutorService f9011b;

    /* renamed from: c */
    private Binder f9012c;

    /* renamed from: d */
    private final Object f9013d;

    /* renamed from: e */
    private int f9014e;

    /* renamed from: f */
    private int f9015f;

    public AbstractServiceC2143e() {
        InterfaceC3315uq m15663a = C3271tq.m15663a();
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.f9011b = m15663a.mo15846a(new ThreadFactoryC3536zo(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")), C3496yq.f14277a);
        this.f9013d = new Object();
        this.f9015f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC2871ks<Void> m10769d(final Intent intent) {
        if (mo10746b(intent)) {
            return C3000ns.m14385a((Object) null);
        }
        final C2908ls c2908ls = new C2908ls();
        this.f9011b.execute(new Runnable(this, intent, c2908ls) { // from class: com.google.firebase.messaging.g

            /* renamed from: b */
            private final AbstractServiceC2143e f9019b;

            /* renamed from: c */
            private final Intent f9020c;

            /* renamed from: d */
            private final C2908ls f9021d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9019b = this;
                this.f9020c = intent;
                this.f9021d = c2908ls;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC2143e abstractServiceC2143e = this.f9019b;
                Intent intent2 = this.f9020c;
                C2908ls c2908ls2 = this.f9021d;
                try {
                    abstractServiceC2143e.mo10747c(intent2);
                } finally {
                    c2908ls2.m13926a((C2908ls) null);
                }
            }
        });
        return c2908ls.m13924a();
    }

    /* renamed from: f */
    private final void m10767f(Intent intent) {
        if (intent != null) {
            C2131y.m10724a(intent);
        }
        synchronized (this.f9013d) {
            int i = this.f9015f - 1;
            this.f9015f = i;
            if (i == 0) {
                stopSelfResult(this.f9014e);
            }
        }
    }

    /* renamed from: a */
    protected abstract Intent mo10742a(Intent intent);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m10768a(Intent intent, AbstractC2871ks abstractC2871ks) {
        m10767f(intent);
    }

    /* renamed from: b */
    public abstract boolean mo10746b(Intent intent);

    /* renamed from: c */
    public abstract void mo10747c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Log.isLoggable("EnhancedIntentService", 3);
        if (this.f9012c == null) {
            this.f9012c = new BinderC2083b0(new InterfaceC2092e0(this) { // from class: com.google.firebase.messaging.h

                /* renamed from: a */
                private final AbstractServiceC2143e f9022a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f9022a = this;
                }

                @Override // com.google.firebase.iid.InterfaceC2092e0
                /* renamed from: a */
                public final AbstractC2871ks mo10646a(Intent intent2) {
                    return this.f9022a.m10769d(intent2);
                }
            });
        }
        return this.f9012c;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f9011b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f9013d) {
            this.f9014e = i2;
            this.f9015f++;
        }
        Intent mo10742a = mo10742a(intent);
        if (mo10742a == null) {
            m10767f(intent);
            return 2;
        }
        AbstractC2871ks<Void> m10769d = m10769d(mo10742a);
        if (m10769d.mo11824d()) {
            m10767f(intent);
            return 2;
        }
        m10769d.mo11813a(ExecutorC2148j.f9025a, new InterfaceC2484fs(this, intent) { // from class: com.google.firebase.messaging.i

            /* renamed from: a */
            private final AbstractServiceC2143e f9023a;

            /* renamed from: b */
            private final Intent f9024b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9023a = this;
                this.f9024b = intent;
            }

            @Override // p000.InterfaceC2484fs
            /* renamed from: a */
            public final void mo5523a(AbstractC2871ks abstractC2871ks) {
                this.f9023a.m10768a(this.f9024b, abstractC2871ks);
            }
        });
        return 3;
    }
}
