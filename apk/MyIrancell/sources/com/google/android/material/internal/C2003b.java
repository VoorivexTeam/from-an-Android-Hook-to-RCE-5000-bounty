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
import androidx.appcompat.widget.C0198t0;
import p000.C2370d1;
import p000.C2565ht;
import p000.C3010o1;
import p000.C3107q2;

/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes.dex */
public final class C2003b {

    /* renamed from: T */
    private static final boolean f8490T;

    /* renamed from: U */
    private static final Paint f8491U;

    /* renamed from: A */
    private Paint f8492A;

    /* renamed from: B */
    private float f8493B;

    /* renamed from: C */
    private float f8494C;

    /* renamed from: D */
    private float f8495D;

    /* renamed from: E */
    private float f8496E;

    /* renamed from: F */
    private int[] f8497F;

    /* renamed from: G */
    private boolean f8498G;

    /* renamed from: J */
    private TimeInterpolator f8501J;

    /* renamed from: K */
    private TimeInterpolator f8502K;

    /* renamed from: L */
    private float f8503L;

    /* renamed from: M */
    private float f8504M;

    /* renamed from: N */
    private float f8505N;

    /* renamed from: O */
    private int f8506O;

    /* renamed from: P */
    private float f8507P;

    /* renamed from: Q */
    private float f8508Q;

    /* renamed from: R */
    private float f8509R;

    /* renamed from: S */
    private int f8510S;

    /* renamed from: a */
    private final View f8511a;

    /* renamed from: b */
    private boolean f8512b;

    /* renamed from: c */
    private float f8513c;

    /* renamed from: k */
    private ColorStateList f8521k;

    /* renamed from: l */
    private ColorStateList f8522l;

    /* renamed from: m */
    private float f8523m;

    /* renamed from: n */
    private float f8524n;

    /* renamed from: o */
    private float f8525o;

    /* renamed from: p */
    private float f8526p;

    /* renamed from: q */
    private float f8527q;

    /* renamed from: r */
    private float f8528r;

    /* renamed from: s */
    private Typeface f8529s;

    /* renamed from: t */
    private Typeface f8530t;

    /* renamed from: u */
    private Typeface f8531u;

    /* renamed from: v */
    private CharSequence f8532v;

    /* renamed from: w */
    private CharSequence f8533w;

    /* renamed from: x */
    private boolean f8534x;

    /* renamed from: y */
    private boolean f8535y;

    /* renamed from: z */
    private Bitmap f8536z;

    /* renamed from: g */
    private int f8517g = 16;

    /* renamed from: h */
    private int f8518h = 16;

    /* renamed from: i */
    private float f8519i = 15.0f;

    /* renamed from: j */
    private float f8520j = 15.0f;

    /* renamed from: H */
    private final TextPaint f8499H = new TextPaint(129);

    /* renamed from: I */
    private final TextPaint f8500I = new TextPaint(this.f8499H);

    /* renamed from: e */
    private final Rect f8515e = new Rect();

    /* renamed from: d */
    private final Rect f8514d = new Rect();

    /* renamed from: f */
    private final RectF f8516f = new RectF();

    static {
        f8490T = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        f8491U = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            f8491U.setColor(-65281);
        }
    }

    public C2003b(View view) {
        this.f8511a = view;
    }

    /* renamed from: a */
    private static float m10216a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C2565ht.m12243a(f, f2, f3);
    }

    /* renamed from: a */
    private static int m10217a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: a */
    private void m10218a(TextPaint textPaint) {
        textPaint.setTextSize(this.f8520j);
        textPaint.setTypeface(this.f8529s);
    }

    /* renamed from: a */
    private static boolean m10219a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: a */
    private static boolean m10220a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: b */
    private boolean m10221b(CharSequence charSequence) {
        return (C3107q2.m14919k(this.f8511a) == 1 ? C3010o1.f12377b : C3010o1.f12376a).mo14224a(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    private void m10222c(float f) {
        TextPaint textPaint;
        int m10251d;
        m10225e(f);
        this.f8527q = m10216a(this.f8525o, this.f8526p, f, this.f8501J);
        this.f8528r = m10216a(this.f8523m, this.f8524n, f, this.f8501J);
        m10226f(m10216a(this.f8519i, this.f8520j, f, this.f8502K));
        if (this.f8522l != this.f8521k) {
            textPaint = this.f8499H;
            m10251d = m10217a(m10231m(), m10251d(), f);
        } else {
            textPaint = this.f8499H;
            m10251d = m10251d();
        }
        textPaint.setColor(m10251d);
        this.f8499H.setShadowLayer(m10216a(this.f8507P, this.f8503L, f, (TimeInterpolator) null), m10216a(this.f8508Q, this.f8504M, f, (TimeInterpolator) null), m10216a(this.f8509R, this.f8505N, f, (TimeInterpolator) null), m10217a(this.f8510S, this.f8506O, f));
        C3107q2.m14877A(this.f8511a);
    }

    /* renamed from: d */
    private Typeface m10223d(int i) {
        TypedArray obtainStyledAttributes = this.f8511a.getContext().obtainStyledAttributes(i, new int[]{R.attr.fontFamily});
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

    /* renamed from: d */
    private void m10224d(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f8532v == null) {
            return;
        }
        float width = this.f8515e.width();
        float width2 = this.f8514d.width();
        if (m10219a(f, this.f8520j)) {
            f2 = this.f8520j;
            this.f8495D = 1.0f;
            Typeface typeface = this.f8531u;
            Typeface typeface2 = this.f8529s;
            if (typeface != typeface2) {
                this.f8531u = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.f8519i;
            Typeface typeface3 = this.f8531u;
            Typeface typeface4 = this.f8530t;
            if (typeface3 != typeface4) {
                this.f8531u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (m10219a(f, this.f8519i)) {
                this.f8495D = 1.0f;
            } else {
                this.f8495D = f / this.f8519i;
            }
            float f4 = this.f8520j / this.f8519i;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            f2 = f3;
            z2 = z;
        }
        if (width > 0.0f) {
            z2 = this.f8496E != f2 || this.f8498G || z2;
            this.f8496E = f2;
            this.f8498G = false;
        }
        if (this.f8533w == null || z2) {
            this.f8499H.setTextSize(this.f8496E);
            this.f8499H.setTypeface(this.f8531u);
            this.f8499H.setLinearText(this.f8495D != 1.0f);
            CharSequence ellipsize = TextUtils.ellipsize(this.f8532v, this.f8499H, width, TextUtils.TruncateAt.END);
            if (TextUtils.equals(ellipsize, this.f8533w)) {
                return;
            }
            this.f8533w = ellipsize;
            this.f8534x = m10221b(ellipsize);
        }
    }

    /* renamed from: e */
    private void m10225e(float f) {
        this.f8516f.left = m10216a(this.f8514d.left, this.f8515e.left, f, this.f8501J);
        this.f8516f.top = m10216a(this.f8523m, this.f8524n, f, this.f8501J);
        this.f8516f.right = m10216a(this.f8514d.right, this.f8515e.right, f, this.f8501J);
        this.f8516f.bottom = m10216a(this.f8514d.bottom, this.f8515e.bottom, f, this.f8501J);
    }

    /* renamed from: f */
    private void m10226f(float f) {
        m10224d(f);
        boolean z = f8490T && this.f8495D != 1.0f;
        this.f8535y = z;
        if (z) {
            m10230l();
        }
        C3107q2.m14877A(this.f8511a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m10227i() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C2003b.m10227i():void");
    }

    /* renamed from: j */
    private void m10228j() {
        m10222c(this.f8513c);
    }

    /* renamed from: k */
    private void m10229k() {
        Bitmap bitmap = this.f8536z;
        if (bitmap != null) {
            bitmap.recycle();
            this.f8536z = null;
        }
    }

    /* renamed from: l */
    private void m10230l() {
        if (this.f8536z != null || this.f8514d.isEmpty() || TextUtils.isEmpty(this.f8533w)) {
            return;
        }
        m10222c(0.0f);
        this.f8493B = this.f8499H.ascent();
        this.f8494C = this.f8499H.descent();
        TextPaint textPaint = this.f8499H;
        CharSequence charSequence = this.f8533w;
        int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
        int round2 = Math.round(this.f8494C - this.f8493B);
        if (round <= 0 || round2 <= 0) {
            return;
        }
        this.f8536z = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f8536z);
        CharSequence charSequence2 = this.f8533w;
        canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, round2 - this.f8499H.descent(), this.f8499H);
        if (this.f8492A == null) {
            this.f8492A = new Paint(3);
        }
    }

    /* renamed from: m */
    private int m10231m() {
        int[] iArr = this.f8497F;
        return iArr != null ? this.f8521k.getColorForState(iArr, 0) : this.f8521k.getDefaultColor();
    }

    /* renamed from: a */
    public float m10232a() {
        if (this.f8532v == null) {
            return 0.0f;
        }
        m10218a(this.f8500I);
        TextPaint textPaint = this.f8500I;
        CharSequence charSequence = this.f8532v;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public void m10233a(float f) {
        if (this.f8519i != f) {
            this.f8519i = f;
            m10255h();
        }
    }

    /* renamed from: a */
    public void m10234a(int i) {
        C0198t0 m1131a = C0198t0.m1131a(this.f8511a.getContext(), i, R$styleable.TextAppearance);
        if (m1131a.m1152g(R$styleable.TextAppearance_android_textColor)) {
            this.f8522l = m1131a.m1136a(R$styleable.TextAppearance_android_textColor);
        }
        if (m1131a.m1152g(R$styleable.TextAppearance_android_textSize)) {
            this.f8520j = m1131a.m1143c(R$styleable.TextAppearance_android_textSize, (int) this.f8520j);
        }
        this.f8506O = m1131a.m1145d(R$styleable.TextAppearance_android_shadowColor, 0);
        this.f8504M = m1131a.m1140b(R$styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f8505N = m1131a.m1140b(R$styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f8503L = m1131a.m1140b(R$styleable.TextAppearance_android_shadowRadius, 0.0f);
        m1131a.m1138a();
        if (Build.VERSION.SDK_INT >= 16) {
            this.f8529s = m10223d(i);
        }
        m10255h();
    }

    /* renamed from: a */
    public void m10235a(int i, int i2, int i3, int i4) {
        if (m10220a(this.f8515e, i, i2, i3, i4)) {
            return;
        }
        this.f8515e.set(i, i2, i3, i4);
        this.f8498G = true;
        m10254g();
    }

    /* renamed from: a */
    public void m10236a(TimeInterpolator timeInterpolator) {
        this.f8501J = timeInterpolator;
        m10255h();
    }

    /* renamed from: a */
    public void m10237a(ColorStateList colorStateList) {
        if (this.f8522l != colorStateList) {
            this.f8522l = colorStateList;
            m10255h();
        }
    }

    /* renamed from: a */
    public void m10238a(Canvas canvas) {
        float ascent;
        int save = canvas.save();
        if (this.f8533w != null && this.f8512b) {
            float f = this.f8527q;
            float f2 = this.f8528r;
            boolean z = this.f8535y && this.f8536z != null;
            if (z) {
                ascent = this.f8493B * this.f8495D;
            } else {
                ascent = this.f8499H.ascent() * this.f8495D;
                this.f8499H.descent();
            }
            if (z) {
                f2 += ascent;
            }
            float f3 = f2;
            float f4 = this.f8495D;
            if (f4 != 1.0f) {
                canvas.scale(f4, f4, f, f3);
            }
            if (z) {
                canvas.drawBitmap(this.f8536z, f, f3, this.f8492A);
            } else {
                CharSequence charSequence = this.f8533w;
                canvas.drawText(charSequence, 0, charSequence.length(), f, f3, this.f8499H);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public void m10239a(RectF rectF) {
        boolean m10221b = m10221b(this.f8532v);
        Rect rect = this.f8515e;
        float m10232a = !m10221b ? rect.left : rect.right - m10232a();
        rectF.left = m10232a;
        Rect rect2 = this.f8515e;
        rectF.top = rect2.top;
        rectF.right = !m10221b ? m10232a + m10232a() : rect2.right;
        rectF.bottom = this.f8515e.top + m10249c();
    }

    /* renamed from: a */
    public void m10240a(Typeface typeface) {
        this.f8530t = typeface;
        this.f8529s = typeface;
        m10255h();
    }

    /* renamed from: a */
    public void m10241a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f8532v)) {
            this.f8532v = charSequence;
            this.f8533w = null;
            m10229k();
            m10255h();
        }
    }

    /* renamed from: a */
    public final boolean m10242a(int[] iArr) {
        this.f8497F = iArr;
        if (!m10253f()) {
            return false;
        }
        m10255h();
        return true;
    }

    /* renamed from: b */
    public ColorStateList m10243b() {
        return this.f8522l;
    }

    /* renamed from: b */
    public void m10244b(float f) {
        float m11243a = C2370d1.m11243a(f, 0.0f, 1.0f);
        if (m11243a != this.f8513c) {
            this.f8513c = m11243a;
            m10228j();
        }
    }

    /* renamed from: b */
    public void m10245b(int i) {
        if (this.f8518h != i) {
            this.f8518h = i;
            m10255h();
        }
    }

    /* renamed from: b */
    public void m10246b(int i, int i2, int i3, int i4) {
        if (m10220a(this.f8514d, i, i2, i3, i4)) {
            return;
        }
        this.f8514d.set(i, i2, i3, i4);
        this.f8498G = true;
        m10254g();
    }

    /* renamed from: b */
    public void m10247b(TimeInterpolator timeInterpolator) {
        this.f8502K = timeInterpolator;
        m10255h();
    }

    /* renamed from: b */
    public void m10248b(ColorStateList colorStateList) {
        if (this.f8521k != colorStateList) {
            this.f8521k = colorStateList;
            m10255h();
        }
    }

    /* renamed from: c */
    public float m10249c() {
        m10218a(this.f8500I);
        return -this.f8500I.ascent();
    }

    /* renamed from: c */
    public void m10250c(int i) {
        if (this.f8517g != i) {
            this.f8517g = i;
            m10255h();
        }
    }

    /* renamed from: d */
    public int m10251d() {
        int[] iArr = this.f8497F;
        return iArr != null ? this.f8522l.getColorForState(iArr, 0) : this.f8522l.getDefaultColor();
    }

    /* renamed from: e */
    public float m10252e() {
        return this.f8513c;
    }

    /* renamed from: f */
    public final boolean m10253f() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f8522l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f8521k) != null && colorStateList.isStateful());
    }

    /* renamed from: g */
    void m10254g() {
        this.f8512b = this.f8515e.width() > 0 && this.f8515e.height() > 0 && this.f8514d.width() > 0 && this.f8514d.height() > 0;
    }

    /* renamed from: h */
    public void m10255h() {
        if (this.f8511a.getHeight() <= 0 || this.f8511a.getWidth() <= 0) {
            return;
        }
        m10227i();
        m10228j();
    }
}
