package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.w2;
import com.google.android.gms.internal.measurement.x2;

/* loaded from: classes.dex */
public abstract class w2<MessageType extends x2<MessageType, BuilderType>, BuilderType extends w2<MessageType, BuilderType>> implements a6 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.a6
    public final /* synthetic */ a6 a(x5 x5Var) {
        if (b().getClass().isInstance(x5Var)) {
            return a((w2<MessageType, BuilderType>) x5Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final /* synthetic */ a6 a(byte[] bArr) {
        a(bArr, 0, bArr.length);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final /* synthetic */ a6 a(byte[] bArr, a4 a4Var) {
        a(bArr, 0, bArr.length, a4Var);
        return this;
    }

    protected abstract BuilderType a(MessageType messagetype);

    public abstract BuilderType a(byte[] bArr, int i, int i2);

    public abstract BuilderType a(byte[] bArr, int i, int i2, a4 a4Var);
}
