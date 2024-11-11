package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p3 {
    private final v3 a;
    private final byte[] b;

    private p3(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = v3.a(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ p3(int i, g3 g3Var) {
        this(i);
    }

    public final h3 a() {
        this.a.b();
        return new r3(this.b);
    }

    public final v3 b() {
        return this.a;
    }
}
