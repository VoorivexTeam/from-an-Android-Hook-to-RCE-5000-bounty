package com.comviva.webaxn.ui;

import android.graphics.Bitmap;
import android.graphics.Color;

/* loaded from: classes.dex */
public class d0 {
    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3, int i4, int i5) {
        Bitmap bitmap3;
        int i6 = i2 / 2;
        int i7 = i / 2;
        int i8 = i7;
        int i9 = 0;
        boolean z = false;
        while (true) {
            bitmap3 = null;
            if (i6 < 0) {
                break;
            }
            int i10 = i7;
            while (true) {
                if (i10 >= 0 && i8 >= 0) {
                    try {
                        int pixel = bitmap2.getPixel(i10, i6);
                        if (Color.red(pixel) == i3 && Color.green(pixel) == i4 && Color.blue(pixel) == i5) {
                            z = true;
                            i9 = i10;
                            break;
                        }
                        i8--;
                        if (z) {
                            z = false;
                            break;
                        }
                        i10--;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            i6--;
            e.printStackTrace();
            return bitmap3;
        }
        int i11 = i7 - i9;
        int i12 = i11 * 2;
        bitmap3 = Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_8888);
        int width = (bitmap.getWidth() - i12) / 2;
        int height = (bitmap.getHeight() - i12) / 2;
        for (int i13 = 0; i13 < bitmap3.getHeight(); i13++) {
            for (int i14 = 0; i14 < bitmap3.getWidth(); i14++) {
                if (((int) Math.sqrt(Math.pow(i11 - i14, 2.0d) + Math.pow(i11 - i13, 2.0d))) > i11) {
                    try {
                        bitmap3.setPixel(i14, i13, 0);
                    } catch (Exception unused) {
                    }
                } else {
                    bitmap3.setPixel(i14, i13, bitmap.getPixel(i14 + width, i13 + height));
                }
            }
        }
        return bitmap3;
    }
}
