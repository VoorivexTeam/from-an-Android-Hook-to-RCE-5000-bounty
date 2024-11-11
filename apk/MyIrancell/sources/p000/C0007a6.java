package p000;

/* renamed from: a6 */
/* loaded from: classes.dex */
public class C0007a6 {

    /* renamed from: a */
    public final String f34a;

    /* renamed from: b */
    public final String f35b;

    /* renamed from: c */
    public final float f36c;

    /* renamed from: d */
    public final a f37d;

    /* renamed from: e */
    public final int f38e;

    /* renamed from: f */
    public final float f39f;

    /* renamed from: g */
    public final float f40g;

    /* renamed from: h */
    public final int f41h;

    /* renamed from: i */
    public final int f42i;

    /* renamed from: j */
    public final float f43j;

    /* renamed from: k */
    public final boolean f44k;

    /* renamed from: a6$a */
    /* loaded from: classes.dex */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C0007a6(String str, String str2, float f, a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f34a = str;
        this.f35b = str2;
        this.f36c = f;
        this.f37d = aVar;
        this.f38e = i;
        this.f39f = f2;
        this.f40g = f3;
        this.f41h = i2;
        this.f42i = i3;
        this.f43j = f4;
        this.f44k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f34a.hashCode() * 31) + this.f35b.hashCode()) * 31) + this.f36c)) * 31) + this.f37d.ordinal()) * 31) + this.f38e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f39f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f41h;
    }
}
