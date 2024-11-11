package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p000.AbstractC3266tl;
import p000.C0529co;
import p000.C3491yl;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C3491yl.m16649a(getApplicationContext());
        AbstractC3266tl.a m15657d = AbstractC3266tl.m15657d();
        m15657d.mo13739a(string);
        m15657d.mo13738a(C0529co.m3700a(i));
        if (string2 != null) {
            m15657d.mo13740a(Base64.decode(string2, 0));
        }
        C3491yl.m16651b().m16652a().m6330a(m15657d.mo13741a(), i2, RunnableC0787f.m6307a(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
