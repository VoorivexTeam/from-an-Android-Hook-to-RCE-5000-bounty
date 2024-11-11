package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.g;

/* loaded from: classes.dex */
public final class e2<A extends d<? extends com.google.android.gms.common.api.m, a.b>> extends q1 {
    private final A a;

    public e2(int i, A a) {
        super(i);
        this.a = a;
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(Status status) {
        this.a.c(status);
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(a3 a3Var, boolean z) {
        a3Var.a(this.a, z);
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(g.a<?> aVar) {
        try {
            this.a.b(aVar.f());
        } catch (RuntimeException e) {
            a(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.a.c(new Status(10, sb.toString()));
    }
}
