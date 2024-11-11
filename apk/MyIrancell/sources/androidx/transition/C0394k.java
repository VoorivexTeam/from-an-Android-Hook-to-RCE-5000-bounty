package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.k */
/* loaded from: classes.dex */
public class C0394k {

    /* renamed from: a */
    private ViewGroup f2462a;

    /* renamed from: b */
    private Runnable f2463b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0394k m2989a(View view) {
        return (C0394k) view.getTag(R$id.transition_current_scene);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2990a(View view, C0394k c0394k) {
        view.setTag(R$id.transition_current_scene, c0394k);
    }

    /* renamed from: a */
    public void m2991a() {
        Runnable runnable;
        if (m2989a(this.f2462a) != this || (runnable = this.f2463b) == null) {
            return;
        }
        runnable.run();
    }
}
