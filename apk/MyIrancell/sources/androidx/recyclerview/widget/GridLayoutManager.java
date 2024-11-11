package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.C0448b3;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: H */
    boolean f1932H;

    /* renamed from: I */
    int f1933I;

    /* renamed from: J */
    int[] f1934J;

    /* renamed from: K */
    View[] f1935K;

    /* renamed from: L */
    final SparseIntArray f1936L;

    /* renamed from: M */
    final SparseIntArray f1937M;

    /* renamed from: N */
    AbstractC0319c f1938N;

    /* renamed from: O */
    final Rect f1939O;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C0317a extends AbstractC0319c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0319c
        /* renamed from: a */
        public int mo2121a(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0319c
        /* renamed from: c */
        public int mo2122c(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0318b extends RecyclerView.C0343p {

        /* renamed from: e */
        int f1940e;

        /* renamed from: f */
        int f1941f;

        public C0318b(int i, int i2) {
            super(i, i2);
            this.f1940e = -1;
            this.f1941f = 0;
        }

        public C0318b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1940e = -1;
            this.f1941f = 0;
        }

        public C0318b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1940e = -1;
            this.f1941f = 0;
        }

        public C0318b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1940e = -1;
            this.f1941f = 0;
        }

        /* renamed from: e */
        public int m2123e() {
            return this.f1940e;
        }

        /* renamed from: f */
        public int m2124f() {
            return this.f1941f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0319c {

        /* renamed from: a */
        final SparseIntArray f1942a = new SparseIntArray();

        /* renamed from: b */
        private boolean f1943b = false;

        /* renamed from: a */
        public abstract int mo2121a(int i);

        /* renamed from: a */
        int m2125a(int i, int i2) {
            if (!this.f1943b) {
                return mo2122c(i, i2);
            }
            int i3 = this.f1942a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int mo2122c = mo2122c(i, i2);
            this.f1942a.put(i, mo2122c);
            return mo2122c;
        }

        /* renamed from: a */
        public void m2126a() {
            this.f1942a.clear();
        }

        /* renamed from: b */
        public int m2127b(int i, int i2) {
            int mo2121a = mo2121a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int mo2121a2 = mo2121a(i5);
                i3 += mo2121a2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = mo2121a2;
                }
            }
            return i3 + mo2121a > i2 ? i4 + 1 : i4;
        }

        /* renamed from: c */
        public abstract int mo2122c(int i, int i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1932H = false;
        this.f1933I = -1;
        this.f1936L = new SparseIntArray();
        this.f1937M = new SparseIntArray();
        this.f1938N = new C0317a();
        this.f1939O = new Rect();
        m2120j(RecyclerView.AbstractC0342o.m2453a(context, attributeSet, i, i2).f2129b);
    }

    /* renamed from: K */
    private void m2081K() {
        int m2514e = m2514e();
        for (int i = 0; i < m2514e; i++) {
            C0318b c0318b = (C0318b) m2501c(i).getLayoutParams();
            int m2556a = c0318b.m2556a();
            this.f1936L.put(m2556a, c0318b.m2124f());
            this.f1937M.put(m2556a, c0318b.m2123e());
        }
    }

    /* renamed from: L */
    private void m2082L() {
        this.f1936L.clear();
        this.f1937M.clear();
    }

    /* renamed from: M */
    private void m2083M() {
        View[] viewArr = this.f1935K;
        if (viewArr == null || viewArr.length != this.f1933I) {
            this.f1935K = new View[this.f1933I];
        }
    }

    /* renamed from: N */
    private void m2084N() {
        int m2525h;
        int m2541p;
        if (m2164H() == 1) {
            m2525h = m2542q() - m2539o();
            m2541p = m2537n();
        } else {
            m2525h = m2525h() - m2535m();
            m2541p = m2541p();
        }
        m2094k(m2525h - m2541p);
    }

    /* renamed from: a */
    private int m2085a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, int i) {
        if (!c0353z.m2632d()) {
            return this.f1938N.m2127b(i, this.f1933I);
        }
        int m2584a = c0349v.m2584a(i);
        if (m2584a != -1) {
            return this.f1938N.m2127b(m2584a, this.f1933I);
        }
        String str = "Cannot find span size for pre layout position. " + i;
        return 0;
    }

    /* renamed from: a */
    private void m2086a(float f, int i) {
        m2094k(Math.max(Math.round(f * this.f1933I), i));
    }

    /* renamed from: a */
    private void m2087a(View view, int i, int i2, boolean z) {
        RecyclerView.C0343p c0343p = (RecyclerView.C0343p) view.getLayoutParams();
        if (z ? m2499b(view, i, i2, c0343p) : m2482a(view, i, i2, c0343p)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m2088a(View view, int i, boolean z) {
        int i2;
        int i3;
        C0318b c0318b = (C0318b) view.getLayoutParams();
        Rect rect = c0318b.f2133b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0318b).topMargin + ((ViewGroup.MarginLayoutParams) c0318b).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0318b).leftMargin + ((ViewGroup.MarginLayoutParams) c0318b).rightMargin;
        int m2118f = m2118f(c0318b.f1940e, c0318b.f1941f);
        if (this.f1951s == 1) {
            i3 = RecyclerView.AbstractC0342o.m2452a(m2118f, i, i5, ((ViewGroup.MarginLayoutParams) c0318b).width, false);
            i2 = RecyclerView.AbstractC0342o.m2452a(this.f1953u.mo2862g(), m2527i(), i4, ((ViewGroup.MarginLayoutParams) c0318b).height, true);
        } else {
            int m2452a = RecyclerView.AbstractC0342o.m2452a(m2118f, i, i4, ((ViewGroup.MarginLayoutParams) c0318b).height, false);
            int m2452a2 = RecyclerView.AbstractC0342o.m2452a(this.f1953u.mo2862g(), m2543r(), i5, ((ViewGroup.MarginLayoutParams) c0318b).width, true);
            i2 = m2452a;
            i3 = m2452a2;
        }
        m2087a(view, i3, i2, z);
    }

    /* renamed from: a */
    private void m2089a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = i - 1;
            i4 = -1;
        }
        while (i3 != i6) {
            View view = this.f1935K[i3];
            C0318b c0318b = (C0318b) view.getLayoutParams();
            int m2093c = m2093c(c0349v, c0353z, m2534l(view));
            c0318b.f1941f = m2093c;
            c0318b.f1940e = i5;
            i5 += m2093c;
            i3 += i4;
        }
    }

    /* renamed from: a */
    static int[] m2090a(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: b */
    private int m2091b(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, int i) {
        if (!c0353z.m2632d()) {
            return this.f1938N.m2125a(i, this.f1933I);
        }
        int i2 = this.f1937M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m2584a = c0349v.m2584a(i);
        if (m2584a != -1) {
            return this.f1938N.m2125a(m2584a, this.f1933I);
        }
        String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i;
        return 0;
    }

    /* renamed from: b */
    private void m2092b(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, LinearLayoutManager.C0321a c0321a, int i) {
        boolean z = i == 1;
        int m2091b = m2091b(c0349v, c0353z, c0321a.f1963b);
        if (z) {
            while (m2091b > 0) {
                int i2 = c0321a.f1963b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                c0321a.f1963b = i3;
                m2091b = m2091b(c0349v, c0353z, i3);
            }
            return;
        }
        int m2627a = c0353z.m2627a() - 1;
        int i4 = c0321a.f1963b;
        while (i4 < m2627a) {
            int i5 = i4 + 1;
            int m2091b2 = m2091b(c0349v, c0353z, i5);
            if (m2091b2 <= m2091b) {
                break;
            }
            i4 = i5;
            m2091b = m2091b2;
        }
        c0321a.f1963b = i4;
    }

    /* renamed from: c */
    private int m2093c(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, int i) {
        if (!c0353z.m2632d()) {
            return this.f1938N.mo2121a(i);
        }
        int i2 = this.f1936L.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m2584a = c0349v.m2584a(i);
        if (m2584a != -1) {
            return this.f1938N.mo2121a(m2584a);
        }
        String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i;
        return 1;
    }

    /* renamed from: k */
    private void m2094k(int i) {
        this.f1934J = m2090a(this.f1934J, this.f1933I, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: C */
    public boolean mo2095C() {
        return this.f1947D == null && !this.f1932H;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public int mo2096a(int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        m2084N();
        m2083M();
        return super.mo2096a(i, c0349v, c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public int mo2097a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        if (this.f1951s == 1) {
            return this.f1933I;
        }
        if (c0353z.m2627a() < 1) {
            return 0;
        }
        return m2085a(c0349v, c0353z, c0353z.m2627a() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r13 == (r2 > r7)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo2098a(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0349v r26, androidx.recyclerview.widget.RecyclerView.C0353z r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo2098a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
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
            if (m2534l >= 0 && m2534l < i3 && m2091b(c0349v, c0353z, m2534l) == 0) {
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
    public RecyclerView.C0343p mo2100a(Context context, AttributeSet attributeSet) {
        return new C0318b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public RecyclerView.C0343p mo2101a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0318b((ViewGroup.MarginLayoutParams) layoutParams) : new C0318b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2102a(Rect rect, int i, int i2) {
        int m2451a;
        int m2451a2;
        if (this.f1934J == null) {
            super.mo2102a(rect, i, i2);
        }
        int m2537n = m2537n() + m2539o();
        int m2541p = m2541p() + m2535m();
        if (this.f1951s == 1) {
            m2451a2 = RecyclerView.AbstractC0342o.m2451a(i2, rect.height() + m2541p, m2531k());
            int[] iArr = this.f1934J;
            m2451a = RecyclerView.AbstractC0342o.m2451a(i, iArr[iArr.length - 1] + m2537n, m2533l());
        } else {
            m2451a = RecyclerView.AbstractC0342o.m2451a(i, rect.width() + m2537n, m2533l());
            int[] iArr2 = this.f1934J;
            m2451a2 = RecyclerView.AbstractC0342o.m2451a(i2, iArr2[iArr2.length - 1] + m2541p, m2531k());
        }
        m2503c(m2451a, m2451a2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2103a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, View view, C0448b3 c0448b3) {
        int i;
        int m2123e;
        int m2124f;
        boolean z;
        boolean z2;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0318b)) {
            super.m2471a(view, c0448b3);
            return;
        }
        C0318b c0318b = (C0318b) layoutParams;
        int m2085a = m2085a(c0349v, c0353z, c0318b.m2556a());
        if (this.f1951s == 0) {
            int m2123e2 = c0318b.m2123e();
            i = c0318b.m2124f();
            m2124f = 1;
            z = this.f1933I > 1 && c0318b.m2124f() == this.f1933I;
            z2 = false;
            i2 = m2123e2;
            m2123e = m2085a;
        } else {
            i = 1;
            m2123e = c0318b.m2123e();
            m2124f = c0318b.m2124f();
            z = this.f1933I > 1 && c0318b.m2124f() == this.f1933I;
            z2 = false;
            i2 = m2085a;
        }
        c0448b3.m3287b(C0448b3.b.m3311a(i2, i, m2123e, m2124f, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public void mo2104a(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z, LinearLayoutManager.C0321a c0321a, int i) {
        super.mo2104a(c0349v, c0353z, c0321a, i);
        m2084N();
        if (c0353z.m2627a() > 0 && !c0353z.m2632d()) {
            m2092b(c0349v, c0353z, c0321a, i);
        }
        m2083M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        r22.f1968b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mo2105a(androidx.recyclerview.widget.RecyclerView.C0349v r19, androidx.recyclerview.widget.RecyclerView.C0353z r20, androidx.recyclerview.widget.LinearLayoutManager.C0323c r21, androidx.recyclerview.widget.LinearLayoutManager.C0322b r22) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo2105a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    void mo2106a(RecyclerView.C0353z c0353z, LinearLayoutManager.C0323c c0323c, RecyclerView.AbstractC0342o.c cVar) {
        int i = this.f1933I;
        for (int i2 = 0; i2 < this.f1933I && c0323c.m2204a(c0353z) && i > 0; i2++) {
            int i3 = c0323c.f1974d;
            cVar.mo2555a(i3, Math.max(0, c0323c.f1977g));
            i -= this.f1938N.mo2121a(i3);
            c0323c.f1974d += c0323c.f1975e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2107a(RecyclerView recyclerView, int i, int i2) {
        this.f1938N.m2126a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2108a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f1938N.m2126a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public void mo2109a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f1938N.m2126a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: a */
    public boolean mo2110a(RecyclerView.C0343p c0343p) {
        return c0343p instanceof C0318b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public int mo2111b(int i, RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        m2084N();
        m2083M();
        return super.mo2111b(i, c0349v, c0353z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public int mo2112b(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        if (this.f1951s == 0) {
            return this.f1933I;
        }
        if (c0353z.m2627a() < 1) {
            return 0;
        }
        return m2085a(c0349v, c0353z, c0353z.m2627a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: b */
    public void mo2113b(RecyclerView recyclerView, int i, int i2) {
        this.f1938N.m2126a();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: b */
    public void mo2114b(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo2114b(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: c */
    public RecyclerView.C0343p mo2115c() {
        return this.f1951s == 0 ? new C0318b(-2, -1) : new C0318b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: d */
    public void mo2116d(RecyclerView recyclerView) {
        this.f1938N.m2126a();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: e */
    public void mo2117e(RecyclerView.C0349v c0349v, RecyclerView.C0353z c0353z) {
        if (c0353z.m2632d()) {
            m2081K();
        }
        super.mo2117e(c0349v, c0353z);
        m2082L();
    }

    /* renamed from: f */
    int m2118f(int i, int i2) {
        if (this.f1951s != 1 || !m2165I()) {
            int[] iArr = this.f1934J;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1934J;
        int i3 = this.f1933I;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0342o
    /* renamed from: g */
    public void mo2119g(RecyclerView.C0353z c0353z) {
        super.mo2119g(c0353z);
        this.f1932H = false;
    }

    /* renamed from: j */
    public void m2120j(int i) {
        if (i == this.f1933I) {
            return;
        }
        this.f1932H = true;
        if (i >= 1) {
            this.f1933I = i;
            this.f1938N.m2126a();
            m2548y();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }
}
