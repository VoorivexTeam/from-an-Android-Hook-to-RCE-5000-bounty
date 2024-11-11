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

/* loaded from: classes.dex */
public final class k9 extends p9 {
    private final AlarmManager d;
    private final g e;
    private Integer f;

    /* JADX INFO: Access modifiers changed from: protected */
    public k9(o9 o9Var) {
        super(o9Var);
        this.d = (AlarmManager) l().getSystemService("alarm");
        this.e = new n9(this, o9Var.t(), o9Var);
    }

    @TargetApi(24)
    private final void v() {
        JobScheduler jobScheduler = (JobScheduler) l().getSystemService("jobscheduler");
        int w = w();
        if (!y()) {
            k().B().a("Cancelling job. JobID", Integer.valueOf(w));
        }
        jobScheduler.cancel(w);
    }

    private final int w() {
        if (this.f == null) {
            String valueOf = String.valueOf(l().getPackageName());
            this.f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f.intValue();
    }

    private final PendingIntent x() {
        Context l = l();
        return PendingIntent.getBroadcast(l, 0, new Intent().setClassName(l, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    private final boolean y() {
        return com.google.android.gms.internal.measurement.ja.a() && m().a(o.Y0);
    }

    public final void a(long j) {
        r();
        d();
        Context l = l();
        if (!z4.a(l)) {
            k().A().a("Receiver not registered/enabled");
        }
        if (!z9.a(l, false)) {
            k().A().a("Service not registered/enabled");
        }
        u();
        if (y()) {
            k().B().a("Scheduling upload, millis", Long.valueOf(j));
        }
        long b = h().b() + j;
        if (j < Math.max(0L, o.x.a(null).longValue()) && !this.e.b()) {
            if (!y()) {
                k().B().a("Scheduling upload with DelayedRunnable");
            }
            this.e.a(j);
        }
        d();
        if (Build.VERSION.SDK_INT < 24) {
            if (!y()) {
                k().B().a("Scheduling upload with AlarmManager");
            }
            this.d.setInexactRepeating(2, b, Math.max(o.s.a(null).longValue(), j), x());
            return;
        }
        if (!y()) {
            k().B().a("Scheduling upload with JobScheduler");
        }
        Context l2 = l();
        ComponentName componentName = new ComponentName(l2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int w = w();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        JobInfo build = new JobInfo.Builder(w, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
        if (!y()) {
            k().B().a("Scheduling job. JobID", Integer.valueOf(w));
        }
        com.google.android.gms.internal.measurement.l6.a(l2, build, "com.google.android.gms", "UploadAlarm");
    }

    @Override // com.google.android.gms.measurement.internal.p9
    protected final boolean t() {
        this.d.cancel(x());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        v();
        return false;
    }

    public final void u() {
        r();
        if (y()) {
            k().B().a("Unscheduling upload");
        }
        this.d.cancel(x());
        this.e.c();
        if (Build.VERSION.SDK_INT >= 24) {
            v();
        }
    }
}
