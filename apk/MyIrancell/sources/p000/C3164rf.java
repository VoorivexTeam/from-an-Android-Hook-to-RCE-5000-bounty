package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0558c;
import com.bumptech.glide.load.InterfaceC0578l;
import java.security.MessageDigest;

/* renamed from: rf */
/* loaded from: classes.dex */
public class C3164rf implements InterfaceC0578l<C3033of> {

    /* renamed from: b */
    private final InterfaceC0578l<Bitmap> f12959b;

    public C3164rf(InterfaceC0578l<Bitmap> interfaceC0578l) {
        C2816ji.m13459a(interfaceC0578l);
        this.f12959b = interfaceC0578l;
    }

    @Override // com.bumptech.glide.load.InterfaceC0578l
    /* renamed from: a */
    public InterfaceC3353vb<C3033of> mo3967a(Context context, InterfaceC3353vb<C3033of> interfaceC3353vb, int i, int i2) {
        C3033of c3033of = interfaceC3353vb.get();
        InterfaceC3353vb<Bitmap> c2812je = new C2812je(c3033of.m14510c(), ComponentCallbacks2C0558c.m3866b(context).m3877c());
        InterfaceC3353vb<Bitmap> mo3967a = this.f12959b.mo3967a(context, c2812je, i, i2);
        if (!c2812je.equals(mo3967a)) {
            c2812je.mo3383b();
        }
        c3033of.m14508a(this.f12959b, mo3967a.get());
        return interfaceC3353vb;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    /* renamed from: a */
    public void mo3954a(MessageDigest messageDigest) {
        this.f12959b.mo3954a(messageDigest);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public boolean equals(Object obj) {
        if (obj instanceof C3164rf) {
            return this.f12959b.equals(((C3164rf) obj).f12959b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public int hashCode() {
        return this.f12959b.hashCode();
    }
}
