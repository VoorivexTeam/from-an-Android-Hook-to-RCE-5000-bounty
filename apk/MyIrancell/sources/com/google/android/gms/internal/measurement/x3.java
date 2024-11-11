package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class x3 implements b8 {
    private final v3 a;

    private x3(v3 v3Var) {
        r4.a(v3Var, "output");
        v3 v3Var2 = v3Var;
        this.a = v3Var2;
        v3Var2.a = this;
    }

    public static x3 a(v3 v3Var) {
        x3 x3Var = v3Var.a;
        return x3Var != null ? x3Var : new x3(v3Var);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i) {
        this.a.a(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, double d) {
        this.a.a(i, d);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, float f) {
        this.a.a(i, f);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, int i2) {
        this.a.e(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, long j) {
        this.a.c(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, h3 h3Var) {
        this.a.a(i, h3Var);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final <K, V> void a(int i, s5<K, V> s5Var, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.a(i, 2);
            this.a.b(p5.a(s5Var, entry.getKey(), entry.getValue()));
            p5.a(this.a, s5Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, Object obj) {
        if (obj instanceof h3) {
            this.a.b(i, (h3) obj);
        } else {
            this.a.a(i, (x5) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, Object obj, q6 q6Var) {
        this.a.a(i, (x5) obj, q6Var);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, String str) {
        this.a.a(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, List<h3> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.a(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, List<?> list, q6 q6Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), q6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.c(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.g(list.get(i4).longValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.c(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void a(int i, boolean z) {
        this.a.a(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void b(int i) {
        this.a.a(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void b(int i, int i2) {
        this.a.d(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void b(int i, long j) {
        this.a.a(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void b(int i, Object obj, q6 q6Var) {
        v3 v3Var = this.a;
        v3Var.a(i, 3);
        q6Var.a((q6) obj, (b8) v3Var.a);
        v3Var.a(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void b(int i, List<String> list) {
        int i2 = 0;
        if (!(list instanceof h5)) {
            while (i2 < list.size()) {
                this.a.a(i, list.get(i2));
                i2++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        while (i2 < list.size()) {
            Object b = h5Var.b(i2);
            if (b instanceof String) {
                this.a.a(i, (String) b);
            } else {
                this.a.a(i, (h3) b);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void b(int i, List<?> list, q6 q6Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), q6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void b(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.a(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.b(list.get(i4).booleanValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.a(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void c(int i, int i2) {
        this.a.b(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void c(int i, long j) {
        this.a.c(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.b(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.f(list.get(i4).longValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.b(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void d(int i, int i2) {
        this.a.b(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void d(int i, long j) {
        this.a.b(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void d(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.b(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.f(list.get(i4).intValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.a(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void e(int i, int i2) {
        this.a.e(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void e(int i, long j) {
        this.a.a(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.a(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.e(list.get(i4).longValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.a(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void f(int i, int i2) {
        this.a.c(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void f(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.b(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.k(list.get(i4).intValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.a(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.d(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.h(list.get(i4).intValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.c(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void h(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.a(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.d(list.get(i4).longValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.a(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void i(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.a(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.b(list.get(i4).doubleValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.a(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.c(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.h(list.get(i4).longValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.c(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.e(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.i(list.get(i4).intValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.d(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void l(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.a(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.b(list.get(i4).floatValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.a(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.c(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.g(list.get(i4).intValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.b(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final void n(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.e(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.a(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += v3.j(list.get(i4).intValue());
        }
        this.a.b(i3);
        while (i2 < list.size()) {
            this.a.d(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.b8
    public final int zza() {
        return o4.f.k;
    }
}
