package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC0866h;
import com.google.android.gms.common.api.C0860b;
import com.google.android.gms.common.api.C0981l;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import p000.AbstractC2871ks;
import p000.C2908ls;

/* renamed from: com.google.android.gms.common.internal.t */
/* loaded from: classes.dex */
public class C1055t {

    /* renamed from: a */
    private static final b f6264a = new C1021d0();

    /* renamed from: com.google.android.gms.common.internal.t$a */
    /* loaded from: classes.dex */
    public interface a<R extends InterfaceC0982m, T> {
        /* renamed from: a */
        T mo7133a(R r);
    }

    /* renamed from: com.google.android.gms.common.internal.t$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        C0860b mo7114a(Status status);
    }

    /* renamed from: a */
    public static <R extends InterfaceC0982m, T extends C0981l<R>> AbstractC2871ks<T> m7282a(AbstractC0866h<R> abstractC0866h, T t) {
        return m7283a(abstractC0866h, new C1023e0(t));
    }

    /* renamed from: a */
    public static <R extends InterfaceC0982m, T> AbstractC2871ks<T> m7283a(AbstractC0866h<R> abstractC0866h, a<R, T> aVar) {
        b bVar = f6264a;
        C2908ls c2908ls = new C2908ls();
        abstractC0866h.mo6573a(new C1025f0(abstractC0866h, c2908ls, aVar, bVar));
        return c2908ls.m13924a();
    }
}
