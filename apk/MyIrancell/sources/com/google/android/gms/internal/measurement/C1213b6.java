package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.b6 */
/* loaded from: classes.dex */
public final class C1213b6<T> implements InterfaceC1436q6<T> {

    /* renamed from: q */
    private static final int[] f6510q = new int[0];

    /* renamed from: r */
    private static final Unsafe f6511r = C1409o7.m8134c();

    /* renamed from: a */
    private final int[] f6512a;

    /* renamed from: b */
    private final Object[] f6513b;

    /* renamed from: c */
    private final int f6514c;

    /* renamed from: d */
    private final int f6515d;

    /* renamed from: e */
    private final InterfaceC1533x5 f6516e;

    /* renamed from: f */
    private final boolean f6517f;

    /* renamed from: g */
    private final boolean f6518g;

    /* renamed from: h */
    private final boolean f6519h;

    /* renamed from: i */
    private final int[] f6520i;

    /* renamed from: j */
    private final int f6521j;

    /* renamed from: k */
    private final int f6522k;

    /* renamed from: l */
    private final InterfaceC1273f6 f6523l;

    /* renamed from: m */
    private final AbstractC1287g5 f6524m;

    /* renamed from: n */
    private final AbstractC1319i7<?, ?> f6525n;

    /* renamed from: o */
    private final AbstractC1226c4<?> f6526o;

    /* renamed from: p */
    private final InterfaceC1491u5 f6527p;

    private C1213b6(int[] iArr, Object[] objArr, int i, int i2, InterfaceC1533x5 interfaceC1533x5, boolean z, boolean z2, int[] iArr2, int i3, int i4, InterfaceC1273f6 interfaceC1273f6, AbstractC1287g5 abstractC1287g5, AbstractC1319i7<?, ?> abstractC1319i7, AbstractC1226c4<?> abstractC1226c4, InterfaceC1491u5 interfaceC1491u5) {
        this.f6512a = iArr;
        this.f6513b = objArr;
        this.f6514c = i;
        this.f6515d = i2;
        boolean z3 = interfaceC1533x5 instanceof AbstractC1406o4;
        this.f6518g = z;
        this.f6517f = abstractC1226c4 != null && abstractC1226c4.mo7580a(interfaceC1533x5);
        this.f6519h = false;
        this.f6520i = iArr2;
        this.f6521j = i3;
        this.f6522k = i4;
        this.f6523l = interfaceC1273f6;
        this.f6524m = abstractC1287g5;
        this.f6525n = abstractC1319i7;
        this.f6526o = abstractC1226c4;
        this.f6516e = interfaceC1533x5;
        this.f6527p = interfaceC1491u5;
    }

    /* renamed from: a */
    private final int m7584a(int i, int i2) {
        if (i < this.f6514c || i > this.f6515d) {
            return -1;
        }
        return m7605b(i, i2);
    }

    /* renamed from: a */
    private static <UT, UB> int m7585a(AbstractC1319i7<UT, UB> abstractC1319i7, T t) {
        return abstractC1319i7.mo7930d(abstractC1319i7.mo7920a(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    /* renamed from: a */
    private final int m7586a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C1225c3 c1225c3) {
        Object valueOf;
        Object valueOf2;
        int m7740b;
        long j2;
        int i9;
        Object valueOf3;
        Unsafe unsafe = f6511r;
        long j3 = this.f6512a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    valueOf = Double.valueOf(C1240d3.m7742c(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    m7740b = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(C1240d3.m7744d(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    m7740b = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    m7740b = C1240d3.m7740b(bArr, i, c1225c3);
                    j2 = c1225c3.f6542b;
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    m7740b = C1240d3.m7738a(bArr, i, c1225c3);
                    i9 = c1225c3.f6541a;
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    valueOf = Long.valueOf(C1240d3.m7741b(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    m7740b = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    valueOf2 = Integer.valueOf(C1240d3.m7737a(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    m7740b = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    m7740b = C1240d3.m7740b(bArr, i, c1225c3);
                    valueOf3 = Boolean.valueOf(c1225c3.f6542b != 0);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    m7740b = C1240d3.m7738a(bArr, i, c1225c3);
                    int i10 = c1225c3.f6541a;
                    if (i10 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t, j, valueOf3);
                        unsafe.putInt(t, j3, i4);
                        return m7740b;
                    }
                    if ((i6 & 536870912) != 0 && !C1437q7.m8210a(bArr, m7740b, m7740b + i10)) {
                        throw C1518w4.m8635f();
                    }
                    unsafe.putObject(t, j, new String(bArr, m7740b, i10, C1448r4.f6862a));
                    m7740b += i10;
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    m7740b = C1240d3.m7736a(m7591a(i8), bArr, i, i2, c1225c3);
                    Object object = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = c1225c3.f6543c;
                    if (object != null) {
                        valueOf3 = C1448r4.m8291a(object, valueOf3);
                    }
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    m7740b = C1240d3.m7746e(bArr, i, c1225c3);
                    valueOf3 = c1225c3.f6543c;
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int m7738a = C1240d3.m7738a(bArr, i, c1225c3);
                    int i11 = c1225c3.f6541a;
                    InterfaceC1462s4 m7612c = m7612c(i8);
                    if (m7612c != null && !m7612c.mo7725a(i11)) {
                        m7618e(t).m7889a(i3, Long.valueOf(i11));
                        return m7738a;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i11));
                    m7740b = m7738a;
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    m7740b = C1240d3.m7738a(bArr, i, c1225c3);
                    i9 = AbstractC1475t3.m8476a(c1225c3.f6541a);
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    m7740b = C1240d3.m7740b(bArr, i, c1225c3);
                    j2 = AbstractC1475t3.m8477a(c1225c3.f6542b);
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    m7740b = C1240d3.m7735a(m7591a(i8), bArr, i, i2, (i3 & (-8)) | 4, c1225c3);
                    Object object2 = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = c1225c3.f6543c;
                    if (object2 != null) {
                        valueOf3 = C1448r4.m8291a(object2, valueOf3);
                    }
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return m7740b;
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
    
        r11.add(com.google.android.gms.internal.measurement.AbstractC1300h3.m7869a(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x026e, code lost:
    
        if (r30.f6542b != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0270, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0273, code lost:
    
        r11.m7821a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0276, code lost:
    
        if (r4 >= r20) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0278, code lost:
    
        r6 = com.google.android.gms.internal.measurement.C1240d3.m7738a(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x027e, code lost:
    
        if (r21 != r30.f6541a) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0280, code lost:
    
        r4 = com.google.android.gms.internal.measurement.C1240d3.m7740b(r18, r6, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0288, code lost:
    
        if (r30.f6542b == 0) goto L152;
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
    
        r11.add(com.google.android.gms.internal.measurement.AbstractC1300h3.f6635c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0150, code lost:
    
        if (r1 >= r20) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0152, code lost:
    
        r4 = com.google.android.gms.internal.measurement.C1240d3.m7738a(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0158, code lost:
    
        if (r21 != r30.f6541a) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015a, code lost:
    
        r1 = com.google.android.gms.internal.measurement.C1240d3.m7738a(r18, r4, r30);
        r4 = r30.f6541a;
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
    
        r11.add(com.google.android.gms.internal.measurement.AbstractC1300h3.m7869a(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016d, code lost:
    
        throw com.google.android.gms.internal.measurement.C1518w4.m8630a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0172, code lost:
    
        throw com.google.android.gms.internal.measurement.C1518w4.m8631b();
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m7587a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.C1225c3 r30) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1213b6.m7587a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.c3):int");
    }

    /* renamed from: a */
    private final <K, V> int m7588a(T t, byte[] bArr, int i, int i2, int i3, long j, C1225c3 c1225c3) {
        Unsafe unsafe = f6511r;
        Object m7606b = m7606b(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f6527p.mo8482b(object)) {
            Object mo8485e = this.f6527p.mo8485e(m7606b);
            this.f6527p.mo8480a(mo8485e, object);
            unsafe.putObject(t, j, mo8485e);
            object = mo8485e;
        }
        C1463s5<?, ?> mo8484d = this.f6527p.mo8484d(m7606b);
        Map<?, ?> mo8481a = this.f6527p.mo8481a(object);
        int m7738a = C1240d3.m7738a(bArr, i, c1225c3);
        int i4 = c1225c3.f6541a;
        if (i4 < 0 || i4 > i2 - m7738a) {
            throw C1518w4.m8630a();
        }
        int i5 = i4 + m7738a;
        K k = mo8484d.f6887b;
        V v = mo8484d.f6889d;
        while (m7738a < i5) {
            int i6 = m7738a + 1;
            int i7 = bArr[m7738a];
            if (i7 < 0) {
                i6 = C1240d3.m7733a(i7, bArr, i6, c1225c3);
                i7 = c1225c3.f6541a;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 != 1) {
                if (i9 == 2 && i10 == mo8484d.f6888c.zzb()) {
                    m7738a = m7589a(bArr, i8, i2, mo8484d.f6888c, mo8484d.f6889d.getClass(), c1225c3);
                    v = c1225c3.f6543c;
                }
                m7738a = C1240d3.m7730a(i7, bArr, i8, i2, c1225c3);
            } else if (i10 == mo8484d.f6886a.zzb()) {
                m7738a = m7589a(bArr, i8, i2, mo8484d.f6886a, (Class<?>) null, c1225c3);
                k = (K) c1225c3.f6543c;
            } else {
                m7738a = C1240d3.m7730a(i7, bArr, i8, i2, c1225c3);
            }
        }
        if (m7738a != i5) {
            throw C1518w4.m8634e();
        }
        mo8481a.put(k, v);
        return i5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* renamed from: a */
    private static int m7589a(byte[] bArr, int i, int i2, EnumC1507v7 enumC1507v7, Class<?> cls, C1225c3 c1225c3) {
        int m7740b;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int i3;
        long j;
        switch (C1258e6.f6599a[enumC1507v7.ordinal()]) {
            case 1:
                m7740b = C1240d3.m7740b(bArr, i, c1225c3);
                valueOf = Boolean.valueOf(c1225c3.f6542b != 0);
                c1225c3.f6543c = valueOf;
                return m7740b;
            case 2:
                return C1240d3.m7746e(bArr, i, c1225c3);
            case 3:
                valueOf2 = Double.valueOf(C1240d3.m7742c(bArr, i));
                c1225c3.f6543c = valueOf2;
                return i + 8;
            case 4:
            case 5:
                valueOf3 = Integer.valueOf(C1240d3.m7737a(bArr, i));
                c1225c3.f6543c = valueOf3;
                return i + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(C1240d3.m7741b(bArr, i));
                c1225c3.f6543c = valueOf2;
                return i + 8;
            case 8:
                valueOf3 = Float.valueOf(C1240d3.m7744d(bArr, i));
                c1225c3.f6543c = valueOf3;
                return i + 4;
            case 9:
            case 10:
            case 11:
                m7740b = C1240d3.m7738a(bArr, i, c1225c3);
                i3 = c1225c3.f6541a;
                valueOf = Integer.valueOf(i3);
                c1225c3.f6543c = valueOf;
                return m7740b;
            case 12:
            case 13:
                m7740b = C1240d3.m7740b(bArr, i, c1225c3);
                j = c1225c3.f6542b;
                valueOf = Long.valueOf(j);
                c1225c3.f6543c = valueOf;
                return m7740b;
            case 14:
                return C1240d3.m7736a(C1393n6.m8049a().m8050a((Class) cls), bArr, i, i2, c1225c3);
            case 15:
                m7740b = C1240d3.m7738a(bArr, i, c1225c3);
                i3 = AbstractC1475t3.m8476a(c1225c3.f6541a);
                valueOf = Integer.valueOf(i3);
                c1225c3.f6543c = valueOf;
                return m7740b;
            case 16:
                m7740b = C1240d3.m7740b(bArr, i, c1225c3);
                j = AbstractC1475t3.m8477a(c1225c3.f6542b);
                valueOf = Long.valueOf(j);
                c1225c3.f6543c = valueOf;
                return m7740b;
            case 17:
                return C1240d3.m7745d(bArr, i, c1225c3);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> C1213b6<T> m7590a(Class<T> cls, InterfaceC1505v5 interfaceC1505v5, InterfaceC1273f6 interfaceC1273f6, AbstractC1287g5 abstractC1287g5, AbstractC1319i7<?, ?> abstractC1319i7, AbstractC1226c4<?> abstractC1226c4, InterfaceC1491u5 interfaceC1491u5) {
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
        C1408o6 c1408o6;
        int i18;
        int objectFieldOffset;
        int i19;
        int i20;
        Class<?> cls2;
        String str;
        int i21;
        int i22;
        Field m7594a;
        int i23;
        char charAt11;
        int i24;
        Field m7594a2;
        Field m7594a3;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        char charAt16;
        if (!(interfaceC1505v5 instanceof C1408o6)) {
            ((C1214b7) interfaceC1505v5).zza();
            throw null;
        }
        C1408o6 c1408o62 = (C1408o6) interfaceC1505v5;
        int i29 = 0;
        boolean z2 = c1408o62.zza() == AbstractC1406o4.f.f6802j;
        String m8113a = c1408o62.m8113a();
        int length = m8113a.length();
        int charAt17 = m8113a.charAt(0);
        if (charAt17 >= 55296) {
            int i30 = charAt17 & 8191;
            int i31 = 1;
            int i32 = 13;
            while (true) {
                i = i31 + 1;
                charAt16 = m8113a.charAt(i31);
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
        int charAt18 = m8113a.charAt(i);
        if (charAt18 >= 55296) {
            int i34 = charAt18 & 8191;
            int i35 = 13;
            while (true) {
                i28 = i33 + 1;
                charAt15 = m8113a.charAt(i33);
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
            iArr = f6510q;
            i6 = 0;
            i3 = 0;
            charAt = 0;
            i4 = 0;
            charAt2 = 0;
            i5 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt19 = m8113a.charAt(i33);
            if (charAt19 >= 55296) {
                int i37 = charAt19 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    charAt10 = m8113a.charAt(i36);
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
            int charAt20 = m8113a.charAt(i36);
            if (charAt20 >= 55296) {
                int i40 = charAt20 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    charAt9 = m8113a.charAt(i39);
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
            charAt = m8113a.charAt(i39);
            if (charAt >= 55296) {
                int i43 = charAt & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    charAt8 = m8113a.charAt(i42);
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
            int charAt21 = m8113a.charAt(i42);
            if (charAt21 >= 55296) {
                int i46 = charAt21 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    charAt7 = m8113a.charAt(i45);
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
            charAt2 = m8113a.charAt(i45);
            if (charAt2 >= 55296) {
                int i49 = charAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    charAt6 = m8113a.charAt(i48);
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
            int charAt22 = m8113a.charAt(i48);
            if (charAt22 >= 55296) {
                int i52 = charAt22 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    charAt5 = m8113a.charAt(i51);
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
            int charAt23 = m8113a.charAt(i51);
            if (charAt23 >= 55296) {
                int i55 = charAt23 & 8191;
                int i56 = i54;
                int i57 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt4 = m8113a.charAt(i56);
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
            int charAt24 = m8113a.charAt(i2);
            if (charAt24 >= 55296) {
                int i59 = charAt24 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i7 = i60 + 1;
                    charAt3 = m8113a.charAt(i60);
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
        Unsafe unsafe = f6511r;
        Object[] m8114c = c1408o62.m8114c();
        Class<?> cls3 = c1408o62.mo7630b().getClass();
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
            int charAt25 = m8113a.charAt(i67);
            int i72 = length;
            if (charAt25 >= 55296) {
                int i73 = charAt25 & 8191;
                int i74 = i71;
                int i75 = 13;
                while (true) {
                    i27 = i74 + 1;
                    charAt14 = m8113a.charAt(i74);
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
            int charAt26 = m8113a.charAt(i16);
            if (charAt26 >= 55296) {
                int i77 = charAt26 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i26 = i78 + 1;
                    charAt13 = m8113a.charAt(i78);
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
                int charAt27 = m8113a.charAt(i17);
                char c = 55296;
                if (charAt27 >= 55296) {
                    int i84 = charAt27 & 8191;
                    int i85 = 13;
                    while (true) {
                        i25 = i83 + 1;
                        charAt12 = m8113a.charAt(i83);
                        if (charAt12 < c) {
                            break;
                        }
                        i84 |= (charAt12 & 8191) << i85;
                        i85 += 13;
                        i83 = i25;
                        c = 55296;
                    }
                    charAt27 = i84 | (charAt12 << i85);
                    i83 = i25;
                }
                int i86 = i80 - 51;
                int i87 = i83;
                if (i86 == 9 || i86 == 17) {
                    objArr[((i70 / 3) << 1) + 1] = m8114c[i4];
                    i4++;
                } else if (i86 == 12 && (charAt17 & 1) == 1) {
                    objArr[((i70 / 3) << 1) + 1] = m8114c[i4];
                    i4++;
                }
                int i88 = charAt27 << 1;
                Object obj = m8114c[i88];
                if (obj instanceof Field) {
                    m7594a2 = (Field) obj;
                } else {
                    m7594a2 = m7594a(cls3, (String) obj);
                    m8114c[i88] = m7594a2;
                }
                c1408o6 = c1408o62;
                String str2 = m8113a;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m7594a2);
                int i89 = i88 + 1;
                Object obj2 = m8114c[i89];
                if (obj2 instanceof Field) {
                    m7594a3 = (Field) obj2;
                } else {
                    m7594a3 = m7594a(cls3, (String) obj2);
                    m8114c[i89] = m7594a3;
                }
                cls2 = cls3;
                i19 = i4;
                i17 = i87;
                str = str2;
                i22 = 0;
                i21 = (int) unsafe.objectFieldOffset(m7594a3);
                i20 = i29;
            } else {
                c1408o6 = c1408o62;
                String str3 = m8113a;
                int i90 = i4 + 1;
                Field m7594a4 = m7594a(cls3, (String) m8114c[i4]);
                if (i80 == 9 || i80 == 17) {
                    i18 = 1;
                    objArr[((i70 / 3) << 1) + 1] = m7594a4.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        i18 = 1;
                        i24 = i90 + 1;
                        objArr[((i70 / 3) << 1) + 1] = m8114c[i90];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        i18 = 1;
                        if ((charAt17 & 1) == 1) {
                            i24 = i90 + 1;
                            objArr[((i70 / 3) << 1) + 1] = m8114c[i90];
                        }
                    } else {
                        if (i80 == 50) {
                            int i91 = i66 + 1;
                            iArr[i66] = i70;
                            int i92 = (i70 / 3) << 1;
                            int i93 = i90 + 1;
                            objArr[i92] = m8114c[i90];
                            if ((charAt26 & 2048) != 0) {
                                i90 = i93 + 1;
                                objArr[i92 + 1] = m8114c[i93];
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(m7594a4);
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
                    Object obj3 = m8114c[i97];
                    i19 = i90;
                    if (obj3 instanceof Field) {
                        m7594a = (Field) obj3;
                    } else {
                        m7594a = m7594a(cls3, (String) obj3);
                        m8114c[i97] = m7594a;
                    }
                    i20 = i29;
                    cls2 = cls3;
                    i21 = (int) unsafe.objectFieldOffset(m7594a);
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
            m8113a = str;
            i67 = i17;
            cls3 = cls2;
            i3 = i81;
            length = i72;
            i5 = i15;
            z2 = z;
            charAt = i82;
            i4 = i19;
            c1408o62 = c1408o6;
        }
        return new C1213b6<>(iArr3, objArr, charAt, i3, c1408o62.mo7630b(), z2, false, iArr, i5, i65, interfaceC1273f6, abstractC1287g5, abstractC1319i7, abstractC1226c4, interfaceC1491u5);
    }

    /* renamed from: a */
    private final InterfaceC1436q6 m7591a(int i) {
        int i2 = (i / 3) << 1;
        InterfaceC1436q6 interfaceC1436q6 = (InterfaceC1436q6) this.f6513b[i2];
        if (interfaceC1436q6 != null) {
            return interfaceC1436q6;
        }
        InterfaceC1436q6<T> m8050a = C1393n6.m8049a().m8050a((Class) this.f6513b[i2 + 1]);
        this.f6513b[i2] = m8050a;
        return m8050a;
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m7592a(int i, int i2, Map<K, V> map, InterfaceC1462s4 interfaceC1462s4, UB ub, AbstractC1319i7<UT, UB> abstractC1319i7) {
        C1463s5<?, ?> mo8484d = this.f6527p.mo8484d(m7606b(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!interfaceC1462s4.mo7725a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC1319i7.mo7919a();
                }
                C1419p3 m7872c = AbstractC1300h3.m7872c(C1421p5.m8181a(mo8484d, next.getKey(), next.getValue()));
                try {
                    C1421p5.m8182a(m7872c.m8174b(), mo8484d, next.getKey(), next.getValue());
                    abstractC1319i7.mo7922a((AbstractC1319i7<UT, UB>) ub, i2, m7872c.m8173a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    private final <UT, UB> UB m7593a(Object obj, int i, UB ub, AbstractC1319i7<UT, UB> abstractC1319i7) {
        InterfaceC1462s4 m7612c;
        int i2 = this.f6512a[i];
        Object m8146f = C1409o7.m8146f(obj, m7614d(i) & 1048575);
        return (m8146f == null || (m7612c = m7612c(i)) == null) ? ub : (UB) m7592a(i, i2, this.f6527p.mo8481a(m8146f), m7612c, (InterfaceC1462s4) ub, (AbstractC1319i7<UT, InterfaceC1462s4>) abstractC1319i7);
    }

    /* renamed from: a */
    private static Field m7594a(Class<?> cls, String str) {
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

    /* renamed from: a */
    private static List<?> m7595a(Object obj, long j) {
        return (List) C1409o7.m8146f(obj, j);
    }

    /* renamed from: a */
    private static void m7596a(int i, Object obj, InterfaceC1215b8 interfaceC1215b8) {
        if (obj instanceof String) {
            interfaceC1215b8.mo7640a(i, (String) obj);
        } else {
            interfaceC1215b8.mo7636a(i, (AbstractC1300h3) obj);
        }
    }

    /* renamed from: a */
    private final <K, V> void m7597a(InterfaceC1215b8 interfaceC1215b8, int i, Object obj, int i2) {
        if (obj != null) {
            interfaceC1215b8.mo7637a(i, this.f6527p.mo8484d(m7606b(i2)), this.f6527p.mo8483c(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m7598a(AbstractC1319i7<UT, UB> abstractC1319i7, T t, InterfaceC1215b8 interfaceC1215b8) {
        abstractC1319i7.mo7923a((AbstractC1319i7<UT, UB>) abstractC1319i7.mo7920a(t), interfaceC1215b8);
    }

    /* renamed from: a */
    private final void m7599a(T t, T t2, int i) {
        long m7614d = m7614d(i) & 1048575;
        if (m7600a((C1213b6<T>) t2, i)) {
            Object m8146f = C1409o7.m8146f(t, m7614d);
            Object m8146f2 = C1409o7.m8146f(t2, m7614d);
            if (m8146f != null && m8146f2 != null) {
                C1409o7.m8124a(t, m7614d, C1448r4.m8291a(m8146f, m8146f2));
                m7607b((C1213b6<T>) t, i);
            } else if (m8146f2 != null) {
                C1409o7.m8124a(t, m7614d, m8146f2);
                m7607b((C1213b6<T>) t, i);
            }
        }
    }

    /* renamed from: a */
    private final boolean m7600a(T t, int i) {
        if (!this.f6518g) {
            int m7616e = m7616e(i);
            return (C1409o7.m8116a(t, (long) (m7616e & 1048575)) & (1 << (m7616e >>> 20))) != 0;
        }
        int m7614d = m7614d(i);
        long j = m7614d & 1048575;
        switch ((m7614d & 267386880) >>> 20) {
            case 0:
                return C1409o7.m8143e(t, j) != 0.0d;
            case 1:
                return C1409o7.m8138d(t, j) != 0.0f;
            case 2:
                return C1409o7.m8129b(t, j) != 0;
            case 3:
                return C1409o7.m8129b(t, j) != 0;
            case 4:
                return C1409o7.m8116a(t, j) != 0;
            case 5:
                return C1409o7.m8129b(t, j) != 0;
            case 6:
                return C1409o7.m8116a(t, j) != 0;
            case 7:
                return C1409o7.m8137c(t, j);
            case 8:
                Object m8146f = C1409o7.m8146f(t, j);
                if (m8146f instanceof String) {
                    return !((String) m8146f).isEmpty();
                }
                if (m8146f instanceof AbstractC1300h3) {
                    return !AbstractC1300h3.f6635c.equals(m8146f);
                }
                throw new IllegalArgumentException();
            case 9:
                return C1409o7.m8146f(t, j) != null;
            case 10:
                return !AbstractC1300h3.f6635c.equals(C1409o7.m8146f(t, j));
            case 11:
                return C1409o7.m8116a(t, j) != 0;
            case 12:
                return C1409o7.m8116a(t, j) != 0;
            case 13:
                return C1409o7.m8116a(t, j) != 0;
            case 14:
                return C1409o7.m8129b(t, j) != 0;
            case 15:
                return C1409o7.m8116a(t, j) != 0;
            case 16:
                return C1409o7.m8129b(t, j) != 0;
            case 17:
                return C1409o7.m8146f(t, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private final boolean m7601a(T t, int i, int i2) {
        return C1409o7.m8116a(t, (long) (m7616e(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private final boolean m7602a(T t, int i, int i2, int i3) {
        return this.f6518g ? m7600a((C1213b6<T>) t, i) : (i2 & i3) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static boolean m7603a(Object obj, int i, InterfaceC1436q6 interfaceC1436q6) {
        return interfaceC1436q6.mo7627b(C1409o7.m8146f(obj, i & 1048575));
    }

    /* renamed from: b */
    private static <T> double m7604b(T t, long j) {
        return ((Double) C1409o7.m8146f(t, j)).doubleValue();
    }

    /* renamed from: b */
    private final int m7605b(int i, int i2) {
        int length = (this.f6512a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f6512a[i4];
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

    /* renamed from: b */
    private final Object m7606b(int i) {
        return this.f6513b[(i / 3) << 1];
    }

    /* renamed from: b */
    private final void m7607b(T t, int i) {
        if (this.f6518g) {
            return;
        }
        int m7616e = m7616e(i);
        long j = m7616e & 1048575;
        C1409o7.m8122a((Object) t, j, C1409o7.m8116a(t, j) | (1 << (m7616e >>> 20)));
    }

    /* renamed from: b */
    private final void m7608b(T t, int i, int i2) {
        C1409o7.m8122a((Object) t, m7616e(i2) & 1048575, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m7609b(T r19, com.google.android.gms.internal.measurement.InterfaceC1215b8 r20) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1213b6.m7609b(java.lang.Object, com.google.android.gms.internal.measurement.b8):void");
    }

    /* renamed from: b */
    private final void m7610b(T t, T t2, int i) {
        int m7614d = m7614d(i);
        int i2 = this.f6512a[i];
        long j = m7614d & 1048575;
        if (m7601a((C1213b6<T>) t2, i2, i)) {
            Object m8146f = C1409o7.m8146f(t, j);
            Object m8146f2 = C1409o7.m8146f(t2, j);
            if (m8146f != null && m8146f2 != null) {
                C1409o7.m8124a(t, j, C1448r4.m8291a(m8146f, m8146f2));
                m7608b((C1213b6<T>) t, i2, i);
            } else if (m8146f2 != null) {
                C1409o7.m8124a(t, j, m8146f2);
                m7608b((C1213b6<T>) t, i2, i);
            }
        }
    }

    /* renamed from: c */
    private static <T> float m7611c(T t, long j) {
        return ((Float) C1409o7.m8146f(t, j)).floatValue();
    }

    /* renamed from: c */
    private final InterfaceC1462s4 m7612c(int i) {
        return (InterfaceC1462s4) this.f6513b[((i / 3) << 1) + 1];
    }

    /* renamed from: c */
    private final boolean m7613c(T t, T t2, int i) {
        return m7600a((C1213b6<T>) t, i) == m7600a((C1213b6<T>) t2, i);
    }

    /* renamed from: d */
    private final int m7614d(int i) {
        return this.f6512a[i + 1];
    }

    /* renamed from: d */
    private static <T> int m7615d(T t, long j) {
        return ((Integer) C1409o7.m8146f(t, j)).intValue();
    }

    /* renamed from: e */
    private final int m7616e(int i) {
        return this.f6512a[i + 2];
    }

    /* renamed from: e */
    private static <T> long m7617e(T t, long j) {
        return ((Long) C1409o7.m8146f(t, j)).longValue();
    }

    /* renamed from: e */
    private static C1304h7 m7618e(Object obj) {
        AbstractC1406o4 abstractC1406o4 = (AbstractC1406o4) obj;
        C1304h7 c1304h7 = abstractC1406o4.zzb;
        if (c1304h7 != C1304h7.m7886d()) {
            return c1304h7;
        }
        C1304h7 m7887e = C1304h7.m7887e();
        abstractC1406o4.zzb = m7887e;
        return m7887e;
    }

    /* renamed from: f */
    private final int m7619f(int i) {
        if (i < this.f6514c || i > this.f6515d) {
            return -1;
        }
        return m7605b(i, 0);
    }

    /* renamed from: f */
    private static <T> boolean m7620f(T t, long j) {
        return ((Boolean) C1409o7.m8146f(t, j)).booleanValue();
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
    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo7621a(T r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1213b6.mo7621a(java.lang.Object):int");
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
        r2 = r10.f6521j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x047f, code lost:
    
        if (r2 >= r10.f6522k) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0481, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.C1304h7) r10.m7593a(r13, r10.f6520i[r2], (int) r1, (com.google.android.gms.internal.measurement.AbstractC1319i7<UT, int>) r10.f6525n);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0490, code lost:
    
        if (r1 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0492, code lost:
    
        r10.f6525n.mo7927b(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0499, code lost:
    
        if (r8 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x049b, code lost:
    
        if (r0 != r33) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04a2, code lost:
    
        throw com.google.android.gms.internal.measurement.C1518w4.m8634e();
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
    
        throw com.google.android.gms.internal.measurement.C1518w4.m8634e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:108:0x007f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m7622a(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.C1225c3 r35) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1213b6.m7622a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.c3):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0048. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:276:0x04a1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0464 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08c3  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7623a(T r13, com.google.android.gms.internal.measurement.InterfaceC1215b8 r14) {
        /*
            Method dump skipped, instructions count: 2538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1213b6.mo7623a(java.lang.Object, com.google.android.gms.internal.measurement.b8):void");
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
    
        r0 = com.google.android.gms.internal.measurement.C1240d3.m7738a(r12, r8, r11);
        r1 = r11.f6541a;
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
    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7624a(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.measurement.C1225c3 r32) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1213b6.mo7624a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.c3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (com.google.android.gms.internal.measurement.C1464s6.m8387a(com.google.android.gms.internal.measurement.C1409o7.m8146f(r10, r6), com.google.android.gms.internal.measurement.C1409o7.m8146f(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8129b(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8129b(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8116a(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8116a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8129b(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8129b(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8116a(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8116a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8116a(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8116a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8116a(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8116a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (com.google.android.gms.internal.measurement.C1464s6.m8387a(com.google.android.gms.internal.measurement.C1409o7.m8146f(r10, r6), com.google.android.gms.internal.measurement.C1409o7.m8146f(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (com.google.android.gms.internal.measurement.C1464s6.m8387a(com.google.android.gms.internal.measurement.C1409o7.m8146f(r10, r6), com.google.android.gms.internal.measurement.C1409o7.m8146f(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (com.google.android.gms.internal.measurement.C1464s6.m8387a(com.google.android.gms.internal.measurement.C1409o7.m8146f(r10, r6), com.google.android.gms.internal.measurement.C1409o7.m8146f(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8137c(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8137c(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8116a(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8116a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8129b(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8129b(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8116a(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8116a(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8129b(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8129b(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        if (com.google.android.gms.internal.measurement.C1409o7.m8129b(r10, r6) == com.google.android.gms.internal.measurement.C1409o7.m8129b(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C1409o7.m8138d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C1409o7.m8138d(r11, r6))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C1409o7.m8143e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C1409o7.m8143e(r11, r6))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.C1464s6.m8387a(com.google.android.gms.internal.measurement.C1409o7.m8146f(r10, r6), com.google.android.gms.internal.measurement.C1409o7.m8146f(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6 A[LOOP:0: B:2:0x0005->B:85:0x01b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo7625a(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1213b6.mo7625a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: b */
    public final void mo7626b(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.f6512a.length; i += 3) {
            int m7614d = m7614d(i);
            long j = 1048575 & m7614d;
            int i2 = this.f6512a[i];
            switch ((m7614d & 267386880) >>> 20) {
                case 0:
                    if (m7600a((C1213b6<T>) t2, i)) {
                        C1409o7.m8120a(t, j, C1409o7.m8143e(t2, j));
                        m7607b((C1213b6<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m7600a((C1213b6<T>) t2, i)) {
                        C1409o7.m8121a((Object) t, j, C1409o7.m8138d(t2, j));
                        m7607b((C1213b6<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8123a((Object) t, j, C1409o7.m8129b(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 3:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8123a((Object) t, j, C1409o7.m8129b(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 4:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8122a((Object) t, j, C1409o7.m8116a(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 5:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8123a((Object) t, j, C1409o7.m8129b(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 6:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8122a((Object) t, j, C1409o7.m8116a(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 7:
                    if (m7600a((C1213b6<T>) t2, i)) {
                        C1409o7.m8125a(t, j, C1409o7.m8137c(t2, j));
                        m7607b((C1213b6<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8124a(t, j, C1409o7.m8146f(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 9:
                case 17:
                    m7599a(t, t2, i);
                    break;
                case 10:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8124a(t, j, C1409o7.m8146f(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 11:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8122a((Object) t, j, C1409o7.m8116a(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 12:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8122a((Object) t, j, C1409o7.m8116a(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 13:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8122a((Object) t, j, C1409o7.m8116a(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 14:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8123a((Object) t, j, C1409o7.m8129b(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 15:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8122a((Object) t, j, C1409o7.m8116a(t2, j));
                    m7607b((C1213b6<T>) t, i);
                    break;
                case 16:
                    if (!m7600a((C1213b6<T>) t2, i)) {
                        break;
                    }
                    C1409o7.m8123a((Object) t, j, C1409o7.m8129b(t2, j));
                    m7607b((C1213b6<T>) t, i);
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
                    this.f6524m.mo7851a(t, t2, j);
                    break;
                case 50:
                    C1464s6.m8385a(this.f6527p, t, t2, j);
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
                    if (!m7601a((C1213b6<T>) t2, i2, i)) {
                        break;
                    }
                    C1409o7.m8124a(t, j, C1409o7.m8146f(t2, j));
                    m7608b((C1213b6<T>) t, i2, i);
                    break;
                case 60:
                case 68:
                    m7610b(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m7601a((C1213b6<T>) t2, i2, i)) {
                        break;
                    }
                    C1409o7.m8124a(t, j, C1409o7.m8146f(t2, j));
                    m7608b((C1213b6<T>) t, i2, i);
                    break;
            }
        }
        C1464s6.m8384a(this.f6525n, t, t2);
        if (this.f6517f) {
            C1464s6.m8383a(this.f6526o, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.measurement.q6] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.measurement.q6] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: b */
    public final boolean mo7627b(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.f6521j) {
                return !this.f6517f || this.f6526o.mo7577a(t).m7764e();
            }
            int i5 = this.f6520i[i3];
            int i6 = this.f6512a[i5];
            int m7614d = m7614d(i5);
            if (this.f6518g) {
                i = 0;
            } else {
                int i7 = this.f6512a[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = f6511r.getInt(t, i8);
                    i2 = i8;
                }
            }
            if (((268435456 & m7614d) != 0) && !m7602a((C1213b6<T>) t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & m7614d) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (m7601a((C1213b6<T>) t, i6, i5) && !m7603a(t, m7614d, m7591a(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> mo8483c = this.f6527p.mo8483c(C1409o7.m8146f(t, m7614d & 1048575));
                            if (!mo8483c.isEmpty()) {
                                if (this.f6527p.mo8484d(m7606b(i5)).f6888c.zza() == EnumC1230c8.MESSAGE) {
                                    ?? r4 = 0;
                                    Iterator<?> it = mo8483c.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r4 = r4;
                                        if (r4 == 0) {
                                            r4 = C1393n6.m8049a().m8050a((Class) next.getClass());
                                        }
                                        if (!r4.mo7627b(next)) {
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
                List list = (List) C1409o7.m8146f(t, m7614d & 1048575);
                if (!list.isEmpty()) {
                    ?? m7591a = m7591a(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        }
                        if (!m7591a.mo7627b(list.get(i10))) {
                            z = false;
                            break;
                        }
                        i10++;
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m7602a((C1213b6<T>) t, i5, i4, i) && !m7603a(t, m7614d, m7591a(i5))) {
                return false;
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: c */
    public final void mo7628c(T t) {
        int i;
        int i2 = this.f6521j;
        while (true) {
            i = this.f6522k;
            if (i2 >= i) {
                break;
            }
            long m7614d = m7614d(this.f6520i[i2]) & 1048575;
            Object m8146f = C1409o7.m8146f(t, m7614d);
            if (m8146f != null) {
                C1409o7.m8124a(t, m7614d, this.f6527p.mo8486f(m8146f));
            }
            i2++;
        }
        int length = this.f6520i.length;
        while (i < length) {
            this.f6524m.mo7850a(t, this.f6520i[i]);
            i++;
        }
        this.f6525n.mo7925b(t);
        if (this.f6517f) {
            this.f6526o.mo7582c(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0127, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0211, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.AbstractC1503v3.m8555e(r3) + com.google.android.gms.internal.measurement.AbstractC1503v3.m8562g(r5)) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020d, code lost:
    
        r2.putInt(r20, r14, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0139, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x014b, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015d, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x016f, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0181, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0193, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a5, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b6, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c7, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d8, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e9, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01fa, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x020b, code lost:
    
        if (r19.f6519h != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0331, code lost:
    
        if ((r5 instanceof com.google.android.gms.internal.measurement.AbstractC1300h3) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0414, code lost:
    
        if (m7601a((com.google.android.gms.internal.measurement.C1213b6<T>) r20, r15, r5) != false) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x06cc, code lost:
    
        r4 = com.google.android.gms.internal.measurement.AbstractC1503v3.m8549c(r15, (com.google.android.gms.internal.measurement.InterfaceC1533x5) r2.getObject(r20, r9), m7591a(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0434, code lost:
    
        if (m7601a((com.google.android.gms.internal.measurement.C1213b6<T>) r20, r15, r5) != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06f9, code lost:
    
        r4 = com.google.android.gms.internal.measurement.AbstractC1503v3.m8568h(r15, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x043c, code lost:
    
        if (m7601a((com.google.android.gms.internal.measurement.C1213b6<T>) r20, r15, r5) != false) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0704, code lost:
    
        r8 = com.google.android.gms.internal.measurement.AbstractC1503v3.m8574j(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x045c, code lost:
    
        if (m7601a((com.google.android.gms.internal.measurement.C1213b6<T>) r20, r15, r5) != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0729, code lost:
    
        r4 = r2.getObject(r20, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x072d, code lost:
    
        r4 = com.google.android.gms.internal.measurement.AbstractC1503v3.m8548c(r15, (com.google.android.gms.internal.measurement.AbstractC1300h3) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0464, code lost:
    
        if (m7601a((com.google.android.gms.internal.measurement.C1213b6<T>) r20, r15, r5) != false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0738, code lost:
    
        r4 = com.google.android.gms.internal.measurement.C1464s6.m8371a(r15, r2.getObject(r20, r9), m7591a(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0474, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.AbstractC1300h3) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0753, code lost:
    
        r4 = com.google.android.gms.internal.measurement.AbstractC1503v3.m8541b(r15, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0519, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0603, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.AbstractC1503v3.m8555e(r15) + com.google.android.gms.internal.measurement.AbstractC1503v3.m8562g(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05ff, code lost:
    
        r2.putInt(r20, r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x052b, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x053d, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x054f, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0561, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0573, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0585, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0597, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x05a8, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x05b9, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x05ca, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x05db, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x05ec, code lost:
    
        if (r19.f6519h != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x05fd, code lost:
    
        if (r19.f6519h != false) goto L374;
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
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.AbstractC1300h3) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ab, code lost:
    
        if ((r5 instanceof com.google.android.gms.internal.measurement.AbstractC1300h3) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0334, code lost:
    
        r3 = com.google.android.gms.internal.measurement.AbstractC1503v3.m8541b(r3, (java.lang.String) r5);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0042. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:263:0x040b. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo7629d(T r20) {
        /*
            Method dump skipped, instructions count: 2390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1213b6.mo7629d(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    public final T zza() {
        return (T) this.f6523l.mo7831a(this.f6516e);
    }
}
