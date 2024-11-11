package com.comviva.webaxn.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.os.AsyncTask;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class d extends AsyncTask<Object, Void, Object> {
    public static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static Bitmap a(Resources resources, int i, int i2, boolean z, int i3, byte[] bArr) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            if (z) {
                BitmapFactory.decodeResource(resources, i3, options);
            } else {
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            }
            options.inSampleSize = a(options, i, i2);
            options.inJustDecodeBounds = false;
            options.inScaled = false;
            options.inDensity = 0;
            options.inDither = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return z ? BitmapFactory.decodeResource(resources, i3, options) : BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] a(Context context, Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getWidth() * bitmap.getHeight());
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] a(Context context, byte[] bArr, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inSampleSize = a(options, i, i2);
            options.inJustDecodeBounds = false;
            options.inScaled = false;
            options.inDensity = 0;
            options.inDither = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null) {
                bArr = null;
            } else if (!NinePatch.isNinePatchChunk(decodeByteArray.getNinePatchChunk())) {
                bArr = a(context, decodeByteArray);
            }
            return bArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
