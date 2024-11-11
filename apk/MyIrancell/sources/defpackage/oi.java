package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import com.comviva.webaxn.ui.a1;
import com.comviva.webaxn.ui.k1;
import com.comviva.webaxn.utils.b;
import com.comviva.webaxn.utils.c;
import com.comviva.webaxn.utils.e;
import com.comviva.webaxn.utils.j1;
import com.comviva.webaxn.utils.u;
import com.comviva.webaxn.utils.x1;
import com.comviva.webaxn.utils.z1;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class oi {
    private static int d;
    private wj a;
    private Context b;
    private boolean c;

    public oi(wj wjVar, Context context, boolean z) {
        this.a = null;
        this.c = false;
        this.a = wjVar;
        this.b = context;
        d = 0;
        this.c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0179, code lost:
    
        if (r9.c == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A(defpackage.ui r10, defpackage.mj r11) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.A(ui, mj):boolean");
    }

    private void B(ui uiVar, mj mjVar) {
        if (uiVar == null || A(uiVar, mjVar)) {
            return;
        }
        for (int i = 0; i < uiVar.i(); i++) {
            B(uiVar.d(i), mjVar);
        }
    }

    private zj C(ui uiVar, mj mjVar) {
        boolean z;
        int indexOf;
        zj zjVar = null;
        if (uiVar != null) {
            try {
                int j = uiVar.j();
                boolean z2 = true;
                if (uiVar.a() != 1) {
                    if (j == 14) {
                        zjVar = b(uiVar, mjVar);
                        if (zjVar != null && (zjVar.m.equalsIgnoreCase("confirm") || zjVar.m.equalsIgnoreCase("error") || zjVar.m.equalsIgnoreCase("info") || zjVar.m.equalsIgnoreCase("toast") || zjVar.m.equalsIgnoreCase("popup") || zjVar.m.equalsIgnoreCase("drawer"))) {
                            return zjVar;
                        }
                        z = false;
                    } else {
                        if (j == 7) {
                            s(uiVar, mjVar);
                            z = true;
                        } else {
                            if (j == 61) {
                                k(uiVar, mjVar);
                            }
                            z = false;
                        }
                        z2 = false;
                    }
                    if (!z2 || !z) {
                        for (int i = 0; i < uiVar.i(); i++) {
                            zjVar = C(uiVar.d(i), mjVar);
                        }
                    }
                } else if (j == 53) {
                    String a = a(uiVar);
                    if (!TextUtils.isEmpty(a) && !this.c && (indexOf = a.indexOf(".")) != -1) {
                        z1.e(a.substring(0, indexOf));
                        z1.d(a.substring(indexOf + 1, a.length()));
                        if (j1.a(this.b).h0() == 0) {
                            j1.a(this.b).y(1);
                        }
                    }
                }
            } catch (wi e) {
                e.printStackTrace();
            }
        }
        return zjVar;
    }

    private bj a(HashMap<String, String> hashMap) {
        bj bjVar = new bj();
        try {
            bjVar.a(Integer.parseInt(hashMap.get("advtype")));
        } catch (NumberFormatException unused) {
        }
        bjVar.a(hashMap.get("zoneid"));
        if (!TextUtils.isEmpty(hashMap.get("x-text-align"))) {
            bjVar.c(hashMap.get("x-text-align"));
        }
        if (!TextUtils.isEmpty(hashMap.get("x-vertical-align"))) {
            bjVar.c(hashMap.get("x-vertical-align"));
        }
        bjVar.b(hashMap.get("x-resimg"));
        if (!TextUtils.isEmpty(hashMap.get("x-color"))) {
            try {
                bjVar.c(Color.parseColor(hashMap.get("x-color")));
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (!TextUtils.isEmpty(hashMap.get("x-background-color"))) {
            try {
                bjVar.c(Color.parseColor(hashMap.get("x-background-color")));
            } catch (IllegalArgumentException unused3) {
            }
        }
        return bjVar;
    }

    private String a(ui uiVar) {
        int i = 0;
        while (true) {
            if (i >= uiVar.i()) {
                break;
            }
            ui d2 = uiVar.d(i);
            if (d2.f() == 1) {
                try {
                    return d2.h();
                } catch (wi unused) {
                }
            } else {
                i++;
            }
        }
        return null;
    }

    private String a(ui uiVar, int i) {
        try {
            Vector<ri> c = uiVar.c(i);
            if (c != null) {
                return c.elementAt(0).b();
            }
            return null;
        } catch (wi unused) {
            return null;
        }
    }

    private vj a(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        vj vjVar = new vj();
        String[] split = str.split(",");
        int i = 0;
        while (i <= split.length) {
            int i2 = i + 1;
            if (i == 0 && !TextUtils.isEmpty(split[0])) {
                float f2 = 0.0f;
                try {
                    f2 = Float.parseFloat(split[0].split(":")[1]);
                } catch (NumberFormatException unused) {
                }
                vjVar.a(f2);
            }
            i = i2;
        }
        return vjVar;
    }

    private yj a(ui uiVar, yj yjVar, zj zjVar, mj mjVar) {
        HashMap<String, hj> hashMap;
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                int j = d2.j();
                if (d2.a() == 1) {
                    if (j == 31) {
                        yj b = b(d2);
                        if (yjVar != null) {
                            yjVar.a(b);
                            b.A0 = yjVar;
                        }
                    } else if (j == 50) {
                        d(d2, yjVar);
                    } else if (j == 5) {
                        String a = a(d2);
                        if (!TextUtils.isEmpty(a)) {
                            try {
                                int parseInt = Integer.parseInt(a);
                                if (parseInt != 0) {
                                    r7 = parseInt;
                                }
                            } catch (Exception unused) {
                            }
                        }
                        yjVar.i1 = x1.a(r7);
                    }
                } else if (j == 13) {
                    yj a2 = a(d2, zjVar, mjVar);
                    if (d2.i() > 0) {
                        ui d3 = d2.d(0);
                        if (d3.j() == 13 || d3.j() == 31 || d3.j() == 50) {
                            a2 = a(d2, a2, zjVar, mjVar);
                        }
                    }
                    yjVar.a(a2);
                    if (a2 != null) {
                        a2.A0 = yjVar;
                    }
                } else if (j == 31) {
                    h(d2, yjVar);
                } else if (j == 54) {
                    int z = j1.a(this.a.i()).z();
                    String a3 = a(d2);
                    if (a3 != null) {
                        try {
                            int parseInt2 = Integer.parseInt(a3);
                            z = parseInt2 != 0 ? parseInt2 : -16777216;
                        } catch (Exception unused2) {
                        }
                        yjVar.h1 = x1.a(z);
                    }
                }
            } catch (wi unused3) {
            }
        }
        if (x1.c() && (hashMap = yjVar.P0) != null && hashMap.size() > 0) {
            hj hjVar = yjVar.P0.get("leftswipe");
            yjVar.P0.put("leftswipe", yjVar.P0.get("rightswipe"));
            yjVar.P0.put("rightswipe", hjVar);
        }
        if (Build.VERSION.SDK_INT < 11 && yjVar.e == 39) {
            int i2 = 0;
            while (i2 < yjVar.z0.size()) {
                yj yjVar2 = yjVar.z0.get(i2);
                yjVar2.e = 0;
                yj yjVar3 = new yj(0.0f);
                yjVar3.e = 22;
                yjVar3.n = yjVar2.d;
                yjVar3.p = yjVar.p;
                yjVar3.m0 = "100%";
                yjVar3.G = "10";
                yjVar3.I = "10";
                yj yjVar4 = new yj(0.0f);
                yjVar4.e = 24;
                yjVar4.m0 = "100%";
                yjVar4.n0 = "3";
                u uVar = new u(this.b, 0.0f);
                yjVar4.p = uVar;
                uVar.c(3);
                yjVar4.p.b(yjVar.h1);
                yjVar.z0.add(i2, yjVar3);
                int i3 = i2 + 1;
                yjVar.z0.add(i3, yjVar4);
                i2 = i3 + 1 + 1;
            }
            yjVar.e = 0;
            zjVar.b(false);
        }
        return yjVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0b0a, code lost:
    
        if (r11 == 0) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x0b1d, code lost:
    
        if (r11 == 0) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:936:0x0f37, code lost:
    
        if (r13 == 0) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:945:0x0f4e, code lost:
    
        if (r13 == 0) goto L752;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:867:0x0de1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private defpackage.yj a(defpackage.ui r22, defpackage.zj r23, defpackage.mj r24) {
        /*
            Method dump skipped, instructions count: 5040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.a(ui, zj, mj):yj");
    }

    private void a(ui uiVar, lj ljVar, mj mjVar) {
        wj wjVar;
        e g;
        String str;
        for (int i = 0; i < uiVar.e(); i++) {
            qi b = uiVar.b(i);
            try {
                int b2 = b.b();
                if (b2 == 13) {
                    if (b.d().elementAt(0).d() == 1) {
                        this.a.g().g = b.d().elementAt(0).b();
                    } else {
                        int c = b.d().elementAt(0).c();
                        if (c == 134) {
                            g = this.a.g();
                            str = "ok";
                        } else if (c == 135) {
                            g = this.a.g();
                            str = "exit";
                        } else if (c == 136) {
                            g = this.a.g();
                            str = "url";
                        } else if (c == 147) {
                            g = this.a.g();
                            str = "call";
                        } else if (c == 145) {
                            g = this.a.g();
                            str = "error";
                        }
                        g.g = str;
                    }
                } else if (b2 == 7) {
                    if (this.a.g().h == null) {
                        if (b.d().elementAt(0).d() != 0) {
                            this.a.g().h = b.d().elementAt(0).b();
                        } else if (b.d().elementAt(0).c() == 133) {
                            this.a.g().h = "Menulist:";
                        }
                    }
                } else if (b2 == 42) {
                    this.a.g().q = (byte) Integer.parseInt(b.d().elementAt(0).b());
                } else {
                    if (b2 == 11) {
                        this.a.g().i = "HN";
                        wjVar = this.a;
                    } else if (b2 == 12) {
                        this.a.g().i = b.d().elementAt(0).b();
                        wjVar = this.a;
                    } else if (b2 == 54) {
                        this.a.g().u = b.d().elementAt(0).b();
                    } else if (b2 == 53) {
                        this.a.g().a = b.d().elementAt(0).b();
                    } else if (b2 == 58) {
                        this.a.g().b = Integer.parseInt(b.d().elementAt(0).b());
                    } else if (b2 == 59) {
                        this.a.g().c = Integer.parseInt(b.d().elementAt(0).b());
                    } else if (b2 == 63) {
                        this.a.g().s = b.d().elementAt(0).b();
                    } else if (b2 == 68) {
                        if (b.d().elementAt(0).b().equalsIgnoreCase("false")) {
                            this.a.g().d = false;
                        }
                    } else if (b2 == 35) {
                        this.a.g().e = b.d().elementAt(0).b();
                    } else if (b2 == 23) {
                        this.a.g().r = b.d().elementAt(0).b();
                    } else if (b2 == 85) {
                        String trim = b.d().elementAt(0).b().trim();
                        if (!TextUtils.isEmpty(trim)) {
                            if (trim.startsWith("Menulist:")) {
                                trim = trim.substring(9, trim.length());
                            }
                            this.a.g().j = trim.trim();
                        }
                    } else if (b2 == 81) {
                        String trim2 = b.d().elementAt(0).b().trim();
                        if (!TextUtils.isEmpty(trim2)) {
                            this.a.g().k = trim2.trim();
                        }
                    } else if (b2 == 106) {
                        String b3 = b.d().elementAt(0).b();
                        if (!TextUtils.isEmpty(b3)) {
                            this.a.g().l = b3;
                        }
                    } else if (b2 == 117) {
                        String b4 = b.d().elementAt(0).b();
                        if (!TextUtils.isEmpty(b4)) {
                            this.a.g().m = b4;
                        }
                    }
                    wjVar.g().p = true;
                }
            } catch (Exception unused) {
            }
        }
        String a = a(uiVar);
        if (a != null) {
            this.a.g().f = a;
        }
        if (mjVar != null) {
            mjVar.a(this.a.g());
        } else if (ljVar != null) {
            ljVar.a(this.a.g());
        }
    }

    private void a(ui uiVar, mj mjVar) {
        String a;
        cj cjVar = new cj();
        mjVar.a(cjVar);
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                int j = d2.j();
                if (d2.a() == 1) {
                    if (j == 25) {
                        String a2 = a(d2, 33);
                        if (!TextUtils.isEmpty(a2) && !cjVar.a(this.b, a2)) {
                            mjVar.a(0).a(6, a2);
                        }
                        String a3 = a(d2, 38);
                        if (!TextUtils.isEmpty(a3)) {
                            cjVar.b(a3);
                        }
                        String a4 = a(d2, 39);
                        if (!TextUtils.isEmpty(a4)) {
                            cjVar.a(a4);
                        }
                        String a5 = a(d2, 84);
                        if (!TextUtils.isEmpty(a5)) {
                            HashMap<String, String> a6 = x1.a(a5, ";", ":", (String) null);
                            if (a6.size() > 0 && !TextUtils.isEmpty(a6.get("addontype"))) {
                                try {
                                    cjVar.a(Integer.parseInt(a6.get("addontype")));
                                    if (a6.size() > 1) {
                                        cjVar.a(a(a6));
                                    }
                                } catch (NumberFormatException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } else if (j == 24) {
                        y(d2, mjVar);
                    }
                } else if (j == 10) {
                    this.a.a(new e());
                    a(d2, (lj) null, mjVar);
                    for (int i2 = 0; i2 < d2.i(); i2++) {
                        ui d3 = d2.d(i2);
                        if (d3.a() == 0 && d3.j() == 19 && (a = a(d3)) != null && a.equals("F")) {
                            this.a.g().o = false;
                        }
                    }
                }
            } catch (wi unused) {
            }
        }
    }

    private void a(ui uiVar, mj mjVar, zj zjVar) {
        e eVar = new e();
        for (int i = 0; i < uiVar.e(); i++) {
            qi b = uiVar.b(i);
            try {
                int b2 = b.b();
                if (b2 == 33) {
                    String b3 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b3)) {
                        zjVar.n = b3;
                        byte[] d2 = aj.a(this.a.i()).d(b3, "public");
                        if (d2 == null) {
                            d2 = aj.a(this.a.i()).d(b3, "private");
                        }
                        if (d2 == null) {
                            mjVar.e().a(8, b3);
                        } else {
                            zjVar.o = d2;
                        }
                    }
                } else if (b2 == 80) {
                    String b4 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b4)) {
                        if (b4.indexOf(".") != -1) {
                            b4 = b4.substring(0, b4.indexOf("."));
                        }
                        zjVar.i = b4;
                    }
                }
            } catch (wi unused) {
            }
        }
        try {
            if (zjVar.i != null && this.b.getResources().getIdentifier(zjVar.i, "drawable", this.b.getPackageName()) > 0 && zjVar.n != null) {
                mjVar.e().b(8, zjVar.n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        zjVar.j = eVar;
    }

    private void a(ui uiVar, mj mjVar, zj zjVar, boolean z) {
        String a = a(uiVar);
        if (a == null || !a.equals("T") || !z || zjVar == null || zjVar.g == null) {
            mjVar.b(true);
        } else {
            zjVar.q = true;
        }
    }

    private void a(ui uiVar, sj sjVar) {
        int i;
        String b;
        sjVar.b = new u(this.b, b.a(this.a.i()).a().a());
        int i2 = 0;
        while (true) {
            i = 36;
            if (i2 >= uiVar.e()) {
                break;
            }
            qi b2 = uiVar.b(i2);
            try {
                int b3 = b2.b();
                if (b3 == 36) {
                    String b4 = b2.d().elementAt(0).b();
                    if (b4 != null) {
                        sjVar.b.a(Integer.parseInt(b4));
                    }
                } else if (b3 == 13 && (b = b2.d().elementAt(0).b()) != null) {
                    sjVar.a = Integer.parseInt(b);
                }
            } catch (wi unused) {
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < uiVar.i()) {
            rj rjVar = new rj(this.b, b.a(this.a.i()).a().a());
            ui d2 = uiVar.d(i3);
            try {
                int j = d2.j();
                int i4 = 1;
                if ((d2.a() == 0 && j == 8) || (d2.a() == 1 && j == 8)) {
                    rjVar.a(a(d2, 29));
                }
                int i5 = 0;
                while (i5 < d2.i()) {
                    ui d3 = d2.d(i5);
                    if (d3.f() == i4) {
                        String h = d3.h();
                        if (h != null) {
                            rjVar.c(h);
                        }
                    } else {
                        int i6 = 31;
                        if (d3.j() == 31) {
                            int i7 = 0;
                            while (i7 < d3.e()) {
                                qi b5 = d3.b(i7);
                                int b6 = b5.b();
                                if (b6 == 28) {
                                    rjVar.b(Integer.parseInt(b5.d().elementAt(0).b()));
                                } else if (b6 == i) {
                                    rjVar.a(Integer.parseInt(b5.d().elementAt(0).b()));
                                } else if (b6 == i6) {
                                    rjVar.c(Integer.parseInt(b5.d().elementAt(0).b()));
                                } else if (b6 == 30) {
                                    rjVar.d(Integer.parseInt(b5.d().elementAt(0).b()));
                                } else if (b6 == 87) {
                                    String b7 = b5.d().elementAt(0).b();
                                    if (!TextUtils.isEmpty(b7)) {
                                        b7 = b7.trim();
                                        if (b7.contains("\\.")) {
                                            b7 = b7.replace("\\.", ".");
                                        }
                                    }
                                    rjVar.b(b7);
                                } else if (b6 == 98) {
                                    String b8 = b5.d().elementAt(0).b();
                                    if (!TextUtils.isEmpty(b8)) {
                                        if (b8.contains("px") || b8.contains("PX")) {
                                            b8 = b8.substring(0, b8.length() - 2);
                                        }
                                        try {
                                            rjVar.a(x1.a(Float.parseFloat(b8)));
                                        } catch (Exception unused2) {
                                            rjVar.a(-1.0f);
                                        }
                                    }
                                } else if (b6 == 101) {
                                    String b9 = b5.d().elementAt(0).b();
                                    if (!TextUtils.isEmpty(b9)) {
                                        if (b9.contains("px") || b9.contains("PX")) {
                                            b9 = b9.substring(0, b9.length() - 2);
                                        }
                                        try {
                                            rjVar.b(Float.parseFloat(b9));
                                        } catch (Exception unused3) {
                                            rjVar.b(-1.0f);
                                        }
                                    }
                                }
                                i7++;
                                i = 36;
                                i6 = 31;
                            }
                        }
                    }
                    i5++;
                    i = 36;
                    i4 = 1;
                }
                sjVar.a(rjVar);
            } catch (wi unused4) {
            }
            i3++;
            i = 36;
        }
    }

    private void a(ui uiVar, yj yjVar) {
        bj bjVar = new bj();
        int i = 0;
        while (true) {
            int i2 = -16777216;
            if (i >= uiVar.e()) {
                break;
            }
            qi b = uiVar.b(i);
            try {
                int b2 = b.b();
                if (b2 == 29) {
                    String b3 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b3)) {
                        bjVar.c(b3);
                    }
                } else if (b2 == 73) {
                    String b4 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b4)) {
                        bjVar.d(b4);
                    }
                } else if (b2 == 86) {
                    String b5 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b5)) {
                        try {
                            int parseInt = Integer.parseInt(b5);
                            if (parseInt != 0) {
                                i2 = parseInt;
                            }
                            bjVar.c(i2);
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (b2 == 80) {
                    String b6 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b6)) {
                        if (b6.indexOf(".") != -1) {
                            b6 = b6.substring(0, b6.indexOf("."));
                        }
                        bjVar.b(b6);
                    }
                }
            } catch (wi unused) {
            }
            i++;
        }
        for (int i3 = 0; i3 < uiVar.i(); i3++) {
            ui d2 = uiVar.d(i3);
            try {
                if (d2.j() == 31) {
                    for (int i4 = 0; i4 < d2.e(); i4++) {
                        qi b7 = d2.b(i4);
                        int b8 = b7.b();
                        if (b8 == 28) {
                            try {
                                int parseInt2 = Integer.parseInt(b7.d().elementAt(0).b());
                                if (parseInt2 == 0) {
                                    parseInt2 = -16777216;
                                }
                                bjVar.c(x1.a(parseInt2));
                            } catch (Exception unused2) {
                            }
                        } else if (b8 == 36) {
                            int parseInt3 = Integer.parseInt(b7.d().elementAt(0).b());
                            if (parseInt3 == 0) {
                                parseInt3 = -16777216;
                            }
                            bjVar.b(x1.a(parseInt3));
                        }
                    }
                }
            } catch (wi unused3) {
            }
        }
        yjVar.L0 = bjVar;
    }

    private void a(ui uiVar, yj yjVar, u uVar) {
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                int j = d2.j();
                if (d2.a() == 1) {
                    if (j == 6) {
                        for (int i2 = 0; i2 < d2.e(); i2++) {
                            qi b = d2.b(i2);
                            int b2 = b.b();
                            if (b2 == 45) {
                                String b3 = b.d().elementAt(0).b();
                                if (b3 != null) {
                                    yjVar.f0 = Integer.parseInt(b3);
                                }
                            } else if (b2 == 48) {
                                yjVar.g0 = true;
                            }
                        }
                        for (int i3 = 0; i3 < d2.i(); i3++) {
                            ui d3 = d2.d(i3);
                            if (d3.a() == 1 && d3.j() == 7) {
                                sj sjVar = new sj();
                                a(d3, sjVar);
                                yjVar.a(sjVar);
                            }
                        }
                    }
                } else if (j == 6) {
                    String a = a(d2, 14);
                    if (a != null) {
                        yjVar.f0 = Integer.parseInt(a);
                    }
                    for (int i4 = 0; i4 < d2.i(); i4++) {
                        ui d4 = d2.d(i4);
                        if (d4.a() == 0 && d4.j() == 7) {
                            sj sjVar2 = new sj();
                            a(d4, sjVar2);
                            yjVar.a(sjVar2);
                        }
                    }
                }
            } catch (wi unused) {
            }
        }
    }

    private void a(ui uiVar, yj yjVar, zj zjVar) {
        tj c;
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                if (d2.j() == 13 && (c = c(d2)) != null) {
                    if (yjVar != null) {
                        if (yjVar.L == null) {
                            yjVar.L = new Vector<>();
                        }
                        yjVar.L.add(c);
                    }
                    c.d = zjVar.a(c.c, (Vector<yj>) null);
                    for (int i2 = 0; i2 < zjVar.e.size(); i2++) {
                        yj elementAt = zjVar.e.elementAt(i2);
                        if (elementAt.V != null && c.g != null && elementAt.V.equals(c.g)) {
                            elementAt.r = c;
                        }
                    }
                }
            } catch (wi unused) {
            }
        }
    }

    private void a(ui uiVar, zj zjVar) {
        String b;
        if (zjVar.P == null) {
            zjVar.P = new HashMap<>();
        }
        hj hjVar = new hj();
        for (int i = 0; i < uiVar.e(); i++) {
            try {
                qi b2 = uiVar.b(i);
                int b3 = b2.b();
                if (b3 == 14) {
                    String b4 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b4)) {
                        hjVar.f(b4);
                    }
                } else if (b3 == 7) {
                    if (b2.d().elementAt(0).d() != 0) {
                        b = b2.d().elementAt(0).b();
                    } else if (b2.d().elementAt(0).c() == 133) {
                        b = "Menulist:";
                    }
                    hjVar.b(b);
                } else if (b3 == 63) {
                    String b5 = b2.d().elementAt(0).b();
                    if (b5 != null) {
                        hjVar.d(b5);
                    }
                } else if (b3 == 106) {
                    String b6 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b6)) {
                        hjVar.c(b6);
                    }
                } else if (b3 == 12) {
                    String b7 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b7)) {
                        hjVar.e(b7);
                    }
                } else if (b3 == 117) {
                    String b8 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b8)) {
                        hjVar.a(b8);
                    }
                }
            } catch (wi e) {
                e.printStackTrace();
                return;
            }
        }
        zjVar.P.put(hjVar.f(), hjVar);
    }

    private void a(ui uiVar, zj zjVar, yj yjVar, e eVar) {
        String str = null;
        String str2 = null;
        for (int i = 0; i < uiVar.e(); i++) {
            qi b = uiVar.b(i);
            try {
                int b2 = b.b();
                if (b2 == 14) {
                    str = b.d().elementAt(0).b();
                } else if (b2 == 20) {
                    str2 = b.d().elementAt(0).b();
                }
                if (str != null && str2 != null) {
                    if (zjVar != null) {
                        if (zjVar.r == null) {
                            zjVar.r = new HashMap<>();
                        }
                        zjVar.r.put(str, str2);
                    }
                    aj.a(this.a.i()).h(str, str2);
                }
            } catch (wi unused) {
            }
        }
    }

    private void a(ui uiVar, zj zjVar, yj yjVar, u uVar) {
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            if (d2.f() == 1) {
                yjVar.n = d2.h();
            } else {
                int j = d2.j();
                if (d2.a() == 1) {
                    if (j == 33) {
                        a(d2, (zj) null, yjVar, (e) null);
                    } else if (j == 41) {
                        a(d2, yjVar);
                    } else if (j == 55) {
                        e(d2, yjVar);
                    } else if (j == 57) {
                        b(d2, yjVar);
                    } else if (j == 56) {
                        c(d2, yjVar);
                    }
                } else if (j == 31) {
                    for (int i2 = 0; i2 < d2.e(); i2++) {
                        qi b = d2.b(i2);
                        int b2 = b.b();
                        int i3 = -16777216;
                        if (b2 == 28) {
                            try {
                                int parseInt = Integer.parseInt(b.d().elementAt(0).b());
                                if (parseInt != 0) {
                                    i3 = parseInt;
                                }
                                uVar.b(i3);
                            } catch (Exception unused) {
                                uVar.b(false);
                            }
                        } else if (b2 == 36) {
                            try {
                                int parseInt2 = Integer.parseInt(b.d().elementAt(0).b());
                                if (parseInt2 != 0) {
                                    i3 = parseInt2;
                                }
                                uVar.a(i3);
                            } catch (Exception unused2) {
                                uVar.a(false);
                            }
                        } else if (b2 == 31) {
                            try {
                                uVar.c(Integer.parseInt(b.d().elementAt(0).b()));
                            } catch (Exception unused3) {
                                uVar.c(-1);
                            }
                        } else {
                            if (b2 == 87) {
                                try {
                                    String b3 = b.d().elementAt(0).b();
                                    if (!TextUtils.isEmpty(b3)) {
                                        b3 = b3.trim();
                                        if (b3.contains("\\.")) {
                                            b3 = b3.replace("\\.", ".");
                                        }
                                    }
                                    uVar.b(b3);
                                } catch (Exception unused4) {
                                }
                            } else if (b2 == 30) {
                                try {
                                    uVar.d(Integer.parseInt(b.d().elementAt(0).b()));
                                } catch (Exception unused5) {
                                    uVar.d(-1);
                                }
                            } else if (b2 == 98) {
                                String b4 = b.d().elementAt(0).b();
                                if (!TextUtils.isEmpty(b4)) {
                                    if (b4.contains("px") || b4.contains("PX")) {
                                        b4 = b4.substring(0, b4.length() - 2);
                                    }
                                    try {
                                        uVar.a(x1.a(Float.parseFloat(b4)));
                                    } catch (Exception unused6) {
                                        uVar.a(-1.0f);
                                    }
                                }
                            } else if (b2 == 101) {
                                String b5 = b.d().elementAt(0).b();
                                if (!TextUtils.isEmpty(b5)) {
                                    if (b5.contains("px") || b5.contains("PX")) {
                                        b5 = b5.substring(0, b5.length() - 2);
                                    }
                                    try {
                                        uVar.b(Float.parseFloat(b5));
                                    } catch (Exception unused7) {
                                        uVar.b(-1.0f);
                                    }
                                }
                            }
                        }
                    }
                } else if (j == 12) {
                    g(d2, yjVar);
                } else if (j == 22) {
                    String a = a(d2);
                    if (a != null && a.equals("T")) {
                        yjVar.X = true;
                    }
                } else if (j == 33) {
                    String a2 = a(d2);
                    if (a2 != null && a2.equals("T")) {
                        yjVar.Y = true;
                    }
                } else if (j == 5) {
                    yjVar.P.add(f(d2, yjVar));
                } else {
                    if (j == 19) {
                        String a3 = a(d2);
                        if (a3 != null && a3.equals("F")) {
                            yjVar.M = false;
                        } else if (a3 == null || !a3.equals("T")) {
                            try {
                                a(d2, yjVar, zjVar);
                            } catch (wi unused8) {
                            }
                        } else {
                            yjVar.M = true;
                        }
                    } else if (j == 21) {
                        String a4 = a(d2);
                        if (a4 != null && a4.equals("F")) {
                            yjVar.T = false;
                        }
                    } else if (j == 23) {
                        i(d2, yjVar);
                    }
                }
            }
        }
    }

    private yj b(ui uiVar) {
        int b;
        u uVar = new u(this.b, b.a(this.a.i()).a().a());
        yj yjVar = new yj(b.a(this.a.i()).a().a());
        yjVar.e = 24;
        boolean z = false;
        for (int i = 0; i < uiVar.e(); i++) {
            qi b2 = uiVar.b(i);
            try {
                b = b2.b();
            } catch (wi unused) {
            }
            if (b == 28) {
                try {
                    int parseInt = Integer.parseInt(b2.d().elementAt(0).b());
                    if (parseInt == 0) {
                        parseInt = -16777216;
                    }
                    uVar.b(parseInt);
                } catch (Exception unused2) {
                    uVar.b(false);
                }
                z = true;
            } else if (b == 31) {
                try {
                    uVar.c(Integer.parseInt(b2.d().elementAt(0).b()));
                } catch (Exception unused3) {
                    uVar.c(-1);
                }
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        yjVar.p = uVar;
        return yjVar;
    }

    private zj b(ui uiVar, mj mjVar) {
        if (d == 0) {
            lj ljVar = new lj(this.b);
            mjVar.a(ljVar);
            mjVar.c(ljVar);
            d++;
        }
        return p(uiVar, mjVar);
    }

    private void b(ui uiVar, yj yjVar) {
        fj fjVar = new fj();
        for (int i = 0; i < uiVar.e(); i++) {
            qi b = uiVar.b(i);
            try {
                int b2 = b.b();
                if (b2 == 33) {
                    String b3 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b3)) {
                        fjVar.b(b3);
                    }
                } else if (b2 == 28) {
                    String b4 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b4)) {
                        fjVar.e(x1.a(Integer.parseInt(b4)));
                    }
                } else if (b2 == 36) {
                    String b5 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b5)) {
                        fjVar.a(x1.a(Integer.parseInt(b5)));
                    }
                } else if (b2 == 80) {
                    String b6 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b6)) {
                        if (b6.indexOf(".") != -1) {
                            b6 = b6.substring(0, b6.indexOf("."));
                        }
                        fjVar.a(b6);
                    }
                } else if (b2 == 72) {
                    String b7 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b7)) {
                        String[] split = b7.trim().split(" ");
                        if (!TextUtils.isEmpty(split[0])) {
                            try {
                                fjVar.d(Integer.parseInt(split[0].split(",")[0]));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[1])) {
                            try {
                                fjVar.c(Integer.parseInt(split[1].split(",")[0]));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[2])) {
                            try {
                                fjVar.b(x1.a(Integer.parseInt(split[2].split(",")[0])));
                            } catch (NumberFormatException unused3) {
                            }
                        }
                        fjVar.a(true);
                    }
                }
            } catch (NumberFormatException | wi unused4) {
            }
        }
        yjVar.l1 = fjVar;
    }

    private void b(ui uiVar, zj zjVar) {
        String a;
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                if (d2.j() == 43 && (a = a(d2, 28)) != null) {
                    int parseInt = Integer.parseInt(a);
                    if (parseInt == 0) {
                        parseInt = -16777216;
                    }
                    e eVar = new e();
                    eVar.a(parseInt);
                    zjVar.j = eVar;
                }
            } catch (Exception unused) {
            }
        }
    }

    private void b(ui uiVar, zj zjVar, mj mjVar) {
        String b;
        pj pjVar = new pj();
        for (int i = 0; i < uiVar.e(); i++) {
            try {
                qi b2 = uiVar.b(i);
                int b3 = b2.b();
                if (b3 == 14) {
                    String b4 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b4)) {
                        pjVar.f(b4);
                    }
                } else if (b3 == 33) {
                    pjVar.d(b2.d().elementAt(0).b());
                    if (!TextUtils.isEmpty(pjVar.d())) {
                        byte[] d2 = aj.a(this.a.i()).d(pjVar.d(), "public");
                        if (d2 == null) {
                            d2 = aj.a(this.a.i()).d(pjVar.d(), "private");
                        }
                        if (d2 == null) {
                            mjVar.e().a(8, pjVar.d());
                        } else {
                            pjVar.a(d2);
                        }
                    }
                } else if (b3 == 7) {
                    if (b2.d().elementAt(0).d() != 0) {
                        b = b2.d().elementAt(0).b();
                    } else if (b2.d().elementAt(0).c() == 133) {
                        b = "Menulist:";
                    }
                    pjVar.a(b);
                } else if (b3 == 12) {
                    String trim = b2.d().elementAt(0).b().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        pjVar.e(trim);
                    }
                } else if (b3 == 81) {
                    String trim2 = b2.d().elementAt(0).b().trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        pjVar.g(trim2.trim());
                    }
                } else if (b3 == 63) {
                    String b5 = b2.d().elementAt(0).b();
                    if (b5 != null) {
                        pjVar.c(b5);
                    }
                } else if (b3 == 106) {
                    String b6 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b6)) {
                        pjVar.b(b6);
                    }
                } else if (b3 == 117) {
                    String b7 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b7)) {
                        pjVar.h(b7);
                    }
                }
            } catch (wi e) {
                e.printStackTrace();
                return;
            }
        }
        for (int i2 = 0; i2 < uiVar.i(); i2++) {
            if (uiVar.d(i2).j() == 31) {
                u uVar = new u(this.b, b.a(this.a.i()).a().a());
                for (int i3 = 0; i3 < uiVar.e(); i3++) {
                    qi b8 = uiVar.b(i3);
                    int b9 = b8.b();
                    int i4 = -16777216;
                    if (b9 == 28) {
                        try {
                            int parseInt = Integer.parseInt(b8.d().elementAt(0).b());
                            if (parseInt != 0) {
                                i4 = parseInt;
                            }
                            uVar.b(i4);
                        } catch (Exception unused) {
                            uVar.b(false);
                        }
                    } else if (b9 == 30) {
                        try {
                            uVar.d(Integer.parseInt(b8.d().elementAt(0).b()));
                        } catch (Exception unused2) {
                            uVar.d(-1);
                        }
                    } else if (b9 == 31) {
                        try {
                            uVar.c(Integer.parseInt(b8.d().elementAt(0).b()));
                        } catch (Exception unused3) {
                            uVar.c(-1);
                        }
                    } else if (b9 == 36) {
                        try {
                            int parseInt2 = Integer.parseInt(b8.d().elementAt(0).b());
                            if (parseInt2 != 0) {
                                i4 = parseInt2;
                            }
                            uVar.a(i4);
                        } catch (Exception unused4) {
                            uVar.a(false);
                        }
                    } else if (b9 == 98) {
                        String b10 = b8.d().elementAt(0).b();
                        if (!TextUtils.isEmpty(b10)) {
                            if (b10.contains("px") || b10.contains("PX")) {
                                b10 = b10.substring(0, b10.length() - 2);
                            }
                            try {
                                uVar.a(x1.a(Float.parseFloat(b10)));
                            } catch (Exception unused5) {
                                uVar.a(-1.0f);
                            }
                        }
                    } else {
                        if (b9 == 101) {
                            String b11 = b8.d().elementAt(0).b();
                            if (!TextUtils.isEmpty(b11)) {
                                if (b11.contains("px") || b11.contains("PX")) {
                                    b11 = b11.substring(0, b11.length() - 2);
                                }
                                try {
                                    uVar.b(Float.parseFloat(b11));
                                } catch (Exception unused6) {
                                    uVar.b(-1.0f);
                                }
                            }
                        }
                    }
                    e.printStackTrace();
                    return;
                }
                pjVar.a(uVar);
            }
        }
        zjVar.N = pjVar;
    }

    private tj c(ui uiVar) {
        tj tjVar = new tj();
        String a = a(uiVar, 24);
        if (a != null) {
            tjVar.f = a;
        }
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                if (d2.f() == 1) {
                    tjVar.g = d2.h();
                } else if (d2.j() == 20) {
                    for (int i2 = 0; i2 < d2.e(); i2++) {
                        qi b = d2.b(i2);
                        int b2 = b.b();
                        if (b2 == 14) {
                            tjVar.a = Integer.parseInt(b.d().elementAt(0).b());
                        } else if (b2 == 20) {
                            Integer.parseInt(b.d().elementAt(0).b());
                        } else if (b2 == 27) {
                            tjVar.e = Integer.parseInt(b.d().elementAt(0).b());
                        } else if (b2 == 21) {
                            tjVar.c = b.d().elementAt(0).b();
                        } else if (b2 == 22) {
                            tjVar.b = Integer.parseInt(b.d().elementAt(0).b());
                        }
                    }
                    tjVar.h = a(d2);
                }
            } catch (wi unused) {
            }
        }
        return tjVar;
    }

    private void c(ui uiVar, mj mjVar) {
        String a = a(uiVar, 33);
        if (a != null) {
            this.a.a(a, mjVar.e());
        }
    }

    private void c(ui uiVar, yj yjVar) {
        gj gjVar = new gj();
        for (int i = 0; i < uiVar.e(); i++) {
            qi b = uiVar.b(i);
            try {
                int b2 = b.b();
                if (b2 == 24) {
                    String b3 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b3)) {
                        gjVar.a(b3);
                    }
                } else if (b2 == 33) {
                    String b4 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b4)) {
                        gjVar.c(b4);
                    }
                } else if (b2 == 28) {
                    String b5 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b5)) {
                        gjVar.e(x1.a(Integer.parseInt(b5)));
                    }
                } else if (b2 == 36) {
                    String b6 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b6)) {
                        gjVar.a(x1.a(Integer.parseInt(b6)));
                    }
                } else if (b2 == 80) {
                    String b7 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b7)) {
                        if (b7.indexOf(".") != -1) {
                            b7 = b7.substring(0, b7.indexOf("."));
                        }
                        gjVar.b(b7);
                    }
                } else if (b2 == 72) {
                    String b8 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b8)) {
                        String[] split = b8.trim().split(" ");
                        if (!TextUtils.isEmpty(split[0])) {
                            try {
                                gjVar.d(Integer.parseInt(split[0].split(",")[0]));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[1])) {
                            try {
                                gjVar.c(Integer.parseInt(split[1].split(",")[0]));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[2])) {
                            try {
                                gjVar.b(x1.a(Integer.parseInt(split[2].split(",")[0])));
                            } catch (NumberFormatException unused3) {
                            }
                        }
                        gjVar.a(true);
                    }
                }
            } catch (NumberFormatException | wi unused4) {
            }
        }
        yjVar.m1 = gjVar;
    }

    private void c(ui uiVar, zj zjVar) {
        int X;
        qj qjVar = new qj(this.b, b.a(this.a.i()).a().a());
        String a = a(uiVar, 13);
        qjVar.d(a != null ? a.trim() : j1.a(this.b).d0());
        if (qjVar.l().equals("B")) {
            String a2 = a(uiVar, 40);
            if (a2 == null) {
                a2 = j1.a(this.b).c0();
            }
            qjVar.c(a2);
            String a3 = a(uiVar, 29);
            qjVar.a(a3 != null ? a3.trim() : j1.a(this.b).T());
        }
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                if (d2.j() == 31) {
                    String a4 = a(d2, 36);
                    int i2 = -16777216;
                    if (a4 != null) {
                        X = Integer.parseInt(a4.trim());
                        if (X == 0) {
                            X = -16777216;
                        }
                    } else {
                        X = j1.a(this.b).X();
                    }
                    qjVar.b(X);
                    String a5 = a(d2, 28);
                    if (a5 != null) {
                        int parseInt = Integer.parseInt(a5.trim());
                        if (parseInt != 0) {
                            i2 = parseInt;
                        }
                        qjVar.b(i2);
                    } else {
                        qjVar.b(j1.a(this.b).Y());
                    }
                    String a6 = a(d2, 31);
                    qjVar.c(a6 != null ? Integer.parseInt(a6.trim()) : j1.a(this.b).Z());
                    String a7 = a(d2, 98);
                    if (!TextUtils.isEmpty(a7)) {
                        if (a7.contains("px") || a7.contains("PX")) {
                            a7 = a7.substring(0, a7.length() - 2);
                        }
                        try {
                            qjVar.a(x1.a(Float.parseFloat(a7)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String a8 = a(d2, 101);
                    if (!TextUtils.isEmpty(a8)) {
                        if (a8.contains("px") || a8.contains("PX")) {
                            a8 = a8.substring(0, a8.length() - 2);
                        }
                        try {
                            qjVar.b(Float.parseFloat(a8));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (qjVar.l().equalsIgnoreCase("B")) {
                        String a9 = a(d2, 30);
                        qjVar.d(a9 != null ? Integer.parseInt(a9.trim()) : j1.a(this.b).a0());
                    }
                }
            } catch (Exception unused) {
            }
        }
        zjVar.M = qjVar;
    }

    private void d(ui uiVar, mj mjVar) {
        try {
            String a = a(uiVar, 33);
            if (!TextUtils.isEmpty(a) && !this.a.c(a)) {
                mjVar.e().a(7, a);
            }
            String a2 = a(uiVar, 28);
            if (a2 != null) {
                int parseInt = Integer.parseInt(a2);
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                if (this.a.x()) {
                    j1.a(this.a.i()).e(parseInt);
                } else {
                    this.a.a(parseInt);
                }
            }
            String a3 = a(uiVar, 80);
            if (TextUtils.isEmpty(a3)) {
                return;
            }
            if (a3.indexOf(".") != -1) {
                a3 = a3.substring(0, a3.indexOf("."));
            }
            this.a.e(a3);
        } catch (Exception unused) {
        }
    }

    private void d(ui uiVar, yj yjVar) {
        String b;
        if (yjVar.P0 == null) {
            yjVar.P0 = new HashMap<>();
        }
        hj hjVar = new hj();
        for (int i = 0; i < uiVar.e(); i++) {
            try {
                qi b2 = uiVar.b(i);
                int b3 = b2.b();
                if (b3 == 14) {
                    String b4 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b4)) {
                        hjVar.f(b4);
                    }
                } else if (b3 == 7) {
                    if (b2.d().elementAt(0).d() != 0) {
                        b = b2.d().elementAt(0).b();
                    } else if (b2.d().elementAt(0).c() == 133) {
                        b = "Menulist:";
                    }
                    hjVar.b(b);
                } else if (b3 == 63) {
                    String b5 = b2.d().elementAt(0).b();
                    if (b5 != null) {
                        hjVar.d(b5);
                    }
                } else if (b3 == 106) {
                    String b6 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b6)) {
                        hjVar.c(b6);
                    }
                } else if (b3 == 12) {
                    String b7 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b7)) {
                        hjVar.e(b7);
                    }
                } else if (b3 == 117) {
                    String b8 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b8)) {
                        hjVar.a(b8);
                    }
                }
            } catch (wi e) {
                e.printStackTrace();
                return;
            }
        }
        yjVar.P0.put(hjVar.f(), hjVar);
    }

    private void d(ui uiVar, zj zjVar) {
        String b;
        String b2;
        a1 a1Var = new a1();
        if (zjVar.d == null) {
            zjVar.d = new Vector<>();
        }
        zjVar.d.add(a1Var);
        for (int i = 0; i < uiVar.e(); i++) {
            qi b3 = uiVar.b(i);
            try {
                int b4 = b3.b();
                if (b4 == 23) {
                    a1Var.a = b3.d().elementAt(0).b();
                } else if (b4 == 13) {
                    if (b3.d().elementAt(0).d() != 0) {
                        b2 = b3.d().elementAt(0).b();
                    } else if (b3.d().elementAt(0).c() == 144) {
                        b2 = "image";
                    }
                    a1Var.b = b2;
                } else if (b4 == 14) {
                    String b5 = b3.d().elementAt(0).b();
                    if (b5 != null) {
                        for (String str : b5.split("[|]")) {
                            a1Var.d.add(str);
                        }
                    }
                } else if (b4 == 7) {
                    String b6 = b3.d().elementAt(0).b();
                    if (b6 != null) {
                        a1Var.c = b6;
                    }
                } else if (b4 == 94 && (b = b3.d().elementAt(0).b()) != null && (b.equalsIgnoreCase("T") || b.equalsIgnoreCase("true"))) {
                    a1Var.e = true;
                }
            } catch (wi unused) {
            }
        }
    }

    private boolean d(ui uiVar) {
        try {
            int j = uiVar.j();
            if (uiVar.a() != 1) {
                if (j != 28) {
                    return false;
                }
                if (!this.c) {
                    q(uiVar, null);
                }
                return true;
            }
            if (j != 27) {
                return false;
            }
            String a = a(uiVar);
            if (TextUtils.isEmpty(a) || this.c) {
                return false;
            }
            j1.a(this.a.i()).K(a);
            return false;
        } catch (wi unused) {
            return false;
        }
    }

    private void e(ui uiVar) {
        if (uiVar == null || d(uiVar)) {
            return;
        }
        for (int i = 0; i < uiVar.i(); i++) {
            e(uiVar.d(i));
        }
    }

    private void e(ui uiVar, mj mjVar) {
        try {
            int parseInt = Integer.parseInt(a(uiVar, 28));
            if (parseInt == 0) {
                parseInt = -16777216;
            }
            j1.a(this.a.i()).s(parseInt);
        } catch (Exception unused) {
        }
    }

    private void e(ui uiVar, yj yjVar) {
        ij ijVar = new ij();
        for (int i = 0; i < uiVar.e(); i++) {
            qi b = uiVar.b(i);
            try {
                int b2 = b.b();
                if (b2 == 33) {
                    String b3 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b3)) {
                        ijVar.b(b3);
                    }
                } else if (b2 == 28) {
                    String b4 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b4)) {
                        ijVar.e(x1.a(Integer.parseInt(b4)));
                    }
                } else if (b2 == 36) {
                    String b5 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b5)) {
                        ijVar.a(x1.a(Integer.parseInt(b5)));
                    }
                } else if (b2 == 80) {
                    String b6 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b6)) {
                        if (b6.indexOf(".") != -1) {
                            b6 = b6.substring(0, b6.indexOf("."));
                        }
                        ijVar.a(b6);
                    }
                } else if (b2 == 72) {
                    String b7 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b7)) {
                        String[] split = b7.trim().split(" ");
                        if (!TextUtils.isEmpty(split[0])) {
                            try {
                                ijVar.d(Integer.parseInt(split[0].split(",")[0]));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[1])) {
                            try {
                                ijVar.c(Integer.parseInt(split[1].split(",")[0]));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[2])) {
                            try {
                                ijVar.b(x1.a(Integer.parseInt(split[2].split(",")[0])));
                            } catch (NumberFormatException unused3) {
                            }
                        }
                        ijVar.a(true);
                    }
                }
            } catch (NumberFormatException | wi unused4) {
            }
        }
        yjVar.k1 = ijVar;
    }

    private void e(ui uiVar, zj zjVar) {
        String b;
        zjVar.c = new k1(this.b, zjVar);
        for (int i = 0; i < uiVar.e(); i++) {
            qi b2 = uiVar.b(i);
            try {
                int b3 = b2.b();
                if (b3 == 41) {
                    zjVar.c.a = false;
                } else if (b3 == 7) {
                    zjVar.c.f = b2.d().elementAt(0).b();
                } else if (b3 == 20) {
                    zjVar.c.e = Long.parseLong(b2.d().elementAt(0).b());
                } else if (b3 == 13) {
                    if (b2.d().elementAt(0).d() != 0 && (b = b2.d().elementAt(0).b()) != null) {
                        if (b.equals("oncache")) {
                            zjVar.c.b = true;
                        } else if (b.equals("onserver")) {
                            zjVar.c.c = true;
                        } else if (b.equals("onload")) {
                            zjVar.c.d = true;
                        }
                    }
                } else if (b3 == 106) {
                    String trim = b2.d().elementAt(0).b().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        zjVar.c.q = trim;
                    }
                } else if (b3 == 117) {
                    String trim2 = b2.d().elementAt(0).b().trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        zjVar.c.r = trim2;
                    }
                }
            } catch (wi | Exception unused) {
            }
        }
    }

    private kj f(ui uiVar, yj yjVar) {
        String b;
        kj kjVar = new kj(yjVar);
        for (int i = 0; i < uiVar.e(); i++) {
            qi b2 = uiVar.b(i);
            try {
                int b3 = b2.b();
                if (b3 == 20) {
                    String b4 = b2.d().elementAt(0).b();
                    if (b4 != null) {
                        kjVar.b = b4;
                    }
                } else if (b3 == 7) {
                    if (b2.d().elementAt(0).d() != 0) {
                        b = b2.d().elementAt(0).b();
                    } else if (b2.d().elementAt(0).c() == 133) {
                        b = "Menulist:";
                    }
                    kjVar.c = b;
                }
            } catch (Exception unused) {
            }
        }
        String a = a(uiVar);
        if (a != null) {
            kjVar.a = a;
        }
        return kjVar;
    }

    private void f(ui uiVar, mj mjVar) {
    }

    private void f(ui uiVar, zj zjVar) {
        if (zjVar.Q == null) {
            zjVar.Q = new HashMap<>();
        }
        ak akVar = new ak();
        String str = null;
        for (int i = 0; i < uiVar.e(); i++) {
            qi b = uiVar.b(i);
            try {
                int b2 = b.b();
                if (b2 == 14) {
                    str = b.d().elementAt(0).b();
                    akVar.b(str);
                } else if (b2 == 20) {
                    akVar.c(b.d().elementAt(0).b());
                } else if (b2 == 106) {
                    akVar.a(b.d().elementAt(0).b());
                }
            } catch (wi unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zjVar.Q.put(str, akVar);
    }

    private void g(ui uiVar, mj mjVar) {
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                int j = d2.j();
                if (d2.a() != 1 && j != 56 && j != 55) {
                    if (j == 54) {
                        int z = j1.a(this.a.i()).z();
                        String a = a(d2);
                        if (a != null) {
                            try {
                                int parseInt = Integer.parseInt(a);
                                z = parseInt == 0 ? -16777216 : parseInt;
                            } catch (Exception unused) {
                            }
                            j1.a(this.a.i()).w(z);
                        }
                    } else if (j == 58) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    private void g(ui uiVar, yj yjVar) {
        for (int i = 0; i < uiVar.e(); i++) {
            qi b = uiVar.b(i);
            try {
                int b2 = b.b();
                if (b2 == 33) {
                    String b3 = b.d().elementAt(0).b();
                    if (b3 != null) {
                        yjVar.N = b3;
                    }
                } else if (b2 == 16) {
                    String a = a(uiVar);
                    if (!TextUtils.isEmpty(a)) {
                        yjVar.t0 = c.b(a.getBytes());
                    }
                } else if (b2 == 38) {
                    String b4 = b.d().elementAt(0).b();
                    if (b4 != null) {
                        if (yjVar.e == 2) {
                            yjVar.k0 = b4;
                        } else {
                            yjVar.m0 = b4;
                        }
                    }
                } else if (b2 == 39) {
                    String b5 = b.d().elementAt(0).b();
                    if (b5 != null) {
                        if (yjVar.e == 2) {
                            yjVar.l0 = b5;
                        } else {
                            yjVar.n0 = b5;
                        }
                    }
                } else if (b2 == 80) {
                    String b6 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b6)) {
                        if (b6.indexOf(".") != -1) {
                            b6 = b6.substring(0, b6.indexOf("."));
                        }
                        yjVar.p0 = b6;
                    }
                } else if (b2 == 94) {
                    String b7 = b.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b7) && (b7.equalsIgnoreCase("T") || b7.equalsIgnoreCase("true"))) {
                        yjVar.j1 = true;
                    }
                }
            } catch (wi unused) {
            }
        }
        if (TextUtils.isEmpty(yjVar.p0) || !yjVar.b1 || b.a(this.b).a().i().equalsIgnoreCase("en")) {
            return;
        }
        yjVar.p0 += "_" + b.a(this.b).a().i();
    }

    private void h(ui uiVar, mj mjVar) {
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                int j = d2.j();
                if (d2.a() == 1) {
                    if (j == 37) {
                        m(d2, mjVar);
                    } else if (j == 19) {
                        f(d2, mjVar);
                    }
                } else if (j == 17) {
                    String a = a(d2, 33);
                    if (a != null) {
                        this.a.a(a, mjVar.e());
                    }
                } else if (j == 46) {
                    e(d2, mjVar);
                } else if (j == 52) {
                    g(d2, mjVar);
                } else if (j == 23) {
                    r(d2, mjVar);
                } else if (j == 51) {
                    o(d2, mjVar);
                }
            } catch (wi unused) {
            }
        }
    }

    private void h(ui uiVar, yj yjVar) {
        int b;
        int i;
        u uVar = new u(this.b, b.a(this.a.i()).a().a());
        for (int i2 = 0; i2 < uiVar.e(); i2++) {
            qi b2 = uiVar.b(i2);
            try {
                b = b2.b();
                i = -16777216;
            } catch (wi | Exception unused) {
            }
            if (b == 28) {
                try {
                    int parseInt = Integer.parseInt(b2.d().elementAt(0).b());
                    if (parseInt != 0) {
                        i = parseInt;
                    }
                    uVar.b(i);
                } catch (Exception unused2) {
                    uVar.b(false);
                }
            } else if (b == 30) {
                try {
                    uVar.d(Integer.parseInt(b2.d().elementAt(0).b()));
                } catch (Exception unused3) {
                    uVar.d(-1);
                }
            } else {
                if (b == 87) {
                    String b3 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b3)) {
                        String trim = b3.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        uVar.b(trim);
                    }
                } else if (b == 31) {
                    try {
                        uVar.c(Integer.parseInt(b2.d().elementAt(0).b()));
                    } catch (Exception unused4) {
                        uVar.c(-1);
                    }
                } else if (b == 36) {
                    try {
                        int parseInt2 = Integer.parseInt(b2.d().elementAt(0).b());
                        if (parseInt2 != 0) {
                            i = parseInt2;
                        }
                        uVar.a(i);
                    } catch (Exception unused5) {
                        uVar.a(false);
                    }
                } else if (b == 98) {
                    String b4 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b4)) {
                        if (b4.contains("px") || b4.contains("PX")) {
                            b4 = b4.substring(0, b4.length() - 2);
                        }
                        try {
                            uVar.a(x1.a(Float.parseFloat(b4)));
                        } catch (Exception unused6) {
                            uVar.a(-1.0f);
                        }
                    }
                } else if (b == 101) {
                    String b5 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b5)) {
                        if (b5.contains("px") || b5.contains("PX")) {
                            b5 = b5.substring(0, b5.length() - 2);
                        }
                        try {
                            uVar.b(Float.parseFloat(b5));
                        } catch (Exception unused7) {
                            uVar.b(-1.0f);
                        }
                    }
                }
            }
        }
        yjVar.p = uVar;
    }

    private void i(ui uiVar, mj mjVar) {
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                int j = d2.j();
                if (d2.a() != 1 && j != 56 && j != 55) {
                    if (j == 54) {
                        int i2 = -7829368;
                        String a = a(d2);
                        if (a != null) {
                            try {
                                int parseInt = Integer.parseInt(a);
                                i2 = parseInt == 0 ? -16777216 : parseInt;
                            } catch (Exception unused) {
                            }
                            j1.a(this.a.i()).f(i2);
                        }
                    } else if (j == 58) {
                    }
                }
            } catch (wi unused2) {
            }
        }
    }

    private void i(ui uiVar, yj yjVar) {
        int X;
        String b0;
        qj qjVar = new qj(this.b, b.a(this.a.i()).a().a());
        String a = a(uiVar, 13);
        qjVar.d(a != null ? a.trim() : j1.a(this.b).d0());
        if (qjVar.l().equals("B")) {
            String a2 = a(uiVar, 40);
            if (a2 == null) {
                a2 = j1.a(this.b).c0();
            }
            qjVar.c(a2);
            String a3 = a(uiVar, 29);
            qjVar.a(a3 != null ? a3.trim() : j1.a(this.b).T());
        }
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                if (d2.j() == 31) {
                    String a4 = a(d2, 36);
                    int i2 = -16777216;
                    if (a4 != null) {
                        X = Integer.parseInt(a4.trim());
                        if (X == 0) {
                            X = -16777216;
                        }
                    } else {
                        X = j1.a(this.b).X();
                    }
                    qjVar.b(X);
                    String a5 = a(d2, 28);
                    if (a5 != null) {
                        int parseInt = Integer.parseInt(a5.trim());
                        if (parseInt != 0) {
                            i2 = parseInt;
                        }
                        qjVar.b(i2);
                    } else {
                        qjVar.b(j1.a(this.b).Y());
                    }
                    String a6 = a(d2, 31);
                    qjVar.c(a6 != null ? Integer.parseInt(a6.trim()) : j1.a(this.b).Z());
                    String a7 = a(d2, 87);
                    if (TextUtils.isEmpty(a7)) {
                        b0 = j1.a(this.b).b0();
                    } else {
                        String trim = a7.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        b0 = trim.trim();
                    }
                    qjVar.b(b0);
                    String a8 = a(d2, 98);
                    if (!TextUtils.isEmpty(a8)) {
                        if (a8.contains("px") || a8.contains("PX")) {
                            a8 = a8.substring(0, a8.length() - 2);
                        }
                        try {
                            qjVar.a(x1.a(Float.parseFloat(a8)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String a9 = a(d2, 101);
                    if (!TextUtils.isEmpty(a9)) {
                        if (a9.contains("px") || a9.contains("PX")) {
                            a9 = a9.substring(0, a9.length() - 2);
                        }
                        try {
                            qjVar.b(Float.parseFloat(a9));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (qjVar.l().equalsIgnoreCase("B")) {
                        String a10 = a(d2, 30);
                        qjVar.d(a10 != null ? Integer.parseInt(a10.trim()) : j1.a(this.b).a0());
                    }
                }
            } catch (Exception unused) {
            }
        }
        yjVar.q = qjVar;
    }

    private void j(ui uiVar, mj mjVar) {
        int i;
        String a = a(uiVar, 36);
        if (a != null) {
            try {
                int parseInt = Integer.parseInt(a);
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                j1.a(this.a.i()).a(parseInt);
            } catch (Exception unused) {
            }
        } else {
            j1.a(this.a.i()).a(0);
        }
        for (int i2 = 0; i2 < uiVar.i(); i2++) {
            ui d2 = uiVar.d(i2);
            try {
                if (d2.j() == 31) {
                    String a2 = a(d2, 28);
                    if (a2 != null) {
                        try {
                            i = Integer.parseInt(a2);
                            if (i == 0) {
                                i = -16777216;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                        }
                        j1.a(this.a.i()).b(i);
                    } else {
                        j1.a(this.a.i()).b(0);
                    }
                    String a3 = a(d2, 87);
                    if (!TextUtils.isEmpty(a3)) {
                        String trim = a3.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        j1.a(this.a.i()).j(trim);
                    }
                    String a4 = a(d2, 30);
                    if (a4 != null) {
                        j1.a(this.a.i()).d(Integer.parseInt(a4));
                    } else {
                        j1.a(this.a.i()).d(0);
                    }
                    String a5 = a(d2, 31);
                    if (a5 != null) {
                        j1.a(this.a.i()).c(Integer.parseInt(a5));
                    } else {
                        j1.a(this.a.i()).c(nj.a);
                    }
                    String a6 = a(d2, 98);
                    if (!TextUtils.isEmpty(a6)) {
                        if (a6.contains("px") || a6.contains("PX")) {
                            a6 = a6.substring(0, a6.length() - 2);
                        }
                        try {
                            j1.a(this.a.i()).a(x1.a(Float.parseFloat(a6)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String a7 = a(d2, 101);
                    if (!TextUtils.isEmpty(a7)) {
                        if (a7.contains("px") || a7.contains("PX")) {
                            a7 = a7.substring(0, a7.length() - 2);
                        }
                        try {
                            j1.a(this.a.i()).b(Float.parseFloat(a7));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    private void k(ui uiVar, mj mjVar) {
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                int j = d2.j();
                if (d2.a() == 1) {
                    if (j == 32) {
                        mjVar.x = "";
                    } else if (j == 38) {
                        l(d2, mjVar);
                    }
                }
            } catch (wi unused) {
            }
        }
    }

    private void l(ui uiVar, mj mjVar) {
        String a = a(uiVar);
        if (a == null) {
            a = "";
        }
        mjVar.w = a;
    }

    private void m(ui uiVar, mj mjVar) {
        int i;
        String a = a(uiVar, 36);
        if (a != null) {
            try {
                j1.a(this.a.i()).g(Integer.parseInt(a));
            } catch (Exception unused) {
            }
        } else {
            j1.a(this.a.i()).m("false");
        }
        for (int i2 = 0; i2 < uiVar.i(); i2++) {
            ui d2 = uiVar.d(i2);
            try {
                if (d2.j() == 31) {
                    String a2 = a(d2, 28);
                    if (a2 != null) {
                        try {
                            i = Integer.parseInt(a2);
                            if (i == 0) {
                                i = -16777216;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                        }
                        j1.a(this.a.i()).h(i);
                    } else {
                        j1.a(this.a.i()).n("false");
                    }
                    String a3 = a(d2, 87);
                    if (!TextUtils.isEmpty(a3)) {
                        String trim = a3.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        j1.a(this.a.i()).q(trim);
                    }
                    String a4 = a(d2, 30);
                    if (a4 != null) {
                        j1.a(this.a.i()).j(Integer.parseInt(a4));
                    } else {
                        j1.a(this.a.i()).j(-1);
                    }
                    String a5 = a(d2, 31);
                    if (a5 != null) {
                        j1.a(this.a.i()).i(Integer.parseInt(a5));
                    } else {
                        j1.a(this.a.i()).i(-1);
                    }
                    String a6 = a(d2, 98);
                    if (!TextUtils.isEmpty(a6)) {
                        if (a6.contains("px") || a6.contains("PX")) {
                            a6 = a6.substring(0, a6.length() - 2);
                        }
                        try {
                            j1.a(this.a.i()).c(x1.a(Float.parseFloat(a6)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String a7 = a(d2, 101);
                    if (!TextUtils.isEmpty(a7)) {
                        if (a7.contains("px") || a7.contains("PX")) {
                            a7 = a7.substring(0, a7.length() - 2);
                        }
                        try {
                            j1.a(this.a.i()).d(Float.parseFloat(a7));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    private void n(ui uiVar, mj mjVar) {
        try {
            String a = a(uiVar, 33);
            if (a != null && !TextUtils.isEmpty(a) && !mjVar.c(a)) {
                mjVar.e().a(3, a);
            }
            String a2 = a(uiVar, 80);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            if (a2.indexOf(".") != -1) {
                a2 = a2.substring(0, a2.indexOf("."));
            }
            mjVar.d(a2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0135 A[Catch: Exception -> 0x0172, TryCatch #4 {Exception -> 0x0172, blocks: (B:9:0x003b, B:11:0x0043, B:14:0x0062, B:16:0x006c, B:18:0x0076, B:19:0x007c, B:20:0x0089, B:22:0x0092, B:23:0x00b1, B:25:0x00b7, B:26:0x00d6, B:29:0x00e8, B:31:0x00ee, B:52:0x0114, B:53:0x011a, B:35:0x0129, B:37:0x0135, B:39:0x013b, B:46:0x015d, B:47:0x0163, B:49:0x0141, B:50:0x016b, B:54:0x00f4, B:55:0x0122, B:56:0x00c9, B:57:0x00a4, B:42:0x014b, B:34:0x00fe), top: B:8:0x003b, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016b A[Catch: Exception -> 0x0172, TRY_LEAVE, TryCatch #4 {Exception -> 0x0172, blocks: (B:9:0x003b, B:11:0x0043, B:14:0x0062, B:16:0x006c, B:18:0x0076, B:19:0x007c, B:20:0x0089, B:22:0x0092, B:23:0x00b1, B:25:0x00b7, B:26:0x00d6, B:29:0x00e8, B:31:0x00ee, B:52:0x0114, B:53:0x011a, B:35:0x0129, B:37:0x0135, B:39:0x013b, B:46:0x015d, B:47:0x0163, B:49:0x0141, B:50:0x016b, B:54:0x00f4, B:55:0x0122, B:56:0x00c9, B:57:0x00a4, B:42:0x014b, B:34:0x00fe), top: B:8:0x003b, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o(defpackage.ui r10, defpackage.mj r11) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi.o(ui, mj):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    private zj p(ui uiVar, mj mjVar) {
        lj ljVar;
        String a;
        int b;
        int i;
        String trim;
        String str;
        int i2 = d;
        if (1 == i2) {
            ljVar = mjVar.e();
        } else if (1 < i2) {
            ljVar = new lj(this.b);
            mjVar.a(ljVar);
            mjVar.c(ljVar);
        } else {
            ljVar = null;
        }
        d++;
        if (ljVar == null) {
            ljVar = new lj(this.b);
            mjVar.a(ljVar);
            mjVar.c(ljVar);
        }
        lj ljVar2 = ljVar;
        zj zjVar = new zj(this.b);
        ?? r9 = 0;
        x1.a(false);
        ljVar2.a(zjVar);
        if (this.a.y()) {
            ljVar2.a(this.a.q());
        }
        for (int i3 = 0; i3 < uiVar.e(); i3++) {
            qi b2 = uiVar.b(i3);
            try {
                b = b2.b();
            } catch (wi e) {
                e.printStackTrace();
            }
            if (b == 9) {
                str = "grid";
            } else if (b == 10) {
                str = "list";
            } else {
                if (b == 13) {
                    if (b2.d().elementAt(0).d() == 1) {
                        String b3 = b2.d().elementAt(0).b();
                        zjVar.m = b3;
                        if (!TextUtils.isEmpty(b3)) {
                            str = zjVar.m.trim();
                        }
                    } else {
                        int c = b2.d().elementAt(0).c();
                        if (c == 146) {
                            str = "confirm";
                        } else if (c == 145) {
                            str = "error";
                        } else if (c == 140) {
                            str = "info";
                        }
                    }
                } else if (b == 62) {
                    x1.a(true);
                } else if (b == 55) {
                    zjVar.t = false;
                } else if (b == 82) {
                    String b4 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b4)) {
                        b4 = b4.trim();
                    }
                    try {
                        zjVar.u = Integer.parseInt(b4);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else if (b == 17) {
                    zjVar.h = b2.d().elementAt(0).b();
                } else if (b == 33) {
                    String b5 = b2.d().elementAt(0).b();
                    zjVar.n = b5;
                    if (!TextUtils.isEmpty(b5)) {
                        byte[] d2 = aj.a(this.a.i()).d(zjVar.n, "public");
                        if (d2 == null) {
                            d2 = aj.a(this.a.i()).d(zjVar.n, "private");
                        }
                        if (d2 == null) {
                            mjVar.e().a(8, zjVar.n);
                        } else {
                            zjVar.o = d2;
                        }
                    }
                } else if (b == 80) {
                    String b6 = b2.d().elementAt(0).b();
                    if (!TextUtils.isEmpty(b6)) {
                        if (b6.indexOf(".") != -1) {
                            b6 = b6.substring(0, b6.indexOf("."));
                        }
                        zjVar.i = b6;
                    }
                } else if (b == 29) {
                    zjVar.a = b2.d().elementAt(0).b();
                } else if (b == 73) {
                    zjVar.b = b2.d().elementAt(0).b();
                } else if (b == 38) {
                    String b7 = b2.d().elementAt(0).b();
                    if (b7 != null) {
                        zjVar.v = b7;
                    }
                } else if (b == 39) {
                    String b8 = b2.d().elementAt(0).b();
                    if (b8 != null) {
                        zjVar.w = b8;
                    }
                } else if (b == 99) {
                    b2.d().elementAt(0).b();
                } else if (b == 71) {
                    String b9 = b2.d().elementAt(0).b();
                    TextUtils.SimpleStringSplitter<String> simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
                    simpleStringSplitter.setString(b9);
                    int i4 = 0;
                    for (String str2 : simpleStringSplitter) {
                        if (i4 == 0) {
                            zjVar.y = str2;
                        } else if (i4 == 1) {
                            zjVar.z = str2;
                        } else if (i4 == 2) {
                            zjVar.A = str2;
                        } else if (i4 == 3) {
                            zjVar.x = str2;
                        }
                        i4++;
                    }
                } else if (b == 70) {
                    String b10 = b2.d().elementAt(0).b();
                    TextUtils.SimpleStringSplitter<String> simpleStringSplitter2 = new TextUtils.SimpleStringSplitter(',');
                    simpleStringSplitter2.setString(b10);
                    int i5 = 0;
                    for (String str3 : simpleStringSplitter2) {
                        if (i5 == 0) {
                            zjVar.C = str3;
                        } else if (i5 == 1) {
                            zjVar.D = str3;
                        } else if (i5 == 2) {
                            zjVar.E = str3;
                        } else if (i5 == 3) {
                            zjVar.B = str3;
                        }
                        i5++;
                    }
                } else if (b == 7) {
                    if (b2.d().elementAt(0).d() != 0) {
                        zjVar.G = b2.d().elementAt(0).b();
                    } else if (b2.d().elementAt(0).c() == 133) {
                        zjVar.G = "Menulist:";
                    }
                } else if (b == 12) {
                    zjVar.I = b2.d().elementAt(0).b();
                } else if (b == 85) {
                    String trim2 = b2.d().elementAt(0).b().trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        if (trim2.startsWith("Menulist:")) {
                            trim2 = trim2.substring(9, trim2.length());
                        }
                        zjVar.H = trim2.trim();
                    }
                } else {
                    if (b == 92) {
                        trim = b2.d().elementAt(0).b().trim();
                    } else if (b == 93) {
                        trim = b2.d().elementAt(0).b().trim();
                    } else if (b == 81) {
                        trim = b2.d().elementAt(0).b().trim();
                        if (!TextUtils.isEmpty(trim)) {
                        }
                    } else if (b == 97) {
                        ej ejVar = new ej(b.a(this.a.i()).a().a());
                        String trim3 = b2.d().elementAt(0).b().trim();
                        if (!TextUtils.isEmpty(trim3)) {
                            String[] split = trim3.split(",");
                            while (i < split.length) {
                                if (i == 0) {
                                    ejVar.b(split[i].trim());
                                } else if (i != 1) {
                                    if (i != 2) {
                                        i = i != 3 ? i + 1 : 0;
                                        ejVar.a(split[i].trim());
                                    }
                                    ejVar.c(split[i].trim());
                                    ejVar.a(split[i].trim());
                                }
                                ejVar.d(split[i].trim());
                                ejVar.c(split[i].trim());
                                ejVar.a(split[i].trim());
                            }
                            zjVar.O = ejVar;
                        }
                    } else if (b == 106) {
                        String trim4 = b2.d().elementAt(0).b().trim();
                        if (!TextUtils.isEmpty(trim4)) {
                            zjVar.J = trim4;
                        }
                    } else if (b == 117) {
                        String trim5 = b2.d().elementAt(0).b().trim();
                        if (!TextUtils.isEmpty(trim5)) {
                            zjVar.K = trim5;
                        }
                    }
                    trim.trim();
                }
            }
            zjVar.m = str;
        }
        try {
            if (zjVar.i != null && this.b.getResources().getIdentifier(zjVar.i, "drawable", this.b.getPackageName()) > 0 && zjVar.n != null) {
                mjVar.e().b(8, zjVar.n);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        int i6 = 0;
        while (i6 < uiVar.i()) {
            ui d3 = uiVar.d(i6);
            if (d3.f() == 1) {
                zjVar.g = d3.h();
            } else {
                int j = d3.j();
                if (d3.a() == 1) {
                    if (j == 34) {
                        e(d3, zjVar);
                    } else if (j == 28) {
                        b(d3, zjVar);
                    } else if (j == 31) {
                        yj b11 = b(d3);
                        if (b11 != null) {
                            zjVar.b(b11);
                        }
                    } else if (j == 33) {
                        try {
                            a(d3, zjVar, (yj) null, (e) null);
                        } catch (wi unused) {
                            i6++;
                            r9 = 0;
                        }
                    } else if (j == 40) {
                        d(d3, zjVar);
                    } else if (j == 48) {
                        f(d3, zjVar);
                    } else if (j == 51) {
                        b(d3, zjVar, mjVar);
                    } else if (j == 50) {
                        a(d3, zjVar);
                    }
                } else if (j == 22) {
                    a(d3, mjVar, zjVar, true);
                } else if (j == 10) {
                    this.a.a(new e());
                    try {
                        a(d3, ljVar2, (mj) null);
                        for (int i7 = 0; i7 < d3.i(); i7++) {
                            ui d4 = d3.d(i7);
                            if (d4.a() == 0 && d4.j() == 19 && (a = a(d4)) != null && a.equals("F")) {
                                this.a.g().o = r9;
                            }
                        }
                    } catch (wi unused2) {
                        i6++;
                        r9 = 0;
                    }
                } else if (j == 13) {
                    yj a2 = a(d3, zjVar, mjVar);
                    if (d3.i() > 0) {
                        ui d5 = d3.d(r9);
                        if (d5.j() == 13 || d5.j() == 31 || d5.j() == 50) {
                            a(d3, a2, zjVar, mjVar);
                        }
                    }
                    if (a2.e == 8) {
                        try {
                            ljVar2.b(a2);
                        } catch (wi unused3) {
                        }
                    } else if (a2.e == 31) {
                        ljVar2.c(a2);
                    } else if (a2.e == 42) {
                        ljVar2.a(a2);
                    }
                    zjVar.b(a2);
                    i6++;
                    r9 = 0;
                } else {
                    if (j == 19) {
                        try {
                            a(d3, (yj) null, zjVar);
                        } catch (wi unused4) {
                        }
                    } else if (j == 43) {
                        a(d3, mjVar, zjVar);
                    } else if (j == 23) {
                        c(d3, zjVar);
                    }
                    i6++;
                    r9 = 0;
                }
            }
            i6++;
            r9 = 0;
        }
        if (x1.c()) {
            int i8 = zjVar.u;
            if (i8 == 1) {
                zjVar.u = 2;
            } else if (i8 == 2) {
                zjVar.u = 1;
            }
            HashMap<String, hj> hashMap = zjVar.P;
            if (hashMap != null && hashMap.size() > 0) {
                hj hjVar = zjVar.P.get("leftswipe");
                zjVar.P.put("leftswipe", zjVar.P.get("rightswipe"));
                zjVar.P.put("rightswipe", hjVar);
            }
        }
        if (zjVar.N == null && x1.e() && zjVar.m.equals("popup")) {
            pj pjVar = new pj();
            pjVar.f("accessibility");
            pjVar.g(" ");
            zjVar.N = pjVar;
        }
        return zjVar;
    }

    private void q(ui uiVar, mj mjVar) {
        String a = a(uiVar, 14);
        String a2 = a(uiVar);
        if (a2 == null) {
            a2 = "";
        }
        if (a == null || this.a.m() == null) {
            return;
        }
        this.a.m().put(a, a2);
    }

    private void r(ui uiVar, mj mjVar) {
        String a = a(uiVar, 36);
        if (a != null) {
            try {
                int parseInt = Integer.parseInt(a.trim());
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                j1.a(this.a.i()).s(parseInt);
                if (this.a.j() != null) {
                    this.a.j().a(parseInt);
                }
            } catch (Exception unused) {
            }
        }
        String a2 = a(uiVar, 13);
        if (a2 != null) {
            j1.a(this.a.i()).C(a2.trim());
            if (this.a.j() != null) {
                this.a.j().d(a2.trim());
            }
        } else {
            j1.a(this.a.i()).C("B");
        }
        String a3 = a(uiVar, 40);
        if (a3 != null) {
            String c = j1.a(this.a.i()).c(a3);
            if (c == null && this.a.m() != null) {
                c = this.a.m().get(a3);
            }
            if (c != null) {
                a3 = c;
            }
            j1.a(this.a.i()).B(a3);
            if (this.a.j() != null) {
                this.a.j().c(a3);
            }
        }
        String a4 = a(uiVar, 29);
        if (a4 != null) {
            j1.a(this.a.i()).B(a4.trim());
            if (this.a.j() != null) {
                this.a.j().a(a4.trim());
            }
        } else {
            j1.a(this.a.i()).B("R");
        }
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                if (d2.j() == 31) {
                    String a5 = a(d2, 28);
                    if (a5 != null) {
                        try {
                            int parseInt2 = Integer.parseInt(a5.trim());
                            if (parseInt2 == 0) {
                                parseInt2 = -16777216;
                            }
                            j1.a(this.a.i()).t(parseInt2);
                            if (this.a.j() != null) {
                                this.a.j().b(parseInt2);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    String a6 = a(d2, 87);
                    if (!TextUtils.isEmpty(a6)) {
                        String trim = a6.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        j1.a(this.a.i()).A(trim);
                    }
                    String a7 = a(d2, 30);
                    if (a7 != null) {
                        j1.a(this.a.i()).v(Integer.parseInt(a7.trim()));
                        if (this.a.j() != null) {
                            this.a.j().d(Integer.parseInt(a7.trim()));
                        }
                    } else {
                        j1.a(this.a.i()).v(0);
                    }
                    String a8 = a(d2, 31);
                    if (a8 != null) {
                        j1.a(this.a.i()).u(Integer.parseInt(a8.trim()));
                        if (this.a.j() != null) {
                            this.a.j().c(Integer.parseInt(a8.trim()));
                        }
                    } else if (j1.a(this.a.i()).d0().equalsIgnoreCase("B")) {
                        j1.a(this.a.i()).u(12);
                    } else {
                        j1.a(this.a.i()).u(5);
                    }
                    String a9 = a(d2, 98);
                    if (!TextUtils.isEmpty(a9)) {
                        if (a9.contains("px") || a9.contains("PX")) {
                            a9 = a9.substring(0, a9.length() - 2);
                        }
                        try {
                            j1.a(this.a.i()).g(x1.a(Float.parseFloat(a9)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String a10 = a(d2, 101);
                    if (!TextUtils.isEmpty(a10)) {
                        if (a10.contains("px") || a10.contains("PX")) {
                            a10 = a10.substring(0, a10.length() - 2);
                        }
                        try {
                            j1.a(this.a.i()).h(Float.parseFloat(a10));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    private void s(ui uiVar, mj mjVar) {
        xj xjVar;
        String str;
        String a = a(uiVar, 14);
        if (a == null || a.equals("*")) {
            xjVar = null;
        } else {
            xjVar = new xj();
            xjVar.a = a;
        }
        if (xjVar != null) {
            for (int i = 0; i < uiVar.i(); i++) {
                ui d2 = uiVar.d(i);
                try {
                    if (d2.j() == 13) {
                        com.comviva.webaxn.utils.k1 k1Var = new com.comviva.webaxn.utils.k1();
                        Vector<ri> c = d2.c(21);
                        if (c != null) {
                            ri elementAt = c.elementAt(0);
                            if (elementAt.d() == 1) {
                                str = elementAt.b();
                            } else if (elementAt.c() == 143) {
                                str = "date";
                            }
                            k1Var.a = str;
                        }
                        a(d2);
                        for (int i2 = 0; i2 < d2.i(); i2++) {
                            try {
                                if (d2.d(i2).j() == 39) {
                                    k1Var.c = true;
                                    k1Var.b = true;
                                }
                            } catch (wi unused) {
                            }
                        }
                        xjVar.a(k1Var);
                    }
                } catch (wi unused2) {
                }
            }
            mjVar.a(xjVar);
        }
    }

    private void t(ui uiVar, mj mjVar) {
        String str = null;
        for (int i = 0; i < uiVar.e(); i++) {
            qi b = uiVar.b(i);
            if (b.b() == 14) {
                str = b.d().elementAt(0).b();
            }
        }
        String a = a(uiVar);
        if (a == null || !a.equals("T")) {
            return;
        }
        mjVar.a(true, str);
    }

    private void u(ui uiVar, mj mjVar) {
        try {
            String a = a(uiVar, 28);
            if (a != null) {
                int parseInt = Integer.parseInt(a);
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                j1.a(this.a.i()).A(parseInt);
            }
            String a2 = a(uiVar, 33);
            if (!TextUtils.isEmpty(a2) && !this.a.g(a2)) {
                mjVar.e().a(1, a2);
            }
            String a3 = a(uiVar, 80);
            if (!TextUtils.isEmpty(a3)) {
                if (a3.indexOf(".") != -1) {
                    a3 = a3.substring(0, a3.indexOf("."));
                }
                this.a.f(a3);
            }
            for (int i = 0; i < uiVar.i(); i++) {
                ui d2 = uiVar.d(i);
                if (d2.j() == 31) {
                    String a4 = a(d2, 28);
                    if (a4 != null) {
                        int parseInt2 = Integer.parseInt(a4);
                        if (parseInt2 == 0) {
                            parseInt2 = -16777216;
                        }
                        j1.a(this.a.i()).B(parseInt2);
                    }
                    String a5 = a(d2, 98);
                    if (!TextUtils.isEmpty(a5)) {
                        if (a5.contains("px") || a5.contains("PX")) {
                            a5 = a5.substring(0, a5.length() - 2);
                        }
                        j1.a(this.a.i()).i(x1.a(Float.parseFloat(a5)));
                    }
                    String a6 = a(d2, 101);
                    if (!TextUtils.isEmpty(a6)) {
                        if (a6.contains("px") || a6.contains("PX")) {
                            a6 = a6.substring(0, a6.length() - 2);
                        }
                        j1.a(this.a.i()).j(Float.parseFloat(a6));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private void v(ui uiVar, mj mjVar) {
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                int j = d2.j();
                if (d2.a() == 0) {
                    if (j == 9) {
                        if (d2.d(0).f() == 5) {
                            mjVar.n.a(d2.d(0).g()[0] & 255);
                        }
                    } else if (j == 11) {
                        mjVar.n.a(a(d2));
                    }
                }
            } catch (wi unused) {
            }
        }
    }

    private void w(ui uiVar, mj mjVar) {
    }

    private void x(ui uiVar, mj mjVar) {
        String a;
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                int j = d2.j();
                if (d2.a() == 1) {
                    if (j == 10) {
                        String a2 = a(d2, 36);
                        if (a2 != null) {
                            j1.a(this.a.i()).C(Integer.parseInt(a2));
                        }
                    } else if (j == 11) {
                        String a3 = a(d2, 36);
                        if (a3 != null) {
                            j1.a(this.a.i()).H(Integer.parseInt(a3));
                        }
                    } else if (j == 9) {
                        String a4 = a(d2, 36);
                        if (a4 != null) {
                            j1.a(this.a.i()).F(Integer.parseInt(a4));
                        }
                    } else if (j == 12 && (a = a(d2)) != null) {
                        j1.a(this.a.i()).G(Integer.parseInt(a));
                    }
                } else if (j == 37) {
                    for (int i2 = 0; i2 < d2.i(); i2++) {
                        ui d3 = uiVar.d(i2);
                        if (d3.a() == 0 && d3.j() == 31) {
                            String a5 = a(d3, 31);
                            if (a5 != null) {
                                j1.a(this.a.i()).D(Integer.parseInt(a5));
                            }
                            String a6 = a(d3, 87);
                            if (!TextUtils.isEmpty(a6)) {
                                String trim = a6.trim();
                                if (trim.contains("\\.")) {
                                    trim = trim.replace("\\.", ".");
                                }
                                j1.a(this.a.i()).I(trim);
                            }
                            String a7 = a(d3, 30);
                            if (a7 != null) {
                                j1.a(this.a.i()).E(Integer.parseInt(a7));
                            }
                            String a8 = a(d2, 98);
                            if (!TextUtils.isEmpty(a8)) {
                                if (a8.contains("px") || a8.contains("PX")) {
                                    a8 = a8.substring(0, a8.length() - 2);
                                }
                                try {
                                    j1.a(this.a.i()).k(x1.a(Float.parseFloat(a8)));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            String a9 = a(d2, 101);
                            if (!TextUtils.isEmpty(a9)) {
                                if (a9.contains("px") || a9.contains("PX")) {
                                    a9 = a9.substring(0, a9.length() - 2);
                                }
                                try {
                                    j1.a(this.a.i()).l(Float.parseFloat(a9));
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private void y(ui uiVar, mj mjVar) {
        String a = a(uiVar, 36);
        if (a != null) {
            try {
                int parseInt = Integer.parseInt(a);
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                mjVar.b(parseInt);
            } catch (Exception unused) {
            }
        }
        for (int i = 0; i < uiVar.i(); i++) {
            ui d2 = uiVar.d(i);
            try {
                if (d2.f() == 1) {
                    String h = d2.h();
                    if (h != null) {
                        mjVar.e(h);
                    }
                } else if (d2.j() == 31) {
                    String a2 = a(d2, 36);
                    if (a2 != null) {
                        int parseInt2 = Integer.parseInt(a2);
                        if (parseInt2 == 0) {
                            parseInt2 = -16777216;
                        }
                        mjVar.c(parseInt2);
                    }
                    String a3 = a(d2, 28);
                    if (a3 != null) {
                        int parseInt3 = Integer.parseInt(a3);
                        if (parseInt3 == 0) {
                            parseInt3 = -16777216;
                        }
                        mjVar.d(parseInt3);
                    }
                    String a4 = a(d2, 31);
                    if (a4 != null) {
                        mjVar.e(Integer.parseInt(a4));
                    }
                    String a5 = a(d2, 98);
                    if (!TextUtils.isEmpty(a5)) {
                        if (a5.contains("px") || a5.contains("PX")) {
                            a5 = a5.substring(0, a5.length() - 2);
                        }
                        try {
                            mjVar.a(x1.a(Float.parseFloat(a5)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String a6 = a(d2, 101);
                    if (!TextUtils.isEmpty(a6)) {
                        if (a6.contains("px") || a6.contains("PX")) {
                            a6 = a6.substring(0, a6.length() - 2);
                        }
                        try {
                            mjVar.b(Float.parseFloat(a6));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    private void z(ui uiVar, mj mjVar) {
        int i;
        String a = a(uiVar, 36);
        if (a != null) {
            try {
                int parseInt = Integer.parseInt(a);
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                j1.a(this.a.i()).I(parseInt);
            } catch (Exception unused) {
            }
        } else {
            j1.a(this.a.i()).J(0);
        }
        for (int i2 = 0; i2 < uiVar.i(); i2++) {
            ui d2 = uiVar.d(i2);
            try {
                if (d2.j() == 31) {
                    String a2 = a(d2, 28);
                    if (a2 != null) {
                        try {
                            i = Integer.parseInt(a2);
                            if (i == 0) {
                                i = -16777216;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                        }
                        j1.a(this.a.i()).K(i);
                    } else {
                        j1.a(this.a.i()).L(0);
                    }
                    String a3 = a(d2, 87);
                    if (!TextUtils.isEmpty(a3)) {
                        String trim = a3.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        j1.a(this.a.i()).J(trim);
                    }
                    String a4 = a(d2, 30);
                    if (a4 != null) {
                        j1.a(this.a.i()).N(Integer.parseInt(a4));
                    } else {
                        j1.a(this.a.i()).N(-1);
                    }
                    String a5 = a(d2, 31);
                    if (a5 != null) {
                        j1.a(this.a.i()).M(Integer.parseInt(a5));
                    } else {
                        j1.a(this.a.i()).M(-1);
                    }
                    String a6 = a(d2, 98);
                    if (!TextUtils.isEmpty(a6)) {
                        if (a6.contains("px") || a6.contains("PX")) {
                            a6 = a6.substring(0, a6.length() - 2);
                        }
                        try {
                            j1.a(this.a.i()).m(x1.a(Float.parseFloat(a6)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String a7 = a(d2, 101);
                    if (!TextUtils.isEmpty(a7)) {
                        if (a7.contains("px") || a7.contains("PX")) {
                            a7 = a7.substring(0, a7.length() - 2);
                        }
                        try {
                            j1.a(this.a.i()).n(Float.parseFloat(a7));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    public int a(ti tiVar) {
        ui a = tiVar.a();
        x1.a(this.b);
        e(a);
        return a != null ? 0 : -1;
    }

    public zj a(ti tiVar, mj mjVar) {
        return C(tiVar.a(), mjVar);
    }

    public int b(ti tiVar, mj mjVar) {
        ui a = tiVar.a();
        x1.a(this.b);
        B(a, mjVar);
        if (mjVar != null) {
            int i = 0;
            while (i < mjVar.h()) {
                lj a2 = mjVar.a(i);
                if (a2 != null) {
                    if (a2.f() == null) {
                        mjVar.b(a2);
                    } else {
                        i++;
                    }
                }
            }
        }
        return a != null ? 0 : -1;
    }
}
