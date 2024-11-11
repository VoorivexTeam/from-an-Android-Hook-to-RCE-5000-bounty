package ir.tapsell.sdk.views;

import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.ContextMenu;

/* renamed from: ir.tapsell.sdk.views.b */
/* loaded from: classes.dex */
public class C2785b extends C2784a {

    /* renamed from: D */
    private MediaPlayer f11361D;

    /* renamed from: E */
    private boolean f11362E;

    /* renamed from: F */
    private boolean f11363F;

    /* renamed from: G */
    private b f11364G;

    /* renamed from: H */
    private MediaPlayer.OnPreparedListener f11365H;

    /* renamed from: ir.tapsell.sdk.views.b$a */
    /* loaded from: classes.dex */
    class a implements MediaPlayer.OnPreparedListener {

        /* renamed from: b */
        final /* synthetic */ MediaPlayer.OnPreparedListener f11366b;

        /* renamed from: ir.tapsell.sdk.views.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC3571a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ MediaPlayer f11368b;

            RunnableC3571a(MediaPlayer mediaPlayer) {
                this.f11368b = mediaPlayer;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaPlayer mediaPlayer = this.f11368b;
                if (mediaPlayer != null) {
                    try {
                        C2785b.this.m13257a(mediaPlayer.getVideoWidth(), this.f11368b.getVideoHeight());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        a(MediaPlayer.OnPreparedListener onPreparedListener) {
            this.f11366b = onPreparedListener;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayer.OnPreparedListener onPreparedListener = this.f11366b;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(mediaPlayer);
            }
            C2785b.this.setMediaPlayer(mediaPlayer);
            C2785b.this.post(new RunnableC3571a(mediaPlayer));
        }
    }

    /* renamed from: ir.tapsell.sdk.views.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo12859a();

        /* renamed from: b */
        void mo12860b();
    }

    public C2785b(Context context) {
        super(context);
        this.f11362E = false;
        this.f11363F = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13257a(int i, int i2) {
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
        this.f11361D = mediaPlayer;
        if (!this.f11363F) {
            this.f11363F = true;
            AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
            if (audioManager == null) {
                return;
            }
            int ringerMode = audioManager.getRingerMode();
            if (ringerMode == 0 || ringerMode == 1) {
                m13262e();
                return;
            } else {
                if (ringerMode != 2) {
                    return;
                }
                m13263f();
                return;
            }
        }
        if (m13261d()) {
            setVolume(0);
            b bVar = this.f11364G;
            if (bVar != null) {
                bVar.mo12860b();
                return;
            }
            return;
        }
        AudioManager audioManager2 = (AudioManager) getContext().getSystemService("audio");
        if (audioManager2 == null) {
            return;
        }
        setVolume((audioManager2.getStreamVolume(3) * 100) / audioManager2.getStreamMaxVolume(3));
        b bVar2 = this.f11364G;
        if (bVar2 != null) {
            bVar2.mo12859a();
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
            this.f11362E = true;
            b bVar = this.f11364G;
            if (bVar != null) {
                bVar.mo12860b();
            }
        } else {
            this.f11362E = false;
            b bVar2 = this.f11364G;
            if (bVar2 != null) {
                bVar2.mo12859a();
            }
        }
        MediaPlayer mediaPlayer = this.f11361D;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(log, log);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public void m13260c() {
        MediaPlayer mediaPlayer = this.f11361D;
        if (mediaPlayer != null) {
            try {
                m13257a(mediaPlayer.getVideoWidth(), this.f11361D.getVideoHeight());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public boolean m13261d() {
        return this.f11362E;
    }

    /* renamed from: e */
    public void m13262e() {
        this.f11362E = true;
        setVolume(0);
        b bVar = this.f11364G;
        if (bVar != null) {
            bVar.mo12860b();
        }
    }

    /* renamed from: f */
    public void m13263f() {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        this.f11362E = false;
        int i = (streamVolume * 100) / streamMaxVolume;
        if (i < 20) {
            i = 20;
        }
        setVolume(i);
        b bVar = this.f11364G;
        if (bVar != null) {
            bVar.mo12859a();
        }
    }

    @Override // android.view.View
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        return super.getContextMenuInfo();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m13260c();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m13260c();
    }

    public void setMuteListener(b bVar) {
        this.f11364G = bVar;
    }

    @Override // ir.tapsell.sdk.views.C2784a
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        a aVar = new a(onPreparedListener);
        this.f11365H = aVar;
        super.setOnPreparedListener(aVar);
    }
}
