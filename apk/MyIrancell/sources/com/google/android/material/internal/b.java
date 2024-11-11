package com.google.android.material.internal;

import android.R;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.t0;
import defpackage.d1;
import defpackage.ht;
import defpackage.o1;
import defpackage.q2;

/* loaded from: classes.dex */
public final class b {
    private static final boolean T;
    private static final Paint U;
    private Paint A;
    private float B;
    private float C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private TimeInterpolator J;
    private TimeInterpolator K;
    private float L;
    private float M;
    private float N;
    private int O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private final View a;
    private boolean b;
    private float c;
    private ColorStateList k;
    private ColorStateList l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private CharSequence v;
    private CharSequence w;
    private boolean x;
    private boolean y;
    private Bitmap z;
    private int g = 16;
    private int h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private final TextPaint H = new TextPaint(129);
    private final TextPaint I = new TextPaint(this.H);
    private final Rect e = new Rect();
    private final Rect d = new Rect();
    private final RectF f = new RectF();

    static {
        T = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        U = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            U.setColor(-65281);
        }
    }

    public b(View view) {
        this.a = view;
    }

    private static float a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return ht.a(f, f2, f3);
    }

    private static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private void a(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    private static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static boolean a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private boolean b(CharSequence charSequence) {
        return (q2.k(this.a) == 1 ? o1.b : o1.a).a(charSequence, 0, charSequence.length());
    }

    private void c(float f) {
        TextPaint textPaint;
        int d;
        e(f);
        this.q = a(this.o, this.p, f, this.J);
        this.r = a(this.m, this.n, f, this.J);
        f(a(this.i, this.j, f, this.K));
        if (this.l != this.k) {
            textPaint = this.H;
            d = a(m(), d(), f);
        } else {
            textPaint = this.H;
            d = d();
        }
        textPaint.setColor(d);
        this.H.setShadowLayer(a(this.P, this.L, f, (TimeInterpolator) null), a(this.Q, this.M, f, (TimeInterpolator) null), a(this.R, this.N, f, (TimeInterpolator) null), a(this.S, this.O, f));
        q2.A(this.a);
    }

    private Typeface d(int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(i, new int[]{R.attr.fontFamily});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void d(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.v == null) {
            return;
        }
        float width = this.e.width();
        float width2 = this.d.width();
        if (a(f, this.j)) {
            f2 = this.j;
            this.D = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.i;
            Typeface typeface3 = this.u;
            Typeface typeface4 = this.t;
            if (typeface3 != typeface4) {
                this.u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (a(f, this.i)) {
                this.D = 1.0f;
            } else {
                this.D = f / this.i;
            }
            float f4 = this.j / this.i;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            f2 = f3;
            z2 = z;
        }
        if (width > 0.0f) {
            z2 = this.E != f2 || this.G || z2;
            this.E = f2;
            this.G = false;
        }
        if (this.w == null || z2) {
            this.H.setTextSize(this.E);
            this.H.setTypeface(this.u);
            this.H.setLinearText(this.D != 1.0f);
            CharSequence ellipsize = TextUtils.ellipsize(this.v, this.H, width, TextUtils.TruncateAt.END);
            if (TextUtils.equals(ellipsize, this.w)) {
                return;
            }
            this.w = ellipsize;
            this.x = b(ellipsize);
        }
    }

    private void e(float f) {
        this.f.left = a(this.d.left, this.e.left, f, this.J);
        this.f.top = a(this.m, this.n, f, this.J);
        this.f.right = a(this.d.right, this.e.right, f, this.J);
        this.f.bottom = a(this.d.bottom, this.e.bottom, f, this.J);
    }

    private void f(float f) {
        d(f);
        boolean z = T && this.D != 1.0f;
        this.y = z;
        if (z) {
            l();
        }
        q2.A(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.b.i():void");
    }

    private void j() {
        c(this.c);
    }

    private void k() {
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            bitmap.recycle();
            this.z = null;
        }
    }

    private void l() {
        if (this.z != null || this.d.isEmpty() || TextUtils.isEmpty(this.w)) {
            return;
        }
        c(0.0f);
        this.B = this.H.ascent();
        this.C = this.H.descent();
        TextPaint textPaint = this.H;
        CharSequence charSequence = this.w;
        int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
        int round2 = Math.round(this.C - this.B);
        if (round <= 0 || round2 <= 0) {
            return;
        }
        this.z = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.z);
        CharSequence charSequence2 = this.w;
        canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, round2 - this.H.descent(), this.H);
        if (this.A == null) {
            this.A = new Paint(3);
        }
    }

    private int m() {
        int[] iArr = this.F;
        return iArr != null ? this.k.getColorForState(iArr, 0) : this.k.getDefaultColor();
    }

    public float a() {
        if (this.v == null) {
            return 0.0f;
        }
        a(this.I);
        TextPaint textPaint = this.I;
        CharSequence charSequence = this.v;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void a(float f) {
        if (this.i != f) {
            this.i = f;
            h();
        }
    }

    public void a(int i) {
        t0 a = t0.a(this.a.getContext(), i, R$styleable.TextAppearance);
        if (a.g(R$styleable.TextAppearance_android_textColor)) {
            this.l = a.a(R$styleable.TextAppearance_android_textColor);
        }
        if (a.g(R$styleable.TextAppearance_android_textSize)) {
            this.j = a.c(R$styleable.TextAppearance_android_textSize, (int) this.j);
        }
        this.O = a.d(R$styleable.TextAppearance_android_shadowColor, 0);
        this.M = a.b(R$styleable.TextAppearance_android_shadowDx, 0.0f);
        this.N = a.b(R$styleable.TextAppearance_android_shadowDy, 0.0f);
        this.L = a.b(R$styleable.TextAppearance_android_shadowRadius, 0.0f);
        a.a();
        if (Build.VERSION.SDK_INT >= 16) {
            this.s = d(i);
        }
        h();
    }

    public void a(int i, int i2, int i3, int i4) {
        if (a(this.e, i, i2, i3, i4)) {
            return;
        }
        this.e.set(i, i2, i3, i4);
        this.G = true;
        g();
    }

    public void a(TimeInterpolator timeInterpolator) {
        this.J = timeInterpolator;
        h();
    }

    public void a(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            h();
        }
    }

    public void a(Canvas canvas) {
        float ascent;
        int save = canvas.save();
        if (this.w != null && this.b) {
            float f = this.q;
            float f2 = this.r;
            boolean z = this.y && this.z != null;
            if (z) {
                ascent = this.B * this.D;
            } else {
                ascent = this.H.ascent() * this.D;
                this.H.descent();
            }
            if (z) {
                f2 += ascent;
            }
            float f3 = f2;
            float f4 = this.D;
            if (f4 != 1.0f) {
                canvas.scale(f4, f4, f, f3);
            }
            if (z) {
                canvas.drawBitmap(this.z, f, f3, this.A);
            } else {
                CharSequence charSequence = this.w;
                canvas.drawText(charSequence, 0, charSequence.length(), f, f3, this.H);
            }
        }
        canvas.restoreToCount(save);
    }

    public void a(RectF rectF) {
        boolean b = b(this.v);
        Rect rect = this.e;
        float a = !b ? rect.left : rect.right - a();
        rectF.left = a;
        Rect rect2 = this.e;
        rectF.top = rect2.top;
        rectF.right = !b ? a + a() : rect2.right;
        rectF.bottom = this.e.top + c();
    }

    public void a(Typeface typeface) {
        this.t = typeface;
        this.s = typeface;
        h();
    }

    public void a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.v)) {
            this.v = charSequence;
            this.w = null;
            k();
            h();
        }
    }

    public final boolean a(int[] iArr) {
        this.F = iArr;
        if (!f()) {
            return false;
        }
        h();
        return true;
    }

    public ColorStateList b() {
        return this.l;
    }

    public void b(float f) {
        float a = d1.a(f, 0.0f, 1.0f);
        if (a != this.c) {
            this.c = a;
            j();
        }
    }

    public void b(int i) {
        if (this.h != i) {
            this.h = i;
            h();
        }
    }

    public void b(int i, int i2, int i3, int i4) {
        if (a(this.d, i, i2, i3, i4)) {
            return;
        }
        this.d.set(i, i2, i3, i4);
        this.G = true;
        g();
    }

    public void b(TimeInterpolator timeInterpolator) {
        this.K = timeInterpolator;
        h();
    }

    public void b(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            h();
        }
    }

    public float c() {
        a(this.I);
        return -this.I.ascent();
    }

    public void c(int i) {
        if (this.g != i) {
            this.g = i;
            h();
        }
    }

    public int d() {
        int[] iArr = this.F;
        return iArr != null ? this.l.getColorForState(iArr, 0) : this.l.getDefaultColor();
    }

    public float e() {
        return this.c;
    }

    public final boolean f() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.k) != null && colorStateList.isStateful());
    }

    void g() {
        this.b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    public void h() {
        if (this.a.getHeight() <= 0 || this.a.getWidth() <= 0) {
            return;
        }
        i();
        j();
    }
}
