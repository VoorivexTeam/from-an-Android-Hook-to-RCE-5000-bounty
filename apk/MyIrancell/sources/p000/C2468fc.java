package p000;

import android.graphics.Bitmap;

/* renamed from: fc */
/* loaded from: classes.dex */
public class C2468fc implements InterfaceC2427ec {
    @Override // p000.InterfaceC2427ec
    /* renamed from: a */
    public Bitmap mo11588a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC2427ec
    /* renamed from: a */
    public void mo11589a() {
    }

    @Override // p000.InterfaceC2427ec
    /* renamed from: a */
    public void mo11590a(int i) {
    }

    @Override // p000.InterfaceC2427ec
    /* renamed from: a */
    public void mo11591a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p000.InterfaceC2427ec
    /* renamed from: b */
    public Bitmap mo11592b(int i, int i2, Bitmap.Config config) {
        return mo11588a(i, i2, config);
    }
}
