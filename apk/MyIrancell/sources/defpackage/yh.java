package defpackage;

import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class yh implements g {
    private static final yh b = new yh();

    private yh() {
    }

    public static yh a() {
        return b;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
