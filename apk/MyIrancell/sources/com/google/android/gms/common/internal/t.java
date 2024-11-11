package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import defpackage.ks;
import defpackage.ls;

/* loaded from: classes.dex */
public class t {
    private static final b a = new d0();

    /* loaded from: classes.dex */
    public interface a<R extends com.google.android.gms.common.api.m, T> {
        T a(R r);
    }

    /* loaded from: classes.dex */
    public interface b {
        com.google.android.gms.common.api.b a(Status status);
    }

    public static <R extends com.google.android.gms.common.api.m, T extends com.google.android.gms.common.api.l<R>> ks<T> a(com.google.android.gms.common.api.h<R> hVar, T t) {
        return a(hVar, new e0(t));
    }

    public static <R extends com.google.android.gms.common.api.m, T> ks<T> a(com.google.android.gms.common.api.h<R> hVar, a<R, T> aVar) {
        b bVar = a;
        ls lsVar = new ls();
        hVar.a(new f0(hVar, lsVar, aVar, bVar));
        return lsVar.a();
    }
}
