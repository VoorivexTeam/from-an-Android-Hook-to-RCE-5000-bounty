package p000;

/* loaded from: classes.dex */
public abstract class n80 implements Runnable {

    /* renamed from: b */
    protected final String f12288b;

    public n80(String str, Object... objArr) {
        this.f12288b = o80.m14446a(str, objArr);
    }

    /* renamed from: b */
    protected abstract void mo11709b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f12288b);
        try {
            mo11709b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
