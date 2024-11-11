package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import defpackage.fs;
import defpackage.ks;

/* loaded from: classes.dex */
public final class b0 extends Binder {
    private final e0 a;

    public b0(e0 e0Var) {
        this.a = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final g0 g0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        this.a.a(g0Var.a).a(b.a(), new fs(g0Var) { // from class: com.google.firebase.iid.a0
            private final g0 a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = g0Var;
            }

            @Override // defpackage.fs
            public final void a(ks ksVar) {
                this.a.a();
            }
        });
    }
}
