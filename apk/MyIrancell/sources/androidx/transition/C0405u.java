package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: androidx.transition.u */
/* loaded from: classes.dex */
class C0405u implements InterfaceC0406v {

    /* renamed from: a */
    private final ViewGroupOverlay f2531a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0405u(ViewGroup viewGroup) {
        this.f2531a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.InterfaceC0377b0
    /* renamed from: a */
    public void mo2916a(Drawable drawable) {
        this.f2531a.add(drawable);
    }

    @Override // androidx.transition.InterfaceC0406v
    /* renamed from: a */
    public void mo3056a(View view) {
        this.f2531a.add(view);
    }

    @Override // androidx.transition.InterfaceC0377b0
    /* renamed from: b */
    public void mo2917b(Drawable drawable) {
        this.f2531a.remove(drawable);
    }

    @Override // androidx.transition.InterfaceC0406v
    /* renamed from: b */
    public void mo3057b(View view) {
        this.f2531a.remove(view);
    }
}
