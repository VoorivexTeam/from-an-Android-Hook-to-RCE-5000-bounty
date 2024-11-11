package p000;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.C0613a1;
import com.comviva.webaxn.p002ui.C0643k1;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0690c;
import com.comviva.webaxn.utils.C0696e;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0716k1;
import com.comviva.webaxn.utils.C0744u;
import com.comviva.webaxn.utils.C0755x1;
import com.comviva.webaxn.utils.C0761z1;
import java.util.HashMap;
import java.util.Vector;

/* renamed from: oi */
/* loaded from: classes.dex */
public class C3036oi {

    /* renamed from: d */
    private static int f12480d;

    /* renamed from: a */
    private C3400wj f12481a;

    /* renamed from: b */
    private Context f12482b;

    /* renamed from: c */
    private boolean f12483c;

    public C3036oi(C3400wj c3400wj, Context context, boolean z) {
        this.f12481a = null;
        this.f12483c = false;
        this.f12481a = c3400wj;
        this.f12482b = context;
        f12480d = 0;
        this.f12483c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0179, code lost:
    
        if (r9.f12483c == false) goto L100;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m14529A(p000.C3307ui r10, p000.C2945mj r11) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3036oi.m14529A(ui, mj):boolean");
    }

    /* renamed from: B */
    private void m14530B(C3307ui c3307ui, C2945mj c2945mj) {
        if (c3307ui == null || m14529A(c3307ui, c2945mj)) {
            return;
        }
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            m14530B(c3307ui.m15821d(i), c2945mj);
        }
    }

    /* renamed from: C */
    private C3531zj m14531C(C3307ui c3307ui, C2945mj c2945mj) {
        boolean z;
        int indexOf;
        C3531zj c3531zj = null;
        if (c3307ui != null) {
            try {
                int m15828j = c3307ui.m15828j();
                boolean z2 = true;
                if (c3307ui.m16630a() != 1) {
                    if (m15828j == 14) {
                        c3531zj = m14550b(c3307ui, c2945mj);
                        if (c3531zj != null && (c3531zj.f14514m.equalsIgnoreCase("confirm") || c3531zj.f14514m.equalsIgnoreCase("error") || c3531zj.f14514m.equalsIgnoreCase("info") || c3531zj.f14514m.equalsIgnoreCase("toast") || c3531zj.f14514m.equalsIgnoreCase("popup") || c3531zj.f14514m.equalsIgnoreCase("drawer"))) {
                            return c3531zj;
                        }
                        z = false;
                    } else {
                        if (m15828j == 7) {
                            m14584s(c3307ui, c2945mj);
                            z = true;
                        } else {
                            if (m15828j == 61) {
                                m14576k(c3307ui, c2945mj);
                            }
                            z = false;
                        }
                        z2 = false;
                    }
                    if (!z2 || !z) {
                        for (int i = 0; i < c3307ui.m15827i(); i++) {
                            c3531zj = m14531C(c3307ui.m15821d(i), c2945mj);
                        }
                    }
                } else if (m15828j == 53) {
                    String m14533a = m14533a(c3307ui);
                    if (!TextUtils.isEmpty(m14533a) && !this.f12483c && (indexOf = m14533a.indexOf(".")) != -1) {
                        C0761z1.m6235e(m14533a.substring(0, indexOf));
                        C0761z1.m6234d(m14533a.substring(indexOf + 1, m14533a.length()));
                        if (C0713j1.m5563a(this.f12482b).m5675h0() == 0) {
                            C0713j1.m5563a(this.f12482b).m5746y(1);
                        }
                    }
                }
            } catch (C3399wi e) {
                e.printStackTrace();
            }
        }
        return c3531zj;
    }

    /* renamed from: a */
    private C0482bj m14532a(HashMap<String, String> hashMap) {
        C0482bj c0482bj = new C0482bj();
        try {
            c0482bj.m3400a(Integer.parseInt(hashMap.get("advtype")));
        } catch (NumberFormatException unused) {
        }
        c0482bj.m3401a(hashMap.get("zoneid"));
        if (!TextUtils.isEmpty(hashMap.get("x-text-align"))) {
            c0482bj.m3407c(hashMap.get("x-text-align"));
        }
        if (!TextUtils.isEmpty(hashMap.get("x-vertical-align"))) {
            c0482bj.m3407c(hashMap.get("x-vertical-align"));
        }
        c0482bj.m3404b(hashMap.get("x-resimg"));
        if (!TextUtils.isEmpty(hashMap.get("x-color"))) {
            try {
                c0482bj.m3406c(Color.parseColor(hashMap.get("x-color")));
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (!TextUtils.isEmpty(hashMap.get("x-background-color"))) {
            try {
                c0482bj.m3406c(Color.parseColor(hashMap.get("x-background-color")));
            } catch (IllegalArgumentException unused3) {
            }
        }
        return c0482bj;
    }

    /* renamed from: a */
    private String m14533a(C3307ui c3307ui) {
        int i = 0;
        while (true) {
            if (i >= c3307ui.m15827i()) {
                break;
            }
            C3307ui m15821d = c3307ui.m15821d(i);
            if (m15821d.m15824f() == 1) {
                try {
                    return m15821d.m15826h();
                } catch (C3399wi unused) {
                }
            } else {
                i++;
            }
        }
        return null;
    }

    /* renamed from: a */
    private String m14534a(C3307ui c3307ui, int i) {
        try {
            Vector<C3167ri> m15819c = c3307ui.m15819c(i);
            if (m15819c != null) {
                return m15819c.elementAt(0).m15276b();
            }
            return null;
        } catch (C3399wi unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C3361vj m14535a(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C3361vj c3361vj = new C3361vj();
        String[] split = str.split(",");
        int i = 0;
        while (i <= split.length) {
            int i2 = i + 1;
            if (i == 0 && !TextUtils.isEmpty(split[0])) {
                float f2 = 0.0f;
                try {
                    f2 = Float.parseFloat(split[0].split(":")[1]);
                } catch (NumberFormatException unused) {
                }
                c3361vj.m16035a(f2);
            }
            i = i2;
        }
        return c3361vj;
    }

    /* renamed from: a */
    private C3489yj m14536a(C3307ui c3307ui, C3489yj c3489yj, C3531zj c3531zj, C2945mj c2945mj) {
        HashMap<String, C2555hj> hashMap;
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() == 1) {
                    if (m15828j == 31) {
                        C3489yj m14549b = m14549b(m15821d);
                        if (c3489yj != null) {
                            c3489yj.m16634a(m14549b);
                            m14549b.f14145A0 = c3489yj;
                        }
                    } else if (m15828j == 50) {
                        m14559d(m15821d, c3489yj);
                    } else if (m15828j == 5) {
                        String m14533a = m14533a(m15821d);
                        if (!TextUtils.isEmpty(m14533a)) {
                            try {
                                int parseInt = Integer.parseInt(m14533a);
                                if (parseInt != 0) {
                                    r7 = parseInt;
                                }
                            } catch (Exception unused) {
                            }
                        }
                        c3489yj.f14222i1 = C0755x1.m6113a(r7);
                    }
                } else if (m15828j == 13) {
                    C3489yj m14537a = m14537a(m15821d, c3531zj, c2945mj);
                    if (m15821d.m15827i() > 0) {
                        C3307ui m15821d2 = m15821d.m15821d(0);
                        if (m15821d2.m15828j() == 13 || m15821d2.m15828j() == 31 || m15821d2.m15828j() == 50) {
                            m14537a = m14536a(m15821d, m14537a, c3531zj, c2945mj);
                        }
                    }
                    c3489yj.m16634a(m14537a);
                    if (m14537a != null) {
                        m14537a.f14145A0 = c3489yj;
                    }
                } else if (m15828j == 31) {
                    m14572h(m15821d, c3489yj);
                } else if (m15828j == 54) {
                    int m5748z = C0713j1.m5563a(this.f12481a.m16332i()).m5748z();
                    String m14533a2 = m14533a(m15821d);
                    if (m14533a2 != null) {
                        try {
                            int parseInt2 = Integer.parseInt(m14533a2);
                            m5748z = parseInt2 != 0 ? parseInt2 : -16777216;
                        } catch (Exception unused2) {
                        }
                        c3489yj.f14219h1 = C0755x1.m6113a(m5748z);
                    }
                }
            } catch (C3399wi unused3) {
            }
        }
        if (C0755x1.m6177c() && (hashMap = c3489yj.f14175P0) != null && hashMap.size() > 0) {
            C2555hj c2555hj = c3489yj.f14175P0.get("leftswipe");
            c3489yj.f14175P0.put("leftswipe", c3489yj.f14175P0.get("rightswipe"));
            c3489yj.f14175P0.put("rightswipe", c2555hj);
        }
        if (Build.VERSION.SDK_INT < 11 && c3489yj.f14208e == 39) {
            int i2 = 0;
            while (i2 < c3489yj.f14268z0.size()) {
                C3489yj c3489yj2 = c3489yj.f14268z0.get(i2);
                c3489yj2.f14208e = 0;
                C3489yj c3489yj3 = new C3489yj(0.0f);
                c3489yj3.f14208e = 22;
                c3489yj3.f14235n = c3489yj2.f14205d;
                c3489yj3.f14241p = c3489yj.f14241p;
                c3489yj3.f14233m0 = "100%";
                c3489yj3.f14156G = "10";
                c3489yj3.f14160I = "10";
                C3489yj c3489yj4 = new C3489yj(0.0f);
                c3489yj4.f14208e = 24;
                c3489yj4.f14233m0 = "100%";
                c3489yj4.f14236n0 = "3";
                C0744u c0744u = new C0744u(this.f12482b, 0.0f);
                c3489yj4.f14241p = c0744u;
                c0744u.m6063c(3);
                c3489yj4.f14241p.m6059b(c3489yj.f14219h1);
                c3489yj.f14268z0.add(i2, c3489yj3);
                int i3 = i2 + 1;
                c3489yj.f14268z0.add(i3, c3489yj4);
                i2 = i3 + 1 + 1;
            }
            c3489yj.f14208e = 0;
            c3531zj.m16938b(false);
        }
        return c3489yj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0b0a, code lost:
    
        if (r11 == 0) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x0b1d, code lost:
    
        if (r11 == 0) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:936:0x0f37, code lost:
    
        if (r13 == 0) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:945:0x0f4e, code lost:
    
        if (r13 == 0) goto L752;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:867:0x0de1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private p000.C3489yj m14537a(p000.C3307ui r22, p000.C3531zj r23, p000.C2945mj r24) {
        /*
            Method dump skipped, instructions count: 5040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3036oi.m14537a(ui, zj, mj):yj");
    }

    /* renamed from: a */
    private void m14538a(C3307ui c3307ui, C2899lj c2899lj, C2945mj c2945mj) {
        C3400wj c3400wj;
        C0696e m16329g;
        String str;
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 13) {
                    if (m15816b.m15103d().elementAt(0).m15278d() == 1) {
                        this.f12481a.m16329g().f4715g = m15816b.m15103d().elementAt(0).m15276b();
                    } else {
                        int m15277c = m15816b.m15103d().elementAt(0).m15277c();
                        if (m15277c == 134) {
                            m16329g = this.f12481a.m16329g();
                            str = "ok";
                        } else if (m15277c == 135) {
                            m16329g = this.f12481a.m16329g();
                            str = "exit";
                        } else if (m15277c == 136) {
                            m16329g = this.f12481a.m16329g();
                            str = "url";
                        } else if (m15277c == 147) {
                            m16329g = this.f12481a.m16329g();
                            str = "call";
                        } else if (m15277c == 145) {
                            m16329g = this.f12481a.m16329g();
                            str = "error";
                        }
                        m16329g.f4715g = str;
                    }
                } else if (m15101b == 7) {
                    if (this.f12481a.m16329g().f4716h == null) {
                        if (m15816b.m15103d().elementAt(0).m15278d() != 0) {
                            this.f12481a.m16329g().f4716h = m15816b.m15103d().elementAt(0).m15276b();
                        } else if (m15816b.m15103d().elementAt(0).m15277c() == 133) {
                            this.f12481a.m16329g().f4716h = "Menulist:";
                        }
                    }
                } else if (m15101b == 42) {
                    this.f12481a.m16329g().f4725q = (byte) Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                } else {
                    if (m15101b == 11) {
                        this.f12481a.m16329g().f4717i = "HN";
                        c3400wj = this.f12481a;
                    } else if (m15101b == 12) {
                        this.f12481a.m16329g().f4717i = m15816b.m15103d().elementAt(0).m15276b();
                        c3400wj = this.f12481a;
                    } else if (m15101b == 54) {
                        this.f12481a.m16329g().f4729u = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15101b == 53) {
                        this.f12481a.m16329g().f4709a = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15101b == 58) {
                        this.f12481a.m16329g().f4710b = Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                    } else if (m15101b == 59) {
                        this.f12481a.m16329g().f4711c = Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                    } else if (m15101b == 63) {
                        this.f12481a.m16329g().f4727s = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15101b == 68) {
                        if (m15816b.m15103d().elementAt(0).m15276b().equalsIgnoreCase("false")) {
                            this.f12481a.m16329g().f4712d = false;
                        }
                    } else if (m15101b == 35) {
                        this.f12481a.m16329g().f4713e = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15101b == 23) {
                        this.f12481a.m16329g().f4726r = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15101b == 85) {
                        String trim = m15816b.m15103d().elementAt(0).m15276b().trim();
                        if (!TextUtils.isEmpty(trim)) {
                            if (trim.startsWith("Menulist:")) {
                                trim = trim.substring(9, trim.length());
                            }
                            this.f12481a.m16329g().f4718j = trim.trim();
                        }
                    } else if (m15101b == 81) {
                        String trim2 = m15816b.m15103d().elementAt(0).m15276b().trim();
                        if (!TextUtils.isEmpty(trim2)) {
                            this.f12481a.m16329g().f4719k = trim2.trim();
                        }
                    } else if (m15101b == 106) {
                        String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                        if (!TextUtils.isEmpty(m15276b)) {
                            this.f12481a.m16329g().f4720l = m15276b;
                        }
                    } else if (m15101b == 117) {
                        String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                        if (!TextUtils.isEmpty(m15276b2)) {
                            this.f12481a.m16329g().f4721m = m15276b2;
                        }
                    }
                    c3400wj.m16329g().f4724p = true;
                }
            } catch (Exception unused) {
            }
        }
        String m14533a = m14533a(c3307ui);
        if (m14533a != null) {
            this.f12481a.m16329g().f4714f = m14533a;
        }
        if (c2945mj != null) {
            c2945mj.m14118a(this.f12481a.m16329g());
        } else if (c2899lj != null) {
            c2899lj.m13881a(this.f12481a.m16329g());
        }
    }

    /* renamed from: a */
    private void m14539a(C3307ui c3307ui, C2945mj c2945mj) {
        String m14533a;
        C0524cj c0524cj = new C0524cj();
        c2945mj.m14117a(c0524cj);
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() == 1) {
                    if (m15828j == 25) {
                        String m14534a = m14534a(m15821d, 33);
                        if (!TextUtils.isEmpty(m14534a) && !c0524cj.m3687a(this.f12482b, m14534a)) {
                            c2945mj.m14114a(0).m13879a(6, m14534a);
                        }
                        String m14534a2 = m14534a(m15821d, 38);
                        if (!TextUtils.isEmpty(m14534a2)) {
                            c0524cj.m3689b(m14534a2);
                        }
                        String m14534a3 = m14534a(m15821d, 39);
                        if (!TextUtils.isEmpty(m14534a3)) {
                            c0524cj.m3686a(m14534a3);
                        }
                        String m14534a4 = m14534a(m15821d, 84);
                        if (!TextUtils.isEmpty(m14534a4)) {
                            HashMap<String, String> m6133a = C0755x1.m6133a(m14534a4, ";", ":", (String) null);
                            if (m6133a.size() > 0 && !TextUtils.isEmpty(m6133a.get("addontype"))) {
                                try {
                                    c0524cj.m3683a(Integer.parseInt(m6133a.get("addontype")));
                                    if (m6133a.size() > 1) {
                                        c0524cj.m3685a(m14532a(m6133a));
                                    }
                                } catch (NumberFormatException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } else if (m15828j == 24) {
                        m14590y(m15821d, c2945mj);
                    }
                } else if (m15828j == 10) {
                    this.f12481a.m16275a(new C0696e());
                    m14538a(m15821d, (C2899lj) null, c2945mj);
                    for (int i2 = 0; i2 < m15821d.m15827i(); i2++) {
                        C3307ui m15821d2 = m15821d.m15821d(i2);
                        if (m15821d2.m16630a() == 0 && m15821d2.m15828j() == 19 && (m14533a = m14533a(m15821d2)) != null && m14533a.equals("F")) {
                            this.f12481a.m16329g().f4723o = false;
                        }
                    }
                }
            } catch (C3399wi unused) {
            }
        }
    }

    /* renamed from: a */
    private void m14540a(C3307ui c3307ui, C2945mj c2945mj, C3531zj c3531zj) {
        C0696e c0696e = new C0696e();
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 33) {
                    String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b)) {
                        c3531zj.f14515n = m15276b;
                        byte[] m190d = C0023aj.m160a(this.f12481a.m16332i()).m190d(m15276b, "public");
                        if (m190d == null) {
                            m190d = C0023aj.m160a(this.f12481a.m16332i()).m190d(m15276b, "private");
                        }
                        if (m190d == null) {
                            c2945mj.m14139e().m13879a(8, m15276b);
                        } else {
                            c3531zj.f14516o = m190d;
                        }
                    }
                } else if (m15101b == 80) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b2)) {
                        if (m15276b2.indexOf(".") != -1) {
                            m15276b2 = m15276b2.substring(0, m15276b2.indexOf("."));
                        }
                        c3531zj.f14510i = m15276b2;
                    }
                }
            } catch (C3399wi unused) {
            }
        }
        try {
            if (c3531zj.f14510i != null && this.f12482b.getResources().getIdentifier(c3531zj.f14510i, "drawable", this.f12482b.getPackageName()) > 0 && c3531zj.f14515n != null) {
                c2945mj.m14139e().m13890b(8, c3531zj.f14515n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        c3531zj.f14511j = c0696e;
    }

    /* renamed from: a */
    private void m14541a(C3307ui c3307ui, C2945mj c2945mj, C3531zj c3531zj, boolean z) {
        String m14533a = m14533a(c3307ui);
        if (m14533a == null || !m14533a.equals("T") || !z || c3531zj == null || c3531zj.f14508g == null) {
            c2945mj.m14129b(true);
        } else {
            c3531zj.f14518q = true;
        }
    }

    /* renamed from: a */
    private void m14542a(C3307ui c3307ui, C3212sj c3212sj) {
        int i;
        String m15276b;
        c3212sj.f13118b = new C0744u(this.f12482b, C0687b.m5342a(this.f12481a.m16332i()).m5343a().m5544a());
        int i2 = 0;
        while (true) {
            i = 36;
            if (i2 >= c3307ui.m15822e()) {
                break;
            }
            C3128qi m15816b = c3307ui.m15816b(i2);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 36) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b2 != null) {
                        c3212sj.f13118b.m6054a(Integer.parseInt(m15276b2));
                    }
                } else if (m15101b == 13 && (m15276b = m15816b.m15103d().elementAt(0).m15276b()) != null) {
                    c3212sj.f13117a = Integer.parseInt(m15276b);
                }
            } catch (C3399wi unused) {
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < c3307ui.m15827i()) {
            C3168rj c3168rj = new C3168rj(this.f12482b, C0687b.m5342a(this.f12481a.m16332i()).m5343a().m5544a());
            C3307ui m15821d = c3307ui.m15821d(i3);
            try {
                int m15828j = m15821d.m15828j();
                int i4 = 1;
                if ((m15821d.m16630a() == 0 && m15828j == 8) || (m15821d.m16630a() == 1 && m15828j == 8)) {
                    c3168rj.m6055a(m14534a(m15821d, 29));
                }
                int i5 = 0;
                while (i5 < m15821d.m15827i()) {
                    C3307ui m15821d2 = m15821d.m15821d(i5);
                    if (m15821d2.m15824f() == i4) {
                        String m15826h = m15821d2.m15826h();
                        if (m15826h != null) {
                            c3168rj.m15279c(m15826h);
                        }
                    } else {
                        int i6 = 31;
                        if (m15821d2.m15828j() == 31) {
                            int i7 = 0;
                            while (i7 < m15821d2.m15822e()) {
                                C3128qi m15816b2 = m15821d2.m15816b(i7);
                                int m15101b2 = m15816b2.m15101b();
                                if (m15101b2 == 28) {
                                    c3168rj.m6059b(Integer.parseInt(m15816b2.m15103d().elementAt(0).m15276b()));
                                } else if (m15101b2 == i) {
                                    c3168rj.m6054a(Integer.parseInt(m15816b2.m15103d().elementAt(0).m15276b()));
                                } else if (m15101b2 == i6) {
                                    c3168rj.m6063c(Integer.parseInt(m15816b2.m15103d().elementAt(0).m15276b()));
                                } else if (m15101b2 == 30) {
                                    c3168rj.m6065d(Integer.parseInt(m15816b2.m15103d().elementAt(0).m15276b()));
                                } else if (m15101b2 == 87) {
                                    String m15276b3 = m15816b2.m15103d().elementAt(0).m15276b();
                                    if (!TextUtils.isEmpty(m15276b3)) {
                                        m15276b3 = m15276b3.trim();
                                        if (m15276b3.contains("\\.")) {
                                            m15276b3 = m15276b3.replace("\\.", ".");
                                        }
                                    }
                                    c3168rj.m6060b(m15276b3);
                                } else if (m15101b2 == 98) {
                                    String m15276b4 = m15816b2.m15103d().elementAt(0).m15276b();
                                    if (!TextUtils.isEmpty(m15276b4)) {
                                        if (m15276b4.contains("px") || m15276b4.contains("PX")) {
                                            m15276b4 = m15276b4.substring(0, m15276b4.length() - 2);
                                        }
                                        try {
                                            c3168rj.m6053a(C0755x1.m6112a(Float.parseFloat(m15276b4)));
                                        } catch (Exception unused2) {
                                            c3168rj.m6053a(-1.0f);
                                        }
                                    }
                                } else if (m15101b2 == 101) {
                                    String m15276b5 = m15816b2.m15103d().elementAt(0).m15276b();
                                    if (!TextUtils.isEmpty(m15276b5)) {
                                        if (m15276b5.contains("px") || m15276b5.contains("PX")) {
                                            m15276b5 = m15276b5.substring(0, m15276b5.length() - 2);
                                        }
                                        try {
                                            c3168rj.m6058b(Float.parseFloat(m15276b5));
                                        } catch (Exception unused3) {
                                            c3168rj.m6058b(-1.0f);
                                        }
                                    }
                                }
                                i7++;
                                i = 36;
                                i6 = 31;
                            }
                        }
                    }
                    i5++;
                    i = 36;
                    i4 = 1;
                }
                c3212sj.m15438a(c3168rj);
            } catch (C3399wi unused4) {
            }
            i3++;
            i = 36;
        }
    }

    /* renamed from: a */
    private void m14543a(C3307ui c3307ui, C3489yj c3489yj) {
        C0482bj c0482bj = new C0482bj();
        int i = 0;
        while (true) {
            int i2 = -16777216;
            if (i >= c3307ui.m15822e()) {
                break;
            }
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 29) {
                    String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b)) {
                        c0482bj.m3407c(m15276b);
                    }
                } else if (m15101b == 73) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b2)) {
                        c0482bj.m3409d(m15276b2);
                    }
                } else if (m15101b == 86) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b3)) {
                        try {
                            int parseInt = Integer.parseInt(m15276b3);
                            if (parseInt != 0) {
                                i2 = parseInt;
                            }
                            c0482bj.m3406c(i2);
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (m15101b == 80) {
                    String m15276b4 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b4)) {
                        if (m15276b4.indexOf(".") != -1) {
                            m15276b4 = m15276b4.substring(0, m15276b4.indexOf("."));
                        }
                        c0482bj.m3404b(m15276b4);
                    }
                }
            } catch (C3399wi unused) {
            }
            i++;
        }
        for (int i3 = 0; i3 < c3307ui.m15827i(); i3++) {
            C3307ui m15821d = c3307ui.m15821d(i3);
            try {
                if (m15821d.m15828j() == 31) {
                    for (int i4 = 0; i4 < m15821d.m15822e(); i4++) {
                        C3128qi m15816b2 = m15821d.m15816b(i4);
                        int m15101b2 = m15816b2.m15101b();
                        if (m15101b2 == 28) {
                            try {
                                int parseInt2 = Integer.parseInt(m15816b2.m15103d().elementAt(0).m15276b());
                                if (parseInt2 == 0) {
                                    parseInt2 = -16777216;
                                }
                                c0482bj.m3406c(C0755x1.m6113a(parseInt2));
                            } catch (Exception unused2) {
                            }
                        } else if (m15101b2 == 36) {
                            int parseInt3 = Integer.parseInt(m15816b2.m15103d().elementAt(0).m15276b());
                            if (parseInt3 == 0) {
                                parseInt3 = -16777216;
                            }
                            c0482bj.m3403b(C0755x1.m6113a(parseInt3));
                        }
                    }
                }
            } catch (C3399wi unused3) {
            }
        }
        c3489yj.f14167L0 = c0482bj;
    }

    /* renamed from: a */
    private void m14544a(C3307ui c3307ui, C3489yj c3489yj, C0744u c0744u) {
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() == 1) {
                    if (m15828j == 6) {
                        for (int i2 = 0; i2 < m15821d.m15822e(); i2++) {
                            C3128qi m15816b = m15821d.m15816b(i2);
                            int m15101b = m15816b.m15101b();
                            if (m15101b == 45) {
                                String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                                if (m15276b != null) {
                                    c3489yj.f14212f0 = Integer.parseInt(m15276b);
                                }
                            } else if (m15101b == 48) {
                                c3489yj.f14215g0 = true;
                            }
                        }
                        for (int i3 = 0; i3 < m15821d.m15827i(); i3++) {
                            C3307ui m15821d2 = m15821d.m15821d(i3);
                            if (m15821d2.m16630a() == 1 && m15821d2.m15828j() == 7) {
                                C3212sj c3212sj = new C3212sj();
                                m14542a(m15821d2, c3212sj);
                                c3489yj.m16633a(c3212sj);
                            }
                        }
                    }
                } else if (m15828j == 6) {
                    String m14534a = m14534a(m15821d, 14);
                    if (m14534a != null) {
                        c3489yj.f14212f0 = Integer.parseInt(m14534a);
                    }
                    for (int i4 = 0; i4 < m15821d.m15827i(); i4++) {
                        C3307ui m15821d3 = m15821d.m15821d(i4);
                        if (m15821d3.m16630a() == 0 && m15821d3.m15828j() == 7) {
                            C3212sj c3212sj2 = new C3212sj();
                            m14542a(m15821d3, c3212sj2);
                            c3489yj.m16633a(c3212sj2);
                        }
                    }
                }
            } catch (C3399wi unused) {
            }
        }
    }

    /* renamed from: a */
    private void m14545a(C3307ui c3307ui, C3489yj c3489yj, C3531zj c3531zj) {
        C3264tj m14554c;
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                if (m15821d.m15828j() == 13 && (m14554c = m14554c(m15821d)) != null) {
                    if (c3489yj != null) {
                        if (c3489yj.f14166L == null) {
                            c3489yj.f14166L = new Vector<>();
                        }
                        c3489yj.f14166L.add(m14554c);
                    }
                    m14554c.f13317d = c3531zj.m16930a(m14554c.f13316c, (Vector<C3489yj>) null);
                    for (int i2 = 0; i2 < c3531zj.f14506e.size(); i2++) {
                        C3489yj elementAt = c3531zj.f14506e.elementAt(i2);
                        if (elementAt.f14186V != null && m14554c.f13320g != null && elementAt.f14186V.equals(m14554c.f13320g)) {
                            elementAt.f14247r = m14554c;
                        }
                    }
                }
            } catch (C3399wi unused) {
            }
        }
    }

    /* renamed from: a */
    private void m14546a(C3307ui c3307ui, C3531zj c3531zj) {
        String m15276b;
        if (c3531zj.f14499P == null) {
            c3531zj.f14499P = new HashMap<>();
        }
        C2555hj c2555hj = new C2555hj();
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            try {
                C3128qi m15816b = c3307ui.m15816b(i);
                int m15101b = m15816b.m15101b();
                if (m15101b == 14) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b2)) {
                        c2555hj.m12234f(m15276b2);
                    }
                } else if (m15101b == 7) {
                    if (m15816b.m15103d().elementAt(0).m15278d() != 0) {
                        m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15816b.m15103d().elementAt(0).m15277c() == 133) {
                        m15276b = "Menulist:";
                    }
                    c2555hj.m12226b(m15276b);
                } else if (m15101b == 63) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b3 != null) {
                        c2555hj.m12230d(m15276b3);
                    }
                } else if (m15101b == 106) {
                    String m15276b4 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b4)) {
                        c2555hj.m12228c(m15276b4);
                    }
                } else if (m15101b == 12) {
                    String m15276b5 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b5)) {
                        c2555hj.m12232e(m15276b5);
                    }
                } else if (m15101b == 117) {
                    String m15276b6 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b6)) {
                        c2555hj.m12224a(m15276b6);
                    }
                }
            } catch (C3399wi e) {
                e.printStackTrace();
                return;
            }
        }
        c3531zj.f14499P.put(c2555hj.m12233f(), c2555hj);
    }

    /* renamed from: a */
    private void m14547a(C3307ui c3307ui, C3531zj c3531zj, C3489yj c3489yj, C0696e c0696e) {
        String str = null;
        String str2 = null;
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 14) {
                    str = m15816b.m15103d().elementAt(0).m15276b();
                } else if (m15101b == 20) {
                    str2 = m15816b.m15103d().elementAt(0).m15276b();
                }
                if (str != null && str2 != null) {
                    if (c3531zj != null) {
                        if (c3531zj.f14519r == null) {
                            c3531zj.f14519r = new HashMap<>();
                        }
                        c3531zj.f14519r.put(str, str2);
                    }
                    C0023aj.m160a(this.f12481a.m16332i()).m202h(str, str2);
                }
            } catch (C3399wi unused) {
            }
        }
    }

    /* renamed from: a */
    private void m14548a(C3307ui c3307ui, C3531zj c3531zj, C3489yj c3489yj, C0744u c0744u) {
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            if (m15821d.m15824f() == 1) {
                c3489yj.f14235n = m15821d.m15826h();
            } else {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() == 1) {
                    if (m15828j == 33) {
                        m14547a(m15821d, (C3531zj) null, c3489yj, (C0696e) null);
                    } else if (m15828j == 41) {
                        m14543a(m15821d, c3489yj);
                    } else if (m15828j == 55) {
                        m14564e(m15821d, c3489yj);
                    } else if (m15828j == 57) {
                        m14551b(m15821d, c3489yj);
                    } else if (m15828j == 56) {
                        m14556c(m15821d, c3489yj);
                    }
                } else if (m15828j == 31) {
                    for (int i2 = 0; i2 < m15821d.m15822e(); i2++) {
                        C3128qi m15816b = m15821d.m15816b(i2);
                        int m15101b = m15816b.m15101b();
                        int i3 = -16777216;
                        if (m15101b == 28) {
                            try {
                                int parseInt = Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                                if (parseInt != 0) {
                                    i3 = parseInt;
                                }
                                c0744u.m6059b(i3);
                            } catch (Exception unused) {
                                c0744u.m6061b(false);
                            }
                        } else if (m15101b == 36) {
                            try {
                                int parseInt2 = Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                                if (parseInt2 != 0) {
                                    i3 = parseInt2;
                                }
                                c0744u.m6054a(i3);
                            } catch (Exception unused2) {
                                c0744u.m6056a(false);
                            }
                        } else if (m15101b == 31) {
                            try {
                                c0744u.m6063c(Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b()));
                            } catch (Exception unused3) {
                                c0744u.m6063c(-1);
                            }
                        } else {
                            if (m15101b == 87) {
                                try {
                                    String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                                    if (!TextUtils.isEmpty(m15276b)) {
                                        m15276b = m15276b.trim();
                                        if (m15276b.contains("\\.")) {
                                            m15276b = m15276b.replace("\\.", ".");
                                        }
                                    }
                                    c0744u.m6060b(m15276b);
                                } catch (Exception unused4) {
                                }
                            } else if (m15101b == 30) {
                                try {
                                    c0744u.m6065d(Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b()));
                                } catch (Exception unused5) {
                                    c0744u.m6065d(-1);
                                }
                            } else if (m15101b == 98) {
                                String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                                if (!TextUtils.isEmpty(m15276b2)) {
                                    if (m15276b2.contains("px") || m15276b2.contains("PX")) {
                                        m15276b2 = m15276b2.substring(0, m15276b2.length() - 2);
                                    }
                                    try {
                                        c0744u.m6053a(C0755x1.m6112a(Float.parseFloat(m15276b2)));
                                    } catch (Exception unused6) {
                                        c0744u.m6053a(-1.0f);
                                    }
                                }
                            } else if (m15101b == 101) {
                                String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                                if (!TextUtils.isEmpty(m15276b3)) {
                                    if (m15276b3.contains("px") || m15276b3.contains("PX")) {
                                        m15276b3 = m15276b3.substring(0, m15276b3.length() - 2);
                                    }
                                    try {
                                        c0744u.m6058b(Float.parseFloat(m15276b3));
                                    } catch (Exception unused7) {
                                        c0744u.m6058b(-1.0f);
                                    }
                                }
                            }
                        }
                    }
                } else if (m15828j == 12) {
                    m14570g(m15821d, c3489yj);
                } else if (m15828j == 22) {
                    String m14533a = m14533a(m15821d);
                    if (m14533a != null && m14533a.equals("T")) {
                        c3489yj.f14190X = true;
                    }
                } else if (m15828j == 33) {
                    String m14533a2 = m14533a(m15821d);
                    if (m14533a2 != null && m14533a2.equals("T")) {
                        c3489yj.f14192Y = true;
                    }
                } else if (m15828j == 5) {
                    c3489yj.f14174P.add(m14566f(m15821d, c3489yj));
                } else {
                    if (m15828j == 19) {
                        String m14533a3 = m14533a(m15821d);
                        if (m14533a3 != null && m14533a3.equals("F")) {
                            c3489yj.f14168M = false;
                        } else if (m14533a3 == null || !m14533a3.equals("T")) {
                            try {
                                m14545a(m15821d, c3489yj, c3531zj);
                            } catch (C3399wi unused8) {
                            }
                        } else {
                            c3489yj.f14168M = true;
                        }
                    } else if (m15828j == 21) {
                        String m14533a4 = m14533a(m15821d);
                        if (m14533a4 != null && m14533a4.equals("F")) {
                            c3489yj.f14182T = false;
                        }
                    } else if (m15828j == 23) {
                        m14574i(m15821d, c3489yj);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private C3489yj m14549b(C3307ui c3307ui) {
        int m15101b;
        C0744u c0744u = new C0744u(this.f12482b, C0687b.m5342a(this.f12481a.m16332i()).m5343a().m5544a());
        C3489yj c3489yj = new C3489yj(C0687b.m5342a(this.f12481a.m16332i()).m5343a().m5544a());
        c3489yj.f14208e = 24;
        boolean z = false;
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                m15101b = m15816b.m15101b();
            } catch (C3399wi unused) {
            }
            if (m15101b == 28) {
                try {
                    int parseInt = Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                    if (parseInt == 0) {
                        parseInt = -16777216;
                    }
                    c0744u.m6059b(parseInt);
                } catch (Exception unused2) {
                    c0744u.m6061b(false);
                }
                z = true;
            } else if (m15101b == 31) {
                try {
                    c0744u.m6063c(Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b()));
                } catch (Exception unused3) {
                    c0744u.m6063c(-1);
                }
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        c3489yj.f14241p = c0744u;
        return c3489yj;
    }

    /* renamed from: b */
    private C3531zj m14550b(C3307ui c3307ui, C2945mj c2945mj) {
        if (f12480d == 0) {
            C2899lj c2899lj = new C2899lj(this.f12482b);
            c2945mj.m14120a(c2899lj);
            c2945mj.m14134c(c2899lj);
            f12480d++;
        }
        return m14581p(c3307ui, c2945mj);
    }

    /* renamed from: b */
    private void m14551b(C3307ui c3307ui, C3489yj c3489yj) {
        C2475fj c2475fj = new C2475fj();
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 33) {
                    String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b)) {
                        c2475fj.m11776b(m15276b);
                    }
                } else if (m15101b == 28) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b2)) {
                        c2475fj.m11784e(C0755x1.m6113a(Integer.parseInt(m15276b2)));
                    }
                } else if (m15101b == 36) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b3)) {
                        c2475fj.m11769a(C0755x1.m6113a(Integer.parseInt(m15276b3)));
                    }
                } else if (m15101b == 80) {
                    String m15276b4 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b4)) {
                        if (m15276b4.indexOf(".") != -1) {
                            m15276b4 = m15276b4.substring(0, m15276b4.indexOf("."));
                        }
                        c2475fj.m11770a(m15276b4);
                    }
                } else if (m15101b == 72) {
                    String m15276b5 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b5)) {
                        String[] split = m15276b5.trim().split(" ");
                        if (!TextUtils.isEmpty(split[0])) {
                            try {
                                c2475fj.m11782d(Integer.parseInt(split[0].split(",")[0]));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[1])) {
                            try {
                                c2475fj.m11779c(Integer.parseInt(split[1].split(",")[0]));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[2])) {
                            try {
                                c2475fj.m11775b(C0755x1.m6113a(Integer.parseInt(split[2].split(",")[0])));
                            } catch (NumberFormatException unused3) {
                            }
                        }
                        c2475fj.m11771a(true);
                    }
                }
            } catch (NumberFormatException | C3399wi unused4) {
            }
        }
        c3489yj.f14231l1 = c2475fj;
    }

    /* renamed from: b */
    private void m14552b(C3307ui c3307ui, C3531zj c3531zj) {
        String m14534a;
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                if (m15821d.m15828j() == 43 && (m14534a = m14534a(m15821d, 28)) != null) {
                    int parseInt = Integer.parseInt(m14534a);
                    if (parseInt == 0) {
                        parseInt = -16777216;
                    }
                    C0696e c0696e = new C0696e();
                    c0696e.m5411a(parseInt);
                    c3531zj.f14511j = c0696e;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private void m14553b(C3307ui c3307ui, C3531zj c3531zj, C2945mj c2945mj) {
        String m15276b;
        C3087pj c3087pj = new C3087pj();
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            try {
                C3128qi m15816b = c3307ui.m15816b(i);
                int m15101b = m15816b.m15101b();
                if (m15101b == 14) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b2)) {
                        c3087pj.m14788f(m15276b2);
                    }
                } else if (m15101b == 33) {
                    c3087pj.m14784d(m15816b.m15103d().elementAt(0).m15276b());
                    if (!TextUtils.isEmpty(c3087pj.m14783d())) {
                        byte[] m190d = C0023aj.m160a(this.f12481a.m16332i()).m190d(c3087pj.m14783d(), "public");
                        if (m190d == null) {
                            m190d = C0023aj.m160a(this.f12481a.m16332i()).m190d(c3087pj.m14783d(), "private");
                        }
                        if (m190d == null) {
                            c2945mj.m14139e().m13879a(8, c3087pj.m14783d());
                        } else {
                            c3087pj.m14778a(m190d);
                        }
                    }
                } else if (m15101b == 7) {
                    if (m15816b.m15103d().elementAt(0).m15278d() != 0) {
                        m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15816b.m15103d().elementAt(0).m15277c() == 133) {
                        m15276b = "Menulist:";
                    }
                    c3087pj.m14777a(m15276b);
                } else if (m15101b == 12) {
                    String trim = m15816b.m15103d().elementAt(0).m15276b().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        c3087pj.m14786e(trim);
                    }
                } else if (m15101b == 81) {
                    String trim2 = m15816b.m15103d().elementAt(0).m15276b().trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        c3087pj.m14790g(trim2.trim());
                    }
                } else if (m15101b == 63) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b3 != null) {
                        c3087pj.m14782c(m15276b3);
                    }
                } else if (m15101b == 106) {
                    String m15276b4 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b4)) {
                        c3087pj.m14780b(m15276b4);
                    }
                } else if (m15101b == 117) {
                    String m15276b5 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b5)) {
                        c3087pj.m14792h(m15276b5);
                    }
                }
            } catch (C3399wi e) {
                e.printStackTrace();
                return;
            }
        }
        for (int i2 = 0; i2 < c3307ui.m15827i(); i2++) {
            if (c3307ui.m15821d(i2).m15828j() == 31) {
                C0744u c0744u = new C0744u(this.f12482b, C0687b.m5342a(this.f12481a.m16332i()).m5343a().m5544a());
                for (int i3 = 0; i3 < c3307ui.m15822e(); i3++) {
                    C3128qi m15816b2 = c3307ui.m15816b(i3);
                    int m15101b2 = m15816b2.m15101b();
                    int i4 = -16777216;
                    if (m15101b2 == 28) {
                        try {
                            int parseInt = Integer.parseInt(m15816b2.m15103d().elementAt(0).m15276b());
                            if (parseInt != 0) {
                                i4 = parseInt;
                            }
                            c0744u.m6059b(i4);
                        } catch (Exception unused) {
                            c0744u.m6061b(false);
                        }
                    } else if (m15101b2 == 30) {
                        try {
                            c0744u.m6065d(Integer.parseInt(m15816b2.m15103d().elementAt(0).m15276b()));
                        } catch (Exception unused2) {
                            c0744u.m6065d(-1);
                        }
                    } else if (m15101b2 == 31) {
                        try {
                            c0744u.m6063c(Integer.parseInt(m15816b2.m15103d().elementAt(0).m15276b()));
                        } catch (Exception unused3) {
                            c0744u.m6063c(-1);
                        }
                    } else if (m15101b2 == 36) {
                        try {
                            int parseInt2 = Integer.parseInt(m15816b2.m15103d().elementAt(0).m15276b());
                            if (parseInt2 != 0) {
                                i4 = parseInt2;
                            }
                            c0744u.m6054a(i4);
                        } catch (Exception unused4) {
                            c0744u.m6056a(false);
                        }
                    } else if (m15101b2 == 98) {
                        String m15276b6 = m15816b2.m15103d().elementAt(0).m15276b();
                        if (!TextUtils.isEmpty(m15276b6)) {
                            if (m15276b6.contains("px") || m15276b6.contains("PX")) {
                                m15276b6 = m15276b6.substring(0, m15276b6.length() - 2);
                            }
                            try {
                                c0744u.m6053a(C0755x1.m6112a(Float.parseFloat(m15276b6)));
                            } catch (Exception unused5) {
                                c0744u.m6053a(-1.0f);
                            }
                        }
                    } else {
                        if (m15101b2 == 101) {
                            String m15276b7 = m15816b2.m15103d().elementAt(0).m15276b();
                            if (!TextUtils.isEmpty(m15276b7)) {
                                if (m15276b7.contains("px") || m15276b7.contains("PX")) {
                                    m15276b7 = m15276b7.substring(0, m15276b7.length() - 2);
                                }
                                try {
                                    c0744u.m6058b(Float.parseFloat(m15276b7));
                                } catch (Exception unused6) {
                                    c0744u.m6058b(-1.0f);
                                }
                            }
                        }
                    }
                    e.printStackTrace();
                    return;
                }
                c3087pj.m14776a(c0744u);
            }
        }
        c3531zj.f14497N = c3087pj;
    }

    /* renamed from: c */
    private C3264tj m14554c(C3307ui c3307ui) {
        C3264tj c3264tj = new C3264tj();
        String m14534a = m14534a(c3307ui, 24);
        if (m14534a != null) {
            c3264tj.f13319f = m14534a;
        }
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                if (m15821d.m15824f() == 1) {
                    c3264tj.f13320g = m15821d.m15826h();
                } else if (m15821d.m15828j() == 20) {
                    for (int i2 = 0; i2 < m15821d.m15822e(); i2++) {
                        C3128qi m15816b = m15821d.m15816b(i2);
                        int m15101b = m15816b.m15101b();
                        if (m15101b == 14) {
                            c3264tj.f13314a = Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                        } else if (m15101b == 20) {
                            Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                        } else if (m15101b == 27) {
                            c3264tj.f13318e = Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                        } else if (m15101b == 21) {
                            c3264tj.f13316c = m15816b.m15103d().elementAt(0).m15276b();
                        } else if (m15101b == 22) {
                            c3264tj.f13315b = Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                        }
                    }
                    c3264tj.f13321h = m14533a(m15821d);
                }
            } catch (C3399wi unused) {
            }
        }
        return c3264tj;
    }

    /* renamed from: c */
    private void m14555c(C3307ui c3307ui, C2945mj c2945mj) {
        String m14534a = m14534a(c3307ui, 33);
        if (m14534a != null) {
            this.f12481a.m16282a(m14534a, c2945mj.m14139e());
        }
    }

    /* renamed from: c */
    private void m14556c(C3307ui c3307ui, C3489yj c3489yj) {
        C2515gj c2515gj = new C2515gj();
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 24) {
                    String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b)) {
                        c2515gj.m12010a(m15276b);
                    }
                } else if (m15101b == 33) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b2)) {
                        c2515gj.m12020c(m15276b2);
                    }
                } else if (m15101b == 28) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b3)) {
                        c2515gj.m12024e(C0755x1.m6113a(Integer.parseInt(m15276b3)));
                    }
                } else if (m15101b == 36) {
                    String m15276b4 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b4)) {
                        c2515gj.m12009a(C0755x1.m6113a(Integer.parseInt(m15276b4)));
                    }
                } else if (m15101b == 80) {
                    String m15276b5 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b5)) {
                        if (m15276b5.indexOf(".") != -1) {
                            m15276b5 = m15276b5.substring(0, m15276b5.indexOf("."));
                        }
                        c2515gj.m12016b(m15276b5);
                    }
                } else if (m15101b == 72) {
                    String m15276b6 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b6)) {
                        String[] split = m15276b6.trim().split(" ");
                        if (!TextUtils.isEmpty(split[0])) {
                            try {
                                c2515gj.m12022d(Integer.parseInt(split[0].split(",")[0]));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[1])) {
                            try {
                                c2515gj.m12019c(Integer.parseInt(split[1].split(",")[0]));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[2])) {
                            try {
                                c2515gj.m12015b(C0755x1.m6113a(Integer.parseInt(split[2].split(",")[0])));
                            } catch (NumberFormatException unused3) {
                            }
                        }
                        c2515gj.m12011a(true);
                    }
                }
            } catch (NumberFormatException | C3399wi unused4) {
            }
        }
        c3489yj.f14234m1 = c2515gj;
    }

    /* renamed from: c */
    private void m14557c(C3307ui c3307ui, C3531zj c3531zj) {
        int m5619X;
        C3129qj c3129qj = new C3129qj(this.f12482b, C0687b.m5342a(this.f12481a.m16332i()).m5343a().m5544a());
        String m14534a = m14534a(c3307ui, 13);
        c3129qj.m15117d(m14534a != null ? m14534a.trim() : C0713j1.m5563a(this.f12482b).m5652d0());
        if (c3129qj.m15125l().equals("B")) {
            String m14534a2 = m14534a(c3307ui, 40);
            if (m14534a2 == null) {
                m14534a2 = C0713j1.m5563a(this.f12482b).m5646c0();
            }
            c3129qj.m15114c(m14534a2);
            String m14534a3 = m14534a(c3307ui, 29);
            c3129qj.m15107a(m14534a3 != null ? m14534a3.trim() : C0713j1.m5563a(this.f12482b).m5615T());
        }
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                if (m15821d.m15828j() == 31) {
                    String m14534a4 = m14534a(m15821d, 36);
                    int i2 = -16777216;
                    if (m14534a4 != null) {
                        m5619X = Integer.parseInt(m14534a4.trim());
                        if (m5619X == 0) {
                            m5619X = -16777216;
                        }
                    } else {
                        m5619X = C0713j1.m5563a(this.f12482b).m5619X();
                    }
                    c3129qj.m15110b(m5619X);
                    String m14534a5 = m14534a(m15821d, 28);
                    if (m14534a5 != null) {
                        int parseInt = Integer.parseInt(m14534a5.trim());
                        if (parseInt != 0) {
                            i2 = parseInt;
                        }
                        c3129qj.m15110b(i2);
                    } else {
                        c3129qj.m15110b(C0713j1.m5563a(this.f12482b).m5620Y());
                    }
                    String m14534a6 = m14534a(m15821d, 31);
                    c3129qj.m15113c(m14534a6 != null ? Integer.parseInt(m14534a6.trim()) : C0713j1.m5563a(this.f12482b).m5621Z());
                    String m14534a7 = m14534a(m15821d, 98);
                    if (!TextUtils.isEmpty(m14534a7)) {
                        if (m14534a7.contains("px") || m14534a7.contains("PX")) {
                            m14534a7 = m14534a7.substring(0, m14534a7.length() - 2);
                        }
                        try {
                            c3129qj.m15105a(C0755x1.m6112a(Float.parseFloat(m14534a7)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String m14534a8 = m14534a(m15821d, 101);
                    if (!TextUtils.isEmpty(m14534a8)) {
                        if (m14534a8.contains("px") || m14534a8.contains("PX")) {
                            m14534a8 = m14534a8.substring(0, m14534a8.length() - 2);
                        }
                        try {
                            c3129qj.m15109b(Float.parseFloat(m14534a8));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (c3129qj.m15125l().equalsIgnoreCase("B")) {
                        String m14534a9 = m14534a(m15821d, 30);
                        c3129qj.m15116d(m14534a9 != null ? Integer.parseInt(m14534a9.trim()) : C0713j1.m5563a(this.f12482b).m5631a0());
                    }
                }
            } catch (Exception unused) {
            }
        }
        c3531zj.f14496M = c3129qj;
    }

    /* renamed from: d */
    private void m14558d(C3307ui c3307ui, C2945mj c2945mj) {
        try {
            String m14534a = m14534a(c3307ui, 33);
            if (!TextUtils.isEmpty(m14534a) && !this.f12481a.m16319c(m14534a)) {
                c2945mj.m14139e().m13879a(7, m14534a);
            }
            String m14534a2 = m14534a(c3307ui, 28);
            if (m14534a2 != null) {
                int parseInt = Integer.parseInt(m14534a2);
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                if (this.f12481a.m16347x()) {
                    C0713j1.m5563a(this.f12481a.m16332i()).m5656e(parseInt);
                } else {
                    this.f12481a.m16269a(parseInt);
                }
            }
            String m14534a3 = m14534a(c3307ui, 80);
            if (TextUtils.isEmpty(m14534a3)) {
                return;
            }
            if (m14534a3.indexOf(".") != -1) {
                m14534a3 = m14534a3.substring(0, m14534a3.indexOf("."));
            }
            this.f12481a.m16325e(m14534a3);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private void m14559d(C3307ui c3307ui, C3489yj c3489yj) {
        String m15276b;
        if (c3489yj.f14175P0 == null) {
            c3489yj.f14175P0 = new HashMap<>();
        }
        C2555hj c2555hj = new C2555hj();
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            try {
                C3128qi m15816b = c3307ui.m15816b(i);
                int m15101b = m15816b.m15101b();
                if (m15101b == 14) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b2)) {
                        c2555hj.m12234f(m15276b2);
                    }
                } else if (m15101b == 7) {
                    if (m15816b.m15103d().elementAt(0).m15278d() != 0) {
                        m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15816b.m15103d().elementAt(0).m15277c() == 133) {
                        m15276b = "Menulist:";
                    }
                    c2555hj.m12226b(m15276b);
                } else if (m15101b == 63) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b3 != null) {
                        c2555hj.m12230d(m15276b3);
                    }
                } else if (m15101b == 106) {
                    String m15276b4 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b4)) {
                        c2555hj.m12228c(m15276b4);
                    }
                } else if (m15101b == 12) {
                    String m15276b5 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b5)) {
                        c2555hj.m12232e(m15276b5);
                    }
                } else if (m15101b == 117) {
                    String m15276b6 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b6)) {
                        c2555hj.m12224a(m15276b6);
                    }
                }
            } catch (C3399wi e) {
                e.printStackTrace();
                return;
            }
        }
        c3489yj.f14175P0.put(c2555hj.m12233f(), c2555hj);
    }

    /* renamed from: d */
    private void m14560d(C3307ui c3307ui, C3531zj c3531zj) {
        String m15276b;
        String m15276b2;
        C0613a1 c0613a1 = new C0613a1();
        if (c3531zj.f14505d == null) {
            c3531zj.f14505d = new Vector<>();
        }
        c3531zj.f14505d.add(c0613a1);
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 23) {
                    c0613a1.f3520a = m15816b.m15103d().elementAt(0).m15276b();
                } else if (m15101b == 13) {
                    if (m15816b.m15103d().elementAt(0).m15278d() != 0) {
                        m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15816b.m15103d().elementAt(0).m15277c() == 144) {
                        m15276b2 = "image";
                    }
                    c0613a1.f3521b = m15276b2;
                } else if (m15101b == 14) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b3 != null) {
                        for (String str : m15276b3.split("[|]")) {
                            c0613a1.f3523d.add(str);
                        }
                    }
                } else if (m15101b == 7) {
                    String m15276b4 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b4 != null) {
                        c0613a1.f3522c = m15276b4;
                    }
                } else if (m15101b == 94 && (m15276b = m15816b.m15103d().elementAt(0).m15276b()) != null && (m15276b.equalsIgnoreCase("T") || m15276b.equalsIgnoreCase("true"))) {
                    c0613a1.f3524e = true;
                }
            } catch (C3399wi unused) {
            }
        }
    }

    /* renamed from: d */
    private boolean m14561d(C3307ui c3307ui) {
        try {
            int m15828j = c3307ui.m15828j();
            if (c3307ui.m16630a() != 1) {
                if (m15828j != 28) {
                    return false;
                }
                if (!this.f12483c) {
                    m14582q(c3307ui, null);
                }
                return true;
            }
            if (m15828j != 27) {
                return false;
            }
            String m14533a = m14533a(c3307ui);
            if (TextUtils.isEmpty(m14533a) || this.f12483c) {
                return false;
            }
            C0713j1.m5563a(this.f12481a.m16332i()).m5603K(m14533a);
            return false;
        } catch (C3399wi unused) {
            return false;
        }
    }

    /* renamed from: e */
    private void m14562e(C3307ui c3307ui) {
        if (c3307ui == null || m14561d(c3307ui)) {
            return;
        }
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            m14562e(c3307ui.m15821d(i));
        }
    }

    /* renamed from: e */
    private void m14563e(C3307ui c3307ui, C2945mj c2945mj) {
        try {
            int parseInt = Integer.parseInt(m14534a(c3307ui, 28));
            if (parseInt == 0) {
                parseInt = -16777216;
            }
            C0713j1.m5563a(this.f12481a.m16332i()).m5723s(parseInt);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private void m14564e(C3307ui c3307ui, C3489yj c3489yj) {
        C2597ij c2597ij = new C2597ij();
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 33) {
                    String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b)) {
                        c2597ij.m12466b(m15276b);
                    }
                } else if (m15101b == 28) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b2)) {
                        c2597ij.m12473e(C0755x1.m6113a(Integer.parseInt(m15276b2)));
                    }
                } else if (m15101b == 36) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b3)) {
                        c2597ij.m12459a(C0755x1.m6113a(Integer.parseInt(m15276b3)));
                    }
                } else if (m15101b == 80) {
                    String m15276b4 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b4)) {
                        if (m15276b4.indexOf(".") != -1) {
                            m15276b4 = m15276b4.substring(0, m15276b4.indexOf("."));
                        }
                        c2597ij.m12460a(m15276b4);
                    }
                } else if (m15101b == 72) {
                    String m15276b5 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b5)) {
                        String[] split = m15276b5.trim().split(" ");
                        if (!TextUtils.isEmpty(split[0])) {
                            try {
                                c2597ij.m12471d(Integer.parseInt(split[0].split(",")[0]));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[1])) {
                            try {
                                c2597ij.m12469c(Integer.parseInt(split[1].split(",")[0]));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        if (!TextUtils.isEmpty(split[2])) {
                            try {
                                c2597ij.m12465b(C0755x1.m6113a(Integer.parseInt(split[2].split(",")[0])));
                            } catch (NumberFormatException unused3) {
                            }
                        }
                        c2597ij.m12461a(true);
                    }
                }
            } catch (NumberFormatException | C3399wi unused4) {
            }
        }
        c3489yj.f14228k1 = c2597ij;
    }

    /* renamed from: e */
    private void m14565e(C3307ui c3307ui, C3531zj c3531zj) {
        String m15276b;
        c3531zj.f14504c = new C0643k1(this.f12482b, c3531zj);
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 41) {
                    c3531zj.f14504c.f3923a = false;
                } else if (m15101b == 7) {
                    c3531zj.f14504c.f3928f = m15816b.m15103d().elementAt(0).m15276b();
                } else if (m15101b == 20) {
                    c3531zj.f14504c.f3927e = Long.parseLong(m15816b.m15103d().elementAt(0).m15276b());
                } else if (m15101b == 13) {
                    if (m15816b.m15103d().elementAt(0).m15278d() != 0 && (m15276b = m15816b.m15103d().elementAt(0).m15276b()) != null) {
                        if (m15276b.equals("oncache")) {
                            c3531zj.f14504c.f3924b = true;
                        } else if (m15276b.equals("onserver")) {
                            c3531zj.f14504c.f3925c = true;
                        } else if (m15276b.equals("onload")) {
                            c3531zj.f14504c.f3926d = true;
                        }
                    }
                } else if (m15101b == 106) {
                    String trim = m15816b.m15103d().elementAt(0).m15276b().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        c3531zj.f14504c.f3939q = trim;
                    }
                } else if (m15101b == 117) {
                    String trim2 = m15816b.m15103d().elementAt(0).m15276b().trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        c3531zj.f14504c.f3940r = trim2;
                    }
                }
            } catch (C3399wi | Exception unused) {
            }
        }
    }

    /* renamed from: f */
    private C2862kj m14566f(C3307ui c3307ui, C3489yj c3489yj) {
        String m15276b;
        C2862kj c2862kj = new C2862kj(c3489yj);
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 20) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b2 != null) {
                        c2862kj.f11757b = m15276b2;
                    }
                } else if (m15101b == 7) {
                    if (m15816b.m15103d().elementAt(0).m15278d() != 0) {
                        m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15816b.m15103d().elementAt(0).m15277c() == 133) {
                        m15276b = "Menulist:";
                    }
                    c2862kj.f11758c = m15276b;
                }
            } catch (Exception unused) {
            }
        }
        String m14533a = m14533a(c3307ui);
        if (m14533a != null) {
            c2862kj.f11756a = m14533a;
        }
        return c2862kj;
    }

    /* renamed from: f */
    private void m14567f(C3307ui c3307ui, C2945mj c2945mj) {
    }

    /* renamed from: f */
    private void m14568f(C3307ui c3307ui, C3531zj c3531zj) {
        if (c3531zj.f14500Q == null) {
            c3531zj.f14500Q = new HashMap<>();
        }
        C0024ak c0024ak = new C0024ak();
        String str = null;
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 14) {
                    str = m15816b.m15103d().elementAt(0).m15276b();
                    c0024ak.m214b(str);
                } else if (m15101b == 20) {
                    c0024ak.m215c(m15816b.m15103d().elementAt(0).m15276b());
                } else if (m15101b == 106) {
                    c0024ak.m212a(m15816b.m15103d().elementAt(0).m15276b());
                }
            } catch (C3399wi unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c3531zj.f14500Q.put(str, c0024ak);
    }

    /* renamed from: g */
    private void m14569g(C3307ui c3307ui, C2945mj c2945mj) {
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() != 1 && m15828j != 56 && m15828j != 55) {
                    if (m15828j == 54) {
                        int m5748z = C0713j1.m5563a(this.f12481a.m16332i()).m5748z();
                        String m14533a = m14533a(m15821d);
                        if (m14533a != null) {
                            try {
                                int parseInt = Integer.parseInt(m14533a);
                                m5748z = parseInt == 0 ? -16777216 : parseInt;
                            } catch (Exception unused) {
                            }
                            C0713j1.m5563a(this.f12481a.m16332i()).m5739w(m5748z);
                        }
                    } else if (m15828j == 58) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: g */
    private void m14570g(C3307ui c3307ui, C3489yj c3489yj) {
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            try {
                int m15101b = m15816b.m15101b();
                if (m15101b == 33) {
                    String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b != null) {
                        c3489yj.f14170N = m15276b;
                    }
                } else if (m15101b == 16) {
                    String m14533a = m14533a(c3307ui);
                    if (!TextUtils.isEmpty(m14533a)) {
                        c3489yj.f14254t0 = C0690c.m5377b(m14533a.getBytes());
                    }
                } else if (m15101b == 38) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b2 != null) {
                        if (c3489yj.f14208e == 2) {
                            c3489yj.f14227k0 = m15276b2;
                        } else {
                            c3489yj.f14233m0 = m15276b2;
                        }
                    }
                } else if (m15101b == 39) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b3 != null) {
                        if (c3489yj.f14208e == 2) {
                            c3489yj.f14230l0 = m15276b3;
                        } else {
                            c3489yj.f14236n0 = m15276b3;
                        }
                    }
                } else if (m15101b == 80) {
                    String m15276b4 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b4)) {
                        if (m15276b4.indexOf(".") != -1) {
                            m15276b4 = m15276b4.substring(0, m15276b4.indexOf("."));
                        }
                        c3489yj.f14242p0 = m15276b4;
                    }
                } else if (m15101b == 94) {
                    String m15276b5 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b5) && (m15276b5.equalsIgnoreCase("T") || m15276b5.equalsIgnoreCase("true"))) {
                        c3489yj.f14225j1 = true;
                    }
                }
            } catch (C3399wi unused) {
            }
        }
        if (TextUtils.isEmpty(c3489yj.f14242p0) || !c3489yj.f14201b1 || C0687b.m5342a(this.f12482b).m5343a().m5557i().equalsIgnoreCase("en")) {
            return;
        }
        c3489yj.f14242p0 += "_" + C0687b.m5342a(this.f12482b).m5343a().m5557i();
    }

    /* renamed from: h */
    private void m14571h(C3307ui c3307ui, C2945mj c2945mj) {
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() == 1) {
                    if (m15828j == 37) {
                        m14578m(m15821d, c2945mj);
                    } else if (m15828j == 19) {
                        m14567f(m15821d, c2945mj);
                    }
                } else if (m15828j == 17) {
                    String m14534a = m14534a(m15821d, 33);
                    if (m14534a != null) {
                        this.f12481a.m16282a(m14534a, c2945mj.m14139e());
                    }
                } else if (m15828j == 46) {
                    m14563e(m15821d, c2945mj);
                } else if (m15828j == 52) {
                    m14569g(m15821d, c2945mj);
                } else if (m15828j == 23) {
                    m14583r(m15821d, c2945mj);
                } else if (m15828j == 51) {
                    m14580o(m15821d, c2945mj);
                }
            } catch (C3399wi unused) {
            }
        }
    }

    /* renamed from: h */
    private void m14572h(C3307ui c3307ui, C3489yj c3489yj) {
        int m15101b;
        int i;
        C0744u c0744u = new C0744u(this.f12482b, C0687b.m5342a(this.f12481a.m16332i()).m5343a().m5544a());
        for (int i2 = 0; i2 < c3307ui.m15822e(); i2++) {
            C3128qi m15816b = c3307ui.m15816b(i2);
            try {
                m15101b = m15816b.m15101b();
                i = -16777216;
            } catch (C3399wi | Exception unused) {
            }
            if (m15101b == 28) {
                try {
                    int parseInt = Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                    if (parseInt != 0) {
                        i = parseInt;
                    }
                    c0744u.m6059b(i);
                } catch (Exception unused2) {
                    c0744u.m6061b(false);
                }
            } else if (m15101b == 30) {
                try {
                    c0744u.m6065d(Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b()));
                } catch (Exception unused3) {
                    c0744u.m6065d(-1);
                }
            } else {
                if (m15101b == 87) {
                    String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b)) {
                        String trim = m15276b.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        c0744u.m6060b(trim);
                    }
                } else if (m15101b == 31) {
                    try {
                        c0744u.m6063c(Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b()));
                    } catch (Exception unused4) {
                        c0744u.m6063c(-1);
                    }
                } else if (m15101b == 36) {
                    try {
                        int parseInt2 = Integer.parseInt(m15816b.m15103d().elementAt(0).m15276b());
                        if (parseInt2 != 0) {
                            i = parseInt2;
                        }
                        c0744u.m6054a(i);
                    } catch (Exception unused5) {
                        c0744u.m6056a(false);
                    }
                } else if (m15101b == 98) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b2)) {
                        if (m15276b2.contains("px") || m15276b2.contains("PX")) {
                            m15276b2 = m15276b2.substring(0, m15276b2.length() - 2);
                        }
                        try {
                            c0744u.m6053a(C0755x1.m6112a(Float.parseFloat(m15276b2)));
                        } catch (Exception unused6) {
                            c0744u.m6053a(-1.0f);
                        }
                    }
                } else if (m15101b == 101) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b3)) {
                        if (m15276b3.contains("px") || m15276b3.contains("PX")) {
                            m15276b3 = m15276b3.substring(0, m15276b3.length() - 2);
                        }
                        try {
                            c0744u.m6058b(Float.parseFloat(m15276b3));
                        } catch (Exception unused7) {
                            c0744u.m6058b(-1.0f);
                        }
                    }
                }
            }
        }
        c3489yj.f14241p = c0744u;
    }

    /* renamed from: i */
    private void m14573i(C3307ui c3307ui, C2945mj c2945mj) {
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() != 1 && m15828j != 56 && m15828j != 55) {
                    if (m15828j == 54) {
                        int i2 = -7829368;
                        String m14533a = m14533a(m15821d);
                        if (m14533a != null) {
                            try {
                                int parseInt = Integer.parseInt(m14533a);
                                i2 = parseInt == 0 ? -16777216 : parseInt;
                            } catch (Exception unused) {
                            }
                            C0713j1.m5563a(this.f12481a.m16332i()).m5661f(i2);
                        }
                    } else if (m15828j == 58) {
                    }
                }
            } catch (C3399wi unused2) {
            }
        }
    }

    /* renamed from: i */
    private void m14574i(C3307ui c3307ui, C3489yj c3489yj) {
        int m5619X;
        String m5639b0;
        C3129qj c3129qj = new C3129qj(this.f12482b, C0687b.m5342a(this.f12481a.m16332i()).m5343a().m5544a());
        String m14534a = m14534a(c3307ui, 13);
        c3129qj.m15117d(m14534a != null ? m14534a.trim() : C0713j1.m5563a(this.f12482b).m5652d0());
        if (c3129qj.m15125l().equals("B")) {
            String m14534a2 = m14534a(c3307ui, 40);
            if (m14534a2 == null) {
                m14534a2 = C0713j1.m5563a(this.f12482b).m5646c0();
            }
            c3129qj.m15114c(m14534a2);
            String m14534a3 = m14534a(c3307ui, 29);
            c3129qj.m15107a(m14534a3 != null ? m14534a3.trim() : C0713j1.m5563a(this.f12482b).m5615T());
        }
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                if (m15821d.m15828j() == 31) {
                    String m14534a4 = m14534a(m15821d, 36);
                    int i2 = -16777216;
                    if (m14534a4 != null) {
                        m5619X = Integer.parseInt(m14534a4.trim());
                        if (m5619X == 0) {
                            m5619X = -16777216;
                        }
                    } else {
                        m5619X = C0713j1.m5563a(this.f12482b).m5619X();
                    }
                    c3129qj.m15110b(m5619X);
                    String m14534a5 = m14534a(m15821d, 28);
                    if (m14534a5 != null) {
                        int parseInt = Integer.parseInt(m14534a5.trim());
                        if (parseInt != 0) {
                            i2 = parseInt;
                        }
                        c3129qj.m15110b(i2);
                    } else {
                        c3129qj.m15110b(C0713j1.m5563a(this.f12482b).m5620Y());
                    }
                    String m14534a6 = m14534a(m15821d, 31);
                    c3129qj.m15113c(m14534a6 != null ? Integer.parseInt(m14534a6.trim()) : C0713j1.m5563a(this.f12482b).m5621Z());
                    String m14534a7 = m14534a(m15821d, 87);
                    if (TextUtils.isEmpty(m14534a7)) {
                        m5639b0 = C0713j1.m5563a(this.f12482b).m5639b0();
                    } else {
                        String trim = m14534a7.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        m5639b0 = trim.trim();
                    }
                    c3129qj.m15111b(m5639b0);
                    String m14534a8 = m14534a(m15821d, 98);
                    if (!TextUtils.isEmpty(m14534a8)) {
                        if (m14534a8.contains("px") || m14534a8.contains("PX")) {
                            m14534a8 = m14534a8.substring(0, m14534a8.length() - 2);
                        }
                        try {
                            c3129qj.m15105a(C0755x1.m6112a(Float.parseFloat(m14534a8)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String m14534a9 = m14534a(m15821d, 101);
                    if (!TextUtils.isEmpty(m14534a9)) {
                        if (m14534a9.contains("px") || m14534a9.contains("PX")) {
                            m14534a9 = m14534a9.substring(0, m14534a9.length() - 2);
                        }
                        try {
                            c3129qj.m15109b(Float.parseFloat(m14534a9));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (c3129qj.m15125l().equalsIgnoreCase("B")) {
                        String m14534a10 = m14534a(m15821d, 30);
                        c3129qj.m15116d(m14534a10 != null ? Integer.parseInt(m14534a10.trim()) : C0713j1.m5563a(this.f12482b).m5631a0());
                    }
                }
            } catch (Exception unused) {
            }
        }
        c3489yj.f14244q = c3129qj;
    }

    /* renamed from: j */
    private void m14575j(C3307ui c3307ui, C2945mj c2945mj) {
        int i;
        String m14534a = m14534a(c3307ui, 36);
        if (m14534a != null) {
            try {
                int parseInt = Integer.parseInt(m14534a);
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                C0713j1.m5563a(this.f12481a.m16332i()).m5625a(parseInt);
            } catch (Exception unused) {
            }
        } else {
            C0713j1.m5563a(this.f12481a.m16332i()).m5625a(0);
        }
        for (int i2 = 0; i2 < c3307ui.m15827i(); i2++) {
            C3307ui m15821d = c3307ui.m15821d(i2);
            try {
                if (m15821d.m15828j() == 31) {
                    String m14534a2 = m14534a(m15821d, 28);
                    if (m14534a2 != null) {
                        try {
                            i = Integer.parseInt(m14534a2);
                            if (i == 0) {
                                i = -16777216;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                        }
                        C0713j1.m5563a(this.f12481a.m16332i()).m5635b(i);
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5635b(0);
                    }
                    String m14534a3 = m14534a(m15821d, 87);
                    if (!TextUtils.isEmpty(m14534a3)) {
                        String trim = m14534a3.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        C0713j1.m5563a(this.f12481a.m16332i()).m5684j(trim);
                    }
                    String m14534a4 = m14534a(m15821d, 30);
                    if (m14534a4 != null) {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5650d(Integer.parseInt(m14534a4));
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5650d(0);
                    }
                    String m14534a5 = m14534a(m15821d, 31);
                    if (m14534a5 != null) {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5643c(Integer.parseInt(m14534a5));
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5643c(C2991nj.f12339a);
                    }
                    String m14534a6 = m14534a(m15821d, 98);
                    if (!TextUtils.isEmpty(m14534a6)) {
                        if (m14534a6.contains("px") || m14534a6.contains("PX")) {
                            m14534a6 = m14534a6.substring(0, m14534a6.length() - 2);
                        }
                        try {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5624a(C0755x1.m6112a(Float.parseFloat(m14534a6)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String m14534a7 = m14534a(m15821d, 101);
                    if (!TextUtils.isEmpty(m14534a7)) {
                        if (m14534a7.contains("px") || m14534a7.contains("PX")) {
                            m14534a7 = m14534a7.substring(0, m14534a7.length() - 2);
                        }
                        try {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5634b(Float.parseFloat(m14534a7));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    /* renamed from: k */
    private void m14576k(C3307ui c3307ui, C2945mj c2945mj) {
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() == 1) {
                    if (m15828j == 32) {
                        c2945mj.f12171x = "";
                    } else if (m15828j == 38) {
                        m14577l(m15821d, c2945mj);
                    }
                }
            } catch (C3399wi unused) {
            }
        }
    }

    /* renamed from: l */
    private void m14577l(C3307ui c3307ui, C2945mj c2945mj) {
        String m14533a = m14533a(c3307ui);
        if (m14533a == null) {
            m14533a = "";
        }
        c2945mj.f12170w = m14533a;
    }

    /* renamed from: m */
    private void m14578m(C3307ui c3307ui, C2945mj c2945mj) {
        int i;
        String m14534a = m14534a(c3307ui, 36);
        if (m14534a != null) {
            try {
                C0713j1.m5563a(this.f12481a.m16332i()).m5666g(Integer.parseInt(m14534a));
            } catch (Exception unused) {
            }
        } else {
            C0713j1.m5563a(this.f12481a.m16332i()).m5699m("false");
        }
        for (int i2 = 0; i2 < c3307ui.m15827i(); i2++) {
            C3307ui m15821d = c3307ui.m15821d(i2);
            try {
                if (m15821d.m15828j() == 31) {
                    String m14534a2 = m14534a(m15821d, 28);
                    if (m14534a2 != null) {
                        try {
                            i = Integer.parseInt(m14534a2);
                            if (i == 0) {
                                i = -16777216;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                        }
                        C0713j1.m5563a(this.f12481a.m16332i()).m5673h(i);
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5704n("false");
                    }
                    String m14534a3 = m14534a(m15821d, 87);
                    if (!TextUtils.isEmpty(m14534a3)) {
                        String trim = m14534a3.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        C0713j1.m5563a(this.f12481a.m16332i()).m5716q(trim);
                    }
                    String m14534a4 = m14534a(m15821d, 30);
                    if (m14534a4 != null) {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5683j(Integer.parseInt(m14534a4));
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5683j(-1);
                    }
                    String m14534a5 = m14534a(m15821d, 31);
                    if (m14534a5 != null) {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5678i(Integer.parseInt(m14534a5));
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5678i(-1);
                    }
                    String m14534a6 = m14534a(m15821d, 98);
                    if (!TextUtils.isEmpty(m14534a6)) {
                        if (m14534a6.contains("px") || m14534a6.contains("PX")) {
                            m14534a6 = m14534a6.substring(0, m14534a6.length() - 2);
                        }
                        try {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5642c(C0755x1.m6112a(Float.parseFloat(m14534a6)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String m14534a7 = m14534a(m15821d, 101);
                    if (!TextUtils.isEmpty(m14534a7)) {
                        if (m14534a7.contains("px") || m14534a7.contains("PX")) {
                            m14534a7 = m14534a7.substring(0, m14534a7.length() - 2);
                        }
                        try {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5649d(Float.parseFloat(m14534a7));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    /* renamed from: n */
    private void m14579n(C3307ui c3307ui, C2945mj c2945mj) {
        try {
            String m14534a = m14534a(c3307ui, 33);
            if (m14534a != null && !TextUtils.isEmpty(m14534a) && !c2945mj.m14135c(m14534a)) {
                c2945mj.m14139e().m13879a(3, m14534a);
            }
            String m14534a2 = m14534a(c3307ui, 80);
            if (TextUtils.isEmpty(m14534a2)) {
                return;
            }
            if (m14534a2.indexOf(".") != -1) {
                m14534a2 = m14534a2.substring(0, m14534a2.indexOf("."));
            }
            c2945mj.m14138d(m14534a2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0135 A[Catch: Exception -> 0x0172, TryCatch #4 {Exception -> 0x0172, blocks: (B:9:0x003b, B:11:0x0043, B:14:0x0062, B:16:0x006c, B:18:0x0076, B:19:0x007c, B:20:0x0089, B:22:0x0092, B:23:0x00b1, B:25:0x00b7, B:26:0x00d6, B:29:0x00e8, B:31:0x00ee, B:52:0x0114, B:53:0x011a, B:35:0x0129, B:37:0x0135, B:39:0x013b, B:46:0x015d, B:47:0x0163, B:49:0x0141, B:50:0x016b, B:54:0x00f4, B:55:0x0122, B:56:0x00c9, B:57:0x00a4, B:42:0x014b, B:34:0x00fe), top: B:8:0x003b, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016b A[Catch: Exception -> 0x0172, TRY_LEAVE, TryCatch #4 {Exception -> 0x0172, blocks: (B:9:0x003b, B:11:0x0043, B:14:0x0062, B:16:0x006c, B:18:0x0076, B:19:0x007c, B:20:0x0089, B:22:0x0092, B:23:0x00b1, B:25:0x00b7, B:26:0x00d6, B:29:0x00e8, B:31:0x00ee, B:52:0x0114, B:53:0x011a, B:35:0x0129, B:37:0x0135, B:39:0x013b, B:46:0x015d, B:47:0x0163, B:49:0x0141, B:50:0x016b, B:54:0x00f4, B:55:0x0122, B:56:0x00c9, B:57:0x00a4, B:42:0x014b, B:34:0x00fe), top: B:8:0x003b, inners: #2, #3 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m14580o(p000.C3307ui r10, p000.C2945mj r11) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3036oi.m14580o(ui, mj):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* renamed from: p */
    private C3531zj m14581p(C3307ui c3307ui, C2945mj c2945mj) {
        C2899lj c2899lj;
        String m14533a;
        int m15101b;
        int i;
        String trim;
        String str;
        int i2 = f12480d;
        if (1 == i2) {
            c2899lj = c2945mj.m14139e();
        } else if (1 < i2) {
            c2899lj = new C2899lj(this.f12482b);
            c2945mj.m14120a(c2899lj);
            c2945mj.m14134c(c2899lj);
        } else {
            c2899lj = null;
        }
        f12480d++;
        if (c2899lj == null) {
            c2899lj = new C2899lj(this.f12482b);
            c2945mj.m14120a(c2899lj);
            c2945mj.m14134c(c2899lj);
        }
        C2899lj c2899lj2 = c2899lj;
        C3531zj c3531zj = new C3531zj(this.f12482b);
        ?? r9 = 0;
        C0755x1.m6156a(false);
        c2899lj2.m13885a(c3531zj);
        if (this.f12481a.m16348y()) {
            c2899lj2.m13878a(this.f12481a.m16340q());
        }
        for (int i3 = 0; i3 < c3307ui.m15822e(); i3++) {
            C3128qi m15816b = c3307ui.m15816b(i3);
            try {
                m15101b = m15816b.m15101b();
            } catch (C3399wi e) {
                e.printStackTrace();
            }
            if (m15101b == 9) {
                str = "grid";
            } else if (m15101b == 10) {
                str = "list";
            } else {
                if (m15101b == 13) {
                    if (m15816b.m15103d().elementAt(0).m15278d() == 1) {
                        String m15276b = m15816b.m15103d().elementAt(0).m15276b();
                        c3531zj.f14514m = m15276b;
                        if (!TextUtils.isEmpty(m15276b)) {
                            str = c3531zj.f14514m.trim();
                        }
                    } else {
                        int m15277c = m15816b.m15103d().elementAt(0).m15277c();
                        if (m15277c == 146) {
                            str = "confirm";
                        } else if (m15277c == 145) {
                            str = "error";
                        } else if (m15277c == 140) {
                            str = "info";
                        }
                    }
                } else if (m15101b == 62) {
                    C0755x1.m6156a(true);
                } else if (m15101b == 55) {
                    c3531zj.f14521t = false;
                } else if (m15101b == 82) {
                    String m15276b2 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b2)) {
                        m15276b2 = m15276b2.trim();
                    }
                    try {
                        c3531zj.f14522u = Integer.parseInt(m15276b2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else if (m15101b == 17) {
                    c3531zj.f14509h = m15816b.m15103d().elementAt(0).m15276b();
                } else if (m15101b == 33) {
                    String m15276b3 = m15816b.m15103d().elementAt(0).m15276b();
                    c3531zj.f14515n = m15276b3;
                    if (!TextUtils.isEmpty(m15276b3)) {
                        byte[] m190d = C0023aj.m160a(this.f12481a.m16332i()).m190d(c3531zj.f14515n, "public");
                        if (m190d == null) {
                            m190d = C0023aj.m160a(this.f12481a.m16332i()).m190d(c3531zj.f14515n, "private");
                        }
                        if (m190d == null) {
                            c2945mj.m14139e().m13879a(8, c3531zj.f14515n);
                        } else {
                            c3531zj.f14516o = m190d;
                        }
                    }
                } else if (m15101b == 80) {
                    String m15276b4 = m15816b.m15103d().elementAt(0).m15276b();
                    if (!TextUtils.isEmpty(m15276b4)) {
                        if (m15276b4.indexOf(".") != -1) {
                            m15276b4 = m15276b4.substring(0, m15276b4.indexOf("."));
                        }
                        c3531zj.f14510i = m15276b4;
                    }
                } else if (m15101b == 29) {
                    c3531zj.f14502a = m15816b.m15103d().elementAt(0).m15276b();
                } else if (m15101b == 73) {
                    c3531zj.f14503b = m15816b.m15103d().elementAt(0).m15276b();
                } else if (m15101b == 38) {
                    String m15276b5 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b5 != null) {
                        c3531zj.f14523v = m15276b5;
                    }
                } else if (m15101b == 39) {
                    String m15276b6 = m15816b.m15103d().elementAt(0).m15276b();
                    if (m15276b6 != null) {
                        c3531zj.f14524w = m15276b6;
                    }
                } else if (m15101b == 99) {
                    m15816b.m15103d().elementAt(0).m15276b();
                } else if (m15101b == 71) {
                    String m15276b7 = m15816b.m15103d().elementAt(0).m15276b();
                    TextUtils.SimpleStringSplitter<String> simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
                    simpleStringSplitter.setString(m15276b7);
                    int i4 = 0;
                    for (String str2 : simpleStringSplitter) {
                        if (i4 == 0) {
                            c3531zj.f14526y = str2;
                        } else if (i4 == 1) {
                            c3531zj.f14527z = str2;
                        } else if (i4 == 2) {
                            c3531zj.f14484A = str2;
                        } else if (i4 == 3) {
                            c3531zj.f14525x = str2;
                        }
                        i4++;
                    }
                } else if (m15101b == 70) {
                    String m15276b8 = m15816b.m15103d().elementAt(0).m15276b();
                    TextUtils.SimpleStringSplitter<String> simpleStringSplitter2 = new TextUtils.SimpleStringSplitter(',');
                    simpleStringSplitter2.setString(m15276b8);
                    int i5 = 0;
                    for (String str3 : simpleStringSplitter2) {
                        if (i5 == 0) {
                            c3531zj.f14486C = str3;
                        } else if (i5 == 1) {
                            c3531zj.f14487D = str3;
                        } else if (i5 == 2) {
                            c3531zj.f14488E = str3;
                        } else if (i5 == 3) {
                            c3531zj.f14485B = str3;
                        }
                        i5++;
                    }
                } else if (m15101b == 7) {
                    if (m15816b.m15103d().elementAt(0).m15278d() != 0) {
                        c3531zj.f14490G = m15816b.m15103d().elementAt(0).m15276b();
                    } else if (m15816b.m15103d().elementAt(0).m15277c() == 133) {
                        c3531zj.f14490G = "Menulist:";
                    }
                } else if (m15101b == 12) {
                    c3531zj.f14492I = m15816b.m15103d().elementAt(0).m15276b();
                } else if (m15101b == 85) {
                    String trim2 = m15816b.m15103d().elementAt(0).m15276b().trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        if (trim2.startsWith("Menulist:")) {
                            trim2 = trim2.substring(9, trim2.length());
                        }
                        c3531zj.f14491H = trim2.trim();
                    }
                } else {
                    if (m15101b == 92) {
                        trim = m15816b.m15103d().elementAt(0).m15276b().trim();
                    } else if (m15101b == 93) {
                        trim = m15816b.m15103d().elementAt(0).m15276b().trim();
                    } else if (m15101b == 81) {
                        trim = m15816b.m15103d().elementAt(0).m15276b().trim();
                        if (!TextUtils.isEmpty(trim)) {
                        }
                    } else if (m15101b == 97) {
                        C2434ej c2434ej = new C2434ej(C0687b.m5342a(this.f12481a.m16332i()).m5343a().m5544a());
                        String trim3 = m15816b.m15103d().elementAt(0).m15276b().trim();
                        if (!TextUtils.isEmpty(trim3)) {
                            String[] split = trim3.split(",");
                            while (i < split.length) {
                                if (i == 0) {
                                    c2434ej.m11618b(split[i].trim());
                                } else if (i != 1) {
                                    if (i != 2) {
                                        i = i != 3 ? i + 1 : 0;
                                        c2434ej.m11616a(split[i].trim());
                                    }
                                    c2434ej.m11620c(split[i].trim());
                                    c2434ej.m11616a(split[i].trim());
                                }
                                c2434ej.m11622d(split[i].trim());
                                c2434ej.m11620c(split[i].trim());
                                c2434ej.m11616a(split[i].trim());
                            }
                            c3531zj.f14498O = c2434ej;
                        }
                    } else if (m15101b == 106) {
                        String trim4 = m15816b.m15103d().elementAt(0).m15276b().trim();
                        if (!TextUtils.isEmpty(trim4)) {
                            c3531zj.f14493J = trim4;
                        }
                    } else if (m15101b == 117) {
                        String trim5 = m15816b.m15103d().elementAt(0).m15276b().trim();
                        if (!TextUtils.isEmpty(trim5)) {
                            c3531zj.f14494K = trim5;
                        }
                    }
                    trim.trim();
                }
            }
            c3531zj.f14514m = str;
        }
        try {
            if (c3531zj.f14510i != null && this.f12482b.getResources().getIdentifier(c3531zj.f14510i, "drawable", this.f12482b.getPackageName()) > 0 && c3531zj.f14515n != null) {
                c2945mj.m14139e().m13890b(8, c3531zj.f14515n);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        int i6 = 0;
        while (i6 < c3307ui.m15827i()) {
            C3307ui m15821d = c3307ui.m15821d(i6);
            if (m15821d.m15824f() == 1) {
                c3531zj.f14508g = m15821d.m15826h();
            } else {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() == 1) {
                    if (m15828j == 34) {
                        m14565e(m15821d, c3531zj);
                    } else if (m15828j == 28) {
                        m14552b(m15821d, c3531zj);
                    } else if (m15828j == 31) {
                        C3489yj m14549b = m14549b(m15821d);
                        if (m14549b != null) {
                            c3531zj.m16937b(m14549b);
                        }
                    } else if (m15828j == 33) {
                        try {
                            m14547a(m15821d, c3531zj, (C3489yj) null, (C0696e) null);
                        } catch (C3399wi unused) {
                            i6++;
                            r9 = 0;
                        }
                    } else if (m15828j == 40) {
                        m14560d(m15821d, c3531zj);
                    } else if (m15828j == 48) {
                        m14568f(m15821d, c3531zj);
                    } else if (m15828j == 51) {
                        m14553b(m15821d, c3531zj, c2945mj);
                    } else if (m15828j == 50) {
                        m14546a(m15821d, c3531zj);
                    }
                } else if (m15828j == 22) {
                    m14541a(m15821d, c2945mj, c3531zj, true);
                } else if (m15828j == 10) {
                    this.f12481a.m16275a(new C0696e());
                    try {
                        m14538a(m15821d, c2899lj2, (C2945mj) null);
                        for (int i7 = 0; i7 < m15821d.m15827i(); i7++) {
                            C3307ui m15821d2 = m15821d.m15821d(i7);
                            if (m15821d2.m16630a() == 0 && m15821d2.m15828j() == 19 && (m14533a = m14533a(m15821d2)) != null && m14533a.equals("F")) {
                                this.f12481a.m16329g().f4723o = r9;
                            }
                        }
                    } catch (C3399wi unused2) {
                        i6++;
                        r9 = 0;
                    }
                } else if (m15828j == 13) {
                    C3489yj m14537a = m14537a(m15821d, c3531zj, c2945mj);
                    if (m15821d.m15827i() > 0) {
                        C3307ui m15821d3 = m15821d.m15821d(r9);
                        if (m15821d3.m15828j() == 13 || m15821d3.m15828j() == 31 || m15821d3.m15828j() == 50) {
                            m14536a(m15821d, m14537a, c3531zj, c2945mj);
                        }
                    }
                    if (m14537a.f14208e == 8) {
                        try {
                            c2899lj2.m13892b(m14537a);
                        } catch (C3399wi unused3) {
                        }
                    } else if (m14537a.f14208e == 31) {
                        c2899lj2.m13896c(m14537a);
                    } else if (m14537a.f14208e == 42) {
                        c2899lj2.m13884a(m14537a);
                    }
                    c3531zj.m16937b(m14537a);
                    i6++;
                    r9 = 0;
                } else {
                    if (m15828j == 19) {
                        try {
                            m14545a(m15821d, (C3489yj) null, c3531zj);
                        } catch (C3399wi unused4) {
                        }
                    } else if (m15828j == 43) {
                        m14540a(m15821d, c2945mj, c3531zj);
                    } else if (m15828j == 23) {
                        m14557c(m15821d, c3531zj);
                    }
                    i6++;
                    r9 = 0;
                }
            }
            i6++;
            r9 = 0;
        }
        if (C0755x1.m6177c()) {
            int i8 = c3531zj.f14522u;
            if (i8 == 1) {
                c3531zj.f14522u = 2;
            } else if (i8 == 2) {
                c3531zj.f14522u = 1;
            }
            HashMap<String, C2555hj> hashMap = c3531zj.f14499P;
            if (hashMap != null && hashMap.size() > 0) {
                C2555hj c2555hj = c3531zj.f14499P.get("leftswipe");
                c3531zj.f14499P.put("leftswipe", c3531zj.f14499P.get("rightswipe"));
                c3531zj.f14499P.put("rightswipe", c2555hj);
            }
        }
        if (c3531zj.f14497N == null && C0755x1.m6187e() && c3531zj.f14514m.equals("popup")) {
            C3087pj c3087pj = new C3087pj();
            c3087pj.m14788f("accessibility");
            c3087pj.m14790g(" ");
            c3531zj.f14497N = c3087pj;
        }
        return c3531zj;
    }

    /* renamed from: q */
    private void m14582q(C3307ui c3307ui, C2945mj c2945mj) {
        String m14534a = m14534a(c3307ui, 14);
        String m14533a = m14533a(c3307ui);
        if (m14533a == null) {
            m14533a = "";
        }
        if (m14534a == null || this.f12481a.m16336m() == null) {
            return;
        }
        this.f12481a.m16336m().put(m14534a, m14533a);
    }

    /* renamed from: r */
    private void m14583r(C3307ui c3307ui, C2945mj c2945mj) {
        String m14534a = m14534a(c3307ui, 36);
        if (m14534a != null) {
            try {
                int parseInt = Integer.parseInt(m14534a.trim());
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                C0713j1.m5563a(this.f12481a.m16332i()).m5723s(parseInt);
                if (this.f12481a.m16333j() != null) {
                    this.f12481a.m16333j().m15106a(parseInt);
                }
            } catch (Exception unused) {
            }
        }
        String m14534a2 = m14534a(c3307ui, 13);
        if (m14534a2 != null) {
            C0713j1.m5563a(this.f12481a.m16332i()).m5579C(m14534a2.trim());
            if (this.f12481a.m16333j() != null) {
                this.f12481a.m16333j().m15117d(m14534a2.trim());
            }
        } else {
            C0713j1.m5563a(this.f12481a.m16332i()).m5579C("B");
        }
        String m14534a3 = m14534a(c3307ui, 40);
        if (m14534a3 != null) {
            String m5641c = C0713j1.m5563a(this.f12481a.m16332i()).m5641c(m14534a3);
            if (m5641c == null && this.f12481a.m16336m() != null) {
                m5641c = this.f12481a.m16336m().get(m14534a3);
            }
            if (m5641c != null) {
                m14534a3 = m5641c;
            }
            C0713j1.m5563a(this.f12481a.m16332i()).m5576B(m14534a3);
            if (this.f12481a.m16333j() != null) {
                this.f12481a.m16333j().m15114c(m14534a3);
            }
        }
        String m14534a4 = m14534a(c3307ui, 29);
        if (m14534a4 != null) {
            C0713j1.m5563a(this.f12481a.m16332i()).m5576B(m14534a4.trim());
            if (this.f12481a.m16333j() != null) {
                this.f12481a.m16333j().m15107a(m14534a4.trim());
            }
        } else {
            C0713j1.m5563a(this.f12481a.m16332i()).m5576B("R");
        }
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                if (m15821d.m15828j() == 31) {
                    String m14534a5 = m14534a(m15821d, 28);
                    if (m14534a5 != null) {
                        try {
                            int parseInt2 = Integer.parseInt(m14534a5.trim());
                            if (parseInt2 == 0) {
                                parseInt2 = -16777216;
                            }
                            C0713j1.m5563a(this.f12481a.m16332i()).m5727t(parseInt2);
                            if (this.f12481a.m16333j() != null) {
                                this.f12481a.m16333j().m15110b(parseInt2);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    String m14534a6 = m14534a(m15821d, 87);
                    if (!TextUtils.isEmpty(m14534a6)) {
                        String trim = m14534a6.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        C0713j1.m5563a(this.f12481a.m16332i()).m5573A(trim);
                    }
                    String m14534a7 = m14534a(m15821d, 30);
                    if (m14534a7 != null) {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5735v(Integer.parseInt(m14534a7.trim()));
                        if (this.f12481a.m16333j() != null) {
                            this.f12481a.m16333j().m15116d(Integer.parseInt(m14534a7.trim()));
                        }
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5735v(0);
                    }
                    String m14534a8 = m14534a(m15821d, 31);
                    if (m14534a8 != null) {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5731u(Integer.parseInt(m14534a8.trim()));
                        if (this.f12481a.m16333j() != null) {
                            this.f12481a.m16333j().m15113c(Integer.parseInt(m14534a8.trim()));
                        }
                    } else if (C0713j1.m5563a(this.f12481a.m16332i()).m5652d0().equalsIgnoreCase("B")) {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5731u(12);
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5731u(5);
                    }
                    String m14534a9 = m14534a(m15821d, 98);
                    if (!TextUtils.isEmpty(m14534a9)) {
                        if (m14534a9.contains("px") || m14534a9.contains("PX")) {
                            m14534a9 = m14534a9.substring(0, m14534a9.length() - 2);
                        }
                        try {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5665g(C0755x1.m6112a(Float.parseFloat(m14534a9)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String m14534a10 = m14534a(m15821d, 101);
                    if (!TextUtils.isEmpty(m14534a10)) {
                        if (m14534a10.contains("px") || m14534a10.contains("PX")) {
                            m14534a10 = m14534a10.substring(0, m14534a10.length() - 2);
                        }
                        try {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5672h(Float.parseFloat(m14534a10));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    /* renamed from: s */
    private void m14584s(C3307ui c3307ui, C2945mj c2945mj) {
        C3440xj c3440xj;
        String str;
        String m14534a = m14534a(c3307ui, 14);
        if (m14534a == null || m14534a.equals("*")) {
            c3440xj = null;
        } else {
            c3440xj = new C3440xj();
            c3440xj.f14055a = m14534a;
        }
        if (c3440xj != null) {
            for (int i = 0; i < c3307ui.m15827i(); i++) {
                C3307ui m15821d = c3307ui.m15821d(i);
                try {
                    if (m15821d.m15828j() == 13) {
                        C0716k1 c0716k1 = new C0716k1();
                        Vector<C3167ri> m15819c = m15821d.m15819c(21);
                        if (m15819c != null) {
                            C3167ri elementAt = m15819c.elementAt(0);
                            if (elementAt.m15278d() == 1) {
                                str = elementAt.m15276b();
                            } else if (elementAt.m15277c() == 143) {
                                str = "date";
                            }
                            c0716k1.f4902a = str;
                        }
                        m14533a(m15821d);
                        for (int i2 = 0; i2 < m15821d.m15827i(); i2++) {
                            try {
                                if (m15821d.m15821d(i2).m15828j() == 39) {
                                    c0716k1.f4904c = true;
                                    c0716k1.f4903b = true;
                                }
                            } catch (C3399wi unused) {
                            }
                        }
                        c3440xj.m16499a(c0716k1);
                    }
                } catch (C3399wi unused2) {
                }
            }
            c2945mj.m14121a(c3440xj);
        }
    }

    /* renamed from: t */
    private void m14585t(C3307ui c3307ui, C2945mj c2945mj) {
        String str = null;
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            C3128qi m15816b = c3307ui.m15816b(i);
            if (m15816b.m15101b() == 14) {
                str = m15816b.m15103d().elementAt(0).m15276b();
            }
        }
        String m14533a = m14533a(c3307ui);
        if (m14533a == null || !m14533a.equals("T")) {
            return;
        }
        c2945mj.m14123a(true, str);
    }

    /* renamed from: u */
    private void m14586u(C3307ui c3307ui, C2945mj c2945mj) {
        try {
            String m14534a = m14534a(c3307ui, 28);
            if (m14534a != null) {
                int parseInt = Integer.parseInt(m14534a);
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                C0713j1.m5563a(this.f12481a.m16332i()).m5572A(parseInt);
            }
            String m14534a2 = m14534a(c3307ui, 33);
            if (!TextUtils.isEmpty(m14534a2) && !this.f12481a.m16330g(m14534a2)) {
                c2945mj.m14139e().m13879a(1, m14534a2);
            }
            String m14534a3 = m14534a(c3307ui, 80);
            if (!TextUtils.isEmpty(m14534a3)) {
                if (m14534a3.indexOf(".") != -1) {
                    m14534a3 = m14534a3.substring(0, m14534a3.indexOf("."));
                }
                this.f12481a.m16328f(m14534a3);
            }
            for (int i = 0; i < c3307ui.m15827i(); i++) {
                C3307ui m15821d = c3307ui.m15821d(i);
                if (m15821d.m15828j() == 31) {
                    String m14534a4 = m14534a(m15821d, 28);
                    if (m14534a4 != null) {
                        int parseInt2 = Integer.parseInt(m14534a4);
                        if (parseInt2 == 0) {
                            parseInt2 = -16777216;
                        }
                        C0713j1.m5563a(this.f12481a.m16332i()).m5575B(parseInt2);
                    }
                    String m14534a5 = m14534a(m15821d, 98);
                    if (!TextUtils.isEmpty(m14534a5)) {
                        if (m14534a5.contains("px") || m14534a5.contains("PX")) {
                            m14534a5 = m14534a5.substring(0, m14534a5.length() - 2);
                        }
                        C0713j1.m5563a(this.f12481a.m16332i()).m5677i(C0755x1.m6112a(Float.parseFloat(m14534a5)));
                    }
                    String m14534a6 = m14534a(m15821d, 101);
                    if (!TextUtils.isEmpty(m14534a6)) {
                        if (m14534a6.contains("px") || m14534a6.contains("PX")) {
                            m14534a6 = m14534a6.substring(0, m14534a6.length() - 2);
                        }
                        C0713j1.m5563a(this.f12481a.m16332i()).m5682j(Float.parseFloat(m14534a6));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: v */
    private void m14587v(C3307ui c3307ui, C2945mj c2945mj) {
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() == 0) {
                    if (m15828j == 9) {
                        if (m15821d.m15821d(0).m15824f() == 5) {
                            c2945mj.f12161n.m14158a(m15821d.m15821d(0).m15825g()[0] & 255);
                        }
                    } else if (m15828j == 11) {
                        c2945mj.f12161n.m14159a(m14533a(m15821d));
                    }
                }
            } catch (C3399wi unused) {
            }
        }
    }

    /* renamed from: w */
    private void m14588w(C3307ui c3307ui, C2945mj c2945mj) {
    }

    /* renamed from: x */
    private void m14589x(C3307ui c3307ui, C2945mj c2945mj) {
        String m14533a;
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                int m15828j = m15821d.m15828j();
                if (m15821d.m16630a() == 1) {
                    if (m15828j == 10) {
                        String m14534a = m14534a(m15821d, 36);
                        if (m14534a != null) {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5578C(Integer.parseInt(m14534a));
                        }
                    } else if (m15828j == 11) {
                        String m14534a2 = m14534a(m15821d, 36);
                        if (m14534a2 != null) {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5593H(Integer.parseInt(m14534a2));
                        }
                    } else if (m15828j == 9) {
                        String m14534a3 = m14534a(m15821d, 36);
                        if (m14534a3 != null) {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5587F(Integer.parseInt(m14534a3));
                        }
                    } else if (m15828j == 12 && (m14533a = m14533a(m15821d)) != null) {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5590G(Integer.parseInt(m14533a));
                    }
                } else if (m15828j == 37) {
                    for (int i2 = 0; i2 < m15821d.m15827i(); i2++) {
                        C3307ui m15821d2 = c3307ui.m15821d(i2);
                        if (m15821d2.m16630a() == 0 && m15821d2.m15828j() == 31) {
                            String m14534a4 = m14534a(m15821d2, 31);
                            if (m14534a4 != null) {
                                C0713j1.m5563a(this.f12481a.m16332i()).m5581D(Integer.parseInt(m14534a4));
                            }
                            String m14534a5 = m14534a(m15821d2, 87);
                            if (!TextUtils.isEmpty(m14534a5)) {
                                String trim = m14534a5.trim();
                                if (trim.contains("\\.")) {
                                    trim = trim.replace("\\.", ".");
                                }
                                C0713j1.m5563a(this.f12481a.m16332i()).m5597I(trim);
                            }
                            String m14534a6 = m14534a(m15821d2, 30);
                            if (m14534a6 != null) {
                                C0713j1.m5563a(this.f12481a.m16332i()).m5584E(Integer.parseInt(m14534a6));
                            }
                            String m14534a7 = m14534a(m15821d, 98);
                            if (!TextUtils.isEmpty(m14534a7)) {
                                if (m14534a7.contains("px") || m14534a7.contains("PX")) {
                                    m14534a7 = m14534a7.substring(0, m14534a7.length() - 2);
                                }
                                try {
                                    C0713j1.m5563a(this.f12481a.m16332i()).m5687k(C0755x1.m6112a(Float.parseFloat(m14534a7)));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            String m14534a8 = m14534a(m15821d, 101);
                            if (!TextUtils.isEmpty(m14534a8)) {
                                if (m14534a8.contains("px") || m14534a8.contains("PX")) {
                                    m14534a8 = m14534a8.substring(0, m14534a8.length() - 2);
                                }
                                try {
                                    C0713j1.m5563a(this.f12481a.m16332i()).m5692l(Float.parseFloat(m14534a8));
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: y */
    private void m14590y(C3307ui c3307ui, C2945mj c2945mj) {
        String m14534a = m14534a(c3307ui, 36);
        if (m14534a != null) {
            try {
                int parseInt = Integer.parseInt(m14534a);
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                c2945mj.m14126b(parseInt);
            } catch (Exception unused) {
            }
        }
        for (int i = 0; i < c3307ui.m15827i(); i++) {
            C3307ui m15821d = c3307ui.m15821d(i);
            try {
                if (m15821d.m15824f() == 1) {
                    String m15826h = m15821d.m15826h();
                    if (m15826h != null) {
                        c2945mj.m14141e(m15826h);
                    }
                } else if (m15821d.m15828j() == 31) {
                    String m14534a2 = m14534a(m15821d, 36);
                    if (m14534a2 != null) {
                        int parseInt2 = Integer.parseInt(m14534a2);
                        if (parseInt2 == 0) {
                            parseInt2 = -16777216;
                        }
                        c2945mj.m14133c(parseInt2);
                    }
                    String m14534a3 = m14534a(m15821d, 28);
                    if (m14534a3 != null) {
                        int parseInt3 = Integer.parseInt(m14534a3);
                        if (parseInt3 == 0) {
                            parseInt3 = -16777216;
                        }
                        c2945mj.m14137d(parseInt3);
                    }
                    String m14534a4 = m14534a(m15821d, 31);
                    if (m14534a4 != null) {
                        c2945mj.m14140e(Integer.parseInt(m14534a4));
                    }
                    String m14534a5 = m14534a(m15821d, 98);
                    if (!TextUtils.isEmpty(m14534a5)) {
                        if (m14534a5.contains("px") || m14534a5.contains("PX")) {
                            m14534a5 = m14534a5.substring(0, m14534a5.length() - 2);
                        }
                        try {
                            c2945mj.m14116a(C0755x1.m6112a(Float.parseFloat(m14534a5)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String m14534a6 = m14534a(m15821d, 101);
                    if (!TextUtils.isEmpty(m14534a6)) {
                        if (m14534a6.contains("px") || m14534a6.contains("PX")) {
                            m14534a6 = m14534a6.substring(0, m14534a6.length() - 2);
                        }
                        try {
                            c2945mj.m14125b(Float.parseFloat(m14534a6));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: z */
    private void m14591z(C3307ui c3307ui, C2945mj c2945mj) {
        int i;
        String m14534a = m14534a(c3307ui, 36);
        if (m14534a != null) {
            try {
                int parseInt = Integer.parseInt(m14534a);
                if (parseInt == 0) {
                    parseInt = -16777216;
                }
                C0713j1.m5563a(this.f12481a.m16332i()).m5596I(parseInt);
            } catch (Exception unused) {
            }
        } else {
            C0713j1.m5563a(this.f12481a.m16332i()).m5599J(0);
        }
        for (int i2 = 0; i2 < c3307ui.m15827i(); i2++) {
            C3307ui m15821d = c3307ui.m15821d(i2);
            try {
                if (m15821d.m15828j() == 31) {
                    String m14534a2 = m14534a(m15821d, 28);
                    if (m14534a2 != null) {
                        try {
                            i = Integer.parseInt(m14534a2);
                            if (i == 0) {
                                i = -16777216;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                        }
                        C0713j1.m5563a(this.f12481a.m16332i()).m5602K(i);
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5605L(0);
                    }
                    String m14534a3 = m14534a(m15821d, 87);
                    if (!TextUtils.isEmpty(m14534a3)) {
                        String trim = m14534a3.trim();
                        if (trim.contains("\\.")) {
                            trim = trim.replace("\\.", ".");
                        }
                        C0713j1.m5563a(this.f12481a.m16332i()).m5600J(trim);
                    }
                    String m14534a4 = m14534a(m15821d, 30);
                    if (m14534a4 != null) {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5609N(Integer.parseInt(m14534a4));
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5609N(-1);
                    }
                    String m14534a5 = m14534a(m15821d, 31);
                    if (m14534a5 != null) {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5607M(Integer.parseInt(m14534a5));
                    } else {
                        C0713j1.m5563a(this.f12481a.m16332i()).m5607M(-1);
                    }
                    String m14534a6 = m14534a(m15821d, 98);
                    if (!TextUtils.isEmpty(m14534a6)) {
                        if (m14534a6.contains("px") || m14534a6.contains("PX")) {
                            m14534a6 = m14534a6.substring(0, m14534a6.length() - 2);
                        }
                        try {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5697m(C0755x1.m6112a(Float.parseFloat(m14534a6)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String m14534a7 = m14534a(m15821d, 101);
                    if (!TextUtils.isEmpty(m14534a7)) {
                        if (m14534a7.contains("px") || m14534a7.contains("PX")) {
                            m14534a7 = m14534a7.substring(0, m14534a7.length() - 2);
                        }
                        try {
                            C0713j1.m5563a(this.f12481a.m16332i()).m5702n(Float.parseFloat(m14534a7));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    /* renamed from: a */
    public int m14592a(C3263ti c3263ti) {
        C3307ui m15649a = c3263ti.m15649a();
        C0755x1.m6139a(this.f12482b);
        m14562e(m15649a);
        return m15649a != null ? 0 : -1;
    }

    /* renamed from: a */
    public C3531zj m14593a(C3263ti c3263ti, C2945mj c2945mj) {
        return m14531C(c3263ti.m15649a(), c2945mj);
    }

    /* renamed from: b */
    public int m14594b(C3263ti c3263ti, C2945mj c2945mj) {
        C3307ui m15649a = c3263ti.m15649a();
        C0755x1.m6139a(this.f12482b);
        m14530B(m15649a, c2945mj);
        if (c2945mj != null) {
            int i = 0;
            while (i < c2945mj.m14144h()) {
                C2899lj m14114a = c2945mj.m14114a(i);
                if (m14114a != null) {
                    if (m14114a.m13901f() == null) {
                        c2945mj.m14128b(m14114a);
                    } else {
                        i++;
                    }
                }
            }
        }
        return m15649a != null ? 0 : -1;
    }
}
