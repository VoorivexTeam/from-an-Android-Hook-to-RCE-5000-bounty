package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class ne extends ke {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(g.a);

    @Override // defpackage.ke
    protected Bitmap a(ec ecVar, Bitmap bitmap, int i, int i2) {
        return af.b(ecVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof ne;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return -670243078;
    }
}
