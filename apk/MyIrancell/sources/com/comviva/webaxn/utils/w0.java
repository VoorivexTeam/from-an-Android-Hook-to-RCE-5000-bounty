package com.comviva.webaxn.utils;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.text.TextUtils;
import com.mtni.myirancell.R;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;

/* loaded from: classes.dex */
public class w0 {
    private static w0 i;
    private Context a;
    private boolean b;
    private yj c;
    private e d;
    private lj e;
    private mj f;
    private wj g;
    private HashMap<String, String> h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements MediaPlayer.OnErrorListener {
        a(w0 w0Var) {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            mediaPlayer.release();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnCompletionListener {
        b(w0 w0Var) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.release();
        }
    }

    private w0(Context context) {
        this.a = context;
    }

    public static w0 a(Context context) {
        if (i == null) {
            i = new w0(context);
        }
        return i;
    }

    private MediaPlayer b(boolean z) {
        String str;
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        boolean z2 = true;
        try {
            if (z) {
                String str2 = this.h.get("filename");
                if (TextUtils.isEmpty(str2)) {
                    openRawResourceFd = this.a.getResources().openRawResourceFd(R.raw.def);
                } else {
                    int identifier = this.a.getResources().getIdentifier(str2.indexOf(".") != -1 ? str2.substring(0, str2.indexOf(".")) : null, "raw", this.a.getPackageName());
                    if (identifier > 0) {
                        openRawResourceFd = this.a.getResources().openRawResourceFd(identifier);
                    } else {
                        String str3 = x1.a(this.a, 1, "webaxn_media") + str2;
                        if (TextUtils.isEmpty(str3) || !x1.j(str3)) {
                            z2 = false;
                            str = str3;
                            openRawResourceFd = this.a.getResources().openRawResourceFd(R.raw.def);
                        } else {
                            str = str3;
                            openRawResourceFd = null;
                        }
                    }
                }
                str = null;
                z2 = false;
            } else {
                str = x1.a(this.a, 1, "webaxn_media") + "splash.mp3";
                if (TextUtils.isEmpty(str) || !x1.j(str)) {
                    openRawResourceFd = this.a.getResources().openRawResourceFd(R.raw.splash);
                    z2 = false;
                }
                openRawResourceFd = null;
            }
            if (z2) {
                mediaPlayer.setDataSource(str);
            } else if (openRawResourceFd != null) {
                try {
                    mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                    openRawResourceFd.close();
                } catch (Throwable th) {
                    openRawResourceFd.close();
                    throw th;
                }
            }
            mediaPlayer.setOnErrorListener(new a(this));
            mediaPlayer.setOnCompletionListener(new b(this));
            mediaPlayer.setAudioStreamType(3);
            mediaPlayer.setLooping(false);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (Exception unused) {
            mediaPlayer.release();
            return null;
        }
    }

    private boolean b() {
        return ((AudioManager) this.a.getSystemService("audio")).getRingerMode() == 2;
    }

    public void a() {
        if (TextUtils.isEmpty(this.h.get("action")) || this.g.a(this.h.get("action"), false, this.c, this.d, this.f, this.e)) {
            return;
        }
        xj a2 = x1.a(this.h.get("action"), this.f.i());
        if (a2 != null) {
            this.f.a(a2);
        }
        String str = null;
        yj yjVar = this.c;
        if (yjVar != null) {
            str = yjVar.j;
        } else {
            e eVar = this.d;
            if (eVar != null) {
                str = eVar.j;
            }
        }
        if (this.g.a(this.h.get("action"), false, false, this.f, false, false, str, this.e) > 0) {
            this.g.E();
        }
    }

    public void a(yj yjVar, e eVar, wj wjVar, mj mjVar, lj ljVar, String str) {
        this.c = yjVar;
        this.d = eVar;
        this.g = wjVar;
        this.f = mjVar;
        this.e = ljVar;
        HashMap<String, String> hashMap = this.h;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.h = x1.f(str);
        a(true);
    }

    public void a(boolean z) {
        boolean b2 = b();
        this.b = b2;
        if (b2) {
            b(z);
        }
        if (z) {
            a();
        }
    }
}
