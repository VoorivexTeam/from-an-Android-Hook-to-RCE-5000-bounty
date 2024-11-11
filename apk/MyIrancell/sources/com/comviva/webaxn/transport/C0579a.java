package com.comviva.webaxn.transport;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0641k;
import com.comviva.webaxn.p002ui.C0644l;
import com.comviva.webaxn.p002ui.WebAxnActivity;
import com.comviva.webaxn.utils.C0719l1;
import com.comviva.webaxn.utils.C0755x1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPOutputStream;
import p000.C3400wj;

/* renamed from: com.comviva.webaxn.transport.a */
/* loaded from: classes.dex */
public class C0579a {

    /* renamed from: a */
    private Context f3285a;

    /* renamed from: c */
    private long f3287c;

    /* renamed from: d */
    private long f3288d;

    /* renamed from: g */
    private PowerManager.WakeLock f3291g;

    /* renamed from: h */
    private Handler f3292h = new Handler(new a(this));

    /* renamed from: f */
    private ConcurrentHashMap<C0719l1, c> f3290f = new ConcurrentHashMap<>();

    /* renamed from: e */
    private CopyOnWriteArrayList<C0719l1> f3289e = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private int f3286b = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.transport.a$a */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        a(C0579a c0579a) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C0719l1 c0719l1;
            C0755x1.k kVar;
            if (message.what != 4 || (c0719l1 = (C0719l1) message.obj) == null || (kVar = c0719l1.f4964q) == null) {
                return false;
            }
            kVar.mo6198b(c0719l1);
            return false;
        }
    }

    /* renamed from: com.comviva.webaxn.transport.a$b */
    /* loaded from: classes.dex */
    private class b extends AsyncTask<C0719l1, Integer, C0719l1> {

        /* renamed from: a */
        C0719l1 f3293a;

        private b() {
        }

        /* synthetic */ b(C0579a c0579a, a aVar) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
            	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
            	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
            	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
            	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
            	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
            	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
            */
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.comviva.webaxn.utils.C0719l1 doInBackground(com.comviva.webaxn.utils.C0719l1... r17) {
            /*
                Method dump skipped, instructions count: 1259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.transport.C0579a.b.doInBackground(com.comviva.webaxn.utils.l1[]):com.comviva.webaxn.utils.l1");
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(C0719l1 c0719l1) {
            if (c0719l1 != null && c0719l1.f4964q != null) {
                if (c0719l1.m5866h() == 3) {
                    c0719l1.f4964q.mo6198b(c0719l1);
                } else {
                    c0719l1.f4964q.mo6196a(c0719l1);
                }
            }
            C0579a.this.m3991h();
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            C0719l1 c0719l1 = this.f3293a;
            if (c0719l1 != null) {
                c0719l1.m5858a((byte[]) null);
                this.f3293a.m5860b(3);
                onPostExecute(this.f3293a);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            C0579a.this.m3979c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.comviva.webaxn.transport.a$c */
    /* loaded from: classes.dex */
    public class c extends AsyncTask<C0719l1, Integer, C0719l1> {

        /* renamed from: a */
        C0719l1 f3295a;

        private c() {
        }

        /* synthetic */ c(C0579a c0579a, a aVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:256:0x0564, code lost:
        
            if (r5 == null) goto L227;
         */
        /* JADX WARN: Removed duplicated region for block: B:266:0x0637  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0515  */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.comviva.webaxn.utils.C0719l1 doInBackground(com.comviva.webaxn.utils.C0719l1... r17) {
            /*
                Method dump skipped, instructions count: 1596
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.transport.C0579a.c.doInBackground(com.comviva.webaxn.utils.l1[]):com.comviva.webaxn.utils.l1");
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(C0719l1 c0719l1) {
            C0755x1.k kVar;
            int i;
            if (c0719l1 != null) {
                if (c0719l1.f4964q != null) {
                    if (c0719l1.m5866h() == 3) {
                        c0719l1.f4964q.mo6198b(c0719l1);
                    } else {
                        c0719l1.f4964q.mo6196a(c0719l1);
                        Iterator it = C0579a.this.f3289e.iterator();
                        while (it.hasNext()) {
                            C0719l1 c0719l12 = (C0719l1) it.next();
                            if (c0719l12.f4954g == c0719l1.f4952e) {
                                c0719l12.f4964q.mo6196a(c0719l12);
                                C0579a.this.f3289e.remove(c0719l12);
                            }
                        }
                    }
                }
                C0579a.this.f3290f.remove(c0719l1);
            }
            if (C0579a.this.m3989g() != 1) {
                C0579a.this.m3991h();
            }
            if (C0579a.this.f3290f.size() != 0 || c0719l1 == null || (kVar = c0719l1.f4964q) == null || (i = c0719l1.f4950c) == 4 || i == 5 || i == 9 || i == 15 || i == 16) {
                return;
            }
            kVar.mo6197a(c0719l1.f4971x);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            try {
                if (((WebAxnActivity) C0579a.this.f3285a).m4078b().m16343t() != null) {
                    int intValue = C3400wj.f13839Z + numArr[0].intValue();
                    C3400wj.f13839Z = intValue;
                    if (intValue < 95) {
                        ((WebAxnActivity) C0579a.this.f3285a).m4078b().m16343t().m4809d().setProgress(C3400wj.f13839Z);
                    }
                }
                if (WebAxnActivity.f3410r != null) {
                    int intValue2 = WebAxnActivity.f3415w + numArr[0].intValue();
                    WebAxnActivity.f3415w = intValue2;
                    if (intValue2 < 95) {
                        WebAxnActivity.f3410r.setProgress(WebAxnActivity.f3415w);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            C0719l1 c0719l1 = this.f3295a;
            if (c0719l1 != null) {
                c0719l1.m5858a((byte[]) null);
                this.f3295a.m5860b(3);
                onPostExecute(this.f3295a);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            C0579a.this.m3979c();
        }
    }

    public C0579a(Context context) {
        this.f3285a = context;
    }

    /* renamed from: a */
    public static HttpURLConnection m3968a(String str, boolean z) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(50000);
        httpURLConnection.setReadTimeout(50000);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3972a(C0719l1 c0719l1, boolean z) {
        if (z) {
            c0719l1.m5867i().m6018e();
        }
    }

    /* renamed from: a */
    static /* synthetic */ byte[] m3973a(C0579a c0579a, byte[] bArr) {
        return c0579a.m3974a(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:61:0x004c */
    /* renamed from: a */
    public byte[] m3974a(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream2;
        byte[] bArr2 = null;
        r0 = null;
        bArr2 = null;
        bArr2 = null;
        GZIPOutputStream gZIPOutputStream3 = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                    try {
                        gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            try {
                                gZIPOutputStream2.write(bArr);
                            } finally {
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        try {
                            bArr2 = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            if (gZIPOutputStream2 != null) {
                                try {
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            return bArr2;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        gZIPOutputStream2 = null;
                    } catch (Throwable th) {
                        th = th;
                        if (gZIPOutputStream3 != null) {
                            try {
                                gZIPOutputStream3.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            } catch (Exception e8) {
                e = e8;
                byteArrayOutputStream = null;
                gZIPOutputStream2 = null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
            return bArr2;
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream3 = gZIPOutputStream;
        }
    }

    /* renamed from: b */
    static /* synthetic */ byte[] m3977b(C0579a c0579a, byte[] bArr) {
        return c0579a.m3978b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d A[Catch: all -> 0x0054, Exception -> 0x0057, TRY_ENTER, TryCatch #16 {Exception -> 0x0057, all -> 0x0054, blocks: (B:39:0x004d, B:40:0x0050, B:21:0x002d, B:22:0x0030, B:35:0x003d), top: B:7:0x000d }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m3978b(byte[] r10) {
        /*
            r9 = this;
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7e
            r2.<init>(r1)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7e
            r3 = 16384(0x4000, float:2.2959E-41)
            int r10 = r10.length     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L16
            if (r10 <= r3) goto L11
            goto L16
        L11:
            r3 = r10
            goto L16
        L13:
            r10 = move-exception
            r4 = r0
            goto L4b
        L16:
            byte[] r10 = new byte[r3]     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L36
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L36
        L1d:
            r5 = 0
            int r6 = r2.read(r10, r5, r3)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L4a
            r7 = -1
            if (r6 <= r7) goto L29
            r4.write(r10, r5, r6)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L4a
            goto L1d
        L29:
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L4a
            r4.close()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
        L30:
            r2.close()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            goto L41
        L34:
            r10 = move-exception
            goto L38
        L36:
            r10 = move-exception
            r4 = r0
        L38:
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L30
            r4.close()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            goto L30
        L41:
            r1.close()     // Catch: java.io.IOException -> L45
            goto L7d
        L45:
            r10 = move-exception
            r10.printStackTrace()
            goto L7d
        L4a:
            r10 = move-exception
        L4b:
            if (r4 == 0) goto L50
            r4.close()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
        L50:
            r2.close()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            throw r10     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L7e
        L54:
            r10 = move-exception
            r0 = r2
            goto L7f
        L57:
            r10 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L65
        L5c:
            r10 = move-exception
            r2 = r0
            goto L65
        L5f:
            r10 = move-exception
            r1 = r0
            goto L7f
        L62:
            r10 = move-exception
            r1 = r0
            r2 = r1
        L65:
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L72
            r0.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r10 = move-exception
            r10.printStackTrace()
        L72:
            if (r1 == 0) goto L7c
            r1.close()     // Catch: java.io.IOException -> L78
            goto L7c
        L78:
            r10 = move-exception
            r10.printStackTrace()
        L7c:
            r0 = r2
        L7d:
            return r0
        L7e:
            r10 = move-exception
        L7f:
            if (r0 == 0) goto L89
            r0.close()     // Catch: java.io.IOException -> L85
            goto L89
        L85:
            r0 = move-exception
            r0.printStackTrace()
        L89:
            if (r1 == 0) goto L93
            r1.close()     // Catch: java.io.IOException -> L8f
            goto L93
        L8f:
            r0 = move-exception
            r0.printStackTrace()
        L93:
            goto L95
        L94:
            throw r10
        L95:
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.transport.C0579a.m3978b(byte[]):byte[]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m3979c() {
        m3984e();
        PowerManager.WakeLock wakeLock = this.f3291g;
        if (wakeLock == null || wakeLock.isHeld()) {
            return;
        }
        this.f3291g.acquire();
    }

    /* renamed from: d */
    static /* synthetic */ Context m3981d(C0579a c0579a) {
        return c0579a.f3285a;
    }

    /* renamed from: d */
    private boolean m3982d() {
        ConcurrentHashMap<C0719l1, c> concurrentHashMap = this.f3290f;
        return concurrentHashMap == null || concurrentHashMap.size() < 5;
    }

    /* renamed from: e */
    private int m3983e(C0719l1 c0719l1) {
        if (!m3982d()) {
            this.f3289e.add(c0719l1);
            this.f3286b = 3;
            return 2;
        }
        c cVar = new c(this, null);
        this.f3290f.put(c0719l1, cVar);
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, c0719l1);
            } else {
                cVar.execute(c0719l1);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        this.f3286b = 2;
        return 1;
    }

    /* renamed from: e */
    private synchronized void m3984e() {
        if (this.f3291g == null) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) this.f3285a.getSystemService("power")).newWakeLock(1, "Communicator:WakeLockTag");
            this.f3291g = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
    }

    /* renamed from: f */
    private long m3986f() {
        long j = this.f3288d + 1;
        this.f3288d = j;
        return j;
    }

    /* renamed from: f */
    static /* synthetic */ CopyOnWriteArrayList m3987f(C0579a c0579a) {
        return c0579a.f3289e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m3988f(C0719l1 c0719l1) {
        if (c0719l1.m5867i() != null) {
            return c0719l1.m5867i().m6014a();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public int m3989g() {
        CopyOnWriteArrayList<C0719l1> copyOnWriteArrayList = this.f3289e;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<C0719l1> it = this.f3289e.iterator();
            while (it.hasNext()) {
                C0719l1 next = it.next();
                if (next.f4954g == 0) {
                    c cVar = new c(this, null);
                    this.f3289e.remove(next);
                    this.f3290f.put(next, cVar);
                    try {
                        if (Build.VERSION.SDK_INT >= 11) {
                            cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, next);
                        } else {
                            cVar.execute(next);
                        }
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    }
                    return 1;
                }
            }
        }
        this.f3286b = 2;
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m3990g(C0719l1 c0719l1) {
        if (c0719l1.m5867i() != null) {
            c0719l1.m5867i().m6020g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m3991h() {
        PowerManager.WakeLock wakeLock = this.f3291g;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.f3291g.release();
    }

    /* renamed from: a */
    public int m3992a(C0719l1 c0719l1) {
        if (c0719l1 == null) {
            return -1;
        }
        if (c0719l1.f4956i == 1) {
            m3995b(c0719l1);
        }
        int i = this.f3286b;
        if (i == 1 || i == 2) {
            c0719l1.f4952e = m3986f();
            return m3983e(c0719l1);
        }
        if (i != 3) {
            return 0;
        }
        c0719l1.f4952e = m3986f();
        this.f3289e.add(c0719l1);
        return 2;
    }

    /* renamed from: a */
    public void m3993a() {
        CopyOnWriteArrayList<C0719l1> copyOnWriteArrayList = this.f3289e;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        this.f3289e.clear();
    }

    /* renamed from: b */
    public long m3994b() {
        long j = this.f3287c + 1;
        this.f3287c = j;
        return j;
    }

    /* renamed from: b */
    boolean m3995b(C0719l1 c0719l1) {
        boolean z;
        ConcurrentHashMap<C0719l1, c> concurrentHashMap;
        CopyOnWriteArrayList<C0719l1> copyOnWriteArrayList = this.f3289e;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Iterator<C0719l1> it = this.f3289e.iterator();
            while (it.hasNext()) {
                C0719l1 next = it.next();
                String str = c0719l1.f4957j;
                if (str != null && true == next.f4957j.equals(str) && next.f4954g == 0) {
                    c0719l1.f4954g = next.f4952e;
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z && (concurrentHashMap = this.f3290f) != null && concurrentHashMap.size() > 0) {
            for (C0719l1 c0719l12 : this.f3290f.keySet()) {
                String str2 = c0719l1.f4957j;
                if (str2 != null && true == c0719l12.f4957j.equals(str2) && c0719l12.f4954g == 0) {
                    c0719l1.f4954g = c0719l12.f4952e;
                    return true;
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public int m3996c(C0719l1 c0719l1) {
        AbstractC0652n1 abstractC0652n1;
        int i;
        ConcurrentHashMap<C0719l1, c> concurrentHashMap = this.f3290f;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return -2;
        }
        c cVar = this.f3290f.get(c0719l1);
        if (cVar != null && !cVar.isCancelled()) {
            c0719l1.f4962o = true;
            cVar.cancel(true);
            this.f3290f.remove(c0719l1);
            if (c0719l1 != null && (abstractC0652n1 = c0719l1.f4965r) != null && -1 < (i = c0719l1.f4966s)) {
                if (abstractC0652n1 instanceof C0641k) {
                    ((C0641k) abstractC0652n1).m4533i(i);
                } else if (abstractC0652n1 instanceof C0644l) {
                    ((C0644l) abstractC0652n1).m4630i(i);
                }
            }
            return 1;
        }
        CopyOnWriteArrayList<C0719l1> copyOnWriteArrayList = this.f3289e;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return -2;
        }
        Iterator<C0719l1> it = this.f3289e.iterator();
        while (it.hasNext()) {
            if (it.next() == c0719l1) {
                this.f3289e.remove(c0719l1);
                c0719l1.m5858a((byte[]) null);
                c0719l1.m5860b(3);
                Message obtainMessage = this.f3292h.obtainMessage();
                obtainMessage.what = 4;
                obtainMessage.obj = c0719l1;
                this.f3292h.sendMessage(obtainMessage);
                return 1;
            }
        }
        return -2;
    }

    /* renamed from: d */
    public void m3997d(C0719l1 c0719l1) {
        b bVar = new b(this, null);
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, c0719l1);
            } else {
                bVar.execute(c0719l1);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
