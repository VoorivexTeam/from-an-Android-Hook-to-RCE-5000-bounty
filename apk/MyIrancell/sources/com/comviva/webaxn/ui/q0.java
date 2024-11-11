package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import com.viewpagerindicator.CirclePageIndicator;
import defpackage.bj;
import defpackage.ej;
import defpackage.yj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class q0 extends n1 {
    private RelativeLayout A;
    private j0 B;
    private AbsoluteLayout.LayoutParams C;
    private i1 D;
    private Context E;
    private ArrayList<ImageView> F;
    private String[] G;
    private String[] H;
    private Handler I;
    public Runnable J;
    private ViewPager x;
    private com.viewpagerindicator.c y;
    private yj z;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int currentItem = q0.this.x.getCurrentItem();
            if (currentItem == q0.this.z.Z0) {
                currentItem = 0;
            }
            q0.this.x.setCurrentItem(currentItem + 1);
            q0.this.I.postDelayed(q0.this.J, q0.this.z.J0 != null ? q0.this.z.J0.a() : 0L);
        }
    }

    public q0(Context context, yj yjVar, j0 j0Var) {
        super(context);
        bj bjVar;
        this.F = new ArrayList<>();
        this.J = new a();
        this.I = new Handler();
        this.E = context;
        this.z = yjVar;
        this.B = j0Var;
        ej ejVar = yjVar.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.E).inflate(R.layout.pageview_indicator_layout, (ViewGroup) null);
        this.A = relativeLayout;
        this.x = (ViewPager) relativeLayout.findViewById(R.id.pager);
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) this.A.findViewById(R.id.indicator);
        this.y = circlePageIndicator;
        yj yjVar2 = this.z;
        if (yjVar2.K0 == 1 && (bjVar = yjVar2.L0) != null) {
            circlePageIndicator.setFillColor(bjVar.d());
            circlePageIndicator.setPageColor(this.z.L0.c());
        }
        circlePageIndicator.setSnap(true);
        if (!TextUtils.isEmpty(this.z.r0)) {
            this.G = this.z.r0.split(";");
            int i = 0;
            while (true) {
                String[] strArr = this.G;
                if (i >= strArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(strArr[i]) && this.G[i].indexOf(".") != -1) {
                    String[] strArr2 = this.G;
                    strArr2[i] = strArr2[i].substring(0, strArr2[i].indexOf("."));
                }
                i++;
            }
        } else {
            this.G = new String[this.z.Z0];
            for (int i2 = 0; i2 < this.z.Z0; i2++) {
                this.G[i2] = "alttext";
            }
        }
        if (TextUtils.isEmpty(this.z.a1)) {
            return;
        }
        this.H = this.z.a1.split(";");
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.q0.a(int, boolean):void");
    }

    public void a(long j) {
        this.I.postDelayed(this.J, j);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.A.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.A.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
        this.f = p0Var;
        if (this.z.E) {
            this.A.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.v0);
    }

    public void a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.z.r0) ? this.E.getResources().getIdentifier(this.z.r0, "drawable", this.E.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.E).a(this.z.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.E.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.E).a(this.z.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.A.setBackgroundDrawable(this.e);
                if (!this.z.E || this.f == null) {
                    return;
                }
                this.A.setPadding(this.f.a, this.f.b, this.f.c, this.f.d);
                return;
            }
            if (bArr != null) {
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.E).a(this.z.O);
                if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.E).a(this.z.O, a3);
                }
                this.e = NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3);
                this.A.setBackgroundDrawable(this.e);
                if (!this.z.E || this.f == null) {
                    return;
                }
                this.A.setPadding(this.f.a, this.f.b, this.f.c, this.f.d);
                return;
            }
            this.d = n1.d(this.z.p.b());
            this.A.setTag(this.z);
            yj yjVar = this.z;
            ej ejVar = yjVar.O0;
            if (ejVar != null) {
                Drawable a4 = x1.a(ejVar, this.d);
                this.e = a4;
                this.A.setBackgroundDrawable(a4);
            } else if (yjVar.p.j()) {
                int f0 = com.comviva.webaxn.utils.j1.a(this.E).f0();
                this.h = f0;
                this.h = n1.d(f0);
                this.A.setBackgroundColor(this.d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.A);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(AbsoluteLayout.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = this.A.getLayoutParams();
        int i = layoutParams.width;
        this.l = i;
        layoutParams2.width = i;
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = -2;
        }
        this.A.getLayoutParams().height = i2;
        if (this.A.getLayoutParams() != null) {
            this.A.getLayoutParams().width = layoutParams.width;
            this.A.getLayoutParams().height = i2;
        }
        if (i2 >= 0) {
            this.k = i2;
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A.measure(makeMeasureSpec, makeMeasureSpec);
        this.k = this.A.getMeasuredHeight();
    }

    public void b(yj yjVar) {
        this.z = yjVar;
    }

    public int c(AbsoluteLayout.LayoutParams layoutParams) {
        this.k = -2;
        this.l = layoutParams.width;
        int i = layoutParams.height;
        if (i > 0) {
            this.k = i;
        }
        this.C = new AbsoluteLayout.LayoutParams(this.l, this.k, layoutParams.x, layoutParams.y);
        if (this.A.getLayoutParams() != null) {
            this.A.getLayoutParams().width = this.l;
            this.A.getLayoutParams().height = this.k;
        }
        this.b.addView(this.A, this.C);
        if (this.k < 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.A.measure(makeMeasureSpec, makeMeasureSpec);
            this.k = this.A.getMeasuredHeight();
        }
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.z;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.A;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    @Override // com.comviva.webaxn.ui.n1
    public boolean l() {
        x1.e(this.E, "msg.empty");
        return false;
    }

    public void m() {
        int i;
        yj yjVar;
        LayoutInflater from = LayoutInflater.from(this.E);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.z.Z0;
            if (i3 >= i) {
                break;
            }
            this.F.add((ImageView) from.inflate(R.layout.banner_image, (ViewGroup) null));
            i3++;
        }
        if (i > 1) {
            this.F.add(0, (ImageView) from.inflate(R.layout.banner_image, (ViewGroup) null));
            this.F.add((ImageView) from.inflate(R.layout.banner_image, (ViewGroup) null));
        }
        while (true) {
            yjVar = this.z;
            if (i2 >= yjVar.Z0) {
                break;
            }
            i2++;
            a(i2, true);
        }
        i1 i1Var = new i1(this.E, yjVar, this.g, this.F);
        this.D = i1Var;
        this.x.setAdapter(i1Var);
        if (this.z.Z0 > 1) {
            this.x.setCurrentItem(1);
        }
        this.y.setViewPager(this.x);
    }
}
