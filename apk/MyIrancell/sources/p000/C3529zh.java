package p000;

import com.bumptech.glide.load.InterfaceC0573g;
import java.security.MessageDigest;

/* renamed from: zh */
/* loaded from: classes.dex */
public final class C3529zh implements InterfaceC0573g {

    /* renamed from: b */
    private final Object f14453b;

    public C3529zh(Object obj) {
        C2816ji.m13459a(obj);
        this.f14453b = obj;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    /* renamed from: a */
    public void mo3954a(MessageDigest messageDigest) {
        messageDigest.update(this.f14453b.toString().getBytes(InterfaceC0573g.f3278a));
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public boolean equals(Object obj) {
        if (obj instanceof C3529zh) {
            return this.f14453b.equals(((C3529zh) obj).f14453b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public int hashCode() {
        return this.f14453b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f14453b + '}';
    }
}
