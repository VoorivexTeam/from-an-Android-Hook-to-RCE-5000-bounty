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
import android.view.View;
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
public class y0 extends n1 {
    private int A;
    private zj B;
    private boolean C;
    private int D;
    private int E;
    private String F;
    private View.OnClickListener G;
    private SeekBar.OnSeekBarChangeListener H;
    private SeekBar x;
    private yj y;
    private LinearLayout z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y0 y0Var = y0.this;
            y0Var.g.b(y0Var);
        }
    }

    /* loaded from: classes.dex */
    class b implements SeekBar.OnSeekBarChangeListener {
        b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            y0.this.A = i;
            if (y0.this.y.S0 != null) {
                String valueOf = String.valueOf(y0.this.m());
                if (y0.this.C) {
                    valueOf = valueOf + y0.this.F;
                }
                x1.a(valueOf, y0.this.y.S0, y0.this.B);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public y0(Context context, yj yjVar, zj zjVar) {
        super(context);
        this.C = false;
        this.D = 0;
        this.E = 100;
        this.F = "";
        this.G = new a();
        this.H = new b();
        this.y = yjVar;
        this.B = zjVar;
        this.z = new LinearLayout(this.c);
        this.x = new SeekBar(this.c);
        if (!TextUtils.isEmpty(this.y.r1)) {
            this.x.setContentDescription(this.y.r1);
        }
        vj vjVar = this.y.q1;
        if (vjVar != null) {
            q2.a(this.z, vjVar.a());
        }
        yj yjVar2 = this.y;
        String str = yjVar2.Q0;
        String str2 = yjVar2.R0;
        if (!TextUtils.isEmpty(str)) {
            if (str.contains(".")) {
                this.C = true;
                String str3 = this.y.Q0;
                str = str3.substring(0, str3.indexOf("."));
                String str4 = this.y.Q0;
                this.F = str4.substring(str4.indexOf("."));
            }
            try {
                this.D = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2.contains(".")) {
                String str5 = this.y.R0;
                str2 = str5.substring(0, str5.indexOf("."));
            }
            try {
                this.E = Integer.parseInt(str2);
            } catch (Exception unused2) {
            }
        }
        this.x.setMax(this.E - this.D);
        this.x.setPadding(0, 0, 0, 0);
        this.z.addView(this.x, new LinearLayout.LayoutParams(-1, -2));
        if (this.y.b) {
            this.x.setOnClickListener(this.G);
            this.x.setOnSeekBarChangeListener(this.H);
            this.z.setOnTouchListener(this.q);
            this.z.setTag(this);
        } else {
            this.x.setClickable(false);
            n1.a(this.z, this.y.d1);
            this.y.e1 = true;
        }
        if (this.y.S0 != null) {
            String valueOf = String.valueOf(m());
            if (this.C) {
                valueOf = valueOf + this.F;
            }
            x1.a(valueOf, this.y.S0, this.B);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        int i;
        if (TextUtils.isEmpty(this.y.m0)) {
            i = -1;
        } else {
            i = this.y.k(v0Var.c.width());
            if (i < 0) {
                i = v0Var.c.width() - (this.y.d(v0Var.c.width()) + this.y.g(v0Var.c.width()));
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, -2);
        layoutParams.setMargins(this.y.d(v0Var.c.width()), this.y.i(v0Var.c.width()), this.y.g(v0Var.c.width()), this.y.a(v0Var.c.width()));
        yj yjVar = this.y;
        layoutParams.gravity = x1.a(yjVar.g, yjVar.h, x1.c());
        this.z.setLayoutParams(layoutParams);
    }

    public void a(v0 v0Var) {
        n1.d(this.y.p.c());
        this.x.setThumb(new ColorDrawable(this.d));
        if (this.b != null) {
            int i = -1;
            if (!TextUtils.isEmpty(this.y.m0) && (i = this.y.k(v0Var.c.width())) < 0) {
                i = v0Var.c.width() - (this.y.d(v0Var.c.width()) + this.y.g(v0Var.c.width()));
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, -2);
            layoutParams.setMargins(this.y.d(v0Var.c.width()), this.y.i(v0Var.c.width()), this.y.g(v0Var.c.width()), this.y.a(v0Var.c.width()));
            yj yjVar = this.y;
            layoutParams.gravity = x1.a(yjVar.g, yjVar.h, x1.c());
            this.b.addView(this.z, layoutParams);
            this.b.invalidate();
        }
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
                ejVar.a(this.k);
                colorDrawable = x1.a(this.y.O0, this.d);
            } else if (yjVar.p.j()) {
                int f02 = com.comviva.webaxn.utils.j1.a(this.c).f0();
                this.h = f02;
                this.h = n1.d(f02);
                colorDrawable = new ColorDrawable(this.d);
            }
            this.e = colorDrawable;
        }
        try {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
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
        } catch (Exception unused) {
        }
        int[] iArr = this.y.U;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i = iArr[0] - this.D;
        this.A = i;
        this.x.setProgress(i);
    }

    public void b(yj yjVar) {
        this.y = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.y.b = false;
        this.x.setClickable(false);
        this.x.setOnClickListener(null);
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
        this.x.setClickable(true);
        this.x.setOnClickListener(this.G);
        this.x.setOnSeekBarChangeListener(this.H);
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
}
