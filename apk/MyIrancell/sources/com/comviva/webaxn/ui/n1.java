package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.r1;
import com.comviva.webaxn.utils.x1;
import defpackage.dj;
import defpackage.yj;
import defpackage.zi;

/* loaded from: classes.dex */
public abstract class n1 {
    public static float r = 1.0f;
    public static int s = 76;
    public static int t = 77;
    public static int u;
    public static int v;
    public static int w;
    protected ViewGroup b;
    public Context c;
    protected int d;
    protected x1.p g;
    public int h;
    public int i;
    public float j;
    protected int k;
    protected int l;
    public int n;
    public boolean o;
    private r1 p;
    protected Drawable e = null;
    protected p0 f = null;
    public boolean m = x1.c();
    public View.OnTouchListener q = new a();

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
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.n1.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {
        final /* synthetic */ View b;
        final /* synthetic */ float c;

        b(View view, float f) {
            this.b = view;
            this.c = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.setAlpha(this.c);
        }
    }

    public n1(Context context) {
        this.c = context;
        float a2 = com.comviva.webaxn.utils.b.a(context).a().a();
        if (a2 != 0.0f) {
            u = (int) (40.0f * a2);
        }
        float f = a2 * 0.0f;
        v = Math.round(f);
        w = Math.round(f);
        this.i = 0;
    }

    public static void a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 11) {
            view.setAlpha(f);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    public static void a(View view, float f, long j) {
        view.postDelayed(new b(view, f), j);
    }

    public static void a(View view, long j, boolean z, float f, float f2) {
        if (view != null) {
            RotateAnimation rotateAnimation = z ? (f == 0.0f && f2 == 0.0f) ? new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f) : new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f) : (f == 0.0f && f2 == 0.0f) ? new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f) : new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setDuration(j);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            view.startAnimation(rotateAnimation);
        }
    }

    public static void a(dj djVar, View view) {
        long b2;
        boolean z;
        if (view != null) {
            if (djVar.a() == 7) {
                view.setAlpha(djVar.e());
                a(view, djVar.c(), djVar.b());
                return;
            }
            if (djVar.a() == 5) {
                b2 = djVar.b();
                z = true;
            } else {
                if (djVar.a() != 6) {
                    return;
                }
                b2 = djVar.b();
                z = false;
            }
            a(view, b2, z, djVar.d(), djVar.f());
        }
    }

    public static int d(int i) {
        int alpha = Color.alpha(i);
        if (i != 0 && alpha == 0) {
            alpha = 255;
        }
        return Color.argb(alpha, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int e(int i) {
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

    public static Typeface f(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Typeface.defaultFromStyle(0) : Typeface.defaultFromStyle(3) : Typeface.defaultFromStyle(2) : Typeface.defaultFromStyle(1) : Typeface.defaultFromStyle(0);
    }

    public Drawable a(Bitmap bitmap, int i, int i2, boolean z) {
        return NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk()) ? (!z || ((i <= 0 || i >= bitmap.getWidth()) && (i2 <= 0 || i2 >= bitmap.getHeight()))) ? new NinePatchDrawable(bitmap, bitmap.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i2, false)) : (!z || ((i <= 0 || i >= bitmap.getWidth()) && (i2 <= 0 || i2 >= bitmap.getHeight()))) ? new BitmapDrawable(bitmap) : new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i2, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4 A[Catch: Exception -> 0x00fe, OutOfMemoryError -> 0x0103, TryCatch #8 {Exception -> 0x00fe, OutOfMemoryError -> 0x0103, blocks: (B:28:0x009c, B:30:0x00aa, B:32:0x00b5, B:33:0x00c0, B:35:0x00c4, B:36:0x00d4, B:74:0x00cd), top: B:27:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[Catch: Exception -> 0x00f6, OutOfMemoryError -> 0x00fa, TRY_LEAVE, TryCatch #6 {Exception -> 0x00f6, OutOfMemoryError -> 0x00fa, blocks: (B:39:0x00de, B:41:0x00e6), top: B:38:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd A[Catch: Exception -> 0x00fe, OutOfMemoryError -> 0x0103, TryCatch #8 {Exception -> 0x00fe, OutOfMemoryError -> 0x0103, blocks: (B:28:0x009c, B:30:0x00aa, B:32:0x00b5, B:33:0x00c0, B:35:0x00c4, B:36:0x00d4, B:74:0x00cd), top: B:27:0x009c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Drawable a(defpackage.yj r9, int r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.n1.a(yj, int, int, boolean):android.graphics.drawable.Drawable");
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public void a(AbsoluteLayout.LayoutParams layoutParams) {
    }

    public void a(j0 j0Var, v0 v0Var) {
    }

    public void a(p0 p0Var) {
        this.f = p0Var;
    }

    public void a(x1.p pVar) {
        this.g = pVar;
    }

    public void a(String str) {
        if (zi.A != 0) {
            r1 r1Var = new r1();
            this.p = r1Var;
            r1Var.a(str);
        }
    }

    public abstract void a(yj yjVar);

    public void b() {
    }

    public void b(int i) {
    }

    public void b(AbsoluteLayout.LayoutParams layoutParams) {
    }

    public abstract void c();

    public void c(int i) {
        this.i = x1.a(i);
    }

    public abstract void d();

    public ImageView e() {
        return null;
    }

    public abstract yj f();

    public r1 g() {
        return this.p;
    }

    public View h() {
        return null;
    }

    public int i() {
        return this.k;
    }

    public int j() {
        return this.l;
    }

    public void k() {
    }

    public boolean l() {
        return true;
    }
}
