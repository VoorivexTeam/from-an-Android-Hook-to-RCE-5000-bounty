package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0569c;
import com.bumptech.glide.load.InterfaceC0577k;
import java.io.File;

/* renamed from: he */
/* loaded from: classes.dex */
public class C2550he implements InterfaceC0577k<BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC2427ec f10479a;

    /* renamed from: b */
    private final InterfaceC0577k<Bitmap> f10480b;

    public C2550he(InterfaceC2427ec interfaceC2427ec, InterfaceC0577k<Bitmap> interfaceC0577k) {
        this.f10479a = interfaceC2427ec;
        this.f10480b = interfaceC0577k;
    }

    @Override // com.bumptech.glide.load.InterfaceC0577k
    /* renamed from: a */
    public EnumC0569c mo3966a(C0575i c0575i) {
        return this.f10480b.mo3966a(c0575i);
    }

    @Override // com.bumptech.glide.load.InterfaceC0570d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean mo3950a(InterfaceC3353vb<BitmapDrawable> interfaceC3353vb, File file, C0575i c0575i) {
        return this.f10480b.mo3950a(new C2812je(interfaceC3353vb.get().getBitmap(), this.f10479a), file, c0575i);
    }
}
