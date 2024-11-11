package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.CheckBox;
import androidx.appcompat.widget.n0;
import com.comviva.webaxn.ui.e0;
import com.comviva.webaxn.ui.f;
import com.comviva.webaxn.ui.f0;
import com.comviva.webaxn.ui.g;
import com.comviva.webaxn.ui.h;
import com.comviva.webaxn.ui.i;
import com.comviva.webaxn.ui.k0;
import com.comviva.webaxn.ui.l;
import com.comviva.webaxn.ui.n1;
import com.comviva.webaxn.ui.p;
import com.comviva.webaxn.ui.q;
import com.comviva.webaxn.ui.s0;
import com.comviva.webaxn.ui.t;
import com.comviva.webaxn.ui.t0;
import com.comviva.webaxn.ui.u;
import com.comviva.webaxn.ui.v;
import com.comviva.webaxn.ui.w;
import com.comviva.webaxn.ui.x0;
import com.comviva.webaxn.utils.c;
import com.comviva.webaxn.utils.k;
import com.comviva.webaxn.utils.k1;
import com.comviva.webaxn.utils.l1;
import com.comviva.webaxn.utils.p1;
import com.comviva.webaxn.utils.x1;
import java.util.ArrayList;
import java.util.Vector;

/* loaded from: classes.dex */
public class pi {
    private l1 a;
    private Context b;

    public pi(l1 l1Var, wj wjVar, Context context) {
        this.a = l1Var;
        this.b = context;
    }

    private String a(String str) {
        if (str == null || !str.startsWith("%") || !str.endsWith("%")) {
            return str;
        }
        return k.a(this.b, str.substring(1, str.length() - 1));
    }

    private String a(vi viVar, ui uiVar, yj yjVar) {
        n1 n1Var = yjVar.a0;
        String n = n1Var instanceof p ? ((p) n1Var).n() : n1Var instanceof q ? ((q) n1Var).n() : "";
        viVar.a(uiVar, 0).b(n);
        return n;
    }

    private String a(vi viVar, ui uiVar, yj yjVar, k1 k1Var) {
        n1 n1Var = yjVar.a0;
        String m = n1Var instanceof v ? ((v) n1Var).m() : n1Var instanceof w ? ((w) n1Var).m() : "";
        if (!TextUtils.isEmpty(m) && !x1.c && k1Var.b) {
            m = c.a(this.b, m);
            a(viVar, uiVar);
        }
        String str = m != null ? m : "";
        viVar.a(uiVar, 0).b(str);
        return str;
    }

    private String a(yj yjVar) {
        Vector<kj> vector;
        Vector<kj> vector2;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        Vector<kj> vector3 = this.a.x.g.get(yjVar.V);
        if (vector3 != null) {
            int i = 0;
            while (i < vector3.size()) {
                yj yjVar2 = vector3.elementAt(i).d;
                n1 n1Var = yjVar2.a0;
                if (n1Var != null) {
                    if (n1Var instanceof h) {
                        ArrayList<CheckBox> m = ((h) n1Var).m();
                        int i2 = 0;
                        while (i2 < m.size()) {
                            CheckBox checkBox = m.get(i2);
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
                            i2++;
                            vector3 = vector2;
                        }
                    } else {
                        vector = vector3;
                        if (n1Var instanceof i) {
                            i iVar = (i) n1Var;
                            if (iVar.q()) {
                                ArrayList<n0> o = iVar.o();
                                for (int i3 = 0; i3 < o.size(); i3++) {
                                    n0 n0Var = o.get(i3);
                                    if ((n0Var.getTag() == null || !((String) n0Var.getTag()).equals("SELECTALL")) && n0Var.isChecked()) {
                                        if (stringBuffer.length() != 0) {
                                            stringBuffer.append("&#x3b;");
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
                            } else {
                                ArrayList<CheckBox> m2 = iVar.m();
                                for (int i4 = 0; i4 < m2.size(); i4++) {
                                    CheckBox checkBox2 = m2.get(i4);
                                    if ((checkBox2.getTag() == null || !((String) checkBox2.getTag()).equals("SELECTALL")) && checkBox2.isChecked()) {
                                        if (stringBuffer.length() != 0) {
                                            stringBuffer.append("&#x3b;");
                                            stringBuffer2.append(",");
                                        }
                                        if (yjVar2.c0) {
                                            stringBuffer.append(i + i4);
                                            stringBuffer2.append("0");
                                        } else {
                                            kj elementAt3 = yjVar2.P.elementAt(i4);
                                            String str5 = elementAt3.b;
                                            if (str5 != null) {
                                                stringBuffer.append(str5);
                                                stringBuffer2.append("1");
                                            } else {
                                                String str6 = elementAt3.a;
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
                        i = i + (yjVar2.P.size() - 1) + 1;
                        vector3 = vector;
                    }
                }
                vector = vector3;
                i = i + (yjVar2.P.size() - 1) + 1;
                vector3 = vector;
            }
        }
        if (aj.a(this.b).h(yjVar.V) != null) {
            aj.a(this.b).f(yjVar.V, stringBuffer2.toString());
        }
        return stringBuffer.toString();
    }

    private void a(vi viVar, ui uiVar) {
        try {
            viVar.a(viVar.b(uiVar, 39, 0), 0).b("T");
        } catch (wi unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        if (r7.l() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011f, code lost:
    
        if (r7.l() == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(defpackage.vi r19, defpackage.ui r20, java.util.HashMap<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi.a(vi, ui, java.util.HashMap):boolean");
    }

    private String b(yj yjVar) {
        String str;
        l lVar = (l) yjVar.a0;
        String str2 = "0";
        if (yjVar.c0) {
            str = Integer.valueOf(lVar.m()).toString();
        } else {
            kj elementAt = yjVar.P.elementAt(lVar.m());
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
        if (aj.a(this.b).h(yjVar.V) != null) {
            aj.a(this.b).f(yjVar.V, str2);
        }
        return str;
    }

    private void b(vi viVar, ui uiVar, yj yjVar) {
        n1 n1Var = yjVar.a0;
        if ((n1Var instanceof f) || (n1Var instanceof g)) {
            viVar.a(uiVar, 0).a(x1.a(yjVar.x0, (byte[]) null, zi.s, zi.t));
        }
    }

    private String c(vi viVar, ui uiVar, yj yjVar) {
        String d;
        int i = yjVar.R;
        if (i == 4 || i == 3) {
            n1 n1Var = yjVar.a0;
            if ((n1Var instanceof s0) || (n1Var instanceof t0)) {
                d = d(yjVar);
            }
            d = "";
        } else if (i == 2) {
            n1 n1Var2 = yjVar.a0;
            if ((n1Var2 instanceof h) || (n1Var2 instanceof i)) {
                d = a(yjVar);
            }
            d = "";
        } else {
            if (i == 1) {
                n1 n1Var3 = yjVar.a0;
                if (n1Var3 instanceof com.comviva.webaxn.ui.k) {
                    d = c(yjVar);
                } else if (n1Var3 instanceof l) {
                    d = b(yjVar);
                }
            }
            d = "";
        }
        String str = d != null ? d : "";
        viVar.a(uiVar, 0).b(str);
        return str;
    }

    private String c(yj yjVar) {
        String str;
        com.comviva.webaxn.ui.k kVar = (com.comviva.webaxn.ui.k) yjVar.a0;
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
        if (aj.a(this.b).h(yjVar.V) != null) {
            aj.a(this.b).f(yjVar.V, str2);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String d(defpackage.yj r15) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi.d(yj):java.lang.String");
    }

    private void d(vi viVar, ui uiVar, yj yjVar) {
        String str = yjVar.B0;
        if (str != null) {
            yjVar.B0 = null;
        } else {
            str = "";
        }
        viVar.a(uiVar, 0).b(str);
    }

    private void e(vi viVar, ui uiVar, yj yjVar) {
        n1 n1Var = yjVar.a0;
        if ((n1Var instanceof u) || (n1Var instanceof t)) {
            byte[] bArr = p1.b;
            if (bArr == null) {
                bArr = null;
            }
            viVar.a(uiVar, 0).a(bArr);
            p1.b = null;
        }
    }

    private void f(vi viVar, ui uiVar, yj yjVar) {
        byte[] a;
        yj yjVar2;
        n1 n1Var = yjVar.a0;
        if ((n1Var instanceof e0) || (n1Var instanceof f0)) {
            if (yjVar.t0 == null || p1.b == null || (yjVar2 = p1.d) == null || !yjVar2.equals(yjVar)) {
                Bitmap bitmap = yjVar.y0;
                if (bitmap != null) {
                    a = x1.a(bitmap, (byte[]) null, zi.s, zi.t);
                } else {
                    Bitmap bitmap2 = yjVar.x0;
                    if (bitmap2 != null) {
                        a = x1.a(bitmap2, (byte[]) null, zi.s, zi.t);
                    }
                }
            } else {
                byte[] bArr = yjVar.t0;
                a = x1.a(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), bArr, zi.s, zi.t);
            }
            viVar.a(uiVar, 0).a(a);
            p1.b = null;
            p1.d = null;
        }
        a = null;
        viVar.a(uiVar, 0).a(a);
        p1.b = null;
        p1.d = null;
    }

    private String g(vi viVar, ui uiVar, yj yjVar) {
        n1 n1Var = yjVar.a0;
        String m = n1Var instanceof x0 ? ((x0) n1Var).m() : "";
        viVar.a(uiVar, 0).b(m);
        return m;
    }

    private String h(vi viVar, ui uiVar, yj yjVar) {
        n1 n1Var = yjVar.a0;
        String a = n1Var instanceof k0 ? ((k0) n1Var).m().a() : "";
        viVar.a(uiVar, 0).b(a);
        return a;
    }

    private void i(vi viVar, ui uiVar, yj yjVar) {
        byte[] bArr;
        if (yjVar.e != 28 || (bArr = yjVar.w0) == null) {
            bArr = null;
        }
        viVar.a(uiVar, 0).a(bArr);
        yjVar.w0 = null;
    }

    private void j(vi viVar, ui uiVar, yj yjVar) {
        n1 n1Var = yjVar.a0;
        if ((n1Var instanceof f) || (n1Var instanceof g)) {
            viVar.a(uiVar, 0).a(x1.a(yjVar.x0, (byte[]) null, zi.s, zi.t));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] a(java.util.HashMap<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi.a(java.util.HashMap):byte[]");
    }
}
