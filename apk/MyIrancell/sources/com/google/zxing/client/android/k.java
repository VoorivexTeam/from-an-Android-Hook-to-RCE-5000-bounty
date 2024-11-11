package com.google.zxing.client.android;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k {
    private static final String e = "k";
    private final Activity a;
    private final BroadcastReceiver b = new c();
    private boolean c = false;
    private AsyncTask<Object, Object, Object> d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b extends AsyncTask<Object, Object, Object> {
        private b() {
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000L);
                String unused = k.e;
                k.this.a.finish();
                return null;
            } catch (InterruptedException unused2) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    private final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    k.this.a();
                } else {
                    k.this.f();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Activity activity) {
        this.a = activity;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        AsyncTask<Object, Object, Object> asyncTask = this.d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        f();
        b bVar = new b();
        this.d = bVar;
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    }

    public synchronized void b() {
        f();
        if (this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }

    public synchronized void c() {
        if (!this.c) {
            this.a.registerReceiver(this.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.c = true;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        f();
    }
}
