package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.comviva.webaxn.utils.C0755x1;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.h0 */
/* loaded from: classes.dex */
public class C0706h0 {

    /* renamed from: j */
    private static C0706h0 f4814j;

    /* renamed from: a */
    private Context f4815a;

    /* renamed from: b */
    private C3400wj f4816b;

    /* renamed from: c */
    private C3489yj f4817c;

    /* renamed from: d */
    private C0696e f4818d;

    /* renamed from: e */
    private HashMap<String, String> f4819e;

    /* renamed from: f */
    private C2945mj f4820f;

    /* renamed from: g */
    private C2899lj f4821g;

    /* renamed from: h */
    private Bitmap f4822h = null;

    /* renamed from: i */
    private final C0755x1.o f4823i = new a();

    /* renamed from: com.comviva.webaxn.utils.h0$a */
    /* loaded from: classes.dex */
    class a implements C0755x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.o
        /* renamed from: a */
        public void mo4309a(boolean z) {
            if (z) {
                C0706h0.this.m5485i();
            }
        }
    }

    private C0706h0(Context context) {
        this.f4815a = context;
    }

    /* renamed from: a */
    public static C0706h0 m5482a(Context context) {
        if (f4814j == null) {
            f4814j = new C0706h0(context);
        }
        return f4814j;
    }

    /* renamed from: h */
    private void m5484h() {
        if (C0722m1.m5887a(this.f4815a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            m5485i();
            return;
        }
        if (C0713j1.m5563a(this.f4815a).m5647d("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            C0722m1.m5885a((Activity) this.f4815a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        } else {
            if (!C0722m1.m5886a(this.f4815a, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C0755x1.m6181d(this.f4815a, "msg.rpStorage");
                return;
            }
            C0722m1.m5885a((Activity) this.f4815a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        }
        this.f4816b.m16337n().mo4083a(this.f4823i);
        C0755x1.f5264v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m5485i() {
        C3489yj m16930a;
        String str = this.f4819e.get("target");
        if (!TextUtils.isEmpty(str) && str.startsWith("$") && str.endsWith("$")) {
            String substring = str.substring(1, str.length() - 1);
            if (this.f4821g.m13901f() == null || (m16930a = this.f4821g.m13901f().m16930a(substring, (Vector<C3489yj>) null)) == null) {
                return;
            }
            C0731p1.m5959a(this.f4815a, m16930a);
        }
    }

    /* renamed from: a */
    public void m5486a() {
        if (f4814j != null) {
            f4814j = null;
        }
        HashMap<String, String> hashMap = this.f4819e;
        if (hashMap != null) {
            hashMap.clear();
            this.f4819e = null;
        }
        this.f4815a = null;
        this.f4816b = null;
        this.f4817c = null;
        this.f4818d = null;
        this.f4821g = null;
        this.f4820f = null;
        this.f4822h = null;
    }

    /* renamed from: a */
    public void m5487a(Bitmap bitmap) {
        this.f4822h = bitmap;
    }

    /* renamed from: a */
    public void m5488a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e) {
        this.f4816b = c3400wj;
        this.f4817c = c3489yj;
        this.f4818d = c0696e;
        this.f4820f = c2945mj;
        this.f4821g = c2899lj;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.f4819e;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f4819e = m6188f;
        if (m6188f.size() > 0) {
            m5484h();
        }
    }

    /* renamed from: b */
    public Bitmap m5489b() {
        return this.f4822h;
    }

    /* renamed from: c */
    public C2899lj m5490c() {
        return this.f4821g;
    }

    /* renamed from: d */
    public C2945mj m5491d() {
        return this.f4820f;
    }

    /* renamed from: e */
    public C0696e m5492e() {
        return this.f4818d;
    }

    /* renamed from: f */
    public HashMap<String, String> m5493f() {
        return this.f4819e;
    }

    /* renamed from: g */
    public C3489yj m5494g() {
        return this.f4817c;
    }
}
