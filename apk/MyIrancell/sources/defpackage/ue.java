package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class ue extends ke {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(g.a);

    @Override // defpackage.ke
    protected Bitmap a(ec ecVar, Bitmap bitmap, int i, int i2) {
        return af.c(ecVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof ue;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return 1572326941;
    }
}
