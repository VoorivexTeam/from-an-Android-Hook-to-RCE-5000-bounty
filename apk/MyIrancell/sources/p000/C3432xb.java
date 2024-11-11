package p000;

import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0573g;
import com.bumptech.glide.load.InterfaceC0578l;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: xb */
/* loaded from: classes.dex */
final class C3432xb implements InterfaceC0573g {

    /* renamed from: j */
    private static final C2514gi<Class<?>, byte[]> f14024j = new C2514gi<>(50);

    /* renamed from: b */
    private final InterfaceC0475bc f14025b;

    /* renamed from: c */
    private final InterfaceC0573g f14026c;

    /* renamed from: d */
    private final InterfaceC0573g f14027d;

    /* renamed from: e */
    private final int f14028e;

    /* renamed from: f */
    private final int f14029f;

    /* renamed from: g */
    private final Class<?> f14030g;

    /* renamed from: h */
    private final C0575i f14031h;

    /* renamed from: i */
    private final InterfaceC0578l<?> f14032i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3432xb(InterfaceC0475bc interfaceC0475bc, InterfaceC0573g interfaceC0573g, InterfaceC0573g interfaceC0573g2, int i, int i2, InterfaceC0578l<?> interfaceC0578l, Class<?> cls, C0575i c0575i) {
        this.f14025b = interfaceC0475bc;
        this.f14026c = interfaceC0573g;
        this.f14027d = interfaceC0573g2;
        this.f14028e = i;
        this.f14029f = i2;
        this.f14032i = interfaceC0578l;
        this.f14030g = cls;
        this.f14031h = c0575i;
    }

    /* renamed from: a */
    private byte[] m16483a() {
        byte[] m12001a = f14024j.m12001a((C2514gi<Class<?>, byte[]>) this.f14030g);
        if (m12001a != null) {
            return m12001a;
        }
        byte[] bytes = this.f14030g.getName().getBytes(InterfaceC0573g.f3278a);
        f14024j.m12007b(this.f14030g, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    /* renamed from: a */
    public void mo3954a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f14025b.mo3375a(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f14028e).putInt(this.f14029f).array();
        this.f14027d.mo3954a(messageDigest);
        this.f14026c.mo3954a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC0578l<?> interfaceC0578l = this.f14032i;
        if (interfaceC0578l != null) {
            interfaceC0578l.mo3954a(messageDigest);
        }
        this.f14031h.mo3954a(messageDigest);
        messageDigest.update(m16483a());
        this.f14025b.mo3378a((InterfaceC0475bc) bArr);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public boolean equals(Object obj) {
        if (!(obj instanceof C3432xb)) {
            return false;
        }
        C3432xb c3432xb = (C3432xb) obj;
        return this.f14029f == c3432xb.f14029f && this.f14028e == c3432xb.f14028e && C2861ki.m13733b(this.f14032i, c3432xb.f14032i) && this.f14030g.equals(c3432xb.f14030g) && this.f14026c.equals(c3432xb.f14026c) && this.f14027d.equals(c3432xb.f14027d) && this.f14031h.equals(c3432xb.f14031h);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public int hashCode() {
        int hashCode = (((((this.f14026c.hashCode() * 31) + this.f14027d.hashCode()) * 31) + this.f14028e) * 31) + this.f14029f;
        InterfaceC0578l<?> interfaceC0578l = this.f14032i;
        if (interfaceC0578l != null) {
            hashCode = (hashCode * 31) + interfaceC0578l.hashCode();
        }
        return (((hashCode * 31) + this.f14030g.hashCode()) * 31) + this.f14031h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f14026c + ", signature=" + this.f14027d + ", width=" + this.f14028e + ", height=" + this.f14029f + ", decodedResourceClass=" + this.f14030g + ", transformation='" + this.f14032i + "', options=" + this.f14031h + '}';
    }
}
