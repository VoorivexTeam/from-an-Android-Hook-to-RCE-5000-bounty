package p000;

import android.os.Build;
import android.os.CancellationSignal;

/* renamed from: e1 */
/* loaded from: classes.dex */
public final class C2413e1 {

    /* renamed from: a */
    private boolean f9897a;

    /* renamed from: b */
    private a f9898b;

    /* renamed from: c */
    private Object f9899c;

    /* renamed from: e1$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m11521a();
    }

    /* renamed from: a */
    public void m11517a() {
        synchronized (this) {
            if (this.f9897a) {
                return;
            }
            this.f9897a = true;
            a aVar = this.f9898b;
            Object obj = this.f9899c;
            if (aVar != null) {
                try {
                    aVar.m11521a();
                } catch (Throwable th) {
                    synchronized (this) {
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public Object m11518b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f9899c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f9899c = cancellationSignal;
                if (this.f9897a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f9899c;
        }
        return obj;
    }

    /* renamed from: c */
    public boolean m11519c() {
        boolean z;
        synchronized (this) {
            z = this.f9897a;
        }
        return z;
    }

    /* renamed from: d */
    public void m11520d() {
        if (m11519c()) {
            throw new C2453f1();
        }
    }
}
