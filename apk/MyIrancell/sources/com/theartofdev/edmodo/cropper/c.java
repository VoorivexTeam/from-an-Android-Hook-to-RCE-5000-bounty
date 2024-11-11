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
import defpackage.k3;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {
    static final Rect a = new Rect();
    static final RectF b = new RectF();
    static final RectF c = new RectF();
    static final float[] d = new float[6];
    static final float[] e = new float[6];
    private static int f;
    static Pair<String, WeakReference<Bitmap>> g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        public final Bitmap a;
        final int b;

        a(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {
        public final Bitmap a;
        final int b;

        b(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    private static int a() {
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

    private static int a(int i, int i2) {
        if (f == 0) {
            f = a();
        }
        int i3 = 1;
        if (f > 0) {
            while (true) {
                int i4 = i2 / i3;
                int i5 = f;
                if (i4 <= i5 && i / i3 <= i5) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    private static int a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    private static Bitmap a(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) {
        do {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = contentResolver.openInputStream(uri);
                    return BitmapFactory.decodeStream(inputStream, a, options);
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    a(inputStream);
                }
            } finally {
                a(inputStream);
            }
        } while (options.inSampleSize <= 512);
        throw new RuntimeException("Failed to decode image: " + uri);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bitmap a(Bitmap bitmap, int i, int i2, CropImageView.j jVar) {
        if (i > 0 && i2 > 0) {
            try {
                if (jVar == CropImageView.j.RESIZE_FIT || jVar == CropImageView.j.RESIZE_INSIDE || jVar == CropImageView.j.RESIZE_EXACT) {
                    Bitmap bitmap2 = null;
                    if (jVar == CropImageView.j.RESIZE_EXACT) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float max = Math.max(width / i, height / i2);
                        if (max > 1.0f || jVar == CropImageView.j.RESIZE_FIT) {
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

    private static Bitmap a(Bitmap bitmap, int i, boolean z, boolean z2) {
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

    private static Bitmap a(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f2, boolean z2, boolean z3) {
        float f3 = f2;
        Rect a2 = a(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        float f4 = z2 ? -f3 : f3;
        if (z3) {
            f3 = -f3;
        }
        matrix.postScale(f4, f3);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, a2.left, a2.top, a2.width(), a2.height(), matrix, true);
        if (createBitmap == bitmap) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i % 90 != 0 ? a(createBitmap, fArr, a2, i, z, i2, i3) : createBitmap;
    }

    private static Bitmap a(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
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
                double d2 = rect.bottom - fArr[i10];
                Double.isNaN(d2);
                i8 = (int) Math.abs(sin * d2);
                double cos = Math.cos(radians);
                double d3 = fArr[i10] - rect.top;
                Double.isNaN(d3);
                i5 = (int) Math.abs(cos * d3);
                double d4 = fArr[i10] - rect.top;
                double sin2 = Math.sin(radians);
                Double.isNaN(d4);
                i6 = (int) Math.abs(d4 / sin2);
                double d5 = rect.bottom - fArr[i10];
                double cos2 = Math.cos(radians);
                Double.isNaN(d5);
                i4 = (int) Math.abs(d5 / cos2);
                break;
            }
            i9 += 2;
        }
        rect.set(i8, i5, i6 + i8, i4 + i5);
        if (z) {
            a(rect, i2, i3);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    private static BitmapFactory.Options a(ContentResolver contentResolver, Uri uri) {
        InputStream inputStream;
        try {
            inputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, a, options);
                options.inJustDecodeBounds = false;
                a(inputStream);
                return options;
            } catch (Throwable th) {
                th = th;
                a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect a(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, e(fArr))), Math.round(Math.max(0.0f, g(fArr))), Math.round(Math.min(i, f(fArr))), Math.round(Math.min(i2, a(fArr))));
        if (z) {
            a(rect, i3, i4);
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri a(Context context, Bitmap bitmap, Uri uri) {
        boolean z = true;
        try {
            if (uri == null) {
                uri = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
            } else if (new File(uri.getPath()).exists()) {
                z = false;
            }
            if (z) {
                a(context, bitmap, uri, Bitmap.CompressFormat.JPEG, 95);
            }
            return uri;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Context context, Uri uri, int i, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            BitmapFactory.Options a2 = a(contentResolver, uri);
            a2.inSampleSize = Math.max(a(a2.outWidth, a2.outHeight, i, i2), a(a2.outWidth, a2.outHeight));
            return new a(a(contentResolver, uri, a2), a2.inSampleSize);
        } catch (Exception e2) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.theartofdev.edmodo.cropper.c.a a(android.content.Context r4, android.net.Uri r5, android.graphics.Rect r6, int r7, int r8, int r9) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            int r2 = r6.width()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            int r3 = r6.height()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            int r7 = a(r2, r3, r7, r8)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
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
            a(r4)
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
            a(r4)
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
            a(r0)
            if (r7 == 0) goto L8d
            r7.recycle()
        L8d:
            goto L8f
        L8e:
            throw r5
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.c.a(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        int i8 = 1;
        do {
            try {
                return a(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e2) {
                i8 *= 2;
            }
        } while (i8 <= 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + e2.getMessage(), e2);
    }

    private static a a(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, int i8) {
        Rect a2 = a(fArr, i2, i3, z, i4, i5);
        int width = i6 > 0 ? i6 : a2.width();
        int height = i7 > 0 ? i7 : a2.height();
        Bitmap bitmap = null;
        int i9 = 1;
        try {
            a a3 = a(context, uri, a2, width, height, i8);
            bitmap = a3.a;
            i9 = a3.b;
        } catch (Exception unused) {
        }
        if (bitmap == null) {
            return a(context, uri, fArr, i, z, i4, i5, i8, a2, width, height, z2, z3);
        }
        try {
            Bitmap a4 = a(bitmap, i, z2, z3);
            try {
                if (i % 90 != 0) {
                    a4 = a(a4, fArr, a2, i, z, i4, i5);
                }
                return new a(a4, i9);
            } catch (OutOfMemoryError e2) {
                e = e2;
                bitmap = a4;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw e;
            }
        } catch (OutOfMemoryError e3) {
            e = e3;
        }
    }

    private static a a(Context context, Uri uri, float[] fArr, int i, boolean z, int i2, int i3, int i4, Rect rect, int i5, int i6, boolean z2, boolean z3) {
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int a2 = a(rect.width(), rect.height(), i5, i6) * i4;
            options.inSampleSize = a2;
            Bitmap a3 = a(context.getContentResolver(), uri, options);
            if (a3 != null) {
                try {
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = fArr2[i7] / options.inSampleSize;
                    }
                    bitmap = a(a3, fArr2, i, z, i2, i3, 1.0f, z2, z3);
                    if (bitmap != a3) {
                        a3.recycle();
                    }
                } catch (Throwable th) {
                    if (a3 != null) {
                        a3.recycle();
                    }
                    throw th;
                }
            }
            return new a(bitmap, a2);
        } catch (Exception e2) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e2.getMessage(), e2);
        } catch (OutOfMemoryError e3) {
            if (0 != 0) {
                bitmap.recycle();
            }
            throw e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        int i4 = 1;
        do {
            try {
                return new a(a(bitmap, fArr, i, z, i2, i3, 1.0f / i4, z2, z3), i4);
            } catch (OutOfMemoryError e2) {
                i4 *= 2;
            }
        } while (i4 <= 8);
        throw e2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(Bitmap bitmap, Context context, Uri uri) {
        k3 k3Var = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                k3 k3Var2 = new k3(openInputStream);
                try {
                    openInputStream.close();
                } catch (Exception unused) {
                }
                k3Var = k3Var2;
            }
        } catch (Exception unused2) {
        }
        return k3Var != null ? a(bitmap, k3Var) : new b(bitmap, 0);
    }

    static b a(Bitmap bitmap, k3 k3Var) {
        int a2 = k3Var.a("Orientation", 1);
        return new b(bitmap, a2 != 3 ? a2 != 6 ? a2 != 8 ? 0 : 270 : 90 : 180);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i) {
        OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i, outputStream);
        } finally {
            a(outputStream);
        }
    }

    private static void a(Rect rect, int i, int i2) {
        if (i != i2 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(float[] fArr) {
        return (f(fArr) + e(fArr)) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(float[] fArr) {
        return (a(fArr) + g(fArr)) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(float[] fArr) {
        return a(fArr) - g(fArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float e(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float f(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float g(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float h(float[] fArr) {
        return f(fArr) - e(fArr);
    }
}
