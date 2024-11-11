package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import defpackage.pe;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class qe {
    public static final h<com.bumptech.glide.load.b> f = h.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.b.DEFAULT);
    public static final h<Boolean> g;
    public static final h<Boolean> h;
    private static final Set<String> i;
    private static final b j;
    private static final Set<ImageHeaderParser.ImageType> k;
    private static final Queue<BitmapFactory.Options> l;
    private final ec a;
    private final DisplayMetrics b;
    private final bc c;
    private final List<ImageHeaderParser> d;
    private final ve e = ve.a();

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // qe.b
        public void a() {
        }

        @Override // qe.b
        public void a(ec ecVar, Bitmap bitmap) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void a(ec ecVar, Bitmap bitmap);
    }

    static {
        h<pe> hVar = pe.f;
        g = h.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
        h = h.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
        i = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new a();
        k = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        l = ki.a(0);
    }

    public qe(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, ec ecVar, bc bcVar) {
        this.d = list;
        ji.a(displayMetrics);
        this.b = displayMetrics;
        ji.a(ecVar);
        this.a = ecVar;
        ji.a(bcVar);
        this.c = bcVar;
    }

    private static int a(double d) {
        int b2 = b(d);
        double d2 = b2;
        Double.isNaN(d2);
        int c = c(d2 * d);
        double d3 = c / b2;
        Double.isNaN(d3);
        double d4 = c;
        Double.isNaN(d4);
        return c((d / d3) * d4);
    }

    private Bitmap a(InputStream inputStream, BitmapFactory.Options options, pe peVar, com.bumptech.glide.load.b bVar, boolean z, int i2, int i3, boolean z2, b bVar2) {
        qe qeVar;
        int round;
        int round2;
        int i4;
        long a2 = fi.a();
        int[] b2 = b(inputStream, options, bVar2, this.a);
        int i5 = b2[0];
        int i6 = b2[1];
        String str = options.outMimeType;
        boolean z3 = (i5 == -1 || i6 == -1) ? false : z;
        int a3 = f.a(this.d, inputStream, this.c);
        int a4 = af.a(a3);
        boolean b3 = af.b(a3);
        int i7 = i2 == Integer.MIN_VALUE ? i5 : i2;
        int i8 = i3 == Integer.MIN_VALUE ? i6 : i3;
        ImageHeaderParser.ImageType b4 = f.b(this.d, inputStream, this.c);
        a(b4, inputStream, bVar2, this.a, peVar, a4, i5, i6, i7, i8, options);
        a(inputStream, bVar, z3, b3, options, i7, i8);
        boolean z4 = Build.VERSION.SDK_INT >= 19;
        if (options.inSampleSize == 1 || z4) {
            qeVar = this;
            if (qeVar.a(b4)) {
                if (i5 < 0 || i6 < 0 || !z2 || !z4) {
                    float f2 = b(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i9 = options.inSampleSize;
                    float f3 = i9;
                    int ceil = (int) Math.ceil(i5 / f3);
                    int ceil2 = (int) Math.ceil(i6 / f3);
                    round = Math.round(ceil * f2);
                    round2 = Math.round(ceil2 * f2);
                    if (Log.isLoggable("Downsampler", 2)) {
                        String str2 = "Calculated target [" + round + "x" + round2 + "] for source [" + i5 + "x" + i6 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f2;
                    }
                } else {
                    round = i7;
                    round2 = i8;
                }
                if (round > 0 && round2 > 0) {
                    a(options, qeVar.a, round, round2);
                }
            }
        } else {
            qeVar = this;
        }
        Bitmap a5 = a(inputStream, options, bVar2, qeVar.a);
        bVar2.a(qeVar.a, a5);
        if (Log.isLoggable("Downsampler", 2)) {
            i4 = a3;
            a(i5, i6, str, options, a5, i2, i3, a2);
        } else {
            i4 = a3;
        }
        Bitmap bitmap = null;
        if (a5 != null) {
            a5.setDensity(qeVar.b.densityDpi);
            bitmap = af.a(qeVar.a, a5, i4);
            if (!a5.equals(bitmap)) {
                qeVar.a.a(a5);
            }
        }
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap a(java.io.InputStream r5, android.graphics.BitmapFactory.Options r6, qe.b r7, defpackage.ec r8) {
        /*
            boolean r0 = r6.inJustDecodeBounds
            if (r0 == 0) goto La
            r0 = 10485760(0xa00000, float:1.469368E-38)
            r5.mark(r0)
            goto Ld
        La:
            r7.a()
        Ld:
            int r0 = r6.outWidth
            int r1 = r6.outHeight
            java.lang.String r2 = r6.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.af.a()
            r3.lock()
            r3 = 0
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch: java.lang.Throwable -> L2e java.lang.IllegalArgumentException -> L30
            java.util.concurrent.locks.Lock r8 = defpackage.af.a()
            r8.unlock()
            boolean r6 = r6.inJustDecodeBounds
            if (r6 == 0) goto L2d
            r5.reset()
        L2d:
            return r7
        L2e:
            r5 = move-exception
            goto L58
        L30:
            r4 = move-exception
            java.io.IOException r0 = a(r4, r0, r1, r2, r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L2e
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L57
            r5.reset()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
            r8.a(r1)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
            r6.inBitmap = r3     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
            android.graphics.Bitmap r5 = a(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
            java.util.concurrent.locks.Lock r6 = defpackage.af.a()
            r6.unlock()
            return r5
        L56:
            throw r0     // Catch: java.lang.Throwable -> L2e
        L57:
            throw r0     // Catch: java.lang.Throwable -> L2e
        L58:
            java.util.concurrent.locks.Lock r6 = defpackage.af.a()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe.a(java.io.InputStream, android.graphics.BitmapFactory$Options, qe$b, ec):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options a() {
        BitmapFactory.Options poll;
        synchronized (qe.class) {
            synchronized (l) {
                poll = l.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                d(poll);
            }
        }
        return poll;
    }

    private static IOException a(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + a(options), illegalArgumentException);
    }

    @TargetApi(19)
    private static String a(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    private static String a(BitmapFactory.Options options) {
        return a(options.inBitmap);
    }

    private static void a(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        String str2 = "Decoded " + a(bitmap) + " from [" + i2 + "x" + i3 + "] " + str + " with inBitmap " + a(options) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + fi.a(j2);
    }

    @TargetApi(26)
    private static void a(BitmapFactory.Options options, ec ecVar, int i2, int i3) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = ecVar.b(i2, i3, config);
    }

    private static void a(ImageHeaderParser.ImageType imageType, InputStream inputStream, b bVar, ec ecVar, pe peVar, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) {
        int max;
        int floor;
        int floor2;
        if (i3 <= 0 || i4 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                String str = "Unable to determine dimensions for: " + imageType + " with target [" + i5 + "x" + i6 + "]";
                return;
            }
            return;
        }
        float b2 = (i2 == 90 || i2 == 270) ? peVar.b(i4, i3, i5, i6) : peVar.b(i3, i4, i5, i6);
        if (b2 <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + b2 + " from: " + peVar + ", source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "]");
        }
        pe.g a2 = peVar.a(i3, i4, i5, i6);
        if (a2 == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f2 = i3;
        float f3 = i4;
        int c = i3 / c(b2 * f2);
        int c2 = i4 / c(b2 * f3);
        int max2 = a2 == pe.g.MEMORY ? Math.max(c, c2) : Math.min(c, c2);
        if (Build.VERSION.SDK_INT > 23 || !i.contains(options.outMimeType)) {
            max = Math.max(1, Integer.highestOneBit(max2));
            if (a2 == pe.g.MEMORY && max < 1.0f / b2) {
                max <<= 1;
            }
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(max, 8);
            floor = (int) Math.ceil(f2 / min);
            floor2 = (int) Math.ceil(f3 / min);
            int i7 = max / 8;
            if (i7 > 0) {
                floor /= i7;
                floor2 /= i7;
            }
        } else {
            if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        float f4 = max;
                        floor = Math.round(f2 / f4);
                        floor2 = Math.round(f3 / f4);
                    }
                } else if (i3 % max == 0 && i4 % max == 0) {
                    floor = i3 / max;
                    floor2 = i4 / max;
                } else {
                    int[] b3 = b(inputStream, options, bVar, ecVar);
                    int i8 = b3[0];
                    floor2 = b3[1];
                    floor = i8;
                }
            }
            float f5 = max;
            floor = (int) Math.floor(f2 / f5);
            floor2 = (int) Math.floor(f3 / f5);
        }
        double b4 = peVar.b(floor, floor2, i5, i6);
        if (Build.VERSION.SDK_INT >= 19) {
            options.inTargetDensity = a(b4);
            options.inDensity = b(b4);
        }
        if (b(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            String str2 = "Calculate scaling, source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + b2 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b4 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity;
        }
    }

    private void a(InputStream inputStream, com.bumptech.glide.load.b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        if (this.e.a(i2, i3, options, bVar, z, z2)) {
            return;
        }
        if (bVar == com.bumptech.glide.load.b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        boolean z3 = false;
        try {
            z3 = f.b(this.d, inputStream, this.c).hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                String str = "Cannot determine whether the image has alpha or not from header, format " + bVar;
            }
        }
        Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private boolean a(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return k.contains(imageType);
    }

    private static int b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    private static boolean b(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    private static int[] b(InputStream inputStream, BitmapFactory.Options options, b bVar, ec ecVar) {
        options.inJustDecodeBounds = true;
        a(inputStream, options, bVar, ecVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static int c(double d) {
        return (int) (d + 0.5d);
    }

    private static void c(BitmapFactory.Options options) {
        d(options);
        synchronized (l) {
            l.offer(options);
        }
    }

    private static void d(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public vb<Bitmap> a(InputStream inputStream, int i2, int i3, i iVar) {
        return a(inputStream, i2, i3, iVar, j);
    }

    public vb<Bitmap> a(InputStream inputStream, int i2, int i3, i iVar, b bVar) {
        ji.a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.c.b(65536, byte[].class);
        BitmapFactory.Options a2 = a();
        a2.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) iVar.a(f);
        try {
            return je.a(a(inputStream, a2, (pe) iVar.a(pe.f), bVar2, iVar.a(h) != null && ((Boolean) iVar.a(h)).booleanValue(), i2, i3, ((Boolean) iVar.a(g)).booleanValue(), bVar), this.a);
        } finally {
            c(a2);
            this.c.a((bc) bArr);
        }
    }

    public boolean a(InputStream inputStream) {
        return true;
    }

    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }
}
