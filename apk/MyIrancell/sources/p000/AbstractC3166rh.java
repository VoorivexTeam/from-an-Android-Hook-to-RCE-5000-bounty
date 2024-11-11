package p000;

@Deprecated
/* renamed from: rh */
/* loaded from: classes.dex */
public abstract class AbstractC3166rh<Z> extends AbstractC2943mh<Z> {

    /* renamed from: b */
    private final int f12967b;

    /* renamed from: c */
    private final int f12968c;

    public AbstractC3166rh() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public AbstractC3166rh(int i, int i2) {
        this.f12967b = i;
        this.f12968c = i2;
    }

    @Override // p000.InterfaceC3262th
    /* renamed from: a */
    public void mo15272a(InterfaceC3210sh interfaceC3210sh) {
    }

    @Override // p000.InterfaceC3262th
    /* renamed from: b */
    public final void mo15273b(InterfaceC3210sh interfaceC3210sh) {
        if (C2861ki.m13732b(this.f12967b, this.f12968c)) {
            interfaceC3210sh.mo13715a(this.f12967b, this.f12968c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f12967b + " and height: " + this.f12968c + ", either provide dimensions in the constructor or call override()");
    }
}
