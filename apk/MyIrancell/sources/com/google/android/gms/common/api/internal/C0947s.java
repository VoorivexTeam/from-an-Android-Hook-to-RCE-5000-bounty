package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0860b;
import com.google.android.gms.common.api.Status;
import p000.AbstractC2871ks;
import p000.C2908ls;

/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: classes.dex */
public class C0947s {
    @Deprecated
    /* renamed from: a */
    public static AbstractC2871ks<Void> m6874a(AbstractC2871ks<Boolean> abstractC2871ks) {
        return abstractC2871ks.mo11807a(new C0969x1());
    }

    /* renamed from: a */
    public static <TResult> void m6875a(Status status, TResult tresult, C2908ls<TResult> c2908ls) {
        if (status.m6500m()) {
            c2908ls.m13926a((C2908ls<TResult>) tresult);
        } else {
            c2908ls.m13925a((Exception) new C0860b(status));
        }
    }

    /* renamed from: a */
    public static void m6876a(Status status, C2908ls<Void> c2908ls) {
        m6875a(status, null, c2908ls);
    }
}
