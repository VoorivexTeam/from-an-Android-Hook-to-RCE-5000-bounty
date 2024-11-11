package p000;

/* renamed from: fr */
/* loaded from: classes.dex */
public final class C2483fr {
    /* renamed from: a */
    public static int m11797a(int i, int i2) {
        long j = i << 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
