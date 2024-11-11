package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import java.io.IOException;

/* loaded from: classes.dex */
public final class qw {
    private static final float[] m = {0.8f, 0.4f};
    private static final float[] n = {0.7f, 0.3f};
    private final Context a;
    private final ow b;
    private uw c;
    private nw d;
    private Rect e;
    private Rect f;
    private boolean g;
    private boolean h;
    private int i = -1;
    private int j;
    private int k;
    private final sw l;

    public qw(Context context) {
        this.a = context;
        this.b = new ow(context);
        this.l = new sw(this.b);
    }

    private static int a(int i, int i2, int i3) {
        int i4 = (i * 5) / 8;
        return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
    }

    public bw a(byte[] bArr, int i, int i2) {
        Rect c = c();
        if (c == null) {
            return null;
        }
        return new bw(bArr, i, i2, c.left, c.top, c.width(), c.height(), false);
    }

    public synchronized void a() {
        if (this.c != null) {
            this.c.a().release();
            this.c = null;
            this.e = null;
            this.f = null;
        }
    }

    public synchronized void a(int i) {
        this.i = i;
    }

    public synchronized void a(int i, int i2) {
        if (this.g) {
            Point b = this.b.b();
            if (i > b.x) {
                i = b.x;
            }
            if (i2 > b.y) {
                i2 = b.y;
            }
            int i3 = (b.x - i) / 2;
            int i4 = (b.y - i2) / 2;
            this.e = new Rect(i3, i4, i + i3, i2 + i4);
            String str = "Calculated manual framing rect: " + this.e;
            this.f = null;
        } else {
            this.j = i;
            this.k = i2;
        }
    }

    public synchronized void a(Handler handler, int i) {
        uw uwVar = this.c;
        if (uwVar != null && this.h) {
            this.l.a(handler, i);
            uwVar.a().setOneShotPreviewCallback(this.l);
        }
    }

    public synchronized void a(SurfaceHolder surfaceHolder) {
        uw uwVar = this.c;
        if (uwVar == null) {
            uwVar = vw.a(this.i);
            if (uwVar == null) {
                throw new IOException("Camera.open() failed to return object from driver");
            }
            this.c = uwVar;
        }
        if (!this.g) {
            this.g = true;
            this.b.a(uwVar);
            if (this.j > 0 && this.k > 0) {
                a(this.j, this.k);
                this.j = 0;
                this.k = 0;
            }
        }
        Camera a = uwVar.a();
        Camera.Parameters parameters = a.getParameters();
        String flatten = parameters == null ? null : parameters.flatten();
        try {
            this.b.a(uwVar, false);
        } catch (RuntimeException unused) {
            String str = "Resetting to saved camera params: " + flatten;
            if (flatten != null) {
                Camera.Parameters parameters2 = a.getParameters();
                parameters2.unflatten(flatten);
                try {
                    a.setParameters(parameters2);
                    this.b.a(uwVar, true);
                } catch (RuntimeException unused2) {
                }
            }
        }
        a.setPreviewDisplay(surfaceHolder);
    }

    public synchronized void a(boolean z) {
        uw uwVar = this.c;
        if (uwVar != null && z != this.b.a(uwVar.a())) {
            boolean z2 = this.d != null;
            if (z2) {
                this.d.b();
                this.d = null;
            }
            this.b.a(uwVar.a(), z);
            if (z2) {
                nw nwVar = new nw(this.a, uwVar.a());
                this.d = nwVar;
                nwVar.a();
            }
        }
    }

    public synchronized Rect b() {
        if (this.e == null) {
            if (this.c == null) {
                return null;
            }
            Point b = this.b.b();
            if (b == null) {
                return null;
            }
            int a = a(b.x, 240, 1200);
            int a2 = a(b.y, 240, 675);
            int i = (b.x - a) / 2;
            int i2 = (b.y - a2) / 2;
            this.e = new Rect(i, i2, a + i, a2 + i2);
            String str = "Calculated framing rect: " + this.e;
        }
        return this.e;
    }

    public synchronized void b(int i, int i2) {
        float f;
        Point b;
        float f2;
        Point b2;
        int i3;
        int i4 = 0;
        if (i != 7) {
            if (i == 6) {
                if (i2 == 1) {
                    f2 = 0.4f;
                    b2 = this.b.b();
                    i4 = (int) (b2.x * f2);
                    i3 = i4;
                } else if (i2 == 2) {
                    i4 = (int) (n[0] * this.b.b().x);
                    f = n[1];
                    b = this.b.b();
                    i3 = (int) (f * b.x);
                }
            }
            i3 = 0;
        } else if (i2 == 1) {
            f2 = 0.6f;
            b2 = this.b.b();
            i4 = (int) (b2.x * f2);
            i3 = i4;
        } else {
            if (i2 == 2) {
                i4 = (int) (m[0] * this.b.b().x);
                f = m[1];
                b = this.b.b();
                i3 = (int) (f * b.x);
            }
            i3 = 0;
        }
        a(i4, i3);
    }

    public synchronized Rect c() {
        if (this.f == null) {
            Rect b = b();
            if (b == null) {
                return null;
            }
            Rect rect = new Rect(b);
            Point a = this.b.a();
            Point b2 = this.b.b();
            if (a != null && b2 != null) {
                rect.left = (rect.left * a.x) / b2.x;
                rect.right = (rect.right * a.x) / b2.x;
                rect.top = (rect.top * a.y) / b2.y;
                rect.bottom = (rect.bottom * a.y) / b2.y;
                this.f = rect;
            }
            return null;
        }
        return this.f;
    }

    public synchronized boolean d() {
        return this.c != null;
    }

    public synchronized void e() {
        uw uwVar = this.c;
        if (uwVar != null && !this.h) {
            uwVar.a().startPreview();
            this.h = true;
            this.d = new nw(this.a, uwVar.a());
        }
    }

    public synchronized void f() {
        if (this.d != null) {
            this.d.b();
            this.d = null;
        }
        if (this.c != null && this.h) {
            this.c.a().stopPreview();
            this.l.a(null, 0);
            this.h = false;
        }
    }
}
