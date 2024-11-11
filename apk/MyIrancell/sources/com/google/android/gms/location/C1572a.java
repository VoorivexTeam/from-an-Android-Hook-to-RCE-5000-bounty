package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.C0863e;
import com.google.android.gms.common.api.internal.C0870a;
import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.common.api.internal.C0919l;
import com.google.android.gms.common.api.internal.C0947s;
import com.google.android.gms.internal.location.AbstractBinderC1166e;
import com.google.android.gms.internal.location.C1159a0;
import com.google.android.gms.internal.location.InterfaceC1164d;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.internal.location.zzbd;
import p000.AbstractC2871ks;
import p000.C2908ls;

/* renamed from: com.google.android.gms.location.a */
/* loaded from: classes.dex */
public class C1572a extends C0863e<C0859a.d.C3561d> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.location.a$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractBinderC1166e {

        /* renamed from: a */
        private final C2908ls<Void> f7094a;

        public a(C2908ls<Void> c2908ls) {
            this.f7094a = c2908ls;
        }

        @Override // com.google.android.gms.internal.location.InterfaceC1164d
        /* renamed from: a */
        public final void mo7476a(zzad zzadVar) {
            C0947s.m6876a(zzadVar.mo6496e(), this.f7094a);
        }
    }

    public C1572a(Context context) {
        super(context, C1578d.f7101c, (C0859a.d) null, new C0870a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final InterfaceC1164d m8964a(C2908ls<Boolean> c2908ls) {
        return new BinderC1577c0(this, c2908ls);
    }

    /* renamed from: a */
    public AbstractC2871ks<Void> m8965a(LocationRequest locationRequest, C1574b c1574b, Looper looper) {
        zzbd m7499a = zzbd.m7499a(locationRequest);
        C0915k m6798a = C0919l.m6798a(c1574b, C1159a0.m7470a(looper), C1574b.class.getSimpleName());
        return m6538a((C1572a) new C1573a0(this, m6798a, m7499a, m6798a), (C1573a0) new C1575b0(this, m6798a.m6789b()));
    }

    /* renamed from: a */
    public AbstractC2871ks<Void> m8966a(C1574b c1574b) {
        return C0947s.m6874a(m6537a(C0919l.m6797a(c1574b, C1574b.class.getSimpleName())));
    }
}
