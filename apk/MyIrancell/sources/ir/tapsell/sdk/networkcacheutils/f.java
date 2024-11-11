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

/* loaded from: classes.dex */
public class f {
    public static Bitmap a(Context context, Bitmap bitmap) {
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return bitmap;
        }
        Bitmap a = a(bitmap, -16777216);
        if (a.getWidth() > 200 && a.getWidth() > a.getHeight()) {
            double height = a.getHeight();
            double width = a.getWidth();
            Double.isNaN(height);
            Double.isNaN(width);
            double d = height / width;
            double d2 = 200;
            Double.isNaN(d2);
            a = Bitmap.createScaledBitmap(a, 200, (int) (d * d2), true);
        } else if (a.getHeight() > 200) {
            double width2 = a.getWidth();
            double height2 = a.getHeight();
            Double.isNaN(width2);
            Double.isNaN(height2);
            double d3 = width2 / height2;
            double d4 = 200;
            Double.isNaN(d4);
            a = Bitmap.createScaledBitmap(a, (int) (d3 * d4), 200, true);
        }
        double width3 = a.getWidth();
        Double.isNaN(width3);
        int i = (int) (width3 * 0.03d);
        if (i == 0) {
            i = a.getWidth() / 2;
        }
        if (i >= 25) {
            i = 20;
        }
        return ir.tapsell.sdk.utils.c.a(context, false, a, i);
    }

    public static Bitmap a(Context context, Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Bitmap a(Context context, Bitmap bitmap, int i, int i2) {
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

    public static Bitmap a(Bitmap bitmap) {
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

    public static Bitmap a(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
        float width = f * bitmap.getWidth();
        Path path = new Path();
        path.addRoundRect(rectF, width, width, Path.Direction.CW);
        canvas.clipPath(path);
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(i);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2, int i3, Context context) {
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

    public static Bitmap b(Bitmap bitmap) {
        return bitmap.getHeight() > bitmap.getWidth() ? Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - bitmap.getWidth()) / 2, bitmap.getWidth(), bitmap.getWidth()) : bitmap.getHeight() < bitmap.getWidth() ? Bitmap.createBitmap(bitmap, (bitmap.getWidth() - bitmap.getHeight()) / 2, 0, bitmap.getHeight(), bitmap.getHeight()) : bitmap;
    }

    public static Bitmap c(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Bitmap d(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        return Bitmap.createBitmap(bitmap, width / 5, height / 5, (width * 3) / 5, (height * 3) / 5);
    }

    public static Bitmap e(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        return Bitmap.createBitmap(bitmap, width / 10, height / 10, (width * 4) / 5, (height * 4) / 5);
    }
}
