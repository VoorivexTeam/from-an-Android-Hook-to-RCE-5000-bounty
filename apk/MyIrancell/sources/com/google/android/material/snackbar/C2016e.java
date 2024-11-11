package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.e */
/* loaded from: classes.dex */
class C2016e {

    /* renamed from: e */
    private static C2016e f8569e;

    /* renamed from: a */
    private final Object f8570a = new Object();

    /* renamed from: b */
    private final Handler f8571b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c */
    private c f8572c;

    /* renamed from: d */
    private c f8573d;

    /* renamed from: com.google.android.material.snackbar.e$a */
    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C2016e.this.m10289a((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.e$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m10291a(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.e$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final WeakReference<b> f8575a;

        /* renamed from: b */
        int f8576b;

        /* renamed from: c */
        boolean f8577c;

        /* renamed from: a */
        boolean m10292a(b bVar) {
            return bVar != null && this.f8575a.get() == bVar;
        }
    }

    private C2016e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2016e m10284a() {
        if (f8569e == null) {
            f8569e = new C2016e();
        }
        return f8569e;
    }

    /* renamed from: a */
    private boolean m10285a(c cVar, int i) {
        b bVar = cVar.f8575a.get();
        if (bVar == null) {
            return false;
        }
        this.f8571b.removeCallbacksAndMessages(cVar);
        bVar.m10291a(i);
        return true;
    }

    /* renamed from: b */
    private void m10286b(c cVar) {
        int i = cVar.f8576b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f8571b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f8571b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    /* renamed from: c */
    private boolean m10287c(b bVar) {
        c cVar = this.f8572c;
        return cVar != null && cVar.m10292a(bVar);
    }

    /* renamed from: a */
    public void m10288a(b bVar) {
        synchronized (this.f8570a) {
            if (m10287c(bVar) && !this.f8572c.f8577c) {
                this.f8572c.f8577c = true;
                this.f8571b.removeCallbacksAndMessages(this.f8572c);
            }
        }
    }

    /* renamed from: a */
    void m10289a(c cVar) {
        synchronized (this.f8570a) {
            if (this.f8572c == cVar || this.f8573d == cVar) {
                m10285a(cVar, 2);
            }
        }
    }

    /* renamed from: b */
    public void m10290b(b bVar) {
        synchronized (this.f8570a) {
            if (m10287c(bVar) && this.f8572c.f8577c) {
                this.f8572c.f8577c = false;
                m10286b(this.f8572c);
            }
        }
    }
}
