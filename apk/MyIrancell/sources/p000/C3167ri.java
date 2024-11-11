package p000;

/* renamed from: ri */
/* loaded from: classes.dex */
public class C3167ri extends AbstractC3488yi {

    /* renamed from: b */
    private int f12969b;

    /* renamed from: c */
    private int f12970c;

    /* renamed from: d */
    private String f12971d;

    public C3167ri(int i) {
        this.f14143a = i;
    }

    /* renamed from: a */
    public void m15274a(int i) {
        this.f12970c = i;
        this.f12969b = 0;
    }

    /* renamed from: a */
    public void m15275a(String str) {
        this.f12971d = str;
        this.f12969b = 1;
    }

    /* renamed from: b */
    public String m15276b() {
        if (this.f12969b == 1) {
            return this.f12971d;
        }
        throw new C3399wi(12);
    }

    /* renamed from: c */
    public int m15277c() {
        if (this.f12969b == 0) {
            return this.f12970c;
        }
        throw new C3399wi(12);
    }

    /* renamed from: d */
    public int m15278d() {
        return this.f12969b;
    }
}
