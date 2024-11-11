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
import ir.tapsell.sdk.models.sdkErrorLogModels.SdkErrorTypeEnum;
import java.io.IOException;
import p000.g50;
import p000.k50;

/* renamed from: ir.tapsell.sdk.views.a */
/* loaded from: classes.dex */
public class C2784a extends SurfaceView implements MediaController.MediaPlayerControl {

    /* renamed from: A */
    private MediaPlayer.OnBufferingUpdateListener f11325A;

    /* renamed from: B */
    private MediaPlayer.OnSeekCompleteListener f11326B;

    /* renamed from: C */
    SurfaceHolder.Callback f11327C;

    /* renamed from: b */
    private Uri f11328b;

    /* renamed from: c */
    private int f11329c;

    /* renamed from: d */
    private int f11330d;

    /* renamed from: e */
    private SurfaceHolder f11331e;

    /* renamed from: f */
    private MediaPlayer f11332f;

    /* renamed from: g */
    private int f11333g;

    /* renamed from: h */
    private int f11334h;

    /* renamed from: i */
    private int f11335i;

    /* renamed from: j */
    MediaPlayer.OnVideoSizeChangedListener f11336j;

    /* renamed from: k */
    private int f11337k;

    /* renamed from: l */
    private int f11338l;

    /* renamed from: m */
    private MediaController f11339m;

    /* renamed from: n */
    private MediaPlayer.OnCompletionListener f11340n;

    /* renamed from: o */
    private MediaPlayer.OnPreparedListener f11341o;

    /* renamed from: p */
    private int f11342p;

    /* renamed from: q */
    private MediaPlayer.OnErrorListener f11343q;

    /* renamed from: r */
    private MediaPlayer.OnInfoListener f11344r;

    /* renamed from: s */
    private int f11345s;

    /* renamed from: t */
    private boolean f11346t;

    /* renamed from: u */
    private boolean f11347u;

    /* renamed from: v */
    private boolean f11348v;

    /* renamed from: w */
    MediaPlayer.OnPreparedListener f11349w;

    /* renamed from: x */
    private MediaPlayer.OnCompletionListener f11350x;

    /* renamed from: y */
    private MediaPlayer.OnInfoListener f11351y;

    /* renamed from: z */
    private MediaPlayer.OnErrorListener f11352z;

    /* renamed from: ir.tapsell.sdk.views.a$a */
    /* loaded from: classes.dex */
    class a implements MediaPlayer.OnVideoSizeChangedListener {
        a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            C2784a.this.f11334h = mediaPlayer.getVideoWidth();
            C2784a.this.f11335i = mediaPlayer.getVideoHeight();
            if (C2784a.this.f11334h == 0 || C2784a.this.f11335i == 0) {
                return;
            }
            C2784a.this.getHolder().setFixedSize(C2784a.this.f11334h, C2784a.this.f11335i);
            C2784a.this.requestLayout();
        }
    }

    /* renamed from: ir.tapsell.sdk.views.a$b */
    /* loaded from: classes.dex */
    class b implements MediaPlayer.OnPreparedListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            C2784a.this.f11329c = 2;
            C2784a c2784a = C2784a.this;
            c2784a.f11348v = true;
            c2784a.f11347u = true;
            c2784a.f11346t = true;
            if (C2784a.this.f11341o != null) {
                C2784a.this.f11341o.onPrepared(C2784a.this.f11332f);
            }
            if (C2784a.this.f11339m != null) {
                C2784a.this.f11339m.setEnabled(true);
            }
            C2784a.this.f11334h = mediaPlayer.getVideoWidth();
            C2784a.this.f11335i = mediaPlayer.getVideoHeight();
            int i = C2784a.this.f11345s;
            if (i != 0) {
                C2784a.this.seekTo(i);
            }
            if (C2784a.this.f11334h == 0 || C2784a.this.f11335i == 0) {
                if (C2784a.this.f11330d == 3) {
                    C2784a.this.start();
                    return;
                }
                return;
            }
            C2784a.this.getHolder().setFixedSize(C2784a.this.f11334h, C2784a.this.f11335i);
            if (C2784a.this.f11337k == C2784a.this.f11334h && C2784a.this.f11338l == C2784a.this.f11335i) {
                if (C2784a.this.f11330d == 3) {
                    C2784a.this.start();
                    if (C2784a.this.f11339m != null) {
                        C2784a.this.f11339m.show();
                        return;
                    }
                    return;
                }
                if (C2784a.this.isPlaying()) {
                    return;
                }
                if ((i != 0 || C2784a.this.getCurrentPosition() > 0) && C2784a.this.f11339m != null) {
                    C2784a.this.f11339m.show(0);
                }
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.views.a$c */
    /* loaded from: classes.dex */
    class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            C2784a.this.f11329c = 5;
            C2784a.this.f11330d = 5;
            if (C2784a.this.f11339m != null) {
                C2784a.this.f11339m.hide();
            }
            if (C2784a.this.f11340n != null) {
                C2784a.this.f11340n.onCompletion(C2784a.this.f11332f);
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.views.a$d */
    /* loaded from: classes.dex */
    class d implements MediaPlayer.OnInfoListener {
        d() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (C2784a.this.f11344r == null) {
                return true;
            }
            C2784a.this.f11344r.onInfo(mediaPlayer, i, i2);
            return true;
        }
    }

    /* renamed from: ir.tapsell.sdk.views.a$e */
    /* loaded from: classes.dex */
    class e implements MediaPlayer.OnErrorListener {

        /* renamed from: ir.tapsell.sdk.views.a$e$a */
        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (C2784a.this.f11340n != null) {
                    C2784a.this.f11340n.onCompletion(C2784a.this.f11332f);
                }
            }
        }

        e() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            String str = "Error: " + i + "," + i2;
            k50.m13611a((Context) null, "Error: " + i + "," + i2, SdkErrorTypeEnum.TAPSELL_VIDEO);
            C2784a.this.f11329c = -1;
            C2784a.this.f11330d = -1;
            if (C2784a.this.f11339m != null) {
                C2784a.this.f11339m.hide();
            }
            if ((C2784a.this.f11343q == null || !C2784a.this.f11343q.onError(C2784a.this.f11332f, i, i2)) && C2784a.this.getWindowToken() != null) {
                C2784a.this.getContext().getResources();
                try {
                    new AlertDialog.Builder(C2784a.this.getContext()).setMessage(i == 200 ? "این ویدئو قابلیت پخش استریم در این دستگاه ندارد" : "عدم امکان پخش ویدئو").setPositiveButton("OK", new a()).setCancelable(false).show();
                } catch (Throwable th) {
                    g50.m11895a(th);
                    try {
                        if (C2784a.this.f11340n != null) {
                            C2784a.this.f11340n.onCompletion(C2784a.this.f11332f);
                        }
                    } catch (Throwable th2) {
                        g50.m11895a(th2);
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: ir.tapsell.sdk.views.a$f */
    /* loaded from: classes.dex */
    class f implements MediaPlayer.OnBufferingUpdateListener {
        f() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            C2784a.this.f11342p = i;
        }
    }

    /* renamed from: ir.tapsell.sdk.views.a$g */
    /* loaded from: classes.dex */
    class g implements SurfaceHolder.Callback {
        g() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C2784a.this.f11337k = i2;
            C2784a.this.f11338l = i3;
            boolean z = C2784a.this.f11330d == 3;
            boolean z2 = C2784a.this.f11334h == i2 && C2784a.this.f11335i == i3;
            if (C2784a.this.f11332f != null && z && z2) {
                if (C2784a.this.f11345s != 0) {
                    C2784a c2784a = C2784a.this;
                    c2784a.seekTo(c2784a.f11345s);
                }
                C2784a.this.start();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C2784a.this.f11331e = surfaceHolder;
            C2784a.this.m13234c();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C2784a.this.f11331e = null;
            if (C2784a.this.f11339m != null) {
                C2784a.this.f11339m.hide();
            }
            C2784a.this.m13227a(true);
        }
    }

    public C2784a(Context context) {
        this(context, null);
    }

    public C2784a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2784a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11329c = 0;
        this.f11330d = 0;
        this.f11331e = null;
        this.f11332f = null;
        this.f11336j = new a();
        this.f11349w = new b();
        this.f11350x = new c();
        this.f11351y = new d();
        this.f11352z = new e();
        this.f11325A = new f();
        this.f11326B = null;
        this.f11327C = new g();
        this.f11334h = 0;
        this.f11335i = 0;
        getHolder().addCallback(this.f11327C);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f11329c = 0;
        this.f11330d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13227a(boolean z) {
        MediaPlayer mediaPlayer = this.f11332f;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f11332f.release();
            this.f11332f = null;
            this.f11329c = 0;
            if (z) {
                this.f11330d = 0;
            }
            AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m13234c() {
        StringBuilder sb;
        if (this.f11328b == null || this.f11331e == null) {
            return;
        }
        m13227a(false);
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f11332f = mediaPlayer;
            if (this.f11326B != null) {
                mediaPlayer.setOnSeekCompleteListener(this.f11326B);
            }
            if (this.f11333g != 0) {
                this.f11332f.setAudioSessionId(this.f11333g);
            } else {
                this.f11333g = this.f11332f.getAudioSessionId();
            }
            this.f11332f.setOnPreparedListener(this.f11349w);
            this.f11332f.setOnVideoSizeChangedListener(this.f11336j);
            this.f11332f.setOnCompletionListener(this.f11350x);
            this.f11332f.setOnErrorListener(this.f11352z);
            this.f11332f.setOnInfoListener(this.f11351y);
            this.f11332f.setOnBufferingUpdateListener(this.f11325A);
            this.f11342p = 0;
            this.f11332f.setDataSource(getContext(), this.f11328b);
            this.f11332f.setDisplay(this.f11331e);
            this.f11332f.setAudioStreamType(3);
            this.f11332f.setScreenOnWhilePlaying(true);
            this.f11332f.prepareAsync();
            this.f11329c = 1;
            m13238d();
        } catch (IOException unused) {
            String str = "Unable to open content: " + this.f11328b;
            sb = new StringBuilder();
            sb.append("Unable to open content: ");
            sb.append(this.f11328b);
            k50.m13611a((Context) null, sb.toString(), SdkErrorTypeEnum.TAPSELL_VIDEO);
            this.f11329c = -1;
            this.f11330d = -1;
            this.f11352z.onError(this.f11332f, 1, 0);
        } catch (IllegalArgumentException unused2) {
            String str2 = "Unable to open content: " + this.f11328b;
            sb = new StringBuilder();
            sb.append("Unable to open content: ");
            sb.append(this.f11328b);
            k50.m13611a((Context) null, sb.toString(), SdkErrorTypeEnum.TAPSELL_VIDEO);
            this.f11329c = -1;
            this.f11330d = -1;
            this.f11352z.onError(this.f11332f, 1, 0);
        }
    }

    /* renamed from: d */
    private void m13238d() {
        MediaController mediaController;
        if (this.f11332f == null || (mediaController = this.f11339m) == null) {
            return;
        }
        mediaController.setMediaPlayer(this);
        this.f11339m.setAnchorView(getParent() instanceof View ? (View) getParent() : this);
        this.f11339m.setEnabled(m13245f());
    }

    /* renamed from: e */
    private void m13242e() {
        if (this.f11339m.isShowing()) {
            this.f11339m.hide();
        } else {
            this.f11339m.show();
        }
    }

    /* renamed from: f */
    private boolean m13245f() {
        int i;
        return (this.f11332f == null || (i = this.f11329c) == -1 || i == 0 || i == 1) ? false : true;
    }

    /* renamed from: a */
    public void m13254a() {
        m13227a(true);
    }

    /* renamed from: a */
    public void m13255a(int i, MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.f11326B = onSeekCompleteListener;
        MediaPlayer mediaPlayer = this.f11332f;
        if (mediaPlayer != null) {
            mediaPlayer.setOnSeekCompleteListener(onSeekCompleteListener);
            if (m13245f()) {
                this.f11332f.seekTo(i);
                i = 0;
            }
        }
        this.f11345s = i;
    }

    /* renamed from: b */
    public void m13256b() {
        m13234c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f11346t;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f11347u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f11348v;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return VideoView.class.getName();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.f11333g == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f11333g = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f11333g;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f11332f != null) {
            return this.f11342p;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m13245f()) {
            return this.f11332f.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m13245f()) {
            return this.f11332f.getDuration();
        }
        return -1;
    }

    public MediaPlayer getPlayer() {
        return this.f11332f;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return m13245f() && this.f11332f.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = (i == 4 || i == 24 || i == 25 || i == 164 || i == 82 || i == 5 || i == 6) ? false : true;
        if (m13245f() && z && this.f11339m != null) {
            if (i == 79 || i == 85) {
                if (this.f11332f.isPlaying()) {
                    pause();
                    this.f11339m.show();
                } else {
                    start();
                    this.f11339m.hide();
                }
                return true;
            }
            if (i != 86) {
                if (i == 126) {
                    if (!this.f11332f.isPlaying()) {
                        start();
                        this.f11339m.hide();
                    }
                    return true;
                }
                if (i != 127) {
                    m13242e();
                }
            }
            if (this.f11332f.isPlaying()) {
                pause();
                this.f11339m.show();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        int defaultSize = SurfaceView.getDefaultSize(this.f11334h, i);
        int defaultSize2 = SurfaceView.getDefaultSize(this.f11335i, i2);
        if (this.f11334h > 0 && this.f11335i > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i3 = this.f11334h;
                int i4 = i3 * size2;
                int i5 = this.f11335i;
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
                int i6 = (this.f11335i * size) / this.f11334h;
                if (mode2 != Integer.MIN_VALUE || i6 <= size2) {
                    defaultSize2 = i6;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int i7 = (this.f11334h * size2) / this.f11335i;
                if (mode != Integer.MIN_VALUE || i7 <= size) {
                    defaultSize = i7;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                int i8 = this.f11334h;
                int i9 = this.f11335i;
                if (mode2 != Integer.MIN_VALUE || i9 <= size2) {
                    defaultSize2 = i9;
                } else {
                    i8 = (i8 * size2) / i9;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || i8 <= size) {
                    defaultSize = i8;
                } else {
                    defaultSize2 = (this.f11335i * size) / this.f11334h;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m13245f() || this.f11339m == null) {
            return false;
        }
        m13242e();
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m13245f() || this.f11339m == null) {
            return false;
        }
        m13242e();
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (m13245f() && this.f11332f.isPlaying()) {
            this.f11332f.pause();
            this.f11329c = 4;
        }
        this.f11330d = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (m13245f()) {
            this.f11332f.seekTo(i);
            i = 0;
        }
        this.f11345s = i;
    }

    public void setMediaController(MediaController mediaController) {
        MediaController mediaController2 = this.f11339m;
        if (mediaController2 != null) {
            mediaController2.hide();
        }
        this.f11339m = mediaController;
        m13238d();
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f11340n = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f11343q = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.f11344r = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f11341o = onPreparedListener;
    }

    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.f11326B = onSeekCompleteListener;
        MediaPlayer mediaPlayer = this.f11332f;
        if (mediaPlayer != null) {
            mediaPlayer.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.f11328b = uri;
        this.f11345s = 0;
        m13234c();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m13245f()) {
            this.f11332f.start();
            this.f11329c = 3;
        }
        this.f11330d = 3;
    }
}
