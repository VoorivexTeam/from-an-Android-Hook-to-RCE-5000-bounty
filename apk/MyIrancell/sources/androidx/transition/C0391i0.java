package androidx.transition;

import android.os.IBinder;

/* renamed from: androidx.transition.i0 */
/* loaded from: classes.dex */
class C0391i0 implements InterfaceC0395k0 {

    /* renamed from: a */
    private final IBinder f2459a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0391i0(IBinder iBinder) {
        this.f2459a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0391i0) && ((C0391i0) obj).f2459a.equals(this.f2459a);
    }

    public int hashCode() {
        return this.f2459a.hashCode();
    }
}
