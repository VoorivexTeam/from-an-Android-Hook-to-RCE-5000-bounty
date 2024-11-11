package p000;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import p000.InterfaceC2472fg;

/* renamed from: hg */
/* loaded from: classes.dex */
final class C2552hg implements InterfaceC2472fg {

    /* renamed from: a */
    private final Context f10481a;

    /* renamed from: b */
    final InterfaceC2472fg.a f10482b;

    /* renamed from: c */
    boolean f10483c;

    /* renamed from: d */
    private boolean f10484d;

    /* renamed from: e */
    private final BroadcastReceiver f10485e = new a();

    /* renamed from: hg$a */
    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C2552hg c2552hg = C2552hg.this;
            boolean z = c2552hg.f10483c;
            c2552hg.f10483c = c2552hg.m12218a(context);
            if (z != C2552hg.this.f10483c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    String str = "connectivity changed, isConnected: " + C2552hg.this.f10483c;
                }
                C2552hg c2552hg2 = C2552hg.this;
                c2552hg2.f10482b.mo3945a(c2552hg2.f10483c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2552hg(Context context, InterfaceC2472fg.a aVar) {
        this.f10481a = context.getApplicationContext();
        this.f10482b = aVar;
    }

    /* renamed from: e */
    private void m12216e() {
        if (this.f10484d) {
            return;
        }
        this.f10483c = m12218a(this.f10481a);
        try {
            this.f10481a.registerReceiver(this.f10485e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f10484d = true;
        } catch (SecurityException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
        }
    }

    /* renamed from: f */
    private void m12217f() {
        if (this.f10484d) {
            this.f10481a.unregisterReceiver(this.f10485e);
            this.f10484d = false;
        }
    }

    @Override // p000.InterfaceC2896lg
    /* renamed from: a */
    public void mo3931a() {
        m12216e();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    boolean m12218a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C2816ji.m13459a(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    @Override // p000.InterfaceC2896lg
    /* renamed from: b */
    public void mo3936b() {
        m12217f();
    }

    @Override // p000.InterfaceC2896lg
    /* renamed from: d */
    public void mo3938d() {
    }
}
