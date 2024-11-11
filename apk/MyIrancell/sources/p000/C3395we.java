package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: we */
/* loaded from: classes.dex */
public final class C3395we implements InterfaceC3353vb<BitmapDrawable>, InterfaceC3160rb {

    /* renamed from: b */
    private final Resources f13834b;

    /* renamed from: c */
    private final InterfaceC3353vb<Bitmap> f13835c;

    private C3395we(Resources resources, InterfaceC3353vb<Bitmap> interfaceC3353vb) {
        C2816ji.m13459a(resources);
        this.f13834b = resources;
        C2816ji.m13459a(interfaceC3353vb);
        this.f13835c = interfaceC3353vb;
    }

    /* renamed from: a */
    public static InterfaceC3353vb<BitmapDrawable> m16210a(Resources resources, InterfaceC3353vb<Bitmap> interfaceC3353vb) {
        if (interfaceC3353vb == null) {
            return null;
        }
        return new C3395we(resources, interfaceC3353vb);
    }

    @Override // p000.InterfaceC3160rb
    /* renamed from: a */
    public void mo11998a() {
        InterfaceC3353vb<Bitmap> interfaceC3353vb = this.f13835c;
        if (interfaceC3353vb instanceof InterfaceC3160rb) {
            ((InterfaceC3160rb) interfaceC3353vb).mo11998a();
        }
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: b */
    public void mo3383b() {
        this.f13835c.mo3383b();
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: c */
    public int mo3384c() {
        return this.f13835c.mo3384c();
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: d */
    public Class<BitmapDrawable> mo3385d() {
        return BitmapDrawable.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.InterfaceC3353vb
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f13834b, this.f13835c.get());
    }
}
