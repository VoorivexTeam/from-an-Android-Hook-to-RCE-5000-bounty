package p000;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.C0613a1;
import com.comviva.webaxn.p002ui.C0643k1;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0696e;
import com.comviva.webaxn.utils.C0737r1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* renamed from: zj */
/* loaded from: classes.dex */
public class C3531zj {

    /* renamed from: A */
    public String f14484A;

    /* renamed from: B */
    public String f14485B;

    /* renamed from: C */
    public String f14486C;

    /* renamed from: D */
    public String f14487D;

    /* renamed from: E */
    public String f14488E;

    /* renamed from: F */
    public float f14489F;

    /* renamed from: G */
    public String f14490G;

    /* renamed from: H */
    public String f14491H;

    /* renamed from: I */
    public String f14492I;

    /* renamed from: J */
    public String f14493J;

    /* renamed from: K */
    public String f14494K;

    /* renamed from: L */
    private C0737r1 f14495L;

    /* renamed from: M */
    public C3129qj f14496M;

    /* renamed from: N */
    public C3087pj f14497N;

    /* renamed from: P */
    public HashMap<String, C2555hj> f14499P;

    /* renamed from: Q */
    public HashMap<String, C0024ak> f14500Q;

    /* renamed from: e */
    public Vector<C3489yj> f14506e;

    /* renamed from: g */
    public String f14508g;

    /* renamed from: h */
    public String f14509h;

    /* renamed from: i */
    public String f14510i;

    /* renamed from: j */
    public C0696e f14511j;

    /* renamed from: k */
    public Vector<C3489yj> f14512k;

    /* renamed from: l */
    public Vector<C3489yj> f14513l;

    /* renamed from: n */
    public String f14515n;

    /* renamed from: o */
    public byte[] f14516o;

    /* renamed from: r */
    public HashMap<String, String> f14519r;

    /* renamed from: s */
    private Context f14520s;

    /* renamed from: v */
    public String f14523v;

    /* renamed from: w */
    public String f14524w;

    /* renamed from: x */
    public String f14525x;

    /* renamed from: y */
    public String f14526y;

    /* renamed from: z */
    public String f14527z;

    /* renamed from: a */
    public String f14502a = "C";

    /* renamed from: b */
    public String f14503b = "T";

    /* renamed from: c */
    public C0643k1 f14504c = null;

    /* renamed from: d */
    public Vector<C0613a1> f14505d = new Vector<>();

    /* renamed from: p */
    public boolean f14517p = false;

    /* renamed from: u */
    public int f14522u = 0;

    /* renamed from: O */
    public C2434ej f14498O = null;

    /* renamed from: R */
    private boolean f14501R = false;

    /* renamed from: m */
    public String f14514m = "list";

    /* renamed from: q */
    public boolean f14518q = false;

    /* renamed from: t */
    public boolean f14521t = true;

    /* renamed from: f */
    public Vector<String> f14507f = new Vector<>();

    public C3531zj(Context context) {
        this.f14520s = context;
        this.f14489F = C0687b.m5342a(this.f14520s).m5343a().m5544a();
    }

    /* renamed from: a */
    public int m16928a(int i) {
        double parseDouble;
        double d;
        try {
            if (this.f14484A == null) {
                return 0;
            }
            String trim = this.f14484A.trim();
            this.f14484A = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.f14484A.substring(0, this.f14484A.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.f14484A.contains("px") && !this.f14484A.contains("PX")) {
                    parseDouble = Double.parseDouble(this.f14484A);
                    double d3 = this.f14489F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.f14484A.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f14484A.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.f14484A.substring(0, indexOf).trim());
                double d32 = this.f14489F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public C0024ak m16929a(String str) {
        HashMap<String, C0024ak> hashMap = this.f14500Q;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        return this.f14500Q.get(str);
    }

    /* renamed from: a */
    public C3489yj m16930a(String str, Vector<C3489yj> vector) {
        int size;
        String str2;
        Vector<C3489yj> vector2;
        if (vector == null) {
            vector = this.f14506e;
        }
        if (vector == null || str == null || (size = vector.size()) == 0) {
            return null;
        }
        int i = 0;
        C3489yj c3489yj = null;
        while (size > i) {
            c3489yj = vector.elementAt(i);
            str = str.trim();
            String str3 = c3489yj.f14186V;
            if (str3 != null) {
                c3489yj.f14186V = str3.trim();
            }
            String str4 = c3489yj.f14186V;
            if ((str4 != null && str.equals(str4)) || ((vector2 = c3489yj.f14268z0) != null && (c3489yj = m16930a(str, vector2)) != null)) {
                i = size;
            }
            i++;
        }
        if (c3489yj == null || (str2 = c3489yj.f14186V) == null) {
            return null;
        }
        if (str2 == null || str2.equals(str)) {
            return c3489yj;
        }
        return null;
    }

    /* renamed from: a */
    public void m16931a(String str, String str2) {
        HashMap<String, String> hashMap = this.f14519r;
        if (hashMap != null) {
            Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getKey().equals(str)) {
                    this.f14519r.put(str, str2);
                    C0023aj.m160a(this.f14520s).m202h(str, str2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void m16932a(C3489yj c3489yj) {
        if (this.f14513l == null) {
            this.f14513l = new Vector<>();
        }
        this.f14513l.addElement(c3489yj);
    }

    /* renamed from: a */
    public void m16933a(boolean z) {
    }

    /* renamed from: a */
    public void m16934a(byte[] bArr) {
        this.f14516o = bArr;
    }

    /* renamed from: a */
    public byte[] m16935a() {
        return this.f14516o;
    }

    /* renamed from: b */
    public int m16936b(int i) {
        double parseDouble;
        double d;
        try {
            if (this.f14488E == null) {
                return 0;
            }
            String trim = this.f14488E.trim();
            this.f14488E = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.f14488E.substring(0, this.f14488E.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.f14488E.contains("px") && !this.f14488E.contains("PX")) {
                    parseDouble = Double.parseDouble(this.f14488E);
                    double d3 = this.f14489F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.f14488E.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f14488E.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.f14488E.substring(0, indexOf).trim());
                double d32 = this.f14489F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public void m16937b(C3489yj c3489yj) {
        if (this.f14506e == null) {
            this.f14506e = new Vector<>();
        }
        this.f14506e.addElement(c3489yj);
    }

    /* renamed from: b */
    public void m16938b(boolean z) {
        this.f14501R = z;
    }

    /* renamed from: b */
    public boolean m16939b() {
        return this.f14501R;
    }

    /* renamed from: c */
    public int m16940c(int i) {
        double parseDouble;
        try {
            if (this.f14524w == null || this.f14524w.equalsIgnoreCase("equal")) {
                return -2;
            }
            String trim = this.f14524w.trim();
            this.f14524w = trim;
            int i2 = -1;
            if (trim.contains("%")) {
                String trim2 = this.f14524w.substring(0, this.f14524w.indexOf("%")).trim();
                if (!trim2.equals("100")) {
                    double parseDouble2 = Double.parseDouble(trim2);
                    double d = i;
                    Double.isNaN(d);
                    i2 = (int) ((parseDouble2 * d) / 100.0d);
                }
                return i2;
            }
            if (!this.f14524w.contains("px") && !this.f14524w.contains("PX")) {
                parseDouble = Double.parseDouble(this.f14524w);
                double d2 = this.f14489F;
                Double.isNaN(d2);
                return (int) (parseDouble * d2);
            }
            int indexOf = this.f14524w.indexOf("px");
            if (-1 == indexOf) {
                indexOf = this.f14524w.indexOf("PX");
            }
            parseDouble = Double.parseDouble(this.f14524w.substring(0, indexOf).trim());
            double d22 = this.f14489F;
            Double.isNaN(d22);
            return (int) (parseDouble * d22);
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        }
    }

    /* renamed from: c */
    public C0737r1 m16941c() {
        return this.f14495L;
    }

    /* renamed from: c */
    public void m16942c(C3489yj c3489yj) {
        if (this.f14512k == null) {
            this.f14512k = new Vector<>();
        }
        this.f14512k.addElement(c3489yj);
    }

    /* renamed from: d */
    public int m16943d(int i) {
        double parseDouble;
        double d;
        try {
            if (this.f14525x == null) {
                return 0;
            }
            String trim = this.f14525x.trim();
            this.f14525x = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.f14525x.substring(0, this.f14525x.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.f14525x.contains("px") && !this.f14525x.contains("PX")) {
                    parseDouble = Double.parseDouble(this.f14525x);
                    double d3 = this.f14489F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.f14525x.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f14525x.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.f14525x.substring(0, indexOf).trim());
                double d32 = this.f14489F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: d */
    public void m16944d() {
        if (TextUtils.isEmpty(this.f14494K) || C3530zi.f14454A == 0) {
            return;
        }
        C0737r1 c0737r1 = new C0737r1();
        this.f14495L = c0737r1;
        c0737r1.m6012a(this.f14494K);
    }

    /* renamed from: e */
    public int m16945e(int i) {
        double parseDouble;
        double d;
        try {
            if (this.f14485B == null) {
                return 0;
            }
            String trim = this.f14485B.trim();
            this.f14485B = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.f14485B.substring(0, this.f14485B.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.f14485B.contains("px") && !this.f14485B.contains("PX")) {
                    parseDouble = Double.parseDouble(this.f14485B);
                    double d3 = this.f14489F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.f14485B.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f14485B.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.f14485B.substring(0, indexOf).trim());
                double d32 = this.f14489F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    public int m16946f(int i) {
        double parseDouble;
        double d;
        try {
            if (this.f14527z == null) {
                return 0;
            }
            String trim = this.f14527z.trim();
            this.f14527z = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.f14527z.substring(0, this.f14527z.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.f14527z.contains("px") && !this.f14527z.contains("PX")) {
                    parseDouble = Double.parseDouble(this.f14527z);
                    double d3 = this.f14489F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.f14527z.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f14527z.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.f14527z.substring(0, indexOf).trim());
                double d32 = this.f14489F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: g */
    public int m16947g(int i) {
        double parseDouble;
        double d;
        try {
            if (this.f14487D == null) {
                return 0;
            }
            String trim = this.f14487D.trim();
            this.f14487D = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.f14487D.substring(0, this.f14487D.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.f14487D.contains("px") && !this.f14487D.contains("PX")) {
                    parseDouble = Double.parseDouble(this.f14487D);
                    double d3 = this.f14489F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.f14487D.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f14487D.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.f14487D.substring(0, indexOf).trim());
                double d32 = this.f14489F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: h */
    public int m16948h(int i) {
        double parseDouble;
        double d;
        try {
            if (this.f14526y == null) {
                return 0;
            }
            String trim = this.f14526y.trim();
            this.f14526y = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.f14526y.substring(0, this.f14526y.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.f14526y.contains("px") && !this.f14526y.contains("PX")) {
                    parseDouble = Double.parseDouble(this.f14526y);
                    double d3 = this.f14489F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.f14526y.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f14526y.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.f14526y.substring(0, indexOf).trim());
                double d32 = this.f14489F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public int m16949i(int i) {
        double parseDouble;
        double d;
        try {
            if (this.f14486C == null) {
                return 0;
            }
            String trim = this.f14486C.trim();
            this.f14486C = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.f14486C.substring(0, this.f14486C.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.f14486C.contains("px") && !this.f14486C.contains("PX")) {
                    parseDouble = Double.parseDouble(this.f14486C);
                    double d3 = this.f14489F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.f14486C.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.f14486C.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.f14486C.substring(0, indexOf).trim());
                double d32 = this.f14489F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: j */
    public int m16950j(int i) {
        double parseDouble;
        try {
            if (this.f14523v == null || this.f14523v.equalsIgnoreCase("equal")) {
                return -2;
            }
            String trim = this.f14523v.trim();
            this.f14523v = trim;
            int i2 = -1;
            if (trim.contains("%")) {
                String trim2 = this.f14523v.substring(0, this.f14523v.indexOf("%")).trim();
                if (!trim2.equals("100")) {
                    double parseDouble2 = Double.parseDouble(trim2);
                    double d = i;
                    Double.isNaN(d);
                    i2 = (int) ((parseDouble2 * d) / 100.0d);
                }
                return i2;
            }
            if (!this.f14523v.contains("px") && !this.f14523v.contains("PX")) {
                parseDouble = Double.parseDouble(this.f14523v);
                double d2 = this.f14489F;
                Double.isNaN(d2);
                return (int) (parseDouble * d2);
            }
            int indexOf = this.f14523v.indexOf("px");
            if (-1 == indexOf) {
                indexOf = this.f14523v.indexOf("PX");
            }
            parseDouble = Double.parseDouble(this.f14523v.substring(0, indexOf).trim());
            double d22 = this.f14489F;
            Double.isNaN(d22);
            return (int) (parseDouble * d22);
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        }
    }
}
