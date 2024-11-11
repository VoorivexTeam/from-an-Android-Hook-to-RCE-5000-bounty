package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes.dex */
final /* synthetic */ class b implements Runnable {
    private static final b b = new b();

    private b() {
    }

    public static Runnable a() {
        return b;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlarmManagerSchedulerBroadcastReceiver.a();
    }
}
