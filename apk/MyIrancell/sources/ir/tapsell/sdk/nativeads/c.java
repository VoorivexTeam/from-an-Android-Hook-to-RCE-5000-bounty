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
import defpackage.e70;
import defpackage.i50;
import ir.tapsell.sdk.models.responseModels.subModels.NativeVideoCreativeModel;
import ir.tapsell.sdk.utils.FontManager;
import ir.tapsell.sdk.utils.h;
import ir.tapsell.sdk.utils.l;
import ir.tapsell.sdk.views.DilatingDotsProgressBar;
import ir.tapsell.sdk.views.DonutProgress;
import ir.tapsell.sdk.views.b;

/* loaded from: classes.dex */
public class c extends Dialog {
    private final e70 b;
    private ir.tapsell.sdk.views.b c;
    private DonutProgress d;
    private ImageView e;
    private Handler f;
    private RelativeLayout g;
    private boolean h;
    private boolean i;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements MediaPlayer.OnInfoListener {
        final /* synthetic */ DilatingDotsProgressBar a;

        a(c cVar, DilatingDotsProgressBar dilatingDotsProgressBar) {
            this.a = dilatingDotsProgressBar;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (3 == i) {
                this.a.hideNow();
            }
            if (701 == i) {
                this.a.showNow();
            }
            if (702 != i) {
                return false;
            }
            this.a.hideNow();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0075b {
        b() {
        }

        @Override // ir.tapsell.sdk.views.b.InterfaceC0075b
        public void a() {
            c.this.e.setImageDrawable(h.b);
        }

        @Override // ir.tapsell.sdk.views.b.InterfaceC0075b
        public void b() {
            c.this.e.setImageDrawable(h.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0069c implements View.OnClickListener {
        ViewOnClickListenerC0069c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.c != null) {
                if (c.this.c.d()) {
                    c.this.c.f();
                } else {
                    c.this.c.e();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements MediaPlayer.OnPreparedListener {
        d() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            c.this.j = true;
            c.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements MediaPlayer.OnCompletionListener {
        e() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            c.this.j = false;
            c.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements MediaPlayer.OnErrorListener {
        f() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            c.this.j = false;
            c.this.dismiss();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.c.isPlaying() && c.this.c.getDuration() != 0 && c.this.c.getCurrentPosition() < c.this.c.getDuration()) {
                c.this.d.setProgress((int) ((c.this.c.getCurrentPosition() * c.this.d.getMax()) / c.this.c.getDuration()));
                int currentPosition = (c.this.c.getCurrentPosition() * 100) / c.this.c.getDuration();
                if (!c.this.i) {
                    e70 unused = c.this.b;
                }
            }
            if (c.this.h) {
                return;
            }
            c.this.f.postDelayed(this, 400L);
        }
    }

    public c(Context context, e70 e70Var) {
        super(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        this.h = false;
        this.i = false;
        this.j = false;
        this.b = e70Var;
    }

    private void c() {
        this.f = new Handler(Looper.getMainLooper());
    }

    private void d() {
        ImageView imageView;
        BitmapDrawable bitmapDrawable;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(-16777216);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        this.g = relativeLayout2;
        relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.g.setVisibility(4);
        DilatingDotsProgressBar dilatingDotsProgressBar = new DilatingDotsProgressBar(getContext(), null, 0, new DilatingDotsProgressBar.f(null, null, null, null, null, Float.valueOf(l.a(getContext().getResources(), 8.0f)), null, null, null, null, null, null, null, null));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        dilatingDotsProgressBar.setPadding((int) l.a(getContext().getResources(), 8.0f), (int) l.a(getContext().getResources(), 8.0f), (int) l.a(getContext().getResources(), 8.0f), (int) l.a(getContext().getResources(), 8.0f));
        layoutParams.addRule(13);
        dilatingDotsProgressBar.setLayoutParams(layoutParams);
        this.c = new ir.tapsell.sdk.views.b(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        this.c.setLayoutParams(layoutParams2);
        this.c.setVisibility(0);
        this.g.addView(this.c);
        this.g.addView(dilatingDotsProgressBar);
        dilatingDotsProgressBar.showNow();
        this.c.setOnInfoListener(new a(this, dilatingDotsProgressBar));
        DonutProgress donutProgress = new DonutProgress(getContext(), null, 0, new DonutProgress.a(0, null, 0, -1, Float.valueOf(l.c(getContext().getResources(), 2.0f)), Float.valueOf(l.c(getContext().getResources(), 2.0f)), Float.valueOf(l.b(getContext().getResources(), 12.0f)), -1, null, null, Integer.valueOf(Color.rgb(35, 31, 32))));
        this.d = donutProgress;
        donutProgress.setTypeface(FontManager.FontName.FONT_BKOODAK);
        this.d.setProgress(0);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) l.a(getContext().getResources(), 34.0f), (int) l.a(getContext().getResources(), 34.0f));
        layoutParams3.setMargins((int) l.a(getContext().getResources(), 10.0f), (int) l.a(getContext().getResources(), 10.0f), (int) l.a(getContext().getResources(), 10.0f), (int) l.a(getContext().getResources(), 10.0f));
        layoutParams3.addRule(12);
        layoutParams3.addRule(9);
        this.d.setLayoutParams(layoutParams3);
        this.g.addView(this.d);
        this.e = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) l.a(getContext().getResources(), 34.0f), (int) l.a(getContext().getResources(), 34.0f));
        layoutParams4.addRule(11);
        layoutParams4.addRule(10);
        layoutParams4.setMargins((int) l.a(getContext().getResources(), 12.0f), (int) l.a(getContext().getResources(), 12.0f), (int) l.a(getContext().getResources(), 12.0f), (int) l.a(getContext().getResources(), 12.0f));
        this.e.setLayoutParams(layoutParams4);
        this.e.setPadding(0, 0, 0, 0);
        this.e.setScaleType(ImageView.ScaleType.FIT_XY);
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        int ringerMode = audioManager.getRingerMode();
        if (ringerMode != 0 && ringerMode != 1) {
            if (ringerMode == 2) {
                imageView = this.e;
                bitmapDrawable = h.b;
            }
            this.g.addView(this.e);
            ImageView imageView2 = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) l.a(getContext().getResources(), 34.0f), (int) l.a(getContext().getResources(), 34.0f));
            layoutParams5.addRule(9);
            layoutParams5.addRule(10);
            layoutParams5.setMargins((int) l.a(getContext().getResources(), 8.0f), (int) l.a(getContext().getResources(), 8.0f), (int) l.a(getContext().getResources(), 8.0f), (int) l.a(getContext().getResources(), 8.0f));
            imageView2.setLayoutParams(layoutParams5);
            imageView2.setPadding(0, 0, 0, 0);
            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView2.setImageDrawable(h.c);
            imageView2.setBackgroundColor(0);
            imageView2.setVisibility(0);
            this.g.addView(imageView2);
            relativeLayout.addView(this.g);
            setContentView(relativeLayout);
        }
        imageView = this.e;
        bitmapDrawable = h.a;
        imageView.setImageDrawable(bitmapDrawable);
        this.g.addView(this.e);
        ImageView imageView22 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams52 = new RelativeLayout.LayoutParams((int) l.a(getContext().getResources(), 34.0f), (int) l.a(getContext().getResources(), 34.0f));
        layoutParams52.addRule(9);
        layoutParams52.addRule(10);
        layoutParams52.setMargins((int) l.a(getContext().getResources(), 8.0f), (int) l.a(getContext().getResources(), 8.0f), (int) l.a(getContext().getResources(), 8.0f), (int) l.a(getContext().getResources(), 8.0f));
        imageView22.setLayoutParams(layoutParams52);
        imageView22.setPadding(0, 0, 0, 0);
        imageView22.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView22.setImageDrawable(h.c);
        imageView22.setBackgroundColor(0);
        imageView22.setVisibility(0);
        this.g.addView(imageView22);
        relativeLayout.addView(this.g);
        setContentView(relativeLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e() {
        f();
        ir.tapsell.sdk.views.b bVar = this.c;
        if (bVar == null || this.b == null) {
            dismiss();
            return;
        }
        bVar.setMuteListener(new b());
        this.e.setOnClickListener(new ViewOnClickListenerC0069c());
        this.c.setOnPreparedListener(new d());
        this.c.setVideoURI(Uri.parse(((NativeVideoCreativeModel) this.b.getCreative()).getVideoUrl()));
        this.c.setOnCompletionListener(new e());
        this.c.setOnErrorListener(new f());
    }

    private void f() {
        DonutProgress donutProgress = this.d;
        if (donutProgress != null) {
            donutProgress.setProgress(0);
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f.postDelayed(new g(), 400L);
        }
    }

    public void a() {
        ir.tapsell.sdk.views.b bVar = this.c;
        if (bVar != null) {
            try {
                bVar.pause();
            } catch (Exception e2) {
                i50.a(e2.getMessage());
            }
        }
    }

    public void b() {
        if (this.j) {
            try {
                this.c.start();
                this.c.c();
                this.c.setOnPreparedListener(null);
                this.g.setVisibility(0);
            } catch (Exception e2) {
                i50.a(e2.getMessage());
            }
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(true);
        d();
        c();
        e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ir.tapsell.sdk.views.b bVar;
        if (i == 24 && (bVar = this.c) != null && bVar.d()) {
            this.c.f();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
