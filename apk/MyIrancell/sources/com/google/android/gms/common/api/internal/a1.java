package com.google.android.gms.common.api.internal;

import defpackage.ap;
import defpackage.gq;
import defpackage.hq;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class a1 {
    private static final ExecutorService a = gq.a().a(2, new ap("GAC_Executor"), hq.a);

    public static ExecutorService a() {
        return a;
    }
}
