package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C0575i;

/* renamed from: yf */
/* loaded from: classes.dex */
public final class C3485yf implements InterfaceC0020ag<Drawable, byte[]> {

    /* renamed from: a */
    private final InterfaceC2427ec f14138a;

    /* renamed from: b */
    private final InterfaceC0020ag<Bitmap, byte[]> f14139b;

    /* renamed from: c */
    private final InterfaceC0020ag<C3033of, byte[]> f14140c;

    public C3485yf(InterfaceC2427ec interfaceC2427ec, InterfaceC0020ag<Bitmap, byte[]> interfaceC0020ag, InterfaceC0020ag<C3033of, byte[]> interfaceC0020ag2) {
        this.f14138a = interfaceC2427ec;
        this.f14139b = interfaceC0020ag;
        this.f14140c = interfaceC0020ag2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static InterfaceC3353vb<C3033of> m16626a(InterfaceC3353vb<Drawable> interfaceC3353vb) {
        return interfaceC3353vb;
    }

    @Override // p000.InterfaceC0020ag
    /* renamed from: a */
    public InterfaceC3353vb<byte[]> mo152a(InterfaceC3353vb<Drawable> interfaceC3353vb, C0575i c0575i) {
        Drawable drawable = interfaceC3353vb.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f14139b.mo152a(C2812je.m13456a(((BitmapDrawable) drawable).getBitmap(), this.f14138a), c0575i);
        }
        if (!(drawable instanceof C3033of)) {
            return null;
        }
        InterfaceC0020ag<C3033of, byte[]> interfaceC0020ag = this.f14140c;
        m16626a(interfaceC3353vb);
        return interfaceC0020ag.mo152a(interfaceC3353vb, c0575i);
    }
}
