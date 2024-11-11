package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p000.AbstractC3266tl;
import p000.C0485bm;
import p000.C0529co;
import p000.InterfaceC3132qm;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.e */
/* loaded from: classes.dex */
public class C0786e implements InterfaceC0800s {

    /* renamed from: a */
    private final Context f5409a;

    /* renamed from: b */
    private final InterfaceC3132qm f5410b;

    /* renamed from: c */
    private final AbstractC0788g f5411c;

    public C0786e(Context context, InterfaceC3132qm interfaceC3132qm, AbstractC0788g abstractC0788g) {
        this.f5409a = context;
        this.f5410b = interfaceC3132qm;
        this.f5411c = abstractC0788g;
    }

    /* renamed from: a */
    private boolean m6305a(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    /* renamed from: a */
    int m6306a(AbstractC3266tl abstractC3266tl) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f5409a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC3266tl.mo13735a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C0529co.m3699a(abstractC3266tl.mo13737c())).array());
        if (abstractC3266tl.mo13736b() != null) {
            adler32.update(abstractC3266tl.mo13736b());
        }
        return (int) adler32.getValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC0800s
    /* renamed from: a */
    public void mo6293a(AbstractC3266tl abstractC3266tl, int i) {
        ComponentName componentName = new ComponentName(this.f5409a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f5409a.getSystemService("jobscheduler");
        int m6306a = m6306a(abstractC3266tl);
        if (m6305a(jobScheduler, m6306a, i)) {
            C0485bm.m3430a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC3266tl);
            return;
        }
        long mo14376b = this.f5410b.mo14376b(abstractC3266tl);
        AbstractC0788g abstractC0788g = this.f5411c;
        JobInfo.Builder builder = new JobInfo.Builder(m6306a, componentName);
        abstractC0788g.m6314a(builder, abstractC3266tl.mo13737c(), mo14376b, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", abstractC3266tl.mo13735a());
        persistableBundle.putInt("priority", C0529co.m3699a(abstractC3266tl.mo13737c()));
        if (abstractC3266tl.mo13736b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC3266tl.mo13736b(), 0));
        }
        builder.setExtras(persistableBundle);
        C0485bm.m3432a("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC3266tl, Integer.valueOf(m6306a), Long.valueOf(this.f5411c.m6313a(abstractC3266tl.mo13737c(), mo14376b, i)), Long.valueOf(mo14376b), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }
}
