package ir.tapsell.sdk.utils;

import android.text.Html;
import defpackage.h50;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class k {
    public static String a(String str) {
        return str == null ? "" : Html.fromHtml(str).toString();
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        String str = "?";
        while (true) {
            sb.append(str);
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                sb.append(URLEncoder.encode(next.getKey(), "UTF-8"));
                sb.append("=");
                String value = next.getValue();
                String value2 = next.getValue();
                if (value != null) {
                    value2 = URLEncoder.encode(value2, "UTF-8");
                }
                sb.append(value2);
                if (it.hasNext()) {
                    break;
                }
            }
            String sb2 = sb.toString();
            h50.a(true, "Tools", "QueryParams: " + sb2);
            return sb2;
            str = "&";
        }
    }
}
