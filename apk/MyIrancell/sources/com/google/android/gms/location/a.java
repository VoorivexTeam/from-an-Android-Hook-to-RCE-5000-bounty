package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.internal.location.zzbd;
import defpackage.ks;
import defpackage.ls;

/* loaded from: classes.dex */
public class a extends com.google.android.gms.common.api.e<a.d.C0043d> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.location.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class BinderC0049a extends com.google.android.gms.internal.location.e {
        private final ls<Void> a;

        public BinderC0049a(ls<Void> lsVar) {
            this.a = lsVar;
        }

        @Override // com.google.android.gms.internal.location.d
        public final void a(zzad zzadVar) {
            com.google.android.gms.common.api.internal.s.a(zzadVar.e(), this.a);
        }
    }

    public a(Context context) {
        super(context, d.c, (a.d) null, new com.google.android.gms.common.api.internal.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.internal.location.d a(ls<Boolean> lsVar) {
        return new c0(this, lsVar);
    }

    public ks<Void> a(LocationRequest locationRequest, b bVar, Looper looper) {
        zzbd a = zzbd.a(locationRequest);
        com.google.android.gms.common.api.internal.k a2 = com.google.android.gms.common.api.internal.l.a(bVar, com.google.android.gms.internal.location.a0.a(looper), b.class.getSimpleName());
        return a((a) new a0(this, a2, a, a2), (a0) new b0(this, a2.b()));
    }

    public ks<Void> a(b bVar) {
        return com.google.android.gms.common.api.internal.s.a(a(com.google.android.gms.common.api.internal.l.a(bVar, b.class.getSimpleName())));
    }
}
