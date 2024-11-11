package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.InterfaceC1271f4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d4 */
/* loaded from: classes.dex */
public final class C1241d4<T extends InterfaceC1271f4<T>> {

    /* renamed from: d */
    private static final C1241d4 f6561d = new C1241d4(true);

    /* renamed from: a */
    final C1450r6<T, Object> f6562a;

    /* renamed from: b */
    private boolean f6563b;

    /* renamed from: c */
    private boolean f6564c;

    private C1241d4() {
        this.f6562a = C1450r6.m8306b(16);
    }

    private C1241d4(C1450r6<T, Object> c1450r6) {
        this.f6562a = c1450r6;
        m7759a();
    }

    private C1241d4(boolean z) {
        this(C1450r6.m8306b(0));
        m7759a();
    }

    /* renamed from: a */
    public static int m7747a(InterfaceC1271f4<?> interfaceC1271f4, Object obj) {
        EnumC1507v7 zzb = interfaceC1271f4.zzb();
        int zza = interfaceC1271f4.zza();
        if (!interfaceC1271f4.mo7824a()) {
            return m7748a(zzb, zza, obj);
        }
        int i = 0;
        List list = (List) obj;
        if (interfaceC1271f4.mo7826c()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += m7754b(zzb, it.next());
            }
            return AbstractC1503v3.m8555e(zza) + i + AbstractC1503v3.m8577l(i);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i += m7748a(zzb, zza, it2.next());
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7748a(EnumC1507v7 enumC1507v7, int i, Object obj) {
        int m8555e = AbstractC1503v3.m8555e(i);
        if (enumC1507v7 == EnumC1507v7.zzj) {
            C1448r4.m8293a((InterfaceC1533x5) obj);
            m8555e <<= 1;
        }
        return m8555e + m7754b(enumC1507v7, obj);
    }

    /* renamed from: a */
    private final Object m7749a(T t) {
        Object obj = this.f6562a.get(t);
        if (!(obj instanceof C1212b5)) {
            return obj;
        }
        C1212b5.m7583c();
        throw null;
    }

    /* renamed from: a */
    private static Object m7750a(Object obj) {
        if (obj instanceof InterfaceC1288g6) {
            return ((InterfaceC1288g6) obj).clone();
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
    /* renamed from: a */
    public static void m7751a(AbstractC1503v3 abstractC1503v3, EnumC1507v7 enumC1507v7, int i, Object obj) {
        if (enumC1507v7 == EnumC1507v7.zzj) {
            InterfaceC1533x5 interfaceC1533x5 = (InterfaceC1533x5) obj;
            C1448r4.m8293a(interfaceC1533x5);
            abstractC1503v3.mo8586a(i, 3);
            interfaceC1533x5.mo8091a(abstractC1503v3);
            abstractC1503v3.mo8586a(i, 4);
            return;
        }
        abstractC1503v3.mo8586a(i, enumC1507v7.zzb());
        switch (C1286g4.f6625b[enumC1507v7.ordinal()]) {
            case 1:
                abstractC1503v3.m8581a(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC1503v3.m8582a(((Float) obj).floatValue());
                return;
            case 3:
                abstractC1503v3.mo8593a(((Long) obj).longValue());
                return;
            case 4:
                abstractC1503v3.mo8593a(((Long) obj).longValue());
                return;
            case 5:
                abstractC1503v3.mo8583a(((Integer) obj).intValue());
                return;
            case 6:
                abstractC1503v3.mo8609c(((Long) obj).longValue());
                return;
            case 7:
                abstractC1503v3.mo8610d(((Integer) obj).intValue());
                return;
            case 8:
                abstractC1503v3.m8598a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((InterfaceC1533x5) obj).mo8091a(abstractC1503v3);
                return;
            case 10:
                abstractC1503v3.mo8595a((InterfaceC1533x5) obj);
                return;
            case 11:
                if (obj instanceof AbstractC1300h3) {
                    abstractC1503v3.mo8594a((AbstractC1300h3) obj);
                    return;
                } else {
                    abstractC1503v3.mo8596a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof AbstractC1300h3) {
                    abstractC1503v3.mo8594a((AbstractC1300h3) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    abstractC1503v3.mo8605b(bArr, 0, bArr.length);
                    return;
                }
            case 13:
                abstractC1503v3.mo8600b(((Integer) obj).intValue());
                return;
            case 14:
                abstractC1503v3.mo8610d(((Integer) obj).intValue());
                return;
            case 15:
                abstractC1503v3.mo8609c(((Long) obj).longValue());
                return;
            case 16:
                abstractC1503v3.m8606c(((Integer) obj).intValue());
                return;
            case 17:
                abstractC1503v3.m8604b(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof InterfaceC1434q4) {
                    abstractC1503v3.mo8583a(((InterfaceC1434q4) obj).zza());
                    return;
                } else {
                    abstractC1503v3.mo8583a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.C1212b5) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.InterfaceC1434q4) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L4;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m7752a(com.google.android.gms.internal.measurement.EnumC1507v7 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.C1448r4.m8290a(r3)
            int[] r0 = com.google.android.gms.internal.measurement.C1286g4.f6624a
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.InterfaceC1533x5
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C1212b5
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.InterfaceC1434q4
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.AbstractC1300h3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1241d4.m7752a(com.google.android.gms.internal.measurement.v7, java.lang.Object):void");
    }

    /* renamed from: a */
    private static <T extends InterfaceC1271f4<T>> boolean m7753a(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo7825b() == EnumC1230c8.MESSAGE) {
            boolean mo7824a = key.mo7824a();
            Object value = entry.getValue();
            if (mo7824a) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC1533x5) it.next()).mo8092a()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof InterfaceC1533x5)) {
                    if (value instanceof C1212b5) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((InterfaceC1533x5) value).mo8092a()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m7754b(EnumC1507v7 enumC1507v7, Object obj) {
        switch (C1286g4.f6625b[enumC1507v7.ordinal()]) {
            case 1:
                return AbstractC1503v3.m8534b(((Double) obj).doubleValue());
            case 2:
                return AbstractC1503v3.m8535b(((Float) obj).floatValue());
            case 3:
                return AbstractC1503v3.m8554d(((Long) obj).longValue());
            case 4:
                return AbstractC1503v3.m8557e(((Long) obj).longValue());
            case 5:
                return AbstractC1503v3.m8558f(((Integer) obj).intValue());
            case 6:
                return AbstractC1503v3.m8565g(((Long) obj).longValue());
            case 7:
                return AbstractC1503v3.m8570i(((Integer) obj).intValue());
            case 8:
                return AbstractC1503v3.m8546b(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC1503v3.m8550c((InterfaceC1533x5) obj);
            case 10:
                return obj instanceof C1212b5 ? AbstractC1503v3.m8531a((C1212b5) obj) : AbstractC1503v3.m8544b((InterfaceC1533x5) obj);
            case 11:
                return obj instanceof AbstractC1300h3 ? AbstractC1503v3.m8543b((AbstractC1300h3) obj) : AbstractC1503v3.m8545b((String) obj);
            case 12:
                return obj instanceof AbstractC1300h3 ? AbstractC1503v3.m8543b((AbstractC1300h3) obj) : AbstractC1503v3.m8547b((byte[]) obj);
            case 13:
                return AbstractC1503v3.m8562g(((Integer) obj).intValue());
            case 14:
                return AbstractC1503v3.m8573j(((Integer) obj).intValue());
            case 15:
                return AbstractC1503v3.m8569h(((Long) obj).longValue());
            case 16:
                return AbstractC1503v3.m8566h(((Integer) obj).intValue());
            case 17:
                return AbstractC1503v3.m8561f(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC1434q4 ? AbstractC1503v3.m8575k(((InterfaceC1434q4) obj).zza()) : AbstractC1503v3.m8575k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private final void m7755b(T t, Object obj) {
        if (!t.mo7824a()) {
            m7752a(t.zzb(), obj);
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
                m7752a(t.zzb(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C1212b5) {
            this.f6564c = true;
        }
        this.f6562a.m8313a((C1450r6<T, Object>) t, (T) obj);
    }

    /* renamed from: b */
    private final void m7756b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C1212b5) {
            C1212b5.m7583c();
            throw null;
        }
        if (key.mo7824a()) {
            Object m7749a = m7749a((C1241d4<T>) key);
            if (m7749a == null) {
                m7749a = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) m7749a).add(m7750a(it.next()));
            }
            this.f6562a.m8313a((C1450r6<T, Object>) key, (T) m7749a);
            return;
        }
        if (key.mo7825b() != EnumC1230c8.MESSAGE) {
            this.f6562a.m8313a((C1450r6<T, Object>) key, (T) m7750a(value));
            return;
        }
        Object m7749a2 = m7749a((C1241d4<T>) key);
        if (m7749a2 == null) {
            this.f6562a.m8313a((C1450r6<T, Object>) key, (T) m7750a(value));
        } else {
            this.f6562a.m8313a((C1450r6<T, Object>) key, (T) (m7749a2 instanceof InterfaceC1288g6 ? key.mo7823a((InterfaceC1288g6) m7749a2, (InterfaceC1288g6) value) : key.mo7822a(((InterfaceC1533x5) m7749a2).mo8096g(), (InterfaceC1533x5) value).mo7537i()));
        }
    }

    /* renamed from: c */
    private static int m7757c(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo7825b() != EnumC1230c8.MESSAGE || key.mo7824a() || key.mo7826c()) {
            return m7747a((InterfaceC1271f4<?>) key, value);
        }
        boolean z = value instanceof C1212b5;
        int zza = entry.getKey().zza();
        return z ? AbstractC1503v3.m8538b(zza, (C1212b5) value) : AbstractC1503v3.m8539b(zza, (InterfaceC1533x5) value);
    }

    /* renamed from: g */
    public static <T extends InterfaceC1271f4<T>> C1241d4<T> m7758g() {
        return f6561d;
    }

    /* renamed from: a */
    public final void m7759a() {
        if (this.f6563b) {
            return;
        }
        this.f6562a.mo8315a();
        this.f6563b = true;
    }

    /* renamed from: a */
    public final void m7760a(C1241d4<T> c1241d4) {
        for (int i = 0; i < c1241d4.f6562a.m8317c(); i++) {
            m7756b(c1241d4.f6562a.m8314a(i));
        }
        Iterator<Map.Entry<T, Object>> it = c1241d4.f6562a.m8318d().iterator();
        while (it.hasNext()) {
            m7756b(it.next());
        }
    }

    /* renamed from: b */
    public final boolean m7761b() {
        return this.f6563b;
    }

    /* renamed from: c */
    public final Iterator<Map.Entry<T, Object>> m7762c() {
        return this.f6564c ? new C1227c5(this.f6562a.entrySet().iterator()) : this.f6562a.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() {
        C1241d4 c1241d4 = new C1241d4();
        for (int i = 0; i < this.f6562a.m8317c(); i++) {
            Map.Entry<T, Object> m8314a = this.f6562a.m8314a(i);
            c1241d4.m7755b((C1241d4) m8314a.getKey(), m8314a.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f6562a.m8318d()) {
            c1241d4.m7755b((C1241d4) entry.getKey(), entry.getValue());
        }
        c1241d4.f6564c = this.f6564c;
        return c1241d4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final Iterator<Map.Entry<T, Object>> m7763d() {
        return this.f6564c ? new C1227c5(this.f6562a.m8319e().iterator()) : this.f6562a.m8319e().iterator();
    }

    /* renamed from: e */
    public final boolean m7764e() {
        for (int i = 0; i < this.f6562a.m8317c(); i++) {
            if (!m7753a((Map.Entry) this.f6562a.m8314a(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f6562a.m8318d().iterator();
        while (it.hasNext()) {
            if (!m7753a((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1241d4) {
            return this.f6562a.equals(((C1241d4) obj).f6562a);
        }
        return false;
    }

    /* renamed from: f */
    public final int m7765f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f6562a.m8317c(); i2++) {
            i += m7757c(this.f6562a.m8314a(i2));
        }
        Iterator<Map.Entry<T, Object>> it = this.f6562a.m8318d().iterator();
        while (it.hasNext()) {
            i += m7757c(it.next());
        }
        return i;
    }

    public final int hashCode() {
        return this.f6562a.hashCode();
    }
}
