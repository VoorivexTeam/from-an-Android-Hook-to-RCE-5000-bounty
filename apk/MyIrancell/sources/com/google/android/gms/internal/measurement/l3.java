package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes.dex */
final class l3 implements n3 {
    private l3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ l3(g3 g3Var) {
        this();
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
