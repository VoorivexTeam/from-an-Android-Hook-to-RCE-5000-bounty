package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes.dex */
final class r extends o {
    private final byte[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.o
    public final byte[] a() {
        return this.b;
    }
}
