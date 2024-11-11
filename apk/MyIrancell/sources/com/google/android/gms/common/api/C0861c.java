package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.internal.C0875b;
import com.google.android.gms.common.internal.C1057u;
import java.util.ArrayList;
import p000.C0500c0;

/* renamed from: com.google.android.gms.common.api.c */
/* loaded from: classes.dex */
public class C0861c extends Exception {

    /* renamed from: b */
    private final C0500c0<C0875b<?>, ConnectionResult> f5681b;

    public C0861c(C0500c0<C0875b<?>, ConnectionResult> c0500c0) {
        this.f5681b = c0500c0;
    }

    /* renamed from: a */
    public final C0500c0<C0875b<?>, ConnectionResult> m6528a() {
        return this.f5681b;
    }

    /* renamed from: a */
    public ConnectionResult m6529a(C0863e<? extends C0859a.d> c0863e) {
        C0875b<? extends C0859a.d> mo6534a = c0863e.mo6534a();
        C1057u.m7294a(this.f5681b.get(mo6534a) != null, "The given API was not part of the availability request.");
        return this.f5681b.get(mo6534a);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C0875b<?> c0875b : this.f5681b.keySet()) {
            ConnectionResult connectionResult = this.f5681b.get(c0875b);
            if (connectionResult.m6488n()) {
                z = false;
            }
            String m6617a = c0875b.m6617a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(m6617a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(m6617a);
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
