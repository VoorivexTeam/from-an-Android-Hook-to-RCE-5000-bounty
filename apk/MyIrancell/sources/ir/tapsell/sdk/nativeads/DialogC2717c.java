package ir.tapsell.sdk.nativeads;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import ir.tapsell.sdk.models.responseModels.subModels.NativeVideoCreativeModel;
import ir.tapsell.sdk.utils.C2766h;
import ir.tapsell.sdk.utils.C2770l;
import ir.tapsell.sdk.utils.FontManager;
import ir.tapsell.sdk.views.C2785b;
import ir.tapsell.sdk.views.DilatingDotsProgressBar;
import ir.tapsell.sdk.views.DonutProgress;
import p000.e70;
import p000.i50;

/* renamed from: ir.tapsell.sdk.nativeads.c */
/* loaded from: classes.dex */
public class DialogC2717c extends Dialog {

    /* renamed from: b */
    private final e70 f11138b;

    /* renamed from: c */
    private C2785b f11139c;

    /* renamed from: d */
    private DonutProgress f11140d;

    /* renamed from: e */
    private ImageView f11141e;

    /* renamed from: f */
    private Handler f11142f;

    /* renamed from: g */
    private RelativeLayout f11143g;

    /* renamed from: h */
    private boolean f11144h;

    /* renamed from: i */
    private boolean f11145i;

    /* renamed from: j */
    private boolean f11146j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.c$a */
    /* loaded from: classes.dex */
    public class a implements MediaPlayer.OnInfoListener {

        /* renamed from: a */
        final /* synthetic */ DilatingDotsProgressBar f11147a;

        a(DialogC2717c dialogC2717c, DilatingDotsProgressBar dilatingDotsProgressBar) {
            this.f11147a = dilatingDotsProgressBar;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (3 == i) {
                this.f11147a.hideNow();
            }
            if (701 == i) {
                this.f11147a.showNow();
            }
            if (702 != i) {
                return false;
            }
            this.f11147a.hideNow();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.c$b */
    /* loaded from: classes.dex */
    public class b implements C2785b.b {
        b() {
        }

        @Override // ir.tapsell.sdk.views.C2785b.b
        /* renamed from: a */
        public void mo12859a() {
            DialogC2717c.this.f11141e.setImageDrawable(C2766h.f11268b);
        }

        @Override // ir.tapsell.sdk.views.C2785b.b
        /* renamed from: b */
        public void mo12860b() {
            DialogC2717c.this.f11141e.setImageDrawable(C2766h.f11267a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.c$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (DialogC2717c.this.f11139c != null) {
                if (DialogC2717c.this.f11139c.m13261d()) {
                    DialogC2717c.this.f11139c.m13263f();
                } else {
                    DialogC2717c.this.f11139c.m13262e();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.c$d */
    /* loaded from: classes.dex */
    public class d implements MediaPlayer.OnPreparedListener {
        d() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            DialogC2717c.this.f11146j = true;
            DialogC2717c.this.m13015b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.c$e */
    /* loaded from: classes.dex */
    public class e implements MediaPlayer.OnCompletionListener {
        e() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            DialogC2717c.this.f11146j = false;
            DialogC2717c.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.c$f */
    /* loaded from: classes.dex */
    public class f implements MediaPlayer.OnErrorListener {
        f() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            DialogC2717c.this.f11146j = false;
            DialogC2717c.this.dismiss();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.c$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DialogC2717c.this.f11139c.isPlaying() && DialogC2717c.this.f11139c.getDuration() != 0 && DialogC2717c.this.f11139c.getCurrentPosition() < DialogC2717c.this.f11139c.getDuration()) {
                DialogC2717c.this.f11140d.setProgress((int) ((DialogC2717c.this.f11139c.getCurrentPosition() * DialogC2717c.this.f11140d.getMax()) / DialogC2717c.this.f11139c.getDuration()));
                int currentPosition = (DialogC2717c.this.f11139c.getCurrentPosition() * 100) / DialogC2717c.this.f11139c.getDuration();
                if (!DialogC2717c.this.f11145i) {
                    e70 unused = DialogC2717c.this.f11138b;
                }
            }
            if (DialogC2717c.this.f11144h) {
                return;
            }
            DialogC2717c.this.f11142f.postDelayed(this, 400L);
        }
    }

    public DialogC2717c(Context context, e70 e70Var) {
        super(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        this.f11144h = false;
        this.f11145i = false;
        this.f11146j = false;
        this.f11138b = e70Var;
    }

    /* renamed from: c */
    private void m13006c() {
        this.f11142f = new Handler(Looper.getMainLooper());
    }

    /* renamed from: d */
    private void m13007d() {
        ImageView imageView;
        BitmapDrawable bitmapDrawable;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(-16777216);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        this.f11143g = relativeLayout2;
        relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f11143g.setVisibility(4);
        DilatingDotsProgressBar dilatingDotsProgressBar = new DilatingDotsProgressBar(getContext(), null, 0, new DilatingDotsProgressBar.C2782f(null, null, null, null, null, Float.valueOf(C2770l.m13173a(getContext().getResources(), 8.0f)), null, null, null, null, null, null, null, null));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        dilatingDotsProgressBar.setPadding((int) C2770l.m13173a(getContext().getResources(), 8.0f), (int) C2770l.m13173a(getContext().getResources(), 8.0f), (int) C2770l.m13173a(getContext().getResources(), 8.0f), (int) C2770l.m13173a(getContext().getResources(), 8.0f));
        layoutParams.addRule(13);
        dilatingDotsProgressBar.setLayoutParams(layoutParams);
        this.f11139c = new C2785b(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        this.f11139c.setLayoutParams(layoutParams2);
        this.f11139c.setVisibility(0);
        this.f11143g.addView(this.f11139c);
        this.f11143g.addView(dilatingDotsProgressBar);
        dilatingDotsProgressBar.showNow();
        this.f11139c.setOnInfoListener(new a(this, dilatingDotsProgressBar));
        DonutProgress donutProgress = new DonutProgress(getContext(), null, 0, new DonutProgress.C2783a(0, null, 0, -1, Float.valueOf(C2770l.m13175c(getContext().getResources(), 2.0f)), Float.valueOf(C2770l.m13175c(getContext().getResources(), 2.0f)), Float.valueOf(C2770l.m13174b(getContext().getResources(), 12.0f)), -1, null, null, Integer.valueOf(Color.rgb(35, 31, 32))));
        this.f11140d = donutProgress;
        donutProgress.setTypeface(FontManager.FontName.FONT_BKOODAK);
        this.f11140d.setProgress(0);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) C2770l.m13173a(getContext().getResources(), 34.0f), (int) C2770l.m13173a(getContext().getResources(), 34.0f));
        layoutParams3.setMargins((int) C2770l.m13173a(getContext().getResources(), 10.0f), (int) C2770l.m13173a(getContext().getResources(), 10.0f), (int) C2770l.m13173a(getContext().getResources(), 10.0f), (int) C2770l.m13173a(getContext().getResources(), 10.0f));
        layoutParams3.addRule(12);
        layoutParams3.addRule(9);
        this.f11140d.setLayoutParams(layoutParams3);
        this.f11143g.addView(this.f11140d);
        this.f11141e = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) C2770l.m13173a(getContext().getResources(), 34.0f), (int) C2770l.m13173a(getContext().getResources(), 34.0f));
        layoutParams4.addRule(11);
        layoutParams4.addRule(10);
        layoutParams4.setMargins((int) C2770l.m13173a(getContext().getResources(), 12.0f), (int) C2770l.m13173a(getContext().getResources(), 12.0f), (int) C2770l.m13173a(getContext().getResources(), 12.0f), (int) C2770l.m13173a(getContext().getResources(), 12.0f));
        this.f11141e.setLayoutParams(layoutParams4);
        this.f11141e.setPadding(0, 0, 0, 0);
        this.f11141e.setScaleType(ImageView.ScaleType.FIT_XY);
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        int ringerMode = audioManager.getRingerMode();
        if (ringerMode != 0 && ringerMode != 1) {
            if (ringerMode == 2) {
                imageView = this.f11141e;
                bitmapDrawable = C2766h.f11268b;
            }
            this.f11143g.addView(this.f11141e);
            ImageView imageView2 = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) C2770l.m13173a(getContext().getResources(), 34.0f), (int) C2770l.m13173a(getContext().getResources(), 34.0f));
            layoutParams5.addRule(9);
            layoutParams5.addRule(10);
            layoutParams5.setMargins((int) C2770l.m13173a(getContext().getResources(), 8.0f), (int) C2770l.m13173a(getContext().getResources(), 8.0f), (int) C2770l.m13173a(getContext().getResources(), 8.0f), (int) C2770l.m13173a(getContext().getResources(), 8.0f));
            imageView2.setLayoutParams(layoutParams5);
            imageView2.setPadding(0, 0, 0, 0);
            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView2.setImageDrawable(C2766h.f11269c);
            imageView2.setBackgroundColor(0);
            imageView2.setVisibility(0);
            this.f11143g.addView(imageView2);
            relativeLayout.addView(this.f11143g);
            setContentView(relativeLayout);
        }
        imageView = this.f11141e;
        bitmapDrawable = C2766h.f11267a;
        imageView.setImageDrawable(bitmapDrawable);
        this.f11143g.addView(this.f11141e);
        ImageView imageView22 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams52 = new RelativeLayout.LayoutParams((int) C2770l.m13173a(getContext().getResources(), 34.0f), (int) C2770l.m13173a(getContext().getResources(), 34.0f));
        layoutParams52.addRule(9);
        layoutParams52.addRule(10);
        layoutParams52.setMargins((int) C2770l.m13173a(getContext().getResources(), 8.0f), (int) C2770l.m13173a(getContext().getResources(), 8.0f), (int) C2770l.m13173a(getContext().getResources(), 8.0f), (int) C2770l.m13173a(getContext().getResources(), 8.0f));
        imageView22.setLayoutParams(layoutParams52);
        imageView22.setPadding(0, 0, 0, 0);
        imageView22.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView22.setImageDrawable(C2766h.f11269c);
        imageView22.setBackgroundColor(0);
        imageView22.setVisibility(0);
        this.f11143g.addView(imageView22);
        relativeLayout.addView(this.f11143g);
        setContentView(relativeLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private void m13010e() {
        m13011f();
        C2785b c2785b = this.f11139c;
        if (c2785b == null || this.f11138b == null) {
            dismiss();
            return;
        }
        c2785b.setMuteListener(new b());
        this.f11141e.setOnClickListener(new c());
        this.f11139c.setOnPreparedListener(new d());
        this.f11139c.setVideoURI(Uri.parse(((NativeVideoCreativeModel) this.f11138b.getCreative()).getVideoUrl()));
        this.f11139c.setOnCompletionListener(new e());
        this.f11139c.setOnErrorListener(new f());
    }

    /* renamed from: f */
    private void m13011f() {
        DonutProgress donutProgress = this.f11140d;
        if (donutProgress != null) {
            donutProgress.setProgress(0);
        }
        Handler handler = this.f11142f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f11142f.postDelayed(new g(), 400L);
        }
    }

    /* renamed from: a */
    public void m13014a() {
        C2785b c2785b = this.f11139c;
        if (c2785b != null) {
            try {
                c2785b.pause();
            } catch (Exception e2) {
                i50.m12368a(e2.getMessage());
            }
        }
    }

    /* renamed from: b */
    public void m13015b() {
        if (this.f11146j) {
            try {
                this.f11139c.start();
                this.f11139c.m13260c();
                this.f11139c.setOnPreparedListener(null);
                this.f11143g.setVisibility(0);
            } catch (Exception e2) {
                i50.m12368a(e2.getMessage());
            }
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(true);
        m13007d();
        m13006c();
        m13010e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C2785b c2785b;
        if (i == 24 && (c2785b = this.f11139c) != null && c2785b.m13261d()) {
            this.f11139c.m13263f();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
