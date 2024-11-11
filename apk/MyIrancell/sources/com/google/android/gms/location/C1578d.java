package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.internal.AbstractC0885d;
import com.google.android.gms.internal.location.C1162c;
import com.google.android.gms.internal.location.C1171g0;
import com.google.android.gms.internal.location.C1182r;
import com.google.android.gms.internal.location.C1189y;

/* renamed from: com.google.android.gms.location.d */
/* loaded from: classes.dex */
public class C1578d {

    /* renamed from: a */
    private static final C0859a.g<C1182r> f7099a = new C0859a.g<>();

    /* renamed from: b */
    private static final C0859a.a<C1182r, C0859a.d.C3561d> f7100b;

    /* renamed from: c */
    public static final C0859a<C0859a.d.C3561d> f7101c;

    /* renamed from: d */
    @Deprecated
    public static final InterfaceC1582f f7102d;

    /* renamed from: com.google.android.gms.location.d$a */
    /* loaded from: classes.dex */
    public static abstract class a<R extends InterfaceC0982m> extends AbstractC0885d<R, C1182r> {
        public a(AbstractC0864f abstractC0864f) {
            super(C1578d.f7101c, abstractC0864f);
        }
    }

    static {
        C1592k c1592k = new C1592k();
        f7100b = c1592k;
        f7101c = new C0859a<>("LocationServices.API", c1592k, f7099a);
        new C1171g0();
        new C1162c();
        f7102d = new C1189y();
    }

    /* renamed from: a */
    public static C1572a m8968a(Context context) {
        return new C1572a(context);
    }

    /* renamed from: b */
    public static C1584g m8969b(Context context) {
        return new C1584g(context);
    }
}
