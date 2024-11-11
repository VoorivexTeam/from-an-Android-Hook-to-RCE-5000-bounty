package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i4 */
/* loaded from: classes.dex */
public final class RunnableC1761i4 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ int f7619b;

    /* renamed from: c */
    private final /* synthetic */ String f7620c;

    /* renamed from: d */
    private final /* synthetic */ Object f7621d;

    /* renamed from: e */
    private final /* synthetic */ Object f7622e;

    /* renamed from: f */
    private final /* synthetic */ Object f7623f;

    /* renamed from: g */
    private final /* synthetic */ C1725f4 f7624g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1761i4(C1725f4 c1725f4, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f7624g = c1725f4;
        this.f7619b = i;
        this.f7620c = str;
        this.f7621d = obj;
        this.f7622e = obj2;
        this.f7623f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        C1725f4 c1725f4;
        char c3;
        C1877s4 m9420q = this.f7624g.f7550a.m9420q();
        if (!m9420q.m9223s()) {
            this.f7624g.m9306a(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c = this.f7624g.f7538c;
        if (c == 0) {
            if (this.f7624g.m9326m().m9492o()) {
                c1725f4 = this.f7624g;
                c1725f4.mo9317d();
                c3 = 'C';
            } else {
                c1725f4 = this.f7624g;
                c1725f4.mo9317d();
                c3 = 'c';
            }
            c1725f4.f7538c = c3;
        }
        j = this.f7624g.f7539d;
        if (j < 0) {
            C1725f4 c1725f42 = this.f7624g;
            c1725f42.f7539d = c1725f42.m9326m().m9491n();
        }
        char charAt = "01VDIWEA?".charAt(this.f7619b);
        c2 = this.f7624g.f7538c;
        j2 = this.f7624g.f7539d;
        String m9300a = C1725f4.m9300a(true, this.f7620c, this.f7621d, this.f7622e, this.f7623f);
        StringBuilder sb = new StringBuilder(String.valueOf(m9300a).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c2);
        sb.append(j2);
        sb.append(":");
        sb.append(m9300a);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.f7620c.substring(0, 1024);
        }
        m9420q.f8022d.m9840a(sb2, 1L);
    }
}
