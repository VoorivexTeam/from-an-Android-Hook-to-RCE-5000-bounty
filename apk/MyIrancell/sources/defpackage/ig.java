package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.core.content.b;
import defpackage.fg;

/* loaded from: classes.dex */
public class ig implements gg {
    @Override // defpackage.gg
    public fg a(Context context, fg.a aVar) {
        boolean z = b.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new hg(context, aVar) : new mg();
    }
}
