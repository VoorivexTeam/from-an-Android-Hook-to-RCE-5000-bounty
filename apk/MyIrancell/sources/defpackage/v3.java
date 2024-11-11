package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class v3<D> {
    int a;
    c<D> b;
    b<D> c;
    Context d;
    boolean e = false;
    boolean f = false;
    boolean g = true;
    boolean h = false;
    boolean i = false;

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
            v3.this.n();
        }
    }

    /* loaded from: classes.dex */
    public interface b<D> {
        void a(v3<D> v3Var);
    }

    /* loaded from: classes.dex */
    public interface c<D> {
        void a(v3<D> v3Var, D d);
    }

    public v3(Context context) {
        this.d = context.getApplicationContext();
    }

    public String a(D d) {
        StringBuilder sb = new StringBuilder(64);
        q1.a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public void a(int i, c<D> cVar) {
        if (this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = cVar;
        this.a = i;
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.e || this.h || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.i);
        }
        if (this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f);
            printWriter.print(" mReset=");
            printWriter.println(this.g);
        }
    }

    public void a(c<D> cVar) {
        c<D> cVar2 = this.b;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (cVar2 != cVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }

    public void b() {
        this.f = true;
        l();
    }

    public void b(D d) {
        c<D> cVar = this.b;
        if (cVar != null) {
            cVar.a(this, d);
        }
    }

    public boolean c() {
        return m();
    }

    public void d() {
        this.i = false;
    }

    public void e() {
        b<D> bVar = this.c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void f() {
        o();
    }

    public Context g() {
        return this.d;
    }

    public int h() {
        return this.a;
    }

    public boolean i() {
        return this.f;
    }

    public boolean j() {
        return this.g;
    }

    public boolean k() {
        return this.e;
    }

    protected void l() {
    }

    protected boolean m() {
        throw null;
    }

    public void n() {
        if (this.e) {
            f();
        } else {
            this.h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
    }

    protected void q() {
        throw null;
    }

    protected void r() {
    }

    public void s() {
        p();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public void t() {
        if (this.i) {
            n();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        q1.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final void u() {
        this.e = true;
        this.g = false;
        this.f = false;
        q();
    }

    public void v() {
        this.e = false;
        r();
    }

    public boolean w() {
        boolean z = this.h;
        this.h = false;
        this.i |= z;
        return z;
    }
}
