package com.google.zxing.client.android;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.google.zxing.client.android.b */
/* loaded from: classes.dex */
final class C2247b implements MediaPlayer.OnErrorListener, Closeable {

    /* renamed from: f */
    private static final String f9080f = C2247b.class.getSimpleName();

    /* renamed from: b */
    private final Activity f9081b;

    /* renamed from: c */
    private MediaPlayer f9082c = null;

    /* renamed from: d */
    private boolean f9083d;

    /* renamed from: e */
    private boolean f9084e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2247b(Activity activity) {
        this.f9081b = activity;
        m10845c();
    }

    /* renamed from: a */
    private MediaPlayer m10842a(Context context) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(R$raw.beep);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                mediaPlayer.setOnErrorListener(this);
                mediaPlayer.setAudioStreamType(3);
                mediaPlayer.setLooping(false);
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                return mediaPlayer;
            } catch (Throwable th) {
                openRawResourceFd.close();
                throw th;
            }
        } catch (IOException unused) {
            mediaPlayer.release();
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m10843a(SharedPreferences sharedPreferences, Context context) {
        boolean z = sharedPreferences.getBoolean("preferences_play_beep", true);
        if (!z || ((AudioManager) context.getSystemService("audio")).getRingerMode() == 2) {
            return z;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m10844a() {
        if (this.f9083d && this.f9082c != null) {
            this.f9082c.start();
        }
        if (this.f9084e) {
            ((Vibrator) this.f9081b.getSystemService("vibrator")).vibrate(200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void m10845c() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f9081b);
        this.f9083d = m10843a(defaultSharedPreferences, this.f9081b);
        this.f9084e = defaultSharedPreferences.getBoolean("preferences_vibrate", false);
        if (this.f9083d && this.f9082c == null) {
            this.f9081b.setVolumeControlStream(3);
            this.f9082c = m10842a(this.f9081b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f9082c != null) {
            this.f9082c.release();
            this.f9082c = null;
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public synchronized boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 100) {
            this.f9081b.finish();
        } else {
            close();
            m10845c();
        }
        return true;
    }
}
