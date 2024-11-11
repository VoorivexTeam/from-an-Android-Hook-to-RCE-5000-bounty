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
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0862d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1032j;
import com.google.android.gms.common.internal.InterfaceC1042o;
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
import p000.HandlerC3175rq;

/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC1020d<T extends IInterface> {

    /* renamed from: A */
    private static final Feature[] f6148A = new Feature[0];

    /* renamed from: a */
    private int f6149a;

    /* renamed from: b */
    private long f6150b;

    /* renamed from: c */
    private long f6151c;

    /* renamed from: d */
    private int f6152d;

    /* renamed from: e */
    private long f6153e;

    /* renamed from: f */
    private C1045p0 f6154f;

    /* renamed from: g */
    private final Context f6155g;

    /* renamed from: h */
    private final AbstractC1032j f6156h;

    /* renamed from: i */
    private final C0994d f6157i;

    /* renamed from: j */
    final Handler f6158j;

    /* renamed from: k */
    private final Object f6159k;

    /* renamed from: l */
    private final Object f6160l;

    /* renamed from: m */
    @GuardedBy("mServiceBrokerLock")
    private InterfaceC1046q f6161m;

    /* renamed from: n */
    protected c f6162n;

    /* renamed from: o */
    @GuardedBy("mLock")
    private T f6163o;

    /* renamed from: p */
    private final ArrayList<g<?>> f6164p;

    /* renamed from: q */
    @GuardedBy("mLock")
    private j f6165q;

    /* renamed from: r */
    @GuardedBy("mLock")
    private int f6166r;

    /* renamed from: s */
    private final a f6167s;

    /* renamed from: t */
    private final b f6168t;

    /* renamed from: u */
    private final int f6169u;

    /* renamed from: v */
    private final String f6170v;

    /* renamed from: w */
    private ConnectionResult f6171w;

    /* renamed from: x */
    private boolean f6172x;

    /* renamed from: y */
    private volatile zza f6173y;

    /* renamed from: z */
    protected AtomicInteger f6174z;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo7044a(int i);

        /* renamed from: b */
        void mo7045b(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo7049a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo6763a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$d */
    /* loaded from: classes.dex */
    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC1020d.c
        /* renamed from: a */
        public void mo6763a(ConnectionResult connectionResult) {
            if (connectionResult.m6488n()) {
                AbstractC1020d abstractC1020d = AbstractC1020d.this;
                abstractC1020d.m7082a((InterfaceC1038m) null, abstractC1020d.mo7101z());
            } else if (AbstractC1020d.this.f6168t != null) {
                AbstractC1020d.this.f6168t.mo7049a(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo6775a();
    }

    /* renamed from: com.google.android.gms.common.internal.d$f */
    /* loaded from: classes.dex */
    private abstract class f extends g<Boolean> {

        /* renamed from: d */
        private final int f6176d;

        /* renamed from: e */
        private final Bundle f6177e;

        protected f(int i, Bundle bundle) {
            super(true);
            this.f6176d = i;
            this.f6177e = bundle;
        }

        /* renamed from: a */
        protected abstract void mo7102a(ConnectionResult connectionResult);

        @Override // com.google.android.gms.common.internal.AbstractC1020d.g
        /* renamed from: a */
        protected final /* synthetic */ void mo7103a(Boolean bool) {
            if (bool == null) {
                AbstractC1020d.this.m7064c(1, null);
                return;
            }
            int i = this.f6176d;
            if (i == 0) {
                if (mo7105e()) {
                    return;
                }
                AbstractC1020d.this.m7064c(1, null);
                mo7102a(new ConnectionResult(8, null));
                return;
            }
            if (i == 10) {
                AbstractC1020d.this.m7064c(1, null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), AbstractC1020d.this.mo6467p(), AbstractC1020d.this.mo6464g()));
            }
            AbstractC1020d.this.m7064c(1, null);
            Bundle bundle = this.f6177e;
            mo7102a(new ConnectionResult(this.f6176d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        }

        @Override // com.google.android.gms.common.internal.AbstractC1020d.g
        /* renamed from: c */
        protected final void mo7104c() {
        }

        /* renamed from: e */
        protected abstract boolean mo7105e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.d$g */
    /* loaded from: classes.dex */
    public abstract class g<TListener> {

        /* renamed from: a */
        private TListener f6179a;

        /* renamed from: b */
        private boolean f6180b = false;

        public g(TListener tlistener) {
            this.f6179a = tlistener;
        }

        /* renamed from: a */
        public final void m7106a() {
            synchronized (this) {
                this.f6179a = null;
            }
        }

        /* renamed from: a */
        protected abstract void mo7103a(TListener tlistener);

        /* renamed from: b */
        public final void m7107b() {
            m7106a();
            synchronized (AbstractC1020d.this.f6164p) {
                AbstractC1020d.this.f6164p.remove(this);
            }
        }

        /* renamed from: c */
        protected abstract void mo7104c();

        /* renamed from: d */
        public final void m7108d() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f6179a;
                if (this.f6180b) {
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
                    mo7103a(tlistener);
                } catch (RuntimeException e) {
                    mo7104c();
                    throw e;
                }
            } else {
                mo7104c();
            }
            synchronized (this) {
                this.f6180b = true;
            }
            m7107b();
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$h */
    /* loaded from: classes.dex */
    final class h extends HandlerC3175rq {
        public h(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m7109a(Message message) {
            g gVar = (g) message.obj;
            gVar.mo7104c();
            gVar.m7107b();
        }

        /* renamed from: b */
        private static boolean m7110b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (AbstractC1020d.this.f6174z.get() != message.arg1) {
                if (m7110b(message)) {
                    m7109a(message);
                    return;
                }
                return;
            }
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !AbstractC1020d.this.m7095t()) || message.what == 5)) && !AbstractC1020d.this.m7088j()) {
                m7109a(message);
                return;
            }
            int i2 = message.what;
            if (i2 == 4) {
                AbstractC1020d.this.f6171w = new ConnectionResult(message.arg2);
                if (AbstractC1020d.this.m7052G() && !AbstractC1020d.this.f6172x) {
                    AbstractC1020d.this.m7064c(3, null);
                    return;
                }
                ConnectionResult connectionResult = AbstractC1020d.this.f6171w != null ? AbstractC1020d.this.f6171w : new ConnectionResult(8);
                AbstractC1020d.this.f6162n.mo6763a(connectionResult);
                AbstractC1020d.this.m7078a(connectionResult);
                return;
            }
            if (i2 == 5) {
                ConnectionResult connectionResult2 = AbstractC1020d.this.f6171w != null ? AbstractC1020d.this.f6171w : new ConnectionResult(8);
                AbstractC1020d.this.f6162n.mo6763a(connectionResult2);
                AbstractC1020d.this.m7078a(connectionResult2);
                return;
            }
            if (i2 == 3) {
                Object obj = message.obj;
                ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                AbstractC1020d.this.f6162n.mo6763a(connectionResult3);
                AbstractC1020d.this.m7078a(connectionResult3);
                return;
            }
            if (i2 == 6) {
                AbstractC1020d.this.m7064c(5, null);
                if (AbstractC1020d.this.f6167s != null) {
                    AbstractC1020d.this.f6167s.mo7044a(message.arg2);
                }
                AbstractC1020d.this.m7074a(message.arg2);
                AbstractC1020d.this.m7060a(5, 1, (int) null);
                return;
            }
            if (i2 == 2 && !AbstractC1020d.this.m7084a()) {
                m7109a(message);
                return;
            }
            if (m7110b(message)) {
                ((g) message.obj).m7108d();
                return;
            }
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i3);
            Log.wtf("GmsClient", sb.toString(), new Exception());
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$i */
    /* loaded from: classes.dex */
    public static final class i extends InterfaceC1042o.a {

        /* renamed from: a */
        private AbstractC1020d f6183a;

        /* renamed from: b */
        private final int f6184b;

        public i(AbstractC1020d abstractC1020d, int i) {
            this.f6183a = abstractC1020d;
            this.f6184b = i;
        }

        @Override // com.google.android.gms.common.internal.InterfaceC1042o
        /* renamed from: a */
        public final void mo7111a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.InterfaceC1042o
        /* renamed from: a */
        public final void mo7112a(int i, IBinder iBinder, Bundle bundle) {
            C1057u.m7287a(this.f6183a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f6183a.m7076a(i, iBinder, bundle, this.f6184b);
            this.f6183a = null;
        }

        @Override // com.google.android.gms.common.internal.InterfaceC1042o
        /* renamed from: a */
        public final void mo7113a(int i, IBinder iBinder, zza zzaVar) {
            C1057u.m7287a(this.f6183a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C1057u.m7286a(zzaVar);
            this.f6183a.m7059a(zzaVar);
            mo7112a(i, iBinder, zzaVar.f6275b);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$j */
    /* loaded from: classes.dex */
    public final class j implements ServiceConnection {

        /* renamed from: a */
        private final int f6185a;

        public j(int i) {
            this.f6185a = i;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC1046q c1044p;
            AbstractC1020d abstractC1020d = AbstractC1020d.this;
            if (iBinder == null) {
                abstractC1020d.m7063c(16);
                return;
            }
            synchronized (abstractC1020d.f6160l) {
                AbstractC1020d abstractC1020d2 = AbstractC1020d.this;
                if (iBinder == null) {
                    c1044p = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    c1044p = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1046q)) ? new C1044p(iBinder) : (InterfaceC1046q) queryLocalInterface;
                }
                abstractC1020d2.f6161m = c1044p;
            }
            AbstractC1020d.this.m7075a(0, (Bundle) null, this.f6185a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (AbstractC1020d.this.f6160l) {
                AbstractC1020d.this.f6161m = null;
            }
            Handler handler = AbstractC1020d.this.f6158j;
            handler.sendMessage(handler.obtainMessage(6, this.f6185a, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.d$k */
    /* loaded from: classes.dex */
    public final class k extends f {
        public k(int i, Bundle bundle) {
            super(i, null);
        }

        @Override // com.google.android.gms.common.internal.AbstractC1020d.f
        /* renamed from: a */
        protected final void mo7102a(ConnectionResult connectionResult) {
            if (AbstractC1020d.this.m7095t() && AbstractC1020d.this.m7052G()) {
                AbstractC1020d.this.m7063c(16);
            } else {
                AbstractC1020d.this.f6162n.mo6763a(connectionResult);
                AbstractC1020d.this.m7078a(connectionResult);
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC1020d.f
        /* renamed from: e */
        protected final boolean mo7105e() {
            AbstractC1020d.this.f6162n.mo6763a(ConnectionResult.f5655f);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.d$l */
    /* loaded from: classes.dex */
    public final class l extends f {

        /* renamed from: g */
        private final IBinder f6188g;

        public l(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f6188g = iBinder;
        }

        @Override // com.google.android.gms.common.internal.AbstractC1020d.f
        /* renamed from: a */
        protected final void mo7102a(ConnectionResult connectionResult) {
            if (AbstractC1020d.this.f6168t != null) {
                AbstractC1020d.this.f6168t.mo7049a(connectionResult);
            }
            AbstractC1020d.this.m7078a(connectionResult);
        }

        @Override // com.google.android.gms.common.internal.AbstractC1020d.f
        /* renamed from: e */
        protected final boolean mo7105e() {
            try {
                String interfaceDescriptor = this.f6188g.getInterfaceDescriptor();
                if (!AbstractC1020d.this.mo6464g().equals(interfaceDescriptor)) {
                    String mo6464g = AbstractC1020d.this.mo6464g();
                    StringBuilder sb = new StringBuilder(String.valueOf(mo6464g).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(mo6464g);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    sb.toString();
                    return false;
                }
                IInterface mo6462a = AbstractC1020d.this.mo6462a(this.f6188g);
                if (mo6462a == null) {
                    return false;
                }
                if (!AbstractC1020d.this.m7060a(2, 4, (int) mo6462a) && !AbstractC1020d.this.m7060a(3, 4, (int) mo6462a)) {
                    return false;
                }
                AbstractC1020d.this.f6171w = null;
                Bundle m7092q = AbstractC1020d.this.m7092q();
                if (AbstractC1020d.this.f6167s != null) {
                    AbstractC1020d.this.f6167s.mo7045b(m7092q);
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
    public AbstractC1020d(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.AbstractC1020d.a r13, com.google.android.gms.common.internal.AbstractC1020d.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.AbstractC1032j.m7158a(r10)
            com.google.android.gms.common.d r4 = com.google.android.gms.common.C0994d.m6968a()
            com.google.android.gms.common.internal.C1057u.m7286a(r13)
            r6 = r13
            com.google.android.gms.common.internal.d$a r6 = (com.google.android.gms.common.internal.AbstractC1020d.a) r6
            com.google.android.gms.common.internal.C1057u.m7286a(r14)
            r7 = r14
            com.google.android.gms.common.internal.d$b r7 = (com.google.android.gms.common.internal.AbstractC1020d.b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC1020d.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d$a, com.google.android.gms.common.internal.d$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1020d(Context context, Looper looper, AbstractC1032j abstractC1032j, C0994d c0994d, int i2, a aVar, b bVar, String str) {
        this.f6159k = new Object();
        this.f6160l = new Object();
        this.f6164p = new ArrayList<>();
        this.f6166r = 1;
        this.f6171w = null;
        this.f6172x = false;
        this.f6173y = null;
        this.f6174z = new AtomicInteger(0);
        C1057u.m7287a(context, "Context must not be null");
        this.f6155g = context;
        C1057u.m7287a(looper, "Looper must not be null");
        C1057u.m7287a(abstractC1032j, "Supervisor must not be null");
        this.f6156h = abstractC1032j;
        C1057u.m7287a(c0994d, "API availability must not be null");
        this.f6157i = c0994d;
        this.f6158j = new h(looper);
        this.f6169u = i2;
        this.f6167s = aVar;
        this.f6168t = bVar;
        this.f6170v = str;
    }

    /* renamed from: E */
    private final String m7050E() {
        String str = this.f6170v;
        return str == null ? this.f6155g.getClass().getName() : str;
    }

    /* renamed from: F */
    private final boolean m7051F() {
        boolean z;
        synchronized (this.f6159k) {
            z = this.f6166r == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final boolean m7052G() {
        if (this.f6172x || TextUtils.isEmpty(mo6464g()) || TextUtils.isEmpty(m7100y())) {
            return false;
        }
        try {
            Class.forName(mo6464g());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7059a(zza zzaVar) {
        this.f6173y = zzaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m7060a(int i2, int i3, T t) {
        synchronized (this.f6159k) {
            if (this.f6166r != i2) {
                return false;
            }
            m7064c(i3, t);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m7063c(int i2) {
        int i3;
        if (m7051F()) {
            i3 = 5;
            this.f6172x = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.f6158j;
        handler.sendMessage(handler.obtainMessage(i3, this.f6174z.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m7064c(int i2, T t) {
        C1057u.m7293a((i2 == 4) == (t != null));
        synchronized (this.f6159k) {
            this.f6166r = i2;
            this.f6163o = t;
            mo7086b(i2, t);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (this.f6165q != null && this.f6154f != null) {
                        String m7199d = this.f6154f.m7199d();
                        String m7196a = this.f6154f.m7196a();
                        StringBuilder sb = new StringBuilder(String.valueOf(m7199d).length() + 70 + String.valueOf(m7196a).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(m7199d);
                        sb.append(" on ");
                        sb.append(m7196a);
                        sb.toString();
                        this.f6156h.m7159a(this.f6154f.m7199d(), this.f6154f.m7196a(), this.f6154f.m7198c(), this.f6165q, m7050E());
                        this.f6174z.incrementAndGet();
                    }
                    this.f6165q = new j(this.f6174z.get());
                    C1045p0 c1045p0 = (this.f6166r != 3 || m7100y() == null) ? new C1045p0(m7071B(), mo6467p(), false, 129, m7072C()) : new C1045p0(m7098w().getPackageName(), m7100y(), true, 129, false);
                    this.f6154f = c1045p0;
                    if (!this.f6156h.mo7160a(new AbstractC1032j.a(c1045p0.m7199d(), this.f6154f.m7196a(), this.f6154f.m7198c(), this.f6154f.m7197b()), this.f6165q, m7050E())) {
                        String m7199d2 = this.f6154f.m7199d();
                        String m7196a2 = this.f6154f.m7196a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(m7199d2).length() + 34 + String.valueOf(m7196a2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(m7199d2);
                        sb2.append(" on ");
                        sb2.append(m7196a2);
                        sb2.toString();
                        m7075a(16, (Bundle) null, this.f6174z.get());
                    }
                } else if (i2 == 4) {
                    m7077a((AbstractC1020d<T>) t);
                }
            } else if (this.f6165q != null) {
                this.f6156h.m7159a(this.f6154f.m7199d(), this.f6154f.m7196a(), this.f6154f.m7198c(), this.f6165q, m7050E());
                this.f6165q = null;
            }
        }
    }

    /* renamed from: A */
    public final T m7070A() {
        T t;
        synchronized (this.f6159k) {
            if (this.f6166r == 5) {
                throw new DeadObjectException();
            }
            m7094s();
            C1057u.m7298b(this.f6163o != null, "Client is connected but service is null");
            t = this.f6163o;
        }
        return t;
    }

    /* renamed from: B */
    protected String m7071B() {
        return "com.google.android.gms";
    }

    /* renamed from: C */
    protected boolean m7072C() {
        return false;
    }

    /* renamed from: D */
    public boolean m7073D() {
        return false;
    }

    /* renamed from: a */
    protected abstract T mo6462a(IBinder iBinder);

    /* renamed from: a */
    protected void m7074a(int i2) {
        this.f6149a = i2;
        this.f6150b = System.currentTimeMillis();
    }

    /* renamed from: a */
    protected final void m7075a(int i2, Bundle bundle, int i3) {
        Handler handler = this.f6158j;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new k(i2, null)));
    }

    /* renamed from: a */
    protected void m7076a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.f6158j;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new l(i2, iBinder, bundle)));
    }

    /* renamed from: a */
    protected void m7077a(T t) {
        this.f6151c = System.currentTimeMillis();
    }

    /* renamed from: a */
    protected void m7078a(ConnectionResult connectionResult) {
        this.f6152d = connectionResult.m6484j();
        this.f6153e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m7079a(c cVar) {
        C1057u.m7287a(cVar, "Connection progress callbacks cannot be null.");
        this.f6162n = cVar;
        m7064c(2, null);
    }

    /* renamed from: a */
    protected void m7080a(c cVar, int i2, PendingIntent pendingIntent) {
        C1057u.m7287a(cVar, "Connection progress callbacks cannot be null.");
        this.f6162n = cVar;
        Handler handler = this.f6158j;
        handler.sendMessage(handler.obtainMessage(3, this.f6174z.get(), i2, pendingIntent));
    }

    /* renamed from: a */
    public void m7081a(e eVar) {
        eVar.mo6775a();
    }

    /* renamed from: a */
    public void m7082a(InterfaceC1038m interfaceC1038m, Set<Scope> set) {
        Bundle mo7099x = mo7099x();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f6169u);
        getServiceRequest.f6121e = this.f6155g.getPackageName();
        getServiceRequest.f6124h = mo7099x;
        if (set != null) {
            getServiceRequest.f6123g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo6521n()) {
            getServiceRequest.f6125i = mo7096u() != null ? mo7096u() : new Account("<<default account>>", "com.google");
            if (interfaceC1038m != null) {
                getServiceRequest.f6122f = interfaceC1038m.asBinder();
            }
        } else if (m7073D()) {
            getServiceRequest.f6125i = mo7096u();
        }
        getServiceRequest.f6126j = f6148A;
        getServiceRequest.f6127k = mo7097v();
        try {
            try {
                synchronized (this.f6160l) {
                    if (this.f6161m != null) {
                        this.f6161m.mo7195a(new i(this, this.f6174z.get()), getServiceRequest);
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                m7076a(8, (IBinder) null, (Bundle) null, this.f6174z.get());
            }
        } catch (DeadObjectException unused2) {
            m7085b(1);
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void m7083a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        T t;
        InterfaceC1046q interfaceC1046q;
        synchronized (this.f6159k) {
            i2 = this.f6166r;
            t = this.f6163o;
        }
        synchronized (this.f6160l) {
            interfaceC1046q = this.f6161m;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) mo6464g()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC1046q == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC1046q.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f6151c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.f6151c;
            String format = simpleDateFormat.format(new Date(this.f6151c));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f6150b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.f6149a;
            printWriter.append((CharSequence) (i3 != 1 ? i3 != 2 ? String.valueOf(i3) : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.f6150b;
            String format2 = simpleDateFormat.format(new Date(this.f6150b));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f6153e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C0862d.m6530a(this.f6152d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.f6153e;
            String format3 = simpleDateFormat.format(new Date(this.f6153e));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* renamed from: a */
    public boolean m7084a() {
        boolean z;
        synchronized (this.f6159k) {
            z = this.f6166r == 4;
        }
        return z;
    }

    /* renamed from: b */
    public void mo6515b() {
        this.f6174z.incrementAndGet();
        synchronized (this.f6164p) {
            int size = this.f6164p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f6164p.get(i2).m7106a();
            }
            this.f6164p.clear();
        }
        synchronized (this.f6160l) {
            this.f6161m = null;
        }
        m7064c(1, null);
    }

    /* renamed from: b */
    public void m7085b(int i2) {
        Handler handler = this.f6158j;
        handler.sendMessage(handler.obtainMessage(6, this.f6174z.get(), i2));
    }

    /* renamed from: b */
    void mo7086b(int i2, T t) {
    }

    /* renamed from: e */
    public boolean mo6463e() {
        return false;
    }

    /* renamed from: g */
    protected abstract String mo6464g();

    /* renamed from: h */
    public boolean m7087h() {
        return true;
    }

    /* renamed from: i */
    public int mo6465i() {
        return C0994d.f6050a;
    }

    /* renamed from: j */
    public boolean m7088j() {
        boolean z;
        synchronized (this.f6159k) {
            z = this.f6166r == 2 || this.f6166r == 3;
        }
        return z;
    }

    /* renamed from: k */
    public final Feature[] m7089k() {
        zza zzaVar = this.f6173y;
        if (zzaVar == null) {
            return null;
        }
        return zzaVar.f6276c;
    }

    /* renamed from: l */
    public String m7090l() {
        C1045p0 c1045p0;
        if (!m7084a() || (c1045p0 = this.f6154f) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c1045p0.m7196a();
    }

    /* renamed from: m */
    public Intent mo6466m() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: n */
    public boolean mo6521n() {
        return false;
    }

    /* renamed from: o */
    public IBinder m7091o() {
        synchronized (this.f6160l) {
            if (this.f6161m == null) {
                return null;
            }
            return this.f6161m.asBinder();
        }
    }

    /* renamed from: p */
    protected abstract String mo6467p();

    /* renamed from: q */
    public Bundle m7092q() {
        return null;
    }

    /* renamed from: r */
    public void m7093r() {
        int mo6953a = this.f6157i.mo6953a(this.f6155g, mo6465i());
        if (mo6953a == 0) {
            m7079a(new d());
        } else {
            m7064c(1, null);
            m7080a(new d(), mo6953a, (PendingIntent) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m7094s() {
        if (!m7084a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: t */
    protected boolean m7095t() {
        return false;
    }

    /* renamed from: u */
    public Account mo7096u() {
        return null;
    }

    /* renamed from: v */
    public Feature[] mo7097v() {
        return f6148A;
    }

    /* renamed from: w */
    public final Context m7098w() {
        return this.f6155g;
    }

    /* renamed from: x */
    protected Bundle mo7099x() {
        return new Bundle();
    }

    /* renamed from: y */
    protected String m7100y() {
        return null;
    }

    /* renamed from: z */
    protected Set<Scope> mo7101z() {
        return Collections.EMPTY_SET;
    }
}
