package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C1108n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0880c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f */
    private static final ComponentCallbacks2C0880c f5754f = new ComponentCallbacks2C0880c();

    /* renamed from: b */
    private final AtomicBoolean f5755b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f5756c = new AtomicBoolean();

    /* renamed from: d */
    @GuardedBy("sInstance")
    private final ArrayList<a> f5757d = new ArrayList<>();

    /* renamed from: e */
    @GuardedBy("sInstance")
    private boolean f5758e = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo6634a(boolean z);
    }

    private ComponentCallbacks2C0880c() {
    }

    /* renamed from: a */
    public static void m6628a(Application application) {
        synchronized (f5754f) {
            if (!f5754f.f5758e) {
                application.registerActivityLifecycleCallbacks(f5754f);
                application.registerComponentCallbacks(f5754f);
                f5754f.f5758e = true;
            }
        }
    }

    /* renamed from: b */
    public static ComponentCallbacks2C0880c m6629b() {
        return f5754f;
    }

    /* renamed from: b */
    private final void m6630b(boolean z) {
        synchronized (f5754f) {
            ArrayList<a> arrayList = this.f5757d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                a aVar = arrayList.get(i);
                i++;
                aVar.mo6634a(z);
            }
        }
    }

    /* renamed from: a */
    public final void m6631a(a aVar) {
        synchronized (f5754f) {
            this.f5757d.add(aVar);
        }
    }

    /* renamed from: a */
    public final boolean m6632a() {
        return this.f5755b.get();
    }

    @TargetApi(16)
    /* renamed from: a */
    public final boolean m6633a(boolean z) {
        if (!this.f5756c.get()) {
            if (!C1108n.m7397c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f5756c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f5755b.set(true);
            }
        }
        return m6632a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f5755b.compareAndSet(true, false);
        this.f5756c.set(true);
        if (compareAndSet) {
            m6630b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f5755b.compareAndSet(true, false);
        this.f5756c.set(true);
        if (compareAndSet) {
            m6630b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f5755b.compareAndSet(false, true)) {
            this.f5756c.set(true);
            m6630b(true);
        }
    }
}
