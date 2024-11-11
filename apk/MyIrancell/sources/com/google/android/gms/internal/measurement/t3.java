package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class t3 {
    private t3() {
    }

    public static int a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t3 a(byte[] bArr, int i, int i2, boolean z) {
        u3 u3Var = new u3(bArr, 0, i2, false);
        try {
            u3Var.b(i2);
            return u3Var;
        } catch (w4 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
