package ir.tapsell.sdk.networkcacheutils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import ir.tapsell.sdk.utils.C2761c;

/* renamed from: ir.tapsell.sdk.networkcacheutils.f */
/* loaded from: classes.dex */
public class C2752f {
    /* renamed from: a */
    public static Bitmap m13106a(Context context, Bitmap bitmap) {
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return bitmap;
        }
        Bitmap m13111a = m13111a(bitmap, -16777216);
        if (m13111a.getWidth() > 200 && m13111a.getWidth() > m13111a.getHeight()) {
            double height = m13111a.getHeight();
            double width = m13111a.getWidth();
            Double.isNaN(height);
            Double.isNaN(width);
            double d = height / width;
            double d2 = 200;
            Double.isNaN(d2);
            m13111a = Bitmap.createScaledBitmap(m13111a, 200, (int) (d * d2), true);
        } else if (m13111a.getHeight() > 200) {
            double width2 = m13111a.getWidth();
            double height2 = m13111a.getHeight();
            Double.isNaN(width2);
            Double.isNaN(height2);
            double d3 = width2 / height2;
            double d4 = 200;
            Double.isNaN(d4);
            m13111a = Bitmap.createScaledBitmap(m13111a, (int) (d3 * d4), 200, true);
        }
        double width3 = m13111a.getWidth();
        Double.isNaN(width3);
        int i = (int) (width3 * 0.03d);
        if (i == 0) {
            i = m13111a.getWidth() / 2;
        }
        if (i >= 25) {
            i = 20;
        }
        return C2761c.m13135a(context, false, m13111a, i);
    }

    /* renamed from: a */
    public static Bitmap m13107a(Context context, Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m13108a(Context context, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        int height2;
        float width2;
        float height3;
        int height4;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        if (bitmap.getWidth() < bitmap.getHeight()) {
            width = bitmap.getWidth() / 2;
            height = bitmap.getHeight() / 2;
            height2 = bitmap.getWidth();
        } else {
            width = bitmap.getWidth() / 2;
            height = bitmap.getHeight() / 2;
            height2 = bitmap.getHeight();
        }
        canvas.drawCircle(width, height, height2 / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        int applyDimension = (int) TypedValue.applyDimension(0, i2, context.getResources().getDisplayMetrics());
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(applyDimension);
        if (bitmap.getWidth() < bitmap.getHeight()) {
            width2 = bitmap.getWidth() / 2;
            height3 = bitmap.getHeight() / 2;
            height4 = bitmap.getWidth();
        } else {
            width2 = bitmap.getWidth() / 2;
            height3 = bitmap.getHeight() / 2;
            height4 = bitmap.getHeight();
        }
        canvas.drawCircle(width2, height3, height4 / 2, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m13109a(Bitmap bitmap) {
        float width;
        float height;
        int height2;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        if (bitmap.getWidth() < bitmap.getHeight()) {
            width = bitmap.getWidth() / 2;
            height = bitmap.getHeight() / 2;
            height2 = bitmap.getWidth();
        } else {
            width = bitmap.getWidth() / 2;
            height = bitmap.getHeight() / 2;
            height2 = bitmap.getHeight();
        }
        canvas.drawCircle(width, height, height2 / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m13110a(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
        float width = f * bitmap.getWidth();
        Path path = new Path();
        path.addRoundRect(rectF, width, width, Path.Direction.CW);
        canvas.clipPath(path);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m13111a(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(i);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m13112a(Bitmap bitmap, int i, int i2, int i3, Context context) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int applyDimension = (int) TypedValue.applyDimension(0, i3, context.getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(0, i2, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawARGB(0, 0, 0, 0);
        float f = applyDimension2;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(applyDimension);
        canvas.drawRoundRect(rectF, f, f, paint);
        return createBitmap;
    }

    /* renamed from: b */
    public static Bitmap m13113b(Bitmap bitmap) {
        return bitmap.getHeight() > bitmap.getWidth() ? Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - bitmap.getWidth()) / 2, bitmap.getWidth(), bitmap.getWidth()) : bitmap.getHeight() < bitmap.getWidth() ? Bitmap.createBitmap(bitmap, (bitmap.getWidth() - bitmap.getHeight()) / 2, 0, bitmap.getHeight(), bitmap.getHeight()) : bitmap;
    }

    /* renamed from: c */
    public static Bitmap m13114c(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    /* renamed from: d */
    public static Bitmap m13115d(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        return Bitmap.createBitmap(bitmap, width / 5, height / 5, (width * 3) / 5, (height * 3) / 5);
    }

    /* renamed from: e */
    public static Bitmap m13116e(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        return Bitmap.createBitmap(bitmap, width / 10, height / 10, (width * 4) / 5, (height * 4) / 5);
    }
}
