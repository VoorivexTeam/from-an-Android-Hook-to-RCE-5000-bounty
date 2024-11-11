package ir.tapsell.sdk.views;

import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.ContextMenu;

/* loaded from: classes.dex */
public class b extends ir.tapsell.sdk.views.a {
    private MediaPlayer D;
    private boolean E;
    private boolean F;
    private InterfaceC0075b G;
    private MediaPlayer.OnPreparedListener H;

    /* loaded from: classes.dex */
    class a implements MediaPlayer.OnPreparedListener {
        final /* synthetic */ MediaPlayer.OnPreparedListener b;

        /* renamed from: ir.tapsell.sdk.views.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0074a implements Runnable {
            final /* synthetic */ MediaPlayer b;

            RunnableC0074a(MediaPlayer mediaPlayer) {
                this.b = mediaPlayer;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaPlayer mediaPlayer = this.b;
                if (mediaPlayer != null) {
                    try {
                        b.this.a(mediaPlayer.getVideoWidth(), this.b.getVideoHeight());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        a(MediaPlayer.OnPreparedListener onPreparedListener) {
            this.b = onPreparedListener;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayer.OnPreparedListener onPreparedListener = this.b;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(mediaPlayer);
            }
            b.this.setMediaPlayer(mediaPlayer);
            b.this.post(new RunnableC0074a(mediaPlayer));
        }
    }

    /* renamed from: ir.tapsell.sdk.views.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0075b {
        void a();

        void b();
    }

    public b(Context context) {
        super(context);
        this.E = false;
        this.F = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            width = getMeasuredWidth();
            height = getMeasuredHeight();
        }
        if (height != 0 && width != 0) {
            double d = i;
            double d2 = i2;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double d4 = width;
            double d5 = height;
            Double.isNaN(d4);
            Double.isNaN(d5);
            double d6 = d4 / d5;
            if (d3 > d6) {
                Double.isNaN(d5);
                height = (int) (d5 / d3);
            } else if (d6 > d3) {
                Double.isNaN(d4);
                width = (int) (d4 * d3);
            }
        }
        getHolder().setFixedSize(width, height);
        requestLayout();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.D = mediaPlayer;
        if (!this.F) {
            this.F = true;
            AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
            if (audioManager == null) {
                return;
            }
            int ringerMode = audioManager.getRingerMode();
            if (ringerMode == 0 || ringerMode == 1) {
                e();
                return;
            } else {
                if (ringerMode != 2) {
                    return;
                }
                f();
                return;
            }
        }
        if (d()) {
            setVolume(0);
            InterfaceC0075b interfaceC0075b = this.G;
            if (interfaceC0075b != null) {
                interfaceC0075b.b();
                return;
            }
            return;
        }
        AudioManager audioManager2 = (AudioManager) getContext().getSystemService("audio");
        if (audioManager2 == null) {
            return;
        }
        setVolume((audioManager2.getStreamVolume(3) * 100) / audioManager2.getStreamMaxVolume(3));
        InterfaceC0075b interfaceC0075b2 = this.G;
        if (interfaceC0075b2 != null) {
            interfaceC0075b2.a();
        }
    }

    private void setVolume(int i) {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int i2 = streamMaxVolume - i;
        float log = (float) (1.0d - ((i2 > 0 ? Math.log(i2) : 0.0d) / Math.log(streamMaxVolume)));
        if (log <= 0.001d) {
            this.E = true;
            InterfaceC0075b interfaceC0075b = this.G;
            if (interfaceC0075b != null) {
                interfaceC0075b.b();
            }
        } else {
            this.E = false;
            InterfaceC0075b interfaceC0075b2 = this.G;
            if (interfaceC0075b2 != null) {
                interfaceC0075b2.a();
            }
        }
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(log, log);
            } catch (Throwable unused) {
            }
        }
    }

    public void c() {
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            try {
                a(mediaPlayer.getVideoWidth(), this.D.getVideoHeight());
            } catch (Throwable unused) {
            }
        }
    }

    public boolean d() {
        return this.E;
    }

    public void e() {
        this.E = true;
        setVolume(0);
        InterfaceC0075b interfaceC0075b = this.G;
        if (interfaceC0075b != null) {
            interfaceC0075b.b();
        }
    }

    public void f() {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        this.E = false;
        int i = (streamVolume * 100) / streamMaxVolume;
        if (i < 20) {
            i = 20;
        }
        setVolume(i);
        InterfaceC0075b interfaceC0075b = this.G;
        if (interfaceC0075b != null) {
            interfaceC0075b.a();
        }
    }

    @Override // android.view.View
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        return super.getContextMenuInfo();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c();
    }

    public void setMuteListener(InterfaceC0075b interfaceC0075b) {
        this.G = interfaceC0075b;
    }

    @Override // ir.tapsell.sdk.views.a
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        a aVar = new a(onPreparedListener);
        this.H = aVar;
        super.setOnPreparedListener(aVar);
    }
}
