package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.qm;
import defpackage.tl;
import defpackage.vn;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class q {
    private final Executor a;
    private final qm b;
    private final s c;
    private final vn d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Executor executor, qm qmVar, s sVar, vn vnVar) {
        this.a = executor;
        this.b = qmVar;
        this.c = sVar;
        this.d = vnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(q qVar) {
        Iterator<tl> it = qVar.b.g().iterator();
        while (it.hasNext()) {
            qVar.c.a(it.next(), 1);
        }
        return null;
    }

    public void a() {
        this.a.execute(o.a(this));
    }
}
