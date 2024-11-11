package com.comviva.webaxn.utils;

import android.content.Context;
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

/* renamed from: com.comviva.webaxn.utils.b1 */
/* loaded from: classes.dex */
public class C0689b1 {

    /* renamed from: l */
    private static C0689b1 f4664l;

    /* renamed from: a */
    private Context f4665a;

    /* renamed from: b */
    private C3400wj f4666b;

    /* renamed from: c */
    private C3489yj f4667c;

    /* renamed from: d */
    private C0696e f4668d;

    /* renamed from: e */
    private HashMap<String, String> f4669e;

    /* renamed from: f */
    private C2945mj f4670f;

    /* renamed from: g */
    private C2899lj f4671g;

    /* renamed from: h */
    private int f4672h = 1;

    /* renamed from: i */
    private boolean f4673i = true;

    /* renamed from: j */
    private int f4674j = 1;

    /* renamed from: k */
    private String f4675k;

    /* renamed from: com.comviva.webaxn.utils.b1$a */
    /* loaded from: classes.dex */
    class a implements C0755x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.o
        /* renamed from: a */
        public void mo4309a(boolean z) {
            if (z) {
                C0689b1.this.m5366b();
            }
        }
    }

    private C0689b1(Context context) {
        new a();
        this.f4665a = context;
    }

    /* renamed from: a */
    public static C0689b1 m5363a(Context context) {
        if (f4664l == null) {
            f4664l = new C0689b1(context);
        }
        return f4664l;
    }

    /* renamed from: a */
    private void m5365a(boolean z) {
        if (!z || TextUtils.isEmpty(this.f4675k)) {
            return;
        }
        try {
            File file = new File(this.f4675k);
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
    /* renamed from: b */
    public void m5366b() {
        String str = this.f4669e.get("target");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("$")) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
        }
        RecorderData recorderData = null;
        C3489yj m16930a = this.f4671g.m13901f().m16930a(str, (Vector<C3489yj>) null);
        if (m16930a != null) {
            if (this.f4672h != 1 && !TextUtils.isEmpty(this.f4669e.get("save")) && this.f4669e.get("save").equalsIgnoreCase("true")) {
                this.f4673i = false;
            }
            int i = this.f4674j;
            if (i == 1) {
                recorderData = new RecorderData();
                recorderData.m5249a(this.f4674j);
                recorderData.m5250a(this.f4669e.get("lbcap"));
                recorderData.m5250a(this.f4669e.get("rbcap"));
                recorderData.m5264h(this.f4669e.get("mimetype"));
                recorderData.m5284r(C0755x1.m6127a(this.f4665a, this.f4672h, this.f4669e.get("filedir")));
                recorderData.m5286s(this.f4669e.get("duration"));
            } else if (i == 2) {
                recorderData = new RecorderData();
                recorderData.m5249a(this.f4674j);
                recorderData.m5264h(this.f4669e.get("mimetype"));
                recorderData.m5284r(C0755x1.m6127a(this.f4665a, this.f4672h, this.f4669e.get("filedir")));
                recorderData.m5252b(this.f4669e.get("label1"));
                recorderData.m5258e(this.f4669e.get("label2"));
                recorderData.m5256d(this.f4669e.get("ts_label1"));
                recorderData.m5262g(this.f4669e.get("ts_label2"));
                recorderData.m5254c(this.f4669e.get("ff_label1"));
                recorderData.m5260f(this.f4669e.get("ff_label2"));
                recorderData.m5278o(this.f4669e.get("stat_text1"));
                recorderData.m5280p(this.f4669e.get("stat_text2"));
                recorderData.m5282q(this.f4669e.get("stat_text3"));
                recorderData.m5268j(this.f4669e.get("st1fs"));
                recorderData.m5272l(this.f4669e.get("st2fs"));
                recorderData.m5276n(this.f4669e.get("st3fs"));
                recorderData.m5266i(this.f4669e.get("st1ff"));
                recorderData.m5270k(this.f4669e.get("st2ff"));
                recorderData.m5274m(this.f4669e.get("st3ff"));
                recorderData.m5288t(this.f4669e.get("status1"));
                recorderData.m5290u(this.f4669e.get("status2"));
                recorderData.m5292v(this.f4669e.get("status3"));
            }
            if (recorderData != null) {
                C0731p1.m5963a(this.f4665a, m16930a, recorderData, 1503);
            }
        }
    }

    /* renamed from: c */
    private void m5367c(String str) {
        if (TextUtils.isEmpty(str) || this.f4666b.m16298a(str, false, this.f4667c, this.f4668d, this.f4670f, this.f4671g)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(str, this.f4670f.m14145i());
        if (m6134a != null) {
            this.f4670f.m14121a(m6134a);
        }
        String str2 = null;
        C3489yj c3489yj = this.f4667c;
        if (c3489yj != null) {
            str2 = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f4668d;
            if (c0696e != null) {
                str2 = c0696e.f4718j;
            }
        }
        if (this.f4666b.m16263a(str, false, false, this.f4670f, false, false, str2, this.f4671g) > 0) {
            this.f4666b.m16258E();
        }
    }

    /* renamed from: a */
    public void m5368a() {
        if (f4664l != null) {
            f4664l = null;
        }
        HashMap<String, String> hashMap = this.f4669e;
        if (hashMap != null) {
            hashMap.clear();
            this.f4669e = null;
        }
        this.f4665a = null;
        this.f4666b = null;
        this.f4667c = null;
        this.f4668d = null;
        this.f4671g = null;
        this.f4670f = null;
        this.f4675k = null;
    }

    /* renamed from: a */
    public void m5369a(String str) {
        String str2 = this.f4669e.get("rec_dur");
        if (TextUtils.isEmpty(str2) || this.f4671g.m13901f().f14519r == null || !this.f4671g.m13901f().f14519r.containsKey(str2)) {
            return;
        }
        this.f4671g.m13901f().m16931a(str2, str);
    }

    /* renamed from: a */
    public void m5370a(C3489yj c3489yj, String str, String str2) {
        HashMap<String, String> hashMap;
        String str3;
        if (!str2.equals("lbcap")) {
            if (str2.equals("rbcap")) {
                hashMap = this.f4669e;
                str3 = "rbact";
            }
            m5365a(this.f4673i);
        }
        this.f4675k = str;
        if (c3489yj.f14208e == 28) {
            byte[] m6179c = C0755x1.m6179c(str);
            c3489yj.f14262w0 = m6179c;
            m5371b(String.valueOf(m6179c.length));
        }
        m5369a(this.f4669e.get("duration"));
        str3 = "lbact";
        if (this.f4669e.get("lbact") != null) {
            hashMap = this.f4669e;
        } else {
            hashMap = this.f4669e;
            str3 = "action";
        }
        m5367c(hashMap.get(str3));
        m5365a(this.f4673i);
    }

    /* renamed from: b */
    public void m5371b(String str) {
        String str2 = this.f4669e.get("rec_size");
        if (TextUtils.isEmpty(str2) || this.f4671g.m13901f().f14519r == null || !this.f4671g.m13901f().f14519r.containsKey(str2)) {
            return;
        }
        this.f4671g.m13901f().m16931a(str2, str);
    }
}
