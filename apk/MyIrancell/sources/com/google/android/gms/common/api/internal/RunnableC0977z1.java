package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.AbstractC0866h;
import com.google.android.gms.common.api.AbstractC0985p;
import com.google.android.gms.common.api.InterfaceC0982m;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.z1 */
/* loaded from: classes.dex */
final class RunnableC0977z1 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ InterfaceC0982m f6039b;

    /* renamed from: c */
    private final /* synthetic */ C0965w1 f6040c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0977z1(C0965w1 c0965w1, InterfaceC0982m interfaceC0982m) {
        this.f6040c = c0965w1;
        this.f6039b = interfaceC0982m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        HandlerC0973y1 handlerC0973y1;
        HandlerC0973y1 handlerC0973y12;
        WeakReference weakReference2;
        AbstractC0985p abstractC0985p;
        HandlerC0973y1 handlerC0973y13;
        HandlerC0973y1 handlerC0973y14;
        WeakReference weakReference3;
        try {
            try {
                BasePendingResult.f5716p.set(true);
                abstractC0985p = this.f6040c.f5988a;
                AbstractC0866h m6944a = abstractC0985p.m6944a((AbstractC0985p) this.f6039b);
                handlerC0973y13 = this.f6040c.f5994g;
                handlerC0973y14 = this.f6040c.f5994g;
                handlerC0973y13.sendMessage(handlerC0973y14.obtainMessage(0, m6944a));
                BasePendingResult.f5716p.set(false);
                C0965w1 c0965w1 = this.f6040c;
                C0965w1.m6892b(this.f6039b);
                weakReference3 = this.f6040c.f5993f;
                AbstractC0864f abstractC0864f = (AbstractC0864f) weakReference3.get();
                if (abstractC0864f != null) {
                    abstractC0864f.mo6554a(this.f6040c);
                }
            } catch (RuntimeException e) {
                handlerC0973y1 = this.f6040c.f5994g;
                handlerC0973y12 = this.f6040c.f5994g;
                handlerC0973y1.sendMessage(handlerC0973y12.obtainMessage(1, e));
                BasePendingResult.f5716p.set(false);
                C0965w1 c0965w12 = this.f6040c;
                C0965w1.m6892b(this.f6039b);
                weakReference2 = this.f6040c.f5993f;
                AbstractC0864f abstractC0864f2 = (AbstractC0864f) weakReference2.get();
                if (abstractC0864f2 != null) {
                    abstractC0864f2.mo6554a(this.f6040c);
                }
            }
        } catch (Throwable th) {
            BasePendingResult.f5716p.set(false);
            C0965w1 c0965w13 = this.f6040c;
            C0965w1.m6892b(this.f6039b);
            weakReference = this.f6040c.f5993f;
            AbstractC0864f abstractC0864f3 = (AbstractC0864f) weakReference.get();
            if (abstractC0864f3 != null) {
                abstractC0864f3.mo6554a(this.f6040c);
            }
            throw th;
        }
    }
}
