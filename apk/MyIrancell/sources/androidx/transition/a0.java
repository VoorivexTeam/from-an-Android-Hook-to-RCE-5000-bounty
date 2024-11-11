package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
class a0 implements b0 {
    private final ViewOverlay a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(View view) {
        this.a = view.getOverlay();
    }

    @Override // androidx.transition.b0
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // androidx.transition.b0
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }
}
