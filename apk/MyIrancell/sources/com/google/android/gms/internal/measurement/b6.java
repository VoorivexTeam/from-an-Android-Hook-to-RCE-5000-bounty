package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b6<T> implements q6<T> {
    private static final int[] q = new int[0];
    private static final Unsafe r = o7.c();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final x5 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int[] i;
    private final int j;
    private final int k;
    private final f6 l;
    private final g5 m;
    private final i7<?, ?> n;
    private final c4<?> o;
    private final u5 p;

    private b6(int[] iArr, Object[] objArr, int i, int i2, x5 x5Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, f6 f6Var, g5 g5Var, i7<?, ?> i7Var, c4<?> c4Var, u5 u5Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        boolean z3 = x5Var instanceof o4;
        this.g = z;
        this.f = c4Var != null && c4Var.a(x5Var);
        this.h = false;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = f6Var;
        this.m = g5Var;
        this.n = i7Var;
        this.o = c4Var;
        this.e = x5Var;
        this.p = u5Var;
    }

    private final int a(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return b(i, i2);
    }

    private static <UT, UB> int a(i7<UT, UB> i7Var, T t) {
        return i7Var.d(i7Var.a(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private final int a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, c3 c3Var) {
        Object valueOf;
        Object valueOf2;
        int b;
        long j2;
        int i9;
        Object valueOf3;
        Unsafe unsafe = r;
        long j3 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    valueOf = Double.valueOf(d3.c(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    b = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(d3.d(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    b = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    b = d3.b(bArr, i, c3Var);
                    j2 = c3Var.b;
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    b = d3.a(bArr, i, c3Var);
                    i9 = c3Var.a;
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    valueOf = Long.valueOf(d3.b(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    b = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    valueOf2 = Integer.valueOf(d3.a(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    b = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    b = d3.b(bArr, i, c3Var);
                    valueOf3 = Boolean.valueOf(c3Var.b != 0);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    b = d3.a(bArr, i, c3Var);
                    int i10 = c3Var.a;
                    if (i10 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t, j, valueOf3);
                        unsafe.putInt(t, j3, i4);
                        return b;
                    }
                    if ((i6 & 536870912) != 0 && !q7.a(bArr, b, b + i10)) {
                        throw w4.f();
                    }
                    unsafe.putObject(t, j, new String(bArr, b, i10, r4.a));
                    b += i10;
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    b = d3.a(a(i8), bArr, i, i2, c3Var);
                    Object object = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = c3Var.c;
                    if (object != null) {
                        valueOf3 = r4.a(object, valueOf3);
                    }
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    b = d3.e(bArr, i, c3Var);
                    valueOf3 = c3Var.c;
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int a = d3.a(bArr, i, c3Var);
                    int i11 = c3Var.a;
                    s4 c = c(i8);
                    if (c != null && !c.a(i11)) {
                        e(t).a(i3, Long.valueOf(i11));
                        return a;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i11));
                    b = a;
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    b = d3.a(bArr, i, c3Var);
                    i9 = t3.a(c3Var.a);
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    b = d3.b(bArr, i, c3Var);
                    j2 = t3.a(c3Var.b);
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    b = d3.a(a(i8), bArr, i, i2, (i3 & (-8)) | 4, c3Var);
                    Object object2 = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = c3Var.c;
                    if (object2 != null) {
                        valueOf3 = r4.a(object2, valueOf3);
                    }
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0150, code lost:
    
        r11.add(com.google.android.gms.internal.measurement.h3.a(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x026e, code lost:
    
        if (r30.b != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0270, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0273, code lost:
    
        r11.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0276, code lost:
    
        if (r4 >= r20) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0278, code lost:
    
        r6 = com.google.android.gms.internal.measurement.d3.a(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x027e, code lost:
    
        if (r21 != r30.a) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0280, code lost:
    
        r4 = com.google.android.gms.internal.measurement.d3.b(r18, r6, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0288, code lost:
    
        if (r30.b == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0272, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0273, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0140, code lost:
    
        if (r4 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0142, code lost:
    
        r11.add(com.google.android.gms.internal.measurement.h3.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0150, code lost:
    
        if (r1 >= r20) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0152, code lost:
    
        r4 = com.google.android.gms.internal.measurement.d3.a(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0158, code lost:
    
        if (r21 != r30.a) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015a, code lost:
    
        r1 = com.google.android.gms.internal.measurement.d3.a(r18, r4, r30);
        r4 = r30.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0160, code lost:
    
        if (r4 < 0) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0164, code lost:
    
        if (r4 > (r18.length - r1)) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0166, code lost:
    
        if (r4 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
    
        r11.add(com.google.android.gms.internal.measurement.h3.a(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016d, code lost:
    
        throw com.google.android.gms.internal.measurement.w4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0172, code lost:
    
        throw com.google.android.gms.internal.measurement.w4.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x003a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0203  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0213 -> B:106:0x01ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0288 -> B:143:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0166 -> B:63:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01cf -> B:89:0x01ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.c3 r30) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.c3):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i, int i2, int i3, long j, c3 c3Var) {
        Unsafe unsafe = r;
        Object b = b(i3);
        Object object = unsafe.getObject(t, j);
        if (this.p.b(object)) {
            Object e = this.p.e(b);
            this.p.a(e, object);
            unsafe.putObject(t, j, e);
            object = e;
        }
        s5<?, ?> d = this.p.d(b);
        Map<?, ?> a = this.p.a(object);
        int a2 = d3.a(bArr, i, c3Var);
        int i4 = c3Var.a;
        if (i4 < 0 || i4 > i2 - a2) {
            throw w4.a();
        }
        int i5 = i4 + a2;
        K k = d.b;
        V v = d.d;
        while (a2 < i5) {
            int i6 = a2 + 1;
            int i7 = bArr[a2];
            if (i7 < 0) {
                i6 = d3.a(i7, bArr, i6, c3Var);
                i7 = c3Var.a;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 != 1) {
                if (i9 == 2 && i10 == d.c.zzb()) {
                    a2 = a(bArr, i8, i2, d.c, d.d.getClass(), c3Var);
                    v = c3Var.c;
                }
                a2 = d3.a(i7, bArr, i8, i2, c3Var);
            } else if (i10 == d.a.zzb()) {
                a2 = a(bArr, i8, i2, d.a, (Class<?>) null, c3Var);
                k = (K) c3Var.c;
            } else {
                a2 = d3.a(i7, bArr, i8, i2, c3Var);
            }
        }
        if (a2 != i5) {
            throw w4.e();
        }
        a.put(k, v);
        return i5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private static int a(byte[] bArr, int i, int i2, v7 v7Var, Class<?> cls, c3 c3Var) {
        int b;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int i3;
        long j;
        switch (e6.a[v7Var.ordinal()]) {
            case 1:
                b = d3.b(bArr, i, c3Var);
                valueOf = Boolean.valueOf(c3Var.b != 0);
                c3Var.c = valueOf;
                return b;
            case 2:
                return d3.e(bArr, i, c3Var);
            case 3:
                valueOf2 = Double.valueOf(d3.c(bArr, i));
                c3Var.c = valueOf2;
                return i + 8;
            case 4:
            case 5:
                valueOf3 = Integer.valueOf(d3.a(bArr, i));
                c3Var.c = valueOf3;
                return i + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(d3.b(bArr, i));
                c3Var.c = valueOf2;
                return i + 8;
            case 8:
                valueOf3 = Float.valueOf(d3.d(bArr, i));
                c3Var.c = valueOf3;
                return i + 4;
            case 9:
            case 10:
            case 11:
                b = d3.a(bArr, i, c3Var);
                i3 = c3Var.a;
                valueOf = Integer.valueOf(i3);
                c3Var.c = valueOf;
                return b;
            case 12:
            case 13:
                b = d3.b(bArr, i, c3Var);
                j = c3Var.b;
                valueOf = Long.valueOf(j);
                c3Var.c = valueOf;
                return b;
            case 14:
                return d3.a(n6.a().a((Class) cls), bArr, i, i2, c3Var);
            case 15:
                b = d3.a(bArr, i, c3Var);
                i3 = t3.a(c3Var.a);
                valueOf = Integer.valueOf(i3);
                c3Var.c = valueOf;
                return b;
            case 16:
                b = d3.b(bArr, i, c3Var);
                j = t3.a(c3Var.b);
                valueOf = Long.valueOf(j);
                c3Var.c = valueOf;
                return b;
            case 17:
                return d3.d(bArr, i, c3Var);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> b6<T> a(Class<T> cls, v5 v5Var, f6 f6Var, g5 g5Var, i7<?, ?> i7Var, c4<?> c4Var, u5 u5Var) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        boolean z;
        int i17;
        o6 o6Var;
        int i18;
        int objectFieldOffset;
        int i19;
        int i20;
        Class<?> cls2;
        String str;
        int i21;
        int i22;
        Field a;
        int i23;
        char charAt11;
        int i24;
        Field a2;
        Field a3;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        char charAt16;
        if (!(v5Var instanceof o6)) {
            ((b7) v5Var).zza();
            throw null;
        }
        o6 o6Var2 = (o6) v5Var;
        int i29 = 0;
        boolean z2 = o6Var2.zza() == o4.f.j;
        String a4 = o6Var2.a();
        int length = a4.length();
        int charAt17 = a4.charAt(0);
        if (charAt17 >= 55296) {
            int i30 = charAt17 & 8191;
            int i31 = 1;
            int i32 = 13;
            while (true) {
                i = i31 + 1;
                charAt16 = a4.charAt(i31);
                if (charAt16 < 55296) {
                    break;
                }
                i30 |= (charAt16 & 8191) << i32;
                i32 += 13;
                i31 = i;
            }
            charAt17 = i30 | (charAt16 << i32);
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt18 = a4.charAt(i);
        if (charAt18 >= 55296) {
            int i34 = charAt18 & 8191;
            int i35 = 13;
            while (true) {
                i28 = i33 + 1;
                charAt15 = a4.charAt(i33);
                if (charAt15 < 55296) {
                    break;
                }
                i34 |= (charAt15 & 8191) << i35;
                i35 += 13;
                i33 = i28;
            }
            charAt18 = i34 | (charAt15 << i35);
            i33 = i28;
        }
        if (charAt18 == 0) {
            iArr = q;
            i6 = 0;
            i3 = 0;
            charAt = 0;
            i4 = 0;
            charAt2 = 0;
            i5 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt19 = a4.charAt(i33);
            if (charAt19 >= 55296) {
                int i37 = charAt19 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    charAt10 = a4.charAt(i36);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i37 |= (charAt10 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                charAt19 = i37 | (charAt10 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int charAt20 = a4.charAt(i36);
            if (charAt20 >= 55296) {
                int i40 = charAt20 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    charAt9 = a4.charAt(i39);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i40 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                charAt20 = i40 | (charAt9 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            charAt = a4.charAt(i39);
            if (charAt >= 55296) {
                int i43 = charAt & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    charAt8 = a4.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                charAt = i43 | (charAt8 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int charAt21 = a4.charAt(i42);
            if (charAt21 >= 55296) {
                int i46 = charAt21 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    charAt7 = a4.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                charAt21 = i46 | (charAt7 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            charAt2 = a4.charAt(i45);
            if (charAt2 >= 55296) {
                int i49 = charAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    charAt6 = a4.charAt(i48);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i49 |= (charAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                charAt2 = i49 | (charAt6 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            int charAt22 = a4.charAt(i48);
            if (charAt22 >= 55296) {
                int i52 = charAt22 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    charAt5 = a4.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                charAt22 = i52 | (charAt5 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int charAt23 = a4.charAt(i51);
            if (charAt23 >= 55296) {
                int i55 = charAt23 & 8191;
                int i56 = i54;
                int i57 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt4 = a4.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i56 = i8;
                }
                charAt23 = i55 | (charAt4 << i57);
                i2 = i8;
            } else {
                i2 = i54;
            }
            int i58 = i2 + 1;
            int charAt24 = a4.charAt(i2);
            if (charAt24 >= 55296) {
                int i59 = charAt24 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i7 = i60 + 1;
                    charAt3 = a4.charAt(i60);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i59 |= (charAt3 & 8191) << i61;
                    i61 += 13;
                    i60 = i7;
                }
                charAt24 = i59 | (charAt3 << i61);
                i58 = i7;
            }
            int[] iArr2 = new int[charAt24 + charAt22 + charAt23];
            int i62 = (charAt19 << 1) + charAt20;
            i3 = charAt21;
            i4 = i62;
            i5 = charAt24;
            i29 = charAt19;
            i33 = i58;
            int i63 = charAt22;
            iArr = iArr2;
            i6 = i63;
        }
        Unsafe unsafe = r;
        Object[] c = o6Var2.c();
        Class<?> cls3 = o6Var2.b().getClass();
        int i64 = i33;
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr = new Object[charAt2 << 1];
        int i65 = i5 + i6;
        int i66 = i5;
        int i67 = i64;
        int i68 = i65;
        int i69 = 0;
        int i70 = 0;
        while (i67 < length) {
            int i71 = i67 + 1;
            int charAt25 = a4.charAt(i67);
            int i72 = length;
            if (charAt25 >= 55296) {
                int i73 = charAt25 & 8191;
                int i74 = i71;
                int i75 = 13;
                while (true) {
                    i27 = i74 + 1;
                    charAt14 = a4.charAt(i74);
                    i15 = i5;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i73 |= (charAt14 & 8191) << i75;
                    i75 += 13;
                    i74 = i27;
                    i5 = i15;
                }
                charAt25 = i73 | (charAt14 << i75);
                i16 = i27;
            } else {
                i15 = i5;
                i16 = i71;
            }
            int i76 = i16 + 1;
            int charAt26 = a4.charAt(i16);
            if (charAt26 >= 55296) {
                int i77 = charAt26 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i26 = i78 + 1;
                    charAt13 = a4.charAt(i78);
                    z = z2;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i77 |= (charAt13 & 8191) << i79;
                    i79 += 13;
                    i78 = i26;
                    z2 = z;
                }
                charAt26 = i77 | (charAt13 << i79);
                i17 = i26;
            } else {
                z = z2;
                i17 = i76;
            }
            int i80 = charAt26 & 255;
            int i81 = i3;
            if ((charAt26 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int i82 = charAt;
            if (i80 >= 51) {
                int i83 = i17 + 1;
                int charAt27 = a4.charAt(i17);
                char c2 = 55296;
                if (charAt27 >= 55296) {
                    int i84 = charAt27 & 8191;
                    int i85 = 13;
                    while (true) {
                        i25 = i83 + 1;
                        charAt12 = a4.charAt(i83);
                        if (charAt12 < c2) {
                            break;
                        }
                        i84 |= (charAt12 & 8191) << i85;
                        i85 += 13;
                        i83 = i25;
                        c2 = 55296;
                    }
                    charAt27 = i84 | (charAt12 << i85);
                    i83 = i25;
                }
                int i86 = i80 - 51;
                int i87 = i83;
                if (i86 == 9 || i86 == 17) {
                    objArr[((i70 / 3) << 1) + 1] = c[i4];
                    i4++;
                } else if (i86 == 12 && (charAt17 & 1) == 1) {
                    objArr[((i70 / 3) << 1) + 1] = c[i4];
                    i4++;
                }
                int i88 = charAt27 << 1;
                Object obj = c[i88];
                if (obj instanceof Field) {
                    a2 = (Field) obj;
                } else {
                    a2 = a(cls3, (String) obj);
                    c[i88] = a2;
                }
                o6Var = o6Var2;
                String str2 = a4;
                objectFieldOffset = (int) unsafe.objectFieldOffset(a2);
                int i89 = i88 + 1;
                Object obj2 = c[i89];
                if (obj2 instanceof Field) {
                    a3 = (Field) obj2;
                } else {
                    a3 = a(cls3, (String) obj2);
                    c[i89] = a3;
                }
                cls2 = cls3;
                i19 = i4;
                i17 = i87;
                str = str2;
                i22 = 0;
                i21 = (int) unsafe.objectFieldOffset(a3);
                i20 = i29;
            } else {
                o6Var = o6Var2;
                String str3 = a4;
                int i90 = i4 + 1;
                Field a5 = a(cls3, (String) c[i4]);
                if (i80 == 9 || i80 == 17) {
                    i18 = 1;
                    objArr[((i70 / 3) << 1) + 1] = a5.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        i18 = 1;
                        i24 = i90 + 1;
                        objArr[((i70 / 3) << 1) + 1] = c[i90];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        i18 = 1;
                        if ((charAt17 & 1) == 1) {
                            i24 = i90 + 1;
                            objArr[((i70 / 3) << 1) + 1] = c[i90];
                        }
                    } else {
                        if (i80 == 50) {
                            int i91 = i66 + 1;
                            iArr[i66] = i70;
                            int i92 = (i70 / 3) << 1;
                            int i93 = i90 + 1;
                            objArr[i92] = c[i90];
                            if ((charAt26 & 2048) != 0) {
                                i90 = i93 + 1;
                                objArr[i92 + 1] = c[i93];
                                i66 = i91;
                            } else {
                                i90 = i93;
                                i18 = 1;
                                i66 = i91;
                            }
                        }
                        i18 = 1;
                    }
                    i90 = i24;
                }
                objectFieldOffset = (int) unsafe.objectFieldOffset(a5);
                if ((charAt17 & 1) != i18 || i80 > 17) {
                    i19 = i90;
                    i20 = i29;
                    cls2 = cls3;
                    str = str3;
                    i21 = 0;
                    i22 = 0;
                } else {
                    int i94 = i17 + 1;
                    str = str3;
                    int charAt28 = str.charAt(i17);
                    if (charAt28 >= 55296) {
                        int i95 = charAt28 & 8191;
                        int i96 = 13;
                        while (true) {
                            i23 = i94 + 1;
                            charAt11 = str.charAt(i94);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i95 |= (charAt11 & 8191) << i96;
                            i96 += 13;
                            i94 = i23;
                        }
                        charAt28 = i95 | (charAt11 << i96);
                        i94 = i23;
                    }
                    int i97 = (i29 << 1) + (charAt28 / 32);
                    Object obj3 = c[i97];
                    i19 = i90;
                    if (obj3 instanceof Field) {
                        a = (Field) obj3;
                    } else {
                        a = a(cls3, (String) obj3);
                        c[i97] = a;
                    }
                    i20 = i29;
                    cls2 = cls3;
                    i21 = (int) unsafe.objectFieldOffset(a);
                    i22 = charAt28 % 32;
                    i17 = i94;
                }
                if (i80 >= 18 && i80 <= 49) {
                    iArr[i68] = objectFieldOffset;
                    i68++;
                }
            }
            int i98 = i70 + 1;
            iArr3[i70] = charAt25;
            int i99 = i98 + 1;
            iArr3[i98] = objectFieldOffset | ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? 536870912 : 0) | (i80 << 20);
            i70 = i99 + 1;
            iArr3[i99] = (i22 << 20) | i21;
            i29 = i20;
            a4 = str;
            i67 = i17;
            cls3 = cls2;
            i3 = i81;
            length = i72;
            i5 = i15;
            z2 = z;
            charAt = i82;
            i4 = i19;
            o6Var2 = o6Var;
        }
        return new b6<>(iArr3, objArr, charAt, i3, o6Var2.b(), z2, false, iArr, i5, i65, f6Var, g5Var, i7Var, c4Var, u5Var);
    }

    private final q6 a(int i) {
        int i2 = (i / 3) << 1;
        q6 q6Var = (q6) this.b[i2];
        if (q6Var != null) {
            return q6Var;
        }
        q6<T> a = n6.a().a((Class) this.b[i2 + 1]);
        this.b[i2] = a;
        return a;
    }

    private final <K, V, UT, UB> UB a(int i, int i2, Map<K, V> map, s4 s4Var, UB ub, i7<UT, UB> i7Var) {
        s5<?, ?> d = this.p.d(b(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!s4Var.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = i7Var.a();
                }
                p3 c = h3.c(p5.a(d, next.getKey(), next.getValue()));
                try {
                    p5.a(c.b(), d, next.getKey(), next.getValue());
                    i7Var.a((i7<UT, UB>) ub, i2, c.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB a(Object obj, int i, UB ub, i7<UT, UB> i7Var) {
        s4 c;
        int i2 = this.a[i];
        Object f = o7.f(obj, d(i) & 1048575);
        return (f == null || (c = c(i)) == null) ? ub : (UB) a(i, i2, this.p.a(f), c, (s4) ub, (i7<UT, s4>) i7Var);
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List<?> a(Object obj, long j) {
        return (List) o7.f(obj, j);
    }

    private static void a(int i, Object obj, b8 b8Var) {
        if (obj instanceof String) {
            b8Var.a(i, (String) obj);
        } else {
            b8Var.a(i, (h3) obj);
        }
    }

    private final <K, V> void a(b8 b8Var, int i, Object obj, int i2) {
        if (obj != null) {
            b8Var.a(i, this.p.d(b(i2)), this.p.c(obj));
        }
    }

    private static <UT, UB> void a(i7<UT, UB> i7Var, T t, b8 b8Var) {
        i7Var.a((i7<UT, UB>) i7Var.a(t), b8Var);
    }

    private final void a(T t, T t2, int i) {
        long d = d(i) & 1048575;
        if (a((b6<T>) t2, i)) {
            Object f = o7.f(t, d);
            Object f2 = o7.f(t2, d);
            if (f != null && f2 != null) {
                o7.a(t, d, r4.a(f, f2));
                b((b6<T>) t, i);
            } else if (f2 != null) {
                o7.a(t, d, f2);
                b((b6<T>) t, i);
            }
        }
    }

    private final boolean a(T t, int i) {
        if (!this.g) {
            int e = e(i);
            return (o7.a(t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
        int d = d(i);
        long j = d & 1048575;
        switch ((d & 267386880) >>> 20) {
            case 0:
                return o7.e(t, j) != 0.0d;
            case 1:
                return o7.d(t, j) != 0.0f;
            case 2:
                return o7.b(t, j) != 0;
            case 3:
                return o7.b(t, j) != 0;
            case 4:
                return o7.a(t, j) != 0;
            case 5:
                return o7.b(t, j) != 0;
            case 6:
                return o7.a(t, j) != 0;
            case 7:
                return o7.c(t, j);
            case 8:
                Object f = o7.f(t, j);
                if (f instanceof String) {
                    return !((String) f).isEmpty();
                }
                if (f instanceof h3) {
                    return !h3.c.equals(f);
                }
                throw new IllegalArgumentException();
            case 9:
                return o7.f(t, j) != null;
            case 10:
                return !h3.c.equals(o7.f(t, j));
            case 11:
                return o7.a(t, j) != 0;
            case 12:
                return o7.a(t, j) != 0;
            case 13:
                return o7.a(t, j) != 0;
            case 14:
                return o7.b(t, j) != 0;
            case 15:
                return o7.a(t, j) != 0;
            case 16:
                return o7.b(t, j) != 0;
            case 17:
                return o7.f(t, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean a(T t, int i, int i2) {
        return o7.a(t, (long) (e(i2) & 1048575)) == i;
    }

    private final boolean a(T t, int i, int i2, int i3) {
        return this.g ? a((b6<T>) t, i) : (i2 & i3) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(Object obj, int i, q6 q6Var) {
        return q6Var.b(o7.f(obj, i & 1048575));
    }

    private static <T> double b(T t, long j) {
        return ((Double) o7.f(t, j)).doubleValue();
    }

    private final int b(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final Object b(int i) {
        return this.b[(i / 3) << 1];
    }

    private final void b(T t, int i) {
        if (this.g) {
            return;
        }
        int e = e(i);
        long j = e & 1048575;
        o7.a((Object) t, j, o7.a(t, j) | (1 << (e >>> 20)));
    }

    private final void b(T t, int i, int i2) {
        o7.a((Object) t, e(i2) & 1048575, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(T r19, com.google.android.gms.internal.measurement.b8 r20) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.b(java.lang.Object, com.google.android.gms.internal.measurement.b8):void");
    }

    private final void b(T t, T t2, int i) {
        int d = d(i);
        int i2 = this.a[i];
        long j = d & 1048575;
        if (a((b6<T>) t2, i2, i)) {
            Object f = o7.f(t, j);
            Object f2 = o7.f(t2, j);
            if (f != null && f2 != null) {
                o7.a(t, j, r4.a(f, f2));
                b((b6<T>) t, i2, i);
            } else if (f2 != null) {
                o7.a(t, j, f2);
                b((b6<T>) t, i2, i);
            }
        }
    }

    private static <T> float c(T t, long j) {
        return ((Float) o7.f(t, j)).floatValue();
    }

    private final s4 c(int i) {
        return (s4) this.b[((i / 3) << 1) + 1];
    }

    private final boolean c(T t, T t2, int i) {
        return a((b6<T>) t, i) == a((b6<T>) t2, i);
    }

    private final int d(int i) {
        return this.a[i + 1];
    }

    private static <T> int d(T t, long j) {
        return ((Integer) o7.f(t, j)).intValue();
    }

    private final int e(int i) {
        return this.a[i + 2];
    }

    private static <T> long e(T t, long j) {
        return ((Long) o7.f(t, j)).longValue();
    }

    private static h7 e(Object obj) {
        o4 o4Var = (o4) obj;
        h7 h7Var = o4Var.zzb;
        if (h7Var != h7.d()) {
            return h7Var;
        }
        h7 e = h7.e();
        o4Var.zzb = e;
        return e;
    }

    private final int f(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return b(i, 0);
    }

    private static <T> boolean f(T t, long j) {
        return ((Boolean) o7.f(t, j)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ce, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e6, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e2, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e0, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(T r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.a(java.lang.Object):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0472, code lost:
    
        if (r7 == r1) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0474, code lost:
    
        r26.putInt(r13, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x047a, code lost:
    
        r1 = null;
        r2 = r10.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x047f, code lost:
    
        if (r2 >= r10.k) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0481, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.h7) r10.a(r13, r10.i[r2], (int) r1, (com.google.android.gms.internal.measurement.i7<UT, int>) r10.n);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0490, code lost:
    
        if (r1 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0492, code lost:
    
        r10.n.b(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0499, code lost:
    
        if (r8 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x049b, code lost:
    
        if (r0 != r33) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04a2, code lost:
    
        throw com.google.android.gms.internal.measurement.w4.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04a7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04a3, code lost:
    
        if (r0 > r33) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x04a5, code lost:
    
        if (r3 != r8) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x04ad, code lost:
    
        throw com.google.android.gms.internal.measurement.w4.e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:108:0x007f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.c3 r35) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.c3):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0048. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:276:0x04a1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0464 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08c3  */
    @Override // com.google.android.gms.internal.measurement.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r13, com.google.android.gms.internal.measurement.b8 r14) {
        /*
            Method dump skipped, instructions count: 2538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.a(java.lang.Object, com.google.android.gms.internal.measurement.b8):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f5, code lost:
    
        if (r0 == r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0212, code lost:
    
        if (r0 == r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r6 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        r0 = com.google.android.gms.internal.measurement.d3.a(r12, r8, r11);
        r1 = r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0107, code lost:
    
        if (r6 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c8, code lost:
    
        if (r0 == r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0214, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0061. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.measurement.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.measurement.c3 r32) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.c3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (com.google.android.gms.internal.measurement.s6.a(com.google.android.gms.internal.measurement.o7.f(r10, r6), com.google.android.gms.internal.measurement.o7.f(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.b(r10, r6) == com.google.android.gms.internal.measurement.o7.b(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.a(r10, r6) == com.google.android.gms.internal.measurement.o7.a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.b(r10, r6) == com.google.android.gms.internal.measurement.o7.b(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.a(r10, r6) == com.google.android.gms.internal.measurement.o7.a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.a(r10, r6) == com.google.android.gms.internal.measurement.o7.a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.a(r10, r6) == com.google.android.gms.internal.measurement.o7.a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (com.google.android.gms.internal.measurement.s6.a(com.google.android.gms.internal.measurement.o7.f(r10, r6), com.google.android.gms.internal.measurement.o7.f(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (com.google.android.gms.internal.measurement.s6.a(com.google.android.gms.internal.measurement.o7.f(r10, r6), com.google.android.gms.internal.measurement.o7.f(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (com.google.android.gms.internal.measurement.s6.a(com.google.android.gms.internal.measurement.o7.f(r10, r6), com.google.android.gms.internal.measurement.o7.f(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.c(r10, r6) == com.google.android.gms.internal.measurement.o7.c(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.a(r10, r6) == com.google.android.gms.internal.measurement.o7.a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.b(r10, r6) == com.google.android.gms.internal.measurement.o7.b(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.a(r10, r6) == com.google.android.gms.internal.measurement.o7.a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.b(r10, r6) == com.google.android.gms.internal.measurement.o7.b(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        if (com.google.android.gms.internal.measurement.o7.b(r10, r6) == com.google.android.gms.internal.measurement.o7.b(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.o7.d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.o7.d(r11, r6))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.o7.e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.o7.e(r11, r6))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.s6.a(com.google.android.gms.internal.measurement.o7.f(r10, r6), com.google.android.gms.internal.measurement.o7.f(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6 A[LOOP:0: B:2:0x0005->B:85:0x01b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.q6
    public final void b(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.a.length; i += 3) {
            int d = d(i);
            long j = 1048575 & d;
            int i2 = this.a[i];
            switch ((d & 267386880) >>> 20) {
                case 0:
                    if (a((b6<T>) t2, i)) {
                        o7.a(t, j, o7.e(t2, j));
                        b((b6<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (a((b6<T>) t2, i)) {
                        o7.a((Object) t, j, o7.d(t2, j));
                        b((b6<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.b(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 3:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.b(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 4:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.a(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 5:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.b(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 6:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.a(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 7:
                    if (a((b6<T>) t2, i)) {
                        o7.a(t, j, o7.c(t2, j));
                        b((b6<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a(t, j, o7.f(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 9:
                case 17:
                    a(t, t2, i);
                    break;
                case 10:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a(t, j, o7.f(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 11:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.a(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 12:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.a(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 13:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.a(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 14:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.b(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 15:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.a(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 16:
                    if (!a((b6<T>) t2, i)) {
                        break;
                    }
                    o7.a((Object) t, j, o7.b(t2, j));
                    b((b6<T>) t, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.m.a(t, t2, j);
                    break;
                case 50:
                    s6.a(this.p, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!a((b6<T>) t2, i2, i)) {
                        break;
                    }
                    o7.a(t, j, o7.f(t2, j));
                    b((b6<T>) t, i2, i);
                    break;
                case 60:
                case 68:
                    b(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!a((b6<T>) t2, i2, i)) {
                        break;
                    }
                    o7.a(t, j, o7.f(t2, j));
                    b((b6<T>) t, i2, i);
                    break;
            }
        }
        s6.a(this.n, t, t2);
        if (this.f) {
            s6.a(this.o, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.measurement.q6] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.measurement.q6] */
    @Override // com.google.android.gms.internal.measurement.q6
    public final boolean b(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.j) {
                return !this.f || this.o.a(t).e();
            }
            int i5 = this.i[i3];
            int i6 = this.a[i5];
            int d = d(i5);
            if (this.g) {
                i = 0;
            } else {
                int i7 = this.a[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = r.getInt(t, i8);
                    i2 = i8;
                }
            }
            if (((268435456 & d) != 0) && !a((b6<T>) t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & d) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (a((b6<T>) t, i6, i5) && !a(t, d, a(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> c = this.p.c(o7.f(t, d & 1048575));
                            if (!c.isEmpty()) {
                                if (this.p.d(b(i5)).c.zza() == c8.MESSAGE) {
                                    ?? r4 = 0;
                                    Iterator<?> it = c.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r4 = r4;
                                        if (r4 == 0) {
                                            r4 = n6.a().a((Class) next.getClass());
                                        }
                                        if (!r4.b(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) o7.f(t, d & 1048575);
                if (!list.isEmpty()) {
                    ?? a = a(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        }
                        if (!a.b(list.get(i10))) {
                            z = false;
                            break;
                        }
                        i10++;
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (a((b6<T>) t, i5, i4, i) && !a(t, d, a(i5))) {
                return false;
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void c(T t) {
        int i;
        int i2 = this.j;
        while (true) {
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long d = d(this.i[i2]) & 1048575;
            Object f = o7.f(t, d);
            if (f != null) {
                o7.a(t, d, this.p.f(f));
            }
            i2++;
        }
        int length = this.i.length;
        while (i < length) {
            this.m.a(t, this.i[i]);
            i++;
        }
        this.n.b(t);
        if (this.f) {
            this.o.c(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0127, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0211, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.v3.e(r3) + com.google.android.gms.internal.measurement.v3.g(r5)) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020d, code lost:
    
        r2.putInt(r20, r14, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0139, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x014b, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015d, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x016f, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0181, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0193, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a5, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b6, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c7, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d8, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e9, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01fa, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x020b, code lost:
    
        if (r19.h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0331, code lost:
    
        if ((r5 instanceof com.google.android.gms.internal.measurement.h3) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0414, code lost:
    
        if (a((com.google.android.gms.internal.measurement.b6<T>) r20, r15, r5) != false) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x06cc, code lost:
    
        r4 = com.google.android.gms.internal.measurement.v3.c(r15, (com.google.android.gms.internal.measurement.x5) r2.getObject(r20, r9), a(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0434, code lost:
    
        if (a((com.google.android.gms.internal.measurement.b6<T>) r20, r15, r5) != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06f9, code lost:
    
        r4 = com.google.android.gms.internal.measurement.v3.h(r15, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x043c, code lost:
    
        if (a((com.google.android.gms.internal.measurement.b6<T>) r20, r15, r5) != false) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0704, code lost:
    
        r8 = com.google.android.gms.internal.measurement.v3.j(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x045c, code lost:
    
        if (a((com.google.android.gms.internal.measurement.b6<T>) r20, r15, r5) != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0729, code lost:
    
        r4 = r2.getObject(r20, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x072d, code lost:
    
        r4 = com.google.android.gms.internal.measurement.v3.c(r15, (com.google.android.gms.internal.measurement.h3) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0464, code lost:
    
        if (a((com.google.android.gms.internal.measurement.b6<T>) r20, r15, r5) != false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0738, code lost:
    
        r4 = com.google.android.gms.internal.measurement.s6.a(r15, r2.getObject(r20, r9), a(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0474, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.h3) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0753, code lost:
    
        r4 = com.google.android.gms.internal.measurement.v3.b(r15, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0519, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0603, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.v3.e(r15) + com.google.android.gms.internal.measurement.v3.g(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05ff, code lost:
    
        r2.putInt(r20, r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x052b, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x053d, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x054f, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0561, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0573, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0585, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0597, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x05a8, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x05b9, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x05ca, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x05db, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x05ec, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x05fd, code lost:
    
        if (r19.h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x06ca, code lost:
    
        if ((r12 & r18) != 0) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x06f7, code lost:
    
        if ((r12 & r18) != 0) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0702, code lost:
    
        if ((r12 & r18) != 0) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0727, code lost:
    
        if ((r12 & r18) != 0) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0736, code lost:
    
        if ((r12 & r18) != 0) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0750, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.h3) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ab, code lost:
    
        if ((r5 instanceof com.google.android.gms.internal.measurement.h3) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0334, code lost:
    
        r3 = com.google.android.gms.internal.measurement.v3.b(r3, (java.lang.String) r5);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0042. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:263:0x040b. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(T r20) {
        /*
            Method dump skipped, instructions count: 2390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b6.d(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final T zza() {
        return (T) this.l.a(this.e);
    }
}
