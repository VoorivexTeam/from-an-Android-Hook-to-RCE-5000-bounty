package com.comviva.webaxn.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.comviva.webaxn.utils.RecorderData;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.wj;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class RecorderActivity extends Activity {
    private ProgressBar c;
    private RelativeLayout d;
    private LinearLayout e;
    private Button f;
    private ImageButton g;
    private Button h;
    private TextView i;
    private TextView j;
    private TextView k;
    private MediaPlayer l;
    private x m;
    private RecorderData r;
    private ImageButton s;
    private LinearLayout t;
    private LinearLayout u;
    private LinearLayout v;
    private LottieAnimationView w;
    private static final String z = RecorderActivity.class.getCanonicalName();
    private static int A = 0;
    private static int B = 0;
    private boolean b = false;
    private String n = null;
    private String o = null;
    private final Handler p = new Handler();
    private boolean q = false;
    private View.OnTouchListener x = new a();
    private View.OnClickListener y = new b();

    /* loaded from: classes.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                RecorderActivity.this.f();
            } else if (motionEvent.getAction() == 1) {
                RecorderActivity.this.h();
                RecorderActivity.this.a("lbcap", false);
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecorderActivity recorderActivity;
            String str;
            if (view.getId() == 2) {
                RecorderActivity.this.h();
                RecorderActivity.this.c.setMax(RecorderActivity.B);
                RecorderActivity.this.k.setText(RecorderActivity.this.a(RecorderActivity.B, true));
                int unused = RecorderActivity.B = 0;
                RecorderActivity.this.i.setText(RecorderActivity.this.a(RecorderActivity.B, true));
                RecorderActivity.this.c.setProgress(RecorderActivity.B);
                RecorderActivity.this.g.setImageResource(R.drawable.play);
                RecorderActivity.this.g.setId(4);
                RecorderActivity.this.f.setVisibility(0);
                RecorderActivity.this.j.setText("Play...");
                return;
            }
            if (view.getId() == 4) {
                if (TextUtils.isEmpty(RecorderActivity.this.n)) {
                    return;
                }
                RecorderActivity.this.d();
                RecorderActivity.this.g.setImageResource(R.drawable.stop_btn);
                RecorderActivity.this.g.setId(3);
                RecorderActivity.this.f.setVisibility(8);
                return;
            }
            if (view.getId() == 3) {
                RecorderActivity.this.g();
                int unused2 = RecorderActivity.B = 0;
                RecorderActivity.this.c.setProgress(RecorderActivity.B);
                RecorderActivity.this.i.setText(RecorderActivity.this.a(RecorderActivity.B, true));
                RecorderActivity.this.g.setImageResource(R.drawable.play);
                RecorderActivity.this.g.setId(4);
                RecorderActivity.this.f.setVisibility(0);
                return;
            }
            if (view.getId() == R.id.button_send) {
                recorderActivity = RecorderActivity.this;
                str = "lbcap";
            } else {
                if (view.getId() != R.id.button_cancel) {
                    return;
                }
                recorderActivity = RecorderActivity.this;
                str = "rbcap";
            }
            recorderActivity.a(str, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.release();
                RecorderActivity.this.l = null;
            }
            int unused = RecorderActivity.B = 0;
            RecorderActivity.this.c.setProgress(RecorderActivity.B);
            RecorderActivity.this.i.setText(RecorderActivity.this.a(RecorderActivity.B, true));
            RecorderActivity.this.j.setText("Play...");
            RecorderActivity.this.g.setImageResource(R.drawable.play);
            RecorderActivity.this.g.setId(4);
            RecorderActivity.this.f.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecorderActivity.B += 1000;
            RecorderActivity.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecorderActivity.B += 1000;
            if (RecorderActivity.B > RecorderActivity.A) {
                int unused = RecorderActivity.B = RecorderActivity.A;
            }
            RecorderActivity.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(long j, boolean z2) {
        long j2;
        long j3;
        long j4;
        if (j == 0) {
            j2 = 0;
            j4 = 0;
            j3 = 0;
        } else {
            long j5 = j / 1000;
            long j6 = j5 == 0 ? 0L : j5 / 60;
            j2 = j5 % 60;
            j3 = j6 / 60;
            j4 = j6 % 60;
        }
        return j3 == 0 ? z2 ? String.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j2)) : String.format("-%02d:%02d", Long.valueOf(j4), Long.valueOf(j2)) : z2 ? String.format("%d:%02d:%02d", Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j2)) : String.format("-%d:%02d:%02d", Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j2));
    }

    private String a(String str) {
        StringBuilder sb;
        File file = new File(str);
        if (file.exists()) {
            String str2 = "wav";
            if (TextUtils.isEmpty(this.o)) {
                this.o = "wav";
            }
            if (this.o.equalsIgnoreCase("wav")) {
                sb = new StringBuilder();
            } else {
                str2 = "mp4";
                if (this.o.equalsIgnoreCase("mp4")) {
                    sb = new StringBuilder();
                } else {
                    str2 = "amr";
                    if (this.o.equalsIgnoreCase("amr")) {
                        sb = new StringBuilder();
                    } else {
                        str2 = "3gp";
                        if (this.o.equalsIgnoreCase("3gp")) {
                            sb = new StringBuilder();
                        }
                    }
                }
            }
            sb.append(file.getAbsolutePath());
            sb.append("/");
            sb.append(System.currentTimeMillis());
            sb.append(".");
            sb.append(str2);
            return sb.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z2) {
        if (z2) {
            h();
            g();
            B = 0;
        }
        Intent intent = new Intent();
        intent.putExtra("caption", str);
        intent.setData(Uri.fromFile(new File(this.n)));
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.l = null;
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.l = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            this.l.setDataSource(this.n);
            this.l.prepare();
            this.l.start();
            e();
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
        }
        this.l.setOnCompletionListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer == null || B >= mediaPlayer.getDuration()) {
            return;
        }
        this.c.setProgress(B);
        this.j.setText("Playing...");
        this.i.setText(a(B, true));
        this.p.postDelayed(new e(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.q) {
            return;
        }
        x b2 = x.b(this.o);
        this.m = b2;
        if (b2 != null) {
            b2.a(this.n);
            this.m.b();
            this.m.d();
            this.q = true;
        }
        LottieAnimationView lottieAnimationView = this.w;
        if (lottieAnimationView != null) {
            lottieAnimationView.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.l.release();
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        x xVar;
        if (!this.q || (xVar = this.m) == null) {
            return;
        }
        xVar.e();
        this.m.c();
        this.m = null;
        this.q = false;
        LottieAnimationView lottieAnimationView = this.w;
        if (lottieAnimationView != null) {
            lottieAnimationView.e();
        }
    }

    public void a() {
        if (this.m != null) {
            int i = B;
            if (i <= A) {
                this.c.setProgress(i);
                this.i.setText(a(B, true));
                this.p.postDelayed(new d(), 1000L);
                return;
            }
            h();
            int i2 = A;
            B = i2;
            this.k.setText(a(i2, true));
            B = 0;
            this.i.setText(a(0, true));
            this.c.setProgress(B);
            this.g.setImageResource(R.drawable.play);
            this.g.setId(4);
            this.j.setText("Play...");
            this.f.setVisibility(0);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x1.j.a = z;
        x1.j.c = this;
        x1.x = true;
        RecorderData recorderData = (RecorderData) getIntent().getParcelableExtra("recorder_data");
        this.r = recorderData;
        if (recorderData == null) {
            finish();
            return;
        }
        this.o = recorderData.h();
        String a2 = a(this.r.s());
        this.n = a2;
        if (TextUtils.isEmpty(a2)) {
            finish();
        }
        if (this.r.t() == 1) {
            setTheme(R.style.DialogTheme);
            requestWindowFeature(1);
            setContentView(R.layout.recorder);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rp_root);
            this.d = relativeLayout;
            relativeLayout.setBackgroundColor(-16777216);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.button_layout);
            this.e = linearLayout;
            linearLayout.setBackgroundColor(-16777216);
            this.j = (TextView) findViewById(R.id.media_title);
            this.c = (ProgressBar) findViewById(R.id.media_progress);
            ImageButton imageButton = (ImageButton) findViewById(R.id.playstop);
            this.g = imageButton;
            imageButton.setId(2);
            this.f = (Button) findViewById(R.id.button_send);
            if (!TextUtils.isEmpty(this.r.a())) {
                this.f.setText(this.r.a());
            }
            this.h = (Button) findViewById(R.id.button_cancel);
            if (!TextUtils.isEmpty(this.r.i())) {
                this.h.setText(this.r.i());
            }
            TextView textView = (TextView) findViewById(R.id.media_duration_start);
            this.i = textView;
            textView.setTextColor(-65536);
            TextView textView2 = (TextView) findViewById(R.id.media_duration_end);
            this.k = textView2;
            textView2.setTextColor(-65536);
            if (!TextUtils.isEmpty(this.r.u())) {
                try {
                    A = Integer.parseInt(this.r.u());
                } catch (NumberFormatException unused) {
                }
            }
            this.c.setMax(A);
            this.k.setText(a(A, true));
            this.j.setText("Recording...");
            this.j.setTextColor(-1);
            this.j.setTextSize(20.0f);
            this.g.setOnClickListener(this.y);
            this.f.setOnClickListener(this.y);
            this.h.setOnClickListener(this.y);
            f();
            a();
            return;
        }
        if (this.r.t() == 2) {
            setContentView(R.layout.custom_recorder);
            TextView textView3 = (TextView) findViewById(R.id.rec_label1);
            if (!TextUtils.isEmpty(this.r.b())) {
                textView3.setVisibility(0);
                textView3.setText(this.r.b());
                if (!TextUtils.isEmpty(this.r.d())) {
                    try {
                        textView3.setTextSize(Float.parseFloat(this.r.d()));
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (!TextUtils.isEmpty(this.r.c())) {
                    textView3.setTypeface(com.comviva.webaxn.utils.v.a(this.r.c()));
                }
            }
            TextView textView4 = (TextView) findViewById(R.id.rec_label2);
            if (!TextUtils.isEmpty(this.r.e())) {
                textView4.setVisibility(0);
                textView4.setText(this.r.e());
                if (!TextUtils.isEmpty(this.r.g())) {
                    try {
                        textView4.setTextSize(Float.parseFloat(this.r.g()));
                    } catch (NumberFormatException unused3) {
                    }
                }
                if (!TextUtils.isEmpty(this.r.f())) {
                    textView4.setTypeface(com.comviva.webaxn.utils.v.a(this.r.f()));
                }
            }
            TextView textView5 = (TextView) findViewById(R.id.rstext1);
            this.t = (LinearLayout) findViewById(R.id.status1);
            if (!TextUtils.isEmpty(this.r.p())) {
                this.t.setVisibility(0);
                if (TextUtils.isEmpty(this.r.v())) {
                    this.t.setAlpha(0.5f);
                } else if (this.r.v().equalsIgnoreCase("true")) {
                    this.t.setAlpha(1.0f);
                }
                textView5.setText(this.r.p());
                if (!TextUtils.isEmpty(this.r.k())) {
                    try {
                        textView5.setTextSize(Float.parseFloat(this.r.k()));
                    } catch (NumberFormatException unused4) {
                    }
                }
                if (!TextUtils.isEmpty(this.r.j())) {
                    textView5.setTypeface(com.comviva.webaxn.utils.v.a(this.r.j()));
                }
            }
            TextView textView6 = (TextView) findViewById(R.id.rstext2);
            this.u = (LinearLayout) findViewById(R.id.status2);
            if (!TextUtils.isEmpty(this.r.q())) {
                this.u.setVisibility(0);
                if (TextUtils.isEmpty(this.r.w())) {
                    this.u.setAlpha(0.5f);
                } else if (this.r.w().equalsIgnoreCase("true")) {
                    this.u.setAlpha(1.0f);
                }
                textView6.setText(this.r.q());
                if (!TextUtils.isEmpty(this.r.m())) {
                    try {
                        textView6.setTextSize(Float.parseFloat(this.r.m()));
                    } catch (NumberFormatException unused5) {
                    }
                }
                if (!TextUtils.isEmpty(this.r.l())) {
                    textView6.setTypeface(com.comviva.webaxn.utils.v.a(this.r.l()));
                }
            }
            TextView textView7 = (TextView) findViewById(R.id.rstext3);
            this.v = (LinearLayout) findViewById(R.id.status3);
            if (!TextUtils.isEmpty(this.r.r())) {
                this.v.setVisibility(0);
                if (TextUtils.isEmpty(this.r.x())) {
                    this.v.setAlpha(0.5f);
                } else if (this.r.x().equalsIgnoreCase("true")) {
                    this.v.setAlpha(1.0f);
                }
                textView7.setText(this.r.r());
                if (!TextUtils.isEmpty(this.r.o())) {
                    try {
                        textView7.setTextSize(Float.parseFloat(this.r.o()));
                    } catch (NumberFormatException unused6) {
                    }
                }
                if (!TextUtils.isEmpty(this.r.n())) {
                    textView7.setTypeface(com.comviva.webaxn.utils.v.a(this.r.n()));
                }
            }
            ImageButton imageButton2 = (ImageButton) findViewById(R.id.rec_capture);
            this.s = imageButton2;
            imageButton2.setOnTouchListener(this.x);
            this.w = (LottieAnimationView) findViewById(R.id.rec_image_view);
        }
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
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        h();
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.l.release();
            this.l = null;
            B = 0;
        }
        finish();
        return true;
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
        this.b = true;
        x1.j.b = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (x1.u || (com.comviva.webaxn.utils.j1.a(this).u0() && this.b)) {
                this.b = false;
                x1.u = false;
                com.comviva.webaxn.utils.j1.a(this).b(false);
            } else if (x1.v && this.b) {
                this.b = false;
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
