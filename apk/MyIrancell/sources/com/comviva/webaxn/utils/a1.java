package com.comviva.webaxn.utils;

import android.content.Context;
import android.os.Build;
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
public class a1 {
    private static a1 l;
    private Context a;
    private wj b;
    private yj c;
    private e d;
    private HashMap<String, String> e;
    private mj f;
    private lj g;
    private int h = 1;
    private boolean i = true;
    private boolean j = false;
    private String k;

    /* loaded from: classes.dex */
    class a implements x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.x1.o
        public void a(boolean z) {
            if (z) {
                a1.this.c();
            }
        }
    }

    private a1(Context context) {
        new a();
        this.a = context;
    }

    public static a1 a(Context context) {
        if (l == null) {
            l = new a1(context);
        }
        return l;
    }

    private void a(String str) {
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
        if (this.b.a(str, false, false, null, false, false, str2, this.g) > 0) {
            this.b.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        yj a2;
        String str = this.e.get("target");
        if (!TextUtils.isEmpty(str) && str.startsWith("$") && str.endsWith("$")) {
            String substring = str.substring(1, str.length() - 1);
            if (this.g.f() == null || (a2 = this.g.f().a(substring, (Vector<yj>) null)) == null) {
                return;
            }
            if (this.h != 1 && !TextUtils.isEmpty(this.e.get("save")) && this.e.get("save").equalsIgnoreCase("true")) {
                this.i = false;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.i) {
                    this.j = true;
                }
                CameraData cameraData = new CameraData();
                cameraData.a(this.e.get("mode"));
                cameraData.c(this.e.get("label1"));
                cameraData.f(this.e.get("label2"));
                cameraData.i(this.e.get("label3"));
                cameraData.e(this.e.get("ts_label1"));
                cameraData.h(this.e.get("ts_label2"));
                cameraData.k(this.e.get("ts_label3"));
                cameraData.d(this.e.get("ff_label1"));
                cameraData.g(this.e.get("ff_label2"));
                cameraData.j(this.e.get("ff_label3"));
                cameraData.p(this.e.get("width"));
                cameraData.o(this.e.get("height"));
                cameraData.n(this.e.get("border"));
                cameraData.m(this.e.get("border_color"));
                cameraData.b(x1.a(this.a, this.h, this.e.get("filedir")));
                cameraData.l(this.e.get("timer"));
                p1.b(this.a, a2, cameraData, 1502);
            }
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
        if (this.j) {
            a(this.i);
            this.i = true;
            this.j = false;
        }
        this.k = null;
    }

    public void a(yj yjVar, String str) {
        this.k = str;
        if (yjVar.e == 28) {
            yjVar.w0 = x1.c(str);
        }
        a(this.e.get("action"));
        if (this.j) {
            return;
        }
        a(this.i);
    }

    public void a(boolean z) {
        if (z) {
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
    }

    public String b() {
        return this.k;
    }
}
