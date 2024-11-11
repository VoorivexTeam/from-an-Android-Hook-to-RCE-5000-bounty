package com.comviva.webaxn.ui;

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
import androidx.core.widget.NestedScrollView;
import com.comviva.webaxn.utils.TapsellSDKAdv;
import com.comviva.webaxn.utils.o1;
import com.comviva.webaxn.utils.p1;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.aj;
import defpackage.ak;
import defpackage.bj;
import defpackage.ej;
import defpackage.hj;
import defpackage.kj;
import defpackage.lj;
import defpackage.mj;
import defpackage.nj;
import defpackage.pj;
import defpackage.tj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import defpackage.zi;
import defpackage.zj;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes.dex */
public class o1 {
    public static LayoutInflater W;
    private LinearLayout A;
    private HashMap<String, ArrayList<String>> G;
    private int I;
    private int J;
    private ArrayList<yj> L;
    private int N;
    private float O;
    private com.comviva.webaxn.utils.o1 P;
    private n1 Q;
    private ArrayList<LinearLayout> R;
    private TapsellSDKAdv S;
    private wj.i T;
    private Context a;
    public zj b;
    public wj c;
    public lj d;
    public mj e;
    public v0 f;
    public TextView g;
    public ImageView h;
    private double i;
    public LinearLayout j;
    public LinearLayout k;
    public LinearLayout l;
    public LinearLayout m;
    private NestedScrollView n;
    private ProgressBar p;
    private RelativeLayout q;
    private RelativeLayout r;
    private TextView s;
    private ImageView t;
    private com.comviva.webaxn.ui.b u;
    private PageRootFrame v;
    private FrameLayout w;
    private RelativeLayout x;
    private LinearLayout y;
    private RelativeLayout z;
    protected Drawable o = null;
    private int B = 0;
    private int C = 0;
    private int D = 0;
    private HashMap<View, yj> E = new HashMap<>();
    public boolean F = false;
    private boolean H = false;
    private String K = "EDIT";
    private SparseArray<Long> M = null;
    public final x1.p U = new i();
    public final x1.q V = new j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements o1.a {
        a() {
        }

        @Override // com.comviva.webaxn.utils.o1.a
        public void a(int i) {
            o1 o1Var = o1.this;
            zj zjVar = o1Var.b;
            HashMap<String, hj> hashMap = zjVar.P;
            if (hashMap != null) {
                o1Var.U.a(zjVar, hashMap.get("shake"), o1.this.e);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o1.this.g().scrollTo(o1.this.B, o1.this.C);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            o1.this.s().removeView(o1.this.m());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Animation.AnimationListener {
        d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            o1.this.s().removeView(o1.this.m());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            o1.this.s().removeView(o1.this.m());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Animation.AnimationListener {
        f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            o1.this.s().removeView(o1.this.m());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements View.OnTouchListener {
        g(o1 o1Var) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    class h implements View.OnAttachStateChangeListener {
        h(o1 o1Var) {
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

    /* loaded from: classes.dex */
    class i implements x1.p {

        /* loaded from: classes.dex */
        class a implements Runnable {
            n1 b;

            a() {
            }

            public Runnable a(n1 n1Var) {
                this.b = n1Var;
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
                throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.i.a.run():void");
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {
            com.comviva.webaxn.utils.e b;
            zj c;
            mj d;

            b() {
            }

            public Runnable a(com.comviva.webaxn.utils.e eVar, mj mjVar, zj zjVar) {
                this.b = eVar;
                this.d = mjVar;
                this.c = zjVar;
                return this;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                lj ljVar;
                lj ljVar2;
                if (o1.this.h() != null) {
                    if (o1.this.h() instanceof com.comviva.webaxn.ui.a) {
                        ((com.comviva.webaxn.ui.a) o1.this.h()).m();
                    } else if (o1.this.h() instanceof h1) {
                        ((h1) o1.this.h()).m();
                    }
                }
                if (this.c == null || (ljVar2 = o1.this.d) == null || ljVar2.f() == null || o1.this.d.f().equals(this.c)) {
                    com.comviva.webaxn.utils.e eVar = this.b;
                    if (eVar != null && !eVar.v) {
                        o1 o1Var = o1.this;
                        o1Var.c.a(this.d, o1Var.d);
                    }
                    String str = null;
                    if (TextUtils.isEmpty(this.b.k)) {
                        com.comviva.webaxn.utils.e eVar2 = this.b;
                        String str2 = eVar2.i;
                        if (str2 != null) {
                            o1.this.c.a(str2, eVar2.a());
                            o1 o1Var2 = o1.this;
                            z = o1Var2.c.a(this.b.i, this.d, o1Var2.d);
                            if (z) {
                                String str3 = this.b.s;
                                if (str3 != null) {
                                    o1 o1Var3 = o1.this;
                                    o1Var3.c.b(str3, this.d, o1Var3.d);
                                    return;
                                }
                                return;
                            }
                            Object obj = this.b.h;
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
                        wj wjVar = o1.this.c;
                        com.comviva.webaxn.utils.e eVar3 = this.b;
                        wjVar.a(eVar3.k, eVar3.a());
                        o1 o1Var4 = o1.this;
                        z = o1Var4.c.a(this.b.k, this.d, o1Var4.d);
                        if (!z && (o1.this.a instanceof WebAxnActivity)) {
                            try {
                                InputStream open = ((WebAxnActivity) o1.this.a).getAssets().open(this.b.k + ".wbxml");
                                byte[] bArr = new byte[open.available()];
                                open.read(bArr);
                                open.close();
                                o1.this.c.a(bArr, null, wj.h.WBXML_BUFFER, null, true, false, true);
                                z = true;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (z) {
                            String str5 = this.b.s;
                            if (str5 != null) {
                                o1 o1Var5 = o1.this;
                                o1Var5.c.b(str5, this.d, o1Var5.d);
                                return;
                            }
                            return;
                        }
                    }
                    if (!z && TextUtils.isEmpty(str) && this.b.h != null && (ljVar = o1.this.d) != null) {
                        zj f = ljVar.f();
                        if (f != null && f.e != null) {
                            for (int i = 0; i < f.e.size(); i++) {
                                o1.this.c.a(f.e.elementAt(i));
                            }
                        }
                        str = (String) this.b.h;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        o1 o1Var6 = o1.this;
                        wj wjVar2 = o1Var6.c;
                        com.comviva.webaxn.utils.e eVar4 = this.b;
                        if (!wjVar2.a(str, eVar4.v, null, eVar4, this.d, o1Var6.d)) {
                            o1.this.c.a(str, this.b.a());
                            o1 o1Var7 = o1.this;
                            wj wjVar3 = o1Var7.c;
                            com.comviva.webaxn.utils.e eVar5 = this.b;
                            if (wjVar3.a(str, eVar5.o, eVar5.v, this.d, false, false, eVar5.j, o1Var7.d) > 0 && !this.b.v) {
                                o1.this.c.E();
                            }
                        }
                    }
                    String str6 = this.b.s;
                    if (str6 != null) {
                        o1 o1Var8 = o1.this;
                        o1Var8.c.b(str6, this.d, o1Var8.d);
                    }
                }
            }
        }

        i() {
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(long j, String str) {
            if (TextUtils.isEmpty(str)) {
                Toast.makeText(o1.this.a, "Downloading failed,please try again.", 0).show();
                return;
            }
            if (o1.this.M == null) {
                o1.this.M = new SparseArray(20);
                o1.this.N = 1510;
            }
            o1.this.M.put(o1.this.N, Long.valueOf(j));
            x1.a(o1.this.a, (String) null, str, o1.j(o1.this));
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(n1 n1Var) {
            o1.this.Q = n1Var;
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(n1 n1Var, String str, yj yjVar) {
            x1.a(o1.this.a, yjVar, o1.this.r().getApplicationWindowToken());
            mj f = o1.this.f();
            if (f == null) {
                return;
            }
            if (!TextUtils.isEmpty(yjVar.q0)) {
                o1.this.c.a(yjVar.q0, n1Var.g());
                o1 o1Var = o1.this;
                boolean a2 = o1Var.c.a(yjVar.q0, f, o1Var.d);
                if (!a2 && (o1.this.a instanceof WebAxnActivity)) {
                    try {
                        InputStream open = ((WebAxnActivity) o1.this.a).getAssets().open(yjVar.q0 + ".wbxml");
                        byte[] bArr = new byte[open.available()];
                        open.read(bArr);
                        open.close();
                        o1.this.c.a(bArr, null, wj.h.WBXML_BUFFER, null, true, false, true);
                        a2 = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (a2) {
                    String str2 = yjVar.u;
                    if (str2 != null) {
                        o1 o1Var2 = o1.this;
                        o1Var2.c.b(str2, f, o1Var2.d);
                        return;
                    }
                    return;
                }
            } else if (!TextUtils.isEmpty(yjVar.W)) {
                o1.this.c.a(yjVar.W, n1Var.g());
                o1 o1Var3 = o1.this;
                if (o1Var3.c.a(yjVar.W, f, o1Var3.d)) {
                    String str3 = yjVar.u;
                    if (str3 != null) {
                        o1 o1Var4 = o1.this;
                        o1Var4.c.b(str3, f, o1Var4.d);
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(yjVar.i) && !yjVar.i.equals("Menulist:")) {
                    str = yjVar.i;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                o1 o1Var5 = o1.this;
                if (!o1Var5.c.a(str, false, yjVar, null, f, o1Var5.d)) {
                    o1 o1Var6 = o1.this;
                    o1Var6.c.a(f, o1Var6.d);
                    o1 o1Var7 = o1.this;
                    o1Var7.c.c(f, o1Var7.d);
                    zj f2 = o1.this.d.f();
                    if (f2 != null) {
                        for (int i = 0; i < f2.e.size(); i++) {
                            o1.this.c.a(f2.e.elementAt(i));
                        }
                    }
                    o1.this.c.a(str, n1Var.g());
                    o1 o1Var8 = o1.this;
                    if (o1Var8.c.a(str, yjVar.M, false, f, false, false, yjVar.j, o1Var8.d) > 0) {
                        o1.this.c.E();
                    }
                }
            }
            String str4 = yjVar.u;
            if (str4 != null) {
                o1 o1Var9 = o1.this;
                o1Var9.c.b(str4, f, o1Var9.d);
            }
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(r0 r0Var, String str) {
            o1.this.c.a(r0Var);
            if (TextUtils.isEmpty(str)) {
                o1.this.c.w();
                return;
            }
            o1 o1Var = o1.this;
            if (o1Var.c.a(str, false, null, null, o1Var.e, o1Var.d)) {
                return;
            }
            xj a2 = x1.a(str, o1.this.e.i());
            if (a2 != null) {
                o1.this.e.a(a2);
            }
            o1.this.c.a(str, r0Var.getUDXPAPMHandler());
            o1 o1Var2 = o1.this;
            o1Var2.c.a(str, false, false, o1Var2.e, false, false, null, o1Var2.d);
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(com.comviva.webaxn.utils.e eVar, mj mjVar, zj zjVar, boolean z) {
            if (!z) {
                x1.a(o1.this.a, (yj) null, o1.this.r().getApplicationWindowToken());
            }
            if (mjVar == null) {
                return;
            }
            Handler handler = new Handler();
            b bVar = new b();
            bVar.a(eVar, mjVar, zjVar);
            handler.post(bVar);
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(String str, int i, yj yjVar) {
            com.comviva.webaxn.utils.l1 l1Var = new com.comviva.webaxn.utils.l1();
            l1Var.i = 1;
            l1Var.j = str;
            l1Var.K = i;
            l1Var.L = yjVar;
            o1.this.c.h();
            wj wjVar = o1.this.c;
            l1Var.q = wjVar.V;
            l1Var.c = 22;
            wjVar.g.d(l1Var);
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(String str, String str2, yj yjVar) {
            x1.a(o1.this.a, yjVar, o1.this.r().getApplicationWindowToken());
            mj f = o1.this.f();
            if (f == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                o1 o1Var = o1.this;
                if (!o1Var.c.a(str, false, yjVar, null, f, o1Var.d)) {
                    o1 o1Var2 = o1.this;
                    o1Var2.c.a(f, o1Var2.d);
                    o1 o1Var3 = o1.this;
                    o1Var3.c.c(f, o1Var3.d);
                    zj f2 = o1.this.d.f();
                    if (f2 != null) {
                        for (int i = 0; i < f2.e.size(); i++) {
                            o1.this.c.a(f2.e.elementAt(i));
                        }
                    }
                    xj a2 = x1.a(str, f.i());
                    if (a2 != null) {
                        f.a(a2);
                    }
                    o1 o1Var4 = o1.this;
                    if (o1Var4.c.a(str, yjVar.M, false, f, false, false, yjVar.j, o1Var4.d) > 0) {
                        o1.this.c.E();
                    }
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            p1.a(o1.this.a, str2, o1.this.c.t(), yjVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0071 A[EDGE_INSN: B:53:0x0071->B:17:0x0071 BREAK  A[LOOP:0: B:4:0x0006->B:50:0x006e], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x006e A[SYNTHETIC] */
        @Override // com.comviva.webaxn.utils.x1.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.lang.String r8, java.lang.String r9, defpackage.yj r10, boolean r11, boolean r12, boolean[] r13) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.i.a(java.lang.String, java.lang.String, yj, boolean, boolean, boolean[]):void");
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(String str, yj yjVar) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            o1 o1Var = o1.this;
            if (o1Var.c.a(str, false, yjVar, null, o1Var.f(), o1.this.d)) {
                return;
            }
            o1 o1Var2 = o1.this;
            o1Var2.c.a(o1Var2.f(), o1.this.d);
            o1 o1Var3 = o1.this;
            o1Var3.c.c(o1Var3.f(), o1.this.d);
            zj f = o1.this.d.f();
            if (f != null) {
                for (int i = 0; i < f.e.size(); i++) {
                    o1.this.c.a(f.e.elementAt(i));
                }
            }
            o1 o1Var4 = o1.this;
            if (o1Var4.c.a(str, false, false, o1Var4.f(), false, false, null, o1.this.d) > 0) {
                o1.this.c.E();
            }
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(yj yjVar) {
            o1.this.s().setMenu(yjVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        
            if (android.text.TextUtils.isEmpty(r13.b()) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
        
            if (r13.b().equals("Menulist:") == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
        
            r0 = r13.b();
         */
        @Override // com.comviva.webaxn.utils.x1.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(defpackage.yj r12, defpackage.hj r13) {
            /*
                r11 = this;
                r13.h()
                java.lang.String r0 = r13.e()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r1 = 0
                if (r0 != 0) goto L4c
                com.comviva.webaxn.ui.o1 r0 = com.comviva.webaxn.ui.o1.this
                wj r0 = r0.c
                java.lang.String r2 = r13.e()
                com.comviva.webaxn.utils.r1 r3 = r13.g()
                r0.a(r2, r3)
                com.comviva.webaxn.ui.o1 r0 = com.comviva.webaxn.ui.o1.this
                wj r0 = r0.c
                java.lang.String r2 = r13.e()
                com.comviva.webaxn.ui.o1 r3 = com.comviva.webaxn.ui.o1.this
                mj r3 = r3.f()
                com.comviva.webaxn.ui.o1 r4 = com.comviva.webaxn.ui.o1.this
                lj r4 = r4.d
                boolean r0 = r0.a(r2, r3, r4)
                if (r0 != 0) goto L5b
                java.lang.String r0 = r13.b()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L5b
                java.lang.String r0 = r13.b()
                java.lang.String r2 = "Menulist:"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L5b
                goto L56
            L4c:
                java.lang.String r0 = r13.b()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L5b
            L56:
                java.lang.String r0 = r13.b()
                goto L5c
            L5b:
                r0 = r1
            L5c:
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto Lbc
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.ui.o1.this
                wj r3 = r2.c
                r4 = 0
                r6 = 0
                mj r7 = r2.f()
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.ui.o1.this
                lj r8 = r2.d
                r2 = r3
                r3 = r0
                r5 = r12
                boolean r12 = r2.a(r3, r4, r5, r6, r7, r8)
                if (r12 != 0) goto Lbc
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.ui.o1.this
                mj r12 = r12.f()
                java.util.Vector r12 = r12.i()
                xj r12 = com.comviva.webaxn.utils.x1.a(r0, r12)
                if (r12 == 0) goto L92
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.ui.o1.this
                mj r2 = r2.f()
                r2.a(r12)
            L92:
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.ui.o1.this
                wj r12 = r12.c
                com.comviva.webaxn.utils.r1 r2 = r13.g()
                r12.a(r0, r2)
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.ui.o1.this
                wj r2 = r12.c
                r4 = 0
                r5 = 0
                mj r6 = r12.f()
                r7 = 0
                r8 = 0
                r9 = 0
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.ui.o1.this
                lj r10 = r12.d
                r3 = r0
                int r12 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 <= 0) goto Lbc
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.ui.o1.this
                wj r12 = r12.c
                r12.E()
            Lbc:
                java.lang.String r12 = r13.c()
                boolean r12 = android.text.TextUtils.isEmpty(r12)
                if (r12 != 0) goto Ldb
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.ui.o1.this
                android.content.Context r12 = com.comviva.webaxn.ui.o1.a(r12)
                java.lang.String r0 = r13.c()
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.ui.o1.this
                wj r2 = r2.c
                com.comviva.webaxn.ui.o1 r2 = r2.t()
                com.comviva.webaxn.utils.p1.a(r12, r0, r2, r1)
            Ldb:
                java.lang.String r12 = r13.d()
                if (r12 == 0) goto Lf6
                com.comviva.webaxn.ui.o1 r12 = com.comviva.webaxn.ui.o1.this
                wj r12 = r12.c
                java.lang.String r13 = r13.d()
                com.comviva.webaxn.ui.o1 r0 = com.comviva.webaxn.ui.o1.this
                mj r0 = r0.f()
                com.comviva.webaxn.ui.o1 r1 = com.comviva.webaxn.ui.o1.this
                lj r1 = r1.d
                r12.b(r13, r0, r1)
            Lf6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.i.a(yj, hj):void");
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(yj yjVar, String str, x1.r rVar) {
            o1.this.c.a(rVar);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            o1 o1Var = o1.this;
            o1Var.c.a(str, false, yjVar, null, o1Var.f(), o1.this.d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
        
            if (android.text.TextUtils.isEmpty(r12.b()) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
        
            if (r12.b().equals("Menulist:") == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        
            r11 = r12.b();
         */
        @Override // com.comviva.webaxn.utils.x1.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(defpackage.zj r11, defpackage.hj r12, defpackage.mj r13) {
            /*
                r10 = this;
                r12.h()
                java.lang.String r11 = r12.e()
                boolean r11 = android.text.TextUtils.isEmpty(r11)
                r0 = 0
                if (r11 != 0) goto L46
                com.comviva.webaxn.ui.o1 r11 = com.comviva.webaxn.ui.o1.this
                wj r11 = r11.c
                java.lang.String r1 = r12.e()
                com.comviva.webaxn.utils.r1 r2 = r12.g()
                r11.a(r1, r2)
                com.comviva.webaxn.ui.o1 r11 = com.comviva.webaxn.ui.o1.this
                wj r11 = r11.c
                java.lang.String r1 = r12.e()
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.ui.o1.this
                lj r2 = r2.d
                boolean r11 = r11.a(r1, r13, r2)
                if (r11 != 0) goto L55
                java.lang.String r11 = r12.b()
                boolean r11 = android.text.TextUtils.isEmpty(r11)
                if (r11 != 0) goto L55
                java.lang.String r11 = r12.b()
                java.lang.String r1 = "Menulist:"
                boolean r11 = r11.equals(r1)
                if (r11 != 0) goto L55
                goto L50
            L46:
                java.lang.String r11 = r12.b()
                boolean r11 = android.text.TextUtils.isEmpty(r11)
                if (r11 != 0) goto L55
            L50:
                java.lang.String r11 = r12.b()
                goto L56
            L55:
                r11 = r0
            L56:
                boolean r1 = android.text.TextUtils.isEmpty(r11)
                if (r1 != 0) goto La1
                com.comviva.webaxn.ui.o1 r1 = com.comviva.webaxn.ui.o1.this
                wj r2 = r1.c
                r3 = 0
                r4 = 0
                r5 = 0
                lj r7 = r1.d
                r1 = r2
                r2 = r11
                r6 = r13
                boolean r1 = r1.a(r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto La1
                java.util.Vector r1 = r13.i()
                xj r1 = com.comviva.webaxn.utils.x1.a(r11, r1)
                if (r1 == 0) goto L7b
                r13.a(r1)
            L7b:
                com.comviva.webaxn.ui.o1 r1 = com.comviva.webaxn.ui.o1.this
                wj r1 = r1.c
                com.comviva.webaxn.utils.r1 r2 = r12.g()
                r1.a(r11, r2)
                com.comviva.webaxn.ui.o1 r1 = com.comviva.webaxn.ui.o1.this
                wj r2 = r1.c
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                lj r9 = r1.d
                r1 = r2
                r2 = r11
                r5 = r13
                int r11 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
                if (r11 <= 0) goto La1
                com.comviva.webaxn.ui.o1 r11 = com.comviva.webaxn.ui.o1.this
                wj r11 = r11.c
                r11.E()
            La1:
                java.lang.String r11 = r12.c()
                boolean r11 = android.text.TextUtils.isEmpty(r11)
                if (r11 != 0) goto Lc0
                com.comviva.webaxn.ui.o1 r11 = com.comviva.webaxn.ui.o1.this
                android.content.Context r11 = com.comviva.webaxn.ui.o1.a(r11)
                java.lang.String r1 = r12.c()
                com.comviva.webaxn.ui.o1 r2 = com.comviva.webaxn.ui.o1.this
                wj r2 = r2.c
                com.comviva.webaxn.ui.o1 r2 = r2.t()
                com.comviva.webaxn.utils.p1.a(r11, r1, r2, r0)
            Lc0:
                java.lang.String r11 = r12.d()
                if (r11 == 0) goto Ld5
                com.comviva.webaxn.ui.o1 r11 = com.comviva.webaxn.ui.o1.this
                wj r11 = r11.c
                java.lang.String r12 = r12.d()
                com.comviva.webaxn.ui.o1 r0 = com.comviva.webaxn.ui.o1.this
                lj r0 = r0.d
                r11.b(r12, r13, r0)
            Ld5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.i.a(zj, hj, mj):void");
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void a(boolean z, yj yjVar) {
            o1 o1Var;
            String str;
            if (z) {
                if (!yjVar.o1) {
                    o1.d(o1.this);
                    yjVar.o1 = true;
                }
            } else if (o1.this.J > 0 && yjVar.o1) {
                yjVar.o1 = false;
                o1.e(o1.this);
            }
            if (o1.this.J == o1.this.I) {
                o1Var = o1.this;
                str = yjVar.f1;
            } else {
                o1Var = o1.this;
                str = yjVar.g1;
            }
            o1Var.a(str, yjVar);
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public boolean a(yj yjVar, String str, String str2) {
            lj ljVar;
            zj f;
            yj a2;
            n1 n1Var;
            boolean z = false;
            if (o1.this.f() == null || str == null || (ljVar = o1.this.d) == null || (f = ljVar.f()) == null || (a2 = f.a(str, (Vector<yj>) null)) == null || a2.e != 3 || (n1Var = a2.a0) == null) {
                return false;
            }
            if (n1Var instanceof w) {
                ((w) n1Var).g(str2);
                z = true;
            }
            n1 n1Var2 = a2.a0;
            if (!(n1Var2 instanceof v)) {
                return z;
            }
            ((v) n1Var2).e(str2);
            return true;
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void b(n1 n1Var) {
            if (n1Var == null) {
                return;
            }
            if (!(n1Var instanceof v) && !(n1Var instanceof w)) {
                o1.this.s().requestFocus();
            }
            x1.a(o1.this.a, n1Var.f(), o1.this.r().getApplicationWindowToken());
            Handler handler = new Handler();
            a aVar = new a();
            aVar.a(n1Var);
            handler.post(aVar);
        }

        @Override // com.comviva.webaxn.utils.x1.p
        public void b(yj yjVar) {
            if (TextUtils.isEmpty(yjVar.S0)) {
                return;
            }
            String str = yjVar.S0;
            String str2 = "";
            if (str.contains("#")) {
                int indexOf = yjVar.S0.indexOf("#");
                String substring = yjVar.S0.substring(0, indexOf);
                try {
                    str2 = yjVar.S0.substring(indexOf + 1);
                } catch (Exception unused) {
                }
                str = substring;
            }
            yj a2 = o1.this.b.a(str, (Vector<yj>) null);
            if (a2 == null || a2.e != 4) {
                return;
            }
            o1 o1Var = o1.this;
            x1.a(o1Var.d, o1Var.a, str, str2);
        }
    }

    /* loaded from: classes.dex */
    class j implements x1.q {
        j() {
        }

        @Override // com.comviva.webaxn.utils.x1.q
        public void a(yj yjVar, boolean z) {
            o1 o1Var;
            boolean z2;
            if (z) {
                o1.this.b(yjVar);
                o1Var = o1.this;
                z2 = true;
            } else {
                o1.this.c(yjVar);
                o1Var = o1.this;
                z2 = false;
            }
            o1Var.H = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements Animation.AnimationListener {
        k() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            o1.this.w.clearAnimation();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o1.this.w.getLayoutParams();
            layoutParams.leftMargin = 0;
            o1.this.w.setLayoutParams(layoutParams);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l implements Animation.AnimationListener {
        l() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            o1.this.w.clearAnimation();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o1.this.w.getLayoutParams();
            layoutParams.rightMargin = 0;
            o1.this.w.setLayoutParams(layoutParams);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    class m implements View.OnClickListener {
        final /* synthetic */ pj b;
        final /* synthetic */ wj c;
        final /* synthetic */ mj d;

        m(pj pjVar, wj wjVar, mj mjVar) {
            this.b = pjVar;
            this.c = wjVar;
            this.d = mjVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o1.this.a(this.b, this.c, this.d);
        }
    }

    /* loaded from: classes.dex */
    class n implements View.OnTouchListener {
        n(o1 o1Var) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    class o implements View.OnTouchListener {
        o(o1 o1Var) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class p implements View.OnTouchListener {
        final /* synthetic */ GestureDetector b;

        p(o1 o1Var, GestureDetector gestureDetector) {
            this.b = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !this.b.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class q implements View.OnClickListener {
        mj b;

        q(mj mjVar) {
            this.b = mjVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.b.d() != null) {
                for (int i = 0; i < this.b.d().size(); i++) {
                    o1.this.a(this.b.d().get(i).f, this.b.d(), this.b);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class r implements View.OnTouchListener {
        private VelocityTracker b;
        private float c;
        private int d = 500;
        private long e;
        private float f;
        private float g;
        private MotionEvent h;
        pj i;
        wj j;
        mj k;

        public r(pj pjVar, wj wjVar, mj mjVar) {
            this.i = null;
            this.j = null;
            this.i = pjVar;
            this.j = wjVar;
            this.k = mjVar;
        }

        private float a(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            float f6 = f2 - f4;
            return ((float) Math.sqrt((f5 * f5) + (f6 * f6))) / com.comviva.webaxn.utils.b.a(o1.this.a).a().a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0114, code lost:
        
            if (r1 < 0.0f) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x015a, code lost:
        
            r7 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
        
            r11.l.v.setAlpha(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0157, code lost:
        
            if (r1 < 0.0f) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0218, code lost:
        
            if (r11.l.w.getRight() == 0) goto L89;
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
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.r.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public o1(Context context, LayoutInflater layoutInflater, com.comviva.webaxn.ui.b bVar, lj ljVar, wj wjVar) {
        this.O = 1.0f;
        this.a = context;
        this.O = context.getResources().getConfiguration().fontScale;
        this.c = wjVar;
        a(bVar);
        W = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.webaxn_page, (ViewGroup) null);
        if (Build.VERSION.SDK_INT > 11) {
            inflate.addOnAttachStateChangeListener(new h(this));
        }
        this.p = (ProgressBar) inflate.findViewById(R.id.hprogressbar);
        this.v = (PageRootFrame) inflate.findViewById(R.id.frame_view);
        this.w = (FrameLayout) inflate.findViewById(R.id.frame_view_child);
        this.v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 119));
        this.x = (RelativeLayout) inflate.findViewById(R.id.root_view);
        this.z = (RelativeLayout) inflate.findViewById(R.id.wrapper_page);
        this.y = (LinearLayout) inflate.findViewById(R.id.webaxn_layout);
        this.g = (TextView) inflate.findViewById(R.id.banner);
        this.m = (LinearLayout) inflate.findViewById(R.id.advlayout);
        this.h = (ImageView) inflate.findViewById(R.id.bannerimage);
        this.j = (LinearLayout) inflate.findViewById(R.id.navigationlayout);
        this.l = (LinearLayout) inflate.findViewById(R.id.fixedlayout);
        this.k = (LinearLayout) inflate.findViewById(R.id.c3ltitle);
        this.q = (RelativeLayout) inflate.findViewById(R.id.titlelayout);
        this.r = (RelativeLayout) inflate.findViewById(R.id.image_layout);
        this.s = (TextView) inflate.findViewById(R.id.titletext);
        this.t = (ImageView) inflate.findViewById(R.id.titleimage);
        this.G = new HashMap<>();
    }

    private void a(yj yjVar, v0 v0Var) {
        yj yjVar2;
        com.comviva.webaxn.utils.u uVar;
        com.comviva.webaxn.utils.u uVar2 = yjVar.p;
        int f2 = uVar2 != null ? (int) uVar2.f() : 0;
        if (f2 < 0 && (yjVar2 = yjVar.A0) != null && (uVar = yjVar2.p) != null) {
            f2 = (int) uVar.f();
        }
        if (f2 < 0 && (f2 = com.comviva.webaxn.utils.j1.a(this.a).L()) < 0) {
            f2 = com.comviva.webaxn.utils.j1.a(this.a).w();
        }
        if (f2 < 0) {
            f2 = nj.a;
        }
        LinearLayout linearLayout = new LinearLayout(this.a);
        linearLayout.setBackgroundColor(0);
        linearLayout.setBackgroundDrawable(null);
        this.A.addView(linearLayout, new LinearLayout.LayoutParams(-1, f2));
    }

    public static void b(lj ljVar, Context context, boolean z) {
        HashMap<String, Vector<kj>> hashMap;
        boolean z2;
        int parseInt;
        boolean z3;
        int parseInt2;
        if (ljVar == null || (hashMap = ljVar.g) == null) {
            return;
        }
        try {
            for (Map.Entry<String, Vector<kj>> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                String h2 = aj.a(context).h(key);
                String e2 = aj.a(context).e(key);
                String[] split = !TextUtils.isEmpty(e2) ? e2.split(",") : null;
                String[] split2 = !TextUtils.isEmpty(h2) ? h2.split(";") : null;
                Vector<kj> value = entry.getValue();
                int i2 = 0;
                while (i2 < value.size()) {
                    yj yjVar = value.elementAt(i2).d;
                    if (yjVar.a0 != null) {
                        if (yjVar.a0 instanceof com.comviva.webaxn.ui.h) {
                            com.comviva.webaxn.ui.h hVar = (com.comviva.webaxn.ui.h) yjVar.a0;
                            ArrayList<CheckBox> m2 = hVar.m();
                            if (yjVar.U != null) {
                                for (int i3 : yjVar.U) {
                                    if (i3 < m2.size()) {
                                        m2.get(i3).setChecked(true);
                                    }
                                }
                            } else if (h2 != null && split2 != null) {
                                for (int i4 = 0; i4 < split2.length; i4++) {
                                    if (split2[i4] != null && split != null && i4 < split.length) {
                                        if (split[i4] == null || !split[i4].equals("0") || !TextUtils.isDigitsOnly(split2[i4]) || (parseInt2 = Integer.parseInt(split2[i4])) >= value.size() || !value.elementAt(parseInt2).d.equals(yjVar) || parseInt2 < i2) {
                                            z3 = false;
                                        } else {
                                            split2[i4] = String.valueOf(parseInt2 - i2);
                                            z3 = true;
                                        }
                                        if (((split[i4] == null || split[i4].equals("0")) && true != z3) ? false : hVar.a(split2[i4], split[i4])) {
                                            split2[i4] = null;
                                            split[i4] = null;
                                        }
                                    }
                                }
                            }
                        } else if (yjVar.a0 instanceof com.comviva.webaxn.ui.i) {
                            com.comviva.webaxn.ui.i iVar = (com.comviva.webaxn.ui.i) yjVar.a0;
                            if (yjVar.U != null) {
                                if (iVar.q()) {
                                    ArrayList<androidx.appcompat.widget.n0> o2 = iVar.o();
                                    for (int i5 : yjVar.U) {
                                        if (i5 < o2.size() && !o2.get(i5).isChecked()) {
                                            iVar.E[i5] = 1;
                                            o2.get(i5).setChecked(true);
                                        }
                                    }
                                } else {
                                    ArrayList<CheckBox> m3 = iVar.m();
                                    for (int i6 : yjVar.U) {
                                        if (i6 < m3.size()) {
                                            m3.get(i6).setChecked(true);
                                        }
                                    }
                                }
                            } else if (h2 != null && split2 != null) {
                                for (int i7 = 0; i7 < split2.length; i7++) {
                                    if (split2[i7] != null && split != null && i7 < split.length) {
                                        if (split[i7] == null || !split[i7].equals("0") || !TextUtils.isDigitsOnly(split2[i7]) || (parseInt = Integer.parseInt(split2[i7])) >= value.size() || !value.elementAt(parseInt).d.equals(yjVar) || parseInt < i2) {
                                            z2 = false;
                                        } else {
                                            split2[i7] = String.valueOf(parseInt - i2);
                                            z2 = true;
                                        }
                                        if (((split[i7] == null || split[i7].equals("0")) && true != z2) ? false : iVar.a(split2[i7], split[i7])) {
                                            split2[i7] = null;
                                            split[i7] = null;
                                        }
                                    }
                                }
                            }
                        }
                        i2 += yjVar.P.size() - 1;
                    }
                    i2++;
                }
            }
        } catch (Exception unused) {
        }
    }

    private void b(yj yjVar, p0 p0Var, v0 v0Var) {
        int size;
        yj a2;
        com.comviva.webaxn.ui.c cVar = new com.comviva.webaxn.ui.c(this.a, yjVar, v0Var);
        cVar.a(this.A);
        yjVar.a0 = cVar;
        cVar.c(yjVar);
        cVar.a(p0Var);
        cVar.b(yjVar.p.f());
        cVar.g(yjVar.p.g());
        cVar.a(yjVar.p.d());
        Vector<tj> vector = yjVar.L;
        if (vector != null && (size = vector.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                tj elementAt = yjVar.L.elementAt(i2);
                if (elementAt != null && (a2 = this.b.a(elementAt.g, (Vector<yj>) null)) != null && a2.r == null && a2.e == 3) {
                    a2.r = elementAt;
                    n1 n1Var = a2.a0;
                    if (n1Var != null) {
                        ((v) n1Var).a(elementAt);
                    }
                }
            }
        }
        cVar.a(this.U);
        cVar.n();
        cVar.b(yjVar);
        cVar.m();
    }

    private void b(yj yjVar, v0 v0Var) {
        LinearLayout linearLayout = new LinearLayout(this.a);
        this.R.add(linearLayout);
        linearLayout.setOnTouchListener(new g(this));
        v0Var.n = true;
        a(yjVar, linearLayout, (j0) null, v0Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, x1.a(yjVar.g, yjVar.h, x1.c()));
        layoutParams.setMargins(yjVar.d(v0Var.c.width()), yjVar.i(v0Var.c.height()), yjVar.g(v0Var.c.width()), yjVar.a(v0Var.c.height()));
        this.w.addView(linearLayout, layoutParams);
    }

    private void b(boolean z) {
        boolean z2;
        yj a2;
        boolean z3;
        boolean z4;
        yj a3;
        boolean z5;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        RelativeLayout relativeLayout = this.q;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            this.q.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.k;
        if (linearLayout3 != null) {
            linearLayout3.removeAllViews();
            this.k.setVisibility(8);
        }
        LinearLayout linearLayout4 = this.j;
        if (linearLayout4 != null) {
            linearLayout4.removeAllViews();
            this.j.setVisibility(8);
        }
        if (this.m != null) {
            ImageView imageView = this.h;
            if (imageView != null && imageView.getVisibility() == 0) {
                this.h.setImageBitmap(null);
                this.h.setVisibility(8);
            }
            TapsellSDKAdv tapsellSDKAdv = this.S;
            if (tapsellSDKAdv != null) {
                this.m.removeView(tapsellSDKAdv.a());
                this.S = null;
            }
            this.m.setVisibility(8);
        }
        TextView textView = this.g;
        if (textView != null) {
            textView.setText((CharSequence) null);
            this.g.setVisibility(8);
        }
        LinearLayout linearLayout5 = this.A;
        if (linearLayout5 != null) {
            linearLayout5.removeAllViews();
            NestedScrollView nestedScrollView = this.n;
            if (nestedScrollView != null) {
                nestedScrollView.removeAllViews();
                this.n = null;
            }
            this.y.removeAllViews();
            this.A = null;
        }
        ArrayList<LinearLayout> arrayList = this.R;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<LinearLayout> it = this.R.iterator();
            while (it.hasNext()) {
                LinearLayout next = it.next();
                if (next != null) {
                    next.removeAllViews();
                }
            }
            this.R = null;
        }
        zj zjVar = this.b;
        if (zjVar == null || zjVar.e == null) {
            return;
        }
        this.f = new v0();
        int d2 = com.comviva.webaxn.utils.b.a(this.a).a().d();
        int e2 = com.comviva.webaxn.utils.b.a(this.a).a().e();
        int j2 = this.b.j(d2);
        int c2 = this.b.c(e2);
        if (this.b.m.equalsIgnoreCase("popup")) {
            a(j2, c2);
        } else {
            this.y.getLayoutParams().height = -1;
            this.y.getLayoutParams().width = -1;
            ((FrameLayout.LayoutParams) r().getLayoutParams()).setMargins(this.b.d(d2), this.b.h(d2), this.b.f(d2), this.b.a(d2));
            r().setPadding(this.b.e(d2), this.b.i(d2), this.b.g(d2), this.b.b(d2));
        }
        if (j2 < 0) {
            j2 = d2 - (this.b.d(d2) + this.b.f(d2));
        }
        if (c2 < 0) {
            c2 = e2 - (this.b.h(d2) + this.b.a(d2));
        }
        this.D = c2 - (this.b.i(d2) + this.b.b(d2));
        boolean z6 = false;
        this.f.c = new Rect(0, 0, j2 - (this.b.e(j2) + this.b.g(j2)), this.D);
        v0 v0Var = this.f;
        Rect rect = v0Var.c;
        v0Var.a = rect.left;
        v0Var.b = rect.top;
        if (this.d.c() != null && (linearLayout2 = this.k) != null) {
            linearLayout2.setVisibility(0);
            a(this.d.c(), this.k, (j0) null, this.f);
            if (this.d.c().a0 != null && this.d.c().a0.h() != null) {
                if (this.d.c().f) {
                    this.d.c().a0.h().setVisibility(0);
                } else {
                    this.d.c().a0.h().setVisibility(8);
                }
            }
        }
        if (this.d.b() != null && (linearLayout = this.j) != null) {
            linearLayout.setVisibility(0);
            LinearLayout linearLayout6 = this.l;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
            a(this.d.b(), this.j, (j0) null, this.f);
            if (this.d.b().a0 != null && this.d.b().a0.h() != null) {
                if (this.d.b().f) {
                    this.d.b().a0.h().setVisibility(0);
                } else {
                    this.d.b().a0.h().setVisibility(8);
                }
            }
        }
        if (this.d.a() != null && this.d.a().size() > 0) {
            if (this.R == null) {
                this.R = new ArrayList<>();
            }
            for (int i2 = 0; i2 < this.d.a().size(); i2++) {
                b(this.d.a().get(i2), this.f);
                if (this.d.a().get(i2).a0 != null && this.d.a().get(i2).a0.h() != null) {
                    if (this.d.a().get(i2).f) {
                        this.d.a().get(i2).a0.h().setVisibility(0);
                    } else {
                        this.d.a().get(i2).a0.h().setVisibility(8);
                    }
                }
            }
        }
        zj zjVar2 = this.b;
        if (zjVar2 != null && !zjVar2.m.equalsIgnoreCase("popup") && this.b.t && this.e.a() != null) {
            a(this.e, true, this.f.c.width(), this.f.c.height(), false);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.q.measure(makeMeasureSpec, makeMeasureSpec);
        this.k.measure(makeMeasureSpec, makeMeasureSpec);
        this.l.measure(makeMeasureSpec, makeMeasureSpec);
        this.D -= (this.q.getMeasuredHeight() + this.k.getMeasuredHeight()) + this.l.getMeasuredHeight();
        this.f.c = new Rect(0, 0, j2 - (this.b.e(j2) + this.b.g(j2)), this.D);
        v0 v0Var2 = this.f;
        Rect rect2 = v0Var2.c;
        v0Var2.a = rect2.left;
        v0Var2.b = rect2.top;
        boolean z7 = false;
        for (int i3 = 0; i3 < this.b.e.size(); i3++) {
            yj elementAt = this.b.e.elementAt(i3);
            int i4 = elementAt.e;
            if (i4 != 17 && i4 != 31 && i4 != 8 && i4 != 42) {
                if (!z7) {
                    b();
                    z7 = true;
                }
                a(elementAt, (ViewGroup) null, (j0) null, this.f);
                n1 n1Var = elementAt.a0;
                if (n1Var != null && n1Var.h() != null) {
                    boolean z8 = elementAt.f;
                    View h2 = elementAt.a0.h();
                    if (z8) {
                        h2.setVisibility(0);
                    } else {
                        h2.setVisibility(8);
                    }
                }
            }
        }
        HashMap<String, hj> hashMap = this.b.P;
        if (hashMap != null) {
            if (hashMap.get("onshowkeypad") != null) {
                String[] split = this.b.P.get("onshowkeypad").b().split("&");
                boolean[] zArr = split.length > 0 ? new boolean[split.length] : null;
                z2 = false;
                for (int i5 = 0; i5 < split.length; i5++) {
                    if (split[i5].startsWith("c3lshow:")) {
                        split[i5] = split[i5].substring(8);
                    } else if (split[i5].startsWith("c3lhide:")) {
                        split[i5] = split[i5].substring(8);
                    }
                    if (!TextUtils.isEmpty(split[i5]) && (a3 = this.b.a(split[i5], (Vector<yj>) null)) != null) {
                        yj yjVar = a3.A0;
                        if (yjVar == null) {
                            z5 = true;
                        } else {
                            this.E.put(yjVar.a0.h(), a3.A0);
                            z5 = false;
                        }
                        n1 n1Var2 = a3.a0;
                        if (n1Var2 != null) {
                            this.E.put(n1Var2.h(), a3);
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
                    this.F = z4;
                }
            } else {
                z2 = false;
            }
            if (z2 || this.b.P.get("onhidekeypad") == null) {
                return;
            }
            String[] split2 = this.b.P.get("onhidekeypad").b().split("&");
            boolean[] zArr2 = split2.length > 0 ? new boolean[split2.length] : null;
            for (int i7 = 0; i7 < split2.length; i7++) {
                if (split2[i7].startsWith("c3lshow:")) {
                    split2[i7] = split2[i7].substring(8);
                } else if (split2[i7].startsWith("c3lhide:")) {
                    split2[i7] = split2[i7].substring(8);
                }
                if (!TextUtils.isEmpty(split2[i7]) && (a2 = this.b.a(split2[i7], (Vector<yj>) null)) != null) {
                    yj yjVar2 = a2.A0;
                    if (yjVar2 == null) {
                        z3 = true;
                    } else {
                        this.E.put(yjVar2.a0.h(), a2.A0);
                        z3 = false;
                    }
                    n1 n1Var3 = a2.a0;
                    if (n1Var3 != null) {
                        this.E.put(n1Var3.h(), a2);
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
                this.F = z6;
            }
        }
    }

    public static void c(lj ljVar, Context context, boolean z) {
        d(ljVar, context, z);
        b(ljVar, context, z);
    }

    private void c(yj yjVar, p0 p0Var, v0 v0Var) {
        com.comviva.webaxn.ui.f fVar = new com.comviva.webaxn.ui.f(this.a, v0Var);
        fVar.a(this.A);
        fVar.b(yjVar);
        yjVar.a0 = fVar;
        fVar.a(yjVar.k(this.f.c.width()), yjVar.c(com.comviva.webaxn.utils.b.a(this.a).a().b()));
        if (yjVar.x0 == null) {
            fVar.a(yjVar.v0);
        }
        fVar.a(p0Var);
        fVar.a(this.U);
        fVar.n();
    }

    static /* synthetic */ int d(o1 o1Var) {
        int i2 = o1Var.J;
        o1Var.J = i2 + 1;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r4.isChecked() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(defpackage.lj r13, android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.d(lj, android.content.Context, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r5.z.size() > 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(defpackage.yj r4, com.comviva.webaxn.ui.p0 r5, com.comviva.webaxn.ui.v0 r6) {
        /*
            r3 = this;
            java.util.Vector<kj> r5 = r4.P
            if (r5 != 0) goto L5
            return
        L5:
            int r5 = r4.R
            r0 = 2
            if (r5 != r0) goto L2d
            com.comviva.webaxn.ui.h r5 = new com.comviva.webaxn.ui.h
            android.content.Context r0 = r3.a
            r5.<init>(r0, r4, r6)
            com.comviva.webaxn.utils.x1$p r6 = r3.U
            r5.a(r6)
            android.widget.LinearLayout r6 = r3.A
            r5.a(r6)
            r4.a0 = r5
            r5.b(r4)
            r5.t()
            byte[] r4 = r4.v0
            r5.a(r4)
            r5.q()
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
            android.content.Context r0 = r3.a
            r5.<init>(r0, r4, r6)
            com.comviva.webaxn.utils.x1$p r6 = r3.U
            r5.a(r6)
            android.widget.LinearLayout r6 = r3.A
            r5.a(r6)
            r6 = 0
            r0 = 0
        L4b:
            java.util.Vector<kj> r1 = r4.P
            int r1 = r1.size()
            if (r0 >= r1) goto L63
            java.util.Vector<kj> r1 = r4.P
            java.lang.Object r1 = r1.elementAt(r0)
            kj r1 = (defpackage.kj) r1
            java.lang.String r1 = r1.a
            r5.b(r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            r4.a0 = r5
            r5.b(r4)
            r5.r()
            android.content.Context r0 = r3.a
            aj r0 = defpackage.aj.a(r0)
            java.lang.String r1 = r4.V
            java.lang.String r0 = r0.h(r1)
            java.lang.String r1 = r4.Q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L8b
            android.content.Context r0 = r3.a
            aj r0 = defpackage.aj.a(r0)
            java.lang.String r1 = r4.Q
            java.lang.String r0 = r0.h(r1)
        L8b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L9b
            int[] r1 = r4.U
            if (r1 == 0) goto L9b
            int r2 = r1.length
            if (r2 <= 0) goto L9b
            r6 = r1[r6]
            goto Lad
        L9b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto La5
            r5.c(r0)
            goto Lb0
        La5:
            java.util.ArrayList<java.lang.String> r0 = r5.z
            int r0 = r0.size()
            if (r0 <= 0) goto Lb0
        Lad:
            r5.i(r6)
        Lb0:
            r5.q()
            byte[] r4 = r4.v0
            r5.a(r4)
            r5.o()
            goto Ldd
        Lbc:
            com.comviva.webaxn.ui.s0 r5 = new com.comviva.webaxn.ui.s0
            android.content.Context r0 = r3.a
            r5.<init>(r0, r4, r6)
            com.comviva.webaxn.utils.x1$p r6 = r3.U
            r5.a(r6)
            android.widget.LinearLayout r6 = r3.A
            r5.a(r6)
            r4.a0 = r5
            r5.c(r4)
            r5.t()
            byte[] r4 = r4.v0
            r5.a(r4)
            r5.q()
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.d(yj, com.comviva.webaxn.ui.p0, com.comviva.webaxn.ui.v0):void");
    }

    static /* synthetic */ int e(o1 o1Var) {
        int i2 = o1Var.J;
        o1Var.J = i2 - 1;
        return i2;
    }

    private void e(yj yjVar, p0 p0Var, v0 v0Var) {
        com.comviva.webaxn.ui.p pVar = new com.comviva.webaxn.ui.p(this.a, yjVar, v0Var, this);
        pVar.a(this.A);
        yjVar.a0 = pVar;
        pVar.c(yjVar);
        pVar.a(this.U);
        String h2 = aj.a(this.a).h(yjVar.V);
        if (!TextUtils.isEmpty(yjVar.Q)) {
            h2 = aj.a(this.a).h(yjVar.Q);
        }
        if (h2 != null) {
            pVar.c(h2);
        }
        pVar.r();
        pVar.a(yjVar.v0);
        pVar.p();
    }

    private void f(yj yjVar, p0 p0Var, v0 v0Var) {
        u uVar = new u(this.a, yjVar, v0Var);
        uVar.a(p1.b);
        uVar.a(this.A);
        uVar.b(yjVar);
        yjVar.a0 = uVar;
        uVar.a(this.U);
        uVar.n();
    }

    private void g(yj yjVar, p0 p0Var, v0 v0Var) {
        bj bjVar;
        String str;
        v vVar = new v(this.a, yjVar, v0Var, this);
        vVar.a(this.U);
        int a2 = vVar.a(yjVar.R, yjVar.K, yjVar.l);
        int i2 = yjVar.S;
        if (i2 > 0) {
            vVar.j(i2);
        }
        String str2 = yjVar.o;
        if (str2 != null) {
            vVar.d(str2);
        }
        if (yjVar.b()) {
            vVar.h(yjVar.a());
        }
        if (a2 != 3 && a2 != 6) {
            String h2 = aj.a(this.a).h(yjVar.V);
            if (!TextUtils.isEmpty(yjVar.Q)) {
                h2 = aj.a(this.a).h(yjVar.Q);
            }
            if (TextUtils.isEmpty(h2)) {
                h2 = aj.a(this.a).g(yjVar.V);
            }
            if (TextUtils.isEmpty(h2) && (str = yjVar.n) != null) {
                h2 = str;
            }
            vVar.f(h2);
        }
        com.comviva.webaxn.utils.u uVar = yjVar.p;
        if (uVar != null) {
            if (uVar.k()) {
                vVar.b(yjVar.p.c());
            }
            if (yjVar.p.j()) {
                vVar.a(yjVar.p.b());
            }
            vVar.b(yjVar.p.f());
            vVar.i(yjVar.p.g());
            vVar.a(yjVar.p.d());
        }
        if (yjVar.K0 == 1 && (bjVar = yjVar.L0) != null && bjVar.d() != -1) {
            vVar.h(yjVar.L0.d());
        }
        if (yjVar.K0 == 4) {
            vVar.a(false);
            vVar.b(0);
        }
        vVar.a(yjVar.r);
        vVar.a(p0Var);
        vVar.a((ViewGroup) this.A);
        yjVar.a0 = vVar;
        vVar.b(yjVar);
        bj bjVar2 = yjVar.L0;
        if (bjVar2 != null) {
            vVar.a(bjVar2.f(), yjVar.L0.g());
            if (yjVar.L0.d() != -1) {
                vVar.h(yjVar.L0.d());
            }
        }
        vVar.a(v0Var);
        vVar.t();
        vVar.a(yjVar.v0);
        vVar.q();
    }

    private void h(yj yjVar, p0 p0Var, v0 v0Var) {
        b0 b0Var = new b0(this.a, yjVar, v0Var);
        b0Var.a(this.A);
        yjVar.a0 = b0Var;
        b0Var.b(yjVar);
        b0Var.a(this.U);
        b0Var.n();
        b0Var.a(yjVar.v0);
        b0Var.m();
    }

    private void i(yj yjVar, p0 p0Var, v0 v0Var) {
        e0 e0Var = new e0(this.a, yjVar, v0Var);
        e0Var.a(this.A);
        String str = !TextUtils.isEmpty(yjVar.n) ? yjVar.n : yjVar.o;
        e0Var.b(yjVar);
        e0Var.b(str);
        yjVar.a0 = e0Var;
        com.comviva.webaxn.utils.b.a(this.a).a().b();
        e0Var.b(yjVar.t0);
        e0Var.a(p0Var);
        e0Var.a(this.U);
        e0Var.q();
        e0Var.a(yjVar.v0);
    }

    static /* synthetic */ int j(o1 o1Var) {
        int i2 = o1Var.N;
        o1Var.N = i2 + 1;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
    
        if (r3 != null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j(defpackage.yj r8, com.comviva.webaxn.ui.p0 r9, com.comviva.webaxn.ui.v0 r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.j(yj, com.comviva.webaxn.ui.p0, com.comviva.webaxn.ui.v0):void");
    }

    private void k(yj yjVar, p0 p0Var, v0 v0Var) {
        String str;
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(yjVar.n) ? yjVar.o : yjVar.n;
        String h2 = aj.a(this.a).h(yjVar.V);
        if (!TextUtils.isEmpty(yjVar.Q)) {
            h2 = aj.a(this.a).h(yjVar.Q);
        }
        if (h2 != null) {
            str2 = h2;
        }
        h0 h0Var = new h0(this.a, str2);
        h0Var.a(this.A);
        yjVar.a0 = h0Var;
        h0Var.b(yjVar);
        h0Var.c(yjVar.p.f());
        h0Var.g(yjVar.p.g());
        h0Var.a(yjVar.p.d());
        h0Var.b(yjVar.p.e());
        if (true != yjVar.b || (yjVar.i == null && yjVar.k == null && ((str = yjVar.m) == null || (!str.equalsIgnoreCase("close") && !yjVar.m.equalsIgnoreCase("exit"))))) {
            z = false;
        }
        h0Var.a(z);
        if (yjVar.t0 != null || yjVar.N != null) {
            h0Var.b(yjVar.t0);
        }
        h0Var.c(yjVar);
        h0Var.a(p0Var);
        h0Var.a(this.U);
        h0Var.a(v0Var);
        h0Var.a(yjVar.v0);
        h0Var.r();
    }

    private void l(yj yjVar, p0 p0Var, v0 v0Var) {
        y0 y0Var = new y0(this.a, yjVar, this.b);
        y0Var.a(this.A);
        y0Var.b(yjVar);
        yjVar.a0 = y0Var;
        y0Var.a(p0Var);
        y0Var.a(this.U);
        y0Var.a(v0Var);
        y0Var.a(yjVar.v0);
        y0Var.n();
    }

    private void m(yj yjVar, p0 p0Var, v0 v0Var) {
        e1 e1Var = new e1(this.a, v0Var);
        e1Var.a(this.A);
        e1Var.a(p0Var);
        yjVar.a0 = e1Var;
        e1Var.b(yjVar);
        e1Var.a(this.U);
        e1Var.m();
    }

    private void n(yj yjVar, p0 p0Var, v0 v0Var) {
        l1 l1Var = new l1(this.a, yjVar, v0Var);
        l1Var.a(this.A);
        l1Var.b(yjVar);
        yjVar.a0 = l1Var;
        l1Var.a(yjVar.k(this.f.c.width()), yjVar.c(this.f.c.height()));
        l1Var.a(p0Var);
        l1Var.a(this.U);
        l1Var.n();
    }

    public void A() {
        z();
        this.y.removeAllViews();
    }

    public void B() {
        s().removeAllViews();
        s().addView(this.v);
    }

    public void C() {
        n1 n1Var = this.Q;
        if (n1Var != null) {
            if (n1Var instanceof com.comviva.webaxn.ui.a) {
                ((com.comviva.webaxn.ui.a) n1Var).n();
            } else if (n1Var instanceof h1) {
                ((h1) n1Var).n();
            }
            this.Q = null;
        }
    }

    public void D() {
        com.comviva.webaxn.utils.o1 o1Var = this.P;
        if (o1Var != null) {
            o1Var.a();
            this.P = null;
        }
    }

    public void E() {
        HashMap<String, ArrayList<String>> hashMap = this.G;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void F() {
        ak a2 = this.b.a("statuscolor");
        if (a2 != null) {
            String b2 = a2.b();
            if (TextUtils.isEmpty(b2)) {
                return;
            }
            ((WebAxnActivity) this.a).a(b2);
        }
    }

    @TargetApi(14)
    public void a() {
        if (Build.VERSION.SDK_INT < 14 || ViewConfiguration.get(this.a).hasPermanentMenuKey()) {
            a(((WebAxnActivity) this.a).a());
            return;
        }
        ActionBar actionBar = ((Activity) this.a).getActionBar();
        if (actionBar != null) {
            if (a(((WebAxnActivity) this.a).a())) {
                actionBar.show();
            } else {
                actionBar.hide();
            }
        }
    }

    public void a(float f2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, f2, 0.0f, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new k());
        this.w.startAnimation(translateAnimation);
    }

    public void a(int i2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, i2, 0.0f, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new l());
        this.w.startAnimation(translateAnimation);
    }

    public void a(int i2, int i3) {
        int x = x();
        int d2 = com.comviva.webaxn.utils.b.a(this.a).a().d();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3, x);
        layoutParams.setMargins(this.b.d(d2), this.b.h(d2), this.b.f(d2), this.b.a(d2));
        r().setLayoutParams(layoutParams);
        r().setPadding(this.b.e(d2), this.b.i(d2), this.b.g(d2), this.b.b(d2));
        this.z.setBackgroundColor(0);
        this.z.setGravity(x);
        this.x.setGravity(x);
        this.v.setBackgroundColor(-1073741824);
    }

    public void a(MenuItem menuItem) {
        x1.a(this.a, (yj) null, this.y.getWindowToken());
        a(menuItem.getTitle().toString(), (mj) null, (lj) null);
    }

    public void a(View view, yj yjVar) {
        n1 n1Var;
        if (yjVar != null && (n1Var = yjVar.a0) != null && n1Var.h() != null) {
            if (yjVar.f) {
                yjVar.f = false;
            }
            if (yjVar.a0.h().getVisibility() != 0) {
                return;
            } else {
                view = yjVar.a0.h();
            }
        } else if (view == null || view.getVisibility() != 0) {
            return;
        }
        view.setVisibility(8);
    }

    public void a(NestedScrollView nestedScrollView) {
        this.n = nestedScrollView;
    }

    public void a(com.comviva.webaxn.ui.b bVar) {
        this.u = bVar;
    }

    public void a(com.comviva.webaxn.utils.o1 o1Var) {
        this.P = o1Var;
    }

    public void a(String str, String str2, String str3, mj mjVar) {
        String str4;
        lj ljVar = this.d;
        if (ljVar == null || ljVar.f() == null) {
            return;
        }
        zj f2 = ljVar.f();
        String str5 = null;
        yj a2 = f2.a(str, (Vector<yj>) null);
        if (a2 == null || a2.e != 3) {
            HashMap<String, String> hashMap = f2.r;
            if (hashMap != null) {
                str4 = hashMap.get(str);
            }
            str4 = null;
        } else {
            n1 n1Var = a2.a0;
            if (n1Var instanceof v) {
                str4 = ((v) n1Var).m();
            } else {
                if (n1Var instanceof w) {
                    str4 = ((w) n1Var).m();
                }
                str4 = null;
            }
        }
        yj a3 = f2.a(str2, (Vector<yj>) null);
        if (a3 == null || a3.e != 3) {
            HashMap<String, String> hashMap2 = f2.r;
            if (hashMap2 != null) {
                str5 = hashMap2.get(str2);
            }
        } else {
            n1 n1Var2 = a3.a0;
            if (n1Var2 instanceof v) {
                str5 = ((v) n1Var2).m();
            } else if (n1Var2 instanceof w) {
                str5 = ((w) n1Var2).m();
            }
        }
        x1.a(this.a, str4 == null ? str : str4, str5 == null ? str2 : str5, str3, zi.i, mjVar, this.d, false);
    }

    public void a(String str, yj yjVar) {
        if (TextUtils.isEmpty(str) || this.c.a(str, false, yjVar, null, f(), this.d)) {
            return;
        }
        this.c.a(f(), this.d);
        this.c.c(f(), this.d);
        zj f2 = this.d.f();
        if (f2 != null) {
            for (int i2 = 0; i2 < f2.e.size(); i2++) {
                this.c.a(f2.e.elementAt(i2));
            }
        }
        if (this.c.a(str, false, false, f(), false, false, null, this.d) > 0) {
            this.c.E();
        }
    }

    public void a(lj ljVar, Context context, boolean z) {
        e0 e0Var;
        n1 n1Var;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i2 = 0;
        ljVar.k = false;
        this.I = q();
        this.J = 0;
        ArrayList<yj> arrayList = this.L;
        if (arrayList == null || arrayList.size() <= 0) {
            this.L = new ArrayList<>();
        } else {
            this.L.clear();
        }
        zj f2 = ljVar.f();
        int d2 = com.comviva.webaxn.utils.b.a(this.a).a().d();
        int e2 = com.comviva.webaxn.utils.b.a(this.a).a().e();
        int j2 = f2.j(d2);
        int c2 = f2.c(e2);
        if (f2.m.equalsIgnoreCase("popup")) {
            a(j2, c2);
        } else {
            this.y.getLayoutParams().height = -1;
            this.y.getLayoutParams().width = -1;
            ((FrameLayout.LayoutParams) r().getLayoutParams()).setMargins(this.b.d(d2), this.b.h(d2), this.b.f(d2), this.b.a(d2));
            r().setPadding(this.b.e(d2), this.b.i(d2), this.b.g(d2), this.b.b(d2));
        }
        if (j2 < 0) {
            j2 = d2 - (f2.d(d2) + f2.f(d2));
        }
        int i3 = j2;
        if (c2 < 0) {
            c2 = e2 - (f2.h(d2) + f2.a(d2));
        }
        int i4 = c2;
        this.D = i4 - (f2.i(d2) + f2.b(d2));
        v0 v0Var = new v0();
        Rect rect = new Rect(0, 0, i3 - (f2.e(i3) + f2.g(i3)), this.D);
        v0Var.c = rect;
        v0Var.a = rect.left;
        v0Var.b = rect.top;
        if (ljVar.c() != null && (linearLayout2 = this.k) != null) {
            linearLayout2.setVisibility(0);
            if (ljVar.c().a0 == null || !((ljVar.c().a0 instanceof k0) || (ljVar.c().a0 instanceof l0))) {
                a(ljVar.c(), this.k, (j0) null, this.f);
                if (ljVar.c().a0 != null && ljVar.c().a0.h() != null) {
                    if (ljVar.c().f) {
                        ljVar.c().a0.h().setVisibility(0);
                    } else {
                        ljVar.c().a0.h().setVisibility(8);
                    }
                }
            } else {
                ljVar.c().a0.a((j0) null, v0Var);
            }
        }
        if (ljVar.b() != null && (linearLayout = this.j) != null) {
            linearLayout.setVisibility(0);
            if (ljVar.b().a0 == null || !((ljVar.b().a0 instanceof k0) || (ljVar.b().a0 instanceof l0))) {
                a(ljVar.b(), this.j, (j0) null, this.f);
                if (ljVar.b().a0 != null && ljVar.b().a0.h() != null) {
                    if (ljVar.b().f) {
                        ljVar.b().a0.h().setVisibility(0);
                    } else {
                        ljVar.b().a0.h().setVisibility(8);
                    }
                }
            } else {
                ljVar.b().a0.a((j0) null, v0Var);
            }
        }
        if (ljVar.a() != null && ljVar.a().size() > 0) {
            if (this.R == null) {
                this.R = new ArrayList<>();
            }
            for (int i5 = 0; i5 < ljVar.a().size(); i5++) {
                if (ljVar.a().get(i5).a0 == null || !((ljVar.a().get(i5).a0 instanceof k0) || (ljVar.a().get(i5).a0 instanceof l0))) {
                    b(ljVar.a().get(i5), this.f);
                    if (ljVar.a().get(i5).a0 != null && ljVar.a().get(i5).a0.h() != null) {
                        if (ljVar.a().get(i5).f) {
                            ljVar.a().get(i5).a0.h().setVisibility(0);
                        } else {
                            ljVar.a().get(i5).a0.h().setVisibility(8);
                        }
                    }
                } else {
                    v0Var.n = true;
                    ljVar.a().get(i5).a0.a((j0) null, v0Var);
                }
            }
        }
        zj zjVar = this.b;
        if (zjVar != null && !zjVar.m.equalsIgnoreCase("popup") && this.b.t && this.e.a() != null) {
            a(this.e, true, this.f.c.width(), this.f.c.height(), true);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.q.measure(makeMeasureSpec, makeMeasureSpec);
        this.k.measure(makeMeasureSpec, makeMeasureSpec);
        this.l.measure(makeMeasureSpec, makeMeasureSpec);
        this.D -= (this.q.getMeasuredHeight() + this.k.getMeasuredHeight()) + this.l.getMeasuredHeight();
        int e3 = i3 - (f2.e(i3) + f2.g(i3));
        int i6 = this.D;
        Rect rect2 = new Rect(0, 0, e3, i6 - (f2.i(i6) + f2.b(this.D)));
        v0Var.c = rect2;
        v0Var.a = rect2.left;
        v0Var.b = rect2.top;
        if (f2 != null && !f2.m.equalsIgnoreCase("confirm") && !f2.m.equalsIgnoreCase("error") && !f2.m.equalsIgnoreCase("info") && !f2.m.equalsIgnoreCase("toast") && f2.e != null) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < f2.e.size()) {
                yj elementAt = f2.e.elementAt(i7);
                int i9 = elementAt.e;
                if (i9 != 17 && i9 != 31 && i9 != 8 && i9 != 42) {
                    if (i9 == 23 || elementAt.a0 != null) {
                        if (elementAt.e != 23) {
                            i8++;
                        }
                        if (!elementAt.f && (n1Var = elementAt.a0) != null) {
                            n1Var.h().setVisibility(8);
                        } else if (elementAt.z0 != null) {
                            n1 n1Var2 = elementAt.a0;
                            if (n1Var2 != null) {
                                if (!(n1Var2 instanceof k0) && !(n1Var2 instanceof l0)) {
                                }
                                elementAt.a0.a((j0) null, v0Var);
                            }
                        } else {
                            int i10 = elementAt.e;
                            if (i10 != 1 && i10 != 13 && i10 != 26 && i10 != 10 && i10 != 11 && i10 != 3 && i10 != 22 && i10 != 27 && i10 != 2 && i10 != 4 && i10 != 30 && i10 != 6) {
                                if (f2.m != "grid" && ((i10 == 13 || i10 == 26) && (e0Var = (e0) elementAt.a0) != null)) {
                                    e0Var.a(elementAt.k(i3), elementAt.c(i4));
                                }
                            }
                            elementAt.a0.a((j0) null, v0Var);
                        }
                    } else {
                        a(elementAt, (ViewGroup) null, (j0) null, this.f);
                        n1 n1Var3 = elementAt.a0;
                        if (n1Var3 != null && n1Var3.h() != null) {
                            this.A.removeView(elementAt.a0.h());
                            this.A.addView(elementAt.a0.h(), i8);
                            boolean z2 = elementAt.f;
                            View h2 = elementAt.a0.h();
                            if (z2) {
                                h2.setVisibility(i2);
                            } else {
                                h2.setVisibility(8);
                            }
                        }
                        i8++;
                    }
                }
                i7++;
                i2 = 0;
            }
        }
        y();
    }

    public void a(mj mjVar) {
        this.e = mjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.mj r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.a(mj, java.lang.String):void");
    }

    public void a(mj mjVar, lj ljVar, boolean z, boolean z2, boolean z3, boolean z4) {
        int U;
        com.comviva.webaxn.utils.e eVar;
        this.E.clear();
        this.e = mjVar;
        this.d = ljVar;
        if (mjVar == null && ljVar == null) {
            return;
        }
        if (z && g() != null) {
            this.B = g().getScrollX();
            this.C = g().getScrollY();
        }
        this.b = this.d.f();
        this.I = q();
        this.J = 0;
        A();
        F();
        zj zjVar = this.b;
        if (zjVar != null && !TextUtils.isEmpty(zjVar.h)) {
            this.e.b(this.b.h);
        }
        this.e.t();
        zj zjVar2 = this.b;
        if (zjVar2 != null && zjVar2.a() != null) {
            zj zjVar3 = this.b;
            if (a(zjVar3, zjVar3.a())) {
                this.b.p = true;
            }
        } else if (this.c.e() != null || this.c.p() != null) {
            a(this.b, this.c.e());
        } else if (!a(this.b, (byte[]) null)) {
            zj zjVar4 = this.b;
            if (zjVar4 != null && (eVar = zjVar4.j) != null) {
                U = eVar.t;
            } else if (this.d.k()) {
                zjVar4 = this.b;
                U = this.d.h();
            } else if (com.comviva.webaxn.utils.j1.a(this.a).h() != null && com.comviva.webaxn.utils.j1.a(this.a).h().equals("true")) {
                zjVar4 = this.b;
                U = com.comviva.webaxn.utils.j1.a(this.a).U();
            }
            a(zjVar4, U);
        }
        a(this.e, true == this.e.t() ? this.e.q() : null);
        a();
        b(z);
        c(this.d, this.a, false);
        zj zjVar5 = this.b;
        if (zjVar5 != null && zjVar5.c != null && !z) {
            if ((this.a.getPackageName().equals("com.comviva.ecosubs") || this.a.getPackageName().equals("com.comviva.ecosubsuat") || this.a.getPackageName().equals("com.comviva.preecoprod") || this.a.getPackageName().equals("com.comviva.econetprod")) && com.comviva.webaxn.utils.j1.a(this.a).s0() == null) {
                this.c.a((String) null, false, true);
            } else {
                this.b.c.a(this.U);
                this.b.c.a(z2, true, this);
            }
        }
        if (this.b.P != null) {
            u();
        }
        if (z3) {
            a(false);
        }
        if (!z || g() == null) {
            this.B = 0;
            this.C = 0;
        } else {
            g().post(new b());
        }
        try {
            String b2 = this.b.a("clearsession") != null ? this.b.a("clearsession").b() : null;
            if (!TextUtils.isEmpty(b2) && b2.equals("1")) {
                com.comviva.webaxn.utils.j1.a(this.a).y(0);
            }
        } catch (Exception unused) {
        }
        if (z || TextUtils.isEmpty(this.b.J)) {
            return;
        }
        p1.a(this.a, this.b.J, this, (yj) null);
    }

    public void a(mj mjVar, boolean z, int i2, int i3, boolean z2) {
        TextView textView;
        Bitmap bitmap;
        if (mjVar.a().b() == 0 && mjVar.a().e() != null) {
            try {
                bitmap = com.comviva.webaxn.utils.e1.b(this.a).a(mjVar.a().f());
                if (bitmap == null) {
                    try {
                        bitmap = BitmapFactory.decodeByteArray(mjVar.a().e(), 0, mjVar.a().e().length);
                        if (bitmap != null) {
                            com.comviva.webaxn.utils.e1.b(this.a).a(mjVar.a().f(), bitmap);
                        }
                    } catch (OutOfMemoryError unused) {
                    }
                }
            } catch (OutOfMemoryError unused2) {
                bitmap = null;
            }
            if (bitmap != null) {
                this.h.setImageBitmap(bitmap);
                this.h.setVisibility(0);
                double height = bitmap.getHeight();
                double width = bitmap.getWidth();
                Double.isNaN(height);
                Double.isNaN(width);
                this.i = height / width;
                float a2 = com.comviva.webaxn.utils.b.a(this.a).a().a();
                int a3 = x1.a(mjVar.a().c(), i3, a2);
                int a4 = x1.a(mjVar.a().d(), i2, a2);
                if (a4 > 0) {
                    if (a3 <= 0) {
                        double d2 = a4;
                        double d3 = this.i;
                        Double.isNaN(d2);
                        a3 = (int) Math.round(d2 * d3);
                    }
                    i2 = a4;
                } else if (a3 > 0) {
                    double d4 = a3;
                    double d5 = this.i;
                    Double.isNaN(d4);
                    i2 = (int) Math.round(d4 / d5);
                } else {
                    double d6 = i2;
                    double d7 = this.i;
                    Double.isNaN(d6);
                    a3 = (int) Math.round(d6 * d7);
                }
                this.h.getLayoutParams().height = a3;
                this.h.getLayoutParams().width = i2;
                this.h.setScaleType(ImageView.ScaleType.FIT_XY);
                LinearLayout linearLayout = this.m;
                if (linearLayout != null) {
                    linearLayout.getLayoutParams().height = a3;
                    this.h.getLayoutParams().height = a3;
                    this.h.getLayoutParams().width = i2;
                    this.m.setVisibility(0);
                }
                int U = com.comviva.webaxn.utils.j1.a(this.a).U();
                com.comviva.webaxn.utils.e eVar = this.b.j;
                if (eVar != null) {
                    U = eVar.t;
                }
                ej ejVar = this.b.O;
                if (ejVar != null) {
                    Drawable a5 = x1.a(ejVar, U);
                    this.o = a5;
                    this.m.setBackgroundDrawable(a5);
                } else {
                    this.m.setBackgroundColor(n1.d(U));
                }
                LinearLayout linearLayout2 = this.l;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
            }
            TextView textView2 = this.g;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else if (!z2 && mjVar.a().b() == 1 && this.m != null && mjVar.a().a() != null) {
            TapsellSDKAdv tapsellSDKAdv = new TapsellSDKAdv();
            this.S = tapsellSDKAdv;
            tapsellSDKAdv.a(this.a, mjVar.a().a().a(), mjVar.a().a().b());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.bottomMargin = (int) (com.comviva.webaxn.utils.b.a(this.a).a().a() * 2.0f);
            this.m.addView(this.S.a(), layoutParams);
            this.m.setVisibility(0);
            LinearLayout linearLayout3 = this.l;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
        }
        if (this.e.m() != null && (textView = this.g) != null) {
            textView.setSelected(true);
            this.g.setSingleLine(true);
            this.g.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.g.setMarqueeRepeatLimit(-1);
            this.g.setText(this.e.m());
            this.g.setTextColor(this.e.n());
            this.g.setBackgroundColor(this.e.l());
            this.g.setTextSize(this.e.p());
            if (Build.VERSION.SDK_INT >= 21) {
                this.g.setLetterSpacing(this.e.o());
            }
            LinearLayout linearLayout4 = this.m;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            this.g.setVisibility(0);
            LinearLayout linearLayout5 = this.l;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(0);
            }
        }
        if (z) {
            LinearLayout linearLayout6 = this.m;
            if (linearLayout6 != null && linearLayout6.getVisibility() == 0) {
                this.m.setOnClickListener(new q(mjVar));
                this.E.put(this.m, null);
            }
            TextView textView3 = this.g;
            if (textView3 == null || textView3.getVisibility() != 0) {
                return;
            }
            this.g.setOnClickListener(new q(mjVar));
            this.E.put(this.g, null);
        }
    }

    public void a(pj pjVar, wj wjVar, mj mjVar) {
        boolean z;
        String a2 = pjVar.a();
        String e2 = pjVar.e();
        String f2 = pjVar.f();
        String c2 = pjVar.c();
        pjVar.h();
        String str = null;
        if (!TextUtils.isEmpty(pjVar.b())) {
            p1.a(this.a, pjVar.b(), wjVar.t(), (yj) null);
        }
        if (!TextUtils.isEmpty(f2)) {
            wjVar.a(f2, pjVar.g());
            z = wjVar.a(f2, mjVar, this.d);
            if (!z) {
                Context context = this.a;
                if (context instanceof WebAxnActivity) {
                    try {
                        InputStream open = ((WebAxnActivity) context).getAssets().open(f2 + ".wbxml");
                        byte[] bArr = new byte[open.available()];
                        open.read(bArr);
                        open.close();
                        wjVar.a(bArr, null, wj.h.WBXML_BUFFER, null, true, false, true);
                        z = true;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
            if (z) {
                if (c2 != null) {
                    wjVar.b(c2, mjVar, this.d);
                    return;
                }
                return;
            }
        } else if (TextUtils.isEmpty(e2)) {
            z = false;
        } else {
            wjVar.a(e2, pjVar.g());
            z = wjVar.a(e2, mjVar, this.d);
            if (z) {
                if (c2 != null) {
                    wjVar.b(c2, mjVar, this.d);
                    return;
                }
                return;
            } else if (!TextUtils.isEmpty(a2) && !a2.equals("Menulist:")) {
                str = a2;
            }
        }
        if (!z && TextUtils.isEmpty(str) && !TextUtils.isEmpty(a2)) {
            str = a2;
        }
        if (!TextUtils.isEmpty(str)) {
            if (!wjVar.a(str, false, null, null, mjVar, this.d)) {
                wjVar.a(mjVar, this.d);
                wjVar.c(mjVar, this.d);
                zj f3 = this.d.f();
                if (f3 != null) {
                    for (int i2 = 0; i2 < f3.e.size(); i2++) {
                        wjVar.a(f3.e.elementAt(i2));
                    }
                }
                wjVar.a(str, pjVar.g());
                if (wjVar.a(str, false, false, mjVar, false, false, null, this.d) > 0) {
                    wjVar.E();
                }
            }
        }
        if (c2 != null) {
            wjVar.b(c2, mjVar, this.d);
        }
    }

    public void a(wj.i iVar) {
        this.T = iVar;
    }

    public void a(yj yjVar) {
        this.L.add(yjVar);
    }

    public void a(yj yjVar, ViewGroup viewGroup, j0 j0Var, v0 v0Var) {
        HashMap<View, yj> hashMap;
        View h2;
        int i2;
        int i3;
        if (viewGroup == null) {
            viewGroup = this.A;
        }
        try {
            if (yjVar.a0 != null) {
                yjVar.a0.b();
                yjVar.a0 = null;
            }
            if (yjVar.b0 != null) {
                yjVar.b0.clear();
            }
        } catch (Exception unused) {
        }
        if (yjVar.z0 == null && (i3 = yjVar.e) != 33 && i3 != 36) {
            a(yjVar, new p0(yjVar.e(v0Var.c.width()), yjVar.j(v0Var.c.width()), yjVar.h(v0Var.c.width()), yjVar.b(v0Var.c.width()), 1.0f), v0Var);
            return;
        }
        int i4 = yjVar.i0;
        if (i4 == 2 || i4 == 3) {
            l0 l0Var = new l0(this.a, yjVar, this, j0Var, v0Var);
            l0Var.a(viewGroup);
            yjVar.a0 = l0Var;
            l0Var.a(this.U);
            l0Var.n();
            l0Var.m();
            int i5 = yjVar.e;
            if (i5 != 8 && i5 != 31) {
                return;
            }
            hashMap = this.E;
            h2 = l0Var.h();
        } else {
            if (i4 != 0 && i4 != 1 && i4 != 4 && (i2 = yjVar.e) != 33 && i2 != 39 && i2 != 40 && i2 != 42) {
                return;
            }
            k0 k0Var = new k0(this.a, yjVar, this, j0Var, v0Var, viewGroup);
            k0Var.a(viewGroup);
            yjVar.a0 = k0Var;
            k0Var.a(this.U);
            k0Var.o();
            k0Var.n();
            int i6 = yjVar.e;
            if (i6 != 8 && i6 != 31) {
                return;
            }
            hashMap = this.E;
            h2 = k0Var.h();
        }
        hashMap.put(h2, yjVar);
    }

    public void a(yj yjVar, p0 p0Var, v0 v0Var) {
        int i2 = yjVar.e;
        if (i2 == 22 || i2 == 27) {
            j(yjVar, p0Var, v0Var);
            return;
        }
        if (i2 == 2) {
            k(yjVar, p0Var, v0Var);
            return;
        }
        if (i2 == 13 || i2 == 26) {
            i(yjVar, p0Var, v0Var);
            return;
        }
        if (i2 == 4) {
            d(yjVar, p0Var, v0Var);
            return;
        }
        if (i2 == 3) {
            g(yjVar, p0Var, v0Var);
            return;
        }
        if (i2 == 1) {
            b(yjVar, p0Var, v0Var);
            return;
        }
        if (i2 == 14) {
            m(yjVar, p0Var, v0Var);
            return;
        }
        if (i2 == 24) {
            h(yjVar, p0Var, v0Var);
            return;
        }
        if (i2 == 23) {
            a(yjVar, v0Var);
            return;
        }
        if (i2 == 6) {
            e(yjVar, p0Var, v0Var);
            return;
        }
        if (i2 == 10 || i2 == 11) {
            c(yjVar, p0Var, v0Var);
            return;
        }
        if (i2 == 9) {
            f(yjVar, p0Var, v0Var);
        } else if (i2 == 30) {
            n(yjVar, p0Var, v0Var);
        } else if (i2 == 34) {
            l(yjVar, p0Var, v0Var);
        }
    }

    public void a(zj zjVar, int i2) {
        RelativeLayout relativeLayout = this.x;
        ej ejVar = zjVar.O;
        if (ejVar == null) {
            relativeLayout.setBackgroundColor(n1.d(i2));
            return;
        }
        Drawable a2 = x1.a(ejVar, i2);
        this.o = a2;
        relativeLayout.setBackgroundDrawable(a2);
    }

    public boolean a(Menu menu) {
        if (menu == null) {
            return false;
        }
        menu.clear();
        lj ljVar = this.d;
        if (ljVar == null || ljVar.d() == null) {
            return false;
        }
        int size = this.d.d().size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            com.comviva.webaxn.utils.e eVar = this.d.d().get(i2);
            if (eVar.h != null || !eVar.g.equalsIgnoreCase("ok")) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(eVar.f);
                spannableStringBuilder.setSpan(com.comviva.webaxn.utils.v.a(com.comviva.webaxn.utils.j1.a(this.a).y()), 0, eVar.f.length(), 0);
                menu.add(spannableStringBuilder).setTitleCondensed(eVar.f);
                if (eVar.q == 0 && size > 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean a(String str, String str2) {
        ArrayList<String> arrayList;
        if (str != null && str2 != null && this.G.containsKey(str) && (arrayList = this.G.get(str)) != null) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r21, java.util.Vector<com.comviva.webaxn.utils.e> r22, defpackage.mj r23) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.a(java.lang.String, java.util.Vector, mj):boolean");
    }

    public boolean a(String str, mj mjVar, lj ljVar) {
        if (mjVar == null) {
            mjVar = this.e;
        }
        if (ljVar == null) {
            ljVar = this.d;
        }
        if (ljVar == null || ljVar.d() == null) {
            return false;
        }
        return a(str, ljVar.d(), mjVar);
    }

    public boolean a(zj zjVar, byte[] bArr) {
        RelativeLayout relativeLayout = this.x;
        int d2 = com.comviva.webaxn.utils.b.a(this.a).a().d();
        int e2 = com.comviva.webaxn.utils.b.a(this.a).a().e();
        zj zjVar2 = this.b;
        int identifier = (zjVar2 == null || TextUtils.isEmpty(zjVar2.i)) ? 0 : this.a.getResources().getIdentifier(this.b.i, "drawable", this.a.getPackageName());
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.a).a(this.b.i);
                if (a2 == null && (a2 = com.comviva.webaxn.utils.d.a(this.a.getResources(), d2, e2, true, identifier, null)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.a).a(this.b.i, a2);
                }
                relativeLayout.setBackgroundDrawable(NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2));
            } else {
                if (bArr == null) {
                    relativeLayout.setBackgroundDrawable(null);
                    return false;
                }
                String str = this.b.n;
                if (TextUtils.isEmpty(str)) {
                    str = this.c.f();
                }
                String str2 = str;
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.a).a(str2);
                if (a3 == null && (a3 = com.comviva.webaxn.utils.d.a(this.a.getResources(), d2, e2, false, -1, bArr)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.a).a(str2, a3);
                }
                relativeLayout.setBackgroundDrawable(NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3));
            }
            return true;
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        } catch (OutOfMemoryError e4) {
            e4.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r25.y.startAnimation(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        if (r25.b.m.equalsIgnoreCase("popup") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        if (r25.b.m.equalsIgnoreCase("popup") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        r25.v.startAnimation(r1);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(boolean r26) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.a(boolean):boolean");
    }

    public long b(int i2) {
        SparseArray<Long> sparseArray = this.M;
        if (sparseArray == null || sparseArray.get(i2) == null) {
            return -1L;
        }
        return this.M.get(i2).longValue();
    }

    public void b() {
        LinearLayout linearLayout = new LinearLayout(this.a);
        this.A = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        if (!this.b.b()) {
            a(new NestedScrollView(this.a));
            g().setVerticalScrollBarEnabled(false);
            g().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            g().setFillViewport(true);
            g().addView(this.A, layoutParams);
        }
        HashMap<String, hj> hashMap = this.b.P;
        if (hashMap == null || hashMap.get("pulltorefresh") == null) {
            if (g() != null) {
                this.y.addView(g());
                return;
            } else {
                this.y.addView(this.A, layoutParams);
                return;
            }
        }
        r0 r0Var = new r0(this.a);
        this.y.addView(r0Var, new ViewGroup.LayoutParams(-1, -1));
        r0Var.setRenderingEventCb(this.U);
        r0Var.setPullToRefreshAction(this.b.P.get("pulltorefresh").b());
        r0Var.setAPM(this.b.P.get("pulltorefresh").a());
        if (g() == null) {
            r0Var.addView(this.A, layoutParams);
        } else {
            r0Var.setScrollView(g());
            r0Var.addView(g());
        }
    }

    public void b(View view, yj yjVar) {
        n1 n1Var;
        if (yjVar != null && (n1Var = yjVar.a0) != null && n1Var.h() != null) {
            if (!yjVar.f) {
                yjVar.f = true;
            }
            if (yjVar.a0.h().getVisibility() != 8) {
                return;
            } else {
                view = yjVar.a0.h();
            }
        } else if (view == null || view.getVisibility() != 8) {
            return;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.pj r5, defpackage.wj r6, defpackage.mj r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L6c
            java.lang.String r0 = r5.a()
            java.lang.String r1 = r5.e()
            java.lang.String r2 = r5.f()
            java.lang.String r3 = r5.c()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L2a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2a
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L6c
        L2a:
            boolean r0 = com.comviva.webaxn.utils.x1.e()
            if (r0 != 0) goto L47
            wj$i r0 = r4.c()
            if (r0 == 0) goto L47
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 10
            if (r0 <= r1) goto L47
            android.widget.FrameLayout r0 = r4.w
            com.comviva.webaxn.ui.o1$r r1 = new com.comviva.webaxn.ui.o1$r
            r1.<init>(r5, r6, r7)
            r0.setOnTouchListener(r1)
            goto L5e
        L47:
            android.widget.FrameLayout r0 = r4.w
            lj r1 = r4.d
            zj r1 = r1.f()
            java.lang.String r1 = r1.g
            r0.setContentDescription(r1)
            android.widget.FrameLayout r0 = r4.w
            com.comviva.webaxn.ui.o1$m r1 = new com.comviva.webaxn.ui.o1$m
            r1.<init>(r5, r6, r7)
            r0.setOnClickListener(r1)
        L5e:
            android.widget.LinearLayout r5 = r4.A
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
            com.comviva.webaxn.ui.PageRootFrame r5 = r4.v
            com.comviva.webaxn.ui.o1$o r6 = new com.comviva.webaxn.ui.o1$o
            r6.<init>(r4)
            r5.setOnTouchListener(r6)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.b(pj, wj, mj):void");
    }

    public void b(yj yjVar) {
        if (yjVar != null) {
            try {
                if (this.E.size() > 0) {
                    for (Map.Entry<View, yj> entry : this.E.entrySet()) {
                        View key = entry.getKey();
                        yj value = entry.getValue();
                        if (value != null) {
                            if (!value.equals(x1.a(yjVar))) {
                                a((View) null, value);
                            }
                        } else if (key != null) {
                            a(key, (yj) null);
                        }
                    }
                    if (v() && !this.F) {
                        a(this.d, this.a, false);
                    }
                }
            } catch (Exception unused) {
            }
        }
        ArrayList<LinearLayout> arrayList = this.R;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<LinearLayout> it = this.R.iterator();
        while (it.hasNext()) {
            LinearLayout next = it.next();
            if (next.getVisibility() == 0) {
                next.setVisibility(8);
            }
        }
    }

    public boolean b(String str, String str2) {
        if (str != null && str2 != null) {
            if (!this.G.containsKey(str)) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(str2);
                this.G.put(str, arrayList);
                return true;
            }
            ArrayList<String> arrayList2 = this.G.get(str);
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

    public wj.i c() {
        return this.T;
    }

    public void c(int i2) {
        SparseArray<Long> sparseArray = this.M;
        if (sparseArray != null) {
            sparseArray.delete(i2);
        }
    }

    public void c(yj yjVar) {
        if (yjVar != null) {
            try {
                if (this.E.size() > 0) {
                    for (Map.Entry<View, yj> entry : this.E.entrySet()) {
                        View key = entry.getKey();
                        yj value = entry.getValue();
                        if (value != null) {
                            b(key, value);
                        } else if (key != null) {
                            b(key, (yj) null);
                        }
                    }
                    if (v() && !this.F) {
                        a(this.d, this.a, false);
                    }
                }
            } catch (Exception unused) {
            }
        }
        ArrayList<LinearLayout> arrayList = this.R;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<LinearLayout> it = this.R.iterator();
        while (it.hasNext()) {
            LinearLayout next = it.next();
            if (next.getVisibility() == 8) {
                next.setVisibility(0);
            }
        }
    }

    public ProgressBar d() {
        return this.p;
    }

    public void d(yj yjVar) {
        this.J++;
    }

    public lj e() {
        return this.d;
    }

    public mj f() {
        return this.e;
    }

    public NestedScrollView g() {
        return this.n;
    }

    public n1 h() {
        return this.Q;
    }

    public zj i() {
        return this.b;
    }

    public String j() {
        return this.K;
    }

    public View k() {
        return this.w;
    }

    public x1.p l() {
        return this.U;
    }

    public View m() {
        return this.v;
    }

    public com.comviva.webaxn.utils.o1 n() {
        return this.P;
    }

    public x1.q o() {
        return this.V;
    }

    public float p() {
        return this.O;
    }

    public int q() {
        HashMap<String, String> hashMap = this.b.r;
        if (hashMap != null && !TextUtils.isEmpty(hashMap.get("FORMTYPE"))) {
            String str = this.b.r.get("FORMTYPE");
            if (str.equals("0")) {
                this.K = "EDIT";
            } else {
                this.K = "VALIDATE";
                try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return 0;
    }

    public View r() {
        return this.x;
    }

    public com.comviva.webaxn.ui.b s() {
        return this.u;
    }

    public boolean t() {
        if (a("back", (mj) null, (lj) null) || a("exit", (mj) null, (lj) null)) {
            return true;
        }
        lj ljVar = this.d;
        if (ljVar == null || ljVar.d() == null || 1 != this.d.d().size()) {
            return false;
        }
        return a(this.d.d().get(0).f, (mj) null, (lj) null);
    }

    public void u() {
        if (this.b.P.get("rightswipe") != null && this.b.P.get("leftswipe") != null) {
            this.A.setOnTouchListener(new p(this, new GestureDetector(this.a, new m0(this.b, this.U, this.e))));
        } else if (this.b.P.get("shake") != null) {
            com.comviva.webaxn.utils.o1 o1Var = new com.comviva.webaxn.utils.o1(this.a);
            this.P = o1Var;
            o1Var.a(new a());
        }
    }

    public boolean v() {
        HashMap<String, hj> hashMap = this.b.P;
        return (hashMap == null || (hashMap.get("onshowkeypad") == null && this.b.P.get("onhidekeypad") == null)) ? false : true;
    }

    public boolean w() {
        return this.H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (com.comviva.webaxn.utils.x1.c() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        r1 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0059, code lost:
    
        if (com.comviva.webaxn.utils.x1.c() == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int x() {
        /*
            r4 = this;
            zj r0 = r4.b
            java.lang.String r0 = r0.a
            r1 = 3
            r2 = 5
            if (r0 == 0) goto L60
            java.lang.String r3 = "C"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L5e
            zj r0 = r4.b
            java.lang.String r0 = r0.a
            java.lang.String r3 = "Center"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L1d
            goto L5e
        L1d:
            zj r0 = r4.b
            java.lang.String r0 = r0.a
            java.lang.String r3 = "L"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L55
            zj r0 = r4.b
            java.lang.String r0 = r0.a
            java.lang.String r3 = "Left"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L36
            goto L55
        L36:
            zj r0 = r4.b
            java.lang.String r0 = r0.a
            java.lang.String r3 = "R"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L4e
            zj r0 = r4.b
            java.lang.String r0 = r0.a
            java.lang.String r3 = "Right"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L60
        L4e:
            boolean r0 = com.comviva.webaxn.utils.x1.c()
            if (r0 == 0) goto L5c
            goto L62
        L55:
            boolean r0 = com.comviva.webaxn.utils.x1.c()
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
            zj r0 = r4.b
            java.lang.String r0 = r0.b
            if (r0 == 0) goto Lb6
            java.lang.String r2 = "B"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto Lb4
            zj r0 = r4.b
            java.lang.String r0 = r0.b
            java.lang.String r2 = "Bottom"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L7d
            goto Lb4
        L7d:
            zj r0 = r4.b
            java.lang.String r0 = r0.b
            java.lang.String r2 = "T"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto Lb1
            zj r0 = r4.b
            java.lang.String r0 = r0.b
            java.lang.String r2 = "Top"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L96
            goto Lb1
        L96:
            zj r0 = r4.b
            java.lang.String r0 = r0.b
            java.lang.String r2 = "M"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto Lae
            zj r0 = r4.b
            java.lang.String r0 = r0.b
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o1.x():int");
    }

    public void y() {
        n1 n1Var;
        ArrayList<yj> arrayList = this.L;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<yj> it = this.L.iterator();
        while (it.hasNext()) {
            yj next = it.next();
            if (next.e == 3 && (n1Var = next.a0) != null) {
                w wVar = (w) n1Var;
                wVar.i(wVar.m());
            }
        }
    }

    public void z() {
        if (s().getMenu() != null) {
            if (s().getMenu().a0 instanceof w) {
                ((w) s().getMenu().a0).s();
            } else if (s().getMenu().a0 instanceof v) {
                ((v) s().getMenu().a0).r();
            }
        }
    }
}
