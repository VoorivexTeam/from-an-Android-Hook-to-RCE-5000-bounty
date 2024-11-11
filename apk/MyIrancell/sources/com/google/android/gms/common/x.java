package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class x extends v {
    private final Callable<String> e;

    private x(Callable<String> callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // com.google.android.gms.common.v
    final String a() {
        try {
            return this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
