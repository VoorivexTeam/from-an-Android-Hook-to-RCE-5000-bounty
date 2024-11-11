package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.AbstractC0984o;
import com.google.android.gms.common.api.AbstractC0985p;
import com.google.android.gms.common.api.AbstractC0986q;
import com.google.android.gms.common.api.InterfaceC0979j;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.InterfaceC0983n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1057u;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.w1 */
/* loaded from: classes.dex */
public final class C0965w1<R extends InterfaceC0982m> extends AbstractC0986q<R> implements InterfaceC0983n<R> {

    /* renamed from: a */
    private AbstractC0985p<? super R, ? extends InterfaceC0982m> f5988a;

    /* renamed from: b */
    private C0965w1<? extends InterfaceC0982m> f5989b;

    /* renamed from: c */
    private volatile AbstractC0984o<? super R> f5990c;

    /* renamed from: d */
    private final Object f5991d;

    /* renamed from: e */
    private Status f5992e;

    /* renamed from: f */
    private final WeakReference<AbstractC0864f> f5993f;

    /* renamed from: g */
    private final HandlerC0973y1 f5994g;

    /* renamed from: a */
    private final void m6888a(Status status) {
        synchronized (this.f5991d) {
            this.f5992e = status;
            m6891b(status);
        }
    }

    /* renamed from: b */
    private final void m6891b(Status status) {
        synchronized (this.f5991d) {
            if (this.f5988a != null) {
                Status m6943a = this.f5988a.m6943a(status);
                C1057u.m7287a(m6943a, "onFailure must not return null");
                this.f5989b.m6888a(m6943a);
            } else if (m6893b()) {
                this.f5990c.m6941a(status);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m6892b(InterfaceC0982m interfaceC0982m) {
        if (interfaceC0982m instanceof InterfaceC0979j) {
            try {
                ((InterfaceC0979j) interfaceC0982m).mo6938d();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(interfaceC0982m);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    @GuardedBy("mSyncToken")
    /* renamed from: b */
    private final boolean m6893b() {
        return (this.f5990c == null || this.f5993f.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6895a() {
        this.f5990c = null;
    }

    @Override // com.google.android.gms.common.api.InterfaceC0983n
    /* renamed from: a */
    public final void mo6886a(R r) {
        synchronized (this.f5991d) {
            if (!r.mo6496e().m6500m()) {
                m6888a(r.mo6496e());
                m6892b(r);
            } else if (this.f5988a != null) {
                C0945r1.m6851a().submit(new RunnableC0977z1(this, r));
            } else if (m6893b()) {
                this.f5990c.m6942b(r);
            }
        }
    }
}
