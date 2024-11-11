package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.InterfaceC2350c;
import java.util.ArrayList;
import p000.C0482bj;
import p000.C2434ej;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.q0 */
/* loaded from: classes.dex */
public class C0659q0 extends AbstractC0652n1 {

    /* renamed from: A */
    private RelativeLayout f4247A;

    /* renamed from: B */
    private C0639j0 f4248B;

    /* renamed from: C */
    private AbsoluteLayout.LayoutParams f4249C;

    /* renamed from: D */
    private C0637i1 f4250D;

    /* renamed from: E */
    private Context f4251E;

    /* renamed from: F */
    private ArrayList<ImageView> f4252F;

    /* renamed from: G */
    private String[] f4253G;

    /* renamed from: H */
    private String[] f4254H;

    /* renamed from: I */
    private Handler f4255I;

    /* renamed from: J */
    public Runnable f4256J;

    /* renamed from: x */
    private ViewPager f4257x;

    /* renamed from: y */
    private InterfaceC2350c f4258y;

    /* renamed from: z */
    private C3489yj f4259z;

    /* renamed from: com.comviva.webaxn.ui.q0$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int currentItem = C0659q0.this.f4257x.getCurrentItem();
            if (currentItem == C0659q0.this.f4259z.f14195Z0) {
                currentItem = 0;
            }
            C0659q0.this.f4257x.setCurrentItem(currentItem + 1);
            C0659q0.this.f4255I.postDelayed(C0659q0.this.f4256J, C0659q0.this.f4259z.f14163J0 != null ? C0659q0.this.f4259z.f14163J0.m11428a() : 0L);
        }
    }

    public C0659q0(Context context, C3489yj c3489yj, C0639j0 c0639j0) {
        super(context);
        C0482bj c0482bj;
        this.f4252F = new ArrayList<>();
        this.f4256J = new a();
        this.f4255I = new Handler();
        this.f4251E = context;
        this.f4259z = c3489yj;
        this.f4248B = c0639j0;
        C2434ej c2434ej = c3489yj.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f4251E).inflate(R.layout.pageview_indicator_layout, (ViewGroup) null);
        this.f4247A = relativeLayout;
        this.f4257x = (ViewPager) relativeLayout.findViewById(R.id.pager);
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) this.f4247A.findViewById(R.id.indicator);
        this.f4258y = circlePageIndicator;
        C3489yj c3489yj2 = this.f4259z;
        if (c3489yj2.f14165K0 == 1 && (c0482bj = c3489yj2.f14167L0) != null) {
            circlePageIndicator.setFillColor(c0482bj.m3408d());
            circlePageIndicator.setPageColor(this.f4259z.f14167L0.m3405c());
        }
        circlePageIndicator.setSnap(true);
        if (!TextUtils.isEmpty(this.f4259z.f14248r0)) {
            this.f4253G = this.f4259z.f14248r0.split(";");
            int i = 0;
            while (true) {
                String[] strArr = this.f4253G;
                if (i >= strArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(strArr[i]) && this.f4253G[i].indexOf(".") != -1) {
                    String[] strArr2 = this.f4253G;
                    strArr2[i] = strArr2[i].substring(0, strArr2[i].indexOf("."));
                }
                i++;
            }
        } else {
            this.f4253G = new String[this.f4259z.f14195Z0];
            for (int i2 = 0; i2 < this.f4259z.f14195Z0; i2++) {
                this.f4253G[i2] = "alttext";
            }
        }
        if (TextUtils.isEmpty(this.f4259z.f14198a1)) {
            return;
        }
        this.f4254H = this.f4259z.f14198a1.split(";");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.comviva.webaxn.utils.e1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v22, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4900a(int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0659q0.m4900a(int, boolean):void");
    }

    /* renamed from: a */
    public void m4901a(long j) {
        this.f4255I.postDelayed(this.f4256J, j);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f4247A.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f4247A.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        this.f4048f = c0657p0;
        if (this.f4259z.f14152E) {
            this.f4247A.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4902a(c3489yj.f14260v0);
    }

    /* renamed from: a */
    public void m4902a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.f4259z.f14248r0) ? this.f4251E.getResources().getIdentifier(this.f4259z.f14248r0, "drawable", this.f4251E.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4251E).m5429a(this.f4259z.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4251E.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4251E).m5432a(this.f4259z.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f4247A.setBackgroundDrawable(this.f4047e);
                if (!this.f4259z.f14152E || this.f4048f == null) {
                    return;
                }
                this.f4247A.setPadding(this.f4048f.f4218a, this.f4048f.f4219b, this.f4048f.f4220c, this.f4048f.f4221d);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4251E).m5429a(this.f4259z.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4251E).m5432a(this.f4259z.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f4247A.setBackgroundDrawable(this.f4047e);
                if (!this.f4259z.f14152E || this.f4048f == null) {
                    return;
                }
                this.f4247A.setPadding(this.f4048f.f4218a, this.f4048f.f4219b, this.f4048f.f4220c, this.f4048f.f4221d);
                return;
            }
            this.f4046d = AbstractC0652n1.m4701d(this.f4259z.f14241p.m6057b());
            this.f4247A.setTag(this.f4259z);
            C3489yj c3489yj = this.f4259z;
            C2434ej c2434ej = c3489yj.f14173O0;
            if (c2434ej != null) {
                Drawable m6122a = C0755x1.m6122a(c2434ej, this.f4046d);
                this.f4047e = m6122a;
                this.f4247A.setBackgroundDrawable(m6122a);
            } else if (c3489yj.f14241p.m6071j()) {
                int m5664f0 = C0713j1.m5563a(this.f4251E).m5664f0();
                this.f4050h = m5664f0;
                this.f4050h = AbstractC0652n1.m4701d(m5664f0);
                this.f4247A.setBackgroundColor(this.f4046d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f4247A);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = this.f4247A.getLayoutParams();
        int i = layoutParams.width;
        this.f4054l = i;
        layoutParams2.width = i;
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = -2;
        }
        this.f4247A.getLayoutParams().height = i2;
        if (this.f4247A.getLayoutParams() != null) {
            this.f4247A.getLayoutParams().width = layoutParams.width;
            this.f4247A.getLayoutParams().height = i2;
        }
        if (i2 >= 0) {
            this.f4053k = i2;
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4247A.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4053k = this.f4247A.getMeasuredHeight();
    }

    /* renamed from: b */
    public void m4903b(C3489yj c3489yj) {
        this.f4259z = c3489yj;
    }

    /* renamed from: c */
    public int m4904c(AbsoluteLayout.LayoutParams layoutParams) {
        this.f4053k = -2;
        this.f4054l = layoutParams.width;
        int i = layoutParams.height;
        if (i > 0) {
            this.f4053k = i;
        }
        this.f4249C = new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y);
        if (this.f4247A.getLayoutParams() != null) {
            this.f4247A.getLayoutParams().width = this.f4054l;
            this.f4247A.getLayoutParams().height = this.f4053k;
        }
        this.f4044b.addView(this.f4247A, this.f4249C);
        if (this.f4053k < 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f4247A.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4053k = this.f4247A.getMeasuredHeight();
        }
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f4259z;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4247A;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: i */
    public int mo4151i() {
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: j */
    public int mo4152j() {
        return this.f4054l;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        C0755x1.m6185e(this.f4251E, "msg.empty");
        return false;
    }

    /* renamed from: m */
    public void m4905m() {
        int i;
        C3489yj c3489yj;
        LayoutInflater from = LayoutInflater.from(this.f4251E);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f4259z.f14195Z0;
            if (i3 >= i) {
                break;
            }
            this.f4252F.add((ImageView) from.inflate(R.layout.banner_image, (ViewGroup) null));
            i3++;
        }
        if (i > 1) {
            this.f4252F.add(0, (ImageView) from.inflate(R.layout.banner_image, (ViewGroup) null));
            this.f4252F.add((ImageView) from.inflate(R.layout.banner_image, (ViewGroup) null));
        }
        while (true) {
            c3489yj = this.f4259z;
            if (i2 >= c3489yj.f14195Z0) {
                break;
            }
            i2++;
            m4900a(i2, true);
        }
        C0637i1 c0637i1 = new C0637i1(this.f4251E, c3489yj, this.f4049g, this.f4252F);
        this.f4250D = c0637i1;
        this.f4257x.setAdapter(c0637i1);
        if (this.f4259z.f14195Z0 > 1) {
            this.f4257x.setCurrentItem(1);
        }
        this.f4258y.setViewPager(this.f4257x);
    }
}
