package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes.dex */
class C2034a extends GradientDrawable {

    /* renamed from: a */
    private final Paint f8725a = new Paint(1);

    /* renamed from: b */
    private final RectF f8726b;

    /* renamed from: c */
    private int f8727c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2034a() {
        m10410c();
        this.f8726b = new RectF();
    }

    /* renamed from: a */
    private void m10407a(Canvas canvas) {
        if (m10408a(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f8727c);
    }

    /* renamed from: a */
    private boolean m10408a(Drawable.Callback callback) {
        return callback instanceof View;
    }

    /* renamed from: b */
    private void m10409b(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m10408a(callback)) {
            ((View) callback).setLayerType(2, null);
        } else {
            m10411c(canvas);
        }
    }

    /* renamed from: c */
    private void m10410c() {
        this.f8725a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f8725a.setColor(-1);
        this.f8725a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: c */
    private void m10411c(Canvas canvas) {
        this.f8727c = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
    }

    /* renamed from: a */
    void m10412a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f8726b;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        this.f8726b.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10413a(RectF rectF) {
        m10412a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m10414a() {
        return !this.f8726b.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10415b() {
        m10412a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m10409b(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f8726b, this.f8725a);
        m10407a(canvas);
    }
}
