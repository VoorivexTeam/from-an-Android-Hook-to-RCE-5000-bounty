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
/* loaded from: classes.dex */
public final class x implements Runnable {
    private final long b;
    private final PowerManager.WakeLock c;
    private final FirebaseInstanceId d;
    private final z e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(FirebaseInstanceId firebaseInstanceId, k kVar, z zVar, long j) {
        this.d = firebaseInstanceId;
        this.e = zVar;
        this.b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    private final boolean c() {
        u c = this.d.c();
        if (!this.d.a(c)) {
            return true;
        }
        try {
            String d = this.d.d();
            if (d == null) {
                return false;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            if ((c == null || (c != null && !d.equals(c.a))) && "[DEFAULT]".equals(this.d.b().b())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(this.d.b().b());
                    if (valueOf.length() != 0) {
                        "Invoking onNewToken for app: ".concat(valueOf);
                    } else {
                        new String("Invoking onNewToken for app: ");
                    }
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", d);
                Context a = a();
                Intent intent2 = new Intent(a, (Class<?>) FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a.sendBroadcast(intent2);
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
    public final Context a() {
        return this.d.b().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        if (s.b().a(a())) {
            this.c.acquire();
        }
        try {
            try {
                this.d.a(true);
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                sb.toString();
                this.d.a(false);
                if (!s.b().a(a())) {
                    return;
                }
            }
            if (!this.d.f()) {
                this.d.a(false);
                if (s.b().a(a())) {
                    this.c.release();
                    return;
                }
                return;
            }
            if (s.b().b(a()) && !b()) {
                new w(this).a();
                if (s.b().a(a())) {
                    this.c.release();
                    return;
                }
                return;
            }
            if (c() && this.e.a(this.d)) {
                this.d.a(false);
            } else {
                this.d.a(this.b);
            }
            if (!s.b().a(a())) {
                return;
            }
            this.c.release();
        } catch (Throwable th) {
            if (s.b().a(a())) {
                this.c.release();
            }
            throw th;
        }
    }
}
