package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class t3<D> extends v3<D> {
    private final Executor j;
    volatile t3<D>.a k;
    volatile t3<D>.a l;
    long m;
    long n;
    Handler o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a extends w3<Void, Void, D> implements Runnable {
        private final CountDownLatch k = new CountDownLatch(1);
        boolean l;

        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.w3
        public D a(Void... voidArr) {
            try {
                return (D) t3.this.B();
            } catch (f1 e) {
                if (a()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // defpackage.w3
        protected void b(D d) {
            try {
                t3.this.a((t3<a>.a) this, (a) d);
            } finally {
                this.k.countDown();
            }
        }

        @Override // defpackage.w3
        protected void c(D d) {
            try {
                t3.this.b(this, d);
            } finally {
                this.k.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.l = false;
            t3.this.y();
        }
    }

    public t3(Context context) {
        this(context, w3.i);
    }

    private t3(Context context, Executor executor) {
        super(context);
        this.n = -10000L;
        this.j = executor;
    }

    public abstract D A();

    protected D B() {
        return A();
    }

    @Override // defpackage.v3
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.l);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.l);
            printWriter.print(" waiting=");
            printWriter.println(this.l.l);
        }
        if (this.m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            y1.a(this.m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            y1.a(this.n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    void a(t3<D>.a aVar, D d) {
        c(d);
        if (this.l == aVar) {
            t();
            this.n = SystemClock.uptimeMillis();
            this.l = null;
            e();
            y();
        }
    }

    void b(t3<D>.a aVar, D d) {
        if (this.k != aVar) {
            a((t3<t3<D>.a>.a) aVar, (t3<D>.a) d);
            return;
        }
        if (i()) {
            c(d);
            return;
        }
        d();
        this.n = SystemClock.uptimeMillis();
        this.k = null;
        b(d);
    }

    public void c(D d) {
    }

    @Override // defpackage.v3
    protected boolean m() {
        if (this.k == null) {
            return false;
        }
        if (!this.e) {
            this.h = true;
        }
        if (this.l != null) {
            if (this.k.l) {
                this.k.l = false;
                this.o.removeCallbacks(this.k);
            }
            this.k = null;
            return false;
        }
        if (this.k.l) {
            this.k.l = false;
            this.o.removeCallbacks(this.k);
            this.k = null;
            return false;
        }
        boolean a2 = this.k.a(false);
        if (a2) {
            this.l = this.k;
            x();
        }
        this.k = null;
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v3
    public void o() {
        super.o();
        c();
        this.k = new a();
        y();
    }

    public void x() {
    }

    void y() {
        if (this.l != null || this.k == null) {
            return;
        }
        if (this.k.l) {
            this.k.l = false;
            this.o.removeCallbacks(this.k);
        }
        if (this.m <= 0 || SystemClock.uptimeMillis() >= this.n + this.m) {
            this.k.a(this.j, null);
        } else {
            this.k.l = true;
            this.o.postAtTime(this.k, this.n + this.m);
        }
    }

    public boolean z() {
        return this.l != null;
    }
}
