package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k3 extends r3 {
    private final int f;
    private final int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k3(byte[] bArr, int i, int i2) {
        super(bArr);
        h3.b(i, i + i2, bArr.length);
        this.f = i;
        this.g = i2;
    }

    @Override // com.google.android.gms.internal.measurement.r3, com.google.android.gms.internal.measurement.h3
    public final byte a(int i) {
        int zza = zza();
        if (((zza - (i + 1)) | i) >= 0) {
            return this.e[this.f + i];
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
    @Override // com.google.android.gms.internal.measurement.r3, com.google.android.gms.internal.measurement.h3
    public final byte b(int i) {
        return this.e[this.f + i];
    }

    @Override // com.google.android.gms.internal.measurement.r3
    protected final int c() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.measurement.r3, com.google.android.gms.internal.measurement.h3
    public final int zza() {
        return this.g;
    }
}
