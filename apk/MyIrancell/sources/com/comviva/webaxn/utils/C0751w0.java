package com.comviva.webaxn.utils;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.text.TextUtils;
import com.mtni.myirancell.R;
import java.util.HashMap;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.w0 */
/* loaded from: classes.dex */
public class C0751w0 {

    /* renamed from: i */
    private static C0751w0 f5207i;

    /* renamed from: a */
    private Context f5208a;

    /* renamed from: b */
    private boolean f5209b;

    /* renamed from: c */
    private C3489yj f5210c;

    /* renamed from: d */
    private C0696e f5211d;

    /* renamed from: e */
    private C2899lj f5212e;

    /* renamed from: f */
    private C2945mj f5213f;

    /* renamed from: g */
    private C3400wj f5214g;

    /* renamed from: h */
    private HashMap<String, String> f5215h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.w0$a */
    /* loaded from: classes.dex */
    public class a implements MediaPlayer.OnErrorListener {
        a(C0751w0 c0751w0) {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            mediaPlayer.release();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.w0$b */
    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnCompletionListener {
        b(C0751w0 c0751w0) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.release();
        }
    }

    private C0751w0(Context context) {
        this.f5208a = context;
    }

    /* renamed from: a */
    public static C0751w0 m6093a(Context context) {
        if (f5207i == null) {
            f5207i = new C0751w0(context);
        }
        return f5207i;
    }

    /* renamed from: b */
    private MediaPlayer m6094b(boolean z) {
        String str;
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        boolean z2 = true;
        try {
            if (z) {
                String str2 = this.f5215h.get("filename");
                if (TextUtils.isEmpty(str2)) {
                    openRawResourceFd = this.f5208a.getResources().openRawResourceFd(R.raw.def);
                } else {
                    int identifier = this.f5208a.getResources().getIdentifier(str2.indexOf(".") != -1 ? str2.substring(0, str2.indexOf(".")) : null, "raw", this.f5208a.getPackageName());
                    if (identifier > 0) {
                        openRawResourceFd = this.f5208a.getResources().openRawResourceFd(identifier);
                    } else {
                        String str3 = C0755x1.m6127a(this.f5208a, 1, "webaxn_media") + str2;
                        if (TextUtils.isEmpty(str3) || !C0755x1.m6193j(str3)) {
                            z2 = false;
                            str = str3;
                            openRawResourceFd = this.f5208a.getResources().openRawResourceFd(R.raw.def);
                        } else {
                            str = str3;
                            openRawResourceFd = null;
                        }
                    }
                }
                str = null;
                z2 = false;
            } else {
                str = C0755x1.m6127a(this.f5208a, 1, "webaxn_media") + "splash.mp3";
                if (TextUtils.isEmpty(str) || !C0755x1.m6193j(str)) {
                    openRawResourceFd = this.f5208a.getResources().openRawResourceFd(R.raw.splash);
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

    /* renamed from: b */
    private boolean m6095b() {
        return ((AudioManager) this.f5208a.getSystemService("audio")).getRingerMode() == 2;
    }

    /* renamed from: a */
    public void m6096a() {
        if (TextUtils.isEmpty(this.f5215h.get("action")) || this.f5214g.m16298a(this.f5215h.get("action"), false, this.f5210c, this.f5211d, this.f5213f, this.f5212e)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f5215h.get("action"), this.f5213f.m14145i());
        if (m6134a != null) {
            this.f5213f.m14121a(m6134a);
        }
        String str = null;
        C3489yj c3489yj = this.f5210c;
        if (c3489yj != null) {
            str = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f5211d;
            if (c0696e != null) {
                str = c0696e.f4718j;
            }
        }
        if (this.f5214g.m16263a(this.f5215h.get("action"), false, false, this.f5213f, false, false, str, this.f5212e) > 0) {
            this.f5214g.m16258E();
        }
    }

    /* renamed from: a */
    public void m6097a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str) {
        this.f5210c = c3489yj;
        this.f5211d = c0696e;
        this.f5214g = c3400wj;
        this.f5213f = c2945mj;
        this.f5212e = c2899lj;
        HashMap<String, String> hashMap = this.f5215h;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f5215h = C0755x1.m6188f(str);
        m6098a(true);
    }

    /* renamed from: a */
    public void m6098a(boolean z) {
        boolean m6095b = m6095b();
        this.f5209b = m6095b;
        if (m6095b) {
            m6094b(z);
        }
        if (z) {
            m6096a();
        }
    }
}
