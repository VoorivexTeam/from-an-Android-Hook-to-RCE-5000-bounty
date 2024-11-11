package p000;

import java.util.concurrent.Executor;

/* renamed from: rl */
/* loaded from: classes.dex */
public final class C3170rl implements n30<Executor> {

    /* renamed from: a */
    private static final C3170rl f12977a = new C3170rl();

    /* renamed from: a */
    public static C3170rl m15286a() {
        return f12977a;
    }

    /* renamed from: b */
    public static Executor m15287b() {
        Executor m15127a = AbstractC3131ql.m15127a();
        p30.m14711a(m15127a, "Cannot return null from a non-@Nullable @Provides method");
        return m15127a;
    }

    @Override // p000.f70
    public Executor get() {
        return m15287b();
    }
}
