package defpackage;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import defpackage.r3;
import defpackage.v3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s3 extends r3 {
    static boolean c = false;
    private final g a;
    private final c b;

    /* loaded from: classes.dex */
    public static class a<D> extends l<D> implements v3.c<D> {
        private final int k;
        private final Bundle l;
        private final v3<D> m;
        private g n;
        private b<D> o;
        private v3<D> p;

        a(int i, Bundle bundle, v3<D> v3Var, v3<D> v3Var2) {
            this.k = i;
            this.l = bundle;
            this.m = v3Var;
            this.p = v3Var2;
            v3Var.a(i, this);
        }

        v3<D> a(g gVar, r3.a<D> aVar) {
            b<D> bVar = new b<>(this.m, aVar);
            a(gVar, bVar);
            b<D> bVar2 = this.o;
            if (bVar2 != null) {
                a((m) bVar2);
            }
            this.n = gVar;
            this.o = bVar;
            return this.m;
        }

        v3<D> a(boolean z) {
            if (s3.c) {
                String str = "  Destroying: " + this;
            }
            this.m.c();
            this.m.b();
            b<D> bVar = this.o;
            if (bVar != null) {
                a((m) bVar);
                if (z) {
                    bVar.b();
                }
            }
            this.m.a((v3.c) this);
            if ((bVar == null || bVar.a()) && !z) {
                return this.m;
            }
            this.m.s();
            return this.p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void a(m<? super D> mVar) {
            super.a((m) mVar);
            this.n = null;
            this.o = null;
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            this.m.a(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.o);
                this.o.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(e().a((v3<D>) a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(b());
        }

        @Override // v3.c
        public void a(v3<D> v3Var, D d) {
            if (s3.c) {
                String str = "onLoadComplete: " + this;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b((a<D>) d);
            } else {
                boolean z = s3.c;
                a((a<D>) d);
            }
        }

        @Override // androidx.lifecycle.l, androidx.lifecycle.LiveData
        public void b(D d) {
            super.b((a<D>) d);
            v3<D> v3Var = this.p;
            if (v3Var != null) {
                v3Var.s();
                this.p = null;
            }
        }

        @Override // androidx.lifecycle.LiveData
        protected void c() {
            if (s3.c) {
                String str = "  Starting: " + this;
            }
            this.m.u();
        }

        @Override // androidx.lifecycle.LiveData
        protected void d() {
            if (s3.c) {
                String str = "  Stopping: " + this;
            }
            this.m.v();
        }

        v3<D> e() {
            return this.m;
        }

        void f() {
            g gVar = this.n;
            b<D> bVar = this.o;
            if (gVar == null || bVar == null) {
                return;
            }
            super.a((m) bVar);
            a(gVar, bVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.k);
            sb.append(" : ");
            q1.a(this.m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<D> implements m<D> {
        private final v3<D> a;
        private final r3.a<D> b;
        private boolean c = false;

        b(v3<D> v3Var, r3.a<D> aVar) {
            this.a = v3Var;
            this.b = aVar;
        }

        @Override // androidx.lifecycle.m
        public void a(D d) {
            if (s3.c) {
                String str = "  onLoadFinished in " + this.a + ": " + this.a.a((v3<D>) d);
            }
            this.b.a((v3<v3<D>>) this.a, (v3<D>) d);
            this.c = true;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        boolean a() {
            return this.c;
        }

        void b() {
            if (this.c) {
                if (s3.c) {
                    String str = "  Resetting: " + this.a;
                }
                this.b.a(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends p {
        private static final q.a c = new a();
        private j0<a> a = new j0<>();
        private boolean b = false;

        /* loaded from: classes.dex */
        static class a implements q.a {
            a() {
            }

            @Override // androidx.lifecycle.q.a
            public <T extends p> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c a(r rVar) {
            return (c) new q(rVar, c).a(c.class);
        }

        <D> a<D> a(int i) {
            return this.a.b(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.p
        public void a() {
            super.a();
            int b = this.a.b();
            for (int i = 0; i < b; i++) {
                this.a.f(i).a(true);
            }
            this.a.a();
        }

        void a(int i, a aVar) {
            this.a.c(i, aVar);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.a.b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.a.b(); i++) {
                    a f = this.a.f(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.a.d(i));
                    printWriter.print(": ");
                    printWriter.println(f.toString());
                    f.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void b() {
            this.b = false;
        }

        boolean c() {
            return this.b;
        }

        void d() {
            int b = this.a.b();
            for (int i = 0; i < b; i++) {
                this.a.f(i).f();
            }
        }

        void e() {
            this.b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s3(g gVar, r rVar) {
        this.a = gVar;
        this.b = c.a(rVar);
    }

    private <D> v3<D> a(int i, Bundle bundle, r3.a<D> aVar, v3<D> v3Var) {
        try {
            this.b.e();
            v3<D> a2 = aVar.a(i, bundle);
            if (a2 == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (a2.getClass().isMemberClass() && !Modifier.isStatic(a2.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a2);
            }
            a aVar2 = new a(i, bundle, a2, v3Var);
            if (c) {
                String str = "  Created new loader " + aVar2;
            }
            this.b.a(i, aVar2);
            this.b.b();
            return aVar2.a(this.a, aVar);
        } catch (Throwable th) {
            this.b.b();
            throw th;
        }
    }

    @Override // defpackage.r3
    public <D> v3<D> a(int i, Bundle bundle, r3.a<D> aVar) {
        if (this.b.c()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> a2 = this.b.a(i);
        if (c) {
            String str = "initLoader in " + this + ": args=" + bundle;
        }
        if (a2 == null) {
            return a(i, bundle, aVar, (v3) null);
        }
        if (c) {
            String str2 = "  Re-using existing loader " + a2;
        }
        return a2.a(this.a, aVar);
    }

    @Override // defpackage.r3
    public void a() {
        this.b.d();
    }

    @Override // defpackage.r3
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.r3
    public <D> v3<D> b(int i, Bundle bundle, r3.a<D> aVar) {
        if (this.b.c()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (c) {
            String str = "restartLoader in " + this + ": args=" + bundle;
        }
        a<D> a2 = this.b.a(i);
        return a(i, bundle, aVar, a2 != null ? a2.a(false) : null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        q1.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
