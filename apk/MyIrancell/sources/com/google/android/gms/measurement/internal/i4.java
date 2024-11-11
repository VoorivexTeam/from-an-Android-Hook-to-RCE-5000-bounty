package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i4 implements Runnable {
    private final /* synthetic */ int b;
    private final /* synthetic */ String c;
    private final /* synthetic */ Object d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ Object f;
    private final /* synthetic */ f4 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i4(f4 f4Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.g = f4Var;
        this.b = i;
        this.c = str;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        f4 f4Var;
        char c3;
        s4 q = this.g.a.q();
        if (!q.s()) {
            this.g.a(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c = this.g.c;
        if (c == 0) {
            if (this.g.m().o()) {
                f4Var = this.g;
                f4Var.d();
                c3 = 'C';
            } else {
                f4Var = this.g;
                f4Var.d();
                c3 = 'c';
            }
            f4Var.c = c3;
        }
        j = this.g.d;
        if (j < 0) {
            f4 f4Var2 = this.g;
            f4Var2.d = f4Var2.m().n();
        }
        char charAt = "01VDIWEA?".charAt(this.b);
        c2 = this.g.c;
        j2 = this.g.d;
        String a = f4.a(true, this.c, this.d, this.e, this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c2);
        sb.append(j2);
        sb.append(":");
        sb.append(a);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.c.substring(0, 1024);
        }
        q.d.a(sb2, 1L);
    }
}
