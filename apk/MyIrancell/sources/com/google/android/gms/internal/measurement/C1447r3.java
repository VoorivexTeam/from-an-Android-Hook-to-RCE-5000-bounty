package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.r3 */
/* loaded from: classes.dex */
public class C1447r3 extends AbstractC1405o3 {

    /* renamed from: e */
    protected final byte[] f6861e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1447r3(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.f6861e = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1300h3
    /* renamed from: a */
    public byte mo7873a(int i) {
        return this.f6861e[i];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1300h3
    /* renamed from: a */
    protected final int mo7875a(int i, int i2, int i3) {
        return C1448r4.m8287a(i, this.f6861e, mo7949c(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1300h3
    /* renamed from: a */
    public final AbstractC1300h3 mo7876a(int i, int i2) {
        int m7871b = AbstractC1300h3.m7871b(0, i2, zza());
        return m7871b == 0 ? AbstractC1300h3.f6635c : new C1345k3(this.f6861e, mo7949c(), m7871b);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1300h3
    /* renamed from: a */
    protected final String mo7877a(Charset charset) {
        return new String(this.f6861e, mo7949c(), zza(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1300h3
    /* renamed from: a */
    public final void mo7878a(AbstractC1255e3 abstractC1255e3) {
        abstractC1255e3.mo7791a(this.f6861e, mo7949c(), zza());
    }

    /* renamed from: a */
    final boolean m8286a(AbstractC1300h3 abstractC1300h3, int i, int i2) {
        if (i2 > abstractC1300h3.zza()) {
            int zza = zza();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zza);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > abstractC1300h3.zza()) {
            int zza2 = abstractC1300h3.zza();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zza2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(abstractC1300h3 instanceof C1447r3)) {
            return abstractC1300h3.mo7876a(0, i2).equals(mo7876a(0, i2));
        }
        C1447r3 c1447r3 = (C1447r3) abstractC1300h3;
        byte[] bArr = this.f6861e;
        byte[] bArr2 = c1447r3.f6861e;
        int mo7949c = mo7949c() + i2;
        int mo7949c2 = mo7949c();
        int mo7949c3 = c1447r3.mo7949c();
        while (mo7949c2 < mo7949c) {
            if (bArr[mo7949c2] != bArr2[mo7949c3]) {
                return false;
            }
            mo7949c2++;
            mo7949c3++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1300h3
    /* renamed from: b */
    public byte mo7879b(int i) {
        return this.f6861e[i];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1300h3
    /* renamed from: b */
    public final boolean mo7880b() {
        int mo7949c = mo7949c();
        return C1437q7.m8210a(this.f6861e, mo7949c, zza() + mo7949c);
    }

    /* renamed from: c */
    protected int mo7949c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1300h3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1300h3) || zza() != ((AbstractC1300h3) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (!(obj instanceof C1447r3)) {
            return obj.equals(this);
        }
        C1447r3 c1447r3 = (C1447r3) obj;
        int m7874a = m7874a();
        int m7874a2 = c1447r3.m7874a();
        if (m7874a == 0 || m7874a2 == 0 || m7874a == m7874a2) {
            return m8286a(c1447r3, 0, zza());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1300h3
    public int zza() {
        return this.f6861e.length;
    }
}
