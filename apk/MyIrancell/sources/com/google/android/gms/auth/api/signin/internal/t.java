package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public final class t extends o {
    private final Context a;

    public t(Context context) {
        this.a = context;
    }

    private final void a() {
        if (com.google.android.gms.common.h.c(this.a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.n
    public final void m() {
        a();
        b a = b.a(this.a);
        GoogleSignInAccount b = a.b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.p;
        if (b != null) {
            googleSignInOptions = a.c();
        }
        f.a aVar = new f.a(this.a);
        aVar.a(com.google.android.gms.auth.api.a.e, googleSignInOptions);
        com.google.android.gms.common.api.f a2 = aVar.a();
        try {
            if (a2.a().n()) {
                if (b != null) {
                    com.google.android.gms.auth.api.a.f.a(a2);
                } else {
                    a2.b();
                }
            }
        } finally {
            a2.d();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.n
    public final void n() {
        a();
        m.a(this.a).a();
    }
}
