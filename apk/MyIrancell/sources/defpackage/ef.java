package defpackage;

/* loaded from: classes.dex */
public class ef implements vb<byte[]> {
    private final byte[] b;

    public ef(byte[] bArr) {
        ji.a(bArr);
        this.b = bArr;
    }

    @Override // defpackage.vb
    public void b() {
    }

    @Override // defpackage.vb
    public int c() {
        return this.b.length;
    }

    @Override // defpackage.vb
    public Class<byte[]> d() {
        return byte[].class;
    }

    @Override // defpackage.vb
    public byte[] get() {
        return this.b;
    }
}
