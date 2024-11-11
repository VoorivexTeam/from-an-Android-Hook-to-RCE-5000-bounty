package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<O extends d> {
    private final AbstractC0041a<?, O> a;
    private final g<?> b;
    private final String c;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0041a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, O o, f.b bVar, f.c cVar) {
            return a(context, looper, eVar, (com.google.android.gms.common.internal.e) o, (com.google.android.gms.common.api.internal.f) bVar, (com.google.android.gms.common.api.internal.m) cVar);
        }

        public T a(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, O o, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0042a extends c, e {
            Account d();
        }

        /* loaded from: classes.dex */
        public interface b extends c {
            GoogleSignInAccount i();
        }

        /* loaded from: classes.dex */
        public interface c extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0043d implements e {
            private C0043d() {
            }
        }

        /* loaded from: classes.dex */
        public interface e extends d {
        }

        /* loaded from: classes.dex */
        public interface f extends c, e {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
        public int a() {
            return Integer.MAX_VALUE;
        }

        public List<Scope> a(O o) {
            return Collections.emptyList();
        }
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        void a(d.c cVar);

        void a(d.e eVar);

        void a(com.google.android.gms.common.internal.m mVar, Set<Scope> set);

        void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        boolean a();

        void b();

        boolean e();

        Set<Scope> f();

        boolean h();

        int i();

        boolean j();

        Feature[] k();

        String l();

        Intent m();

        boolean n();

        IBinder o();
    }

    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* loaded from: classes.dex */
    public interface h<T extends IInterface> extends b {
        T a(IBinder iBinder);

        void a(int i, T t);

        String g();

        String p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0041a<C, O> abstractC0041a, g<C> gVar) {
        com.google.android.gms.common.internal.u.a(abstractC0041a, "Cannot construct an Api with a null ClientBuilder");
        com.google.android.gms.common.internal.u.a(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = abstractC0041a;
        this.b = gVar;
    }

    public final c<?> a() {
        g<?> gVar = this.b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public final String b() {
        return this.c;
    }

    public final e<?, O> c() {
        return this.a;
    }

    public final AbstractC0041a<?, O> d() {
        com.google.android.gms.common.internal.u.b(this.a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }
}
