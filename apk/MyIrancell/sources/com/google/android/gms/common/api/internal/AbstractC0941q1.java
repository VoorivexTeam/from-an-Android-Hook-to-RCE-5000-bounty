package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0899g;
import com.google.android.gms.common.util.C1108n;

/* renamed from: com.google.android.gms.common.api.internal.q1 */
/* loaded from: classes.dex */
public abstract class AbstractC0941q1 {
    public AbstractC0941q1(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static Status m6844a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C1108n.m7396b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo6681a(Status status);

    /* renamed from: a */
    public abstract void mo6682a(C0874a3 c0874a3, boolean z);

    /* renamed from: a */
    public abstract void mo6683a(C0899g.a<?> aVar);

    /* renamed from: a */
    public abstract void mo6684a(RuntimeException runtimeException);
}
