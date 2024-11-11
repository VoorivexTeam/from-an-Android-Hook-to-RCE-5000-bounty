package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import defpackage.b0;

/* loaded from: classes.dex */
class x implements z {
    final RectF a = new RectF();

    /* loaded from: classes.dex */
    class a implements b0.a {
        a() {
        }

        @Override // b0.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                x.this.a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(x.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(x.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(x.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(x.this.a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = (rectF.left + f3) - 1.0f;
                float f6 = rectF.top;
                canvas.drawRect(f5, f6, (rectF.right - f3) + 1.0f, f6 + f3, paint);
                float f7 = (rectF.left + f3) - 1.0f;
                float f8 = rectF.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF.right - f3) + 1.0f, f8, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    private b0 j(y yVar) {
        return (b0) yVar.d();
    }

    @Override // defpackage.z
    public float a(y yVar) {
        return j(yVar).c();
    }

    @Override // defpackage.z
    public void a() {
        b0.r = new a();
    }

    @Override // defpackage.z
    public void a(y yVar, float f) {
        j(yVar).a(f);
        i(yVar);
    }

    @Override // defpackage.z
    public void a(y yVar, ColorStateList colorStateList) {
        j(yVar).a(colorStateList);
    }

    @Override // defpackage.z
    public ColorStateList b(y yVar) {
        return j(yVar).a();
    }

    @Override // defpackage.z
    public void b(y yVar, float f) {
        j(yVar).c(f);
    }

    @Override // defpackage.z
    public float c(y yVar) {
        return j(yVar).f();
    }

    @Override // defpackage.z
    public void c(y yVar, float f) {
        j(yVar).b(f);
        i(yVar);
    }

    @Override // defpackage.z
    public float d(y yVar) {
        return j(yVar).b();
    }

    @Override // defpackage.z
    public float e(y yVar) {
        return j(yVar).d();
    }

    @Override // defpackage.z
    public float f(y yVar) {
        return j(yVar).e();
    }

    @Override // defpackage.z
    public void g(y yVar) {
    }

    @Override // defpackage.z
    public void h(y yVar) {
        j(yVar).a(yVar.b());
        i(yVar);
    }

    public void i(y yVar) {
        Rect rect = new Rect();
        j(yVar).a(rect);
        yVar.a((int) Math.ceil(f(yVar)), (int) Math.ceil(e(yVar)));
        yVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
