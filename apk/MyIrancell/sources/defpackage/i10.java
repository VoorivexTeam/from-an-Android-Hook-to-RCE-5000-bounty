package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class i10 {
    private final List<h10> a;
    private final int b;
    private final boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i10(List<h10> list, int i, boolean z) {
        this.a = new ArrayList(list);
        this.b = i;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<h10> a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(List<h10> list) {
        return this.a.equals(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i10)) {
            return false;
        }
        i10 i10Var = (i10) obj;
        return this.a.equals(i10Var.a()) && this.c == i10Var.c;
    }

    public int hashCode() {
        return this.a.hashCode() ^ Boolean.valueOf(this.c).hashCode();
    }

    public String toString() {
        return "{ " + this.a + " }";
    }
}
