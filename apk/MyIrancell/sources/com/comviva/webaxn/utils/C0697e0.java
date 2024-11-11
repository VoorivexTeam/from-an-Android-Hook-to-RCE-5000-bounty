package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.e0 */
/* loaded from: classes.dex */
public class C0697e0 {

    /* renamed from: i */
    private static C0697e0 f4731i;

    /* renamed from: a */
    private Context f4732a;

    /* renamed from: b */
    private HashMap<String, String> f4733b;

    /* renamed from: c */
    private C2899lj f4734c;

    /* renamed from: d */
    private String f4735d;

    /* renamed from: e */
    private String f4736e;

    /* renamed from: f */
    private String f4737f;

    /* renamed from: g */
    private String f4738g;

    /* renamed from: h */
    private String f4739h;

    private C0697e0(Context context) {
        this.f4732a = context;
    }

    /* renamed from: a */
    public static C0697e0 m5413a(Context context) {
        if (f4731i == null) {
            f4731i = new C0697e0(context);
        }
        return f4731i;
    }

    /* renamed from: a */
    public String m5414a(String str) {
        AbstractC0652n1 abstractC0652n1;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("$") || !str.endsWith("$")) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            if (this.f4734c.m13901f() != null) {
                C3489yj m16930a = this.f4734c.m13901f().m16930a(substring, (Vector<C3489yj>) null);
                if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
                    if (this.f4734c.m13901f().f14519r != null) {
                        return this.f4734c.m13901f().f14519r.get(substring);
                    }
                } else {
                    if (abstractC0652n1 instanceof C0670w) {
                        return ((C0670w) abstractC0652n1).m5097m();
                    }
                    if (abstractC0652n1 instanceof C0668v) {
                        return ((C0668v) abstractC0652n1).m5034m();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m5415a() {
        if (f4731i != null) {
            f4731i = null;
        }
        HashMap<String, String> hashMap = this.f4733b;
        if (hashMap != null) {
            hashMap.clear();
            this.f4733b = null;
        }
        this.f4732a = null;
        this.f4734c = null;
    }

    /* renamed from: a */
    public void m5416a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str) {
        this.f4734c = c2899lj;
        this.f4735d = null;
        this.f4736e = null;
        this.f4737f = null;
        this.f4738g = null;
        this.f4739h = null;
        m5418b(str);
    }

    /* renamed from: b */
    public void m5417b() {
        C0731p1.m5957a(this.f4732a, this.f4735d, this.f4736e, this.f4737f, this.f4738g, this.f4739h);
    }

    /* renamed from: b */
    public void m5418b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.f4733b;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f4733b = m6188f;
        if (m6188f.size() > 0) {
            this.f4735d = m5414a(this.f4733b.get("to"));
            this.f4736e = m5414a(this.f4733b.get("cc"));
            this.f4737f = m5414a(this.f4733b.get("bcc"));
            this.f4738g = Uri.decode(m5414a(this.f4733b.get("subject")));
            this.f4739h = Uri.decode(m5414a(this.f4733b.get("body")));
        }
    }
}
