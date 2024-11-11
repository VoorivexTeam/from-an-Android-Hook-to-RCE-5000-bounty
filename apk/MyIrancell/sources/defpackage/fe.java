package defpackage;

import android.content.Context;
import com.bumptech.glide.load.l;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class fe<T> implements l<T> {
    private static final l<?> b = new fe();

    private fe() {
    }

    public static <T> fe<T> a() {
        return (fe) b;
    }

    @Override // com.bumptech.glide.load.l
    public vb<T> a(Context context, vb<T> vbVar, int i, int i2) {
        return vbVar;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
    }
}
