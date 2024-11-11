package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C0558c;
import com.bumptech.glide.load.InterfaceC0578l;
import java.security.MessageDigest;

/* renamed from: se */
/* loaded from: classes.dex */
public class C3207se implements InterfaceC0578l<Drawable> {

    /* renamed from: b */
    private final InterfaceC0578l<Bitmap> f13091b;

    /* renamed from: c */
    private final boolean f13092c;

    public C3207se(InterfaceC0578l<Bitmap> interfaceC0578l, boolean z) {
        this.f13091b = interfaceC0578l;
        this.f13092c = z;
    }

    /* renamed from: a */
    private InterfaceC3353vb<Drawable> m15406a(Context context, InterfaceC3353vb<Bitmap> interfaceC3353vb) {
        return C3395we.m16210a(context.getResources(), interfaceC3353vb);
    }

    /* renamed from: a */
    public InterfaceC0578l<BitmapDrawable> m15407a() {
        return this;
    }

    @Override // com.bumptech.glide.load.InterfaceC0578l
    /* renamed from: a */
    public InterfaceC3353vb<Drawable> mo3967a(Context context, InterfaceC3353vb<Drawable> interfaceC3353vb, int i, int i2) {
        InterfaceC2427ec m3877c = ComponentCallbacks2C0558c.m3866b(context).m3877c();
        Drawable drawable = interfaceC3353vb.get();
        InterfaceC3353vb<Bitmap> m15260a = C3163re.m15260a(m3877c, drawable, i, i2);
        if (m15260a != null) {
            InterfaceC3353vb<Bitmap> mo3967a = this.f13091b.mo3967a(context, m15260a, i, i2);
            if (!mo3967a.equals(m15260a)) {
                return m15406a(context, mo3967a);
            }
            mo3967a.mo3383b();
            return interfaceC3353vb;
        }
        if (!this.f13092c) {
            return interfaceC3353vb;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    /* renamed from: a */
    public void mo3954a(MessageDigest messageDigest) {
        this.f13091b.mo3954a(messageDigest);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public boolean equals(Object obj) {
        if (obj instanceof C3207se) {
            return this.f13091b.equals(((C3207se) obj).f13091b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public int hashCode() {
        return this.f13091b.hashCode();
    }
}
