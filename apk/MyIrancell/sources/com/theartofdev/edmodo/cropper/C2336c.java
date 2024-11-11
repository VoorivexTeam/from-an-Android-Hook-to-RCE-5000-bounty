package com.theartofdev.edmodo.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Pair;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import p000.C2840k3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.theartofdev.edmodo.cropper.c */
/* loaded from: classes.dex */
public final class C2336c {

    /* renamed from: a */
    static final Rect f9488a = new Rect();

    /* renamed from: b */
    static final RectF f9489b = new RectF();

    /* renamed from: c */
    static final RectF f9490c = new RectF();

    /* renamed from: d */
    static final float[] f9491d = new float[6];

    /* renamed from: e */
    static final float[] f9492e = new float[6];

    /* renamed from: f */
    private static int f9493f;

    /* renamed from: g */
    static Pair<String, WeakReference<Bitmap>> f9494g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.theartofdev.edmodo.cropper.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Bitmap f9495a;

        /* renamed from: b */
        final int f9496b;

        a(Bitmap bitmap, int i) {
            this.f9495a = bitmap;
            this.f9496b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.theartofdev.edmodo.cropper.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final Bitmap f9497a;

        /* renamed from: b */
        final int f9498b;

        b(Bitmap bitmap, int i) {
            this.f9497a = bitmap;
            this.f9498b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m11120a(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: a */
    private static int m11121a() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
            int[] iArr2 = new int[1];
            int i = 0;
            for (int i2 = 0; i2 < iArr[0]; i2++) {
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i2], 12332, iArr2);
                if (i < iArr2[0]) {
                    i = iArr2[0];
                }
            }
            egl10.eglTerminate(eglGetDisplay);
            return Math.max(i, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    /* renamed from: a */
    private static int m11122a(int i, int i2) {
        if (f9493f == 0) {
            f9493f = m11121a();
        }
        int i3 = 1;
        if (f9493f > 0) {
            while (true) {
                int i4 = i2 / i3;
                int i5 = f9493f;
                if (i4 <= i5 && i / i3 <= i5) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static int m11123a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    private static Bitmap m11124a(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) {
        do {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = contentResolver.openInputStream(uri);
                    return BitmapFactory.decodeStream(inputStream, f9488a, options);
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    m11142a(inputStream);
                }
            } finally {
                m11142a(inputStream);
            }
        } while (options.inSampleSize <= 512);
        throw new RuntimeException("Failed to decode image: " + uri);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Bitmap m11125a(Bitmap bitmap, int i, int i2, CropImageView.EnumC2329j enumC2329j) {
        if (i > 0 && i2 > 0) {
            try {
                if (enumC2329j == CropImageView.EnumC2329j.RESIZE_FIT || enumC2329j == CropImageView.EnumC2329j.RESIZE_INSIDE || enumC2329j == CropImageView.EnumC2329j.RESIZE_EXACT) {
                    Bitmap bitmap2 = null;
                    if (enumC2329j == CropImageView.EnumC2329j.RESIZE_EXACT) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float max = Math.max(width / i, height / i2);
                        if (max > 1.0f || enumC2329j == CropImageView.EnumC2329j.RESIZE_FIT) {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                        }
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private static Bitmap m11126a(Bitmap bitmap, int i, boolean z, boolean z2) {
        if (i <= 0 && !z && !z2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        matrix.postScale(z ? -1.0f : 1.0f, z2 ? -1.0f : 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: a */
    private static Bitmap m11127a(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f, boolean z2, boolean z3) {
        float f2 = f;
        Rect m11130a = m11130a(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        float f3 = z2 ? -f2 : f2;
        if (z3) {
            f2 = -f2;
        }
        matrix.postScale(f3, f2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, m11130a.left, m11130a.top, m11130a.width(), m11130a.height(), matrix, true);
        if (createBitmap == bitmap) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i % 90 != 0 ? m11128a(createBitmap, fArr, m11130a, i, z, i2, i3) : createBitmap;
    }

    /* renamed from: a */
    private static Bitmap m11128a(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i);
        int i7 = (i < 90 || (i > 180 && i < 270)) ? rect.left : rect.right;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= fArr.length) {
                i4 = 0;
                i5 = 0;
                i6 = 0;
                break;
            }
            if (fArr[i9] >= i7 - 1 && fArr[i9] <= i7 + 1) {
                double sin = Math.sin(radians);
                int i10 = i9 + 1;
                double d = rect.bottom - fArr[i10];
                Double.isNaN(d);
                i8 = (int) Math.abs(sin * d);
                double cos = Math.cos(radians);
                double d2 = fArr[i10] - rect.top;
                Double.isNaN(d2);
                i5 = (int) Math.abs(cos * d2);
                double d3 = fArr[i10] - rect.top;
                double sin2 = Math.sin(radians);
                Double.isNaN(d3);
                i6 = (int) Math.abs(d3 / sin2);
                double d4 = rect.bottom - fArr[i10];
                double cos2 = Math.cos(radians);
                Double.isNaN(d4);
                i4 = (int) Math.abs(d4 / cos2);
                break;
            }
            i9 += 2;
        }
        rect.set(i8, i5, i6 + i8, i4 + i5);
        if (z) {
            m11141a(rect, i2, i3);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: a */
    private static BitmapFactory.Options m11129a(ContentResolver contentResolver, Uri uri) {
        InputStream inputStream;
        try {
            inputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, f9488a, options);
                options.inJustDecodeBounds = false;
                m11142a(inputStream);
                return options;
            } catch (Throwable th) {
                th = th;
                m11142a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Rect m11130a(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, m11146e(fArr))), Math.round(Math.max(0.0f, m11148g(fArr))), Math.round(Math.min(i, m11147f(fArr))), Math.round(Math.min(i2, m11120a(fArr))));
        if (z) {
            m11141a(rect, i3, i4);
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Uri m11131a(Context context, Bitmap bitmap, Uri uri) {
        boolean z = true;
        try {
            if (uri == null) {
                uri = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
            } else if (new File(uri.getPath()).exists()) {
                z = false;
            }
            if (z) {
                m11140a(context, bitmap, uri, Bitmap.CompressFormat.JPEG, 95);
            }
            return uri;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static a m11132a(Context context, Uri uri, int i, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            BitmapFactory.Options m11129a = m11129a(contentResolver, uri);
            m11129a.inSampleSize = Math.max(m11123a(m11129a.outWidth, m11129a.outHeight, i, i2), m11122a(m11129a.outWidth, m11129a.outHeight));
            return new a(m11124a(contentResolver, uri, m11129a), m11129a.inSampleSize);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.theartofdev.edmodo.cropper.C2336c.a m11133a(android.content.Context r4, android.net.Uri r5, android.graphics.Rect r6, int r7, int r8, int r9) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            int r2 = r6.width()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            int r3 = r6.height()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            int r7 = m11123a(r2, r3, r7, r8)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            int r9 = r9 * r7
            r1.inSampleSize = r9     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r7 = 0
            android.graphics.BitmapRegionDecoder r7 = android.graphics.BitmapRegionDecoder.newInstance(r4, r7)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L58
        L23:
            com.theartofdev.edmodo.cropper.c$a r8 = new com.theartofdev.edmodo.cropper.c$a     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            android.graphics.Bitmap r9 = r7.decodeRegion(r6, r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            int r2 = r1.inSampleSize     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            r8.<init>(r9, r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            m11142a(r4)
            if (r7 == 0) goto L36
            r7.recycle()
        L36:
            return r8
        L37:
            r5 = move-exception
            goto L56
        L39:
            r6 = move-exception
            goto L5a
        L3b:
            int r8 = r1.inSampleSize     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            int r8 = r8 * 2
            r1.inSampleSize = r8     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            r9 = 512(0x200, float:7.17E-43)
            if (r8 <= r9) goto L23
            m11142a(r4)
            if (r7 == 0) goto L4d
            r7.recycle()
        L4d:
            com.theartofdev.edmodo.cropper.c$a r4 = new com.theartofdev.edmodo.cropper.c$a
            r5 = 1
            r4.<init>(r0, r5)
            return r4
        L54:
            r5 = move-exception
            r7 = r0
        L56:
            r0 = r4
            goto L85
        L58:
            r6 = move-exception
            r7 = r0
        L5a:
            r0 = r4
            goto L61
        L5c:
            r5 = move-exception
            r7 = r0
            goto L85
        L5f:
            r6 = move-exception
            r7 = r0
        L61:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = "Failed to load sampled bitmap: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            r8.append(r5)     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "\r\n"
            r8.append(r5)     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = r6.getMessage()     // Catch: java.lang.Throwable -> L84
            r8.append(r5)     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L84
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L84
            throw r4     // Catch: java.lang.Throwable -> L84
        L84:
            r5 = move-exception
        L85:
            m11142a(r0)
            if (r7 == 0) goto L8d
            r7.recycle()
        L8d:
            goto L8f
        L8e:
            throw r5
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C2336c.m11133a(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static a m11134a(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        int i8 = 1;
        do {
            try {
                return m11135a(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e) {
                i8 *= 2;
            }
        } while (i8 <= 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + e.getMessage(), e);
    }

    /* renamed from: a */
    private static a m11135a(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, int i8) {
        Rect m11130a = m11130a(fArr, i2, i3, z, i4, i5);
        int width = i6 > 0 ? i6 : m11130a.width();
        int height = i7 > 0 ? i7 : m11130a.height();
        Bitmap bitmap = null;
        int i9 = 1;
        try {
            a m11133a = m11133a(context, uri, m11130a, width, height, i8);
            bitmap = m11133a.f9495a;
            i9 = m11133a.f9496b;
        } catch (Exception unused) {
        }
        if (bitmap == null) {
            return m11136a(context, uri, fArr, i, z, i4, i5, i8, m11130a, width, height, z2, z3);
        }
        try {
            Bitmap m11126a = m11126a(bitmap, i, z2, z3);
            try {
                if (i % 90 != 0) {
                    m11126a = m11128a(m11126a, fArr, m11130a, i, z, i4, i5);
                }
                return new a(m11126a, i9);
            } catch (OutOfMemoryError e) {
                e = e;
                bitmap = m11126a;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw e;
            }
        } catch (OutOfMemoryError e2) {
            e = e2;
        }
    }

    /* renamed from: a */
    private static a m11136a(Context context, Uri uri, float[] fArr, int i, boolean z, int i2, int i3, int i4, Rect rect, int i5, int i6, boolean z2, boolean z3) {
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int m11123a = m11123a(rect.width(), rect.height(), i5, i6) * i4;
            options.inSampleSize = m11123a;
            Bitmap m11124a = m11124a(context.getContentResolver(), uri, options);
            if (m11124a != null) {
                try {
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = fArr2[i7] / options.inSampleSize;
                    }
                    bitmap = m11127a(m11124a, fArr2, i, z, i2, i3, 1.0f, z2, z3);
                    if (bitmap != m11124a) {
                        m11124a.recycle();
                    }
                } catch (Throwable th) {
                    if (m11124a != null) {
                        m11124a.recycle();
                    }
                    throw th;
                }
            }
            return new a(bitmap, m11123a);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
        } catch (OutOfMemoryError e2) {
            if (0 != 0) {
                bitmap.recycle();
            }
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static a m11137a(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        int i4 = 1;
        do {
            try {
                return new a(m11127a(bitmap, fArr, i, z, i2, i3, 1.0f / i4, z2, z3), i4);
            } catch (OutOfMemoryError e) {
                i4 *= 2;
            }
        } while (i4 <= 8);
        throw e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static b m11138a(Bitmap bitmap, Context context, Uri uri) {
        C2840k3 c2840k3 = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                C2840k3 c2840k32 = new C2840k3(openInputStream);
                try {
                    openInputStream.close();
                } catch (Exception unused) {
                }
                c2840k3 = c2840k32;
            }
        } catch (Exception unused2) {
        }
        return c2840k3 != null ? m11139a(bitmap, c2840k3) : new b(bitmap, 0);
    }

    /* renamed from: a */
    static b m11139a(Bitmap bitmap, C2840k3 c2840k3) {
        int m13573a = c2840k3.m13573a("Orientation", 1);
        return new b(bitmap, m13573a != 3 ? m13573a != 6 ? m13573a != 8 ? 0 : 270 : 90 : 180);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11140a(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i) {
        OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i, outputStream);
        } finally {
            m11142a(outputStream);
        }
    }

    /* renamed from: a */
    private static void m11141a(Rect rect, int i, int i2) {
        if (i != i2 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    /* renamed from: a */
    private static void m11142a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m11143b(float[] fArr) {
        return (m11147f(fArr) + m11146e(fArr)) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m11144c(float[] fArr) {
        return (m11120a(fArr) + m11148g(fArr)) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static float m11145d(float[] fArr) {
        return m11120a(fArr) - m11148g(fArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static float m11146e(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static float m11147f(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m11148g(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static float m11149h(float[] fArr) {
        return m11147f(fArr) - m11146e(fArr);
    }
}
