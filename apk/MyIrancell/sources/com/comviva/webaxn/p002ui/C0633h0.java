package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0744u;
import com.comviva.webaxn.utils.C0755x1;
import p000.C2391dj;
import p000.C2434ej;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.h0 */
/* loaded from: classes.dex */
public class C0633h0 extends C0630g0 {

    /* renamed from: J */
    private boolean f3779J;

    /* renamed from: K */
    private ImageView f3780K;

    /* renamed from: L */
    private Context f3781L;

    /* renamed from: M */
    LinearLayout f3782M;

    /* renamed from: N */
    private int f3783N;

    /* renamed from: O */
    private int f3784O;

    /* renamed from: P */
    private boolean f3785P;

    /* renamed from: Q */
    private String f3786Q;

    /* renamed from: R */
    private View.OnClickListener f3787R;

    /* renamed from: S */
    public View.OnClickListener f3788S;

    /* renamed from: com.comviva.webaxn.ui.h0$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0633h0 c0633h0 = C0633h0.this;
            c0633h0.f4049g.mo4850b(c0633h0.f3717z);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.h0$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0633h0 c0633h0 = C0633h0.this;
            c0633h0.f4049g.mo4849b(c0633h0);
        }
    }

    public C0633h0(Context context, String str) {
        super(context, str);
        this.f3780K = null;
        this.f3783N = 0;
        this.f3784O = 0;
        this.f3785P = false;
        this.f3787R = new a();
        this.f3788S = new b();
        this.f3781L = context;
        this.f3779J = false;
        this.f3782M = new LinearLayout(context);
        int m5664f0 = C0713j1.m5563a(this.f3781L).m5664f0();
        this.f4050h = m5664f0;
        this.f4050h = AbstractC0652n1.m4701d(m5664f0);
        m4708c(this.f4046d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r4.f4055m != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r5.setGravity(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        r5.setGravity(19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r4.f4055m != false) goto L24;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4436a(android.widget.TextView r5) {
        /*
            r4 = this;
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "C"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L62
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "Center"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            goto L62
        L1c:
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "L"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 21
            r2 = 19
            if (r0 != 0) goto L56
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r3 = "Left"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L39
            goto L56
        L39:
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r3 = "R"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L51
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r3 = "Right"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L67
        L51:
            boolean r0 = r4.f4055m
            if (r0 == 0) goto L5a
            goto L5e
        L56:
            boolean r0 = r4.f4055m
            if (r0 == 0) goto L5e
        L5a:
            r5.setGravity(r1)
            goto L67
        L5e:
            r5.setGravity(r2)
            goto L67
        L62:
            r0 = 17
            r5.setGravity(r0)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0633h0.m4436a(android.widget.TextView):void");
    }

    @Override // com.comviva.webaxn.p002ui.C0630g0, com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        int m16645k = this.f3717z.m16645k(c0669v0.f4397c.width());
        this.f4054l = m16645k;
        if (m16645k < 0) {
            this.f4054l = c0669v0.f4397c.width() - (this.f3717z.m16638d(c0669v0.f4397c.width()) + this.f3717z.m16641g(c0669v0.f4397c.width()));
        }
        int i = this.f4054l;
        int m16639e = i - (this.f3717z.m16639e(i) + this.f3717z.m16642h(this.f4054l));
        int m16637c = this.f3717z.m16637c(c0669v0.f4397c.height());
        byte[] bArr = this.f3717z.f14254t0;
        if (bArr != null) {
            m4437b(bArr);
            this.f3780K.getLayoutParams().width = this.f3783N;
            this.f3780K.getLayoutParams().height = this.f3784O;
            m16639e -= this.f3783N;
        }
        if (this.f3715x != null) {
            this.f3716y.getLayoutParams().width = m16639e;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3782M.measure(makeMeasureSpec, makeMeasureSpec);
        if (m16637c <= 0) {
            m16637c = this.f3782M.getMeasuredHeight();
        }
        this.f4053k = m16637c;
        this.f3782M.getLayoutParams().height = this.f4053k;
        this.f3782M.getLayoutParams().width = this.f4054l;
    }

    @Override // com.comviva.webaxn.p002ui.C0630g0
    /* renamed from: a */
    public void mo4364a(C0669v0 c0669v0) {
        LinearLayout.LayoutParams layoutParams;
        C0744u c0744u;
        if (this.f4044b != null) {
            if (this.f3715x != null) {
                while (this.f3715x.contains("$$")) {
                    this.f3715x = this.f3715x.replace("$$", "$");
                }
                if (this.f3715x.endsWith("\n")) {
                    String str = this.f3715x;
                    this.f3715x = str.substring(0, str.length() - 1);
                }
                C3489yj c3489yj = this.f3717z;
                if (c3489yj == null || (c0744u = c3489yj.f14241p) == null || c0744u.m6068g() != 4) {
                    this.f3716y.setText(this.f3715x);
                } else {
                    this.f3716y.setText(Html.fromHtml("<u>".concat(this.f3715x).concat("</u>")));
                }
                if (this.f3710E) {
                    this.f3716y.setTextColor(this.f3706A);
                }
            }
            m4708c(this.f4046d);
            int m16645k = this.f3717z.m16645k(c0669v0.f4397c.width());
            this.f4054l = m16645k;
            if (-1 == m16645k) {
                this.f4054l = c0669v0.f4397c.width() - (this.f3717z.m16638d(c0669v0.f4397c.width()) + this.f3717z.m16641g(c0669v0.f4397c.width()));
            }
            int i = this.f4054l;
            int m16639e = i - (this.f3717z.m16639e(i) + this.f3717z.m16642h(this.f4054l));
            int m16637c = this.f3717z.m16637c(c0669v0.f4397c.height());
            ImageView imageView = this.f3780K;
            if (imageView != null) {
                imageView.setId(1);
                this.f3782M.setOrientation(0);
                RelativeLayout relativeLayout = new RelativeLayout(this.f3781L);
                this.f3782M.addView(relativeLayout);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f3783N, this.f3784O);
                layoutParams2.addRule(15);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                if (this.f4055m) {
                    layoutParams2.addRule(11);
                }
                relativeLayout.addView(this.f3780K, layoutParams2);
                int i2 = m16639e - this.f3783N;
                if (this.f3715x != null) {
                    if (this.f4055m) {
                        layoutParams3.addRule(0, this.f3780K.getId());
                    } else {
                        layoutParams3.addRule(1, this.f3780K.getId());
                    }
                    layoutParams3.addRule(15);
                    layoutParams3.width = i2;
                    relativeLayout.addView(this.f3716y, layoutParams3);
                }
                C2434ej c2434ej = this.f3717z.f14173O0;
                if (c2434ej != null) {
                    c2434ej.m11615a(this.f4053k);
                    Drawable m6122a = C0755x1.m6122a(this.f3717z.f14173O0, this.f4046d);
                    this.f4047e = m6122a;
                    this.f3782M.setBackgroundDrawable(m6122a);
                } else if (this.f3709D) {
                    this.f3782M.setBackgroundColor(this.f4046d);
                }
                if (this.f3779J) {
                    this.f3782M.setClickable(true);
                    this.f3782M.setFocusable(true);
                    this.f3782M.setOnClickListener(this.f3788S);
                    this.f3782M.setOnTouchListener(this.f4059q);
                    this.f3782M.setMinimumHeight(AbstractC0652n1.f4041u);
                } else if (TextUtils.isEmpty(this.f3717z.f14181S0)) {
                    AbstractC0652n1.m4697a(this.f3782M, this.f3717z.f14207d1);
                    this.f3717z.f14210e1 = true;
                } else {
                    this.f3782M.setOnClickListener(this.f3787R);
                }
                C0657p0 c0657p0 = this.f4048f;
                if (c0657p0 != null) {
                    this.f3716y.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3782M.measure(makeMeasureSpec, makeMeasureSpec);
                if (m16637c <= 0) {
                    m16637c = this.f3782M.getMeasuredHeight();
                }
                this.f4053k = m16637c;
                layoutParams = new LinearLayout.LayoutParams(this.f4054l, this.f4053k);
                layoutParams.setMargins(this.f3717z.m16638d(c0669v0.f4397c.width()), this.f3717z.m16643i(c0669v0.f4397c.width()), this.f3717z.m16641g(c0669v0.f4397c.width()), this.f3717z.m16632a(c0669v0.f4397c.width()));
                layoutParams.gravity = m4440s();
            } else {
                if (this.f3715x == null) {
                    return;
                }
                LinearLayout linearLayout = new LinearLayout(this.f3781L);
                this.f3782M = linearLayout;
                linearLayout.setOrientation(0);
                if (this.f3779J) {
                    this.f3782M.setOnClickListener(this.f3788S);
                    this.f3782M.setOnTouchListener(this.f4059q);
                    this.f3782M.setTag(this.f3717z);
                    C2434ej c2434ej2 = this.f3717z.f14173O0;
                    if (c2434ej2 != null) {
                        c2434ej2.m11615a(this.f4053k);
                        Drawable m6122a2 = C0755x1.m6122a(this.f3717z.f14173O0, this.f4046d);
                        this.f4047e = m6122a2;
                        this.f3782M.setBackgroundDrawable(m6122a2);
                    } else if (this.f3709D) {
                        this.f3782M.setBackgroundColor(this.f4046d);
                    }
                }
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
                this.f3716y.setFocusable(true);
                layoutParams4.width = m16639e;
                this.f3782M.addView(this.f3716y, layoutParams4);
                C0657p0 c0657p02 = this.f4048f;
                if (c0657p02 != null) {
                    this.f3716y.setPadding(c0657p02.f4218a, c0657p02.f4219b, c0657p02.f4220c, c0657p02.f4221d);
                }
                m4436a(this.f3716y);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3782M.measure(makeMeasureSpec2, makeMeasureSpec2);
                if (m16637c <= 0) {
                    m16637c = this.f3782M.getMeasuredHeight();
                }
                this.f4053k = m16637c;
                layoutParams = new LinearLayout.LayoutParams(this.f4054l, this.f4053k);
                layoutParams.gravity = m4440s();
                layoutParams.setMargins(this.f3717z.m16638d(c0669v0.f4397c.width()), this.f3717z.m16643i(c0669v0.f4397c.width()), this.f3717z.m16641g(c0669v0.f4397c.width()), this.f3717z.m16632a(c0669v0.f4397c.width()));
            }
            this.f4044b.addView(this.f3782M, layoutParams);
        }
    }

    @Override // com.comviva.webaxn.p002ui.C0630g0, com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        mo4366a(c3489yj.f14260v0);
    }

    @Override // com.comviva.webaxn.p002ui.C0630g0
    /* renamed from: a */
    public void mo4365a(boolean z) {
        this.f3779J = z;
    }

    @Override // com.comviva.webaxn.p002ui.C0630g0
    /* renamed from: a */
    public void mo4366a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.f3717z.f14248r0) ? this.f3781L.getResources().getIdentifier(this.f3717z.f14248r0, "drawable", this.f3781L.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f3781L).m5429a(this.f3717z.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f3781L.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f3781L).m5432a(this.f3717z.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f3782M.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f3781L).m5429a(this.f3717z.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f3781L).m5432a(this.f3717z.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f3782M.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.comviva.webaxn.p002ui.C0630g0
    /* renamed from: b */
    public void mo4370b(boolean z) {
        this.f3785P = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.comviva.webaxn.utils.e1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.comviva.webaxn.utils.e1] */
    /* JADX WARN: Type inference failed for: r7v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v25, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.graphics.Bitmap] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4437b(byte[] r7) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0633h0.m4437b(byte[]):void");
    }

    @Override // com.comviva.webaxn.p002ui.C0630g0
    /* renamed from: c */
    public void mo4372c(String str) {
        this.f3786Q = str;
    }

    /* renamed from: d */
    public void m4438d(String str) {
        this.f3717z.f14235n = str;
        m4368b(str);
    }

    @Override // com.comviva.webaxn.p002ui.C0630g0, com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3782M;
    }

    @Override // com.comviva.webaxn.p002ui.C0630g0
    /* renamed from: o */
    public String mo4379o() {
        return this.f3786Q;
    }

    @Override // com.comviva.webaxn.p002ui.C0630g0
    /* renamed from: p */
    public boolean mo4380p() {
        return this.f3785P;
    }

    /* renamed from: r */
    public void m4439r() {
        C2391dj c2391dj = this.f3717z.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: s */
    public int m4440s() {
        String str = this.f3717z.f14214g;
        if (str != null) {
            if (str.equalsIgnoreCase("C") || this.f3717z.f14214g.equalsIgnoreCase("Center")) {
                return 17;
            }
            if (this.f3717z.f14214g.equalsIgnoreCase("L") || this.f3717z.f14214g.equalsIgnoreCase("Left")) {
                if (this.f4055m) {
                    return 21;
                }
            } else if (this.f3717z.f14214g.equalsIgnoreCase("R") || this.f3717z.f14214g.equalsIgnoreCase("Right")) {
                if (!this.f4055m) {
                    return 21;
                }
            }
            return 19;
        }
        return 3;
    }
}
