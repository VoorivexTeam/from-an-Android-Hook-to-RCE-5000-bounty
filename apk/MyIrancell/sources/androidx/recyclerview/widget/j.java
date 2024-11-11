package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.z zVar, h hVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.e() == 0 || zVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.l(view) - oVar.l(view2)) + 1;
        }
        return Math.min(hVar.g(), hVar.a(view2) - hVar.d(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.z zVar, h hVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.e() == 0 || zVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (zVar.a() - Math.max(oVar.l(view), oVar.l(view2))) - 1) : Math.max(0, Math.min(oVar.l(view), oVar.l(view2)));
        if (z) {
            return Math.round((max * (Math.abs(hVar.a(view2) - hVar.d(view)) / (Math.abs(oVar.l(view) - oVar.l(view2)) + 1))) + (hVar.f() - hVar.d(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(RecyclerView.z zVar, h hVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.e() == 0 || zVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zVar.a();
        }
        return (int) (((hVar.a(view2) - hVar.d(view)) / (Math.abs(oVar.l(view) - oVar.l(view2)) + 1)) * zVar.a());
    }
}
