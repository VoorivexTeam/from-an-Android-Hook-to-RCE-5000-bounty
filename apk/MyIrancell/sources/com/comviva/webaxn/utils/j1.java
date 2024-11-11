package com.comviva.webaxn.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import defpackage.nj;

/* loaded from: classes.dex */
public class j1 {
    private static j1 d;
    private Context a;
    private SharedPreferences b;
    private SharedPreferences.Editor c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum a {
        STRING_VALUE,
        INT_VALUE,
        FLOAT_VALUE,
        LONG_VALUE
    }

    private j1(Context context) {
        this.a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("PersistentSettings", 0);
        this.b = sharedPreferences;
        this.c = sharedPreferences.edit();
    }

    private void L(String str) {
        this.c.remove(str);
        this.c.commit();
    }

    public static j1 a(Context context) {
        if (d == null) {
            d = new j1(context);
        }
        return d;
    }

    private Object a(String str, a aVar, int i) {
        Object valueOf;
        if (aVar == a.STRING_VALUE) {
            try {
                return this.b.getString(str, null);
            } catch (Exception unused) {
                return String.valueOf(i);
            }
        }
        try {
            if (aVar == a.INT_VALUE) {
                valueOf = Integer.valueOf(this.b.getInt(str, i));
            } else if (aVar == a.FLOAT_VALUE) {
                valueOf = Float.valueOf(this.b.getFloat(str, i));
            } else {
                if (aVar != a.LONG_VALUE) {
                    return null;
                }
                valueOf = Long.valueOf(this.b.getLong(str, i));
            }
            return valueOf;
        } catch (Exception unused2) {
            return Integer.valueOf(i);
        }
    }

    private void a(String str, float f) {
        this.c.putFloat(str, f);
        this.c.commit();
    }

    private void a(String str, long j) {
        this.c.putLong(str, j);
        this.c.commit();
    }

    private void b(String str, int i) {
        this.c.putInt(str, i);
        this.c.commit();
    }

    private void b(String str, String str2) {
        this.c.putString(str, str2);
        this.c.commit();
    }

    private boolean d(String str, boolean z) {
        try {
            return this.b.getBoolean(str, z);
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    private void e(String str, boolean z) {
        this.c.putBoolean(str, z);
        this.c.commit();
    }

    public String A() {
        return (String) a("deviceToken", a.STRING_VALUE, 0);
    }

    public void A(int i) {
        b("splashscreencolor", x1.a(i));
    }

    public void A(String str) {
        b("progressbar_font_typeface", str);
    }

    public String B() {
        return (String) a("devicetoken_gcmregid", a.STRING_VALUE, 0);
    }

    public void B(int i) {
        b("splashscreenfontcolor", x1.a(i));
    }

    public void B(String str) {
        b("progressbarlabel", str);
    }

    public int C() {
        return ((Integer) a("exitscreen_bgcolor", a.INT_VALUE, 0)).intValue();
    }

    public void C(int i) {
        b("table_first_column_color", i);
    }

    public void C(String str) {
        b("progressbartype", str);
    }

    public int D() {
        return ((Integer) a("exitscreen_font_color", a.INT_VALUE, 0)).intValue();
    }

    public void D(int i) {
        b("table_font_size", i);
    }

    public void D(String str) {
        b("serverimageurl", str);
    }

    public float E() {
        return ((Float) a("exit_letter_spacing", a.FLOAT_VALUE, 0)).floatValue();
    }

    public void E(int i) {
        b("table_font_style", i);
    }

    public void E(String str) {
        b("secureserverurl", str);
    }

    public int F() {
        return x1.a(this.a, ((Integer) a("exitscreen_font_size", a.INT_VALUE, 0)).intValue());
    }

    public void F(int i) {
        b("table_header_color", i);
    }

    public void F(String str) {
        b("serverurl", str);
    }

    public int G() {
        return ((Integer) a("exitscreen_font_style", a.INT_VALUE, 0)).intValue();
    }

    public void G(int i) {
        b("table_lines_color", i);
    }

    public void G(String str) {
        b("serviceproxyurl", str);
    }

    public String H() {
        String str = (String) a("exitscreen_font_typeface", a.STRING_VALUE, 0);
        return TextUtils.isEmpty(str) ? y() : str;
    }

    public void H(int i) {
        b("table_first_row_color", i);
    }

    public void H(String str) {
        b("sessionid", str);
    }

    public int I() {
        return ((Integer) a("font_color", a.INT_VALUE, 0)).intValue();
    }

    public void I(int i) {
        int a2 = x1.a(i);
        J(1);
        b("title_bgcolor", a2);
    }

    public void I(String str) {
        b("table_font_typeface", str);
    }

    public float J() {
        return ((Float) a("font_letter_spacing", a.FLOAT_VALUE, 0)).floatValue();
    }

    public void J(int i) {
        b("title_bgcolor_set", i);
    }

    public void J(String str) {
        b("title_font_typeface", str);
    }

    public float K() {
        return ((Float) a("font_line_spacing", a.FLOAT_VALUE, 0)).floatValue();
    }

    public void K(int i) {
        int a2 = x1.a(i);
        L(1);
        b("title_font_color", a2);
    }

    public void K(String str) {
        b("uniqueid", str);
    }

    public int L() {
        return x1.a(this.a, ((Integer) a("font_size", a.INT_VALUE, -1)).intValue());
    }

    public void L(int i) {
        b("title_font_color_set", i);
    }

    public int M() {
        return ((Integer) a("font_style", a.INT_VALUE, -1)).intValue();
    }

    public void M(int i) {
        b("title_font_size", i);
    }

    public String N() {
        String str = (String) a("font_typeface", a.STRING_VALUE, 0);
        return TextUtils.isEmpty(str) ? y() : str;
    }

    public void N(int i) {
        b("title_font_style", i);
    }

    public String O() {
        return (String) a("regId", a.STRING_VALUE, 0);
    }

    public boolean P() {
        return d("gzipenabled", false);
    }

    public String Q() {
        return (String) a("language", a.STRING_VALUE, 0);
    }

    public int R() {
        return ((Integer) a("msgRecvd", a.INT_VALUE, 0)).intValue();
    }

    public int S() {
        return ((Integer) a("seed", a.INT_VALUE, 1)).intValue();
    }

    public String T() {
        return (String) a("pbarlabelalign", a.STRING_VALUE, 0);
    }

    public int U() {
        return ((Integer) a("page_default_bg_color", a.INT_VALUE, 0)).intValue();
    }

    public String V() {
        String str = (String) a("platform", a.STRING_VALUE, 0);
        return (TextUtils.isEmpty(str) || str.equals("0")) ? "android" : str;
    }

    public String W() {
        String str = (String) a("prestarturl", a.STRING_VALUE, 0);
        if (str == null || !str.equals("0")) {
            return str;
        }
        return null;
    }

    public int X() {
        return ((Integer) a("progressbar_bgcolor", a.INT_VALUE, 0)).intValue();
    }

    public int Y() {
        return ((Integer) a("progressbar_font_color", a.INT_VALUE, 0)).intValue();
    }

    public int Z() {
        return x1.a(this.a, ((Integer) a("progressbar_font_size", a.INT_VALUE, 0)).intValue());
    }

    public int a(String str) {
        return ((Integer) a(str, a.INT_VALUE, 0)).intValue();
    }

    public String a() {
        return (String) a("default_font_color_set", a.STRING_VALUE, 0);
    }

    public void a(float f) {
        a("default_letter_spacing", f);
    }

    public void a(int i) {
        int a2 = x1.a(i);
        h("true");
        b("default_font_bgcolor", a2);
    }

    public void a(long j) {
        a("sessiontimeout", j);
    }

    public void a(String str, int i) {
        b(str, i);
    }

    public void a(String str, String str2) {
        b(str, str2);
    }

    public void a(String str, boolean z) {
        e(z);
        b("domainurl", str);
    }

    public void a(boolean z) {
        e("background", z);
    }

    public int a0() {
        return ((Integer) a("progressbar_font_style", a.INT_VALUE, 0)).intValue();
    }

    public int b(String str) {
        return ((Integer) a(str, a.INT_VALUE, -1)).intValue();
    }

    public String b() {
        return (String) a("exitscreen_bgcolor_set", a.STRING_VALUE, 0);
    }

    public void b(float f) {
        a("default_line_spacing", f);
    }

    public void b(int i) {
        int a2 = x1.a(i);
        i("true");
        b("default_font_color", a2);
    }

    public void b(long j) {
        a("splashtd", j);
    }

    public void b(String str, boolean z) {
        e(z);
        b("ipurl", str);
    }

    public void b(boolean z) {
        e("interrupt", z);
    }

    public String b0() {
        String str = (String) a("progressbar_font_typeface", a.STRING_VALUE, 0);
        return TextUtils.isEmpty(str) ? y() : str;
    }

    public String c() {
        return (String) a("exitscreen_font_color_set", a.STRING_VALUE, 0);
    }

    public String c(String str) {
        String str2 = (String) a(str, a.STRING_VALUE, 0);
        return (str2 == null || !str2.contains("\\n")) ? str2 : str2.replace("\\n", "");
    }

    public void c(float f) {
        a("exit_letter_spacing", f);
    }

    public void c(int i) {
        b("default_font_size", i);
    }

    public void c(String str, boolean z) {
        e(str, z);
    }

    public void c(boolean z) {
        e("token", z);
    }

    public String c0() {
        return (String) a("progressbarlabel", a.STRING_VALUE, 0);
    }

    public int d(String str) {
        return ((Integer) a(str, a.INT_VALUE, -1)).intValue();
    }

    public String d() {
        return (String) a("exitscreen_font_size_set", a.STRING_VALUE, 0);
    }

    public void d(float f) {
        a("exit_line_spacing", f);
    }

    public void d(int i) {
        b("default_font_style", i);
    }

    public void d(boolean z) {
        e("gzipenabled", z);
    }

    public String d0() {
        return (String) a("progressbartype", a.STRING_VALUE, 0);
    }

    public String e() {
        return (String) a("exitscreen_font_style_set", a.STRING_VALUE, 0);
    }

    public String e(String str) {
        return (String) a(str, a.STRING_VALUE, 0);
    }

    public void e(float f) {
        a("font_letter_spacing", f);
    }

    public void e(int i) {
        int a2 = x1.a(i);
        x("true");
        b("page_default_bg_color", a2);
    }

    public void e(boolean z) {
        e("ipdomainset", z);
    }

    public boolean e0() {
        return d("ssl", false);
    }

    public String f() {
        return (String) a("font_color_set", a.STRING_VALUE, 0);
    }

    public void f(float f) {
        a("font_line_spacing", f);
    }

    public void f(int i) {
        b("defaultselcolor", x1.a(i));
    }

    public void f(boolean z) {
        e("ocr", z);
    }

    public boolean f(String str) {
        return d(str, false);
    }

    public int f0() {
        Integer num = -1;
        try {
            if (1 == i()) {
                Integer num2 = (Integer) a("selectioncolor", a.INT_VALUE, 0);
                try {
                    num = Integer.valueOf(num2.intValue());
                } catch (Exception unused) {
                    num = num2;
                }
            } else {
                num = Integer.valueOf(z());
            }
        } catch (Exception unused2) {
        }
        return num.intValue();
    }

    public void g(float f) {
        a("pbar_font_letter_spacing", f);
    }

    public void g(int i) {
        int a2 = x1.a(i);
        m("true");
        b("exitscreen_bgcolor", a2);
    }

    public void g(String str) {
        b("buildVer", str);
    }

    public void g(boolean z) {
        e("ssl", z);
    }

    public boolean g() {
        return d("ipdomainset", false);
    }

    public String g0() {
        return (String) a("sessionid", a.STRING_VALUE, 0);
    }

    public String h() {
        return (String) a("page_default_bg_color_set", a.STRING_VALUE, 0);
    }

    public void h(float f) {
        a("pbar_font_line_spacing", f);
    }

    public void h(int i) {
        int a2 = x1.a(i);
        n("true");
        b("exitscreen_font_color", a2);
    }

    public void h(String str) {
        b("default_font_bgcolor_set", str);
    }

    public int h0() {
        return ((Integer) a("sessionreset", a.INT_VALUE, 0)).intValue();
    }

    public int i() {
        return Integer.valueOf(((Integer) a("selection_color_set", a.INT_VALUE, 0)).intValue()).intValue();
    }

    public void i(float f) {
        a("splashscreenfontls", f);
    }

    public void i(int i) {
        o("true");
        b("exitscreen_font_size", i);
    }

    public void i(String str) {
        b("default_font_color_set", str);
    }

    public int i0() {
        return ((Integer) a("sound", a.INT_VALUE, -1)).intValue();
    }

    public int j() {
        return ((Integer) a("title_font_color_set", a.INT_VALUE, 0)).intValue();
    }

    public void j(float f) {
        a("splashscreenfont_line_spacing", f);
    }

    public void j(int i) {
        p("true");
        b("exitscreen_font_style", i);
    }

    public void j(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Poppins-Regular.ttf";
        }
        b("default_font_typeface", str);
    }

    public int j0() {
        return ((Integer) a("splashscreencolor", a.INT_VALUE, -1)).intValue();
    }

    public void k() {
        this.c.clear();
        this.c.commit();
    }

    public void k(float f) {
        a("table_font_ls", f);
    }

    public void k(int i) {
        int a2 = x1.a(i);
        r("true");
        b("font_bgcolor", a2);
    }

    public void k(String str) {
        b("deviceToken", str);
    }

    public int k0() {
        return ((Integer) a("splashscreenfontcolor", a.INT_VALUE, -1)).intValue();
    }

    public void l() {
        L("font_bgcolor");
        L("font_bgcolor_set");
    }

    public void l(float f) {
        a("table_font_line_spacing", f);
    }

    public void l(int i) {
        b("font_color", x1.a(i));
    }

    public void l(String str) {
        b("devicetoken_gcmregid", str);
    }

    public long l0() {
        return ((Long) a("splashtd", a.LONG_VALUE, -1)).longValue();
    }

    public void m() {
        L("font_color");
        L("font_color_set");
    }

    public void m(float f) {
        a("title_font_ls", f);
    }

    public void m(int i) {
        b("font_size", i);
    }

    public void m(String str) {
        b("exitscreen_bgcolor_set", str);
    }

    public int m0() {
        return x1.a(this.a, ((Integer) a("table_font_size", a.INT_VALUE, 0)).intValue());
    }

    public void n() {
        L("font_size");
    }

    public void n(float f) {
        a("title_font_line_spacing", f);
    }

    public void n(int i) {
        b("font_style", i);
    }

    public void n(String str) {
        b("exitscreen_font_color_set", str);
    }

    public int n0() {
        return ((Integer) a("title_bgcolor", a.INT_VALUE, 0)).intValue();
    }

    public void o() {
        L("font_style");
    }

    public void o(int i) {
        b("keepregistered", i);
    }

    public void o(String str) {
        b("exitscreen_font_size_set", str);
    }

    public int o0() {
        return ((Integer) a("title_font_color", a.INT_VALUE, 0)).intValue();
    }

    public void p() {
        L("selectioncolor");
        L("selection_color_set");
    }

    public void p(int i) {
        b("iniversion", i);
    }

    public void p(String str) {
        b("exitscreen_font_style_set", str);
    }

    public int p0() {
        return x1.a(this.a, ((Integer) a("title_font_size", a.INT_VALUE, -1)).intValue());
    }

    public long q() {
        return ((Long) a("sessiontimeout", a.LONG_VALUE, 0)).longValue();
    }

    public void q(int i) {
        b("msgRecvd", i);
    }

    public void q(String str) {
        b("exitscreen_font_typeface", str);
    }

    public int q0() {
        return ((Integer) a("title_font_style", a.INT_VALUE, -1)).intValue();
    }

    public String r() {
        String str = (String) a("buildVer", a.STRING_VALUE, 0);
        if (TextUtils.isEmpty(str) || !str.equals("0")) {
            return str;
        }
        return null;
    }

    public void r(int i) {
        b("seed", i);
    }

    public void r(String str) {
        b("font_bgcolor_set", str);
    }

    public String r0() {
        String str = (String) a("title_font_typeface", a.STRING_VALUE, 0);
        return TextUtils.isEmpty(str) ? y() : str;
    }

    public int s() {
        return ((Integer) a("default_font_bgcolor", a.INT_VALUE, 0)).intValue();
    }

    public void s(int i) {
        b("progressbar_bgcolor", x1.a(i));
    }

    public void s(String str) {
        b("font_color_set", str);
    }

    public String s0() {
        return (String) a("uniqueid", a.STRING_VALUE, 0);
    }

    public int t() {
        return ((Integer) a("default_font_color", a.INT_VALUE, 0)).intValue();
    }

    public void t(int i) {
        b("progressbar_font_color", x1.a(i));
    }

    public void t(String str) {
        b("font_typeface", str);
    }

    public boolean t0() {
        return d("background", false);
    }

    public float u() {
        return ((Float) a("default_letter_spacing", a.FLOAT_VALUE, 0)).floatValue();
    }

    public void u(int i) {
        b("progressbar_font_size", i);
    }

    public void u(String str) {
        b("regId", str);
    }

    public boolean u0() {
        return d("interrupt", false);
    }

    public float v() {
        return ((Float) a("default_line_spacing", a.FLOAT_VALUE, 0)).floatValue();
    }

    public void v(int i) {
        b("progressbar_font_style", i);
    }

    public void v(String str) {
        b("group", str);
    }

    public boolean v0() {
        return d("token", false);
    }

    public int w() {
        return x1.a(this.a, ((Integer) a("default_font_size", a.INT_VALUE, nj.a)).intValue());
    }

    public void w(int i) {
        int a2 = x1.a(i);
        x(1);
        b("selectioncolor", a2);
    }

    public void w(String str) {
        b("language", str);
    }

    public boolean w0() {
        return d("geofenceservice", false);
    }

    public int x() {
        return ((Integer) a("default_font_style", a.INT_VALUE, -1)).intValue();
    }

    public void x(int i) {
        b("selection_color_set", i);
    }

    public void x(String str) {
        b("page_default_bg_color_set", str);
    }

    public String y() {
        String str = (String) a("default_font_typeface", a.STRING_VALUE, 0);
        return TextUtils.isEmpty(str) ? "Poppins-Regular.ttf" : str;
    }

    public void y(int i) {
        b("sessionreset", i);
    }

    public void y(String str) {
        b("platform", str);
    }

    public int z() {
        Integer num;
        try {
            num = Integer.valueOf(((Integer) a("defaultselcolor", a.INT_VALUE, 0)).intValue());
        } catch (Exception unused) {
            num = -7829368;
        }
        return num.intValue();
    }

    public void z(int i) {
        b("sound", i);
    }

    public void z(String str) {
        b("prestarturl", str);
    }
}
