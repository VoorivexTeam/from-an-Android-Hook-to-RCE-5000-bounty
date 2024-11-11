package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0737r1;
import com.comviva.webaxn.utils.C0755x1;
import p000.C2391dj;
import p000.C3489yj;
import p000.C3530zi;

/* renamed from: com.comviva.webaxn.ui.n1 */
/* loaded from: classes.dex */
public abstract class AbstractC0652n1 {

    /* renamed from: r */
    public static float f4038r = 1.0f;

    /* renamed from: s */
    public static int f4039s = 76;

    /* renamed from: t */
    public static int f4040t = 77;

    /* renamed from: u */
    public static int f4041u;

    /* renamed from: v */
    public static int f4042v;

    /* renamed from: w */
    public static int f4043w;

    /* renamed from: b */
    protected ViewGroup f4044b;

    /* renamed from: c */
    public Context f4045c;

    /* renamed from: d */
    protected int f4046d;

    /* renamed from: g */
    protected C0755x1.p f4049g;

    /* renamed from: h */
    public int f4050h;

    /* renamed from: i */
    public int f4051i;

    /* renamed from: j */
    public float f4052j;

    /* renamed from: k */
    protected int f4053k;

    /* renamed from: l */
    protected int f4054l;

    /* renamed from: n */
    public int f4056n;

    /* renamed from: o */
    public boolean f4057o;

    /* renamed from: p */
    private C0737r1 f4058p;

    /* renamed from: e */
    protected Drawable f4047e = null;

    /* renamed from: f */
    protected C0657p0 f4048f = null;

    /* renamed from: m */
    public boolean f4055m = C0755x1.m6177c();

    /* renamed from: q */
    public View.OnTouchListener f4059q = new a();

    /* renamed from: com.comviva.webaxn.ui.n1$a */
    /* loaded from: classes.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:150:0x021b, code lost:
        
            if (r11.length() == 0) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x016f, code lost:
        
            if (r11.length() == 0) goto L99;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
            /*
                Method dump skipped, instructions count: 544
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.AbstractC0652n1.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.n1$b */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f4061b;

        /* renamed from: c */
        final /* synthetic */ float f4062c;

        b(View view, float f) {
            this.f4061b = view;
            this.f4062c = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4061b.setAlpha(this.f4062c);
        }
    }

    public AbstractC0652n1(Context context) {
        this.f4045c = context;
        float m5544a = C0687b.m5342a(context).m5343a().m5544a();
        if (m5544a != 0.0f) {
            f4041u = (int) (40.0f * m5544a);
        }
        float f = m5544a * 0.0f;
        f4042v = Math.round(f);
        f4043w = Math.round(f);
        this.f4051i = 0;
    }

    /* renamed from: a */
    public static void m4697a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 11) {
            view.setAlpha(f);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: a */
    public static void m4698a(View view, float f, long j) {
        view.postDelayed(new b(view, f), j);
    }

    /* renamed from: a */
    public static void m4699a(View view, long j, boolean z, float f, float f2) {
        if (view != null) {
            RotateAnimation rotateAnimation = z ? (f == 0.0f && f2 == 0.0f) ? new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f) : new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f) : (f == 0.0f && f2 == 0.0f) ? new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f) : new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setDuration(j);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            view.startAnimation(rotateAnimation);
        }
    }

    /* renamed from: a */
    public static void m4700a(C2391dj c2391dj, View view) {
        long m11432b;
        boolean z;
        if (view != null) {
            if (c2391dj.m11428a() == 7) {
                view.setAlpha(c2391dj.m11440e());
                m4698a(view, c2391dj.m11436c(), c2391dj.m11432b());
                return;
            }
            if (c2391dj.m11428a() == 5) {
                m11432b = c2391dj.m11432b();
                z = true;
            } else {
                if (c2391dj.m11428a() != 6) {
                    return;
                }
                m11432b = c2391dj.m11432b();
                z = false;
            }
            m4699a(view, m11432b, z, c2391dj.m11438d(), c2391dj.m11441f());
        }
    }

    /* renamed from: d */
    public static int m4701d(int i) {
        int alpha = Color.alpha(i);
        if (i != 0 && alpha == 0) {
            alpha = 255;
        }
        return Color.argb(alpha, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: e */
    public static int m4702e(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* renamed from: f */
    public static Typeface m4703f(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Typeface.defaultFromStyle(0) : Typeface.defaultFromStyle(3) : Typeface.defaultFromStyle(2) : Typeface.defaultFromStyle(1) : Typeface.defaultFromStyle(0);
    }

    /* renamed from: a */
    public Drawable m4704a(Bitmap bitmap, int i, int i2, boolean z) {
        return NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk()) ? (!z || ((i <= 0 || i >= bitmap.getWidth()) && (i2 <= 0 || i2 >= bitmap.getHeight()))) ? new NinePatchDrawable(bitmap, bitmap.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i2, false)) : (!z || ((i <= 0 || i >= bitmap.getWidth()) && (i2 <= 0 || i2 >= bitmap.getHeight()))) ? new BitmapDrawable(bitmap) : new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i2, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4 A[Catch: Exception -> 0x00fe, OutOfMemoryError -> 0x0103, TryCatch #8 {Exception -> 0x00fe, OutOfMemoryError -> 0x0103, blocks: (B:28:0x009c, B:30:0x00aa, B:32:0x00b5, B:33:0x00c0, B:35:0x00c4, B:36:0x00d4, B:74:0x00cd), top: B:27:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[Catch: Exception -> 0x00f6, OutOfMemoryError -> 0x00fa, TRY_LEAVE, TryCatch #6 {Exception -> 0x00f6, OutOfMemoryError -> 0x00fa, blocks: (B:39:0x00de, B:41:0x00e6), top: B:38:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd A[Catch: Exception -> 0x00fe, OutOfMemoryError -> 0x0103, TryCatch #8 {Exception -> 0x00fe, OutOfMemoryError -> 0x0103, blocks: (B:28:0x009c, B:30:0x00aa, B:32:0x00b5, B:33:0x00c0, B:35:0x00c4, B:36:0x00d4, B:74:0x00cd), top: B:27:0x009c }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Drawable m4705a(p000.C3489yj r9, int r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.AbstractC0652n1.m4705a(yj, int, int, boolean):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public void mo4314a(int i) {
        this.f4046d = i;
    }

    /* renamed from: a */
    public void m4706a(ViewGroup viewGroup) {
        this.f4044b = viewGroup;
    }

    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
    }

    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
    }

    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        this.f4048f = c0657p0;
    }

    /* renamed from: a */
    public void mo4595a(C0755x1.p pVar) {
        this.f4049g = pVar;
    }

    /* renamed from: a */
    public void m4707a(String str) {
        if (C3530zi.f14454A != 0) {
            C0737r1 c0737r1 = new C0737r1();
            this.f4058p = c0737r1;
            c0737r1.m6012a(str);
        }
    }

    /* renamed from: a */
    public abstract void mo4140a(C3489yj c3489yj);

    /* renamed from: b */
    public void mo4142b() {
    }

    /* renamed from: b */
    public void mo4176b(int i) {
    }

    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
    }

    /* renamed from: c */
    public abstract void mo4146c();

    /* renamed from: c */
    public void m4708c(int i) {
        this.f4051i = C0755x1.m6113a(i);
    }

    /* renamed from: d */
    public abstract void mo4147d();

    /* renamed from: e */
    public ImageView mo4289e() {
        return null;
    }

    /* renamed from: f */
    public abstract C3489yj mo4148f();

    /* renamed from: g */
    public C0737r1 m4709g() {
        return this.f4058p;
    }

    /* renamed from: h */
    public View mo4150h() {
        return null;
    }

    /* renamed from: i */
    public int mo4151i() {
        return this.f4053k;
    }

    /* renamed from: j */
    public int mo4152j() {
        return this.f4054l;
    }

    /* renamed from: k */
    public void mo4597k() {
    }

    /* renamed from: l */
    public boolean mo4290l() {
        return true;
    }
}
