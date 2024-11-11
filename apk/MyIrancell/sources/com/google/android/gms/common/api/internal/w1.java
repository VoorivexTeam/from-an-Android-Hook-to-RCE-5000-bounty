package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class w1<R extends com.google.android.gms.common.api.m> extends com.google.android.gms.common.api.q<R> implements com.google.android.gms.common.api.n<R> {
    private com.google.android.gms.common.api.p<? super R, ? extends com.google.android.gms.common.api.m> a;
    private w1<? extends com.google.android.gms.common.api.m> b;
    private volatile com.google.android.gms.common.api.o<? super R> c;
    private final Object d;
    private Status e;
    private final WeakReference<com.google.android.gms.common.api.f> f;
    private final y1 g;

    private final void a(Status status) {
        synchronized (this.d) {
            this.e = status;
            b(status);
        }
    }

    private final void b(Status status) {
        synchronized (this.d) {
            if (this.a != null) {
                Status a = this.a.a(status);
                com.google.android.gms.common.internal.u.a(a, "onFailure must not return null");
                this.b.a(a);
            } else if (b()) {
                this.c.a(status);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.google.android.gms.common.api.m mVar) {
        if (mVar instanceof com.google.android.gms.common.api.j) {
            try {
                ((com.google.android.gms.common.api.j) mVar).d();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(mVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    @GuardedBy("mSyncToken")
    private final boolean b() {
        return (this.c == null || this.f.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = null;
    }

    @Override // com.google.android.gms.common.api.n
    public final void a(R r) {
        synchronized (this.d) {
            if (!r.e().m()) {
                a(r.e());
                b(r);
            } else if (this.a != null) {
                r1.a().submit(new z1(this, r));
            } else if (b()) {
                this.c.b(r);
            }
        }
    }
}
