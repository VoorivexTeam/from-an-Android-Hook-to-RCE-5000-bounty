package p000;

/* renamed from: yv */
/* loaded from: classes.dex */
public abstract class AbstractC3501yv {

    /* renamed from: a */
    private final int f14287a;

    /* renamed from: b */
    private final int f14288b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3501yv(int i, int i2) {
        this.f14287a = i;
        this.f14288b = i2;
    }

    /* renamed from: a */
    public final int m16665a() {
        return this.f14288b;
    }

    /* renamed from: a */
    public abstract byte[] mo3447a(int i, byte[] bArr);

    /* renamed from: b */
    public abstract byte[] mo3448b();

    /* renamed from: c */
    public final int m16666c() {
        return this.f14287a;
    }

    /* renamed from: d */
    public boolean m16667d() {
        return false;
    }

    /* renamed from: e */
    public AbstractC3501yv m16668e() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f14287a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f14288b * (i + 1));
        for (int i2 = 0; i2 < this.f14288b; i2++) {
            bArr = mo3447a(i2, bArr);
            for (int i3 = 0; i3 < this.f14287a; i3++) {
                int i4 = bArr[i3] & 255;
                sb.append(i4 < 64 ? '#' : i4 < 128 ? '+' : i4 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
