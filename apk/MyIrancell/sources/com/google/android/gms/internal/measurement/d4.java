package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d4<T extends f4<T>> {
    private static final d4 d = new d4(true);
    final r6<T, Object> a;
    private boolean b;
    private boolean c;

    private d4() {
        this.a = r6.b(16);
    }

    private d4(r6<T, Object> r6Var) {
        this.a = r6Var;
        a();
    }

    private d4(boolean z) {
        this(r6.b(0));
        a();
    }

    public static int a(f4<?> f4Var, Object obj) {
        v7 zzb = f4Var.zzb();
        int zza = f4Var.zza();
        if (!f4Var.a()) {
            return a(zzb, zza, obj);
        }
        int i = 0;
        List list = (List) obj;
        if (f4Var.c()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += b(zzb, it.next());
            }
            return v3.e(zza) + i + v3.l(i);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i += a(zzb, zza, it2.next());
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(v7 v7Var, int i, Object obj) {
        int e = v3.e(i);
        if (v7Var == v7.zzj) {
            r4.a((x5) obj);
            e <<= 1;
        }
        return e + b(v7Var, obj);
    }

    private final Object a(T t) {
        Object obj = this.a.get(t);
        if (!(obj instanceof b5)) {
            return obj;
        }
        b5.c();
        throw null;
    }

    private static Object a(Object obj) {
        if (obj instanceof g6) {
            return ((g6) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(v3 v3Var, v7 v7Var, int i, Object obj) {
        if (v7Var == v7.zzj) {
            x5 x5Var = (x5) obj;
            r4.a(x5Var);
            v3Var.a(i, 3);
            x5Var.a(v3Var);
            v3Var.a(i, 4);
            return;
        }
        v3Var.a(i, v7Var.zzb());
        switch (g4.b[v7Var.ordinal()]) {
            case 1:
                v3Var.a(((Double) obj).doubleValue());
                return;
            case 2:
                v3Var.a(((Float) obj).floatValue());
                return;
            case 3:
                v3Var.a(((Long) obj).longValue());
                return;
            case 4:
                v3Var.a(((Long) obj).longValue());
                return;
            case 5:
                v3Var.a(((Integer) obj).intValue());
                return;
            case 6:
                v3Var.c(((Long) obj).longValue());
                return;
            case 7:
                v3Var.d(((Integer) obj).intValue());
                return;
            case 8:
                v3Var.a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((x5) obj).a(v3Var);
                return;
            case 10:
                v3Var.a((x5) obj);
                return;
            case 11:
                if (obj instanceof h3) {
                    v3Var.a((h3) obj);
                    return;
                } else {
                    v3Var.a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof h3) {
                    v3Var.a((h3) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    v3Var.b(bArr, 0, bArr.length);
                    return;
                }
            case 13:
                v3Var.b(((Integer) obj).intValue());
                return;
            case 14:
                v3Var.d(((Integer) obj).intValue());
                return;
            case 15:
                v3Var.c(((Long) obj).longValue());
                return;
            case 16:
                v3Var.c(((Integer) obj).intValue());
                return;
            case 17:
                v3Var.b(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof q4) {
                    v3Var.a(((q4) obj).zza());
                    return;
                } else {
                    v3Var.a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.b5) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.q4) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.google.android.gms.internal.measurement.v7 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.r4.a(r3)
            int[] r0 = com.google.android.gms.internal.measurement.g4.a
            com.google.android.gms.internal.measurement.c8 r2 = r2.zza()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L14;
            }
        L14:
            r0 = 0
            goto L42
        L16:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.x5
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.b5
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.q4
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.h3
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L14
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L4e
        L4d:
            throw r2
        L4e:
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d4.a(com.google.android.gms.internal.measurement.v7, java.lang.Object):void");
    }

    private static <T extends f4<T>> boolean a(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.b() == c8.MESSAGE) {
            boolean a = key.a();
            Object value = entry.getValue();
            if (a) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((x5) it.next()).a()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof x5)) {
                    if (value instanceof b5) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((x5) value).a()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int b(v7 v7Var, Object obj) {
        switch (g4.b[v7Var.ordinal()]) {
            case 1:
                return v3.b(((Double) obj).doubleValue());
            case 2:
                return v3.b(((Float) obj).floatValue());
            case 3:
                return v3.d(((Long) obj).longValue());
            case 4:
                return v3.e(((Long) obj).longValue());
            case 5:
                return v3.f(((Integer) obj).intValue());
            case 6:
                return v3.g(((Long) obj).longValue());
            case 7:
                return v3.i(((Integer) obj).intValue());
            case 8:
                return v3.b(((Boolean) obj).booleanValue());
            case 9:
                return v3.c((x5) obj);
            case 10:
                return obj instanceof b5 ? v3.a((b5) obj) : v3.b((x5) obj);
            case 11:
                return obj instanceof h3 ? v3.b((h3) obj) : v3.b((String) obj);
            case 12:
                return obj instanceof h3 ? v3.b((h3) obj) : v3.b((byte[]) obj);
            case 13:
                return v3.g(((Integer) obj).intValue());
            case 14:
                return v3.j(((Integer) obj).intValue());
            case 15:
                return v3.h(((Long) obj).longValue());
            case 16:
                return v3.h(((Integer) obj).intValue());
            case 17:
                return v3.f(((Long) obj).longValue());
            case 18:
                return obj instanceof q4 ? v3.k(((q4) obj).zza()) : v3.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void b(T t, Object obj) {
        if (!t.a()) {
            a(t.zzb(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                a(t.zzb(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof b5) {
            this.c = true;
        }
        this.a.a((r6<T, Object>) t, (T) obj);
    }

    private final void b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b5) {
            b5.c();
            throw null;
        }
        if (key.a()) {
            Object a = a((d4<T>) key);
            if (a == null) {
                a = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) a).add(a(it.next()));
            }
            this.a.a((r6<T, Object>) key, (T) a);
            return;
        }
        if (key.b() != c8.MESSAGE) {
            this.a.a((r6<T, Object>) key, (T) a(value));
            return;
        }
        Object a2 = a((d4<T>) key);
        if (a2 == null) {
            this.a.a((r6<T, Object>) key, (T) a(value));
        } else {
            this.a.a((r6<T, Object>) key, (T) (a2 instanceof g6 ? key.a((g6) a2, (g6) value) : key.a(((x5) a2).g(), (x5) value).i()));
        }
    }

    private static int c(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.b() != c8.MESSAGE || key.a() || key.c()) {
            return a((f4<?>) key, value);
        }
        boolean z = value instanceof b5;
        int zza = entry.getKey().zza();
        return z ? v3.b(zza, (b5) value) : v3.b(zza, (x5) value);
    }

    public static <T extends f4<T>> d4<T> g() {
        return d;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.a.a();
        this.b = true;
    }

    public final void a(d4<T> d4Var) {
        for (int i = 0; i < d4Var.a.c(); i++) {
            b(d4Var.a.a(i));
        }
        Iterator<Map.Entry<T, Object>> it = d4Var.a.d().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final boolean b() {
        return this.b;
    }

    public final Iterator<Map.Entry<T, Object>> c() {
        return this.c ? new c5(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() {
        d4 d4Var = new d4();
        for (int i = 0; i < this.a.c(); i++) {
            Map.Entry<T, Object> a = this.a.a(i);
            d4Var.b((d4) a.getKey(), a.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.d()) {
            d4Var.b((d4) entry.getKey(), entry.getValue());
        }
        d4Var.c = this.c;
        return d4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> d() {
        return this.c ? new c5(this.a.e().iterator()) : this.a.e().iterator();
    }

    public final boolean e() {
        for (int i = 0; i < this.a.c(); i++) {
            if (!a((Map.Entry) this.a.a(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.a.d().iterator();
        while (it.hasNext()) {
            if (!a((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d4) {
            return this.a.equals(((d4) obj).a);
        }
        return false;
    }

    public final int f() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.c(); i2++) {
            i += c(this.a.a(i2));
        }
        Iterator<Map.Entry<T, Object>> it = this.a.d().iterator();
        while (it.hasNext()) {
            i += c(it.next());
        }
        return i;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
