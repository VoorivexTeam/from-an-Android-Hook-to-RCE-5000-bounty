package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: ki */
/* loaded from: classes.dex */
public final class C2861ki {

    /* renamed from: a */
    private static final char[] f11753a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f11754b = new char[64];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ki$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11755a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f11755a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11755a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11755a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11755a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11755a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static int m13716a(float f) {
        return m13717a(f, 17);
    }

    /* renamed from: a */
    public static int m13717a(float f, int i) {
        return m13718a(Float.floatToIntBits(f), i);
    }

    /* renamed from: a */
    public static int m13718a(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: a */
    public static int m13719a(int i, int i2, Bitmap.Config config) {
        return i * i2 * m13720a(config);
    }

    /* renamed from: a */
    private static int m13720a(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a.f11755a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m13721a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: a */
    public static int m13722a(Object obj, int i) {
        return m13718a(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: a */
    public static int m13723a(boolean z, int i) {
        return m13718a(z ? 1 : 0, i);
    }

    /* renamed from: a */
    public static String m13724a(byte[] bArr) {
        String m13725a;
        synchronized (f11754b) {
            m13725a = m13725a(bArr, f11754b);
        }
        return m13725a;
    }

    /* renamed from: a */
    private static String m13725a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f11753a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static <T> List<T> m13726a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> Queue<T> m13727a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static void m13728a() {
        if (!m13734c()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    public static boolean m13729a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof InterfaceC2939md ? ((InterfaceC2939md) obj).m14098a(obj2) : obj.equals(obj2);
    }

    /* renamed from: b */
    public static boolean m13730b() {
        return !m13734c();
    }

    /* renamed from: b */
    private static boolean m13731b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public static boolean m13732b(int i, int i2) {
        return m13731b(i) && m13731b(i2);
    }

    /* renamed from: b */
    public static boolean m13733b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m13734c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
