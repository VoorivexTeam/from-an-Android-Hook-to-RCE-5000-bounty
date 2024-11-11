package ir.tapsell.sdk.networkcacheutils;

/* renamed from: ir.tapsell.sdk.networkcacheutils.b */
/* loaded from: classes.dex */
public class C2748b {

    /* renamed from: f */
    private static final Object f11224f = new Object();

    /* renamed from: g */
    private static C2748b f11225g;

    /* renamed from: a */
    private long f11226a = -1;

    /* renamed from: b */
    private boolean f11227b = false;

    /* renamed from: c */
    private long f11228c = 0;

    /* renamed from: d */
    private long f11229d = 0;

    /* renamed from: e */
    private long f11230e = 0;

    /* renamed from: c */
    public static C2748b m13089c() {
        if (f11225g == null) {
            synchronized (f11224f) {
                if (f11225g == null) {
                    f11225g = new C2748b();
                }
            }
        }
        return f11225g;
    }

    /* renamed from: a */
    public long m13090a() {
        return this.f11226a;
    }

    /* renamed from: a */
    public void m13091a(int i, long j, long j2) {
        if (this.f11227b) {
            long j3 = this.f11228c + i;
            this.f11228c = j3;
            long j4 = this.f11229d + j2;
            this.f11229d = j4;
            long j5 = this.f11230e + j;
            this.f11230e = j5;
            this.f11226a = (j3 * 1000) / (j5 - j4);
        }
    }

    /* renamed from: b */
    public void m13092b() {
        this.f11227b = true;
    }
}
