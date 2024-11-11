package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import defpackage.c0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends Exception {
    private final c0<com.google.android.gms.common.api.internal.b<?>, ConnectionResult> b;

    public c(c0<com.google.android.gms.common.api.internal.b<?>, ConnectionResult> c0Var) {
        this.b = c0Var;
    }

    public final c0<com.google.android.gms.common.api.internal.b<?>, ConnectionResult> a() {
        return this.b;
    }

    public ConnectionResult a(e<? extends a.d> eVar) {
        com.google.android.gms.common.api.internal.b<? extends a.d> a = eVar.a();
        com.google.android.gms.common.internal.u.a(this.b.get(a) != null, "The given API was not part of the availability request.");
        return this.b.get(a);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (com.google.android.gms.common.api.internal.b<?> bVar : this.b.keySet()) {
            ConnectionResult connectionResult = this.b.get(bVar);
            if (connectionResult.n()) {
                z = false;
            }
            String a = bVar.a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
