package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.io.File;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class b1 {
    private static b1 l;
    private Context a;
    private wj b;
    private yj c;
    private e d;
    private HashMap<String, String> e;
    private mj f;
    private lj g;
    private int h = 1;
    private boolean i = true;
    private int j = 1;
    private String k;

    /* loaded from: classes.dex */
    class a implements x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.x1.o
        public void a(boolean z) {
            if (z) {
                b1.this.b();
            }
        }
    }

    private b1(Context context) {
        new a();
        this.a = context;
    }

    public static b1 a(Context context) {
        if (l == null) {
            l = new b1(context);
        }
        return l;
    }

    private void a(boolean z) {
        if (!z || TextUtils.isEmpty(this.k)) {
            return;
        }
        try {
            File file = new File(this.k);
            if (file.exists()) {
                if (file.isDirectory()) {
                    for (String str : file.list()) {
                        new File(file, str).delete();
                    }
                }
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        String str = this.e.get("target");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("$")) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
        }
        RecorderData recorderData = null;
        yj a2 = this.g.f().a(str, (Vector<yj>) null);
        if (a2 != null) {
            if (this.h != 1 && !TextUtils.isEmpty(this.e.get("save")) && this.e.get("save").equalsIgnoreCase("true")) {
                this.i = false;
            }
            int i = this.j;
            if (i == 1) {
                recorderData = new RecorderData();
                recorderData.a(this.j);
                recorderData.a(this.e.get("lbcap"));
                recorderData.a(this.e.get("rbcap"));
                recorderData.h(this.e.get("mimetype"));
                recorderData.r(x1.a(this.a, this.h, this.e.get("filedir")));
                recorderData.s(this.e.get("duration"));
            } else if (i == 2) {
                recorderData = new RecorderData();
                recorderData.a(this.j);
                recorderData.h(this.e.get("mimetype"));
                recorderData.r(x1.a(this.a, this.h, this.e.get("filedir")));
                recorderData.b(this.e.get("label1"));
                recorderData.e(this.e.get("label2"));
                recorderData.d(this.e.get("ts_label1"));
                recorderData.g(this.e.get("ts_label2"));
                recorderData.c(this.e.get("ff_label1"));
                recorderData.f(this.e.get("ff_label2"));
                recorderData.o(this.e.get("stat_text1"));
                recorderData.p(this.e.get("stat_text2"));
                recorderData.q(this.e.get("stat_text3"));
                recorderData.j(this.e.get("st1fs"));
                recorderData.l(this.e.get("st2fs"));
                recorderData.n(this.e.get("st3fs"));
                recorderData.i(this.e.get("st1ff"));
                recorderData.k(this.e.get("st2ff"));
                recorderData.m(this.e.get("st3ff"));
                recorderData.t(this.e.get("status1"));
                recorderData.u(this.e.get("status2"));
                recorderData.v(this.e.get("status3"));
            }
            if (recorderData != null) {
                p1.a(this.a, a2, recorderData, 1503);
            }
        }
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str) || this.b.a(str, false, this.c, this.d, this.f, this.g)) {
            return;
        }
        xj a2 = x1.a(str, this.f.i());
        if (a2 != null) {
            this.f.a(a2);
        }
        String str2 = null;
        yj yjVar = this.c;
        if (yjVar != null) {
            str2 = yjVar.j;
        } else {
            e eVar = this.d;
            if (eVar != null) {
                str2 = eVar.j;
            }
        }
        if (this.b.a(str, false, false, this.f, false, false, str2, this.g) > 0) {
            this.b.E();
        }
    }

    public void a() {
        if (l != null) {
            l = null;
        }
        HashMap<String, String> hashMap = this.e;
        if (hashMap != null) {
            hashMap.clear();
            this.e = null;
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.f = null;
        this.k = null;
    }

    public void a(String str) {
        String str2 = this.e.get("rec_dur");
        if (TextUtils.isEmpty(str2) || this.g.f().r == null || !this.g.f().r.containsKey(str2)) {
            return;
        }
        this.g.f().a(str2, str);
    }

    public void a(yj yjVar, String str, String str2) {
        HashMap<String, String> hashMap;
        String str3;
        if (!str2.equals("lbcap")) {
            if (str2.equals("rbcap")) {
                hashMap = this.e;
                str3 = "rbact";
            }
            a(this.i);
        }
        this.k = str;
        if (yjVar.e == 28) {
            byte[] c = x1.c(str);
            yjVar.w0 = c;
            b(String.valueOf(c.length));
        }
        a(this.e.get("duration"));
        str3 = "lbact";
        if (this.e.get("lbact") != null) {
            hashMap = this.e;
        } else {
            hashMap = this.e;
            str3 = "action";
        }
        c(hashMap.get(str3));
        a(this.i);
    }

    public void b(String str) {
        String str2 = this.e.get("rec_size");
        if (TextUtils.isEmpty(str2) || this.g.f().r == null || !this.g.f().r.containsKey(str2)) {
            return;
        }
        this.g.f().a(str2, str);
    }
}
