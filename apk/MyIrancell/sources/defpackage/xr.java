package defpackage;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class xr {
    private static final a.g<com.google.android.gms.signin.internal.a> a = new a.g<>();
    private static final a.g<com.google.android.gms.signin.internal.a> b = new a.g<>();
    public static final a.AbstractC0041a<com.google.android.gms.signin.internal.a, vr> c = new wr();
    private static final a.AbstractC0041a<com.google.android.gms.signin.internal.a, Object> d = new zr();
    public static final a<vr> e;

    static {
        new Scope("profile");
        new Scope("email");
        e = new a<>("SignIn.API", c, a);
        new a("SignIn.INTERNAL_API", d, b);
    }
}
