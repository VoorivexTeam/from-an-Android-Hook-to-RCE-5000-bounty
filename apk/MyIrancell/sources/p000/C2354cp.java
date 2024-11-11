package p000;

import android.content.Context;
import com.google.android.gms.common.util.C1108n;

/* renamed from: cp */
/* loaded from: classes.dex */
public class C2354cp {

    /* renamed from: a */
    private static Context f9593a;

    /* renamed from: b */
    private static Boolean f9594b;

    /* renamed from: a */
    public static synchronized boolean m11205a(Context context) {
        boolean z;
        synchronized (C2354cp.class) {
            Context applicationContext = context.getApplicationContext();
            if (f9593a != null && f9594b != null && f9593a == applicationContext) {
                return f9594b.booleanValue();
            }
            f9594b = null;
            if (!C1108n.m7404j()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f9594b = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                f9593a = applicationContext;
                return f9594b.booleanValue();
            }
            z = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f9594b = z;
            f9593a = applicationContext;
            return f9594b.booleanValue();
        }
    }
}
