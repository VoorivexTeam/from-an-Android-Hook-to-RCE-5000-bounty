package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: v3 */
/* loaded from: classes.dex */
public class C3329v3<D> {

    /* renamed from: a */
    int f13543a;

    /* renamed from: b */
    c<D> f13544b;

    /* renamed from: c */
    b<D> f13545c;

    /* renamed from: d */
    Context f13546d;

    /* renamed from: e */
    boolean f13547e = false;

    /* renamed from: f */
    boolean f13548f = false;

    /* renamed from: g */
    boolean f13549g = true;

    /* renamed from: h */
    boolean f13550h = false;

    /* renamed from: i */
    boolean f13551i = false;

    /* renamed from: v3$a */
    /* loaded from: classes.dex */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            C3329v3.this.m15913n();
        }
    }

    /* renamed from: v3$b */
    /* loaded from: classes.dex */
    public interface b<D> {
        /* renamed from: a */
        void m15919a(C3329v3<D> c3329v3);
    }

    /* renamed from: v3$c */
    /* loaded from: classes.dex */
    public interface c<D> {
        /* renamed from: a */
        void mo15336a(C3329v3<D> c3329v3, D d);
    }

    public C3329v3(Context context) {
        this.f13546d = context.getApplicationContext();
    }

    /* renamed from: a */
    public String m15899a(D d) {
        StringBuilder sb = new StringBuilder(64);
        C3106q1.m14876a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void m15900a(int i, c<D> cVar) {
        if (this.f13544b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f13544b = cVar;
        this.f13543a = i;
    }

    @Deprecated
    /* renamed from: a */
    public void mo15498a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f13543a);
        printWriter.print(" mListener=");
        printWriter.println(this.f13544b);
        if (this.f13547e || this.f13550h || this.f13551i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f13547e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f13550h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f13551i);
        }
        if (this.f13548f || this.f13549g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f13548f);
            printWriter.print(" mReset=");
            printWriter.println(this.f13549g);
        }
    }

    /* renamed from: a */
    public void m15901a(c<D> cVar) {
        c<D> cVar2 = this.f13544b;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (cVar2 != cVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f13544b = null;
    }

    /* renamed from: b */
    public void m15902b() {
        this.f13548f = true;
        m15912l();
    }

    /* renamed from: b */
    public void mo15718b(D d) {
        c<D> cVar = this.f13544b;
        if (cVar != null) {
            cVar.mo15336a(this, d);
        }
    }

    /* renamed from: c */
    public boolean m15903c() {
        return mo15502m();
    }

    /* renamed from: d */
    public void m15904d() {
        this.f13551i = false;
    }

    /* renamed from: e */
    public void m15905e() {
        b<D> bVar = this.f13545c;
        if (bVar != null) {
            bVar.m15919a(this);
        }
    }

    /* renamed from: f */
    public void m15906f() {
        mo15503o();
    }

    /* renamed from: g */
    public Context m15907g() {
        return this.f13546d;
    }

    /* renamed from: h */
    public int m15908h() {
        return this.f13543a;
    }

    /* renamed from: i */
    public boolean m15909i() {
        return this.f13548f;
    }

    /* renamed from: j */
    public boolean m15910j() {
        return this.f13549g;
    }

    /* renamed from: k */
    public boolean m15911k() {
        return this.f13547e;
    }

    /* renamed from: l */
    protected void m15912l() {
    }

    /* renamed from: m */
    protected boolean mo15502m() {
        throw null;
    }

    /* renamed from: n */
    public void m15913n() {
        if (this.f13547e) {
            m15906f();
        } else {
            this.f13550h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void mo15503o() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void mo15719p() {
    }

    /* renamed from: q */
    protected void mo6460q() {
        throw null;
    }

    /* renamed from: r */
    protected void mo15720r() {
    }

    /* renamed from: s */
    public void m15914s() {
        mo15719p();
        this.f13549g = true;
        this.f13547e = false;
        this.f13548f = false;
        this.f13550h = false;
        this.f13551i = false;
    }

    /* renamed from: t */
    public void m15915t() {
        if (this.f13551i) {
            m15913n();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C3106q1.m14876a(this, sb);
        sb.append(" id=");
        sb.append(this.f13543a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m15916u() {
        this.f13547e = true;
        this.f13549g = false;
        this.f13548f = false;
        mo6460q();
    }

    /* renamed from: v */
    public void m15917v() {
        this.f13547e = false;
        mo15720r();
    }

    /* renamed from: w */
    public boolean m15918w() {
        boolean z = this.f13550h;
        this.f13550h = false;
        this.f13551i |= z;
        return z;
    }
}
