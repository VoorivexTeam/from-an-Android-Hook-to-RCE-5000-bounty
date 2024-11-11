package defpackage;

import defpackage.vn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class gm implements vn.a {
    private final hm a;
    private final tl b;
    private final pl c;

    private gm(hm hmVar, tl tlVar, pl plVar) {
        this.a = hmVar;
        this.b = tlVar;
        this.c = plVar;
    }

    public static vn.a a(hm hmVar, tl tlVar, pl plVar) {
        return new gm(hmVar, tlVar, plVar);
    }

    @Override // vn.a
    public Object e() {
        return hm.a(this.a, this.b, this.c);
    }
}
