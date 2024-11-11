package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p000.C3107q2;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0249a implements View.OnTouchListener {

    /* renamed from: s */
    private static final int f1520s = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    final View f1523d;

    /* renamed from: e */
    private Runnable f1524e;

    /* renamed from: h */
    private int f1527h;

    /* renamed from: i */
    private int f1528i;

    /* renamed from: m */
    private boolean f1532m;

    /* renamed from: n */
    boolean f1533n;

    /* renamed from: o */
    boolean f1534o;

    /* renamed from: p */
    boolean f1535p;

    /* renamed from: q */
    private boolean f1536q;

    /* renamed from: r */
    private boolean f1537r;

    /* renamed from: b */
    final a f1521b = new a();

    /* renamed from: c */
    private final Interpolator f1522c = new AccelerateInterpolator();

    /* renamed from: f */
    private float[] f1525f = {0.0f, 0.0f};

    /* renamed from: g */
    private float[] f1526g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private float[] f1529j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f1530k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f1531l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f1538a;

        /* renamed from: b */
        private int f1539b;

        /* renamed from: c */
        private float f1540c;

        /* renamed from: d */
        private float f1541d;

        /* renamed from: j */
        private float f1547j;

        /* renamed from: k */
        private int f1548k;

        /* renamed from: e */
        private long f1542e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f1546i = -1;

        /* renamed from: f */
        private long f1543f = 0;

        /* renamed from: g */
        private int f1544g = 0;

        /* renamed from: h */
        private int f1545h = 0;

        a() {
        }

        /* renamed from: a */
        private float m1563a(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        private float m1564a(long j) {
            if (j < this.f1542e) {
                return 0.0f;
            }
            long j2 = this.f1546i;
            if (j2 < 0 || j < j2) {
                return AbstractViewOnTouchListenerC0249a.m1541a(((float) (j - this.f1542e)) / this.f1538a, 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f1547j;
            return (1.0f - f) + (f * AbstractViewOnTouchListenerC0249a.m1541a(((float) j3) / this.f1548k, 0.0f, 1.0f));
        }

        /* renamed from: a */
        public void m1565a() {
            if (this.f1543f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m1563a = m1563a(m1564a(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f1543f;
            this.f1543f = currentAnimationTimeMillis;
            float f = ((float) j) * m1563a;
            this.f1544g = (int) (this.f1540c * f);
            this.f1545h = (int) (f * this.f1541d);
        }

        /* renamed from: a */
        public void m1566a(float f, float f2) {
            this.f1540c = f;
            this.f1541d = f2;
        }

        /* renamed from: a */
        public void m1567a(int i) {
            this.f1539b = i;
        }

        /* renamed from: b */
        public int m1568b() {
            return this.f1544g;
        }

        /* renamed from: b */
        public void m1569b(int i) {
            this.f1538a = i;
        }

        /* renamed from: c */
        public int m1570c() {
            return this.f1545h;
        }

        /* renamed from: d */
        public int m1571d() {
            float f = this.f1540c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int m1572e() {
            float f = this.f1541d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean m1573f() {
            return this.f1546i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1546i + ((long) this.f1548k);
        }

        /* renamed from: g */
        public void m1574g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1548k = AbstractViewOnTouchListenerC0249a.m1544a((int) (currentAnimationTimeMillis - this.f1542e), 0, this.f1539b);
            this.f1547j = m1564a(currentAnimationTimeMillis);
            this.f1546i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void m1575h() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1542e = currentAnimationTimeMillis;
            this.f1546i = -1L;
            this.f1543f = currentAnimationTimeMillis;
            this.f1547j = 0.5f;
            this.f1544g = 0;
            this.f1545h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0249a abstractViewOnTouchListenerC0249a = AbstractViewOnTouchListenerC0249a.this;
            if (abstractViewOnTouchListenerC0249a.f1535p) {
                if (abstractViewOnTouchListenerC0249a.f1533n) {
                    abstractViewOnTouchListenerC0249a.f1533n = false;
                    abstractViewOnTouchListenerC0249a.f1521b.m1575h();
                }
                a aVar = AbstractViewOnTouchListenerC0249a.this.f1521b;
                if (aVar.m1573f() || !AbstractViewOnTouchListenerC0249a.this.m1554b()) {
                    AbstractViewOnTouchListenerC0249a.this.f1535p = false;
                    return;
                }
                AbstractViewOnTouchListenerC0249a abstractViewOnTouchListenerC0249a2 = AbstractViewOnTouchListenerC0249a.this;
                if (abstractViewOnTouchListenerC0249a2.f1534o) {
                    abstractViewOnTouchListenerC0249a2.f1534o = false;
                    abstractViewOnTouchListenerC0249a2.m1550a();
                }
                aVar.m1565a();
                AbstractViewOnTouchListenerC0249a.this.mo1551a(aVar.m1568b(), aVar.m1570c());
                C3107q2.m14892a(AbstractViewOnTouchListenerC0249a.this.f1523d, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0249a(View view) {
        this.f1523d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m1553b(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m1556c(f3, f3);
        m1559d(1);
        m1548a(Float.MAX_VALUE, Float.MAX_VALUE);
        m1558d(0.2f, 0.2f);
        m1560e(1.0f, 1.0f);
        m1557c(f1520s);
        m1562f(500);
        m1561e(500);
    }

    /* renamed from: a */
    static float m1541a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m1542a(float f, float f2, float f3, float f4) {
        float interpolation;
        float m1541a = m1541a(f * f2, 0.0f, f3);
        float m1547f = m1547f(f2 - f4, m1541a) - m1547f(f4, m1541a);
        if (m1547f < 0.0f) {
            interpolation = -this.f1522c.getInterpolation(-m1547f);
        } else {
            if (m1547f <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1522c.getInterpolation(m1547f);
        }
        return m1541a(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m1543a(int i, float f, float f2, float f3) {
        float m1542a = m1542a(this.f1525f[i], f2, this.f1526g[i], f);
        if (m1542a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1529j[i];
        float f5 = this.f1530k[i];
        float f6 = this.f1531l[i];
        float f7 = f4 * f3;
        return m1542a > 0.0f ? m1541a(m1542a * f7, f5, f6) : -m1541a((-m1542a) * f7, f5, f6);
    }

    /* renamed from: a */
    static int m1544a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: c */
    private void m1545c() {
        if (this.f1533n) {
            this.f1535p = false;
        } else {
            this.f1521b.m1574g();
        }
    }

    /* renamed from: d */
    private void m1546d() {
        int i;
        if (this.f1524e == null) {
            this.f1524e = new b();
        }
        this.f1535p = true;
        this.f1533n = true;
        if (this.f1532m || (i = this.f1528i) <= 0) {
            this.f1524e.run();
        } else {
            C3107q2.m14893a(this.f1523d, this.f1524e, i);
        }
        this.f1532m = true;
    }

    /* renamed from: f */
    private float m1547f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1527h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f1535p && this.f1527h == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: a */
    public AbstractViewOnTouchListenerC0249a m1548a(float f, float f2) {
        float[] fArr = this.f1526g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    public AbstractViewOnTouchListenerC0249a m1549a(boolean z) {
        if (this.f1536q && !z) {
            m1545c();
        }
        this.f1536q = z;
        return this;
    }

    /* renamed from: a */
    void m1550a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1523d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public abstract void mo1551a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo1552a(int i);

    /* renamed from: b */
    public AbstractViewOnTouchListenerC0249a m1553b(float f, float f2) {
        float[] fArr = this.f1531l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    boolean m1554b() {
        a aVar = this.f1521b;
        int m1572e = aVar.m1572e();
        int m1571d = aVar.m1571d();
        return (m1572e != 0 && mo1555b(m1572e)) || (m1571d != 0 && mo1552a(m1571d));
    }

    /* renamed from: b */
    public abstract boolean mo1555b(int i);

    /* renamed from: c */
    public AbstractViewOnTouchListenerC0249a m1556c(float f, float f2) {
        float[] fArr = this.f1530k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public AbstractViewOnTouchListenerC0249a m1557c(int i) {
        this.f1528i = i;
        return this;
    }

    /* renamed from: d */
    public AbstractViewOnTouchListenerC0249a m1558d(float f, float f2) {
        float[] fArr = this.f1525f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: d */
    public AbstractViewOnTouchListenerC0249a m1559d(int i) {
        this.f1527h = i;
        return this;
    }

    /* renamed from: e */
    public AbstractViewOnTouchListenerC0249a m1560e(float f, float f2) {
        float[] fArr = this.f1529j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: e */
    public AbstractViewOnTouchListenerC0249a m1561e(int i) {
        this.f1521b.m1567a(i);
        return this;
    }

    /* renamed from: f */
    public AbstractViewOnTouchListenerC0249a m1562f(int i) {
        this.f1521b.m1569b(i);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1536q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m1545c()
            goto L58
        L1a:
            r5.f1534o = r2
            r5.f1532m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1523d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m1543a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1523d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m1543a(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f1521b
            r7.m1566a(r0, r6)
            boolean r6 = r5.f1535p
            if (r6 != 0) goto L58
            boolean r6 = r5.m1554b()
            if (r6 == 0) goto L58
            r5.m1546d()
        L58:
            boolean r6 = r5.f1537r
            if (r6 == 0) goto L61
            boolean r6 = r5.f1535p
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC0249a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
