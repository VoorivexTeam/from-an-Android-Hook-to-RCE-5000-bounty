package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class g5 {
    private static final g5 a;
    private static final g5 b;

    static {
        j5 j5Var = null;
        a = new i5();
        b = new m5();
    }

    private g5() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g5 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g5 b() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void a(Object obj, Object obj2, long j);
}
