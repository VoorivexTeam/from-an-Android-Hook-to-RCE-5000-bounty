package ir.metrix.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(14)
/* renamed from: ir.metrix.sdk.y */
/* loaded from: classes.dex */
public class C2646y implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private C2645x f10843a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2646y(C2647z c2647z) {
        this.f10843a = C2645x.m12688a(c2647z);
        if (c2647z != null) {
            c2647z.m12833c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2646y(C2647z c2647z, Activity activity) {
        this.f10843a = C2645x.m12688a(c2647z);
        if (c2647z != null) {
            c2647z.m12833c();
        }
        onActivityCreated(activity, new Bundle());
        onActivityStarted(activity);
        onActivityResumed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f10843a.m12691a(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f10843a.m12696e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f10843a.m12694c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f10843a.m12692b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f10843a.m12693b(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f10843a.m12690a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f10843a.m12695d(activity);
    }
}
