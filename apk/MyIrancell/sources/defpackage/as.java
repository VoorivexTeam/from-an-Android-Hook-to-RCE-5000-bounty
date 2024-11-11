package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.p;
import com.google.android.gms.common.util.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class as {
    private static ScheduledExecutorService l;
    private final Object a;
    private final PowerManager.WakeLock b;
    private WorkSource c;
    private final int d;
    private final String e;
    private final String f;
    private final Context g;
    private boolean h;
    private final Map<String, Integer[]> i;
    private int j;
    private AtomicInteger k;

    static {
        new bs();
    }

    public as(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    private as(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private as(Context context, int i, String str, String str2, String str3, String str4) {
        this.a = this;
        this.h = true;
        this.i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.k = new AtomicInteger(0);
        u.a(context, "WakeLock: context must not be null");
        u.a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.d = i;
        this.f = null;
        this.g = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.e = str;
        } else {
            String valueOf = String.valueOf(str);
            this.e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        this.b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (r.a(context)) {
            WorkSource a = r.a(context, p.a(str3) ? context.getPackageName() : str3);
            this.c = a;
            if (a != null && r.a(this.g)) {
                WorkSource workSource = this.c;
                if (workSource != null) {
                    workSource.add(a);
                } else {
                    this.c = a;
                }
                try {
                    this.b.setWorkSource(this.c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (l == null) {
            l = wo.a().a();
        }
    }

    private final String a(String str) {
        return (!this.h || TextUtils.isEmpty(str)) ? this.f : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i) {
        if (this.b.isHeld()) {
            try {
                this.b.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
                String.valueOf(this.e).concat(" was already released!");
            }
            this.b.isHeld();
        }
    }

    private final List<String> b() {
        return r.a(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        com.google.android.gms.common.stats.d.a().a(r12.g, com.google.android.gms.common.stats.c.a(r12.b, r6), 8, r12.e, r6, null, r12.d, b());
        r12.j--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r12.j == 1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.k
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L13
            java.lang.String r0 = r12.e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = " release without a matched acquire!"
            r0.concat(r1)
        L13:
            r0 = 0
            java.lang.String r6 = r12.a(r0)
            java.lang.Object r0 = r12.a
            monitor-enter(r0)
            boolean r1 = r12.h     // Catch: java.lang.Throwable -> L78
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L4c
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.i     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L78
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L2d
        L2b:
            r1 = 0
            goto L4a
        L2d:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L78
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L78
            if (r2 != r10) goto L3c
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.i     // Catch: java.lang.Throwable -> L78
            r1.remove(r6)     // Catch: java.lang.Throwable -> L78
            r1 = 1
            goto L4a
        L3c:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L78
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L78
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L78
            r1[r11] = r2     // Catch: java.lang.Throwable -> L78
            goto L2b
        L4a:
            if (r1 != 0) goto L54
        L4c:
            boolean r1 = r12.h     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L73
            int r1 = r12.j     // Catch: java.lang.Throwable -> L78
            if (r1 != r10) goto L73
        L54:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.d.a()     // Catch: java.lang.Throwable -> L78
            android.content.Context r2 = r12.g     // Catch: java.lang.Throwable -> L78
            android.os.PowerManager$WakeLock r3 = r12.b     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = com.google.android.gms.common.stats.c.a(r3, r6)     // Catch: java.lang.Throwable -> L78
            r4 = 8
            java.lang.String r5 = r12.e     // Catch: java.lang.Throwable -> L78
            r7 = 0
            int r8 = r12.d     // Catch: java.lang.Throwable -> L78
            java.util.List r9 = r12.b()     // Catch: java.lang.Throwable -> L78
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L78
            int r1 = r12.j     // Catch: java.lang.Throwable -> L78
            int r1 = r1 - r10
            r12.j = r1     // Catch: java.lang.Throwable -> L78
        L73:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            r12.a(r11)
            return
        L78:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            goto L7c
        L7b:
            throw r1
        L7c:
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r2 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        com.google.android.gms.common.stats.d.a().a(r13.g, com.google.android.gms.common.stats.c.a(r13.b, r6), 7, r13.e, r6, null, r13.d, b(), r14);
        r13.j++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r13.j == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.k
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.a(r0)
            java.lang.Object r0 = r13.a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L96
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r13.j     // Catch: java.lang.Throwable -> L96
            if (r1 <= 0) goto L29
        L1a:
            android.os.PowerManager$WakeLock r1 = r13.b     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L29
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            r1.clear()     // Catch: java.lang.Throwable -> L96
            r13.j = r2     // Catch: java.lang.Throwable -> L96
        L29:
            boolean r1 = r13.h     // Catch: java.lang.Throwable -> L96
            r12 = 1
            if (r1 == 0) goto L56
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L47
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r3[r2] = r4     // Catch: java.lang.Throwable -> L96
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> L96
            r2 = 1
            goto L54
        L47:
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L96
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L96
            r1[r2] = r3     // Catch: java.lang.Throwable -> L96
        L54:
            if (r2 != 0) goto L5e
        L56:
            boolean r1 = r13.h     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
            int r1 = r13.j     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
        L5e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.d.a()     // Catch: java.lang.Throwable -> L96
            android.content.Context r2 = r13.g     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r3 = r13.b     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = com.google.android.gms.common.stats.c.a(r3, r6)     // Catch: java.lang.Throwable -> L96
            r4 = 7
            java.lang.String r5 = r13.e     // Catch: java.lang.Throwable -> L96
            r7 = 0
            int r8 = r13.d     // Catch: java.lang.Throwable -> L96
            java.util.List r9 = r13.b()     // Catch: java.lang.Throwable -> L96
            r10 = r14
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96
            int r1 = r13.j     // Catch: java.lang.Throwable -> L96
            int r1 = r1 + r12
            r13.j = r1     // Catch: java.lang.Throwable -> L96
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r0 = r13.b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L95
            java.util.concurrent.ScheduledExecutorService r0 = defpackage.as.l
            cs r1 = new cs
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L95:
            return
        L96:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.a(long):void");
    }

    public void a(boolean z) {
        this.b.setReferenceCounted(z);
        this.h = z;
    }
}
