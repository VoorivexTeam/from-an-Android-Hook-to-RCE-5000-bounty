package p000;

import java.util.List;

/* renamed from: kz */
/* loaded from: classes.dex */
public final class C2878kz {

    /* renamed from: a */
    private final byte[] f11771a;

    /* renamed from: b */
    private final String f11772b;

    /* renamed from: c */
    private final List<byte[]> f11773c;

    /* renamed from: d */
    private final String f11774d;

    /* renamed from: e */
    private Object f11775e;

    /* renamed from: f */
    private final int f11776f;

    /* renamed from: g */
    private final int f11777g;

    public C2878kz(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public C2878kz(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f11771a = bArr;
        this.f11772b = str;
        this.f11773c = list;
        this.f11774d = str2;
        this.f11776f = i2;
        this.f11777g = i;
    }

    /* renamed from: a */
    public List<byte[]> m13753a() {
        return this.f11773c;
    }

    /* renamed from: a */
    public void m13754a(Integer num) {
    }

    /* renamed from: a */
    public void m13755a(Object obj) {
        this.f11775e = obj;
    }

    /* renamed from: b */
    public String m13756b() {
        return this.f11774d;
    }

    /* renamed from: b */
    public void m13757b(Integer num) {
    }

    /* renamed from: c */
    public Object m13758c() {
        return this.f11775e;
    }

    /* renamed from: d */
    public byte[] m13759d() {
        return this.f11771a;
    }

    /* renamed from: e */
    public int m13760e() {
        return this.f11776f;
    }

    /* renamed from: f */
    public int m13761f() {
        return this.f11777g;
    }

    /* renamed from: g */
    public String m13762g() {
        return this.f11772b;
    }

    /* renamed from: h */
    public boolean m13763h() {
        return this.f11776f >= 0 && this.f11777g >= 0;
    }
}
