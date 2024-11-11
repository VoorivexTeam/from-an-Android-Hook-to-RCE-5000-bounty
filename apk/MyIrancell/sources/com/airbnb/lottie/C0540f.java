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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000.C2375d6;
import p000.C2499g6;
import p000.C3017o7;
import p000.C3114q8;
import p000.C3116q9;
import p000.C3243t9;
import p000.C3423x5;
import p000.C3429x9;
import p000.C3472y5;
import p000.ChoreographerFrameCallbackC3158r9;

/* renamed from: com.airbnb.lottie.f */
/* loaded from: classes.dex */
public class C0540f extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: c */
    private C0538d f3097c;

    /* renamed from: h */
    private final ArrayList<o> f3102h;

    /* renamed from: i */
    private final ValueAnimator.AnimatorUpdateListener f3103i;

    /* renamed from: j */
    private ImageView.ScaleType f3104j;

    /* renamed from: k */
    private C3472y5 f3105k;

    /* renamed from: l */
    private String f3106l;

    /* renamed from: m */
    private InterfaceC0536b f3107m;

    /* renamed from: n */
    private C3423x5 f3108n;

    /* renamed from: o */
    C0535a f3109o;

    /* renamed from: p */
    C0551q f3110p;

    /* renamed from: q */
    private boolean f3111q;

    /* renamed from: r */
    private C3017o7 f3112r;

    /* renamed from: s */
    private int f3113s;

    /* renamed from: t */
    private boolean f3114t;

    /* renamed from: u */
    private boolean f3115u;

    /* renamed from: v */
    private boolean f3116v;

    /* renamed from: w */
    private boolean f3117w;

    /* renamed from: b */
    private final Matrix f3096b = new Matrix();

    /* renamed from: d */
    private final ChoreographerFrameCallbackC3158r9 f3098d = new ChoreographerFrameCallbackC3158r9();

    /* renamed from: e */
    private float f3099e = 1.0f;

    /* renamed from: f */
    private boolean f3100f = true;

    /* renamed from: g */
    private boolean f3101g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$a */
    /* loaded from: classes.dex */
    public class a implements o {

        /* renamed from: a */
        final /* synthetic */ String f3118a;

        a(String str) {
            this.f3118a = str;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3804d(this.f3118a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$b */
    /* loaded from: classes.dex */
    public class b implements o {

        /* renamed from: a */
        final /* synthetic */ int f3120a;

        /* renamed from: b */
        final /* synthetic */ int f3121b;

        b(int i, int i2) {
            this.f3120a = i;
            this.f3121b = i2;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3782a(this.f3120a, this.f3121b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$c */
    /* loaded from: classes.dex */
    public class c implements o {

        /* renamed from: a */
        final /* synthetic */ int f3123a;

        c(int i) {
            this.f3123a = i;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3781a(this.f3123a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$d */
    /* loaded from: classes.dex */
    public class d implements o {

        /* renamed from: a */
        final /* synthetic */ float f3125a;

        d(float f) {
            this.f3125a = f;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3796c(this.f3125a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$e */
    /* loaded from: classes.dex */
    public class e implements o {

        /* renamed from: a */
        final /* synthetic */ C2375d6 f3127a;

        /* renamed from: b */
        final /* synthetic */ Object f3128b;

        /* renamed from: c */
        final /* synthetic */ C3429x9 f3129c;

        e(C2375d6 c2375d6, Object obj, C3429x9 c3429x9) {
            this.f3127a = c2375d6;
            this.f3128b = obj;
            this.f3129c = c3429x9;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3787a(this.f3127a, this.f3128b, this.f3129c);
        }
    }

    /* renamed from: com.airbnb.lottie.f$f */
    /* loaded from: classes.dex */
    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C0540f.this.f3112r != null) {
                C0540f.this.f3112r.mo14278a(C0540f.this.f3098d.m15243j());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$g */
    /* loaded from: classes.dex */
    public class g implements o {
        g() {
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3824t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$h */
    /* loaded from: classes.dex */
    public class h implements o {
        h() {
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3825u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$i */
    /* loaded from: classes.dex */
    public class i implements o {

        /* renamed from: a */
        final /* synthetic */ int f3134a;

        i(int i) {
            this.f3134a = i;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3797c(this.f3134a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$j */
    /* loaded from: classes.dex */
    public class j implements o {

        /* renamed from: a */
        final /* synthetic */ float f3136a;

        j(float f) {
            this.f3136a = f;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3792b(this.f3136a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$k */
    /* loaded from: classes.dex */
    public class k implements o {

        /* renamed from: a */
        final /* synthetic */ int f3138a;

        k(int i) {
            this.f3138a = i;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3793b(this.f3138a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$l */
    /* loaded from: classes.dex */
    public class l implements o {

        /* renamed from: a */
        final /* synthetic */ float f3140a;

        l(float f) {
            this.f3140a = f;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3780a(this.f3140a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$m */
    /* loaded from: classes.dex */
    public class m implements o {

        /* renamed from: a */
        final /* synthetic */ String f3142a;

        m(String str) {
            this.f3142a = str;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3809e(this.f3142a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.f$n */
    /* loaded from: classes.dex */
    public class n implements o {

        /* renamed from: a */
        final /* synthetic */ String f3144a;

        n(String str) {
            this.f3144a = str;
        }

        @Override // com.airbnb.lottie.C0540f.o
        /* renamed from: a */
        public void mo3827a(C0538d c0538d) {
            C0540f.this.m3798c(this.f3144a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.airbnb.lottie.f$o */
    /* loaded from: classes.dex */
    public interface o {
        /* renamed from: a */
        void mo3827a(C0538d c0538d);
    }

    public C0540f() {
        new HashSet();
        this.f3102h = new ArrayList<>();
        f fVar = new f();
        this.f3103i = fVar;
        this.f3113s = 255;
        this.f3116v = true;
        this.f3117w = false;
        this.f3098d.addUpdateListener(fVar);
    }

    /* renamed from: A */
    private void m3765A() {
        if (this.f3097c == null) {
            return;
        }
        float m3818n = m3818n();
        setBounds(0, 0, (int) (this.f3097c.m3723a().width() * m3818n), (int) (this.f3097c.m3723a().height() * m3818n));
    }

    /* renamed from: a */
    private void m3767a(Canvas canvas) {
        if (ImageView.ScaleType.FIT_XY == this.f3104j) {
            m3769b(canvas);
        } else {
            m3770c(canvas);
        }
    }

    /* renamed from: b */
    private void m3769b(Canvas canvas) {
        float f2;
        if (this.f3112r == null) {
            return;
        }
        int i2 = -1;
        Rect bounds = getBounds();
        float width = bounds.width() / this.f3097c.m3723a().width();
        float height = bounds.height() / this.f3097c.m3723a().height();
        if (this.f3116v) {
            float min = Math.min(width, height);
            if (min < 1.0f) {
                f2 = 1.0f / min;
                width /= f2;
                height /= f2;
            } else {
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                i2 = canvas.save();
                float width2 = bounds.width() / 2.0f;
                float height2 = bounds.height() / 2.0f;
                float f3 = width2 * min;
                float f4 = min * height2;
                canvas.translate(width2 - f3, height2 - f4);
                canvas.scale(f2, f2, f3, f4);
            }
        }
        this.f3096b.reset();
        this.f3096b.preScale(width, height);
        this.f3112r.mo11275a(canvas, this.f3096b, this.f3113s);
        if (i2 > 0) {
            canvas.restoreToCount(i2);
        }
    }

    /* renamed from: c */
    private void m3770c(Canvas canvas) {
        float f2;
        if (this.f3112r == null) {
            return;
        }
        float f3 = this.f3099e;
        float m3771d = m3771d(canvas);
        if (f3 > m3771d) {
            f2 = this.f3099e / m3771d;
        } else {
            m3771d = f3;
            f2 = 1.0f;
        }
        int i2 = -1;
        if (f2 > 1.0f) {
            i2 = canvas.save();
            float width = this.f3097c.m3723a().width() / 2.0f;
            float height = this.f3097c.m3723a().height() / 2.0f;
            float f4 = width * m3771d;
            float f5 = height * m3771d;
            canvas.translate((m3818n() * width) - f4, (m3818n() * height) - f5);
            canvas.scale(f2, f2, f4, f5);
        }
        this.f3096b.reset();
        this.f3096b.preScale(m3771d, m3771d);
        this.f3112r.mo11275a(canvas, this.f3096b, this.f3113s);
        if (i2 > 0) {
            canvas.restoreToCount(i2);
        }
    }

    /* renamed from: d */
    private float m3771d(Canvas canvas) {
        return Math.min(canvas.getWidth() / this.f3097c.m3723a().width(), canvas.getHeight() / this.f3097c.m3723a().height());
    }

    /* renamed from: w */
    private void m3772w() {
        this.f3112r = new C3017o7(this, C3114q8.m14993a(this.f3097c), this.f3097c.m3739i(), this.f3097c);
    }

    /* renamed from: x */
    private Context m3773x() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: y */
    private C3423x5 m3774y() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f3108n == null) {
            this.f3108n = new C3423x5(getCallback(), this.f3109o);
        }
        return this.f3108n;
    }

    /* renamed from: z */
    private C3472y5 m3775z() {
        if (getCallback() == null) {
            return null;
        }
        C3472y5 c3472y5 = this.f3105k;
        if (c3472y5 != null && !c3472y5.m16576a(m3773x())) {
            this.f3105k = null;
        }
        if (this.f3105k == null) {
            this.f3105k = new C3472y5(getCallback(), this.f3106l, this.f3107m, this.f3097c.m3738h());
        }
        return this.f3105k;
    }

    /* renamed from: a */
    public Bitmap m3776a(String str) {
        C3472y5 m3775z = m3775z();
        if (m3775z != null) {
            return m3775z.m16574a(str);
        }
        return null;
    }

    /* renamed from: a */
    public Typeface m3777a(String str, String str2) {
        C3423x5 m3774y = m3774y();
        if (m3774y != null) {
            return m3774y.m16443a(str, str2);
        }
        return null;
    }

    /* renamed from: a */
    public List<C2375d6> m3778a(C2375d6 c2375d6) {
        if (this.f3112r == null) {
            C3116q9.m15002b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f3112r.mo3319a(c2375d6, 0, arrayList, new C2375d6(new String[0]));
        return arrayList;
    }

    /* renamed from: a */
    public void m3779a() {
        this.f3102h.clear();
        this.f3098d.cancel();
    }

    /* renamed from: a */
    public void m3780a(float f2) {
        C0538d c0538d = this.f3097c;
        if (c0538d == null) {
            this.f3102h.add(new l(f2));
        } else {
            m3793b((int) C3243t9.m15581c(c0538d.m3742l(), this.f3097c.m3735e(), f2));
        }
    }

    /* renamed from: a */
    public void m3781a(int i2) {
        if (this.f3097c == null) {
            this.f3102h.add(new c(i2));
        } else {
            this.f3098d.m15234a(i2);
        }
    }

    /* renamed from: a */
    public void m3782a(int i2, int i3) {
        if (this.f3097c == null) {
            this.f3102h.add(new b(i2, i3));
        } else {
            this.f3098d.m15235a(i2, i3 + 0.99f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3783a(ImageView.ScaleType scaleType) {
        this.f3104j = scaleType;
    }

    /* renamed from: a */
    public void m3784a(C0535a c0535a) {
        this.f3109o = c0535a;
        C3423x5 c3423x5 = this.f3108n;
        if (c3423x5 != null) {
            c3423x5.m16444a(c0535a);
        }
    }

    /* renamed from: a */
    public void m3785a(InterfaceC0536b interfaceC0536b) {
        this.f3107m = interfaceC0536b;
        C3472y5 c3472y5 = this.f3105k;
        if (c3472y5 != null) {
            c3472y5.m16575a(interfaceC0536b);
        }
    }

    /* renamed from: a */
    public void m3786a(C0551q c0551q) {
        this.f3110p = c0551q;
    }

    /* renamed from: a */
    public <T> void m3787a(C2375d6 c2375d6, T t, C3429x9<T> c3429x9) {
        if (this.f3112r == null) {
            this.f3102h.add(new e(c2375d6, t, c3429x9));
            return;
        }
        boolean z = true;
        if (c2375d6.m11283a() != null) {
            c2375d6.m11283a().mo3320a(t, c3429x9);
        } else {
            List<C2375d6> m3778a = m3778a(c2375d6);
            for (int i2 = 0; i2 < m3778a.size(); i2++) {
                m3778a.get(i2).m11283a().mo3320a(t, c3429x9);
            }
            z = true ^ m3778a.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == InterfaceC0545k.f3151A) {
                m3796c(m3815k());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3788a(Boolean bool) {
        this.f3100f = bool.booleanValue();
    }

    /* renamed from: a */
    public void m3789a(boolean z) {
        if (this.f3111q == z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            C3116q9.m15002b("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.f3111q = z;
        if (this.f3097c != null) {
            m3772w();
        }
    }

    /* renamed from: a */
    public boolean m3790a(C0538d c0538d) {
        if (this.f3097c == c0538d) {
            return false;
        }
        this.f3117w = false;
        m3791b();
        this.f3097c = c0538d;
        m3772w();
        this.f3098d.m15237a(c0538d);
        m3796c(this.f3098d.getAnimatedFraction());
        m3802d(this.f3099e);
        m3765A();
        Iterator it = new ArrayList(this.f3102h).iterator();
        while (it.hasNext()) {
            ((o) it.next()).mo3827a(c0538d);
            it.remove();
        }
        this.f3102h.clear();
        c0538d.m3731b(this.f3114t);
        return true;
    }

    /* renamed from: b */
    public void m3791b() {
        if (this.f3098d.isRunning()) {
            this.f3098d.cancel();
        }
        this.f3097c = null;
        this.f3112r = null;
        this.f3105k = null;
        this.f3098d.m15241g();
        invalidateSelf();
    }

    /* renamed from: b */
    public void m3792b(float f2) {
        C0538d c0538d = this.f3097c;
        if (c0538d == null) {
            this.f3102h.add(new j(f2));
        } else {
            m3797c((int) C3243t9.m15581c(c0538d.m3742l(), this.f3097c.m3735e(), f2));
        }
    }

    /* renamed from: b */
    public void m3793b(int i2) {
        if (this.f3097c == null) {
            this.f3102h.add(new k(i2));
        } else {
            this.f3098d.m15238b(i2 + 0.99f);
        }
    }

    /* renamed from: b */
    public void m3794b(String str) {
        this.f3106l = str;
    }

    /* renamed from: b */
    public void m3795b(boolean z) {
        this.f3115u = z;
    }

    /* renamed from: c */
    public void m3796c(float f2) {
        if (this.f3097c == null) {
            this.f3102h.add(new d(f2));
            return;
        }
        C0537c.m3721a("Drawable#setProgress");
        this.f3098d.m15234a(C3243t9.m15581c(this.f3097c.m3742l(), this.f3097c.m3735e(), f2));
        C0537c.m3722b("Drawable#setProgress");
    }

    /* renamed from: c */
    public void m3797c(int i2) {
        if (this.f3097c == null) {
            this.f3102h.add(new i(i2));
        } else {
            this.f3098d.m15236a(i2);
        }
    }

    /* renamed from: c */
    public void m3798c(String str) {
        C0538d c0538d = this.f3097c;
        if (c0538d == null) {
            this.f3102h.add(new n(str));
            return;
        }
        C2499g6 m3729b = c0538d.m3729b(str);
        if (m3729b != null) {
            m3793b((int) (m3729b.f10221b + m3729b.f10222c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: c */
    public void m3799c(boolean z) {
        this.f3114t = z;
        C0538d c0538d = this.f3097c;
        if (c0538d != null) {
            c0538d.m3731b(z);
        }
    }

    /* renamed from: c */
    public boolean m3800c() {
        return this.f3111q;
    }

    /* renamed from: d */
    public void m3801d() {
        this.f3102h.clear();
        this.f3098d.m15242h();
    }

    /* renamed from: d */
    public void m3802d(float f2) {
        this.f3099e = f2;
        m3765A();
    }

    /* renamed from: d */
    public void m3803d(int i2) {
        this.f3098d.setRepeatCount(i2);
    }

    /* renamed from: d */
    public void m3804d(String str) {
        C0538d c0538d = this.f3097c;
        if (c0538d == null) {
            this.f3102h.add(new a(str));
            return;
        }
        C2499g6 m3729b = c0538d.m3729b(str);
        if (m3729b != null) {
            int i2 = (int) m3729b.f10221b;
            m3782a(i2, ((int) m3729b.f10222c) + i2);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    /* renamed from: d */
    public void m3805d(boolean z) {
        this.f3101g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f3117w = false;
        C0537c.m3721a("Drawable#draw");
        if (this.f3101g) {
            try {
                m3767a(canvas);
            } catch (Throwable th) {
                C3116q9.m15001a("Lottie crashed in draw!", th);
            }
        } else {
            m3767a(canvas);
        }
        C0537c.m3722b("Drawable#draw");
    }

    /* renamed from: e */
    public C0538d m3806e() {
        return this.f3097c;
    }

    /* renamed from: e */
    public void m3807e(float f2) {
        this.f3098d.m15239c(f2);
    }

    /* renamed from: e */
    public void m3808e(int i2) {
        this.f3098d.setRepeatMode(i2);
    }

    /* renamed from: e */
    public void m3809e(String str) {
        C0538d c0538d = this.f3097c;
        if (c0538d == null) {
            this.f3102h.add(new m(str));
            return;
        }
        C2499g6 m3729b = c0538d.m3729b(str);
        if (m3729b != null) {
            m3797c((int) m3729b.f10221b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: f */
    public int m3810f() {
        return (int) this.f3098d.m15244k();
    }

    /* renamed from: g */
    public String m3811g() {
        return this.f3106l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3113s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f3097c == null) {
            return -1;
        }
        return (int) (r0.m3723a().height() * m3818n());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f3097c == null) {
            return -1;
        }
        return (int) (r0.m3723a().width() * m3818n());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public float m3812h() {
        return this.f3098d.m15245l();
    }

    /* renamed from: i */
    public float m3813i() {
        return this.f3098d.m15246m();
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
        if (this.f3117w) {
            return;
        }
        this.f3117w = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m3821q();
    }

    /* renamed from: j */
    public C0548n m3814j() {
        C0538d c0538d = this.f3097c;
        if (c0538d != null) {
            return c0538d.m3741k();
        }
        return null;
    }

    /* renamed from: k */
    public float m3815k() {
        return this.f3098d.m15243j();
    }

    /* renamed from: l */
    public int m3816l() {
        return this.f3098d.getRepeatCount();
    }

    /* renamed from: m */
    public int m3817m() {
        return this.f3098d.getRepeatMode();
    }

    /* renamed from: n */
    public float m3818n() {
        return this.f3099e;
    }

    /* renamed from: o */
    public float m3819o() {
        return this.f3098d.m15247n();
    }

    /* renamed from: p */
    public C0551q m3820p() {
        return this.f3110p;
    }

    /* renamed from: q */
    public boolean m3821q() {
        ChoreographerFrameCallbackC3158r9 choreographerFrameCallbackC3158r9 = this.f3098d;
        if (choreographerFrameCallbackC3158r9 == null) {
            return false;
        }
        return choreographerFrameCallbackC3158r9.isRunning();
    }

    /* renamed from: r */
    public boolean m3822r() {
        return this.f3115u;
    }

    /* renamed from: s */
    public void m3823s() {
        this.f3102h.clear();
        this.f3098d.m15248o();
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
        this.f3113s = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        C3116q9.m15002b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        m3824t();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m3801d();
    }

    /* renamed from: t */
    public void m3824t() {
        if (this.f3112r == null) {
            this.f3102h.add(new g());
            return;
        }
        if (this.f3100f || m3816l() == 0) {
            this.f3098d.m15249p();
        }
        if (this.f3100f) {
            return;
        }
        m3781a((int) (m3819o() < 0.0f ? m3813i() : m3812h()));
        this.f3098d.m15242h();
    }

    /* renamed from: u */
    public void m3825u() {
        if (this.f3112r == null) {
            this.f3102h.add(new h());
            return;
        }
        if (this.f3100f || m3816l() == 0) {
            this.f3098d.m15252s();
        }
        if (this.f3100f) {
            return;
        }
        m3781a((int) (m3819o() < 0.0f ? m3813i() : m3812h()));
        this.f3098d.m15242h();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* renamed from: v */
    public boolean m3826v() {
        return this.f3110p == null && this.f3097c.m3730b().m13280b() > 0;
    }
}
