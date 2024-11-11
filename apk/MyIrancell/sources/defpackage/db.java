package defpackage;

import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class db implements g {
    private final g b;
    private final g c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public db(g gVar, g gVar2) {
        this.b = gVar;
        this.c = gVar2;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return this.b.equals(dbVar.b) && this.c.equals(dbVar.c);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
