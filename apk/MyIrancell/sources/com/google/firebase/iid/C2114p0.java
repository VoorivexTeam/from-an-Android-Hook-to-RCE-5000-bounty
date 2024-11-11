package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.internal.C1048r;
import com.google.firebase.C2052c;
import java.io.IOException;
import java.util.concurrent.Executor;
import p000.AbstractC2871ks;
import p000.C2908ls;
import p000.InterfaceC2487fv;
import p000.InterfaceC3180rv;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.p0 */
/* loaded from: classes.dex */
public final class C2114p0 {

    /* renamed from: a */
    private final C2052c f8942a;

    /* renamed from: b */
    private final C2103k f8943b;

    /* renamed from: c */
    private final C2115q f8944c;

    /* renamed from: d */
    private final Executor f8945d;

    /* renamed from: e */
    private final InterfaceC3180rv f8946e;

    /* renamed from: f */
    private final InterfaceC2487fv f8947f;

    private C2114p0(C2052c c2052c, C2103k c2103k, Executor executor, C2115q c2115q, InterfaceC3180rv interfaceC3180rv, InterfaceC2487fv interfaceC2487fv) {
        this.f8942a = c2052c;
        this.f8943b = c2103k;
        this.f8944c = c2115q;
        this.f8945d = executor;
        this.f8946e = interfaceC3180rv;
        this.f8947f = interfaceC2487fv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2114p0(C2052c c2052c, C2103k c2103k, Executor executor, InterfaceC3180rv interfaceC3180rv, InterfaceC2487fv interfaceC2487fv) {
        this(c2052c, c2103k, executor, new C2115q(c2052c.m10503a(), c2103k), interfaceC3180rv, interfaceC2487fv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static String m10665a(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String valueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Unexpected response: ");
        sb.append(valueOf);
        sb.toString();
        new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: a */
    private final AbstractC2871ks<Bundle> m10667a(String str, String str2, String str3, final Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f8942a.m10506c().m10589a());
        bundle.putString("gmsv", Integer.toString(this.f8943b.m10661d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f8943b.m10659b());
        bundle.putString("app_ver_name", this.f8943b.m10660c());
        String m7202a = C1048r.m7201a().m7202a("firebase-iid");
        if ("UNKNOWN".equals(m7202a)) {
            int i = C0994d.f6050a;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i);
            m7202a = sb.toString();
        }
        String valueOf = String.valueOf(m7202a);
        bundle.putString("cliv", valueOf.length() != 0 ? "fiid-".concat(valueOf) : new String("fiid-"));
        InterfaceC2487fv.a mo11639a = this.f8947f.mo11639a("fire-iid");
        if (mo11639a != InterfaceC2487fv.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo11639a.getCode()));
            bundle.putString("Firebase-Client", this.f8946e.mo14184a());
        }
        final C2908ls c2908ls = new C2908ls();
        this.f8945d.execute(new Runnable(this, bundle, c2908ls) { // from class: com.google.firebase.iid.r0

            /* renamed from: b */
            private final C2114p0 f8956b;

            /* renamed from: c */
            private final Bundle f8957c;

            /* renamed from: d */
            private final C2908ls f8958d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8956b = this;
                this.f8957c = bundle;
                this.f8958d = c2908ls;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8956b.m10671a(this.f8957c, this.f8958d);
            }
        });
        return c2908ls.m13924a();
    }

    /* renamed from: a */
    private final <T> AbstractC2871ks<Void> m10668a(AbstractC2871ks<T> abstractC2871ks) {
        return abstractC2871ks.mo11811a(C2082b.m10638a(), new C2116q0(this));
    }

    /* renamed from: b */
    private final AbstractC2871ks<String> m10669b(AbstractC2871ks<Bundle> abstractC2871ks) {
        return abstractC2871ks.mo11811a(this.f8945d, new C2122t0(this));
    }

    /* renamed from: a */
    public final AbstractC2871ks<String> m10670a(String str, String str2, String str3) {
        return m10669b(m10667a(str, str2, str3, new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m10671a(Bundle bundle, C2908ls c2908ls) {
        try {
            c2908ls.m13926a((C2908ls) this.f8944c.m10681a(bundle));
        } catch (IOException e) {
            c2908ls.m13925a((Exception) e);
        }
    }

    /* renamed from: b */
    public final AbstractC2871ks<Void> m10672b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return m10668a(m10669b(m10667a(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    /* renamed from: c */
    public final AbstractC2871ks<Void> m10673c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return m10668a(m10669b(m10667a(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }
}
