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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.comviva.webaxn.utils.C0687b;
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

/* renamed from: com.comviva.webaxn.ui.z0 */
/* loaded from: classes.dex */
public class C0677z0 extends AbstractC0652n1 {

    /* renamed from: A */
    private int f4547A;

    /* renamed from: B */
    private C3531zj f4548B;

    /* renamed from: C */
    private boolean f4549C;

    /* renamed from: D */
    private int f4550D;

    /* renamed from: E */
    private int f4551E;

    /* renamed from: F */
    private String f4552F;

    /* renamed from: G */
    private int f4553G;

    /* renamed from: H */
    private String f4554H;

    /* renamed from: I */
    private SeekBar.OnSeekBarChangeListener f4555I;

    /* renamed from: x */
    private SeekBar f4556x;

    /* renamed from: y */
    private C3489yj f4557y;

    /* renamed from: z */
    private LinearLayout f4558z;

    /* renamed from: com.comviva.webaxn.ui.z0$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0677z0 c0677z0 = C0677z0.this;
            c0677z0.f4049g.mo4849b(c0677z0);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.z0$b */
    /* loaded from: classes.dex */
    class b implements SeekBar.OnSeekBarChangeListener {
        b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C0677z0.this.f4547A = i;
            if (C0677z0.this.f4557y.f14181S0 != null) {
                String valueOf = String.valueOf(C0677z0.this.m5185m());
                if (C0677z0.this.f4549C) {
                    valueOf = valueOf + C0677z0.this.f4554H;
                }
                C0755x1.m6154a(valueOf, C0677z0.this.f4557y.f14181S0, C0677z0.this.f4548B);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            C0677z0 c0677z0 = C0677z0.this;
            c0677z0.f4049g.mo4849b(c0677z0);
        }
    }

    public C0677z0(Context context, C3489yj c3489yj, C0639j0 c0639j0, C3531zj c3531zj) {
        super(context);
        String str;
        this.f4547A = 0;
        this.f4549C = false;
        this.f4550D = 0;
        this.f4551E = 100;
        this.f4552F = "5px";
        this.f4553G = 5;
        this.f4554H = "";
        new a();
        this.f4555I = new b();
        this.f4557y = c3489yj;
        this.f4548B = c3531zj;
        this.f4557y = c3489yj;
        LinearLayout linearLayout = new LinearLayout(this.f4045c);
        this.f4558z = linearLayout;
        C3361vj c3361vj = this.f4557y.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(linearLayout, c3361vj.m16034a());
        }
        C2434ej c2434ej = this.f4557y.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        if (this.f4045c.getPackageName().equals("com.comviva.cpw") || this.f4045c.getPackageName().equals("com.comviva.cpwdev") || this.f4045c.getPackageName().equals("com.comviva.cpwuat") || this.f4045c.getPackageName().equals("com.comviva.cpwselfcare") || this.f4045c.getPackageName().equals("com.cpw") || this.f4045c.getPackageName().equals("com.comviva.cpwcit") || this.f4045c.getPackageName().equals("com.comviva.cpwcit1") || this.f4045c.getPackageName().equals("com.cpwdev2") || this.f4045c.getPackageName().equals("com.agcpwdev") || this.f4045c.getPackageName().equals("com.cloudcpw")) {
            if (C0687b.m5342a(this.f4045c).m5343a().m5556h()) {
                this.f4556x = (SeekBar) LayoutInflater.from(this.f4045c).inflate(R.layout.custom_seekbar_tablet, (ViewGroup) null).findViewById(R.id.seekbartab);
                this.f4553G = (int) (this.f4557y.f14196a * 11.0f);
                str = "11px";
            } else {
                this.f4556x = (SeekBar) LayoutInflater.from(this.f4045c).inflate(R.layout.custom_seekbar, (ViewGroup) null).findViewById(R.id.seekbar);
                this.f4553G = (int) (this.f4557y.f14196a * 7.0f);
                str = "7px";
            }
            this.f4552F = str;
        } else {
            this.f4556x = new SeekBar(this.f4045c);
        }
        if (!TextUtils.isEmpty(this.f4557y.f14249r1)) {
            this.f4556x.setContentDescription(this.f4557y.f14249r1);
        }
        C3489yj c3489yj2 = this.f4557y;
        String str2 = c3489yj2.f14177Q0;
        String str3 = c3489yj2.f14179R0;
        if (!TextUtils.isEmpty(str2)) {
            if (str2.contains(".")) {
                this.f4549C = true;
                String str4 = this.f4557y.f14177Q0;
                str2 = str4.substring(0, str4.indexOf("."));
                String str5 = this.f4557y.f14177Q0;
                this.f4554H = str5.substring(str5.indexOf("."));
            }
            try {
                this.f4550D = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            if (str3.contains(".")) {
                String str6 = this.f4557y.f14179R0;
                str3 = str6.substring(0, str6.indexOf("."));
            }
            try {
                this.f4551E = Integer.parseInt(str3);
            } catch (Exception unused2) {
            }
        }
        this.f4556x.setMax(this.f4551E - this.f4550D);
        if (this.f4557y.f14199b) {
            this.f4556x.setOnSeekBarChangeListener(this.f4555I);
            this.f4558z.setOnTouchListener(this.f4059q);
        } else {
            this.f4556x.setClickable(false);
            AbstractC0652n1.m4697a(this.f4558z, this.f4557y.f14207d1);
            this.f4557y.f14210e1 = true;
        }
        String str7 = this.f4557y.f14181S0;
        if (str7 != null && str7 != null) {
            String valueOf = String.valueOf(m5185m());
            if (this.f4549C) {
                valueOf = valueOf + this.f4554H;
            }
            C0755x1.m6154a(valueOf, this.f4557y.f14181S0, this.f4548B);
        }
        C3489yj c3489yj3 = this.f4557y;
        if (c3489yj3.f14173O0 == null) {
            c3489yj3.f14173O0 = new C2434ej(c3489yj3.f14196a);
            this.f4557y.f14173O0.m11618b(this.f4552F);
            this.f4557y.f14173O0.m11622d(this.f4552F);
            this.f4557y.f14173O0.m11620c(this.f4552F);
            this.f4557y.f14173O0.m11616a(this.f4552F);
        }
    }

    /* renamed from: a */
    public int m5182a(AbsoluteLayout.LayoutParams layoutParams, C0669v0 c0669v0) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = c0669v0.f4397c.width() - (this.f4557y.m16638d(c0669v0.f4397c.width()) + this.f4557y.m16641g(c0669v0.f4397c.width()));
        }
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = -2;
        }
        this.f4556x.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
        this.f4558z.addView(this.f4556x);
        this.f4556x.setPadding(0, 0, 0, 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4558z.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f4558z.getMeasuredWidth();
        this.f4053k = this.f4558z.getMeasuredHeight();
        this.f4558z.setLayoutParams(new AbsoluteLayout.LayoutParams(-2, -2, layoutParams.x, layoutParams.y));
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f4558z.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f4558z.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        if (c3489yj != null) {
            m5183a(c3489yj.f14260v0);
        }
    }

    /* renamed from: a */
    public void m5183a(byte[] bArr) {
        Drawable colorDrawable;
        int identifier = !TextUtils.isEmpty(this.f4557y.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f4557y.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        if (identifier > 0) {
            try {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f4557y.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f4557y.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            }
        } else if (bArr != null) {
            try {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f4557y.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f4557y.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
            } catch (Exception e3) {
                e3.printStackTrace();
            } catch (OutOfMemoryError e4) {
                e4.printStackTrace();
            }
            this.f4558z.setTag(this.f4557y);
            int m5664f0 = C0713j1.m5563a(this.f4045c).m5664f0();
            this.f4050h = m5664f0;
            this.f4050h = AbstractC0652n1.m4701d(m5664f0);
        } else {
            this.f4046d = AbstractC0652n1.m4701d(this.f4557y.f14241p.m6057b());
            this.f4558z.setTag(this.f4557y);
            C3489yj c3489yj = this.f4557y;
            C2434ej c2434ej = c3489yj.f14173O0;
            if (c2434ej != null) {
                colorDrawable = C0755x1.m6122a(c2434ej, this.f4046d);
            } else if (c3489yj.f14241p.m6071j()) {
                int m5664f02 = C0713j1.m5563a(this.f4045c).m5664f0();
                this.f4050h = m5664f02;
                this.f4050h = AbstractC0652n1.m4701d(m5664f02);
                colorDrawable = new ColorDrawable(this.f4046d);
            }
            this.f4047e = colorDrawable;
        }
        try {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{this.f4553G, this.f4553G, this.f4553G, this.f4553G, this.f4553G, this.f4553G, this.f4553G, this.f4553G}, null, null));
            shapeDrawable.getPaint().setColor(AbstractC0652n1.m4701d(this.f4557y.f14241p.m6062c()));
            ClipDrawable clipDrawable = new ClipDrawable(shapeDrawable, 3, 1);
            Rect bounds = this.f4556x.getProgressDrawable().getBounds();
            this.f4556x.setProgressDrawable(new LayerDrawable(new Drawable[]{this.f4047e, clipDrawable}));
            this.f4556x.getProgressDrawable().setBounds(bounds);
            Drawable drawable = this.f4045c.getResources().getDrawable(R.drawable.slider_btn);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.f4556x.setThumb(drawable);
            this.f4556x.setThumbOffset(0);
            if (Build.VERSION.SDK_INT >= 16) {
                this.f4556x.getThumb().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.f4556x.setSplitTrack(false);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        int[] iArr = this.f4557y.f14184U;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i = iArr[0] - this.f4550D;
        this.f4547A = i;
        this.f4556x.setProgress(i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f4558z);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = -1;
        }
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = -2;
        }
        this.f4556x.getLayoutParams().width = i;
        this.f4556x.getLayoutParams().height = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4558z.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f4558z.getMeasuredWidth();
        this.f4053k = this.f4558z.getMeasuredHeight();
    }

    /* renamed from: b */
    public void m5184b(C3489yj c3489yj) {
        this.f4557y = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f4557y.f14199b = false;
        this.f4556x.setOnSeekBarChangeListener(null);
        this.f4558z.setOnTouchListener(null);
        this.f4556x.setFocusable(false);
        C3489yj c3489yj = this.f4557y;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f4558z, c3489yj.f14207d1);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f4557y.f14199b = true;
        this.f4556x.setOnSeekBarChangeListener(this.f4555I);
        this.f4558z.setOnTouchListener(this.f4059q);
        this.f4556x.setFocusable(true);
        if (this.f4557y.f14210e1) {
            AbstractC0652n1.m4697a(this.f4558z, AbstractC0652n1.f4038r);
            this.f4557y.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f4557y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4558z;
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

    /* renamed from: m */
    public int m5185m() {
        int i = this.f4547A + this.f4550D;
        this.f4547A = i;
        return i;
    }

    /* renamed from: n */
    public void m5186n() {
        C2391dj c2391dj = this.f4557y.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: o */
    public void m5187o() {
        ViewGroup viewGroup = this.f4044b;
        if (viewGroup != null) {
            viewGroup.addView(this.f4558z);
            this.f4044b.invalidate();
        }
    }
}
