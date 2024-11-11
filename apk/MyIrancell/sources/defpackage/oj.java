package defpackage;

import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;

/* loaded from: classes.dex */
public class oj {
    private String a;
    private String b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private float i;
    private int j;
    private int k;
    private String l;
    private float m = 0.0f;
    private int n = 0;
    private boolean o = false;

    public float a() {
        return this.i;
    }

    public int a(int i, float f) {
        String trim;
        double d;
        try {
            if (TextUtils.isEmpty(this.b)) {
                return 0;
            }
            if (this.b.contains("%")) {
                double parseDouble = Double.parseDouble(this.b.substring(0, this.b.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble * d2) / 100.0d;
            } else {
                if (!this.b.contains("px") && !this.b.contains("PX")) {
                    trim = this.b;
                    double parseDouble2 = Double.parseDouble(trim);
                    double d3 = f;
                    Double.isNaN(d3);
                    d = parseDouble2 * d3;
                }
                int indexOf = this.b.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.b.indexOf("PX");
                }
                trim = this.b.substring(0, indexOf).trim();
                double parseDouble22 = Double.parseDouble(trim);
                double d32 = f;
                Double.isNaN(d32);
                d = parseDouble22 * d32;
            }
            return (int) d;
        } catch (Exception unused) {
            return 0;
        }
    }

    public void a(float f) {
        this.i = f;
    }

    public void a(int i) {
        this.k = i;
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(boolean z) {
        this.o = z;
    }

    public int b() {
        return this.k;
    }

    public int b(int i, float f) {
        String trim;
        double d;
        try {
            if (TextUtils.isEmpty(this.a)) {
                return 0;
            }
            if (this.a.contains("%")) {
                double parseDouble = Double.parseDouble(this.a.substring(0, this.a.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble * d2) / 100.0d;
            } else {
                if (!this.a.contains("px") && !this.a.contains("PX")) {
                    trim = this.a;
                    double parseDouble2 = Double.parseDouble(trim);
                    double d3 = f;
                    Double.isNaN(d3);
                    d = parseDouble2 * d3;
                }
                int indexOf = this.a.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.a.indexOf("PX");
                }
                trim = this.a.substring(0, indexOf).trim();
                double parseDouble22 = Double.parseDouble(trim);
                double d32 = f;
                Double.isNaN(d32);
                d = parseDouble22 * d32;
            }
            return (int) d;
        } catch (Exception unused) {
            return 0;
        }
    }

    public void b(float f) {
        this.m = f;
    }

    public void b(int i) {
        this.j = i;
    }

    public void b(String str) {
        this.a = str;
    }

    public int c() {
        return this.j;
    }

    public int c(int i, float f) {
        String trim;
        double d;
        try {
            if (TextUtils.isEmpty(this.l)) {
                return 0;
            }
            if (this.l.contains("%")) {
                double parseDouble = Double.parseDouble(this.l.substring(0, this.l.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble * d2) / 100.0d;
            } else {
                if (!this.l.contains("px") && !this.l.contains("PX")) {
                    trim = this.l;
                    double parseDouble2 = Double.parseDouble(trim);
                    double d3 = f;
                    Double.isNaN(d3);
                    d = parseDouble2 * d3;
                }
                int indexOf = this.l.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.l.indexOf("PX");
                }
                trim = this.l.substring(0, indexOf).trim();
                double parseDouble22 = Double.parseDouble(trim);
                double d32 = f;
                Double.isNaN(d32);
                d = parseDouble22 * d32;
            }
            return (int) d;
        } catch (Exception unused) {
            return 0;
        }
    }

    public void c(float f) {
        this.g = f;
    }

    public void c(int i) {
        this.f = i;
    }

    public void c(String str) {
        this.l = str;
    }

    public int d() {
        return this.f;
    }

    public void d(float f) {
        this.h = f;
    }

    public void d(int i) {
        this.c = x1.a(i);
    }

    public float e() {
        return this.m;
    }

    public void e(int i) {
        this.d = x1.a(i);
    }

    public int f() {
        return this.c;
    }

    public void f(int i) {
        this.n = i;
    }

    public float g() {
        return this.g;
    }

    public void g(int i) {
        this.e = i;
    }

    public float h() {
        return this.h;
    }

    public int i() {
        return this.d;
    }

    public int j() {
        return this.n;
    }

    public int k() {
        return this.e;
    }

    public boolean l() {
        return this.o;
    }
}
