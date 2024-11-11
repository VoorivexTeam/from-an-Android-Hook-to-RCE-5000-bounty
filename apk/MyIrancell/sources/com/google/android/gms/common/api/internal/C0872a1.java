package com.google.android.gms.common.api.internal;

import java.util.concurrent.ExecutorService;
import p000.C2522gq;
import p000.C2562hq;
import p000.ThreadFactoryC0431ap;

/* renamed from: com.google.android.gms.common.api.internal.a1 */
/* loaded from: classes.dex */
public final class C0872a1 {

    /* renamed from: a */
    private static final ExecutorService f5735a = C2522gq.m12038a().mo11630a(2, new ThreadFactoryC0431ap("GAC_Executor"), C2562hq.f10508a);

    /* renamed from: a */
    public static ExecutorService m6605a() {
        return f5735a;
    }
}
