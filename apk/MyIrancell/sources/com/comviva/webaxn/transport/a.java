package com.comviva.webaxn.transport;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import com.comviva.webaxn.ui.WebAxnActivity;
import com.comviva.webaxn.ui.k;
import com.comviva.webaxn.ui.l;
import com.comviva.webaxn.ui.n1;
import com.comviva.webaxn.utils.l1;
import com.comviva.webaxn.utils.x1;
import defpackage.wj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public class a {
    private Context a;
    private long c;
    private long d;
    private PowerManager.WakeLock g;
    private Handler h = new Handler(new C0028a(this));
    private ConcurrentHashMap<l1, c> f = new ConcurrentHashMap<>();
    private CopyOnWriteArrayList<l1> e = new CopyOnWriteArrayList<>();
    private int b = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.transport.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0028a implements Handler.Callback {
        C0028a(a aVar) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            l1 l1Var;
            x1.k kVar;
            if (message.what != 4 || (l1Var = (l1) message.obj) == null || (kVar = l1Var.q) == null) {
                return false;
            }
            kVar.b(l1Var);
            return false;
        }
    }

    /* loaded from: classes.dex */
    private class b extends AsyncTask<l1, Integer, l1> {
        l1 a;

        private b() {
        }

        /* synthetic */ b(a aVar, C0028a c0028a) {
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
        public com.comviva.webaxn.utils.l1 doInBackground(com.comviva.webaxn.utils.l1... r17) {
            /*
                Method dump skipped, instructions count: 1259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.transport.a.b.doInBackground(com.comviva.webaxn.utils.l1[]):com.comviva.webaxn.utils.l1");
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(l1 l1Var) {
            if (l1Var != null && l1Var.q != null) {
                if (l1Var.h() == 3) {
                    l1Var.q.b(l1Var);
                } else {
                    l1Var.q.a(l1Var);
                }
            }
            a.this.h();
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            l1 l1Var = this.a;
            if (l1Var != null) {
                l1Var.a((byte[]) null);
                this.a.b(3);
                onPostExecute(this.a);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            a.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends AsyncTask<l1, Integer, l1> {
        l1 a;

        private c() {
        }

        /* synthetic */ c(a aVar, C0028a c0028a) {
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
        public com.comviva.webaxn.utils.l1 doInBackground(com.comviva.webaxn.utils.l1... r17) {
            /*
                Method dump skipped, instructions count: 1596
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.transport.a.c.doInBackground(com.comviva.webaxn.utils.l1[]):com.comviva.webaxn.utils.l1");
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(l1 l1Var) {
            x1.k kVar;
            int i;
            if (l1Var != null) {
                if (l1Var.q != null) {
                    if (l1Var.h() == 3) {
                        l1Var.q.b(l1Var);
                    } else {
                        l1Var.q.a(l1Var);
                        Iterator it = a.this.e.iterator();
                        while (it.hasNext()) {
                            l1 l1Var2 = (l1) it.next();
                            if (l1Var2.g == l1Var.e) {
                                l1Var2.q.a(l1Var2);
                                a.this.e.remove(l1Var2);
                            }
                        }
                    }
                }
                a.this.f.remove(l1Var);
            }
            if (a.this.g() != 1) {
                a.this.h();
            }
            if (a.this.f.size() != 0 || l1Var == null || (kVar = l1Var.q) == null || (i = l1Var.c) == 4 || i == 5 || i == 9 || i == 15 || i == 16) {
                return;
            }
            kVar.a(l1Var.x);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            try {
                if (((WebAxnActivity) a.this.a).b().t() != null) {
                    int intValue = wj.Z + numArr[0].intValue();
                    wj.Z = intValue;
                    if (intValue < 95) {
                        ((WebAxnActivity) a.this.a).b().t().d().setProgress(wj.Z);
                    }
                }
                if (WebAxnActivity.r != null) {
                    int intValue2 = WebAxnActivity.w + numArr[0].intValue();
                    WebAxnActivity.w = intValue2;
                    if (intValue2 < 95) {
                        WebAxnActivity.r.setProgress(WebAxnActivity.w);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            l1 l1Var = this.a;
            if (l1Var != null) {
                l1Var.a((byte[]) null);
                this.a.b(3);
                onPostExecute(this.a);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            a.this.c();
        }
    }

    public a(Context context) {
        this.a = context;
    }

    public static HttpURLConnection a(String str, boolean z) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(50000);
        httpURLConnection.setReadTimeout(50000);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l1 l1Var, boolean z) {
        if (z) {
            l1Var.i().e();
        }
    }

    static /* synthetic */ byte[] a(a aVar, byte[] bArr) {
        return aVar.a(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:61:0x004c */
    public byte[] a(byte[] bArr) {
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

    static /* synthetic */ byte[] b(a aVar, byte[] bArr) {
        return aVar.b(bArr);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] b(byte[] r10) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.transport.a.b(byte[]):byte[]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        e();
        PowerManager.WakeLock wakeLock = this.g;
        if (wakeLock == null || wakeLock.isHeld()) {
            return;
        }
        this.g.acquire();
    }

    static /* synthetic */ Context d(a aVar) {
        return aVar.a;
    }

    private boolean d() {
        ConcurrentHashMap<l1, c> concurrentHashMap = this.f;
        return concurrentHashMap == null || concurrentHashMap.size() < 5;
    }

    private int e(l1 l1Var) {
        if (!d()) {
            this.e.add(l1Var);
            this.b = 3;
            return 2;
        }
        c cVar = new c(this, null);
        this.f.put(l1Var, cVar);
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, l1Var);
            } else {
                cVar.execute(l1Var);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        this.b = 2;
        return 1;
    }

    private synchronized void e() {
        if (this.g == null) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) this.a.getSystemService("power")).newWakeLock(1, "Communicator:WakeLockTag");
            this.g = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
    }

    private long f() {
        long j = this.d + 1;
        this.d = j;
        return j;
    }

    static /* synthetic */ CopyOnWriteArrayList f(a aVar) {
        return aVar.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(l1 l1Var) {
        if (l1Var.i() != null) {
            return l1Var.i().a();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g() {
        CopyOnWriteArrayList<l1> copyOnWriteArrayList = this.e;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<l1> it = this.e.iterator();
            while (it.hasNext()) {
                l1 next = it.next();
                if (next.g == 0) {
                    c cVar = new c(this, null);
                    this.e.remove(next);
                    this.f.put(next, cVar);
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
        this.b = 2;
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(l1 l1Var) {
        if (l1Var.i() != null) {
            l1Var.i().g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        PowerManager.WakeLock wakeLock = this.g;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.g.release();
    }

    public int a(l1 l1Var) {
        if (l1Var == null) {
            return -1;
        }
        if (l1Var.i == 1) {
            b(l1Var);
        }
        int i = this.b;
        if (i == 1 || i == 2) {
            l1Var.e = f();
            return e(l1Var);
        }
        if (i != 3) {
            return 0;
        }
        l1Var.e = f();
        this.e.add(l1Var);
        return 2;
    }

    public void a() {
        CopyOnWriteArrayList<l1> copyOnWriteArrayList = this.e;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        this.e.clear();
    }

    public long b() {
        long j = this.c + 1;
        this.c = j;
        return j;
    }

    boolean b(l1 l1Var) {
        boolean z;
        ConcurrentHashMap<l1, c> concurrentHashMap;
        CopyOnWriteArrayList<l1> copyOnWriteArrayList = this.e;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Iterator<l1> it = this.e.iterator();
            while (it.hasNext()) {
                l1 next = it.next();
                String str = l1Var.j;
                if (str != null && true == next.j.equals(str) && next.g == 0) {
                    l1Var.g = next.e;
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z && (concurrentHashMap = this.f) != null && concurrentHashMap.size() > 0) {
            for (l1 l1Var2 : this.f.keySet()) {
                String str2 = l1Var.j;
                if (str2 != null && true == l1Var2.j.equals(str2) && l1Var2.g == 0) {
                    l1Var.g = l1Var2.e;
                    return true;
                }
            }
        }
        return z;
    }

    public int c(l1 l1Var) {
        n1 n1Var;
        int i;
        ConcurrentHashMap<l1, c> concurrentHashMap = this.f;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return -2;
        }
        c cVar = this.f.get(l1Var);
        if (cVar != null && !cVar.isCancelled()) {
            l1Var.o = true;
            cVar.cancel(true);
            this.f.remove(l1Var);
            if (l1Var != null && (n1Var = l1Var.r) != null && -1 < (i = l1Var.s)) {
                if (n1Var instanceof k) {
                    ((k) n1Var).i(i);
                } else if (n1Var instanceof l) {
                    ((l) n1Var).i(i);
                }
            }
            return 1;
        }
        CopyOnWriteArrayList<l1> copyOnWriteArrayList = this.e;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return -2;
        }
        Iterator<l1> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next() == l1Var) {
                this.e.remove(l1Var);
                l1Var.a((byte[]) null);
                l1Var.b(3);
                Message obtainMessage = this.h.obtainMessage();
                obtainMessage.what = 4;
                obtainMessage.obj = l1Var;
                this.h.sendMessage(obtainMessage);
                return 1;
            }
        }
        return -2;
    }

    public void d(l1 l1Var) {
        b bVar = new b(this, null);
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, l1Var);
            } else {
                bVar.execute(l1Var);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
