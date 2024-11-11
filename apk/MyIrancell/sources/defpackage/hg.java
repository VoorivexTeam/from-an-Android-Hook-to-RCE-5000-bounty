package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import defpackage.fg;

/* loaded from: classes.dex */
final class hg implements fg {
    private final Context a;
    final fg.a b;
    boolean c;
    private boolean d;
    private final BroadcastReceiver e = new a();

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            hg hgVar = hg.this;
            boolean z = hgVar.c;
            hgVar.c = hgVar.a(context);
            if (z != hg.this.c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    String str = "connectivity changed, isConnected: " + hg.this.c;
                }
                hg hgVar2 = hg.this;
                hgVar2.b.a(hgVar2.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hg(Context context, fg.a aVar) {
        this.a = context.getApplicationContext();
        this.b = aVar;
    }

    private void e() {
        if (this.d) {
            return;
        }
        this.c = a(this.a);
        try {
            this.a.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = true;
        } catch (SecurityException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
        }
    }

    private void f() {
        if (this.d) {
            this.a.unregisterReceiver(this.e);
            this.d = false;
        }
    }

    @Override // defpackage.lg
    public void a() {
        e();
    }

    @SuppressLint({"MissingPermission"})
    boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        ji.a(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    @Override // defpackage.lg
    public void b() {
        f();
    }

    @Override // defpackage.lg
    public void d() {
    }
}
