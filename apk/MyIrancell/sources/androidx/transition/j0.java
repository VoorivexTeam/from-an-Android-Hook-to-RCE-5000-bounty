package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
class j0 implements k0 {
    private final WindowId a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof j0) && ((j0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
