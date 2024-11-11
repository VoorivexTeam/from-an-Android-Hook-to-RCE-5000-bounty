package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0747v;
import com.comviva.webaxn.utils.C0755x1;
import com.comviva.webaxn.utils.RecorderData;
import com.mtni.myirancell.R;
import java.io.File;
import java.io.IOException;
import p000.C3400wj;

/* loaded from: classes.dex */
public class RecorderActivity extends Activity {

    /* renamed from: c */
    private ProgressBar f3365c;

    /* renamed from: d */
    private RelativeLayout f3366d;

    /* renamed from: e */
    private LinearLayout f3367e;

    /* renamed from: f */
    private Button f3368f;

    /* renamed from: g */
    private ImageButton f3369g;

    /* renamed from: h */
    private Button f3370h;

    /* renamed from: i */
    private TextView f3371i;

    /* renamed from: j */
    private TextView f3372j;

    /* renamed from: k */
    private TextView f3373k;

    /* renamed from: l */
    private MediaPlayer f3374l;

    /* renamed from: m */
    private C0672x f3375m;

    /* renamed from: r */
    private RecorderData f3380r;

    /* renamed from: s */
    private ImageButton f3381s;

    /* renamed from: t */
    private LinearLayout f3382t;

    /* renamed from: u */
    private LinearLayout f3383u;

    /* renamed from: v */
    private LinearLayout f3384v;

    /* renamed from: w */
    private LottieAnimationView f3385w;

    /* renamed from: z */
    private static final String f3363z = RecorderActivity.class.getCanonicalName();

    /* renamed from: A */
    private static int f3361A = 0;

    /* renamed from: B */
    private static int f3362B = 0;

    /* renamed from: b */
    private boolean f3364b = false;

    /* renamed from: n */
    private String f3376n = null;

    /* renamed from: o */
    private String f3377o = null;

    /* renamed from: p */
    private final Handler f3378p = new Handler();

    /* renamed from: q */
    private boolean f3379q = false;

    /* renamed from: x */
    private View.OnTouchListener f3386x = new ViewOnTouchListenerC0590a();

    /* renamed from: y */
    private View.OnClickListener f3387y = new ViewOnClickListenerC0591b();

    /* renamed from: com.comviva.webaxn.ui.RecorderActivity$a */
    /* loaded from: classes.dex */
    class ViewOnTouchListenerC0590a implements View.OnTouchListener {
        ViewOnTouchListenerC0590a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                RecorderActivity.this.m4044f();
            } else if (motionEvent.getAction() == 1) {
                RecorderActivity.this.m4049h();
                RecorderActivity.this.m4035a("lbcap", false);
            }
            return true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.RecorderActivity$b */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0591b implements View.OnClickListener {
        ViewOnClickListenerC0591b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecorderActivity recorderActivity;
            String str;
            if (view.getId() == 2) {
                RecorderActivity.this.m4049h();
                RecorderActivity.this.f3365c.setMax(RecorderActivity.f3362B);
                RecorderActivity.this.f3373k.setText(RecorderActivity.this.m4030a(RecorderActivity.f3362B, true));
                int unused = RecorderActivity.f3362B = 0;
                RecorderActivity.this.f3371i.setText(RecorderActivity.this.m4030a(RecorderActivity.f3362B, true));
                RecorderActivity.this.f3365c.setProgress(RecorderActivity.f3362B);
                RecorderActivity.this.f3369g.setImageResource(R.drawable.play);
                RecorderActivity.this.f3369g.setId(4);
                RecorderActivity.this.f3368f.setVisibility(0);
                RecorderActivity.this.f3372j.setText("Play...");
                return;
            }
            if (view.getId() == 4) {
                if (TextUtils.isEmpty(RecorderActivity.this.f3376n)) {
                    return;
                }
                RecorderActivity.this.m4041d();
                RecorderActivity.this.f3369g.setImageResource(R.drawable.stop_btn);
                RecorderActivity.this.f3369g.setId(3);
                RecorderActivity.this.f3368f.setVisibility(8);
                return;
            }
            if (view.getId() == 3) {
                RecorderActivity.this.m4046g();
                int unused2 = RecorderActivity.f3362B = 0;
                RecorderActivity.this.f3365c.setProgress(RecorderActivity.f3362B);
                RecorderActivity.this.f3371i.setText(RecorderActivity.this.m4030a(RecorderActivity.f3362B, true));
                RecorderActivity.this.f3369g.setImageResource(R.drawable.play);
                RecorderActivity.this.f3369g.setId(4);
                RecorderActivity.this.f3368f.setVisibility(0);
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
            recorderActivity.m4035a(str, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.RecorderActivity$c */
    /* loaded from: classes.dex */
    public class C0592c implements MediaPlayer.OnCompletionListener {
        C0592c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.release();
                RecorderActivity.this.f3374l = null;
            }
            int unused = RecorderActivity.f3362B = 0;
            RecorderActivity.this.f3365c.setProgress(RecorderActivity.f3362B);
            RecorderActivity.this.f3371i.setText(RecorderActivity.this.m4030a(RecorderActivity.f3362B, true));
            RecorderActivity.this.f3372j.setText("Play...");
            RecorderActivity.this.f3369g.setImageResource(R.drawable.play);
            RecorderActivity.this.f3369g.setId(4);
            RecorderActivity.this.f3368f.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.RecorderActivity$d */
    /* loaded from: classes.dex */
    public class RunnableC0593d implements Runnable {
        RunnableC0593d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecorderActivity.f3362B += 1000;
            RecorderActivity.this.m4054a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.RecorderActivity$e */
    /* loaded from: classes.dex */
    public class RunnableC0594e implements Runnable {
        RunnableC0594e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecorderActivity.f3362B += 1000;
            if (RecorderActivity.f3362B > RecorderActivity.f3361A) {
                int unused = RecorderActivity.f3362B = RecorderActivity.f3361A;
            }
            RecorderActivity.this.m4042e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m4030a(long j, boolean z) {
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
        return j3 == 0 ? z ? String.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j2)) : String.format("-%02d:%02d", Long.valueOf(j4), Long.valueOf(j2)) : z ? String.format("%d:%02d:%02d", Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j2)) : String.format("-%d:%02d:%02d", Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j2));
    }

    /* renamed from: a */
    private String m4032a(String str) {
        StringBuilder sb;
        File file = new File(str);
        if (file.exists()) {
            String str2 = "wav";
            if (TextUtils.isEmpty(this.f3377o)) {
                this.f3377o = "wav";
            }
            if (this.f3377o.equalsIgnoreCase("wav")) {
                sb = new StringBuilder();
            } else {
                str2 = "mp4";
                if (this.f3377o.equalsIgnoreCase("mp4")) {
                    sb = new StringBuilder();
                } else {
                    str2 = "amr";
                    if (this.f3377o.equalsIgnoreCase("amr")) {
                        sb = new StringBuilder();
                    } else {
                        str2 = "3gp";
                        if (this.f3377o.equalsIgnoreCase("3gp")) {
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
    /* renamed from: a */
    public void m4035a(String str, boolean z) {
        if (z) {
            m4049h();
            m4046g();
            f3362B = 0;
        }
        Intent intent = new Intent();
        intent.putExtra("caption", str);
        intent.setData(Uri.fromFile(new File(this.f3376n)));
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m4041d() {
        this.f3374l = null;
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f3374l = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            this.f3374l.setDataSource(this.f3376n);
            this.f3374l.prepare();
            this.f3374l.start();
            m4042e();
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
        }
        this.f3374l.setOnCompletionListener(new C0592c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m4042e() {
        MediaPlayer mediaPlayer = this.f3374l;
        if (mediaPlayer == null || f3362B >= mediaPlayer.getDuration()) {
            return;
        }
        this.f3365c.setProgress(f3362B);
        this.f3372j.setText("Playing...");
        this.f3371i.setText(m4030a(f3362B, true));
        this.f3378p.postDelayed(new RunnableC0594e(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m4044f() {
        if (this.f3379q) {
            return;
        }
        C0672x m5123b = C0672x.m5123b(this.f3377o);
        this.f3375m = m5123b;
        if (m5123b != null) {
            m5123b.m5129a(this.f3376n);
            this.f3375m.m5130b();
            this.f3375m.m5132d();
            this.f3379q = true;
        }
        LottieAnimationView lottieAnimationView = this.f3385w;
        if (lottieAnimationView != null) {
            lottieAnimationView.m3715f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m4046g() {
        MediaPlayer mediaPlayer = this.f3374l;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f3374l.release();
            this.f3374l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m4049h() {
        C0672x c0672x;
        if (!this.f3379q || (c0672x = this.f3375m) == null) {
            return;
        }
        c0672x.m5133e();
        this.f3375m.m5131c();
        this.f3375m = null;
        this.f3379q = false;
        LottieAnimationView lottieAnimationView = this.f3385w;
        if (lottieAnimationView != null) {
            lottieAnimationView.m3714e();
        }
    }

    /* renamed from: a */
    public void m4054a() {
        if (this.f3375m != null) {
            int i = f3362B;
            if (i <= f3361A) {
                this.f3365c.setProgress(i);
                this.f3371i.setText(m4030a(f3362B, true));
                this.f3378p.postDelayed(new RunnableC0593d(), 1000L);
                return;
            }
            m4049h();
            int i2 = f3361A;
            f3362B = i2;
            this.f3373k.setText(m4030a(i2, true));
            f3362B = 0;
            this.f3371i.setText(m4030a(0, true));
            this.f3365c.setProgress(f3362B);
            this.f3369g.setImageResource(R.drawable.play);
            this.f3369g.setId(4);
            this.f3372j.setText("Play...");
            this.f3368f.setVisibility(0);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0755x1.j.f5281a = f3363z;
        C0755x1.j.f5283c = this;
        C0755x1.f5266x = true;
        RecorderData recorderData = (RecorderData) getIntent().getParcelableExtra("recorder_data");
        this.f3380r = recorderData;
        if (recorderData == null) {
            finish();
            return;
        }
        this.f3377o = recorderData.m5263h();
        String m4032a = m4032a(this.f3380r.m5285s());
        this.f3376n = m4032a;
        if (TextUtils.isEmpty(m4032a)) {
            finish();
        }
        if (this.f3380r.m5287t() == 1) {
            setTheme(R.style.DialogTheme);
            requestWindowFeature(1);
            setContentView(R.layout.recorder);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rp_root);
            this.f3366d = relativeLayout;
            relativeLayout.setBackgroundColor(-16777216);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.button_layout);
            this.f3367e = linearLayout;
            linearLayout.setBackgroundColor(-16777216);
            this.f3372j = (TextView) findViewById(R.id.media_title);
            this.f3365c = (ProgressBar) findViewById(R.id.media_progress);
            ImageButton imageButton = (ImageButton) findViewById(R.id.playstop);
            this.f3369g = imageButton;
            imageButton.setId(2);
            this.f3368f = (Button) findViewById(R.id.button_send);
            if (!TextUtils.isEmpty(this.f3380r.m5248a())) {
                this.f3368f.setText(this.f3380r.m5248a());
            }
            this.f3370h = (Button) findViewById(R.id.button_cancel);
            if (!TextUtils.isEmpty(this.f3380r.m5265i())) {
                this.f3370h.setText(this.f3380r.m5265i());
            }
            TextView textView = (TextView) findViewById(R.id.media_duration_start);
            this.f3371i = textView;
            textView.setTextColor(-65536);
            TextView textView2 = (TextView) findViewById(R.id.media_duration_end);
            this.f3373k = textView2;
            textView2.setTextColor(-65536);
            if (!TextUtils.isEmpty(this.f3380r.m5289u())) {
                try {
                    f3361A = Integer.parseInt(this.f3380r.m5289u());
                } catch (NumberFormatException unused) {
                }
            }
            this.f3365c.setMax(f3361A);
            this.f3373k.setText(m4030a(f3361A, true));
            this.f3372j.setText("Recording...");
            this.f3372j.setTextColor(-1);
            this.f3372j.setTextSize(20.0f);
            this.f3369g.setOnClickListener(this.f3387y);
            this.f3368f.setOnClickListener(this.f3387y);
            this.f3370h.setOnClickListener(this.f3387y);
            m4044f();
            m4054a();
            return;
        }
        if (this.f3380r.m5287t() == 2) {
            setContentView(R.layout.custom_recorder);
            TextView textView3 = (TextView) findViewById(R.id.rec_label1);
            if (!TextUtils.isEmpty(this.f3380r.m5251b())) {
                textView3.setVisibility(0);
                textView3.setText(this.f3380r.m5251b());
                if (!TextUtils.isEmpty(this.f3380r.m5255d())) {
                    try {
                        textView3.setTextSize(Float.parseFloat(this.f3380r.m5255d()));
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (!TextUtils.isEmpty(this.f3380r.m5253c())) {
                    textView3.setTypeface(C0747v.m6081a(this.f3380r.m5253c()));
                }
            }
            TextView textView4 = (TextView) findViewById(R.id.rec_label2);
            if (!TextUtils.isEmpty(this.f3380r.m5257e())) {
                textView4.setVisibility(0);
                textView4.setText(this.f3380r.m5257e());
                if (!TextUtils.isEmpty(this.f3380r.m5261g())) {
                    try {
                        textView4.setTextSize(Float.parseFloat(this.f3380r.m5261g()));
                    } catch (NumberFormatException unused3) {
                    }
                }
                if (!TextUtils.isEmpty(this.f3380r.m5259f())) {
                    textView4.setTypeface(C0747v.m6081a(this.f3380r.m5259f()));
                }
            }
            TextView textView5 = (TextView) findViewById(R.id.rstext1);
            this.f3382t = (LinearLayout) findViewById(R.id.status1);
            if (!TextUtils.isEmpty(this.f3380r.m5279p())) {
                this.f3382t.setVisibility(0);
                if (TextUtils.isEmpty(this.f3380r.m5291v())) {
                    this.f3382t.setAlpha(0.5f);
                } else if (this.f3380r.m5291v().equalsIgnoreCase("true")) {
                    this.f3382t.setAlpha(1.0f);
                }
                textView5.setText(this.f3380r.m5279p());
                if (!TextUtils.isEmpty(this.f3380r.m5269k())) {
                    try {
                        textView5.setTextSize(Float.parseFloat(this.f3380r.m5269k()));
                    } catch (NumberFormatException unused4) {
                    }
                }
                if (!TextUtils.isEmpty(this.f3380r.m5267j())) {
                    textView5.setTypeface(C0747v.m6081a(this.f3380r.m5267j()));
                }
            }
            TextView textView6 = (TextView) findViewById(R.id.rstext2);
            this.f3383u = (LinearLayout) findViewById(R.id.status2);
            if (!TextUtils.isEmpty(this.f3380r.m5281q())) {
                this.f3383u.setVisibility(0);
                if (TextUtils.isEmpty(this.f3380r.m5293w())) {
                    this.f3383u.setAlpha(0.5f);
                } else if (this.f3380r.m5293w().equalsIgnoreCase("true")) {
                    this.f3383u.setAlpha(1.0f);
                }
                textView6.setText(this.f3380r.m5281q());
                if (!TextUtils.isEmpty(this.f3380r.m5273m())) {
                    try {
                        textView6.setTextSize(Float.parseFloat(this.f3380r.m5273m()));
                    } catch (NumberFormatException unused5) {
                    }
                }
                if (!TextUtils.isEmpty(this.f3380r.m5271l())) {
                    textView6.setTypeface(C0747v.m6081a(this.f3380r.m5271l()));
                }
            }
            TextView textView7 = (TextView) findViewById(R.id.rstext3);
            this.f3384v = (LinearLayout) findViewById(R.id.status3);
            if (!TextUtils.isEmpty(this.f3380r.m5283r())) {
                this.f3384v.setVisibility(0);
                if (TextUtils.isEmpty(this.f3380r.m5294x())) {
                    this.f3384v.setAlpha(0.5f);
                } else if (this.f3380r.m5294x().equalsIgnoreCase("true")) {
                    this.f3384v.setAlpha(1.0f);
                }
                textView7.setText(this.f3380r.m5283r());
                if (!TextUtils.isEmpty(this.f3380r.m5277o())) {
                    try {
                        textView7.setTextSize(Float.parseFloat(this.f3380r.m5277o()));
                    } catch (NumberFormatException unused6) {
                    }
                }
                if (!TextUtils.isEmpty(this.f3380r.m5275n())) {
                    textView7.setTypeface(C0747v.m6081a(this.f3380r.m5275n()));
                }
            }
            ImageButton imageButton2 = (ImageButton) findViewById(R.id.rec_capture);
            this.f3381s = imageButton2;
            imageButton2.setOnTouchListener(this.f3386x);
            this.f3385w = (LottieAnimationView) findViewById(R.id.rec_image_view);
        }
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
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        m4049h();
        MediaPlayer mediaPlayer = this.f3374l;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f3374l.release();
            this.f3374l = null;
            f3362B = 0;
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
        this.f3364b = true;
        C0755x1.j.f5282b = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (C0755x1.f5263u || (C0713j1.m5563a(this).m5733u0() && this.f3364b)) {
                this.f3364b = false;
                C0755x1.f5263u = false;
                C0713j1.m5563a(this).m5638b(false);
            } else if (C0755x1.f5264v && this.f3364b) {
                this.f3364b = false;
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
