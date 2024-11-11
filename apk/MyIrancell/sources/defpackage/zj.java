package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.ui.a1;
import com.comviva.webaxn.ui.k1;
import com.comviva.webaxn.utils.b;
import com.comviva.webaxn.utils.e;
import com.comviva.webaxn.utils.r1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes.dex */
public class zj {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public float F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    private r1 L;
    public qj M;
    public pj N;
    public HashMap<String, hj> P;
    public HashMap<String, ak> Q;
    public Vector<yj> e;
    public String g;
    public String h;
    public String i;
    public e j;
    public Vector<yj> k;
    public Vector<yj> l;
    public String n;
    public byte[] o;
    public HashMap<String, String> r;
    private Context s;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;
    public String a = "C";
    public String b = "T";
    public k1 c = null;
    public Vector<a1> d = new Vector<>();
    public boolean p = false;
    public int u = 0;
    public ej O = null;
    private boolean R = false;
    public String m = "list";
    public boolean q = false;
    public boolean t = true;
    public Vector<String> f = new Vector<>();

    public zj(Context context) {
        this.s = context;
        this.F = b.a(this.s).a().a();
    }

    public int a(int i) {
        double parseDouble;
        double d;
        try {
            if (this.A == null) {
                return 0;
            }
            String trim = this.A.trim();
            this.A = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.A.substring(0, this.A.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.A.contains("px") && !this.A.contains("PX")) {
                    parseDouble = Double.parseDouble(this.A);
                    double d3 = this.F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.A.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.A.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.A.substring(0, indexOf).trim());
                double d32 = this.F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ak a(String str) {
        HashMap<String, ak> hashMap = this.Q;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        return this.Q.get(str);
    }

    public yj a(String str, Vector<yj> vector) {
        int size;
        String str2;
        Vector<yj> vector2;
        if (vector == null) {
            vector = this.e;
        }
        if (vector == null || str == null || (size = vector.size()) == 0) {
            return null;
        }
        int i = 0;
        yj yjVar = null;
        while (size > i) {
            yjVar = vector.elementAt(i);
            str = str.trim();
            String str3 = yjVar.V;
            if (str3 != null) {
                yjVar.V = str3.trim();
            }
            String str4 = yjVar.V;
            if ((str4 != null && str.equals(str4)) || ((vector2 = yjVar.z0) != null && (yjVar = a(str, vector2)) != null)) {
                i = size;
            }
            i++;
        }
        if (yjVar == null || (str2 = yjVar.V) == null) {
            return null;
        }
        if (str2 == null || str2.equals(str)) {
            return yjVar;
        }
        return null;
    }

    public void a(String str, String str2) {
        HashMap<String, String> hashMap = this.r;
        if (hashMap != null) {
            Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getKey().equals(str)) {
                    this.r.put(str, str2);
                    aj.a(this.s).h(str, str2);
                    return;
                }
            }
        }
    }

    public void a(yj yjVar) {
        if (this.l == null) {
            this.l = new Vector<>();
        }
        this.l.addElement(yjVar);
    }

    public void a(boolean z) {
    }

    public void a(byte[] bArr) {
        this.o = bArr;
    }

    public byte[] a() {
        return this.o;
    }

    public int b(int i) {
        double parseDouble;
        double d;
        try {
            if (this.E == null) {
                return 0;
            }
            String trim = this.E.trim();
            this.E = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.E.substring(0, this.E.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.E.contains("px") && !this.E.contains("PX")) {
                    parseDouble = Double.parseDouble(this.E);
                    double d3 = this.F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.E.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.E.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.E.substring(0, indexOf).trim());
                double d32 = this.F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void b(yj yjVar) {
        if (this.e == null) {
            this.e = new Vector<>();
        }
        this.e.addElement(yjVar);
    }

    public void b(boolean z) {
        this.R = z;
    }

    public boolean b() {
        return this.R;
    }

    public int c(int i) {
        double parseDouble;
        try {
            if (this.w == null || this.w.equalsIgnoreCase("equal")) {
                return -2;
            }
            String trim = this.w.trim();
            this.w = trim;
            int i2 = -1;
            if (trim.contains("%")) {
                String trim2 = this.w.substring(0, this.w.indexOf("%")).trim();
                if (!trim2.equals("100")) {
                    double parseDouble2 = Double.parseDouble(trim2);
                    double d = i;
                    Double.isNaN(d);
                    i2 = (int) ((parseDouble2 * d) / 100.0d);
                }
                return i2;
            }
            if (!this.w.contains("px") && !this.w.contains("PX")) {
                parseDouble = Double.parseDouble(this.w);
                double d2 = this.F;
                Double.isNaN(d2);
                return (int) (parseDouble * d2);
            }
            int indexOf = this.w.indexOf("px");
            if (-1 == indexOf) {
                indexOf = this.w.indexOf("PX");
            }
            parseDouble = Double.parseDouble(this.w.substring(0, indexOf).trim());
            double d22 = this.F;
            Double.isNaN(d22);
            return (int) (parseDouble * d22);
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        }
    }

    public r1 c() {
        return this.L;
    }

    public void c(yj yjVar) {
        if (this.k == null) {
            this.k = new Vector<>();
        }
        this.k.addElement(yjVar);
    }

    public int d(int i) {
        double parseDouble;
        double d;
        try {
            if (this.x == null) {
                return 0;
            }
            String trim = this.x.trim();
            this.x = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.x.substring(0, this.x.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.x.contains("px") && !this.x.contains("PX")) {
                    parseDouble = Double.parseDouble(this.x);
                    double d3 = this.F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.x.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.x.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.x.substring(0, indexOf).trim());
                double d32 = this.F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void d() {
        if (TextUtils.isEmpty(this.K) || zi.A == 0) {
            return;
        }
        r1 r1Var = new r1();
        this.L = r1Var;
        r1Var.a(this.K);
    }

    public int e(int i) {
        double parseDouble;
        double d;
        try {
            if (this.B == null) {
                return 0;
            }
            String trim = this.B.trim();
            this.B = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.B.substring(0, this.B.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.B.contains("px") && !this.B.contains("PX")) {
                    parseDouble = Double.parseDouble(this.B);
                    double d3 = this.F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.B.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.B.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.B.substring(0, indexOf).trim());
                double d32 = this.F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int f(int i) {
        double parseDouble;
        double d;
        try {
            if (this.z == null) {
                return 0;
            }
            String trim = this.z.trim();
            this.z = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.z.substring(0, this.z.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.z.contains("px") && !this.z.contains("PX")) {
                    parseDouble = Double.parseDouble(this.z);
                    double d3 = this.F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.z.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.z.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.z.substring(0, indexOf).trim());
                double d32 = this.F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int g(int i) {
        double parseDouble;
        double d;
        try {
            if (this.D == null) {
                return 0;
            }
            String trim = this.D.trim();
            this.D = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.D.substring(0, this.D.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.D.contains("px") && !this.D.contains("PX")) {
                    parseDouble = Double.parseDouble(this.D);
                    double d3 = this.F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.D.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.D.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.D.substring(0, indexOf).trim());
                double d32 = this.F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int h(int i) {
        double parseDouble;
        double d;
        try {
            if (this.y == null) {
                return 0;
            }
            String trim = this.y.trim();
            this.y = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.y.substring(0, this.y.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.y.contains("px") && !this.y.contains("PX")) {
                    parseDouble = Double.parseDouble(this.y);
                    double d3 = this.F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.y.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.y.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.y.substring(0, indexOf).trim());
                double d32 = this.F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int i(int i) {
        double parseDouble;
        double d;
        try {
            if (this.C == null) {
                return 0;
            }
            String trim = this.C.trim();
            this.C = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.C.substring(0, this.C.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.C.contains("px") && !this.C.contains("PX")) {
                    parseDouble = Double.parseDouble(this.C);
                    double d3 = this.F;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.C.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.C.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.C.substring(0, indexOf).trim());
                double d32 = this.F;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int j(int i) {
        double parseDouble;
        try {
            if (this.v == null || this.v.equalsIgnoreCase("equal")) {
                return -2;
            }
            String trim = this.v.trim();
            this.v = trim;
            int i2 = -1;
            if (trim.contains("%")) {
                String trim2 = this.v.substring(0, this.v.indexOf("%")).trim();
                if (!trim2.equals("100")) {
                    double parseDouble2 = Double.parseDouble(trim2);
                    double d = i;
                    Double.isNaN(d);
                    i2 = (int) ((parseDouble2 * d) / 100.0d);
                }
                return i2;
            }
            if (!this.v.contains("px") && !this.v.contains("PX")) {
                parseDouble = Double.parseDouble(this.v);
                double d2 = this.F;
                Double.isNaN(d2);
                return (int) (parseDouble * d2);
            }
            int indexOf = this.v.indexOf("px");
            if (-1 == indexOf) {
                indexOf = this.v.indexOf("PX");
            }
            parseDouble = Double.parseDouble(this.v.substring(0, indexOf).trim());
            double d22 = this.F;
            Double.isNaN(d22);
            return (int) (parseDouble * d22);
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        }
    }
}
