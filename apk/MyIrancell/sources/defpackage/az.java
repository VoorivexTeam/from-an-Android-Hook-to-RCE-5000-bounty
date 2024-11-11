package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class az extends py {
    private static final Pattern e = Pattern.compile("BEGIN:VCARD", 2);
    private static final Pattern f = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");
    private static final Pattern g = Pattern.compile("\r\n[ \t]");
    private static final Pattern h = Pattern.compile("\\\\[nN]");
    private static final Pattern i = Pattern.compile("\\\\([,;\\\\])");
    private static final Pattern j = Pattern.compile("=");
    private static final Pattern k = Pattern.compile(";");
    private static final Pattern l = Pattern.compile("(?<!\\\\);+");
    private static final Pattern m = Pattern.compile(",");
    private static final Pattern n = Pattern.compile("[;,]");

    private static String a(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < length) {
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 != '\n' && charAt2 != '\r') {
                if (charAt2 != '=') {
                    a(byteArrayOutputStream, str, sb);
                    sb.append(charAt2);
                } else if (i2 < length - 2 && (charAt = charSequence.charAt(i2 + 1)) != '\r' && charAt != '\n') {
                    i2 += 2;
                    char charAt3 = charSequence.charAt(i2);
                    int a = py.a(charAt);
                    int a2 = py.a(charAt3);
                    if (a >= 0 && a2 >= 0) {
                        byteArrayOutputStream.write((a << 4) + a2);
                    }
                }
            }
            i2++;
        }
        a(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    private static String a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> a(CharSequence charSequence, String str, boolean z, boolean z2) {
        List<List<String>> b = b(charSequence, str, z, z2);
        if (b == null || b.isEmpty()) {
            return null;
        }
        return b.get(0);
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
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

    private static void a(Iterable<List<String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i2 = 0;
                int i3 = 0;
                while (i2 < 4 && (indexOf = str.indexOf(59, i3)) >= 0) {
                    strArr[i2] = str.substring(i3, indexOf);
                    i2++;
                    i3 = indexOf + 1;
                }
                strArr[i2] = str.substring(i3);
                StringBuilder sb = new StringBuilder(100);
                a(strArr, 3, sb);
                a(strArr, 1, sb);
                a(strArr, 2, sb);
                a(strArr, 0, sb);
                a(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    private static void a(String[] strArr, int i2, StringBuilder sb) {
        if (strArr[i2] == null || strArr[i2].isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(' ');
        }
        sb.append(strArr[i2]);
    }

    private static boolean a(CharSequence charSequence) {
        return charSequence == null || f.matcher(charSequence).matches();
    }

    private static String[] a(Collection<List<String>> collection) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.util.List<java.lang.String>> b(java.lang.CharSequence r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.b(java.lang.CharSequence, java.lang.String, boolean, boolean):java.util.List");
    }

    private static String[] b(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            int i2 = 1;
            while (true) {
                if (i2 >= list.size()) {
                    str = null;
                    break;
                }
                str = list.get(i2);
                int indexOf = str.indexOf(61);
                if (indexOf >= 0) {
                    if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                        str = str.substring(indexOf + 1);
                        break;
                    }
                    i2++;
                }
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    @Override // defpackage.py
    public yx a(fw fwVar) {
        String b = py.b(fwVar);
        Matcher matcher = e.matcher(b);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> b2 = b((CharSequence) "FN", b, true, false);
        if (b2 == null) {
            b2 = b((CharSequence) "N", b, true, false);
            a((Iterable<List<String>>) b2);
        }
        List<String> a = a((CharSequence) "NICKNAME", b, true, false);
        String[] split = a == null ? null : m.split(a.get(0));
        List<List<String>> b3 = b((CharSequence) "TEL", b, true, false);
        List<List<String>> b4 = b((CharSequence) "EMAIL", b, true, false);
        List<String> a2 = a((CharSequence) "NOTE", b, false, false);
        List<List<String>> b5 = b((CharSequence) "ADR", b, true, true);
        List<String> a3 = a((CharSequence) "ORG", b, true, true);
        List<String> a4 = a((CharSequence) "BDAY", b, true, false);
        List<String> list = (a4 == null || a((CharSequence) a4.get(0))) ? a4 : null;
        List<String> a5 = a((CharSequence) "TITLE", b, true, false);
        List<List<String>> b6 = b((CharSequence) "URL", b, true, false);
        List<String> a6 = a((CharSequence) "IMPP", b, true, false);
        List<String> a7 = a((CharSequence) "GEO", b, true, false);
        String[] split2 = a7 == null ? null : n.split(a7.get(0));
        return new yx(a((Collection<List<String>>) b2), split, null, a((Collection<List<String>>) b3), b(b3), a((Collection<List<String>>) b4), b(b4), a(a6), a(a2), a((Collection<List<String>>) b5), b(b5), a(a3), a(list), a(a5), a((Collection<List<String>>) b6), (split2 == null || split2.length == 2) ? split2 : null);
    }
}
