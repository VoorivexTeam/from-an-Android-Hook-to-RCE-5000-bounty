package defpackage;

import android.graphics.Bitmap;
import defpackage.ca;

/* loaded from: classes.dex */
public final class nf implements ca.a {
    private final ec a;
    private final bc b;

    public nf(ec ecVar, bc bcVar) {
        this.a = ecVar;
        this.b = bcVar;
    }

    @Override // ca.a
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.a.b(i, i2, config);
    }

    @Override // ca.a
    public void a(Bitmap bitmap) {
        this.a.a(bitmap);
    }

    @Override // ca.a
    public void a(byte[] bArr) {
        bc bcVar = this.b;
        if (bcVar == null) {
            return;
        }
        bcVar.a((bc) bArr);
    }

    @Override // ca.a
    public void a(int[] iArr) {
        bc bcVar = this.b;
        if (bcVar == null) {
            return;
        }
        bcVar.a((bc) iArr);
    }

    @Override // ca.a
    public byte[] a(int i) {
        bc bcVar = this.b;
        return bcVar == null ? new byte[i] : (byte[]) bcVar.b(i, byte[].class);
    }

    @Override // ca.a
    public int[] b(int i) {
        bc bcVar = this.b;
        return bcVar == null ? new int[i] : (int[]) bcVar.b(i, int[].class);
    }
}
