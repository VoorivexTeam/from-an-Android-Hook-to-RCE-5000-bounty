package ir.metrix.sdk;

import android.app.Activity;
import android.os.Bundle;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x {
    private static x a;
    private final AtomicInteger b = new AtomicInteger(0);
    private z c;
    private WeakHashMap<Activity, Boolean> d;

    private x(z zVar) {
        this.c = null;
        if (zVar == null) {
            ab.b("MetrixActivityLifecycleCallbacks", "Need to initialize MetrixActivityLifecycleCallbacks with MetrixCore instance");
        } else {
            this.c = zVar;
            this.d = new WeakHashMap<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x a(z zVar) {
        if (a == null) {
            a = new x(zVar);
        }
        return a;
    }

    private boolean f(Activity activity) {
        if (this.d.containsKey(activity)) {
            return this.d.get(activity).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Activity activity) {
        if (f(activity)) {
            return;
        }
        this.b.addAndGet(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Activity activity, Bundle bundle) {
        WeakHashMap<Activity, Boolean> weakHashMap = this.d;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("isConfigurationChanged", false)) {
            z = true;
        }
        weakHashMap.put(activity, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Activity activity) {
        z zVar = this.c;
        if (zVar == null) {
            ab.b("MetrixActivityLifecycleCallbacks", "Need to initialize MetrixActivityLifecycleCallbacks with MetrixCore instance");
            return;
        }
        zVar.d(System.currentTimeMillis());
        if (!this.c.e() || f(activity)) {
            return;
        }
        this.c.e(activity.getClass().getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Activity activity, Bundle bundle) {
        if (activity.isChangingConfigurations()) {
            bundle.putBoolean("isConfigurationChanged", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Activity activity) {
        z zVar = this.c;
        if (zVar == null) {
            ab.b("MetrixActivityLifecycleCallbacks", "Need to initialize MetrixActivityLifecycleCallbacks with MetrixCore instance");
        } else {
            zVar.b(System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Activity activity) {
        if (activity.isChangingConfigurations()) {
            return;
        }
        if (this.b.addAndGet(-1) == 0) {
            this.c.c(System.currentTimeMillis());
        }
        if (this.d.containsKey(activity)) {
            this.d.remove(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Activity activity) {
    }
}
