package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f */
/* loaded from: classes.dex */
final /* synthetic */ class RunnableC0787f implements Runnable {

    /* renamed from: b */
    private final JobInfoSchedulerService f5412b;

    /* renamed from: c */
    private final JobParameters f5413c;

    private RunnableC0787f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f5412b = jobInfoSchedulerService;
        this.f5413c = jobParameters;
    }

    /* renamed from: a */
    public static Runnable m6307a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new RunnableC0787f(jobInfoSchedulerService, jobParameters);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5412b.jobFinished(this.f5413c, false);
    }
}
