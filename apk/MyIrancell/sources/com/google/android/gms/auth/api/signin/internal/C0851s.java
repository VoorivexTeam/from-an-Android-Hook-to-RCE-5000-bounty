package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p003authapi.C1139a;
import com.google.android.gms.internal.p003authapi.C1141c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.s */
/* loaded from: classes.dex */
public final class C0851s extends C1139a implements InterfaceC0850r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0851s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.InterfaceC0850r
    /* renamed from: a */
    public final void mo6481a(InterfaceC0848p interfaceC0848p, GoogleSignInOptions googleSignInOptions) {
        Parcel m7461a = m7461a();
        C1141c.m7464a(m7461a, interfaceC0848p);
        C1141c.m7465a(m7461a, googleSignInOptions);
        m7462a(103, m7461a);
    }
}
