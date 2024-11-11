package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.C1110p;
import com.google.android.gms.common.util.C1112r;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: as */
/* loaded from: classes.dex */
public class C0434as {

    /* renamed from: l */
    private static ScheduledExecutorService f2634l;

    /* renamed from: a */
    private final Object f2635a;

    /* renamed from: b */
    private final PowerManager.WakeLock f2636b;

    /* renamed from: c */
    private WorkSource f2637c;

    /* renamed from: d */
    private final int f2638d;

    /* renamed from: e */
    private final String f2639e;

    /* renamed from: f */
    private final String f2640f;

    /* renamed from: g */
    private final Context f2641g;

    /* renamed from: h */
    private boolean f2642h;

    /* renamed from: i */
    private final Map<String, Integer[]> f2643i;

    /* renamed from: j */
    private int f2644j;

    /* renamed from: k */
    private AtomicInteger f2645k;

    static {
        new C0491bs();
    }

    public C0434as(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    private C0434as(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private C0434as(Context context, int i, String str, String str2, String str3, String str4) {
        this.f2635a = this;
        this.f2642h = true;
        this.f2643i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.f2645k = new AtomicInteger(0);
        C1057u.m7287a(context, "WakeLock: context must not be null");
        C1057u.m7288a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.f2638d = i;
        this.f2640f = null;
        this.f2641g = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f2639e = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f2639e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        this.f2636b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C1112r.m7418a(context)) {
            WorkSource m7413a = C1112r.m7413a(context, C1110p.m7409a(str3) ? context.getPackageName() : str3);
            this.f2637c = m7413a;
            if (m7413a != null && C1112r.m7418a(this.f2641g)) {
                WorkSource workSource = this.f2637c;
                if (workSource != null) {
                    workSource.add(m7413a);
                } else {
                    this.f2637c = m7413a;
                }
                try {
                    this.f2636b.setWorkSource(this.f2637c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f2634l == null) {
            f2634l = C3405wo.m16384a().mo16385a();
        }
    }

    /* renamed from: a */
    private final String m3180a(String str) {
        return (!this.f2642h || TextUtils.isEmpty(str)) ? this.f2640f : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m3181a(int i) {
        if (this.f2636b.isHeld()) {
            try {
                this.f2636b.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
                String.valueOf(this.f2639e).concat(" was already released!");
            }
            this.f2636b.isHeld();
        }
    }

    /* renamed from: b */
    private final List<String> m3183b() {
        return C1112r.m7416a(this.f2637c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        com.google.android.gms.common.stats.C1091d.m7355a().m7358a(r12.f2641g, com.google.android.gms.common.stats.C1090c.m7352a(r12.f2636b, r6), 8, r12.f2639e, r6, null, r12.f2638d, m3183b());
        r12.f2644j--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r12.f2644j == 1) goto L21;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3184a() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f2645k
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L13
            java.lang.String r0 = r12.f2639e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = " release without a matched acquire!"
            r0.concat(r1)
        L13:
            r0 = 0
            java.lang.String r6 = r12.m3180a(r0)
            java.lang.Object r0 = r12.f2635a
            monitor-enter(r0)
            boolean r1 = r12.f2642h     // Catch: java.lang.Throwable -> L78
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L4c
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f2643i     // Catch: java.lang.Throwable -> L78
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
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f2643i     // Catch: java.lang.Throwable -> L78
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
            boolean r1 = r12.f2642h     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L73
            int r1 = r12.f2644j     // Catch: java.lang.Throwable -> L78
            if (r1 != r10) goto L73
        L54:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C1091d.m7355a()     // Catch: java.lang.Throwable -> L78
            android.content.Context r2 = r12.f2641g     // Catch: java.lang.Throwable -> L78
            android.os.PowerManager$WakeLock r3 = r12.f2636b     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = com.google.android.gms.common.stats.C1090c.m7352a(r3, r6)     // Catch: java.lang.Throwable -> L78
            r4 = 8
            java.lang.String r5 = r12.f2639e     // Catch: java.lang.Throwable -> L78
            r7 = 0
            int r8 = r12.f2638d     // Catch: java.lang.Throwable -> L78
            java.util.List r9 = r12.m3183b()     // Catch: java.lang.Throwable -> L78
            r1.m7358a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L78
            int r1 = r12.f2644j     // Catch: java.lang.Throwable -> L78
            int r1 = r1 - r10
            r12.f2644j = r1     // Catch: java.lang.Throwable -> L78
        L73:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            r12.m3181a(r11)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0434as.m3184a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r2 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        com.google.android.gms.common.stats.C1091d.m7355a().m7359a(r13.f2641g, com.google.android.gms.common.stats.C1090c.m7352a(r13.f2636b, r6), 7, r13.f2639e, r6, null, r13.f2638d, m3183b(), r14);
        r13.f2644j++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r13.f2644j == 0) goto L22;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3185a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f2645k
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.m3180a(r0)
            java.lang.Object r0 = r13.f2635a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f2643i     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L96
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r13.f2644j     // Catch: java.lang.Throwable -> L96
            if (r1 <= 0) goto L29
        L1a:
            android.os.PowerManager$WakeLock r1 = r13.f2636b     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L29
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f2643i     // Catch: java.lang.Throwable -> L96
            r1.clear()     // Catch: java.lang.Throwable -> L96
            r13.f2644j = r2     // Catch: java.lang.Throwable -> L96
        L29:
            boolean r1 = r13.f2642h     // Catch: java.lang.Throwable -> L96
            r12 = 1
            if (r1 == 0) goto L56
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f2643i     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L47
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f2643i     // Catch: java.lang.Throwable -> L96
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
            boolean r1 = r13.f2642h     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
            int r1 = r13.f2644j     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
        L5e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C1091d.m7355a()     // Catch: java.lang.Throwable -> L96
            android.content.Context r2 = r13.f2641g     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r3 = r13.f2636b     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = com.google.android.gms.common.stats.C1090c.m7352a(r3, r6)     // Catch: java.lang.Throwable -> L96
            r4 = 7
            java.lang.String r5 = r13.f2639e     // Catch: java.lang.Throwable -> L96
            r7 = 0
            int r8 = r13.f2638d     // Catch: java.lang.Throwable -> L96
            java.util.List r9 = r13.m3183b()     // Catch: java.lang.Throwable -> L96
            r10 = r14
            r1.m7359a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96
            int r1 = r13.f2644j     // Catch: java.lang.Throwable -> L96
            int r1 = r1 + r12
            r13.f2644j = r1     // Catch: java.lang.Throwable -> L96
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r0 = r13.f2636b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L95
            java.util.concurrent.ScheduledExecutorService r0 = p000.C0434as.f2634l
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0434as.m3185a(long):void");
    }

    /* renamed from: a */
    public void m3186a(boolean z) {
        this.f2636b.setReferenceCounted(z);
        this.f2642h = z;
    }
}
