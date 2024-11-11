package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;
import com.theartofdev.edmodo.cropper.C2339f;
import com.theartofdev.edmodo.cropper.CropImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.theartofdev.edmodo.cropper.e */
/* loaded from: classes.dex */
public final class C2338e {

    /* renamed from: c */
    private float f9512c;

    /* renamed from: d */
    private float f9513d;

    /* renamed from: e */
    private float f9514e;

    /* renamed from: f */
    private float f9515f;

    /* renamed from: g */
    private float f9516g;

    /* renamed from: h */
    private float f9517h;

    /* renamed from: i */
    private float f9518i;

    /* renamed from: j */
    private float f9519j;

    /* renamed from: a */
    private final RectF f9510a = new RectF();

    /* renamed from: b */
    private final RectF f9511b = new RectF();

    /* renamed from: k */
    private float f9520k = 1.0f;

    /* renamed from: l */
    private float f9521l = 1.0f;

    /* renamed from: a */
    private C2339f.b m11152a(float f, float f2) {
        float width = this.f9510a.width() / 6.0f;
        RectF rectF = this.f9510a;
        float f3 = rectF.left;
        float f4 = f3 + width;
        float f5 = f3 + (width * 5.0f);
        float height = rectF.height() / 6.0f;
        float f6 = this.f9510a.top;
        float f7 = f6 + height;
        float f8 = f6 + (height * 5.0f);
        return f < f4 ? f2 < f7 ? C2339f.b.TOP_LEFT : f2 < f8 ? C2339f.b.LEFT : C2339f.b.BOTTOM_LEFT : f < f5 ? f2 < f7 ? C2339f.b.TOP : f2 < f8 ? C2339f.b.CENTER : C2339f.b.BOTTOM : f2 < f7 ? C2339f.b.TOP_RIGHT : f2 < f8 ? C2339f.b.RIGHT : C2339f.b.BOTTOM_RIGHT;
    }

    /* renamed from: a */
    private C2339f.b m11153a(float f, float f2, float f3) {
        RectF rectF = this.f9510a;
        if (m11154a(f, f2, rectF.left, rectF.top, f3)) {
            return C2339f.b.TOP_LEFT;
        }
        RectF rectF2 = this.f9510a;
        if (m11154a(f, f2, rectF2.right, rectF2.top, f3)) {
            return C2339f.b.TOP_RIGHT;
        }
        RectF rectF3 = this.f9510a;
        if (m11154a(f, f2, rectF3.left, rectF3.bottom, f3)) {
            return C2339f.b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.f9510a;
        if (m11154a(f, f2, rectF4.right, rectF4.bottom, f3)) {
            return C2339f.b.BOTTOM_RIGHT;
        }
        RectF rectF5 = this.f9510a;
        if (!m11155a(f, f2, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) || !m11158i()) {
            RectF rectF6 = this.f9510a;
            if (m11156b(f, f2, rectF6.left, rectF6.right, rectF6.top, f3)) {
                return C2339f.b.TOP;
            }
            RectF rectF7 = this.f9510a;
            if (m11156b(f, f2, rectF7.left, rectF7.right, rectF7.bottom, f3)) {
                return C2339f.b.BOTTOM;
            }
            RectF rectF8 = this.f9510a;
            if (m11157c(f, f2, rectF8.left, rectF8.top, rectF8.bottom, f3)) {
                return C2339f.b.LEFT;
            }
            RectF rectF9 = this.f9510a;
            if (m11157c(f, f2, rectF9.right, rectF9.top, rectF9.bottom, f3)) {
                return C2339f.b.RIGHT;
            }
            RectF rectF10 = this.f9510a;
            if (!m11155a(f, f2, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) || m11158i()) {
                return null;
            }
        }
        return C2339f.b.CENTER;
    }

    /* renamed from: a */
    private static boolean m11154a(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }

    /* renamed from: a */
    private static boolean m11155a(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    /* renamed from: b */
    private static boolean m11156b(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f4 && Math.abs(f2 - f5) <= f6;
    }

    /* renamed from: c */
    private static boolean m11157c(float f, float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5;
    }

    /* renamed from: i */
    private boolean m11158i() {
        return !m11170h();
    }

    /* renamed from: a */
    public float m11159a() {
        return Math.min(this.f9515f, this.f9519j / this.f9521l);
    }

    /* renamed from: a */
    public C2339f m11160a(float f, float f2, float f3, CropImageView.EnumC2322c enumC2322c) {
        C2339f.b m11152a = enumC2322c == CropImageView.EnumC2322c.OVAL ? m11152a(f, f2) : m11153a(f, f2, f3);
        if (m11152a != null) {
            return new C2339f(m11152a, this, f, f2);
        }
        return null;
    }

    /* renamed from: a */
    public void m11161a(float f, float f2, float f3, float f4) {
        this.f9514e = f;
        this.f9515f = f2;
        this.f9520k = f3;
        this.f9521l = f4;
    }

    /* renamed from: a */
    public void m11162a(RectF rectF) {
        this.f9510a.set(rectF);
    }

    /* renamed from: a */
    public void m11163a(CropImageOptions cropImageOptions) {
        this.f9512c = cropImageOptions.f9371y;
        this.f9513d = cropImageOptions.f9372z;
        this.f9516g = cropImageOptions.f9317A;
        this.f9517h = cropImageOptions.f9318B;
        this.f9518i = cropImageOptions.f9319C;
        this.f9519j = cropImageOptions.f9320D;
    }

    /* renamed from: b */
    public float m11164b() {
        return Math.min(this.f9514e, this.f9518i / this.f9520k);
    }

    /* renamed from: c */
    public float m11165c() {
        return Math.max(this.f9513d, this.f9517h / this.f9521l);
    }

    /* renamed from: d */
    public float m11166d() {
        return Math.max(this.f9512c, this.f9516g / this.f9520k);
    }

    /* renamed from: e */
    public RectF m11167e() {
        this.f9511b.set(this.f9510a);
        return this.f9511b;
    }

    /* renamed from: f */
    public float m11168f() {
        return this.f9521l;
    }

    /* renamed from: g */
    public float m11169g() {
        return this.f9520k;
    }

    /* renamed from: h */
    public boolean m11170h() {
        return this.f9510a.width() >= 100.0f && this.f9510a.height() >= 100.0f;
    }
}
