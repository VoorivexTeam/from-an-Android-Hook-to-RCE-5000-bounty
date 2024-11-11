package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rl implements n30<Executor> {
    private static final rl a = new rl();

    public static rl a() {
        return a;
    }

    public static Executor b() {
        Executor a2 = ql.a();
        p30.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // defpackage.f70
    public Executor get() {
        return b();
    }
}
