package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class h0 {
    private static h0 j;
    private Context a;
    private wj b;
    private yj c;
    private e d;
    private HashMap<String, String> e;
    private mj f;
    private lj g;
    private Bitmap h = null;
    private final x1.o i = new a();

    /* loaded from: classes.dex */
    class a implements x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.x1.o
        public void a(boolean z) {
            if (z) {
                h0.this.i();
            }
        }
    }

    private h0(Context context) {
        this.a = context;
    }

    public static h0 a(Context context) {
        if (j == null) {
            j = new h0(context);
        }
        return j;
    }

    private void h() {
        if (m1.a(this.a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            i();
            return;
        }
        if (j1.a(this.a).d("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            m1.a((Activity) this.a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        } else {
            if (!m1.a(this.a, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                x1.d(this.a, "msg.rpStorage");
                return;
            }
            m1.a((Activity) this.a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        }
        this.b.n().a(this.i);
        x1.v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        yj a2;
        String str = this.e.get("target");
        if (!TextUtils.isEmpty(str) && str.startsWith("$") && str.endsWith("$")) {
            String substring = str.substring(1, str.length() - 1);
            if (this.g.f() == null || (a2 = this.g.f().a(substring, (Vector<yj>) null)) == null) {
                return;
            }
            p1.a(this.a, a2);
        }
    }

    public void a() {
        if (j != null) {
            j = null;
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
        this.h = null;
    }

    public void a(Bitmap bitmap) {
        this.h = bitmap;
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar) {
        this.b = wjVar;
        this.c = yjVar;
        this.d = eVar;
        this.f = mjVar;
        this.g = ljVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.e;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> f = x1.f(str);
        this.e = f;
        if (f.size() > 0) {
            h();
        }
    }

    public Bitmap b() {
        return this.h;
    }

    public lj c() {
        return this.g;
    }

    public mj d() {
        return this.f;
    }

    public e e() {
        return this.d;
    }

    public HashMap<String, String> f() {
        return this.e;
    }

    public yj g() {
        return this.c;
    }
}
