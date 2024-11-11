package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import com.google.android.gms.common.C1003e;
import com.google.android.gms.common.C1004f;
import com.google.android.gms.common.C1005g;
import com.google.android.gms.location.places.InterfaceC1601a;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3137qr;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.p0 */
/* loaded from: classes.dex */
public class C0730p0 {

    /* renamed from: h */
    private static C0730p0 f5064h;

    /* renamed from: a */
    private Context f5065a;

    /* renamed from: b */
    private C3489yj f5066b;

    /* renamed from: c */
    private C0696e f5067c;

    /* renamed from: d */
    private C2899lj f5068d;

    /* renamed from: e */
    private C2945mj f5069e;

    /* renamed from: f */
    private C3400wj f5070f;

    /* renamed from: g */
    private HashMap<String, String> f5071g;

    private C0730p0(Context context) {
        this.f5065a = context;
    }

    /* renamed from: a */
    public static C0730p0 m5939a(Context context) {
        if (f5064h == null) {
            f5064h = new C0730p0(context);
        }
        return f5064h;
    }

    /* renamed from: b */
    private void m5940b() {
        try {
            ((Activity) this.f5065a).startActivityForResult(new C3137qr.a().mo15131a((Activity) this.f5065a), 2004);
        } catch (C1003e unused) {
            Toast.makeText(this.f5065a, "Google Play Services is not available.", 1).show();
        } catch (C1004f e) {
            C1005g.m6990a(e.m6989a(), (Activity) this.f5065a, 0);
        }
    }

    /* renamed from: a */
    public void m5941a() {
        if (f5064h != null) {
            f5064h = null;
        }
        HashMap<String, String> hashMap = this.f5071g;
        if (hashMap != null) {
            hashMap.clear();
            this.f5071g = null;
        }
        this.f5065a = null;
        this.f5070f = null;
        this.f5066b = null;
        this.f5067c = null;
        this.f5068d = null;
        this.f5069e = null;
    }

    /* renamed from: a */
    public void m5942a(InterfaceC1601a interfaceC1601a) {
        AbstractC0652n1 abstractC0652n1;
        StringBuilder sb = new StringBuilder();
        if (interfaceC1601a != null) {
            sb.append(interfaceC1601a.mo8983h().f7262b);
            sb.append(",");
            sb.append(interfaceC1601a.mo8983h().f7263c);
            if (interfaceC1601a.mo8982f() != null) {
                sb.append(",");
                sb.append(Uri.encode(interfaceC1601a.mo8982f().toString()));
            }
        }
        String str = this.f5071g.get("target");
        if (TextUtils.isEmpty(str) || this.f5068d.m13901f() == null) {
            return;
        }
        if (str.startsWith("$")) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
        }
        C3489yj m16930a = this.f5068d.m13901f().m16930a(str, (Vector<C3489yj>) null);
        if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
            if (this.f5068d.m13901f().f14519r != null && this.f5068d.m13901f().f14519r.containsKey(str)) {
                this.f5068d.m13901f().m16931a(str, sb.toString());
            }
        } else if (abstractC0652n1 instanceof C0670w) {
            C0670w c0670w = (C0670w) abstractC0652n1;
            c0670w.m5093h(sb.toString());
            c0670w.m5090g(sb.toString().length());
        } else if (abstractC0652n1 instanceof C0668v) {
            C0668v c0668v = (C0668v) abstractC0652n1;
            c0668v.m5029f(sb.toString());
            c0668v.m5030g(sb.toString().length());
        }
        m5944a(true);
    }

    /* renamed from: a */
    public void m5943a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str) {
        this.f5066b = c3489yj;
        this.f5067c = c0696e;
        this.f5070f = c3400wj;
        this.f5069e = c2945mj;
        this.f5068d = c2899lj;
        HashMap<String, String> hashMap = this.f5071g;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f5071g = C0755x1.m6188f(str);
        m5940b();
    }

    /* renamed from: a */
    public void m5944a(boolean z) {
        if (TextUtils.isEmpty(this.f5071g.get("action")) || this.f5070f.m16298a(this.f5071g.get("action"), false, this.f5066b, this.f5067c, this.f5069e, this.f5068d)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f5071g.get("action"), this.f5069e.m14145i());
        if (m6134a != null) {
            this.f5069e.m14121a(m6134a);
        }
        String str = null;
        C3489yj c3489yj = this.f5066b;
        if (c3489yj != null) {
            str = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f5067c;
            if (c0696e != null) {
                str = c0696e.f4718j;
            }
        }
        if (this.f5070f.m16263a(this.f5071g.get("action"), false, false, this.f5069e, false, false, str, this.f5068d) <= 0 || !z) {
            return;
        }
        this.f5070f.m16258E();
    }
}
