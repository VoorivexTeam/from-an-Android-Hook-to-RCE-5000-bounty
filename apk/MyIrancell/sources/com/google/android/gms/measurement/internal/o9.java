package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.bb;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import defpackage.ep;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class o9 implements h6 {
    private static volatile o9 y;
    private d5 a;
    private j4 b;
    private d c;
    private q4 d;
    private k9 e;
    private ca f;
    private final v9 g;
    private q7 h;
    private final j5 i;
    private boolean j;
    private boolean k;
    private boolean l;
    private long m;
    private List<Runnable> n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private FileLock t;
    private FileChannel u;
    private List<Long> v;
    private List<Long> w;
    private long x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements f {
        com.google.android.gms.internal.measurement.x0 a;
        List<Long> b;
        List<com.google.android.gms.internal.measurement.t0> c;
        private long d;

        private a(o9 o9Var) {
        }

        /* synthetic */ a(o9 o9Var, r9 r9Var) {
            this(o9Var);
        }

        private static long a(com.google.android.gms.internal.measurement.t0 t0Var) {
            return ((t0Var.s() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.f
        public final void a(com.google.android.gms.internal.measurement.x0 x0Var) {
            com.google.android.gms.common.internal.u.a(x0Var);
            this.a = x0Var;
        }

        @Override // com.google.android.gms.measurement.internal.f
        public final boolean a(long j, com.google.android.gms.internal.measurement.t0 t0Var) {
            com.google.android.gms.common.internal.u.a(t0Var);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && a(this.c.get(0)) != a(t0Var)) {
                return false;
            }
            long c = this.d + t0Var.c();
            if (c >= Math.max(0, o.i.a(null).intValue())) {
                return false;
            }
            this.d = c;
            this.c.add(t0Var);
            this.b.add(Long.valueOf(j));
            return this.c.size() < Math.max(1, o.j.a(null).intValue());
        }
    }

    private o9(u9 u9Var) {
        this(u9Var, null);
    }

    private o9(u9 u9Var, j5 j5Var) {
        this.j = false;
        com.google.android.gms.common.internal.u.a(u9Var);
        this.i = j5.a(u9Var.a, (com.google.android.gms.internal.measurement.zzv) null);
        this.x = -1L;
        v9 v9Var = new v9(this);
        v9Var.s();
        this.g = v9Var;
        j4 j4Var = new j4(this);
        j4Var.s();
        this.b = j4Var;
        d5 d5Var = new d5(this);
        d5Var.s();
        this.a = d5Var;
        this.i.g().a(new r9(this, u9Var));
    }

    private final long A() {
        long a2 = this.i.h().a();
        s4 q = this.i.q();
        q.o();
        q.c();
        long a3 = q.i.a();
        if (a3 == 0) {
            a3 = 1 + q.i().u().nextInt(86400000);
            q.i.a(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    private final boolean B() {
        z();
        p();
        return f().E() || !TextUtils.isEmpty(f().w());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void C() {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o9.C():void");
    }

    private final int a(FileChannel fileChannel) {
        z();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.i.k().t().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                this.i.k().w().a("Unexpected data length. Bytes read", Integer.valueOf(read));
            }
            return 0;
        } catch (IOException e) {
            this.i.k().t().a("Failed to read from channel", e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.e5 a(com.google.android.gms.measurement.internal.zzm r9, com.google.android.gms.measurement.internal.e5 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o9.a(com.google.android.gms.measurement.internal.zzm, com.google.android.gms.measurement.internal.e5, java.lang.String):com.google.android.gms.measurement.internal.e5");
    }

    public static o9 a(Context context) {
        com.google.android.gms.common.internal.u.a(context);
        com.google.android.gms.common.internal.u.a(context.getApplicationContext());
        if (y == null) {
            synchronized (o9.class) {
                if (y == null) {
                    y = new o9(new u9(context));
                }
            }
        }
        return y;
    }

    private final zzm a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3, String str4) {
        String str5;
        String str6;
        int i;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.i.k().t().a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str5 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.i.k().t().a("Error retrieving installer package name. appId", f4.a(str));
            str5 = "Unknown";
        }
        if (str5 == null) {
            str5 = "manual_install";
        } else if ("com.android.vending".equals(str5)) {
            str5 = "";
        }
        String str7 = str5;
        try {
            PackageInfo b = ep.a(context).b(str, 0);
            if (b != null) {
                CharSequence b2 = ep.a(context).b(str);
                if (!TextUtils.isEmpty(b2)) {
                    b2.toString();
                }
                str6 = b.versionName;
                i = b.versionCode;
            } else {
                str6 = "Unknown";
                i = Integer.MIN_VALUE;
            }
            return new zzm(str, str2, str6, i, str7, this.i.p().n(), this.i.w().a(context, str), (String) null, z, false, "", 0L, j, 0, z2, z3, false, str3, (Boolean) null, 0L, (List<String>) null, (bb.a() && this.i.p().e(str, o.G0)) ? str4 : null);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.i.k().t().a("Error retrieving newly installed package info. appId, appName", f4.a(str), "Unknown");
            return null;
        }
    }

    private final zzm a(String str) {
        e5 b = f().b(str);
        if (b == null || TextUtils.isEmpty(b.u())) {
            this.i.k().A().a("No app data available; dropping", str);
            return null;
        }
        Boolean b2 = b(b);
        if (b2 == null || b2.booleanValue()) {
            return new zzm(str, b.n(), b.u(), b.v(), b.w(), b.x(), b.y(), (String) null, b.A(), false, b.r(), b.f(), 0L, 0, b.g(), b.h(), false, b.o(), b.i(), b.z(), b.j(), (bb.a() && this.i.p().e(str, o.G0)) ? b.p() : null);
        }
        this.i.k().t().a("App version does not match; dropping. appId", f4.a(str));
        return null;
    }

    private static void a(t0.a aVar, int i, String str) {
        List<com.google.android.gms.internal.measurement.v0> zza = aVar.zza();
        for (int i2 = 0; i2 < zza.size(); i2++) {
            if ("_err".equals(zza.get(i2).p())) {
                return;
            }
        }
        v0.a y2 = com.google.android.gms.internal.measurement.v0.y();
        y2.a("_err");
        y2.a(Long.valueOf(i).longValue());
        com.google.android.gms.internal.measurement.v0 v0Var = (com.google.android.gms.internal.measurement.v0) ((com.google.android.gms.internal.measurement.o4) y2.i());
        v0.a y3 = com.google.android.gms.internal.measurement.v0.y();
        y3.a("_ev");
        y3.b(str);
        com.google.android.gms.internal.measurement.v0 v0Var2 = (com.google.android.gms.internal.measurement.v0) ((com.google.android.gms.internal.measurement.o4) y3.i());
        aVar.a(v0Var);
        aVar.a(v0Var2);
    }

    private static void a(t0.a aVar, String str) {
        List<com.google.android.gms.internal.measurement.v0> zza = aVar.zza();
        for (int i = 0; i < zza.size(); i++) {
            if (str.equals(zza.get(i).p())) {
                aVar.b(i);
                return;
            }
        }
    }

    private static void a(x0.a aVar) {
        aVar.b(Long.MAX_VALUE);
        aVar.c(Long.MIN_VALUE);
        for (int i = 0; i < aVar.n(); i++) {
            com.google.android.gms.internal.measurement.t0 b = aVar.b(i);
            if (b.s() < aVar.r()) {
                aVar.b(b.s());
            }
            if (b.s() > aVar.s()) {
                aVar.c(b.s());
            }
        }
    }

    private final void a(x0.a aVar, long j, boolean z) {
        String str = z ? "_se" : "_lte";
        w9 c = f().c(aVar.v(), str);
        w9 w9Var = (c == null || c.e == null) ? new w9(aVar.v(), "auto", str, this.i.h().a(), Long.valueOf(j)) : new w9(aVar.v(), "auto", str, this.i.h().a(), Long.valueOf(((Long) c.e).longValue() + j));
        b1.a x = com.google.android.gms.internal.measurement.b1.x();
        x.a(str);
        x.a(this.i.h().a());
        x.b(((Long) w9Var.e).longValue());
        com.google.android.gms.internal.measurement.b1 b1Var = (com.google.android.gms.internal.measurement.b1) ((com.google.android.gms.internal.measurement.o4) x.i());
        boolean z2 = false;
        int a2 = v9.a(aVar, str);
        if (a2 >= 0) {
            aVar.a(a2, b1Var);
            z2 = true;
        }
        if (!z2) {
            aVar.a(b1Var);
        }
        if (j > 0) {
            f().a(w9Var);
            String str2 = z ? "session-scoped" : "lifetime";
            if (com.google.android.gms.internal.measurement.ja.a() && this.i.p().e(aVar.v(), o.Y0)) {
                this.i.k().B().a("Updated engagement user property. scope, value", str2, w9Var.e);
            } else {
                this.i.k().A().a("Updated engagement user property. scope, value", str2, w9Var.e);
            }
        }
    }

    private final void a(e5 e5Var) {
        defpackage.c0 c0Var;
        z();
        if (bb.a() && this.i.p().e(e5Var.l(), o.G0)) {
            if (TextUtils.isEmpty(e5Var.n()) && TextUtils.isEmpty(e5Var.p()) && TextUtils.isEmpty(e5Var.o())) {
                a(e5Var.l(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(e5Var.n()) && TextUtils.isEmpty(e5Var.o())) {
            a(e5Var.l(), 204, null, null, null);
            return;
        }
        String a2 = this.i.p().a(e5Var);
        try {
            URL url = new URL(a2);
            this.i.k().B().a("Fetching remote configuration", e5Var.l());
            com.google.android.gms.internal.measurement.o0 a3 = c().a(e5Var.l());
            String b = c().b(e5Var.l());
            if (a3 == null || TextUtils.isEmpty(b)) {
                c0Var = null;
            } else {
                defpackage.c0 c0Var2 = new defpackage.c0();
                c0Var2.put("If-Modified-Since", b);
                c0Var = c0Var2;
            }
            this.q = true;
            j4 e = e();
            String l = e5Var.l();
            t9 t9Var = new t9(this);
            e.c();
            e.r();
            com.google.android.gms.common.internal.u.a(url);
            com.google.android.gms.common.internal.u.a(t9Var);
            e.g().b(new n4(e, l, url, null, c0Var, t9Var));
        } catch (MalformedURLException unused) {
            this.i.k().t().a("Failed to parse config URL. Not fetching. appId", f4.a(e5Var.l()), a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(u9 u9Var) {
        this.i.g().c();
        d dVar = new d(this);
        dVar.s();
        this.c = dVar;
        this.i.p().a(this.a);
        ca caVar = new ca(this);
        caVar.s();
        this.f = caVar;
        q7 q7Var = new q7(this);
        q7Var.s();
        this.h = q7Var;
        k9 k9Var = new k9(this);
        k9Var.s();
        this.e = k9Var;
        this.d = new q4(this);
        if (this.o != this.p) {
            this.i.k().t().a("Not all upload components initialized", Integer.valueOf(this.o), Integer.valueOf(this.p));
        }
        this.j = true;
    }

    private final boolean a(int i, FileChannel fileChannel) {
        z();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.i.k().t().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            if (this.i.p().a(o.T0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0L);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.i.k().t().a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.i.k().t().a("Failed to write to channel", e);
            return false;
        }
    }

    private final boolean a(t0.a aVar, t0.a aVar2) {
        com.google.android.gms.common.internal.u.a("_e".equals(aVar.p()));
        m();
        com.google.android.gms.internal.measurement.v0 a2 = v9.a((com.google.android.gms.internal.measurement.t0) ((com.google.android.gms.internal.measurement.o4) aVar.i()), "_sc");
        String r = a2 == null ? null : a2.r();
        m();
        com.google.android.gms.internal.measurement.v0 a3 = v9.a((com.google.android.gms.internal.measurement.t0) ((com.google.android.gms.internal.measurement.o4) aVar2.i()), "_pc");
        String r2 = a3 != null ? a3.r() : null;
        if (r2 == null || !r2.equals(r)) {
            return false;
        }
        b(aVar, aVar2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r4 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x012b, code lost:
    
        if (r9 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x012d, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x021a, code lost:
    
        if (r4 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0231, code lost:
    
        if (r9 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x025c, code lost:
    
        if (r9 == null) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0680 A[Catch: all -> 0x0f81, TryCatch #1 {all -> 0x0f81, blocks: (B:3:0x000b, B:21:0x0088, B:22:0x0260, B:24:0x0264, B:29:0x0272, B:30:0x0299, B:33:0x02ad, B:36:0x02d3, B:38:0x030c, B:43:0x0322, B:45:0x032c, B:48:0x0816, B:50:0x0354, B:53:0x036c, B:70:0x03cf, B:73:0x03d9, B:75:0x03e7, B:77:0x0438, B:78:0x0407, B:80:0x0416, B:88:0x0447, B:90:0x0475, B:91:0x04a1, B:93:0x04d5, B:94:0x04db, B:98:0x05a9, B:99:0x05b5, B:102:0x05bf, B:106:0x05e2, B:107:0x05d1, B:115:0x05e8, B:117:0x05f4, B:119:0x0600, B:124:0x064f, B:125:0x066c, B:127:0x0680, B:129:0x068a, B:132:0x069d, B:134:0x06b1, B:136:0x06bf, B:139:0x07a3, B:141:0x07ad, B:143:0x07b3, B:144:0x07c9, B:145:0x07cd, B:147:0x07e0, B:148:0x07f7, B:149:0x0800, B:157:0x06e6, B:159:0x06f6, B:162:0x070b, B:164:0x071e, B:166:0x072c, B:168:0x073a, B:170:0x0752, B:172:0x075e, B:175:0x0771, B:177:0x0785, B:179:0x0621, B:183:0x0635, B:185:0x063b, B:187:0x0646, B:195:0x04e7, B:197:0x051c, B:198:0x0539, B:200:0x053f, B:202:0x054d, B:204:0x0561, B:205:0x0556, B:213:0x0568, B:215:0x056f, B:216:0x058c, B:220:0x038e, B:223:0x0398, B:226:0x03a2, B:235:0x0832, B:237:0x0840, B:239:0x0849, B:241:0x087b, B:242:0x0851, B:244:0x085a, B:246:0x0860, B:248:0x086c, B:250:0x0876, B:258:0x0882, B:261:0x089a, B:262:0x08a2, B:264:0x08a8, B:269:0x08bf, B:270:0x08ca, B:272:0x08d0, B:274:0x08e2, B:278:0x08ef, B:280:0x08f5, B:283:0x0900, B:285:0x0914, B:286:0x0928, B:287:0x092c, B:288:0x0963, B:290:0x0975, B:292:0x0994, B:294:0x09a2, B:296:0x09a8, B:298:0x09b2, B:299:0x09e1, B:301:0x09e7, B:305:0x09f5, B:307:0x0a00, B:303:0x09fa, B:310:0x0a03, B:312:0x0a15, B:313:0x0a18, B:385:0x0a87, B:387:0x0aa2, B:388:0x0ab3, B:390:0x0ab7, B:392:0x0ac3, B:393:0x0acb, B:395:0x0acf, B:397:0x0ad7, B:398:0x0ae5, B:399:0x0af0, B:407:0x0b31, B:408:0x0b39, B:410:0x0b3f, B:414:0x0b51, B:416:0x0b55, B:420:0x0b8b, B:422:0x0ba1, B:425:0x0bd1, B:427:0x0be5, B:429:0x0c14, B:436:0x0c7f, B:438:0x0c90, B:440:0x0c94, B:442:0x0c98, B:444:0x0c9c, B:447:0x0cb0, B:449:0x0ccc, B:450:0x0cd5, B:457:0x0cf6, B:471:0x0c3a, B:474:0x0b63, B:476:0x0b67, B:478:0x0b71, B:480:0x0b75, B:499:0x0941, B:503:0x0946, B:505:0x0958, B:521:0x012d), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x07a3 A[Catch: all -> 0x0f81, TryCatch #1 {all -> 0x0f81, blocks: (B:3:0x000b, B:21:0x0088, B:22:0x0260, B:24:0x0264, B:29:0x0272, B:30:0x0299, B:33:0x02ad, B:36:0x02d3, B:38:0x030c, B:43:0x0322, B:45:0x032c, B:48:0x0816, B:50:0x0354, B:53:0x036c, B:70:0x03cf, B:73:0x03d9, B:75:0x03e7, B:77:0x0438, B:78:0x0407, B:80:0x0416, B:88:0x0447, B:90:0x0475, B:91:0x04a1, B:93:0x04d5, B:94:0x04db, B:98:0x05a9, B:99:0x05b5, B:102:0x05bf, B:106:0x05e2, B:107:0x05d1, B:115:0x05e8, B:117:0x05f4, B:119:0x0600, B:124:0x064f, B:125:0x066c, B:127:0x0680, B:129:0x068a, B:132:0x069d, B:134:0x06b1, B:136:0x06bf, B:139:0x07a3, B:141:0x07ad, B:143:0x07b3, B:144:0x07c9, B:145:0x07cd, B:147:0x07e0, B:148:0x07f7, B:149:0x0800, B:157:0x06e6, B:159:0x06f6, B:162:0x070b, B:164:0x071e, B:166:0x072c, B:168:0x073a, B:170:0x0752, B:172:0x075e, B:175:0x0771, B:177:0x0785, B:179:0x0621, B:183:0x0635, B:185:0x063b, B:187:0x0646, B:195:0x04e7, B:197:0x051c, B:198:0x0539, B:200:0x053f, B:202:0x054d, B:204:0x0561, B:205:0x0556, B:213:0x0568, B:215:0x056f, B:216:0x058c, B:220:0x038e, B:223:0x0398, B:226:0x03a2, B:235:0x0832, B:237:0x0840, B:239:0x0849, B:241:0x087b, B:242:0x0851, B:244:0x085a, B:246:0x0860, B:248:0x086c, B:250:0x0876, B:258:0x0882, B:261:0x089a, B:262:0x08a2, B:264:0x08a8, B:269:0x08bf, B:270:0x08ca, B:272:0x08d0, B:274:0x08e2, B:278:0x08ef, B:280:0x08f5, B:283:0x0900, B:285:0x0914, B:286:0x0928, B:287:0x092c, B:288:0x0963, B:290:0x0975, B:292:0x0994, B:294:0x09a2, B:296:0x09a8, B:298:0x09b2, B:299:0x09e1, B:301:0x09e7, B:305:0x09f5, B:307:0x0a00, B:303:0x09fa, B:310:0x0a03, B:312:0x0a15, B:313:0x0a18, B:385:0x0a87, B:387:0x0aa2, B:388:0x0ab3, B:390:0x0ab7, B:392:0x0ac3, B:393:0x0acb, B:395:0x0acf, B:397:0x0ad7, B:398:0x0ae5, B:399:0x0af0, B:407:0x0b31, B:408:0x0b39, B:410:0x0b3f, B:414:0x0b51, B:416:0x0b55, B:420:0x0b8b, B:422:0x0ba1, B:425:0x0bd1, B:427:0x0be5, B:429:0x0c14, B:436:0x0c7f, B:438:0x0c90, B:440:0x0c94, B:442:0x0c98, B:444:0x0c9c, B:447:0x0cb0, B:449:0x0ccc, B:450:0x0cd5, B:457:0x0cf6, B:471:0x0c3a, B:474:0x0b63, B:476:0x0b67, B:478:0x0b71, B:480:0x0b75, B:499:0x0941, B:503:0x0946, B:505:0x0958, B:521:0x012d), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x07b3 A[Catch: all -> 0x0f81, TryCatch #1 {all -> 0x0f81, blocks: (B:3:0x000b, B:21:0x0088, B:22:0x0260, B:24:0x0264, B:29:0x0272, B:30:0x0299, B:33:0x02ad, B:36:0x02d3, B:38:0x030c, B:43:0x0322, B:45:0x032c, B:48:0x0816, B:50:0x0354, B:53:0x036c, B:70:0x03cf, B:73:0x03d9, B:75:0x03e7, B:77:0x0438, B:78:0x0407, B:80:0x0416, B:88:0x0447, B:90:0x0475, B:91:0x04a1, B:93:0x04d5, B:94:0x04db, B:98:0x05a9, B:99:0x05b5, B:102:0x05bf, B:106:0x05e2, B:107:0x05d1, B:115:0x05e8, B:117:0x05f4, B:119:0x0600, B:124:0x064f, B:125:0x066c, B:127:0x0680, B:129:0x068a, B:132:0x069d, B:134:0x06b1, B:136:0x06bf, B:139:0x07a3, B:141:0x07ad, B:143:0x07b3, B:144:0x07c9, B:145:0x07cd, B:147:0x07e0, B:148:0x07f7, B:149:0x0800, B:157:0x06e6, B:159:0x06f6, B:162:0x070b, B:164:0x071e, B:166:0x072c, B:168:0x073a, B:170:0x0752, B:172:0x075e, B:175:0x0771, B:177:0x0785, B:179:0x0621, B:183:0x0635, B:185:0x063b, B:187:0x0646, B:195:0x04e7, B:197:0x051c, B:198:0x0539, B:200:0x053f, B:202:0x054d, B:204:0x0561, B:205:0x0556, B:213:0x0568, B:215:0x056f, B:216:0x058c, B:220:0x038e, B:223:0x0398, B:226:0x03a2, B:235:0x0832, B:237:0x0840, B:239:0x0849, B:241:0x087b, B:242:0x0851, B:244:0x085a, B:246:0x0860, B:248:0x086c, B:250:0x0876, B:258:0x0882, B:261:0x089a, B:262:0x08a2, B:264:0x08a8, B:269:0x08bf, B:270:0x08ca, B:272:0x08d0, B:274:0x08e2, B:278:0x08ef, B:280:0x08f5, B:283:0x0900, B:285:0x0914, B:286:0x0928, B:287:0x092c, B:288:0x0963, B:290:0x0975, B:292:0x0994, B:294:0x09a2, B:296:0x09a8, B:298:0x09b2, B:299:0x09e1, B:301:0x09e7, B:305:0x09f5, B:307:0x0a00, B:303:0x09fa, B:310:0x0a03, B:312:0x0a15, B:313:0x0a18, B:385:0x0a87, B:387:0x0aa2, B:388:0x0ab3, B:390:0x0ab7, B:392:0x0ac3, B:393:0x0acb, B:395:0x0acf, B:397:0x0ad7, B:398:0x0ae5, B:399:0x0af0, B:407:0x0b31, B:408:0x0b39, B:410:0x0b3f, B:414:0x0b51, B:416:0x0b55, B:420:0x0b8b, B:422:0x0ba1, B:425:0x0bd1, B:427:0x0be5, B:429:0x0c14, B:436:0x0c7f, B:438:0x0c90, B:440:0x0c94, B:442:0x0c98, B:444:0x0c9c, B:447:0x0cb0, B:449:0x0ccc, B:450:0x0cd5, B:457:0x0cf6, B:471:0x0c3a, B:474:0x0b63, B:476:0x0b67, B:478:0x0b71, B:480:0x0b75, B:499:0x0941, B:503:0x0946, B:505:0x0958, B:521:0x012d), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07cd A[Catch: all -> 0x0f81, TryCatch #1 {all -> 0x0f81, blocks: (B:3:0x000b, B:21:0x0088, B:22:0x0260, B:24:0x0264, B:29:0x0272, B:30:0x0299, B:33:0x02ad, B:36:0x02d3, B:38:0x030c, B:43:0x0322, B:45:0x032c, B:48:0x0816, B:50:0x0354, B:53:0x036c, B:70:0x03cf, B:73:0x03d9, B:75:0x03e7, B:77:0x0438, B:78:0x0407, B:80:0x0416, B:88:0x0447, B:90:0x0475, B:91:0x04a1, B:93:0x04d5, B:94:0x04db, B:98:0x05a9, B:99:0x05b5, B:102:0x05bf, B:106:0x05e2, B:107:0x05d1, B:115:0x05e8, B:117:0x05f4, B:119:0x0600, B:124:0x064f, B:125:0x066c, B:127:0x0680, B:129:0x068a, B:132:0x069d, B:134:0x06b1, B:136:0x06bf, B:139:0x07a3, B:141:0x07ad, B:143:0x07b3, B:144:0x07c9, B:145:0x07cd, B:147:0x07e0, B:148:0x07f7, B:149:0x0800, B:157:0x06e6, B:159:0x06f6, B:162:0x070b, B:164:0x071e, B:166:0x072c, B:168:0x073a, B:170:0x0752, B:172:0x075e, B:175:0x0771, B:177:0x0785, B:179:0x0621, B:183:0x0635, B:185:0x063b, B:187:0x0646, B:195:0x04e7, B:197:0x051c, B:198:0x0539, B:200:0x053f, B:202:0x054d, B:204:0x0561, B:205:0x0556, B:213:0x0568, B:215:0x056f, B:216:0x058c, B:220:0x038e, B:223:0x0398, B:226:0x03a2, B:235:0x0832, B:237:0x0840, B:239:0x0849, B:241:0x087b, B:242:0x0851, B:244:0x085a, B:246:0x0860, B:248:0x086c, B:250:0x0876, B:258:0x0882, B:261:0x089a, B:262:0x08a2, B:264:0x08a8, B:269:0x08bf, B:270:0x08ca, B:272:0x08d0, B:274:0x08e2, B:278:0x08ef, B:280:0x08f5, B:283:0x0900, B:285:0x0914, B:286:0x0928, B:287:0x092c, B:288:0x0963, B:290:0x0975, B:292:0x0994, B:294:0x09a2, B:296:0x09a8, B:298:0x09b2, B:299:0x09e1, B:301:0x09e7, B:305:0x09f5, B:307:0x0a00, B:303:0x09fa, B:310:0x0a03, B:312:0x0a15, B:313:0x0a18, B:385:0x0a87, B:387:0x0aa2, B:388:0x0ab3, B:390:0x0ab7, B:392:0x0ac3, B:393:0x0acb, B:395:0x0acf, B:397:0x0ad7, B:398:0x0ae5, B:399:0x0af0, B:407:0x0b31, B:408:0x0b39, B:410:0x0b3f, B:414:0x0b51, B:416:0x0b55, B:420:0x0b8b, B:422:0x0ba1, B:425:0x0bd1, B:427:0x0be5, B:429:0x0c14, B:436:0x0c7f, B:438:0x0c90, B:440:0x0c94, B:442:0x0c98, B:444:0x0c9c, B:447:0x0cb0, B:449:0x0ccc, B:450:0x0cd5, B:457:0x0cf6, B:471:0x0c3a, B:474:0x0b63, B:476:0x0b67, B:478:0x0b71, B:480:0x0b75, B:499:0x0941, B:503:0x0946, B:505:0x0958, B:521:0x012d), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0264 A[Catch: all -> 0x0f81, TryCatch #1 {all -> 0x0f81, blocks: (B:3:0x000b, B:21:0x0088, B:22:0x0260, B:24:0x0264, B:29:0x0272, B:30:0x0299, B:33:0x02ad, B:36:0x02d3, B:38:0x030c, B:43:0x0322, B:45:0x032c, B:48:0x0816, B:50:0x0354, B:53:0x036c, B:70:0x03cf, B:73:0x03d9, B:75:0x03e7, B:77:0x0438, B:78:0x0407, B:80:0x0416, B:88:0x0447, B:90:0x0475, B:91:0x04a1, B:93:0x04d5, B:94:0x04db, B:98:0x05a9, B:99:0x05b5, B:102:0x05bf, B:106:0x05e2, B:107:0x05d1, B:115:0x05e8, B:117:0x05f4, B:119:0x0600, B:124:0x064f, B:125:0x066c, B:127:0x0680, B:129:0x068a, B:132:0x069d, B:134:0x06b1, B:136:0x06bf, B:139:0x07a3, B:141:0x07ad, B:143:0x07b3, B:144:0x07c9, B:145:0x07cd, B:147:0x07e0, B:148:0x07f7, B:149:0x0800, B:157:0x06e6, B:159:0x06f6, B:162:0x070b, B:164:0x071e, B:166:0x072c, B:168:0x073a, B:170:0x0752, B:172:0x075e, B:175:0x0771, B:177:0x0785, B:179:0x0621, B:183:0x0635, B:185:0x063b, B:187:0x0646, B:195:0x04e7, B:197:0x051c, B:198:0x0539, B:200:0x053f, B:202:0x054d, B:204:0x0561, B:205:0x0556, B:213:0x0568, B:215:0x056f, B:216:0x058c, B:220:0x038e, B:223:0x0398, B:226:0x03a2, B:235:0x0832, B:237:0x0840, B:239:0x0849, B:241:0x087b, B:242:0x0851, B:244:0x085a, B:246:0x0860, B:248:0x086c, B:250:0x0876, B:258:0x0882, B:261:0x089a, B:262:0x08a2, B:264:0x08a8, B:269:0x08bf, B:270:0x08ca, B:272:0x08d0, B:274:0x08e2, B:278:0x08ef, B:280:0x08f5, B:283:0x0900, B:285:0x0914, B:286:0x0928, B:287:0x092c, B:288:0x0963, B:290:0x0975, B:292:0x0994, B:294:0x09a2, B:296:0x09a8, B:298:0x09b2, B:299:0x09e1, B:301:0x09e7, B:305:0x09f5, B:307:0x0a00, B:303:0x09fa, B:310:0x0a03, B:312:0x0a15, B:313:0x0a18, B:385:0x0a87, B:387:0x0aa2, B:388:0x0ab3, B:390:0x0ab7, B:392:0x0ac3, B:393:0x0acb, B:395:0x0acf, B:397:0x0ad7, B:398:0x0ae5, B:399:0x0af0, B:407:0x0b31, B:408:0x0b39, B:410:0x0b3f, B:414:0x0b51, B:416:0x0b55, B:420:0x0b8b, B:422:0x0ba1, B:425:0x0bd1, B:427:0x0be5, B:429:0x0c14, B:436:0x0c7f, B:438:0x0c90, B:440:0x0c94, B:442:0x0c98, B:444:0x0c9c, B:447:0x0cb0, B:449:0x0ccc, B:450:0x0cd5, B:457:0x0cf6, B:471:0x0c3a, B:474:0x0b63, B:476:0x0b67, B:478:0x0b71, B:480:0x0b75, B:499:0x0941, B:503:0x0946, B:505:0x0958, B:521:0x012d), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0272 A[Catch: all -> 0x0f81, TryCatch #1 {all -> 0x0f81, blocks: (B:3:0x000b, B:21:0x0088, B:22:0x0260, B:24:0x0264, B:29:0x0272, B:30:0x0299, B:33:0x02ad, B:36:0x02d3, B:38:0x030c, B:43:0x0322, B:45:0x032c, B:48:0x0816, B:50:0x0354, B:53:0x036c, B:70:0x03cf, B:73:0x03d9, B:75:0x03e7, B:77:0x0438, B:78:0x0407, B:80:0x0416, B:88:0x0447, B:90:0x0475, B:91:0x04a1, B:93:0x04d5, B:94:0x04db, B:98:0x05a9, B:99:0x05b5, B:102:0x05bf, B:106:0x05e2, B:107:0x05d1, B:115:0x05e8, B:117:0x05f4, B:119:0x0600, B:124:0x064f, B:125:0x066c, B:127:0x0680, B:129:0x068a, B:132:0x069d, B:134:0x06b1, B:136:0x06bf, B:139:0x07a3, B:141:0x07ad, B:143:0x07b3, B:144:0x07c9, B:145:0x07cd, B:147:0x07e0, B:148:0x07f7, B:149:0x0800, B:157:0x06e6, B:159:0x06f6, B:162:0x070b, B:164:0x071e, B:166:0x072c, B:168:0x073a, B:170:0x0752, B:172:0x075e, B:175:0x0771, B:177:0x0785, B:179:0x0621, B:183:0x0635, B:185:0x063b, B:187:0x0646, B:195:0x04e7, B:197:0x051c, B:198:0x0539, B:200:0x053f, B:202:0x054d, B:204:0x0561, B:205:0x0556, B:213:0x0568, B:215:0x056f, B:216:0x058c, B:220:0x038e, B:223:0x0398, B:226:0x03a2, B:235:0x0832, B:237:0x0840, B:239:0x0849, B:241:0x087b, B:242:0x0851, B:244:0x085a, B:246:0x0860, B:248:0x086c, B:250:0x0876, B:258:0x0882, B:261:0x089a, B:262:0x08a2, B:264:0x08a8, B:269:0x08bf, B:270:0x08ca, B:272:0x08d0, B:274:0x08e2, B:278:0x08ef, B:280:0x08f5, B:283:0x0900, B:285:0x0914, B:286:0x0928, B:287:0x092c, B:288:0x0963, B:290:0x0975, B:292:0x0994, B:294:0x09a2, B:296:0x09a8, B:298:0x09b2, B:299:0x09e1, B:301:0x09e7, B:305:0x09f5, B:307:0x0a00, B:303:0x09fa, B:310:0x0a03, B:312:0x0a15, B:313:0x0a18, B:385:0x0a87, B:387:0x0aa2, B:388:0x0ab3, B:390:0x0ab7, B:392:0x0ac3, B:393:0x0acb, B:395:0x0acf, B:397:0x0ad7, B:398:0x0ae5, B:399:0x0af0, B:407:0x0b31, B:408:0x0b39, B:410:0x0b3f, B:414:0x0b51, B:416:0x0b55, B:420:0x0b8b, B:422:0x0ba1, B:425:0x0bd1, B:427:0x0be5, B:429:0x0c14, B:436:0x0c7f, B:438:0x0c90, B:440:0x0c94, B:442:0x0c98, B:444:0x0c9c, B:447:0x0cb0, B:449:0x0ccc, B:450:0x0cd5, B:457:0x0cf6, B:471:0x0c3a, B:474:0x0b63, B:476:0x0b67, B:478:0x0b71, B:480:0x0b75, B:499:0x0941, B:503:0x0946, B:505:0x0958, B:521:0x012d), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0f64  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x011a A[Catch: all -> 0x0235, SQLiteException -> 0x0239, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0239, all -> 0x0235, blocks: (B:517:0x00ee, B:519:0x011a, B:522:0x0132, B:524:0x0136, B:525:0x0147, B:527:0x014d, B:528:0x015e, B:530:0x016a, B:531:0x018c, B:554:0x017f, B:558:0x0220), top: B:516:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0132 A[Catch: all -> 0x0235, SQLiteException -> 0x0239, TRY_ENTER, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0239, all -> 0x0235, blocks: (B:517:0x00ee, B:519:0x011a, B:522:0x0132, B:524:0x0136, B:525:0x0147, B:527:0x014d, B:528:0x015e, B:530:0x016a, B:531:0x018c, B:554:0x017f, B:558:0x0220), top: B:516:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0f7b A[Catch: all -> 0x0f7f, TRY_ENTER, TryCatch #14 {all -> 0x0f7f, blocks: (B:317:0x0dc3, B:319:0x0dd5, B:320:0x0dd8, B:322:0x0de8, B:323:0x0e5d, B:325:0x0e63, B:327:0x0e78, B:330:0x0e7f, B:331:0x0eb2, B:332:0x0e87, B:334:0x0e93, B:335:0x0e99, B:336:0x0ec3, B:337:0x0eda, B:340:0x0ee2, B:342:0x0ee7, B:345:0x0ef7, B:347:0x0f11, B:348:0x0f2a, B:350:0x0f32, B:351:0x0f54, B:358:0x0f43, B:359:0x0e02, B:361:0x0e08, B:363:0x0e12, B:364:0x0e19, B:369:0x0e29, B:370:0x0e30, B:372:0x0e4f, B:373:0x0e56, B:374:0x0e53, B:375:0x0e2d, B:377:0x0e16, B:508:0x0f65, B:570:0x0f7b, B:571:0x0f7e), top: B:5:0x0025, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:572:? A[Catch: all -> 0x0f7f, SYNTHETIC, TRY_LEAVE, TryCatch #14 {all -> 0x0f7f, blocks: (B:317:0x0dc3, B:319:0x0dd5, B:320:0x0dd8, B:322:0x0de8, B:323:0x0e5d, B:325:0x0e63, B:327:0x0e78, B:330:0x0e7f, B:331:0x0eb2, B:332:0x0e87, B:334:0x0e93, B:335:0x0e99, B:336:0x0ec3, B:337:0x0eda, B:340:0x0ee2, B:342:0x0ee7, B:345:0x0ef7, B:347:0x0f11, B:348:0x0f2a, B:350:0x0f32, B:351:0x0f54, B:358:0x0f43, B:359:0x0e02, B:361:0x0e08, B:363:0x0e12, B:364:0x0e19, B:369:0x0e29, B:370:0x0e30, B:372:0x0e4f, B:373:0x0e56, B:374:0x0e53, B:375:0x0e2d, B:377:0x0e16, B:508:0x0f65, B:570:0x0f7b, B:571:0x0f7e), top: B:5:0x0025, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05a9 A[Catch: all -> 0x0f81, TryCatch #1 {all -> 0x0f81, blocks: (B:3:0x000b, B:21:0x0088, B:22:0x0260, B:24:0x0264, B:29:0x0272, B:30:0x0299, B:33:0x02ad, B:36:0x02d3, B:38:0x030c, B:43:0x0322, B:45:0x032c, B:48:0x0816, B:50:0x0354, B:53:0x036c, B:70:0x03cf, B:73:0x03d9, B:75:0x03e7, B:77:0x0438, B:78:0x0407, B:80:0x0416, B:88:0x0447, B:90:0x0475, B:91:0x04a1, B:93:0x04d5, B:94:0x04db, B:98:0x05a9, B:99:0x05b5, B:102:0x05bf, B:106:0x05e2, B:107:0x05d1, B:115:0x05e8, B:117:0x05f4, B:119:0x0600, B:124:0x064f, B:125:0x066c, B:127:0x0680, B:129:0x068a, B:132:0x069d, B:134:0x06b1, B:136:0x06bf, B:139:0x07a3, B:141:0x07ad, B:143:0x07b3, B:144:0x07c9, B:145:0x07cd, B:147:0x07e0, B:148:0x07f7, B:149:0x0800, B:157:0x06e6, B:159:0x06f6, B:162:0x070b, B:164:0x071e, B:166:0x072c, B:168:0x073a, B:170:0x0752, B:172:0x075e, B:175:0x0771, B:177:0x0785, B:179:0x0621, B:183:0x0635, B:185:0x063b, B:187:0x0646, B:195:0x04e7, B:197:0x051c, B:198:0x0539, B:200:0x053f, B:202:0x054d, B:204:0x0561, B:205:0x0556, B:213:0x0568, B:215:0x056f, B:216:0x058c, B:220:0x038e, B:223:0x0398, B:226:0x03a2, B:235:0x0832, B:237:0x0840, B:239:0x0849, B:241:0x087b, B:242:0x0851, B:244:0x085a, B:246:0x0860, B:248:0x086c, B:250:0x0876, B:258:0x0882, B:261:0x089a, B:262:0x08a2, B:264:0x08a8, B:269:0x08bf, B:270:0x08ca, B:272:0x08d0, B:274:0x08e2, B:278:0x08ef, B:280:0x08f5, B:283:0x0900, B:285:0x0914, B:286:0x0928, B:287:0x092c, B:288:0x0963, B:290:0x0975, B:292:0x0994, B:294:0x09a2, B:296:0x09a8, B:298:0x09b2, B:299:0x09e1, B:301:0x09e7, B:305:0x09f5, B:307:0x0a00, B:303:0x09fa, B:310:0x0a03, B:312:0x0a15, B:313:0x0a18, B:385:0x0a87, B:387:0x0aa2, B:388:0x0ab3, B:390:0x0ab7, B:392:0x0ac3, B:393:0x0acb, B:395:0x0acf, B:397:0x0ad7, B:398:0x0ae5, B:399:0x0af0, B:407:0x0b31, B:408:0x0b39, B:410:0x0b3f, B:414:0x0b51, B:416:0x0b55, B:420:0x0b8b, B:422:0x0ba1, B:425:0x0bd1, B:427:0x0be5, B:429:0x0c14, B:436:0x0c7f, B:438:0x0c90, B:440:0x0c94, B:442:0x0c98, B:444:0x0c9c, B:447:0x0cb0, B:449:0x0ccc, B:450:0x0cd5, B:457:0x0cf6, B:471:0x0c3a, B:474:0x0b63, B:476:0x0b67, B:478:0x0b71, B:480:0x0b75, B:499:0x0941, B:503:0x0946, B:505:0x0958, B:521:0x012d), top: B:2:0x000b }] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r14v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v40, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r9v130 */
    /* JADX WARN: Type inference failed for: r9v131 */
    /* JADX WARN: Type inference failed for: r9v133 */
    /* JADX WARN: Type inference failed for: r9v134 */
    /* JADX WARN: Type inference failed for: r9v144 */
    /* JADX WARN: Type inference failed for: r9v145 */
    /* JADX WARN: Type inference failed for: r9v146 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean a(java.lang.String r61, long r62) {
        /*
            Method dump skipped, instructions count: 3982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o9.a(java.lang.String, long):boolean");
    }

    private final Boolean b(e5 e5Var) {
        try {
            if (e5Var.v() != -2147483648L) {
                if (e5Var.v() == ep.a(this.i.l()).b(e5Var.l(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = ep.a(this.i.l()).b(e5Var.l(), 0).versionName;
                if (e5Var.u() != null && e5Var.u().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void b(t0.a aVar, t0.a aVar2) {
        com.google.android.gms.common.internal.u.a("_e".equals(aVar.p()));
        m();
        com.google.android.gms.internal.measurement.v0 a2 = v9.a((com.google.android.gms.internal.measurement.t0) ((com.google.android.gms.internal.measurement.o4) aVar.i()), "_et");
        if (!a2.s() || a2.t() <= 0) {
            return;
        }
        long t = a2.t();
        m();
        com.google.android.gms.internal.measurement.v0 a3 = v9.a((com.google.android.gms.internal.measurement.t0) ((com.google.android.gms.internal.measurement.o4) aVar2.i()), "_et");
        if (a3 != null && a3.t() > 0) {
            t += a3.t();
        }
        m();
        v9.a(aVar2, "_et", Long.valueOf(t));
        m();
        v9.a(aVar, "_fr", (Object) 1L);
    }

    private static void b(p9 p9Var) {
        if (p9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (p9Var.q()) {
            return;
        }
        String valueOf = String.valueOf(p9Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:244|(1:246)(1:270)|247|(8:252|253|254|(1:256)|257|(0)|43|(0)(0))|262|263|264|265|253|254|(0)|257|(0)|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x084f, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x023a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x023c, code lost:
    
        r7.k().t().a("Error pruning currencies. appId", com.google.android.gms.measurement.internal.f4.a(r15), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x063a A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0654 A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x066f A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x073a A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0754 A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07c5 A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07d6 A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x07ee A[Catch: all -> 0x091f, TRY_LEAVE, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0835 A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0894 A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x08bd A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06a6 A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06bc A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06d6 A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0271 A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02a8 A[Catch: all -> 0x091f, TRY_LEAVE, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f6 A[Catch: all -> 0x091f, TryCatch #2 {all -> 0x091f, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b7, B:45:0x02f6, B:47:0x02fb, B:48:0x0314, B:52:0x0325, B:54:0x033a, B:56:0x0341, B:57:0x035a, B:61:0x037d, B:65:0x03a5, B:66:0x03be, B:69:0x03ce, B:72:0x03f1, B:73:0x040f, B:76:0x0419, B:78:0x0429, B:80:0x0435, B:82:0x043b, B:83:0x0446, B:85:0x044e, B:87:0x045e, B:89:0x046e, B:90:0x0479, B:92:0x0485, B:93:0x049c, B:95:0x04c9, B:98:0x04d9, B:101:0x0515, B:102:0x053d, B:104:0x0575, B:105:0x057a, B:107:0x0582, B:108:0x0587, B:110:0x058f, B:111:0x0594, B:113:0x059d, B:114:0x05a3, B:116:0x05b0, B:117:0x05b5, B:119:0x05bb, B:121:0x05cb, B:123:0x05d5, B:125:0x05dd, B:126:0x05e2, B:128:0x05ec, B:130:0x05f6, B:132:0x05fe, B:133:0x0600, B:134:0x0632, B:136:0x063a, B:137:0x063f, B:139:0x0654, B:141:0x065e, B:142:0x0661, B:144:0x066f, B:146:0x0679, B:148:0x067d, B:150:0x0688, B:151:0x06f6, B:153:0x073a, B:155:0x0743, B:156:0x0748, B:158:0x0754, B:159:0x07bb, B:161:0x07c5, B:162:0x07cc, B:164:0x07d6, B:165:0x07dd, B:166:0x07e8, B:168:0x07ee, B:171:0x081d, B:172:0x082d, B:174:0x0835, B:175:0x083b, B:177:0x0841, B:182:0x088e, B:184:0x0894, B:185:0x08b0, B:187:0x08bd, B:191:0x08cd, B:193:0x08da, B:195:0x0854, B:197:0x0879, B:203:0x0898, B:204:0x0694, B:206:0x06a6, B:208:0x06aa, B:210:0x06bc, B:211:0x06f3, B:212:0x06d6, B:214:0x06dc, B:215:0x0604, B:217:0x0612, B:219:0x061c, B:221:0x0624, B:222:0x0627, B:224:0x062f, B:225:0x052f, B:228:0x0125, B:231:0x0137, B:233:0x014e, B:239:0x016a, B:240:0x0196, B:242:0x019c, B:244:0x01aa, B:246:0x01b6, B:247:0x01c0, B:249:0x01cb, B:252:0x01d2, B:254:0x0267, B:256:0x0271, B:259:0x02a8, B:262:0x0201, B:264:0x021f, B:265:0x024d, B:269:0x023c, B:270:0x01bb, B:272:0x016f, B:273:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(com.google.android.gms.measurement.internal.zzan r28, com.google.android.gms.measurement.internal.zzm r29) {
        /*
            Method dump skipped, instructions count: 2347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o9.b(com.google.android.gms.measurement.internal.zzan, com.google.android.gms.measurement.internal.zzm):void");
    }

    private final boolean e(zzm zzmVar) {
        return (bb.a() && this.i.p().e(zzmVar.b, o.G0)) ? (TextUtils.isEmpty(zzmVar.c) && TextUtils.isEmpty(zzmVar.w) && TextUtils.isEmpty(zzmVar.s)) ? false : true : (TextUtils.isEmpty(zzmVar.c) && TextUtils.isEmpty(zzmVar.s)) ? false : true;
    }

    private final void u() {
        z();
        if (this.q || this.r || this.s) {
            this.i.k().B().a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s));
            return;
        }
        this.i.k().B().a("Stopping uploading service(s)");
        List<Runnable> list = this.n;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.n.clear();
    }

    private final boolean v() {
        h4 w;
        String str;
        FileLock fileLock;
        z();
        if (this.i.p().a(o.E0) && (fileLock = this.t) != null && fileLock.isValid()) {
            this.i.k().B().a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.i.l().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.u = channel;
            FileLock tryLock = channel.tryLock();
            this.t = tryLock;
            if (tryLock != null) {
                this.i.k().B().a("Storage concurrent access okay");
                return true;
            }
            this.i.k().t().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            w = this.i.k().t();
            str = "Failed to acquire storage lock";
            w.a(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            w = this.i.k().t();
            str = "Failed to access storage lock file";
            w.a(str, e);
            return false;
        } catch (OverlappingFileLockException e3) {
            e = e3;
            w = this.i.k().w();
            str = "Storage lock already acquired";
            w.a(str, e);
            return false;
        }
    }

    private final boolean w() {
        z();
        p();
        return this.k;
    }

    private final q4 x() {
        q4 q4Var = this.d;
        if (q4Var != null) {
            return q4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final k9 y() {
        b(this.e);
        return this.e;
    }

    private final void z() {
        this.i.g().c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        this.i.g().c();
        f().B();
        if (this.i.q().e.a() == 0) {
            this.i.q().e.a(this.i.h().a());
        }
        C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0158, code lost:
    
        r8.i.q().g.a(r8.i.h().a());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9, java.lang.Throwable r10, byte[] r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o9.a(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(p9 p9Var) {
        this.o++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(zzan zzanVar, zzm zzmVar) {
        List<zzv> a2;
        List<zzv> a3;
        List<zzv> a4;
        h4 t;
        String str;
        Object a5;
        String c;
        Object obj;
        List<String> list;
        zzan zzanVar2 = zzanVar;
        com.google.android.gms.common.internal.u.a(zzmVar);
        com.google.android.gms.common.internal.u.b(zzmVar.b);
        z();
        p();
        String str2 = zzmVar.b;
        long j = zzanVar2.e;
        if (m().a(zzanVar2, zzmVar)) {
            if (!zzmVar.i) {
                c(zzmVar);
                return;
            }
            if (this.i.p().e(str2, o.k0) && (list = zzmVar.v) != null) {
                if (!list.contains(zzanVar2.b)) {
                    this.i.k().A().a("Dropping non-safelisted event. appId, event name, origin", str2, zzanVar2.b, zzanVar2.d);
                    return;
                } else {
                    Bundle zzb = zzanVar2.c.zzb();
                    zzb.putLong("ga_safelisted", 1L);
                    zzanVar2 = new zzan(zzanVar2.b, new zzam(zzb), zzanVar2.d, zzanVar2.e);
                }
            }
            f().y();
            try {
                d f = f();
                com.google.android.gms.common.internal.u.b(str2);
                f.c();
                f.r();
                if (j < 0) {
                    f.k().w().a("Invalid time querying timed out conditional properties", f4.a(str2), Long.valueOf(j));
                    a2 = Collections.emptyList();
                } else {
                    a2 = f.a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzv zzvVar : a2) {
                    if (zzvVar != null) {
                        if (com.google.android.gms.internal.measurement.ja.a() && this.i.p().e(zzmVar.b, o.Y0)) {
                            this.i.k().B().a("User property timed out", zzvVar.b, this.i.x().c(zzvVar.d.c), zzvVar.d.zza());
                        } else {
                            this.i.k().A().a("User property timed out", zzvVar.b, this.i.x().c(zzvVar.d.c), zzvVar.d.zza());
                        }
                        if (zzvVar.h != null) {
                            b(new zzan(zzvVar.h, j), zzmVar);
                        }
                        f().e(str2, zzvVar.d.c);
                    }
                }
                d f2 = f();
                com.google.android.gms.common.internal.u.b(str2);
                f2.c();
                f2.r();
                if (j < 0) {
                    f2.k().w().a("Invalid time querying expired conditional properties", f4.a(str2), Long.valueOf(j));
                    a3 = Collections.emptyList();
                } else {
                    a3 = f2.a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(a3.size());
                for (zzv zzvVar2 : a3) {
                    if (zzvVar2 != null) {
                        if (com.google.android.gms.internal.measurement.ja.a() && this.i.p().e(zzmVar.b, o.Y0)) {
                            this.i.k().B().a("User property expired", zzvVar2.b, this.i.x().c(zzvVar2.d.c), zzvVar2.d.zza());
                        } else {
                            this.i.k().A().a("User property expired", zzvVar2.b, this.i.x().c(zzvVar2.d.c), zzvVar2.d.zza());
                        }
                        f().b(str2, zzvVar2.d.c);
                        if (zzvVar2.l != null) {
                            arrayList.add(zzvVar2.l);
                        }
                        f().e(str2, zzvVar2.d.c);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    b(new zzan((zzan) obj2, j), zzmVar);
                }
                d f3 = f();
                String str3 = zzanVar2.b;
                com.google.android.gms.common.internal.u.b(str2);
                com.google.android.gms.common.internal.u.b(str3);
                f3.c();
                f3.r();
                if (j < 0) {
                    f3.k().w().a("Invalid time querying triggered conditional properties", f4.a(str2), f3.f().a(str3), Long.valueOf(j));
                    a4 = Collections.emptyList();
                } else {
                    a4 = f3.a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(a4.size());
                for (zzv zzvVar3 : a4) {
                    if (zzvVar3 != null) {
                        zzkq zzkqVar = zzvVar3.d;
                        w9 w9Var = new w9(zzvVar3.b, zzvVar3.c, zzkqVar.c, j, zzkqVar.zza());
                        if (f().a(w9Var)) {
                            str = "User property triggered";
                            if (com.google.android.gms.internal.measurement.ja.a() && this.i.p().e(zzmVar.b, o.Y0)) {
                                t = this.i.k().B();
                                a5 = zzvVar3.b;
                                c = this.i.x().c(w9Var.c);
                                obj = w9Var.e;
                            } else {
                                t = this.i.k().A();
                                a5 = zzvVar3.b;
                                c = this.i.x().c(w9Var.c);
                                obj = w9Var.e;
                            }
                        } else {
                            t = this.i.k().t();
                            str = "Too many active user properties, ignoring";
                            a5 = f4.a(zzvVar3.b);
                            c = this.i.x().c(w9Var.c);
                            obj = w9Var.e;
                        }
                        t.a(str, a5, c, obj);
                        if (zzvVar3.j != null) {
                            arrayList2.add(zzvVar3.j);
                        }
                        zzvVar3.d = new zzkq(w9Var);
                        zzvVar3.f = true;
                        f().a(zzvVar3);
                    }
                }
                b(zzanVar2, zzmVar);
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    b(new zzan((zzan) obj3, j), zzmVar);
                }
                f().u();
            } finally {
                f().z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(zzan zzanVar, String str) {
        e5 b = f().b(str);
        if (b == null || TextUtils.isEmpty(b.u())) {
            this.i.k().A().a("No app data available; dropping event", str);
            return;
        }
        Boolean b2 = b(b);
        if (b2 == null) {
            if (!"_ui".equals(zzanVar.b)) {
                this.i.k().w().a("Could not find package. appId", f4.a(str));
            }
        } else if (!b2.booleanValue()) {
            this.i.k().t().a("App version does not match; dropping event. appId", f4.a(str));
            return;
        }
        a(zzanVar, new zzm(str, b.n(), b.u(), b.v(), b.w(), b.x(), b.y(), (String) null, b.A(), false, b.r(), b.f(), 0L, 0, b.g(), b.h(), false, b.o(), b.i(), b.z(), b.j(), (bb.a() && this.i.p().e(b.l(), o.G0)) ? b.p() : null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(zzkq zzkqVar, zzm zzmVar) {
        k a2;
        z();
        p();
        if (e(zzmVar)) {
            if (!zzmVar.i) {
                c(zzmVar);
                return;
            }
            int b = this.i.w().b(zzkqVar.c);
            j5 j5Var = this.i;
            if (b != 0) {
                j5Var.w();
                String a3 = z9.a(zzkqVar.c, 24, true);
                String str = zzkqVar.c;
                this.i.w().a(zzmVar.b, b, "_ev", a3, str != null ? str.length() : 0);
                return;
            }
            int b2 = j5Var.w().b(zzkqVar.c, zzkqVar.zza());
            if (b2 != 0) {
                this.i.w();
                String a4 = z9.a(zzkqVar.c, 24, true);
                Object zza = zzkqVar.zza();
                this.i.w().a(zzmVar.b, b2, "_ev", a4, (zza == null || !((zza instanceof String) || (zza instanceof CharSequence))) ? 0 : String.valueOf(zza).length());
                return;
            }
            Object c = this.i.w().c(zzkqVar.c, zzkqVar.zza());
            if (c == null) {
                return;
            }
            if ("_sid".equals(zzkqVar.c) && this.i.p().e(zzmVar.b, o.Q)) {
                long j = zzkqVar.d;
                String str2 = zzkqVar.g;
                long j2 = 0;
                w9 c2 = f().c(zzmVar.b, "_sno");
                if (c2 != null) {
                    Object obj = c2.e;
                    if (obj instanceof Long) {
                        j2 = ((Long) obj).longValue();
                        a(new zzkq("_sno", j, Long.valueOf(j2 + 1), str2), zzmVar);
                    }
                }
                if (c2 != null) {
                    this.i.k().w().a("Retrieved last session number from database does not contain a valid (long) value", c2.e);
                }
                if (this.i.p().e(zzmVar.b, o.T) && (a2 = f().a(zzmVar.b, "_s")) != null) {
                    j2 = a2.c;
                    this.i.k().B().a("Backfill the session number. Last used session number", Long.valueOf(j2));
                }
                a(new zzkq("_sno", j, Long.valueOf(j2 + 1), str2), zzmVar);
            }
            w9 w9Var = new w9(zzmVar.b, zzkqVar.g, zzkqVar.c, zzkqVar.d, c);
            ((com.google.android.gms.internal.measurement.ja.a() && this.i.p().e(zzmVar.b, o.Y0)) ? this.i.k().B() : this.i.k().A()).a("Setting user property", this.i.x().c(w9Var.c), c);
            f().y();
            try {
                c(zzmVar);
                boolean a5 = f().a(w9Var);
                f().u();
                if (!a5) {
                    this.i.k().t().a("Too many unique user properties are set. Ignoring user property", this.i.x().c(w9Var.c), w9Var.e);
                    this.i.w().a(zzmVar.b, 9, (String) null, (String) null, 0);
                } else if (!com.google.android.gms.internal.measurement.ja.a() || !this.i.p().e(zzmVar.b, o.Y0)) {
                    this.i.k().A().a("User property set", this.i.x().c(w9Var.c), w9Var.e);
                }
            } finally {
                f().z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(zzm zzmVar) {
        if (this.v != null) {
            ArrayList arrayList = new ArrayList();
            this.w = arrayList;
            arrayList.addAll(this.v);
        }
        d f = f();
        String str = zzmVar.b;
        com.google.android.gms.common.internal.u.b(str);
        f.c();
        f.r();
        try {
            SQLiteDatabase v = f.v();
            String[] strArr = {str};
            int delete = v.delete("apps", "app_id=?", strArr) + 0 + v.delete("events", "app_id=?", strArr) + v.delete("user_attributes", "app_id=?", strArr) + v.delete("conditional_properties", "app_id=?", strArr) + v.delete("raw_events", "app_id=?", strArr) + v.delete("raw_events_metadata", "app_id=?", strArr) + v.delete("queue", "app_id=?", strArr) + v.delete("audience_filter_values", "app_id=?", strArr) + v.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                f.k().B().a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            f.k().t().a("Error resetting analytics data. appId, error", f4.a(str), e);
        }
        if (com.google.android.gms.internal.measurement.ca.a() && this.i.p().a(o.L0)) {
            if (zzmVar.i) {
                b(zzmVar);
            }
        } else {
            zzm a2 = a(this.i.l(), zzmVar.b, zzmVar.c, zzmVar.i, zzmVar.p, zzmVar.q, zzmVar.n, zzmVar.s, zzmVar.w);
            if (zzmVar.i) {
                b(a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(zzv zzvVar) {
        zzm a2 = a(zzvVar.b);
        if (a2 != null) {
            a(zzvVar, a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(zzv zzvVar, zzm zzmVar) {
        h4 t;
        String str;
        Object a2;
        String c;
        Object zza;
        h4 t2;
        String str2;
        Object a3;
        String c2;
        Object obj;
        com.google.android.gms.common.internal.u.a(zzvVar);
        com.google.android.gms.common.internal.u.b(zzvVar.b);
        com.google.android.gms.common.internal.u.a(zzvVar.c);
        com.google.android.gms.common.internal.u.a(zzvVar.d);
        com.google.android.gms.common.internal.u.b(zzvVar.d.c);
        z();
        p();
        if (e(zzmVar)) {
            if (!zzmVar.i) {
                c(zzmVar);
                return;
            }
            zzv zzvVar2 = new zzv(zzvVar);
            boolean z = false;
            zzvVar2.f = false;
            f().y();
            try {
                zzv d = f().d(zzvVar2.b, zzvVar2.d.c);
                if (d != null && !d.c.equals(zzvVar2.c)) {
                    this.i.k().w().a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.i.x().c(zzvVar2.d.c), zzvVar2.c, d.c);
                }
                if (d != null && d.f) {
                    zzvVar2.c = d.c;
                    zzvVar2.e = d.e;
                    zzvVar2.i = d.i;
                    zzvVar2.g = d.g;
                    zzvVar2.j = d.j;
                    zzvVar2.f = d.f;
                    zzvVar2.d = new zzkq(zzvVar2.d.c, d.d.d, zzvVar2.d.zza(), d.d.g);
                } else if (TextUtils.isEmpty(zzvVar2.g)) {
                    zzvVar2.d = new zzkq(zzvVar2.d.c, zzvVar2.e, zzvVar2.d.zza(), zzvVar2.d.g);
                    zzvVar2.f = true;
                    z = true;
                }
                if (zzvVar2.f) {
                    zzkq zzkqVar = zzvVar2.d;
                    w9 w9Var = new w9(zzvVar2.b, zzvVar2.c, zzkqVar.c, zzkqVar.d, zzkqVar.zza());
                    if (f().a(w9Var)) {
                        t2 = this.i.k().A();
                        str2 = "User property updated immediately";
                        a3 = zzvVar2.b;
                        c2 = this.i.x().c(w9Var.c);
                        obj = w9Var.e;
                    } else {
                        t2 = this.i.k().t();
                        str2 = "(2)Too many active user properties, ignoring";
                        a3 = f4.a(zzvVar2.b);
                        c2 = this.i.x().c(w9Var.c);
                        obj = w9Var.e;
                    }
                    t2.a(str2, a3, c2, obj);
                    if (z && zzvVar2.j != null) {
                        b(new zzan(zzvVar2.j, zzvVar2.e), zzmVar);
                    }
                }
                if (f().a(zzvVar2)) {
                    t = this.i.k().A();
                    str = "Conditional property added";
                    a2 = zzvVar2.b;
                    c = this.i.x().c(zzvVar2.d.c);
                    zza = zzvVar2.d.zza();
                } else {
                    t = this.i.k().t();
                    str = "Too many conditional properties, ignoring";
                    a2 = f4.a(zzvVar2.b);
                    c = this.i.x().c(zzvVar2.d.c);
                    zza = zzvVar2.d.zza();
                }
                t.a(str, a2, c, zza);
                f().u();
            } finally {
                f().z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        z();
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        r6.i.q().g.a(r6.i.h().a());
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:5:0x0029, B:12:0x0045, B:13:0x016d, B:24:0x0061, B:31:0x00b0, B:32:0x00c5, B:35:0x00cd, B:37:0x00d9, B:39:0x00df, B:43:0x00ec, B:46:0x011c, B:48:0x0132, B:49:0x015a, B:51:0x0164, B:53:0x016a, B:54:0x0142, B:55:0x0103, B:57:0x010d), top: B:4:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:5:0x0029, B:12:0x0045, B:13:0x016d, B:24:0x0061, B:31:0x00b0, B:32:0x00c5, B:35:0x00cd, B:37:0x00d9, B:39:0x00df, B:43:0x00ec, B:46:0x011c, B:48:0x0132, B:49:0x015a, B:51:0x0164, B:53:0x016a, B:54:0x0142, B:55:0x0103, B:57:0x010d), top: B:4:0x0029, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o9.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        C();
    }

    public final la b() {
        return this.i.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(zzkq zzkqVar, zzm zzmVar) {
        z();
        p();
        if (e(zzmVar)) {
            if (!zzmVar.i) {
                c(zzmVar);
                return;
            }
            if (!this.i.p().e(zzmVar.b, o.a0)) {
                this.i.k().A().a("Removing user property", this.i.x().c(zzkqVar.c));
                f().y();
                try {
                    c(zzmVar);
                    f().b(zzmVar.b, zzkqVar.c);
                    f().u();
                    this.i.k().A().a("User property removed", this.i.x().c(zzkqVar.c));
                    return;
                } finally {
                }
            }
            if ("_npa".equals(zzkqVar.c) && zzmVar.t != null) {
                this.i.k().A().a("Falling back to manifest metadata value for ad personalization");
                a(new zzkq("_npa", this.i.h().a(), Long.valueOf(zzmVar.t.booleanValue() ? 1L : 0L), "auto"), zzmVar);
                return;
            }
            this.i.k().A().a("Removing user property", this.i.x().c(zzkqVar.c));
            f().y();
            try {
                c(zzmVar);
                f().b(zzmVar.b, zzkqVar.c);
                f().u();
                this.i.k().A().a("User property removed", this.i.x().c(zzkqVar.c));
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x046b A[Catch: all -> 0x04cb, TryCatch #3 {all -> 0x04cb, blocks: (B:28:0x00af, B:30:0x00bf, B:32:0x00cd, B:34:0x00d7, B:36:0x00db, B:39:0x00ec, B:41:0x0104, B:43:0x012c, B:45:0x0138, B:47:0x014f, B:49:0x0177, B:51:0x01c1, B:55:0x01d4, B:57:0x01e8, B:59:0x01f3, B:62:0x0202, B:64:0x020a, B:66:0x0210, B:69:0x021f, B:71:0x0222, B:72:0x0246, B:74:0x024b, B:75:0x0253, B:77:0x0267, B:80:0x027b, B:82:0x029e, B:83:0x02ac, B:85:0x02df, B:86:0x02e7, B:88:0x02eb, B:89:0x02ee, B:91:0x030f, B:95:0x03e9, B:96:0x03ec, B:97:0x03fd, B:98:0x045b, B:100:0x046b, B:102:0x0485, B:103:0x048c, B:104:0x049d, B:105:0x04bc, B:110:0x0328, B:112:0x0353, B:114:0x035b, B:116:0x0365, B:121:0x037b, B:123:0x0385, B:126:0x0390, B:128:0x03a2, B:138:0x03b5, B:130:0x03cd, B:132:0x03d3, B:133:0x03d8, B:135:0x03de, B:145:0x033b, B:149:0x0404, B:151:0x043a, B:152:0x0442, B:154:0x0446, B:155:0x0449, B:157:0x04a1, B:159:0x04a5, B:162:0x025b, B:168:0x010e, B:172:0x0118), top: B:27:0x00af, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a1 A[Catch: all -> 0x04cb, TryCatch #3 {all -> 0x04cb, blocks: (B:28:0x00af, B:30:0x00bf, B:32:0x00cd, B:34:0x00d7, B:36:0x00db, B:39:0x00ec, B:41:0x0104, B:43:0x012c, B:45:0x0138, B:47:0x014f, B:49:0x0177, B:51:0x01c1, B:55:0x01d4, B:57:0x01e8, B:59:0x01f3, B:62:0x0202, B:64:0x020a, B:66:0x0210, B:69:0x021f, B:71:0x0222, B:72:0x0246, B:74:0x024b, B:75:0x0253, B:77:0x0267, B:80:0x027b, B:82:0x029e, B:83:0x02ac, B:85:0x02df, B:86:0x02e7, B:88:0x02eb, B:89:0x02ee, B:91:0x030f, B:95:0x03e9, B:96:0x03ec, B:97:0x03fd, B:98:0x045b, B:100:0x046b, B:102:0x0485, B:103:0x048c, B:104:0x049d, B:105:0x04bc, B:110:0x0328, B:112:0x0353, B:114:0x035b, B:116:0x0365, B:121:0x037b, B:123:0x0385, B:126:0x0390, B:128:0x03a2, B:138:0x03b5, B:130:0x03cd, B:132:0x03d3, B:133:0x03d8, B:135:0x03de, B:145:0x033b, B:149:0x0404, B:151:0x043a, B:152:0x0442, B:154:0x0446, B:155:0x0449, B:157:0x04a1, B:159:0x04a5, B:162:0x025b, B:168:0x010e, B:172:0x0118), top: B:27:0x00af, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0222 A[Catch: all -> 0x04cb, TryCatch #3 {all -> 0x04cb, blocks: (B:28:0x00af, B:30:0x00bf, B:32:0x00cd, B:34:0x00d7, B:36:0x00db, B:39:0x00ec, B:41:0x0104, B:43:0x012c, B:45:0x0138, B:47:0x014f, B:49:0x0177, B:51:0x01c1, B:55:0x01d4, B:57:0x01e8, B:59:0x01f3, B:62:0x0202, B:64:0x020a, B:66:0x0210, B:69:0x021f, B:71:0x0222, B:72:0x0246, B:74:0x024b, B:75:0x0253, B:77:0x0267, B:80:0x027b, B:82:0x029e, B:83:0x02ac, B:85:0x02df, B:86:0x02e7, B:88:0x02eb, B:89:0x02ee, B:91:0x030f, B:95:0x03e9, B:96:0x03ec, B:97:0x03fd, B:98:0x045b, B:100:0x046b, B:102:0x0485, B:103:0x048c, B:104:0x049d, B:105:0x04bc, B:110:0x0328, B:112:0x0353, B:114:0x035b, B:116:0x0365, B:121:0x037b, B:123:0x0385, B:126:0x0390, B:128:0x03a2, B:138:0x03b5, B:130:0x03cd, B:132:0x03d3, B:133:0x03d8, B:135:0x03de, B:145:0x033b, B:149:0x0404, B:151:0x043a, B:152:0x0442, B:154:0x0446, B:155:0x0449, B:157:0x04a1, B:159:0x04a5, B:162:0x025b, B:168:0x010e, B:172:0x0118), top: B:27:0x00af, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0267 A[Catch: all -> 0x04cb, TRY_LEAVE, TryCatch #3 {all -> 0x04cb, blocks: (B:28:0x00af, B:30:0x00bf, B:32:0x00cd, B:34:0x00d7, B:36:0x00db, B:39:0x00ec, B:41:0x0104, B:43:0x012c, B:45:0x0138, B:47:0x014f, B:49:0x0177, B:51:0x01c1, B:55:0x01d4, B:57:0x01e8, B:59:0x01f3, B:62:0x0202, B:64:0x020a, B:66:0x0210, B:69:0x021f, B:71:0x0222, B:72:0x0246, B:74:0x024b, B:75:0x0253, B:77:0x0267, B:80:0x027b, B:82:0x029e, B:83:0x02ac, B:85:0x02df, B:86:0x02e7, B:88:0x02eb, B:89:0x02ee, B:91:0x030f, B:95:0x03e9, B:96:0x03ec, B:97:0x03fd, B:98:0x045b, B:100:0x046b, B:102:0x0485, B:103:0x048c, B:104:0x049d, B:105:0x04bc, B:110:0x0328, B:112:0x0353, B:114:0x035b, B:116:0x0365, B:121:0x037b, B:123:0x0385, B:126:0x0390, B:128:0x03a2, B:138:0x03b5, B:130:0x03cd, B:132:0x03d3, B:133:0x03d8, B:135:0x03de, B:145:0x033b, B:149:0x0404, B:151:0x043a, B:152:0x0442, B:154:0x0446, B:155:0x0449, B:157:0x04a1, B:159:0x04a5, B:162:0x025b, B:168:0x010e, B:172:0x0118), top: B:27:0x00af, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.gms.measurement.internal.zzm r22) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o9.b(com.google.android.gms.measurement.internal.zzm):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(zzv zzvVar) {
        zzm a2 = a(zzvVar.b);
        if (a2 != null) {
            b(zzvVar, a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(zzv zzvVar, zzm zzmVar) {
        com.google.android.gms.common.internal.u.a(zzvVar);
        com.google.android.gms.common.internal.u.b(zzvVar.b);
        com.google.android.gms.common.internal.u.a(zzvVar.d);
        com.google.android.gms.common.internal.u.b(zzvVar.d.c);
        z();
        p();
        if (e(zzmVar)) {
            if (!zzmVar.i) {
                c(zzmVar);
                return;
            }
            f().y();
            try {
                c(zzmVar);
                zzv d = f().d(zzvVar.b, zzvVar.d.c);
                if (d != null) {
                    this.i.k().A().a("Removing conditional user property", zzvVar.b, this.i.x().c(zzvVar.d.c));
                    f().e(zzvVar.b, zzvVar.d.c);
                    if (d.f) {
                        f().b(zzvVar.b, zzvVar.d.c);
                    }
                    if (zzvVar.l != null) {
                        b(this.i.w().a(zzvVar.b, zzvVar.l.b, zzvVar.l.c != null ? zzvVar.l.c.zzb() : null, d.c, zzvVar.l.e, true, false), zzmVar);
                    }
                } else {
                    this.i.k().w().a("Conditional user property doesn't exist", f4.a(zzvVar.b), this.i.x().c(zzvVar.d.c));
                }
                f().u();
            } finally {
                f().z();
            }
        }
    }

    public final d5 c() {
        b(this.a);
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e5 c(zzm zzmVar) {
        z();
        p();
        com.google.android.gms.common.internal.u.a(zzmVar);
        com.google.android.gms.common.internal.u.b(zzmVar.b);
        e5 b = f().b(zzmVar.b);
        String b2 = this.i.q().b(zzmVar.b);
        if (!com.google.android.gms.internal.measurement.da.a() || !this.i.p().a(o.O0)) {
            return a(zzmVar, b, b2);
        }
        if (b == null) {
            b = new e5(this.i, zzmVar.b);
            b.a(this.i.w().w());
            b.e(b2);
        } else if (!b2.equals(b.q())) {
            b.e(b2);
            b.a(this.i.w().w());
        }
        b.b(zzmVar.c);
        b.c(zzmVar.s);
        if (bb.a() && this.i.p().e(b.l(), o.G0)) {
            b.d(zzmVar.w);
        }
        if (!TextUtils.isEmpty(zzmVar.l)) {
            b.f(zzmVar.l);
        }
        long j = zzmVar.f;
        if (j != 0) {
            b.d(j);
        }
        if (!TextUtils.isEmpty(zzmVar.d)) {
            b.g(zzmVar.d);
        }
        b.c(zzmVar.k);
        String str = zzmVar.e;
        if (str != null) {
            b.h(str);
        }
        b.e(zzmVar.g);
        b.a(zzmVar.i);
        if (!TextUtils.isEmpty(zzmVar.h)) {
            b.i(zzmVar.h);
        }
        b.p(zzmVar.m);
        b.b(zzmVar.p);
        b.c(zzmVar.q);
        if (this.i.p().e(zzmVar.b, o.a0)) {
            b.a(zzmVar.t);
        }
        b.f(zzmVar.u);
        if (b.a()) {
            f().a(b);
        }
        return b;
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final ka d() {
        return this.i.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d(zzm zzmVar) {
        try {
            return (String) this.i.g().a(new s9(this, zzmVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.i.k().t().a("Failed to get app instance id. appId", f4.a(zzmVar.b), e);
            return null;
        }
    }

    public final j4 e() {
        b(this.b);
        return this.b;
    }

    public final d f() {
        b(this.c);
        return this.c;
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final g5 g() {
        return this.i.g();
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final com.google.android.gms.common.util.e h() {
        return this.i.h();
    }

    public final ca i() {
        b(this.f);
        return this.f;
    }

    public final q7 j() {
        b(this.h);
        return this.h;
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final f4 k() {
        return this.i.k();
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final Context l() {
        return this.i.l();
    }

    public final v9 m() {
        b(this.g);
        return this.g;
    }

    public final c4 n() {
        return this.i.x();
    }

    public final z9 o() {
        return this.i.w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        if (!this.j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        e5 b;
        String str;
        h4 B;
        String str2;
        z();
        p();
        this.s = true;
        try {
            this.i.d();
            Boolean G = this.i.F().G();
            if (G == null) {
                B = this.i.k().w();
                str2 = "Upload data called on the client side before use of service was decided";
            } else {
                if (!G.booleanValue()) {
                    if (this.m <= 0) {
                        z();
                        if (this.v != null) {
                            B = this.i.k().B();
                            str2 = "Uploading requested multiple times";
                        } else {
                            if (e().u()) {
                                long a2 = this.i.h().a();
                                a((String) null, a2 - la.w());
                                long a3 = this.i.q().e.a();
                                if (a3 != 0) {
                                    this.i.k().A().a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a2 - a3)));
                                }
                                String w = f().w();
                                if (TextUtils.isEmpty(w)) {
                                    this.x = -1L;
                                    String a4 = f().a(a2 - la.w());
                                    if (!TextUtils.isEmpty(a4) && (b = f().b(a4)) != null) {
                                        a(b);
                                    }
                                } else {
                                    if (this.x == -1) {
                                        this.x = f().x();
                                    }
                                    List<Pair<com.google.android.gms.internal.measurement.x0, Long>> a5 = f().a(w, this.i.p().b(w, o.g), Math.max(0, this.i.p().b(w, o.h)));
                                    if (!a5.isEmpty()) {
                                        Iterator<Pair<com.google.android.gms.internal.measurement.x0, Long>> it = a5.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                str = null;
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.x0 x0Var = (com.google.android.gms.internal.measurement.x0) it.next().first;
                                            if (!TextUtils.isEmpty(x0Var.s())) {
                                                str = x0Var.s();
                                                break;
                                            }
                                        }
                                        if (str != null) {
                                            int i = 0;
                                            while (true) {
                                                if (i >= a5.size()) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.x0 x0Var2 = (com.google.android.gms.internal.measurement.x0) a5.get(i).first;
                                                if (!TextUtils.isEmpty(x0Var2.s()) && !x0Var2.s().equals(str)) {
                                                    a5 = a5.subList(0, i);
                                                    break;
                                                }
                                                i++;
                                            }
                                        }
                                        w0.a p = com.google.android.gms.internal.measurement.w0.p();
                                        int size = a5.size();
                                        ArrayList arrayList = new ArrayList(a5.size());
                                        boolean d = this.i.p().d(w);
                                        for (int i2 = 0; i2 < size; i2++) {
                                            x0.a l = ((com.google.android.gms.internal.measurement.x0) a5.get(i2).first).l();
                                            arrayList.add((Long) a5.get(i2).second);
                                            l.g(this.i.p().n());
                                            l.a(a2);
                                            this.i.d();
                                            l.b(false);
                                            if (!d) {
                                                l.z();
                                            }
                                            if (this.i.p().e(w, o.f0)) {
                                                l.l(m().a(((com.google.android.gms.internal.measurement.x0) ((com.google.android.gms.internal.measurement.o4) l.i())).e()));
                                            }
                                            p.a(l);
                                        }
                                        String a6 = this.i.k().a(2) ? m().a((com.google.android.gms.internal.measurement.w0) ((com.google.android.gms.internal.measurement.o4) p.i())) : null;
                                        m();
                                        byte[] e = ((com.google.android.gms.internal.measurement.w0) ((com.google.android.gms.internal.measurement.o4) p.i())).e();
                                        String a7 = o.q.a(null);
                                        try {
                                            URL url = new URL(a7);
                                            com.google.android.gms.common.internal.u.a(!arrayList.isEmpty());
                                            if (this.v != null) {
                                                this.i.k().t().a("Set uploading progress before finishing the previous upload");
                                            } else {
                                                this.v = new ArrayList(arrayList);
                                            }
                                            this.i.q().f.a(a2);
                                            this.i.k().B().a("Uploading data. app, uncompressed size, data", size > 0 ? p.a(0).o0() : "?", Integer.valueOf(e.length), a6);
                                            this.r = true;
                                            j4 e2 = e();
                                            q9 q9Var = new q9(this, w);
                                            e2.c();
                                            e2.r();
                                            com.google.android.gms.common.internal.u.a(url);
                                            com.google.android.gms.common.internal.u.a(e);
                                            com.google.android.gms.common.internal.u.a(q9Var);
                                            e2.g().b(new n4(e2, w, url, e, null, q9Var));
                                        } catch (MalformedURLException unused) {
                                            this.i.k().t().a("Failed to parse upload URL. Not uploading. appId", f4.a(w), a7);
                                        }
                                    }
                                }
                            }
                            this.i.k().B().a("Network not connected, ignoring upload request");
                        }
                    }
                    C();
                }
                B = this.i.k().t();
                str2 = "Upload called in the client side when service should be used";
            }
            B.a(str2);
        } finally {
            this.s = false;
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        h4 t;
        Integer valueOf;
        Integer valueOf2;
        String str;
        z();
        p();
        if (!this.l) {
            this.l = true;
            z();
            p();
            if ((this.i.p().a(o.c0) || w()) && v()) {
                int a2 = a(this.u);
                int F = this.i.H().F();
                z();
                if (a2 > F) {
                    t = this.i.k().t();
                    valueOf = Integer.valueOf(a2);
                    valueOf2 = Integer.valueOf(F);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (a2 < F) {
                    if (a(F, this.u)) {
                        t = this.i.k().B();
                        valueOf = Integer.valueOf(a2);
                        valueOf2 = Integer.valueOf(F);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        t = this.i.k().t();
                        valueOf = Integer.valueOf(a2);
                        valueOf2 = Integer.valueOf(F);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                t.a(str, valueOf, valueOf2);
            }
        }
        if (this.k || this.i.p().a(o.c0)) {
            return;
        }
        this.i.k().z().a("This instance being marked as an uploader");
        this.k = true;
        C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        this.p++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j5 t() {
        return this.i;
    }
}
