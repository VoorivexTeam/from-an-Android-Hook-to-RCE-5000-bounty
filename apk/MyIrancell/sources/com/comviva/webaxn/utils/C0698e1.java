package com.comviva.webaxn.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.C2493g0;

/* renamed from: com.comviva.webaxn.utils.e1 */
/* loaded from: classes.dex */
public class C0698e1 {

    /* renamed from: g */
    private static C0698e1 f4740g;

    /* renamed from: h */
    private static final Bitmap.CompressFormat f4741h = Bitmap.CompressFormat.JPEG;

    /* renamed from: a */
    private C0717l f4742a;

    /* renamed from: b */
    private C2493g0<String, Bitmap> f4743b;

    /* renamed from: c */
    private C2493g0<String, Drawable> f4744c;

    /* renamed from: d */
    private b f4745d;

    /* renamed from: e */
    private final Object f4746e = new Object();

    /* renamed from: f */
    private Set<SoftReference<Bitmap>> f4747f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.e1$a */
    /* loaded from: classes.dex */
    public class a extends C2493g0<String, Bitmap> {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p000.C2493g0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int mo5437b(String str, Bitmap bitmap) {
            int m5419a = C0698e1.m5419a(bitmap) / 1024;
            if (m5419a == 0) {
                return 1;
            }
            return m5419a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p000.C2493g0
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo5436a(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
            if (C0740s1.m6029c()) {
                C0698e1.this.f4747f.add(new SoftReference(bitmap));
            }
        }
    }

    /* renamed from: com.comviva.webaxn.utils.e1$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        public File f4751c;

        /* renamed from: a */
        public int f4749a = 5120;

        /* renamed from: b */
        public int f4750b = 10485760;

        /* renamed from: d */
        public Bitmap.CompressFormat f4752d = C0698e1.f4741h;

        /* renamed from: e */
        public int f4753e = 70;

        /* renamed from: f */
        public boolean f4754f = true;

        /* renamed from: g */
        public boolean f4755g = true;

        /* renamed from: h */
        public boolean f4756h = false;

        public b(Context context, String str) {
            this.f4751c = C0698e1.m5422a(context, str);
        }

        /* renamed from: a */
        public void m5438a(float f) {
            if (f < 0.01f || f > 0.8f) {
                throw new IllegalArgumentException("setMemCacheSizePercent - percent must be between 0.01 and 0.8 (inclusive)");
            }
            this.f4749a = Math.round((f * ((float) Runtime.getRuntime().maxMemory())) / 1024.0f);
        }
    }

    private C0698e1(b bVar) {
        m5431a(bVar);
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m5419a(Bitmap bitmap) {
        return C0740s1.m6032f() ? bitmap.getAllocationByteCount() : C0740s1.m6030d() ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
    }

    @TargetApi(9)
    /* renamed from: a */
    public static long m5420a(File file) {
        if (C0740s1.m6028b()) {
            return file.getUsableSpace();
        }
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }

    @TargetApi(8)
    /* renamed from: a */
    public static File m5421a(Context context) {
        if (C0740s1.m6027a()) {
            return context.getExternalCacheDir();
        }
        return new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
    }

    /* renamed from: a */
    public static File m5422a(Context context, String str) {
        File m5421a;
        try {
            if (!"mounted".equals(Environment.getExternalStorageState()) && m5428c()) {
                m5421a = context.getCacheDir();
                return new File(m5421a.getPath() + File.separator + str);
            }
            m5421a = m5421a(context);
            return new File(m5421a.getPath() + File.separator + str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m5423a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static C0698e1 m5426b(Context context) {
        if (f4740g == null) {
            b bVar = new b(context, "images");
            bVar.m5438a(0.25f);
            f4740g = new C0698e1(bVar);
        }
        return f4740g;
    }

    /* renamed from: c */
    public static String m5427c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes());
            return m5423a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    @TargetApi(9)
    /* renamed from: c */
    public static boolean m5428c() {
        if (C0740s1.m6028b()) {
            return Environment.isExternalStorageRemovable();
        }
        return true;
    }

    /* renamed from: a */
    public Bitmap m5429a(String str) {
        C2493g0<String, Bitmap> c2493g0 = this.f4743b;
        if (c2493g0 != null) {
            return c2493g0.m11861b(str);
        }
        return null;
    }

    /* renamed from: a */
    public void m5430a() {
        synchronized (this.f4746e) {
            if (this.f4742a == null || this.f4742a.m5826c()) {
                File file = this.f4745d.f4751c;
                if (this.f4745d.f4755g && file != null) {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (m5420a(file) > this.f4745d.f4750b) {
                        try {
                            this.f4742a = C0717l.m5801a(file, 1, 1, this.f4745d.f4750b);
                        } catch (IOException e) {
                            this.f4745d.f4751c = null;
                            String str = "initDiskCache - " + e;
                        }
                    }
                }
            }
            this.f4746e.notifyAll();
        }
    }

    /* renamed from: a */
    public void m5431a(b bVar) {
        this.f4745d = bVar;
        if (bVar.f4754f) {
            if (C0740s1.m6029c()) {
                this.f4747f = Collections.synchronizedSet(new HashSet());
            }
            this.f4743b = new a(this.f4745d.f4749a);
        }
        if (bVar.f4756h) {
            m5430a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (0 == 0) goto L36;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5432a(java.lang.String r5, android.graphics.Bitmap r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L82
            if (r6 != 0) goto L6
            goto L82
        L6:
            g0<java.lang.String, android.graphics.Bitmap> r0 = r4.f4743b
            if (r0 == 0) goto Ld
            r0.m11858a(r5, r6)
        Ld:
            java.lang.Object r0 = r4.f4746e
            monitor-enter(r0)
            com.comviva.webaxn.utils.l r1 = r4.f4742a     // Catch: java.lang.Throwable -> L7f
            if (r1 == 0) goto L7d
            java.lang.String r5 = m5427c(r5)     // Catch: java.lang.Throwable -> L7f
            r1 = 0
            com.comviva.webaxn.utils.l r2 = r4.f4742a     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            com.comviva.webaxn.utils.l$d r2 = r2.m5825b(r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            r3 = 0
            if (r2 != 0) goto L40
            com.comviva.webaxn.utils.l r2 = r4.f4742a     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            com.comviva.webaxn.utils.l$b r5 = r2.m5823a(r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            if (r5 == 0) goto L47
            java.io.OutputStream r1 = r5.m5830a(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            com.comviva.webaxn.utils.e1$b r2 = r4.f4745d     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            android.graphics.Bitmap$CompressFormat r2 = r2.f4752d     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            com.comviva.webaxn.utils.e1$b r3 = r4.f4745d     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            int r3 = r3.f4753e     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            r6.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            r5.m5832b()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            r1.close()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            goto L47
        L40:
            java.io.InputStream r5 = r2.m5847a(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            r5.close()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
        L47:
            if (r1 == 0) goto L7d
        L49:
            r1.close()     // Catch: java.io.IOException -> L7d java.lang.Throwable -> L7f
            goto L7d
        L4d:
            r5 = move-exception
            goto L77
        L4f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r6.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "addBitmapToCache - "
            r6.append(r2)     // Catch: java.lang.Throwable -> L4d
            r6.append(r5)     // Catch: java.lang.Throwable -> L4d
            r6.toString()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L7d
            goto L49
        L63:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r6.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "addBitmapToCache - "
            r6.append(r2)     // Catch: java.lang.Throwable -> L4d
            r6.append(r5)     // Catch: java.lang.Throwable -> L4d
            r6.toString()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L7d
            goto L49
        L77:
            if (r1 == 0) goto L7c
            r1.close()     // Catch: java.io.IOException -> L7c java.lang.Throwable -> L7f
        L7c:
            throw r5     // Catch: java.lang.Throwable -> L7f
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7f
            return
        L7f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7f
            throw r5
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0698e1.m5432a(java.lang.String, android.graphics.Bitmap):void");
    }

    /* renamed from: a */
    public void m5433a(String str, Drawable drawable) {
        if (TextUtils.isEmpty(str) || drawable == null) {
            return;
        }
        if (this.f4744c == null) {
            this.f4744c = new C2493g0<>(5120);
        }
        this.f4744c.m11858a(str, drawable);
    }

    /* renamed from: b */
    public Drawable m5434b(String str) {
        if (this.f4744c == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f4744c.m11861b(str);
    }
}
