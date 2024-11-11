package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.C0859a.d;
import com.google.android.gms.common.api.internal.InterfaceC0895f;
import com.google.android.gms.common.api.internal.InterfaceC0923m;
import com.google.android.gms.common.internal.AbstractC1020d;
import com.google.android.gms.common.internal.C1022e;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.InterfaceC1038m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes.dex */
public final class C0859a<O extends d> {

    /* renamed from: a */
    private final a<?, O> f5677a;

    /* renamed from: b */
    private final g<?> f5678b;

    /* renamed from: c */
    private final String f5679c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* loaded from: classes.dex */
    public static abstract class a<T extends f, O> extends e<T, O> {
        @Deprecated
        /* renamed from: a */
        public T mo6386a(Context context, Looper looper, C1022e c1022e, O o, AbstractC0864f.b bVar, AbstractC0864f.c cVar) {
            return mo6506a(context, looper, c1022e, (C1022e) o, (InterfaceC0895f) bVar, (InterfaceC0923m) cVar);
        }

        /* renamed from: a */
        public T mo6506a(Context context, Looper looper, C1022e c1022e, O o, InterfaceC0895f interfaceC0895f, InterfaceC0923m interfaceC0923m) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* loaded from: classes.dex */
        public interface a extends c, e {
            /* renamed from: d */
            Account m6507d();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* loaded from: classes.dex */
        public interface b extends c {
            /* renamed from: i */
            GoogleSignInAccount m6508i();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        /* loaded from: classes.dex */
        public interface c extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C3561d implements e {
            private C3561d() {
            }
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        /* loaded from: classes.dex */
        public interface e extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$f */
        /* loaded from: classes.dex */
        public interface f extends c, e {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
        /* renamed from: a */
        public int m6509a() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public List<Scope> mo6387a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    /* loaded from: classes.dex */
    public interface f extends b {
        /* renamed from: a */
        void m6510a(AbstractC1020d.c cVar);

        /* renamed from: a */
        void m6511a(AbstractC1020d.e eVar);

        /* renamed from: a */
        void m6512a(InterfaceC1038m interfaceC1038m, Set<Scope> set);

        /* renamed from: a */
        void m6513a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: a */
        boolean m6514a();

        /* renamed from: b */
        void mo6515b();

        /* renamed from: e */
        boolean mo6463e();

        /* renamed from: f */
        Set<Scope> mo6516f();

        /* renamed from: h */
        boolean m6517h();

        /* renamed from: i */
        int mo6465i();

        /* renamed from: j */
        boolean m6518j();

        /* renamed from: k */
        Feature[] m6519k();

        /* renamed from: l */
        String m6520l();

        /* renamed from: m */
        Intent mo6466m();

        /* renamed from: n */
        boolean mo6521n();

        /* renamed from: o */
        IBinder m6522o();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    /* loaded from: classes.dex */
    public interface h<T extends IInterface> extends b {
        /* renamed from: a */
        T m6523a(IBinder iBinder);

        /* renamed from: a */
        void m6524a(int i, T t);

        /* renamed from: g */
        String m6525g();

        /* renamed from: p */
        String m6526p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> C0859a(String str, a<C, O> aVar, g<C> gVar) {
        C1057u.m7287a(aVar, "Cannot construct an Api with a null ClientBuilder");
        C1057u.m7287a(gVar, "Cannot construct an Api with a null ClientKey");
        this.f5679c = str;
        this.f5677a = aVar;
        this.f5678b = gVar;
    }

    /* renamed from: a */
    public final c<?> m6502a() {
        g<?> gVar = this.f5678b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: b */
    public final String m6503b() {
        return this.f5679c;
    }

    /* renamed from: c */
    public final e<?, O> m6504c() {
        return this.f5677a;
    }

    /* renamed from: d */
    public final a<?, O> m6505d() {
        C1057u.m7298b(this.f5677a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f5677a;
    }
}
