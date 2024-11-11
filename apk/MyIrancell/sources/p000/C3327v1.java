package p000;

/* renamed from: v1 */
/* loaded from: classes.dex */
public class C3327v1<T> implements InterfaceC3283u1<T> {

    /* renamed from: a */
    private final Object[] f13537a;

    /* renamed from: b */
    private int f13538b;

    public C3327v1(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f13537a = new Object[i];
    }

    /* renamed from: b */
    private boolean m15894b(T t) {
        for (int i = 0; i < this.f13538b; i++) {
            if (this.f13537a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC3283u1
    /* renamed from: a */
    public T mo13874a() {
        int i = this.f13538b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f13537a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f13538b = i - 1;
        return t;
    }

    @Override // p000.InterfaceC3283u1
    /* renamed from: a */
    public boolean mo13875a(T t) {
        if (m15894b(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.f13538b;
        Object[] objArr = this.f13537a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f13538b = i + 1;
        return true;
    }
}
