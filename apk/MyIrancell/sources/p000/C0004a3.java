package p000;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* renamed from: a3 */
/* loaded from: classes.dex */
public final class C0004a3 {

    /* renamed from: a3$a */
    /* loaded from: classes.dex */
    public interface a {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* renamed from: a3$b */
    /* loaded from: classes.dex */
    private static class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final a f26a;

        b(a aVar) {
            this.f26a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return this.f26a.equals(((b) obj).f26a);
        }

        public int hashCode() {
            return this.f26a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f26a.onTouchExplorationStateChanged(z);
        }
    }

    /* renamed from: a */
    public static boolean m41a(AccessibilityManager accessibilityManager, a aVar) {
        if (Build.VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    /* renamed from: b */
    public static boolean m42b(AccessibilityManager accessibilityManager, a aVar) {
        if (Build.VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
