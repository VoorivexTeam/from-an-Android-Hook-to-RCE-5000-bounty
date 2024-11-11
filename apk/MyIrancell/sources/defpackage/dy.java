package defpackage;

import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class dy extends py {
    private static final Pattern e = Pattern.compile(",");

    @Override // defpackage.py
    public cy a(fw fwVar) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str;
        String str2;
        String str3;
        String b = py.b(fwVar);
        if (!b.startsWith("mailto:") && !b.startsWith("MAILTO:")) {
            if (ey.e(b)) {
                return new cy(b);
            }
            return null;
        }
        String substring = b.substring(7);
        int indexOf = substring.indexOf(63);
        if (indexOf >= 0) {
            substring = substring.substring(0, indexOf);
        }
        String d = py.d(substring);
        String[] split = !d.isEmpty() ? e.split(d) : null;
        Map<String, String> b2 = py.b(b);
        if (b2 != null) {
            if (split == null && (str3 = b2.get("to")) != null) {
                split = e.split(str3);
            }
            String str4 = b2.get("cc");
            String[] split2 = str4 != null ? e.split(str4) : null;
            String str5 = b2.get("bcc");
            String[] split3 = str5 != null ? e.split(str5) : null;
            String str6 = b2.get("subject");
            str2 = b2.get("body");
            strArr = split;
            strArr3 = split3;
            strArr2 = split2;
            str = str6;
        } else {
            strArr = split;
            strArr2 = null;
            strArr3 = null;
            str = null;
            str2 = null;
        }
        return new cy(strArr, strArr2, strArr3, str, str2);
    }
}
