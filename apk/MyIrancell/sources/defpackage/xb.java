package defpackage;

import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class xb implements g {
    private static final gi<Class<?>, byte[]> j = new gi<>(50);
    private final bc b;
    private final g c;
    private final g d;
    private final int e;
    private final int f;
    private final Class<?> g;
    private final i h;
    private final l<?> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xb(bc bcVar, g gVar, g gVar2, int i, int i2, l<?> lVar, Class<?> cls, i iVar) {
        this.b = bcVar;
        this.c = gVar;
        this.d = gVar2;
        this.e = i;
        this.f = i2;
        this.i = lVar;
        this.g = cls;
        this.h = iVar;
    }

    private byte[] a() {
        byte[] a = j.a((gi<Class<?>, byte[]>) this.g);
        if (a != null) {
            return a;
        }
        byte[] bytes = this.g.getName().getBytes(g.a);
        j.b(this.g, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.b.a(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        l<?> lVar = this.i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        messageDigest.update(a());
        this.b.a((bc) bArr);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof xb)) {
            return false;
        }
        xb xbVar = (xb) obj;
        return this.f == xbVar.f && this.e == xbVar.e && ki.b(this.i, xbVar.i) && this.g.equals(xbVar.g) && this.c.equals(xbVar.c) && this.d.equals(xbVar.d) && this.h.equals(xbVar.h);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        int hashCode = (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f;
        l<?> lVar = this.i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
