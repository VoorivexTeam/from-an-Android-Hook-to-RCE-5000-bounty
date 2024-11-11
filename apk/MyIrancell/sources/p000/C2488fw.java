package p000;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: fw */
/* loaded from: classes.dex */
public final class C2488fw {

    /* renamed from: a */
    private final String f10152a;

    /* renamed from: b */
    private final byte[] f10153b;

    /* renamed from: c */
    private C2568hw[] f10154c;

    /* renamed from: d */
    private final EnumC3224sv f10155d;

    /* renamed from: e */
    private Map<EnumC2528gw, Object> f10156e;

    /* renamed from: f */
    private final long f10157f;

    public C2488fw(String str, byte[] bArr, C2568hw[] c2568hwArr, EnumC3224sv enumC3224sv) {
        this(str, bArr, c2568hwArr, enumC3224sv, System.currentTimeMillis());
    }

    public C2488fw(String str, byte[] bArr, C2568hw[] c2568hwArr, EnumC3224sv enumC3224sv, long j) {
        this.f10152a = str;
        this.f10153b = bArr;
        this.f10154c = c2568hwArr;
        this.f10155d = enumC3224sv;
        this.f10156e = null;
        this.f10157f = j;
    }

    /* renamed from: a */
    public EnumC3224sv m11835a() {
        return this.f10155d;
    }

    /* renamed from: a */
    public void m11836a(EnumC2528gw enumC2528gw, Object obj) {
        if (this.f10156e == null) {
            this.f10156e = new EnumMap(EnumC2528gw.class);
        }
        this.f10156e.put(enumC2528gw, obj);
    }

    /* renamed from: a */
    public void m11837a(Map<EnumC2528gw, Object> map) {
        if (map != null) {
            Map<EnumC2528gw, Object> map2 = this.f10156e;
            if (map2 == null) {
                this.f10156e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: a */
    public void m11838a(C2568hw[] c2568hwArr) {
        C2568hw[] c2568hwArr2 = this.f10154c;
        if (c2568hwArr2 == null) {
            this.f10154c = c2568hwArr;
            return;
        }
        if (c2568hwArr == null || c2568hwArr.length <= 0) {
            return;
        }
        C2568hw[] c2568hwArr3 = new C2568hw[c2568hwArr2.length + c2568hwArr.length];
        System.arraycopy(c2568hwArr2, 0, c2568hwArr3, 0, c2568hwArr2.length);
        System.arraycopy(c2568hwArr, 0, c2568hwArr3, c2568hwArr2.length, c2568hwArr.length);
        this.f10154c = c2568hwArr3;
    }

    /* renamed from: b */
    public byte[] m11839b() {
        return this.f10153b;
    }

    /* renamed from: c */
    public Map<EnumC2528gw, Object> m11840c() {
        return this.f10156e;
    }

    /* renamed from: d */
    public C2568hw[] m11841d() {
        return this.f10154c;
    }

    /* renamed from: e */
    public String m11842e() {
        return this.f10152a;
    }

    /* renamed from: f */
    public long m11843f() {
        return this.f10157f;
    }

    public String toString() {
        return this.f10152a;
    }
}
