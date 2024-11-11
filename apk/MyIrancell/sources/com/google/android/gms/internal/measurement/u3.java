package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u3 extends t3 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    private u3(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.e = Integer.MAX_VALUE;
        this.a = i2 + i;
        this.c = i;
        this.d = i;
    }

    private final void b() {
        int i = this.a + this.b;
        this.a = i;
        int i2 = i - this.d;
        int i3 = this.e;
        if (i2 <= i3) {
            this.b = 0;
            return;
        }
        int i4 = i2 - i3;
        this.b = i4;
        this.a = i - i4;
    }

    public final int a() {
        return this.c - this.d;
    }

    public final int b(int i) {
        if (i < 0) {
            throw w4.b();
        }
        int a = i + a();
        int i2 = this.e;
        if (a > i2) {
            throw w4.a();
        }
        this.e = a;
        b();
        return i2;
    }
}
