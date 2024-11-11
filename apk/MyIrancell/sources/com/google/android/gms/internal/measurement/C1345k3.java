package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.k3 */
/* loaded from: classes.dex */
public final class C1345k3 extends C1447r3 {

    /* renamed from: f */
    private final int f6694f;

    /* renamed from: g */
    private final int f6695g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1345k3(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC1300h3.m7871b(i, i + i2, bArr.length);
        this.f6694f = i;
        this.f6695g = i2;
    }

    @Override // com.google.android.gms.internal.measurement.C1447r3, com.google.android.gms.internal.measurement.AbstractC1300h3
    /* renamed from: a */
    public final byte mo7873a(int i) {
        int zza = zza();
        if (((zza - (i + 1)) | i) >= 0) {
            return this.f6861e[this.f6694f + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(zza);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C1447r3, com.google.android.gms.internal.measurement.AbstractC1300h3
    /* renamed from: b */
    public final byte mo7879b(int i) {
        return this.f6861e[this.f6694f + i];
    }

    @Override // com.google.android.gms.internal.measurement.C1447r3
    /* renamed from: c */
    protected final int mo7949c() {
        return this.f6694f;
    }

    @Override // com.google.android.gms.internal.measurement.C1447r3, com.google.android.gms.internal.measurement.AbstractC1300h3
    public final int zza() {
        return this.f6695g;
    }
}
