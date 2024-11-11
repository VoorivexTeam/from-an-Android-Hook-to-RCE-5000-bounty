package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0342o {

    /* renamed from: A */
    int f1944A;

    /* renamed from: B */
    int f1945B;

    /* renamed from: C */
    private boolean f1946C;

    /* renamed from: D */
    SavedState f1947D;

    /* renamed from: E */
    final C0321a f1948E;

    /* renamed from: F */
    private final C0322b f1949F;

    /* renamed from: G */
    private int f1950G;

    /* renamed from: s */
    int f1951s;

    /* renamed from: t */
    private C0323c f1952t;

    /* renamed from: u */
    AbstractC0367h f1953u;

    /* renamed from: v */
    private boolean f1954v;

    /* renamed from: w */
    private boolean f1955w;

    /* renamed from: x */
    boolean f1956x;

    /* renamed from: y */
    private boolean f1957y;

    /* renamed from: z */
    private boolean f1958z;

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0320a();

        /* renamed from: b */
        int f1959b;

        /* renamed from: c */
        int f1960c;

        /* renamed from: d */
        boolean f1961d;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        /* loaded from: classes.dex */
        static class C0320a implements Parcelable.Creator<SavedState> {
            C0320a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f1959b = parcel.readInt();
            this.f1960c = parcel.readInt();
            this.f1961d = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f1959b = savedState.f1959b;
            this.f1960c = savedState.f1960c;
            this.f1961d = savedState.f1961d;
        }

        /* renamed from: a */
        boolean m2192a() {
            return this.f1959b >= 0;
        }

        /* renamed from: b */
        void m2193b() {
            this.f1959b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1959b);
            parcel.writeInt(this.f1960c);
            parcel.writeInt(this.f1961d ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C0321a {

        /* renamed from: a */
        AbstractC0367h f1962a;

        /* renamed from: b */
        int f1963b;

        /* renamed from: c */
        int f1964c;

        /* renamed from: d */
        boolean f1965d;

        /* renamed from: e */
        boolean f1966e;

        C0321a() {
            m2197b();
        }

        /* renamed from: a */
        void m2194a() {
            this.f1964c = this.f1965d ? this.f1962a.mo2852b() : this.f1962a.mo2860f();
        }

        /* renamed from: a */
        public void m2195a(View view, int i) {
            this.f1964c = this.f1965d ? this.f1962a.mo2850a(view) + this.f1962a.m2863h() : this.f1962a.mo2857d(view);
            this.f1963b = i;
        }

        /* renamed from: a */
        boolean m2196a(View view, RecyclerView.C0353z c0353z) {
            RecyclerView.C0343p c0343p = (RecyclerView.C0343p) view.getLayoutParams();
            return !c0343p.m2558c() && c0343p.m2556a() >= 0 && c0343p.m2556a() < c0353z.m2627a();
        }

        /* renamed from: b */
        void m2197b() {
            this.f1963b = -1;
            this.f1964c = Integer.MIN_VALUE;
            this.f1965d = false;
            this.f1966e = false;
        }

        /* renamed from: b */
        public void m2198b(View view, int i) {
            int m2863h = this.f1962a.m2863h();
            if (m2863h >= 0) {
                m2195a(view, i);
                return;
            }
            this.f1963b = i;
            if (this.f1965d) {
                int mo2852b = (this.f1962a.mo2852b() - m2863h) - this.f1962a.mo2850a(view);
                this.f1964c = this.f1962a.mo2852b() - mo2852b;
                if (mo2852b > 0) {
                    int mo2853b = this.f1964c - this.f1962a.mo2853b(view);
                    int mo2860f = this.f1962a.mo2860f();
                    int min = mo2853b - (mo2860f + Math.min(this.f1962a.mo2857d(view) - mo2860f, 0));
                    if (min < 0) {
                        this.f1964c += Math.min(mo2852b, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo2857d = this.f1962a.mo2857d(view);
            int mo2860f2 = mo2857d - this.f1962a.mo2860f();
            this.f1964c = mo2857d;
            if (mo2860f2 > 0) {
                int mo2852b2 = (this.f1962a.mo2852b() - Math.min(0, (this.f1962a.mo2852b() - m2863h) - this.f1962a.mo2850a(view))) - (mo2857d + this.f1962a.mo2853b(view));
                if (mo2852b2 < 0) {
                    this.f1964c -= Math.min(mo2860f2, -mo2852b2);
                }
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1963b + ", mCoordinate=" + this.f1964c + ", mLayoutFromEnd=" + this.f1965d + ", mValid=" + this.f1966e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0322b {

        /* renamed from: a */
        public int f1967a;

        /* renamed from: b */
        public boolean f1968b;

        /* renamed from: c */
        public boolean f1969c;

        /* renamed from: d */
        public boolean f1970d;

        protected C0322b() {
        }

        /* renamed from: a */
        void m2199a() {
            this.f1967a = 0;
            this.f1968b = false;
            this.f1969c = false;
            this.f1970d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0323c {

        /* renamed from: b */
        int f1972b;

        /* renamed from: c */
        int f1973c;

        /* renamed from: d */
        int f1974d;

        /* renamed from: e */
        int f1975e;

        /* renamed from: f */
        int f1976f;

        /* renamed from: g */
        int f1977g;

        /* renamed from: i */
        boolean f1979i;

        /* renamed from: j */
        int f1980j;

        /* renamed from: l */
        boolean f1982l;

        /* renamed from: a */
        boolean f1971a = true;

        /* renamed from: h */
        int f1978h = 0;

        /* renamed from: k */
        List<RecyclerView.AbstractC0330c0> f1981k = null;

        C0323c() {
        }

        /* renamed from: b */
        private View m2200b() {
            int size = this.f1981k.size();
            for (int i = 0; i < size; i++) {
                View view = this.f1981k.get(i).f2076a;
                RecyclerView.C0343p c0343p = (RecyclerView.C0343p) view.getLayoutParams();
                if (!c0343p.m2558c() && this.f1974d == c0343p.m2556a()) {
                    m2203a(view);
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public View m2201a(RecyclerView.C0349v c0349v) {
            if (this.f1981k != null) {
                return m2200b();
            }
            View m2608d = c0349v.m2608d(this.f1974d);
            this.f1974d += this.f1975e;
            return m2608d;
        }

        /* renamed from: a */
        public void m2202a() {
            m2203a((View) null);
        }

        /* renamed from: a */
        public void m2203a(View view) {
            View m2205b = m2205b(view);
            this.f1974d = m2205b == null ? -1 : ((RecyclerView.C0343p) m2205b.getLayoutParams()).m2556a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m2204a(RecyclerView.C0353z c0353z) {
            int i = this.f1974d;
            return i >= 0 && i < c0353z.m2627a();
        }

        /* renamed from: b */
        public View m2205b(View view) {
            int m2556a;
            int size = this.f1981k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f1981k.get(i2).f2076a;
                RecyclerView.C0343p c0343p = (RecyclerView.C0343p) view3.getLayoutParams();
                if (view3 != view && !c0343p.m2558c() && (m2556a = (c0343p.m2556a() - this.f1974d) * this.f1975e) >= 0 && m2556a < i) {
                    view2 = view3;
                    if (m2556a == 0) {
                        break;
                    }
                    i = m2556a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f1951s = 1;
        this.f1955w = false;
        this.f1956x = false;
        this.f1957y = false;
        this.f1958z = true;
        this.f1944A = -1;
        this.f1945B = Integer.MIN_VALUE;
        this.f1947D = null;
        this.f1948E = new C0321a();
        this.f1949F = new C0322b();
        this.f1950G = 2;
        m2189i(i);
        m2175a(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1951s = 1;
        this.f1955w = false;
        this.f1956x = false;
        this.f1957y = false;
        this.f1958z = true;
        this.f1944A = -1;
        this.f1945B = Integer.MIN_VALUE;
        this.f1947D = null;
        this.f1948E = new C0321a();
        this.f1949F = new C0322b();
        this.f1950G = 2;
        RecyclerView.AbstractC0342o.d m2453a = RecyclerView.AbstractC0342o.m2453a(context, attributeSet, i, i2);
        m2189i(m2453a.f2128a);
        m2175a(m2453a.f2130c);
        mo2114b(m2453a.f2131d);
    }

    /* renamed from: K */
    private View m2128K() {
        return m2501c(this.f1956x ? 0 : m2514e() - 1);
    }

    /* renamed from: L */
    private View m2129L() {
        return m2501c(this.f1956x ? m2514e() - 1 : 0);
    }

    /* renamed from: M */
    private void m2130M() {
        this.f1956x = (this.f1951s == 1 || !m2165I()) ? this.f1955w : !this.f1955w;
    }

    /* renamed from: a */
    private int m2131a(int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, boolean z) {
        int mo2852b;
        int mo2852b2 = this.f1953u.mo2852b() - i;
        if (mo2852b2 <= 0) {
            return 0;
        }
        int i2 = -m2181c(-mo2852b2, c0349v, c0353z);
        int i3 = i + i2;
        if (!z || (mo2852b = this.f1953u.mo2852b() - i3) <= 0) {
            return i2;
        }
        this.f1953u.mo2851a(mo2852b);
        return mo2852b + i2;
    }

    /* renamed from: a */
    private View m2132a(boolean z, boolean z2) {
        int m2514e;
        int i;
        if (this.f1956x) {
            m2514e = 0;
            i = m2514e();
        } else {
            m2514e = m2514e() - 1;
            i = -1;
        }
        return m2169a(m2514e, i, z, z2);
    }

    /* renamed from: a */
    private void m2133a(int i, int i2, boolean z, RecyclerView.C0353z c0353z) {
        int mo2860f;
        this.f1952t.f1982l = m2166J();
        this.f1952t.f1978h = m2188h(c0353z);
        C0323c c0323c = this.f1952t;
        c0323c.f1976f = i;
        if (i == 1) {
            c0323c.f1978h += this.f1953u.mo2854c();
            View m2128K = m2128K();
            this.f1952t.f1975e = this.f1956x ? -1 : 1;
            C0323c c0323c2 = this.f1952t;
            int m2534l = m2534l(m2128K);
            C0323c c0323c3 = this.f1952t;
            c0323c2.f1974d = m2534l + c0323c3.f1975e;
            c0323c3.f1972b = this.f1953u.mo2850a(m2128K);
            mo2860f = this.f1953u.mo2850a(m2128K) - this.f1953u.mo2852b();
        } else {
            View m2129L = m2129L();
            this.f1952t.f1978h += this.f1953u.mo2860f();
            this.f1952t.f1975e = this.f1956x ? 1 : -1;
            C0323c c0323c4 = this.f1952t;
            int m2534l2 = m2534l(m2129L);
            C0323c c0323c5 = this.f1952t;
            c0323c4.f1974d = m2534l2 + c0323c5.f1975e;
            c0323c5.f1972b = this.f1953u.mo2857d(m2129L);
            mo2860f = (-this.f1953u.mo2857d(m2129L)) + this.f1953u.mo2860f();
        }
        C0323c c0323c6 = this.f1952t;
        c0323c6.f1973c = i2;
        if (z) {
            c0323c6.f1973c = i2 - mo2860f;
        }
        this.f1952t.f1977g = mo2860f;
    }

    /* renamed from: a */
    private void m2134a(C0321a c0321a) {
        m2147f(c0321a.f1963b, c0321a.f1964c);
    }

    /* renamed from: a */
    private void m2135a(RecyclerView.C0349v c0349v, int i) {
        int m2514e = m2514e();
        if (i < 0) {
            return;
        }
        int mo2849a = this.f1953u.mo2849a() - i;
        if (this.f1956x) {
            for (int i2 = 0; i2 < m2514e; i2++) {
                View m2501c = m2501c(i2);
                if (this.f1953u.mo2857d(m2501c) < mo2849a || this.f1953u.mo2861f(m2501c) < mo2849a) {
                    m2136a(c0349v, 0, i2);
                    return;
                }
            }
            return;
        }
        int i3 = m2514e - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            View m2501c2 = m2501c(i4);
            if (this.f1953u.mo2857d(m2501c2) < mo2849a || this.f1953u.mo2861f(m2501c2) < mo2849a) {
                m2136a(c0349v, i3, i4);
                return;
            }
        }
    }

    /* renamed from: a */
    private void m2136a(RecyclerView.C0349v c0349v, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m2463a(i, c0349v);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m2463a(i3, c0349v);
            }
        }
    }

    /* renamed from: a */
    private void m2137a(RecyclerView.C0349v c0349v, C0323c c0323c) {
        if (!c0323c.f1971a || c0323c.f1982l) {
            return;
        }
        int i = c0323c.f1976f;
        int i2 = c0323c.f1977g;
        if (i == -1) {
            m2135a(c0349v, i2);
        } else {
            m2143b(c0349v, i2);
        }
    }

    /* renamed from: a */
    private boolean m2138a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, C0321a c0321a) {
        if (m2514e() == 0) {
            return false;
        }
        View m2523g = m2523g();
        if (m2523g != null && c0321a.m2196a(m2523g, c0353z)) {
            c0321a.m2198b(m2523g, m2534l(m2523g));
            return true;
        }
        if (this.f1954v != this.f1957y) {
            return false;
        }
        View m2157l = c0321a.f1965d ? m2157l(c0349v, c0353z) : m2158m(c0349v, c0353z);
        if (m2157l == null) {
            return false;
        }
        c0321a.m2195a(m2157l, m2534l(m2157l));
        if (!c0353z.m2632d() && mo2095C()) {
            if (this.f1953u.mo2857d(m2157l) >= this.f1953u.mo2852b() || this.f1953u.mo2850a(m2157l) < this.f1953u.mo2860f()) {
                c0321a.f1964c = c0321a.f1965d ? this.f1953u.mo2852b() : this.f1953u.mo2860f();
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m2139a(RecyclerView.C0353z c0353z, C0321a c0321a) {
        int i;
        if (!c0353z.m2632d() && (i = this.f1944A) != -1) {
            if (i >= 0 && i < c0353z.m2627a()) {
                c0321a.f1963b = this.f1944A;
                SavedState savedState = this.f1947D;
                if (savedState != null && savedState.m2192a()) {
                    boolean z = this.f1947D.f1961d;
                    c0321a.f1965d = z;
                    c0321a.f1964c = z ? this.f1953u.mo2852b() - this.f1947D.f1960c : this.f1953u.mo2860f() + this.f1947D.f1960c;
                    return true;
                }
                if (this.f1945B != Integer.MIN_VALUE) {
                    boolean z2 = this.f1956x;
                    c0321a.f1965d = z2;
                    c0321a.f1964c = z2 ? this.f1953u.mo2852b() - this.f1945B : this.f1953u.mo2860f() + this.f1945B;
                    return true;
                }
                View mo2178b = mo2178b(this.f1944A);
                if (mo2178b == null) {
                    if (m2514e() > 0) {
                        c0321a.f1965d = (this.f1944A < m2534l(m2501c(0))) == this.f1956x;
                    }
                    c0321a.m2194a();
                } else {
                    if (this.f1953u.mo2853b(mo2178b) > this.f1953u.mo2862g()) {
                        c0321a.m2194a();
                        return true;
                    }
                    if (this.f1953u.mo2857d(mo2178b) - this.f1953u.mo2860f() < 0) {
                        c0321a.f1964c = this.f1953u.mo2860f();
                        c0321a.f1965d = false;
                        return true;
                    }
                    if (this.f1953u.mo2852b() - this.f1953u.mo2850a(mo2178b) < 0) {
                        c0321a.f1964c = this.f1953u.mo2852b();
                        c0321a.f1965d = true;
                        return true;
                    }
                    c0321a.f1964c = c0321a.f1965d ? this.f1953u.mo2850a(mo2178b) + this.f1953u.m2863h() : this.f1953u.mo2857d(mo2178b);
                }
                return true;
            }
            this.f1944A = -1;
            this.f1945B = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: b */
    private int m2140b(int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, boolean z) {
        int mo2860f;
        int mo2860f2 = i - this.f1953u.mo2860f();
        if (mo2860f2 <= 0) {
            return 0;
        }
        int i2 = -m2181c(mo2860f2, c0349v, c0353z);
        int i3 = i + i2;
        if (!z || (mo2860f = i3 - this.f1953u.mo2860f()) <= 0) {
            return i2;
        }
        this.f1953u.mo2851a(-mo2860f);
        return i2 - mo2860f;
    }

    /* renamed from: b */
    private View m2141b(boolean z, boolean z2) {
        int i;
        int m2514e;
        if (this.f1956x) {
            i = m2514e() - 1;
            m2514e = -1;
        } else {
            i = 0;
            m2514e = m2514e();
        }
        return m2169a(i, m2514e, z, z2);
    }

    /* renamed from: b */
    private void m2142b(C0321a c0321a) {
        m2149g(c0321a.f1963b, c0321a.f1964c);
    }

    /* renamed from: b */
    private void m2143b(RecyclerView.C0349v c0349v, int i) {
        if (i < 0) {
            return;
        }
        int m2514e = m2514e();
        if (!this.f1956x) {
            for (int i2 = 0; i2 < m2514e; i2++) {
                View m2501c = m2501c(i2);
                if (this.f1953u.mo2850a(m2501c) > i || this.f1953u.mo2859e(m2501c) > i) {
                    m2136a(c0349v, 0, i2);
                    return;
                }
            }
            return;
        }
        int i3 = m2514e - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            View m2501c2 = m2501c(i4);
            if (this.f1953u.mo2850a(m2501c2) > i || this.f1953u.mo2859e(m2501c2) > i) {
                m2136a(c0349v, i3, i4);
                return;
            }
        }
    }

    /* renamed from: b */
    private void m2144b(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, int i, int i2) {
        if (!c0353z.m2633e() || m2514e() == 0 || c0353z.m2632d() || !mo2095C()) {
            return;
        }
        List<RecyclerView.AbstractC0330c0> m2613f = c0349v.m2613f();
        int size = m2613f.size();
        int m2534l = m2534l(m2501c(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.AbstractC0330c0 abstractC0330c0 = m2613f.get(i5);
            if (!abstractC0330c0.m2362p()) {
                char c = (abstractC0330c0.m2355i() < m2534l) != this.f1956x ? (char) 65535 : (char) 1;
                int mo2853b = this.f1953u.mo2853b(abstractC0330c0.f2076a);
                if (c == 65535) {
                    i3 += mo2853b;
                } else {
                    i4 += mo2853b;
                }
            }
        }
        this.f1952t.f1981k = m2613f;
        if (i3 > 0) {
            m2149g(m2534l(m2129L()), i);
            C0323c c0323c = this.f1952t;
            c0323c.f1978h = i3;
            c0323c.f1973c = 0;
            c0323c.m2202a();
            m2167a(c0349v, this.f1952t, c0353z, false);
        }
        if (i4 > 0) {
            m2147f(m2534l(m2128K()), i2);
            C0323c c0323c2 = this.f1952t;
            c0323c2.f1978h = i4;
            c0323c2.f1973c = 0;
            c0323c2.m2202a();
            m2167a(c0349v, this.f1952t, c0353z, false);
        }
        this.f1952t.f1981k = null;
    }

    /* renamed from: b */
    private void m2145b(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, C0321a c0321a) {
        if (m2139a(c0353z, c0321a) || m2138a(c0349v, c0353z, c0321a)) {
            return;
        }
        c0321a.m2194a();
        c0321a.f1963b = this.f1957y ? c0353z.m2627a() - 1 : 0;
    }

    /* renamed from: f */
    private View m2146f(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return m2185e(0, m2514e());
    }

    /* renamed from: f */
    private void m2147f(int i, int i2) {
        this.f1952t.f1973c = this.f1953u.mo2852b() - i2;
        this.f1952t.f1975e = this.f1956x ? -1 : 1;
        C0323c c0323c = this.f1952t;
        c0323c.f1974d = i;
        c0323c.f1976f = 1;
        c0323c.f1972b = i2;
        c0323c.f1977g = Integer.MIN_VALUE;
    }

    /* renamed from: g */
    private View m2148g(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return mo2099a(c0349v, c0353z, 0, m2514e(), c0353z.m2627a());
    }

    /* renamed from: g */
    private void m2149g(int i, int i2) {
        this.f1952t.f1973c = i2 - this.f1953u.mo2860f();
        C0323c c0323c = this.f1952t;
        c0323c.f1974d = i;
        c0323c.f1975e = this.f1956x ? 1 : -1;
        C0323c c0323c2 = this.f1952t;
        c0323c2.f1976f = -1;
        c0323c2.f1972b = i2;
        c0323c2.f1977g = Integer.MIN_VALUE;
    }

    /* renamed from: h */
    private View m2150h(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return m2185e(m2514e() - 1, -1);
    }

    /* renamed from: i */
    private int m2151i(RecyclerView.C0353z c0353z) {
        if (m2514e() == 0) {
            return 0;
        }
        m2161E();
        return C0369j.m2867a(c0353z, this.f1953u, m2141b(!this.f1958z, true), m2132a(!this.f1958z, true), this, this.f1958z);
    }

    /* renamed from: i */
    private View m2152i(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return mo2099a(c0349v, c0353z, m2514e() - 1, -1, c0353z.m2627a());
    }

    /* renamed from: j */
    private int m2153j(RecyclerView.C0353z c0353z) {
        if (m2514e() == 0) {
            return 0;
        }
        m2161E();
        return C0369j.m2868a(c0353z, this.f1953u, m2141b(!this.f1958z, true), m2132a(!this.f1958z, true), this, this.f1958z, this.f1956x);
    }

    /* renamed from: j */
    private View m2154j(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return this.f1956x ? m2146f(c0349v, c0353z) : m2150h(c0349v, c0353z);
    }

    /* renamed from: k */
    private int m2155k(RecyclerView.C0353z c0353z) {
        if (m2514e() == 0) {
            return 0;
        }
        m2161E();
        return C0369j.m2869b(c0353z, this.f1953u, m2141b(!this.f1958z, true), m2132a(!this.f1958z, true), this, this.f1958z);
    }

    /* renamed from: k */
    private View m2156k(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return this.f1956x ? m2150h(c0349v, c0353z) : m2146f(c0349v, c0353z);
    }

    /* renamed from: l */
    private View m2157l(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return this.f1956x ? m2148g(c0349v, c0353z) : m2152i(c0349v, c0353z);
    }

    /* renamed from: m */
    private View m2158m(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        return this.f1956x ? m2152i(c0349v, c0353z) : m2148g(c0349v, c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: A */
    boolean mo2159A() {
        return (m2527i() == 1073741824 || m2543r() == 1073741824 || !m2544s()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: C */
    public boolean mo2095C() {
        return this.f1947D == null && this.f1954v == this.f1957y;
    }

    /* renamed from: D */
    C0323c m2160D() {
        return new C0323c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m2161E() {
        if (this.f1952t == null) {
            this.f1952t = m2160D();
        }
    }

    /* renamed from: F */
    public int m2162F() {
        View m2169a = m2169a(0, m2514e(), false, true);
        if (m2169a == null) {
            return -1;
        }
        return m2534l(m2169a);
    }

    /* renamed from: G */
    public int m2163G() {
        View m2169a = m2169a(m2514e() - 1, -1, false, true);
        if (m2169a == null) {
            return -1;
        }
        return m2534l(m2169a);
    }

    /* renamed from: H */
    public int m2164H() {
        return this.f1951s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public boolean m2165I() {
        return m2529j() == 1;
    }

    /* renamed from: J */
    boolean m2166J() {
        return this.f1953u.mo2856d() == 0 && this.f1953u.mo2849a() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public int mo2096a(int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        if (this.f1951s == 1) {
            return 0;
        }
        return m2181c(i, c0349v, c0353z);
    }

    /* renamed from: a */
    int m2167a(RecyclerView.C0349v c0349v, C0323c c0323c, RecyclerView.C0353z c0353z, boolean z) {
        int i = c0323c.f1973c;
        int i2 = c0323c.f1977g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0323c.f1977g = i2 + i;
            }
            m2137a(c0349v, c0323c);
        }
        int i3 = c0323c.f1973c + c0323c.f1978h;
        C0322b c0322b = this.f1949F;
        while (true) {
            if ((!c0323c.f1982l && i3 <= 0) || !c0323c.m2204a(c0353z)) {
                break;
            }
            c0322b.m2199a();
            mo2105a(c0349v, c0353z, c0323c, c0322b);
            if (!c0322b.f1968b) {
                c0323c.f1972b += c0322b.f1967a * c0323c.f1976f;
                if (!c0322b.f1969c || this.f1952t.f1981k != null || !c0353z.m2632d()) {
                    int i4 = c0323c.f1973c;
                    int i5 = c0322b.f1967a;
                    c0323c.f1973c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c0323c.f1977g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c0322b.f1967a;
                    c0323c.f1977g = i7;
                    int i8 = c0323c.f1973c;
                    if (i8 < 0) {
                        c0323c.f1977g = i7 + i8;
                    }
                    m2137a(c0349v, c0323c);
                }
                if (z && c0322b.f1970d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0323c.f1973c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public int mo2168a(RecyclerView.C0353z c0353z) {
        return m2151i(c0353z);
    }

    /* renamed from: a */
    View m2169a(int i, int i2, boolean z, boolean z2) {
        m2161E();
        return (this.f1951s == 0 ? this.f2112e : this.f2113f).m2886a(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public View mo2098a(View view, int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        int m2187h;
        m2130M();
        if (m2514e() == 0 || (m2187h = m2187h(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m2161E();
        m2161E();
        m2133a(m2187h, (int) (this.f1953u.mo2862g() * 0.33333334f), false, c0353z);
        C0323c c0323c = this.f1952t;
        c0323c.f1977g = Integer.MIN_VALUE;
        c0323c.f1971a = false;
        m2167a(c0349v, c0323c, c0353z, true);
        View m2156k = m2187h == -1 ? m2156k(c0349v, c0353z) : m2154j(c0349v, c0353z);
        View m2129L = m2187h == -1 ? m2129L() : m2128K();
        if (!m2129L.hasFocusable()) {
            return m2156k;
        }
        if (m2156k == null) {
            return null;
        }
        return m2129L;
    }

    /* renamed from: a */
    View mo2099a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, int i, int i2, int i3) {
        m2161E();
        int mo2860f = this.f1953u.mo2860f();
        int mo2852b = this.f1953u.mo2852b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m2501c = m2501c(i);
            int m2534l = m2534l(m2501c);
            if (m2534l >= 0 && m2534l < i3) {
                if (((RecyclerView.C0343p) m2501c.getLayoutParams()).m2558c()) {
                    if (view2 == null) {
                        view2 = m2501c;
                    }
                } else {
                    if (this.f1953u.mo2857d(m2501c) < mo2852b && this.f1953u.mo2850a(m2501c) >= mo2860f) {
                        return m2501c;
                    }
                    if (view == null) {
                        view = m2501c;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2170a(int i, int i2, RecyclerView.C0353z c0353z, RecyclerView.AbstractC0342o.c cVar) {
        if (this.f1951s != 0) {
            i = i2;
        }
        if (m2514e() == 0 || i == 0) {
            return;
        }
        m2161E();
        m2133a(i > 0 ? 1 : -1, Math.abs(i), true, c0353z);
        mo2106a(c0353z, this.f1952t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2171a(int i, RecyclerView.AbstractC0342o.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.f1947D;
        if (savedState == null || !savedState.m2192a()) {
            m2130M();
            z = this.f1956x;
            i2 = this.f1944A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f1947D;
            z = savedState2.f1961d;
            i2 = savedState2.f1959b;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f1950G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo2555a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2172a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f1947D = (SavedState) parcelable;
            m2548y();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2173a(AccessibilityEvent accessibilityEvent) {
        super.mo2173a(accessibilityEvent);
        if (m2514e() > 0) {
            accessibilityEvent.setFromIndex(m2162F());
            accessibilityEvent.setToIndex(m2163G());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2104a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, C0321a c0321a, int i) {
    }

    /* renamed from: a */
    void mo2105a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, C0323c c0323c, C0322b c0322b) {
        int i;
        int i2;
        int i3;
        int i4;
        int mo2855c;
        View m2201a = c0323c.m2201a(c0349v);
        if (m2201a == null) {
            c0322b.f1968b = true;
            return;
        }
        RecyclerView.C0343p c0343p = (RecyclerView.C0343p) m2201a.getLayoutParams();
        if (c0323c.f1981k == null) {
            if (this.f1956x == (c0323c.f1976f == -1)) {
                m2494b(m2201a);
            } else {
                m2495b(m2201a, 0);
            }
        } else {
            if (this.f1956x == (c0323c.f1976f == -1)) {
                m2464a(m2201a);
            } else {
                m2465a(m2201a, 0);
            }
        }
        m2466a(m2201a, 0, 0);
        c0322b.f1967a = this.f1953u.mo2853b(m2201a);
        if (this.f1951s == 1) {
            if (m2165I()) {
                mo2855c = m2542q() - m2539o();
                i4 = mo2855c - this.f1953u.mo2855c(m2201a);
            } else {
                i4 = m2537n();
                mo2855c = this.f1953u.mo2855c(m2201a) + i4;
            }
            int i5 = c0323c.f1976f;
            int i6 = c0323c.f1972b;
            if (i5 == -1) {
                i3 = i6;
                i2 = mo2855c;
                i = i6 - c0322b.f1967a;
            } else {
                i = i6;
                i2 = mo2855c;
                i3 = c0322b.f1967a + i6;
            }
        } else {
            int m2541p = m2541p();
            int mo2855c2 = this.f1953u.mo2855c(m2201a) + m2541p;
            int i7 = c0323c.f1976f;
            int i8 = c0323c.f1972b;
            if (i7 == -1) {
                i2 = i8;
                i = m2541p;
                i3 = mo2855c2;
                i4 = i8 - c0322b.f1967a;
            } else {
                i = m2541p;
                i2 = c0322b.f1967a + i8;
                i3 = mo2855c2;
                i4 = i8;
            }
        }
        m2467a(m2201a, i4, i, i2, i3);
        if (c0343p.m2558c() || c0343p.m2557b()) {
            c0322b.f1969c = true;
        }
        c0322b.f1970d = m2201a.hasFocusable();
    }

    /* renamed from: a */
    void mo2106a(RecyclerView.C0353z c0353z, C0323c c0323c, RecyclerView.AbstractC0342o.c cVar) {
        int i = c0323c.f1974d;
        if (i < 0 || i >= c0353z.m2627a()) {
            return;
        }
        cVar.mo2555a(i, Math.max(0, c0323c.f1977g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2174a(String str) {
        if (this.f1947D == null) {
            super.mo2174a(str);
        }
    }

    /* renamed from: a */
    public void m2175a(boolean z) {
        mo2174a((String) null);
        if (z == this.f1955w) {
            return;
        }
        this.f1955w = z;
        m2548y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public boolean mo2176a() {
        return this.f1951s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public int mo2111b(int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        if (this.f1951s == 0) {
            return 0;
        }
        return m2181c(i, c0349v, c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public int mo2177b(RecyclerView.C0353z c0353z) {
        return m2153j(c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public View mo2178b(int i) {
        int m2514e = m2514e();
        if (m2514e == 0) {
            return null;
        }
        int m2534l = i - m2534l(m2501c(0));
        if (m2534l >= 0 && m2534l < m2514e) {
            View m2501c = m2501c(m2534l);
            if (m2534l(m2501c) == i) {
                return m2501c;
            }
        }
        return super.mo2178b(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public void mo2179b(RecyclerView recyclerView, RecyclerView.C0349v c0349v) {
        super.mo2179b(recyclerView, c0349v);
        if (this.f1946C) {
            m2497b(c0349v);
            c0349v.m2588a();
        }
    }

    /* renamed from: b */
    public void mo2114b(boolean z) {
        mo2174a((String) null);
        if (this.f1957y == z) {
            return;
        }
        this.f1957y = z;
        m2548y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public boolean mo2180b() {
        return this.f1951s == 1;
    }

    /* renamed from: c */
    int m2181c(int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        if (m2514e() == 0 || i == 0) {
            return 0;
        }
        this.f1952t.f1971a = true;
        m2161E();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m2133a(i2, abs, true, c0353z);
        C0323c c0323c = this.f1952t;
        int m2167a = c0323c.f1977g + m2167a(c0349v, c0323c, c0353z, false);
        if (m2167a < 0) {
            return 0;
        }
        if (abs > m2167a) {
            i = i2 * m2167a;
        }
        this.f1953u.mo2851a(-i);
        this.f1952t.f1980j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: c */
    public int mo2182c(RecyclerView.C0353z c0353z) {
        return m2155k(c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: c */
    public RecyclerView.C0343p mo2115c() {
        return new RecyclerView.C0343p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: d */
    public int mo2183d(RecyclerView.C0353z c0353z) {
        return m2151i(c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: e */
    public int mo2184e(RecyclerView.C0353z c0353z) {
        return m2153j(c0353z);
    }

    /* renamed from: e */
    View m2185e(int i, int i2) {
        int i3;
        int i4;
        m2161E();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m2501c(i);
        }
        if (this.f1953u.mo2857d(m2501c(i)) < this.f1953u.mo2860f()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f1951s == 0 ? this.f2112e : this.f2113f).m2886a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: e */
    public void mo2117e(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int m2131a;
        int i6;
        View mo2178b;
        int mo2857d;
        int i7;
        int i8 = -1;
        if (!(this.f1947D == null && this.f1944A == -1) && c0353z.m2627a() == 0) {
            m2497b(c0349v);
            return;
        }
        SavedState savedState = this.f1947D;
        if (savedState != null && savedState.m2192a()) {
            this.f1944A = this.f1947D.f1959b;
        }
        m2161E();
        this.f1952t.f1971a = false;
        m2130M();
        View m2523g = m2523g();
        if (!this.f1948E.f1966e || this.f1944A != -1 || this.f1947D != null) {
            this.f1948E.m2197b();
            C0321a c0321a = this.f1948E;
            c0321a.f1965d = this.f1956x ^ this.f1957y;
            m2145b(c0349v, c0353z, c0321a);
            this.f1948E.f1966e = true;
        } else if (m2523g != null && (this.f1953u.mo2857d(m2523g) >= this.f1953u.mo2852b() || this.f1953u.mo2850a(m2523g) <= this.f1953u.mo2860f())) {
            this.f1948E.m2198b(m2523g, m2534l(m2523g));
        }
        int m2188h = m2188h(c0353z);
        if (this.f1952t.f1980j >= 0) {
            i = m2188h;
            m2188h = 0;
        } else {
            i = 0;
        }
        int mo2860f = m2188h + this.f1953u.mo2860f();
        int mo2854c = i + this.f1953u.mo2854c();
        if (c0353z.m2632d() && (i6 = this.f1944A) != -1 && this.f1945B != Integer.MIN_VALUE && (mo2178b = mo2178b(i6)) != null) {
            if (this.f1956x) {
                i7 = this.f1953u.mo2852b() - this.f1953u.mo2850a(mo2178b);
                mo2857d = this.f1945B;
            } else {
                mo2857d = this.f1953u.mo2857d(mo2178b) - this.f1953u.mo2860f();
                i7 = this.f1945B;
            }
            int i9 = i7 - mo2857d;
            if (i9 > 0) {
                mo2860f += i9;
            } else {
                mo2854c -= i9;
            }
        }
        if (!this.f1948E.f1965d ? !this.f1956x : this.f1956x) {
            i8 = 1;
        }
        mo2104a(c0349v, c0353z, this.f1948E, i8);
        m2474a(c0349v);
        this.f1952t.f1982l = m2166J();
        this.f1952t.f1979i = c0353z.m2632d();
        C0321a c0321a2 = this.f1948E;
        if (c0321a2.f1965d) {
            m2142b(c0321a2);
            C0323c c0323c = this.f1952t;
            c0323c.f1978h = mo2860f;
            m2167a(c0349v, c0323c, c0353z, false);
            C0323c c0323c2 = this.f1952t;
            i3 = c0323c2.f1972b;
            int i10 = c0323c2.f1974d;
            int i11 = c0323c2.f1973c;
            if (i11 > 0) {
                mo2854c += i11;
            }
            m2134a(this.f1948E);
            C0323c c0323c3 = this.f1952t;
            c0323c3.f1978h = mo2854c;
            c0323c3.f1974d += c0323c3.f1975e;
            m2167a(c0349v, c0323c3, c0353z, false);
            C0323c c0323c4 = this.f1952t;
            i2 = c0323c4.f1972b;
            int i12 = c0323c4.f1973c;
            if (i12 > 0) {
                m2149g(i10, i3);
                C0323c c0323c5 = this.f1952t;
                c0323c5.f1978h = i12;
                m2167a(c0349v, c0323c5, c0353z, false);
                i3 = this.f1952t.f1972b;
            }
        } else {
            m2134a(c0321a2);
            C0323c c0323c6 = this.f1952t;
            c0323c6.f1978h = mo2854c;
            m2167a(c0349v, c0323c6, c0353z, false);
            C0323c c0323c7 = this.f1952t;
            i2 = c0323c7.f1972b;
            int i13 = c0323c7.f1974d;
            int i14 = c0323c7.f1973c;
            if (i14 > 0) {
                mo2860f += i14;
            }
            m2142b(this.f1948E);
            C0323c c0323c8 = this.f1952t;
            c0323c8.f1978h = mo2860f;
            c0323c8.f1974d += c0323c8.f1975e;
            m2167a(c0349v, c0323c8, c0353z, false);
            C0323c c0323c9 = this.f1952t;
            i3 = c0323c9.f1972b;
            int i15 = c0323c9.f1973c;
            if (i15 > 0) {
                m2147f(i13, i2);
                C0323c c0323c10 = this.f1952t;
                c0323c10.f1978h = i15;
                m2167a(c0349v, c0323c10, c0353z, false);
                i2 = this.f1952t.f1972b;
            }
        }
        if (m2514e() > 0) {
            if (this.f1956x ^ this.f1957y) {
                int m2131a2 = m2131a(i2, c0349v, c0353z, true);
                i4 = i3 + m2131a2;
                i5 = i2 + m2131a2;
                m2131a = m2140b(i4, c0349v, c0353z, false);
            } else {
                int m2140b = m2140b(i3, c0349v, c0353z, true);
                i4 = i3 + m2140b;
                i5 = i2 + m2140b;
                m2131a = m2131a(i5, c0349v, c0353z, false);
            }
            i3 = i4 + m2131a;
            i2 = i5 + m2131a;
        }
        m2144b(c0349v, c0353z, i3, i2);
        if (c0353z.m2632d()) {
            this.f1948E.m2197b();
        } else {
            this.f1953u.m2864i();
        }
        this.f1954v = this.f1957y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: f */
    public int mo2186f(RecyclerView.C0353z c0353z) {
        return m2155k(c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: g */
    public void mo2119g(RecyclerView.C0353z c0353z) {
        super.mo2119g(c0353z);
        this.f1947D = null;
        this.f1944A = -1;
        this.f1945B = Integer.MIN_VALUE;
        this.f1948E.m2197b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m2187h(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1951s == 1) ? 1 : Integer.MIN_VALUE : this.f1951s == 0 ? 1 : Integer.MIN_VALUE : this.f1951s == 1 ? -1 : Integer.MIN_VALUE : this.f1951s == 0 ? -1 : Integer.MIN_VALUE : (this.f1951s != 1 && m2165I()) ? -1 : 1 : (this.f1951s != 1 && m2165I()) ? 1 : -1;
    }

    /* renamed from: h */
    protected int m2188h(RecyclerView.C0353z c0353z) {
        if (c0353z.m2631c()) {
            return this.f1953u.mo2862g();
        }
        return 0;
    }

    /* renamed from: i */
    public void m2189i(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo2174a((String) null);
        if (i != this.f1951s || this.f1953u == null) {
            AbstractC0367h m2847a = AbstractC0367h.m2847a(this, i);
            this.f1953u = m2847a;
            this.f1948E.f1962a = m2847a;
            this.f1951s = i;
            m2548y();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: u */
    public boolean mo2190u() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: x */
    public Parcelable mo2191x() {
        if (this.f1947D != null) {
            return new SavedState(this.f1947D);
        }
        SavedState savedState = new SavedState();
        if (m2514e() > 0) {
            m2161E();
            boolean z = this.f1954v ^ this.f1956x;
            savedState.f1961d = z;
            if (z) {
                View m2128K = m2128K();
                savedState.f1960c = this.f1953u.mo2852b() - this.f1953u.mo2850a(m2128K);
                savedState.f1959b = m2534l(m2128K);
            } else {
                View m2129L = m2129L();
                savedState.f1959b = m2534l(m2129L);
                savedState.f1960c = this.f1953u.mo2857d(m2129L) - this.f1953u.mo2860f();
            }
        } else {
            savedState.m2193b();
        }
        return savedState;
    }
}
