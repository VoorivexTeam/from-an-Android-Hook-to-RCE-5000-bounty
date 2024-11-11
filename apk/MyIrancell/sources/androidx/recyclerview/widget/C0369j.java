package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
class C0369j {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m2867a(RecyclerView.C0353z c0353z, AbstractC0367h abstractC0367h, View view, View view2, RecyclerView.AbstractC0342o abstractC0342o, boolean z) {
        if (abstractC0342o.m2514e() == 0 || c0353z.m2627a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC0342o.m2534l(view) - abstractC0342o.m2534l(view2)) + 1;
        }
        return Math.min(abstractC0367h.mo2862g(), abstractC0367h.mo2850a(view2) - abstractC0367h.mo2857d(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m2868a(RecyclerView.C0353z c0353z, AbstractC0367h abstractC0367h, View view, View view2, RecyclerView.AbstractC0342o abstractC0342o, boolean z, boolean z2) {
        if (abstractC0342o.m2514e() == 0 || c0353z.m2627a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (c0353z.m2627a() - Math.max(abstractC0342o.m2534l(view), abstractC0342o.m2534l(view2))) - 1) : Math.max(0, Math.min(abstractC0342o.m2534l(view), abstractC0342o.m2534l(view2)));
        if (z) {
            return Math.round((max * (Math.abs(abstractC0367h.mo2850a(view2) - abstractC0367h.mo2857d(view)) / (Math.abs(abstractC0342o.m2534l(view) - abstractC0342o.m2534l(view2)) + 1))) + (abstractC0367h.mo2860f() - abstractC0367h.mo2857d(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m2869b(RecyclerView.C0353z c0353z, AbstractC0367h abstractC0367h, View view, View view2, RecyclerView.AbstractC0342o abstractC0342o, boolean z) {
        if (abstractC0342o.m2514e() == 0 || c0353z.m2627a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0353z.m2627a();
        }
        return (int) (((abstractC0367h.mo2850a(view2) - abstractC0367h.mo2857d(view)) / (Math.abs(abstractC0342o.m2534l(view) - abstractC0342o.m2534l(view2)) + 1)) * c0353z.m2627a());
    }
}
