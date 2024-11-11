package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.C1003e;
import com.google.android.gms.common.C1006h;
import com.google.android.gms.common.ServiceConnectionC0858a;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.stats.C1088a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p000.AbstractBinderC2905lp;
import p000.InterfaceC2868kp;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class AdvertisingIdClient {

    /* renamed from: a */
    @GuardedBy("this")
    private ServiceConnectionC0858a f5455a;

    /* renamed from: b */
    @GuardedBy("this")
    private InterfaceC2868kp f5456b;

    /* renamed from: c */
    @GuardedBy("this")
    private boolean f5457c;

    /* renamed from: d */
    private final Object f5458d;

    /* renamed from: e */
    @GuardedBy("mAutoDisconnectTaskLock")
    private C0801a f5459e;

    /* renamed from: f */
    @GuardedBy("this")
    private final Context f5460f;

    /* renamed from: g */
    private final boolean f5461g;

    /* renamed from: h */
    private final long f5462h;

    /* loaded from: classes.dex */
    public static final class Info {

        /* renamed from: a */
        private final String f5463a;

        /* renamed from: b */
        private final boolean f5464b;

        public Info(String str, boolean z) {
            this.f5463a = str;
            this.f5464b = z;
        }

        public final String getId() {
            return this.f5463a;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.f5464b;
        }

        public final String toString() {
            String str = this.f5463a;
            boolean z = this.f5464b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient$a */
    /* loaded from: classes.dex */
    public static class C0801a extends Thread {

        /* renamed from: b */
        private WeakReference<AdvertisingIdClient> f5465b;

        /* renamed from: c */
        private long f5466c;

        /* renamed from: d */
        CountDownLatch f5467d = new CountDownLatch(1);

        /* renamed from: e */
        boolean f5468e = false;

        public C0801a(AdvertisingIdClient advertisingIdClient, long j) {
            this.f5465b = new WeakReference<>(advertisingIdClient);
            this.f5466c = j;
            start();
        }

        /* renamed from: a */
        private final void m6345a() {
            AdvertisingIdClient advertisingIdClient = this.f5465b.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.f5468e = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f5467d.await(this.f5466c, TimeUnit.MILLISECONDS)) {
                    return;
                }
                m6345a();
            } catch (InterruptedException unused) {
                m6345a();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f5458d = new Object();
        C1057u.m7286a(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f5460f = context;
        this.f5457c = false;
        this.f5462h = j;
        this.f5461g = z2;
    }

    /* renamed from: a */
    private static ServiceConnectionC0858a m6339a(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int mo6953a = C0994d.m6968a().mo6953a(context, C1006h.f6075a);
            if (mo6953a != 0 && mo6953a != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            ServiceConnectionC0858a serviceConnectionC0858a = new ServiceConnectionC0858a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (C1088a.m7348a().m7350a(context, intent, serviceConnectionC0858a, 1)) {
                    return serviceConnectionC0858a;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C1003e(9);
        }
    }

    /* renamed from: a */
    private static InterfaceC2868kp m6340a(Context context, ServiceConnectionC0858a serviceConnectionC0858a) {
        try {
            return AbstractBinderC2905lp.m13922a(serviceConnectionC0858a.m6491a(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: a */
    private final void m6341a() {
        synchronized (this.f5458d) {
            if (this.f5459e != null) {
                this.f5459e.f5467d.countDown();
                try {
                    this.f5459e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f5462h > 0) {
                this.f5459e = new C0801a(this, this.f5462h);
            }
        }
    }

    /* renamed from: a */
    private final void m6342a(boolean z) {
        C1057u.m7300c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f5457c) {
                finish();
            }
            ServiceConnectionC0858a m6339a = m6339a(this.f5460f, this.f5461g);
            this.f5455a = m6339a;
            this.f5456b = m6340a(this.f5460f, m6339a);
            this.f5457c = true;
            if (z) {
                m6341a();
            }
        }
    }

    /* renamed from: a */
    private final boolean m6343a(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (info != null) {
            hashMap.put("limit_ad_tracking", info.isLimitAdTrackingEnabled() ? "1" : "0");
        }
        if (info != null && info.getId() != null) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C0802a(this, hashMap).start();
        return true;
    }

    /* renamed from: b */
    private final boolean m6344b() {
        boolean mo13744b;
        C1057u.m7300c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f5457c) {
                synchronized (this.f5458d) {
                    if (this.f5459e == null || !this.f5459e.f5468e) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m6342a(false);
                    if (!this.f5457c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            C1057u.m7286a(this.f5455a);
            C1057u.m7286a(this.f5456b);
            try {
                mo13744b = this.f5456b.mo13744b();
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        m6341a();
        return mo13744b;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        zzb zzbVar = new zzb(context);
        boolean z = zzbVar.getBoolean("gads:ad_id_app_context:enabled", false);
        float m6346a = zzbVar.m6346a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String m6347a = zzbVar.m6347a("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, z, zzbVar.getBoolean("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.m6342a(false);
            Info info = advertisingIdClient.getInfo();
            advertisingIdClient.m6343a(info, z, m6346a, SystemClock.elapsedRealtime() - elapsedRealtime, m6347a, null);
            return info;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        zzb zzbVar = new zzb(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, zzbVar.getBoolean("gads:ad_id_app_context:enabled", false), zzbVar.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.m6342a(false);
            return advertisingIdClient.m6344b();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    protected void finalize() {
        finish();
        super.finalize();
    }

    public final void finish() {
        C1057u.m7300c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f5460f == null || this.f5455a == null) {
                return;
            }
            try {
                if (this.f5457c) {
                    C1088a.m7348a().m7349a(this.f5460f, this.f5455a);
                }
            } catch (Throwable unused) {
            }
            this.f5457c = false;
            this.f5456b = null;
            this.f5455a = null;
        }
    }

    public Info getInfo() {
        Info info;
        C1057u.m7300c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f5457c) {
                synchronized (this.f5458d) {
                    if (this.f5459e == null || !this.f5459e.f5468e) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m6342a(false);
                    if (!this.f5457c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            C1057u.m7286a(this.f5455a);
            C1057u.m7286a(this.f5456b);
            try {
                info = new Info(this.f5456b.mo13746f(), this.f5456b.mo13745b(true));
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        m6341a();
        return info;
    }

    public void start() {
        m6342a(true);
    }
}
