package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p000.C0443b0;

/* renamed from: x */
/* loaded from: classes.dex */
class C3417x implements InterfaceC3506z {

    /* renamed from: a */
    final RectF f13972a = new RectF();

    /* renamed from: x$a */
    /* loaded from: classes.dex */
    class a implements C0443b0.a {
        a() {
        }

        @Override // p000.C0443b0.a
        /* renamed from: a */
        public void mo3258a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C3417x.this.f13972a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(C3417x.this.f13972a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C3417x.this.f13972a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C3417x.this.f13972a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C3417x.this.f13972a, 180.0f, 90.0f, true, paint);
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

    /* renamed from: j */
    private C0443b0 m16406j(InterfaceC3457y interfaceC3457y) {
        return (C0443b0) interfaceC3457y.m16529d();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: a */
    public float mo16070a(InterfaceC3457y interfaceC3457y) {
        return m16406j(interfaceC3457y).m3253c();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: a */
    public void mo15885a() {
        C0443b0.f2679r = new a();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: a */
    public void mo16071a(InterfaceC3457y interfaceC3457y, float f) {
        m16406j(interfaceC3457y).m3247a(f);
        m16407i(interfaceC3457y);
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: a */
    public void mo16072a(InterfaceC3457y interfaceC3457y, ColorStateList colorStateList) {
        m16406j(interfaceC3457y).m3248a(colorStateList);
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: b */
    public ColorStateList mo16073b(InterfaceC3457y interfaceC3457y) {
        return m16406j(interfaceC3457y).m3246a();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: b */
    public void mo16074b(InterfaceC3457y interfaceC3457y, float f) {
        m16406j(interfaceC3457y).m3254c(f);
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: c */
    public float mo16075c(InterfaceC3457y interfaceC3457y) {
        return m16406j(interfaceC3457y).m3257f();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: c */
    public void mo16076c(InterfaceC3457y interfaceC3457y, float f) {
        m16406j(interfaceC3457y).m3252b(f);
        m16407i(interfaceC3457y);
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: d */
    public float mo16077d(InterfaceC3457y interfaceC3457y) {
        return m16406j(interfaceC3457y).m3251b();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: e */
    public float mo16078e(InterfaceC3457y interfaceC3457y) {
        return m16406j(interfaceC3457y).m3255d();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: f */
    public float mo16079f(InterfaceC3457y interfaceC3457y) {
        return m16406j(interfaceC3457y).m3256e();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: g */
    public void mo16080g(InterfaceC3457y interfaceC3457y) {
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: h */
    public void mo16081h(InterfaceC3457y interfaceC3457y) {
        m16406j(interfaceC3457y).m3250a(interfaceC3457y.m16527b());
        m16407i(interfaceC3457y);
    }

    /* renamed from: i */
    public void m16407i(InterfaceC3457y interfaceC3457y) {
        Rect rect = new Rect();
        m16406j(interfaceC3457y).m3249a(rect);
        interfaceC3457y.m16525a((int) Math.ceil(mo16079f(interfaceC3457y)), (int) Math.ceil(mo16078e(interfaceC3457y)));
        interfaceC3457y.m16526a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
