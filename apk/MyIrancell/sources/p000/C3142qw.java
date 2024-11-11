package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import java.io.IOException;

/* renamed from: qw */
/* loaded from: classes.dex */
public final class C3142qw {

    /* renamed from: m */
    private static final float[] f12830m = {0.8f, 0.4f};

    /* renamed from: n */
    private static final float[] f12831n = {0.7f, 0.3f};

    /* renamed from: a */
    private final Context f12832a;

    /* renamed from: b */
    private final C3061ow f12833b;

    /* renamed from: c */
    private C3321uw f12834c;

    /* renamed from: d */
    private C3004nw f12835d;

    /* renamed from: e */
    private Rect f12836e;

    /* renamed from: f */
    private Rect f12837f;

    /* renamed from: g */
    private boolean f12838g;

    /* renamed from: h */
    private boolean f12839h;

    /* renamed from: i */
    private int f12840i = -1;

    /* renamed from: j */
    private int f12841j;

    /* renamed from: k */
    private int f12842k;

    /* renamed from: l */
    private final C3225sw f12843l;

    public C3142qw(Context context) {
        this.f12832a = context;
        this.f12833b = new C3061ow(context);
        this.f12843l = new C3225sw(this.f12833b);
    }

    /* renamed from: a */
    private static int m15135a(int i, int i2, int i3) {
        int i4 = (i * 5) / 8;
        return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
    }

    /* renamed from: a */
    public C0495bw m15136a(byte[] bArr, int i, int i2) {
        Rect m15145c = m15145c();
        if (m15145c == null) {
            return null;
        }
        return new C0495bw(bArr, i, i2, m15145c.left, m15145c.top, m15145c.width(), m15145c.height(), false);
    }

    /* renamed from: a */
    public synchronized void m15137a() {
        if (this.f12834c != null) {
            this.f12834c.m15860a().release();
            this.f12834c = null;
            this.f12836e = null;
            this.f12837f = null;
        }
    }

    /* renamed from: a */
    public synchronized void m15138a(int i) {
        this.f12840i = i;
    }

    /* renamed from: a */
    public synchronized void m15139a(int i, int i2) {
        if (this.f12838g) {
            Point m14666b = this.f12833b.m14666b();
            if (i > m14666b.x) {
                i = m14666b.x;
            }
            if (i2 > m14666b.y) {
                i2 = m14666b.y;
            }
            int i3 = (m14666b.x - i) / 2;
            int i4 = (m14666b.y - i2) / 2;
            this.f12836e = new Rect(i3, i4, i + i3, i2 + i4);
            String str = "Calculated manual framing rect: " + this.f12836e;
            this.f12837f = null;
        } else {
            this.f12841j = i;
            this.f12842k = i2;
        }
    }

    /* renamed from: a */
    public synchronized void m15140a(Handler handler, int i) {
        C3321uw c3321uw = this.f12834c;
        if (c3321uw != null && this.f12839h) {
            this.f12843l.m15458a(handler, i);
            c3321uw.m15860a().setOneShotPreviewCallback(this.f12843l);
        }
    }

    /* renamed from: a */
    public synchronized void m15141a(SurfaceHolder surfaceHolder) {
        C3321uw c3321uw = this.f12834c;
        if (c3321uw == null) {
            c3321uw = C3374vw.m16058a(this.f12840i);
            if (c3321uw == null) {
                throw new IOException("Camera.open() failed to return object from driver");
            }
            this.f12834c = c3321uw;
        }
        if (!this.f12838g) {
            this.f12838g = true;
            this.f12833b.m14663a(c3321uw);
            if (this.f12841j > 0 && this.f12842k > 0) {
                m15139a(this.f12841j, this.f12842k);
                this.f12841j = 0;
                this.f12842k = 0;
            }
        }
        Camera m15860a = c3321uw.m15860a();
        Camera.Parameters parameters = m15860a.getParameters();
        String flatten = parameters == null ? null : parameters.flatten();
        try {
            this.f12833b.m14664a(c3321uw, false);
        } catch (RuntimeException unused) {
            String str = "Resetting to saved camera params: " + flatten;
            if (flatten != null) {
                Camera.Parameters parameters2 = m15860a.getParameters();
                parameters2.unflatten(flatten);
                try {
                    m15860a.setParameters(parameters2);
                    this.f12833b.m14664a(c3321uw, true);
                } catch (RuntimeException unused2) {
                }
            }
        }
        m15860a.setPreviewDisplay(surfaceHolder);
    }

    /* renamed from: a */
    public synchronized void m15142a(boolean z) {
        C3321uw c3321uw = this.f12834c;
        if (c3321uw != null && z != this.f12833b.m14665a(c3321uw.m15860a())) {
            boolean z2 = this.f12835d != null;
            if (z2) {
                this.f12835d.m14397b();
                this.f12835d = null;
            }
            this.f12833b.m14662a(c3321uw.m15860a(), z);
            if (z2) {
                C3004nw c3004nw = new C3004nw(this.f12832a, c3321uw.m15860a());
                this.f12835d = c3004nw;
                c3004nw.m14396a();
            }
        }
    }

    /* renamed from: b */
    public synchronized Rect m15143b() {
        if (this.f12836e == null) {
            if (this.f12834c == null) {
                return null;
            }
            Point m14666b = this.f12833b.m14666b();
            if (m14666b == null) {
                return null;
            }
            int m15135a = m15135a(m14666b.x, 240, 1200);
            int m15135a2 = m15135a(m14666b.y, 240, 675);
            int i = (m14666b.x - m15135a) / 2;
            int i2 = (m14666b.y - m15135a2) / 2;
            this.f12836e = new Rect(i, i2, m15135a + i, m15135a2 + i2);
            String str = "Calculated framing rect: " + this.f12836e;
        }
        return this.f12836e;
    }

    /* renamed from: b */
    public synchronized void m15144b(int i, int i2) {
        float f;
        Point m14666b;
        float f2;
        Point m14666b2;
        int i3;
        int i4 = 0;
        if (i != 7) {
            if (i == 6) {
                if (i2 == 1) {
                    f2 = 0.4f;
                    m14666b2 = this.f12833b.m14666b();
                    i4 = (int) (m14666b2.x * f2);
                    i3 = i4;
                } else if (i2 == 2) {
                    i4 = (int) (f12831n[0] * this.f12833b.m14666b().x);
                    f = f12831n[1];
                    m14666b = this.f12833b.m14666b();
                    i3 = (int) (f * m14666b.x);
                }
            }
            i3 = 0;
        } else if (i2 == 1) {
            f2 = 0.6f;
            m14666b2 = this.f12833b.m14666b();
            i4 = (int) (m14666b2.x * f2);
            i3 = i4;
        } else {
            if (i2 == 2) {
                i4 = (int) (f12830m[0] * this.f12833b.m14666b().x);
                f = f12830m[1];
                m14666b = this.f12833b.m14666b();
                i3 = (int) (f * m14666b.x);
            }
            i3 = 0;
        }
        m15139a(i4, i3);
    }

    /* renamed from: c */
    public synchronized Rect m15145c() {
        if (this.f12837f == null) {
            Rect m15143b = m15143b();
            if (m15143b == null) {
                return null;
            }
            Rect rect = new Rect(m15143b);
            Point m14661a = this.f12833b.m14661a();
            Point m14666b = this.f12833b.m14666b();
            if (m14661a != null && m14666b != null) {
                rect.left = (rect.left * m14661a.x) / m14666b.x;
                rect.right = (rect.right * m14661a.x) / m14666b.x;
                rect.top = (rect.top * m14661a.y) / m14666b.y;
                rect.bottom = (rect.bottom * m14661a.y) / m14666b.y;
                this.f12837f = rect;
            }
            return null;
        }
        return this.f12837f;
    }

    /* renamed from: d */
    public synchronized boolean m15146d() {
        return this.f12834c != null;
    }

    /* renamed from: e */
    public synchronized void m15147e() {
        C3321uw c3321uw = this.f12834c;
        if (c3321uw != null && !this.f12839h) {
            c3321uw.m15860a().startPreview();
            this.f12839h = true;
            this.f12835d = new C3004nw(this.f12832a, c3321uw.m15860a());
        }
    }

    /* renamed from: f */
    public synchronized void m15148f() {
        if (this.f12835d != null) {
            this.f12835d.m14397b();
            this.f12835d = null;
        }
        if (this.f12834c != null && this.f12839h) {
            this.f12834c.m15860a().stopPreview();
            this.f12843l.m15458a(null, 0);
            this.f12839h = false;
        }
    }
}
