package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class q extends o {
    private static final WeakReference<byte[]> c = new WeakReference<>(null);
    private WeakReference<byte[]> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(byte[] bArr) {
        super(bArr);
        this.b = c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.o
    public final byte[] a() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.b.get();
            if (bArr == null) {
                bArr = h();
                this.b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] h();
}
