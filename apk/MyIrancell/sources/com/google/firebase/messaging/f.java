package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.f;
import defpackage.ns;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class f {
    private final Executor a;
    private final Context b;
    private final p c;

    public f(Context context, p pVar, Executor executor) {
        this.a = executor;
        this.b = context;
        this.c = pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        boolean z;
        if (this.c.b("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!com.google.android.gms.common.util.n.h()) {
                SystemClock.sleep(10L);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        o a = o.a(this.c.a("gcm.n.image"));
        if (a != null) {
            a.a(this.a);
        }
        c a2 = d.a(this.b, this.c);
        f.d dVar = a2.a;
        if (a != null) {
            try {
                Bitmap bitmap = (Bitmap) ns.a(a.a(), 5L, TimeUnit.SECONDS);
                dVar.a(bitmap);
                f.b bVar = new f.b();
                bVar.b(bitmap);
                bVar.a((Bitmap) null);
                dVar.a(bVar);
            } catch (InterruptedException unused) {
                a.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Failed to download image: ");
                sb.append(valueOf);
                sb.toString();
            } catch (TimeoutException unused2) {
                a.close();
            }
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.b.getSystemService("notification")).notify(a2.b, 0, a2.a.a());
        return true;
    }
}
