package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.x */
/* loaded from: classes.dex */
final class C1118x extends C1116v {

    /* renamed from: e */
    private final Callable<String> f6371e;

    private C1118x(Callable<String> callable) {
        super(false, null, null);
        this.f6371e = callable;
    }

    @Override // com.google.android.gms.common.C1116v
    /* renamed from: a */
    final String mo7435a() {
        try {
            return this.f6371e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
