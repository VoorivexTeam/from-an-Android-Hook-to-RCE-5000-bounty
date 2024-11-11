package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import defpackage.fv;
import defpackage.ks;
import defpackage.ls;
import defpackage.rv;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p0 {
    private final com.google.firebase.c a;
    private final k b;
    private final q c;
    private final Executor d;
    private final rv e;
    private final fv f;

    private p0(com.google.firebase.c cVar, k kVar, Executor executor, q qVar, rv rvVar, fv fvVar) {
        this.a = cVar;
        this.b = kVar;
        this.c = qVar;
        this.d = executor;
        this.e = rvVar;
        this.f = fvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(com.google.firebase.c cVar, k kVar, Executor executor, rv rvVar, fv fvVar) {
        this(cVar, kVar, executor, new q(cVar.a(), kVar), rvVar, fvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(Bundle bundle) {
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

    private final ks<Bundle> a(String str, String str2, String str3, final Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.a.c().a());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.b());
        bundle.putString("app_ver_name", this.b.c());
        String a = com.google.android.gms.common.internal.r.a().a("firebase-iid");
        if ("UNKNOWN".equals(a)) {
            int i = com.google.android.gms.common.d.a;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i);
            a = sb.toString();
        }
        String valueOf = String.valueOf(a);
        bundle.putString("cliv", valueOf.length() != 0 ? "fiid-".concat(valueOf) : new String("fiid-"));
        fv.a a2 = this.f.a("fire-iid");
        if (a2 != fv.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a2.getCode()));
            bundle.putString("Firebase-Client", this.e.a());
        }
        final ls lsVar = new ls();
        this.d.execute(new Runnable(this, bundle, lsVar) { // from class: com.google.firebase.iid.r0
            private final p0 b;
            private final Bundle c;
            private final ls d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = this;
                this.c = bundle;
                this.d = lsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.a(this.c, this.d);
            }
        });
        return lsVar.a();
    }

    private final <T> ks<Void> a(ks<T> ksVar) {
        return ksVar.a(b.a(), new q0(this));
    }

    private final ks<String> b(ks<Bundle> ksVar) {
        return ksVar.a(this.d, new t0(this));
    }

    public final ks<String> a(String str, String str2, String str3) {
        return b(a(str, str2, str3, new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle, ls lsVar) {
        try {
            lsVar.a((ls) this.c.a(bundle));
        } catch (IOException e) {
            lsVar.a((Exception) e);
        }
    }

    public final ks<Void> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    public final ks<Void> c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }
}
