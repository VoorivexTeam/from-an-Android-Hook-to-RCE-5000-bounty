package defpackage;

import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
class nb implements g {
    private final Object b;
    private final int c;
    private final int d;
    private final Class<?> e;
    private final Class<?> f;
    private final g g;
    private final Map<Class<?>, l<?>> h;
    private final i i;
    private int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public nb(Object obj, g gVar, int i, int i2, Map<Class<?>, l<?>> map, Class<?> cls, Class<?> cls2, i iVar) {
        ji.a(obj);
        this.b = obj;
        ji.a(gVar, "Signature must not be null");
        this.g = gVar;
        this.c = i;
        this.d = i2;
        ji.a(map);
        this.h = map;
        ji.a(cls, "Resource class must not be null");
        this.e = cls;
        ji.a(cls2, "Transcode class must not be null");
        this.f = cls2;
        ji.a(iVar);
        this.i = iVar;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof nb)) {
            return false;
        }
        nb nbVar = (nb) obj;
        return this.b.equals(nbVar.b) && this.g.equals(nbVar.g) && this.d == nbVar.d && this.c == nbVar.c && this.h.equals(nbVar.h) && this.e.equals(nbVar.e) && this.f.equals(nbVar.f) && this.i.equals(nbVar.i);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = (hashCode * 31) + this.g.hashCode();
            this.j = hashCode2;
            int i = (hashCode2 * 31) + this.c;
            this.j = i;
            int i2 = (i * 31) + this.d;
            this.j = i2;
            int hashCode3 = (i2 * 31) + this.h.hashCode();
            this.j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
            this.j = hashCode5;
            this.j = (hashCode5 * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
