package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.CheckBox;
import androidx.appcompat.widget.C0186n0;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0624e0;
import com.comviva.webaxn.p002ui.C0626f;
import com.comviva.webaxn.p002ui.C0627f0;
import com.comviva.webaxn.p002ui.C0629g;
import com.comviva.webaxn.p002ui.C0632h;
import com.comviva.webaxn.p002ui.C0635i;
import com.comviva.webaxn.p002ui.C0641k;
import com.comviva.webaxn.p002ui.C0642k0;
import com.comviva.webaxn.p002ui.C0644l;
import com.comviva.webaxn.p002ui.C0656p;
import com.comviva.webaxn.p002ui.C0658q;
import com.comviva.webaxn.p002ui.C0663s0;
import com.comviva.webaxn.p002ui.C0664t;
import com.comviva.webaxn.p002ui.C0665t0;
import com.comviva.webaxn.p002ui.C0666u;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import com.comviva.webaxn.p002ui.C0673x0;
import com.comviva.webaxn.utils.C0690c;
import com.comviva.webaxn.utils.C0714k;
import com.comviva.webaxn.utils.C0716k1;
import com.comviva.webaxn.utils.C0719l1;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0755x1;
import java.util.ArrayList;
import java.util.Vector;

/* renamed from: pi */
/* loaded from: classes.dex */
public class C3086pi {

    /* renamed from: a */
    private C0719l1 f12602a;

    /* renamed from: b */
    private Context f12603b;

    public C3086pi(C0719l1 c0719l1, C3400wj c3400wj, Context context) {
        this.f12602a = c0719l1;
        this.f12603b = context;
    }

    /* renamed from: a */
    private String m14756a(String str) {
        if (str == null || !str.startsWith("%") || !str.endsWith("%")) {
            return str;
        }
        return C0714k.m5755a(this.f12603b, str.substring(1, str.length() - 1));
    }

    /* renamed from: a */
    private String m14757a(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj) {
        AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
        String m4870n = abstractC0652n1 instanceof C0656p ? ((C0656p) abstractC0652n1).m4870n() : abstractC0652n1 instanceof C0658q ? ((C0658q) abstractC0652n1).m4891n() : "";
        c3360vi.m16030a(c3307ui, 0).m15817b(m4870n);
        return m4870n;
    }

    /* renamed from: a */
    private String m14758a(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj, C0716k1 c0716k1) {
        AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
        String m5034m = abstractC0652n1 instanceof C0668v ? ((C0668v) abstractC0652n1).m5034m() : abstractC0652n1 instanceof C0670w ? ((C0670w) abstractC0652n1).m5097m() : "";
        if (!TextUtils.isEmpty(m5034m) && !C0755x1.f5245c && c0716k1.f4903b) {
            m5034m = C0690c.m5373a(this.f12603b, m5034m);
            m14760a(c3360vi, c3307ui);
        }
        String str = m5034m != null ? m5034m : "";
        c3360vi.m16030a(c3307ui, 0).m15817b(str);
        return str;
    }

    /* renamed from: a */
    private String m14759a(C3489yj c3489yj) {
        Vector<C2862kj> vector;
        Vector<C2862kj> vector2;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        Vector<C2862kj> vector3 = this.f12602a.f4971x.f11887g.get(c3489yj.f14186V);
        if (vector3 != null) {
            int i = 0;
            while (i < vector3.size()) {
                C3489yj c3489yj2 = vector3.elementAt(i).f11759d;
                AbstractC0652n1 abstractC0652n1 = c3489yj2.f14197a0;
                if (abstractC0652n1 != null) {
                    if (abstractC0652n1 instanceof C0632h) {
                        ArrayList<CheckBox> m4428m = ((C0632h) abstractC0652n1).m4428m();
                        int i2 = 0;
                        while (i2 < m4428m.size()) {
                            CheckBox checkBox = m4428m.get(i2);
                            if (checkBox.getTag() != null) {
                                vector2 = vector3;
                                if (((String) checkBox.getTag()).equals("SELECTALL")) {
                                    i2++;
                                    vector3 = vector2;
                                }
                            } else {
                                vector2 = vector3;
                            }
                            if (checkBox.isChecked()) {
                                if (stringBuffer.length() != 0) {
                                    stringBuffer.append("&#x3b;");
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
                            i2++;
                            vector3 = vector2;
                        }
                    } else {
                        vector = vector3;
                        if (abstractC0652n1 instanceof C0635i) {
                            C0635i c0635i = (C0635i) abstractC0652n1;
                            if (c0635i.m4475q()) {
                                ArrayList<C0186n0> m4473o = c0635i.m4473o();
                                for (int i3 = 0; i3 < m4473o.size(); i3++) {
                                    C0186n0 c0186n0 = m4473o.get(i3);
                                    if ((c0186n0.getTag() == null || !((String) c0186n0.getTag()).equals("SELECTALL")) && c0186n0.isChecked()) {
                                        if (stringBuffer.length() != 0) {
                                            stringBuffer.append("&#x3b;");
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
                            } else {
                                ArrayList<CheckBox> m4471m = c0635i.m4471m();
                                for (int i4 = 0; i4 < m4471m.size(); i4++) {
                                    CheckBox checkBox2 = m4471m.get(i4);
                                    if ((checkBox2.getTag() == null || !((String) checkBox2.getTag()).equals("SELECTALL")) && checkBox2.isChecked()) {
                                        if (stringBuffer.length() != 0) {
                                            stringBuffer.append("&#x3b;");
                                            stringBuffer2.append(",");
                                        }
                                        if (c3489yj2.f14203c0) {
                                            stringBuffer.append(i + i4);
                                            stringBuffer2.append("0");
                                        } else {
                                            C2862kj elementAt3 = c3489yj2.f14174P.elementAt(i4);
                                            String str5 = elementAt3.f11757b;
                                            if (str5 != null) {
                                                stringBuffer.append(str5);
                                                stringBuffer2.append("1");
                                            } else {
                                                String str6 = elementAt3.f11756a;
                                                if (str6 != null) {
                                                    stringBuffer.append(str6);
                                                    stringBuffer2.append("2");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i = i + (c3489yj2.f14174P.size() - 1) + 1;
                        vector3 = vector;
                    }
                }
                vector = vector3;
                i = i + (c3489yj2.f14174P.size() - 1) + 1;
                vector3 = vector;
            }
        }
        if (C0023aj.m160a(this.f12603b).m200h(c3489yj.f14186V) != null) {
            C0023aj.m160a(this.f12603b).m196f(c3489yj.f14186V, stringBuffer2.toString());
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private void m14760a(C3360vi c3360vi, C3307ui c3307ui) {
        try {
            c3360vi.m16030a(c3360vi.m16033b(c3307ui, 39, 0), 0).m15817b("T");
        } catch (C3399wi unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        if (r7.mo4290l() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011f, code lost:
    
        if (r7.mo4290l() == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ba A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m14761a(p000.C3360vi r19, p000.C3307ui r20, java.util.HashMap<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3086pi.m14761a(vi, ui, java.util.HashMap):boolean");
    }

    /* renamed from: b */
    private String m14762b(C3489yj c3489yj) {
        String str;
        C0644l c0644l = (C0644l) c3489yj.f14197a0;
        String str2 = "0";
        if (c3489yj.f14203c0) {
            str = Integer.valueOf(c0644l.m4631m()).toString();
        } else {
            C2862kj elementAt = c3489yj.f14174P.elementAt(c0644l.m4631m());
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
        if (C0023aj.m160a(this.f12603b).m200h(c3489yj.f14186V) != null) {
            C0023aj.m160a(this.f12603b).m196f(c3489yj.f14186V, str2);
        }
        return str;
    }

    /* renamed from: b */
    private void m14763b(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj) {
        AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
        if ((abstractC0652n1 instanceof C0626f) || (abstractC0652n1 instanceof C0629g)) {
            c3360vi.m16030a(c3307ui, 0).m15815a(C0755x1.m6160a(c3489yj.f14264x0, (byte[]) null, C3530zi.f14476s, C3530zi.f14477t));
        }
    }

    /* renamed from: c */
    private String m14764c(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj) {
        String m14766d;
        int i = c3489yj.f14178R;
        if (i == 4 || i == 3) {
            AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
            if ((abstractC0652n1 instanceof C0663s0) || (abstractC0652n1 instanceof C0665t0)) {
                m14766d = m14766d(c3489yj);
            }
            m14766d = "";
        } else if (i == 2) {
            AbstractC0652n1 abstractC0652n12 = c3489yj.f14197a0;
            if ((abstractC0652n12 instanceof C0632h) || (abstractC0652n12 instanceof C0635i)) {
                m14766d = m14759a(c3489yj);
            }
            m14766d = "";
        } else {
            if (i == 1) {
                AbstractC0652n1 abstractC0652n13 = c3489yj.f14197a0;
                if (abstractC0652n13 instanceof C0641k) {
                    m14766d = m14765c(c3489yj);
                } else if (abstractC0652n13 instanceof C0644l) {
                    m14766d = m14762b(c3489yj);
                }
            }
            m14766d = "";
        }
        String str = m14766d != null ? m14766d : "";
        c3360vi.m16030a(c3307ui, 0).m15817b(str);
        return str;
    }

    /* renamed from: c */
    private String m14765c(C3489yj c3489yj) {
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
        if (C0023aj.m160a(this.f12603b).m200h(c3489yj.f14186V) != null) {
            C0023aj.m160a(this.f12603b).m196f(c3489yj.f14186V, str2);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r5 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        r1 = r5;
        r3 = "2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        if (r5 != null) goto L41;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m14766d(p000.C3489yj r15) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3086pi.m14766d(yj):java.lang.String");
    }

    /* renamed from: d */
    private void m14767d(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj) {
        String str = c3489yj.f14147B0;
        if (str != null) {
            c3489yj.f14147B0 = null;
        } else {
            str = "";
        }
        c3360vi.m16030a(c3307ui, 0).m15817b(str);
    }

    /* renamed from: e */
    private void m14768e(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj) {
        AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
        if ((abstractC0652n1 instanceof C0666u) || (abstractC0652n1 instanceof C0664t)) {
            byte[] bArr = C0731p1.f5073b;
            if (bArr == null) {
                bArr = null;
            }
            c3360vi.m16030a(c3307ui, 0).m15815a(bArr);
            C0731p1.f5073b = null;
        }
    }

    /* renamed from: f */
    private void m14769f(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj) {
        byte[] m6160a;
        C3489yj c3489yj2;
        AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
        if ((abstractC0652n1 instanceof C0624e0) || (abstractC0652n1 instanceof C0627f0)) {
            if (c3489yj.f14254t0 == null || C0731p1.f5073b == null || (c3489yj2 = C0731p1.f5075d) == null || !c3489yj2.equals(c3489yj)) {
                Bitmap bitmap = c3489yj.f14266y0;
                if (bitmap != null) {
                    m6160a = C0755x1.m6160a(bitmap, (byte[]) null, C3530zi.f14476s, C3530zi.f14477t);
                } else {
                    Bitmap bitmap2 = c3489yj.f14264x0;
                    if (bitmap2 != null) {
                        m6160a = C0755x1.m6160a(bitmap2, (byte[]) null, C3530zi.f14476s, C3530zi.f14477t);
                    }
                }
            } else {
                byte[] bArr = c3489yj.f14254t0;
                m6160a = C0755x1.m6160a(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), bArr, C3530zi.f14476s, C3530zi.f14477t);
            }
            c3360vi.m16030a(c3307ui, 0).m15815a(m6160a);
            C0731p1.f5073b = null;
            C0731p1.f5075d = null;
        }
        m6160a = null;
        c3360vi.m16030a(c3307ui, 0).m15815a(m6160a);
        C0731p1.f5073b = null;
        C0731p1.f5075d = null;
    }

    /* renamed from: g */
    private String m14770g(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj) {
        AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
        String m5149m = abstractC0652n1 instanceof C0673x0 ? ((C0673x0) abstractC0652n1).m5149m() : "";
        c3360vi.m16030a(c3307ui, 0).m15817b(m5149m);
        return m5149m;
    }

    /* renamed from: h */
    private String m14771h(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj) {
        AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
        String m4945a = abstractC0652n1 instanceof C0642k0 ? ((C0642k0) abstractC0652n1).m4598m().m4945a() : "";
        c3360vi.m16030a(c3307ui, 0).m15817b(m4945a);
        return m4945a;
    }

    /* renamed from: i */
    private void m14772i(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj) {
        byte[] bArr;
        if (c3489yj.f14208e != 28 || (bArr = c3489yj.f14262w0) == null) {
            bArr = null;
        }
        c3360vi.m16030a(c3307ui, 0).m15815a(bArr);
        c3489yj.f14262w0 = null;
    }

    /* renamed from: j */
    private void m14773j(C3360vi c3360vi, C3307ui c3307ui, C3489yj c3489yj) {
        AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
        if ((abstractC0652n1 instanceof C0626f) || (abstractC0652n1 instanceof C0629g)) {
            c3360vi.m16030a(c3307ui, 0).m15815a(C0755x1.m6160a(c3489yj.f14264x0, (byte[]) null, C3530zi.f14476s, C3530zi.f14477t));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x029d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029e A[Catch: wi -> 0x02a2, TRY_LEAVE, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016c A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6 A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123 A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146 A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169 A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0184 A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0 A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b2 A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cc A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0 A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e7 A[Catch: wi -> 0x02a2, TryCatch #0 {wi -> 0x02a2, blocks: (B:3:0x0003, B:5:0x001a, B:6:0x0026, B:8:0x002c, B:9:0x0039, B:11:0x003f, B:12:0x0050, B:14:0x0057, B:15:0x0068, B:17:0x0070, B:37:0x00cc, B:39:0x00d6, B:40:0x0119, B:42:0x0123, B:43:0x013c, B:45:0x0146, B:46:0x015b, B:48:0x0169, B:49:0x016e, B:52:0x0179, B:55:0x0180, B:57:0x0184, B:58:0x0186, B:60:0x018a, B:62:0x018e, B:63:0x0190, B:65:0x01a0, B:66:0x01a2, B:68:0x01aa, B:69:0x01ac, B:71:0x01b2, B:72:0x01b4, B:74:0x01b8, B:76:0x01be, B:77:0x01c0, B:79:0x01cc, B:81:0x01d0, B:82:0x01e1, B:84:0x01e7, B:85:0x01f6, B:87:0x01fc, B:89:0x0200, B:91:0x0204, B:92:0x022b, B:94:0x0231, B:96:0x0239, B:98:0x0245, B:100:0x024f, B:102:0x0259, B:103:0x0282, B:107:0x029e, B:112:0x016c), top: B:2:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m14774a(java.util.HashMap<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3086pi.m14774a(java.util.HashMap):byte[]");
    }
}
