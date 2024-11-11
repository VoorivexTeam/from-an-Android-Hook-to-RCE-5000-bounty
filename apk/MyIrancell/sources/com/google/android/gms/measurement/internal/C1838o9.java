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
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.InterfaceC1099e;
import com.google.android.gms.internal.measurement.AbstractC1406o4;
import com.google.android.gms.internal.measurement.C1208b1;
import com.google.android.gms.internal.measurement.C1218bb;
import com.google.android.gms.internal.measurement.C1232ca;
import com.google.android.gms.internal.measurement.C1247da;
import com.google.android.gms.internal.measurement.C1337ja;
import com.google.android.gms.internal.measurement.C1402o0;
import com.google.android.gms.internal.measurement.C1472t0;
import com.google.android.gms.internal.measurement.C1500v0;
import com.google.android.gms.internal.measurement.C1514w0;
import com.google.android.gms.internal.measurement.C1528x0;
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
import p000.C0500c0;
import p000.C2440ep;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
/* loaded from: classes.dex */
public class C1838o9 implements InterfaceC1751h6 {

    /* renamed from: y */
    private static volatile C1838o9 f7924y;

    /* renamed from: a */
    private C1702d5 f7925a;

    /* renamed from: b */
    private C1773j4 f7926b;

    /* renamed from: c */
    private C1696d f7927c;

    /* renamed from: d */
    private C1855q4 f7928d;

    /* renamed from: e */
    private C1790k9 f7929e;

    /* renamed from: f */
    private C1695ca f7930f;

    /* renamed from: g */
    private final C1915v9 f7931g;

    /* renamed from: h */
    private C1858q7 f7932h;

    /* renamed from: i */
    private final C1774j5 f7933i;

    /* renamed from: j */
    private boolean f7934j;

    /* renamed from: k */
    private boolean f7935k;

    /* renamed from: l */
    private boolean f7936l;

    /* renamed from: m */
    private long f7937m;

    /* renamed from: n */
    private List<Runnable> f7938n;

    /* renamed from: o */
    private int f7939o;

    /* renamed from: p */
    private int f7940p;

    /* renamed from: q */
    private boolean f7941q;

    /* renamed from: r */
    private boolean f7942r;

    /* renamed from: s */
    private boolean f7943s;

    /* renamed from: t */
    private FileLock f7944t;

    /* renamed from: u */
    private FileChannel f7945u;

    /* renamed from: v */
    private List<Long> f7946v;

    /* renamed from: w */
    private List<Long> f7947w;

    /* renamed from: x */
    private long f7948x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.measurement.internal.o9$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC1720f {

        /* renamed from: a */
        C1528x0 f7949a;

        /* renamed from: b */
        List<Long> f7950b;

        /* renamed from: c */
        List<C1472t0> f7951c;

        /* renamed from: d */
        private long f7952d;

        private a(C1838o9 c1838o9) {
        }

        /* synthetic */ a(C1838o9 c1838o9, RunnableC1871r9 runnableC1871r9) {
            this(c1838o9);
        }

        /* renamed from: a */
        private static long m9700a(C1472t0 c1472t0) {
            return ((c1472t0.m8455s() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC1720f
        /* renamed from: a */
        public final void mo9292a(C1528x0 c1528x0) {
            C1057u.m7286a(c1528x0);
            this.f7949a = c1528x0;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC1720f
        /* renamed from: a */
        public final boolean mo9293a(long j, C1472t0 c1472t0) {
            C1057u.m7286a(c1472t0);
            if (this.f7951c == null) {
                this.f7951c = new ArrayList();
            }
            if (this.f7950b == null) {
                this.f7950b = new ArrayList();
            }
            if (this.f7951c.size() > 0 && m9700a(this.f7951c.get(0)) != m9700a(c1472t0)) {
                return false;
            }
            long mo8094c = this.f7952d + c1472t0.mo8094c();
            if (mo8094c >= Math.max(0, C1828o.f7866i.m9875a(null).intValue())) {
                return false;
            }
            this.f7952d = mo8094c;
            this.f7951c.add(c1472t0);
            this.f7950b.add(Long.valueOf(j));
            return this.f7951c.size() < Math.max(1, C1828o.f7868j.m9875a(null).intValue());
        }
    }

    private C1838o9(C1904u9 c1904u9) {
        this(c1904u9, null);
    }

    private C1838o9(C1904u9 c1904u9, C1774j5 c1774j5) {
        this.f7934j = false;
        C1057u.m7286a(c1904u9);
        this.f7933i = C1774j5.m9389a(c1904u9.f8105a, (com.google.android.gms.internal.measurement.zzv) null);
        this.f7948x = -1L;
        C1915v9 c1915v9 = new C1915v9(this);
        c1915v9.m9756s();
        this.f7931g = c1915v9;
        C1773j4 c1773j4 = new C1773j4(this);
        c1773j4.m9756s();
        this.f7926b = c1773j4;
        C1702d5 c1702d5 = new C1702d5(this);
        c1702d5.m9756s();
        this.f7925a = c1702d5;
        this.f7933i.mo9320g().m9344a(new RunnableC1871r9(this, c1904u9));
    }

    /* renamed from: A */
    private final long m9639A() {
        long mo7375a = this.f7933i.mo9321h().mo7375a();
        C1877s4 m9420q = this.f7933i.m9420q();
        m9420q.m9220o();
        m9420q.mo9194c();
        long m9792a = m9420q.f8027i.m9792a();
        if (m9792a == 0) {
            m9792a = 1 + m9420q.m9322i().m9962u().nextInt(86400000);
            m9420q.f8027i.m9793a(m9792a);
        }
        return ((((mo7375a + m9792a) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: B */
    private final boolean m9640B() {
        m9667z();
        m9695p();
        return m9689f().m9151E() || !TextUtils.isEmpty(m9689f().m9189w());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a3  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m9641C() {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1838o9.m9641C():void");
    }

    /* renamed from: a */
    private final int m9642a(FileChannel fileChannel) {
        m9667z();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f7933i.mo9324k().m9309t().m9365a("Bad channel to read from");
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
                this.f7933i.mo9324k().m9312w().m9366a("Unexpected data length. Bytes read", Integer.valueOf(read));
            }
            return 0;
        } catch (IOException e) {
            this.f7933i.mo9324k().m9309t().m9366a("Failed to read from channel", e);
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.C1714e5 m9643a(com.google.android.gms.measurement.internal.zzm r9, com.google.android.gms.measurement.internal.C1714e5 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1838o9.m9643a(com.google.android.gms.measurement.internal.zzm, com.google.android.gms.measurement.internal.e5, java.lang.String):com.google.android.gms.measurement.internal.e5");
    }

    /* renamed from: a */
    public static C1838o9 m9644a(Context context) {
        C1057u.m7286a(context);
        C1057u.m7286a(context.getApplicationContext());
        if (f7924y == null) {
            synchronized (C1838o9.class) {
                if (f7924y == null) {
                    f7924y = new C1838o9(new C1904u9(context));
                }
            }
        }
        return f7924y;
    }

    /* renamed from: a */
    private final zzm m9645a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3, String str4) {
        String str5;
        String str6;
        int i;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.f7933i.mo9324k().m9309t().m9365a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str5 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.f7933i.mo9324k().m9309t().m9366a("Error retrieving installer package name. appId", C1725f4.m9298a(str));
            str5 = "Unknown";
        }
        if (str5 == null) {
            str5 = "manual_install";
        } else if ("com.android.vending".equals(str5)) {
            str5 = "";
        }
        String str7 = str5;
        try {
            PackageInfo m11480b = C2440ep.m11628a(context).m11480b(str, 0);
            if (m11480b != null) {
                CharSequence m11481b = C2440ep.m11628a(context).m11481b(str);
                if (!TextUtils.isEmpty(m11481b)) {
                    m11481b.toString();
                }
                str6 = m11480b.versionName;
                i = m11480b.versionCode;
            } else {
                str6 = "Unknown";
                i = Integer.MIN_VALUE;
            }
            return new zzm(str, str2, str6, i, str7, this.f7933i.m9419p().m9491n(), this.f7933i.m9426w().m9932a(context, str), (String) null, z, false, "", 0L, j, 0, z2, z3, false, str3, (Boolean) null, 0L, (List<String>) null, (C1218bb.m7671a() && this.f7933i.m9419p().m9488e(str, C1828o.f7811G0)) ? str4 : null);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.f7933i.mo9324k().m9309t().m9367a("Error retrieving newly installed package info. appId, appName", C1725f4.m9298a(str), "Unknown");
            return null;
        }
    }

    /* renamed from: a */
    private final zzm m9646a(String str) {
        C1714e5 m9171b = m9689f().m9171b(str);
        if (m9171b == null || TextUtils.isEmpty(m9171b.m9283u())) {
            this.f7933i.mo9324k().m9303A().m9366a("No app data available; dropping", str);
            return null;
        }
        Boolean m9657b = m9657b(m9171b);
        if (m9657b == null || m9657b.booleanValue()) {
            return new zzm(str, m9171b.m9273n(), m9171b.m9283u(), m9171b.m9284v(), m9171b.m9285w(), m9171b.m9286x(), m9171b.m9287y(), (String) null, m9171b.m9224A(), false, m9171b.m9280r(), m9171b.m9253f(), 0L, 0, m9171b.m9258g(), m9171b.m9261h(), false, m9171b.m9275o(), m9171b.m9262i(), m9171b.m9288z(), m9171b.m9265j(), (C1218bb.m7671a() && this.f7933i.m9419p().m9488e(str, C1828o.f7811G0)) ? m9171b.m9277p() : null);
        }
        this.f7933i.mo9324k().m9309t().m9366a("App version does not match; dropping. appId", C1725f4.m9298a(str));
        return null;
    }

    /* renamed from: a */
    private static void m9647a(C1472t0.a aVar, int i, String str) {
        List<C1500v0> zza = aVar.zza();
        for (int i2 = 0; i2 < zza.size(); i2++) {
            if ("_err".equals(zza.get(i2).m8513p())) {
                return;
            }
        }
        C1500v0.a m8511y = C1500v0.m8511y();
        m8511y.m8524a("_err");
        m8511y.m8523a(Long.valueOf(i).longValue());
        C1500v0 c1500v0 = (C1500v0) ((AbstractC1406o4) m8511y.mo7537i());
        C1500v0.a m8511y2 = C1500v0.m8511y();
        m8511y2.m8524a("_ev");
        m8511y2.m8525b(str);
        C1500v0 c1500v02 = (C1500v0) ((AbstractC1406o4) m8511y2.mo7537i());
        aVar.m8464a(c1500v0);
        aVar.m8464a(c1500v02);
    }

    /* renamed from: a */
    private static void m9648a(C1472t0.a aVar, String str) {
        List<C1500v0> zza = aVar.zza();
        for (int i = 0; i < zza.size(); i++) {
            if (str.equals(zza.get(i).m8513p())) {
                aVar.m8468b(i);
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m9649a(C1528x0.a aVar) {
        aVar.m8816b(Long.MAX_VALUE);
        aVar.m8821c(Long.MIN_VALUE);
        for (int i = 0; i < aVar.m8849n(); i++) {
            C1472t0 m8815b = aVar.m8815b(i);
            if (m8815b.m8455s() < aVar.m8856r()) {
                aVar.m8816b(m8815b.m8455s());
            }
            if (m8815b.m8455s() > aVar.m8857s()) {
                aVar.m8821c(m8815b.m8455s());
            }
        }
    }

    /* renamed from: a */
    private final void m9650a(C1528x0.a aVar, long j, boolean z) {
        String str = z ? "_se" : "_lte";
        C1926w9 m9176c = m9689f().m9176c(aVar.m8860v(), str);
        C1926w9 c1926w9 = (m9176c == null || m9176c.f8153e == null) ? new C1926w9(aVar.m8860v(), "auto", str, this.f7933i.mo9321h().mo7375a(), Long.valueOf(j)) : new C1926w9(aVar.m8860v(), "auto", str, this.f7933i.mo9321h().mo7375a(), Long.valueOf(((Long) m9176c.f8153e).longValue() + j));
        C1208b1.a m7556x = C1208b1.m7556x();
        m7556x.m7569a(str);
        m7556x.m7568a(this.f7933i.mo9321h().mo7375a());
        m7556x.m7570b(((Long) c1926w9.f8153e).longValue());
        C1208b1 c1208b1 = (C1208b1) ((AbstractC1406o4) m7556x.mo7537i());
        boolean z2 = false;
        int m9809a = C1915v9.m9809a(aVar, str);
        if (m9809a >= 0) {
            aVar.m8806a(m9809a, c1208b1);
            z2 = true;
        }
        if (!z2) {
            aVar.m8810a(c1208b1);
        }
        if (j > 0) {
            m9689f().m9168a(c1926w9);
            String str2 = z ? "session-scoped" : "lifetime";
            if (C1337ja.m7940a() && this.f7933i.m9419p().m9488e(aVar.m8860v(), C1828o.f7847Y0)) {
                this.f7933i.mo9324k().m9304B().m9367a("Updated engagement user property. scope, value", str2, c1926w9.f8153e);
            } else {
                this.f7933i.mo9324k().m9303A().m9367a("Updated engagement user property. scope, value", str2, c1926w9.f8153e);
            }
        }
    }

    /* renamed from: a */
    private final void m9651a(C1714e5 c1714e5) {
        C0500c0 c0500c0;
        m9667z();
        if (C1218bb.m7671a() && this.f7933i.m9419p().m9488e(c1714e5.m9269l(), C1828o.f7811G0)) {
            if (TextUtils.isEmpty(c1714e5.m9273n()) && TextUtils.isEmpty(c1714e5.m9277p()) && TextUtils.isEmpty(c1714e5.m9275o())) {
                m9678a(c1714e5.m9269l(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(c1714e5.m9273n()) && TextUtils.isEmpty(c1714e5.m9275o())) {
            m9678a(c1714e5.m9269l(), 204, null, null, null);
            return;
        }
        String m9478a = this.f7933i.m9419p().m9478a(c1714e5);
        try {
            URL url = new URL(m9478a);
            this.f7933i.mo9324k().m9304B().m9366a("Fetching remote configuration", c1714e5.m9269l());
            C1402o0 m9207a = m9685c().m9207a(c1714e5.m9269l());
            String m9209b = m9685c().m9209b(c1714e5.m9269l());
            if (m9207a == null || TextUtils.isEmpty(m9209b)) {
                c0500c0 = null;
            } else {
                C0500c0 c0500c02 = new C0500c0();
                c0500c02.put("If-Modified-Since", m9209b);
                c0500c0 = c0500c02;
            }
            this.f7941q = true;
            C1773j4 m9688e = m9688e();
            String m9269l = c1714e5.m9269l();
            C1893t9 c1893t9 = new C1893t9(this);
            m9688e.mo9194c();
            m9688e.m9755r();
            C1057u.m7286a(url);
            C1057u.m7286a(c1893t9);
            m9688e.mo9320g().m9346b(new RunnableC1821n4(m9688e, m9269l, url, null, c0500c0, c1893t9));
        } catch (MalformedURLException unused) {
            this.f7933i.mo9324k().m9309t().m9367a("Failed to parse config URL. Not fetching. appId", C1725f4.m9298a(c1714e5.m9269l()), m9478a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m9653a(C1904u9 c1904u9) {
        this.f7933i.mo9320g().mo9194c();
        C1696d c1696d = new C1696d(this);
        c1696d.m9756s();
        this.f7927c = c1696d;
        this.f7933i.m9419p().m9479a(this.f7925a);
        C1695ca c1695ca = new C1695ca(this);
        c1695ca.m9756s();
        this.f7930f = c1695ca;
        C1858q7 c1858q7 = new C1858q7(this);
        c1858q7.m9756s();
        this.f7932h = c1858q7;
        C1790k9 c1790k9 = new C1790k9(this);
        c1790k9.m9756s();
        this.f7929e = c1790k9;
        this.f7928d = new C1855q4(this);
        if (this.f7939o != this.f7940p) {
            this.f7933i.mo9324k().m9309t().m9367a("Not all upload components initialized", Integer.valueOf(this.f7939o), Integer.valueOf(this.f7940p));
        }
        this.f7934j = true;
    }

    /* renamed from: a */
    private final boolean m9654a(int i, FileChannel fileChannel) {
        m9667z();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f7933i.mo9324k().m9309t().m9365a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            if (this.f7933i.m9419p().m9480a(C1828o.f7837T0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0L);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f7933i.mo9324k().m9309t().m9366a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f7933i.mo9324k().m9309t().m9366a("Failed to write to channel", e);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m9655a(C1472t0.a aVar, C1472t0.a aVar2) {
        C1057u.m7293a("_e".equals(aVar.m8472p()));
        m9692m();
        C1500v0 m9811a = C1915v9.m9811a((C1472t0) ((AbstractC1406o4) aVar.mo7537i()), "_sc");
        String m8515r = m9811a == null ? null : m9811a.m8515r();
        m9692m();
        C1500v0 m9811a2 = C1915v9.m9811a((C1472t0) ((AbstractC1406o4) aVar2.mo7537i()), "_pc");
        String m8515r2 = m9811a2 != null ? m9811a2.m8515r() : null;
        if (m8515r2 == null || !m8515r2.equals(m8515r)) {
            return false;
        }
        m9658b(aVar, aVar2);
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m9656a(java.lang.String r61, long r62) {
        /*
            Method dump skipped, instructions count: 3982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1838o9.m9656a(java.lang.String, long):boolean");
    }

    /* renamed from: b */
    private final Boolean m9657b(C1714e5 c1714e5) {
        try {
            if (c1714e5.m9284v() != -2147483648L) {
                if (c1714e5.m9284v() == C2440ep.m11628a(this.f7933i.mo9325l()).m11480b(c1714e5.m9269l(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = C2440ep.m11628a(this.f7933i.mo9325l()).m11480b(c1714e5.m9269l(), 0).versionName;
                if (c1714e5.m9283u() != null && c1714e5.m9283u().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private final void m9658b(C1472t0.a aVar, C1472t0.a aVar2) {
        C1057u.m7293a("_e".equals(aVar.m8472p()));
        m9692m();
        C1500v0 m9811a = C1915v9.m9811a((C1472t0) ((AbstractC1406o4) aVar.mo7537i()), "_et");
        if (!m9811a.m8516s() || m9811a.m8517t() <= 0) {
            return;
        }
        long m8517t = m9811a.m8517t();
        m9692m();
        C1500v0 m9811a2 = C1915v9.m9811a((C1472t0) ((AbstractC1406o4) aVar2.mo7537i()), "_et");
        if (m9811a2 != null && m9811a2.m8517t() > 0) {
            m8517t += m9811a2.m8517t();
        }
        m9692m();
        C1915v9.m9814a(aVar2, "_et", Long.valueOf(m8517t));
        m9692m();
        C1915v9.m9814a(aVar, "_fr", (Object) 1L);
    }

    /* renamed from: b */
    private static void m9659b(AbstractC1849p9 abstractC1849p9) {
        if (abstractC1849p9 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (abstractC1849p9.m9754q()) {
            return;
        }
        String valueOf = String.valueOf(abstractC1849p9.getClass());
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
    
        r7.mo9324k().m9309t().m9367a("Error pruning currencies. appId", com.google.android.gms.measurement.internal.C1725f4.m9298a(r15), r0);
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m9660b(com.google.android.gms.measurement.internal.zzan r28, com.google.android.gms.measurement.internal.zzm r29) {
        /*
            Method dump skipped, instructions count: 2347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1838o9.m9660b(com.google.android.gms.measurement.internal.zzan, com.google.android.gms.measurement.internal.zzm):void");
    }

    /* renamed from: e */
    private final boolean m9661e(zzm zzmVar) {
        return (C1218bb.m7671a() && this.f7933i.m9419p().m9488e(zzmVar.f8231b, C1828o.f7811G0)) ? (TextUtils.isEmpty(zzmVar.f8232c) && TextUtils.isEmpty(zzmVar.f8252w) && TextUtils.isEmpty(zzmVar.f8248s)) ? false : true : (TextUtils.isEmpty(zzmVar.f8232c) && TextUtils.isEmpty(zzmVar.f8248s)) ? false : true;
    }

    /* renamed from: u */
    private final void m9662u() {
        m9667z();
        if (this.f7941q || this.f7942r || this.f7943s) {
            this.f7933i.mo9324k().m9304B().m9368a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f7941q), Boolean.valueOf(this.f7942r), Boolean.valueOf(this.f7943s));
            return;
        }
        this.f7933i.mo9324k().m9304B().m9365a("Stopping uploading service(s)");
        List<Runnable> list = this.f7938n;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f7938n.clear();
    }

    /* renamed from: v */
    private final boolean m9663v() {
        C1749h4 m9312w;
        String str;
        FileLock fileLock;
        m9667z();
        if (this.f7933i.m9419p().m9480a(C1828o.f7807E0) && (fileLock = this.f7944t) != null && fileLock.isValid()) {
            this.f7933i.mo9324k().m9304B().m9365a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f7933i.mo9325l().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f7945u = channel;
            FileLock tryLock = channel.tryLock();
            this.f7944t = tryLock;
            if (tryLock != null) {
                this.f7933i.mo9324k().m9304B().m9365a("Storage concurrent access okay");
                return true;
            }
            this.f7933i.mo9324k().m9309t().m9365a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            m9312w = this.f7933i.mo9324k().m9309t();
            str = "Failed to acquire storage lock";
            m9312w.m9366a(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            m9312w = this.f7933i.mo9324k().m9309t();
            str = "Failed to access storage lock file";
            m9312w.m9366a(str, e);
            return false;
        } catch (OverlappingFileLockException e3) {
            e = e3;
            m9312w = this.f7933i.mo9324k().m9312w();
            str = "Storage lock already acquired";
            m9312w.m9366a(str, e);
            return false;
        }
    }

    /* renamed from: w */
    private final boolean m9664w() {
        m9667z();
        m9695p();
        return this.f7935k;
    }

    /* renamed from: x */
    private final C1855q4 m9665x() {
        C1855q4 c1855q4 = this.f7928d;
        if (c1855q4 != null) {
            return c1855q4;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: y */
    private final C1790k9 m9666y() {
        m9659b(this.f7929e);
        return this.f7929e;
    }

    /* renamed from: z */
    private final void m9667z() {
        this.f7933i.mo9320g().mo9194c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9668a() {
        this.f7933i.mo9320g().mo9194c();
        m9689f().m9148B();
        if (this.f7933i.m9420q().f8023e.m9792a() == 0) {
            this.f7933i.m9420q().f8023e.m9793a(this.f7933i.mo9321h().mo7375a());
        }
        m9641C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0158, code lost:
    
        r8.f7933i.m9420q().f8025g.m9793a(r8.f7933i.mo9321h().mo7375a());
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9669a(int r9, java.lang.Throwable r10, byte[] r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1838o9.m9669a(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9670a(AbstractC1849p9 abstractC1849p9) {
        this.f7939o++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9671a(zzan zzanVar, zzm zzmVar) {
        List<zzv> m9161a;
        List<zzv> m9161a2;
        List<zzv> m9161a3;
        C1749h4 m9309t;
        String str;
        Object m9298a;
        String m9122c;
        Object obj;
        List<String> list;
        zzan zzanVar2 = zzanVar;
        C1057u.m7286a(zzmVar);
        C1057u.m7296b(zzmVar.f8231b);
        m9667z();
        m9695p();
        String str2 = zzmVar.f8231b;
        long j = zzanVar2.f8223e;
        if (m9692m().m9833a(zzanVar2, zzmVar)) {
            if (!zzmVar.f8238i) {
                m9686c(zzmVar);
                return;
            }
            if (this.f7933i.m9419p().m9488e(str2, C1828o.f7871k0) && (list = zzmVar.f8251v) != null) {
                if (!list.contains(zzanVar2.f8220b)) {
                    this.f7933i.mo9324k().m9303A().m9368a("Dropping non-safelisted event. appId, event name, origin", str2, zzanVar2.f8220b, zzanVar2.f8222d);
                    return;
                } else {
                    Bundle zzb = zzanVar2.f8221c.zzb();
                    zzb.putLong("ga_safelisted", 1L);
                    zzanVar2 = new zzan(zzanVar2.f8220b, new zzam(zzb), zzanVar2.f8222d, zzanVar2.f8223e);
                }
            }
            m9689f().m9191y();
            try {
                C1696d m9689f = m9689f();
                C1057u.m7296b(str2);
                m9689f.mo9194c();
                m9689f.m9755r();
                if (j < 0) {
                    m9689f.mo9324k().m9312w().m9367a("Invalid time querying timed out conditional properties", C1725f4.m9298a(str2), Long.valueOf(j));
                    m9161a = Collections.emptyList();
                } else {
                    m9161a = m9689f.m9161a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzv zzvVar : m9161a) {
                    if (zzvVar != null) {
                        if (C1337ja.m7940a() && this.f7933i.m9419p().m9488e(zzmVar.f8231b, C1828o.f7847Y0)) {
                            this.f7933i.mo9324k().m9304B().m9368a("User property timed out", zzvVar.f8253b, this.f7933i.m9427x().m9122c(zzvVar.f8255d.f8225c), zzvVar.f8255d.zza());
                        } else {
                            this.f7933i.mo9324k().m9303A().m9368a("User property timed out", zzvVar.f8253b, this.f7933i.m9427x().m9122c(zzvVar.f8255d.f8225c), zzvVar.f8255d.zza());
                        }
                        if (zzvVar.f8259h != null) {
                            m9660b(new zzan(zzvVar.f8259h, j), zzmVar);
                        }
                        m9689f().m9179e(str2, zzvVar.f8255d.f8225c);
                    }
                }
                C1696d m9689f2 = m9689f();
                C1057u.m7296b(str2);
                m9689f2.mo9194c();
                m9689f2.m9755r();
                if (j < 0) {
                    m9689f2.mo9324k().m9312w().m9367a("Invalid time querying expired conditional properties", C1725f4.m9298a(str2), Long.valueOf(j));
                    m9161a2 = Collections.emptyList();
                } else {
                    m9161a2 = m9689f2.m9161a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(m9161a2.size());
                for (zzv zzvVar2 : m9161a2) {
                    if (zzvVar2 != null) {
                        if (C1337ja.m7940a() && this.f7933i.m9419p().m9488e(zzmVar.f8231b, C1828o.f7847Y0)) {
                            this.f7933i.mo9324k().m9304B().m9368a("User property expired", zzvVar2.f8253b, this.f7933i.m9427x().m9122c(zzvVar2.f8255d.f8225c), zzvVar2.f8255d.zza());
                        } else {
                            this.f7933i.mo9324k().m9303A().m9368a("User property expired", zzvVar2.f8253b, this.f7933i.m9427x().m9122c(zzvVar2.f8255d.f8225c), zzvVar2.f8255d.zza());
                        }
                        m9689f().m9173b(str2, zzvVar2.f8255d.f8225c);
                        if (zzvVar2.f8263l != null) {
                            arrayList.add(zzvVar2.f8263l);
                        }
                        m9689f().m9179e(str2, zzvVar2.f8255d.f8225c);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    m9660b(new zzan((zzan) obj2, j), zzmVar);
                }
                C1696d m9689f3 = m9689f();
                String str3 = zzanVar2.f8220b;
                C1057u.m7296b(str2);
                C1057u.m7296b(str3);
                m9689f3.mo9194c();
                m9689f3.m9755r();
                if (j < 0) {
                    m9689f3.mo9324k().m9312w().m9368a("Invalid time querying triggered conditional properties", C1725f4.m9298a(str2), m9689f3.m9319f().m9120a(str3), Long.valueOf(j));
                    m9161a3 = Collections.emptyList();
                } else {
                    m9161a3 = m9689f3.m9161a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(m9161a3.size());
                for (zzv zzvVar3 : m9161a3) {
                    if (zzvVar3 != null) {
                        zzkq zzkqVar = zzvVar3.f8255d;
                        C1926w9 c1926w9 = new C1926w9(zzvVar3.f8253b, zzvVar3.f8254c, zzkqVar.f8225c, j, zzkqVar.zza());
                        if (m9689f().m9168a(c1926w9)) {
                            str = "User property triggered";
                            if (C1337ja.m7940a() && this.f7933i.m9419p().m9488e(zzmVar.f8231b, C1828o.f7847Y0)) {
                                m9309t = this.f7933i.mo9324k().m9304B();
                                m9298a = zzvVar3.f8253b;
                                m9122c = this.f7933i.m9427x().m9122c(c1926w9.f8151c);
                                obj = c1926w9.f8153e;
                            } else {
                                m9309t = this.f7933i.mo9324k().m9303A();
                                m9298a = zzvVar3.f8253b;
                                m9122c = this.f7933i.m9427x().m9122c(c1926w9.f8151c);
                                obj = c1926w9.f8153e;
                            }
                        } else {
                            m9309t = this.f7933i.mo9324k().m9309t();
                            str = "Too many active user properties, ignoring";
                            m9298a = C1725f4.m9298a(zzvVar3.f8253b);
                            m9122c = this.f7933i.m9427x().m9122c(c1926w9.f8151c);
                            obj = c1926w9.f8153e;
                        }
                        m9309t.m9368a(str, m9298a, m9122c, obj);
                        if (zzvVar3.f8261j != null) {
                            arrayList2.add(zzvVar3.f8261j);
                        }
                        zzvVar3.f8255d = new zzkq(c1926w9);
                        zzvVar3.f8257f = true;
                        m9689f().m9169a(zzvVar3);
                    }
                }
                m9660b(zzanVar2, zzmVar);
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    m9660b(new zzan((zzan) obj3, j), zzmVar);
                }
                m9689f().m9187u();
            } finally {
                m9689f().m9192z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9672a(zzan zzanVar, String str) {
        C1714e5 m9171b = m9689f().m9171b(str);
        if (m9171b == null || TextUtils.isEmpty(m9171b.m9283u())) {
            this.f7933i.mo9324k().m9303A().m9366a("No app data available; dropping event", str);
            return;
        }
        Boolean m9657b = m9657b(m9171b);
        if (m9657b == null) {
            if (!"_ui".equals(zzanVar.f8220b)) {
                this.f7933i.mo9324k().m9312w().m9366a("Could not find package. appId", C1725f4.m9298a(str));
            }
        } else if (!m9657b.booleanValue()) {
            this.f7933i.mo9324k().m9309t().m9366a("App version does not match; dropping event. appId", C1725f4.m9298a(str));
            return;
        }
        m9671a(zzanVar, new zzm(str, m9171b.m9273n(), m9171b.m9283u(), m9171b.m9284v(), m9171b.m9285w(), m9171b.m9286x(), m9171b.m9287y(), (String) null, m9171b.m9224A(), false, m9171b.m9280r(), m9171b.m9253f(), 0L, 0, m9171b.m9258g(), m9171b.m9261h(), false, m9171b.m9275o(), m9171b.m9262i(), m9171b.m9288z(), m9171b.m9265j(), (C1218bb.m7671a() && this.f7933i.m9419p().m9488e(m9171b.m9269l(), C1828o.f7811G0)) ? m9171b.m9277p() : null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9673a(zzkq zzkqVar, zzm zzmVar) {
        C1780k m9156a;
        m9667z();
        m9695p();
        if (m9661e(zzmVar)) {
            if (!zzmVar.f8238i) {
                m9686c(zzmVar);
                return;
            }
            int m9955b = this.f7933i.m9426w().m9955b(zzkqVar.f8225c);
            C1774j5 c1774j5 = this.f7933i;
            if (m9955b != 0) {
                c1774j5.m9426w();
                String m9909a = C1959z9.m9909a(zzkqVar.f8225c, 24, true);
                String str = zzkqVar.f8225c;
                this.f7933i.m9426w().m9949a(zzmVar.f8231b, m9955b, "_ev", m9909a, str != null ? str.length() : 0);
                return;
            }
            int m9956b = c1774j5.m9426w().m9956b(zzkqVar.f8225c, zzkqVar.zza());
            if (m9956b != 0) {
                this.f7933i.m9426w();
                String m9909a2 = C1959z9.m9909a(zzkqVar.f8225c, 24, true);
                Object zza = zzkqVar.zza();
                this.f7933i.m9426w().m9949a(zzmVar.f8231b, m9956b, "_ev", m9909a2, (zza == null || !((zza instanceof String) || (zza instanceof CharSequence))) ? 0 : String.valueOf(zza).length());
                return;
            }
            Object m9958c = this.f7933i.m9426w().m9958c(zzkqVar.f8225c, zzkqVar.zza());
            if (m9958c == null) {
                return;
            }
            if ("_sid".equals(zzkqVar.f8225c) && this.f7933i.m9419p().m9488e(zzmVar.f8231b, C1828o.f7830Q)) {
                long j = zzkqVar.f8226d;
                String str2 = zzkqVar.f8229g;
                long j2 = 0;
                C1926w9 m9176c = m9689f().m9176c(zzmVar.f8231b, "_sno");
                if (m9176c != null) {
                    Object obj = m9176c.f8153e;
                    if (obj instanceof Long) {
                        j2 = ((Long) obj).longValue();
                        m9673a(new zzkq("_sno", j, Long.valueOf(j2 + 1), str2), zzmVar);
                    }
                }
                if (m9176c != null) {
                    this.f7933i.mo9324k().m9312w().m9366a("Retrieved last session number from database does not contain a valid (long) value", m9176c.f8153e);
                }
                if (this.f7933i.m9419p().m9488e(zzmVar.f8231b, C1828o.f7836T) && (m9156a = m9689f().m9156a(zzmVar.f8231b, "_s")) != null) {
                    j2 = m9156a.f7696c;
                    this.f7933i.mo9324k().m9304B().m9366a("Backfill the session number. Last used session number", Long.valueOf(j2));
                }
                m9673a(new zzkq("_sno", j, Long.valueOf(j2 + 1), str2), zzmVar);
            }
            C1926w9 c1926w9 = new C1926w9(zzmVar.f8231b, zzkqVar.f8229g, zzkqVar.f8225c, zzkqVar.f8226d, m9958c);
            ((C1337ja.m7940a() && this.f7933i.m9419p().m9488e(zzmVar.f8231b, C1828o.f7847Y0)) ? this.f7933i.mo9324k().m9304B() : this.f7933i.mo9324k().m9303A()).m9367a("Setting user property", this.f7933i.m9427x().m9122c(c1926w9.f8151c), m9958c);
            m9689f().m9191y();
            try {
                m9686c(zzmVar);
                boolean m9168a = m9689f().m9168a(c1926w9);
                m9689f().m9187u();
                if (!m9168a) {
                    this.f7933i.mo9324k().m9309t().m9367a("Too many unique user properties are set. Ignoring user property", this.f7933i.m9427x().m9122c(c1926w9.f8151c), c1926w9.f8153e);
                    this.f7933i.m9426w().m9949a(zzmVar.f8231b, 9, (String) null, (String) null, 0);
                } else if (!C1337ja.m7940a() || !this.f7933i.m9419p().m9488e(zzmVar.f8231b, C1828o.f7847Y0)) {
                    this.f7933i.mo9324k().m9303A().m9367a("User property set", this.f7933i.m9427x().m9122c(c1926w9.f8151c), c1926w9.f8153e);
                }
            } finally {
                m9689f().m9192z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9674a(zzm zzmVar) {
        if (this.f7946v != null) {
            ArrayList arrayList = new ArrayList();
            this.f7947w = arrayList;
            arrayList.addAll(this.f7946v);
        }
        C1696d m9689f = m9689f();
        String str = zzmVar.f8231b;
        C1057u.m7296b(str);
        m9689f.mo9194c();
        m9689f.m9755r();
        try {
            SQLiteDatabase m9188v = m9689f.m9188v();
            String[] strArr = {str};
            int delete = m9188v.delete("apps", "app_id=?", strArr) + 0 + m9188v.delete("events", "app_id=?", strArr) + m9188v.delete("user_attributes", "app_id=?", strArr) + m9188v.delete("conditional_properties", "app_id=?", strArr) + m9188v.delete("raw_events", "app_id=?", strArr) + m9188v.delete("raw_events_metadata", "app_id=?", strArr) + m9188v.delete("queue", "app_id=?", strArr) + m9188v.delete("audience_filter_values", "app_id=?", strArr) + m9188v.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                m9689f.mo9324k().m9304B().m9367a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            m9689f.mo9324k().m9309t().m9367a("Error resetting analytics data. appId, error", C1725f4.m9298a(str), e);
        }
        if (C1232ca.m7700a() && this.f7933i.m9419p().m9480a(C1828o.f7821L0)) {
            if (zzmVar.f8238i) {
                m9682b(zzmVar);
            }
        } else {
            zzm m9645a = m9645a(this.f7933i.mo9325l(), zzmVar.f8231b, zzmVar.f8232c, zzmVar.f8238i, zzmVar.f8245p, zzmVar.f8246q, zzmVar.f8243n, zzmVar.f8248s, zzmVar.f8252w);
            if (zzmVar.f8238i) {
                m9682b(m9645a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9675a(zzv zzvVar) {
        zzm m9646a = m9646a(zzvVar.f8253b);
        if (m9646a != null) {
            m9676a(zzvVar, m9646a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9676a(zzv zzvVar, zzm zzmVar) {
        C1749h4 m9309t;
        String str;
        Object m9298a;
        String m9122c;
        Object zza;
        C1749h4 m9309t2;
        String str2;
        Object m9298a2;
        String m9122c2;
        Object obj;
        C1057u.m7286a(zzvVar);
        C1057u.m7296b(zzvVar.f8253b);
        C1057u.m7286a(zzvVar.f8254c);
        C1057u.m7286a(zzvVar.f8255d);
        C1057u.m7296b(zzvVar.f8255d.f8225c);
        m9667z();
        m9695p();
        if (m9661e(zzmVar)) {
            if (!zzmVar.f8238i) {
                m9686c(zzmVar);
                return;
            }
            zzv zzvVar2 = new zzv(zzvVar);
            boolean z = false;
            zzvVar2.f8257f = false;
            m9689f().m9191y();
            try {
                zzv m9177d = m9689f().m9177d(zzvVar2.f8253b, zzvVar2.f8255d.f8225c);
                if (m9177d != null && !m9177d.f8254c.equals(zzvVar2.f8254c)) {
                    this.f7933i.mo9324k().m9312w().m9368a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f7933i.m9427x().m9122c(zzvVar2.f8255d.f8225c), zzvVar2.f8254c, m9177d.f8254c);
                }
                if (m9177d != null && m9177d.f8257f) {
                    zzvVar2.f8254c = m9177d.f8254c;
                    zzvVar2.f8256e = m9177d.f8256e;
                    zzvVar2.f8260i = m9177d.f8260i;
                    zzvVar2.f8258g = m9177d.f8258g;
                    zzvVar2.f8261j = m9177d.f8261j;
                    zzvVar2.f8257f = m9177d.f8257f;
                    zzvVar2.f8255d = new zzkq(zzvVar2.f8255d.f8225c, m9177d.f8255d.f8226d, zzvVar2.f8255d.zza(), m9177d.f8255d.f8229g);
                } else if (TextUtils.isEmpty(zzvVar2.f8258g)) {
                    zzvVar2.f8255d = new zzkq(zzvVar2.f8255d.f8225c, zzvVar2.f8256e, zzvVar2.f8255d.zza(), zzvVar2.f8255d.f8229g);
                    zzvVar2.f8257f = true;
                    z = true;
                }
                if (zzvVar2.f8257f) {
                    zzkq zzkqVar = zzvVar2.f8255d;
                    C1926w9 c1926w9 = new C1926w9(zzvVar2.f8253b, zzvVar2.f8254c, zzkqVar.f8225c, zzkqVar.f8226d, zzkqVar.zza());
                    if (m9689f().m9168a(c1926w9)) {
                        m9309t2 = this.f7933i.mo9324k().m9303A();
                        str2 = "User property updated immediately";
                        m9298a2 = zzvVar2.f8253b;
                        m9122c2 = this.f7933i.m9427x().m9122c(c1926w9.f8151c);
                        obj = c1926w9.f8153e;
                    } else {
                        m9309t2 = this.f7933i.mo9324k().m9309t();
                        str2 = "(2)Too many active user properties, ignoring";
                        m9298a2 = C1725f4.m9298a(zzvVar2.f8253b);
                        m9122c2 = this.f7933i.m9427x().m9122c(c1926w9.f8151c);
                        obj = c1926w9.f8153e;
                    }
                    m9309t2.m9368a(str2, m9298a2, m9122c2, obj);
                    if (z && zzvVar2.f8261j != null) {
                        m9660b(new zzan(zzvVar2.f8261j, zzvVar2.f8256e), zzmVar);
                    }
                }
                if (m9689f().m9169a(zzvVar2)) {
                    m9309t = this.f7933i.mo9324k().m9303A();
                    str = "Conditional property added";
                    m9298a = zzvVar2.f8253b;
                    m9122c = this.f7933i.m9427x().m9122c(zzvVar2.f8255d.f8225c);
                    zza = zzvVar2.f8255d.zza();
                } else {
                    m9309t = this.f7933i.mo9324k().m9309t();
                    str = "Too many conditional properties, ignoring";
                    m9298a = C1725f4.m9298a(zzvVar2.f8253b);
                    m9122c = this.f7933i.m9427x().m9122c(zzvVar2.f8255d.f8225c);
                    zza = zzvVar2.f8255d.zza();
                }
                m9309t.m9368a(str, m9298a, m9122c, zza);
                m9689f().m9187u();
            } finally {
                m9689f().m9192z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9677a(Runnable runnable) {
        m9667z();
        if (this.f7938n == null) {
            this.f7938n = new ArrayList();
        }
        this.f7938n.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        r6.f7933i.m9420q().f8025g.m9793a(r6.f7933i.mo9321h().mo7375a());
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:5:0x0029, B:12:0x0045, B:13:0x016d, B:24:0x0061, B:31:0x00b0, B:32:0x00c5, B:35:0x00cd, B:37:0x00d9, B:39:0x00df, B:43:0x00ec, B:46:0x011c, B:48:0x0132, B:49:0x015a, B:51:0x0164, B:53:0x016a, B:54:0x0142, B:55:0x0103, B:57:0x010d), top: B:4:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:5:0x0029, B:12:0x0045, B:13:0x016d, B:24:0x0061, B:31:0x00b0, B:32:0x00c5, B:35:0x00cd, B:37:0x00d9, B:39:0x00df, B:43:0x00ec, B:46:0x011c, B:48:0x0132, B:49:0x015a, B:51:0x0164, B:53:0x016a, B:54:0x0142, B:55:0x0103, B:57:0x010d), top: B:4:0x0029, outer: #0 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9678a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1838o9.m9678a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9679a(boolean z) {
        m9641C();
    }

    /* renamed from: b */
    public final C1803la m9680b() {
        return this.f7933i.m9419p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9681b(zzkq zzkqVar, zzm zzmVar) {
        m9667z();
        m9695p();
        if (m9661e(zzmVar)) {
            if (!zzmVar.f8238i) {
                m9686c(zzmVar);
                return;
            }
            if (!this.f7933i.m9419p().m9488e(zzmVar.f8231b, C1828o.f7851a0)) {
                this.f7933i.mo9324k().m9303A().m9366a("Removing user property", this.f7933i.m9427x().m9122c(zzkqVar.f8225c));
                m9689f().m9191y();
                try {
                    m9686c(zzmVar);
                    m9689f().m9173b(zzmVar.f8231b, zzkqVar.f8225c);
                    m9689f().m9187u();
                    this.f7933i.mo9324k().m9303A().m9366a("User property removed", this.f7933i.m9427x().m9122c(zzkqVar.f8225c));
                    return;
                } finally {
                }
            }
            if ("_npa".equals(zzkqVar.f8225c) && zzmVar.f8249t != null) {
                this.f7933i.mo9324k().m9303A().m9365a("Falling back to manifest metadata value for ad personalization");
                m9673a(new zzkq("_npa", this.f7933i.mo9321h().mo7375a(), Long.valueOf(zzmVar.f8249t.booleanValue() ? 1L : 0L), "auto"), zzmVar);
                return;
            }
            this.f7933i.mo9324k().m9303A().m9366a("Removing user property", this.f7933i.m9427x().m9122c(zzkqVar.f8225c));
            m9689f().m9191y();
            try {
                m9686c(zzmVar);
                m9689f().m9173b(zzmVar.f8231b, zzkqVar.f8225c);
                m9689f().m9187u();
                this.f7933i.mo9324k().m9303A().m9366a("User property removed", this.f7933i.m9427x().m9122c(zzkqVar.f8225c));
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x046b A[Catch: all -> 0x04cb, TryCatch #3 {all -> 0x04cb, blocks: (B:28:0x00af, B:30:0x00bf, B:32:0x00cd, B:34:0x00d7, B:36:0x00db, B:39:0x00ec, B:41:0x0104, B:43:0x012c, B:45:0x0138, B:47:0x014f, B:49:0x0177, B:51:0x01c1, B:55:0x01d4, B:57:0x01e8, B:59:0x01f3, B:62:0x0202, B:64:0x020a, B:66:0x0210, B:69:0x021f, B:71:0x0222, B:72:0x0246, B:74:0x024b, B:75:0x0253, B:77:0x0267, B:80:0x027b, B:82:0x029e, B:83:0x02ac, B:85:0x02df, B:86:0x02e7, B:88:0x02eb, B:89:0x02ee, B:91:0x030f, B:95:0x03e9, B:96:0x03ec, B:97:0x03fd, B:98:0x045b, B:100:0x046b, B:102:0x0485, B:103:0x048c, B:104:0x049d, B:105:0x04bc, B:110:0x0328, B:112:0x0353, B:114:0x035b, B:116:0x0365, B:121:0x037b, B:123:0x0385, B:126:0x0390, B:128:0x03a2, B:138:0x03b5, B:130:0x03cd, B:132:0x03d3, B:133:0x03d8, B:135:0x03de, B:145:0x033b, B:149:0x0404, B:151:0x043a, B:152:0x0442, B:154:0x0446, B:155:0x0449, B:157:0x04a1, B:159:0x04a5, B:162:0x025b, B:168:0x010e, B:172:0x0118), top: B:27:0x00af, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a1 A[Catch: all -> 0x04cb, TryCatch #3 {all -> 0x04cb, blocks: (B:28:0x00af, B:30:0x00bf, B:32:0x00cd, B:34:0x00d7, B:36:0x00db, B:39:0x00ec, B:41:0x0104, B:43:0x012c, B:45:0x0138, B:47:0x014f, B:49:0x0177, B:51:0x01c1, B:55:0x01d4, B:57:0x01e8, B:59:0x01f3, B:62:0x0202, B:64:0x020a, B:66:0x0210, B:69:0x021f, B:71:0x0222, B:72:0x0246, B:74:0x024b, B:75:0x0253, B:77:0x0267, B:80:0x027b, B:82:0x029e, B:83:0x02ac, B:85:0x02df, B:86:0x02e7, B:88:0x02eb, B:89:0x02ee, B:91:0x030f, B:95:0x03e9, B:96:0x03ec, B:97:0x03fd, B:98:0x045b, B:100:0x046b, B:102:0x0485, B:103:0x048c, B:104:0x049d, B:105:0x04bc, B:110:0x0328, B:112:0x0353, B:114:0x035b, B:116:0x0365, B:121:0x037b, B:123:0x0385, B:126:0x0390, B:128:0x03a2, B:138:0x03b5, B:130:0x03cd, B:132:0x03d3, B:133:0x03d8, B:135:0x03de, B:145:0x033b, B:149:0x0404, B:151:0x043a, B:152:0x0442, B:154:0x0446, B:155:0x0449, B:157:0x04a1, B:159:0x04a5, B:162:0x025b, B:168:0x010e, B:172:0x0118), top: B:27:0x00af, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0222 A[Catch: all -> 0x04cb, TryCatch #3 {all -> 0x04cb, blocks: (B:28:0x00af, B:30:0x00bf, B:32:0x00cd, B:34:0x00d7, B:36:0x00db, B:39:0x00ec, B:41:0x0104, B:43:0x012c, B:45:0x0138, B:47:0x014f, B:49:0x0177, B:51:0x01c1, B:55:0x01d4, B:57:0x01e8, B:59:0x01f3, B:62:0x0202, B:64:0x020a, B:66:0x0210, B:69:0x021f, B:71:0x0222, B:72:0x0246, B:74:0x024b, B:75:0x0253, B:77:0x0267, B:80:0x027b, B:82:0x029e, B:83:0x02ac, B:85:0x02df, B:86:0x02e7, B:88:0x02eb, B:89:0x02ee, B:91:0x030f, B:95:0x03e9, B:96:0x03ec, B:97:0x03fd, B:98:0x045b, B:100:0x046b, B:102:0x0485, B:103:0x048c, B:104:0x049d, B:105:0x04bc, B:110:0x0328, B:112:0x0353, B:114:0x035b, B:116:0x0365, B:121:0x037b, B:123:0x0385, B:126:0x0390, B:128:0x03a2, B:138:0x03b5, B:130:0x03cd, B:132:0x03d3, B:133:0x03d8, B:135:0x03de, B:145:0x033b, B:149:0x0404, B:151:0x043a, B:152:0x0442, B:154:0x0446, B:155:0x0449, B:157:0x04a1, B:159:0x04a5, B:162:0x025b, B:168:0x010e, B:172:0x0118), top: B:27:0x00af, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0267 A[Catch: all -> 0x04cb, TRY_LEAVE, TryCatch #3 {all -> 0x04cb, blocks: (B:28:0x00af, B:30:0x00bf, B:32:0x00cd, B:34:0x00d7, B:36:0x00db, B:39:0x00ec, B:41:0x0104, B:43:0x012c, B:45:0x0138, B:47:0x014f, B:49:0x0177, B:51:0x01c1, B:55:0x01d4, B:57:0x01e8, B:59:0x01f3, B:62:0x0202, B:64:0x020a, B:66:0x0210, B:69:0x021f, B:71:0x0222, B:72:0x0246, B:74:0x024b, B:75:0x0253, B:77:0x0267, B:80:0x027b, B:82:0x029e, B:83:0x02ac, B:85:0x02df, B:86:0x02e7, B:88:0x02eb, B:89:0x02ee, B:91:0x030f, B:95:0x03e9, B:96:0x03ec, B:97:0x03fd, B:98:0x045b, B:100:0x046b, B:102:0x0485, B:103:0x048c, B:104:0x049d, B:105:0x04bc, B:110:0x0328, B:112:0x0353, B:114:0x035b, B:116:0x0365, B:121:0x037b, B:123:0x0385, B:126:0x0390, B:128:0x03a2, B:138:0x03b5, B:130:0x03cd, B:132:0x03d3, B:133:0x03d8, B:135:0x03de, B:145:0x033b, B:149:0x0404, B:151:0x043a, B:152:0x0442, B:154:0x0446, B:155:0x0449, B:157:0x04a1, B:159:0x04a5, B:162:0x025b, B:168:0x010e, B:172:0x0118), top: B:27:0x00af, inners: #0, #1, #2 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9682b(com.google.android.gms.measurement.internal.zzm r22) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1838o9.m9682b(com.google.android.gms.measurement.internal.zzm):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9683b(zzv zzvVar) {
        zzm m9646a = m9646a(zzvVar.f8253b);
        if (m9646a != null) {
            m9684b(zzvVar, m9646a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9684b(zzv zzvVar, zzm zzmVar) {
        C1057u.m7286a(zzvVar);
        C1057u.m7296b(zzvVar.f8253b);
        C1057u.m7286a(zzvVar.f8255d);
        C1057u.m7296b(zzvVar.f8255d.f8225c);
        m9667z();
        m9695p();
        if (m9661e(zzmVar)) {
            if (!zzmVar.f8238i) {
                m9686c(zzmVar);
                return;
            }
            m9689f().m9191y();
            try {
                m9686c(zzmVar);
                zzv m9177d = m9689f().m9177d(zzvVar.f8253b, zzvVar.f8255d.f8225c);
                if (m9177d != null) {
                    this.f7933i.mo9324k().m9303A().m9367a("Removing conditional user property", zzvVar.f8253b, this.f7933i.m9427x().m9122c(zzvVar.f8255d.f8225c));
                    m9689f().m9179e(zzvVar.f8253b, zzvVar.f8255d.f8225c);
                    if (m9177d.f8257f) {
                        m9689f().m9173b(zzvVar.f8253b, zzvVar.f8255d.f8225c);
                    }
                    if (zzvVar.f8263l != null) {
                        m9660b(this.f7933i.m9426w().m9936a(zzvVar.f8253b, zzvVar.f8263l.f8220b, zzvVar.f8263l.f8221c != null ? zzvVar.f8263l.f8221c.zzb() : null, m9177d.f8254c, zzvVar.f8263l.f8223e, true, false), zzmVar);
                    }
                } else {
                    this.f7933i.mo9324k().m9312w().m9367a("Conditional user property doesn't exist", C1725f4.m9298a(zzvVar.f8253b), this.f7933i.m9427x().m9122c(zzvVar.f8255d.f8225c));
                }
                m9689f().m9187u();
            } finally {
                m9689f().m9192z();
            }
        }
    }

    /* renamed from: c */
    public final C1702d5 m9685c() {
        m9659b(this.f7925a);
        return this.f7925a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C1714e5 m9686c(zzm zzmVar) {
        m9667z();
        m9695p();
        C1057u.m7286a(zzmVar);
        C1057u.m7296b(zzmVar.f8231b);
        C1714e5 m9171b = m9689f().m9171b(zzmVar.f8231b);
        String m9780b = this.f7933i.m9420q().m9780b(zzmVar.f8231b);
        if (!C1247da.m7771a() || !this.f7933i.m9419p().m9480a(C1828o.f7827O0)) {
            return m9643a(zzmVar, m9171b, m9780b);
        }
        if (m9171b == null) {
            m9171b = new C1714e5(this.f7933i, zzmVar.f8231b);
            m9171b.m9235a(this.f7933i.m9426w().m9964w());
            m9171b.m9252e(m9780b);
        } else if (!m9780b.equals(m9171b.m9279q())) {
            m9171b.m9252e(m9780b);
            m9171b.m9235a(this.f7933i.m9426w().m9964w());
        }
        m9171b.m9241b(zzmVar.f8232c);
        m9171b.m9245c(zzmVar.f8248s);
        if (C1218bb.m7671a() && this.f7933i.m9419p().m9488e(m9171b.m9269l(), C1828o.f7811G0)) {
            m9171b.m9249d(zzmVar.f8252w);
        }
        if (!TextUtils.isEmpty(zzmVar.f8241l)) {
            m9171b.m9255f(zzmVar.f8241l);
        }
        long j = zzmVar.f8235f;
        if (j != 0) {
            m9171b.m9248d(j);
        }
        if (!TextUtils.isEmpty(zzmVar.f8233d)) {
            m9171b.m9257g(zzmVar.f8233d);
        }
        m9171b.m9244c(zzmVar.f8240k);
        String str = zzmVar.f8234e;
        if (str != null) {
            m9171b.m9260h(str);
        }
        m9171b.m9251e(zzmVar.f8236g);
        m9171b.m9237a(zzmVar.f8238i);
        if (!TextUtils.isEmpty(zzmVar.f8237h)) {
            m9171b.m9264i(zzmVar.f8237h);
        }
        m9171b.m9278p(zzmVar.f8242m);
        m9171b.m9242b(zzmVar.f8245p);
        m9171b.m9246c(zzmVar.f8246q);
        if (this.f7933i.m9419p().m9488e(zzmVar.f8231b, C1828o.f7851a0)) {
            m9171b.m9234a(zzmVar.f8249t);
        }
        m9171b.m9254f(zzmVar.f8250u);
        if (m9171b.m9238a()) {
            m9689f().m9163a(m9171b);
        }
        return m9171b;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1751h6
    /* renamed from: d */
    public final C1791ka mo9317d() {
        return this.f7933i.mo9317d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final String m9687d(zzm zzmVar) {
        try {
            return (String) this.f7933i.mo9320g().m9343a(new CallableC1882s9(this, zzmVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f7933i.mo9324k().m9309t().m9367a("Failed to get app instance id. appId", C1725f4.m9298a(zzmVar.f8231b), e);
            return null;
        }
    }

    /* renamed from: e */
    public final C1773j4 m9688e() {
        m9659b(this.f7926b);
        return this.f7926b;
    }

    /* renamed from: f */
    public final C1696d m9689f() {
        m9659b(this.f7927c);
        return this.f7927c;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1751h6
    /* renamed from: g */
    public final C1738g5 mo9320g() {
        return this.f7933i.mo9320g();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1751h6
    /* renamed from: h */
    public final InterfaceC1099e mo9321h() {
        return this.f7933i.mo9321h();
    }

    /* renamed from: i */
    public final C1695ca m9690i() {
        m9659b(this.f7930f);
        return this.f7930f;
    }

    /* renamed from: j */
    public final C1858q7 m9691j() {
        m9659b(this.f7932h);
        return this.f7932h;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1751h6
    /* renamed from: k */
    public final C1725f4 mo9324k() {
        return this.f7933i.mo9324k();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1751h6
    /* renamed from: l */
    public final Context mo9325l() {
        return this.f7933i.mo9325l();
    }

    /* renamed from: m */
    public final C1915v9 m9692m() {
        m9659b(this.f7931g);
        return this.f7931g;
    }

    /* renamed from: n */
    public final C1689c4 m9693n() {
        return this.f7933i.m9427x();
    }

    /* renamed from: o */
    public final C1959z9 m9694o() {
        return this.f7933i.m9426w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m9695p() {
        if (!this.f7934j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final void m9696q() {
        C1714e5 m9171b;
        String str;
        C1749h4 m9304B;
        String str2;
        m9667z();
        m9695p();
        this.f7943s = true;
        try {
            this.f7933i.mo9317d();
            Boolean m9860G = this.f7933i.m9401F().m9860G();
            if (m9860G == null) {
                m9304B = this.f7933i.mo9324k().m9312w();
                str2 = "Upload data called on the client side before use of service was decided";
            } else {
                if (!m9860G.booleanValue()) {
                    if (this.f7937m <= 0) {
                        m9667z();
                        if (this.f7946v != null) {
                            m9304B = this.f7933i.mo9324k().m9304B();
                            str2 = "Uploading requested multiple times";
                        } else {
                            if (m9688e().m9386u()) {
                                long mo7375a = this.f7933i.mo9321h().mo7375a();
                                m9656a((String) null, mo7375a - C1803la.m9474w());
                                long m9792a = this.f7933i.m9420q().f8023e.m9792a();
                                if (m9792a != 0) {
                                    this.f7933i.mo9324k().m9303A().m9366a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(mo7375a - m9792a)));
                                }
                                String m9189w = m9689f().m9189w();
                                if (TextUtils.isEmpty(m9189w)) {
                                    this.f7948x = -1L;
                                    String m9157a = m9689f().m9157a(mo7375a - C1803la.m9474w());
                                    if (!TextUtils.isEmpty(m9157a) && (m9171b = m9689f().m9171b(m9157a)) != null) {
                                        m9651a(m9171b);
                                    }
                                } else {
                                    if (this.f7948x == -1) {
                                        this.f7948x = m9689f().m9190x();
                                    }
                                    List<Pair<C1528x0, Long>> m9159a = m9689f().m9159a(m9189w, this.f7933i.m9419p().m9481b(m9189w, C1828o.f7862g), Math.max(0, this.f7933i.m9419p().m9481b(m9189w, C1828o.f7864h)));
                                    if (!m9159a.isEmpty()) {
                                        Iterator<Pair<C1528x0, Long>> it = m9159a.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                str = null;
                                                break;
                                            }
                                            C1528x0 c1528x0 = (C1528x0) it.next().first;
                                            if (!TextUtils.isEmpty(c1528x0.m8796s())) {
                                                str = c1528x0.m8796s();
                                                break;
                                            }
                                        }
                                        if (str != null) {
                                            int i = 0;
                                            while (true) {
                                                if (i >= m9159a.size()) {
                                                    break;
                                                }
                                                C1528x0 c1528x02 = (C1528x0) m9159a.get(i).first;
                                                if (!TextUtils.isEmpty(c1528x02.m8796s()) && !c1528x02.m8796s().equals(str)) {
                                                    m9159a = m9159a.subList(0, i);
                                                    break;
                                                }
                                                i++;
                                            }
                                        }
                                        C1514w0.a m8625p = C1514w0.m8625p();
                                        int size = m9159a.size();
                                        ArrayList arrayList = new ArrayList(m9159a.size());
                                        boolean m9485d = this.f7933i.m9419p().m9485d(m9189w);
                                        for (int i2 = 0; i2 < size; i2++) {
                                            C1528x0.a m8099l = ((C1528x0) m9159a.get(i2).first).m8099l();
                                            arrayList.add((Long) m9159a.get(i2).second);
                                            m8099l.m8834g(this.f7933i.m9419p().m9491n());
                                            m8099l.m8808a(mo7375a);
                                            this.f7933i.mo9317d();
                                            m8099l.m8819b(false);
                                            if (!m9485d) {
                                                m8099l.m8864z();
                                            }
                                            if (this.f7933i.m9419p().m9488e(m9189w, C1828o.f7861f0)) {
                                                m8099l.m8846l(m9692m().m9824a(((C1528x0) ((AbstractC1406o4) m8099l.mo7537i())).m8880e()));
                                            }
                                            m8625p.m8628a(m8099l);
                                        }
                                        String m9828a = this.f7933i.mo9324k().m9308a(2) ? m9692m().m9828a((C1514w0) ((AbstractC1406o4) m8625p.mo7537i())) : null;
                                        m9692m();
                                        byte[] m8880e = ((C1514w0) ((AbstractC1406o4) m8625p.mo7537i())).m8880e();
                                        String m9875a = C1828o.f7882q.m9875a(null);
                                        try {
                                            URL url = new URL(m9875a);
                                            C1057u.m7293a(!arrayList.isEmpty());
                                            if (this.f7946v != null) {
                                                this.f7933i.mo9324k().m9309t().m9365a("Set uploading progress before finishing the previous upload");
                                            } else {
                                                this.f7946v = new ArrayList(arrayList);
                                            }
                                            this.f7933i.m9420q().f8024f.m9793a(mo7375a);
                                            this.f7933i.mo9324k().m9304B().m9368a("Uploading data. app, uncompressed size, data", size > 0 ? m8625p.m8629a(0).m8790o0() : "?", Integer.valueOf(m8880e.length), m9828a);
                                            this.f7942r = true;
                                            C1773j4 m9688e = m9688e();
                                            C1860q9 c1860q9 = new C1860q9(this, m9189w);
                                            m9688e.mo9194c();
                                            m9688e.m9755r();
                                            C1057u.m7286a(url);
                                            C1057u.m7286a(m8880e);
                                            C1057u.m7286a(c1860q9);
                                            m9688e.mo9320g().m9346b(new RunnableC1821n4(m9688e, m9189w, url, m8880e, null, c1860q9));
                                        } catch (MalformedURLException unused) {
                                            this.f7933i.mo9324k().m9309t().m9367a("Failed to parse upload URL. Not uploading. appId", C1725f4.m9298a(m9189w), m9875a);
                                        }
                                    }
                                }
                            }
                            this.f7933i.mo9324k().m9304B().m9365a("Network not connected, ignoring upload request");
                        }
                    }
                    m9641C();
                }
                m9304B = this.f7933i.mo9324k().m9309t();
                str2 = "Upload called in the client side when service should be used";
            }
            m9304B.m9365a(str2);
        } finally {
            this.f7943s = false;
            m9662u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m9697r() {
        C1749h4 m9309t;
        Integer valueOf;
        Integer valueOf2;
        String str;
        m9667z();
        m9695p();
        if (!this.f7936l) {
            this.f7936l = true;
            m9667z();
            m9695p();
            if ((this.f7933i.m9419p().m9480a(C1828o.f7855c0) || m9664w()) && m9663v()) {
                int m9642a = m9642a(this.f7945u);
                int m9104F = this.f7933i.m9403H().m9104F();
                m9667z();
                if (m9642a > m9104F) {
                    m9309t = this.f7933i.mo9324k().m9309t();
                    valueOf = Integer.valueOf(m9642a);
                    valueOf2 = Integer.valueOf(m9104F);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (m9642a < m9104F) {
                    if (m9654a(m9104F, this.f7945u)) {
                        m9309t = this.f7933i.mo9324k().m9304B();
                        valueOf = Integer.valueOf(m9642a);
                        valueOf2 = Integer.valueOf(m9104F);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        m9309t = this.f7933i.mo9324k().m9309t();
                        valueOf = Integer.valueOf(m9642a);
                        valueOf2 = Integer.valueOf(m9104F);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                m9309t.m9367a(str, valueOf, valueOf2);
            }
        }
        if (this.f7935k || this.f7933i.m9419p().m9480a(C1828o.f7855c0)) {
            return;
        }
        this.f7933i.mo9324k().m9315z().m9365a("This instance being marked as an uploader");
        this.f7935k = true;
        m9641C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m9698s() {
        this.f7940p++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final C1774j5 m9699t() {
        return this.f7933i;
    }
}
