package com.comviva.webaxn.p002ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C3400wj;
import p000.C3530zi;

/* loaded from: classes.dex */
public class InlineVideoPlayer extends Activity {

    /* renamed from: h */
    private static final String f3337h = InlineVideoPlayer.class.getCanonicalName();

    /* renamed from: b */
    private VideoView f3338b;

    /* renamed from: c */
    private MediaController f3339c;

    /* renamed from: d */
    private ProgressDialog f3340d;

    /* renamed from: f */
    private boolean f3342f;

    /* renamed from: e */
    private String f3341e = null;

    /* renamed from: g */
    private boolean f3343g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.InlineVideoPlayer$a */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnCancelListenerC0585a implements DialogInterface.OnCancelListener {
        DialogInterfaceOnCancelListenerC0585a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            InlineVideoPlayer.this.f3342f = true;
            InlineVideoPlayer.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.InlineVideoPlayer$b */
    /* loaded from: classes.dex */
    public class C0586b implements MediaPlayer.OnPreparedListener {
        C0586b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            InlineVideoPlayer.this.f3340d.dismiss();
            String str = "Playing ";
            if (InlineVideoPlayer.this.f3341e != null) {
                str = "Playing " + InlineVideoPlayer.this.f3341e;
            }
            try {
                InlineVideoPlayer.this.setTitle(Uri.decode(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m4020a(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (-1 < lastIndexOf && str.length() - 1 > lastIndexOf) {
            this.f3341e = str.substring(lastIndexOf + 1);
        }
        this.f3338b.setVideoPath(str);
        this.f3338b.start();
        ProgressDialog show = ProgressDialog.show(this, null, null);
        this.f3340d = show;
        show.setCanceledOnTouchOutside(false);
        this.f3340d.setCancelable(true);
        this.f3340d.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f3340d.setOnCancelListener(new DialogInterfaceOnCancelListenerC0585a());
        this.f3340d.setContentView(new ProgressBar(this));
        this.f3338b.setOnPreparedListener(new C0586b());
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(C3530zi.f14481x);
            if (C0755x1.m6178c(C3530zi.f14481x) && Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(8192);
            }
        }
        C0755x1.j.f5281a = f3337h;
        C0755x1.j.f5283c = null;
        C0755x1.f5266x = true;
        String stringExtra = getIntent() != null ? getIntent().getStringExtra("url") : null;
        setTitle("Loading Media...");
        setContentView(R.layout.inline_video_player);
        this.f3338b = (VideoView) findViewById(R.id.video_player_view);
        MediaController mediaController = new MediaController(this);
        this.f3339c = mediaController;
        this.f3338b.setMediaController(mediaController);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        m4020a(stringExtra);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        C0755x1.f5266x = false;
        C0755x1.j.f5282b = false;
        C0755x1.j.f5281a = null;
        C0755x1.j.f5283c = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Bundle extras;
        String str;
        if (intent.getAction() != null) {
            if ((intent.getAction().equals("com.notify.action") || intent.getAction().equals("com.notify.lskaction") || intent.getAction().equals("com.notify.rskaction")) && intent.getExtras() != null) {
                if (intent.getExtras().getInt("id", -1) != -1) {
                    C0755x1.m6140a((Context) this, intent.getExtras().getInt("id"), true);
                }
                if (intent.getAction().equals("com.notify.lskaction")) {
                    extras = intent.getExtras();
                    str = "push_lskaction";
                } else {
                    boolean equals = intent.getAction().equals("com.notify.rskaction");
                    extras = intent.getExtras();
                    str = equals ? "push_rskaction" : "push_action";
                }
                String string = extras.getString(str);
                if (C0755x1.f5259q == null || TextUtils.isEmpty(string)) {
                    return;
                }
                C3400wj c3400wj = C0755x1.f5259q;
                if (!c3400wj.m16298a(string, false, null, null, c3400wj.m16334k(), null)) {
                    C3400wj c3400wj2 = C0755x1.f5259q;
                    if (c3400wj2.m16263a(string, false, false, null, false, false, null, c3400wj2.m16343t().m4811e()) > 0) {
                        C0755x1.f5259q.m16258E();
                    }
                }
                C0755x1.f5259q = null;
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f3343g = true;
        C0755x1.j.f5282b = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (C0755x1.f5263u || (C0713j1.m5563a(this).m5733u0() && this.f3343g)) {
                this.f3343g = false;
                C0755x1.f5263u = false;
                C0713j1.m5563a(this).m5638b(false);
            } else if (C0755x1.f5264v && this.f3343g) {
                this.f3343g = false;
                C0755x1.f5264v = false;
                C0755x1.f5266x = false;
                C0755x1.j.f5282b = false;
                C0755x1.j.f5281a = null;
                C0755x1.j.f5283c = null;
                C0755x1.m6140a((Context) this, 0, true);
                finish();
            }
        }
    }
}
