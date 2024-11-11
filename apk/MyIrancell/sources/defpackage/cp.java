package defpackage;

import android.content.Context;
import com.google.android.gms.common.util.n;

/* loaded from: classes.dex */
public class cp {
    private static Context a;
    private static Boolean b;

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (cp.class) {
            Context applicationContext = context.getApplicationContext();
            if (a != null && b != null && a == applicationContext) {
                return b.booleanValue();
            }
            b = null;
            if (!n.j()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                a = applicationContext;
                return b.booleanValue();
            }
            z = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            b = z;
            a = applicationContext;
            return b.booleanValue();
        }
    }
}
