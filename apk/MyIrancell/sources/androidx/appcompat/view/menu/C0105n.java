package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.R$dimen;
import androidx.appcompat.view.menu.InterfaceC0106o;
import p000.C0447b2;
import p000.C3107q2;

/* renamed from: androidx.appcompat.view.menu.n */
/* loaded from: classes.dex */
public class C0105n {

    /* renamed from: a */
    private final Context f667a;

    /* renamed from: b */
    private final C0099h f668b;

    /* renamed from: c */
    private final boolean f669c;

    /* renamed from: d */
    private final int f670d;

    /* renamed from: e */
    private final int f671e;

    /* renamed from: f */
    private View f672f;

    /* renamed from: g */
    private int f673g;

    /* renamed from: h */
    private boolean f674h;

    /* renamed from: i */
    private InterfaceC0106o.a f675i;

    /* renamed from: j */
    private AbstractC0104m f676j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f677k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f678l;

    /* renamed from: androidx.appcompat.view.menu.n$a */
    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0105n.this.mo728d();
        }
    }

    public C0105n(Context context, C0099h c0099h, View view, boolean z, int i) {
        this(context, c0099h, view, z, i, 0);
    }

    public C0105n(Context context, C0099h c0099h, View view, boolean z, int i, int i2) {
        this.f673g = 8388611;
        this.f678l = new a();
        this.f667a = context;
        this.f668b = c0099h;
        this.f672f = view;
        this.f669c = z;
        this.f670d = i;
        this.f671e = i2;
    }

    /* renamed from: a */
    private void m717a(int i, int i2, boolean z, boolean z2) {
        AbstractC0104m m726b = m726b();
        m726b.mo613c(z2);
        if (z) {
            if ((C0447b2.m3270a(this.f673g, C3107q2.m14919k(this.f672f)) & 7) == 5) {
                i -= this.f672f.getWidth();
            }
            m726b.mo610b(i);
            m726b.mo612c(i2);
            int i3 = (int) ((this.f667a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m726b.m715a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        m726b.mo604a();
    }

    /* renamed from: g */
    private AbstractC0104m m718g() {
        Display defaultDisplay = ((WindowManager) this.f667a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        AbstractC0104m viewOnKeyListenerC0096e = Math.min(point.x, point.y) >= this.f667a.getResources().getDimensionPixelSize(R$dimen.abc_cascading_menus_min_smallest_width) ? new ViewOnKeyListenerC0096e(this.f667a, this.f672f, this.f670d, this.f671e, this.f669c) : new ViewOnKeyListenerC0111t(this.f667a, this.f668b, this.f672f, this.f670d, this.f671e, this.f669c);
        viewOnKeyListenerC0096e.mo608a(this.f668b);
        viewOnKeyListenerC0096e.mo607a(this.f678l);
        viewOnKeyListenerC0096e.mo606a(this.f672f);
        viewOnKeyListenerC0096e.mo584a(this.f675i);
        viewOnKeyListenerC0096e.mo611b(this.f674h);
        viewOnKeyListenerC0096e.mo605a(this.f673g);
        return viewOnKeyListenerC0096e;
    }

    /* renamed from: a */
    public void m719a() {
        if (m727c()) {
            this.f676j.dismiss();
        }
    }

    /* renamed from: a */
    public void m720a(int i) {
        this.f673g = i;
    }

    /* renamed from: a */
    public void m721a(View view) {
        this.f672f = view;
    }

    /* renamed from: a */
    public void m722a(PopupWindow.OnDismissListener onDismissListener) {
        this.f677k = onDismissListener;
    }

    /* renamed from: a */
    public void m723a(InterfaceC0106o.a aVar) {
        this.f675i = aVar;
        AbstractC0104m abstractC0104m = this.f676j;
        if (abstractC0104m != null) {
            abstractC0104m.mo584a(aVar);
        }
    }

    /* renamed from: a */
    public void m724a(boolean z) {
        this.f674h = z;
        AbstractC0104m abstractC0104m = this.f676j;
        if (abstractC0104m != null) {
            abstractC0104m.mo611b(z);
        }
    }

    /* renamed from: a */
    public boolean m725a(int i, int i2) {
        if (m727c()) {
            return true;
        }
        if (this.f672f == null) {
            return false;
        }
        m717a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public AbstractC0104m m726b() {
        if (this.f676j == null) {
            this.f676j = m718g();
        }
        return this.f676j;
    }

    /* renamed from: c */
    public boolean m727c() {
        AbstractC0104m abstractC0104m = this.f676j;
        return abstractC0104m != null && abstractC0104m.mo615d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo728d() {
        this.f676j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f677k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void m729e() {
        if (!m730f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean m730f() {
        if (m727c()) {
            return true;
        }
        if (this.f672f == null) {
            return false;
        }
        m717a(0, 0, false, false);
        return true;
    }
}
