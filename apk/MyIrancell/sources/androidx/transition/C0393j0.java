package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: androidx.transition.j0 */
/* loaded from: classes.dex */
class C0393j0 implements InterfaceC0395k0 {

    /* renamed from: a */
    private final WindowId f2461a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0393j0(View view) {
        this.f2461a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0393j0) && ((C0393j0) obj).f2461a.equals(this.f2461a);
    }

    public int hashCode() {
        return this.f2461a.hashCode();
    }
}
