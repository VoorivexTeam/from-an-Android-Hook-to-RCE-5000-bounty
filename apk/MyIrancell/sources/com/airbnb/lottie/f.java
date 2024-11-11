package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import defpackage.d6;
import defpackage.g6;
import defpackage.o7;
import defpackage.q8;
import defpackage.q9;
import defpackage.r9;
import defpackage.t9;
import defpackage.x5;
import defpackage.x9;
import defpackage.y5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f extends Drawable implements Drawable.Callback, Animatable {
    private com.airbnb.lottie.d c;
    private final ArrayList<o> h;
    private final ValueAnimator.AnimatorUpdateListener i;
    private ImageView.ScaleType j;
    private y5 k;
    private String l;
    private com.airbnb.lottie.b m;
    private x5 n;
    com.airbnb.lottie.a o;
    q p;
    private boolean q;
    private o7 r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private final Matrix b = new Matrix();
    private final r9 d = new r9();
    private float e = 1.0f;
    private boolean f = true;
    private boolean g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements o {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.d(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements o {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.a(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements o {
        final /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements o {
        final /* synthetic */ float a;

        d(float f) {
            this.a = f;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.c(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements o {
        final /* synthetic */ d6 a;
        final /* synthetic */ Object b;
        final /* synthetic */ x9 c;

        e(d6 d6Var, Object obj, x9 x9Var) {
            this.a = d6Var;
            this.b = obj;
            this.c = x9Var;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.a(this.a, this.b, this.c);
        }
    }

    /* renamed from: com.airbnb.lottie.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0027f implements ValueAnimator.AnimatorUpdateListener {
        C0027f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (f.this.r != null) {
                f.this.r.a(f.this.d.j());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements o {
        g() {
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements o {
        h() {
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements o {
        final /* synthetic */ int a;

        i(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.c(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements o {
        final /* synthetic */ float a;

        j(float f) {
            this.a = f;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.b(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements o {
        final /* synthetic */ int a;

        k(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.b(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l implements o {
        final /* synthetic */ float a;

        l(float f) {
            this.a = f;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m implements o {
        final /* synthetic */ String a;

        m(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.e(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class n implements o {
        final /* synthetic */ String a;

        n(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.f.o
        public void a(com.airbnb.lottie.d dVar) {
            f.this.c(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface o {
        void a(com.airbnb.lottie.d dVar);
    }

    public f() {
        new HashSet();
        this.h = new ArrayList<>();
        C0027f c0027f = new C0027f();
        this.i = c0027f;
        this.s = 255;
        this.v = true;
        this.w = false;
        this.d.addUpdateListener(c0027f);
    }

    private void A() {
        if (this.c == null) {
            return;
        }
        float n2 = n();
        setBounds(0, 0, (int) (this.c.a().width() * n2), (int) (this.c.a().height() * n2));
    }

    private void a(Canvas canvas) {
        if (ImageView.ScaleType.FIT_XY == this.j) {
            b(canvas);
        } else {
            c(canvas);
        }
    }

    private void b(Canvas canvas) {
        float f;
        if (this.r == null) {
            return;
        }
        int i2 = -1;
        Rect bounds = getBounds();
        float width = bounds.width() / this.c.a().width();
        float height = bounds.height() / this.c.a().height();
        if (this.v) {
            float min = Math.min(width, height);
            if (min < 1.0f) {
                f = 1.0f / min;
                width /= f;
                height /= f;
            } else {
                f = 1.0f;
            }
            if (f > 1.0f) {
                i2 = canvas.save();
                float width2 = bounds.width() / 2.0f;
                float height2 = bounds.height() / 2.0f;
                float f2 = width2 * min;
                float f3 = min * height2;
                canvas.translate(width2 - f2, height2 - f3);
                canvas.scale(f, f, f2, f3);
            }
        }
        this.b.reset();
        this.b.preScale(width, height);
        this.r.a(canvas, this.b, this.s);
        if (i2 > 0) {
            canvas.restoreToCount(i2);
        }
    }

    private void c(Canvas canvas) {
        float f;
        if (this.r == null) {
            return;
        }
        float f2 = this.e;
        float d2 = d(canvas);
        if (f2 > d2) {
            f = this.e / d2;
        } else {
            d2 = f2;
            f = 1.0f;
        }
        int i2 = -1;
        if (f > 1.0f) {
            i2 = canvas.save();
            float width = this.c.a().width() / 2.0f;
            float height = this.c.a().height() / 2.0f;
            float f3 = width * d2;
            float f4 = height * d2;
            canvas.translate((n() * width) - f3, (n() * height) - f4);
            canvas.scale(f, f, f3, f4);
        }
        this.b.reset();
        this.b.preScale(d2, d2);
        this.r.a(canvas, this.b, this.s);
        if (i2 > 0) {
            canvas.restoreToCount(i2);
        }
    }

    private float d(Canvas canvas) {
        return Math.min(canvas.getWidth() / this.c.a().width(), canvas.getHeight() / this.c.a().height());
    }

    private void w() {
        this.r = new o7(this, q8.a(this.c), this.c.i(), this.c);
    }

    private Context x() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private x5 y() {
        if (getCallback() == null) {
            return null;
        }
        if (this.n == null) {
            this.n = new x5(getCallback(), this.o);
        }
        return this.n;
    }

    private y5 z() {
        if (getCallback() == null) {
            return null;
        }
        y5 y5Var = this.k;
        if (y5Var != null && !y5Var.a(x())) {
            this.k = null;
        }
        if (this.k == null) {
            this.k = new y5(getCallback(), this.l, this.m, this.c.h());
        }
        return this.k;
    }

    public Bitmap a(String str) {
        y5 z = z();
        if (z != null) {
            return z.a(str);
        }
        return null;
    }

    public Typeface a(String str, String str2) {
        x5 y = y();
        if (y != null) {
            return y.a(str, str2);
        }
        return null;
    }

    public List<d6> a(d6 d6Var) {
        if (this.r == null) {
            q9.b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.r.a(d6Var, 0, arrayList, new d6(new String[0]));
        return arrayList;
    }

    public void a() {
        this.h.clear();
        this.d.cancel();
    }

    public void a(float f) {
        com.airbnb.lottie.d dVar = this.c;
        if (dVar == null) {
            this.h.add(new l(f));
        } else {
            b((int) t9.c(dVar.l(), this.c.e(), f));
        }
    }

    public void a(int i2) {
        if (this.c == null) {
            this.h.add(new c(i2));
        } else {
            this.d.a(i2);
        }
    }

    public void a(int i2, int i3) {
        if (this.c == null) {
            this.h.add(new b(i2, i3));
        } else {
            this.d.a(i2, i3 + 0.99f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ImageView.ScaleType scaleType) {
        this.j = scaleType;
    }

    public void a(com.airbnb.lottie.a aVar) {
        this.o = aVar;
        x5 x5Var = this.n;
        if (x5Var != null) {
            x5Var.a(aVar);
        }
    }

    public void a(com.airbnb.lottie.b bVar) {
        this.m = bVar;
        y5 y5Var = this.k;
        if (y5Var != null) {
            y5Var.a(bVar);
        }
    }

    public void a(q qVar) {
        this.p = qVar;
    }

    public <T> void a(d6 d6Var, T t, x9<T> x9Var) {
        if (this.r == null) {
            this.h.add(new e(d6Var, t, x9Var));
            return;
        }
        boolean z = true;
        if (d6Var.a() != null) {
            d6Var.a().a(t, x9Var);
        } else {
            List<d6> a2 = a(d6Var);
            for (int i2 = 0; i2 < a2.size(); i2++) {
                a2.get(i2).a().a(t, x9Var);
            }
            z = true ^ a2.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == com.airbnb.lottie.k.A) {
                c(k());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Boolean bool) {
        this.f = bool.booleanValue();
    }

    public void a(boolean z) {
        if (this.q == z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            q9.b("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.q = z;
        if (this.c != null) {
            w();
        }
    }

    public boolean a(com.airbnb.lottie.d dVar) {
        if (this.c == dVar) {
            return false;
        }
        this.w = false;
        b();
        this.c = dVar;
        w();
        this.d.a(dVar);
        c(this.d.getAnimatedFraction());
        d(this.e);
        A();
        Iterator it = new ArrayList(this.h).iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(dVar);
            it.remove();
        }
        this.h.clear();
        dVar.b(this.t);
        return true;
    }

    public void b() {
        if (this.d.isRunning()) {
            this.d.cancel();
        }
        this.c = null;
        this.r = null;
        this.k = null;
        this.d.g();
        invalidateSelf();
    }

    public void b(float f) {
        com.airbnb.lottie.d dVar = this.c;
        if (dVar == null) {
            this.h.add(new j(f));
        } else {
            c((int) t9.c(dVar.l(), this.c.e(), f));
        }
    }

    public void b(int i2) {
        if (this.c == null) {
            this.h.add(new k(i2));
        } else {
            this.d.b(i2 + 0.99f);
        }
    }

    public void b(String str) {
        this.l = str;
    }

    public void b(boolean z) {
        this.u = z;
    }

    public void c(float f) {
        if (this.c == null) {
            this.h.add(new d(f));
            return;
        }
        com.airbnb.lottie.c.a("Drawable#setProgress");
        this.d.a(t9.c(this.c.l(), this.c.e(), f));
        com.airbnb.lottie.c.b("Drawable#setProgress");
    }

    public void c(int i2) {
        if (this.c == null) {
            this.h.add(new i(i2));
        } else {
            this.d.a(i2);
        }
    }

    public void c(String str) {
        com.airbnb.lottie.d dVar = this.c;
        if (dVar == null) {
            this.h.add(new n(str));
            return;
        }
        g6 b2 = dVar.b(str);
        if (b2 != null) {
            b((int) (b2.b + b2.c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void c(boolean z) {
        this.t = z;
        com.airbnb.lottie.d dVar = this.c;
        if (dVar != null) {
            dVar.b(z);
        }
    }

    public boolean c() {
        return this.q;
    }

    public void d() {
        this.h.clear();
        this.d.h();
    }

    public void d(float f) {
        this.e = f;
        A();
    }

    public void d(int i2) {
        this.d.setRepeatCount(i2);
    }

    public void d(String str) {
        com.airbnb.lottie.d dVar = this.c;
        if (dVar == null) {
            this.h.add(new a(str));
            return;
        }
        g6 b2 = dVar.b(str);
        if (b2 != null) {
            int i2 = (int) b2.b;
            a(i2, ((int) b2.c) + i2);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void d(boolean z) {
        this.g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.w = false;
        com.airbnb.lottie.c.a("Drawable#draw");
        if (this.g) {
            try {
                a(canvas);
            } catch (Throwable th) {
                q9.a("Lottie crashed in draw!", th);
            }
        } else {
            a(canvas);
        }
        com.airbnb.lottie.c.b("Drawable#draw");
    }

    public com.airbnb.lottie.d e() {
        return this.c;
    }

    public void e(float f) {
        this.d.c(f);
    }

    public void e(int i2) {
        this.d.setRepeatMode(i2);
    }

    public void e(String str) {
        com.airbnb.lottie.d dVar = this.c;
        if (dVar == null) {
            this.h.add(new m(str));
            return;
        }
        g6 b2 = dVar.b(str);
        if (b2 != null) {
            c((int) b2.b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public int f() {
        return (int) this.d.k();
    }

    public String g() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.c == null) {
            return -1;
        }
        return (int) (r0.a().height() * n());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.c == null) {
            return -1;
        }
        return (int) (r0.a().width() * n());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.d.l();
    }

    public float i() {
        return this.d.m();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.w) {
            return;
        }
        this.w = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return q();
    }

    public com.airbnb.lottie.n j() {
        com.airbnb.lottie.d dVar = this.c;
        if (dVar != null) {
            return dVar.k();
        }
        return null;
    }

    public float k() {
        return this.d.j();
    }

    public int l() {
        return this.d.getRepeatCount();
    }

    public int m() {
        return this.d.getRepeatMode();
    }

    public float n() {
        return this.e;
    }

    public float o() {
        return this.d.n();
    }

    public q p() {
        return this.p;
    }

    public boolean q() {
        r9 r9Var = this.d;
        if (r9Var == null) {
            return false;
        }
        return r9Var.isRunning();
    }

    public boolean r() {
        return this.u;
    }

    public void s() {
        this.h.clear();
        this.d.o();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.s = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        q9.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        t();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        d();
    }

    public void t() {
        if (this.r == null) {
            this.h.add(new g());
            return;
        }
        if (this.f || l() == 0) {
            this.d.p();
        }
        if (this.f) {
            return;
        }
        a((int) (o() < 0.0f ? i() : h()));
        this.d.h();
    }

    public void u() {
        if (this.r == null) {
            this.h.add(new h());
            return;
        }
        if (this.f || l() == 0) {
            this.d.s();
        }
        if (this.f) {
            return;
        }
        a((int) (o() < 0.0f ? i() : h()));
        this.d.h();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public boolean v() {
        return this.p == null && this.c.b().b() > 0;
    }
}
