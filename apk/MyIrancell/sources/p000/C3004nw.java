package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: nw */
/* loaded from: classes.dex */
public final class C3004nw implements Camera.AutoFocusCallback {

    /* renamed from: f */
    private static final String f12359f = C3004nw.class.getSimpleName();

    /* renamed from: g */
    private static final Collection<String> f12360g;

    /* renamed from: a */
    private boolean f12361a;

    /* renamed from: b */
    private boolean f12362b;

    /* renamed from: c */
    private final boolean f12363c;

    /* renamed from: d */
    private final Camera f12364d;

    /* renamed from: e */
    private AsyncTask<?, ?, ?> f12365e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nw$b */
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
            C3004nw.this.m14396a();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f12360g = arrayList;
        arrayList.add("auto");
        f12360g.add("macro");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3004nw(Context context, Camera camera) {
        this.f12364d = camera;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String focusMode = camera.getParameters().getFocusMode();
        this.f12363c = defaultSharedPreferences.getBoolean("preferences_auto_focus", true) && f12360g.contains(focusMode);
        String str = "Current focus mode '" + focusMode + "'; use auto focus? " + this.f12363c;
        m14396a();
    }

    /* renamed from: c */
    private synchronized void m14394c() {
        if (!this.f12361a && this.f12365e == null) {
            b bVar = new b();
            try {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.f12365e = bVar;
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: d */
    private synchronized void m14395d() {
        if (this.f12365e != null) {
            if (this.f12365e.getStatus() != AsyncTask.Status.FINISHED) {
                this.f12365e.cancel(true);
            }
            this.f12365e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m14396a() {
        if (this.f12363c) {
            this.f12365e = null;
            if (!this.f12361a && !this.f12362b) {
                try {
                    this.f12364d.autoFocus(this);
                    this.f12362b = true;
                } catch (RuntimeException unused) {
                    m14394c();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m14397b() {
        this.f12361a = true;
        if (this.f12363c) {
            m14395d();
            try {
                this.f12364d.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean z, Camera camera) {
        this.f12362b = false;
        m14394c();
    }
}
