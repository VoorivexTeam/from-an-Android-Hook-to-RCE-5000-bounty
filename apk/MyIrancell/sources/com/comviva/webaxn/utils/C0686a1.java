package com.comviva.webaxn.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.comviva.webaxn.utils.C0755x1;
import java.io.File;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.a1 */
/* loaded from: classes.dex */
public class C0686a1 {

    /* renamed from: l */
    private static C0686a1 f4633l;

    /* renamed from: a */
    private Context f4634a;

    /* renamed from: b */
    private C3400wj f4635b;

    /* renamed from: c */
    private C3489yj f4636c;

    /* renamed from: d */
    private C0696e f4637d;

    /* renamed from: e */
    private HashMap<String, String> f4638e;

    /* renamed from: f */
    private C2945mj f4639f;

    /* renamed from: g */
    private C2899lj f4640g;

    /* renamed from: h */
    private int f4641h = 1;

    /* renamed from: i */
    private boolean f4642i = true;

    /* renamed from: j */
    private boolean f4643j = false;

    /* renamed from: k */
    private String f4644k;

    /* renamed from: com.comviva.webaxn.utils.a1$a */
    /* loaded from: classes.dex */
    class a implements C0755x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.o
        /* renamed from: a */
        public void mo4309a(boolean z) {
            if (z) {
                C0686a1.this.m5337c();
            }
        }
    }

    private C0686a1(Context context) {
        new a();
        this.f4634a = context;
    }

    /* renamed from: a */
    public static C0686a1 m5334a(Context context) {
        if (f4633l == null) {
            f4633l = new C0686a1(context);
        }
        return f4633l;
    }

    /* renamed from: a */
    private void m5336a(String str) {
        if (TextUtils.isEmpty(str) || this.f4635b.m16298a(str, false, this.f4636c, this.f4637d, this.f4639f, this.f4640g)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(str, this.f4639f.m14145i());
        if (m6134a != null) {
            this.f4639f.m14121a(m6134a);
        }
        String str2 = null;
        C3489yj c3489yj = this.f4636c;
        if (c3489yj != null) {
            str2 = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f4637d;
            if (c0696e != null) {
                str2 = c0696e.f4718j;
            }
        }
        if (this.f4635b.m16263a(str, false, false, null, false, false, str2, this.f4640g) > 0) {
            this.f4635b.m16258E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m5337c() {
        C3489yj m16930a;
        String str = this.f4638e.get("target");
        if (!TextUtils.isEmpty(str) && str.startsWith("$") && str.endsWith("$")) {
            String substring = str.substring(1, str.length() - 1);
            if (this.f4640g.m13901f() == null || (m16930a = this.f4640g.m13901f().m16930a(substring, (Vector<C3489yj>) null)) == null) {
                return;
            }
            if (this.f4641h != 1 && !TextUtils.isEmpty(this.f4638e.get("save")) && this.f4638e.get("save").equalsIgnoreCase("true")) {
                this.f4642i = false;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f4642i) {
                    this.f4643j = true;
                }
                CameraData cameraData = new CameraData();
                cameraData.m5189a(this.f4638e.get("mode"));
                cameraData.m5193c(this.f4638e.get("label1"));
                cameraData.m5199f(this.f4638e.get("label2"));
                cameraData.m5205i(this.f4638e.get("label3"));
                cameraData.m5197e(this.f4638e.get("ts_label1"));
                cameraData.m5203h(this.f4638e.get("ts_label2"));
                cameraData.m5209k(this.f4638e.get("ts_label3"));
                cameraData.m5195d(this.f4638e.get("ff_label1"));
                cameraData.m5201g(this.f4638e.get("ff_label2"));
                cameraData.m5207j(this.f4638e.get("ff_label3"));
                cameraData.m5219p(this.f4638e.get("width"));
                cameraData.m5217o(this.f4638e.get("height"));
                cameraData.m5215n(this.f4638e.get("border"));
                cameraData.m5213m(this.f4638e.get("border_color"));
                cameraData.m5191b(C0755x1.m6127a(this.f4634a, this.f4641h, this.f4638e.get("filedir")));
                cameraData.m5211l(this.f4638e.get("timer"));
                C0731p1.m5967b(this.f4634a, m16930a, cameraData, 1502);
            }
        }
    }

    /* renamed from: a */
    public void m5338a() {
        if (f4633l != null) {
            f4633l = null;
        }
        HashMap<String, String> hashMap = this.f4638e;
        if (hashMap != null) {
            hashMap.clear();
            this.f4638e = null;
        }
        this.f4634a = null;
        this.f4635b = null;
        this.f4636c = null;
        this.f4637d = null;
        this.f4640g = null;
        this.f4639f = null;
        if (this.f4643j) {
            m5340a(this.f4642i);
            this.f4642i = true;
            this.f4643j = false;
        }
        this.f4644k = null;
    }

    /* renamed from: a */
    public void m5339a(C3489yj c3489yj, String str) {
        this.f4644k = str;
        if (c3489yj.f14208e == 28) {
            c3489yj.f14262w0 = C0755x1.m6179c(str);
        }
        m5336a(this.f4638e.get("action"));
        if (this.f4643j) {
            return;
        }
        m5340a(this.f4642i);
    }

    /* renamed from: a */
    public void m5340a(boolean z) {
        if (z) {
            try {
                File file = new File(this.f4644k);
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

    /* renamed from: b */
    public String m5341b() {
        return this.f4644k;
    }
}
