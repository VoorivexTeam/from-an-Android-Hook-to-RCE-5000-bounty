package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class n {
    private Interpolator c;
    v2 d;
    private boolean e;
    private long b = -1;
    private final w2 f = new a();
    final ArrayList<u2> a = new ArrayList<>();

    /* loaded from: classes.dex */
    class a extends w2 {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        void a() {
            this.b = 0;
            this.a = false;
            n.this.b();
        }

        @Override // defpackage.v2
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == n.this.a.size()) {
                v2 v2Var = n.this.d;
                if (v2Var != null) {
                    v2Var.b(null);
                }
                a();
            }
        }

        @Override // defpackage.w2, defpackage.v2
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            v2 v2Var = n.this.d;
            if (v2Var != null) {
                v2Var.c(null);
            }
        }
    }

    public n a(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public n a(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public n a(u2 u2Var) {
        if (!this.e) {
            this.a.add(u2Var);
        }
        return this;
    }

    public n a(u2 u2Var, u2 u2Var2) {
        this.a.add(u2Var);
        u2Var2.b(u2Var.b());
        this.a.add(u2Var2);
        return this;
    }

    public n a(v2 v2Var) {
        if (!this.e) {
            this.d = v2Var;
        }
        return this;
    }

    public void a() {
        if (this.e) {
            Iterator<u2> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.e = false;
        }
    }

    void b() {
        this.e = false;
    }

    public void c() {
        if (this.e) {
            return;
        }
        Iterator<u2> it = this.a.iterator();
        while (it.hasNext()) {
            u2 next = it.next();
            long j = this.b;
            if (j >= 0) {
                next.a(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                next.a(interpolator);
            }
            if (this.d != null) {
                next.a(this.f);
            }
            next.c();
        }
        this.e = true;
    }
}
