package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import java.io.IOException;
import p000.C2434ej;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.a */
/* loaded from: classes.dex */
public class C0611a extends AbstractC0652n1 {

    /* renamed from: A */
    private SeekBar f3498A;

    /* renamed from: B */
    private ImageButton f3499B;

    /* renamed from: C */
    private TextView f3500C;

    /* renamed from: D */
    private TextView f3501D;

    /* renamed from: E */
    private boolean f3502E;

    /* renamed from: F */
    private Handler f3503F;

    /* renamed from: G */
    private int f3504G;

    /* renamed from: H */
    private int f3505H;

    /* renamed from: I */
    private int f3506I;

    /* renamed from: J */
    public Runnable f3507J;

    /* renamed from: x */
    private C3489yj f3508x;

    /* renamed from: y */
    private LinearLayout f3509y;

    /* renamed from: z */
    private MediaPlayer f3510z;

    /* renamed from: com.comviva.webaxn.ui.a$a */
    /* loaded from: classes.dex */
    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C0611a.this.f3510z.seekTo(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.comviva.webaxn.ui.a$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0611a.this.f3499B.getId() != 1) {
                C0611a.this.f3499B.setImageResource(R.drawable.media_pause);
                C0611a.this.f3510z.pause();
                C0611a.this.f3499B.setId(2);
                return;
            }
            C0611a.this.f3499B.setImageResource(R.drawable.media_pause);
            C0611a.this.f3499B.setId(2);
            try {
                C0611a.this.f3510z.start();
                if (C0611a.this.f3502E) {
                    C0611a.this.f3502E = false;
                    C0611a.this.f3510z.seekTo(0);
                }
                C0611a.this.m4156p();
            } catch (IllegalStateException unused) {
                C0611a.this.f3510z.pause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.a$c */
    /* loaded from: classes.dex */
    public class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            C0611a.this.f3498A.setProgress(C0611a.this.f3510z.getDuration());
            TextView textView = C0611a.this.f3500C;
            C0611a c0611a = C0611a.this;
            textView.setText(c0611a.m4131a(c0611a.f3510z.getDuration(), true));
            C0611a.this.f3502E = true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.a$d */
    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0611a.this.m4156p();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.a$e */
    /* loaded from: classes.dex */
    public class e extends AsyncTask<String, Void, Void> {
        public e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                if (C0611a.this.f3510z != null && C0611a.this.f3510z.isPlaying()) {
                    C0611a.this.f3510z.stop();
                    C0611a.this.f3510z.release();
                    C0611a.this.f3510z = null;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public C0611a(Context context, C3489yj c3489yj, C0639j0 c0639j0) {
        super(context);
        this.f3502E = false;
        this.f3504G = 100;
        this.f3505H = 8;
        this.f3506I = 5;
        this.f3507J = new d();
        this.f4045c = context;
        this.f3508x = c3489yj;
        this.f3503F = new Handler();
        float f = this.f3504G;
        C3489yj c3489yj2 = this.f3508x;
        float f2 = c3489yj2.f14196a;
        this.f3504G = (int) (f * f2);
        this.f3506I = (int) (this.f3506I * f2);
        this.f3505H = (int) (this.f3505H * f2);
        C2434ej c2434ej = c3489yj2.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        int i = c0639j0.f3868e;
        i = i <= 0 ? c0639j0.f3880q.f4397c.width() - (this.f3508x.m16638d(c0639j0.f3880q.f4397c.width()) + this.f3508x.m16641g(c0639j0.f3880q.f4397c.width())) : i;
        int i2 = (i * 10) / 100;
        this.f3504G = i - i2;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f4045c).inflate(R.layout.audioview, (ViewGroup) null);
        this.f3509y = linearLayout;
        try {
            TextView textView = (TextView) linearLayout.findViewById(R.id.media_start);
            this.f3500C = textView;
            textView.setTextColor(-16777216);
            TextView textView2 = (TextView) this.f3509y.findViewById(R.id.media_end);
            this.f3501D = textView2;
            textView2.setTextColor(-16777216);
            this.f3498A = (SeekBar) this.f3509y.findViewById(R.id.trackbar);
            ImageButton imageButton = (ImageButton) this.f3509y.findViewById(R.id.ppbutton);
            this.f3499B = imageButton;
            imageButton.setId(1);
            this.f3499B.setBackgroundColor(0);
            if (!TextUtils.isEmpty(this.f3508x.f14226k)) {
                m4144b(this.f3508x.f14226k);
            }
            this.f3501D.setText(m4131a(this.f3510z.getDuration(), true));
            if (this.f3499B.getLayoutParams() != null) {
                this.f3499B.getLayoutParams().width = i2;
                this.f3499B.getLayoutParams().height = i2;
            }
            if (this.f3498A.getLayoutParams() != null) {
                this.f3498A.getLayoutParams().width = this.f3504G;
            }
            int paddingLeft = this.f3498A.getThumb().getBounds().right > this.f3498A.getPaddingLeft() ? this.f3498A.getThumb().getBounds().right / 2 : this.f3498A.getPaddingLeft();
            int paddingBottom = this.f3498A.getThumb().getBounds().bottom > this.f3498A.getPaddingBottom() ? this.f3498A.getThumb().getBounds().bottom / 2 : this.f3498A.getPaddingBottom();
            this.f3498A.setPadding(paddingLeft, paddingBottom, paddingLeft, paddingBottom);
            paddingBottom = paddingBottom == 0 ? paddingLeft : paddingBottom;
            this.f3500C.setPadding(paddingLeft, paddingBottom, paddingLeft, paddingBottom);
            this.f3501D.setPadding(paddingLeft, paddingBottom, paddingLeft, paddingBottom);
            this.f3498A.setMax(this.f3510z.getDuration());
            this.f3500C.setText(m4131a(0, true));
            this.f3498A.setOnSeekBarChangeListener(new a());
            this.f3499B.setOnClickListener(new b());
        } catch (IOException unused) {
            Toast.makeText(this.f4045c, "Sorry the player does not support this audio file", 1).show();
        } catch (IllegalArgumentException | IllegalStateException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m4131a(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            i2 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            int i5 = i / 1000;
            int i6 = i5 == 0 ? 0 : i5 / 60;
            i2 = i5 % 60;
            i3 = i6 / 60;
            i4 = i6 % 60;
        }
        return i3 == 0 ? z ? String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i2)) : String.format("-%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i2)) : z ? String.format("%d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2)) : String.format("-%d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public int m4138a(AbsoluteLayout.LayoutParams layoutParams, C0669v0 c0669v0) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = c0669v0.f4397c.width() - (this.f3508x.m16638d(c0669v0.f4397c.width()) + this.f3508x.m16641g(c0669v0.f4397c.width()));
        }
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = -2;
        }
        this.f3509y.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3509y.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f3509y.getMeasuredWidth();
        int measuredHeight = this.f3509y.getMeasuredHeight();
        this.f4053k = measuredHeight;
        return measuredHeight;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f3509y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f3509y.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4141a(c3489yj.f14260v0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3509y.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f3509y.getMeasuredWidth();
        this.f4053k = this.f3509y.getMeasuredHeight();
    }

    /* renamed from: a */
    public void m4141a(byte[] bArr) {
        Drawable colorDrawable;
        int identifier = !TextUtils.isEmpty(this.f3508x.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f3508x.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        if (identifier > 0) {
            try {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f3508x.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3508x.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f3509y.setBackgroundDrawable(this.f4047e);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            } catch (OutOfMemoryError e3) {
                e3.printStackTrace();
                return;
            }
        }
        if (bArr != null) {
            try {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f3508x.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3508x.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f3509y.setBackgroundDrawable(this.f4047e);
            } catch (Exception e4) {
                e4.printStackTrace();
            } catch (OutOfMemoryError e5) {
                e5.printStackTrace();
            }
            this.f3509y.setTag(this.f3508x);
            return;
        }
        this.f3509y.setTag(this.f3508x);
        C3489yj c3489yj = this.f3508x;
        C2434ej c2434ej = c3489yj.f14173O0;
        if (c2434ej == null) {
            if (c3489yj.f14241p.m6071j()) {
                int m5664f0 = C0713j1.m5563a(this.f4045c).m5664f0();
                this.f4050h = m5664f0;
                this.f4050h = AbstractC0652n1.m4701d(m5664f0);
                colorDrawable = new ColorDrawable(this.f4046d);
            }
            this.f3509y.setBackgroundDrawable(this.f4047e);
        }
        colorDrawable = C0755x1.m6122a(c2434ej, this.f4046d);
        this.f4047e = colorDrawable;
        this.f3509y.setBackgroundDrawable(this.f4047e);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f3509y);
        m4154n();
        this.f3503F = null;
        this.f4049g.mo4835a((AbstractC0652n1) null);
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
        this.f3509y.getLayoutParams().width = i;
        this.f3509y.getLayoutParams().height = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3509y.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f3509y.getMeasuredWidth();
        this.f4053k = this.f3509y.getMeasuredHeight();
    }

    /* renamed from: b */
    void m4144b(String str) {
        this.f3510z = null;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f3510z = mediaPlayer;
        mediaPlayer.setAudioStreamType(3);
        this.f3510z.setDataSource(str);
        this.f3510z.prepare();
        this.f3510z.setOnCompletionListener(new c());
    }

    /* renamed from: b */
    public void m4145b(C3489yj c3489yj) {
        this.f3508x = c3489yj;
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
        return this.f3508x;
    }

    /* renamed from: g */
    public void m4149g(int i) {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3509y;
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
    public void m4153m() {
        try {
            if (this.f3510z == null || !this.f3510z.isPlaying()) {
                return;
            }
            this.f3510z.pause();
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public void m4154n() {
        e eVar = new e();
        if (Build.VERSION.SDK_INT >= 11) {
            eVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "");
        } else {
            eVar.execute("");
        }
    }

    /* renamed from: o */
    public void m4155o() {
        ViewGroup viewGroup = this.f4044b;
        if (viewGroup != null) {
            viewGroup.addView(this.f3509y);
            this.f4044b.invalidate();
        }
    }

    /* renamed from: p */
    public void m4156p() {
        try {
            if (this.f3510z == null || this.f3502E) {
                this.f3503F.removeCallbacks(this.f3507J);
                this.f3499B.setImageResource(R.drawable.media_play);
                this.f3499B.setId(1);
                this.f3500C.setText(m4131a(0, true));
                this.f3498A.setProgress(0);
            } else {
                this.f3498A.setProgress(this.f3510z.getCurrentPosition());
                this.f3500C.setText(m4131a(this.f3510z.getCurrentPosition(), true));
                if (this.f3510z.isPlaying()) {
                    this.f3499B.setImageResource(R.drawable.media_pause);
                    this.f3499B.setId(2);
                    if (this.f3503F != null) {
                        this.f3503F.postDelayed(this.f3507J, 500L);
                    }
                } else {
                    this.f3499B.setImageResource(R.drawable.media_play);
                    this.f3499B.setId(1);
                }
            }
        } catch (Exception unused) {
        }
    }
}
