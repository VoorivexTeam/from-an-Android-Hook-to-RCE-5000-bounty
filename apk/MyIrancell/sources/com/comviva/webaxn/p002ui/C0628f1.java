package com.comviva.webaxn.p002ui;

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

/* renamed from: com.comviva.webaxn.ui.f1 */
/* loaded from: classes.dex */
public class C0628f1 extends FrameLayout {

    /* renamed from: b */
    private f f3670b;

    /* renamed from: c */
    private Context f3671c;

    /* renamed from: d */
    private ViewGroup f3672d;

    /* renamed from: e */
    private View f3673e;

    /* renamed from: f */
    private SeekBar f3674f;

    /* renamed from: g */
    private TextView f3675g;

    /* renamed from: h */
    private TextView f3676h;

    /* renamed from: i */
    private boolean f3677i;

    /* renamed from: j */
    private boolean f3678j;

    /* renamed from: k */
    private View.OnClickListener f3679k;

    /* renamed from: l */
    private View.OnClickListener f3680l;

    /* renamed from: m */
    StringBuilder f3681m;

    /* renamed from: n */
    Formatter f3682n;

    /* renamed from: o */
    private ImageButton f3683o;

    /* renamed from: p */
    private ImageButton f3684p;

    /* renamed from: q */
    private ImageButton f3685q;

    /* renamed from: r */
    private ImageButton f3686r;

    /* renamed from: s */
    private ImageButton f3687s;

    /* renamed from: t */
    private Handler f3688t;

    /* renamed from: u */
    private View.OnClickListener f3689u;

    /* renamed from: v */
    private SeekBar.OnSeekBarChangeListener f3690v;

    /* renamed from: com.comviva.webaxn.ui.f1$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0628f1.this.m4340g();
            C0628f1.this.m4346a(3000);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.f1$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0628f1.this.m4341h();
            C0628f1.this.m4346a(3000);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.f1$c */
    /* loaded from: classes.dex */
    class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (C0628f1.this.f3670b != null && z) {
                int duration = (int) ((C0628f1.this.f3670b.getDuration() * i) / 1000);
                C0628f1.this.f3670b.seekTo(duration);
                if (C0628f1.this.f3676h != null) {
                    C0628f1.this.f3676h.setText(C0628f1.this.m4332b(duration));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            C0628f1.this.m4346a(3600000);
            C0628f1.this.f3678j = true;
            C0628f1.this.f3688t.removeMessages(2);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            C0628f1.this.f3678j = false;
            C0628f1.this.m4344j();
            C0628f1.this.m4351e();
            C0628f1.this.m4346a(3000);
            C0628f1.this.f3688t.sendEmptyMessage(2);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.f1$d */
    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0628f1.this.f3670b == null) {
                return;
            }
            C0628f1.this.f3670b.seekTo(C0628f1.this.f3670b.getCurrentPosition() - 5000);
            C0628f1.this.m4344j();
            C0628f1.this.m4346a(3000);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.f1$e */
    /* loaded from: classes.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0628f1.this.f3670b == null) {
                return;
            }
            C0628f1.this.f3670b.seekTo(C0628f1.this.f3670b.getCurrentPosition() + 15000);
            C0628f1.this.m4344j();
            C0628f1.this.m4346a(3000);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.f1$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo4352a();

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

    /* renamed from: com.comviva.webaxn.ui.f1$g */
    /* loaded from: classes.dex */
    private static class g extends Handler {

        /* renamed from: a */
        private final WeakReference<C0628f1> f3696a;

        g(C0628f1 c0628f1) {
            this.f3696a = new WeakReference<>(c0628f1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C0628f1 c0628f1 = this.f3696a.get();
            if (c0628f1 == null || c0628f1.f3670b == null) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                c0628f1.m4345a();
                return;
            }
            if (i != 2) {
                return;
            }
            int m4344j = c0628f1.m4344j();
            if (!c0628f1.f3678j && c0628f1.f3677i && c0628f1.f3670b.isPlaying()) {
                sendMessageDelayed(obtainMessage(2), 1000 - (m4344j % 1000));
            }
        }
    }

    public C0628f1(Context context) {
        this(context, true);
    }

    public C0628f1(Context context, boolean z) {
        super(context);
        this.f3688t = new g(this);
        this.f3689u = new a();
        new b();
        this.f3690v = new c();
        new d();
        new e();
        this.f3671c = context;
    }

    /* renamed from: a */
    private void m4329a(View view) {
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.pause);
        this.f3683o = imageButton;
        if (imageButton != null) {
            imageButton.requestFocus();
            this.f3683o.setOnClickListener(this.f3689u);
        }
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.mediacontroller_progress);
        this.f3674f = seekBar;
        if (seekBar != null) {
            if (seekBar instanceof SeekBar) {
                seekBar.setOnSeekBarChangeListener(this.f3690v);
            }
            this.f3674f.setMax(1000);
        }
        this.f3675g = (TextView) view.findViewById(R.id.time);
        this.f3676h = (TextView) view.findViewById(R.id.time_current);
        this.f3681m = new StringBuilder();
        this.f3682n = new Formatter(this.f3681m, Locale.getDefault());
        m4343i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public String m4332b(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        this.f3681m.setLength(0);
        return (i5 > 0 ? this.f3682n.format("%d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)) : this.f3682n.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3))).toString();
    }

    /* renamed from: f */
    private void m4338f() {
        f fVar = this.f3670b;
        if (fVar == null) {
            return;
        }
        try {
            if (this.f3683o != null && !fVar.canPause()) {
                this.f3683o.setEnabled(false);
            }
            if (this.f3685q != null && !this.f3670b.canSeekBackward()) {
                this.f3685q.setEnabled(false);
            }
            if (this.f3684p == null || this.f3670b.canSeekForward()) {
                return;
            }
            this.f3684p.setEnabled(false);
        } catch (IncompatibleClassChangeError unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m4340g() {
        f fVar = this.f3670b;
        if (fVar == null) {
            return;
        }
        if (fVar.isPlaying()) {
            this.f3670b.pause();
        } else {
            this.f3670b.start();
        }
        m4351e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m4341h() {
        f fVar = this.f3670b;
        if (fVar == null) {
            return;
        }
        fVar.mo4352a();
    }

    /* renamed from: i */
    private void m4343i() {
        ImageButton imageButton = this.f3686r;
        if (imageButton != null) {
            imageButton.setOnClickListener(this.f3679k);
            this.f3686r.setEnabled(this.f3679k != null);
        }
        ImageButton imageButton2 = this.f3687s;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(this.f3680l);
            this.f3687s.setEnabled(this.f3680l != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public int m4344j() {
        f fVar = this.f3670b;
        if (fVar == null || this.f3678j) {
            return 0;
        }
        int currentPosition = fVar.getCurrentPosition();
        int duration = this.f3670b.getDuration();
        SeekBar seekBar = this.f3674f;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((currentPosition * 1000) / duration));
            }
            this.f3674f.setSecondaryProgress(this.f3670b.getBufferPercentage() * 10);
        }
        TextView textView = this.f3675g;
        if (textView != null) {
            textView.setText(m4332b(duration));
        }
        TextView textView2 = this.f3676h;
        if (textView2 != null) {
            textView2.setText(m4332b(currentPosition));
        }
        return currentPosition;
    }

    /* renamed from: a */
    public void m4345a() {
        ViewGroup viewGroup = this.f3672d;
        if (viewGroup == null) {
            return;
        }
        try {
            viewGroup.removeView(this);
            this.f3688t.removeMessages(2);
        } catch (IllegalArgumentException unused) {
        }
        this.f3677i = false;
    }

    /* renamed from: a */
    public void m4346a(int i) {
        if (!this.f3677i && this.f3672d != null) {
            m4344j();
            ImageButton imageButton = this.f3683o;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            m4338f();
            this.f3672d.addView(this, new FrameLayout.LayoutParams(-1, -2, 80));
            this.f3677i = true;
        }
        m4351e();
        m4350d();
        if (i != -1) {
            this.f3688t.sendEmptyMessage(2);
            Message obtainMessage = this.f3688t.obtainMessage(1);
            if (i != 0) {
                this.f3688t.removeMessages(1);
                this.f3688t.sendMessageDelayed(obtainMessage, i);
            }
        }
    }

    /* renamed from: a */
    public void m4347a(boolean z) {
        m4346a(z ? -1 : 3000);
    }

    /* renamed from: b */
    protected View m4348b() {
        View inflate = ((LayoutInflater) this.f3671c.getSystemService("layout_inflater")).inflate(R.layout.media_controller, (ViewGroup) null);
        this.f3673e = inflate;
        m4329a(inflate);
        return this.f3673e;
    }

    /* renamed from: c */
    public void m4349c() {
        Handler handler = this.f3688t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.f3672d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f3672d = null;
        }
        if (this.f3670b != null) {
            this.f3670b = null;
        }
    }

    /* renamed from: d */
    public void m4350d() {
        if (this.f3673e == null || this.f3670b == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f3670b == null) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0;
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z) {
                m4340g();
                m4346a(3000);
                ImageButton imageButton = this.f3683o;
                if (imageButton != null) {
                    imageButton.requestFocus();
                }
            }
            return true;
        }
        if (keyCode == 126) {
            if (z && !this.f3670b.isPlaying()) {
                this.f3670b.start();
                m4351e();
                m4346a(3000);
            }
            return true;
        }
        if (keyCode == 86 || keyCode == 127) {
            if (z && this.f3670b.isPlaying()) {
                this.f3670b.pause();
                m4351e();
                m4346a(3000);
            }
            return true;
        }
        if (keyCode == 25 || keyCode == 24 || keyCode == 164) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyCode != 4 && keyCode != 82) {
            m4346a(3000);
            return super.dispatchKeyEvent(keyEvent);
        }
        if (z) {
            m4345a();
        }
        return true;
    }

    /* renamed from: e */
    public void m4351e() {
        f fVar;
        ImageButton imageButton;
        int i;
        if (this.f3673e == null || this.f3683o == null || (fVar = this.f3670b) == null) {
            return;
        }
        if (fVar.isPlaying()) {
            imageButton = this.f3683o;
            i = R.drawable.ic_media_pause;
        } else {
            imageButton = this.f3683o;
            i = R.drawable.ic_media_play;
        }
        imageButton.setImageResource(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View view = this.f3673e;
        if (view != null) {
            m4329a(view);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0628f1.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0628f1.class.getName());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m4346a(3000);
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        m4346a(3000);
        return false;
    }

    public void setAnchorView(ViewGroup viewGroup) {
        this.f3672d = viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        removeAllViews();
        addView(m4348b(), layoutParams);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        ImageButton imageButton = this.f3683o;
        if (imageButton != null) {
            imageButton.setEnabled(z);
        }
        ImageButton imageButton2 = this.f3684p;
        if (imageButton2 != null) {
            imageButton2.setEnabled(z);
        }
        ImageButton imageButton3 = this.f3685q;
        if (imageButton3 != null) {
            imageButton3.setEnabled(z);
        }
        ImageButton imageButton4 = this.f3686r;
        if (imageButton4 != null) {
            imageButton4.setEnabled(z && this.f3679k != null);
        }
        ImageButton imageButton5 = this.f3687s;
        if (imageButton5 != null) {
            imageButton5.setEnabled(z && this.f3680l != null);
        }
        SeekBar seekBar = this.f3674f;
        if (seekBar != null) {
            seekBar.setEnabled(z);
        }
        m4338f();
        super.setEnabled(z);
    }

    public void setMediaPlayer(f fVar) {
        this.f3670b = fVar;
        m4351e();
        m4350d();
    }
}
