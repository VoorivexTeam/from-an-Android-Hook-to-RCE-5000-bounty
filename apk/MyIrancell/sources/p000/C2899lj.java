package p000;

import android.content.Context;
import android.widget.CheckBox;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0627f0;
import com.comviva.webaxn.p002ui.C0632h;
import com.comviva.webaxn.p002ui.C0635i;
import com.comviva.webaxn.p002ui.C0641k;
import com.comviva.webaxn.p002ui.C0643k1;
import com.comviva.webaxn.p002ui.C0644l;
import com.comviva.webaxn.p002ui.C0646l1;
import com.comviva.webaxn.p002ui.C0649m1;
import com.comviva.webaxn.p002ui.C0656p;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.utils.C0696e;
import com.comviva.webaxn.utils.C0719l1;
import com.comviva.webaxn.utils.C0755x1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Vector;

/* renamed from: lj */
/* loaded from: classes.dex */
public class C2899lj {

    /* renamed from: a */
    C3531zj f11881a;

    /* renamed from: b */
    Vector<C0696e> f11882b;

    /* renamed from: e */
    boolean f11885e;

    /* renamed from: g */
    public HashMap<String, Vector<C2862kj>> f11887g;

    /* renamed from: h */
    public HashMap<String, C3489yj> f11888h;

    /* renamed from: i */
    public HashMap<String, Vector<C2862kj>> f11889i;

    /* renamed from: j */
    public HashMap<String, Vector<C2862kj>> f11890j;

    /* renamed from: c */
    public Vector<C3489yj> f11883c = new Vector<>();

    /* renamed from: d */
    int f11884d = -1;

    /* renamed from: k */
    public boolean f11891k = false;

    /* renamed from: q */
    public int f11897q = 0;

    /* renamed from: r */
    public Vector<C3489yj> f11898r = null;

    /* renamed from: s */
    public C3489yj f11899s = null;

    /* renamed from: t */
    private boolean f11900t = false;

    /* renamed from: f */
    HashMap<C0719l1, C3489yj> f11886f = new HashMap<>();

    /* renamed from: l */
    public ArrayList<C0719l1> f11892l = new ArrayList<>();

    /* renamed from: p */
    public HashMap<String, Integer> f11896p = new HashMap<>();

    /* renamed from: m */
    public C3489yj f11893m = null;

    /* renamed from: n */
    public C3489yj f11894n = null;

    /* renamed from: o */
    public ArrayList<C3489yj> f11895o = null;

    public C2899lj(Context context) {
        this.f11885e = false;
        this.f11887g = null;
        this.f11888h = null;
        this.f11889i = null;
        this.f11890j = null;
        this.f11885e = false;
        this.f11887g = new HashMap<>();
        this.f11888h = new HashMap<>();
        this.f11889i = new HashMap<>();
        this.f11890j = new HashMap<>();
    }

    /* renamed from: a */
    public String m13876a(Context context, C3489yj c3489yj) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        Vector<C2862kj> vector = this.f11887g.get(c3489yj.f14186V);
        if (vector != null) {
            int i = 0;
            while (i < vector.size()) {
                C3489yj c3489yj2 = vector.elementAt(i).f11759d;
                AbstractC0652n1 abstractC0652n1 = c3489yj2.f14197a0;
                if (abstractC0652n1 != null) {
                    if (abstractC0652n1 instanceof C0632h) {
                        ArrayList<CheckBox> m4428m = ((C0632h) abstractC0652n1).m4428m();
                        for (int i2 = 0; i2 < m4428m.size(); i2++) {
                            CheckBox checkBox = m4428m.get(i2);
                            if ((checkBox.getTag() == null || !((String) checkBox.getTag()).equals("SELECTALL")) && checkBox.isChecked()) {
                                if (stringBuffer.length() != 0) {
                                    stringBuffer.append(";");
                                    stringBuffer2.append(",");
                                }
                                if (c3489yj2.f14203c0) {
                                    stringBuffer.append(i + i2);
                                    stringBuffer2.append("0");
                                } else {
                                    C2862kj elementAt = c3489yj2.f14174P.elementAt(i2);
                                    String str = elementAt.f11757b;
                                    if (str != null) {
                                        stringBuffer.append(str);
                                        stringBuffer2.append("1");
                                    } else {
                                        String str2 = elementAt.f11756a;
                                        if (str2 != null) {
                                            stringBuffer.append(str2);
                                            stringBuffer2.append("2");
                                        }
                                    }
                                }
                            }
                        }
                    } else if (abstractC0652n1 instanceof C0635i) {
                        ArrayList<CheckBox> m4471m = ((C0635i) abstractC0652n1).m4471m();
                        for (int i3 = 0; i3 < m4471m.size(); i3++) {
                            CheckBox checkBox2 = m4471m.get(i3);
                            if ((checkBox2.getTag() == null || !((String) checkBox2.getTag()).equals("SELECTALL")) && checkBox2.isChecked()) {
                                if (stringBuffer.length() != 0) {
                                    stringBuffer.append(";");
                                    stringBuffer2.append(",");
                                }
                                if (c3489yj2.f14203c0) {
                                    stringBuffer.append(i + i3);
                                    stringBuffer2.append("0");
                                } else {
                                    C2862kj elementAt2 = c3489yj2.f14174P.elementAt(i3);
                                    String str3 = elementAt2.f11757b;
                                    if (str3 != null) {
                                        stringBuffer.append(str3);
                                        stringBuffer2.append("1");
                                    } else {
                                        String str4 = elementAt2.f11756a;
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
                i = i + (c3489yj2.f14174P.size() - 1) + 1;
            }
        }
        C0023aj.m160a(context).m196f(c3489yj.f14186V, stringBuffer2.toString());
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public ArrayList<C3489yj> m13877a() {
        return this.f11895o;
    }

    /* renamed from: a */
    public void m13878a(int i) {
        this.f11885e = true;
        this.f11884d = C0755x1.m6113a(i);
    }

    /* renamed from: a */
    public void m13879a(int i, String str) {
        this.f11896p.put(str, Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m13880a(android.content.Context r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            zj r1 = r6.f11881a
            java.util.Vector<java.lang.String> r1 = r1.f14507f
            int r1 = r1.size()
            if (r0 >= r1) goto La8
            zj r1 = r6.f11881a
            java.util.Vector<java.lang.String> r2 = r1.f14507f
            java.lang.Object r2 = r2.elementAt(r0)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            yj r1 = r1.m16930a(r2, r3)
            if (r1 == 0) goto La4
            com.comviva.webaxn.ui.n1 r2 = r1.f14197a0
            if (r2 == 0) goto La4
            int r3 = r1.f14208e
            r4 = 3
            if (r3 != r4) goto L3c
            boolean r3 = r2 instanceof com.comviva.webaxn.p002ui.C0668v
            if (r3 == 0) goto L31
            com.comviva.webaxn.ui.v r2 = (com.comviva.webaxn.p002ui.C0668v) r2
            java.lang.String r2 = r2.m5034m()
            goto L95
        L31:
            boolean r3 = r2 instanceof com.comviva.webaxn.p002ui.C0670w
            if (r3 == 0) goto L93
            com.comviva.webaxn.ui.w r2 = (com.comviva.webaxn.p002ui.C0670w) r2
            java.lang.String r2 = r2.m5097m()
            goto L95
        L3c:
            r5 = 6
            if (r3 != r5) goto L55
            boolean r3 = r2 instanceof com.comviva.webaxn.p002ui.C0656p
            if (r3 == 0) goto L4a
            com.comviva.webaxn.ui.p r2 = (com.comviva.webaxn.p002ui.C0656p) r2
            java.lang.String r2 = r2.m4870n()
            goto L95
        L4a:
            boolean r3 = r2 instanceof com.comviva.webaxn.p002ui.C0658q
            if (r3 == 0) goto L93
            com.comviva.webaxn.ui.q r2 = (com.comviva.webaxn.p002ui.C0658q) r2
            java.lang.String r2 = r2.m4891n()
            goto L95
        L55:
            r5 = 4
            if (r3 != r5) goto L93
            int r3 = r1.f14178R
            if (r3 == r5) goto L84
            if (r3 != r4) goto L5f
            goto L84
        L5f:
            r4 = 2
            if (r3 != r4) goto L6f
            boolean r3 = r2 instanceof com.comviva.webaxn.p002ui.C0632h
            if (r3 != 0) goto L6a
            boolean r2 = r2 instanceof com.comviva.webaxn.p002ui.C0635i
            if (r2 == 0) goto L93
        L6a:
            java.lang.String r2 = r6.m13876a(r7, r1)
            goto L95
        L6f:
            r4 = 1
            if (r3 != r4) goto L93
            boolean r3 = r2 instanceof com.comviva.webaxn.p002ui.C0641k
            if (r3 == 0) goto L7b
            java.lang.String r2 = r6.m13893c(r7, r1)
            goto L95
        L7b:
            boolean r2 = r2 instanceof com.comviva.webaxn.p002ui.C0644l
            if (r2 == 0) goto L93
            java.lang.String r2 = r6.m13887b(r7, r1)
            goto L95
        L84:
            com.comviva.webaxn.ui.n1 r2 = r1.f14197a0
            boolean r3 = r2 instanceof com.comviva.webaxn.p002ui.C0663s0
            if (r3 != 0) goto L8e
            boolean r2 = r2 instanceof com.comviva.webaxn.p002ui.C0665t0
            if (r2 == 0) goto L93
        L8e:
            java.lang.String r2 = r6.m13897d(r7, r1)
            goto L95
        L93:
            java.lang.String r2 = ""
        L95:
            aj r3 = p000.C0023aj.m160a(r7)
            java.util.HashMap r3 = r3.m210k()
            if (r3 == 0) goto La4
            java.lang.String r1 = r1.f14186V
            r3.put(r1, r2)
        La4:
            int r0 = r0 + 1
            goto L1
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2899lj.m13880a(android.content.Context):void");
    }

    /* renamed from: a */
    public void m13881a(C0696e c0696e) {
        if (this.f11882b == null) {
            this.f11882b = new Vector<>();
        }
        this.f11882b.addElement(c0696e);
    }

    /* renamed from: a */
    public void m13882a(C0719l1 c0719l1) {
        this.f11892l.add(c0719l1);
        this.f11897q++;
    }

    /* renamed from: a */
    public void m13883a(C0719l1 c0719l1, C3489yj c3489yj) {
        this.f11886f.put(c0719l1, c3489yj);
        this.f11897q++;
    }

    /* renamed from: a */
    public void m13884a(C3489yj c3489yj) {
        if (this.f11895o == null) {
            this.f11895o = new ArrayList<>();
        }
        this.f11895o.add(c3489yj);
    }

    /* renamed from: a */
    public void m13885a(C3531zj c3531zj) {
        Vector<C3489yj> vector = this.f11883c;
        if (vector != null) {
            vector.clear();
        }
        Vector<C3489yj> vector2 = c3531zj.f14506e;
        if (vector2 != null) {
            int size = vector2.size();
            for (int i = 0; size > i; i++) {
                C3489yj elementAt = c3531zj.f14506e.elementAt(i);
                if (elementAt != null && ((true == elementAt.f14190X || true == elementAt.f14192Y) && !this.f11883c.contains(elementAt))) {
                    this.f11883c.add(elementAt);
                }
            }
        }
        this.f11881a = c3531zj;
    }

    /* renamed from: a */
    public void m13886a(boolean z) {
        this.f11900t = z;
    }

    /* renamed from: b */
    public String m13887b(Context context, C3489yj c3489yj) {
        String str;
        String str2;
        C0644l c0644l = (C0644l) c3489yj.f14197a0;
        String str3 = null;
        if (c3489yj.f14174P != null && c0644l.m4631m() < c3489yj.f14174P.size()) {
            str = "0";
            if (c3489yj.f14203c0) {
                str2 = Integer.valueOf(c0644l.m4631m()).toString();
            } else {
                C2862kj elementAt = c3489yj.f14174P.elementAt(c0644l.m4631m());
                String str4 = elementAt.f11757b;
                if (str4 != null) {
                    str = "1";
                    str3 = str4;
                } else {
                    str2 = elementAt.f11756a;
                    str = str2 != null ? "2" : "0";
                }
                C0023aj.m160a(context).m196f(c3489yj.f14186V, str);
            }
            str3 = str2;
            C0023aj.m160a(context).m196f(c3489yj.f14186V, str);
        }
        return str3;
    }

    /* renamed from: b */
    public C3489yj m13888b() {
        return this.f11893m;
    }

    /* renamed from: b */
    public C3489yj m13889b(C0719l1 c0719l1) {
        return this.f11886f.get(c0719l1);
    }

    /* renamed from: b */
    public void m13890b(int i, String str) {
        if (this.f11896p.size() == 0) {
            return;
        }
        this.f11896p.remove(str);
    }

    /* renamed from: b */
    public void m13891b(Context context) {
        String str;
        String m4870n;
        String str2;
        String m4870n2;
        if (this.f11883c != null) {
            C0023aj m160a = C0023aj.m160a((Context) null);
            int size = this.f11883c.size();
            for (int i = 0; size > i; i++) {
                C3489yj elementAt = this.f11883c.elementAt(i);
                int i2 = elementAt.f14208e;
                if (i2 == 3) {
                    C0668v c0668v = (C0668v) elementAt.f14197a0;
                    if (elementAt.f14190X) {
                        str2 = elementAt.f14186V;
                        m4870n2 = c0668v.m5034m();
                        m160a.m202h(str2, m4870n2);
                    } else if (elementAt.f14192Y) {
                        str = elementAt.f14186V;
                        m4870n = c0668v.m5034m();
                        m160a.m199g(str, m4870n);
                    }
                } else if (i2 == 6) {
                    C0656p c0656p = (C0656p) elementAt.f14197a0;
                    if (elementAt.f14190X) {
                        str2 = elementAt.f14186V;
                        m4870n2 = c0656p.m4870n();
                        m160a.m202h(str2, m4870n2);
                    } else if (elementAt.f14192Y) {
                        str = elementAt.f14186V;
                        m4870n = c0656p.m4870n();
                        m160a.m199g(str, m4870n);
                    }
                }
            }
            this.f11883c.clear();
            this.f11883c = null;
        }
        m13880a(context);
    }

    /* renamed from: b */
    public void m13892b(C3489yj c3489yj) {
        this.f11893m = c3489yj;
    }

    /* renamed from: c */
    public String m13893c(Context context, C3489yj c3489yj) {
        String str;
        C0641k c0641k = (C0641k) c3489yj.f14197a0;
        String str2 = "0";
        if (c3489yj.f14203c0) {
            str = Integer.valueOf(c0641k.m4534m()).toString();
        } else {
            C2862kj elementAt = c3489yj.f14174P.elementAt(c0641k.m4534m());
            String str3 = elementAt.f11757b;
            if (str3 != null) {
                str2 = "1";
                str = str3;
            } else {
                str = elementAt.f11756a;
                if (str != null) {
                    str2 = "2";
                } else {
                    str = null;
                }
            }
        }
        C0023aj.m160a(context).m196f(c3489yj.f14186V, str2);
        return str;
    }

    /* renamed from: c */
    public C3489yj m13894c() {
        return this.f11894n;
    }

    /* renamed from: c */
    public void m13895c(C0719l1 c0719l1) {
        this.f11886f.remove(c0719l1);
        this.f11897q--;
    }

    /* renamed from: c */
    public void m13896c(C3489yj c3489yj) {
        this.f11894n = c3489yj;
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m13897d(android.content.Context r17, p000.C3489yj r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.util.HashMap<java.lang.String, java.util.Vector<kj>> r2 = r0.f11889i
            java.lang.String r3 = r1.f14186V
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
            kj r8 = (p000.C2862kj) r8
            yj r8 = r8.f11759d
            com.comviva.webaxn.ui.n1 r9 = r8.f14197a0
            r10 = 1
            if (r9 == 0) goto La3
            boolean r11 = r9 instanceof com.comviva.webaxn.p002ui.C0663s0
            java.lang.String r12 = "2"
            java.lang.String r13 = "1"
            java.lang.String r14 = "0"
            if (r11 == 0) goto L61
            com.comviva.webaxn.ui.s0 r9 = (com.comviva.webaxn.p002ui.C0663s0) r9
            r11 = 0
        L35:
            int r15 = r9.m4961n()
            if (r11 >= r15) goto La3
            android.view.View r15 = r9.m4958g(r11)
            android.widget.RadioButton r15 = (android.widget.RadioButton) r15
            boolean r15 = r15.isChecked()
            if (r15 == 0) goto L5e
            boolean r7 = r8.f14203c0
            if (r7 == 0) goto L4c
            goto L7e
        L4c:
            java.util.Vector<kj> r7 = r8.f14174P
            java.lang.Object r7 = r7.elementAt(r11)
            kj r7 = (p000.C2862kj) r7
            java.lang.String r9 = r7.f11757b
            if (r9 == 0) goto L59
            goto L95
        L59:
            java.lang.String r7 = r7.f11756a
            if (r7 == 0) goto L9e
            goto L9c
        L5e:
            int r11 = r11 + 1
            goto L35
        L61:
            boolean r11 = r9 instanceof com.comviva.webaxn.p002ui.C0665t0
            if (r11 == 0) goto La3
            com.comviva.webaxn.ui.t0 r9 = (com.comviva.webaxn.p002ui.C0665t0) r9
            r11 = 0
        L68:
            int r15 = r9.m4981n()
            if (r11 >= r15) goto La3
            android.view.View r15 = r9.m4978g(r11)
            android.widget.RadioButton r15 = (android.widget.RadioButton) r15
            boolean r15 = r15.isChecked()
            if (r15 == 0) goto La0
            boolean r7 = r8.f14203c0
            if (r7 == 0) goto L89
        L7e:
            int r11 = r11 + r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.String r3 = r3.toString()
            r5 = r14
            goto L9e
        L89:
            java.util.Vector<kj> r7 = r8.f14174P
            java.lang.Object r7 = r7.elementAt(r11)
            kj r7 = (p000.C2862kj) r7
            java.lang.String r9 = r7.f11757b
            if (r9 == 0) goto L98
        L95:
            r3 = r9
            r5 = r13
            goto L9e
        L98:
            java.lang.String r7 = r7.f11756a
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
            java.util.Vector<kj> r8 = r8.f14174P
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
            aj r4 = p000.C0023aj.m160a(r17)
            java.lang.String r1 = r1.f14186V
            r4.m196f(r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2899lj.m13897d(android.content.Context, yj):java.lang.String");
    }

    /* renamed from: d */
    public Vector<C0696e> m13898d() {
        return this.f11882b;
    }

    /* renamed from: d */
    public boolean m13899d(C0719l1 c0719l1) {
        if (!this.f11892l.contains(c0719l1)) {
            return false;
        }
        this.f11892l.remove(c0719l1);
        this.f11897q--;
        return true;
    }

    /* renamed from: e */
    public int m13900e() {
        return this.f11897q;
    }

    /* renamed from: f */
    public C3531zj m13901f() {
        return this.f11881a;
    }

    /* renamed from: g */
    public HashMap<String, Integer> m13902g() {
        return this.f11896p;
    }

    /* renamed from: h */
    public int m13903h() {
        return this.f11884d;
    }

    /* renamed from: i */
    public Set<C0719l1> m13904i() {
        return this.f11886f.keySet();
    }

    /* renamed from: j */
    public boolean m13905j() {
        return this.f11900t;
    }

    /* renamed from: k */
    public boolean m13906k() {
        return this.f11885e;
    }

    /* renamed from: l */
    public void m13907l() {
        if (this.f11886f.size() > 0) {
            this.f11891k = true;
        }
        this.f11886f.clear();
        this.f11897q = 0;
    }

    /* renamed from: m */
    public void m13908m() {
        C0643k1 c0643k1 = this.f11881a.f14504c;
        if (c0643k1 != null) {
            c0643k1.f3936n = false;
        }
    }

    /* renamed from: n */
    public void m13909n() {
        if (this.f11881a.f14513l != null) {
            for (int i = 0; i < this.f11881a.f14513l.size(); i++) {
                C3489yj elementAt = this.f11881a.f14513l.elementAt(i);
                AbstractC0652n1 abstractC0652n1 = elementAt.f14197a0;
                if (abstractC0652n1 != null && elementAt.f14208e == 13 && (abstractC0652n1 instanceof C0627f0)) {
                    ((C0627f0) abstractC0652n1).m4322c(elementAt.f14186V);
                }
            }
        }
    }

    /* renamed from: o */
    public void m13910o() {
        if (this.f11881a.f14513l != null) {
            for (int i = 0; i < this.f11881a.f14513l.size(); i++) {
                C3489yj elementAt = this.f11881a.f14513l.elementAt(i);
                AbstractC0652n1 abstractC0652n1 = elementAt.f14197a0;
                if (abstractC0652n1 != null && elementAt.f14208e == 13 && (abstractC0652n1 instanceof C0627f0)) {
                    ((C0627f0) abstractC0652n1).m4323d(elementAt.f14186V);
                }
            }
        }
    }

    /* renamed from: p */
    public void m13911p() {
        if (this.f11881a.f14512k != null) {
            for (int i = 0; i < this.f11881a.f14512k.size(); i++) {
                C3489yj elementAt = this.f11881a.f14512k.elementAt(i);
                AbstractC0652n1 abstractC0652n1 = elementAt.f14197a0;
                if (abstractC0652n1 != null && elementAt.f14208e == 30) {
                    if (abstractC0652n1 instanceof C0646l1) {
                        ((C0646l1) abstractC0652n1).m4681o();
                    } else if (abstractC0652n1 instanceof C0649m1) {
                        ((C0649m1) abstractC0652n1).m4696n();
                    }
                }
            }
        }
    }
}
