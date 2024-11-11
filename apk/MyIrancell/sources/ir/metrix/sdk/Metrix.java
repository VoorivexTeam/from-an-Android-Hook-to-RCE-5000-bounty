package ir.metrix.sdk;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public class Metrix implements NoProguard {
    private static MetrixClient instance;

    public static synchronized MetrixClient getInstance() {
        MetrixClient metrixClient;
        synchronized (Metrix.class) {
            if (instance == null) {
                instance = new MetrixClient();
            }
            metrixClient = instance;
        }
        return metrixClient;
    }

    public static void initialize(Activity activity, String str) {
        getInstance().initializeAndTrack(activity, str);
    }

    public static void initialize(Application application, String str) {
        getInstance().initialize(application, str);
    }
}
