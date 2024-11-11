package com.comviva.webaxn.p002ui;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.C0186n0;
import androidx.core.widget.NestedScrollView;
import com.comviva.webaxn.utils.AsyncTaskC0693d;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0696e;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0719l1;
import com.comviva.webaxn.utils.C0728o1;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0744u;
import com.comviva.webaxn.utils.C0747v;
import com.comviva.webaxn.utils.C0755x1;
import com.comviva.webaxn.utils.TapsellSDKAdv;
import com.mtni.myirancell.R;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import p000.C0023aj;
import p000.C0024ak;
import p000.C0482bj;
import p000.C2434ej;
import p000.C2555hj;
import p000.C2862kj;
import p000.C2899lj;
import p000.C2945mj;
import p000.C2991nj;
import p000.C3087pj;
import p000.C3264tj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;
import p000.C3530zi;
import p000.C3531zj;

/* renamed from: com.comviva.webaxn.ui.o1 */
/* loaded from: classes.dex */
public class C0655o1 {

    /* renamed from: W */
    public static LayoutInflater f4110W;

    /* renamed from: A */
    private LinearLayout f4111A;

    /* renamed from: G */
    private HashMap<String, ArrayList<String>> f4117G;

    /* renamed from: I */
    private int f4119I;

    /* renamed from: J */
    private int f4120J;

    /* renamed from: L */
    private ArrayList<C3489yj> f4122L;

    /* renamed from: N */
    private int f4124N;

    /* renamed from: O */
    private float f4125O;

    /* renamed from: P */
    private C0728o1 f4126P;

    /* renamed from: Q */
    private AbstractC0652n1 f4127Q;

    /* renamed from: R */
    private ArrayList<LinearLayout> f4128R;

    /* renamed from: S */
    private TapsellSDKAdv f4129S;

    /* renamed from: T */
    private C3400wj.i f4130T;

    /* renamed from: a */
    private Context f4133a;

    /* renamed from: b */
    public C3531zj f4134b;

    /* renamed from: c */
    public C3400wj f4135c;

    /* renamed from: d */
    public C2899lj f4136d;

    /* renamed from: e */
    public C2945mj f4137e;

    /* renamed from: f */
    public C0669v0 f4138f;

    /* renamed from: g */
    public TextView f4139g;

    /* renamed from: h */
    public ImageView f4140h;

    /* renamed from: i */
    private double f4141i;

    /* renamed from: j */
    public LinearLayout f4142j;

    /* renamed from: k */
    public LinearLayout f4143k;

    /* renamed from: l */
    public LinearLayout f4144l;

    /* renamed from: m */
    public LinearLayout f4145m;

    /* renamed from: n */
    private NestedScrollView f4146n;

    /* renamed from: p */
    private ProgressBar f4148p;

    /* renamed from: q */
    private RelativeLayout f4149q;

    /* renamed from: r */
    private RelativeLayout f4150r;

    /* renamed from: s */
    private TextView f4151s;

    /* renamed from: t */
    private ImageView f4152t;

    /* renamed from: u */
    private C0614b f4153u;

    /* renamed from: v */
    private PageRootFrame f4154v;

    /* renamed from: w */
    private FrameLayout f4155w;

    /* renamed from: x */
    private RelativeLayout f4156x;

    /* renamed from: y */
    private LinearLayout f4157y;

    /* renamed from: z */
    private RelativeLayout f4158z;

    /* renamed from: o */
    protected Drawable f4147o = null;

    /* renamed from: B */
    private int f4112B = 0;

    /* renamed from: C */
    private int f4113C = 0;

    /* renamed from: D */
    private int f4114D = 0;

    /* renamed from: E */
    private HashMap<View, C3489yj> f4115E = new HashMap<>();

    /* renamed from: F */
    public boolean f4116F = false;

    /* renamed from: H */
    private boolean f4118H = false;

    /* renamed from: K */
    private String f4121K = "EDIT";

    /* renamed from: M */
    private SparseArray<Long> f4123M = null;

    /* renamed from: U */
    public final C0755x1.p f4131U = new i();

    /* renamed from: V */
    public final C0755x1.q f4132V = new j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.o1$a */
    /* loaded from: classes.dex */
    public class a implements C0728o1.a {
        a() {
        }

        @Override // com.comviva.webaxn.utils.C0728o1.a
        /* renamed from: a */
        public void mo4833a(int i) {
            C0655o1 c0655o1 = C0655o1.this;
            C3531zj c3531zj = c0655o1.f4134b;
            HashMap<String, C2555hj> hashMap = c3531zj.f14499P;
            if (hashMap != null) {
                c0655o1.f4131U.mo4846a(c3531zj, hashMap.get("shake"), C0655o1.this.f4137e);
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o1$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0655o1.this.m4813g().scrollTo(C0655o1.this.f4112B, C0655o1.this.f4113C);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.o1$c */
    /* loaded from: classes.dex */
    public class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0655o1.this.m4825s().removeView(C0655o1.this.m4819m());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.o1$d */
    /* loaded from: classes.dex */
    public class d implements Animation.AnimationListener {
        d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0655o1.this.m4825s().removeView(C0655o1.this.m4819m());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.o1$e */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0655o1.this.m4825s().removeView(C0655o1.this.m4819m());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.o1$f */
    /* loaded from: classes.dex */
    public class f implements Animation.AnimationListener {
        f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0655o1.this.m4825s().removeView(C0655o1.this.m4819m());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.o1$g */
    /* loaded from: classes.dex */
    public class g implements View.OnTouchListener {
        g(C0655o1 c0655o1) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o1$h */
    /* loaded from: classes.dex */
    class h implements View.OnAttachStateChangeListener {
        h(C0655o1 c0655o1) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.clearAnimation();
            view.clearFocus();
            view.setBackgroundDrawable(null);
            view.destroyDrawingCache();
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            viewGroup.removeAllViewsInLayout();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o1$i */
    /* loaded from: classes.dex */
    class i implements C0755x1.p {

        /* renamed from: com.comviva.webaxn.ui.o1$i$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b */
            AbstractC0652n1 f4166b;

            a() {
            }

            /* renamed from: a */
            public Runnable m4851a(AbstractC0652n1 abstractC0652n1) {
                this.f4166b = abstractC0652n1;
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:107:0x01d2  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x01ef  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x02c8  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x02e4  */
            /* JADX WARN: Removed duplicated region for block: B:282:0x0463  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 1739
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.i.a.run():void");
            }
        }

        /* renamed from: com.comviva.webaxn.ui.o1$i$b */
        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: b */
            C0696e f4168b;

            /* renamed from: c */
            C3531zj f4169c;

            /* renamed from: d */
            C2945mj f4170d;

            b() {
            }

            /* renamed from: a */
            public Runnable m4852a(C0696e c0696e, C2945mj c2945mj, C3531zj c3531zj) {
                this.f4168b = c0696e;
                this.f4170d = c2945mj;
                this.f4169c = c3531zj;
                return this;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                C2899lj c2899lj;
                C2899lj c2899lj2;
                if (C0655o1.this.m4814h() != null) {
                    if (C0655o1.this.m4814h() instanceof C0611a) {
                        ((C0611a) C0655o1.this.m4814h()).m4153m();
                    } else if (C0655o1.this.m4814h() instanceof SurfaceHolderCallbackC0634h1) {
                        ((SurfaceHolderCallbackC0634h1) C0655o1.this.m4814h()).m4452m();
                    }
                }
                if (this.f4169c == null || (c2899lj2 = C0655o1.this.f4136d) == null || c2899lj2.m13901f() == null || C0655o1.this.f4136d.m13901f().equals(this.f4169c)) {
                    C0696e c0696e = this.f4168b;
                    if (c0696e != null && !c0696e.f4730v) {
                        C0655o1 c0655o1 = C0655o1.this;
                        c0655o1.f4135c.m16287a(this.f4170d, c0655o1.f4136d);
                    }
                    String str = null;
                    if (TextUtils.isEmpty(this.f4168b.f4719k)) {
                        C0696e c0696e2 = this.f4168b;
                        String str2 = c0696e2.f4717i;
                        if (str2 != null) {
                            C0655o1.this.f4135c.m16279a(str2, c0696e2.m5410a());
                            C0655o1 c0655o12 = C0655o1.this;
                            z = c0655o12.f4135c.m16296a(this.f4168b.f4717i, this.f4170d, c0655o12.f4136d);
                            if (z) {
                                String str3 = this.f4168b.f4727s;
                                if (str3 != null) {
                                    C0655o1 c0655o13 = C0655o1.this;
                                    c0655o13.f4135c.m16305b(str3, this.f4170d, c0655o13.f4136d);
                                    return;
                                }
                                return;
                            }
                            Object obj = this.f4168b.f4716h;
                            if (obj != null) {
                                String str4 = (String) obj;
                                if (!TextUtils.isEmpty(str4) && !str4.equals("Menulist:")) {
                                    str = str4;
                                }
                            }
                        } else {
                            z = false;
                        }
                    } else {
                        C3400wj c3400wj = C0655o1.this.f4135c;
                        C0696e c0696e3 = this.f4168b;
                        c3400wj.m16279a(c0696e3.f4719k, c0696e3.m5410a());
                        C0655o1 c0655o14 = C0655o1.this;
                        z = c0655o14.f4135c.m16296a(this.f4168b.f4719k, this.f4170d, c0655o14.f4136d);
                        if (!z && (C0655o1.this.f4133a instanceof WebAxnActivity)) {
                            try {
                                InputStream open = ((WebAxnActivity) C0655o1.this.f4133a).getAssets().open(this.f4168b.f4719k + ".wbxml");
                                byte[] bArr = new byte[open.available()];
                                open.read(bArr);
                                open.close();
                                C0655o1.this.f4135c.m16295a(bArr, null, C3400wj.h.WBXML_BUFFER, null, true, false, true);
                                z = true;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (z) {
                            String str5 = this.f4168b.f4727s;
                            if (str5 != null) {
                                C0655o1 c0655o15 = C0655o1.this;
                                c0655o15.f4135c.m16305b(str5, this.f4170d, c0655o15.f4136d);
                                return;
                            }
                            return;
                        }
                    }
                    if (!z && TextUtils.isEmpty(str) && this.f4168b.f4716h != null && (c2899lj = C0655o1.this.f4136d) != null) {
                        C3531zj m13901f = c2899lj.m13901f();
                        if (m13901f != null && m13901f.f14506e != null) {
                            for (int i = 0; i < m13901f.f14506e.size(); i++) {
                                C0655o1.this.f4135c.m16291a(m13901f.f14506e.elementAt(i));
                            }
                        }
                        str = (String) this.f4168b.f4716h;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C0655o1 c0655o16 = C0655o1.this;
                        C3400wj c3400wj2 = c0655o16.f4135c;
                        C0696e c0696e4 = this.f4168b;
                        if (!c3400wj2.m16298a(str, c0696e4.f4730v, null, c0696e4, this.f4170d, c0655o16.f4136d)) {
                            C0655o1.this.f4135c.m16279a(str, this.f4168b.m5410a());
                            C0655o1 c0655o17 = C0655o1.this;
                            C3400wj c3400wj3 = c0655o17.f4135c;
                            C0696e c0696e5 = this.f4168b;
                            if (c3400wj3.m16263a(str, c0696e5.f4723o, c0696e5.f4730v, this.f4170d, false, false, c0696e5.f4718j, c0655o17.f4136d) > 0 && !this.f4168b.f4730v) {
                                C0655o1.this.f4135c.m16258E();
                            }
                        }
                    }
                    String str6 = this.f4168b.f4727s;
                    if (str6 != null) {
                        C0655o1 c0655o18 = C0655o1.this;
                        c0655o18.f4135c.m16305b(str6, this.f4170d, c0655o18.f4136d);
                    }
                }
            }
        }

        i() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4834a(long j, String str) {
            if (TextUtils.isEmpty(str)) {
                Toast.makeText(C0655o1.this.f4133a, "Downloading failed,please try again.", 0).show();
                return;
            }
            if (C0655o1.this.f4123M == null) {
                C0655o1.this.f4123M = new SparseArray(20);
                C0655o1.this.f4124N = 1510;
            }
            C0655o1.this.f4123M.put(C0655o1.this.f4124N, Long.valueOf(j));
            C0755x1.m6145a(C0655o1.this.f4133a, (String) null, str, C0655o1.m4757j(C0655o1.this));
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4835a(AbstractC0652n1 abstractC0652n1) {
            C0655o1.this.f4127Q = abstractC0652n1;
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4836a(AbstractC0652n1 abstractC0652n1, String str, C3489yj c3489yj) {
            C0755x1.m6151a(C0655o1.this.f4133a, c3489yj, C0655o1.this.m4824r().getApplicationWindowToken());
            C2945mj m4812f = C0655o1.this.m4812f();
            if (m4812f == null) {
                return;
            }
            if (!TextUtils.isEmpty(c3489yj.f14245q0)) {
                C0655o1.this.f4135c.m16279a(c3489yj.f14245q0, abstractC0652n1.m4709g());
                C0655o1 c0655o1 = C0655o1.this;
                boolean m16296a = c0655o1.f4135c.m16296a(c3489yj.f14245q0, m4812f, c0655o1.f4136d);
                if (!m16296a && (C0655o1.this.f4133a instanceof WebAxnActivity)) {
                    try {
                        InputStream open = ((WebAxnActivity) C0655o1.this.f4133a).getAssets().open(c3489yj.f14245q0 + ".wbxml");
                        byte[] bArr = new byte[open.available()];
                        open.read(bArr);
                        open.close();
                        C0655o1.this.f4135c.m16295a(bArr, null, C3400wj.h.WBXML_BUFFER, null, true, false, true);
                        m16296a = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (m16296a) {
                    String str2 = c3489yj.f14256u;
                    if (str2 != null) {
                        C0655o1 c0655o12 = C0655o1.this;
                        c0655o12.f4135c.m16305b(str2, m4812f, c0655o12.f4136d);
                        return;
                    }
                    return;
                }
            } else if (!TextUtils.isEmpty(c3489yj.f14188W)) {
                C0655o1.this.f4135c.m16279a(c3489yj.f14188W, abstractC0652n1.m4709g());
                C0655o1 c0655o13 = C0655o1.this;
                if (c0655o13.f4135c.m16296a(c3489yj.f14188W, m4812f, c0655o13.f4136d)) {
                    String str3 = c3489yj.f14256u;
                    if (str3 != null) {
                        C0655o1 c0655o14 = C0655o1.this;
                        c0655o14.f4135c.m16305b(str3, m4812f, c0655o14.f4136d);
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(c3489yj.f14220i) && !c3489yj.f14220i.equals("Menulist:")) {
                    str = c3489yj.f14220i;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                C0655o1 c0655o15 = C0655o1.this;
                if (!c0655o15.f4135c.m16298a(str, false, c3489yj, null, m4812f, c0655o15.f4136d)) {
                    C0655o1 c0655o16 = C0655o1.this;
                    c0655o16.f4135c.m16287a(m4812f, c0655o16.f4136d);
                    C0655o1 c0655o17 = C0655o1.this;
                    c0655o17.f4135c.m16317c(m4812f, c0655o17.f4136d);
                    C3531zj m13901f = C0655o1.this.f4136d.m13901f();
                    if (m13901f != null) {
                        for (int i = 0; i < m13901f.f14506e.size(); i++) {
                            C0655o1.this.f4135c.m16291a(m13901f.f14506e.elementAt(i));
                        }
                    }
                    C0655o1.this.f4135c.m16279a(str, abstractC0652n1.m4709g());
                    C0655o1 c0655o18 = C0655o1.this;
                    if (c0655o18.f4135c.m16263a(str, c3489yj.f14168M, false, m4812f, false, false, c3489yj.f14223j, c0655o18.f4136d) > 0) {
                        C0655o1.this.f4135c.m16258E();
                    }
                }
            }
            String str4 = c3489yj.f14256u;
            if (str4 != null) {
                C0655o1 c0655o19 = C0655o1.this;
                c0655o19.f4135c.m16305b(str4, m4812f, c0655o19.f4136d);
            }
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4837a(C0661r0 c0661r0, String str) {
            C0655o1.this.f4135c.m16273a(c0661r0);
            if (TextUtils.isEmpty(str)) {
                C0655o1.this.f4135c.m16346w();
                return;
            }
            C0655o1 c0655o1 = C0655o1.this;
            if (c0655o1.f4135c.m16298a(str, false, null, null, c0655o1.f4137e, c0655o1.f4136d)) {
                return;
            }
            C3440xj m6134a = C0755x1.m6134a(str, C0655o1.this.f4137e.m14145i());
            if (m6134a != null) {
                C0655o1.this.f4137e.m14121a(m6134a);
            }
            C0655o1.this.f4135c.m16279a(str, c0661r0.getUDXPAPMHandler());
            C0655o1 c0655o12 = C0655o1.this;
            c0655o12.f4135c.m16263a(str, false, false, c0655o12.f4137e, false, false, null, c0655o12.f4136d);
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4838a(C0696e c0696e, C2945mj c2945mj, C3531zj c3531zj, boolean z) {
            if (!z) {
                C0755x1.m6151a(C0655o1.this.f4133a, (C3489yj) null, C0655o1.this.m4824r().getApplicationWindowToken());
            }
            if (c2945mj == null) {
                return;
            }
            Handler handler = new Handler();
            b bVar = new b();
            bVar.m4852a(c0696e, c2945mj, c3531zj);
            handler.post(bVar);
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4839a(String str, int i, C3489yj c3489yj) {
            C0719l1 c0719l1 = new C0719l1();
            c0719l1.f4956i = 1;
            c0719l1.f4957j = str;
            c0719l1.f4943K = i;
            c0719l1.f4944L = c3489yj;
            C0655o1.this.f4135c.m16331h();
            C3400wj c3400wj = C0655o1.this.f4135c;
            c0719l1.f4964q = c3400wj.f13863V;
            c0719l1.f4950c = 22;
            c3400wj.f13873g.m3997d(c0719l1);
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4840a(String str, String str2, C3489yj c3489yj) {
            C0755x1.m6151a(C0655o1.this.f4133a, c3489yj, C0655o1.this.m4824r().getApplicationWindowToken());
            C2945mj m4812f = C0655o1.this.m4812f();
            if (m4812f == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                C0655o1 c0655o1 = C0655o1.this;
                if (!c0655o1.f4135c.m16298a(str, false, c3489yj, null, m4812f, c0655o1.f4136d)) {
                    C0655o1 c0655o12 = C0655o1.this;
                    c0655o12.f4135c.m16287a(m4812f, c0655o12.f4136d);
                    C0655o1 c0655o13 = C0655o1.this;
                    c0655o13.f4135c.m16317c(m4812f, c0655o13.f4136d);
                    C3531zj m13901f = C0655o1.this.f4136d.m13901f();
                    if (m13901f != null) {
                        for (int i = 0; i < m13901f.f14506e.size(); i++) {
                            C0655o1.this.f4135c.m16291a(m13901f.f14506e.elementAt(i));
                        }
                    }
                    C3440xj m6134a = C0755x1.m6134a(str, m4812f.m14145i());
                    if (m6134a != null) {
                        m4812f.m14121a(m6134a);
                    }
                    C0655o1 c0655o14 = C0655o1.this;
                    if (c0655o14.f4135c.m16263a(str, c3489yj.f14168M, false, m4812f, false, false, c3489yj.f14223j, c0655o14.f4136d) > 0) {
                        C0655o1.this.f4135c.m16258E();
                    }
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            C0731p1.m5954a(C0655o1.this.f4133a, str2, C0655o1.this.f4135c.m16343t(), c3489yj);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0071 A[EDGE_INSN: B:53:0x0071->B:17:0x0071 BREAK  A[LOOP:0: B:4:0x0006->B:50:0x006e], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x006e A[SYNTHETIC] */
        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo4841a(java.lang.String r8, java.lang.String r9, p000.C3489yj r10, boolean r11, boolean r12, boolean[] r13) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.i.mo4841a(java.lang.String, java.lang.String, yj, boolean, boolean, boolean[]):void");
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4842a(String str, C3489yj c3489yj) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C0655o1 c0655o1 = C0655o1.this;
            if (c0655o1.f4135c.m16298a(str, false, c3489yj, null, c0655o1.m4812f(), C0655o1.this.f4136d)) {
                return;
            }
            C0655o1 c0655o12 = C0655o1.this;
            c0655o12.f4135c.m16287a(c0655o12.m4812f(), C0655o1.this.f4136d);
            C0655o1 c0655o13 = C0655o1.this;
            c0655o13.f4135c.m16317c(c0655o13.m4812f(), C0655o1.this.f4136d);
            C3531zj m13901f = C0655o1.this.f4136d.m13901f();
            if (m13901f != null) {
                for (int i = 0; i < m13901f.f14506e.size(); i++) {
                    C0655o1.this.f4135c.m16291a(m13901f.f14506e.elementAt(i));
                }
            }
            C0655o1 c0655o14 = C0655o1.this;
            if (c0655o14.f4135c.m16263a(str, false, false, c0655o14.m4812f(), false, false, null, C0655o1.this.f4136d) > 0) {
                C0655o1.this.f4135c.m16258E();
            }
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4843a(C3489yj c3489yj) {
            C0655o1.this.m4825s().setMenu(c3489yj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        
            if (android.text.TextUtils.isEmpty(r13.m12225b()) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
        
            if (r13.m12225b().equals("Menulist:") == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
        
            r0 = r13.m12225b();
         */
        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo4844a(p000.C3489yj r12, p000.C2555hj r13) {
            /*
                r11 = this;
                r13.m12236h()
                java.lang.String r0 = r13.m12231e()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r1 = 0
                if (r0 != 0) goto L4c
                com.comviva.webaxn.ui.o1 r0 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r0 = r0.f4135c
                java.lang.String r2 = r13.m12231e()
                com.comviva.webaxn.utils.r1 r3 = r13.m12235g()
                r0.m16279a(r2, r3)
                com.comviva.webaxn.ui.o1 r0 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r0 = r0.f4135c
                java.lang.String r2 = r13.m12231e()
                com.comviva.webaxn.ui.o1 r3 = com.comviva.webaxn.p002ui.C0655o1.this
                mj r3 = r3.m4812f()
                com.comviva.webaxn.ui.o1 r4 = com.comviva.webaxn.p002ui.C0655o1.this
                lj r4 = r4.f4136d
                boolean r0 = r0.m16296a(r2, r3, r4)
                if (r0 != 0) goto L5b
                java.lang.String r0 = r13.m12225b()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L5b
                java.lang.String r0 = r13.m12225b()
                java.lang.String r2 = "Menulist:"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L5b
                goto L56
            L4c:
                java.lang.String r0 = r13.m12225b()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L5b
            L56:
                java.lang.String r0 = r13.m12225b()
                goto L5c
            L5b:
                r0 = r1
            L5c:
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto Lbc
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r3 = r2.f4135c
                r4 = 0
                r6 = 0
                mj r7 = r2.m4812f()
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.p002ui.C0655o1.this
                lj r8 = r2.f4136d
                r2 = r3
                r3 = r0
                r5 = r12
                boolean r12 = r2.m16298a(r3, r4, r5, r6, r7, r8)
                if (r12 != 0) goto Lbc
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.p002ui.C0655o1.this
                mj r12 = r12.m4812f()
                java.util.Vector r12 = r12.m14145i()
                xj r12 = com.comviva.webaxn.utils.C0755x1.m6134a(r0, r12)
                if (r12 == 0) goto L92
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.p002ui.C0655o1.this
                mj r2 = r2.m4812f()
                r2.m14121a(r12)
            L92:
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r12 = r12.f4135c
                com.comviva.webaxn.utils.r1 r2 = r13.m12235g()
                r12.m16279a(r0, r2)
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r2 = r12.f4135c
                r4 = 0
                r5 = 0
                mj r6 = r12.m4812f()
                r7 = 0
                r8 = 0
                r9 = 0
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.p002ui.C0655o1.this
                lj r10 = r12.f4136d
                r3 = r0
                int r12 = r2.m16263a(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 <= 0) goto Lbc
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r12 = r12.f4135c
                r12.m16258E()
            Lbc:
                java.lang.String r12 = r13.m12227c()
                boolean r12 = android.text.TextUtils.isEmpty(r12)
                if (r12 != 0) goto Ldb
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.p002ui.C0655o1.this
                android.content.Context r12 = com.comviva.webaxn.p002ui.C0655o1.m4731a(r12)
                java.lang.String r0 = r13.m12227c()
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r2 = r2.f4135c
                com.comviva.webaxn.ui.o1 r2 = r2.m16343t()
                com.comviva.webaxn.utils.C0731p1.m5954a(r12, r0, r2, r1)
            Ldb:
                java.lang.String r12 = r13.m12229d()
                if (r12 == 0) goto Lf6
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r12 = r12.f4135c
                java.lang.String r13 = r13.m12229d()
                com.comviva.webaxn.ui.o1 r0 = com.comviva.webaxn.p002ui.C0655o1.this
                mj r0 = r0.m4812f()
                com.comviva.webaxn.ui.o1 r1 = com.comviva.webaxn.p002ui.C0655o1.this
                lj r1 = r1.f4136d
                r12.m16305b(r13, r0, r1)
            Lf6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.i.mo4844a(yj, hj):void");
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4845a(C3489yj c3489yj, String str, C0755x1.r rVar) {
            C0655o1.this.f4135c.m16276a(rVar);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C0655o1 c0655o1 = C0655o1.this;
            c0655o1.f4135c.m16298a(str, false, c3489yj, null, c0655o1.m4812f(), C0655o1.this.f4136d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
        
            if (android.text.TextUtils.isEmpty(r12.m12225b()) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
        
            if (r12.m12225b().equals("Menulist:") == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        
            r11 = r12.m12225b();
         */
        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo4846a(p000.C3531zj r11, p000.C2555hj r12, p000.C2945mj r13) {
            /*
                r10 = this;
                r12.m12236h()
                java.lang.String r11 = r12.m12231e()
                boolean r11 = android.text.TextUtils.isEmpty(r11)
                r0 = 0
                if (r11 != 0) goto L46
                com.comviva.webaxn.ui.o1 r11 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r11 = r11.f4135c
                java.lang.String r1 = r12.m12231e()
                com.comviva.webaxn.utils.r1 r2 = r12.m12235g()
                r11.m16279a(r1, r2)
                com.comviva.webaxn.ui.o1 r11 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r11 = r11.f4135c
                java.lang.String r1 = r12.m12231e()
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.p002ui.C0655o1.this
                lj r2 = r2.f4136d
                boolean r11 = r11.m16296a(r1, r13, r2)
                if (r11 != 0) goto L55
                java.lang.String r11 = r12.m12225b()
                boolean r11 = android.text.TextUtils.isEmpty(r11)
                if (r11 != 0) goto L55
                java.lang.String r11 = r12.m12225b()
                java.lang.String r1 = "Menulist:"
                boolean r11 = r11.equals(r1)
                if (r11 != 0) goto L55
                goto L50
            L46:
                java.lang.String r11 = r12.m12225b()
                boolean r11 = android.text.TextUtils.isEmpty(r11)
                if (r11 != 0) goto L55
            L50:
                java.lang.String r11 = r12.m12225b()
                goto L56
            L55:
                r11 = r0
            L56:
                boolean r1 = android.text.TextUtils.isEmpty(r11)
                if (r1 != 0) goto La1
                com.comviva.webaxn.ui.o1 r1 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r2 = r1.f4135c
                r3 = 0
                r4 = 0
                r5 = 0
                lj r7 = r1.f4136d
                r1 = r2
                r2 = r11
                r6 = r13
                boolean r1 = r1.m16298a(r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto La1
                java.util.Vector r1 = r13.m14145i()
                xj r1 = com.comviva.webaxn.utils.C0755x1.m6134a(r11, r1)
                if (r1 == 0) goto L7b
                r13.m14121a(r1)
            L7b:
                com.comviva.webaxn.ui.o1 r1 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r1 = r1.f4135c
                com.comviva.webaxn.utils.r1 r2 = r12.m12235g()
                r1.m16279a(r11, r2)
                com.comviva.webaxn.ui.o1 r1 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r2 = r1.f4135c
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                lj r9 = r1.f4136d
                r1 = r2
                r2 = r11
                r5 = r13
                int r11 = r1.m16263a(r2, r3, r4, r5, r6, r7, r8, r9)
                if (r11 <= 0) goto La1
                com.comviva.webaxn.ui.o1 r11 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r11 = r11.f4135c
                r11.m16258E()
            La1:
                java.lang.String r11 = r12.m12227c()
                boolean r11 = android.text.TextUtils.isEmpty(r11)
                if (r11 != 0) goto Lc0
                com.comviva.webaxn.ui.o1 r11 = com.comviva.webaxn.p002ui.C0655o1.this
                android.content.Context r11 = com.comviva.webaxn.p002ui.C0655o1.m4731a(r11)
                java.lang.String r1 = r12.m12227c()
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r2 = r2.f4135c
                com.comviva.webaxn.ui.o1 r2 = r2.m16343t()
                com.comviva.webaxn.utils.C0731p1.m5954a(r11, r1, r2, r0)
            Lc0:
                java.lang.String r11 = r12.m12229d()
                if (r11 == 0) goto Ld5
                com.comviva.webaxn.ui.o1 r11 = com.comviva.webaxn.p002ui.C0655o1.this
                wj r11 = r11.f4135c
                java.lang.String r12 = r12.m12229d()
                com.comviva.webaxn.ui.o1 r0 = com.comviva.webaxn.p002ui.C0655o1.this
                lj r0 = r0.f4136d
                r11.m16305b(r12, r13, r0)
            Ld5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.i.mo4846a(zj, hj, mj):void");
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public void mo4847a(boolean z, C3489yj c3489yj) {
            C0655o1 c0655o1;
            String str;
            if (z) {
                if (!c3489yj.f14240o1) {
                    C0655o1.m4744d(C0655o1.this);
                    c3489yj.f14240o1 = true;
                }
            } else if (C0655o1.this.f4120J > 0 && c3489yj.f14240o1) {
                c3489yj.f14240o1 = false;
                C0655o1.m4747e(C0655o1.this);
            }
            if (C0655o1.this.f4120J == C0655o1.this.f4119I) {
                c0655o1 = C0655o1.this;
                str = c3489yj.f14213f1;
            } else {
                c0655o1 = C0655o1.this;
                str = c3489yj.f14216g1;
            }
            c0655o1.m4782a(str, c3489yj);
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: a */
        public boolean mo4848a(C3489yj c3489yj, String str, String str2) {
            C2899lj c2899lj;
            C3531zj m13901f;
            C3489yj m16930a;
            AbstractC0652n1 abstractC0652n1;
            boolean z = false;
            if (C0655o1.this.m4812f() == null || str == null || (c2899lj = C0655o1.this.f4136d) == null || (m13901f = c2899lj.m13901f()) == null || (m16930a = m13901f.m16930a(str, (Vector<C3489yj>) null)) == null || m16930a.f14208e != 3 || (abstractC0652n1 = m16930a.f14197a0) == null) {
                return false;
            }
            if (abstractC0652n1 instanceof C0670w) {
                ((C0670w) abstractC0652n1).m5091g(str2);
                z = true;
            }
            AbstractC0652n1 abstractC0652n12 = m16930a.f14197a0;
            if (!(abstractC0652n12 instanceof C0668v)) {
                return z;
            }
            ((C0668v) abstractC0652n12).m5028e(str2);
            return true;
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: b */
        public void mo4849b(AbstractC0652n1 abstractC0652n1) {
            if (abstractC0652n1 == null) {
                return;
            }
            if (!(abstractC0652n1 instanceof C0668v) && !(abstractC0652n1 instanceof C0670w)) {
                C0655o1.this.m4825s().requestFocus();
            }
            C0755x1.m6151a(C0655o1.this.f4133a, abstractC0652n1.mo4148f(), C0655o1.this.m4824r().getApplicationWindowToken());
            Handler handler = new Handler();
            a aVar = new a();
            aVar.m4851a(abstractC0652n1);
            handler.post(aVar);
        }

        @Override // com.comviva.webaxn.utils.C0755x1.p
        /* renamed from: b */
        public void mo4850b(C3489yj c3489yj) {
            if (TextUtils.isEmpty(c3489yj.f14181S0)) {
                return;
            }
            String str = c3489yj.f14181S0;
            String str2 = "";
            if (str.contains("#")) {
                int indexOf = c3489yj.f14181S0.indexOf("#");
                String substring = c3489yj.f14181S0.substring(0, indexOf);
                try {
                    str2 = c3489yj.f14181S0.substring(indexOf + 1);
                } catch (Exception unused) {
                }
                str = substring;
            }
            C3489yj m16930a = C0655o1.this.f4134b.m16930a(str, (Vector<C3489yj>) null);
            if (m16930a == null || m16930a.f14208e != 4) {
                return;
            }
            C0655o1 c0655o1 = C0655o1.this;
            C0755x1.m6155a(c0655o1.f4136d, c0655o1.f4133a, str, str2);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o1$j */
    /* loaded from: classes.dex */
    class j implements C0755x1.q {
        j() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.q
        /* renamed from: a */
        public void mo4853a(C3489yj c3489yj, boolean z) {
            C0655o1 c0655o1;
            boolean z2;
            if (z) {
                C0655o1.this.m4804b(c3489yj);
                c0655o1 = C0655o1.this;
                z2 = true;
            } else {
                C0655o1.this.m4808c(c3489yj);
                c0655o1 = C0655o1.this;
                z2 = false;
            }
            c0655o1.f4118H = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.o1$k */
    /* loaded from: classes.dex */
    public class k implements Animation.AnimationListener {
        k() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0655o1.this.f4155w.clearAnimation();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C0655o1.this.f4155w.getLayoutParams();
            layoutParams.leftMargin = 0;
            C0655o1.this.f4155w.setLayoutParams(layoutParams);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.o1$l */
    /* loaded from: classes.dex */
    public class l implements Animation.AnimationListener {
        l() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0655o1.this.f4155w.clearAnimation();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C0655o1.this.f4155w.getLayoutParams();
            layoutParams.rightMargin = 0;
            C0655o1.this.f4155w.setLayoutParams(layoutParams);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o1$m */
    /* loaded from: classes.dex */
    class m implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C3087pj f4175b;

        /* renamed from: c */
        final /* synthetic */ C3400wj f4176c;

        /* renamed from: d */
        final /* synthetic */ C2945mj f4177d;

        m(C3087pj c3087pj, C3400wj c3400wj, C2945mj c2945mj) {
            this.f4175b = c3087pj;
            this.f4176c = c3400wj;
            this.f4177d = c2945mj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0655o1.this.m4788a(this.f4175b, this.f4176c, this.f4177d);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o1$n */
    /* loaded from: classes.dex */
    class n implements View.OnTouchListener {
        n(C0655o1 c0655o1) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o1$o */
    /* loaded from: classes.dex */
    class o implements View.OnTouchListener {
        o(C0655o1 c0655o1) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.o1$p */
    /* loaded from: classes.dex */
    public class p implements View.OnTouchListener {

        /* renamed from: b */
        final /* synthetic */ GestureDetector f4179b;

        p(C0655o1 c0655o1, GestureDetector gestureDetector) {
            this.f4179b = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !this.f4179b.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.o1$q */
    /* loaded from: classes.dex */
    public class q implements View.OnClickListener {

        /* renamed from: b */
        C2945mj f4180b;

        q(C2945mj c2945mj) {
            this.f4180b = c2945mj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f4180b.m14136d() != null) {
                for (int i = 0; i < this.f4180b.m14136d().size(); i++) {
                    C0655o1.this.m4796a(this.f4180b.m14136d().get(i).f4714f, this.f4180b.m14136d(), this.f4180b);
                }
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o1$r */
    /* loaded from: classes.dex */
    public class r implements View.OnTouchListener {

        /* renamed from: b */
        private VelocityTracker f4182b;

        /* renamed from: c */
        private float f4183c;

        /* renamed from: d */
        private int f4184d = 500;

        /* renamed from: e */
        private long f4185e;

        /* renamed from: f */
        private float f4186f;

        /* renamed from: g */
        private float f4187g;

        /* renamed from: h */
        private MotionEvent f4188h;

        /* renamed from: i */
        C3087pj f4189i;

        /* renamed from: j */
        C3400wj f4190j;

        /* renamed from: k */
        C2945mj f4191k;

        public r(C3087pj c3087pj, C3400wj c3400wj, C2945mj c2945mj) {
            this.f4189i = null;
            this.f4190j = null;
            this.f4189i = c3087pj;
            this.f4190j = c3400wj;
            this.f4191k = c2945mj;
        }

        /* renamed from: a */
        private float m4854a(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            float f6 = f2 - f4;
            return ((float) Math.sqrt((f5 * f5) + (f6 * f6))) / C0687b.m5342a(C0655o1.this.f4133a).m5343a().m5544a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0114, code lost:
        
            if (r1 < 0.0f) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x015a, code lost:
        
            r7 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
        
            r11.f4192l.f4154v.setAlpha(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0157, code lost:
        
            if (r1 < 0.0f) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0218, code lost:
        
            if (r11.f4192l.f4155w.getRight() == 0) goto L89;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 573
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.r.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public C0655o1(Context context, LayoutInflater layoutInflater, C0614b c0614b, C2899lj c2899lj, C3400wj c3400wj) {
        this.f4125O = 1.0f;
        this.f4133a = context;
        this.f4125O = context.getResources().getConfiguration().fontScale;
        this.f4135c = c3400wj;
        m4779a(c0614b);
        f4110W = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.webaxn_page, (ViewGroup) null);
        if (Build.VERSION.SDK_INT > 11) {
            inflate.addOnAttachStateChangeListener(new h(this));
        }
        this.f4148p = (ProgressBar) inflate.findViewById(R.id.hprogressbar);
        this.f4154v = (PageRootFrame) inflate.findViewById(R.id.frame_view);
        this.f4155w = (FrameLayout) inflate.findViewById(R.id.frame_view_child);
        this.f4154v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 119));
        this.f4156x = (RelativeLayout) inflate.findViewById(R.id.root_view);
        this.f4158z = (RelativeLayout) inflate.findViewById(R.id.wrapper_page);
        this.f4157y = (LinearLayout) inflate.findViewById(R.id.webaxn_layout);
        this.f4139g = (TextView) inflate.findViewById(R.id.banner);
        this.f4145m = (LinearLayout) inflate.findViewById(R.id.advlayout);
        this.f4140h = (ImageView) inflate.findViewById(R.id.bannerimage);
        this.f4142j = (LinearLayout) inflate.findViewById(R.id.navigationlayout);
        this.f4144l = (LinearLayout) inflate.findViewById(R.id.fixedlayout);
        this.f4143k = (LinearLayout) inflate.findViewById(R.id.c3ltitle);
        this.f4149q = (RelativeLayout) inflate.findViewById(R.id.titlelayout);
        this.f4150r = (RelativeLayout) inflate.findViewById(R.id.image_layout);
        this.f4151s = (TextView) inflate.findViewById(R.id.titletext);
        this.f4152t = (ImageView) inflate.findViewById(R.id.titleimage);
        this.f4117G = new HashMap<>();
    }

    /* renamed from: a */
    private void m4734a(C3489yj c3489yj, C0669v0 c0669v0) {
        C3489yj c3489yj2;
        C0744u c0744u;
        C0744u c0744u2 = c3489yj.f14241p;
        int m6067f = c0744u2 != null ? (int) c0744u2.m6067f() : 0;
        if (m6067f < 0 && (c3489yj2 = c3489yj.f14145A0) != null && (c0744u = c3489yj2.f14241p) != null) {
            m6067f = (int) c0744u.m6067f();
        }
        if (m6067f < 0 && (m6067f = C0713j1.m5563a(this.f4133a).m5604L()) < 0) {
            m6067f = C0713j1.m5563a(this.f4133a).m5738w();
        }
        if (m6067f < 0) {
            m6067f = C2991nj.f12339a;
        }
        LinearLayout linearLayout = new LinearLayout(this.f4133a);
        linearLayout.setBackgroundColor(0);
        linearLayout.setBackgroundDrawable(null);
        this.f4111A.addView(linearLayout, new LinearLayout.LayoutParams(-1, m6067f));
    }

    /* renamed from: b */
    public static void m4737b(C2899lj c2899lj, Context context, boolean z) {
        HashMap<String, Vector<C2862kj>> hashMap;
        boolean z2;
        int parseInt;
        boolean z3;
        int parseInt2;
        if (c2899lj == null || (hashMap = c2899lj.f11887g) == null) {
            return;
        }
        try {
            for (Map.Entry<String, Vector<C2862kj>> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                String m200h = C0023aj.m160a(context).m200h(key);
                String m191e = C0023aj.m160a(context).m191e(key);
                String[] split = !TextUtils.isEmpty(m191e) ? m191e.split(",") : null;
                String[] split2 = !TextUtils.isEmpty(m200h) ? m200h.split(";") : null;
                Vector<C2862kj> value = entry.getValue();
                int i2 = 0;
                while (i2 < value.size()) {
                    C3489yj c3489yj = value.elementAt(i2).f11759d;
                    if (c3489yj.f14197a0 != null) {
                        if (c3489yj.f14197a0 instanceof C0632h) {
                            C0632h c0632h = (C0632h) c3489yj.f14197a0;
                            ArrayList<CheckBox> m4428m = c0632h.m4428m();
                            if (c3489yj.f14184U != null) {
                                for (int i3 : c3489yj.f14184U) {
                                    if (i3 < m4428m.size()) {
                                        m4428m.get(i3).setChecked(true);
                                    }
                                }
                            } else if (m200h != null && split2 != null) {
                                for (int i4 = 0; i4 < split2.length; i4++) {
                                    if (split2[i4] != null && split != null && i4 < split.length) {
                                        if (split[i4] == null || !split[i4].equals("0") || !TextUtils.isDigitsOnly(split2[i4]) || (parseInt2 = Integer.parseInt(split2[i4])) >= value.size() || !value.elementAt(parseInt2).f11759d.equals(c3489yj) || parseInt2 < i2) {
                                            z3 = false;
                                        } else {
                                            split2[i4] = String.valueOf(parseInt2 - i2);
                                            z3 = true;
                                        }
                                        if (((split[i4] == null || split[i4].equals("0")) && true != z3) ? false : c0632h.m4425a(split2[i4], split[i4])) {
                                            split2[i4] = null;
                                            split[i4] = null;
                                        }
                                    }
                                }
                            }
                        } else if (c3489yj.f14197a0 instanceof C0635i) {
                            C0635i c0635i = (C0635i) c3489yj.f14197a0;
                            if (c3489yj.f14184U != null) {
                                if (c0635i.m4475q()) {
                                    ArrayList<C0186n0> m4473o = c0635i.m4473o();
                                    for (int i5 : c3489yj.f14184U) {
                                        if (i5 < m4473o.size() && !m4473o.get(i5).isChecked()) {
                                            c0635i.f3810E[i5] = 1;
                                            m4473o.get(i5).setChecked(true);
                                        }
                                    }
                                } else {
                                    ArrayList<CheckBox> m4471m = c0635i.m4471m();
                                    for (int i6 : c3489yj.f14184U) {
                                        if (i6 < m4471m.size()) {
                                            m4471m.get(i6).setChecked(true);
                                        }
                                    }
                                }
                            } else if (m200h != null && split2 != null) {
                                for (int i7 = 0; i7 < split2.length; i7++) {
                                    if (split2[i7] != null && split != null && i7 < split.length) {
                                        if (split[i7] == null || !split[i7].equals("0") || !TextUtils.isDigitsOnly(split2[i7]) || (parseInt = Integer.parseInt(split2[i7])) >= value.size() || !value.elementAt(parseInt).f11759d.equals(c3489yj) || parseInt < i2) {
                                            z2 = false;
                                        } else {
                                            split2[i7] = String.valueOf(parseInt - i2);
                                            z2 = true;
                                        }
                                        if (((split[i7] == null || split[i7].equals("0")) && true != z2) ? false : c0635i.m4467a(split2[i7], split[i7])) {
                                            split2[i7] = null;
                                            split[i7] = null;
                                        }
                                    }
                                }
                            }
                        }
                        i2 += c3489yj.f14174P.size() - 1;
                    }
                    i2++;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m4738b(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        int size;
        C3489yj m16930a;
        C0617c c0617c = new C0617c(this.f4133a, c3489yj, c0669v0);
        c0617c.m4706a(this.f4111A);
        c3489yj.f14197a0 = c0617c;
        c0617c.m4178c(c3489yj);
        c0617c.mo4201a(c0657p0);
        c0617c.m4175b(c3489yj.f14241p.m6067f());
        c0617c.m4179g(c3489yj.f14241p.m6068g());
        c0617c.m4173a(c3489yj.f14241p.m6064d());
        Vector<C3264tj> vector = c3489yj.f14166L;
        if (vector != null && (size = vector.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                C3264tj elementAt = c3489yj.f14166L.elementAt(i2);
                if (elementAt != null && (m16930a = this.f4134b.m16930a(elementAt.f13320g, (Vector<C3489yj>) null)) != null && m16930a.f14247r == null && m16930a.f14208e == 3) {
                    m16930a.f14247r = elementAt;
                    AbstractC0652n1 abstractC0652n1 = m16930a.f14197a0;
                    if (abstractC0652n1 != null) {
                        ((C0668v) abstractC0652n1).m5020a(elementAt);
                    }
                }
            }
        }
        c0617c.mo4595a(this.f4131U);
        c0617c.m4181n();
        c0617c.m4177b(c3489yj);
        c0617c.m4180m();
    }

    /* renamed from: b */
    private void m4739b(C3489yj c3489yj, C0669v0 c0669v0) {
        LinearLayout linearLayout = new LinearLayout(this.f4133a);
        this.f4128R.add(linearLayout);
        linearLayout.setOnTouchListener(new g(this));
        c0669v0.f4408n = true;
        m4791a(c3489yj, linearLayout, (C0639j0) null, c0669v0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, C0755x1.m6116a(c3489yj.f14214g, c3489yj.f14217h, C0755x1.m6177c()));
        layoutParams.setMargins(c3489yj.m16638d(c0669v0.f4397c.width()), c3489yj.m16643i(c0669v0.f4397c.height()), c3489yj.m16641g(c0669v0.f4397c.width()), c3489yj.m16632a(c0669v0.f4397c.height()));
        this.f4155w.addView(linearLayout, layoutParams);
    }

    /* renamed from: b */
    private void m4740b(boolean z) {
        boolean z2;
        C3489yj m16930a;
        boolean z3;
        boolean z4;
        C3489yj m16930a2;
        boolean z5;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        RelativeLayout relativeLayout = this.f4149q;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            this.f4149q.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f4143k;
        if (linearLayout3 != null) {
            linearLayout3.removeAllViews();
            this.f4143k.setVisibility(8);
        }
        LinearLayout linearLayout4 = this.f4142j;
        if (linearLayout4 != null) {
            linearLayout4.removeAllViews();
            this.f4142j.setVisibility(8);
        }
        if (this.f4145m != null) {
            ImageView imageView = this.f4140h;
            if (imageView != null && imageView.getVisibility() == 0) {
                this.f4140h.setImageBitmap(null);
                this.f4140h.setVisibility(8);
            }
            TapsellSDKAdv tapsellSDKAdv = this.f4129S;
            if (tapsellSDKAdv != null) {
                this.f4145m.removeView(tapsellSDKAdv.m5305a());
                this.f4129S = null;
            }
            this.f4145m.setVisibility(8);
        }
        TextView textView = this.f4139g;
        if (textView != null) {
            textView.setText((CharSequence) null);
            this.f4139g.setVisibility(8);
        }
        LinearLayout linearLayout5 = this.f4111A;
        if (linearLayout5 != null) {
            linearLayout5.removeAllViews();
            NestedScrollView nestedScrollView = this.f4146n;
            if (nestedScrollView != null) {
                nestedScrollView.removeAllViews();
                this.f4146n = null;
            }
            this.f4157y.removeAllViews();
            this.f4111A = null;
        }
        ArrayList<LinearLayout> arrayList = this.f4128R;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<LinearLayout> it = this.f4128R.iterator();
            while (it.hasNext()) {
                LinearLayout next = it.next();
                if (next != null) {
                    next.removeAllViews();
                }
            }
            this.f4128R = null;
        }
        C3531zj c3531zj = this.f4134b;
        if (c3531zj == null || c3531zj.f14506e == null) {
            return;
        }
        this.f4138f = new C0669v0();
        int m5552d = C0687b.m5342a(this.f4133a).m5343a().m5552d();
        int m5553e = C0687b.m5342a(this.f4133a).m5343a().m5553e();
        int m16950j = this.f4134b.m16950j(m5552d);
        int m16940c = this.f4134b.m16940c(m5553e);
        if (this.f4134b.f14514m.equalsIgnoreCase("popup")) {
            m4775a(m16950j, m16940c);
        } else {
            this.f4157y.getLayoutParams().height = -1;
            this.f4157y.getLayoutParams().width = -1;
            ((FrameLayout.LayoutParams) m4824r().getLayoutParams()).setMargins(this.f4134b.m16943d(m5552d), this.f4134b.m16948h(m5552d), this.f4134b.m16946f(m5552d), this.f4134b.m16928a(m5552d));
            m4824r().setPadding(this.f4134b.m16945e(m5552d), this.f4134b.m16949i(m5552d), this.f4134b.m16947g(m5552d), this.f4134b.m16936b(m5552d));
        }
        if (m16950j < 0) {
            m16950j = m5552d - (this.f4134b.m16943d(m5552d) + this.f4134b.m16946f(m5552d));
        }
        if (m16940c < 0) {
            m16940c = m5553e - (this.f4134b.m16948h(m5552d) + this.f4134b.m16928a(m5552d));
        }
        this.f4114D = m16940c - (this.f4134b.m16949i(m5552d) + this.f4134b.m16936b(m5552d));
        boolean z6 = false;
        this.f4138f.f4397c = new Rect(0, 0, m16950j - (this.f4134b.m16945e(m16950j) + this.f4134b.m16947g(m16950j)), this.f4114D);
        C0669v0 c0669v0 = this.f4138f;
        Rect rect = c0669v0.f4397c;
        c0669v0.f4395a = rect.left;
        c0669v0.f4396b = rect.top;
        if (this.f4136d.m13894c() != null && (linearLayout2 = this.f4143k) != null) {
            linearLayout2.setVisibility(0);
            m4791a(this.f4136d.m13894c(), this.f4143k, (C0639j0) null, this.f4138f);
            if (this.f4136d.m13894c().f14197a0 != null && this.f4136d.m13894c().f14197a0.mo4150h() != null) {
                if (this.f4136d.m13894c().f14211f) {
                    this.f4136d.m13894c().f14197a0.mo4150h().setVisibility(0);
                } else {
                    this.f4136d.m13894c().f14197a0.mo4150h().setVisibility(8);
                }
            }
        }
        if (this.f4136d.m13888b() != null && (linearLayout = this.f4142j) != null) {
            linearLayout.setVisibility(0);
            LinearLayout linearLayout6 = this.f4144l;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
            m4791a(this.f4136d.m13888b(), this.f4142j, (C0639j0) null, this.f4138f);
            if (this.f4136d.m13888b().f14197a0 != null && this.f4136d.m13888b().f14197a0.mo4150h() != null) {
                if (this.f4136d.m13888b().f14211f) {
                    this.f4136d.m13888b().f14197a0.mo4150h().setVisibility(0);
                } else {
                    this.f4136d.m13888b().f14197a0.mo4150h().setVisibility(8);
                }
            }
        }
        if (this.f4136d.m13877a() != null && this.f4136d.m13877a().size() > 0) {
            if (this.f4128R == null) {
                this.f4128R = new ArrayList<>();
            }
            for (int i2 = 0; i2 < this.f4136d.m13877a().size(); i2++) {
                m4739b(this.f4136d.m13877a().get(i2), this.f4138f);
                if (this.f4136d.m13877a().get(i2).f14197a0 != null && this.f4136d.m13877a().get(i2).f14197a0.mo4150h() != null) {
                    if (this.f4136d.m13877a().get(i2).f14211f) {
                        this.f4136d.m13877a().get(i2).f14197a0.mo4150h().setVisibility(0);
                    } else {
                        this.f4136d.m13877a().get(i2).f14197a0.mo4150h().setVisibility(8);
                    }
                }
            }
        }
        C3531zj c3531zj2 = this.f4134b;
        if (c3531zj2 != null && !c3531zj2.f14514m.equalsIgnoreCase("popup") && this.f4134b.f14521t && this.f4137e.m14113a() != null) {
            m4787a(this.f4137e, true, this.f4138f.f4397c.width(), this.f4138f.f4397c.height(), false);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4149q.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4143k.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4144l.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4114D -= (this.f4149q.getMeasuredHeight() + this.f4143k.getMeasuredHeight()) + this.f4144l.getMeasuredHeight();
        this.f4138f.f4397c = new Rect(0, 0, m16950j - (this.f4134b.m16945e(m16950j) + this.f4134b.m16947g(m16950j)), this.f4114D);
        C0669v0 c0669v02 = this.f4138f;
        Rect rect2 = c0669v02.f4397c;
        c0669v02.f4395a = rect2.left;
        c0669v02.f4396b = rect2.top;
        boolean z7 = false;
        for (int i3 = 0; i3 < this.f4134b.f14506e.size(); i3++) {
            C3489yj elementAt = this.f4134b.f14506e.elementAt(i3);
            int i4 = elementAt.f14208e;
            if (i4 != 17 && i4 != 31 && i4 != 8 && i4 != 42) {
                if (!z7) {
                    m4801b();
                    z7 = true;
                }
                m4791a(elementAt, (ViewGroup) null, (C0639j0) null, this.f4138f);
                AbstractC0652n1 abstractC0652n1 = elementAt.f14197a0;
                if (abstractC0652n1 != null && abstractC0652n1.mo4150h() != null) {
                    boolean z8 = elementAt.f14211f;
                    View mo4150h = elementAt.f14197a0.mo4150h();
                    if (z8) {
                        mo4150h.setVisibility(0);
                    } else {
                        mo4150h.setVisibility(8);
                    }
                }
            }
        }
        HashMap<String, C2555hj> hashMap = this.f4134b.f14499P;
        if (hashMap != null) {
            if (hashMap.get("onshowkeypad") != null) {
                String[] split = this.f4134b.f14499P.get("onshowkeypad").m12225b().split("&");
                boolean[] zArr = split.length > 0 ? new boolean[split.length] : null;
                z2 = false;
                for (int i5 = 0; i5 < split.length; i5++) {
                    if (split[i5].startsWith("c3lshow:")) {
                        split[i5] = split[i5].substring(8);
                    } else if (split[i5].startsWith("c3lhide:")) {
                        split[i5] = split[i5].substring(8);
                    }
                    if (!TextUtils.isEmpty(split[i5]) && (m16930a2 = this.f4134b.m16930a(split[i5], (Vector<C3489yj>) null)) != null) {
                        C3489yj c3489yj = m16930a2.f14145A0;
                        if (c3489yj == null) {
                            z5 = true;
                        } else {
                            this.f4115E.put(c3489yj.f14197a0.mo4150h(), m16930a2.f14145A0);
                            z5 = false;
                        }
                        AbstractC0652n1 abstractC0652n12 = m16930a2.f14197a0;
                        if (abstractC0652n12 != null) {
                            this.f4115E.put(abstractC0652n12.mo4150h(), m16930a2);
                        }
                        zArr[i5] = z5;
                        z2 = true;
                    }
                }
                if (z2) {
                    int length = zArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            z4 = true;
                            break;
                        } else {
                            if (!zArr[i6]) {
                                z4 = false;
                                break;
                            }
                            i6++;
                        }
                    }
                    this.f4116F = z4;
                }
            } else {
                z2 = false;
            }
            if (z2 || this.f4134b.f14499P.get("onhidekeypad") == null) {
                return;
            }
            String[] split2 = this.f4134b.f14499P.get("onhidekeypad").m12225b().split("&");
            boolean[] zArr2 = split2.length > 0 ? new boolean[split2.length] : null;
            for (int i7 = 0; i7 < split2.length; i7++) {
                if (split2[i7].startsWith("c3lshow:")) {
                    split2[i7] = split2[i7].substring(8);
                } else if (split2[i7].startsWith("c3lhide:")) {
                    split2[i7] = split2[i7].substring(8);
                }
                if (!TextUtils.isEmpty(split2[i7]) && (m16930a = this.f4134b.m16930a(split2[i7], (Vector<C3489yj>) null)) != null) {
                    C3489yj c3489yj2 = m16930a.f14145A0;
                    if (c3489yj2 == null) {
                        z3 = true;
                    } else {
                        this.f4115E.put(c3489yj2.f14197a0.mo4150h(), m16930a.f14145A0);
                        z3 = false;
                    }
                    AbstractC0652n1 abstractC0652n13 = m16930a.f14197a0;
                    if (abstractC0652n13 != null) {
                        this.f4115E.put(abstractC0652n13.mo4150h(), m16930a);
                    }
                    zArr2[i7] = z3;
                    z2 = true;
                }
            }
            if (z2) {
                int length2 = zArr2.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        z6 = true;
                        break;
                    } else if (!zArr2[i8]) {
                        break;
                    } else {
                        i8++;
                    }
                }
                this.f4116F = z6;
            }
        }
    }

    /* renamed from: c */
    public static void m4742c(C2899lj c2899lj, Context context, boolean z) {
        m4745d(c2899lj, context, z);
        m4737b(c2899lj, context, z);
    }

    /* renamed from: c */
    private void m4743c(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        C0626f c0626f = new C0626f(this.f4133a, c0669v0);
        c0626f.m4706a(this.f4111A);
        c0626f.m4306b(c3489yj);
        c3489yj.f14197a0 = c0626f;
        c0626f.m4304a(c3489yj.m16645k(this.f4138f.f4397c.width()), c3489yj.m16637c(C0687b.m5342a(this.f4133a).m5343a().m5547b()));
        if (c3489yj.f14264x0 == null) {
            c0626f.m4305a(c3489yj.f14260v0);
        }
        c0626f.mo4201a(c0657p0);
        c0626f.mo4595a(this.f4131U);
        c0626f.m4308n();
    }

    /* renamed from: d */
    static /* synthetic */ int m4744d(C0655o1 c0655o1) {
        int i2 = c0655o1.f4120J;
        c0655o1.f4120J = i2 + 1;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r4.isChecked() == false) goto L24;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m4745d(p000.C2899lj r13, android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.m4745d(lj, android.content.Context, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r5.f3890z.size() > 0) goto L34;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4746d(p000.C3489yj r4, com.comviva.webaxn.p002ui.C0657p0 r5, com.comviva.webaxn.p002ui.C0669v0 r6) {
        /*
            r3 = this;
            java.util.Vector<kj> r5 = r4.f14174P
            if (r5 != 0) goto L5
            return
        L5:
            int r5 = r4.f14178R
            r0 = 2
            if (r5 != r0) goto L2d
            com.comviva.webaxn.ui.h r5 = new com.comviva.webaxn.ui.h
            android.content.Context r0 = r3.f4133a
            r5.<init>(r0, r4, r6)
            com.comviva.webaxn.utils.x1$p r6 = r3.f4131U
            r5.mo4595a(r6)
            android.widget.LinearLayout r6 = r3.f4111A
            r5.m4706a(r6)
            r4.f14197a0 = r5
            r5.m4426b(r4)
            r5.m4435t()
            byte[] r4 = r4.f14260v0
            r5.m4424a(r4)
            r5.m4432q()
            goto Ldd
        L2d:
            r0 = 4
            if (r5 == r0) goto Lbc
            r0 = 3
            if (r5 != r0) goto L35
            goto Lbc
        L35:
            r0 = 1
            if (r5 != r0) goto Ldd
            com.comviva.webaxn.ui.k r5 = new com.comviva.webaxn.ui.k
            android.content.Context r0 = r3.f4133a
            r5.<init>(r0, r4, r6)
            com.comviva.webaxn.utils.x1$p r6 = r3.f4131U
            r5.mo4595a(r6)
            android.widget.LinearLayout r6 = r3.f4111A
            r5.m4706a(r6)
            r6 = 0
            r0 = 0
        L4b:
            java.util.Vector<kj> r1 = r4.f14174P
            int r1 = r1.size()
            if (r0 >= r1) goto L63
            java.util.Vector<kj> r1 = r4.f14174P
            java.lang.Object r1 = r1.elementAt(r0)
            kj r1 = (p000.C2862kj) r1
            java.lang.String r1 = r1.f11756a
            r5.m4528b(r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            r4.f14197a0 = r5
            r5.m4529b(r4)
            r5.m4539r()
            android.content.Context r0 = r3.f4133a
            aj r0 = p000.C0023aj.m160a(r0)
            java.lang.String r1 = r4.f14186V
            java.lang.String r0 = r0.m200h(r1)
            java.lang.String r1 = r4.f14176Q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L8b
            android.content.Context r0 = r3.f4133a
            aj r0 = p000.C0023aj.m160a(r0)
            java.lang.String r1 = r4.f14176Q
            java.lang.String r0 = r0.m200h(r1)
        L8b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L9b
            int[] r1 = r4.f14184U
            if (r1 == 0) goto L9b
            int r2 = r1.length
            if (r2 <= 0) goto L9b
            r6 = r1[r6]
            goto Lad
        L9b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto La5
            r5.m4530c(r0)
            goto Lb0
        La5:
            java.util.ArrayList<java.lang.String> r0 = r5.f3890z
            int r0 = r0.size()
            if (r0 <= 0) goto Lb0
        Lad:
            r5.m4533i(r6)
        Lb0:
            r5.m4538q()
            byte[] r4 = r4.f14260v0
            r5.m4527a(r4)
            r5.m4536o()
            goto Ldd
        Lbc:
            com.comviva.webaxn.ui.s0 r5 = new com.comviva.webaxn.ui.s0
            android.content.Context r0 = r3.f4133a
            r5.<init>(r0, r4, r6)
            com.comviva.webaxn.utils.x1$p r6 = r3.f4131U
            r5.mo4595a(r6)
            android.widget.LinearLayout r6 = r3.f4111A
            r5.m4706a(r6)
            r4.f14197a0 = r5
            r5.m4956c(r4)
            r5.m4967t()
            byte[] r4 = r4.f14260v0
            r5.m4953a(r4)
            r5.m4964q()
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.m4746d(yj, com.comviva.webaxn.ui.p0, com.comviva.webaxn.ui.v0):void");
    }

    /* renamed from: e */
    static /* synthetic */ int m4747e(C0655o1 c0655o1) {
        int i2 = c0655o1.f4120J;
        c0655o1.f4120J = i2 - 1;
        return i2;
    }

    /* renamed from: e */
    private void m4748e(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        C0656p c0656p = new C0656p(this.f4133a, c3489yj, c0669v0, this);
        c0656p.m4706a(this.f4111A);
        c3489yj.f14197a0 = c0656p;
        c0656p.m4867c(c3489yj);
        c0656p.mo4595a(this.f4131U);
        String m200h = C0023aj.m160a(this.f4133a).m200h(c3489yj.f14186V);
        if (!TextUtils.isEmpty(c3489yj.f14176Q)) {
            m200h = C0023aj.m160a(this.f4133a).m200h(c3489yj.f14176Q);
        }
        if (m200h != null) {
            c0656p.m4866c(m200h);
        }
        c0656p.m4874r();
        c0656p.m4862a(c3489yj.f14260v0);
        c0656p.m4872p();
    }

    /* renamed from: f */
    private void m4750f(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        C0666u c0666u = new C0666u(this.f4133a, c3489yj, c0669v0);
        c0666u.m4988a(C0731p1.f5073b);
        c0666u.m4706a(this.f4111A);
        c0666u.m4989b(c3489yj);
        c3489yj.f14197a0 = c0666u;
        c0666u.mo4595a(this.f4131U);
        c0666u.m4991n();
    }

    /* renamed from: g */
    private void m4752g(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        C0482bj c0482bj;
        String str;
        C0668v c0668v = new C0668v(this.f4133a, c3489yj, c0669v0, this);
        c0668v.mo4595a(this.f4131U);
        int m5011a = c0668v.m5011a(c3489yj.f14178R, c3489yj.f14164K, c3489yj.f14229l);
        int i2 = c3489yj.f14180S;
        if (i2 > 0) {
            c0668v.m5033j(i2);
        }
        String str2 = c3489yj.f14238o;
        if (str2 != null) {
            c0668v.m5027d(str2);
        }
        if (c3489yj.m16636b()) {
            c0668v.m5031h(c3489yj.m16631a());
        }
        if (m5011a != 3 && m5011a != 6) {
            String m200h = C0023aj.m160a(this.f4133a).m200h(c3489yj.f14186V);
            if (!TextUtils.isEmpty(c3489yj.f14176Q)) {
                m200h = C0023aj.m160a(this.f4133a).m200h(c3489yj.f14176Q);
            }
            if (TextUtils.isEmpty(m200h)) {
                m200h = C0023aj.m160a(this.f4133a).m197g(c3489yj.f14186V);
            }
            if (TextUtils.isEmpty(m200h) && (str = c3489yj.f14235n) != null) {
                m200h = str;
            }
            c0668v.m5029f(m200h);
        }
        C0744u c0744u = c3489yj.f14241p;
        if (c0744u != null) {
            if (c0744u.m6072k()) {
                c0668v.mo4176b(c3489yj.f14241p.m6062c());
            }
            if (c3489yj.f14241p.m6071j()) {
                c0668v.mo4314a(c3489yj.f14241p.m6057b());
            }
            c0668v.m5024b(c3489yj.f14241p.m6067f());
            c0668v.m5032i(c3489yj.f14241p.m6068g());
            c0668v.m5013a(c3489yj.f14241p.m6064d());
        }
        if (c3489yj.f14165K0 == 1 && (c0482bj = c3489yj.f14167L0) != null && c0482bj.m3408d() != -1) {
            c0668v.m5031h(c3489yj.f14167L0.m3408d());
        }
        if (c3489yj.f14165K0 == 4) {
            c0668v.m5021a(false);
            c0668v.mo4176b(0);
        }
        c0668v.m5020a(c3489yj.f14247r);
        c0668v.mo4201a(c0657p0);
        c0668v.m4706a((ViewGroup) this.f4111A);
        c3489yj.f14197a0 = c0668v;
        c0668v.m5025b(c3489yj);
        C0482bj c0482bj2 = c3489yj.f14167L0;
        if (c0482bj2 != null) {
            c0668v.m5019a(c0482bj2.m3411f(), c3489yj.f14167L0.m3412g());
            if (c3489yj.f14167L0.m3408d() != -1) {
                c0668v.m5031h(c3489yj.f14167L0.m3408d());
            }
        }
        c0668v.m5012a(c0669v0);
        c0668v.m5041t();
        c0668v.m5022a(c3489yj.f14260v0);
        c0668v.m5038q();
    }

    /* renamed from: h */
    private void m4754h(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        C0615b0 c0615b0 = new C0615b0(this.f4133a, c3489yj, c0669v0);
        c0615b0.m4706a(this.f4111A);
        c3489yj.f14197a0 = c0615b0;
        c0615b0.m4168b(c3489yj);
        c0615b0.mo4595a(this.f4131U);
        c0615b0.m4170n();
        c0615b0.m4167a(c3489yj.f14260v0);
        c0615b0.m4169m();
    }

    /* renamed from: i */
    private void m4756i(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        C0624e0 c0624e0 = new C0624e0(this.f4133a, c3489yj, c0669v0);
        c0624e0.m4706a(this.f4111A);
        String str = !TextUtils.isEmpty(c3489yj.f14235n) ? c3489yj.f14235n : c3489yj.f14238o;
        c0624e0.m4287b(c3489yj);
        c0624e0.m4286b(str);
        c3489yj.f14197a0 = c0624e0;
        C0687b.m5342a(this.f4133a).m5343a().m5547b();
        c0624e0.m4288b(c3489yj.f14254t0);
        c0624e0.mo4201a(c0657p0);
        c0624e0.mo4595a(this.f4131U);
        c0624e0.m4295q();
        c0624e0.m4285a(c3489yj.f14260v0);
    }

    /* renamed from: j */
    static /* synthetic */ int m4757j(C0655o1 c0655o1) {
        int i2 = c0655o1.f4124N;
        c0655o1.f4124N = i2 + 1;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
    
        if (r3 != null) goto L53;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4758j(p000.C3489yj r8, com.comviva.webaxn.p002ui.C0657p0 r9, com.comviva.webaxn.p002ui.C0669v0 r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.m4758j(yj, com.comviva.webaxn.ui.p0, com.comviva.webaxn.ui.v0):void");
    }

    /* renamed from: k */
    private void m4760k(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        String str;
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(c3489yj.f14235n) ? c3489yj.f14238o : c3489yj.f14235n;
        String m200h = C0023aj.m160a(this.f4133a).m200h(c3489yj.f14186V);
        if (!TextUtils.isEmpty(c3489yj.f14176Q)) {
            m200h = C0023aj.m160a(this.f4133a).m200h(c3489yj.f14176Q);
        }
        if (m200h != null) {
            str2 = m200h;
        }
        C0633h0 c0633h0 = new C0633h0(this.f4133a, str2);
        c0633h0.m4706a(this.f4111A);
        c3489yj.f14197a0 = c0633h0;
        c0633h0.m4369b(c3489yj);
        c0633h0.m4371c(c3489yj.f14241p.m6067f());
        c0633h0.m4374g(c3489yj.f14241p.m6068g());
        c0633h0.m4362a(c3489yj.f14241p.m6064d());
        c0633h0.m4367b(c3489yj.f14241p.m6066e());
        if (true != c3489yj.f14199b || (c3489yj.f14220i == null && c3489yj.f14226k == null && ((str = c3489yj.f14232m) == null || (!str.equalsIgnoreCase("close") && !c3489yj.f14232m.equalsIgnoreCase("exit"))))) {
            z = false;
        }
        c0633h0.mo4365a(z);
        if (c3489yj.f14254t0 != null || c3489yj.f14170N != null) {
            c0633h0.m4437b(c3489yj.f14254t0);
        }
        c0633h0.m4373c(c3489yj);
        c0633h0.mo4201a(c0657p0);
        c0633h0.mo4595a(this.f4131U);
        c0633h0.mo4364a(c0669v0);
        c0633h0.mo4366a(c3489yj.f14260v0);
        c0633h0.m4439r();
    }

    /* renamed from: l */
    private void m4762l(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        C0675y0 c0675y0 = new C0675y0(this.f4133a, c3489yj, this.f4134b);
        c0675y0.m4706a(this.f4111A);
        c0675y0.m5167b(c3489yj);
        c3489yj.f14197a0 = c0675y0;
        c0675y0.mo4201a(c0657p0);
        c0675y0.mo4595a(this.f4131U);
        c0675y0.m5165a(c0669v0);
        c0675y0.m5166a(c3489yj.f14260v0);
        c0675y0.m5169n();
    }

    /* renamed from: m */
    private void m4764m(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        C0625e1 c0625e1 = new C0625e1(this.f4133a, c0669v0);
        c0625e1.m4706a(this.f4111A);
        c0625e1.mo4201a(c0657p0);
        c3489yj.f14197a0 = c0625e1;
        c0625e1.m4297b(c3489yj);
        c0625e1.mo4595a(this.f4131U);
        c0625e1.m4298m();
    }

    /* renamed from: n */
    private void m4765n(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        C0646l1 c0646l1 = new C0646l1(this.f4133a, c3489yj, c0669v0);
        c0646l1.m4706a(this.f4111A);
        c0646l1.m4678b(c3489yj);
        c3489yj.f14197a0 = c0646l1;
        c0646l1.m4677a(c3489yj.m16645k(this.f4138f.f4397c.width()), c3489yj.m16637c(this.f4138f.f4397c.height()));
        c0646l1.mo4201a(c0657p0);
        c0646l1.mo4595a(this.f4131U);
        c0646l1.m4680n();
    }

    /* renamed from: A */
    public void m4766A() {
        m4832z();
        this.f4157y.removeAllViews();
    }

    /* renamed from: B */
    public void m4767B() {
        m4825s().removeAllViews();
        m4825s().addView(this.f4154v);
    }

    /* renamed from: C */
    public void m4768C() {
        AbstractC0652n1 abstractC0652n1 = this.f4127Q;
        if (abstractC0652n1 != null) {
            if (abstractC0652n1 instanceof C0611a) {
                ((C0611a) abstractC0652n1).m4154n();
            } else if (abstractC0652n1 instanceof SurfaceHolderCallbackC0634h1) {
                ((SurfaceHolderCallbackC0634h1) abstractC0652n1).m4453n();
            }
            this.f4127Q = null;
        }
    }

    /* renamed from: D */
    public void m4769D() {
        C0728o1 c0728o1 = this.f4126P;
        if (c0728o1 != null) {
            c0728o1.m5934a();
            this.f4126P = null;
        }
    }

    /* renamed from: E */
    public void m4770E() {
        HashMap<String, ArrayList<String>> hashMap = this.f4117G;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: F */
    public void m4771F() {
        C0024ak m16929a = this.f4134b.m16929a("statuscolor");
        if (m16929a != null) {
            String m213b = m16929a.m213b();
            if (TextUtils.isEmpty(m213b)) {
                return;
            }
            ((WebAxnActivity) this.f4133a).m4077a(m213b);
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public void m4772a() {
        if (Build.VERSION.SDK_INT < 14 || ViewConfiguration.get(this.f4133a).hasPermanentMenuKey()) {
            m4794a(((WebAxnActivity) this.f4133a).m4076a());
            return;
        }
        ActionBar actionBar = ((Activity) this.f4133a).getActionBar();
        if (actionBar != null) {
            if (m4794a(((WebAxnActivity) this.f4133a).m4076a())) {
                actionBar.show();
            } else {
                actionBar.hide();
            }
        }
    }

    /* renamed from: a */
    public void m4773a(float f2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, f2, 0.0f, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new k());
        this.f4155w.startAnimation(translateAnimation);
    }

    /* renamed from: a */
    public void m4774a(int i2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, i2, 0.0f, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new l());
        this.f4155w.startAnimation(translateAnimation);
    }

    /* renamed from: a */
    public void m4775a(int i2, int i3) {
        int m4830x = m4830x();
        int m5552d = C0687b.m5342a(this.f4133a).m5343a().m5552d();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3, m4830x);
        layoutParams.setMargins(this.f4134b.m16943d(m5552d), this.f4134b.m16948h(m5552d), this.f4134b.m16946f(m5552d), this.f4134b.m16928a(m5552d));
        m4824r().setLayoutParams(layoutParams);
        m4824r().setPadding(this.f4134b.m16945e(m5552d), this.f4134b.m16949i(m5552d), this.f4134b.m16947g(m5552d), this.f4134b.m16936b(m5552d));
        this.f4158z.setBackgroundColor(0);
        this.f4158z.setGravity(m4830x);
        this.f4156x.setGravity(m4830x);
        this.f4154v.setBackgroundColor(-1073741824);
    }

    /* renamed from: a */
    public void m4776a(MenuItem menuItem) {
        C0755x1.m6151a(this.f4133a, (C3489yj) null, this.f4157y.getWindowToken());
        m4797a(menuItem.getTitle().toString(), (C2945mj) null, (C2899lj) null);
    }

    /* renamed from: a */
    public void m4777a(View view, C3489yj c3489yj) {
        AbstractC0652n1 abstractC0652n1;
        if (c3489yj != null && (abstractC0652n1 = c3489yj.f14197a0) != null && abstractC0652n1.mo4150h() != null) {
            if (c3489yj.f14211f) {
                c3489yj.f14211f = false;
            }
            if (c3489yj.f14197a0.mo4150h().getVisibility() != 0) {
                return;
            } else {
                view = c3489yj.f14197a0.mo4150h();
            }
        } else if (view == null || view.getVisibility() != 0) {
            return;
        }
        view.setVisibility(8);
    }

    /* renamed from: a */
    public void m4778a(NestedScrollView nestedScrollView) {
        this.f4146n = nestedScrollView;
    }

    /* renamed from: a */
    public void m4779a(C0614b c0614b) {
        this.f4153u = c0614b;
    }

    /* renamed from: a */
    public void m4780a(C0728o1 c0728o1) {
        this.f4126P = c0728o1;
    }

    /* renamed from: a */
    public void m4781a(String str, String str2, String str3, C2945mj c2945mj) {
        String str4;
        C2899lj c2899lj = this.f4136d;
        if (c2899lj == null || c2899lj.m13901f() == null) {
            return;
        }
        C3531zj m13901f = c2899lj.m13901f();
        String str5 = null;
        C3489yj m16930a = m13901f.m16930a(str, (Vector<C3489yj>) null);
        if (m16930a == null || m16930a.f14208e != 3) {
            HashMap<String, String> hashMap = m13901f.f14519r;
            if (hashMap != null) {
                str4 = hashMap.get(str);
            }
            str4 = null;
        } else {
            AbstractC0652n1 abstractC0652n1 = m16930a.f14197a0;
            if (abstractC0652n1 instanceof C0668v) {
                str4 = ((C0668v) abstractC0652n1).m5034m();
            } else {
                if (abstractC0652n1 instanceof C0670w) {
                    str4 = ((C0670w) abstractC0652n1).m5097m();
                }
                str4 = null;
            }
        }
        C3489yj m16930a2 = m13901f.m16930a(str2, (Vector<C3489yj>) null);
        if (m16930a2 == null || m16930a2.f14208e != 3) {
            HashMap<String, String> hashMap2 = m13901f.f14519r;
            if (hashMap2 != null) {
                str5 = hashMap2.get(str2);
            }
        } else {
            AbstractC0652n1 abstractC0652n12 = m16930a2.f14197a0;
            if (abstractC0652n12 instanceof C0668v) {
                str5 = ((C0668v) abstractC0652n12).m5034m();
            } else if (abstractC0652n12 instanceof C0670w) {
                str5 = ((C0670w) abstractC0652n12).m5097m();
            }
        }
        C0755x1.m6146a(this.f4133a, str4 == null ? str : str4, str5 == null ? str2 : str5, str3, C3530zi.f14466i, c2945mj, this.f4136d, false);
    }

    /* renamed from: a */
    public void m4782a(String str, C3489yj c3489yj) {
        if (TextUtils.isEmpty(str) || this.f4135c.m16298a(str, false, c3489yj, null, m4812f(), this.f4136d)) {
            return;
        }
        this.f4135c.m16287a(m4812f(), this.f4136d);
        this.f4135c.m16317c(m4812f(), this.f4136d);
        C3531zj m13901f = this.f4136d.m13901f();
        if (m13901f != null) {
            for (int i2 = 0; i2 < m13901f.f14506e.size(); i2++) {
                this.f4135c.m16291a(m13901f.f14506e.elementAt(i2));
            }
        }
        if (this.f4135c.m16263a(str, false, false, m4812f(), false, false, null, this.f4136d) > 0) {
            this.f4135c.m16258E();
        }
    }

    /* renamed from: a */
    public void m4783a(C2899lj c2899lj, Context context, boolean z) {
        C0624e0 c0624e0;
        AbstractC0652n1 abstractC0652n1;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i2 = 0;
        c2899lj.f11891k = false;
        this.f4119I = m4823q();
        this.f4120J = 0;
        ArrayList<C3489yj> arrayList = this.f4122L;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f4122L = new ArrayList<>();
        } else {
            this.f4122L.clear();
        }
        C3531zj m13901f = c2899lj.m13901f();
        int m5552d = C0687b.m5342a(this.f4133a).m5343a().m5552d();
        int m5553e = C0687b.m5342a(this.f4133a).m5343a().m5553e();
        int m16950j = m13901f.m16950j(m5552d);
        int m16940c = m13901f.m16940c(m5553e);
        if (m13901f.f14514m.equalsIgnoreCase("popup")) {
            m4775a(m16950j, m16940c);
        } else {
            this.f4157y.getLayoutParams().height = -1;
            this.f4157y.getLayoutParams().width = -1;
            ((FrameLayout.LayoutParams) m4824r().getLayoutParams()).setMargins(this.f4134b.m16943d(m5552d), this.f4134b.m16948h(m5552d), this.f4134b.m16946f(m5552d), this.f4134b.m16928a(m5552d));
            m4824r().setPadding(this.f4134b.m16945e(m5552d), this.f4134b.m16949i(m5552d), this.f4134b.m16947g(m5552d), this.f4134b.m16936b(m5552d));
        }
        if (m16950j < 0) {
            m16950j = m5552d - (m13901f.m16943d(m5552d) + m13901f.m16946f(m5552d));
        }
        int i3 = m16950j;
        if (m16940c < 0) {
            m16940c = m5553e - (m13901f.m16948h(m5552d) + m13901f.m16928a(m5552d));
        }
        int i4 = m16940c;
        this.f4114D = i4 - (m13901f.m16949i(m5552d) + m13901f.m16936b(m5552d));
        C0669v0 c0669v0 = new C0669v0();
        Rect rect = new Rect(0, 0, i3 - (m13901f.m16945e(i3) + m13901f.m16947g(i3)), this.f4114D);
        c0669v0.f4397c = rect;
        c0669v0.f4395a = rect.left;
        c0669v0.f4396b = rect.top;
        if (c2899lj.m13894c() != null && (linearLayout2 = this.f4143k) != null) {
            linearLayout2.setVisibility(0);
            if (c2899lj.m13894c().f14197a0 == null || !((c2899lj.m13894c().f14197a0 instanceof C0642k0) || (c2899lj.m13894c().f14197a0 instanceof C0645l0))) {
                m4791a(c2899lj.m13894c(), this.f4143k, (C0639j0) null, this.f4138f);
                if (c2899lj.m13894c().f14197a0 != null && c2899lj.m13894c().f14197a0.mo4150h() != null) {
                    if (c2899lj.m13894c().f14211f) {
                        c2899lj.m13894c().f14197a0.mo4150h().setVisibility(0);
                    } else {
                        c2899lj.m13894c().f14197a0.mo4150h().setVisibility(8);
                    }
                }
            } else {
                c2899lj.m13894c().f14197a0.mo4174a((C0639j0) null, c0669v0);
            }
        }
        if (c2899lj.m13888b() != null && (linearLayout = this.f4142j) != null) {
            linearLayout.setVisibility(0);
            if (c2899lj.m13888b().f14197a0 == null || !((c2899lj.m13888b().f14197a0 instanceof C0642k0) || (c2899lj.m13888b().f14197a0 instanceof C0645l0))) {
                m4791a(c2899lj.m13888b(), this.f4142j, (C0639j0) null, this.f4138f);
                if (c2899lj.m13888b().f14197a0 != null && c2899lj.m13888b().f14197a0.mo4150h() != null) {
                    if (c2899lj.m13888b().f14211f) {
                        c2899lj.m13888b().f14197a0.mo4150h().setVisibility(0);
                    } else {
                        c2899lj.m13888b().f14197a0.mo4150h().setVisibility(8);
                    }
                }
            } else {
                c2899lj.m13888b().f14197a0.mo4174a((C0639j0) null, c0669v0);
            }
        }
        if (c2899lj.m13877a() != null && c2899lj.m13877a().size() > 0) {
            if (this.f4128R == null) {
                this.f4128R = new ArrayList<>();
            }
            for (int i5 = 0; i5 < c2899lj.m13877a().size(); i5++) {
                if (c2899lj.m13877a().get(i5).f14197a0 == null || !((c2899lj.m13877a().get(i5).f14197a0 instanceof C0642k0) || (c2899lj.m13877a().get(i5).f14197a0 instanceof C0645l0))) {
                    m4739b(c2899lj.m13877a().get(i5), this.f4138f);
                    if (c2899lj.m13877a().get(i5).f14197a0 != null && c2899lj.m13877a().get(i5).f14197a0.mo4150h() != null) {
                        if (c2899lj.m13877a().get(i5).f14211f) {
                            c2899lj.m13877a().get(i5).f14197a0.mo4150h().setVisibility(0);
                        } else {
                            c2899lj.m13877a().get(i5).f14197a0.mo4150h().setVisibility(8);
                        }
                    }
                } else {
                    c0669v0.f4408n = true;
                    c2899lj.m13877a().get(i5).f14197a0.mo4174a((C0639j0) null, c0669v0);
                }
            }
        }
        C3531zj c3531zj = this.f4134b;
        if (c3531zj != null && !c3531zj.f14514m.equalsIgnoreCase("popup") && this.f4134b.f14521t && this.f4137e.m14113a() != null) {
            m4787a(this.f4137e, true, this.f4138f.f4397c.width(), this.f4138f.f4397c.height(), true);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4149q.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4143k.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4144l.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4114D -= (this.f4149q.getMeasuredHeight() + this.f4143k.getMeasuredHeight()) + this.f4144l.getMeasuredHeight();
        int m16945e = i3 - (m13901f.m16945e(i3) + m13901f.m16947g(i3));
        int i6 = this.f4114D;
        Rect rect2 = new Rect(0, 0, m16945e, i6 - (m13901f.m16949i(i6) + m13901f.m16936b(this.f4114D)));
        c0669v0.f4397c = rect2;
        c0669v0.f4395a = rect2.left;
        c0669v0.f4396b = rect2.top;
        if (m13901f != null && !m13901f.f14514m.equalsIgnoreCase("confirm") && !m13901f.f14514m.equalsIgnoreCase("error") && !m13901f.f14514m.equalsIgnoreCase("info") && !m13901f.f14514m.equalsIgnoreCase("toast") && m13901f.f14506e != null) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < m13901f.f14506e.size()) {
                C3489yj elementAt = m13901f.f14506e.elementAt(i7);
                int i9 = elementAt.f14208e;
                if (i9 != 17 && i9 != 31 && i9 != 8 && i9 != 42) {
                    if (i9 == 23 || elementAt.f14197a0 != null) {
                        if (elementAt.f14208e != 23) {
                            i8++;
                        }
                        if (!elementAt.f14211f && (abstractC0652n1 = elementAt.f14197a0) != null) {
                            abstractC0652n1.mo4150h().setVisibility(8);
                        } else if (elementAt.f14268z0 != null) {
                            AbstractC0652n1 abstractC0652n12 = elementAt.f14197a0;
                            if (abstractC0652n12 != null) {
                                if (!(abstractC0652n12 instanceof C0642k0) && !(abstractC0652n12 instanceof C0645l0)) {
                                }
                                elementAt.f14197a0.mo4174a((C0639j0) null, c0669v0);
                            }
                        } else {
                            int i10 = elementAt.f14208e;
                            if (i10 != 1 && i10 != 13 && i10 != 26 && i10 != 10 && i10 != 11 && i10 != 3 && i10 != 22 && i10 != 27 && i10 != 2 && i10 != 4 && i10 != 30 && i10 != 6) {
                                if (m13901f.f14514m != "grid" && ((i10 == 13 || i10 == 26) && (c0624e0 = (C0624e0) elementAt.f14197a0) != null)) {
                                    c0624e0.m4282a(elementAt.m16645k(i3), elementAt.m16637c(i4));
                                }
                            }
                            elementAt.f14197a0.mo4174a((C0639j0) null, c0669v0);
                        }
                    } else {
                        m4791a(elementAt, (ViewGroup) null, (C0639j0) null, this.f4138f);
                        AbstractC0652n1 abstractC0652n13 = elementAt.f14197a0;
                        if (abstractC0652n13 != null && abstractC0652n13.mo4150h() != null) {
                            this.f4111A.removeView(elementAt.f14197a0.mo4150h());
                            this.f4111A.addView(elementAt.f14197a0.mo4150h(), i8);
                            boolean z2 = elementAt.f14211f;
                            View mo4150h = elementAt.f14197a0.mo4150h();
                            if (z2) {
                                mo4150h.setVisibility(i2);
                            } else {
                                mo4150h.setVisibility(8);
                            }
                        }
                        i8++;
                    }
                }
                i7++;
                i2 = 0;
            }
        }
        m4831y();
    }

    /* renamed from: a */
    public void m4784a(C2945mj c2945mj) {
        this.f4137e = c2945mj;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4785a(p000.C2945mj r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.m4785a(mj, java.lang.String):void");
    }

    /* renamed from: a */
    public void m4786a(C2945mj c2945mj, C2899lj c2899lj, boolean z, boolean z2, boolean z3, boolean z4) {
        int m5616U;
        C0696e c0696e;
        this.f4115E.clear();
        this.f4137e = c2945mj;
        this.f4136d = c2899lj;
        if (c2945mj == null && c2899lj == null) {
            return;
        }
        if (z && m4813g() != null) {
            this.f4112B = m4813g().getScrollX();
            this.f4113C = m4813g().getScrollY();
        }
        this.f4134b = this.f4136d.m13901f();
        this.f4119I = m4823q();
        this.f4120J = 0;
        m4766A();
        m4771F();
        C3531zj c3531zj = this.f4134b;
        if (c3531zj != null && !TextUtils.isEmpty(c3531zj.f14509h)) {
            this.f4137e.m14127b(this.f4134b.f14509h);
        }
        this.f4137e.m14156t();
        C3531zj c3531zj2 = this.f4134b;
        if (c3531zj2 != null && c3531zj2.m16935a() != null) {
            C3531zj c3531zj3 = this.f4134b;
            if (m4798a(c3531zj3, c3531zj3.m16935a())) {
                this.f4134b.f14517p = true;
            }
        } else if (this.f4135c.m16326e() != null || this.f4135c.m16339p() != null) {
            m4798a(this.f4134b, this.f4135c.m16326e());
        } else if (!m4798a(this.f4134b, (byte[]) null)) {
            C3531zj c3531zj4 = this.f4134b;
            if (c3531zj4 != null && (c0696e = c3531zj4.f14511j) != null) {
                m5616U = c0696e.f4728t;
            } else if (this.f4136d.m13906k()) {
                c3531zj4 = this.f4134b;
                m5616U = this.f4136d.m13903h();
            } else if (C0713j1.m5563a(this.f4133a).m5671h() != null && C0713j1.m5563a(this.f4133a).m5671h().equals("true")) {
                c3531zj4 = this.f4134b;
                m5616U = C0713j1.m5563a(this.f4133a).m5616U();
            }
            m4793a(c3531zj4, m5616U);
        }
        m4785a(this.f4137e, true == this.f4137e.m14156t() ? this.f4137e.m14153q() : null);
        m4772a();
        m4740b(z);
        m4742c(this.f4136d, this.f4133a, false);
        C3531zj c3531zj5 = this.f4134b;
        if (c3531zj5 != null && c3531zj5.f14504c != null && !z) {
            if ((this.f4133a.getPackageName().equals("com.comviva.ecosubs") || this.f4133a.getPackageName().equals("com.comviva.ecosubsuat") || this.f4133a.getPackageName().equals("com.comviva.preecoprod") || this.f4133a.getPackageName().equals("com.comviva.econetprod")) && C0713j1.m5563a(this.f4133a).m5725s0() == null) {
                this.f4135c.m16262a((String) null, false, true);
            } else {
                this.f4134b.f14504c.m4607a(this.f4131U);
                this.f4134b.f14504c.m4608a(z2, true, this);
            }
        }
        if (this.f4134b.f14499P != null) {
            m4827u();
        }
        if (z3) {
            m4799a(false);
        }
        if (!z || m4813g() == null) {
            this.f4112B = 0;
            this.f4113C = 0;
        } else {
            m4813g().post(new b());
        }
        try {
            String m213b = this.f4134b.m16929a("clearsession") != null ? this.f4134b.m16929a("clearsession").m213b() : null;
            if (!TextUtils.isEmpty(m213b) && m213b.equals("1")) {
                C0713j1.m5563a(this.f4133a).m5746y(0);
            }
        } catch (Exception unused) {
        }
        if (z || TextUtils.isEmpty(this.f4134b.f14493J)) {
            return;
        }
        C0731p1.m5954a(this.f4133a, this.f4134b.f14493J, this, (C3489yj) null);
    }

    /* renamed from: a */
    public void m4787a(C2945mj c2945mj, boolean z, int i2, int i3, boolean z2) {
        TextView textView;
        Bitmap bitmap;
        if (c2945mj.m14113a().m3688b() == 0 && c2945mj.m14113a().m3692e() != null) {
            try {
                bitmap = C0698e1.m5426b(this.f4133a).m5429a(c2945mj.m14113a().m3693f());
                if (bitmap == null) {
                    try {
                        bitmap = BitmapFactory.decodeByteArray(c2945mj.m14113a().m3692e(), 0, c2945mj.m14113a().m3692e().length);
                        if (bitmap != null) {
                            C0698e1.m5426b(this.f4133a).m5432a(c2945mj.m14113a().m3693f(), bitmap);
                        }
                    } catch (OutOfMemoryError unused) {
                    }
                }
            } catch (OutOfMemoryError unused2) {
                bitmap = null;
            }
            if (bitmap != null) {
                this.f4140h.setImageBitmap(bitmap);
                this.f4140h.setVisibility(0);
                double height = bitmap.getHeight();
                double width = bitmap.getWidth();
                Double.isNaN(height);
                Double.isNaN(width);
                this.f4141i = height / width;
                float m5544a = C0687b.m5342a(this.f4133a).m5343a().m5544a();
                int m6115a = C0755x1.m6115a(c2945mj.m14113a().m3690c(), i3, m5544a);
                int m6115a2 = C0755x1.m6115a(c2945mj.m14113a().m3691d(), i2, m5544a);
                if (m6115a2 > 0) {
                    if (m6115a <= 0) {
                        double d2 = m6115a2;
                        double d3 = this.f4141i;
                        Double.isNaN(d2);
                        m6115a = (int) Math.round(d2 * d3);
                    }
                    i2 = m6115a2;
                } else if (m6115a > 0) {
                    double d4 = m6115a;
                    double d5 = this.f4141i;
                    Double.isNaN(d4);
                    i2 = (int) Math.round(d4 / d5);
                } else {
                    double d6 = i2;
                    double d7 = this.f4141i;
                    Double.isNaN(d6);
                    m6115a = (int) Math.round(d6 * d7);
                }
                this.f4140h.getLayoutParams().height = m6115a;
                this.f4140h.getLayoutParams().width = i2;
                this.f4140h.setScaleType(ImageView.ScaleType.FIT_XY);
                LinearLayout linearLayout = this.f4145m;
                if (linearLayout != null) {
                    linearLayout.getLayoutParams().height = m6115a;
                    this.f4140h.getLayoutParams().height = m6115a;
                    this.f4140h.getLayoutParams().width = i2;
                    this.f4145m.setVisibility(0);
                }
                int m5616U = C0713j1.m5563a(this.f4133a).m5616U();
                C0696e c0696e = this.f4134b.f14511j;
                if (c0696e != null) {
                    m5616U = c0696e.f4728t;
                }
                C2434ej c2434ej = this.f4134b.f14498O;
                if (c2434ej != null) {
                    Drawable m6122a = C0755x1.m6122a(c2434ej, m5616U);
                    this.f4147o = m6122a;
                    this.f4145m.setBackgroundDrawable(m6122a);
                } else {
                    this.f4145m.setBackgroundColor(AbstractC0652n1.m4701d(m5616U));
                }
                LinearLayout linearLayout2 = this.f4144l;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
            }
            TextView textView2 = this.f4139g;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else if (!z2 && c2945mj.m14113a().m3688b() == 1 && this.f4145m != null && c2945mj.m14113a().m3682a() != null) {
            TapsellSDKAdv tapsellSDKAdv = new TapsellSDKAdv();
            this.f4129S = tapsellSDKAdv;
            tapsellSDKAdv.m5306a(this.f4133a, c2945mj.m14113a().m3682a().m3399a(), c2945mj.m14113a().m3682a().m3402b());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.bottomMargin = (int) (C0687b.m5342a(this.f4133a).m5343a().m5544a() * 2.0f);
            this.f4145m.addView(this.f4129S.m5305a(), layoutParams);
            this.f4145m.setVisibility(0);
            LinearLayout linearLayout3 = this.f4144l;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
        }
        if (this.f4137e.m14149m() != null && (textView = this.f4139g) != null) {
            textView.setSelected(true);
            this.f4139g.setSingleLine(true);
            this.f4139g.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.f4139g.setMarqueeRepeatLimit(-1);
            this.f4139g.setText(this.f4137e.m14149m());
            this.f4139g.setTextColor(this.f4137e.m14150n());
            this.f4139g.setBackgroundColor(this.f4137e.m14148l());
            this.f4139g.setTextSize(this.f4137e.m14152p());
            if (Build.VERSION.SDK_INT >= 21) {
                this.f4139g.setLetterSpacing(this.f4137e.m14151o());
            }
            LinearLayout linearLayout4 = this.f4145m;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            this.f4139g.setVisibility(0);
            LinearLayout linearLayout5 = this.f4144l;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(0);
            }
        }
        if (z) {
            LinearLayout linearLayout6 = this.f4145m;
            if (linearLayout6 != null && linearLayout6.getVisibility() == 0) {
                this.f4145m.setOnClickListener(new q(c2945mj));
                this.f4115E.put(this.f4145m, null);
            }
            TextView textView3 = this.f4139g;
            if (textView3 == null || textView3.getVisibility() != 0) {
                return;
            }
            this.f4139g.setOnClickListener(new q(c2945mj));
            this.f4115E.put(this.f4139g, null);
        }
    }

    /* renamed from: a */
    public void m4788a(C3087pj c3087pj, C3400wj c3400wj, C2945mj c2945mj) {
        boolean z;
        String m14775a = c3087pj.m14775a();
        String m14785e = c3087pj.m14785e();
        String m14787f = c3087pj.m14787f();
        String m14781c = c3087pj.m14781c();
        c3087pj.m14791h();
        String str = null;
        if (!TextUtils.isEmpty(c3087pj.m14779b())) {
            C0731p1.m5954a(this.f4133a, c3087pj.m14779b(), c3400wj.m16343t(), (C3489yj) null);
        }
        if (!TextUtils.isEmpty(m14787f)) {
            c3400wj.m16279a(m14787f, c3087pj.m14789g());
            z = c3400wj.m16296a(m14787f, c2945mj, this.f4136d);
            if (!z) {
                Context context = this.f4133a;
                if (context instanceof WebAxnActivity) {
                    try {
                        InputStream open = ((WebAxnActivity) context).getAssets().open(m14787f + ".wbxml");
                        byte[] bArr = new byte[open.available()];
                        open.read(bArr);
                        open.close();
                        c3400wj.m16295a(bArr, null, C3400wj.h.WBXML_BUFFER, null, true, false, true);
                        z = true;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if (z) {
                if (m14781c != null) {
                    c3400wj.m16305b(m14781c, c2945mj, this.f4136d);
                    return;
                }
                return;
            }
        } else if (TextUtils.isEmpty(m14785e)) {
            z = false;
        } else {
            c3400wj.m16279a(m14785e, c3087pj.m14789g());
            z = c3400wj.m16296a(m14785e, c2945mj, this.f4136d);
            if (z) {
                if (m14781c != null) {
                    c3400wj.m16305b(m14781c, c2945mj, this.f4136d);
                    return;
                }
                return;
            } else if (!TextUtils.isEmpty(m14775a) && !m14775a.equals("Menulist:")) {
                str = m14775a;
            }
        }
        if (!z && TextUtils.isEmpty(str) && !TextUtils.isEmpty(m14775a)) {
            str = m14775a;
        }
        if (!TextUtils.isEmpty(str)) {
            if (!c3400wj.m16298a(str, false, null, null, c2945mj, this.f4136d)) {
                c3400wj.m16287a(c2945mj, this.f4136d);
                c3400wj.m16317c(c2945mj, this.f4136d);
                C3531zj m13901f = this.f4136d.m13901f();
                if (m13901f != null) {
                    for (int i2 = 0; i2 < m13901f.f14506e.size(); i2++) {
                        c3400wj.m16291a(m13901f.f14506e.elementAt(i2));
                    }
                }
                c3400wj.m16279a(str, c3087pj.m14789g());
                if (c3400wj.m16263a(str, false, false, c2945mj, false, false, null, this.f4136d) > 0) {
                    c3400wj.m16258E();
                }
            }
        }
        if (m14781c != null) {
            c3400wj.m16305b(m14781c, c2945mj, this.f4136d);
        }
    }

    /* renamed from: a */
    public void m4789a(C3400wj.i iVar) {
        this.f4130T = iVar;
    }

    /* renamed from: a */
    public void m4790a(C3489yj c3489yj) {
        this.f4122L.add(c3489yj);
    }

    /* renamed from: a */
    public void m4791a(C3489yj c3489yj, ViewGroup viewGroup, C0639j0 c0639j0, C0669v0 c0669v0) {
        HashMap<View, C3489yj> hashMap;
        View mo4150h;
        int i2;
        int i3;
        if (viewGroup == null) {
            viewGroup = this.f4111A;
        }
        try {
            if (c3489yj.f14197a0 != null) {
                c3489yj.f14197a0.mo4142b();
                c3489yj.f14197a0 = null;
            }
            if (c3489yj.f14200b0 != null) {
                c3489yj.f14200b0.clear();
            }
        } catch (Exception unused) {
        }
        if (c3489yj.f14268z0 == null && (i3 = c3489yj.f14208e) != 33 && i3 != 36) {
            m4792a(c3489yj, new C0657p0(c3489yj.m16639e(c0669v0.f4397c.width()), c3489yj.m16644j(c0669v0.f4397c.width()), c3489yj.m16642h(c0669v0.f4397c.width()), c3489yj.m16635b(c0669v0.f4397c.width()), 1.0f), c0669v0);
            return;
        }
        int i4 = c3489yj.f14221i0;
        if (i4 == 2 || i4 == 3) {
            C0645l0 c0645l0 = new C0645l0(this.f4133a, c3489yj, this, c0639j0, c0669v0);
            c0645l0.m4706a(viewGroup);
            c3489yj.f14197a0 = c0645l0;
            c0645l0.mo4595a(this.f4131U);
            c0645l0.m4665n();
            c0645l0.m4664m();
            int i5 = c3489yj.f14208e;
            if (i5 != 8 && i5 != 31) {
                return;
            }
            hashMap = this.f4115E;
            mo4150h = c0645l0.mo4150h();
        } else {
            if (i4 != 0 && i4 != 1 && i4 != 4 && (i2 = c3489yj.f14208e) != 33 && i2 != 39 && i2 != 40 && i2 != 42) {
                return;
            }
            C0642k0 c0642k0 = new C0642k0(this.f4133a, c3489yj, this, c0639j0, c0669v0, viewGroup);
            c0642k0.m4706a(viewGroup);
            c3489yj.f14197a0 = c0642k0;
            c0642k0.mo4595a(this.f4131U);
            c0642k0.m4600o();
            c0642k0.m4599n();
            int i6 = c3489yj.f14208e;
            if (i6 != 8 && i6 != 31) {
                return;
            }
            hashMap = this.f4115E;
            mo4150h = c0642k0.mo4150h();
        }
        hashMap.put(mo4150h, c3489yj);
    }

    /* renamed from: a */
    public void m4792a(C3489yj c3489yj, C0657p0 c0657p0, C0669v0 c0669v0) {
        int i2 = c3489yj.f14208e;
        if (i2 == 22 || i2 == 27) {
            m4758j(c3489yj, c0657p0, c0669v0);
            return;
        }
        if (i2 == 2) {
            m4760k(c3489yj, c0657p0, c0669v0);
            return;
        }
        if (i2 == 13 || i2 == 26) {
            m4756i(c3489yj, c0657p0, c0669v0);
            return;
        }
        if (i2 == 4) {
            m4746d(c3489yj, c0657p0, c0669v0);
            return;
        }
        if (i2 == 3) {
            m4752g(c3489yj, c0657p0, c0669v0);
            return;
        }
        if (i2 == 1) {
            m4738b(c3489yj, c0657p0, c0669v0);
            return;
        }
        if (i2 == 14) {
            m4764m(c3489yj, c0657p0, c0669v0);
            return;
        }
        if (i2 == 24) {
            m4754h(c3489yj, c0657p0, c0669v0);
            return;
        }
        if (i2 == 23) {
            m4734a(c3489yj, c0669v0);
            return;
        }
        if (i2 == 6) {
            m4748e(c3489yj, c0657p0, c0669v0);
            return;
        }
        if (i2 == 10 || i2 == 11) {
            m4743c(c3489yj, c0657p0, c0669v0);
            return;
        }
        if (i2 == 9) {
            m4750f(c3489yj, c0657p0, c0669v0);
        } else if (i2 == 30) {
            m4765n(c3489yj, c0657p0, c0669v0);
        } else if (i2 == 34) {
            m4762l(c3489yj, c0657p0, c0669v0);
        }
    }

    /* renamed from: a */
    public void m4793a(C3531zj c3531zj, int i2) {
        RelativeLayout relativeLayout = this.f4156x;
        C2434ej c2434ej = c3531zj.f14498O;
        if (c2434ej == null) {
            relativeLayout.setBackgroundColor(AbstractC0652n1.m4701d(i2));
            return;
        }
        Drawable m6122a = C0755x1.m6122a(c2434ej, i2);
        this.f4147o = m6122a;
        relativeLayout.setBackgroundDrawable(m6122a);
    }

    /* renamed from: a */
    public boolean m4794a(Menu menu) {
        if (menu == null) {
            return false;
        }
        menu.clear();
        C2899lj c2899lj = this.f4136d;
        if (c2899lj == null || c2899lj.m13898d() == null) {
            return false;
        }
        int size = this.f4136d.m13898d().size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0696e c0696e = this.f4136d.m13898d().get(i2);
            if (c0696e.f4716h != null || !c0696e.f4715g.equalsIgnoreCase("ok")) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c0696e.f4714f);
                spannableStringBuilder.setSpan(C0747v.m6081a(C0713j1.m5563a(this.f4133a).m5745y()), 0, c0696e.f4714f.length(), 0);
                menu.add(spannableStringBuilder).setTitleCondensed(c0696e.f4714f);
                if (c0696e.f4725q == 0 && size > 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean m4795a(String str, String str2) {
        ArrayList<String> arrayList;
        if (str != null && str2 != null && this.f4117G.containsKey(str) && (arrayList = this.f4117G.get(str)) != null) {
            if (arrayList.contains(str2)) {
                arrayList.remove(str2);
            }
            if (arrayList.size() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m4796a(java.lang.String r21, java.util.Vector<com.comviva.webaxn.utils.C0696e> r22, p000.C2945mj r23) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.m4796a(java.lang.String, java.util.Vector, mj):boolean");
    }

    /* renamed from: a */
    public boolean m4797a(String str, C2945mj c2945mj, C2899lj c2899lj) {
        if (c2945mj == null) {
            c2945mj = this.f4137e;
        }
        if (c2899lj == null) {
            c2899lj = this.f4136d;
        }
        if (c2899lj == null || c2899lj.m13898d() == null) {
            return false;
        }
        return m4796a(str, c2899lj.m13898d(), c2945mj);
    }

    /* renamed from: a */
    public boolean m4798a(C3531zj c3531zj, byte[] bArr) {
        RelativeLayout relativeLayout = this.f4156x;
        int m5552d = C0687b.m5342a(this.f4133a).m5343a().m5552d();
        int m5553e = C0687b.m5342a(this.f4133a).m5343a().m5553e();
        C3531zj c3531zj2 = this.f4134b;
        int identifier = (c3531zj2 == null || TextUtils.isEmpty(c3531zj2.f14510i)) ? 0 : this.f4133a.getResources().getIdentifier(this.f4134b.f14510i, "drawable", this.f4133a.getPackageName());
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4133a).m5429a(this.f4134b.f14510i);
                if (m5429a == null && (m5429a = AsyncTaskC0693d.m5404a(this.f4133a.getResources(), m5552d, m5553e, true, identifier, null)) != null) {
                    C0698e1.m5426b(this.f4133a).m5432a(this.f4134b.f14510i, m5429a);
                }
                relativeLayout.setBackgroundDrawable(NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a));
            } else {
                if (bArr == null) {
                    relativeLayout.setBackgroundDrawable(null);
                    return false;
                }
                String str = this.f4134b.f14515n;
                if (TextUtils.isEmpty(str)) {
                    str = this.f4135c.m16327f();
                }
                String str2 = str;
                Bitmap m5429a2 = C0698e1.m5426b(this.f4133a).m5429a(str2);
                if (m5429a2 == null && (m5429a2 = AsyncTaskC0693d.m5404a(this.f4133a.getResources(), m5552d, m5553e, false, -1, bArr)) != null) {
                    C0698e1.m5426b(this.f4133a).m5432a(str2, m5429a2);
                }
                relativeLayout.setBackgroundDrawable(NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2));
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r25.f4157y.startAnimation(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        if (r25.f4134b.f14514m.equalsIgnoreCase("popup") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        if (r25.f4134b.f14514m.equalsIgnoreCase("popup") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        r25.f4154v.startAnimation(r1);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m4799a(boolean r26) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.m4799a(boolean):boolean");
    }

    /* renamed from: b */
    public long m4800b(int i2) {
        SparseArray<Long> sparseArray = this.f4123M;
        if (sparseArray == null || sparseArray.get(i2) == null) {
            return -1L;
        }
        return this.f4123M.get(i2).longValue();
    }

    /* renamed from: b */
    public void m4801b() {
        LinearLayout linearLayout = new LinearLayout(this.f4133a);
        this.f4111A = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        if (!this.f4134b.m16939b()) {
            m4778a(new NestedScrollView(this.f4133a));
            m4813g().setVerticalScrollBarEnabled(false);
            m4813g().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            m4813g().setFillViewport(true);
            m4813g().addView(this.f4111A, layoutParams);
        }
        HashMap<String, C2555hj> hashMap = this.f4134b.f14499P;
        if (hashMap == null || hashMap.get("pulltorefresh") == null) {
            if (m4813g() != null) {
                this.f4157y.addView(m4813g());
                return;
            } else {
                this.f4157y.addView(this.f4111A, layoutParams);
                return;
            }
        }
        C0661r0 c0661r0 = new C0661r0(this.f4133a);
        this.f4157y.addView(c0661r0, new ViewGroup.LayoutParams(-1, -1));
        c0661r0.setRenderingEventCb(this.f4131U);
        c0661r0.setPullToRefreshAction(this.f4134b.f14499P.get("pulltorefresh").m12225b());
        c0661r0.setAPM(this.f4134b.f14499P.get("pulltorefresh").m12223a());
        if (m4813g() == null) {
            c0661r0.addView(this.f4111A, layoutParams);
        } else {
            c0661r0.setScrollView(m4813g());
            c0661r0.addView(m4813g());
        }
    }

    /* renamed from: b */
    public void m4802b(View view, C3489yj c3489yj) {
        AbstractC0652n1 abstractC0652n1;
        if (c3489yj != null && (abstractC0652n1 = c3489yj.f14197a0) != null && abstractC0652n1.mo4150h() != null) {
            if (!c3489yj.f14211f) {
                c3489yj.f14211f = true;
            }
            if (c3489yj.f14197a0.mo4150h().getVisibility() != 8) {
                return;
            } else {
                view = c3489yj.f14197a0.mo4150h();
            }
        } else if (view == null || view.getVisibility() != 8) {
            return;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4803b(p000.C3087pj r5, p000.C3400wj r6, p000.C2945mj r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L6c
            java.lang.String r0 = r5.m14775a()
            java.lang.String r1 = r5.m14785e()
            java.lang.String r2 = r5.m14787f()
            java.lang.String r3 = r5.m14781c()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L2a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2a
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L6c
        L2a:
            boolean r0 = com.comviva.webaxn.utils.C0755x1.m6187e()
            if (r0 != 0) goto L47
            wj$i r0 = r4.m4806c()
            if (r0 == 0) goto L47
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 10
            if (r0 <= r1) goto L47
            android.widget.FrameLayout r0 = r4.f4155w
            com.comviva.webaxn.ui.o1$r r1 = new com.comviva.webaxn.ui.o1$r
            r1.<init>(r5, r6, r7)
            r0.setOnTouchListener(r1)
            goto L5e
        L47:
            android.widget.FrameLayout r0 = r4.f4155w
            lj r1 = r4.f4136d
            zj r1 = r1.m13901f()
            java.lang.String r1 = r1.f14508g
            r0.setContentDescription(r1)
            android.widget.FrameLayout r0 = r4.f4155w
            com.comviva.webaxn.ui.o1$m r1 = new com.comviva.webaxn.ui.o1$m
            r1.<init>(r5, r6, r7)
            r0.setOnClickListener(r1)
        L5e:
            android.widget.LinearLayout r5 = r4.f4111A
            if (r5 == 0) goto L6a
            com.comviva.webaxn.ui.o1$n r6 = new com.comviva.webaxn.ui.o1$n
            r6.<init>(r4)
            r5.setOnTouchListener(r6)
        L6a:
            r5 = 1
            goto L6d
        L6c:
            r5 = 0
        L6d:
            if (r5 != 0) goto L79
            com.comviva.webaxn.ui.PageRootFrame r5 = r4.f4154v
            com.comviva.webaxn.ui.o1$o r6 = new com.comviva.webaxn.ui.o1$o
            r6.<init>(r4)
            r5.setOnTouchListener(r6)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.m4803b(pj, wj, mj):void");
    }

    /* renamed from: b */
    public void m4804b(C3489yj c3489yj) {
        if (c3489yj != null) {
            try {
                if (this.f4115E.size() > 0) {
                    for (Map.Entry<View, C3489yj> entry : this.f4115E.entrySet()) {
                        View key = entry.getKey();
                        C3489yj value = entry.getValue();
                        if (value != null) {
                            if (!value.equals(C0755x1.m6135a(c3489yj))) {
                                m4777a((View) null, value);
                            }
                        } else if (key != null) {
                            m4777a(key, (C3489yj) null);
                        }
                    }
                    if (m4828v() && !this.f4116F) {
                        m4783a(this.f4136d, this.f4133a, false);
                    }
                }
            } catch (Exception unused) {
            }
        }
        ArrayList<LinearLayout> arrayList = this.f4128R;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<LinearLayout> it = this.f4128R.iterator();
        while (it.hasNext()) {
            LinearLayout next = it.next();
            if (next.getVisibility() == 0) {
                next.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public boolean m4805b(String str, String str2) {
        if (str != null && str2 != null) {
            if (!this.f4117G.containsKey(str)) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(str2);
                this.f4117G.put(str, arrayList);
                return true;
            }
            ArrayList<String> arrayList2 = this.f4117G.get(str);
            if (arrayList2 != null) {
                boolean z = arrayList2.size() == 0;
                if (arrayList2.contains(str2)) {
                    return z;
                }
                arrayList2.add(str2);
                return z;
            }
        }
        return false;
    }

    /* renamed from: c */
    public C3400wj.i m4806c() {
        return this.f4130T;
    }

    /* renamed from: c */
    public void m4807c(int i2) {
        SparseArray<Long> sparseArray = this.f4123M;
        if (sparseArray != null) {
            sparseArray.delete(i2);
        }
    }

    /* renamed from: c */
    public void m4808c(C3489yj c3489yj) {
        if (c3489yj != null) {
            try {
                if (this.f4115E.size() > 0) {
                    for (Map.Entry<View, C3489yj> entry : this.f4115E.entrySet()) {
                        View key = entry.getKey();
                        C3489yj value = entry.getValue();
                        if (value != null) {
                            m4802b(key, value);
                        } else if (key != null) {
                            m4802b(key, (C3489yj) null);
                        }
                    }
                    if (m4828v() && !this.f4116F) {
                        m4783a(this.f4136d, this.f4133a, false);
                    }
                }
            } catch (Exception unused) {
            }
        }
        ArrayList<LinearLayout> arrayList = this.f4128R;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<LinearLayout> it = this.f4128R.iterator();
        while (it.hasNext()) {
            LinearLayout next = it.next();
            if (next.getVisibility() == 8) {
                next.setVisibility(0);
            }
        }
    }

    /* renamed from: d */
    public ProgressBar m4809d() {
        return this.f4148p;
    }

    /* renamed from: d */
    public void m4810d(C3489yj c3489yj) {
        this.f4120J++;
    }

    /* renamed from: e */
    public C2899lj m4811e() {
        return this.f4136d;
    }

    /* renamed from: f */
    public C2945mj m4812f() {
        return this.f4137e;
    }

    /* renamed from: g */
    public NestedScrollView m4813g() {
        return this.f4146n;
    }

    /* renamed from: h */
    public AbstractC0652n1 m4814h() {
        return this.f4127Q;
    }

    /* renamed from: i */
    public C3531zj m4815i() {
        return this.f4134b;
    }

    /* renamed from: j */
    public String m4816j() {
        return this.f4121K;
    }

    /* renamed from: k */
    public View m4817k() {
        return this.f4155w;
    }

    /* renamed from: l */
    public C0755x1.p m4818l() {
        return this.f4131U;
    }

    /* renamed from: m */
    public View m4819m() {
        return this.f4154v;
    }

    /* renamed from: n */
    public C0728o1 m4820n() {
        return this.f4126P;
    }

    /* renamed from: o */
    public C0755x1.q m4821o() {
        return this.f4132V;
    }

    /* renamed from: p */
    public float m4822p() {
        return this.f4125O;
    }

    /* renamed from: q */
    public int m4823q() {
        HashMap<String, String> hashMap = this.f4134b.f14519r;
        if (hashMap != null && !TextUtils.isEmpty(hashMap.get("FORMTYPE"))) {
            String str = this.f4134b.f14519r.get("FORMTYPE");
            if (str.equals("0")) {
                this.f4121K = "EDIT";
            } else {
                this.f4121K = "VALIDATE";
                try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return 0;
    }

    /* renamed from: r */
    public View m4824r() {
        return this.f4156x;
    }

    /* renamed from: s */
    public C0614b m4825s() {
        return this.f4153u;
    }

    /* renamed from: t */
    public boolean m4826t() {
        if (m4797a("back", (C2945mj) null, (C2899lj) null) || m4797a("exit", (C2945mj) null, (C2899lj) null)) {
            return true;
        }
        C2899lj c2899lj = this.f4136d;
        if (c2899lj == null || c2899lj.m13898d() == null || 1 != this.f4136d.m13898d().size()) {
            return false;
        }
        return m4797a(this.f4136d.m13898d().get(0).f4714f, (C2945mj) null, (C2899lj) null);
    }

    /* renamed from: u */
    public void m4827u() {
        if (this.f4134b.f14499P.get("rightswipe") != null && this.f4134b.f14499P.get("leftswipe") != null) {
            this.f4111A.setOnTouchListener(new p(this, new GestureDetector(this.f4133a, new C0648m0(this.f4134b, this.f4131U, this.f4137e))));
        } else if (this.f4134b.f14499P.get("shake") != null) {
            C0728o1 c0728o1 = new C0728o1(this.f4133a);
            this.f4126P = c0728o1;
            c0728o1.m5935a(new a());
        }
    }

    /* renamed from: v */
    public boolean m4828v() {
        HashMap<String, C2555hj> hashMap = this.f4134b.f14499P;
        return (hashMap == null || (hashMap.get("onshowkeypad") == null && this.f4134b.f14499P.get("onhidekeypad") == null)) ? false : true;
    }

    /* renamed from: w */
    public boolean m4829w() {
        return this.f4118H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (com.comviva.webaxn.utils.C0755x1.m6177c() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        r1 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0059, code lost:
    
        if (com.comviva.webaxn.utils.C0755x1.m6177c() == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m4830x() {
        /*
            r4 = this;
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14502a
            r1 = 3
            r2 = 5
            if (r0 == 0) goto L60
            java.lang.String r3 = "C"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L5e
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14502a
            java.lang.String r3 = "Center"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L1d
            goto L5e
        L1d:
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14502a
            java.lang.String r3 = "L"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L55
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14502a
            java.lang.String r3 = "Left"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L36
            goto L55
        L36:
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14502a
            java.lang.String r3 = "R"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L4e
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14502a
            java.lang.String r3 = "Right"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L60
        L4e:
            boolean r0 = com.comviva.webaxn.utils.C0755x1.m6177c()
            if (r0 == 0) goto L5c
            goto L62
        L55:
            boolean r0 = com.comviva.webaxn.utils.C0755x1.m6177c()
            if (r0 != 0) goto L5c
            goto L62
        L5c:
            r1 = 5
            goto L62
        L5e:
            r1 = 1
            goto L62
        L60:
            r1 = 17
        L62:
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14503b
            if (r0 == 0) goto Lb6
            java.lang.String r2 = "B"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto Lb4
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14503b
            java.lang.String r2 = "Bottom"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L7d
            goto Lb4
        L7d:
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14503b
            java.lang.String r2 = "T"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto Lb1
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14503b
            java.lang.String r2 = "Top"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L96
            goto Lb1
        L96:
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14503b
            java.lang.String r2 = "M"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto Lae
            zj r0 = r4.f4134b
            java.lang.String r0 = r0.f14503b
            java.lang.String r2 = "Middle"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto Lb6
        Lae:
            r1 = r1 | 16
            goto Lb6
        Lb1:
            r1 = r1 | 48
            goto Lb6
        Lb4:
            r1 = r1 | 80
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0655o1.m4830x():int");
    }

    /* renamed from: y */
    public void m4831y() {
        AbstractC0652n1 abstractC0652n1;
        ArrayList<C3489yj> arrayList = this.f4122L;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<C3489yj> it = this.f4122L.iterator();
        while (it.hasNext()) {
            C3489yj next = it.next();
            if (next.f14208e == 3 && (abstractC0652n1 = next.f14197a0) != null) {
                C0670w c0670w = (C0670w) abstractC0652n1;
                c0670w.m5095i(c0670w.m5097m());
            }
        }
    }

    /* renamed from: z */
    public void m4832z() {
        if (m4825s().getMenu() != null) {
            if (m4825s().getMenu().f14197a0 instanceof C0670w) {
                ((C0670w) m4825s().getMenu().f14197a0).m5103s();
            } else if (m4825s().getMenu().f14197a0 instanceof C0668v) {
                ((C0668v) m4825s().getMenu().f14197a0).m5039r();
            }
        }
    }
}
