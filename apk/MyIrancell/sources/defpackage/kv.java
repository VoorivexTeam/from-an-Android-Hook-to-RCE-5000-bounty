package defpackage;

import javax.annotation.Nonnull;

/* loaded from: classes.dex */
final class kv extends pv {
    private final String a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kv(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // defpackage.pv
    @Nonnull
    public String a() {
        return this.a;
    }

    @Override // defpackage.pv
    @Nonnull
    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pv)) {
            return false;
        }
        pv pvVar = (pv) obj;
        return this.a.equals(pvVar.a()) && this.b.equals(pvVar.b());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
