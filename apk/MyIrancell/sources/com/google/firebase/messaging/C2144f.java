package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.C0228f;
import com.google.android.gms.common.util.C1108n;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.C3000ns;

/* renamed from: com.google.firebase.messaging.f */
/* loaded from: classes.dex */
final class C2144f {

    /* renamed from: a */
    private final Executor f9016a;

    /* renamed from: b */
    private final Context f9017b;

    /* renamed from: c */
    private final C2154p f9018c;

    public C2144f(Context context, C2154p c2154p, Executor executor) {
        this.f9016a = executor;
        this.f9017b = context;
        this.f9018c = c2154p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m10770a() {
        boolean z;
        if (this.f9018c.m10786b("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.f9017b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!C1108n.m7402h()) {
                SystemClock.sleep(10L);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f9017b.getSystemService("activity")).getRunningAppProcesses();
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
        C2153o m10772a = C2153o.m10772a(this.f9018c.m10784a("gcm.n.image"));
        if (m10772a != null) {
            m10772a.m10775a(this.f9016a);
        }
        C2141c m10761a = C2142d.m10761a(this.f9017b, this.f9018c);
        C0228f.d dVar = m10761a.f9008a;
        if (m10772a != null) {
            try {
                Bitmap bitmap = (Bitmap) C3000ns.m14384a(m10772a.m10774a(), 5L, TimeUnit.SECONDS);
                dVar.m1402a(bitmap);
                C0228f.b bVar = new C0228f.b();
                bVar.m1390b(bitmap);
                bVar.m1388a((Bitmap) null);
                dVar.m1404a(bVar);
            } catch (InterruptedException unused) {
                m10772a.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Failed to download image: ");
                sb.append(valueOf);
                sb.toString();
            } catch (TimeoutException unused2) {
                m10772a.close();
            }
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.f9017b.getSystemService("notification")).notify(m10761a.f9009b, 0, m10761a.f9008a.m1395a());
        return true;
    }
}
