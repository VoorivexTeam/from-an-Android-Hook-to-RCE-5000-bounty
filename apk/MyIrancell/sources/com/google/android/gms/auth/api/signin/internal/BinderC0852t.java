package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C0804a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C1006h;
import com.google.android.gms.common.api.AbstractC0864f;

/* renamed from: com.google.android.gms.auth.api.signin.internal.t */
/* loaded from: classes.dex */
public final class BinderC0852t extends AbstractBinderC0847o {

    /* renamed from: a */
    private final Context f5654a;

    public BinderC0852t(Context context) {
        this.f5654a = context;
    }

    /* renamed from: a */
    private final void m6482a() {
        if (C1006h.m7003c(this.f5654a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.InterfaceC0846n
    /* renamed from: m */
    public final void mo6478m() {
        m6482a();
        C0834b m6442a = C0834b.m6442a(this.f5654a);
        GoogleSignInAccount m6450b = m6442a.m6450b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f5598p;
        if (m6450b != null) {
            googleSignInOptions = m6442a.m6451c();
        }
        AbstractC0864f.a aVar = new AbstractC0864f.a(this.f5654a);
        aVar.m6567a(C0804a.f5494e, googleSignInOptions);
        AbstractC0864f m6570a = aVar.m6570a();
        try {
            if (m6570a.mo6551a().m6488n()) {
                if (m6450b != null) {
                    C0804a.f5495f.mo6431a(m6570a);
                } else {
                    m6570a.mo6557b();
                }
            }
        } finally {
            m6570a.mo6561d();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.InterfaceC0846n
    /* renamed from: n */
    public final void mo6479n() {
        m6482a();
        C0845m.m6474a(this.f5654a).m6476a();
    }
}
