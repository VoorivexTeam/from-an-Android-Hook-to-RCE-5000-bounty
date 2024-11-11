package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;
import com.theartofdev.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private final RectF a = new RectF();
    private final RectF b = new RectF();
    private float k = 1.0f;
    private float l = 1.0f;

    private f.b a(float f, float f2) {
        float width = this.a.width() / 6.0f;
        RectF rectF = this.a;
        float f3 = rectF.left;
        float f4 = f3 + width;
        float f5 = f3 + (width * 5.0f);
        float height = rectF.height() / 6.0f;
        float f6 = this.a.top;
        float f7 = f6 + height;
        float f8 = f6 + (height * 5.0f);
        return f < f4 ? f2 < f7 ? f.b.TOP_LEFT : f2 < f8 ? f.b.LEFT : f.b.BOTTOM_LEFT : f < f5 ? f2 < f7 ? f.b.TOP : f2 < f8 ? f.b.CENTER : f.b.BOTTOM : f2 < f7 ? f.b.TOP_RIGHT : f2 < f8 ? f.b.RIGHT : f.b.BOTTOM_RIGHT;
    }

    private f.b a(float f, float f2, float f3) {
        RectF rectF = this.a;
        if (a(f, f2, rectF.left, rectF.top, f3)) {
            return f.b.TOP_LEFT;
        }
        RectF rectF2 = this.a;
        if (a(f, f2, rectF2.right, rectF2.top, f3)) {
            return f.b.TOP_RIGHT;
        }
        RectF rectF3 = this.a;
        if (a(f, f2, rectF3.left, rectF3.bottom, f3)) {
            return f.b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.a;
        if (a(f, f2, rectF4.right, rectF4.bottom, f3)) {
            return f.b.BOTTOM_RIGHT;
        }
        RectF rectF5 = this.a;
        if (!a(f, f2, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) || !i()) {
            RectF rectF6 = this.a;
            if (b(f, f2, rectF6.left, rectF6.right, rectF6.top, f3)) {
                return f.b.TOP;
            }
            RectF rectF7 = this.a;
            if (b(f, f2, rectF7.left, rectF7.right, rectF7.bottom, f3)) {
                return f.b.BOTTOM;
            }
            RectF rectF8 = this.a;
            if (c(f, f2, rectF8.left, rectF8.top, rectF8.bottom, f3)) {
                return f.b.LEFT;
            }
            RectF rectF9 = this.a;
            if (c(f, f2, rectF9.right, rectF9.top, rectF9.bottom, f3)) {
                return f.b.RIGHT;
            }
            RectF rectF10 = this.a;
            if (!a(f, f2, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) || i()) {
                return null;
            }
        }
        return f.b.CENTER;
    }

    private static boolean a(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }

    private static boolean a(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    private static boolean b(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f4 && Math.abs(f2 - f5) <= f6;
    }

    private static boolean c(float f, float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5;
    }

    private boolean i() {
        return !h();
    }

    public float a() {
        return Math.min(this.f, this.j / this.l);
    }

    public f a(float f, float f2, float f3, CropImageView.c cVar) {
        f.b a = cVar == CropImageView.c.OVAL ? a(f, f2) : a(f, f2, f3);
        if (a != null) {
            return new f(a, this, f, f2);
        }
        return null;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.e = f;
        this.f = f2;
        this.k = f3;
        this.l = f4;
    }

    public void a(RectF rectF) {
        this.a.set(rectF);
    }

    public void a(CropImageOptions cropImageOptions) {
        this.c = cropImageOptions.y;
        this.d = cropImageOptions.z;
        this.g = cropImageOptions.A;
        this.h = cropImageOptions.B;
        this.i = cropImageOptions.C;
        this.j = cropImageOptions.D;
    }

    public float b() {
        return Math.min(this.e, this.i / this.k);
    }

    public float c() {
        return Math.max(this.d, this.h / this.l);
    }

    public float d() {
        return Math.max(this.c, this.g / this.k);
    }

    public RectF e() {
        this.b.set(this.a);
        return this.b;
    }

    public float f() {
        return this.l;
    }

    public float g() {
        return this.k;
    }

    public boolean h() {
        return this.a.width() >= 100.0f && this.a.height() >= 100.0f;
    }
}
