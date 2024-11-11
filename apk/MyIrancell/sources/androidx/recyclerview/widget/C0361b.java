package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public class C0361b {

    /* renamed from: a */
    final b f2237a;

    /* renamed from: b */
    final a f2238b = new a();

    /* renamed from: c */
    final List<View> f2239c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        long f2240a = 0;

        /* renamed from: b */
        a f2241b;

        a() {
        }

        /* renamed from: b */
        private void m2780b() {
            if (this.f2241b == null) {
                this.f2241b = new a();
            }
        }

        /* renamed from: a */
        void m2781a() {
            this.f2240a = 0L;
            a aVar = this.f2241b;
            if (aVar != null) {
                aVar.m2781a();
            }
        }

        /* renamed from: a */
        void m2782a(int i) {
            if (i < 64) {
                this.f2240a &= (1 << i) ^ (-1);
                return;
            }
            a aVar = this.f2241b;
            if (aVar != null) {
                aVar.m2782a(i - 64);
            }
        }

        /* renamed from: a */
        void m2783a(int i, boolean z) {
            if (i >= 64) {
                m2780b();
                this.f2241b.m2783a(i - 64, z);
                return;
            }
            boolean z2 = (this.f2240a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f2240a;
            this.f2240a = ((j2 & (j ^ (-1))) << 1) | (j2 & j);
            if (z) {
                m2787e(i);
            } else {
                m2782a(i);
            }
            if (z2 || this.f2241b != null) {
                m2780b();
                this.f2241b.m2783a(0, z2);
            }
        }

        /* renamed from: b */
        int m2784b(int i) {
            a aVar = this.f2241b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f2240a) : Long.bitCount(this.f2240a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f2240a & ((1 << i) - 1)) : aVar.m2784b(i - 64) + Long.bitCount(this.f2240a);
        }

        /* renamed from: c */
        boolean m2785c(int i) {
            if (i < 64) {
                return (this.f2240a & (1 << i)) != 0;
            }
            m2780b();
            return this.f2241b.m2785c(i - 64);
        }

        /* renamed from: d */
        boolean m2786d(int i) {
            if (i >= 64) {
                m2780b();
                return this.f2241b.m2786d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f2240a & j) != 0;
            long j2 = this.f2240a & (j ^ (-1));
            this.f2240a = j2;
            long j3 = j - 1;
            this.f2240a = (j2 & j3) | Long.rotateRight((j3 ^ (-1)) & j2, 1);
            a aVar = this.f2241b;
            if (aVar != null) {
                if (aVar.m2785c(0)) {
                    m2787e(63);
                }
                this.f2241b.m2786d(0);
            }
            return z;
        }

        /* renamed from: e */
        void m2787e(int i) {
            if (i < 64) {
                this.f2240a |= 1 << i;
            } else {
                m2780b();
                this.f2241b.m2787e(i - 64);
            }
        }

        public String toString() {
            if (this.f2241b == null) {
                return Long.toBinaryString(this.f2240a);
            }
            return this.f2241b.toString() + "xx" + Long.toBinaryString(this.f2240a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        int mo2377a();

        /* renamed from: a */
        View mo2378a(int i);

        /* renamed from: a */
        void mo2379a(View view);

        /* renamed from: a */
        void mo2380a(View view, int i);

        /* renamed from: a */
        void mo2381a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b */
        RecyclerView.AbstractC0330c0 mo2382b(View view);

        /* renamed from: b */
        void mo2383b();

        /* renamed from: b */
        void mo2384b(int i);

        /* renamed from: c */
        void mo2385c(int i);

        /* renamed from: c */
        void mo2386c(View view);

        /* renamed from: d */
        int mo2387d(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0361b(b bVar) {
        this.f2237a = bVar;
    }

    /* renamed from: f */
    private int m2760f(int i) {
        if (i < 0) {
            return -1;
        }
        int mo2377a = this.f2237a.mo2377a();
        int i2 = i;
        while (i2 < mo2377a) {
            int m2784b = i - (i2 - this.f2238b.m2784b(i2));
            if (m2784b == 0) {
                while (this.f2238b.m2785c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m2784b;
        }
        return -1;
    }

    /* renamed from: g */
    private void m2761g(View view) {
        this.f2239c.add(view);
        this.f2237a.mo2379a(view);
    }

    /* renamed from: h */
    private boolean m2762h(View view) {
        if (!this.f2239c.remove(view)) {
            return false;
        }
        this.f2237a.mo2386c(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m2763a() {
        return this.f2237a.mo2377a() - this.f2239c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2764a(int i) {
        int m2760f = m2760f(i);
        this.f2238b.m2786d(m2760f);
        this.f2237a.mo2384b(m2760f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2765a(View view) {
        int mo2387d = this.f2237a.mo2387d(view);
        if (mo2387d >= 0) {
            this.f2238b.m2787e(mo2387d);
            m2761g(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2766a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int mo2377a = i < 0 ? this.f2237a.mo2377a() : m2760f(i);
        this.f2238b.m2783a(mo2377a, z);
        if (z) {
            m2761g(view);
        }
        this.f2237a.mo2381a(view, mo2377a, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2767a(View view, int i, boolean z) {
        int mo2377a = i < 0 ? this.f2237a.mo2377a() : m2760f(i);
        this.f2238b.m2783a(mo2377a, z);
        if (z) {
            m2761g(view);
        }
        this.f2237a.mo2380a(view, mo2377a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2768a(View view, boolean z) {
        m2767a(view, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m2769b() {
        return this.f2237a.mo2377a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m2770b(View view) {
        int mo2387d = this.f2237a.mo2387d(view);
        if (mo2387d == -1 || this.f2238b.m2785c(mo2387d)) {
            return -1;
        }
        return mo2387d - this.f2238b.m2784b(mo2387d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m2771b(int i) {
        int size = this.f2239c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2239c.get(i2);
            RecyclerView.AbstractC0330c0 mo2382b = this.f2237a.mo2382b(view);
            if (mo2382b.m2355i() == i && !mo2382b.m2360n() && !mo2382b.m2362p()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public View m2772c(int i) {
        return this.f2237a.mo2378a(m2760f(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2773c() {
        this.f2238b.m2781a();
        for (int size = this.f2239c.size() - 1; size >= 0; size--) {
            this.f2237a.mo2386c(this.f2239c.get(size));
            this.f2239c.remove(size);
        }
        this.f2237a.mo2383b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m2774c(View view) {
        return this.f2239c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public View m2775d(int i) {
        return this.f2237a.mo2378a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m2776d(View view) {
        int mo2387d = this.f2237a.mo2387d(view);
        if (mo2387d < 0) {
            return;
        }
        if (this.f2238b.m2786d(mo2387d)) {
            m2762h(view);
        }
        this.f2237a.mo2385c(mo2387d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2777e(int i) {
        int m2760f = m2760f(i);
        View mo2378a = this.f2237a.mo2378a(m2760f);
        if (mo2378a == null) {
            return;
        }
        if (this.f2238b.m2786d(m2760f)) {
            m2762h(mo2378a);
        }
        this.f2237a.mo2385c(m2760f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m2778e(View view) {
        int mo2387d = this.f2237a.mo2387d(view);
        if (mo2387d == -1) {
            m2762h(view);
            return true;
        }
        if (!this.f2238b.m2785c(mo2387d)) {
            return false;
        }
        this.f2238b.m2786d(mo2387d);
        m2762h(view);
        this.f2237a.mo2385c(mo2387d);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2779f(View view) {
        int mo2387d = this.f2237a.mo2387d(view);
        if (mo2387d < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f2238b.m2785c(mo2387d)) {
            this.f2238b.m2782a(mo2387d);
            m2762h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f2238b.toString() + ", hidden list:" + this.f2239c.size();
    }
}
