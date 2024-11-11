package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.measurement.l6 */
/* loaded from: classes.dex */
public final class C1363l6 {

    /* renamed from: b */
    private static final Method f6715b = m7969a();

    /* renamed from: c */
    private static final Method f6716c = m7970b();

    /* renamed from: a */
    private final JobScheduler f6717a;

    private C1363l6(JobScheduler jobScheduler) {
        this.f6717a = jobScheduler;
    }

    /* renamed from: a */
    private final int m7967a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f6715b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f6717a, jobInfo, str, Integer.valueOf(i), str2)).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return this.f6717a.schedule(jobInfo);
    }

    /* renamed from: a */
    public static int m7968a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return (f6715b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new C1363l6(jobScheduler).m7967a(jobInfo, str, m7971c(), str2);
    }

    /* renamed from: a */
    private static Method m7969a() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            Log.isLoggable("JobSchedulerCompat", 6);
            return null;
        }
    }

    /* renamed from: b */
    private static Method m7970b() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                Log.isLoggable("JobSchedulerCompat", 6);
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m7971c() {
        Method method = f6716c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                Log.isLoggable("JobSchedulerCompat", 6);
            }
        }
        return 0;
    }
}
