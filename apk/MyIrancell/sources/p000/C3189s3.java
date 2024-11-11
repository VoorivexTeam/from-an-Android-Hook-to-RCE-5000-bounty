package p000;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.AbstractC0310p;
import androidx.lifecycle.C0306l;
import androidx.lifecycle.C0311q;
import androidx.lifecycle.C0312r;
import androidx.lifecycle.InterfaceC0301g;
import androidx.lifecycle.InterfaceC0307m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p000.AbstractC3150r3;
import p000.C3329v3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s3 */
/* loaded from: classes.dex */
public class C3189s3 extends AbstractC3150r3 {

    /* renamed from: c */
    static boolean f13006c = false;

    /* renamed from: a */
    private final InterfaceC0301g f13007a;

    /* renamed from: b */
    private final c f13008b;

    /* renamed from: s3$a */
    /* loaded from: classes.dex */
    public static class a<D> extends C0306l<D> implements C3329v3.c<D> {

        /* renamed from: k */
        private final int f13009k;

        /* renamed from: l */
        private final Bundle f13010l;

        /* renamed from: m */
        private final C3329v3<D> f13011m;

        /* renamed from: n */
        private InterfaceC0301g f13012n;

        /* renamed from: o */
        private b<D> f13013o;

        /* renamed from: p */
        private C3329v3<D> f13014p;

        a(int i, Bundle bundle, C3329v3<D> c3329v3, C3329v3<D> c3329v32) {
            this.f13009k = i;
            this.f13010l = bundle;
            this.f13011m = c3329v3;
            this.f13014p = c3329v32;
            c3329v3.m15900a(i, this);
        }

        /* renamed from: a */
        C3329v3<D> m15333a(InterfaceC0301g interfaceC0301g, AbstractC3150r3.a<D> aVar) {
            b<D> bVar = new b<>(this.f13011m, aVar);
            m2009a(interfaceC0301g, bVar);
            b<D> bVar2 = this.f13013o;
            if (bVar2 != null) {
                mo2010a((InterfaceC0307m) bVar2);
            }
            this.f13012n = interfaceC0301g;
            this.f13013o = bVar;
            return this.f13011m;
        }

        /* renamed from: a */
        C3329v3<D> m15334a(boolean z) {
            if (C3189s3.f13006c) {
                String str = "  Destroying: " + this;
            }
            this.f13011m.m15903c();
            this.f13011m.m15902b();
            b<D> bVar = this.f13013o;
            if (bVar != null) {
                mo2010a((InterfaceC0307m) bVar);
                if (z) {
                    bVar.m15341b();
                }
            }
            this.f13011m.m15901a((C3329v3.c) this);
            if ((bVar == null || bVar.m15340a()) && !z) {
                return this.f13011m;
            }
            this.f13011m.m15914s();
            return this.f13014p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: a */
        public void mo2010a(InterfaceC0307m<? super D> interfaceC0307m) {
            super.mo2010a((InterfaceC0307m) interfaceC0307m);
            this.f13012n = null;
            this.f13013o = null;
        }

        /* renamed from: a */
        public void m15335a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f13009k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f13010l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f13011m);
            this.f13011m.mo15498a(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f13013o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f13013o);
                this.f13013o.m15339a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m15337e().m15899a((C3329v3<D>) m2007a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m2013b());
        }

        @Override // p000.C3329v3.c
        /* renamed from: a */
        public void mo15336a(C3329v3<D> c3329v3, D d) {
            if (C3189s3.f13006c) {
                String str = "onLoadComplete: " + this;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo2012b((a<D>) d);
            } else {
                boolean z = C3189s3.f13006c;
                mo2011a((a<D>) d);
            }
        }

        @Override // androidx.lifecycle.C0306l, androidx.lifecycle.LiveData
        /* renamed from: b */
        public void mo2012b(D d) {
            super.mo2012b((a<D>) d);
            C3329v3<D> c3329v3 = this.f13014p;
            if (c3329v3 != null) {
                c3329v3.m15914s();
                this.f13014p = null;
            }
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: c */
        protected void mo2014c() {
            if (C3189s3.f13006c) {
                String str = "  Starting: " + this;
            }
            this.f13011m.m15916u();
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: d */
        protected void mo2015d() {
            if (C3189s3.f13006c) {
                String str = "  Stopping: " + this;
            }
            this.f13011m.m15917v();
        }

        /* renamed from: e */
        C3329v3<D> m15337e() {
            return this.f13011m;
        }

        /* renamed from: f */
        void m15338f() {
            InterfaceC0301g interfaceC0301g = this.f13012n;
            b<D> bVar = this.f13013o;
            if (interfaceC0301g == null || bVar == null) {
                return;
            }
            super.mo2010a((InterfaceC0307m) bVar);
            m2009a(interfaceC0301g, bVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f13009k);
            sb.append(" : ");
            C3106q1.m14876a(this.f13011m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s3$b */
    /* loaded from: classes.dex */
    public static class b<D> implements InterfaceC0307m<D> {

        /* renamed from: a */
        private final C3329v3<D> f13015a;

        /* renamed from: b */
        private final AbstractC3150r3.a<D> f13016b;

        /* renamed from: c */
        private boolean f13017c = false;

        b(C3329v3<D> c3329v3, AbstractC3150r3.a<D> aVar) {
            this.f13015a = c3329v3;
            this.f13016b = aVar;
        }

        @Override // androidx.lifecycle.InterfaceC0307m
        /* renamed from: a */
        public void mo2060a(D d) {
            if (C3189s3.f13006c) {
                String str = "  onLoadFinished in " + this.f13015a + ": " + this.f13015a.m15899a((C3329v3<D>) d);
            }
            this.f13016b.mo4098a((C3329v3<C3329v3<D>>) this.f13015a, (C3329v3<D>) d);
            this.f13017c = true;
        }

        /* renamed from: a */
        public void m15339a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f13017c);
        }

        /* renamed from: a */
        boolean m15340a() {
            return this.f13017c;
        }

        /* renamed from: b */
        void m15341b() {
            if (this.f13017c) {
                if (C3189s3.f13006c) {
                    String str = "  Resetting: " + this.f13015a;
                }
                this.f13016b.mo4097a(this.f13015a);
            }
        }

        public String toString() {
            return this.f13016b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s3$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC0310p {

        /* renamed from: c */
        private static final C0311q.a f13018c = new a();

        /* renamed from: a */
        private C2795j0<a> f13019a = new C2795j0<>();

        /* renamed from: b */
        private boolean f13020b = false;

        /* renamed from: s3$c$a */
        /* loaded from: classes.dex */
        static class a implements C0311q.a {
            a() {
            }

            @Override // androidx.lifecycle.C0311q.a
            /* renamed from: a */
            public <T extends AbstractC0310p> T mo2071a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        /* renamed from: a */
        static c m15342a(C0312r c0312r) {
            return (c) new C0311q(c0312r, f13018c).m2069a(c.class);
        }

        /* renamed from: a */
        <D> a<D> m15343a(int i) {
            return this.f13019a.m13281b(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC0310p
        /* renamed from: a */
        public void mo2068a() {
            super.mo2068a();
            int m13280b = this.f13019a.m13280b();
            for (int i = 0; i < m13280b; i++) {
                this.f13019a.m13287f(i).m15334a(true);
            }
            this.f13019a.m13277a();
        }

        /* renamed from: a */
        void m15344a(int i, a aVar) {
            this.f13019a.m13284c(i, aVar);
        }

        /* renamed from: a */
        public void m15345a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f13019a.m13280b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f13019a.m13280b(); i++) {
                    a m13287f = this.f13019a.m13287f(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f13019a.m13285d(i));
                    printWriter.print(": ");
                    printWriter.println(m13287f.toString());
                    m13287f.m15335a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: b */
        void m15346b() {
            this.f13020b = false;
        }

        /* renamed from: c */
        boolean m15347c() {
            return this.f13020b;
        }

        /* renamed from: d */
        void m15348d() {
            int m13280b = this.f13019a.m13280b();
            for (int i = 0; i < m13280b; i++) {
                this.f13019a.m13287f(i).m15338f();
            }
        }

        /* renamed from: e */
        void m15349e() {
            this.f13020b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3189s3(InterfaceC0301g interfaceC0301g, C0312r c0312r) {
        this.f13007a = interfaceC0301g;
        this.f13008b = c.m15342a(c0312r);
    }

    /* renamed from: a */
    private <D> C3329v3<D> m15332a(int i, Bundle bundle, AbstractC3150r3.a<D> aVar, C3329v3<D> c3329v3) {
        try {
            this.f13008b.m15349e();
            C3329v3<D> mo4096a = aVar.mo4096a(i, bundle);
            if (mo4096a == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (mo4096a.getClass().isMemberClass() && !Modifier.isStatic(mo4096a.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo4096a);
            }
            a aVar2 = new a(i, bundle, mo4096a, c3329v3);
            if (f13006c) {
                String str = "  Created new loader " + aVar2;
            }
            this.f13008b.m15344a(i, aVar2);
            this.f13008b.m15346b();
            return aVar2.m15333a(this.f13007a, aVar);
        } catch (Throwable th) {
            this.f13008b.m15346b();
            throw th;
        }
    }

    @Override // p000.AbstractC3150r3
    /* renamed from: a */
    public <D> C3329v3<D> mo15185a(int i, Bundle bundle, AbstractC3150r3.a<D> aVar) {
        if (this.f13008b.m15347c()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> m15343a = this.f13008b.m15343a(i);
        if (f13006c) {
            String str = "initLoader in " + this + ": args=" + bundle;
        }
        if (m15343a == null) {
            return m15332a(i, bundle, aVar, (C3329v3) null);
        }
        if (f13006c) {
            String str2 = "  Re-using existing loader " + m15343a;
        }
        return m15343a.m15333a(this.f13007a, aVar);
    }

    @Override // p000.AbstractC3150r3
    /* renamed from: a */
    public void mo15186a() {
        this.f13008b.m15348d();
    }

    @Override // p000.AbstractC3150r3
    @Deprecated
    /* renamed from: a */
    public void mo15187a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f13008b.m15345a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p000.AbstractC3150r3
    /* renamed from: b */
    public <D> C3329v3<D> mo15188b(int i, Bundle bundle, AbstractC3150r3.a<D> aVar) {
        if (this.f13008b.m15347c()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f13006c) {
            String str = "restartLoader in " + this + ": args=" + bundle;
        }
        a<D> m15343a = this.f13008b.m15343a(i);
        return m15332a(i, bundle, aVar, m15343a != null ? m15343a.m15334a(false) : null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C3106q1.m14876a(this.f13007a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
