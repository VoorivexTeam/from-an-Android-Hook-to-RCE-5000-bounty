package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.o;
import defpackage.rq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public abstract class d<T extends IInterface> {
    private static final Feature[] A = new Feature[0];
    private int a;
    private long b;
    private long c;
    private int d;
    private long e;
    private p0 f;
    private final Context g;
    private final com.google.android.gms.common.internal.j h;
    private final com.google.android.gms.common.d i;
    final Handler j;
    private final Object k;
    private final Object l;

    @GuardedBy("mServiceBrokerLock")
    private q m;
    protected c n;

    @GuardedBy("mLock")
    private T o;
    private final ArrayList<g<?>> p;

    @GuardedBy("mLock")
    private j q;

    @GuardedBy("mLock")
    private int r;
    private final a s;
    private final b t;
    private final int u;
    private final String v;
    private ConnectionResult w;
    private boolean x;
    private volatile zza y;
    protected AtomicInteger z;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);

        void b(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(ConnectionResult connectionResult);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0045d implements c {
        public C0045d() {
        }

        @Override // com.google.android.gms.common.internal.d.c
        public void a(ConnectionResult connectionResult) {
            if (connectionResult.n()) {
                d dVar = d.this;
                dVar.a((m) null, dVar.z());
            } else if (d.this.t != null) {
                d.this.t.a(connectionResult);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes.dex */
    private abstract class f extends g<Boolean> {
        private final int d;
        private final Bundle e;

        protected f(int i, Bundle bundle) {
            super(true);
            this.d = i;
            this.e = bundle;
        }

        protected abstract void a(ConnectionResult connectionResult);

        @Override // com.google.android.gms.common.internal.d.g
        protected final /* synthetic */ void a(Boolean bool) {
            if (bool == null) {
                d.this.c(1, null);
                return;
            }
            int i = this.d;
            if (i == 0) {
                if (e()) {
                    return;
                }
                d.this.c(1, null);
                a(new ConnectionResult(8, null));
                return;
            }
            if (i == 10) {
                d.this.c(1, null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), d.this.p(), d.this.g()));
            }
            d.this.c(1, null);
            Bundle bundle = this.e;
            a(new ConnectionResult(this.d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        }

        @Override // com.google.android.gms.common.internal.d.g
        protected final void c() {
        }

        protected abstract boolean e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public abstract class g<TListener> {
        private TListener a;
        private boolean b = false;

        public g(TListener tlistener) {
            this.a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.a = null;
            }
        }

        protected abstract void a(TListener tlistener);

        public final void b() {
            a();
            synchronized (d.this.p) {
                d.this.p.remove(this);
            }
        }

        protected abstract void c();

        public final void d() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.a;
                if (this.b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    sb.toString();
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e) {
                    c();
                    throw e;
                }
            } else {
                c();
            }
            synchronized (this) {
                this.b = true;
            }
            b();
        }
    }

    /* loaded from: classes.dex */
    final class h extends rq {
        public h(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            g gVar = (g) message.obj;
            gVar.c();
            gVar.b();
        }

        private static boolean b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (d.this.z.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                    return;
                }
                return;
            }
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !d.this.t()) || message.what == 5)) && !d.this.j()) {
                a(message);
                return;
            }
            int i2 = message.what;
            if (i2 == 4) {
                d.this.w = new ConnectionResult(message.arg2);
                if (d.this.G() && !d.this.x) {
                    d.this.c(3, null);
                    return;
                }
                ConnectionResult connectionResult = d.this.w != null ? d.this.w : new ConnectionResult(8);
                d.this.n.a(connectionResult);
                d.this.a(connectionResult);
                return;
            }
            if (i2 == 5) {
                ConnectionResult connectionResult2 = d.this.w != null ? d.this.w : new ConnectionResult(8);
                d.this.n.a(connectionResult2);
                d.this.a(connectionResult2);
                return;
            }
            if (i2 == 3) {
                Object obj = message.obj;
                ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                d.this.n.a(connectionResult3);
                d.this.a(connectionResult3);
                return;
            }
            if (i2 == 6) {
                d.this.c(5, null);
                if (d.this.s != null) {
                    d.this.s.a(message.arg2);
                }
                d.this.a(message.arg2);
                d.this.a(5, 1, (int) null);
                return;
            }
            if (i2 == 2 && !d.this.a()) {
                a(message);
                return;
            }
            if (b(message)) {
                ((g) message.obj).d();
                return;
            }
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i3);
            Log.wtf("GmsClient", sb.toString(), new Exception());
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends o.a {
        private d a;
        private final int b;

        public i(d dVar, int i) {
            this.a = dVar;
            this.b = i;
        }

        @Override // com.google.android.gms.common.internal.o
        public final void a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.o
        public final void a(int i, IBinder iBinder, Bundle bundle) {
            u.a(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.a(i, iBinder, bundle, this.b);
            this.a = null;
        }

        @Override // com.google.android.gms.common.internal.o
        public final void a(int i, IBinder iBinder, zza zzaVar) {
            u.a(this.a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            u.a(zzaVar);
            this.a.a(zzaVar);
            a(i, iBinder, zzaVar.b);
        }
    }

    /* loaded from: classes.dex */
    public final class j implements ServiceConnection {
        private final int a;

        public j(int i) {
            this.a = i;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            q pVar;
            d dVar = d.this;
            if (iBinder == null) {
                dVar.c(16);
                return;
            }
            synchronized (dVar.l) {
                d dVar2 = d.this;
                if (iBinder == null) {
                    pVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    pVar = (queryLocalInterface == null || !(queryLocalInterface instanceof q)) ? new p(iBinder) : (q) queryLocalInterface;
                }
                dVar2.m = pVar;
            }
            d.this.a(0, (Bundle) null, this.a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (d.this.l) {
                d.this.m = null;
            }
            Handler handler = d.this.j;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public final class k extends f {
        public k(int i, Bundle bundle) {
            super(i, null);
        }

        @Override // com.google.android.gms.common.internal.d.f
        protected final void a(ConnectionResult connectionResult) {
            if (d.this.t() && d.this.G()) {
                d.this.c(16);
            } else {
                d.this.n.a(connectionResult);
                d.this.a(connectionResult);
            }
        }

        @Override // com.google.android.gms.common.internal.d.f
        protected final boolean e() {
            d.this.n.a(ConnectionResult.f);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public final class l extends f {
        private final IBinder g;

        public l(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.g = iBinder;
        }

        @Override // com.google.android.gms.common.internal.d.f
        protected final void a(ConnectionResult connectionResult) {
            if (d.this.t != null) {
                d.this.t.a(connectionResult);
            }
            d.this.a(connectionResult);
        }

        @Override // com.google.android.gms.common.internal.d.f
        protected final boolean e() {
            try {
                String interfaceDescriptor = this.g.getInterfaceDescriptor();
                if (!d.this.g().equals(interfaceDescriptor)) {
                    String g = d.this.g();
                    StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(g);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    sb.toString();
                    return false;
                }
                IInterface a = d.this.a(this.g);
                if (a == null) {
                    return false;
                }
                if (!d.this.a(2, 4, (int) a) && !d.this.a(3, 4, (int) a)) {
                    return false;
                }
                d.this.w = null;
                Bundle q = d.this.q();
                if (d.this.s != null) {
                    d.this.s.b(q);
                }
                return true;
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.d.a r13, com.google.android.gms.common.internal.d.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.j.a(r10)
            com.google.android.gms.common.d r4 = com.google.android.gms.common.d.a()
            com.google.android.gms.common.internal.u.a(r13)
            r6 = r13
            com.google.android.gms.common.internal.d$a r6 = (com.google.android.gms.common.internal.d.a) r6
            com.google.android.gms.common.internal.u.a(r14)
            r7 = r14
            com.google.android.gms.common.internal.d$b r7 = (com.google.android.gms.common.internal.d.b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.d.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d$a, com.google.android.gms.common.internal.d$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context, Looper looper, com.google.android.gms.common.internal.j jVar, com.google.android.gms.common.d dVar, int i2, a aVar, b bVar, String str) {
        this.k = new Object();
        this.l = new Object();
        this.p = new ArrayList<>();
        this.r = 1;
        this.w = null;
        this.x = false;
        this.y = null;
        this.z = new AtomicInteger(0);
        u.a(context, "Context must not be null");
        this.g = context;
        u.a(looper, "Looper must not be null");
        u.a(jVar, "Supervisor must not be null");
        this.h = jVar;
        u.a(dVar, "API availability must not be null");
        this.i = dVar;
        this.j = new h(looper);
        this.u = i2;
        this.s = aVar;
        this.t = bVar;
        this.v = str;
    }

    private final String E() {
        String str = this.v;
        return str == null ? this.g.getClass().getName() : str;
    }

    private final boolean F() {
        boolean z;
        synchronized (this.k) {
            z = this.r == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G() {
        if (this.x || TextUtils.isEmpty(g()) || TextUtils.isEmpty(y())) {
            return false;
        }
        try {
            Class.forName(g());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(zza zzaVar) {
        this.y = zzaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(int i2, int i3, T t) {
        synchronized (this.k) {
            if (this.r != i2) {
                return false;
            }
            c(i3, t);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i2) {
        int i3;
        if (F()) {
            i3 = 5;
            this.x = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(i3, this.z.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i2, T t) {
        u.a((i2 == 4) == (t != null));
        synchronized (this.k) {
            this.r = i2;
            this.o = t;
            b(i2, t);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (this.q != null && this.f != null) {
                        String d = this.f.d();
                        String a2 = this.f.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 70 + String.valueOf(a2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(d);
                        sb.append(" on ");
                        sb.append(a2);
                        sb.toString();
                        this.h.a(this.f.d(), this.f.a(), this.f.c(), this.q, E());
                        this.z.incrementAndGet();
                    }
                    this.q = new j(this.z.get());
                    p0 p0Var = (this.r != 3 || y() == null) ? new p0(B(), p(), false, 129, C()) : new p0(w().getPackageName(), y(), true, 129, false);
                    this.f = p0Var;
                    if (!this.h.a(new j.a(p0Var.d(), this.f.a(), this.f.c(), this.f.b()), this.q, E())) {
                        String d2 = this.f.d();
                        String a3 = this.f.a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(d2).length() + 34 + String.valueOf(a3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(d2);
                        sb2.append(" on ");
                        sb2.append(a3);
                        sb2.toString();
                        a(16, (Bundle) null, this.z.get());
                    }
                } else if (i2 == 4) {
                    a((d<T>) t);
                }
            } else if (this.q != null) {
                this.h.a(this.f.d(), this.f.a(), this.f.c(), this.q, E());
                this.q = null;
            }
        }
    }

    public final T A() {
        T t;
        synchronized (this.k) {
            if (this.r == 5) {
                throw new DeadObjectException();
            }
            s();
            u.b(this.o != null, "Client is connected but service is null");
            t = this.o;
        }
        return t;
    }

    protected String B() {
        return "com.google.android.gms";
    }

    protected boolean C() {
        return false;
    }

    public boolean D() {
        return false;
    }

    protected abstract T a(IBinder iBinder);

    protected void a(int i2) {
        this.a = i2;
        this.b = System.currentTimeMillis();
    }

    protected final void a(int i2, Bundle bundle, int i3) {
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new k(i2, null)));
    }

    protected void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new l(i2, iBinder, bundle)));
    }

    protected void a(T t) {
        this.c = System.currentTimeMillis();
    }

    protected void a(ConnectionResult connectionResult) {
        this.d = connectionResult.j();
        this.e = System.currentTimeMillis();
    }

    public void a(c cVar) {
        u.a(cVar, "Connection progress callbacks cannot be null.");
        this.n = cVar;
        c(2, null);
    }

    protected void a(c cVar, int i2, PendingIntent pendingIntent) {
        u.a(cVar, "Connection progress callbacks cannot be null.");
        this.n = cVar;
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(3, this.z.get(), i2, pendingIntent));
    }

    public void a(e eVar) {
        eVar.a();
    }

    public void a(m mVar, Set<Scope> set) {
        Bundle x = x();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.u);
        getServiceRequest.e = this.g.getPackageName();
        getServiceRequest.h = x;
        if (set != null) {
            getServiceRequest.g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (n()) {
            getServiceRequest.i = u() != null ? u() : new Account("<<default account>>", "com.google");
            if (mVar != null) {
                getServiceRequest.f = mVar.asBinder();
            }
        } else if (D()) {
            getServiceRequest.i = u();
        }
        getServiceRequest.j = A;
        getServiceRequest.k = v();
        try {
            try {
                synchronized (this.l) {
                    if (this.m != null) {
                        this.m.a(new i(this, this.z.get()), getServiceRequest);
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                a(8, (IBinder) null, (Bundle) null, this.z.get());
            }
        } catch (DeadObjectException unused2) {
            b(1);
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        T t;
        q qVar;
        synchronized (this.k) {
            i2 = this.r;
            t = this.o;
        }
        synchronized (this.l) {
            qVar = this.m;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) g()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (qVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(qVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.c;
            String format = simpleDateFormat.format(new Date(this.c));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.a;
            printWriter.append((CharSequence) (i3 != 1 ? i3 != 2 ? String.valueOf(i3) : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.b;
            String format2 = simpleDateFormat.format(new Date(this.b));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.d.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.e;
            String format3 = simpleDateFormat.format(new Date(this.e));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.k) {
            z = this.r == 4;
        }
        return z;
    }

    public void b() {
        this.z.incrementAndGet();
        synchronized (this.p) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.get(i2).a();
            }
            this.p.clear();
        }
        synchronized (this.l) {
            this.m = null;
        }
        c(1, null);
    }

    public void b(int i2) {
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(6, this.z.get(), i2));
    }

    void b(int i2, T t) {
    }

    public boolean e() {
        return false;
    }

    protected abstract String g();

    public boolean h() {
        return true;
    }

    public int i() {
        return com.google.android.gms.common.d.a;
    }

    public boolean j() {
        boolean z;
        synchronized (this.k) {
            z = this.r == 2 || this.r == 3;
        }
        return z;
    }

    public final Feature[] k() {
        zza zzaVar = this.y;
        if (zzaVar == null) {
            return null;
        }
        return zzaVar.c;
    }

    public String l() {
        p0 p0Var;
        if (!a() || (p0Var = this.f) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return p0Var.a();
    }

    public Intent m() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean n() {
        return false;
    }

    public IBinder o() {
        synchronized (this.l) {
            if (this.m == null) {
                return null;
            }
            return this.m.asBinder();
        }
    }

    protected abstract String p();

    public Bundle q() {
        return null;
    }

    public void r() {
        int a2 = this.i.a(this.g, i());
        if (a2 == 0) {
            a(new C0045d());
        } else {
            c(1, null);
            a(new C0045d(), a2, (PendingIntent) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public Feature[] v() {
        return A;
    }

    public final Context w() {
        return this.g;
    }

    protected Bundle x() {
        return new Bundle();
    }

    protected String y() {
        return null;
    }

    protected Set<Scope> z() {
        return Collections.EMPTY_SET;
    }
}
