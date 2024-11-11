package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s6 */
/* loaded from: classes.dex */
public final class RunnableC1879s6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f8049b;

    /* renamed from: c */
    private final /* synthetic */ String f8050c;

    /* renamed from: d */
    private final /* synthetic */ Object f8051d;

    /* renamed from: e */
    private final /* synthetic */ long f8052e;

    /* renamed from: f */
    private final /* synthetic */ C1846p6 f8053f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1879s6(C1846p6 c1846p6, String str, String str2, Object obj, long j) {
        this.f8053f = c1846p6;
        this.f8049b = str;
        this.f8050c = str2;
        this.f8051d = obj;
        this.f8052e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8053f.m9741a(this.f8049b, this.f8050c, this.f8051d, this.f8052e);
    }
}
