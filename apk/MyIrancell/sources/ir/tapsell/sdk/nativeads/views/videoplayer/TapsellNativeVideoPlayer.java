package ir.tapsell.sdk.nativeads.views.videoplayer;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.R$styleable;
import ir.tapsell.sdk.nativeads.DialogFragmentC2718d;
import java.io.IOException;
import p000.e70;
import p000.s40;

@TargetApi(14)
/* loaded from: classes.dex */
public class TapsellNativeVideoPlayer extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, NoProguard {
    private static final int UPDATE_INTERVAL = 500;
    private boolean isMuted;
    private boolean mAudioFocusGranted;
    private boolean mAutoFullscreen;
    private boolean mAutoPlay;
    private InterfaceC2725b mCallback;
    private View mClickFrame;
    private Handler mHandler;
    private int mInitialPosition;
    private int mInitialTextureHeight;
    private int mInitialTextureWidth;
    private boolean mIsPrepared;
    private boolean mLoop;
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
    private MediaPlayer mPlayer;
    private InterfaceC2726c mProgressCallback;
    private Uri mSource;
    private Surface mSurface;
    private boolean mSurfaceAvailable;
    private TextureView mTextureView;
    private final Runnable mUpdateCounters;

    /* renamed from: ir.tapsell.sdk.nativeads.views.videoplayer.TapsellNativeVideoPlayer$a */
    /* loaded from: classes.dex */
    class RunnableC2722a implements Runnable {
        RunnableC2722a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TapsellNativeVideoPlayer.this.mHandler == null || !TapsellNativeVideoPlayer.this.mIsPrepared || TapsellNativeVideoPlayer.this.mPlayer == null || !TapsellNativeVideoPlayer.this.mPlayer.isPlaying()) {
                return;
            }
            int currentPosition = TapsellNativeVideoPlayer.this.mPlayer.getCurrentPosition();
            int duration = TapsellNativeVideoPlayer.this.mPlayer.getDuration();
            if (currentPosition > duration) {
                currentPosition = duration;
            }
            if (TapsellNativeVideoPlayer.this.mProgressCallback != null) {
                TapsellNativeVideoPlayer.this.mProgressCallback.mo13053a(currentPosition, duration);
            }
            if (TapsellNativeVideoPlayer.this.mHandler != null) {
                TapsellNativeVideoPlayer.this.mHandler.postDelayed(this, 500L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.views.videoplayer.TapsellNativeVideoPlayer$b */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2723b implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ TapsellNativeVideoPlayer f11190b;

        ViewOnClickListenerC2723b(TapsellNativeVideoPlayer tapsellNativeVideoPlayer) {
            this.f11190b = tapsellNativeVideoPlayer;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TapsellNativeVideoPlayer.this.mCallback.mo13058c(this.f11190b);
        }
    }

    public TapsellNativeVideoPlayer(Context context) {
        super(context);
        this.mAudioFocusGranted = false;
        this.isMuted = false;
        this.mInitialPosition = -1;
        this.mAutoFullscreen = false;
        this.mLoop = false;
        this.mUpdateCounters = new RunnableC2722a();
        init(context, null);
    }

    public TapsellNativeVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAudioFocusGranted = false;
        this.isMuted = false;
        this.mInitialPosition = -1;
        this.mAutoFullscreen = false;
        this.mLoop = false;
        this.mUpdateCounters = new RunnableC2722a();
        init(context, attributeSet);
    }

    public TapsellNativeVideoPlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAudioFocusGranted = false;
        this.isMuted = false;
        this.mInitialPosition = -1;
        this.mAutoFullscreen = false;
        this.mLoop = false;
        this.mUpdateCounters = new RunnableC2722a();
        init(context, attributeSet);
    }

    private void abandonAudioFocus() {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        if (audioManager.abandonAudioFocus(this.mOnAudioFocusChangeListener) == 1) {
            this.mAudioFocusGranted = false;
        }
        this.mOnAudioFocusChangeListener = null;
    }

    private void adjustAspectRatio(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        double d = i4;
        double d2 = i3;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = i;
        Double.isNaN(d4);
        int i7 = (int) (d4 * d3);
        if (i2 > i7) {
            i6 = i7;
            i5 = i;
        } else {
            double d5 = i2;
            Double.isNaN(d5);
            i5 = (int) (d5 / d3);
            i6 = i2;
        }
        Matrix matrix = new Matrix();
        this.mTextureView.getTransform(matrix);
        matrix.setScale(i5 / i, i6 / i2);
        matrix.postTranslate((i - i5) / 2, (i2 - i6) / 2);
        this.mTextureView.setTransform(matrix);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setBackgroundColor(-16777216);
        if (attributeSet == null || !s40.m15354a()) {
            this.mAutoPlay = false;
            this.mAutoFullscreen = false;
            this.mLoop = false;
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TapsellNativeVideoPlayer, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(R$styleable.TapsellNativeVideoPlayer_tnvp_source);
            if (string != null && !string.trim().isEmpty()) {
                this.mSource = Uri.parse(string);
            }
            this.mAutoPlay = obtainStyledAttributes.getBoolean(R$styleable.TapsellNativeVideoPlayer_tnvp_autoPlay, false);
            this.mAutoFullscreen = obtainStyledAttributes.getBoolean(R$styleable.TapsellNativeVideoPlayer_tnvp_autoFullscreen, false);
            this.mLoop = obtainStyledAttributes.getBoolean(R$styleable.TapsellNativeVideoPlayer_tnvp_loop, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void prepare() {
        if (!this.mSurfaceAvailable || this.mSource == null || this.mPlayer == null || this.mIsPrepared) {
            return;
        }
        InterfaceC2725b interfaceC2725b = this.mCallback;
        if (interfaceC2725b != null) {
            interfaceC2725b.mo13057b(this);
        }
        try {
            this.mPlayer.setSurface(this.mSurface);
            setSourceInternal();
        } catch (Exception e) {
            throwError(e);
        }
    }

    private boolean requestAudioFocus() {
        if (!this.mAudioFocusGranted) {
            AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
            if (audioManager == null) {
                return false;
            }
            if (audioManager.requestAudioFocus(this.mOnAudioFocusChangeListener, 3, 1) == 1) {
                this.mAudioFocusGranted = true;
            }
        }
        return this.mAudioFocusGranted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @TargetApi(14)
    private void setFullscreen(boolean z) {
        if (this.mAutoFullscreen) {
            ?? r3 = z;
            if (Build.VERSION.SDK_INT >= 19) {
                int i = (z ? 1 : 0) | 1792;
                r3 = z ? i | 2054 : i;
            }
            this.mClickFrame.setSystemUiVisibility(r3);
        }
    }

    private void setSourceInternal() {
        AssetManager assets;
        String uri;
        String str;
        if (this.mSource.getScheme() == null || !(this.mSource.getScheme().equals("http") || this.mSource.getScheme().equals("https"))) {
            if (this.mSource.getScheme() != null && this.mSource.getScheme().equals("file") && this.mSource.getPath().contains("/android_assets/")) {
                assets = getContext().getAssets();
                uri = this.mSource.toString();
                str = "file:///android_assets/";
            } else if (this.mSource.getScheme() == null || !this.mSource.getScheme().equals("asset")) {
                this.mPlayer.setDataSource(getContext(), this.mSource);
            } else {
                assets = getContext().getAssets();
                uri = this.mSource.toString();
                str = "asset://";
            }
            AssetFileDescriptor openFd = assets.openFd(uri.replace(str, ""));
            this.mPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
        } else {
            this.mPlayer.setDataSource(this.mSource.toString());
        }
        this.mPlayer.prepareAsync();
    }

    private void sourceChanged() {
        this.mPlayer.reset();
        InterfaceC2725b interfaceC2725b = this.mCallback;
        if (interfaceC2725b != null) {
            interfaceC2725b.mo13057b(this);
        }
        try {
            setSourceInternal();
        } catch (IOException e) {
            throwError(e);
        }
    }

    private void throwError(Exception exc) {
        InterfaceC2725b interfaceC2725b = this.mCallback;
        if (interfaceC2725b == null) {
            throw new RuntimeException(exc);
        }
        interfaceC2725b.mo13056a(this, exc);
    }

    public void fullscreenVideo(Context context, e70 e70Var) {
        if (this.mPlayer != null) {
            DialogFragmentC2718d.m13016b(e70Var).show(((Activity) context).getFragmentManager(), "fullScreenVideoDialog");
        }
    }

    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer == null) {
            return -1;
        }
        return mediaPlayer.getCurrentPosition();
    }

    public int getDuration() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer == null) {
            return -1;
        }
        return mediaPlayer.getDuration();
    }

    public MediaPlayer getMediaPlayer() {
        return this.mPlayer;
    }

    public boolean hasPlayer() {
        return this.mPlayer != null;
    }

    public void initPlayer() {
        if (this.mPlayer != null) {
            return;
        }
        setKeepScreenOn(true);
        this.mHandler = new Handler();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mPlayer = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        this.mPlayer.setOnBufferingUpdateListener(this);
        this.mPlayer.setOnCompletionListener(this);
        this.mPlayer.setOnVideoSizeChangedListener(this);
        this.mPlayer.setOnErrorListener(this);
        this.mPlayer.setAudioStreamType(3);
        this.mPlayer.setLooping(this.mLoop);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        TextureView textureView = new TextureView(getContext());
        this.mTextureView = textureView;
        addView(textureView, layoutParams);
        this.mTextureView.setSurfaceTextureListener(this);
        this.mClickFrame = new FrameLayout(getContext());
        s40.m15354a();
        ((FrameLayout) this.mClickFrame).setForeground(C2727d.m13083a(getContext(), R.attr.selectableItemBackground));
        addView(this.mClickFrame, new ViewGroup.LayoutParams(-1, -1));
        this.mClickFrame.setOnClickListener(new ViewOnClickListenerC2723b(this));
        prepare();
    }

    public boolean isAutoPlayEnabled() {
        return this.mAutoPlay;
    }

    public boolean isMuted() {
        return this.isMuted;
    }

    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mPlayer;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    public boolean isPrepared() {
        return this.mPlayer != null && this.mIsPrepared;
    }

    public void muteVideo() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            this.isMuted = true;
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        InterfaceC2725b interfaceC2725b = this.mCallback;
        if (interfaceC2725b != null) {
            interfaceC2725b.mo13055a(this, i);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        Handler handler;
        if (this.mLoop && (handler = this.mHandler) != null) {
            handler.removeCallbacks(this.mUpdateCounters);
        }
        InterfaceC2725b interfaceC2725b = this.mCallback;
        if (interfaceC2725b != null) {
            interfaceC2725b.mo13060e(this);
            if (this.mLoop) {
                this.mCallback.mo13061f(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
        this.mClickFrame = null;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mUpdateCounters);
            this.mHandler = null;
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb;
        String str;
        if (i == -38) {
            return false;
        }
        String str2 = "Preparation/playback error (" + i + "): ";
        if (i == -1010) {
            sb = new StringBuilder();
            sb.append(str2);
            str = "Unsupported";
        } else if (i == -1007) {
            sb = new StringBuilder();
            sb.append(str2);
            str = "Malformed";
        } else if (i == -1004) {
            sb = new StringBuilder();
            sb.append(str2);
            str = "I/O error";
        } else if (i == -110) {
            sb = new StringBuilder();
            sb.append(str2);
            str = "Timed out";
        } else if (i == 100) {
            sb = new StringBuilder();
            sb.append(str2);
            str = "Server died";
        } else if (i != 200) {
            sb = new StringBuilder();
            sb.append(str2);
            str = "Unknown error";
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            str = "Not valid for progressive playback";
        }
        sb.append(str);
        throwError(new Exception(sb.toString()));
        return false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            return;
        }
        initPlayer();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mIsPrepared = true;
        InterfaceC2725b interfaceC2725b = this.mCallback;
        if (interfaceC2725b != null) {
            interfaceC2725b.mo13054a(this);
        }
        if (!this.mAutoPlay) {
            InterfaceC2725b interfaceC2725b2 = this.mCallback;
            if (interfaceC2725b2 != null) {
                interfaceC2725b2.mo13059d(this);
            }
            this.mPlayer.start();
            this.mPlayer.pause();
            return;
        }
        start();
        this.mCallback.mo13061f(this);
        int i = this.mInitialPosition;
        if (i > 0) {
            seekTo(i);
            this.mInitialPosition = -1;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mInitialTextureWidth = i;
        this.mInitialTextureHeight = i2;
        this.mSurfaceAvailable = true;
        Surface surface = new Surface(surfaceTexture);
        this.mSurface = surface;
        if (this.mIsPrepared) {
            this.mPlayer.setSurface(surface);
        } else {
            prepare();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.mSurfaceAvailable = false;
        this.mSurface = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        adjustAspectRatio(i, i2, this.mPlayer.getVideoWidth(), this.mPlayer.getVideoHeight());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        adjustAspectRatio(this.mInitialTextureWidth, this.mInitialTextureHeight, i, i2);
    }

    public void pause() {
        if (this.mPlayer != null && isPlaying() && this.mAudioFocusGranted) {
            this.mPlayer.pause();
            InterfaceC2725b interfaceC2725b = this.mCallback;
            if (interfaceC2725b != null) {
                interfaceC2725b.mo13059d(this);
            }
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.removeCallbacks(this.mUpdateCounters);
        }
    }

    public void release() {
        this.mIsPrepared = false;
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Throwable unused) {
            }
            this.mPlayer = null;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mUpdateCounters);
            this.mHandler = null;
        }
    }

    public void reset() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer == null) {
            return;
        }
        this.mIsPrepared = false;
        mediaPlayer.reset();
        this.mIsPrepared = false;
    }

    public void seekTo(int i) {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.seekTo(i);
    }

    public void setAutoFullscreen(boolean z) {
        this.mAutoFullscreen = z;
    }

    public void setAutoPlay(boolean z) {
        this.mAutoPlay = z;
    }

    public void setCallback(InterfaceC2725b interfaceC2725b) {
        this.mCallback = interfaceC2725b;
    }

    public void setClickEnabled(boolean z) {
        this.mClickFrame.setEnabled(z);
    }

    public void setInitialPosition(int i) {
        this.mInitialPosition = i;
    }

    public void setLoop(boolean z) {
        this.mLoop = z;
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    public void setMuted(boolean z) {
        this.isMuted = z;
    }

    public void setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.mOnAudioFocusChangeListener = onAudioFocusChangeListener;
    }

    public void setProgressCallback(InterfaceC2726c interfaceC2726c) {
        this.mProgressCallback = interfaceC2726c;
    }

    public void setSource(Uri uri) {
        boolean z = this.mSource != null;
        if (z) {
            stop();
        }
        this.mSource = uri;
        if (this.mPlayer != null) {
            if (z) {
                sourceChanged();
            } else {
                prepare();
            }
        }
    }

    public void setVolume(float f, float f2) {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer == null || !this.mIsPrepared) {
            throw new IllegalStateException("You cannot use setVolume(float, float) until the player is prepared.");
        }
        mediaPlayer.setVolume(f, f2);
    }

    public void start() {
        if (this.mPlayer == null) {
            initPlayer();
        }
        if (!this.mAudioFocusGranted) {
            requestAudioFocus();
        }
        this.mPlayer.start();
        InterfaceC2725b interfaceC2725b = this.mCallback;
        if (interfaceC2725b != null) {
            interfaceC2725b.mo13061f(this);
        }
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        this.mHandler.post(this.mUpdateCounters);
    }

    public void stop() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null && this.mAudioFocusGranted) {
            try {
                mediaPlayer.stop();
            } catch (Throwable unused) {
            }
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.removeCallbacks(this.mUpdateCounters);
        }
    }

    public void unMuteVideo() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            this.isMuted = false;
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }
}
