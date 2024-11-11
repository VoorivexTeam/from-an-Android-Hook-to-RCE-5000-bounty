package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class k {
    private ViewGroup a;
    private Runnable b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a(View view) {
        return (k) view.getTag(R$id.transition_current_scene);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, k kVar) {
        view.setTag(R$id.transition_current_scene, kVar);
    }

    public void a() {
        Runnable runnable;
        if (a(this.a) != this || (runnable = this.b) == null) {
            return;
        }
        runnable.run();
    }
}
