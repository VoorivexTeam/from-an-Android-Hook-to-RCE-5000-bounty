package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p000.C2494g1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public final class RunnableC0364e implements Runnable {

    /* renamed from: f */
    static final ThreadLocal<RunnableC0364e> f2329f = new ThreadLocal<>();

    /* renamed from: g */
    static Comparator<c> f2330g = new a();

    /* renamed from: c */
    long f2332c;

    /* renamed from: d */
    long f2333d;

    /* renamed from: b */
    ArrayList<RecyclerView> f2331b = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<c> f2334e = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes.dex */
    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            if ((cVar.f2342d == null) != (cVar2.f2342d == null)) {
                return cVar.f2342d == null ? 1 : -1;
            }
            boolean z = cVar.f2339a;
            if (z != cVar2.f2339a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f2340b - cVar.f2340b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f2341c - cVar2.f2341c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.AbstractC0342o.c {

        /* renamed from: a */
        int f2335a;

        /* renamed from: b */
        int f2336b;

        /* renamed from: c */
        int[] f2337c;

        /* renamed from: d */
        int f2338d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m2833a() {
            int[] iArr = this.f2337c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2338d = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0342o.c
        /* renamed from: a */
        public void mo2555a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f2338d * 2;
            int[] iArr = this.f2337c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2337c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f2337c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2337c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f2338d++;
        }

        /* renamed from: a */
        void m2834a(RecyclerView recyclerView, boolean z) {
            this.f2338d = 0;
            int[] iArr = this.f2337c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0342o abstractC0342o = recyclerView.f2038m;
            if (recyclerView.f2036l == null || abstractC0342o == null || !abstractC0342o.m2546v()) {
                return;
            }
            if (z) {
                if (!recyclerView.f2022e.m2754c()) {
                    abstractC0342o.mo2171a(recyclerView.f2036l.mo2397a(), this);
                }
            } else if (!recyclerView.m2309j()) {
                abstractC0342o.mo2170a(this.f2335a, this.f2336b, recyclerView.f2029h0, this);
            }
            int i = this.f2338d;
            if (i > abstractC0342o.f2120m) {
                abstractC0342o.f2120m = i;
                abstractC0342o.f2121n = z;
                recyclerView.f2018c.m2618j();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m2835a(int i) {
            if (this.f2337c != null) {
                int i2 = this.f2338d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2337c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: b */
        void m2836b(int i, int i2) {
            this.f2335a = i;
            this.f2336b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f2339a;

        /* renamed from: b */
        public int f2340b;

        /* renamed from: c */
        public int f2341c;

        /* renamed from: d */
        public RecyclerView f2342d;

        /* renamed from: e */
        public int f2343e;

        c() {
        }

        /* renamed from: a */
        public void m2837a() {
            this.f2339a = false;
            this.f2340b = 0;
            this.f2341c = 0;
            this.f2342d = null;
            this.f2343e = 0;
        }
    }

    /* renamed from: a */
    private RecyclerView.AbstractC0330c0 m2822a(RecyclerView recyclerView, int i, long j) {
        if (m2826a(recyclerView, i)) {
            return null;
        }
        RecyclerView.C0349v c0349v = recyclerView.f2018c;
        try {
            recyclerView.m2317q();
            RecyclerView.AbstractC0330c0 m2586a = c0349v.m2586a(i, false, j);
            if (m2586a != null) {
                if (!m2586a.m2359m() || m2586a.m2360n()) {
                    c0349v.m2594a(m2586a, false);
                } else {
                    c0349v.m2601b(m2586a.f2076a);
                }
            }
            return m2586a;
        } finally {
            recyclerView.m2264a(false);
        }
    }

    /* renamed from: a */
    private void m2823a() {
        c cVar;
        int size = this.f2331b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f2331b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f2027g0.m2834a(recyclerView, false);
                i += recyclerView.f2027g0.f2338d;
            }
        }
        this.f2334e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f2331b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f2027g0;
                int abs = Math.abs(bVar.f2335a) + Math.abs(bVar.f2336b);
                for (int i5 = 0; i5 < bVar.f2338d * 2; i5 += 2) {
                    if (i3 >= this.f2334e.size()) {
                        cVar = new c();
                        this.f2334e.add(cVar);
                    } else {
                        cVar = this.f2334e.get(i3);
                    }
                    int i6 = bVar.f2337c[i5 + 1];
                    cVar.f2339a = i6 <= abs;
                    cVar.f2340b = abs;
                    cVar.f2341c = i6;
                    cVar.f2342d = recyclerView2;
                    cVar.f2343e = bVar.f2337c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f2334e, f2330g);
    }

    /* renamed from: a */
    private void m2824a(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f1995D && recyclerView.f2024f.m2769b() != 0) {
            recyclerView.m2320t();
        }
        b bVar = recyclerView.f2027g0;
        bVar.m2834a(recyclerView, true);
        if (bVar.f2338d != 0) {
            try {
                C2494g1.m11864a("RV Nested Prefetch");
                recyclerView.f2029h0.m2629a(recyclerView.f2036l);
                for (int i = 0; i < bVar.f2338d * 2; i += 2) {
                    m2822a(recyclerView, bVar.f2337c[i], j);
                }
            } finally {
                C2494g1.m11863a();
            }
        }
    }

    /* renamed from: a */
    private void m2825a(c cVar, long j) {
        RecyclerView.AbstractC0330c0 m2822a = m2822a(cVar.f2342d, cVar.f2343e, cVar.f2339a ? Long.MAX_VALUE : j);
        if (m2822a == null || m2822a.f2077b == null || !m2822a.m2359m() || m2822a.m2360n()) {
            return;
        }
        m2824a(m2822a.f2077b.get(), j);
    }

    /* renamed from: a */
    static boolean m2826a(RecyclerView recyclerView, int i) {
        int m2769b = recyclerView.f2024f.m2769b();
        for (int i2 = 0; i2 < m2769b; i2++) {
            RecyclerView.AbstractC0330c0 m2241k = RecyclerView.m2241k(recyclerView.f2024f.m2775d(i2));
            if (m2241k.f2078c == i && !m2241k.m2360n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m2827b(long j) {
        for (int i = 0; i < this.f2334e.size(); i++) {
            c cVar = this.f2334e.get(i);
            if (cVar.f2342d == null) {
                return;
            }
            m2825a(cVar, j);
            cVar.m2837a();
        }
    }

    /* renamed from: a */
    void m2828a(long j) {
        m2823a();
        m2827b(j);
    }

    /* renamed from: a */
    public void m2829a(RecyclerView recyclerView) {
        this.f2331b.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2830a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2332c == 0) {
            this.f2332c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f2027g0.m2836b(i, i2);
    }

    /* renamed from: b */
    public void m2831b(RecyclerView recyclerView) {
        this.f2331b.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C2494g1.m11864a("RV Prefetch");
            if (!this.f2331b.isEmpty()) {
                int size = this.f2331b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f2331b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m2828a(TimeUnit.MILLISECONDS.toNanos(j) + this.f2333d);
                }
            }
        } finally {
            this.f2332c = 0L;
            C2494g1.m11863a();
        }
    }
}
