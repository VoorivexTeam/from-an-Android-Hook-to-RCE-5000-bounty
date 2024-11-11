package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.q */
/* loaded from: classes.dex */
abstract class AbstractBinderC1075q extends AbstractBinderC1073o {

    /* renamed from: c */
    private static final WeakReference<byte[]> f6289c = new WeakReference<>(null);

    /* renamed from: b */
    private WeakReference<byte[]> f6290b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC1075q(byte[] bArr) {
        super(bArr);
        this.f6290b = f6289c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC1073o
    /* renamed from: a */
    public final byte[] mo7313a() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f6290b.get();
            if (bArr == null) {
                bArr = mo7314h();
                this.f6290b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: h */
    protected abstract byte[] mo7314h();
}
