package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {
    final InterfaceC0016b a;
    final a b = new a();
    final List<View> c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        long a = 0;
        a b;

        a() {
        }

        private void b() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        void a() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
        }

        void a(int i) {
            if (i < 64) {
                this.a &= (1 << i) ^ (-1);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        void a(int i, boolean z) {
            if (i >= 64) {
                b();
                this.b.a(i - 64, z);
                return;
            }
            boolean z2 = (this.a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.a;
            this.a = ((j2 & (j ^ (-1))) << 1) | (j2 & j);
            if (z) {
                e(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                b();
                this.b.a(0, z2);
            }
        }

        int b(int i) {
            a aVar = this.b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.a);
        }

        boolean c(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            b();
            return this.b.c(i - 64);
        }

        boolean d(int i) {
            if (i >= 64) {
                b();
                return this.b.d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.a & j) != 0;
            long j2 = this.a & (j ^ (-1));
            this.a = j2;
            long j3 = j - 1;
            this.a = (j2 & j3) | Long.rotateRight((j3 ^ (-1)) & j2, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    e(63);
                }
                this.b.d(0);
            }
            return z;
        }

        void e(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                b();
                this.b.e(i - 64);
            }
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0016b {
        int a();

        View a(int i);

        void a(View view);

        void a(View view, int i);

        void a(View view, int i, ViewGroup.LayoutParams layoutParams);

        RecyclerView.c0 b(View view);

        void b();

        void b(int i);

        void c(int i);

        void c(View view);

        int d(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(InterfaceC0016b interfaceC0016b) {
        this.a = interfaceC0016b;
    }

    private int f(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = this.a.a();
        int i2 = i;
        while (i2 < a2) {
            int b = i - (i2 - this.b.b(i2));
            if (b == 0) {
                while (this.b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    private void g(View view) {
        this.c.add(view);
        this.a.a(view);
    }

    private boolean h(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.c(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.a.a() - this.c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        int f = f(i);
        this.b.d(f);
        this.a.b(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        int d = this.a.d(view);
        if (d >= 0) {
            this.b.e(d);
            g(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a2 = i < 0 ? this.a.a() : f(i);
        this.b.a(a2, z);
        if (z) {
            g(view);
        }
        this.a.a(view, a2, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i, boolean z) {
        int a2 = i < 0 ? this.a.a() : f(i);
        this.b.a(a2, z);
        if (z) {
            g(view);
        }
        this.a.a(view, a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, boolean z) {
        a(view, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(View view) {
        int d = this.a.d(view);
        if (d == -1 || this.b.c(d)) {
            return -1;
        }
        return d - this.b.b(d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.c.get(i2);
            RecyclerView.c0 b = this.a.b(view);
            if (b.i() == i && !b.n() && !b.p()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View c(int i) {
        return this.a.a(f(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.b.a();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.c(this.c.get(size));
            this.c.remove(size);
        }
        this.a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(View view) {
        return this.c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View d(int i) {
        return this.a.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        int d = this.a.d(view);
        if (d < 0) {
            return;
        }
        if (this.b.d(d)) {
            h(view);
        }
        this.a.c(d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i) {
        int f = f(i);
        View a2 = this.a.a(f);
        if (a2 == null) {
            return;
        }
        if (this.b.d(f)) {
            h(a2);
        }
        this.a.c(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(View view) {
        int d = this.a.d(view);
        if (d == -1) {
            h(view);
            return true;
        }
        if (!this.b.c(d)) {
            return false;
        }
        this.b.d(d);
        h(view);
        this.a.c(d);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(View view) {
        int d = this.a.d(view);
        if (d < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.b.c(d)) {
            this.b.a(d);
            h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
