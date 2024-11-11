package defpackage;

import defpackage.om;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class rm {
    static final rm a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        abstract a a(int i);

        abstract a a(long j);

        abstract rm a();

        abstract a b(int i);

        abstract a b(long j);
    }

    static {
        a e = e();
        e.b(10485760L);
        e.b(200);
        e.a(10000);
        e.a(604800000L);
        a = e.a();
    }

    static a e() {
        return new om.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long d();
}
