package p000;

import android.graphics.Bitmap;

/* renamed from: je */
/* loaded from: classes.dex */
public class C2812je implements InterfaceC3353vb<Bitmap>, InterfaceC3160rb {

    /* renamed from: b */
    private final Bitmap f11512b;

    /* renamed from: c */
    private final InterfaceC2427ec f11513c;

    public C2812je(Bitmap bitmap, InterfaceC2427ec interfaceC2427ec) {
        C2816ji.m13460a(bitmap, "Bitmap must not be null");
        this.f11512b = bitmap;
        C2816ji.m13460a(interfaceC2427ec, "BitmapPool must not be null");
        this.f11513c = interfaceC2427ec;
    }

    /* renamed from: a */
    public static C2812je m13456a(Bitmap bitmap, InterfaceC2427ec interfaceC2427ec) {
        if (bitmap == null) {
            return null;
        }
        return new C2812je(bitmap, interfaceC2427ec);
    }

    @Override // p000.InterfaceC3160rb
    /* renamed from: a */
    public void mo11998a() {
        this.f11512b.prepareToDraw();
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: b */
    public void mo3383b() {
        this.f11513c.mo11591a(this.f11512b);
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: c */
    public int mo3384c() {
        return C2861ki.m13721a(this.f11512b);
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: d */
    public Class<Bitmap> mo3385d() {
        return Bitmap.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.InterfaceC3353vb
    public Bitmap get() {
        return this.f11512b;
    }
}
