package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;

/* loaded from: classes.dex */
public class jj {
    private int a;
    private String b;
    private String c;
    private int d;
    private int e;
    private float f;
    private int g;
    private int h;
    private float i;
    private float j;
    private double k;
    private float l;
    private int m = 0;
    private float n;
    private RectF o;
    private Paint p;
    private float q;
    private float r;
    private float s;

    public jj(float f) {
        this.n = f;
    }

    public float a(int i) {
        double parseDouble;
        double d;
        try {
            if (TextUtils.isEmpty(this.c)) {
                return 0.0f;
            }
            if (this.c.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.c.substring(0, this.c.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.c.contains("px") && !this.c.contains("PX")) {
                    parseDouble = Double.parseDouble(this.c);
                    double d3 = this.n;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.c.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.c.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.c.substring(0, indexOf).trim());
                double d32 = this.n;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (float) d;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public int a() {
        return this.m;
    }

    public void a(double d) {
        this.k = d;
    }

    public void a(float f) {
        this.l = f;
    }

    public void a(int i, boolean z) {
        if (z) {
            i = x1.a(i);
        }
        this.d = i;
    }

    public void a(Paint paint) {
        this.p = paint;
    }

    public void a(RectF rectF) {
        this.o = rectF;
    }

    public void a(String str) {
        this.c = str;
    }

    public float b(int i) {
        double parseDouble;
        double d;
        try {
            if (TextUtils.isEmpty(this.b)) {
                return 0.0f;
            }
            if (this.b.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.b.substring(0, this.b.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.b.contains("px") && !this.b.contains("PX")) {
                    parseDouble = Double.parseDouble(this.b);
                    double d3 = this.n;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.b.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.b.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.b.substring(0, indexOf).trim());
                double d32 = this.n;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (float) d;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public Paint b() {
        return this.p;
    }

    public void b(float f) {
        this.j = f;
    }

    public void b(String str) {
        this.b = str;
    }

    public RectF c() {
        return this.o;
    }

    public void c(float f) {
        this.r = f;
    }

    public void c(int i) {
        this.m = i;
    }

    public float d() {
        return this.l;
    }

    public void d(float f) {
        this.s = f;
    }

    public void d(int i) {
        this.h = i;
    }

    public float e() {
        return this.j;
    }

    public void e(float f) {
        this.f = f;
    }

    public void e(int i) {
        this.a = i;
    }

    public float f() {
        return this.r;
    }

    public void f(float f) {
        this.i = f;
    }

    public void f(int i) {
        this.g = i;
    }

    public int g() {
        return this.h;
    }

    public void g(float f) {
        this.q = f;
    }

    public void g(int i) {
        this.e = x1.a(i);
    }

    public float h() {
        return this.s;
    }

    public int i() {
        return this.a;
    }

    public int j() {
        return this.g;
    }

    public float k() {
        return this.f;
    }

    public int l() {
        return this.e;
    }

    public double m() {
        return this.k;
    }

    public int n() {
        return this.d;
    }

    public float o() {
        return this.i;
    }

    public float p() {
        return this.q;
    }
}
