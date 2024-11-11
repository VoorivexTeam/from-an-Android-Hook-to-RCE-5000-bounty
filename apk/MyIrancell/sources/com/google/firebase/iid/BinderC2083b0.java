package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p000.AbstractC2871ks;
import p000.InterfaceC2484fs;

/* renamed from: com.google.firebase.iid.b0 */
/* loaded from: classes.dex */
public final class BinderC2083b0 extends Binder {

    /* renamed from: a */
    private final InterfaceC2092e0 f8888a;

    public BinderC2083b0(InterfaceC2092e0 interfaceC2092e0) {
        this.f8888a = interfaceC2092e0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10641a(final C2096g0 c2096g0) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        this.f8888a.mo10646a(c2096g0.f8905a).mo11813a(C2082b.m10638a(), new InterfaceC2484fs(c2096g0) { // from class: com.google.firebase.iid.a0

            /* renamed from: a */
            private final C2096g0 f8880a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8880a = c2096g0;
            }

            @Override // p000.InterfaceC2484fs
            /* renamed from: a */
            public final void mo5523a(AbstractC2871ks abstractC2871ks) {
                this.f8880a.m10649a();
            }
        });
    }
}
