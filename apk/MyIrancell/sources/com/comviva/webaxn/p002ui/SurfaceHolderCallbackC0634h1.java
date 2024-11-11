package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.media.ThumbnailUtils;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.comviva.webaxn.p002ui.C0628f1;
import com.comviva.webaxn.utils.C0686a1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import java.io.IOException;
import p000.C2434ej;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.h1 */
/* loaded from: classes.dex */
public class SurfaceHolderCallbackC0634h1 extends AbstractC0652n1 implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener, C0628f1.f {

    /* renamed from: G */
    private static int f3791G = 200;

    /* renamed from: H */
    private static int f3792H = 200;

    /* renamed from: A */
    private LinearLayout f3793A;

    /* renamed from: B */
    private ImageView f3794B;

    /* renamed from: C */
    private C0628f1 f3795C;

    /* renamed from: D */
    private ProgressBar f3796D;

    /* renamed from: E */
    private MediaPlayer f3797E;

    /* renamed from: F */
    private boolean f3798F;

    /* renamed from: x */
    private C3489yj f3799x;

    /* renamed from: y */
    private FrameLayout f3800y;

    /* renamed from: z */
    private SurfaceView f3801z;

    /* renamed from: com.comviva.webaxn.ui.h1$a */
    /* loaded from: classes.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (SurfaceHolderCallbackC0634h1.this.f3793A.getVisibility() == 0) {
                SurfaceHolderCallbackC0634h1.this.f3793A.setVisibility(8);
                SurfaceHolderCallbackC0634h1.this.f3794B.setVisibility(8);
                SurfaceHolderCallbackC0634h1.this.m4455p();
            }
            SurfaceHolderCallbackC0634h1.this.f3795C.m4347a(false);
            return false;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.h1$b */
    /* loaded from: classes.dex */
    class b implements MediaPlayer.OnErrorListener {
        b(SurfaceHolderCallbackC0634h1 surfaceHolderCallbackC0634h1) {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return false;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.h1$c */
    /* loaded from: classes.dex */
    class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (SurfaceHolderCallbackC0634h1.this.f3793A.getVisibility() == 8) {
                SurfaceHolderCallbackC0634h1.this.f3793A.setVisibility(0);
                SurfaceHolderCallbackC0634h1.this.f3794B.setVisibility(0);
                SurfaceHolderCallbackC0634h1.this.f3798F = true;
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.h1$d */
    /* loaded from: classes.dex */
    class d implements MediaPlayer.OnVideoSizeChangedListener {
        d() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            if (SurfaceHolderCallbackC0634h1.this.f3796D != null) {
                SurfaceHolderCallbackC0634h1.this.f3796D.setVisibility(8);
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.h1$e */
    /* loaded from: classes.dex */
    public class e extends AsyncTask<String, Void, Void> {
        public e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                if (SurfaceHolderCallbackC0634h1.this.f3797E != null && SurfaceHolderCallbackC0634h1.this.f3797E.isPlaying()) {
                    SurfaceHolderCallbackC0634h1.this.f3797E.stop();
                    SurfaceHolderCallbackC0634h1.this.f3795C.m4349c();
                    SurfaceHolderCallbackC0634h1.this.f3797E.release();
                    SurfaceHolderCallbackC0634h1.this.f3797E = null;
                    SurfaceHolderCallbackC0634h1.this.f3795C = null;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public SurfaceHolderCallbackC0634h1(Context context, C3489yj c3489yj, C0639j0 c0639j0) {
        super(context);
        String str;
        AssetFileDescriptor openRawResourceFd;
        this.f3798F = true;
        this.f4045c = context;
        this.f3799x = c3489yj;
        float f = f3791G;
        float f2 = c3489yj.f14196a;
        f3791G = (int) (f * f2);
        f3792H = (int) (f3792H * f2);
        C2434ej c2434ej = c3489yj.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f4045c).inflate(R.layout.video_layout, (ViewGroup) null);
        this.f3800y = frameLayout;
        frameLayout.setOnTouchListener(new a());
        this.f3801z = (SurfaceView) this.f3800y.findViewById(R.id.videoSurface);
        this.f3793A = (LinearLayout) this.f3800y.findViewById(R.id.cv_thumbnail_layout);
        this.f3794B = (ImageView) this.f3800y.findViewById(R.id.cv_thumbnail);
        this.f3801z.getHolder().addCallback(this);
        this.f3797E = new MediaPlayer();
        this.f3795C = new C0628f1(this.f4045c);
        try {
            this.f3797E.setAudioStreamType(3);
            if (!TextUtils.isEmpty(this.f3799x.f14226k)) {
                if (!this.f3799x.f14226k.startsWith("http") && !this.f3799x.f14226k.startsWith("https")) {
                    if (this.f3799x.f14226k.startsWith("media://video?")) {
                        str = C0686a1.m5334a(this.f4045c).m5341b();
                    } else {
                        str = C0755x1.m6127a(this.f4045c, 1, "webaxn_media") + this.f3799x.f14226k;
                    }
                    if (TextUtils.isEmpty(str) || !C0755x1.m6193j(str)) {
                        String str2 = this.f3799x.f14226k;
                        int identifier = this.f4045c.getResources().getIdentifier(str2.indexOf(".") != -1 ? str2.substring(0, str2.indexOf(".")) : str2, "raw", this.f4045c.getPackageName());
                        if (identifier > 0 && (openRawResourceFd = this.f4045c.getResources().openRawResourceFd(identifier)) != null) {
                            try {
                                this.f3797E.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                                openRawResourceFd.close();
                            } catch (Throwable th) {
                                openRawResourceFd.close();
                                throw th;
                            }
                        }
                    } else {
                        this.f3797E.setDataSource(str);
                        this.f3793A.setBackground(new BitmapDrawable(ThumbnailUtils.createVideoThumbnail(str, 1)));
                        this.f3793A.setVisibility(0);
                        this.f3794B.setImageResource(R.drawable.play_video_thumb);
                        this.f3794B.setVisibility(0);
                    }
                }
                this.f3797E.setDataSource(this.f3799x.f14226k);
                this.f3796D = new ProgressBar(this.f4045c);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                this.f3800y.addView(this.f3796D, layoutParams);
                this.f3796D.setVisibility(0);
            }
            this.f3797E.setOnPreparedListener(this);
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
        } catch (IllegalStateException e4) {
            e4.printStackTrace();
        } catch (SecurityException e5) {
            e5.printStackTrace();
        }
        this.f3797E.setOnErrorListener(new b(this));
        this.f3797E.setOnCompletionListener(new c());
    }

    /* renamed from: a */
    public int m4449a(AbsoluteLayout.LayoutParams layoutParams, C0669v0 c0669v0) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = c0669v0.f4397c.width() - (this.f3799x.m16638d(c0669v0.f4397c.width()) + this.f3799x.m16641g(c0669v0.f4397c.width()));
        }
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = -2;
        }
        if (i < 0) {
            i = f3791G;
        }
        if (i2 < 0) {
            i2 = f3792H;
        }
        this.f4054l = i;
        this.f4053k = i2;
        this.f3800y.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, layoutParams.x, layoutParams.y));
        this.f3793A.getLayoutParams().width = i;
        this.f3793A.getLayoutParams().height = i2;
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    /* renamed from: a */
    public void mo4352a() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f3800y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f3800y.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f3800y);
        m4453n();
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
        if (i < 0) {
            i = f3791G;
        }
        if (i2 < 0) {
            i2 = f3792H;
        }
        this.f4054l = i;
        this.f4053k = i2;
        this.f3800y.getLayoutParams().width = i;
        this.f3800y.getLayoutParams().height = i2;
        this.f3793A.getLayoutParams().width = i;
        this.f3793A.getLayoutParams().height = i2;
    }

    /* renamed from: b */
    public void m4450b(C3489yj c3489yj) {
        this.f3799x = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    public boolean canPause() {
        return true;
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    public boolean canSeekBackward() {
        return true;
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    public boolean canSeekForward() {
        return true;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3799x;
    }

    /* renamed from: g */
    public void m4451g(int i) {
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    public int getBufferPercentage() {
        return 0;
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    public int getCurrentPosition() {
        return this.f3797E.getCurrentPosition();
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    public int getDuration() {
        return this.f3797E.getDuration();
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3800y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: i */
    public int mo4151i() {
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    public boolean isPlaying() {
        return this.f3797E.isPlaying();
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: j */
    public int mo4152j() {
        return this.f4054l;
    }

    /* renamed from: m */
    public void m4452m() {
        try {
            if (this.f3797E == null || !this.f3797E.isPlaying()) {
                return;
            }
            this.f3797E.pause();
            this.f3798F = true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public void m4453n() {
        e eVar = new e();
        if (Build.VERSION.SDK_INT >= 11) {
            eVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "");
        } else {
            eVar.execute("");
        }
    }

    /* renamed from: o */
    public void m4454o() {
        ViewGroup viewGroup = this.f4044b;
        if (viewGroup != null) {
            viewGroup.addView(this.f3800y);
            this.f4044b.invalidate();
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f3795C.setMediaPlayer(this);
        this.f3795C.setAnchorView(this.f3800y);
        mediaPlayer.setOnVideoSizeChangedListener(new d());
    }

    /* renamed from: p */
    public void m4455p() {
        try {
            if (this.f3797E == null || !this.f3798F) {
                return;
            }
            this.f3797E.start();
            this.f3798F = false;
        } catch (Exception unused) {
        }
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    public void pause() {
        this.f3797E.pause();
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    public void seekTo(int i) {
        this.f3797E.seekTo(i);
    }

    @Override // com.comviva.webaxn.p002ui.C0628f1.f
    public void start() {
        this.f3797E.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            this.f3797E.setDisplay(surfaceHolder);
            this.f3797E.prepareAsync();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
