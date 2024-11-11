package p000;

import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0573g;
import com.bumptech.glide.load.InterfaceC0578l;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: nb */
/* loaded from: classes.dex */
class C2983nb implements InterfaceC0573g {

    /* renamed from: b */
    private final Object f12301b;

    /* renamed from: c */
    private final int f12302c;

    /* renamed from: d */
    private final int f12303d;

    /* renamed from: e */
    private final Class<?> f12304e;

    /* renamed from: f */
    private final Class<?> f12305f;

    /* renamed from: g */
    private final InterfaceC0573g f12306g;

    /* renamed from: h */
    private final Map<Class<?>, InterfaceC0578l<?>> f12307h;

    /* renamed from: i */
    private final C0575i f12308i;

    /* renamed from: j */
    private int f12309j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2983nb(Object obj, InterfaceC0573g interfaceC0573g, int i, int i2, Map<Class<?>, InterfaceC0578l<?>> map, Class<?> cls, Class<?> cls2, C0575i c0575i) {
        C2816ji.m13459a(obj);
        this.f12301b = obj;
        C2816ji.m13460a(interfaceC0573g, "Signature must not be null");
        this.f12306g = interfaceC0573g;
        this.f12302c = i;
        this.f12303d = i2;
        C2816ji.m13459a(map);
        this.f12307h = map;
        C2816ji.m13460a(cls, "Resource class must not be null");
        this.f12304e = cls;
        C2816ji.m13460a(cls2, "Transcode class must not be null");
        this.f12305f = cls2;
        C2816ji.m13459a(c0575i);
        this.f12308i = c0575i;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    /* renamed from: a */
    public void mo3954a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public boolean equals(Object obj) {
        if (!(obj instanceof C2983nb)) {
            return false;
        }
        C2983nb c2983nb = (C2983nb) obj;
        return this.f12301b.equals(c2983nb.f12301b) && this.f12306g.equals(c2983nb.f12306g) && this.f12303d == c2983nb.f12303d && this.f12302c == c2983nb.f12302c && this.f12307h.equals(c2983nb.f12307h) && this.f12304e.equals(c2983nb.f12304e) && this.f12305f.equals(c2983nb.f12305f) && this.f12308i.equals(c2983nb.f12308i);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public int hashCode() {
        if (this.f12309j == 0) {
            int hashCode = this.f12301b.hashCode();
            this.f12309j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f12306g.hashCode();
            this.f12309j = hashCode2;
            int i = (hashCode2 * 31) + this.f12302c;
            this.f12309j = i;
            int i2 = (i * 31) + this.f12303d;
            this.f12309j = i2;
            int hashCode3 = (i2 * 31) + this.f12307h.hashCode();
            this.f12309j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f12304e.hashCode();
            this.f12309j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f12305f.hashCode();
            this.f12309j = hashCode5;
            this.f12309j = (hashCode5 * 31) + this.f12308i.hashCode();
        }
        return this.f12309j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f12301b + ", width=" + this.f12302c + ", height=" + this.f12303d + ", resourceClass=" + this.f12304e + ", transcodeClass=" + this.f12305f + ", signature=" + this.f12306g + ", hashCode=" + this.f12309j + ", transformations=" + this.f12307h + ", options=" + this.f12308i + '}';
    }
}
