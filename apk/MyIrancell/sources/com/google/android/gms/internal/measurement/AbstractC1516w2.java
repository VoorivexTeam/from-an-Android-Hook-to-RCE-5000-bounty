package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1516w2;
import com.google.android.gms.internal.measurement.AbstractC1530x2;

/* renamed from: com.google.android.gms.internal.measurement.w2 */
/* loaded from: classes.dex */
public abstract class AbstractC1516w2<MessageType extends AbstractC1530x2<MessageType, BuilderType>, BuilderType extends AbstractC1516w2<MessageType, BuilderType>> implements InterfaceC1198a6 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1198a6
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1198a6 mo7533a(InterfaceC1533x5 interfaceC1533x5) {
        if (mo8093b().getClass().isInstance(interfaceC1533x5)) {
            return mo8103a((AbstractC1516w2<MessageType, BuilderType>) interfaceC1533x5);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1198a6
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1198a6 mo7534a(byte[] bArr) {
        mo8104a(bArr, 0, bArr.length);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1198a6
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1198a6 mo7535a(byte[] bArr, C1196a4 c1196a4) {
        mo8105a(bArr, 0, bArr.length, c1196a4);
        return this;
    }

    /* renamed from: a */
    protected abstract BuilderType mo8103a(MessageType messagetype);

    /* renamed from: a */
    public abstract BuilderType mo8104a(byte[] bArr, int i, int i2);

    /* renamed from: a */
    public abstract BuilderType mo8105a(byte[] bArr, int i, int i2, C1196a4 c1196a4);
}
