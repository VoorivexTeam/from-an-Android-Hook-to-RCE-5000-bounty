package p000;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: az */
/* loaded from: classes.dex */
public final class C0441az extends AbstractC3102py {

    /* renamed from: e */
    private static final Pattern f2654e = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: f */
    private static final Pattern f2655f = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: g */
    private static final Pattern f2656g = Pattern.compile("\r\n[ \t]");

    /* renamed from: h */
    private static final Pattern f2657h = Pattern.compile("\\\\[nN]");

    /* renamed from: i */
    private static final Pattern f2658i = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: j */
    private static final Pattern f2659j = Pattern.compile("=");

    /* renamed from: k */
    private static final Pattern f2660k = Pattern.compile(";");

    /* renamed from: l */
    private static final Pattern f2661l = Pattern.compile("(?<!\\\\);+");

    /* renamed from: m */
    private static final Pattern f2662m = Pattern.compile(",");

    /* renamed from: n */
    private static final Pattern f2663n = Pattern.compile("[;,]");

    /* renamed from: a */
    private static String m3203a(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 != '\n' && charAt2 != '\r') {
                if (charAt2 != '=') {
                    m3206a(byteArrayOutputStream, str, sb);
                    sb.append(charAt2);
                } else if (i < length - 2 && (charAt = charSequence.charAt(i + 1)) != '\r' && charAt != '\n') {
                    i += 2;
                    char charAt3 = charSequence.charAt(i);
                    int m14842a = AbstractC3102py.m14842a(charAt);
                    int m14842a2 = AbstractC3102py.m14842a(charAt3);
                    if (m14842a >= 0 && m14842a2 >= 0) {
                        byteArrayOutputStream.write((m14842a << 4) + m14842a2);
                    }
                }
            }
            i++;
        }
        m3206a(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m3204a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<String> m3205a(CharSequence charSequence, String str, boolean z, boolean z2) {
        List<List<String>> m3211b = m3211b(charSequence, str, z, z2);
        if (m3211b == null || m3211b.isEmpty()) {
            return null;
        }
        return m3211b.get(0);
    }

    /* renamed from: a */
    private static void m3206a(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, Charset.forName("UTF-8"));
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, Charset.forName("UTF-8"));
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    /* renamed from: a */
    private static void m3207a(Iterable<List<String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i = 0;
                int i2 = 0;
                while (i < 4 && (indexOf = str.indexOf(59, i2)) >= 0) {
                    strArr[i] = str.substring(i2, indexOf);
                    i++;
                    i2 = indexOf + 1;
                }
                strArr[i] = str.substring(i2);
                StringBuilder sb = new StringBuilder(100);
                m3208a(strArr, 3, sb);
                m3208a(strArr, 1, sb);
                m3208a(strArr, 2, sb);
                m3208a(strArr, 0, sb);
                m3208a(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    /* renamed from: a */
    private static void m3208a(String[] strArr, int i, StringBuilder sb) {
        if (strArr[i] == null || strArr[i].isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(' ');
        }
        sb.append(strArr[i]);
    }

    /* renamed from: a */
    private static boolean m3209a(CharSequence charSequence) {
        return charSequence == null || f2655f.matcher(charSequence).matches();
    }

    /* renamed from: a */
    private static String[] m3210a(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<List<String>> it = collection.iterator();
        while (it.hasNext()) {
            String str = it.next().get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        r2 = r1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.util.List<java.lang.String>> m3211b(java.lang.CharSequence r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0441az.m3211b(java.lang.CharSequence, java.lang.String, boolean, boolean):java.util.List");
    }

    /* renamed from: b */
    private static String[] m3212b(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    str = null;
                    break;
                }
                str = list.get(i);
                int indexOf = str.indexOf(61);
                if (indexOf >= 0) {
                    if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                        str = str.substring(indexOf + 1);
                        break;
                    }
                    i++;
                }
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    @Override // p000.AbstractC3102py
    /* renamed from: a */
    public C3503yx mo3202a(C2488fw c2488fw) {
        String m14848b = AbstractC3102py.m14848b(c2488fw);
        Matcher matcher = f2654e.matcher(m14848b);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> m3211b = m3211b((CharSequence) "FN", m14848b, true, false);
        if (m3211b == null) {
            m3211b = m3211b((CharSequence) "N", m14848b, true, false);
            m3207a((Iterable<List<String>>) m3211b);
        }
        List<String> m3205a = m3205a((CharSequence) "NICKNAME", m14848b, true, false);
        String[] split = m3205a == null ? null : f2662m.split(m3205a.get(0));
        List<List<String>> m3211b2 = m3211b((CharSequence) "TEL", m14848b, true, false);
        List<List<String>> m3211b3 = m3211b((CharSequence) "EMAIL", m14848b, true, false);
        List<String> m3205a2 = m3205a((CharSequence) "NOTE", m14848b, false, false);
        List<List<String>> m3211b4 = m3211b((CharSequence) "ADR", m14848b, true, true);
        List<String> m3205a3 = m3205a((CharSequence) "ORG", m14848b, true, true);
        List<String> m3205a4 = m3205a((CharSequence) "BDAY", m14848b, true, false);
        List<String> list = (m3205a4 == null || m3209a((CharSequence) m3205a4.get(0))) ? m3205a4 : null;
        List<String> m3205a5 = m3205a((CharSequence) "TITLE", m14848b, true, false);
        List<List<String>> m3211b5 = m3211b((CharSequence) "URL", m14848b, true, false);
        List<String> m3205a6 = m3205a((CharSequence) "IMPP", m14848b, true, false);
        List<String> m3205a7 = m3205a((CharSequence) "GEO", m14848b, true, false);
        String[] split2 = m3205a7 == null ? null : f2663n.split(m3205a7.get(0));
        return new C3503yx(m3210a((Collection<List<String>>) m3211b), split, null, m3210a((Collection<List<String>>) m3211b2), m3212b(m3211b2), m3210a((Collection<List<String>>) m3211b3), m3212b(m3211b3), m3204a(m3205a6), m3204a(m3205a2), m3210a((Collection<List<String>>) m3211b4), m3212b(m3211b4), m3204a(m3205a3), m3204a(list), m3204a(m3205a5), m3210a((Collection<List<String>>) m3211b5), (split2 == null || split2.length == 2) ? split2 : null);
    }
}
