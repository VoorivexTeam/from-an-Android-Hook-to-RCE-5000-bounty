package ir.metrix.sdk;

import android.app.Activity;
import android.os.Bundle;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ir.metrix.sdk.x */
/* loaded from: classes.dex */
public class C2645x {

    /* renamed from: a */
    private static C2645x f10839a;

    /* renamed from: b */
    private final AtomicInteger f10840b = new AtomicInteger(0);

    /* renamed from: c */
    private C2647z f10841c;

    /* renamed from: d */
    private WeakHashMap<Activity, Boolean> f10842d;

    private C2645x(C2647z c2647z) {
        this.f10841c = null;
        if (c2647z == null) {
            C2610ab.m12529b("MetrixActivityLifecycleCallbacks", "Need to initialize MetrixActivityLifecycleCallbacks with MetrixCore instance");
        } else {
            this.f10841c = c2647z;
            this.f10842d = new WeakHashMap<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2645x m12688a(C2647z c2647z) {
        if (f10839a == null) {
            f10839a = new C2645x(c2647z);
        }
        return f10839a;
    }

    /* renamed from: f */
    private boolean m12689f(Activity activity) {
        if (this.f10842d.containsKey(activity)) {
            return this.f10842d.get(activity).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12690a(Activity activity) {
        if (m12689f(activity)) {
            return;
        }
        this.f10840b.addAndGet(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12691a(Activity activity, Bundle bundle) {
        WeakHashMap<Activity, Boolean> weakHashMap = this.f10842d;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("isConfigurationChanged", false)) {
            z = true;
        }
        weakHashMap.put(activity, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m12692b(Activity activity) {
        C2647z c2647z = this.f10841c;
        if (c2647z == null) {
            C2610ab.m12529b("MetrixActivityLifecycleCallbacks", "Need to initialize MetrixActivityLifecycleCallbacks with MetrixCore instance");
            return;
        }
        c2647z.m12840d(System.currentTimeMillis());
        if (!this.f10841c.m12846e() || m12689f(activity)) {
            return;
        }
        this.f10841c.m12845e(activity.getClass().getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m12693b(Activity activity, Bundle bundle) {
        if (activity.isChangingConfigurations()) {
            bundle.putBoolean("isConfigurationChanged", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m12694c(Activity activity) {
        C2647z c2647z = this.f10841c;
        if (c2647z == null) {
            C2610ab.m12529b("MetrixActivityLifecycleCallbacks", "Need to initialize MetrixActivityLifecycleCallbacks with MetrixCore instance");
        } else {
            c2647z.m12827b(System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m12695d(Activity activity) {
        if (activity.isChangingConfigurations()) {
            return;
        }
        if (this.f10840b.addAndGet(-1) == 0) {
            this.f10841c.m12834c(System.currentTimeMillis());
        }
        if (this.f10842d.containsKey(activity)) {
            this.f10842d.remove(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m12696e(Activity activity) {
    }
}
