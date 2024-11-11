package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.t0;
import com.google.android.gms.common.internal.u0;
import com.google.android.gms.dynamite.DynamiteModule;
import defpackage.gp;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes.dex */
public final class n {
    private static volatile u0 a;
    private static final Object b = new Object();
    private static Context c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v a(String str, o oVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, oVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context) {
        synchronized (n.class) {
            if (c != null || context == null) {
                return;
            }
            c = context.getApplicationContext();
        }
    }

    private static v b(final String str, final o oVar, final boolean z, boolean z2) {
        try {
            if (a == null) {
                com.google.android.gms.common.internal.u.a(c);
                synchronized (b) {
                    if (a == null) {
                        a = t0.a(DynamiteModule.a(c, DynamiteModule.j, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            com.google.android.gms.common.internal.u.a(c);
            try {
                return a.a(new zzj(str, oVar, z, z2), gp.a(c.getPackageManager())) ? v.c() : v.a((Callable<String>) new Callable(z, str, oVar) { // from class: com.google.android.gms.common.p
                    private final boolean a;
                    private final String b;
                    private final o c;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = z;
                        this.b = str;
                        this.c = oVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String a2;
                        a2 = v.a(this.b, this.c, this.a, !r3 && n.b(r4, r5, true, false).a);
                        return a2;
                    }
                });
            } catch (RemoteException e) {
                return v.a("module call", e);
            }
        } catch (DynamiteModule.a e2) {
            String valueOf = String.valueOf(e2.getMessage());
            return v.a(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }
}
