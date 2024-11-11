package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0576j;

/* renamed from: ye */
/* loaded from: classes.dex */
public class C3484ye implements InterfaceC0576j<Uri, Bitmap> {

    /* renamed from: a */
    private final C2593if f14136a;

    /* renamed from: b */
    private final InterfaceC2427ec f14137b;

    public C3484ye(C2593if c2593if, InterfaceC2427ec interfaceC2427ec) {
        this.f14136a = c2593if;
        this.f14137b = interfaceC2427ec;
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3353vb<Bitmap> mo3381a(Uri uri, int i, int i2, C0575i c0575i) {
        InterfaceC3353vb<Drawable> mo3381a = this.f14136a.mo3381a(uri, i, i2, c0575i);
        if (mo3381a == null) {
            return null;
        }
        return C3163re.m15260a(this.f14137b, mo3381a.get(), i, i2);
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo3382a(Uri uri, C0575i c0575i) {
        return "android.resource".equals(uri.getScheme());
    }
}
