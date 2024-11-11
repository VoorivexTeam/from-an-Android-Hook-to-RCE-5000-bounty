package ir.tapsell.sdk.views;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import defpackage.g50;
import defpackage.k50;
import ir.tapsell.sdk.models.sdkErrorLogModels.SdkErrorTypeEnum;
import java.io.IOException;

/* loaded from: classes.dex */
public class a extends SurfaceView implements MediaController.MediaPlayerControl {
    private MediaPlayer.OnBufferingUpdateListener A;
    private MediaPlayer.OnSeekCompleteListener B;
    SurfaceHolder.Callback C;
    private Uri b;
    private int c;
    private int d;
    private SurfaceHolder e;
    private MediaPlayer f;
    private int g;
    private int h;
    private int i;
    MediaPlayer.OnVideoSizeChangedListener j;
    private int k;
    private int l;
    private MediaController m;
    private MediaPlayer.OnCompletionListener n;
    private MediaPlayer.OnPreparedListener o;
    private int p;
    private MediaPlayer.OnErrorListener q;
    private MediaPlayer.OnInfoListener r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    MediaPlayer.OnPreparedListener w;
    private MediaPlayer.OnCompletionListener x;
    private MediaPlayer.OnInfoListener y;
    private MediaPlayer.OnErrorListener z;

    /* renamed from: ir.tapsell.sdk.views.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0072a implements MediaPlayer.OnVideoSizeChangedListener {
        C0072a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            a.this.h = mediaPlayer.getVideoWidth();
            a.this.i = mediaPlayer.getVideoHeight();
            if (a.this.h == 0 || a.this.i == 0) {
                return;
            }
            a.this.getHolder().setFixedSize(a.this.h, a.this.i);
            a.this.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class b implements MediaPlayer.OnPreparedListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            a.this.c = 2;
            a aVar = a.this;
            aVar.v = true;
            aVar.u = true;
            aVar.t = true;
            if (a.this.o != null) {
                a.this.o.onPrepared(a.this.f);
            }
            if (a.this.m != null) {
                a.this.m.setEnabled(true);
            }
            a.this.h = mediaPlayer.getVideoWidth();
            a.this.i = mediaPlayer.getVideoHeight();
            int i = a.this.s;
            if (i != 0) {
                a.this.seekTo(i);
            }
            if (a.this.h == 0 || a.this.i == 0) {
                if (a.this.d == 3) {
                    a.this.start();
                    return;
                }
                return;
            }
            a.this.getHolder().setFixedSize(a.this.h, a.this.i);
            if (a.this.k == a.this.h && a.this.l == a.this.i) {
                if (a.this.d == 3) {
                    a.this.start();
                    if (a.this.m != null) {
                        a.this.m.show();
                        return;
                    }
                    return;
                }
                if (a.this.isPlaying()) {
                    return;
                }
                if ((i != 0 || a.this.getCurrentPosition() > 0) && a.this.m != null) {
                    a.this.m.show(0);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            a.this.c = 5;
            a.this.d = 5;
            if (a.this.m != null) {
                a.this.m.hide();
            }
            if (a.this.n != null) {
                a.this.n.onCompletion(a.this.f);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements MediaPlayer.OnInfoListener {
        d() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (a.this.r == null) {
                return true;
            }
            a.this.r.onInfo(mediaPlayer, i, i2);
            return true;
        }
    }

    /* loaded from: classes.dex */
    class e implements MediaPlayer.OnErrorListener {

        /* renamed from: ir.tapsell.sdk.views.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class DialogInterfaceOnClickListenerC0073a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0073a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (a.this.n != null) {
                    a.this.n.onCompletion(a.this.f);
                }
            }
        }

        e() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            String str = "Error: " + i + "," + i2;
            k50.a((Context) null, "Error: " + i + "," + i2, SdkErrorTypeEnum.TAPSELL_VIDEO);
            a.this.c = -1;
            a.this.d = -1;
            if (a.this.m != null) {
                a.this.m.hide();
            }
            if ((a.this.q == null || !a.this.q.onError(a.this.f, i, i2)) && a.this.getWindowToken() != null) {
                a.this.getContext().getResources();
                try {
                    new AlertDialog.Builder(a.this.getContext()).setMessage(i == 200 ? "این ویدئو قابلیت پخش استریم در این دستگاه ندارد" : "عدم امکان پخش ویدئو").setPositiveButton("OK", new DialogInterfaceOnClickListenerC0073a()).setCancelable(false).show();
                } catch (Throwable th) {
                    g50.a(th);
                    try {
                        if (a.this.n != null) {
                            a.this.n.onCompletion(a.this.f);
                        }
                    } catch (Throwable th2) {
                        g50.a(th2);
                    }
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    class f implements MediaPlayer.OnBufferingUpdateListener {
        f() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            a.this.p = i;
        }
    }

    /* loaded from: classes.dex */
    class g implements SurfaceHolder.Callback {
        g() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            a.this.k = i2;
            a.this.l = i3;
            boolean z = a.this.d == 3;
            boolean z2 = a.this.h == i2 && a.this.i == i3;
            if (a.this.f != null && z && z2) {
                if (a.this.s != 0) {
                    a aVar = a.this;
                    aVar.seekTo(aVar.s);
                }
                a.this.start();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            a.this.e = surfaceHolder;
            a.this.c();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a.this.e = null;
            if (a.this.m != null) {
                a.this.m.hide();
            }
            a.this.a(true);
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.j = new C0072a();
        this.w = new b();
        this.x = new c();
        this.y = new d();
        this.z = new e();
        this.A = new f();
        this.B = null;
        this.C = new g();
        this.h = 0;
        this.i = 0;
        getHolder().addCallback(this.C);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.c = 0;
        this.d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f.release();
            this.f = null;
            this.c = 0;
            if (z) {
                this.d = 0;
            }
            AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        StringBuilder sb;
        if (this.b == null || this.e == null) {
            return;
        }
        a(false);
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f = mediaPlayer;
            if (this.B != null) {
                mediaPlayer.setOnSeekCompleteListener(this.B);
            }
            if (this.g != 0) {
                this.f.setAudioSessionId(this.g);
            } else {
                this.g = this.f.getAudioSessionId();
            }
            this.f.setOnPreparedListener(this.w);
            this.f.setOnVideoSizeChangedListener(this.j);
            this.f.setOnCompletionListener(this.x);
            this.f.setOnErrorListener(this.z);
            this.f.setOnInfoListener(this.y);
            this.f.setOnBufferingUpdateListener(this.A);
            this.p = 0;
            this.f.setDataSource(getContext(), this.b);
            this.f.setDisplay(this.e);
            this.f.setAudioStreamType(3);
            this.f.setScreenOnWhilePlaying(true);
            this.f.prepareAsync();
            this.c = 1;
            d();
        } catch (IOException unused) {
            String str = "Unable to open content: " + this.b;
            sb = new StringBuilder();
            sb.append("Unable to open content: ");
            sb.append(this.b);
            k50.a((Context) null, sb.toString(), SdkErrorTypeEnum.TAPSELL_VIDEO);
            this.c = -1;
            this.d = -1;
            this.z.onError(this.f, 1, 0);
        } catch (IllegalArgumentException unused2) {
            String str2 = "Unable to open content: " + this.b;
            sb = new StringBuilder();
            sb.append("Unable to open content: ");
            sb.append(this.b);
            k50.a((Context) null, sb.toString(), SdkErrorTypeEnum.TAPSELL_VIDEO);
            this.c = -1;
            this.d = -1;
            this.z.onError(this.f, 1, 0);
        }
    }

    private void d() {
        MediaController mediaController;
        if (this.f == null || (mediaController = this.m) == null) {
            return;
        }
        mediaController.setMediaPlayer(this);
        this.m.setAnchorView(getParent() instanceof View ? (View) getParent() : this);
        this.m.setEnabled(f());
    }

    private void e() {
        if (this.m.isShowing()) {
            this.m.hide();
        } else {
            this.m.show();
        }
    }

    private boolean f() {
        int i;
        return (this.f == null || (i = this.c) == -1 || i == 0 || i == 1) ? false : true;
    }

    public void a() {
        a(true);
    }

    public void a(int i, MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.B = onSeekCompleteListener;
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            mediaPlayer.setOnSeekCompleteListener(onSeekCompleteListener);
            if (f()) {
                this.f.seekTo(i);
                i = 0;
            }
        }
        this.s = i;
    }

    public void b() {
        c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.t;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.v;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return VideoView.class.getName();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.g == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.g = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.g;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f != null) {
            return this.p;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (f()) {
            return this.f.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (f()) {
            return this.f.getDuration();
        }
        return -1;
    }

    public MediaPlayer getPlayer() {
        return this.f;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return f() && this.f.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = (i == 4 || i == 24 || i == 25 || i == 164 || i == 82 || i == 5 || i == 6) ? false : true;
        if (f() && z && this.m != null) {
            if (i == 79 || i == 85) {
                if (this.f.isPlaying()) {
                    pause();
                    this.m.show();
                } else {
                    start();
                    this.m.hide();
                }
                return true;
            }
            if (i != 86) {
                if (i == 126) {
                    if (!this.f.isPlaying()) {
                        start();
                        this.m.hide();
                    }
                    return true;
                }
                if (i != 127) {
                    e();
                }
            }
            if (this.f.isPlaying()) {
                pause();
                this.m.show();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        int defaultSize = SurfaceView.getDefaultSize(this.h, i);
        int defaultSize2 = SurfaceView.getDefaultSize(this.i, i2);
        if (this.h > 0 && this.i > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i3 = this.h;
                int i4 = i3 * size2;
                int i5 = this.i;
                if (i4 < size * i5) {
                    defaultSize = (i3 * size2) / i5;
                    defaultSize2 = size2;
                } else {
                    if (i3 * size2 > size * i5) {
                        defaultSize2 = (i5 * size) / i3;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i6 = (this.i * size) / this.h;
                if (mode2 != Integer.MIN_VALUE || i6 <= size2) {
                    defaultSize2 = i6;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int i7 = (this.h * size2) / this.i;
                if (mode != Integer.MIN_VALUE || i7 <= size) {
                    defaultSize = i7;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                int i8 = this.h;
                int i9 = this.i;
                if (mode2 != Integer.MIN_VALUE || i9 <= size2) {
                    defaultSize2 = i9;
                } else {
                    i8 = (i8 * size2) / i9;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || i8 <= size) {
                    defaultSize = i8;
                } else {
                    defaultSize2 = (this.i * size) / this.h;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!f() || this.m == null) {
            return false;
        }
        e();
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!f() || this.m == null) {
            return false;
        }
        e();
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (f() && this.f.isPlaying()) {
            this.f.pause();
            this.c = 4;
        }
        this.d = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (f()) {
            this.f.seekTo(i);
            i = 0;
        }
        this.s = i;
    }

    public void setMediaController(MediaController mediaController) {
        MediaController mediaController2 = this.m;
        if (mediaController2 != null) {
            mediaController2.hide();
        }
        this.m = mediaController;
        d();
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.n = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.q = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.r = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.o = onPreparedListener;
    }

    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.B = onSeekCompleteListener;
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            mediaPlayer.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.b = uri;
        this.s = 0;
        c();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (f()) {
            this.f.start();
            this.c = 3;
        }
        this.d = 3;
    }
}
