package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p000.AbstractC3266tl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0789h implements Runnable {

    /* renamed from: b */
    private final C0794m f5416b;

    /* renamed from: c */
    private final AbstractC3266tl f5417c;

    /* renamed from: d */
    private final int f5418d;

    /* renamed from: e */
    private final Runnable f5419e;

    private RunnableC0789h(C0794m c0794m, AbstractC3266tl abstractC3266tl, int i, Runnable runnable) {
        this.f5416b = c0794m;
        this.f5417c = abstractC3266tl;
        this.f5418d = i;
        this.f5419e = runnable;
    }

    /* renamed from: a */
    public static Runnable m6319a(C0794m c0794m, AbstractC3266tl abstractC3266tl, int i, Runnable runnable) {
        return new RunnableC0789h(c0794m, abstractC3266tl, i, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        C0794m.m6328a(this.f5416b, this.f5417c, this.f5418d, this.f5419e);
    }
}
