package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.iid.b0;
import com.google.firebase.iid.e0;
import com.google.firebase.iid.y;
import defpackage.fs;
import defpackage.ks;
import defpackage.ls;
import defpackage.ns;
import defpackage.tq;
import defpackage.uq;
import defpackage.yq;
import defpackage.zo;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes.dex */
public abstract class e extends Service {
    private final ExecutorService b;
    private Binder c;
    private final Object d;
    private int e;
    private int f;

    public e() {
        uq a = tq.a();
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.b = a.a(new zo(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")), yq.a);
        this.d = new Object();
        this.f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ks<Void> d(final Intent intent) {
        if (b(intent)) {
            return ns.a((Object) null);
        }
        final ls lsVar = new ls();
        this.b.execute(new Runnable(this, intent, lsVar) { // from class: com.google.firebase.messaging.g
            private final e b;
            private final Intent c;
            private final ls d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = this;
                this.c = intent;
                this.d = lsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = this.b;
                Intent intent2 = this.c;
                ls lsVar2 = this.d;
                try {
                    eVar.c(intent2);
                } finally {
                    lsVar2.a((ls) null);
                }
            }
        });
        return lsVar.a();
    }

    private final void f(Intent intent) {
        if (intent != null) {
            y.a(intent);
        }
        synchronized (this.d) {
            int i = this.f - 1;
            this.f = i;
            if (i == 0) {
                stopSelfResult(this.e);
            }
        }
    }

    protected abstract Intent a(Intent intent);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(Intent intent, ks ksVar) {
        f(intent);
    }

    public abstract boolean b(Intent intent);

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Log.isLoggable("EnhancedIntentService", 3);
        if (this.c == null) {
            this.c = new b0(new e0(this) { // from class: com.google.firebase.messaging.h
                private final e a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                }

                @Override // com.google.firebase.iid.e0
                public final ks a(Intent intent2) {
                    return this.a.d(intent2);
                }
            });
        }
        return this.c;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.d) {
            this.e = i2;
            this.f++;
        }
        Intent a = a(intent);
        if (a == null) {
            f(intent);
            return 2;
        }
        ks<Void> d = d(a);
        if (d.d()) {
            f(intent);
            return 2;
        }
        d.a(j.a, new fs(this, intent) { // from class: com.google.firebase.messaging.i
            private final e a;
            private final Intent b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = intent;
            }

            @Override // defpackage.fs
            public final void a(ks ksVar) {
                this.a.a(this.b, ksVar);
            }
        });
        return 3;
    }
}
