package defpackage;

import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class zh implements g {
    private final Object b;

    public zh(Object obj) {
        ji.a(obj);
        this.b = obj;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(g.a));
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof zh) {
            return this.b.equals(((zh) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
