package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* loaded from: classes.dex */
final /* synthetic */ class RunnableC0783b implements Runnable {

    /* renamed from: b */
    private static final RunnableC0783b f5400b = new RunnableC0783b();

    private RunnableC0783b() {
    }

    /* renamed from: a */
    public static Runnable m6295a() {
        return f5400b;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlarmManagerSchedulerBroadcastReceiver.m6291a();
    }
}
