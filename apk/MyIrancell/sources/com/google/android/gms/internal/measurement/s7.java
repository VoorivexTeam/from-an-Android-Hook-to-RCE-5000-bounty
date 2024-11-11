package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class s7 {
    abstract int a(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String a(byte[] bArr, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(byte[] bArr, int i, int i2) {
        return a(0, bArr, i, i2) == 0;
    }
}
