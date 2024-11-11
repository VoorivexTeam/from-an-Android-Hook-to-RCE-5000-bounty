package p000;

import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C1960a;

/* renamed from: xr */
/* loaded from: classes.dex */
public final class C3448xr {

    /* renamed from: a */
    private static final C0859a.g<C1960a> f14059a = new C0859a.g<>();

    /* renamed from: b */
    private static final C0859a.g<C1960a> f14060b = new C0859a.g<>();

    /* renamed from: c */
    public static final C0859a.a<C1960a, C3369vr> f14061c = new C3408wr();

    /* renamed from: d */
    private static final C0859a.a<C1960a, Object> f14062d = new C3539zr();

    /* renamed from: e */
    public static final C0859a<C3369vr> f14063e;

    static {
        new Scope("profile");
        new Scope("email");
        f14063e = new C0859a<>("SignIn.API", f14061c, f14059a);
        new C0859a("SignIn.INTERNAL_API", f14062d, f14060b);
    }
}
