package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public abstract class AbstractC0370k extends RecyclerView.AbstractC0339l {

    /* renamed from: g */
    boolean f2360g = true;

    /* renamed from: a */
    public final void m2870a(RecyclerView.AbstractC0330c0 abstractC0330c0, boolean z) {
        m2872c(abstractC0330c0, z);
        m2429b(abstractC0330c0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l
    /* renamed from: a */
    public boolean mo2424a(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        return !this.f2360g || abstractC0330c0.m2360n();
    }

    /* renamed from: a */
    public abstract boolean mo2795a(RecyclerView.AbstractC0330c0 abstractC0330c0, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo2796a(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0330c0 abstractC0330c02, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l
    /* renamed from: a */
    public boolean mo2425a(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0330c0 abstractC0330c02, RecyclerView.AbstractC0339l.c cVar, RecyclerView.AbstractC0339l.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f2105a;
        int i4 = cVar.f2106b;
        if (abstractC0330c02.m2370x()) {
            int i5 = cVar.f2105a;
            i2 = cVar.f2106b;
            i = i5;
        } else {
            i = cVar2.f2105a;
            i2 = cVar2.f2106b;
        }
        return mo2796a(abstractC0330c0, abstractC0330c02, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l
    /* renamed from: a */
    public boolean mo2426a(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0339l.c cVar, RecyclerView.AbstractC0339l.c cVar2) {
        return (cVar == null || (cVar.f2105a == cVar2.f2105a && cVar.f2106b == cVar2.f2106b)) ? mo2798f(abstractC0330c0) : mo2795a(abstractC0330c0, cVar.f2105a, cVar.f2106b, cVar2.f2105a, cVar2.f2106b);
    }

    /* renamed from: b */
    public final void m2871b(RecyclerView.AbstractC0330c0 abstractC0330c0, boolean z) {
        m2873d(abstractC0330c0, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l
    /* renamed from: b */
    public boolean mo2430b(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0339l.c cVar, RecyclerView.AbstractC0339l.c cVar2) {
        int i = cVar.f2105a;
        int i2 = cVar.f2106b;
        View view = abstractC0330c0.f2076a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2105a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2106b;
        if (abstractC0330c0.m2362p() || (i == left && i2 == top)) {
            return mo2799g(abstractC0330c0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo2795a(abstractC0330c0, i, i2, left, top);
    }

    /* renamed from: c */
    public void m2872c(RecyclerView.AbstractC0330c0 abstractC0330c0, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l
    /* renamed from: c */
    public boolean mo2433c(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0339l.c cVar, RecyclerView.AbstractC0339l.c cVar2) {
        if (cVar.f2105a != cVar2.f2105a || cVar.f2106b != cVar2.f2106b) {
            return mo2795a(abstractC0330c0, cVar.f2105a, cVar.f2106b, cVar2.f2105a, cVar2.f2106b);
        }
        m2876j(abstractC0330c0);
        return false;
    }

    /* renamed from: d */
    public void m2873d(RecyclerView.AbstractC0330c0 abstractC0330c0, boolean z) {
    }

    /* renamed from: f */
    public abstract boolean mo2798f(RecyclerView.AbstractC0330c0 abstractC0330c0);

    /* renamed from: g */
    public abstract boolean mo2799g(RecyclerView.AbstractC0330c0 abstractC0330c0);

    /* renamed from: h */
    public final void m2874h(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        m2880n(abstractC0330c0);
        m2429b(abstractC0330c0);
    }

    /* renamed from: i */
    public final void m2875i(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        m2881o(abstractC0330c0);
    }

    /* renamed from: j */
    public final void m2876j(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        m2882p(abstractC0330c0);
        m2429b(abstractC0330c0);
    }

    /* renamed from: k */
    public final void m2877k(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        m2883q(abstractC0330c0);
    }

    /* renamed from: l */
    public final void m2878l(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        m2884r(abstractC0330c0);
        m2429b(abstractC0330c0);
    }

    /* renamed from: m */
    public final void m2879m(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        m2885s(abstractC0330c0);
    }

    /* renamed from: n */
    public void m2880n(RecyclerView.AbstractC0330c0 abstractC0330c0) {
    }

    /* renamed from: o */
    public void m2881o(RecyclerView.AbstractC0330c0 abstractC0330c0) {
    }

    /* renamed from: p */
    public void m2882p(RecyclerView.AbstractC0330c0 abstractC0330c0) {
    }

    /* renamed from: q */
    public void m2883q(RecyclerView.AbstractC0330c0 abstractC0330c0) {
    }

    /* renamed from: r */
    public void m2884r(RecyclerView.AbstractC0330c0 abstractC0330c0) {
    }

    /* renamed from: s */
    public void m2885s(RecyclerView.AbstractC0330c0 abstractC0330c0) {
    }
}
