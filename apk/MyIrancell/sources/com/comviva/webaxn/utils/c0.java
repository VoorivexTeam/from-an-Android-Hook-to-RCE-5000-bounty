package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class c0 {
    private static c0 m;
    private Context a;
    private wj b;
    private yj c;
    private e d;
    private HashMap<String, String> e;
    private mj f;
    private lj g;
    private Bitmap h = null;
    private int i = 1;
    private boolean j = true;
    private int k = 0;
    private final x1.o l = new a();

    /* loaded from: classes.dex */
    class a implements x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.x1.o
        public void a(boolean z) {
            if (z) {
                c0.this.k();
            }
        }
    }

    private c0(Context context) {
        this.a = context;
    }

    public static c0 a(Context context) {
        if (m == null) {
            m = new c0(context);
        }
        return m;
    }

    private void j() {
        if (this.i == 1) {
            if (!m1.a(this.a, new String[]{"android.permission.CAMERA"})) {
                if (j1.a(this.a).d("android.permission.CAMERA") != -1) {
                    if (m1.a(this.a, "android.permission.CAMERA")) {
                        m1.a((Activity) this.a, new String[]{"android.permission.CAMERA"}, 2);
                    }
                    x1.d(this.a, "msg.rpCam");
                    return;
                }
                m1.a((Activity) this.a, new String[]{"android.permission.CAMERA"}, 2);
                this.b.n().a(this.l);
                x1.v = true;
                return;
            }
            k();
        }
        if (!m1.a(this.a, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            if (j1.a(this.a).d("android.permission.CAMERA") != -1 && j1.a(this.a).d("android.permission.WRITE_EXTERNAL_STORAGE") != -1) {
                boolean a2 = m1.a(this.a, "android.permission.CAMERA");
                boolean a3 = m1.a(this.a, "android.permission.WRITE_EXTERNAL_STORAGE");
                if (a2 || a3) {
                    m1.a((Activity) this.a, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
                }
                x1.d(this.a, "msg.rpCam");
                return;
            }
            m1.a((Activity) this.a, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
            this.b.n().a(this.l);
            x1.v = true;
            return;
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        yj a2;
        String str = this.e.get("target");
        if (!TextUtils.isEmpty(str) && str.startsWith("$") && str.endsWith("$")) {
            String substring = str.substring(1, str.length() - 1);
            if (this.g.f() == null || (a2 = this.g.f().a(substring, (Vector<yj>) null)) == null) {
                return;
            }
            if (this.i != 1 && !TextUtils.isEmpty(this.e.get("save")) && this.e.get("save").equalsIgnoreCase("true")) {
                this.j = false;
            }
            if (TextUtils.isEmpty(this.e.get("mode")) || Build.VERSION.SDK_INT < 21) {
                p1.a(this.a, a2, this.i, this.e.get("filedir"), 1500);
                return;
            }
            this.k = 1;
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
            cameraData.b(p1.a(this.a, this.i, 1, this.e.get("filedir")).getPath());
            p1.a(this.a, a2, cameraData, 1500);
        }
    }

    public void a() {
        if (m != null) {
            m = null;
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
            if (!TextUtils.isEmpty(this.e.get("storage_type"))) {
                try {
                    this.i = Integer.parseInt(this.e.get("storage_type"));
                } catch (NumberFormatException unused) {
                }
            }
            j();
        }
    }

    public Bitmap b() {
        return this.h;
    }

    public int c() {
        return this.k;
    }

    public lj d() {
        return this.g;
    }

    public mj e() {
        return this.f;
    }

    public e f() {
        return this.d;
    }

    public HashMap<String, String> g() {
        return this.e;
    }

    public yj h() {
        return this.c;
    }

    public boolean i() {
        return this.j;
    }
}
