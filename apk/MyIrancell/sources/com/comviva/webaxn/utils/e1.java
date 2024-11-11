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

/* loaded from: classes.dex */
public class e1 {
    private static e1 g;
    private static final Bitmap.CompressFormat h = Bitmap.CompressFormat.JPEG;
    private l a;
    private defpackage.g0<String, Bitmap> b;
    private defpackage.g0<String, Drawable> c;
    private b d;
    private final Object e = new Object();
    private Set<SoftReference<Bitmap>> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends defpackage.g0<String, Bitmap> {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.g0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int b(String str, Bitmap bitmap) {
            int a = e1.a(bitmap) / 1024;
            if (a == 0) {
                return 1;
            }
            return a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.g0
        public void a(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
            if (s1.c()) {
                e1.this.f.add(new SoftReference(bitmap));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public File c;
        public int a = 5120;
        public int b = 10485760;
        public Bitmap.CompressFormat d = e1.h;
        public int e = 70;
        public boolean f = true;
        public boolean g = true;
        public boolean h = false;

        public b(Context context, String str) {
            this.c = e1.a(context, str);
        }

        public void a(float f) {
            if (f < 0.01f || f > 0.8f) {
                throw new IllegalArgumentException("setMemCacheSizePercent - percent must be between 0.01 and 0.8 (inclusive)");
            }
            this.a = Math.round((f * ((float) Runtime.getRuntime().maxMemory())) / 1024.0f);
        }
    }

    private e1(b bVar) {
        a(bVar);
    }

    @TargetApi(19)
    public static int a(Bitmap bitmap) {
        return s1.f() ? bitmap.getAllocationByteCount() : s1.d() ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
    }

    @TargetApi(9)
    public static long a(File file) {
        if (s1.b()) {
            return file.getUsableSpace();
        }
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }

    @TargetApi(8)
    public static File a(Context context) {
        if (s1.a()) {
            return context.getExternalCacheDir();
        }
        return new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
    }

    public static File a(Context context, String str) {
        File a2;
        try {
            if (!"mounted".equals(Environment.getExternalStorageState()) && c()) {
                a2 = context.getCacheDir();
                return new File(a2.getPath() + File.separator + str);
            }
            a2 = a(context);
            return new File(a2.getPath() + File.separator + str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(byte[] bArr) {
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

    public static e1 b(Context context) {
        if (g == null) {
            b bVar = new b(context, "images");
            bVar.a(0.25f);
            g = new e1(bVar);
        }
        return g;
    }

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    @TargetApi(9)
    public static boolean c() {
        if (s1.b()) {
            return Environment.isExternalStorageRemovable();
        }
        return true;
    }

    public Bitmap a(String str) {
        defpackage.g0<String, Bitmap> g0Var = this.b;
        if (g0Var != null) {
            return g0Var.b(str);
        }
        return null;
    }

    public void a() {
        synchronized (this.e) {
            if (this.a == null || this.a.c()) {
                File file = this.d.c;
                if (this.d.g && file != null) {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (a(file) > this.d.b) {
                        try {
                            this.a = l.a(file, 1, 1, this.d.b);
                        } catch (IOException e) {
                            this.d.c = null;
                            String str = "initDiskCache - " + e;
                        }
                    }
                }
            }
            this.e.notifyAll();
        }
    }

    public void a(b bVar) {
        this.d = bVar;
        if (bVar.f) {
            if (s1.c()) {
                this.f = Collections.synchronizedSet(new HashSet());
            }
            this.b = new a(this.d.a);
        }
        if (bVar.h) {
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (0 == 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r5, android.graphics.Bitmap r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L82
            if (r6 != 0) goto L6
            goto L82
        L6:
            g0<java.lang.String, android.graphics.Bitmap> r0 = r4.b
            if (r0 == 0) goto Ld
            r0.a(r5, r6)
        Ld:
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            com.comviva.webaxn.utils.l r1 = r4.a     // Catch: java.lang.Throwable -> L7f
            if (r1 == 0) goto L7d
            java.lang.String r5 = c(r5)     // Catch: java.lang.Throwable -> L7f
            r1 = 0
            com.comviva.webaxn.utils.l r2 = r4.a     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            com.comviva.webaxn.utils.l$d r2 = r2.b(r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            r3 = 0
            if (r2 != 0) goto L40
            com.comviva.webaxn.utils.l r2 = r4.a     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            com.comviva.webaxn.utils.l$b r5 = r2.a(r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            if (r5 == 0) goto L47
            java.io.OutputStream r1 = r5.a(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            com.comviva.webaxn.utils.e1$b r2 = r4.d     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            android.graphics.Bitmap$CompressFormat r2 = r2.d     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            com.comviva.webaxn.utils.e1$b r3 = r4.d     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            int r3 = r3.e     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            r6.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            r5.b()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            r1.close()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
            goto L47
        L40:
            java.io.InputStream r5 = r2.a(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.io.IOException -> L63
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.e1.a(java.lang.String, android.graphics.Bitmap):void");
    }

    public void a(String str, Drawable drawable) {
        if (TextUtils.isEmpty(str) || drawable == null) {
            return;
        }
        if (this.c == null) {
            this.c = new defpackage.g0<>(5120);
        }
        this.c.a(str, drawable);
    }

    public Drawable b(String str) {
        if (this.c == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.c.b(str);
    }
}
