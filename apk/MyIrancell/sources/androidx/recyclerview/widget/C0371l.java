package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
class C0371l {

    /* renamed from: a */
    final b f2361a;

    /* renamed from: b */
    a f2362b = new a();

    /* renamed from: androidx.recyclerview.widget.l$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        int f2363a = 0;

        /* renamed from: b */
        int f2364b;

        /* renamed from: c */
        int f2365c;

        /* renamed from: d */
        int f2366d;

        /* renamed from: e */
        int f2367e;

        a() {
        }

        /* renamed from: a */
        int m2888a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: a */
        void m2889a(int i) {
            this.f2363a = i | this.f2363a;
        }

        /* renamed from: a */
        void m2890a(int i, int i2, int i3, int i4) {
            this.f2364b = i;
            this.f2365c = i2;
            this.f2366d = i3;
            this.f2367e = i4;
        }

        /* renamed from: a */
        boolean m2891a() {
            int i = this.f2363a;
            if ((i & 7) != 0 && (i & (m2888a(this.f2366d, this.f2364b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f2363a;
            if ((i2 & 112) != 0 && (i2 & (m2888a(this.f2366d, this.f2365c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2363a;
            if ((i3 & 1792) != 0 && (i3 & (m2888a(this.f2367e, this.f2364b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2363a;
            return (i4 & 28672) == 0 || (i4 & (m2888a(this.f2367e, this.f2365c) << 12)) != 0;
        }

        /* renamed from: b */
        void m2892b() {
            this.f2363a = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    /* loaded from: classes.dex */
    interface b {
        /* renamed from: a */
        int mo2550a();

        /* renamed from: a */
        int mo2551a(View view);

        /* renamed from: a */
        View mo2552a(int i);

        /* renamed from: b */
        int mo2553b();

        /* renamed from: b */
        int mo2554b(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0371l(b bVar) {
        this.f2361a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m2886a(int i, int i2, int i3, int i4) {
        int mo2553b = this.f2361a.mo2553b();
        int mo2550a = this.f2361a.mo2550a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View mo2552a = this.f2361a.mo2552a(i);
            this.f2362b.m2890a(mo2553b, mo2550a, this.f2361a.mo2551a(mo2552a), this.f2361a.mo2554b(mo2552a));
            if (i3 != 0) {
                this.f2362b.m2892b();
                this.f2362b.m2889a(i3);
                if (this.f2362b.m2891a()) {
                    return mo2552a;
                }
            }
            if (i4 != 0) {
                this.f2362b.m2892b();
                this.f2362b.m2889a(i4);
                if (this.f2362b.m2891a()) {
                    view = mo2552a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m2887a(View view, int i) {
        this.f2362b.m2890a(this.f2361a.mo2553b(), this.f2361a.mo2550a(), this.f2361a.mo2551a(view), this.f2361a.mo2554b(view));
        if (i == 0) {
            return false;
        }
        this.f2362b.m2892b();
        this.f2362b.m2889a(i);
        return this.f2362b.m2891a();
    }
}
