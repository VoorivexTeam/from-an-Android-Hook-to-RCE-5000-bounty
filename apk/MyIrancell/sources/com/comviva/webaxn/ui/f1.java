package com.comviva.webaxn.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.mtni.myirancell.R;
import java.lang.ref.WeakReference;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes.dex */
public class f1 extends FrameLayout {
    private f b;
    private Context c;
    private ViewGroup d;
    private View e;
    private SeekBar f;
    private TextView g;
    private TextView h;
    private boolean i;
    private boolean j;
    private View.OnClickListener k;
    private View.OnClickListener l;
    StringBuilder m;
    Formatter n;
    private ImageButton o;
    private ImageButton p;
    private ImageButton q;
    private ImageButton r;
    private ImageButton s;
    private Handler t;
    private View.OnClickListener u;
    private SeekBar.OnSeekBarChangeListener v;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f1.this.g();
            f1.this.a(3000);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f1.this.h();
            f1.this.a(3000);
        }
    }

    /* loaded from: classes.dex */
    class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (f1.this.b != null && z) {
                int duration = (int) ((f1.this.b.getDuration() * i) / 1000);
                f1.this.b.seekTo(duration);
                if (f1.this.h != null) {
                    f1.this.h.setText(f1.this.b(duration));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            f1.this.a(3600000);
            f1.this.j = true;
            f1.this.t.removeMessages(2);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            f1.this.j = false;
            f1.this.j();
            f1.this.e();
            f1.this.a(3000);
            f1.this.t.sendEmptyMessage(2);
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (f1.this.b == null) {
                return;
            }
            f1.this.b.seekTo(f1.this.b.getCurrentPosition() - 5000);
            f1.this.j();
            f1.this.a(3000);
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (f1.this.b == null) {
                return;
            }
            f1.this.b.seekTo(f1.this.b.getCurrentPosition() + 15000);
            f1.this.j();
            f1.this.a(3000);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        boolean canPause();

        boolean canSeekBackward();

        boolean canSeekForward();

        int getBufferPercentage();

        int getCurrentPosition();

        int getDuration();

        boolean isPlaying();

        void pause();

        void seekTo(int i);

        void start();
    }

    /* loaded from: classes.dex */
    private static class g extends Handler {
        private final WeakReference<f1> a;

        g(f1 f1Var) {
            this.a = new WeakReference<>(f1Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            f1 f1Var = this.a.get();
            if (f1Var == null || f1Var.b == null) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                f1Var.a();
                return;
            }
            if (i != 2) {
                return;
            }
            int j = f1Var.j();
            if (!f1Var.j && f1Var.i && f1Var.b.isPlaying()) {
                sendMessageDelayed(obtainMessage(2), 1000 - (j % 1000));
            }
        }
    }

    public f1(Context context) {
        this(context, true);
    }

    public f1(Context context, boolean z) {
        super(context);
        this.t = new g(this);
        this.u = new a();
        new b();
        this.v = new c();
        new d();
        new e();
        this.c = context;
    }

    private void a(View view) {
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.pause);
        this.o = imageButton;
        if (imageButton != null) {
            imageButton.requestFocus();
            this.o.setOnClickListener(this.u);
        }
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.mediacontroller_progress);
        this.f = seekBar;
        if (seekBar != null) {
            if (seekBar instanceof SeekBar) {
                seekBar.setOnSeekBarChangeListener(this.v);
            }
            this.f.setMax(1000);
        }
        this.g = (TextView) view.findViewById(R.id.time);
        this.h = (TextView) view.findViewById(R.id.time_current);
        this.m = new StringBuilder();
        this.n = new Formatter(this.m, Locale.getDefault());
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        this.m.setLength(0);
        return (i5 > 0 ? this.n.format("%d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)) : this.n.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3))).toString();
    }

    private void f() {
        f fVar = this.b;
        if (fVar == null) {
            return;
        }
        try {
            if (this.o != null && !fVar.canPause()) {
                this.o.setEnabled(false);
            }
            if (this.q != null && !this.b.canSeekBackward()) {
                this.q.setEnabled(false);
            }
            if (this.p == null || this.b.canSeekForward()) {
                return;
            }
            this.p.setEnabled(false);
        } catch (IncompatibleClassChangeError unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        f fVar = this.b;
        if (fVar == null) {
            return;
        }
        if (fVar.isPlaying()) {
            this.b.pause();
        } else {
            this.b.start();
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        f fVar = this.b;
        if (fVar == null) {
            return;
        }
        fVar.a();
    }

    private void i() {
        ImageButton imageButton = this.r;
        if (imageButton != null) {
            imageButton.setOnClickListener(this.k);
            this.r.setEnabled(this.k != null);
        }
        ImageButton imageButton2 = this.s;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(this.l);
            this.s.setEnabled(this.l != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int j() {
        f fVar = this.b;
        if (fVar == null || this.j) {
            return 0;
        }
        int currentPosition = fVar.getCurrentPosition();
        int duration = this.b.getDuration();
        SeekBar seekBar = this.f;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((currentPosition * 1000) / duration));
            }
            this.f.setSecondaryProgress(this.b.getBufferPercentage() * 10);
        }
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(b(duration));
        }
        TextView textView2 = this.h;
        if (textView2 != null) {
            textView2.setText(b(currentPosition));
        }
        return currentPosition;
    }

    public void a() {
        ViewGroup viewGroup = this.d;
        if (viewGroup == null) {
            return;
        }
        try {
            viewGroup.removeView(this);
            this.t.removeMessages(2);
        } catch (IllegalArgumentException unused) {
        }
        this.i = false;
    }

    public void a(int i) {
        if (!this.i && this.d != null) {
            j();
            ImageButton imageButton = this.o;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            f();
            this.d.addView(this, new FrameLayout.LayoutParams(-1, -2, 80));
            this.i = true;
        }
        e();
        d();
        if (i != -1) {
            this.t.sendEmptyMessage(2);
            Message obtainMessage = this.t.obtainMessage(1);
            if (i != 0) {
                this.t.removeMessages(1);
                this.t.sendMessageDelayed(obtainMessage, i);
            }
        }
    }

    public void a(boolean z) {
        a(z ? -1 : 3000);
    }

    protected View b() {
        View inflate = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.media_controller, (ViewGroup) null);
        this.e = inflate;
        a(inflate);
        return this.e;
    }

    public void c() {
        Handler handler = this.t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.d = null;
        }
        if (this.b != null) {
            this.b = null;
        }
    }

    public void d() {
        if (this.e == null || this.b == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.b == null) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0;
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z) {
                g();
                a(3000);
                ImageButton imageButton = this.o;
                if (imageButton != null) {
                    imageButton.requestFocus();
                }
            }
            return true;
        }
        if (keyCode == 126) {
            if (z && !this.b.isPlaying()) {
                this.b.start();
                e();
                a(3000);
            }
            return true;
        }
        if (keyCode == 86 || keyCode == 127) {
            if (z && this.b.isPlaying()) {
                this.b.pause();
                e();
                a(3000);
            }
            return true;
        }
        if (keyCode == 25 || keyCode == 24 || keyCode == 164) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyCode != 4 && keyCode != 82) {
            a(3000);
            return super.dispatchKeyEvent(keyEvent);
        }
        if (z) {
            a();
        }
        return true;
    }

    public void e() {
        f fVar;
        ImageButton imageButton;
        int i;
        if (this.e == null || this.o == null || (fVar = this.b) == null) {
            return;
        }
        if (fVar.isPlaying()) {
            imageButton = this.o;
            i = R.drawable.ic_media_pause;
        } else {
            imageButton = this.o;
            i = R.drawable.ic_media_play;
        }
        imageButton.setImageResource(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View view = this.e;
        if (view != null) {
            a(view);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f1.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f1.class.getName());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a(3000);
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        a(3000);
        return false;
    }

    public void setAnchorView(ViewGroup viewGroup) {
        this.d = viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        removeAllViews();
        addView(b(), layoutParams);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        ImageButton imageButton = this.o;
        if (imageButton != null) {
            imageButton.setEnabled(z);
        }
        ImageButton imageButton2 = this.p;
        if (imageButton2 != null) {
            imageButton2.setEnabled(z);
        }
        ImageButton imageButton3 = this.q;
        if (imageButton3 != null) {
            imageButton3.setEnabled(z);
        }
        ImageButton imageButton4 = this.r;
        if (imageButton4 != null) {
            imageButton4.setEnabled(z && this.k != null);
        }
        ImageButton imageButton5 = this.s;
        if (imageButton5 != null) {
            imageButton5.setEnabled(z && this.l != null);
        }
        SeekBar seekBar = this.f;
        if (seekBar != null) {
            seekBar.setEnabled(z);
        }
        f();
        super.setEnabled(z);
    }

    public void setMediaPlayer(f fVar) {
        this.b = fVar;
        e();
        d();
    }
}
