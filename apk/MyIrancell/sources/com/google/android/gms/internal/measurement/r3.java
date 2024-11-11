package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r3 extends o3 {
    protected final byte[] e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r3(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.e = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public byte a(int i) {
        return this.e[i];
    }

    @Override // com.google.android.gms.internal.measurement.h3
    protected final int a(int i, int i2, int i3) {
        return r4.a(i, this.e, c(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final h3 a(int i, int i2) {
        int b = h3.b(0, i2, zza());
        return b == 0 ? h3.c : new k3(this.e, c(), b);
    }

    @Override // com.google.android.gms.internal.measurement.h3
    protected final String a(Charset charset) {
        return new String(this.e, c(), zza(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h3
    public final void a(e3 e3Var) {
        e3Var.a(this.e, c(), zza());
    }

    final boolean a(h3 h3Var, int i, int i2) {
        if (i2 > h3Var.zza()) {
            int zza = zza();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zza);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > h3Var.zza()) {
            int zza2 = h3Var.zza();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zza2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(h3Var instanceof r3)) {
            return h3Var.a(0, i2).equals(a(0, i2));
        }
        r3 r3Var = (r3) h3Var;
        byte[] bArr = this.e;
        byte[] bArr2 = r3Var.e;
        int c = c() + i2;
        int c2 = c();
        int c3 = r3Var.c();
        while (c2 < c) {
            if (bArr[c2] != bArr2[c3]) {
                return false;
            }
            c2++;
            c3++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h3
    public byte b(int i) {
        return this.e[i];
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final boolean b() {
        int c = c();
        return q7.a(this.e, c, zza() + c);
    }

    protected int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h3) || zza() != ((h3) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return obj.equals(this);
        }
        r3 r3Var = (r3) obj;
        int a = a();
        int a2 = r3Var.a();
        if (a == 0 || a2 == 0 || a == a2) {
            return a(r3Var, 0, zza());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.h3
    public int zza() {
        return this.e.length;
    }
}
