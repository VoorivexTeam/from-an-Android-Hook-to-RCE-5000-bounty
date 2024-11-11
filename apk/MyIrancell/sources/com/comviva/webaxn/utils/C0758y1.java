package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.widget.Toast;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.y1 */
/* loaded from: classes.dex */
public class C0758y1 {

    /* renamed from: a */
    public static String f5317a;

    /* renamed from: b */
    public static String f5318b;

    /* renamed from: c */
    private static C3400wj f5319c;

    /* renamed from: d */
    private static String f5320d;

    /* renamed from: e */
    private static C3489yj f5321e;

    /* renamed from: f */
    private static C0696e f5322f;

    /* renamed from: g */
    private static C2945mj f5323g;

    /* renamed from: h */
    public static C2899lj f5324h;

    /* renamed from: a */
    public static String m6222a(Context context, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str, C3489yj c3489yj, C0696e c0696e) {
        String str2;
        f5319c = c3400wj;
        f5321e = c3489yj;
        f5322f = c0696e;
        f5323g = c2945mj;
        f5324h = c2899lj;
        for (String str3 : str.split("&")) {
            String[] split = str3.split("=");
            if (split.length > 1) {
                if (split[0].trim().equalsIgnoreCase("delimiter")) {
                    f5320d = split[1].trim().substring(0, split[1].trim().length());
                } else if (split[0].trim().equalsIgnoreCase("text")) {
                    f5317a = split[1].trim().substring(1, split[1].trim().length() - 1);
                } else if (split[0].trim().equalsIgnoreCase("action")) {
                    f5318b = split[1].trim().substring(1, split[1].trim().length() - 1);
                }
            }
        }
        List<ScanResult> scanResults = ((WifiManager) context.getSystemService("wifi")).getScanResults();
        String str4 = null;
        if (scanResults == null || scanResults.size() <= 0) {
            Toast.makeText(context, "No results. Check wireless is on", 0).show();
            str2 = null;
        } else {
            Iterator<ScanResult> it = scanResults.iterator();
            str2 = null;
            while (it.hasNext()) {
                try {
                    str2 = str2 + it.next().SSID;
                    if (f5320d != null) {
                        str2 = str2 + f5320d;
                    }
                } catch (Exception unused) {
                }
            }
            if (f5320d != null) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            if (f5317a != null) {
                C3489yj m16930a = f5324h.m13901f().m16930a(f5317a, (Vector<C3489yj>) null);
                if (m16930a == null && f5324h.m13901f().f14519r != null && f5324h.m13901f().f14519r.containsKey(f5317a)) {
                    f5324h.m13901f().m16931a(f5317a, str2);
                } else {
                    AbstractC0652n1 abstractC0652n1 = m16930a.f14197a0;
                    if (abstractC0652n1 != null) {
                        if (abstractC0652n1 instanceof C0670w) {
                            ((C0670w) abstractC0652n1).m5093h(str2);
                        } else if (abstractC0652n1 instanceof C0668v) {
                            ((C0668v) abstractC0652n1).m5029f(str2);
                        }
                    }
                }
            }
        }
        String str5 = f5318b;
        if (str5 != null && !f5319c.m16298a(str5, false, f5321e, f5322f, f5323g, f5324h)) {
            C3489yj c3489yj2 = f5321e;
            if (c3489yj2 != null) {
                str4 = c3489yj2.f14223j;
            } else {
                C0696e c0696e2 = f5322f;
                if (c0696e2 != null) {
                    str4 = c0696e2.f4718j;
                }
            }
            String str6 = str4;
            C3440xj m6134a = C0755x1.m6134a(f5318b, f5323g.m14145i());
            if (m6134a != null) {
                f5323g.m14121a(m6134a);
            }
            f5319c.m16263a(f5318b, false, false, f5323g, false, false, str6, f5324h);
        }
        return str2;
    }
}
