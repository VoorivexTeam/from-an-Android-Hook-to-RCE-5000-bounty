package com.google.android.gms.common;

import java.util.Arrays;

/* renamed from: com.google.android.gms.common.r */
/* loaded from: classes.dex */
final class BinderC1076r extends AbstractBinderC1073o {

    /* renamed from: b */
    private final byte[] f6291b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC1076r(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f6291b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC1073o
    /* renamed from: a */
    public final byte[] mo7313a() {
        return this.f6291b;
    }
}
