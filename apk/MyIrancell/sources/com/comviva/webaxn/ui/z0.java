package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.dj;
import defpackage.ej;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;
import defpackage.zj;

/* loaded from: classes.dex */
public class z0 extends n1 {
    private int A;
    private zj B;
    private boolean C;
    private int D;
    private int E;
    private String F;
    private int G;
    private String H;
    private SeekBar.OnSeekBarChangeListener I;
    private SeekBar x;
    private yj y;
    private LinearLayout z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z0 z0Var = z0.this;
            z0Var.g.b(z0Var);
        }
    }

    /* loaded from: classes.dex */
    class b implements SeekBar.OnSeekBarChangeListener {
        b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            z0.this.A = i;
            if (z0.this.y.S0 != null) {
                String valueOf = String.valueOf(z0.this.m());
                if (z0.this.C) {
                    valueOf = valueOf + z0.this.H;
                }
                x1.a(valueOf, z0.this.y.S0, z0.this.B);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            z0 z0Var = z0.this;
            z0Var.g.b(z0Var);
        }
    }

    public z0(Context context, yj yjVar, j0 j0Var, zj zjVar) {
        super(context);
        String str;
        this.A = 0;
        this.C = false;
        this.D = 0;
        this.E = 100;
        this.F = "5px";
        this.G = 5;
        this.H = "";
        new a();
        this.I = new b();
        this.y = yjVar;
        this.B = zjVar;
        this.y = yjVar;
        LinearLayout linearLayout = new LinearLayout(this.c);
        this.z = linearLayout;
        vj vjVar = this.y.q1;
        if (vjVar != null) {
            q2.a(linearLayout, vjVar.a());
        }
        ej ejVar = this.y.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
        if (this.c.getPackageName().equals("com.comviva.cpw") || this.c.getPackageName().equals("com.comviva.cpwdev") || this.c.getPackageName().equals("com.comviva.cpwuat") || this.c.getPackageName().equals("com.comviva.cpwselfcare") || this.c.getPackageName().equals("com.cpw") || this.c.getPackageName().equals("com.comviva.cpwcit") || this.c.getPackageName().equals("com.comviva.cpwcit1") || this.c.getPackageName().equals("com.cpwdev2") || this.c.getPackageName().equals("com.agcpwdev") || this.c.getPackageName().equals("com.cloudcpw")) {
            if (com.comviva.webaxn.utils.b.a(this.c).a().h()) {
                this.x = (SeekBar) LayoutInflater.from(this.c).inflate(R.layout.custom_seekbar_tablet, (ViewGroup) null).findViewById(R.id.seekbartab);
                this.G = (int) (this.y.a * 11.0f);
                str = "11px";
            } else {
                this.x = (SeekBar) LayoutInflater.from(this.c).inflate(R.layout.custom_seekbar, (ViewGroup) null).findViewById(R.id.seekbar);
                this.G = (int) (this.y.a * 7.0f);
                str = "7px";
            }
            this.F = str;
        } else {
            this.x = new SeekBar(this.c);
        }
        if (!TextUtils.isEmpty(this.y.r1)) {
            this.x.setContentDescription(this.y.r1);
        }
        yj yjVar2 = this.y;
        String str2 = yjVar2.Q0;
        String str3 = yjVar2.R0;
        if (!TextUtils.isEmpty(str2)) {
            if (str2.contains(".")) {
                this.C = true;
                String str4 = this.y.Q0;
                str2 = str4.substring(0, str4.indexOf("."));
                String str5 = this.y.Q0;
                this.H = str5.substring(str5.indexOf("."));
            }
            try {
                this.D = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            if (str3.contains(".")) {
                String str6 = this.y.R0;
                str3 = str6.substring(0, str6.indexOf("."));
            }
            try {
                this.E = Integer.parseInt(str3);
            } catch (Exception unused2) {
            }
        }
        this.x.setMax(this.E - this.D);
        if (this.y.b) {
            this.x.setOnSeekBarChangeListener(this.I);
            this.z.setOnTouchListener(this.q);
        } else {
            this.x.setClickable(false);
            n1.a(this.z, this.y.d1);
            this.y.e1 = true;
        }
        String str7 = this.y.S0;
        if (str7 != null && str7 != null) {
            String valueOf = String.valueOf(m());
            if (this.C) {
                valueOf = valueOf + this.H;
            }
            x1.a(valueOf, this.y.S0, this.B);
        }
        yj yjVar3 = this.y;
        if (yjVar3.O0 == null) {
            yjVar3.O0 = new ej(yjVar3.a);
            this.y.O0.b(this.F);
            this.y.O0.d(this.F);
            this.y.O0.c(this.F);
            this.y.O0.a(this.F);
        }
    }

    public int a(AbsoluteLayout.LayoutParams layoutParams, v0 v0Var) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = v0Var.c.width() - (this.y.d(v0Var.c.width()) + this.y.g(v0Var.c.width()));
        }
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = -2;
        }
        this.x.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
        this.z.addView(this.x);
        this.x.setPadding(0, 0, 0, 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.z.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.z.getMeasuredWidth();
        this.k = this.z.getMeasuredHeight();
        this.z.setLayoutParams(new AbsoluteLayout.LayoutParams(-2, -2, layoutParams.x, layoutParams.y));
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.z.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.z.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        if (yjVar != null) {
            a(yjVar.v0);
        }
    }

    public void a(byte[] bArr) {
        Drawable colorDrawable;
        int identifier = !TextUtils.isEmpty(this.y.r0) ? this.c.getResources().getIdentifier(this.y.r0, "drawable", this.c.getPackageName()) : 0;
        if (identifier > 0) {
            try {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.c).a(this.y.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.c.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.y.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            }
        } else if (bArr != null) {
            try {
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.c).a(this.y.O);
                if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.y.O, a3);
                }
                this.e = NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3);
            } catch (Exception e3) {
                e3.printStackTrace();
            } catch (OutOfMemoryError e4) {
                e4.printStackTrace();
            }
            this.z.setTag(this.y);
            int f0 = com.comviva.webaxn.utils.j1.a(this.c).f0();
            this.h = f0;
            this.h = n1.d(f0);
        } else {
            this.d = n1.d(this.y.p.b());
            this.z.setTag(this.y);
            yj yjVar = this.y;
            ej ejVar = yjVar.O0;
            if (ejVar != null) {
                colorDrawable = x1.a(ejVar, this.d);
            } else if (yjVar.p.j()) {
                int f02 = com.comviva.webaxn.utils.j1.a(this.c).f0();
                this.h = f02;
                this.h = n1.d(f02);
                colorDrawable = new ColorDrawable(this.d);
            }
            this.e = colorDrawable;
        }
        try {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{this.G, this.G, this.G, this.G, this.G, this.G, this.G, this.G}, null, null));
            shapeDrawable.getPaint().setColor(n1.d(this.y.p.c()));
            ClipDrawable clipDrawable = new ClipDrawable(shapeDrawable, 3, 1);
            Rect bounds = this.x.getProgressDrawable().getBounds();
            this.x.setProgressDrawable(new LayerDrawable(new Drawable[]{this.e, clipDrawable}));
            this.x.getProgressDrawable().setBounds(bounds);
            Drawable drawable = this.c.getResources().getDrawable(R.drawable.slider_btn);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.x.setThumb(drawable);
            this.x.setThumbOffset(0);
            if (Build.VERSION.SDK_INT >= 16) {
                this.x.getThumb().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.x.setSplitTrack(false);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        int[] iArr = this.y.U;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i = iArr[0] - this.D;
        this.A = i;
        this.x.setProgress(i);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.z);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(AbsoluteLayout.LayoutParams layoutParams) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = -1;
        }
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = -2;
        }
        this.x.getLayoutParams().width = i;
        this.x.getLayoutParams().height = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.z.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.z.getMeasuredWidth();
        this.k = this.z.getMeasuredHeight();
    }

    public void b(yj yjVar) {
        this.y = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.y.b = false;
        this.x.setOnSeekBarChangeListener(null);
        this.z.setOnTouchListener(null);
        this.x.setFocusable(false);
        yj yjVar = this.y;
        if (yjVar.e1) {
            n1.a(this.z, yjVar.d1);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.y.b = true;
        this.x.setOnSeekBarChangeListener(this.I);
        this.z.setOnTouchListener(this.q);
        this.x.setFocusable(true);
        if (this.y.e1) {
            n1.a(this.z, n1.r);
            this.y.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.z;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    public int m() {
        int i = this.A + this.D;
        this.A = i;
        return i;
    }

    public void n() {
        dj djVar = this.y.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void o() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.addView(this.z);
            this.b.invalidate();
        }
    }
}
