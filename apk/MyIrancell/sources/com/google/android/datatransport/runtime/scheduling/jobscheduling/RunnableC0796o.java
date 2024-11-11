package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.o */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0796o implements Runnable {

    /* renamed from: b */
    private final C0798q f5445b;

    private RunnableC0796o(C0798q c0798q) {
        this.f5445b = c0798q;
    }

    /* renamed from: a */
    public static Runnable m6333a(C0798q c0798q) {
        return new RunnableC0796o(c0798q);
    }

    @Override // java.lang.Runnable
    public void run() {
        r0.f5450d.mo14371a(C0797p.m6334a(this.f5445b));
    }
}
