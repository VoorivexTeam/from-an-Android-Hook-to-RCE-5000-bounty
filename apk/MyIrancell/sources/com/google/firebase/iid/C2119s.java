package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.s */
/* loaded from: classes.dex */
public final class C2119s {

    /* renamed from: e */
    private static C2119s f8959e;

    /* renamed from: a */
    @GuardedBy("this")
    private String f8960a = null;

    /* renamed from: b */
    private Boolean f8961b = null;

    /* renamed from: c */
    private Boolean f8962c = null;

    /* renamed from: d */
    private final Queue<Intent> f8963d = new ArrayDeque();

    private C2119s() {
    }

    /* renamed from: b */
    private final int m10682b(Context context, Intent intent) {
        String m10684c = m10684c(context, intent);
        if (m10684c != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(m10684c);
                if (valueOf.length() != 0) {
                    "Restricting intent to a specific service: ".concat(valueOf);
                } else {
                    new String("Restricting intent to a specific service: ");
                }
            }
            intent.setClassName(context.getPackageName(), m10684c);
        }
        try {
            return (m10687a(context) ? C2131y.m10723a(context, intent) : context.startService(intent)) == null ? 404 : -1;
        } catch (IllegalStateException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            sb.toString();
            return 402;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    /* renamed from: b */
    public static synchronized C2119s m10683b() {
        C2119s c2119s;
        synchronized (C2119s.class) {
            if (f8959e == null) {
                f8959e = new C2119s();
            }
            c2119s = f8959e;
        }
        return c2119s;
    }

    /* renamed from: c */
    private final synchronized String m10684c(Context context, Intent intent) {
        String str;
        if (this.f8960a != null) {
            return this.f8960a;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && resolveService.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    str = serviceInfo.name;
                }
                this.f8960a = str;
                return this.f8960a;
            }
            String str2 = serviceInfo.packageName;
            String str3 = serviceInfo.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 94 + String.valueOf(str3).length());
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str2);
            sb.append("/");
            sb.append(str3);
            sb.toString();
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public final int m10685a(Context context, Intent intent) {
        Log.isLoggable("FirebaseInstanceId", 3);
        this.f8963d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m10682b(context, intent2);
    }

    /* renamed from: a */
    public final Intent m10686a() {
        return this.f8963d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m10687a(Context context) {
        if (this.f8961b == null) {
            this.f8961b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f8961b.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.f8961b.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m10688b(Context context) {
        if (this.f8962c == null) {
            this.f8962c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f8961b.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.f8962c.booleanValue();
    }
}
