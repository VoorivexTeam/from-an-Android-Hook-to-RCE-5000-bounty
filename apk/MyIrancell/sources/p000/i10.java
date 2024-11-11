package p000;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class i10 {

    /* renamed from: a */
    private final List<h10> f10548a;

    /* renamed from: b */
    private final int f10549b;

    /* renamed from: c */
    private final boolean f10550c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i10(List<h10> list, int i, boolean z) {
        this.f10548a = new ArrayList(list);
        this.f10549b = i;
        this.f10550c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<h10> m12320a() {
        return this.f10548a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m12321a(List<h10> list) {
        return this.f10548a.equals(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m12322b() {
        return this.f10549b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i10)) {
            return false;
        }
        i10 i10Var = (i10) obj;
        return this.f10548a.equals(i10Var.m12320a()) && this.f10550c == i10Var.f10550c;
    }

    public int hashCode() {
        return this.f10548a.hashCode() ^ Boolean.valueOf(this.f10550c).hashCode();
    }

    public String toString() {
        return "{ " + this.f10548a + " }";
    }
}
