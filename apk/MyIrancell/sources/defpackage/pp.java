package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class pp extends r<xp, Void> {
    private ls<Void> c;

    private pp() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ pp(yp ypVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Status status) {
        s.a(status, this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.r
    public /* synthetic */ void a(xp xpVar, ls<Void> lsVar) {
        this.c = lsVar;
        a((tp) xpVar.A());
    }

    protected abstract void a(tp tpVar);
}
