package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import com.airbnb.lottie.C0537c;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: u9 */
/* loaded from: classes.dex */
public final class C3295u9 {

    /* renamed from: a */
    private static final PathMeasure f13437a = new PathMeasure();

    /* renamed from: b */
    private static final Path f13438b = new Path();

    /* renamed from: c */
    private static final Path f13439c = new Path();

    /* renamed from: d */
    private static final float[] f13440d = new float[4];

    /* renamed from: e */
    private static final float f13441e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: f */
    private static float f13442f = -1.0f;

    /* renamed from: a */
    public static float m15753a() {
        if (f13442f == -1.0f) {
            f13442f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f13442f;
    }

    /* renamed from: a */
    public static float m15754a(Context context) {
        int i = Build.VERSION.SDK_INT;
        ContentResolver contentResolver = context.getContentResolver();
        return i >= 17 ? Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) : Settings.System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    /* renamed from: a */
    public static float m15755a(Matrix matrix) {
        float[] fArr = f13440d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f13441e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f13440d;
        return (float) Math.hypot(fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]);
    }

    /* renamed from: a */
    public static int m15756a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    /* renamed from: a */
    public static Bitmap m15757a(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: a */
    public static Path m15758a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        return path;
    }

    /* renamed from: a */
    public static void m15759a(Canvas canvas, RectF rectF, Paint paint) {
        m15760a(canvas, rectF, paint, 31);
    }

    /* renamed from: a */
    public static void m15760a(Canvas canvas, RectF rectF, Paint paint, int i) {
        C0537c.m3721a("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        C0537c.m3722b("Utils#saveLayer");
    }

    /* renamed from: a */
    public static void m15761a(Path path, float f, float f2, float f3) {
        C0537c.m3721a("applyTrimPathIfNeeded");
        f13437a.setPath(path, false);
        float length = f13437a.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C0537c.m3722b("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            C0537c.m3722b("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float min = Math.min(f4, f5) + f6;
        float max = Math.max(f4, f5) + f6;
        if (min >= length && max >= length) {
            min = C3243t9.m15572a(min, length);
            max = C3243t9.m15572a(max, length);
        }
        if (min < 0.0f) {
            min = C3243t9.m15572a(min, length);
        }
        if (max < 0.0f) {
            max = C3243t9.m15572a(max, length);
        }
        if (min == max) {
            path.reset();
        } else {
            if (min >= max) {
                min -= length;
            }
            f13438b.reset();
            f13437a.getSegment(min, max, f13438b, true);
            if (max > length) {
                f13439c.reset();
                f13437a.getSegment(0.0f, max % length, f13439c, true);
            } else {
                if (min < 0.0f) {
                    f13439c.reset();
                    f13437a.getSegment(min + length, length, f13439c, true);
                }
                path.set(f13438b);
            }
            f13438b.addPath(f13439c);
            path.set(f13438b);
        }
        C0537c.m3722b("applyTrimPathIfNeeded");
    }

    /* renamed from: a */
    public static void m15762a(Path path, C2498g5 c2498g5) {
        if (c2498g5 == null || c2498g5.m11893h()) {
            return;
        }
        m15761a(path, ((C2800j5) c2498g5.m11891f()).m13400i() / 100.0f, ((C2800j5) c2498g5.m11889d()).m13400i() / 100.0f, ((C2800j5) c2498g5.m11890e()).m13400i() / 360.0f);
    }

    /* renamed from: a */
    public static void m15763a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m15764a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: a */
    public static boolean m15765a(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: b */
    public static boolean m15766b(Matrix matrix) {
        float[] fArr = f13440d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f13440d;
        return fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3];
    }
}
