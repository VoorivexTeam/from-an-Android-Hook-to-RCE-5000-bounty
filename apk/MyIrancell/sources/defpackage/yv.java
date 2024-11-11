package defpackage;

/* loaded from: classes.dex */
public abstract class yv {
    private final int a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public yv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public abstract byte[] a(int i, byte[] bArr);

    public abstract byte[] b();

    public final int c() {
        return this.a;
    }

    public boolean d() {
        return false;
    }

    public yv e() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.b * (i + 1));
        for (int i2 = 0; i2 < this.b; i2++) {
            bArr = a(i2, bArr);
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = bArr[i3] & 255;
                sb.append(i4 < 64 ? '#' : i4 < 128 ? '+' : i4 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
