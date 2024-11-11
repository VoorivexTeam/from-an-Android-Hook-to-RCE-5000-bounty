package p000;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: py */
/* loaded from: classes.dex */
public abstract class AbstractC3102py {

    /* renamed from: a */
    private static final AbstractC3102py[] f12644a = {new C0440ay(), new C3454xx(), new C2449ey(), new C3414wx(), new C0441az(), new C3545zx(), new C0498bz(), new C2406dy(), new C3279ty(), new C3376vy(), new C3144qy(), new C3227sy(), new C2792iy(), new C2491fz(), new C3546zy(), new C3504yy(), new C2877ky(), new C3063oy(), new C2530gy(), new C2407dz()};

    /* renamed from: b */
    private static final Pattern f12645b = Pattern.compile("\\d+");

    /* renamed from: c */
    private static final Pattern f12646c = Pattern.compile("&");

    /* renamed from: d */
    private static final Pattern f12647d = Pattern.compile("=");

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m14842a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    private static int m14843a(CharSequence charSequence, int i) {
        int i2 = 0;
        for (int i3 = i - 1; i3 >= 0 && charSequence.charAt(i3) == '\\'; i3--) {
            i2++;
        }
        return i2;
    }

    /* renamed from: a */
    private static void m14844a(CharSequence charSequence, Map<String, String> map) {
        String[] split = f12647d.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], m14854d(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static boolean m14845a(CharSequence charSequence, int i, int i2) {
        int i3;
        return charSequence != null && i2 > 0 && charSequence.length() >= (i3 = i2 + i) && f12645b.matcher(charSequence.subSequence(i, i3)).matches();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static String[] m14846a(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String[] m14847a(String str, String str2, char c, boolean z) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(str, i);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            ArrayList arrayList2 = arrayList;
            boolean z2 = true;
            int i2 = length2;
            while (z2) {
                int indexOf2 = str2.indexOf(c, i2);
                if (indexOf2 < 0) {
                    i2 = str2.length();
                } else if (m14843a(str2, indexOf2) % 2 != 0) {
                    i2 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String m14852c = m14852c(str2.substring(length2, indexOf2));
                    if (z) {
                        m14852c = m14852c.trim();
                    }
                    if (!m14852c.isEmpty()) {
                        arrayList2.add(m14852c);
                    }
                    i2 = indexOf2 + 1;
                }
                z2 = false;
            }
            i = i2;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static String m14848b(C2488fw c2488fw) {
        String m11842e = c2488fw.m11842e();
        return m11842e.startsWith("\ufeff") ? m11842e.substring(1) : m11842e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m14849b(String str, String str2, char c, boolean z) {
        String[] m14847a = m14847a(str, str2, c, z);
        if (m14847a == null) {
            return null;
        }
        return m14847a[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Map<String, String> m14850b(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String str2 : f12646c.split(str.substring(indexOf + 1))) {
            m14844a(str2, hashMap);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static boolean m14851b(CharSequence charSequence, int i) {
        return charSequence != null && i > 0 && i == charSequence.length() && f12645b.matcher(charSequence).matches();
    }

    /* renamed from: c */
    protected static String m14852c(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z || charAt != '\\') {
                sb.append(charAt);
                z = false;
            } else {
                z = true;
            }
            indexOf++;
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static AbstractC2914ly m14853c(C2488fw c2488fw) {
        for (AbstractC3102py abstractC3102py : f12644a) {
            AbstractC2914ly mo3202a = abstractC3102py.mo3202a(c2488fw);
            if (mo3202a != null) {
                return mo3202a;
            }
        }
        return new C3415wy(c2488fw.m11842e(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m14854d(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public abstract AbstractC2914ly mo3202a(C2488fw c2488fw);
}
