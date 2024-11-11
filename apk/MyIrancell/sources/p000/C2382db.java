package p000;

import com.bumptech.glide.load.InterfaceC0573g;
import java.security.MessageDigest;

/* renamed from: db */
/* loaded from: classes.dex */
final class C2382db implements InterfaceC0573g {

    /* renamed from: b */
    private final InterfaceC0573g f9789b;

    /* renamed from: c */
    private final InterfaceC0573g f9790c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2382db(InterfaceC0573g interfaceC0573g, InterfaceC0573g interfaceC0573g2) {
        this.f9789b = interfaceC0573g;
        this.f9790c = interfaceC0573g2;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    /* renamed from: a */
    public void mo3954a(MessageDigest messageDigest) {
        this.f9789b.mo3954a(messageDigest);
        this.f9790c.mo3954a(messageDigest);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public boolean equals(Object obj) {
        if (!(obj instanceof C2382db)) {
            return false;
        }
        C2382db c2382db = (C2382db) obj;
        return this.f9789b.equals(c2382db.f9789b) && this.f9790c.equals(c2382db.f9790c);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public int hashCode() {
        return (this.f9789b.hashCode() * 31) + this.f9790c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f9789b + ", signature=" + this.f9790c + '}';
    }
}
