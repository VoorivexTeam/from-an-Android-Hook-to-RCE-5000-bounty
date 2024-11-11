package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class d {
    private static final a.g<com.google.android.gms.internal.location.r> a = new a.g<>();
    private static final a.AbstractC0041a<com.google.android.gms.internal.location.r, a.d.C0043d> b;
    public static final com.google.android.gms.common.api.a<a.d.C0043d> c;

    @Deprecated
    public static final f d;

    /* loaded from: classes.dex */
    public static abstract class a<R extends com.google.android.gms.common.api.m> extends com.google.android.gms.common.api.internal.d<R, com.google.android.gms.internal.location.r> {
        public a(com.google.android.gms.common.api.f fVar) {
            super(d.c, fVar);
        }
    }

    static {
        k kVar = new k();
        b = kVar;
        c = new com.google.android.gms.common.api.a<>("LocationServices.API", kVar, a);
        new com.google.android.gms.internal.location.g0();
        new com.google.android.gms.internal.location.c();
        d = new com.google.android.gms.internal.location.y();
    }

    public static com.google.android.gms.location.a a(Context context) {
        return new com.google.android.gms.location.a(context);
    }

    public static g b(Context context) {
        return new g(context);
    }
}
