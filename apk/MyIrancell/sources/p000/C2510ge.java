package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0576j;

/* renamed from: ge */
/* loaded from: classes.dex */
public class C2510ge<DataType> implements InterfaceC0576j<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC0576j<DataType, Bitmap> f10316a;

    /* renamed from: b */
    private final Resources f10317b;

    public C2510ge(Resources resources, InterfaceC0576j<DataType, Bitmap> interfaceC0576j) {
        C2816ji.m13459a(resources);
        this.f10317b = resources;
        C2816ji.m13459a(interfaceC0576j);
        this.f10316a = interfaceC0576j;
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a */
    public InterfaceC3353vb<BitmapDrawable> mo3381a(DataType datatype, int i, int i2, C0575i c0575i) {
        return C3395we.m16210a(this.f10317b, this.f10316a.mo3381a(datatype, i, i2, c0575i));
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a */
    public boolean mo3382a(DataType datatype, C0575i c0575i) {
        return this.f10316a.mo3382a(datatype, c0575i);
    }
}
