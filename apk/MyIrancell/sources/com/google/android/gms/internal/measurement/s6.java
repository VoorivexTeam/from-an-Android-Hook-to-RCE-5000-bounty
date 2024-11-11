package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s6 {
    private static final Class<?> a = d();
    private static final i7<?, ?> b = a(false);
    private static final i7<?, ?> c = a(true);
    private static final i7<?, ?> d = new k7();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, Object obj, q6 q6Var) {
        return obj instanceof f5 ? v3.a(i, (f5) obj) : v3.b(i, (x5) obj, q6Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e = v3.e(i) * size;
        if (list instanceof h5) {
            h5 h5Var = (h5) list;
            while (i2 < size) {
                Object b2 = h5Var.b(i2);
                e += b2 instanceof h3 ? v3.b((h3) b2) : v3.b((String) b2);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof h3 ? v3.b((h3) obj) : v3.b((String) obj);
                i2++;
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list, q6 q6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = v3.e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof f5 ? v3.a((f5) obj) : v3.a((x5) obj, q6Var);
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * v3.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l5) {
            l5 l5Var = (l5) list;
            i = 0;
            while (i2 < size) {
                i += v3.d(l5Var.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v3.d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static i7<?, ?> a() {
        return b;
    }

    private static i7<?, ?> a(boolean z) {
        try {
            Class<?> e = e();
            if (e == null) {
                return null;
            }
            return (i7) e.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB a(int i, int i2, UB ub, i7<UT, UB> i7Var) {
        if (ub == null) {
            ub = i7Var.a();
        }
        i7Var.a((i7<UT, UB>) ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB a(int i, List<Integer> list, s4 s4Var, UB ub, i7<UT, UB> i7Var) {
        if (s4Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (s4Var.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) a(i, intValue, ub, i7Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!s4Var.a(intValue2)) {
                    ub = (UB) a(i, intValue2, ub, i7Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void a(int i, List<String> list, b8 b8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.b(i, list);
    }

    public static void a(int i, List<?> list, b8 b8Var, q6 q6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.b(i, list, q6Var);
    }

    public static void a(int i, List<Double> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.i(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends f4<FT>> void a(c4<FT> c4Var, T t, T t2) {
        d4<FT> a2 = c4Var.a(t2);
        if (a2.a.isEmpty()) {
            return;
        }
        c4Var.b(t).a(a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void a(i7<UT, UB> i7Var, T t, T t2) {
        i7Var.a(t, i7Var.c(i7Var.a(t), i7Var.a(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void a(u5 u5Var, T t, T t2, long j) {
        o7.a(t, j, u5Var.a(o7.f(t, j), o7.f(t2, j)));
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (!o4.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<h3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * v3.e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += v3.b(list.get(i2));
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<x5> list, q6 q6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += v3.c(i, list.get(i3), q6Var);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * v3.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l5) {
            l5 l5Var = (l5) list;
            i = 0;
            while (i2 < size) {
                i += v3.e(l5Var.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v3.e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static i7<?, ?> b() {
        return c;
    }

    public static void b(int i, List<h3> list, b8 b8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.a(i, list);
    }

    public static void b(int i, List<?> list, b8 b8Var, q6 q6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.a(i, list, q6Var);
    }

    public static void b(int i, List<Float> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.l(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * v3.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l5) {
            l5 l5Var = (l5) list;
            i = 0;
            while (i2 < size) {
                i += v3.f(l5Var.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v3.f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static i7<?, ?> c() {
        return d;
    }

    public static void c(int i, List<Long> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.h(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * v3.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p4) {
            p4 p4Var = (p4) list;
            i = 0;
            while (i2 < size) {
                i += v3.k(p4Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v3.k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(int i, List<Long> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.e(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * v3.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p4) {
            p4 p4Var = (p4) list;
            i = 0;
            while (i2 < size) {
                i += v3.f(p4Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v3.f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(int i, List<Long> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.c(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * v3.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p4) {
            p4 p4Var = (p4) list;
            i = 0;
            while (i2 < size) {
                i += v3.g(p4Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v3.g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void f(int i, List<Long> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.a(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * v3.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p4) {
            p4 p4Var = (p4) list;
            i = 0;
            while (i2 < size) {
                i += v3.h(p4Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += v3.h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void g(int i, List<Long> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.j(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * v3.i(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(List<?> list) {
        return list.size() << 2;
    }

    public static void h(int i, List<Integer> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.d(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * v3.g(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() << 3;
    }

    public static void i(int i, List<Integer> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.m(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * v3.b(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(List<?> list) {
        return list.size();
    }

    public static void j(int i, List<Integer> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.g(i, list, z);
    }

    public static void k(int i, List<Integer> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.k(i, list, z);
    }

    public static void l(int i, List<Integer> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.n(i, list, z);
    }

    public static void m(int i, List<Integer> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.f(i, list, z);
    }

    public static void n(int i, List<Boolean> list, b8 b8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b8Var.b(i, list, z);
    }
}
