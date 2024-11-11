package p000;

/* renamed from: w1 */
/* loaded from: classes.dex */
public class C3380w1<T> extends C3327v1<T> {

    /* renamed from: c */
    private final Object f13732c;

    public C3380w1(int i) {
        super(i);
        this.f13732c = new Object();
    }

    @Override // p000.C3327v1, p000.InterfaceC3283u1
    /* renamed from: a */
    public T mo13874a() {
        T t;
        synchronized (this.f13732c) {
            t = (T) super.mo13874a();
        }
        return t;
    }

    @Override // p000.C3327v1, p000.InterfaceC3283u1
    /* renamed from: a */
    public boolean mo13875a(T t) {
        boolean mo13875a;
        synchronized (this.f13732c) {
            mo13875a = super.mo13875a(t);
        }
        return mo13875a;
    }
}
