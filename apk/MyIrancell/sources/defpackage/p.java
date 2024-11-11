package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class p extends r {
    private static volatile p c;
    private r a;
    private r b;

    /* loaded from: classes.dex */
    static class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            p.b().b(runnable);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            p.b().a(runnable);
        }
    }

    static {
        new a();
        new b();
    }

    private p() {
        q qVar = new q();
        this.b = qVar;
        this.a = qVar;
    }

    public static p b() {
        if (c != null) {
            return c;
        }
        synchronized (p.class) {
            if (c == null) {
                c = new p();
            }
        }
        return c;
    }

    @Override // defpackage.r
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // defpackage.r
    public boolean a() {
        return this.a.a();
    }

    @Override // defpackage.r
    public void b(Runnable runnable) {
        this.a.b(runnable);
    }
}
