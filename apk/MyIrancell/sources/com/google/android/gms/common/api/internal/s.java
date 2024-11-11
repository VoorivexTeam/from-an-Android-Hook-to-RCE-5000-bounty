package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import defpackage.ks;
import defpackage.ls;

/* loaded from: classes.dex */
public class s {
    @Deprecated
    public static ks<Void> a(ks<Boolean> ksVar) {
        return ksVar.a(new x1());
    }

    public static <TResult> void a(Status status, TResult tresult, ls<TResult> lsVar) {
        if (status.m()) {
            lsVar.a((ls<TResult>) tresult);
        } else {
            lsVar.a((Exception) new com.google.android.gms.common.api.b(status));
        }
    }

    public static void a(Status status, ls<Void> lsVar) {
        a(status, null, lsVar);
    }
}
