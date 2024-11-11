package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.h3 */
/* loaded from: classes.dex */
public abstract class AbstractC1300h3 implements Serializable, Iterable<Byte> {

    /* renamed from: c */
    public static final AbstractC1300h3 f6635c = new C1447r3(C1448r4.f6863b);

    /* renamed from: d */
    private static final InterfaceC1390n3 f6636d;

    /* renamed from: b */
    private int f6637b = 0;

    static {
        C1285g3 c1285g3 = null;
        f6636d = C1195a3.m7528a() ? new C1433q3(c1285g3) : new C1360l3(c1285g3);
        new C1330j3();
    }

    /* renamed from: a */
    public static AbstractC1300h3 m7868a(String str) {
        return new C1447r3(str.getBytes(C1448r4.f6862a));
    }

    /* renamed from: a */
    public static AbstractC1300h3 m7869a(byte[] bArr, int i, int i2) {
        m7871b(i, i + i2, bArr.length);
        return new C1447r3(f6636d.mo7960a(bArr, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m7870b(byte b) {
        return b & 255;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m7871b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1419p3 m7872c(int i) {
        return new C1419p3(i, null);
    }

    /* renamed from: a */
    public abstract byte mo7873a(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final int m7874a() {
        return this.f6637b;
    }

    /* renamed from: a */
    protected abstract int mo7875a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract AbstractC1300h3 mo7876a(int i, int i2);

    /* renamed from: a */
    protected abstract String mo7877a(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo7878a(AbstractC1255e3 abstractC1255e3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte mo7879b(int i);

    /* renamed from: b */
    public abstract boolean mo7880b();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f6637b;
        if (i == 0) {
            int zza = zza();
            i = mo7875a(zza, 0, zza);
            if (i == 0) {
                i = 1;
            }
            this.f6637b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C1285g3(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zza());
        objArr[2] = zza() <= 50 ? C1259e7.m7801a(this) : String.valueOf(C1259e7.m7801a(mo7876a(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract int zza();

    public final String zzb() {
        return zza() == 0 ? "" : mo7877a(C1448r4.f6862a);
    }
}
