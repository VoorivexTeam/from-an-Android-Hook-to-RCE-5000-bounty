package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.x */
/* loaded from: classes.dex */
public final class RunnableC2129x implements Runnable {

    /* renamed from: b */
    private final long f8978b;

    /* renamed from: c */
    private final PowerManager.WakeLock f8979c;

    /* renamed from: d */
    private final FirebaseInstanceId f8980d;

    /* renamed from: e */
    private final C2133z f8981e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2129x(FirebaseInstanceId firebaseInstanceId, C2103k c2103k, C2133z c2133z, long j) {
        this.f8980d = firebaseInstanceId;
        this.f8981e = c2133z;
        this.f8978b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m10721a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f8979c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    private final boolean m10720c() {
        C2123u m10615c = this.f8980d.m10615c();
        if (!this.f8980d.m10612a(m10615c)) {
            return true;
        }
        try {
            String m10616d = this.f8980d.m10616d();
            if (m10616d == null) {
                return false;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            if ((m10615c == null || (m10615c != null && !m10616d.equals(m10615c.f8967a))) && "[DEFAULT]".equals(this.f8980d.m10613b().m10505b())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(this.f8980d.m10613b().m10505b());
                    if (valueOf.length() != 0) {
                        "Invoking onNewToken for app: ".concat(valueOf);
                    } else {
                        new String("Invoking onNewToken for app: ");
                    }
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", m10616d);
                Context m10721a = m10721a();
                Intent intent2 = new Intent(m10721a, (Class<?>) FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                m10721a.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                return false;
            }
            if (e.getMessage() != null) {
                throw e;
            }
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
            sb.append("Token retrieval failed: ");
            sb.append(message);
            sb.append(". Will retry token retrieval");
            sb.toString();
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context m10721a() {
        return this.f8980d.m10613b().m10503a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m10722b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m10721a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        if (C2119s.m10683b().m10687a(m10721a())) {
            this.f8979c.acquire();
        }
        try {
            try {
                this.f8980d.m10611a(true);
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                sb.toString();
                this.f8980d.m10611a(false);
                if (!C2119s.m10683b().m10687a(m10721a())) {
                    return;
                }
            }
            if (!this.f8980d.m10618f()) {
                this.f8980d.m10611a(false);
                if (C2119s.m10683b().m10687a(m10721a())) {
                    this.f8979c.release();
                    return;
                }
                return;
            }
            if (C2119s.m10683b().m10688b(m10721a()) && !m10722b()) {
                new C2127w(this).m10717a();
                if (C2119s.m10683b().m10687a(m10721a())) {
                    this.f8979c.release();
                    return;
                }
                return;
            }
            if (m10720c() && this.f8981e.m10730a(this.f8980d)) {
                this.f8980d.m10611a(false);
            } else {
                this.f8980d.m10609a(this.f8978b);
            }
            if (!C2119s.m10683b().m10687a(m10721a())) {
                return;
            }
            this.f8979c.release();
        } catch (Throwable th) {
            if (C2119s.m10683b().m10687a(m10721a())) {
                this.f8979c.release();
            }
            throw th;
        }
    }
}
