package defpackage;

import defpackage.sl;

/* loaded from: classes.dex */
final class wl<T> implements jk<T> {
    private final tl a;
    private final String b;
    private final fk c;
    private final ik<T, byte[]> d;
    private final xl e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wl(tl tlVar, String str, fk fkVar, ik<T, byte[]> ikVar, xl xlVar) {
        this.a = tlVar;
        this.b = str;
        this.c = fkVar;
        this.d = ikVar;
        this.e = xlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(Exception exc) {
    }

    @Override // defpackage.jk
    public void a(gk<T> gkVar) {
        a(gkVar, vl.a());
    }

    public void a(gk<T> gkVar, lk lkVar) {
        xl xlVar = this.e;
        sl.a g = sl.g();
        g.a(this.a);
        g.a((gk<?>) gkVar);
        g.a(this.b);
        g.a((ik<?, byte[]>) this.d);
        g.a(this.c);
        xlVar.a(g.a(), lkVar);
    }
}
