package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.ej;
import defpackage.yj;
import java.io.IOException;

/* loaded from: classes.dex */
public class a extends n1 {
    private SeekBar A;
    private ImageButton B;
    private TextView C;
    private TextView D;
    private boolean E;
    private Handler F;
    private int G;
    private int H;
    private int I;
    public Runnable J;
    private yj x;
    private LinearLayout y;
    private MediaPlayer z;

    /* renamed from: com.comviva.webaxn.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0029a implements SeekBar.OnSeekBarChangeListener {
        C0029a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                a.this.z.seekTo(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.B.getId() != 1) {
                a.this.B.setImageResource(R.drawable.media_pause);
                a.this.z.pause();
                a.this.B.setId(2);
                return;
            }
            a.this.B.setImageResource(R.drawable.media_pause);
            a.this.B.setId(2);
            try {
                a.this.z.start();
                if (a.this.E) {
                    a.this.E = false;
                    a.this.z.seekTo(0);
                }
                a.this.p();
            } catch (IllegalStateException unused) {
                a.this.z.pause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            a.this.A.setProgress(a.this.z.getDuration());
            TextView textView = a.this.C;
            a aVar = a.this;
            textView.setText(aVar.a(aVar.z.getDuration(), true));
            a.this.E = true;
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.p();
        }
    }

    /* loaded from: classes.dex */
    public class e extends AsyncTask<String, Void, Void> {
        public e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                if (a.this.z != null && a.this.z.isPlaying()) {
                    a.this.z.stop();
                    a.this.z.release();
                    a.this.z = null;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public a(Context context, yj yjVar, j0 j0Var) {
        super(context);
        this.E = false;
        this.G = 100;
        this.H = 8;
        this.I = 5;
        this.J = new d();
        this.c = context;
        this.x = yjVar;
        this.F = new Handler();
        float f = this.G;
        yj yjVar2 = this.x;
        float f2 = yjVar2.a;
        this.G = (int) (f * f2);
        this.I = (int) (this.I * f2);
        this.H = (int) (this.H * f2);
        ej ejVar = yjVar2.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
        int i = j0Var.e;
        i = i <= 0 ? j0Var.q.c.width() - (this.x.d(j0Var.q.c.width()) + this.x.g(j0Var.q.c.width())) : i;
        int i2 = (i * 10) / 100;
        this.G = i - i2;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.c).inflate(R.layout.audioview, (ViewGroup) null);
        this.y = linearLayout;
        try {
            TextView textView = (TextView) linearLayout.findViewById(R.id.media_start);
            this.C = textView;
            textView.setTextColor(-16777216);
            TextView textView2 = (TextView) this.y.findViewById(R.id.media_end);
            this.D = textView2;
            textView2.setTextColor(-16777216);
            this.A = (SeekBar) this.y.findViewById(R.id.trackbar);
            ImageButton imageButton = (ImageButton) this.y.findViewById(R.id.ppbutton);
            this.B = imageButton;
            imageButton.setId(1);
            this.B.setBackgroundColor(0);
            if (!TextUtils.isEmpty(this.x.k)) {
                b(this.x.k);
            }
            this.D.setText(a(this.z.getDuration(), true));
            if (this.B.getLayoutParams() != null) {
                this.B.getLayoutParams().width = i2;
                this.B.getLayoutParams().height = i2;
            }
            if (this.A.getLayoutParams() != null) {
                this.A.getLayoutParams().width = this.G;
            }
            int paddingLeft = this.A.getThumb().getBounds().right > this.A.getPaddingLeft() ? this.A.getThumb().getBounds().right / 2 : this.A.getPaddingLeft();
            int paddingBottom = this.A.getThumb().getBounds().bottom > this.A.getPaddingBottom() ? this.A.getThumb().getBounds().bottom / 2 : this.A.getPaddingBottom();
            this.A.setPadding(paddingLeft, paddingBottom, paddingLeft, paddingBottom);
            paddingBottom = paddingBottom == 0 ? paddingLeft : paddingBottom;
            this.C.setPadding(paddingLeft, paddingBottom, paddingLeft, paddingBottom);
            this.D.setPadding(paddingLeft, paddingBottom, paddingLeft, paddingBottom);
            this.A.setMax(this.z.getDuration());
            this.C.setText(a(0, true));
            this.A.setOnSeekBarChangeListener(new C0029a());
            this.B.setOnClickListener(new b());
        } catch (IOException unused) {
            Toast.makeText(this.c, "Sorry the player does not support this audio file", 1).show();
        } catch (IllegalArgumentException | IllegalStateException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i, boolean z) {
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

    public int a(AbsoluteLayout.LayoutParams layoutParams, v0 v0Var) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = v0Var.c.width() - (this.x.d(v0Var.c.width()) + this.x.g(v0Var.c.width()));
        }
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = -2;
        }
        this.y.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.y.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.y.getMeasuredWidth();
        int measuredHeight = this.y.getMeasuredHeight();
        this.k = measuredHeight;
        return measuredHeight;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.v0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.y.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.y.getMeasuredWidth();
        this.k = this.y.getMeasuredHeight();
    }

    public void a(byte[] bArr) {
        Drawable colorDrawable;
        int identifier = !TextUtils.isEmpty(this.x.r0) ? this.c.getResources().getIdentifier(this.x.r0, "drawable", this.c.getPackageName()) : 0;
        if (identifier > 0) {
            try {
                Bitmap a = com.comviva.webaxn.utils.e1.b(this.c).a(this.x.r0);
                if (a == null && (a = BitmapFactory.decodeResource(this.c.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.x.r0, a);
                }
                this.e = NinePatch.isNinePatchChunk(a.getNinePatchChunk()) ? new NinePatchDrawable(a, a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a);
                this.y.setBackgroundDrawable(this.e);
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
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.c).a(this.x.O);
                if (a2 == null && (a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.x.O, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.y.setBackgroundDrawable(this.e);
            } catch (Exception e4) {
                e4.printStackTrace();
            } catch (OutOfMemoryError e5) {
                e5.printStackTrace();
            }
            this.y.setTag(this.x);
            return;
        }
        this.y.setTag(this.x);
        yj yjVar = this.x;
        ej ejVar = yjVar.O0;
        if (ejVar == null) {
            if (yjVar.p.j()) {
                int f0 = com.comviva.webaxn.utils.j1.a(this.c).f0();
                this.h = f0;
                this.h = n1.d(f0);
                colorDrawable = new ColorDrawable(this.d);
            }
            this.y.setBackgroundDrawable(this.e);
        }
        colorDrawable = x1.a(ejVar, this.d);
        this.e = colorDrawable;
        this.y.setBackgroundDrawable(this.e);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.y);
        n();
        this.F = null;
        this.g.a((n1) null);
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
        this.y.getLayoutParams().width = i;
        this.y.getLayoutParams().height = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.y.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.y.getMeasuredWidth();
        this.k = this.y.getMeasuredHeight();
    }

    void b(String str) {
        this.z = null;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.z = mediaPlayer;
        mediaPlayer.setAudioStreamType(3);
        this.z.setDataSource(str);
        this.z.prepare();
        this.z.setOnCompletionListener(new c());
    }

    public void b(yj yjVar) {
        this.x = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.x;
    }

    public void g(int i) {
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    public void m() {
        try {
            if (this.z == null || !this.z.isPlaying()) {
                return;
            }
            this.z.pause();
        } catch (Exception unused) {
        }
    }

    public void n() {
        e eVar = new e();
        if (Build.VERSION.SDK_INT >= 11) {
            eVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "");
        } else {
            eVar.execute("");
        }
    }

    public void o() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.addView(this.y);
            this.b.invalidate();
        }
    }

    public void p() {
        try {
            if (this.z == null || this.E) {
                this.F.removeCallbacks(this.J);
                this.B.setImageResource(R.drawable.media_play);
                this.B.setId(1);
                this.C.setText(a(0, true));
                this.A.setProgress(0);
            } else {
                this.A.setProgress(this.z.getCurrentPosition());
                this.C.setText(a(this.z.getCurrentPosition(), true));
                if (this.z.isPlaying()) {
                    this.B.setImageResource(R.drawable.media_pause);
                    this.B.setId(2);
                    if (this.F != null) {
                        this.F.postDelayed(this.J, 500L);
                    }
                } else {
                    this.B.setImageResource(R.drawable.media_play);
                    this.B.setId(1);
                }
            }
        } catch (Exception unused) {
        }
    }
}
