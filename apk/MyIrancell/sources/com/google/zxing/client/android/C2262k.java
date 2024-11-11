package com.google.zxing.client.android;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.zxing.client.android.k */
/* loaded from: classes.dex */
public final class C2262k {

    /* renamed from: e */
    private static final String f9141e = "k";

    /* renamed from: a */
    private final Activity f9142a;

    /* renamed from: b */
    private final BroadcastReceiver f9143b = new c();

    /* renamed from: c */
    private boolean f9144c = false;

    /* renamed from: d */
    private AsyncTask<Object, Object, Object> f9145d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.zxing.client.android.k$b */
    /* loaded from: classes.dex */
    public final class b extends AsyncTask<Object, Object, Object> {
        private b() {
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000L);
                String unused = C2262k.f9141e;
                C2262k.this.f9142a.finish();
                return null;
            } catch (InterruptedException unused2) {
                return null;
            }
        }
    }

    /* renamed from: com.google.zxing.client.android.k$c */
    /* loaded from: classes.dex */
    private final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    C2262k.this.m10893a();
                } else {
                    C2262k.this.m10892f();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2262k(Activity activity) {
        this.f9142a = activity;
        m10893a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m10892f() {
        AsyncTask<Object, Object, Object> asyncTask = this.f9145d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f9145d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m10893a() {
        m10892f();
        b bVar = new b();
        this.f9145d = bVar;
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    }

    /* renamed from: b */
    public synchronized void m10894b() {
        m10892f();
        if (this.f9144c) {
            this.f9142a.unregisterReceiver(this.f9143b);
            this.f9144c = false;
        }
    }

    /* renamed from: c */
    public synchronized void m10895c() {
        if (!this.f9144c) {
            this.f9142a.registerReceiver(this.f9143b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f9144c = true;
        }
        m10893a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m10896d() {
        m10892f();
    }
}
