package p000;

import javax.annotation.Nonnull;

/* renamed from: kv */
/* loaded from: classes.dex */
final class C2874kv extends AbstractC3099pv {

    /* renamed from: a */
    private final String f11768a;

    /* renamed from: b */
    private final String f11769b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2874kv(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f11768a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f11769b = str2;
    }

    @Override // p000.AbstractC3099pv
    @Nonnull
    /* renamed from: a */
    public String mo13751a() {
        return this.f11768a;
    }

    @Override // p000.AbstractC3099pv
    @Nonnull
    /* renamed from: b */
    public String mo13752b() {
        return this.f11769b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3099pv)) {
            return false;
        }
        AbstractC3099pv abstractC3099pv = (AbstractC3099pv) obj;
        return this.f11768a.equals(abstractC3099pv.mo13751a()) && this.f11769b.equals(abstractC3099pv.mo13752b());
    }

    public int hashCode() {
        return ((this.f11768a.hashCode() ^ 1000003) * 1000003) ^ this.f11769b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f11768a + ", version=" + this.f11769b + "}";
    }
}
