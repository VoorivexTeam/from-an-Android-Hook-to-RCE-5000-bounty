package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C0575i;

/* renamed from: xf */
/* loaded from: classes.dex */
public class C3436xf implements InterfaceC0020ag<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f14048a;

    public C3436xf(Resources resources) {
        C2816ji.m13459a(resources);
        this.f14048a = resources;
    }

    @Override // p000.InterfaceC0020ag
    /* renamed from: a */
    public InterfaceC3353vb<BitmapDrawable> mo152a(InterfaceC3353vb<Bitmap> interfaceC3353vb, C0575i c0575i) {
        return C3395we.m16210a(this.f14048a, interfaceC3353vb);
    }
}
