package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t3 */
/* loaded from: classes.dex */
public abstract class AbstractC1475t3 {
    private AbstractC1475t3() {
    }

    /* renamed from: a */
    public static int m8476a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public static long m8477a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC1475t3 m8478a(byte[] bArr, int i, int i2, boolean z) {
        C1489u3 c1489u3 = new C1489u3(bArr, 0, i2, false);
        try {
            c1489u3.m8494b(i2);
            return c1489u3;
        } catch (C1518w4 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
