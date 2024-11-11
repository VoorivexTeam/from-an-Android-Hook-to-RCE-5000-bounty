package defpackage;

import android.content.Context;
import android.widget.CheckBox;
import com.comviva.webaxn.ui.f0;
import com.comviva.webaxn.ui.h;
import com.comviva.webaxn.ui.i;
import com.comviva.webaxn.ui.k;
import com.comviva.webaxn.ui.k1;
import com.comviva.webaxn.ui.l;
import com.comviva.webaxn.ui.m1;
import com.comviva.webaxn.ui.n1;
import com.comviva.webaxn.ui.p;
import com.comviva.webaxn.ui.v;
import com.comviva.webaxn.utils.e;
import com.comviva.webaxn.utils.l1;
import com.comviva.webaxn.utils.x1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Vector;

/* loaded from: classes.dex */
public class lj {
    zj a;
    Vector<e> b;
    boolean e;
    public HashMap<String, Vector<kj>> g;
    public HashMap<String, yj> h;
    public HashMap<String, Vector<kj>> i;
    public HashMap<String, Vector<kj>> j;
    public Vector<yj> c = new Vector<>();
    int d = -1;
    public boolean k = false;
    public int q = 0;
    public Vector<yj> r = null;
    public yj s = null;
    private boolean t = false;
    HashMap<l1, yj> f = new HashMap<>();
    public ArrayList<l1> l = new ArrayList<>();
    public HashMap<String, Integer> p = new HashMap<>();
    public yj m = null;
    public yj n = null;
    public ArrayList<yj> o = null;

    public lj(Context context) {
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.e = false;
        this.g = new HashMap<>();
        this.h = new HashMap<>();
        this.i = new HashMap<>();
        this.j = new HashMap<>();
    }

    public String a(Context context, yj yjVar) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        Vector<kj> vector = this.g.get(yjVar.V);
        if (vector != null) {
            int i = 0;
            while (i < vector.size()) {
                yj yjVar2 = vector.elementAt(i).d;
                n1 n1Var = yjVar2.a0;
                if (n1Var != null) {
                    if (n1Var instanceof h) {
                        ArrayList<CheckBox> m = ((h) n1Var).m();
                        for (int i2 = 0; i2 < m.size(); i2++) {
                            CheckBox checkBox = m.get(i2);
                            if ((checkBox.getTag() == null || !((String) checkBox.getTag()).equals("SELECTALL")) && checkBox.isChecked()) {
                                if (stringBuffer.length() != 0) {
                                    stringBuffer.append(";");
                                    stringBuffer2.append(",");
                                }
                                if (yjVar2.c0) {
                                    stringBuffer.append(i + i2);
                                    stringBuffer2.append("0");
                                } else {
                                    kj elementAt = yjVar2.P.elementAt(i2);
                                    String str = elementAt.b;
                                    if (str != null) {
                                        stringBuffer.append(str);
                                        stringBuffer2.append("1");
                                    } else {
                                        String str2 = elementAt.a;
                                        if (str2 != null) {
                                            stringBuffer.append(str2);
                                            stringBuffer2.append("2");
                                        }
                                    }
                                }
                            }
                        }
                    } else if (n1Var instanceof i) {
                        ArrayList<CheckBox> m2 = ((i) n1Var).m();
                        for (int i3 = 0; i3 < m2.size(); i3++) {
                            CheckBox checkBox2 = m2.get(i3);
                            if ((checkBox2.getTag() == null || !((String) checkBox2.getTag()).equals("SELECTALL")) && checkBox2.isChecked()) {
                                if (stringBuffer.length() != 0) {
                                    stringBuffer.append(";");
                                    stringBuffer2.append(",");
                                }
                                if (yjVar2.c0) {
                                    stringBuffer.append(i + i3);
                                    stringBuffer2.append("0");
                                } else {
                                    kj elementAt2 = yjVar2.P.elementAt(i3);
                                    String str3 = elementAt2.b;
                                    if (str3 != null) {
                                        stringBuffer.append(str3);
                                        stringBuffer2.append("1");
                                    } else {
                                        String str4 = elementAt2.a;
                                        if (str4 != null) {
                                            stringBuffer.append(str4);
                                            stringBuffer2.append("2");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i = i + (yjVar2.P.size() - 1) + 1;
            }
        }
        aj.a(context).f(yjVar.V, stringBuffer2.toString());
        return stringBuffer.toString();
    }

    public ArrayList<yj> a() {
        return this.o;
    }

    public void a(int i) {
        this.e = true;
        this.d = x1.a(i);
    }

    public void a(int i, String str) {
        this.p.put(str, Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            zj r1 = r6.a
            java.util.Vector<java.lang.String> r1 = r1.f
            int r1 = r1.size()
            if (r0 >= r1) goto La8
            zj r1 = r6.a
            java.util.Vector<java.lang.String> r2 = r1.f
            java.lang.Object r2 = r2.elementAt(r0)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            yj r1 = r1.a(r2, r3)
            if (r1 == 0) goto La4
            com.comviva.webaxn.ui.n1 r2 = r1.a0
            if (r2 == 0) goto La4
            int r3 = r1.e
            r4 = 3
            if (r3 != r4) goto L3c
            boolean r3 = r2 instanceof com.comviva.webaxn.ui.v
            if (r3 == 0) goto L31
            com.comviva.webaxn.ui.v r2 = (com.comviva.webaxn.ui.v) r2
            java.lang.String r2 = r2.m()
            goto L95
        L31:
            boolean r3 = r2 instanceof com.comviva.webaxn.ui.w
            if (r3 == 0) goto L93
            com.comviva.webaxn.ui.w r2 = (com.comviva.webaxn.ui.w) r2
            java.lang.String r2 = r2.m()
            goto L95
        L3c:
            r5 = 6
            if (r3 != r5) goto L55
            boolean r3 = r2 instanceof com.comviva.webaxn.ui.p
            if (r3 == 0) goto L4a
            com.comviva.webaxn.ui.p r2 = (com.comviva.webaxn.ui.p) r2
            java.lang.String r2 = r2.n()
            goto L95
        L4a:
            boolean r3 = r2 instanceof com.comviva.webaxn.ui.q
            if (r3 == 0) goto L93
            com.comviva.webaxn.ui.q r2 = (com.comviva.webaxn.ui.q) r2
            java.lang.String r2 = r2.n()
            goto L95
        L55:
            r5 = 4
            if (r3 != r5) goto L93
            int r3 = r1.R
            if (r3 == r5) goto L84
            if (r3 != r4) goto L5f
            goto L84
        L5f:
            r4 = 2
            if (r3 != r4) goto L6f
            boolean r3 = r2 instanceof com.comviva.webaxn.ui.h
            if (r3 != 0) goto L6a
            boolean r2 = r2 instanceof com.comviva.webaxn.ui.i
            if (r2 == 0) goto L93
        L6a:
            java.lang.String r2 = r6.a(r7, r1)
            goto L95
        L6f:
            r4 = 1
            if (r3 != r4) goto L93
            boolean r3 = r2 instanceof com.comviva.webaxn.ui.k
            if (r3 == 0) goto L7b
            java.lang.String r2 = r6.c(r7, r1)
            goto L95
        L7b:
            boolean r2 = r2 instanceof com.comviva.webaxn.ui.l
            if (r2 == 0) goto L93
            java.lang.String r2 = r6.b(r7, r1)
            goto L95
        L84:
            com.comviva.webaxn.ui.n1 r2 = r1.a0
            boolean r3 = r2 instanceof com.comviva.webaxn.ui.s0
            if (r3 != 0) goto L8e
            boolean r2 = r2 instanceof com.comviva.webaxn.ui.t0
            if (r2 == 0) goto L93
        L8e:
            java.lang.String r2 = r6.d(r7, r1)
            goto L95
        L93:
            java.lang.String r2 = ""
        L95:
            aj r3 = defpackage.aj.a(r7)
            java.util.HashMap r3 = r3.k()
            if (r3 == 0) goto La4
            java.lang.String r1 = r1.V
            r3.put(r1, r2)
        La4:
            int r0 = r0 + 1
            goto L1
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj.a(android.content.Context):void");
    }

    public void a(e eVar) {
        if (this.b == null) {
            this.b = new Vector<>();
        }
        this.b.addElement(eVar);
    }

    public void a(l1 l1Var) {
        this.l.add(l1Var);
        this.q++;
    }

    public void a(l1 l1Var, yj yjVar) {
        this.f.put(l1Var, yjVar);
        this.q++;
    }

    public void a(yj yjVar) {
        if (this.o == null) {
            this.o = new ArrayList<>();
        }
        this.o.add(yjVar);
    }

    public void a(zj zjVar) {
        Vector<yj> vector = this.c;
        if (vector != null) {
            vector.clear();
        }
        Vector<yj> vector2 = zjVar.e;
        if (vector2 != null) {
            int size = vector2.size();
            for (int i = 0; size > i; i++) {
                yj elementAt = zjVar.e.elementAt(i);
                if (elementAt != null && ((true == elementAt.X || true == elementAt.Y) && !this.c.contains(elementAt))) {
                    this.c.add(elementAt);
                }
            }
        }
        this.a = zjVar;
    }

    public void a(boolean z) {
        this.t = z;
    }

    public String b(Context context, yj yjVar) {
        String str;
        String str2;
        l lVar = (l) yjVar.a0;
        String str3 = null;
        if (yjVar.P != null && lVar.m() < yjVar.P.size()) {
            str = "0";
            if (yjVar.c0) {
                str2 = Integer.valueOf(lVar.m()).toString();
            } else {
                kj elementAt = yjVar.P.elementAt(lVar.m());
                String str4 = elementAt.b;
                if (str4 != null) {
                    str = "1";
                    str3 = str4;
                } else {
                    str2 = elementAt.a;
                    str = str2 != null ? "2" : "0";
                }
                aj.a(context).f(yjVar.V, str);
            }
            str3 = str2;
            aj.a(context).f(yjVar.V, str);
        }
        return str3;
    }

    public yj b() {
        return this.m;
    }

    public yj b(l1 l1Var) {
        return this.f.get(l1Var);
    }

    public void b(int i, String str) {
        if (this.p.size() == 0) {
            return;
        }
        this.p.remove(str);
    }

    public void b(Context context) {
        String str;
        String n;
        String str2;
        String n2;
        if (this.c != null) {
            aj a = aj.a((Context) null);
            int size = this.c.size();
            for (int i = 0; size > i; i++) {
                yj elementAt = this.c.elementAt(i);
                int i2 = elementAt.e;
                if (i2 == 3) {
                    v vVar = (v) elementAt.a0;
                    if (elementAt.X) {
                        str2 = elementAt.V;
                        n2 = vVar.m();
                        a.h(str2, n2);
                    } else if (elementAt.Y) {
                        str = elementAt.V;
                        n = vVar.m();
                        a.g(str, n);
                    }
                } else if (i2 == 6) {
                    p pVar = (p) elementAt.a0;
                    if (elementAt.X) {
                        str2 = elementAt.V;
                        n2 = pVar.n();
                        a.h(str2, n2);
                    } else if (elementAt.Y) {
                        str = elementAt.V;
                        n = pVar.n();
                        a.g(str, n);
                    }
                }
            }
            this.c.clear();
            this.c = null;
        }
        a(context);
    }

    public void b(yj yjVar) {
        this.m = yjVar;
    }

    public String c(Context context, yj yjVar) {
        String str;
        k kVar = (k) yjVar.a0;
        String str2 = "0";
        if (yjVar.c0) {
            str = Integer.valueOf(kVar.m()).toString();
        } else {
            kj elementAt = yjVar.P.elementAt(kVar.m());
            String str3 = elementAt.b;
            if (str3 != null) {
                str2 = "1";
                str = str3;
            } else {
                str = elementAt.a;
                if (str != null) {
                    str2 = "2";
                } else {
                    str = null;
                }
            }
        }
        aj.a(context).f(yjVar.V, str2);
        return str;
    }

    public yj c() {
        return this.n;
    }

    public void c(l1 l1Var) {
        this.f.remove(l1Var);
        this.q--;
    }

    public void c(yj yjVar) {
        this.n = yjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r7 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        r3 = r7;
        r5 = "2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        if (r7 != null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String d(android.content.Context r17, defpackage.yj r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.util.HashMap<java.lang.String, java.util.Vector<kj>> r2 = r0.i
            java.lang.String r3 = r1.V
            java.lang.Object r2 = r2.get(r3)
            java.util.Vector r2 = (java.util.Vector) r2
            r3 = 0
            if (r2 == 0) goto Lb4
            r4 = 0
            r5 = r3
            r6 = 0
            r7 = 0
        L15:
            int r8 = r2.size()
            if (r6 >= r8) goto Lb1
            java.lang.Object r8 = r2.elementAt(r6)
            kj r8 = (defpackage.kj) r8
            yj r8 = r8.d
            com.comviva.webaxn.ui.n1 r9 = r8.a0
            r10 = 1
            if (r9 == 0) goto La3
            boolean r11 = r9 instanceof com.comviva.webaxn.ui.s0
            java.lang.String r12 = "2"
            java.lang.String r13 = "1"
            java.lang.String r14 = "0"
            if (r11 == 0) goto L61
            com.comviva.webaxn.ui.s0 r9 = (com.comviva.webaxn.ui.s0) r9
            r11 = 0
        L35:
            int r15 = r9.n()
            if (r11 >= r15) goto La3
            android.view.View r15 = r9.g(r11)
            android.widget.RadioButton r15 = (android.widget.RadioButton) r15
            boolean r15 = r15.isChecked()
            if (r15 == 0) goto L5e
            boolean r7 = r8.c0
            if (r7 == 0) goto L4c
            goto L7e
        L4c:
            java.util.Vector<kj> r7 = r8.P
            java.lang.Object r7 = r7.elementAt(r11)
            kj r7 = (defpackage.kj) r7
            java.lang.String r9 = r7.b
            if (r9 == 0) goto L59
            goto L95
        L59:
            java.lang.String r7 = r7.a
            if (r7 == 0) goto L9e
            goto L9c
        L5e:
            int r11 = r11 + 1
            goto L35
        L61:
            boolean r11 = r9 instanceof com.comviva.webaxn.ui.t0
            if (r11 == 0) goto La3
            com.comviva.webaxn.ui.t0 r9 = (com.comviva.webaxn.ui.t0) r9
            r11 = 0
        L68:
            int r15 = r9.n()
            if (r11 >= r15) goto La3
            android.view.View r15 = r9.g(r11)
            android.widget.RadioButton r15 = (android.widget.RadioButton) r15
            boolean r15 = r15.isChecked()
            if (r15 == 0) goto La0
            boolean r7 = r8.c0
            if (r7 == 0) goto L89
        L7e:
            int r11 = r11 + r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.String r3 = r3.toString()
            r5 = r14
            goto L9e
        L89:
            java.util.Vector<kj> r7 = r8.P
            java.lang.Object r7 = r7.elementAt(r11)
            kj r7 = (defpackage.kj) r7
            java.lang.String r9 = r7.b
            if (r9 == 0) goto L98
        L95:
            r3 = r9
            r5 = r13
            goto L9e
        L98:
            java.lang.String r7 = r7.a
            if (r7 == 0) goto L9e
        L9c:
            r3 = r7
            r5 = r12
        L9e:
            r7 = 1
            goto La3
        La0:
            int r11 = r11 + 1
            goto L68
        La3:
            java.util.Vector<kj> r8 = r8.P
            int r8 = r8.size()
            int r8 = r8 - r10
            int r6 = r6 + r8
            if (r7 == 0) goto Lae
            goto Lb1
        Lae:
            int r6 = r6 + r10
            goto L15
        Lb1:
            r2 = r3
            r3 = r5
            goto Lb5
        Lb4:
            r2 = r3
        Lb5:
            aj r4 = defpackage.aj.a(r17)
            java.lang.String r1 = r1.V
            r4.f(r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj.d(android.content.Context, yj):java.lang.String");
    }

    public Vector<e> d() {
        return this.b;
    }

    public boolean d(l1 l1Var) {
        if (!this.l.contains(l1Var)) {
            return false;
        }
        this.l.remove(l1Var);
        this.q--;
        return true;
    }

    public int e() {
        return this.q;
    }

    public zj f() {
        return this.a;
    }

    public HashMap<String, Integer> g() {
        return this.p;
    }

    public int h() {
        return this.d;
    }

    public Set<l1> i() {
        return this.f.keySet();
    }

    public boolean j() {
        return this.t;
    }

    public boolean k() {
        return this.e;
    }

    public void l() {
        if (this.f.size() > 0) {
            this.k = true;
        }
        this.f.clear();
        this.q = 0;
    }

    public void m() {
        k1 k1Var = this.a.c;
        if (k1Var != null) {
            k1Var.n = false;
        }
    }

    public void n() {
        if (this.a.l != null) {
            for (int i = 0; i < this.a.l.size(); i++) {
                yj elementAt = this.a.l.elementAt(i);
                n1 n1Var = elementAt.a0;
                if (n1Var != null && elementAt.e == 13 && (n1Var instanceof f0)) {
                    ((f0) n1Var).c(elementAt.V);
                }
            }
        }
    }

    public void o() {
        if (this.a.l != null) {
            for (int i = 0; i < this.a.l.size(); i++) {
                yj elementAt = this.a.l.elementAt(i);
                n1 n1Var = elementAt.a0;
                if (n1Var != null && elementAt.e == 13 && (n1Var instanceof f0)) {
                    ((f0) n1Var).d(elementAt.V);
                }
            }
        }
    }

    public void p() {
        if (this.a.k != null) {
            for (int i = 0; i < this.a.k.size(); i++) {
                yj elementAt = this.a.k.elementAt(i);
                n1 n1Var = elementAt.a0;
                if (n1Var != null && elementAt.e == 30) {
                    if (n1Var instanceof com.comviva.webaxn.ui.l1) {
                        ((com.comviva.webaxn.ui.l1) n1Var).o();
                    } else if (n1Var instanceof m1) {
                        ((m1) n1Var).n();
                    }
                }
            }
        }
    }
}
