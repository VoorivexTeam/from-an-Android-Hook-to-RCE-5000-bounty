package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.load.InterfaceC0573g;
import java.security.MessageDigest;

/* renamed from: ue */
/* loaded from: classes.dex */
public class C3303ue extends AbstractC2857ke {

    /* renamed from: b */
    private static final byte[] f13465b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC0573g.f3278a);

    @Override // p000.AbstractC2857ke
    /* renamed from: a */
    protected Bitmap mo13693a(InterfaceC2427ec interfaceC2427ec, Bitmap bitmap, int i, int i2) {
        return C0019af.m151c(interfaceC2427ec, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    /* renamed from: a */
    public void mo3954a(MessageDigest messageDigest) {
        messageDigest.update(f13465b);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public boolean equals(Object obj) {
        return obj instanceof C3303ue;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public int hashCode() {
        return 1572326941;
    }
}
