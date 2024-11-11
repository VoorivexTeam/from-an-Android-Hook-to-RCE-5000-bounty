package ir.tapsell.sdk.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class c {
    @SuppressLint({"NewApi"})
    public static Bitmap a(Context context, boolean z, Bitmap bitmap, int i) {
        Bitmap bitmap2;
        int i2;
        int i3;
        int[] iArr;
        int[] iArr2;
        int i4 = i;
        if (Build.VERSION.SDK_INT > 16 && z) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            RenderScript create = RenderScript.create(context);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(i4);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            createTyped.copyTo(copy);
            create.destroy();
            return copy;
        }
        Bitmap copy2 = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        if (i4 < 1) {
            return null;
        }
        int width = copy2.getWidth();
        int height = copy2.getHeight();
        int i5 = width * height;
        int[] iArr3 = new int[i5];
        copy2.getPixels(iArr3, 0, width, 0, 0, width, height);
        int i6 = width - 1;
        int i7 = height - 1;
        int i8 = i4 + i4 + 1;
        int[] iArr4 = new int[i5];
        int[] iArr5 = new int[i5];
        int[] iArr6 = new int[i5];
        int[] iArr7 = new int[Math.max(width, height)];
        int i9 = (i8 + 1) >> 1;
        int i10 = i9 * i9;
        int i11 = i10 * 256;
        int[] iArr8 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr8[i12] = i12 / i10;
        }
        int[][] iArr9 = (int[][]) Array.newInstance((Class<?>) int.class, i8, 3);
        int i13 = i4 + 1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            bitmap2 = copy2;
            if (i14 >= height) {
                break;
            }
            int i17 = height;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = -i4;
            int i27 = 0;
            while (true) {
                i3 = i7;
                iArr = iArr7;
                if (i26 > i4) {
                    break;
                }
                int i28 = iArr3[i15 + Math.min(i6, Math.max(i26, 0))];
                int[] iArr10 = iArr9[i26 + i4];
                iArr10[0] = (i28 & 16711680) >> 16;
                iArr10[1] = (i28 & 65280) >> 8;
                iArr10[2] = i28 & 255;
                int abs = i13 - Math.abs(i26);
                i27 += iArr10[0] * abs;
                i18 += iArr10[1] * abs;
                i19 += iArr10[2] * abs;
                if (i26 > 0) {
                    i23 += iArr10[0];
                    i24 += iArr10[1];
                    i25 += iArr10[2];
                } else {
                    i20 += iArr10[0];
                    i21 += iArr10[1];
                    i22 += iArr10[2];
                }
                i26++;
                i7 = i3;
                iArr7 = iArr;
            }
            int i29 = i27;
            int i30 = i4;
            int i31 = 0;
            while (i31 < width) {
                iArr4[i15] = iArr8[i29];
                iArr5[i15] = iArr8[i18];
                iArr6[i15] = iArr8[i19];
                int i32 = i29 - i20;
                int i33 = i18 - i21;
                int i34 = i19 - i22;
                int[] iArr11 = iArr9[((i30 - i4) + i8) % i8];
                int i35 = i20 - iArr11[0];
                int i36 = i21 - iArr11[1];
                int i37 = i22 - iArr11[2];
                if (i14 == 0) {
                    iArr2 = iArr8;
                    iArr[i31] = Math.min(i31 + i4 + 1, i6);
                } else {
                    iArr2 = iArr8;
                }
                int i38 = iArr3[i16 + iArr[i31]];
                iArr11[0] = (i38 & 16711680) >> 16;
                iArr11[1] = (i38 & 65280) >> 8;
                iArr11[2] = i38 & 255;
                int i39 = i23 + iArr11[0];
                int i40 = i24 + iArr11[1];
                int i41 = i25 + iArr11[2];
                i29 = i32 + i39;
                i18 = i33 + i40;
                i19 = i34 + i41;
                i30 = (i30 + 1) % i8;
                int[] iArr12 = iArr9[i30 % i8];
                i20 = i35 + iArr12[0];
                i21 = i36 + iArr12[1];
                i22 = i37 + iArr12[2];
                i23 = i39 - iArr12[0];
                i24 = i40 - iArr12[1];
                i25 = i41 - iArr12[2];
                i15++;
                i31++;
                iArr8 = iArr2;
            }
            i16 += width;
            i14++;
            copy2 = bitmap2;
            height = i17;
            i7 = i3;
            iArr7 = iArr;
        }
        int[] iArr13 = iArr8;
        int i42 = i7;
        int[] iArr14 = iArr7;
        int i43 = height;
        int i44 = 0;
        while (i44 < width) {
            int i45 = -i4;
            int i46 = i8;
            int[] iArr15 = iArr3;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = i45;
            int i55 = i45 * width;
            int i56 = 0;
            int i57 = 0;
            while (true) {
                i2 = width;
                if (i54 > i4) {
                    break;
                }
                int max = Math.max(0, i55) + i44;
                int[] iArr16 = iArr9[i54 + i4];
                iArr16[0] = iArr4[max];
                iArr16[1] = iArr5[max];
                iArr16[2] = iArr6[max];
                int abs2 = i13 - Math.abs(i54);
                i56 += iArr4[max] * abs2;
                i57 += iArr5[max] * abs2;
                i47 += iArr6[max] * abs2;
                if (i54 > 0) {
                    i51 += iArr16[0];
                    i52 += iArr16[1];
                    i53 += iArr16[2];
                } else {
                    i48 += iArr16[0];
                    i49 += iArr16[1];
                    i50 += iArr16[2];
                }
                int i58 = i42;
                if (i54 < i58) {
                    i55 += i2;
                }
                i54++;
                i42 = i58;
                width = i2;
            }
            int i59 = i42;
            int i60 = i44;
            int i61 = i4;
            int i62 = i47;
            int i63 = i43;
            int i64 = i57;
            int i65 = 0;
            while (i65 < i63) {
                iArr15[i60] = (iArr15[i60] & (-16777216)) | (iArr13[i56] << 16) | (iArr13[i64] << 8) | iArr13[i62];
                int i66 = i56 - i48;
                int i67 = i64 - i49;
                int i68 = i62 - i50;
                int[] iArr17 = iArr9[((i61 - i4) + i46) % i46];
                int i69 = i48 - iArr17[0];
                int i70 = i49 - iArr17[1];
                int i71 = i50 - iArr17[2];
                if (i44 == 0) {
                    iArr14[i65] = Math.min(i65 + i13, i59) * i2;
                }
                int i72 = iArr14[i65] + i44;
                iArr17[0] = iArr4[i72];
                iArr17[1] = iArr5[i72];
                iArr17[2] = iArr6[i72];
                int i73 = i51 + iArr17[0];
                int i74 = i52 + iArr17[1];
                int i75 = i53 + iArr17[2];
                i56 = i66 + i73;
                i64 = i67 + i74;
                i62 = i68 + i75;
                i61 = (i61 + 1) % i46;
                int[] iArr18 = iArr9[i61];
                i48 = i69 + iArr18[0];
                i49 = i70 + iArr18[1];
                i50 = i71 + iArr18[2];
                i51 = i73 - iArr18[0];
                i52 = i74 - iArr18[1];
                i53 = i75 - iArr18[2];
                i60 += i2;
                i65++;
                i4 = i;
            }
            i44++;
            i4 = i;
            i42 = i59;
            i43 = i63;
            i8 = i46;
            iArr3 = iArr15;
            width = i2;
        }
        int i76 = width;
        bitmap2.setPixels(iArr3, 0, i76, 0, 0, i76, i43);
        return bitmap2;
    }
}
