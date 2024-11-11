package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C0572f;
import com.bumptech.glide.load.C0574h;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0568b;
import com.bumptech.glide.load.ImageHeaderParser;
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
import p000.AbstractC3082pe;

/* renamed from: qe */
/* loaded from: classes.dex */
public final class C3124qe {

    /* renamed from: f */
    public static final C0574h<EnumC0568b> f12789f = C0574h.m3956a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC0568b.DEFAULT);

    /* renamed from: g */
    public static final C0574h<Boolean> f12790g;

    /* renamed from: h */
    public static final C0574h<Boolean> f12791h;

    /* renamed from: i */
    private static final Set<String> f12792i;

    /* renamed from: j */
    private static final b f12793j;

    /* renamed from: k */
    private static final Set<ImageHeaderParser.ImageType> f12794k;

    /* renamed from: l */
    private static final Queue<BitmapFactory.Options> f12795l;

    /* renamed from: a */
    private final InterfaceC2427ec f12796a;

    /* renamed from: b */
    private final DisplayMetrics f12797b;

    /* renamed from: c */
    private final InterfaceC0475bc f12798c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f12799d;

    /* renamed from: e */
    private final C3356ve f12800e = C3356ve.m16012a();

    /* renamed from: qe$a */
    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // p000.C3124qe.b
        /* renamed from: a */
        public void mo15087a() {
        }

        @Override // p000.C3124qe.b
        /* renamed from: a */
        public void mo15088a(InterfaceC2427ec interfaceC2427ec, Bitmap bitmap) {
        }
    }

    /* renamed from: qe$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo15087a();

        /* renamed from: a */
        void mo15088a(InterfaceC2427ec interfaceC2427ec, Bitmap bitmap);
    }

    static {
        C0574h<AbstractC3082pe> c0574h = AbstractC3082pe.f12600f;
        f12790g = C0574h.m3956a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
        f12791h = C0574h.m3956a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
        f12792i = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f12793j = new a();
        f12794k = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f12795l = C2861ki.m13727a(0);
    }

    public C3124qe(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC2427ec interfaceC2427ec, InterfaceC0475bc interfaceC0475bc) {
        this.f12799d = list;
        C2816ji.m13459a(displayMetrics);
        this.f12797b = displayMetrics;
        C2816ji.m13459a(interfaceC2427ec);
        this.f12796a = interfaceC2427ec;
        C2816ji.m13459a(interfaceC0475bc);
        this.f12798c = interfaceC0475bc;
    }

    /* renamed from: a */
    private static int m15065a(double d) {
        int m15077b = m15077b(d);
        double d2 = m15077b;
        Double.isNaN(d2);
        int m15080c = m15080c(d2 * d);
        double d3 = m15080c / m15077b;
        Double.isNaN(d3);
        double d4 = m15080c;
        Double.isNaN(d4);
        return m15080c((d / d3) * d4);
    }

    /* renamed from: a */
    private Bitmap m15066a(InputStream inputStream, BitmapFactory.Options options, AbstractC3082pe abstractC3082pe, EnumC0568b enumC0568b, boolean z, int i, int i2, boolean z2, b bVar) {
        C3124qe c3124qe;
        int round;
        int round2;
        int i3;
        long m11768a = C2474fi.m11768a();
        int[] m15079b = m15079b(inputStream, options, bVar, this.f12796a);
        int i4 = m15079b[0];
        int i5 = m15079b[1];
        String str = options.outMimeType;
        boolean z3 = (i4 == -1 || i5 == -1) ? false : z;
        int m3951a = C0572f.m3951a(this.f12799d, inputStream, this.f12798c);
        int m140a = C0019af.m140a(m3951a);
        boolean m150b = C0019af.m150b(m3951a);
        int i6 = i == Integer.MIN_VALUE ? i4 : i;
        int i7 = i2 == Integer.MIN_VALUE ? i5 : i2;
        ImageHeaderParser.ImageType m3953b = C0572f.m3953b(this.f12799d, inputStream, this.f12798c);
        m15074a(m3953b, inputStream, bVar, this.f12796a, abstractC3082pe, m140a, i4, i5, i6, i7, options);
        m15075a(inputStream, enumC0568b, z3, m150b, options, i6, i7);
        boolean z4 = Build.VERSION.SDK_INT >= 19;
        if (options.inSampleSize == 1 || z4) {
            c3124qe = this;
            if (c3124qe.m15076a(m3953b)) {
                if (i4 < 0 || i5 < 0 || !z2 || !z4) {
                    float f = m15078b(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i8 = options.inSampleSize;
                    float f2 = i8;
                    int ceil = (int) Math.ceil(i4 / f2);
                    int ceil2 = (int) Math.ceil(i5 / f2);
                    round = Math.round(ceil * f);
                    round2 = Math.round(ceil2 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        String str2 = "Calculated target [" + round + "x" + round2 + "] for source [" + i4 + "x" + i5 + "], sampleSize: " + i8 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f;
                    }
                } else {
                    round = i6;
                    round2 = i7;
                }
                if (round > 0 && round2 > 0) {
                    m15073a(options, c3124qe.f12796a, round, round2);
                }
            }
        } else {
            c3124qe = this;
        }
        Bitmap m15067a = m15067a(inputStream, options, bVar, c3124qe.f12796a);
        bVar.mo15088a(c3124qe.f12796a, m15067a);
        if (Log.isLoggable("Downsampler", 2)) {
            i3 = m3951a;
            m15072a(i4, i5, str, options, m15067a, i, i2, m11768a);
        } else {
            i3 = m3951a;
        }
        Bitmap bitmap = null;
        if (m15067a != null) {
            m15067a.setDensity(c3124qe.f12797b.densityDpi);
            bitmap = C0019af.m142a(c3124qe.f12796a, m15067a, i3);
            if (!m15067a.equals(bitmap)) {
                c3124qe.f12796a.mo11591a(m15067a);
            }
        }
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        throw r0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap m15067a(java.io.InputStream r5, android.graphics.BitmapFactory.Options r6, p000.C3124qe.b r7, p000.InterfaceC2427ec r8) {
        /*
            boolean r0 = r6.inJustDecodeBounds
            if (r0 == 0) goto La
            r0 = 10485760(0xa00000, float:1.469368E-38)
            r5.mark(r0)
            goto Ld
        La:
            r7.mo15087a()
        Ld:
            int r0 = r6.outWidth
            int r1 = r6.outHeight
            java.lang.String r2 = r6.outMimeType
            java.util.concurrent.locks.Lock r3 = p000.C0019af.m144a()
            r3.lock()
            r3 = 0
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch: java.lang.Throwable -> L2e java.lang.IllegalArgumentException -> L30
            java.util.concurrent.locks.Lock r8 = p000.C0019af.m144a()
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
            java.io.IOException r0 = m15069a(r4, r0, r1, r2, r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L2e
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L57
            r5.reset()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
            r8.mo11591a(r1)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
            r6.inBitmap = r3     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
            android.graphics.Bitmap r5 = m15067a(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
            java.util.concurrent.locks.Lock r6 = p000.C0019af.m144a()
            r6.unlock()
            return r5
        L56:
            throw r0     // Catch: java.lang.Throwable -> L2e
        L57:
            throw r0     // Catch: java.lang.Throwable -> L2e
        L58:
            java.util.concurrent.locks.Lock r6 = p000.C0019af.m144a()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3124qe.m15067a(java.io.InputStream, android.graphics.BitmapFactory$Options, qe$b, ec):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static synchronized BitmapFactory.Options m15068a() {
        BitmapFactory.Options poll;
        synchronized (C3124qe.class) {
            synchronized (f12795l) {
                poll = f12795l.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m15082d(poll);
            }
        }
        return poll;
    }

    /* renamed from: a */
    private static IOException m15069a(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m15071a(options), illegalArgumentException);
    }

    @TargetApi(19)
    /* renamed from: a */
    private static String m15070a(Bitmap bitmap) {
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

    /* renamed from: a */
    private static String m15071a(BitmapFactory.Options options) {
        return m15070a(options.inBitmap);
    }

    /* renamed from: a */
    private static void m15072a(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        String str2 = "Decoded " + m15070a(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m15071a(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C2474fi.m11767a(j);
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m15073a(BitmapFactory.Options options, InterfaceC2427ec interfaceC2427ec, int i, int i2) {
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
        options.inBitmap = interfaceC2427ec.mo11592b(i, i2, config);
    }

    /* renamed from: a */
    private static void m15074a(ImageHeaderParser.ImageType imageType, InputStream inputStream, b bVar, InterfaceC2427ec interfaceC2427ec, AbstractC3082pe abstractC3082pe, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) {
        int max;
        int floor;
        int floor2;
        if (i2 <= 0 || i3 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                String str = "Unable to determine dimensions for: " + imageType + " with target [" + i4 + "x" + i5 + "]";
                return;
            }
            return;
        }
        float mo14750b = (i == 90 || i == 270) ? abstractC3082pe.mo14750b(i3, i2, i4, i5) : abstractC3082pe.mo14750b(i2, i3, i4, i5);
        if (mo14750b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + mo14750b + " from: " + abstractC3082pe + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
        }
        AbstractC3082pe.g mo14749a = abstractC3082pe.mo14749a(i2, i3, i4, i5);
        if (mo14749a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f = i2;
        float f2 = i3;
        int m15080c = i2 / m15080c(mo14750b * f);
        int m15080c2 = i3 / m15080c(mo14750b * f2);
        int max2 = mo14749a == AbstractC3082pe.g.MEMORY ? Math.max(m15080c, m15080c2) : Math.min(m15080c, m15080c2);
        if (Build.VERSION.SDK_INT > 23 || !f12792i.contains(options.outMimeType)) {
            max = Math.max(1, Integer.highestOneBit(max2));
            if (mo14749a == AbstractC3082pe.g.MEMORY && max < 1.0f / mo14750b) {
                max <<= 1;
            }
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(max, 8);
            floor = (int) Math.ceil(f / min);
            floor2 = (int) Math.ceil(f2 / min);
            int i6 = max / 8;
            if (i6 > 0) {
                floor /= i6;
                floor2 /= i6;
            }
        } else {
            if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        float f3 = max;
                        floor = Math.round(f / f3);
                        floor2 = Math.round(f2 / f3);
                    }
                } else if (i2 % max == 0 && i3 % max == 0) {
                    floor = i2 / max;
                    floor2 = i3 / max;
                } else {
                    int[] m15079b = m15079b(inputStream, options, bVar, interfaceC2427ec);
                    int i7 = m15079b[0];
                    floor2 = m15079b[1];
                    floor = i7;
                }
            }
            float f4 = max;
            floor = (int) Math.floor(f / f4);
            floor2 = (int) Math.floor(f2 / f4);
        }
        double mo14750b2 = abstractC3082pe.mo14750b(floor, floor2, i4, i5);
        if (Build.VERSION.SDK_INT >= 19) {
            options.inTargetDensity = m15065a(mo14750b2);
            options.inDensity = m15077b(mo14750b2);
        }
        if (m15078b(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            String str2 = "Calculate scaling, source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + mo14750b + ", power of 2 sample size: " + max + ", adjusted scale factor: " + mo14750b2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity;
        }
    }

    /* renamed from: a */
    private void m15075a(InputStream inputStream, EnumC0568b enumC0568b, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (this.f12800e.m16014a(i, i2, options, enumC0568b, z, z2)) {
            return;
        }
        if (enumC0568b == EnumC0568b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        boolean z3 = false;
        try {
            z3 = C0572f.m3953b(this.f12799d, inputStream, this.f12798c).hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                String str = "Cannot determine whether the image has alpha or not from header, format " + enumC0568b;
            }
        }
        Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    /* renamed from: a */
    private boolean m15076a(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f12794k.contains(imageType);
    }

    /* renamed from: b */
    private static int m15077b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: b */
    private static boolean m15078b(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    /* renamed from: b */
    private static int[] m15079b(InputStream inputStream, BitmapFactory.Options options, b bVar, InterfaceC2427ec interfaceC2427ec) {
        options.inJustDecodeBounds = true;
        m15067a(inputStream, options, bVar, interfaceC2427ec);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: c */
    private static int m15080c(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: c */
    private static void m15081c(BitmapFactory.Options options) {
        m15082d(options);
        synchronized (f12795l) {
            f12795l.offer(options);
        }
    }

    /* renamed from: d */
    private static void m15082d(BitmapFactory.Options options) {
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

    /* renamed from: a */
    public InterfaceC3353vb<Bitmap> m15083a(InputStream inputStream, int i, int i2, C0575i c0575i) {
        return m15084a(inputStream, i, i2, c0575i, f12793j);
    }

    /* renamed from: a */
    public InterfaceC3353vb<Bitmap> m15084a(InputStream inputStream, int i, int i2, C0575i c0575i, b bVar) {
        C2816ji.m13463a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f12798c.mo3379b(65536, byte[].class);
        BitmapFactory.Options m15068a = m15068a();
        m15068a.inTempStorage = bArr;
        EnumC0568b enumC0568b = (EnumC0568b) c0575i.m3964a(f12789f);
        try {
            return C2812je.m13456a(m15066a(inputStream, m15068a, (AbstractC3082pe) c0575i.m3964a(AbstractC3082pe.f12600f), enumC0568b, c0575i.m3964a(f12791h) != null && ((Boolean) c0575i.m3964a(f12791h)).booleanValue(), i, i2, ((Boolean) c0575i.m3964a(f12790g)).booleanValue(), bVar), this.f12796a);
        } finally {
            m15081c(m15068a);
            this.f12798c.mo3378a((InterfaceC0475bc) bArr);
        }
    }

    /* renamed from: a */
    public boolean m15085a(InputStream inputStream) {
        return true;
    }

    /* renamed from: a */
    public boolean m15086a(ByteBuffer byteBuffer) {
        return true;
    }
}
