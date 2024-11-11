package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.comviva.webaxn.utils.C0755x1;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.c0 */
/* loaded from: classes.dex */
public class C0691c0 {

    /* renamed from: m */
    private static C0691c0 f4691m;

    /* renamed from: a */
    private Context f4692a;

    /* renamed from: b */
    private C3400wj f4693b;

    /* renamed from: c */
    private C3489yj f4694c;

    /* renamed from: d */
    private C0696e f4695d;

    /* renamed from: e */
    private HashMap<String, String> f4696e;

    /* renamed from: f */
    private C2945mj f4697f;

    /* renamed from: g */
    private C2899lj f4698g;

    /* renamed from: h */
    private Bitmap f4699h = null;

    /* renamed from: i */
    private int f4700i = 1;

    /* renamed from: j */
    private boolean f4701j = true;

    /* renamed from: k */
    private int f4702k = 0;

    /* renamed from: l */
    private final C0755x1.o f4703l = new a();

    /* renamed from: com.comviva.webaxn.utils.c0$a */
    /* loaded from: classes.dex */
    class a implements C0755x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.o
        /* renamed from: a */
        public void mo4309a(boolean z) {
            if (z) {
                C0691c0.this.m5386k();
            }
        }
    }

    private C0691c0(Context context) {
        this.f4692a = context;
    }

    /* renamed from: a */
    public static C0691c0 m5383a(Context context) {
        if (f4691m == null) {
            f4691m = new C0691c0(context);
        }
        return f4691m;
    }

    /* renamed from: j */
    private void m5385j() {
        if (this.f4700i == 1) {
            if (!C0722m1.m5887a(this.f4692a, new String[]{"android.permission.CAMERA"})) {
                if (C0713j1.m5563a(this.f4692a).m5647d("android.permission.CAMERA") != -1) {
                    if (C0722m1.m5886a(this.f4692a, "android.permission.CAMERA")) {
                        C0722m1.m5885a((Activity) this.f4692a, new String[]{"android.permission.CAMERA"}, 2);
                    }
                    C0755x1.m6181d(this.f4692a, "msg.rpCam");
                    return;
                }
                C0722m1.m5885a((Activity) this.f4692a, new String[]{"android.permission.CAMERA"}, 2);
                this.f4693b.m16337n().mo4083a(this.f4703l);
                C0755x1.f5264v = true;
                return;
            }
            m5386k();
        }
        if (!C0722m1.m5887a(this.f4692a, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            if (C0713j1.m5563a(this.f4692a).m5647d("android.permission.CAMERA") != -1 && C0713j1.m5563a(this.f4692a).m5647d("android.permission.WRITE_EXTERNAL_STORAGE") != -1) {
                boolean m5886a = C0722m1.m5886a(this.f4692a, "android.permission.CAMERA");
                boolean m5886a2 = C0722m1.m5886a(this.f4692a, "android.permission.WRITE_EXTERNAL_STORAGE");
                if (m5886a || m5886a2) {
                    C0722m1.m5885a((Activity) this.f4692a, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
                }
                C0755x1.m6181d(this.f4692a, "msg.rpCam");
                return;
            }
            C0722m1.m5885a((Activity) this.f4692a, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
            this.f4693b.m16337n().mo4083a(this.f4703l);
            C0755x1.f5264v = true;
            return;
        }
        m5386k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m5386k() {
        C3489yj m16930a;
        String str = this.f4696e.get("target");
        if (!TextUtils.isEmpty(str) && str.startsWith("$") && str.endsWith("$")) {
            String substring = str.substring(1, str.length() - 1);
            if (this.f4698g.m13901f() == null || (m16930a = this.f4698g.m13901f().m16930a(substring, (Vector<C3489yj>) null)) == null) {
                return;
            }
            if (this.f4700i != 1 && !TextUtils.isEmpty(this.f4696e.get("save")) && this.f4696e.get("save").equalsIgnoreCase("true")) {
                this.f4701j = false;
            }
            if (TextUtils.isEmpty(this.f4696e.get("mode")) || Build.VERSION.SDK_INT < 21) {
                C0731p1.m5961a(this.f4692a, m16930a, this.f4700i, this.f4696e.get("filedir"), 1500);
                return;
            }
            this.f4702k = 1;
            CameraData cameraData = new CameraData();
            cameraData.m5189a(this.f4696e.get("mode"));
            cameraData.m5193c(this.f4696e.get("label1"));
            cameraData.m5199f(this.f4696e.get("label2"));
            cameraData.m5205i(this.f4696e.get("label3"));
            cameraData.m5197e(this.f4696e.get("ts_label1"));
            cameraData.m5203h(this.f4696e.get("ts_label2"));
            cameraData.m5209k(this.f4696e.get("ts_label3"));
            cameraData.m5195d(this.f4696e.get("ff_label1"));
            cameraData.m5201g(this.f4696e.get("ff_label2"));
            cameraData.m5207j(this.f4696e.get("ff_label3"));
            cameraData.m5219p(this.f4696e.get("width"));
            cameraData.m5217o(this.f4696e.get("height"));
            cameraData.m5215n(this.f4696e.get("border"));
            cameraData.m5213m(this.f4696e.get("border_color"));
            cameraData.m5191b(C0731p1.m5945a(this.f4692a, this.f4700i, 1, this.f4696e.get("filedir")).getPath());
            C0731p1.m5962a(this.f4692a, m16930a, cameraData, 1500);
        }
    }

    /* renamed from: a */
    public void m5387a() {
        if (f4691m != null) {
            f4691m = null;
        }
        HashMap<String, String> hashMap = this.f4696e;
        if (hashMap != null) {
            hashMap.clear();
            this.f4696e = null;
        }
        this.f4692a = null;
        this.f4693b = null;
        this.f4694c = null;
        this.f4695d = null;
        this.f4698g = null;
        this.f4697f = null;
        this.f4699h = null;
    }

    /* renamed from: a */
    public void m5388a(Bitmap bitmap) {
        this.f4699h = bitmap;
    }

    /* renamed from: a */
    public void m5389a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e) {
        this.f4693b = c3400wj;
        this.f4694c = c3489yj;
        this.f4695d = c0696e;
        this.f4697f = c2945mj;
        this.f4698g = c2899lj;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.f4696e;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f4696e = m6188f;
        if (m6188f.size() > 0) {
            if (!TextUtils.isEmpty(this.f4696e.get("storage_type"))) {
                try {
                    this.f4700i = Integer.parseInt(this.f4696e.get("storage_type"));
                } catch (NumberFormatException unused) {
                }
            }
            m5385j();
        }
    }

    /* renamed from: b */
    public Bitmap m5390b() {
        return this.f4699h;
    }

    /* renamed from: c */
    public int m5391c() {
        return this.f4702k;
    }

    /* renamed from: d */
    public C2899lj m5392d() {
        return this.f4698g;
    }

    /* renamed from: e */
    public C2945mj m5393e() {
        return this.f4697f;
    }

    /* renamed from: f */
    public C0696e m5394f() {
        return this.f4695d;
    }

    /* renamed from: g */
    public HashMap<String, String> m5395g() {
        return this.f4696e;
    }

    /* renamed from: h */
    public C3489yj m5396h() {
        return this.f4694c;
    }

    /* renamed from: i */
    public boolean m5397i() {
        return this.f4701j;
    }
}
