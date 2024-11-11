package defpackage;

/* loaded from: classes.dex */
public abstract class n80 implements Runnable {
    protected final String b;

    public n80(String str, Object... objArr) {
        this.b = o80.a(str, objArr);
    }

    protected abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.b);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
