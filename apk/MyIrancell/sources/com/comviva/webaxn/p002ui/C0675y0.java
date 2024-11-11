package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C2391dj;
import p000.C2434ej;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;
import p000.C3531zj;

/* renamed from: com.comviva.webaxn.ui.y0 */
/* loaded from: classes.dex */
public class C0675y0 extends AbstractC0652n1 {

    /* renamed from: A */
    private int f4524A;

    /* renamed from: B */
    private C3531zj f4525B;

    /* renamed from: C */
    private boolean f4526C;

    /* renamed from: D */
    private int f4527D;

    /* renamed from: E */
    private int f4528E;

    /* renamed from: F */
    private String f4529F;

    /* renamed from: G */
    private View.OnClickListener f4530G;

    /* renamed from: H */
    private SeekBar.OnSeekBarChangeListener f4531H;

    /* renamed from: x */
    private SeekBar f4532x;

    /* renamed from: y */
    private C3489yj f4533y;

    /* renamed from: z */
    private LinearLayout f4534z;

    /* renamed from: com.comviva.webaxn.ui.y0$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0675y0 c0675y0 = C0675y0.this;
            c0675y0.f4049g.mo4849b(c0675y0);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.y0$b */
    /* loaded from: classes.dex */
    class b implements SeekBar.OnSeekBarChangeListener {
        b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C0675y0.this.f4524A = i;
            if (C0675y0.this.f4533y.f14181S0 != null) {
                String valueOf = String.valueOf(C0675y0.this.m5168m());
                if (C0675y0.this.f4526C) {
                    valueOf = valueOf + C0675y0.this.f4529F;
                }
                C0755x1.m6154a(valueOf, C0675y0.this.f4533y.f14181S0, C0675y0.this.f4525B);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public C0675y0(Context context, C3489yj c3489yj, C3531zj c3531zj) {
        super(context);
        this.f4526C = false;
        this.f4527D = 0;
        this.f4528E = 100;
        this.f4529F = "";
        this.f4530G = new a();
        this.f4531H = new b();
        this.f4533y = c3489yj;
        this.f4525B = c3531zj;
        this.f4534z = new LinearLayout(this.f4045c);
        this.f4532x = new SeekBar(this.f4045c);
        if (!TextUtils.isEmpty(this.f4533y.f14249r1)) {
            this.f4532x.setContentDescription(this.f4533y.f14249r1);
        }
        C3361vj c3361vj = this.f4533y.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f4534z, c3361vj.m16034a());
        }
        C3489yj c3489yj2 = this.f4533y;
        String str = c3489yj2.f14177Q0;
        String str2 = c3489yj2.f14179R0;
        if (!TextUtils.isEmpty(str)) {
            if (str.contains(".")) {
                this.f4526C = true;
                String str3 = this.f4533y.f14177Q0;
                str = str3.substring(0, str3.indexOf("."));
                String str4 = this.f4533y.f14177Q0;
                this.f4529F = str4.substring(str4.indexOf("."));
            }
            try {
                this.f4527D = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2.contains(".")) {
                String str5 = this.f4533y.f14179R0;
                str2 = str5.substring(0, str5.indexOf("."));
            }
            try {
                this.f4528E = Integer.parseInt(str2);
            } catch (Exception unused2) {
            }
        }
        this.f4532x.setMax(this.f4528E - this.f4527D);
        this.f4532x.setPadding(0, 0, 0, 0);
        this.f4534z.addView(this.f4532x, new LinearLayout.LayoutParams(-1, -2));
        if (this.f4533y.f14199b) {
            this.f4532x.setOnClickListener(this.f4530G);
            this.f4532x.setOnSeekBarChangeListener(this.f4531H);
            this.f4534z.setOnTouchListener(this.f4059q);
            this.f4534z.setTag(this);
        } else {
            this.f4532x.setClickable(false);
            AbstractC0652n1.m4697a(this.f4534z, this.f4533y.f14207d1);
            this.f4533y.f14210e1 = true;
        }
        if (this.f4533y.f14181S0 != null) {
            String valueOf = String.valueOf(m5168m());
            if (this.f4526C) {
                valueOf = valueOf + this.f4529F;
            }
            C0755x1.m6154a(valueOf, this.f4533y.f14181S0, this.f4525B);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        int i;
        if (TextUtils.isEmpty(this.f4533y.f14233m0)) {
            i = -1;
        } else {
            i = this.f4533y.m16645k(c0669v0.f4397c.width());
            if (i < 0) {
                i = c0669v0.f4397c.width() - (this.f4533y.m16638d(c0669v0.f4397c.width()) + this.f4533y.m16641g(c0669v0.f4397c.width()));
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, -2);
        layoutParams.setMargins(this.f4533y.m16638d(c0669v0.f4397c.width()), this.f4533y.m16643i(c0669v0.f4397c.width()), this.f4533y.m16641g(c0669v0.f4397c.width()), this.f4533y.m16632a(c0669v0.f4397c.width()));
        C3489yj c3489yj = this.f4533y;
        layoutParams.gravity = C0755x1.m6116a(c3489yj.f14214g, c3489yj.f14217h, C0755x1.m6177c());
        this.f4534z.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void m5165a(C0669v0 c0669v0) {
        AbstractC0652n1.m4701d(this.f4533y.f14241p.m6062c());
        this.f4532x.setThumb(new ColorDrawable(this.f4046d));
        if (this.f4044b != null) {
            int i = -1;
            if (!TextUtils.isEmpty(this.f4533y.f14233m0) && (i = this.f4533y.m16645k(c0669v0.f4397c.width())) < 0) {
                i = c0669v0.f4397c.width() - (this.f4533y.m16638d(c0669v0.f4397c.width()) + this.f4533y.m16641g(c0669v0.f4397c.width()));
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, -2);
            layoutParams.setMargins(this.f4533y.m16638d(c0669v0.f4397c.width()), this.f4533y.m16643i(c0669v0.f4397c.width()), this.f4533y.m16641g(c0669v0.f4397c.width()), this.f4533y.m16632a(c0669v0.f4397c.width()));
            C3489yj c3489yj = this.f4533y;
            layoutParams.gravity = C0755x1.m6116a(c3489yj.f14214g, c3489yj.f14217h, C0755x1.m6177c());
            this.f4044b.addView(this.f4534z, layoutParams);
            this.f4044b.invalidate();
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        if (c3489yj != null) {
            m5166a(c3489yj.f14260v0);
        }
    }

    /* renamed from: a */
    public void m5166a(byte[] bArr) {
        Drawable colorDrawable;
        int identifier = !TextUtils.isEmpty(this.f4533y.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f4533y.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        if (identifier > 0) {
            try {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f4533y.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f4533y.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            }
        } else if (bArr != null) {
            try {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f4533y.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f4533y.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
            } catch (Exception e3) {
                e3.printStackTrace();
            } catch (OutOfMemoryError e4) {
                e4.printStackTrace();
            }
            this.f4534z.setTag(this.f4533y);
            int m5664f0 = C0713j1.m5563a(this.f4045c).m5664f0();
            this.f4050h = m5664f0;
            this.f4050h = AbstractC0652n1.m4701d(m5664f0);
        } else {
            this.f4046d = AbstractC0652n1.m4701d(this.f4533y.f14241p.m6057b());
            this.f4534z.setTag(this.f4533y);
            C3489yj c3489yj = this.f4533y;
            C2434ej c2434ej = c3489yj.f14173O0;
            if (c2434ej != null) {
                c2434ej.m11615a(this.f4053k);
                colorDrawable = C0755x1.m6122a(this.f4533y.f14173O0, this.f4046d);
            } else if (c3489yj.f14241p.m6071j()) {
                int m5664f02 = C0713j1.m5563a(this.f4045c).m5664f0();
                this.f4050h = m5664f02;
                this.f4050h = AbstractC0652n1.m4701d(m5664f02);
                colorDrawable = new ColorDrawable(this.f4046d);
            }
            this.f4047e = colorDrawable;
        }
        try {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setColor(AbstractC0652n1.m4701d(this.f4533y.f14241p.m6062c()));
            ClipDrawable clipDrawable = new ClipDrawable(shapeDrawable, 3, 1);
            Rect bounds = this.f4532x.getProgressDrawable().getBounds();
            this.f4532x.setProgressDrawable(new LayerDrawable(new Drawable[]{this.f4047e, clipDrawable}));
            this.f4532x.getProgressDrawable().setBounds(bounds);
            Drawable drawable = this.f4045c.getResources().getDrawable(R.drawable.slider_btn);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.f4532x.setThumb(drawable);
            this.f4532x.setThumbOffset(0);
            if (Build.VERSION.SDK_INT >= 16) {
                this.f4532x.getThumb().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.f4532x.setSplitTrack(false);
            }
        } catch (Exception unused) {
        }
        int[] iArr = this.f4533y.f14184U;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i = iArr[0] - this.f4527D;
        this.f4524A = i;
        this.f4532x.setProgress(i);
    }

    /* renamed from: b */
    public void m5167b(C3489yj c3489yj) {
        this.f4533y = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f4533y.f14199b = false;
        this.f4532x.setClickable(false);
        this.f4532x.setOnClickListener(null);
        this.f4532x.setOnSeekBarChangeListener(null);
        this.f4534z.setOnTouchListener(null);
        this.f4532x.setFocusable(false);
        C3489yj c3489yj = this.f4533y;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f4534z, c3489yj.f14207d1);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f4533y.f14199b = true;
        this.f4532x.setClickable(true);
        this.f4532x.setOnClickListener(this.f4530G);
        this.f4532x.setOnSeekBarChangeListener(this.f4531H);
        this.f4534z.setOnTouchListener(this.f4059q);
        this.f4532x.setFocusable(true);
        if (this.f4533y.f14210e1) {
            AbstractC0652n1.m4697a(this.f4534z, AbstractC0652n1.f4038r);
            this.f4533y.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f4533y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4534z;
    }

    /* renamed from: m */
    public int m5168m() {
        int i = this.f4524A + this.f4527D;
        this.f4524A = i;
        return i;
    }

    /* renamed from: n */
    public void m5169n() {
        C2391dj c2391dj = this.f4533y.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }
}
