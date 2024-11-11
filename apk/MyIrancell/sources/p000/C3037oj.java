package p000;

import android.text.TextUtils;
import com.comviva.webaxn.utils.C0755x1;

/* renamed from: oj */
/* loaded from: classes.dex */
public class C3037oj {

    /* renamed from: a */
    private String f12484a;

    /* renamed from: b */
    private String f12485b;

    /* renamed from: c */
    private int f12486c;

    /* renamed from: d */
    private int f12487d;

    /* renamed from: e */
    private int f12488e;

    /* renamed from: f */
    private int f12489f;

    /* renamed from: g */
    private float f12490g;

    /* renamed from: h */
    private float f12491h;

    /* renamed from: i */
    private float f12492i;

    /* renamed from: j */
    private int f12493j;

    /* renamed from: k */
    private int f12494k;

    /* renamed from: l */
    private String f12495l;

    /* renamed from: m */
    private float f12496m = 0.0f;

    /* renamed from: n */
    private int f12497n = 0;

    /* renamed from: o */
    private boolean f12498o = false;

    /* renamed from: a */
    public float m14595a() {
        return this.f12492i;
    }

    /* renamed from: a */
    public int m14596a(int i, float f) {
        String trim;
        double d;
        try {
            if (TextUtils.isEmpty(this.f12485b)) {
                return 0;
            }
            if (this.f12485b.contains("%")) {
                double parseDouble = Double.parseDouble(this.f12485b.substring(0, this.f12485b.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble * d2) / 100.0d;
            } else {
                if (!this.f12485b.contains("px") && !this.f12485b.contains("PX")) {
                    trim = this.f12485b;
                    double parseDouble2 = Double.parseDouble(trim);
                    double d3 = f;
                    Double.isNaN(d3);
                    d = parseDouble2 * d3;
                }
                int indexOf = this.f12485b.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f12485b.indexOf("PX");
                }
                trim = this.f12485b.substring(0, indexOf).trim();
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

    /* renamed from: a */
    public void m14597a(float f) {
        this.f12492i = f;
    }

    /* renamed from: a */
    public void m14598a(int i) {
        this.f12494k = i;
    }

    /* renamed from: a */
    public void m14599a(String str) {
        this.f12485b = str;
    }

    /* renamed from: a */
    public void m14600a(boolean z) {
        this.f12498o = z;
    }

    /* renamed from: b */
    public int m14601b() {
        return this.f12494k;
    }

    /* renamed from: b */
    public int m14602b(int i, float f) {
        String trim;
        double d;
        try {
            if (TextUtils.isEmpty(this.f12484a)) {
                return 0;
            }
            if (this.f12484a.contains("%")) {
                double parseDouble = Double.parseDouble(this.f12484a.substring(0, this.f12484a.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble * d2) / 100.0d;
            } else {
                if (!this.f12484a.contains("px") && !this.f12484a.contains("PX")) {
                    trim = this.f12484a;
                    double parseDouble2 = Double.parseDouble(trim);
                    double d3 = f;
                    Double.isNaN(d3);
                    d = parseDouble2 * d3;
                }
                int indexOf = this.f12484a.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f12484a.indexOf("PX");
                }
                trim = this.f12484a.substring(0, indexOf).trim();
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

    /* renamed from: b */
    public void m14603b(float f) {
        this.f12496m = f;
    }

    /* renamed from: b */
    public void m14604b(int i) {
        this.f12493j = i;
    }

    /* renamed from: b */
    public void m14605b(String str) {
        this.f12484a = str;
    }

    /* renamed from: c */
    public int m14606c() {
        return this.f12493j;
    }

    /* renamed from: c */
    public int m14607c(int i, float f) {
        String trim;
        double d;
        try {
            if (TextUtils.isEmpty(this.f12495l)) {
                return 0;
            }
            if (this.f12495l.contains("%")) {
                double parseDouble = Double.parseDouble(this.f12495l.substring(0, this.f12495l.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble * d2) / 100.0d;
            } else {
                if (!this.f12495l.contains("px") && !this.f12495l.contains("PX")) {
                    trim = this.f12495l;
                    double parseDouble2 = Double.parseDouble(trim);
                    double d3 = f;
                    Double.isNaN(d3);
                    d = parseDouble2 * d3;
                }
                int indexOf = this.f12495l.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f12495l.indexOf("PX");
                }
                trim = this.f12495l.substring(0, indexOf).trim();
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

    /* renamed from: c */
    public void m14608c(float f) {
        this.f12490g = f;
    }

    /* renamed from: c */
    public void m14609c(int i) {
        this.f12489f = i;
    }

    /* renamed from: c */
    public void m14610c(String str) {
        this.f12495l = str;
    }

    /* renamed from: d */
    public int m14611d() {
        return this.f12489f;
    }

    /* renamed from: d */
    public void m14612d(float f) {
        this.f12491h = f;
    }

    /* renamed from: d */
    public void m14613d(int i) {
        this.f12486c = C0755x1.m6113a(i);
    }

    /* renamed from: e */
    public float m14614e() {
        return this.f12496m;
    }

    /* renamed from: e */
    public void m14615e(int i) {
        this.f12487d = C0755x1.m6113a(i);
    }

    /* renamed from: f */
    public int m14616f() {
        return this.f12486c;
    }

    /* renamed from: f */
    public void m14617f(int i) {
        this.f12497n = i;
    }

    /* renamed from: g */
    public float m14618g() {
        return this.f12490g;
    }

    /* renamed from: g */
    public void m14619g(int i) {
        this.f12488e = i;
    }

    /* renamed from: h */
    public float m14620h() {
        return this.f12491h;
    }

    /* renamed from: i */
    public int m14621i() {
        return this.f12487d;
    }

    /* renamed from: j */
    public int m14622j() {
        return this.f12497n;
    }

    /* renamed from: k */
    public int m14623k() {
        return this.f12488e;
    }

    /* renamed from: l */
    public boolean m14624l() {
        return this.f12498o;
    }
}
