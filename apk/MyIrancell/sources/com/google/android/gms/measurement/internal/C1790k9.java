package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.C1337ja;
import com.google.android.gms.internal.measurement.C1363l6;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
/* loaded from: classes.dex */
public final class C1790k9 extends AbstractC1849p9 {

    /* renamed from: d */
    private final AlarmManager f7725d;

    /* renamed from: e */
    private final AbstractC1732g f7726e;

    /* renamed from: f */
    private Integer f7727f;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1790k9(C1838o9 c1838o9) {
        super(c1838o9);
        this.f7725d = (AlarmManager) mo9325l().getSystemService("alarm");
        this.f7726e = new C1826n9(this, c1838o9.m9699t(), c1838o9);
    }

    @TargetApi(24)
    /* renamed from: v */
    private final void m9458v() {
        JobScheduler jobScheduler = (JobScheduler) mo9325l().getSystemService("jobscheduler");
        int m9459w = m9459w();
        if (!m9461y()) {
            mo9324k().m9304B().m9366a("Cancelling job. JobID", Integer.valueOf(m9459w));
        }
        jobScheduler.cancel(m9459w);
    }

    /* renamed from: w */
    private final int m9459w() {
        if (this.f7727f == null) {
            String valueOf = String.valueOf(mo9325l().getPackageName());
            this.f7727f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f7727f.intValue();
    }

    /* renamed from: x */
    private final PendingIntent m9460x() {
        Context l = mo9325l();
        return PendingIntent.getBroadcast(l, 0, new Intent().setClassName(l, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: y */
    private final boolean m9461y() {
        return C1337ja.m7940a() && m9326m().m9480a(C1828o.f7847Y0);
    }

    /* renamed from: a */
    public final void m9462a(long j) {
        m9755r();
        mo9317d();
        Context l = mo9325l();
        if (!C1954z4.m9903a(l)) {
            mo9324k().m9303A().m9365a("Receiver not registered/enabled");
        }
        if (!C1959z9.m9911a(l, false)) {
            mo9324k().m9303A().m9365a("Service not registered/enabled");
        }
        m9463u();
        if (m9461y()) {
            mo9324k().m9304B().m9366a("Scheduling upload, millis", Long.valueOf(j));
        }
        long mo7376b = mo9321h().mo7376b() + j;
        if (j < Math.max(0L, C1828o.f7896x.m9875a(null).longValue()) && !this.f7726e.m9331b()) {
            if (!m9461y()) {
                mo9324k().m9304B().m9365a("Scheduling upload with DelayedRunnable");
            }
            this.f7726e.m9330a(j);
        }
        mo9317d();
        if (Build.VERSION.SDK_INT < 24) {
            if (!m9461y()) {
                mo9324k().m9304B().m9365a("Scheduling upload with AlarmManager");
            }
            this.f7725d.setInexactRepeating(2, mo7376b, Math.max(C1828o.f7886s.m9875a(null).longValue(), j), m9460x());
            return;
        }
        if (!m9461y()) {
            mo9324k().m9304B().m9365a("Scheduling upload with JobScheduler");
        }
        Context l2 = mo9325l();
        ComponentName componentName = new ComponentName(l2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m9459w = m9459w();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        JobInfo build = new JobInfo.Builder(m9459w, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
        if (!m9461y()) {
            mo9324k().m9304B().m9366a("Scheduling job. JobID", Integer.valueOf(m9459w));
        }
        C1363l6.m7968a(l2, build, "com.google.android.gms", "UploadAlarm");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1849p9
    /* renamed from: t */
    protected final boolean mo9129t() {
        this.f7725d.cancel(m9460x());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m9458v();
        return false;
    }

    /* renamed from: u */
    public final void m9463u() {
        m9755r();
        if (m9461y()) {
            mo9324k().m9304B().m9365a("Unscheduling upload");
        }
        this.f7725d.cancel(m9460x());
        this.f7726e.m9332c();
        if (Build.VERSION.SDK_INT >= 24) {
            m9458v();
        }
    }
}
