package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.C0993c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.internal.AbstractC0885d;
import com.google.android.gms.common.api.internal.C0907i;
import com.google.android.gms.common.api.internal.C0914j2;
import com.google.android.gms.common.api.internal.C0940q0;
import com.google.android.gms.common.api.internal.C0942q2;
import com.google.android.gms.common.api.internal.C0965w1;
import com.google.android.gms.common.api.internal.InterfaceC0895f;
import com.google.android.gms.common.api.internal.InterfaceC0923m;
import com.google.android.gms.common.api.internal.InterfaceC0931o;
import com.google.android.gms.common.internal.C1022e;
import com.google.android.gms.common.internal.C1057u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import p000.C0500c0;
import p000.C3369vr;
import p000.C3448xr;
import p000.InterfaceC3497yr;

@Deprecated
/* renamed from: com.google.android.gms.common.api.f */
/* loaded from: classes.dex */
public abstract class AbstractC0864f {

    /* renamed from: a */
    @GuardedBy("sAllClients")
    private static final Set<AbstractC0864f> f5696a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Account f5697a;

        /* renamed from: d */
        private int f5700d;

        /* renamed from: e */
        private View f5701e;

        /* renamed from: f */
        private String f5702f;

        /* renamed from: g */
        private String f5703g;

        /* renamed from: i */
        private final Context f5705i;

        /* renamed from: k */
        private C0907i f5707k;

        /* renamed from: m */
        private c f5709m;

        /* renamed from: n */
        private Looper f5710n;

        /* renamed from: b */
        private final Set<Scope> f5698b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f5699c = new HashSet();

        /* renamed from: h */
        private final Map<C0859a<?>, C1022e.b> f5704h = new C0500c0();

        /* renamed from: j */
        private final Map<C0859a<?>, C0859a.d> f5706j = new C0500c0();

        /* renamed from: l */
        private int f5708l = -1;

        /* renamed from: o */
        private C0993c f5711o = C0993c.m6949a();

        /* renamed from: p */
        private C0859a.a<? extends InterfaceC3497yr, C3369vr> f5712p = C3448xr.f14061c;

        /* renamed from: q */
        private final ArrayList<b> f5713q = new ArrayList<>();

        /* renamed from: r */
        private final ArrayList<c> f5714r = new ArrayList<>();

        public a(Context context) {
            this.f5705i = context;
            this.f5710n = context.getMainLooper();
            this.f5702f = context.getPackageName();
            this.f5703g = context.getClass().getName();
        }

        /* renamed from: a */
        public final a m6565a(Handler handler) {
            C1057u.m7287a(handler, (Object) "Handler must not be null");
            this.f5710n = handler.getLooper();
            return this;
        }

        /* renamed from: a */
        public final a m6566a(C0859a<? extends C0859a.d.e> c0859a) {
            C1057u.m7287a(c0859a, "Api must not be null");
            this.f5706j.put(c0859a, null);
            List<Scope> mo6387a = c0859a.m6504c().mo6387a(null);
            this.f5699c.addAll(mo6387a);
            this.f5698b.addAll(mo6387a);
            return this;
        }

        /* renamed from: a */
        public final <O extends C0859a.d.c> a m6567a(C0859a<O> c0859a, O o) {
            C1057u.m7287a(c0859a, "Api must not be null");
            C1057u.m7287a(o, "Null options are not permitted for this Api");
            this.f5706j.put(c0859a, o);
            List<Scope> mo6387a = c0859a.m6504c().mo6387a(o);
            this.f5699c.addAll(mo6387a);
            this.f5698b.addAll(mo6387a);
            return this;
        }

        /* renamed from: a */
        public final a m6568a(b bVar) {
            C1057u.m7287a(bVar, "Listener must not be null");
            this.f5713q.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final a m6569a(c cVar) {
            C1057u.m7287a(cVar, "Listener must not be null");
            this.f5714r.add(cVar);
            return this;
        }

        /* JADX WARN: Type inference failed for: r4v18, types: [com.google.android.gms.common.api.a$f, java.lang.Object] */
        /* renamed from: a */
        public final AbstractC0864f m6570a() {
            C1057u.m7294a(!this.f5706j.isEmpty(), "must call addApi() to add at least one API");
            C1022e m6571b = m6571b();
            C0859a<?> c0859a = null;
            Map<C0859a<?>, C1022e.b> m7122f = m6571b.m7122f();
            C0500c0 c0500c0 = new C0500c0();
            C0500c0 c0500c02 = new C0500c0();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C0859a<?> c0859a2 : this.f5706j.keySet()) {
                C0859a.d dVar = this.f5706j.get(c0859a2);
                boolean z2 = m7122f.get(c0859a2) != null;
                c0500c0.put(c0859a2, Boolean.valueOf(z2));
                C0942q2 c0942q2 = new C0942q2(c0859a2, z2);
                arrayList.add(c0942q2);
                C0859a.a<?, ?> m6505d = c0859a2.m6505d();
                ?? mo6386a = m6505d.mo6386a(this.f5705i, this.f5710n, m6571b, (C1022e) dVar, (b) c0942q2, (c) c0942q2);
                c0500c02.put(c0859a2.m6502a(), mo6386a);
                if (m6505d.m6509a() == 1) {
                    z = dVar != null;
                }
                if (mo6386a.mo6463e()) {
                    if (c0859a != null) {
                        String m6503b = c0859a2.m6503b();
                        String m6503b2 = c0859a.m6503b();
                        StringBuilder sb = new StringBuilder(String.valueOf(m6503b).length() + 21 + String.valueOf(m6503b2).length());
                        sb.append(m6503b);
                        sb.append(" cannot be used with ");
                        sb.append(m6503b2);
                        throw new IllegalStateException(sb.toString());
                    }
                    c0859a = c0859a2;
                }
            }
            if (c0859a != null) {
                if (z) {
                    String m6503b3 = c0859a.m6503b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(m6503b3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(m6503b3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
                C1057u.m7299b(this.f5697a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", c0859a.m6503b());
                C1057u.m7299b(this.f5698b.equals(this.f5699c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", c0859a.m6503b());
            }
            C0940q0 c0940q0 = new C0940q0(this.f5705i, new ReentrantLock(), this.f5710n, m6571b, this.f5711o, this.f5712p, c0500c0, this.f5713q, this.f5714r, c0500c02, this.f5708l, C0940q0.m6827a((Iterable<C0859a.f>) c0500c02.values(), true), arrayList, false);
            synchronized (AbstractC0864f.f5696a) {
                AbstractC0864f.f5696a.add(c0940q0);
            }
            if (this.f5708l >= 0) {
                C0914j2.m6782b(this.f5707k).m6784a(this.f5708l, c0940q0, this.f5709m);
            }
            return c0940q0;
        }

        /* renamed from: b */
        public final C1022e m6571b() {
            C3369vr c3369vr = C3369vr.f13705k;
            if (this.f5706j.containsKey(C3448xr.f14063e)) {
                c3369vr = (C3369vr) this.f5706j.get(C3448xr.f14063e);
            }
            return new C1022e(this.f5697a, this.f5698b, this.f5704h, this.f5700d, this.f5701e, this.f5702f, this.f5703g, c3369vr, false);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$b */
    /* loaded from: classes.dex */
    public interface b extends InterfaceC0895f {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$c */
    /* loaded from: classes.dex */
    public interface c extends InterfaceC0923m {
    }

    /* renamed from: h */
    public static Set<AbstractC0864f> m6549h() {
        Set<AbstractC0864f> set;
        synchronized (f5696a) {
            set = f5696a;
        }
        return set;
    }

    /* renamed from: a */
    public abstract ConnectionResult mo6551a();

    /* renamed from: a */
    public <A extends C0859a.b, R extends InterfaceC0982m, T extends AbstractC0885d<R, A>> T mo6552a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo6553a(c cVar);

    /* renamed from: a */
    public void mo6554a(C0965w1 c0965w1) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo6555a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public boolean mo6556a(InterfaceC0931o interfaceC0931o) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract AbstractC0866h<Status> mo6557b();

    /* renamed from: b */
    public <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T mo6558b(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract void mo6559b(c cVar);

    /* renamed from: c */
    public abstract void mo6560c();

    /* renamed from: d */
    public abstract void mo6561d();

    /* renamed from: e */
    public Context mo6562e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public Looper mo6563f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public void mo6564g() {
        throw new UnsupportedOperationException();
    }
}
