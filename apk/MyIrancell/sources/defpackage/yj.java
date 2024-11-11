package defpackage;

import android.graphics.Bitmap;
import com.comviva.webaxn.ui.j0;
import com.comviva.webaxn.ui.n1;
import com.comviva.webaxn.utils.u;
import com.comviva.webaxn.utils.x1;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class yj {
    public String A;
    public yj A0;
    public String B;
    public String C;
    public String D;
    public String F;
    public String G;
    public String H;
    public String I;
    public String I0;
    public dj J0;
    public bj L0;
    public String N;
    public String O;
    public HashMap<String, hj> P0;
    public String Q;
    public String Q0;
    public String R0;
    public String S0;
    public String T0;
    public int[] U;
    public String U0;
    public String V;
    public String V0;
    public String W;
    public String W0;
    public boolean X;
    public boolean X0;
    public boolean Y;
    public String Y0;
    public int Z0;
    public float a;
    public n1 a0;
    public String a1;
    public boolean c0;
    public String d;
    public String d0;
    public String e0;
    public int f0;
    public String f1;
    public boolean g0;
    public String g1;
    public Vector<sj> h0;
    public String i;
    public String j;
    public int j0;
    public String k;
    public String k0;
    public ij k1;
    public String l;
    public String l0;
    public fj l1;
    public String m;
    public String m0;
    public gj m1;
    public String n;
    public String n0;
    public Vector<uj> n1;
    public String o;
    public String o0;
    public u p;
    public String p0;
    public Vector<jj> p1;
    public qj q;
    public String q0;
    public vj q1;
    public tj r;
    public String r0;
    public String r1;
    public String s;
    public String t;
    public byte[] t0;
    public String t1;
    public String u;
    public byte[] u0;
    public String u1;
    public String v;
    public byte[] v0;
    public String w;
    public byte[] w0;
    public String x;
    public Bitmap x0;
    public Bitmap y0;
    public Vector<yj> z0;
    public boolean b = true;
    public boolean c = false;
    public int e = 0;
    public boolean f = true;
    public String g = "L";
    public String h = "T";
    public String y = null;
    public String z = null;
    public boolean E = false;
    public boolean J = false;
    public boolean K = false;
    public Vector<tj> L = null;
    public boolean M = true;
    public Vector<kj> P = new Vector<>();
    public int R = 1;
    public int S = 0;
    public boolean T = true;
    public boolean Z = true;
    public int i0 = 1;
    public int s0 = 2;
    public String B0 = null;
    public boolean C0 = false;
    public boolean D0 = false;
    public String E0 = null;
    public String G0 = null;
    public int K0 = 0;
    public jj M0 = null;
    public oj N0 = null;
    public ej O0 = null;
    public boolean b1 = false;
    public int c1 = -1;
    public float d1 = n1.r;
    public boolean e1 = false;
    public int h1 = -1;
    public int i1 = -1;
    public boolean j1 = false;
    public boolean o1 = false;
    public boolean s1 = false;
    public int F0 = -1;
    private boolean H0 = false;
    public Vector<j0> b0 = new Vector<>();

    /* loaded from: classes.dex */
    public enum a {
        FOCUS,
        FILLED,
        ERROR
    }

    public yj(float f) {
        this.a = f;
    }

    public int a() {
        return x1.a(this.F0);
    }

    public int a(int i) {
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
                    double d3 = this.a;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.D.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.D.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.D.substring(0, indexOf).trim());
                double d32 = this.a;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void a(sj sjVar) {
        if (this.h0 == null) {
            this.h0 = new Vector<>();
        }
        this.h0.addElement(sjVar);
    }

    public void a(yj yjVar) {
        if (this.z0 == null) {
            this.z0 = new Vector<>();
        }
        this.z0.addElement(yjVar);
    }

    public int b(int i) {
        double parseDouble;
        double d;
        try {
            if (this.I == null) {
                return 0;
            }
            String trim = this.I.trim();
            this.I = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.I.substring(0, this.I.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.I.contains("px") && !this.I.contains("PX")) {
                    parseDouble = Double.parseDouble(this.I);
                    double d3 = this.a;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.I.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.I.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.I.substring(0, indexOf).trim());
                double d32 = this.a;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean b() {
        return this.H0;
    }

    public int c(int i) {
        double d;
        try {
            if (this.n0 == null || this.n0.equalsIgnoreCase("equal")) {
                return -2;
            }
            String trim = this.n0.trim();
            this.n0 = trim;
            if (!trim.contains("%")) {
                if (!this.n0.contains("px") && !this.n0.contains("PX")) {
                    double parseDouble = Double.parseDouble(this.n0.trim());
                    if (parseDouble == -3.0d) {
                        return -3;
                    }
                    double d2 = this.a;
                    Double.isNaN(d2);
                    d = parseDouble * d2;
                }
                int indexOf = this.n0.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.n0.indexOf("PX");
                }
                double parseDouble2 = Double.parseDouble(this.n0.substring(0, indexOf).trim());
                if (parseDouble2 == -3.0d) {
                    return -3;
                }
                double d3 = this.a;
                Double.isNaN(d3);
                if (d3 * parseDouble2 > 0.0d) {
                    double d4 = this.a;
                    Double.isNaN(d4);
                    if (d4 * parseDouble2 < 1.0d) {
                        return 1;
                    }
                }
                double d5 = this.a;
                Double.isNaN(d5);
                return (int) (parseDouble2 * d5);
            }
            double parseDouble3 = Double.parseDouble(this.n0.substring(0, this.n0.indexOf("%")).trim());
            if (parseDouble3 == -3.0d) {
                return -3;
            }
            double d6 = i;
            Double.isNaN(d6);
            d = (parseDouble3 * d6) / 100.0d;
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        }
    }

    public int d(int i) {
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
                    double d3 = this.a;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.A.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.A.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.A.substring(0, indexOf).trim());
                double d32 = this.a;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int e(int i) {
        double parseDouble;
        double d;
        try {
            if (this.F == null) {
                return 0;
            }
            String trim = this.F.trim();
            this.F = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.F.substring(0, this.F.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.F.contains("px") && !this.F.contains("PX")) {
                    parseDouble = Double.parseDouble(this.F);
                    double d3 = this.a;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.F.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.F.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.F.substring(0, indexOf).trim());
                double d32 = this.a;
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
        double d;
        try {
            if (this.o0 == null || this.o0.equalsIgnoreCase("equal")) {
                return -2;
            }
            String trim = this.o0.trim();
            this.o0 = trim;
            if (!trim.contains("%")) {
                if (!this.o0.contains("px") && !this.o0.contains("PX")) {
                    double parseDouble = Double.parseDouble(this.o0.trim());
                    if (parseDouble == -3.0d) {
                        return -3;
                    }
                    double d2 = this.a;
                    Double.isNaN(d2);
                    d = parseDouble * d2;
                }
                int indexOf = this.o0.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.o0.indexOf("PX");
                }
                double parseDouble2 = Double.parseDouble(this.o0.substring(0, indexOf).trim());
                if (parseDouble2 == -3.0d) {
                    return -3;
                }
                double d3 = this.a;
                Double.isNaN(d3);
                if (d3 * parseDouble2 > 0.0d) {
                    double d4 = this.a;
                    Double.isNaN(d4);
                    if (d4 * parseDouble2 < 1.0d) {
                        return 1;
                    }
                }
                double d5 = this.a;
                Double.isNaN(d5);
                return (int) (parseDouble2 * d5);
            }
            double parseDouble3 = Double.parseDouble(this.o0.substring(0, this.o0.indexOf("%")).trim());
            if (parseDouble3 == -3.0d) {
                return -3;
            }
            double d6 = i;
            Double.isNaN(d6);
            d = (parseDouble3 * d6) / 100.0d;
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        }
    }

    public int g(int i) {
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
                    double d3 = this.a;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.C.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.C.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.C.substring(0, indexOf).trim());
                double d32 = this.a;
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
            if (this.H == null) {
                return 0;
            }
            String trim = this.H.trim();
            this.H = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.H.substring(0, this.H.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.H.contains("px") && !this.H.contains("PX")) {
                    parseDouble = Double.parseDouble(this.H);
                    double d3 = this.a;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.H.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.H.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.H.substring(0, indexOf).trim());
                double d32 = this.a;
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
                    double d3 = this.a;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.B.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.B.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.B.substring(0, indexOf).trim());
                double d32 = this.a;
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
        double d;
        try {
            if (this.G == null) {
                return 0;
            }
            String trim = this.G.trim();
            this.G = trim;
            if (trim.contains("%")) {
                double parseDouble2 = Double.parseDouble(this.G.substring(0, this.G.indexOf("%")).trim());
                double d2 = i;
                Double.isNaN(d2);
                d = (parseDouble2 * d2) / 100.0d;
            } else {
                if (!this.G.contains("px") && !this.G.contains("PX")) {
                    parseDouble = Double.parseDouble(this.G);
                    double d3 = this.a;
                    Double.isNaN(d3);
                    d = parseDouble * d3;
                }
                int indexOf = this.G.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.G.indexOf("PX");
                }
                parseDouble = Double.parseDouble(this.G.substring(0, indexOf).trim());
                double d32 = this.a;
                Double.isNaN(d32);
                d = parseDouble * d32;
            }
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int k(int i) {
        double d;
        try {
            if (this.m0 == null || this.m0.equalsIgnoreCase("equal")) {
                return -2;
            }
            String trim = this.m0.trim();
            this.m0 = trim;
            if (!trim.contains("%")) {
                if (!this.m0.contains("px") && !this.m0.contains("PX")) {
                    double parseDouble = Double.parseDouble(this.m0.trim());
                    if (parseDouble == -3.0d) {
                        return -3;
                    }
                    double d2 = this.a;
                    Double.isNaN(d2);
                    d = parseDouble * d2;
                }
                int indexOf = this.m0.indexOf("px");
                if (-1 == indexOf) {
                    indexOf = this.m0.indexOf("PX");
                }
                double parseDouble2 = Double.parseDouble(this.m0.substring(0, indexOf).trim());
                if (parseDouble2 == -3.0d) {
                    return -3;
                }
                double d3 = this.a;
                Double.isNaN(d3);
                if (d3 * parseDouble2 > 0.0d) {
                    double d4 = this.a;
                    Double.isNaN(d4);
                    if (d4 * parseDouble2 < 1.0d) {
                        return 1;
                    }
                }
                double d5 = this.a;
                Double.isNaN(d5);
                return (int) (parseDouble2 * d5);
            }
            double parseDouble3 = Double.parseDouble(this.m0.substring(0, this.m0.indexOf("%")).trim());
            if (parseDouble3 == -3.0d) {
                return -3;
            }
            double d6 = i;
            Double.isNaN(d6);
            d = (parseDouble3 * d6) / 100.0d;
            return (int) d;
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        }
    }

    public void l(int i) {
        this.H0 = true;
        this.F0 = i;
    }
}
