package p000;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import com.comviva.webaxn.utils.C0755x1;

/* renamed from: jj */
/* loaded from: classes.dex */
public class C2817jj {

    /* renamed from: a */
    private int f11514a;

    /* renamed from: b */
    private String f11515b;

    /* renamed from: c */
    private String f11516c;

    /* renamed from: d */
    private int f11517d;

    /* renamed from: e */
    private int f11518e;

    /* renamed from: f */
    private float f11519f;

    /* renamed from: g */
    private int f11520g;

    /* renamed from: h */
    private int f11521h;

    /* renamed from: i */
    private float f11522i;

    /* renamed from: j */
    private float f11523j;

    /* renamed from: k */
    private double f11524k;

    /* renamed from: l */
    private float f11525l;

    /* renamed from: m */
    private int f11526m = 0;

    /* renamed from: n */
    private float f11527n;

    /* renamed from: o */
    private RectF f11528o;

    /* renamed from: p */
    private Paint f11529p;

    /* renamed from: q */
    private float f11530q;

    /* renamed from: r */
    private float f11531r;

    /* renamed from: s */
    private float f11532s;

    public C2817jj(float f) {
        this.f11527n = f;
    }

    /* renamed from: a */
    public float m13464a(int i) {
        double parseDouble;
        double d;
        try {
            if (TextUtils.isEmpty(this.f11516c)) {
                return 0.0f;
            }
            if (this.f11516c.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.f11516c.substring(0, this.f11516c.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.f11516c.contains("px") && !this.f11516c.contains("PX")) {
                    parseDouble = Double.parseDouble(this.f11516c);
                    double d3 = this.f11527n;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.f11516c.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f11516c.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.f11516c.substring(0, indexOf).trim());
                double d32 = this.f11527n;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (float) d;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* renamed from: a */
    public int m13465a() {
        return this.f11526m;
    }

    /* renamed from: a */
    public void m13466a(double d) {
        this.f11524k = d;
    }

    /* renamed from: a */
    public void m13467a(float f) {
        this.f11525l = f;
    }

    /* renamed from: a */
    public void m13468a(int i, boolean z) {
        if (z) {
            i = C0755x1.m6113a(i);
        }
        this.f11517d = i;
    }

    /* renamed from: a */
    public void m13469a(Paint paint) {
        this.f11529p = paint;
    }

    /* renamed from: a */
    public void m13470a(RectF rectF) {
        this.f11528o = rectF;
    }

    /* renamed from: a */
    public void m13471a(String str) {
        this.f11516c = str;
    }

    /* renamed from: b */
    public float m13472b(int i) {
        double parseDouble;
        double d;
        try {
            if (TextUtils.isEmpty(this.f11515b)) {
                return 0.0f;
            }
            if (this.f11515b.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.f11515b.substring(0, this.f11515b.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.f11515b.contains("px") && !this.f11515b.contains("PX")) {
                    parseDouble = Double.parseDouble(this.f11515b);
                    double d3 = this.f11527n;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.f11515b.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f11515b.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.f11515b.substring(0, indexOf).trim());
                double d32 = this.f11527n;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (float) d;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* renamed from: b */
    public Paint m13473b() {
        return this.f11529p;
    }

    /* renamed from: b */
    public void m13474b(float f) {
        this.f11523j = f;
    }

    /* renamed from: b */
    public void m13475b(String str) {
        this.f11515b = str;
    }

    /* renamed from: c */
    public RectF m13476c() {
        return this.f11528o;
    }

    /* renamed from: c */
    public void m13477c(float f) {
        this.f11531r = f;
    }

    /* renamed from: c */
    public void m13478c(int i) {
        this.f11526m = i;
    }

    /* renamed from: d */
    public float m13479d() {
        return this.f11525l;
    }

    /* renamed from: d */
    public void m13480d(float f) {
        this.f11532s = f;
    }

    /* renamed from: d */
    public void m13481d(int i) {
        this.f11521h = i;
    }

    /* renamed from: e */
    public float m13482e() {
        return this.f11523j;
    }

    /* renamed from: e */
    public void m13483e(float f) {
        this.f11519f = f;
    }

    /* renamed from: e */
    public void m13484e(int i) {
        this.f11514a = i;
    }

    /* renamed from: f */
    public float m13485f() {
        return this.f11531r;
    }

    /* renamed from: f */
    public void m13486f(float f) {
        this.f11522i = f;
    }

    /* renamed from: f */
    public void m13487f(int i) {
        this.f11520g = i;
    }

    /* renamed from: g */
    public int m13488g() {
        return this.f11521h;
    }

    /* renamed from: g */
    public void m13489g(float f) {
        this.f11530q = f;
    }

    /* renamed from: g */
    public void m13490g(int i) {
        this.f11518e = C0755x1.m6113a(i);
    }

    /* renamed from: h */
    public float m13491h() {
        return this.f11532s;
    }

    /* renamed from: i */
    public int m13492i() {
        return this.f11514a;
    }

    /* renamed from: j */
    public int m13493j() {
        return this.f11520g;
    }

    /* renamed from: k */
    public float m13494k() {
        return this.f11519f;
    }

    /* renamed from: l */
    public int m13495l() {
        return this.f11518e;
    }

    /* renamed from: m */
    public double m13496m() {
        return this.f11524k;
    }

    /* renamed from: n */
    public int m13497n() {
        return this.f11517d;
    }

    /* renamed from: o */
    public float m13498o() {
        return this.f11522i;
    }

    /* renamed from: p */
    public float m13499p() {
        return this.f11530q;
    }
}
