package p000;

import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: dy */
/* loaded from: classes.dex */
public final class C2406dy extends AbstractC3102py {

    /* renamed from: e */
    private static final Pattern f9883e = Pattern.compile(",");

    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C2363cy mo3202a(C2488fw c2488fw) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str;
        String str2;
        String str3;
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        if (!m14848b.startsWith("mailto:") && !m14848b.startsWith("MAILTO:")) {
            if (C2449ey.m11640e(m14848b)) {
                return new C2363cy(m14848b);
            }
            return null;
        }
        String substring = m14848b.substring(7);
        int indexOf = substring.indexOf(63);
        if (indexOf >= 0) {
            substring = substring.substring(0, indexOf);
        }
        String m14854d = AbstractC3102py.m14854d(substring);
        String[] split = !m14854d.isEmpty() ? f9883e.split(m14854d) : null;
        Map<String, String> m14850b = AbstractC3102py.m14850b(m14848b);
        if (m14850b != null) {
            if (split == null && (str3 = m14850b.get("to")) != null) {
                split = f9883e.split(str3);
            }
            String str4 = m14850b.get("cc");
            String[] split2 = str4 != null ? f9883e.split(str4) : null;
            String str5 = m14850b.get("bcc");
            String[] split3 = str5 != null ? f9883e.split(str5) : null;
            String str6 = m14850b.get("subject");
            str2 = m14850b.get("body");
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
        return new C2363cy(strArr, strArr2, strArr3, str, str2);
    }
}
