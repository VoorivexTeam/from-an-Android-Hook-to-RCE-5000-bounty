package p000;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: t3 */
/* loaded from: classes.dex */
public abstract class AbstractC3233t3<D> extends C3329v3<D> {

    /* renamed from: j */
    private final Executor f13175j;

    /* renamed from: k */
    volatile AbstractC3233t3<D>.a f13176k;

    /* renamed from: l */
    volatile AbstractC3233t3<D>.a f13177l;

    /* renamed from: m */
    long f13178m;

    /* renamed from: n */
    long f13179n;

    /* renamed from: o */
    Handler f13180o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t3$a */
    /* loaded from: classes.dex */
    public final class a extends AbstractC3383w3<Void, Void, D> implements Runnable {

        /* renamed from: k */
        private final CountDownLatch f13181k = new CountDownLatch(1);

        /* renamed from: l */
        boolean f13182l;

        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p000.AbstractC3383w3
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public D mo15507a(Void... voidArr) {
            try {
                return (D) AbstractC3233t3.this.m15497B();
            } catch (C2453f1 e) {
                if (m16122a()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // p000.AbstractC3383w3
        /* renamed from: b */
        protected void mo15508b(D d) {
            try {
                AbstractC3233t3.this.m15499a((AbstractC3233t3<a>.a) this, (a) d);
            } finally {
                this.f13181k.countDown();
            }
        }

        @Override // p000.AbstractC3383w3
        /* renamed from: c */
        protected void mo15509c(D d) {
            try {
                AbstractC3233t3.this.m15500b(this, d);
            } finally {
                this.f13181k.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13182l = false;
            AbstractC3233t3.this.m15505y();
        }
    }

    public AbstractC3233t3(Context context) {
        this(context, AbstractC3383w3.f13741i);
    }

    private AbstractC3233t3(Context context, Executor executor) {
        super(context);
        this.f13179n = -10000L;
        this.f13175j = executor;
    }

    /* renamed from: A */
    public abstract D mo6458A();

    /* renamed from: B */
    protected D m15497B() {
        return mo6458A();
    }

    @Override // p000.C3329v3
    @Deprecated
    /* renamed from: a */
    public void mo15498a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo15498a(str, fileDescriptor, printWriter, strArr);
        if (this.f13176k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f13176k);
            printWriter.print(" waiting=");
            printWriter.println(this.f13176k.f13182l);
        }
        if (this.f13177l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f13177l);
            printWriter.print(" waiting=");
            printWriter.println(this.f13177l.f13182l);
        }
        if (this.f13178m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C3459y1.m16547a(this.f13178m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C3459y1.m16546a(this.f13179n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* renamed from: a */
    void m15499a(AbstractC3233t3<D>.a aVar, D d) {
        mo15501c(d);
        if (this.f13177l == aVar) {
            m15915t();
            this.f13179n = SystemClock.uptimeMillis();
            this.f13177l = null;
            m15905e();
            m15505y();
        }
    }

    /* renamed from: b */
    void m15500b(AbstractC3233t3<D>.a aVar, D d) {
        if (this.f13176k != aVar) {
            m15499a((AbstractC3233t3<AbstractC3233t3<D>.a>.a) aVar, (AbstractC3233t3<D>.a) d);
            return;
        }
        if (m15909i()) {
            mo15501c(d);
            return;
        }
        m15904d();
        this.f13179n = SystemClock.uptimeMillis();
        this.f13176k = null;
        mo15718b(d);
    }

    /* renamed from: c */
    public void mo15501c(D d) {
    }

    @Override // p000.C3329v3
    /* renamed from: m */
    protected boolean mo15502m() {
        if (this.f13176k == null) {
            return false;
        }
        if (!this.f13547e) {
            this.f13550h = true;
        }
        if (this.f13177l != null) {
            if (this.f13176k.f13182l) {
                this.f13176k.f13182l = false;
                this.f13180o.removeCallbacks(this.f13176k);
            }
            this.f13176k = null;
            return false;
        }
        if (this.f13176k.f13182l) {
            this.f13176k.f13182l = false;
            this.f13180o.removeCallbacks(this.f13176k);
            this.f13176k = null;
            return false;
        }
        boolean m16123a = this.f13176k.m16123a(false);
        if (m16123a) {
            this.f13177l = this.f13176k;
            mo15504x();
        }
        this.f13176k = null;
        return m16123a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.C3329v3
    /* renamed from: o */
    public void mo15503o() {
        super.mo15503o();
        m15903c();
        this.f13176k = new a();
        m15505y();
    }

    /* renamed from: x */
    public void mo15504x() {
    }

    /* renamed from: y */
    void m15505y() {
        if (this.f13177l != null || this.f13176k == null) {
            return;
        }
        if (this.f13176k.f13182l) {
            this.f13176k.f13182l = false;
            this.f13180o.removeCallbacks(this.f13176k);
        }
        if (this.f13178m <= 0 || SystemClock.uptimeMillis() >= this.f13179n + this.f13178m) {
            this.f13176k.m16120a(this.f13175j, null);
        } else {
            this.f13176k.f13182l = true;
            this.f13180o.postAtTime(this.f13176k, this.f13179n + this.f13178m);
        }
    }

    /* renamed from: z */
    public boolean m15506z() {
        return this.f13177l != null;
    }
}
