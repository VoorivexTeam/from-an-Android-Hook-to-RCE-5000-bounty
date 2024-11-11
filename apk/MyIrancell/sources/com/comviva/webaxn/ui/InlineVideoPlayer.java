package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.wj;
import defpackage.zi;

/* loaded from: classes.dex */
public class InlineVideoPlayer extends Activity {
    private static final String h = InlineVideoPlayer.class.getCanonicalName();
    private VideoView b;
    private MediaController c;
    private ProgressDialog d;
    private boolean f;
    private String e = null;
    private boolean g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnCancelListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            InlineVideoPlayer.this.f = true;
            InlineVideoPlayer.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnPreparedListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            InlineVideoPlayer.this.d.dismiss();
            String str = "Playing ";
            if (InlineVideoPlayer.this.e != null) {
                str = "Playing " + InlineVideoPlayer.this.e;
            }
            try {
                InlineVideoPlayer.this.setTitle(Uri.decode(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void a(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (-1 < lastIndexOf && str.length() - 1 > lastIndexOf) {
            this.e = str.substring(lastIndexOf + 1);
        }
        this.b.setVideoPath(str);
        this.b.start();
        ProgressDialog show = ProgressDialog.show(this, null, null);
        this.d = show;
        show.setCanceledOnTouchOutside(false);
        this.d.setCancelable(true);
        this.d.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.d.setOnCancelListener(new a());
        this.d.setContentView(new ProgressBar(this));
        this.b.setOnPreparedListener(new b());
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
            getWindow().setStatusBarColor(zi.x);
            if (x1.c(zi.x) && Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(8192);
            }
        }
        x1.j.a = h;
        x1.j.c = null;
        x1.x = true;
        String stringExtra = getIntent() != null ? getIntent().getStringExtra("url") : null;
        setTitle("Loading Media...");
        setContentView(R.layout.inline_video_player);
        this.b = (VideoView) findViewById(R.id.video_player_view);
        MediaController mediaController = new MediaController(this);
        this.c = mediaController;
        this.b.setMediaController(mediaController);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        a(stringExtra);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        x1.x = false;
        x1.j.b = false;
        x1.j.a = null;
        x1.j.c = null;
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
                    x1.a((Context) this, intent.getExtras().getInt("id"), true);
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
                if (x1.q == null || TextUtils.isEmpty(string)) {
                    return;
                }
                wj wjVar = x1.q;
                if (!wjVar.a(string, false, null, null, wjVar.k(), null)) {
                    wj wjVar2 = x1.q;
                    if (wjVar2.a(string, false, false, null, false, false, null, wjVar2.t().e()) > 0) {
                        x1.q.E();
                    }
                }
                x1.q = null;
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.g = true;
        x1.j.b = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (x1.u || (com.comviva.webaxn.utils.j1.a(this).u0() && this.g)) {
                this.g = false;
                x1.u = false;
                com.comviva.webaxn.utils.j1.a(this).b(false);
            } else if (x1.v && this.g) {
                this.g = false;
                x1.v = false;
                x1.x = false;
                x1.j.b = false;
                x1.j.a = null;
                x1.j.c = null;
                x1.a((Context) this, 0, true);
                finish();
            }
        }
    }
}
