package ir.tapsell.sdk.networkcacheutils;

/* loaded from: classes.dex */
public class b {
    private static final Object f = new Object();
    private static b g;
    private long a = -1;
    private boolean b = false;
    private long c = 0;
    private long d = 0;
    private long e = 0;

    public static b c() {
        if (g == null) {
            synchronized (f) {
                if (g == null) {
                    g = new b();
                }
            }
        }
        return g;
    }

    public long a() {
        return this.a;
    }

    public void a(int i, long j, long j2) {
        if (this.b) {
            long j3 = this.c + i;
            this.c = j3;
            long j4 = this.d + j2;
            this.d = j4;
            long j5 = this.e + j;
            this.e = j5;
            this.a = (j3 * 1000) / (j5 - j4);
        }
    }

    public void b() {
        this.b = true;
    }
}
