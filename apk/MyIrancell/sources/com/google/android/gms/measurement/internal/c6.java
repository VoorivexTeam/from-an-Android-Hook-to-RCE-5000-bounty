package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class c6 implements Runnable {
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ long e;
    private final /* synthetic */ o5 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c6(o5 o5Var, String str, String str2, String str3, long j) {
        this.f = o5Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o9 o9Var;
        o9 o9Var2;
        String str = this.b;
        if (str == null) {
            o9Var2 = this.f.a;
            o9Var2.t().E().a(this.c, (s7) null);
        } else {
            s7 s7Var = new s7(this.d, str, this.e);
            o9Var = this.f.a;
            o9Var.t().E().a(this.c, s7Var);
        }
    }
}
