package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import defpackage.bm;
import defpackage.co;
import defpackage.qm;
import defpackage.tl;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public class e implements s {
    private final Context a;
    private final qm b;
    private final g c;

    public e(Context context, qm qmVar, g gVar) {
        this.a = context;
        this.b = qmVar;
        this.c = gVar;
    }

    private boolean a(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    int a(tl tlVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(tlVar.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(co.a(tlVar.c())).array());
        if (tlVar.b() != null) {
            adler32.update(tlVar.b());
        }
        return (int) adler32.getValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public void a(tl tlVar, int i) {
        ComponentName componentName = new ComponentName(this.a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int a = a(tlVar);
        if (a(jobScheduler, a, i)) {
            bm.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", tlVar);
            return;
        }
        long b = this.b.b(tlVar);
        g gVar = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(a, componentName);
        gVar.a(builder, tlVar.c(), b, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", tlVar.a());
        persistableBundle.putInt("priority", co.a(tlVar.c()));
        if (tlVar.b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(tlVar.b(), 0));
        }
        builder.setExtras(persistableBundle);
        bm.a("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", tlVar, Integer.valueOf(a), Long.valueOf(this.c.a(tlVar.c(), b, i)), Long.valueOf(b), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }
}
