package com.comviva.webaxn.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import p000.C2991nj;

/* renamed from: com.comviva.webaxn.utils.j1 */
/* loaded from: classes.dex */
public class C0713j1 {

    /* renamed from: d */
    private static C0713j1 f4874d;

    /* renamed from: a */
    private Context f4875a;

    /* renamed from: b */
    private SharedPreferences f4876b;

    /* renamed from: c */
    private SharedPreferences.Editor f4877c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.j1$a */
    /* loaded from: classes.dex */
    public enum a {
        STRING_VALUE,
        INT_VALUE,
        FLOAT_VALUE,
        LONG_VALUE
    }

    private C0713j1(Context context) {
        this.f4875a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("PersistentSettings", 0);
        this.f4876b = sharedPreferences;
        this.f4877c = sharedPreferences.edit();
    }

    /* renamed from: L */
    private void m5562L(String str) {
        this.f4877c.remove(str);
        this.f4877c.commit();
    }

    /* renamed from: a */
    public static C0713j1 m5563a(Context context) {
        if (f4874d == null) {
            f4874d = new C0713j1(context);
        }
        return f4874d;
    }

    /* renamed from: a */
    private Object m5564a(String str, a aVar, int i) {
        Object valueOf;
        if (aVar == a.STRING_VALUE) {
            try {
                return this.f4876b.getString(str, null);
            } catch (Exception unused) {
                return String.valueOf(i);
            }
        }
        try {
            if (aVar == a.INT_VALUE) {
                valueOf = Integer.valueOf(this.f4876b.getInt(str, i));
            } else if (aVar == a.FLOAT_VALUE) {
                valueOf = Float.valueOf(this.f4876b.getFloat(str, i));
            } else {
                if (aVar != a.LONG_VALUE) {
                    return null;
                }
                valueOf = Long.valueOf(this.f4876b.getLong(str, i));
            }
            return valueOf;
        } catch (Exception unused2) {
            return Integer.valueOf(i);
        }
    }

    /* renamed from: a */
    private void m5565a(String str, float f) {
        this.f4877c.putFloat(str, f);
        this.f4877c.commit();
    }

    /* renamed from: a */
    private void m5566a(String str, long j) {
        this.f4877c.putLong(str, j);
        this.f4877c.commit();
    }

    /* renamed from: b */
    private void m5567b(String str, int i) {
        this.f4877c.putInt(str, i);
        this.f4877c.commit();
    }

    /* renamed from: b */
    private void m5568b(String str, String str2) {
        this.f4877c.putString(str, str2);
        this.f4877c.commit();
    }

    /* renamed from: d */
    private boolean m5569d(String str, boolean z) {
        try {
            return this.f4876b.getBoolean(str, z);
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    /* renamed from: e */
    private void m5570e(String str, boolean z) {
        this.f4877c.putBoolean(str, z);
        this.f4877c.commit();
    }

    /* renamed from: A */
    public String m5571A() {
        return (String) m5564a("deviceToken", a.STRING_VALUE, 0);
    }

    /* renamed from: A */
    public void m5572A(int i) {
        m5567b("splashscreencolor", C0755x1.m6113a(i));
    }

    /* renamed from: A */
    public void m5573A(String str) {
        m5568b("progressbar_font_typeface", str);
    }

    /* renamed from: B */
    public String m5574B() {
        return (String) m5564a("devicetoken_gcmregid", a.STRING_VALUE, 0);
    }

    /* renamed from: B */
    public void m5575B(int i) {
        m5567b("splashscreenfontcolor", C0755x1.m6113a(i));
    }

    /* renamed from: B */
    public void m5576B(String str) {
        m5568b("progressbarlabel", str);
    }

    /* renamed from: C */
    public int m5577C() {
        return ((Integer) m5564a("exitscreen_bgcolor", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: C */
    public void m5578C(int i) {
        m5567b("table_first_column_color", i);
    }

    /* renamed from: C */
    public void m5579C(String str) {
        m5568b("progressbartype", str);
    }

    /* renamed from: D */
    public int m5580D() {
        return ((Integer) m5564a("exitscreen_font_color", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: D */
    public void m5581D(int i) {
        m5567b("table_font_size", i);
    }

    /* renamed from: D */
    public void m5582D(String str) {
        m5568b("serverimageurl", str);
    }

    /* renamed from: E */
    public float m5583E() {
        return ((Float) m5564a("exit_letter_spacing", a.FLOAT_VALUE, 0)).floatValue();
    }

    /* renamed from: E */
    public void m5584E(int i) {
        m5567b("table_font_style", i);
    }

    /* renamed from: E */
    public void m5585E(String str) {
        m5568b("secureserverurl", str);
    }

    /* renamed from: F */
    public int m5586F() {
        return C0755x1.m6114a(this.f4875a, ((Integer) m5564a("exitscreen_font_size", a.INT_VALUE, 0)).intValue());
    }

    /* renamed from: F */
    public void m5587F(int i) {
        m5567b("table_header_color", i);
    }

    /* renamed from: F */
    public void m5588F(String str) {
        m5568b("serverurl", str);
    }

    /* renamed from: G */
    public int m5589G() {
        return ((Integer) m5564a("exitscreen_font_style", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: G */
    public void m5590G(int i) {
        m5567b("table_lines_color", i);
    }

    /* renamed from: G */
    public void m5591G(String str) {
        m5568b("serviceproxyurl", str);
    }

    /* renamed from: H */
    public String m5592H() {
        String str = (String) m5564a("exitscreen_font_typeface", a.STRING_VALUE, 0);
        return TextUtils.isEmpty(str) ? m5745y() : str;
    }

    /* renamed from: H */
    public void m5593H(int i) {
        m5567b("table_first_row_color", i);
    }

    /* renamed from: H */
    public void m5594H(String str) {
        m5568b("sessionid", str);
    }

    /* renamed from: I */
    public int m5595I() {
        return ((Integer) m5564a("font_color", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: I */
    public void m5596I(int i) {
        int m6113a = C0755x1.m6113a(i);
        m5599J(1);
        m5567b("title_bgcolor", m6113a);
    }

    /* renamed from: I */
    public void m5597I(String str) {
        m5568b("table_font_typeface", str);
    }

    /* renamed from: J */
    public float m5598J() {
        return ((Float) m5564a("font_letter_spacing", a.FLOAT_VALUE, 0)).floatValue();
    }

    /* renamed from: J */
    public void m5599J(int i) {
        m5567b("title_bgcolor_set", i);
    }

    /* renamed from: J */
    public void m5600J(String str) {
        m5568b("title_font_typeface", str);
    }

    /* renamed from: K */
    public float m5601K() {
        return ((Float) m5564a("font_line_spacing", a.FLOAT_VALUE, 0)).floatValue();
    }

    /* renamed from: K */
    public void m5602K(int i) {
        int m6113a = C0755x1.m6113a(i);
        m5605L(1);
        m5567b("title_font_color", m6113a);
    }

    /* renamed from: K */
    public void m5603K(String str) {
        m5568b("uniqueid", str);
    }

    /* renamed from: L */
    public int m5604L() {
        return C0755x1.m6114a(this.f4875a, ((Integer) m5564a("font_size", a.INT_VALUE, -1)).intValue());
    }

    /* renamed from: L */
    public void m5605L(int i) {
        m5567b("title_font_color_set", i);
    }

    /* renamed from: M */
    public int m5606M() {
        return ((Integer) m5564a("font_style", a.INT_VALUE, -1)).intValue();
    }

    /* renamed from: M */
    public void m5607M(int i) {
        m5567b("title_font_size", i);
    }

    /* renamed from: N */
    public String m5608N() {
        String str = (String) m5564a("font_typeface", a.STRING_VALUE, 0);
        return TextUtils.isEmpty(str) ? m5745y() : str;
    }

    /* renamed from: N */
    public void m5609N(int i) {
        m5567b("title_font_style", i);
    }

    /* renamed from: O */
    public String m5610O() {
        return (String) m5564a("regId", a.STRING_VALUE, 0);
    }

    /* renamed from: P */
    public boolean m5611P() {
        return m5569d("gzipenabled", false);
    }

    /* renamed from: Q */
    public String m5612Q() {
        return (String) m5564a("language", a.STRING_VALUE, 0);
    }

    /* renamed from: R */
    public int m5613R() {
        return ((Integer) m5564a("msgRecvd", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: S */
    public int m5614S() {
        return ((Integer) m5564a("seed", a.INT_VALUE, 1)).intValue();
    }

    /* renamed from: T */
    public String m5615T() {
        return (String) m5564a("pbarlabelalign", a.STRING_VALUE, 0);
    }

    /* renamed from: U */
    public int m5616U() {
        return ((Integer) m5564a("page_default_bg_color", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: V */
    public String m5617V() {
        String str = (String) m5564a("platform", a.STRING_VALUE, 0);
        return (TextUtils.isEmpty(str) || str.equals("0")) ? "android" : str;
    }

    /* renamed from: W */
    public String m5618W() {
        String str = (String) m5564a("prestarturl", a.STRING_VALUE, 0);
        if (str == null || !str.equals("0")) {
            return str;
        }
        return null;
    }

    /* renamed from: X */
    public int m5619X() {
        return ((Integer) m5564a("progressbar_bgcolor", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: Y */
    public int m5620Y() {
        return ((Integer) m5564a("progressbar_font_color", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: Z */
    public int m5621Z() {
        return C0755x1.m6114a(this.f4875a, ((Integer) m5564a("progressbar_font_size", a.INT_VALUE, 0)).intValue());
    }

    /* renamed from: a */
    public int m5622a(String str) {
        return ((Integer) m5564a(str, a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: a */
    public String m5623a() {
        return (String) m5564a("default_font_color_set", a.STRING_VALUE, 0);
    }

    /* renamed from: a */
    public void m5624a(float f) {
        m5565a("default_letter_spacing", f);
    }

    /* renamed from: a */
    public void m5625a(int i) {
        int m6113a = C0755x1.m6113a(i);
        m5674h("true");
        m5567b("default_font_bgcolor", m6113a);
    }

    /* renamed from: a */
    public void m5626a(long j) {
        m5566a("sessiontimeout", j);
    }

    /* renamed from: a */
    public void m5627a(String str, int i) {
        m5567b(str, i);
    }

    /* renamed from: a */
    public void m5628a(String str, String str2) {
        m5568b(str, str2);
    }

    /* renamed from: a */
    public void m5629a(String str, boolean z) {
        m5657e(z);
        m5568b("domainurl", str);
    }

    /* renamed from: a */
    public void m5630a(boolean z) {
        m5570e("background", z);
    }

    /* renamed from: a0 */
    public int m5631a0() {
        return ((Integer) m5564a("progressbar_font_style", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: b */
    public int m5632b(String str) {
        return ((Integer) m5564a(str, a.INT_VALUE, -1)).intValue();
    }

    /* renamed from: b */
    public String m5633b() {
        return (String) m5564a("exitscreen_bgcolor_set", a.STRING_VALUE, 0);
    }

    /* renamed from: b */
    public void m5634b(float f) {
        m5565a("default_line_spacing", f);
    }

    /* renamed from: b */
    public void m5635b(int i) {
        int m6113a = C0755x1.m6113a(i);
        m5679i("true");
        m5567b("default_font_color", m6113a);
    }

    /* renamed from: b */
    public void m5636b(long j) {
        m5566a("splashtd", j);
    }

    /* renamed from: b */
    public void m5637b(String str, boolean z) {
        m5657e(z);
        m5568b("ipurl", str);
    }

    /* renamed from: b */
    public void m5638b(boolean z) {
        m5570e("interrupt", z);
    }

    /* renamed from: b0 */
    public String m5639b0() {
        String str = (String) m5564a("progressbar_font_typeface", a.STRING_VALUE, 0);
        return TextUtils.isEmpty(str) ? m5745y() : str;
    }

    /* renamed from: c */
    public String m5640c() {
        return (String) m5564a("exitscreen_font_color_set", a.STRING_VALUE, 0);
    }

    /* renamed from: c */
    public String m5641c(String str) {
        String str2 = (String) m5564a(str, a.STRING_VALUE, 0);
        return (str2 == null || !str2.contains("\\n")) ? str2 : str2.replace("\\n", "");
    }

    /* renamed from: c */
    public void m5642c(float f) {
        m5565a("exit_letter_spacing", f);
    }

    /* renamed from: c */
    public void m5643c(int i) {
        m5567b("default_font_size", i);
    }

    /* renamed from: c */
    public void m5644c(String str, boolean z) {
        m5570e(str, z);
    }

    /* renamed from: c */
    public void m5645c(boolean z) {
        m5570e("token", z);
    }

    /* renamed from: c0 */
    public String m5646c0() {
        return (String) m5564a("progressbarlabel", a.STRING_VALUE, 0);
    }

    /* renamed from: d */
    public int m5647d(String str) {
        return ((Integer) m5564a(str, a.INT_VALUE, -1)).intValue();
    }

    /* renamed from: d */
    public String m5648d() {
        return (String) m5564a("exitscreen_font_size_set", a.STRING_VALUE, 0);
    }

    /* renamed from: d */
    public void m5649d(float f) {
        m5565a("exit_line_spacing", f);
    }

    /* renamed from: d */
    public void m5650d(int i) {
        m5567b("default_font_style", i);
    }

    /* renamed from: d */
    public void m5651d(boolean z) {
        m5570e("gzipenabled", z);
    }

    /* renamed from: d0 */
    public String m5652d0() {
        return (String) m5564a("progressbartype", a.STRING_VALUE, 0);
    }

    /* renamed from: e */
    public String m5653e() {
        return (String) m5564a("exitscreen_font_style_set", a.STRING_VALUE, 0);
    }

    /* renamed from: e */
    public String m5654e(String str) {
        return (String) m5564a(str, a.STRING_VALUE, 0);
    }

    /* renamed from: e */
    public void m5655e(float f) {
        m5565a("font_letter_spacing", f);
    }

    /* renamed from: e */
    public void m5656e(int i) {
        int m6113a = C0755x1.m6113a(i);
        m5744x("true");
        m5567b("page_default_bg_color", m6113a);
    }

    /* renamed from: e */
    public void m5657e(boolean z) {
        m5570e("ipdomainset", z);
    }

    /* renamed from: e0 */
    public boolean m5658e0() {
        return m5569d("ssl", false);
    }

    /* renamed from: f */
    public String m5659f() {
        return (String) m5564a("font_color_set", a.STRING_VALUE, 0);
    }

    /* renamed from: f */
    public void m5660f(float f) {
        m5565a("font_line_spacing", f);
    }

    /* renamed from: f */
    public void m5661f(int i) {
        m5567b("defaultselcolor", C0755x1.m6113a(i));
    }

    /* renamed from: f */
    public void m5662f(boolean z) {
        m5570e("ocr", z);
    }

    /* renamed from: f */
    public boolean m5663f(String str) {
        return m5569d(str, false);
    }

    /* renamed from: f0 */
    public int m5664f0() {
        Integer num = -1;
        try {
            if (1 == m5676i()) {
                Integer num2 = (Integer) m5564a("selectioncolor", a.INT_VALUE, 0);
                try {
                    num = Integer.valueOf(num2.intValue());
                } catch (Exception unused) {
                    num = num2;
                }
            } else {
                num = Integer.valueOf(m5748z());
            }
        } catch (Exception unused2) {
        }
        return num.intValue();
    }

    /* renamed from: g */
    public void m5665g(float f) {
        m5565a("pbar_font_letter_spacing", f);
    }

    /* renamed from: g */
    public void m5666g(int i) {
        int m6113a = C0755x1.m6113a(i);
        m5699m("true");
        m5567b("exitscreen_bgcolor", m6113a);
    }

    /* renamed from: g */
    public void m5667g(String str) {
        m5568b("buildVer", str);
    }

    /* renamed from: g */
    public void m5668g(boolean z) {
        m5570e("ssl", z);
    }

    /* renamed from: g */
    public boolean m5669g() {
        return m5569d("ipdomainset", false);
    }

    /* renamed from: g0 */
    public String m5670g0() {
        return (String) m5564a("sessionid", a.STRING_VALUE, 0);
    }

    /* renamed from: h */
    public String m5671h() {
        return (String) m5564a("page_default_bg_color_set", a.STRING_VALUE, 0);
    }

    /* renamed from: h */
    public void m5672h(float f) {
        m5565a("pbar_font_line_spacing", f);
    }

    /* renamed from: h */
    public void m5673h(int i) {
        int m6113a = C0755x1.m6113a(i);
        m5704n("true");
        m5567b("exitscreen_font_color", m6113a);
    }

    /* renamed from: h */
    public void m5674h(String str) {
        m5568b("default_font_bgcolor_set", str);
    }

    /* renamed from: h0 */
    public int m5675h0() {
        return ((Integer) m5564a("sessionreset", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: i */
    public int m5676i() {
        return Integer.valueOf(((Integer) m5564a("selection_color_set", a.INT_VALUE, 0)).intValue()).intValue();
    }

    /* renamed from: i */
    public void m5677i(float f) {
        m5565a("splashscreenfontls", f);
    }

    /* renamed from: i */
    public void m5678i(int i) {
        m5708o("true");
        m5567b("exitscreen_font_size", i);
    }

    /* renamed from: i */
    public void m5679i(String str) {
        m5568b("default_font_color_set", str);
    }

    /* renamed from: i0 */
    public int m5680i0() {
        return ((Integer) m5564a("sound", a.INT_VALUE, -1)).intValue();
    }

    /* renamed from: j */
    public int m5681j() {
        return ((Integer) m5564a("title_font_color_set", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: j */
    public void m5682j(float f) {
        m5565a("splashscreenfont_line_spacing", f);
    }

    /* renamed from: j */
    public void m5683j(int i) {
        m5712p("true");
        m5567b("exitscreen_font_style", i);
    }

    /* renamed from: j */
    public void m5684j(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Poppins-Regular.ttf";
        }
        m5568b("default_font_typeface", str);
    }

    /* renamed from: j0 */
    public int m5685j0() {
        return ((Integer) m5564a("splashscreencolor", a.INT_VALUE, -1)).intValue();
    }

    /* renamed from: k */
    public void m5686k() {
        this.f4877c.clear();
        this.f4877c.commit();
    }

    /* renamed from: k */
    public void m5687k(float f) {
        m5565a("table_font_ls", f);
    }

    /* renamed from: k */
    public void m5688k(int i) {
        int m6113a = C0755x1.m6113a(i);
        m5720r("true");
        m5567b("font_bgcolor", m6113a);
    }

    /* renamed from: k */
    public void m5689k(String str) {
        m5568b("deviceToken", str);
    }

    /* renamed from: k0 */
    public int m5690k0() {
        return ((Integer) m5564a("splashscreenfontcolor", a.INT_VALUE, -1)).intValue();
    }

    /* renamed from: l */
    public void m5691l() {
        m5562L("font_bgcolor");
        m5562L("font_bgcolor_set");
    }

    /* renamed from: l */
    public void m5692l(float f) {
        m5565a("table_font_line_spacing", f);
    }

    /* renamed from: l */
    public void m5693l(int i) {
        m5567b("font_color", C0755x1.m6113a(i));
    }

    /* renamed from: l */
    public void m5694l(String str) {
        m5568b("devicetoken_gcmregid", str);
    }

    /* renamed from: l0 */
    public long m5695l0() {
        return ((Long) m5564a("splashtd", a.LONG_VALUE, -1)).longValue();
    }

    /* renamed from: m */
    public void m5696m() {
        m5562L("font_color");
        m5562L("font_color_set");
    }

    /* renamed from: m */
    public void m5697m(float f) {
        m5565a("title_font_ls", f);
    }

    /* renamed from: m */
    public void m5698m(int i) {
        m5567b("font_size", i);
    }

    /* renamed from: m */
    public void m5699m(String str) {
        m5568b("exitscreen_bgcolor_set", str);
    }

    /* renamed from: m0 */
    public int m5700m0() {
        return C0755x1.m6114a(this.f4875a, ((Integer) m5564a("table_font_size", a.INT_VALUE, 0)).intValue());
    }

    /* renamed from: n */
    public void m5701n() {
        m5562L("font_size");
    }

    /* renamed from: n */
    public void m5702n(float f) {
        m5565a("title_font_line_spacing", f);
    }

    /* renamed from: n */
    public void m5703n(int i) {
        m5567b("font_style", i);
    }

    /* renamed from: n */
    public void m5704n(String str) {
        m5568b("exitscreen_font_color_set", str);
    }

    /* renamed from: n0 */
    public int m5705n0() {
        return ((Integer) m5564a("title_bgcolor", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: o */
    public void m5706o() {
        m5562L("font_style");
    }

    /* renamed from: o */
    public void m5707o(int i) {
        m5567b("keepregistered", i);
    }

    /* renamed from: o */
    public void m5708o(String str) {
        m5568b("exitscreen_font_size_set", str);
    }

    /* renamed from: o0 */
    public int m5709o0() {
        return ((Integer) m5564a("title_font_color", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: p */
    public void m5710p() {
        m5562L("selectioncolor");
        m5562L("selection_color_set");
    }

    /* renamed from: p */
    public void m5711p(int i) {
        m5567b("iniversion", i);
    }

    /* renamed from: p */
    public void m5712p(String str) {
        m5568b("exitscreen_font_style_set", str);
    }

    /* renamed from: p0 */
    public int m5713p0() {
        return C0755x1.m6114a(this.f4875a, ((Integer) m5564a("title_font_size", a.INT_VALUE, -1)).intValue());
    }

    /* renamed from: q */
    public long m5714q() {
        return ((Long) m5564a("sessiontimeout", a.LONG_VALUE, 0)).longValue();
    }

    /* renamed from: q */
    public void m5715q(int i) {
        m5567b("msgRecvd", i);
    }

    /* renamed from: q */
    public void m5716q(String str) {
        m5568b("exitscreen_font_typeface", str);
    }

    /* renamed from: q0 */
    public int m5717q0() {
        return ((Integer) m5564a("title_font_style", a.INT_VALUE, -1)).intValue();
    }

    /* renamed from: r */
    public String m5718r() {
        String str = (String) m5564a("buildVer", a.STRING_VALUE, 0);
        if (TextUtils.isEmpty(str) || !str.equals("0")) {
            return str;
        }
        return null;
    }

    /* renamed from: r */
    public void m5719r(int i) {
        m5567b("seed", i);
    }

    /* renamed from: r */
    public void m5720r(String str) {
        m5568b("font_bgcolor_set", str);
    }

    /* renamed from: r0 */
    public String m5721r0() {
        String str = (String) m5564a("title_font_typeface", a.STRING_VALUE, 0);
        return TextUtils.isEmpty(str) ? m5745y() : str;
    }

    /* renamed from: s */
    public int m5722s() {
        return ((Integer) m5564a("default_font_bgcolor", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: s */
    public void m5723s(int i) {
        m5567b("progressbar_bgcolor", C0755x1.m6113a(i));
    }

    /* renamed from: s */
    public void m5724s(String str) {
        m5568b("font_color_set", str);
    }

    /* renamed from: s0 */
    public String m5725s0() {
        return (String) m5564a("uniqueid", a.STRING_VALUE, 0);
    }

    /* renamed from: t */
    public int m5726t() {
        return ((Integer) m5564a("default_font_color", a.INT_VALUE, 0)).intValue();
    }

    /* renamed from: t */
    public void m5727t(int i) {
        m5567b("progressbar_font_color", C0755x1.m6113a(i));
    }

    /* renamed from: t */
    public void m5728t(String str) {
        m5568b("font_typeface", str);
    }

    /* renamed from: t0 */
    public boolean m5729t0() {
        return m5569d("background", false);
    }

    /* renamed from: u */
    public float m5730u() {
        return ((Float) m5564a("default_letter_spacing", a.FLOAT_VALUE, 0)).floatValue();
    }

    /* renamed from: u */
    public void m5731u(int i) {
        m5567b("progressbar_font_size", i);
    }

    /* renamed from: u */
    public void m5732u(String str) {
        m5568b("regId", str);
    }

    /* renamed from: u0 */
    public boolean m5733u0() {
        return m5569d("interrupt", false);
    }

    /* renamed from: v */
    public float m5734v() {
        return ((Float) m5564a("default_line_spacing", a.FLOAT_VALUE, 0)).floatValue();
    }

    /* renamed from: v */
    public void m5735v(int i) {
        m5567b("progressbar_font_style", i);
    }

    /* renamed from: v */
    public void m5736v(String str) {
        m5568b("group", str);
    }

    /* renamed from: v0 */
    public boolean m5737v0() {
        return m5569d("token", false);
    }

    /* renamed from: w */
    public int m5738w() {
        return C0755x1.m6114a(this.f4875a, ((Integer) m5564a("default_font_size", a.INT_VALUE, C2991nj.f12339a)).intValue());
    }

    /* renamed from: w */
    public void m5739w(int i) {
        int m6113a = C0755x1.m6113a(i);
        m5743x(1);
        m5567b("selectioncolor", m6113a);
    }

    /* renamed from: w */
    public void m5740w(String str) {
        m5568b("language", str);
    }

    /* renamed from: w0 */
    public boolean m5741w0() {
        return m5569d("geofenceservice", false);
    }

    /* renamed from: x */
    public int m5742x() {
        return ((Integer) m5564a("default_font_style", a.INT_VALUE, -1)).intValue();
    }

    /* renamed from: x */
    public void m5743x(int i) {
        m5567b("selection_color_set", i);
    }

    /* renamed from: x */
    public void m5744x(String str) {
        m5568b("page_default_bg_color_set", str);
    }

    /* renamed from: y */
    public String m5745y() {
        String str = (String) m5564a("default_font_typeface", a.STRING_VALUE, 0);
        return TextUtils.isEmpty(str) ? "Poppins-Regular.ttf" : str;
    }

    /* renamed from: y */
    public void m5746y(int i) {
        m5567b("sessionreset", i);
    }

    /* renamed from: y */
    public void m5747y(String str) {
        m5568b("platform", str);
    }

    /* renamed from: z */
    public int m5748z() {
        Integer num;
        try {
            num = Integer.valueOf(((Integer) m5564a("defaultselcolor", a.INT_VALUE, 0)).intValue());
        } catch (Exception unused) {
            num = -7829368;
        }
        return num.intValue();
    }

    /* renamed from: z */
    public void m5749z(int i) {
        m5567b("sound", i);
    }

    /* renamed from: z */
    public void m5750z(String str) {
        m5568b("prestarturl", str);
    }
}
