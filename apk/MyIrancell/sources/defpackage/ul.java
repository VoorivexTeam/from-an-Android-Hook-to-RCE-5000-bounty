package defpackage;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ul implements kk {
    private final Set<fk> a;
    private final tl b;
    private final xl c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ul(Set<fk> set, tl tlVar, xl xlVar) {
        this.a = set;
        this.b = tlVar;
        this.c = xlVar;
    }

    @Override // defpackage.kk
    public <T> jk<T> a(String str, Class<T> cls, fk fkVar, ik<T, byte[]> ikVar) {
        if (this.a.contains(fkVar)) {
            return new wl(this.b, str, fkVar, ikVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", fkVar, this.a));
    }
}
