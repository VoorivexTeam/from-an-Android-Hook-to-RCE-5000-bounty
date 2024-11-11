package defpackage;

import defpackage.oc;
import java.io.File;

/* loaded from: classes.dex */
public class rc implements oc.a {
    private final long a;
    private final a b;

    /* loaded from: classes.dex */
    public interface a {
        File a();
    }

    public rc(a aVar, long j) {
        this.a = j;
        this.b = aVar;
    }

    @Override // oc.a
    public oc a() {
        File a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        if (a2.mkdirs() || (a2.exists() && a2.isDirectory())) {
            return sc.a(a2, this.a);
        }
        return null;
    }
}
