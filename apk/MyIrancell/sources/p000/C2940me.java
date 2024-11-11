package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.load.InterfaceC0573g;
import java.security.MessageDigest;

/* renamed from: me */
/* loaded from: classes.dex */
public class C2940me extends AbstractC2857ke {

    /* renamed from: b */
    private static final byte[] f12138b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC0573g.f3278a);

    @Override // p000.AbstractC2857ke
    /* renamed from: a */
    protected Bitmap mo13693a(InterfaceC2427ec interfaceC2427ec, Bitmap bitmap, int i, int i2) {
        return C0019af.m143a(interfaceC2427ec, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    /* renamed from: a */
    public void mo3954a(MessageDigest messageDigest) {
        messageDigest.update(f12138b);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public boolean equals(Object obj) {
        return obj instanceof C2940me;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public int hashCode() {
        return -599754482;
    }
}
