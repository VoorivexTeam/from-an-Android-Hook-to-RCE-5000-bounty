package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.widget.Toast;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* loaded from: classes.dex */
public class y1 {
    public static String a;
    public static String b;
    private static wj c;
    private static String d;
    private static yj e;
    private static e f;
    private static mj g;
    public static lj h;

    public static String a(Context context, wj wjVar, mj mjVar, lj ljVar, String str, yj yjVar, e eVar) {
        String str2;
        c = wjVar;
        e = yjVar;
        f = eVar;
        g = mjVar;
        h = ljVar;
        for (String str3 : str.split("&")) {
            String[] split = str3.split("=");
            if (split.length > 1) {
                if (split[0].trim().equalsIgnoreCase("delimiter")) {
                    d = split[1].trim().substring(0, split[1].trim().length());
                } else if (split[0].trim().equalsIgnoreCase("text")) {
                    a = split[1].trim().substring(1, split[1].trim().length() - 1);
                } else if (split[0].trim().equalsIgnoreCase("action")) {
                    b = split[1].trim().substring(1, split[1].trim().length() - 1);
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
                    if (d != null) {
                        str2 = str2 + d;
                    }
                } catch (Exception unused) {
                }
            }
            if (d != null) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            if (a != null) {
                yj a2 = h.f().a(a, (Vector<yj>) null);
                if (a2 == null && h.f().r != null && h.f().r.containsKey(a)) {
                    h.f().a(a, str2);
                } else {
                    com.comviva.webaxn.ui.n1 n1Var = a2.a0;
                    if (n1Var != null) {
                        if (n1Var instanceof com.comviva.webaxn.ui.w) {
                            ((com.comviva.webaxn.ui.w) n1Var).h(str2);
                        } else if (n1Var instanceof com.comviva.webaxn.ui.v) {
                            ((com.comviva.webaxn.ui.v) n1Var).f(str2);
                        }
                    }
                }
            }
        }
        String str5 = b;
        if (str5 != null && !c.a(str5, false, e, f, g, h)) {
            yj yjVar2 = e;
            if (yjVar2 != null) {
                str4 = yjVar2.j;
            } else {
                e eVar2 = f;
                if (eVar2 != null) {
                    str4 = eVar2.j;
                }
            }
            String str6 = str4;
            xj a3 = x1.a(b, g.i());
            if (a3 != null) {
                g.a(a3);
            }
            c.a(b, false, false, g, false, false, str6, h);
        }
        return str2;
    }
}
