package p000;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C0237b;
import p000.InterfaceC2472fg;

/* renamed from: ig */
/* loaded from: classes.dex */
public class C2594ig implements InterfaceC2512gg {
    @Override // p000.InterfaceC2512gg
    /* renamed from: a */
    public InterfaceC2472fg mo11999a(Context context, InterfaceC2472fg.a aVar) {
        boolean z = C0237b.m1459a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new C2552hg(context, aVar) : new C2942mg();
    }
}
