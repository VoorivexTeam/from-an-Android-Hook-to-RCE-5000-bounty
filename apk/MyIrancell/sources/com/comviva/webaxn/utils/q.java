package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import defpackage.kj;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import defpackage.zj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class q {
    private static q g;
    private wj a;
    private lj b;
    private mj c;
    private yj d;
    private e e;
    private String f;

    private q(Context context) {
    }

    public static q a(Context context) {
        if (g == null) {
            g = new q(context);
        }
        return g;
    }

    private void a(String str) {
        HashMap<String, String> f = x1.f(str);
        if (f.size() > 0) {
            a(f.get("id"), false);
            String str2 = f.get("action");
            if (!TextUtils.isEmpty(str2) && !this.a.a(str2, false, this.d, this.e, this.c, this.b)) {
                xj a = x1.a(str2, this.c.i());
                if (a != null) {
                    this.c.a(a);
                }
                if (this.a.a(str2, false, false, this.c, false, false, this.f, this.b) > 0) {
                    this.a.E();
                }
            }
        }
        f.clear();
    }

    private void a(String str, boolean z) {
        zj f = this.b.f();
        if (TextUtils.isEmpty(str) || f == null) {
            return;
        }
        for (String str2 : str.split(";")) {
            if (str2.startsWith("$") && str2.endsWith("$")) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            yj a = f.a(str2, (Vector<yj>) null);
            if (a != null) {
                if (a.e == 4) {
                    a(a, z);
                } else {
                    com.comviva.webaxn.ui.n1 n1Var = a.a0;
                    if (n1Var != null) {
                        if (z) {
                            n1Var.d();
                        } else {
                            a.e1 = true;
                            n1Var.c();
                        }
                    }
                }
            }
        }
    }

    private void b(String str) {
        HashMap<String, String> f = x1.f(str);
        if (f.size() > 0) {
            a(f.get("id"), true);
            String str2 = f.get("action");
            if (!TextUtils.isEmpty(str2) && !this.a.a(str2, false, this.d, this.e, this.c, this.b)) {
                xj a = x1.a(str2, this.c.i());
                if (a != null) {
                    this.c.a(a);
                }
                if (this.a.a(str2, false, false, this.c, false, false, this.f, this.b) > 0) {
                    this.a.E();
                }
            }
            f.clear();
        }
    }

    public void a() {
        if (g != null) {
            g = null;
        }
        this.d = null;
        this.e = null;
        this.b = null;
        this.c = null;
        this.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r1, defpackage.wj r2, defpackage.mj r3, defpackage.lj r4, defpackage.yj r5, com.comviva.webaxn.utils.e r6) {
        /*
            r0 = this;
            r0.a = r2
            r0.c = r3
            r0.b = r4
            r0.d = r5
            r0.e = r6
            if (r5 == 0) goto L11
            java.lang.String r2 = r5.j
        Le:
            r0.f = r2
            goto L16
        L11:
            if (r6 == 0) goto L16
            java.lang.String r2 = r6.j
            goto Le
        L16:
            java.lang.String r2 = "disable://control?"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L28
            r2 = 18
            java.lang.String r1 = r1.substring(r2)
            r0.a(r1)
            goto L39
        L28:
            java.lang.String r2 = "enable://control?"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L39
            r2 = 17
            java.lang.String r1 = r1.substring(r2)
            r0.b(r1)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.q.a(java.lang.String, wj, mj, lj, yj, com.comviva.webaxn.utils.e):void");
    }

    public void a(yj yjVar, boolean z) {
        Vector<kj> vector;
        com.comviva.webaxn.ui.n1 n1Var;
        Vector<kj> vector2;
        int i = yjVar.R;
        int i2 = 0;
        if (i == 2) {
            if (!this.b.g.containsKey(yjVar.V) || (vector2 = this.b.g.get(yjVar.V)) == null) {
                return;
            }
            while (i2 < vector2.size()) {
                yj yjVar2 = vector2.elementAt(i2).d;
                com.comviva.webaxn.ui.n1 n1Var2 = yjVar2.a0;
                if (n1Var2 != null) {
                    if (z) {
                        n1Var2.d();
                    } else {
                        yjVar2.e1 = true;
                        n1Var2.c();
                    }
                }
                i2++;
            }
            return;
        }
        if (i != 4 && i != 3) {
            if (i != 1 || (n1Var = yjVar.a0) == null) {
                return;
            }
            if (z) {
                n1Var.d();
                return;
            } else {
                yjVar.e1 = true;
                n1Var.c();
                return;
            }
        }
        if (!this.b.i.containsKey(yjVar.V) || (vector = this.b.i.get(yjVar.V)) == null) {
            return;
        }
        while (i2 < vector.size()) {
            yj yjVar3 = vector.elementAt(i2).d;
            com.comviva.webaxn.ui.n1 n1Var3 = yjVar3.a0;
            if (n1Var3 != null) {
                if (z) {
                    n1Var3.d();
                } else {
                    yjVar3.e1 = true;
                    n1Var3.c();
                }
            }
            i2++;
        }
    }
}
