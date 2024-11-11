package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.ui.f1;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.ej;
import defpackage.yj;
import java.io.IOException;

/* loaded from: classes.dex */
public class h1 extends n1 implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener, f1.f {
    private static int G = 200;
    private static int H = 200;
    private LinearLayout A;
    private ImageView B;
    private f1 C;
    private ProgressBar D;
    private MediaPlayer E;
    private boolean F;
    private yj x;
    private FrameLayout y;
    private SurfaceView z;

    /* loaded from: classes.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (h1.this.A.getVisibility() == 0) {
                h1.this.A.setVisibility(8);
                h1.this.B.setVisibility(8);
                h1.this.p();
            }
            h1.this.C.a(false);
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements MediaPlayer.OnErrorListener {
        b(h1 h1Var) {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (h1.this.A.getVisibility() == 8) {
                h1.this.A.setVisibility(0);
                h1.this.B.setVisibility(0);
                h1.this.F = true;
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements MediaPlayer.OnVideoSizeChangedListener {
        d() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            if (h1.this.D != null) {
                h1.this.D.setVisibility(8);
            }
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
                if (h1.this.E != null && h1.this.E.isPlaying()) {
                    h1.this.E.stop();
                    h1.this.C.c();
                    h1.this.E.release();
                    h1.this.E = null;
                    h1.this.C = null;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public h1(Context context, yj yjVar, j0 j0Var) {
        super(context);
        String str;
        AssetFileDescriptor openRawResourceFd;
        this.F = true;
        this.c = context;
        this.x = yjVar;
        float f = G;
        float f2 = yjVar.a;
        G = (int) (f * f2);
        H = (int) (H * f2);
        ej ejVar = yjVar.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.c).inflate(R.layout.video_layout, (ViewGroup) null);
        this.y = frameLayout;
        frameLayout.setOnTouchListener(new a());
        this.z = (SurfaceView) this.y.findViewById(R.id.videoSurface);
        this.A = (LinearLayout) this.y.findViewById(R.id.cv_thumbnail_layout);
        this.B = (ImageView) this.y.findViewById(R.id.cv_thumbnail);
        this.z.getHolder().addCallback(this);
        this.E = new MediaPlayer();
        this.C = new f1(this.c);
        try {
            this.E.setAudioStreamType(3);
            if (!TextUtils.isEmpty(this.x.k)) {
                if (!this.x.k.startsWith("http") && !this.x.k.startsWith("https")) {
                    if (this.x.k.startsWith("media://video?")) {
                        str = com.comviva.webaxn.utils.a1.a(this.c).b();
                    } else {
                        str = x1.a(this.c, 1, "webaxn_media") + this.x.k;
                    }
                    if (TextUtils.isEmpty(str) || !x1.j(str)) {
                        String str2 = this.x.k;
                        int identifier = this.c.getResources().getIdentifier(str2.indexOf(".") != -1 ? str2.substring(0, str2.indexOf(".")) : str2, "raw", this.c.getPackageName());
                        if (identifier > 0 && (openRawResourceFd = this.c.getResources().openRawResourceFd(identifier)) != null) {
                            try {
                                this.E.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                                openRawResourceFd.close();
                            } catch (Throwable th) {
                                openRawResourceFd.close();
                                throw th;
                            }
                        }
                    } else {
                        this.E.setDataSource(str);
                        this.A.setBackground(new BitmapDrawable(ThumbnailUtils.createVideoThumbnail(str, 1)));
                        this.A.setVisibility(0);
                        this.B.setImageResource(R.drawable.play_video_thumb);
                        this.B.setVisibility(0);
                    }
                }
                this.E.setDataSource(this.x.k);
                this.D = new ProgressBar(this.c);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                this.y.addView(this.D, layoutParams);
                this.D.setVisibility(0);
            }
            this.E.setOnPreparedListener(this);
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
        } catch (IllegalStateException e4) {
            e4.printStackTrace();
        } catch (SecurityException e5) {
            e5.printStackTrace();
        }
        this.E.setOnErrorListener(new b(this));
        this.E.setOnCompletionListener(new c());
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
        if (i < 0) {
            i = G;
        }
        if (i2 < 0) {
            i2 = H;
        }
        this.l = i;
        this.k = i2;
        this.y.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, layoutParams.x, layoutParams.y));
        this.A.getLayoutParams().width = i;
        this.A.getLayoutParams().height = i2;
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.f1.f
    public void a() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.y);
        n();
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
        if (i < 0) {
            i = G;
        }
        if (i2 < 0) {
            i2 = H;
        }
        this.l = i;
        this.k = i2;
        this.y.getLayoutParams().width = i;
        this.y.getLayoutParams().height = i2;
        this.A.getLayoutParams().width = i;
        this.A.getLayoutParams().height = i2;
    }

    public void b(yj yjVar) {
        this.x = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
    }

    @Override // com.comviva.webaxn.ui.f1.f
    public boolean canPause() {
        return true;
    }

    @Override // com.comviva.webaxn.ui.f1.f
    public boolean canSeekBackward() {
        return true;
    }

    @Override // com.comviva.webaxn.ui.f1.f
    public boolean canSeekForward() {
        return true;
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

    @Override // com.comviva.webaxn.ui.f1.f
    public int getBufferPercentage() {
        return 0;
    }

    @Override // com.comviva.webaxn.ui.f1.f
    public int getCurrentPosition() {
        return this.E.getCurrentPosition();
    }

    @Override // com.comviva.webaxn.ui.f1.f
    public int getDuration() {
        return this.E.getDuration();
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.f1.f
    public boolean isPlaying() {
        return this.E.isPlaying();
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    public void m() {
        try {
            if (this.E == null || !this.E.isPlaying()) {
                return;
            }
            this.E.pause();
            this.F = true;
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

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.C.setMediaPlayer(this);
        this.C.setAnchorView(this.y);
        mediaPlayer.setOnVideoSizeChangedListener(new d());
    }

    public void p() {
        try {
            if (this.E == null || !this.F) {
                return;
            }
            this.E.start();
            this.F = false;
        } catch (Exception unused) {
        }
    }

    @Override // com.comviva.webaxn.ui.f1.f
    public void pause() {
        this.E.pause();
    }

    @Override // com.comviva.webaxn.ui.f1.f
    public void seekTo(int i) {
        this.E.seekTo(i);
    }

    @Override // com.comviva.webaxn.ui.f1.f
    public void start() {
        this.E.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            this.E.setDisplay(surfaceHolder);
            this.E.prepareAsync();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
