package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: androidx.transition.a0 */
/* loaded from: classes.dex */
class C0375a0 implements InterfaceC0377b0 {

    /* renamed from: a */
    private final ViewOverlay f2375a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0375a0(View view) {
        this.f2375a = view.getOverlay();
    }

    @Override // androidx.transition.InterfaceC0377b0
    /* renamed from: a */
    public void mo2916a(Drawable drawable) {
        this.f2375a.add(drawable);
    }

    @Override // androidx.transition.InterfaceC0377b0
    /* renamed from: b */
    public void mo2917b(Drawable drawable) {
        this.f2375a.remove(drawable);
    }
}
