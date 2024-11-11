package p000;

/* renamed from: ef */
/* loaded from: classes.dex */
public class C2430ef implements InterfaceC3353vb<byte[]> {

    /* renamed from: b */
    private final byte[] f10011b;

    public C2430ef(byte[] bArr) {
        C2816ji.m13459a(bArr);
        this.f10011b = bArr;
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: b */
    public void mo3383b() {
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: c */
    public int mo3384c() {
        return this.f10011b.length;
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: d */
    public Class<byte[]> mo3385d() {
        return byte[].class;
    }

    @Override // p000.InterfaceC3353vb
    public byte[] get() {
        return this.f10011b;
    }
}
