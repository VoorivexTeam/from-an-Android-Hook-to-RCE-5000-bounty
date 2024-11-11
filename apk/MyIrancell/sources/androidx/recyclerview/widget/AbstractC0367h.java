package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public abstract class AbstractC0367h {

    /* renamed from: a */
    protected final RecyclerView.AbstractC0342o f2354a;

    /* renamed from: b */
    private int f2355b;

    /* renamed from: c */
    final Rect f2356c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC0367h {
        a(RecyclerView.AbstractC0342o abstractC0342o) {
            super(abstractC0342o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: a */
        public int mo2849a() {
            return this.f2354a.m2542q();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: a */
        public int mo2850a(View view) {
            return this.f2354a.m2528i(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0343p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: a */
        public void mo2851a(int i) {
            this.f2354a.mo2511d(i);
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: b */
        public int mo2852b() {
            return this.f2354a.m2542q() - this.f2354a.m2539o();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: b */
        public int mo2853b(View view) {
            RecyclerView.C0343p c0343p = (RecyclerView.C0343p) view.getLayoutParams();
            return this.f2354a.m2526h(view) + ((ViewGroup.MarginLayoutParams) c0343p).leftMargin + ((ViewGroup.MarginLayoutParams) c0343p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: c */
        public int mo2854c() {
            return this.f2354a.m2539o();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: c */
        public int mo2855c(View view) {
            RecyclerView.C0343p c0343p = (RecyclerView.C0343p) view.getLayoutParams();
            return this.f2354a.m2522g(view) + ((ViewGroup.MarginLayoutParams) c0343p).topMargin + ((ViewGroup.MarginLayoutParams) c0343p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: d */
        public int mo2856d() {
            return this.f2354a.m2543r();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: d */
        public int mo2857d(View view) {
            return this.f2354a.m2518f(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0343p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: e */
        public int mo2858e() {
            return this.f2354a.m2527i();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: e */
        public int mo2859e(View view) {
            this.f2354a.m2472a(view, true, this.f2356c);
            return this.f2356c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: f */
        public int mo2860f() {
            return this.f2354a.m2537n();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: f */
        public int mo2861f(View view) {
            this.f2354a.m2472a(view, true, this.f2356c);
            return this.f2356c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: g */
        public int mo2862g() {
            return (this.f2354a.m2542q() - this.f2354a.m2537n()) - this.f2354a.m2539o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.h$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC0367h {
        b(RecyclerView.AbstractC0342o abstractC0342o) {
            super(abstractC0342o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: a */
        public int mo2849a() {
            return this.f2354a.m2525h();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: a */
        public int mo2850a(View view) {
            return this.f2354a.m2515e(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0343p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: a */
        public void mo2851a(int i) {
            this.f2354a.mo2516e(i);
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: b */
        public int mo2852b() {
            return this.f2354a.m2525h() - this.f2354a.m2535m();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: b */
        public int mo2853b(View view) {
            RecyclerView.C0343p c0343p = (RecyclerView.C0343p) view.getLayoutParams();
            return this.f2354a.m2522g(view) + ((ViewGroup.MarginLayoutParams) c0343p).topMargin + ((ViewGroup.MarginLayoutParams) c0343p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: c */
        public int mo2854c() {
            return this.f2354a.m2535m();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: c */
        public int mo2855c(View view) {
            RecyclerView.C0343p c0343p = (RecyclerView.C0343p) view.getLayoutParams();
            return this.f2354a.m2526h(view) + ((ViewGroup.MarginLayoutParams) c0343p).leftMargin + ((ViewGroup.MarginLayoutParams) c0343p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: d */
        public int mo2856d() {
            return this.f2354a.m2527i();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: d */
        public int mo2857d(View view) {
            return this.f2354a.m2530j(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0343p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: e */
        public int mo2858e() {
            return this.f2354a.m2543r();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: e */
        public int mo2859e(View view) {
            this.f2354a.m2472a(view, true, this.f2356c);
            return this.f2356c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: f */
        public int mo2860f() {
            return this.f2354a.m2541p();
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: f */
        public int mo2861f(View view) {
            this.f2354a.m2472a(view, true, this.f2356c);
            return this.f2356c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0367h
        /* renamed from: g */
        public int mo2862g() {
            return (this.f2354a.m2525h() - this.f2354a.m2541p()) - this.f2354a.m2535m();
        }
    }

    private AbstractC0367h(RecyclerView.AbstractC0342o abstractC0342o) {
        this.f2355b = Integer.MIN_VALUE;
        this.f2356c = new Rect();
        this.f2354a = abstractC0342o;
    }

    /* synthetic */ AbstractC0367h(RecyclerView.AbstractC0342o abstractC0342o, a aVar) {
        this(abstractC0342o);
    }

    /* renamed from: a */
    public static AbstractC0367h m2846a(RecyclerView.AbstractC0342o abstractC0342o) {
        return new a(abstractC0342o);
    }

    /* renamed from: a */
    public static AbstractC0367h m2847a(RecyclerView.AbstractC0342o abstractC0342o, int i) {
        if (i == 0) {
            return m2846a(abstractC0342o);
        }
        if (i == 1) {
            return m2848b(abstractC0342o);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public static AbstractC0367h m2848b(RecyclerView.AbstractC0342o abstractC0342o) {
        return new b(abstractC0342o);
    }

    /* renamed from: a */
    public abstract int mo2849a();

    /* renamed from: a */
    public abstract int mo2850a(View view);

    /* renamed from: a */
    public abstract void mo2851a(int i);

    /* renamed from: b */
    public abstract int mo2852b();

    /* renamed from: b */
    public abstract int mo2853b(View view);

    /* renamed from: c */
    public abstract int mo2854c();

    /* renamed from: c */
    public abstract int mo2855c(View view);

    /* renamed from: d */
    public abstract int mo2856d();

    /* renamed from: d */
    public abstract int mo2857d(View view);

    /* renamed from: e */
    public abstract int mo2858e();

    /* renamed from: e */
    public abstract int mo2859e(View view);

    /* renamed from: f */
    public abstract int mo2860f();

    /* renamed from: f */
    public abstract int mo2861f(View view);

    /* renamed from: g */
    public abstract int mo2862g();

    /* renamed from: h */
    public int m2863h() {
        if (Integer.MIN_VALUE == this.f2355b) {
            return 0;
        }
        return mo2862g() - this.f2355b;
    }

    /* renamed from: i */
    public void m2864i() {
        this.f2355b = mo2862g();
    }
}
