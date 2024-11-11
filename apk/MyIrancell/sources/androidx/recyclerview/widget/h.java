package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class h {
    protected final RecyclerView.o a;
    private int b;
    final Rect c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends h {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.h
        public int a() {
            return this.a.q();
        }

        @Override // androidx.recyclerview.widget.h
        public int a(View view) {
            return this.a.i(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public void a(int i) {
            this.a.d(i);
        }

        @Override // androidx.recyclerview.widget.h
        public int b() {
            return this.a.q() - this.a.o();
        }

        @Override // androidx.recyclerview.widget.h
        public int b(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.h(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int c() {
            return this.a.o();
        }

        @Override // androidx.recyclerview.widget.h
        public int c(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.g(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int d() {
            return this.a.r();
        }

        @Override // androidx.recyclerview.widget.h
        public int d(View view) {
            return this.a.f(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int e() {
            return this.a.i();
        }

        @Override // androidx.recyclerview.widget.h
        public int e(View view) {
            this.a.a(view, true, this.c);
            return this.c.right;
        }

        @Override // androidx.recyclerview.widget.h
        public int f() {
            return this.a.n();
        }

        @Override // androidx.recyclerview.widget.h
        public int f(View view) {
            this.a.a(view, true, this.c);
            return this.c.left;
        }

        @Override // androidx.recyclerview.widget.h
        public int g() {
            return (this.a.q() - this.a.n()) - this.a.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends h {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.h
        public int a() {
            return this.a.h();
        }

        @Override // androidx.recyclerview.widget.h
        public int a(View view) {
            return this.a.e(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public void a(int i) {
            this.a.e(i);
        }

        @Override // androidx.recyclerview.widget.h
        public int b() {
            return this.a.h() - this.a.m();
        }

        @Override // androidx.recyclerview.widget.h
        public int b(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.g(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int c() {
            return this.a.m();
        }

        @Override // androidx.recyclerview.widget.h
        public int c(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.h(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int d() {
            return this.a.i();
        }

        @Override // androidx.recyclerview.widget.h
        public int d(View view) {
            return this.a.j(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int e() {
            return this.a.r();
        }

        @Override // androidx.recyclerview.widget.h
        public int e(View view) {
            this.a.a(view, true, this.c);
            return this.c.bottom;
        }

        @Override // androidx.recyclerview.widget.h
        public int f() {
            return this.a.p();
        }

        @Override // androidx.recyclerview.widget.h
        public int f(View view) {
            this.a.a(view, true, this.c);
            return this.c.top;
        }

        @Override // androidx.recyclerview.widget.h
        public int g() {
            return (this.a.h() - this.a.p()) - this.a.m();
        }
    }

    private h(RecyclerView.o oVar) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = oVar;
    }

    /* synthetic */ h(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static h a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static h a(RecyclerView.o oVar, int i) {
        if (i == 0) {
            return a(oVar);
        }
        if (i == 1) {
            return b(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static h b(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public int h() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return g() - this.b;
    }

    public void i() {
        this.b = g();
    }
}
