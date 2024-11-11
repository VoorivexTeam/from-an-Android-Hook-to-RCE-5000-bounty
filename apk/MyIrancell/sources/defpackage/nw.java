package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class nw implements Camera.AutoFocusCallback {
    private static final String f = nw.class.getSimpleName();
    private static final Collection<String> g;
    private boolean a;
    private boolean b;
    private final boolean c;
    private final Camera d;
    private AsyncTask<?, ?, ?> e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b extends AsyncTask<Object, Object, Object> {
        private b() {
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
            }
            nw.this.a();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        g = arrayList;
        arrayList.add("auto");
        g.add("macro");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public nw(Context context, Camera camera) {
        this.d = camera;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String focusMode = camera.getParameters().getFocusMode();
        this.c = defaultSharedPreferences.getBoolean("preferences_auto_focus", true) && g.contains(focusMode);
        String str = "Current focus mode '" + focusMode + "'; use auto focus? " + this.c;
        a();
    }

    private synchronized void c() {
        if (!this.a && this.e == null) {
            b bVar = new b();
            try {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.e = bVar;
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    private synchronized void d() {
        if (this.e != null) {
            if (this.e.getStatus() != AsyncTask.Status.FINISHED) {
                this.e.cancel(true);
            }
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        if (this.c) {
            this.e = null;
            if (!this.a && !this.b) {
                try {
                    this.d.autoFocus(this);
                    this.b = true;
                } catch (RuntimeException unused) {
                    c();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        this.a = true;
        if (this.c) {
            d();
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean z, Camera camera) {
        this.b = false;
        c();
    }
}
