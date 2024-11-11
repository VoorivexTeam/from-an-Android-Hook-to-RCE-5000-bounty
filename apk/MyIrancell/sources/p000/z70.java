package p000;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import okio.Buffer;

/* loaded from: classes.dex */
public final class z70 {

    /* renamed from: j */
    private static final char[] f14354j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f14355a;

    /* renamed from: b */
    private final String f14356b;

    /* renamed from: c */
    private final String f14357c;

    /* renamed from: d */
    final String f14358d;

    /* renamed from: e */
    final int f14359e;

    /* renamed from: f */
    private final List<String> f14360f;

    /* renamed from: g */
    @Nullable
    private final List<String> f14361g;

    /* renamed from: h */
    @Nullable
    private final String f14362h;

    /* renamed from: i */
    private final String f14363i;

    /* renamed from: z70$a */
    /* loaded from: classes.dex */
    public static final class C3515a {

        /* renamed from: a */
        @Nullable
        String f14364a;

        /* renamed from: d */
        @Nullable
        String f14367d;

        /* renamed from: f */
        final List<String> f14369f;

        /* renamed from: g */
        @Nullable
        List<String> f14370g;

        /* renamed from: h */
        @Nullable
        String f14371h;

        /* renamed from: b */
        String f14365b = "";

        /* renamed from: c */
        String f14366c = "";

        /* renamed from: e */
        int f14368e = -1;

        public C3515a() {
            ArrayList arrayList = new ArrayList();
            this.f14369f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        private static String m16821a(String str, int i, int i2) {
            return o80.m14445a(z70.m16791a(str, i, i2, false));
        }

        /* renamed from: a */
        private void m16822a(String str, int i, int i2, boolean z, boolean z2) {
            String m16790a = z70.m16790a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (m16829f(m16790a)) {
                return;
            }
            if (m16830g(m16790a)) {
                m16825d();
                return;
            }
            if (this.f14369f.get(r11.size() - 1).isEmpty()) {
                this.f14369f.set(r11.size() - 1, m16790a);
            } else {
                this.f14369f.add(m16790a);
            }
            if (z) {
                this.f14369f.add("");
            }
        }

        /* renamed from: b */
        private static int m16823b(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(z70.m16790a(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        /* renamed from: c */
        private static int m16824c(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt != '[') {
                    i++;
                }
                do {
                    i++;
                    if (i < i2) {
                    }
                    i++;
                } while (str.charAt(i) != ']');
                i++;
            }
            return i2;
        }

        /* renamed from: d */
        private void m16825d() {
            if (!this.f14369f.remove(r0.size() - 1).isEmpty() || this.f14369f.isEmpty()) {
                this.f14369f.add("");
            } else {
                this.f14369f.set(r0.size() - 1, "");
            }
        }

        /* renamed from: d */
        private void m16826d(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.f14369f.clear();
                this.f14369f.add("");
                i++;
            } else {
                List<String> list = this.f14369f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = o80.m14441a(str, i3, i2, "/\\");
                boolean z = i < i2;
                m16822a(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        /* renamed from: e */
        private static int m16827e(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: f */
        private static int m16828f(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: f */
        private boolean m16829f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: g */
        private boolean m16830g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: a */
        public C3515a m16831a(int i) {
            if (i > 0 && i <= 65535) {
                this.f14368e = i;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        /* renamed from: a */
        public C3515a m16832a(@Nullable String str) {
            this.f14370g = str != null ? z70.m16803e(z70.m16792a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: a */
        public C3515a m16833a(String str, @Nullable String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f14370g == null) {
                this.f14370g = new ArrayList();
            }
            this.f14370g.add(z70.m16792a(str, " \"'<>#&=", true, false, true, true));
            this.f14370g.add(str2 != null ? z70.m16792a(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        /* renamed from: a */
        C3515a m16834a(@Nullable z70 z70Var, String str) {
            int m14441a;
            int i;
            int m14466b = o80.m14466b(str, 0, str.length());
            int m14472c = o80.m14472c(str, m14466b, str.length());
            int m16827e = m16827e(str, m14466b, m14472c);
            if (m16827e != -1) {
                if (str.regionMatches(true, m14466b, "https:", 0, 6)) {
                    this.f14364a = "https";
                    m14466b += 6;
                } else {
                    if (!str.regionMatches(true, m14466b, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, m16827e) + "'");
                    }
                    this.f14364a = "http";
                    m14466b += 5;
                }
            } else {
                if (z70Var == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f14364a = z70Var.f14355a;
            }
            int m16828f = m16828f(str, m14466b, m14472c);
            char c = '?';
            char c2 = '#';
            if (m16828f >= 2 || z70Var == null || !z70Var.f14355a.equals(this.f14364a)) {
                int i2 = m14466b + m16828f;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    m14441a = o80.m14441a(str, i2, m14472c, "@/\\?#");
                    char charAt = m14441a != m14472c ? str.charAt(m14441a) : (char) 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z) {
                            i = m14441a;
                            this.f14366c += "%40" + z70.m16790a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int m14440a = o80.m14440a(str, i2, m14441a, ':');
                            i = m14441a;
                            String m16790a = z70.m16790a(str, i2, m14440a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                m16790a = this.f14365b + "%40" + m16790a;
                            }
                            this.f14365b = m16790a;
                            if (m14440a != i) {
                                this.f14366c = z70.m16790a(str, m14440a + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        }
                        i2 = i + 1;
                    }
                    c = '?';
                    c2 = '#';
                }
                int m16824c = m16824c(str, i2, m14441a);
                int i3 = m16824c + 1;
                if (i3 < m14441a) {
                    this.f14367d = m16821a(str, i2, m16824c);
                    int m16823b = m16823b(str, i3, m14441a);
                    this.f14368e = m16823b;
                    if (m16823b == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i3, m14441a) + '\"');
                    }
                } else {
                    this.f14367d = m16821a(str, i2, m16824c);
                    this.f14368e = z70.m16801c(this.f14364a);
                }
                if (this.f14367d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i2, m16824c) + '\"');
                }
                m14466b = m14441a;
            } else {
                this.f14365b = z70Var.m16811f();
                this.f14366c = z70Var.m16806b();
                this.f14367d = z70Var.f14358d;
                this.f14368e = z70Var.f14359e;
                this.f14369f.clear();
                this.f14369f.addAll(z70Var.m16809d());
                if (m14466b == m14472c || str.charAt(m14466b) == '#') {
                    m16832a(z70Var.m16810e());
                }
            }
            int m14441a2 = o80.m14441a(str, m14466b, m14472c, "?#");
            m16826d(str, m14466b, m14441a2);
            if (m14441a2 < m14472c && str.charAt(m14441a2) == '?') {
                int m14440a2 = o80.m14440a(str, m14441a2, m14472c, '#');
                this.f14370g = z70.m16803e(z70.m16790a(str, m14441a2 + 1, m14440a2, " \"'<>#", true, false, true, true, null));
                m14441a2 = m14440a2;
            }
            if (m14441a2 < m14472c && str.charAt(m14441a2) == '#') {
                this.f14371h = z70.m16790a(str, 1 + m14441a2, m14472c, "", true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: a */
        public z70 m16835a() {
            if (this.f14364a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f14367d != null) {
                return new z70(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* renamed from: b */
        int m16836b() {
            int i = this.f14368e;
            return i != -1 ? i : z70.m16801c(this.f14364a);
        }

        /* renamed from: b */
        public C3515a m16837b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String m16821a = m16821a(str, 0, str.length());
            if (m16821a != null) {
                this.f14367d = m16821a;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* renamed from: b */
        public C3515a m16838b(String str, @Nullable String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.f14370g == null) {
                this.f14370g = new ArrayList();
            }
            this.f14370g.add(z70.m16792a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.f14370g.add(str2 != null ? z70.m16792a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        /* renamed from: c */
        C3515a m16839c() {
            int size = this.f14369f.size();
            for (int i = 0; i < size; i++) {
                this.f14369f.set(i, z70.m16792a(this.f14369f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f14370g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f14370g.get(i2);
                    if (str != null) {
                        this.f14370g.set(i2, z70.m16792a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f14371h;
            if (str2 != null) {
                this.f14371h = z70.m16792a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: c */
        public C3515a m16840c(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f14366c = z70.m16792a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: d */
        public C3515a m16841d(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            String str2 = "http";
            if (!str.equalsIgnoreCase("http")) {
                str2 = "https";
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f14364a = str2;
            return this;
        }

        /* renamed from: e */
        public C3515a m16842e(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f14365b = z70.m16792a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f14364a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f14365b.isEmpty() || !this.f14366c.isEmpty()) {
                sb.append(this.f14365b);
                if (!this.f14366c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f14366c);
                }
                sb.append('@');
            }
            String str3 = this.f14367d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f14367d);
                    sb.append(']');
                } else {
                    sb.append(this.f14367d);
                }
            }
            if (this.f14368e != -1 || this.f14364a != null) {
                int m16836b = m16836b();
                String str4 = this.f14364a;
                if (str4 == null || m16836b != z70.m16801c(str4)) {
                    sb.append(':');
                    sb.append(m16836b);
                }
            }
            z70.m16800b(sb, this.f14369f);
            if (this.f14370g != null) {
                sb.append('?');
                z70.m16796a(sb, this.f14370g);
            }
            if (this.f14371h != null) {
                sb.append('#');
                sb.append(this.f14371h);
            }
            return sb.toString();
        }
    }

    z70(C3515a c3515a) {
        this.f14355a = c3515a.f14364a;
        this.f14356b = m16794a(c3515a.f14365b, false);
        this.f14357c = m16794a(c3515a.f14366c, false);
        this.f14358d = c3515a.f14367d;
        this.f14359e = c3515a.m16836b();
        this.f14360f = m16795a(c3515a.f14369f, false);
        List<String> list = c3515a.f14370g;
        this.f14361g = list != null ? m16795a(list, true) : null;
        String str = c3515a.f14371h;
        this.f14362h = str != null ? m16794a(str, false) : null;
        this.f14363i = c3515a.toString();
    }

    /* renamed from: a */
    static String m16790a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m16799a(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            Buffer buffer = new Buffer();
            buffer.writeUtf8(str, i, i3);
            m16797a(buffer, str, i3, i2, str2, z, z2, z3, z4, charset);
            return buffer.readUtf8();
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static String m16791a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i, i3);
                m16798a(buffer, str, i3, i2, z);
                return buffer.readUtf8();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static String m16792a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m16790a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m16793a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m16790a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: a */
    static String m16794a(String str, boolean z) {
        return m16791a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m16795a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m16794a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static void m16796a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: a */
    static void m16797a(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        Buffer buffer2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    buffer.writeUtf8(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m16799a(str, i, i2)))))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    if (charset == null || charset.equals(o80.f12435i)) {
                        buffer2.writeUtf8CodePoint(codePointAt);
                    } else {
                        buffer2.writeString(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!buffer2.exhausted()) {
                        int readByte = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        buffer.writeByte((int) f14354j[(readByte >> 4) & 15]);
                        buffer.writeByte((int) f14354j[readByte & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static void m16798a(Buffer buffer, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt != 37 || (i3 = i + 2) >= i2) {
                if (codePointAt == 43 && z) {
                    buffer.writeByte(32);
                }
                buffer.writeUtf8CodePoint(codePointAt);
            } else {
                int m14439a = o80.m14439a(str.charAt(i + 1));
                int m14439a2 = o80.m14439a(str.charAt(i3));
                if (m14439a != -1 && m14439a2 != -1) {
                    buffer.writeByte((m14439a << 4) + m14439a2);
                    i = i3;
                }
                buffer.writeUtf8CodePoint(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static boolean m16799a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && o80.m14439a(str.charAt(i + 1)) != -1 && o80.m14439a(str.charAt(i3)) != -1;
    }

    /* renamed from: b */
    static void m16800b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: c */
    public static int m16801c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: d */
    public static z70 m16802d(String str) {
        C3515a c3515a = new C3515a();
        c3515a.m16834a((z70) null, str);
        return c3515a.m16835a();
    }

    /* renamed from: e */
    static List<String> m16803e(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: a */
    public String m16804a() {
        if (this.f14362h == null) {
            return null;
        }
        return this.f14363i.substring(this.f14363i.indexOf(35) + 1);
    }

    @Nullable
    /* renamed from: a */
    public C3515a m16805a(String str) {
        try {
            C3515a c3515a = new C3515a();
            c3515a.m16834a(this, str);
            return c3515a;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String m16806b() {
        if (this.f14357c.isEmpty()) {
            return "";
        }
        return this.f14363i.substring(this.f14363i.indexOf(58, this.f14355a.length() + 3) + 1, this.f14363i.indexOf(64));
    }

    @Nullable
    /* renamed from: b */
    public z70 m16807b(String str) {
        C3515a m16805a = m16805a(str);
        if (m16805a != null) {
            return m16805a.m16835a();
        }
        return null;
    }

    /* renamed from: c */
    public String m16808c() {
        int indexOf = this.f14363i.indexOf(47, this.f14355a.length() + 3);
        String str = this.f14363i;
        return this.f14363i.substring(indexOf, o80.m14441a(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: d */
    public List<String> m16809d() {
        int indexOf = this.f14363i.indexOf(47, this.f14355a.length() + 3);
        String str = this.f14363i;
        int m14441a = o80.m14441a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m14441a) {
            int i = indexOf + 1;
            int m14440a = o80.m14440a(this.f14363i, i, m14441a, '/');
            arrayList.add(this.f14363i.substring(i, m14440a));
            indexOf = m14440a;
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: e */
    public String m16810e() {
        if (this.f14361g == null) {
            return null;
        }
        int indexOf = this.f14363i.indexOf(63) + 1;
        String str = this.f14363i;
        return this.f14363i.substring(indexOf, o80.m14440a(str, indexOf, str.length(), '#'));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof z70) && ((z70) obj).f14363i.equals(this.f14363i);
    }

    /* renamed from: f */
    public String m16811f() {
        if (this.f14356b.isEmpty()) {
            return "";
        }
        int length = this.f14355a.length() + 3;
        String str = this.f14363i;
        return this.f14363i.substring(length, o80.m14441a(str, length, str.length(), ":@"));
    }

    /* renamed from: g */
    public String m16812g() {
        return this.f14358d;
    }

    /* renamed from: h */
    public boolean m16813h() {
        return this.f14355a.equals("https");
    }

    public int hashCode() {
        return this.f14363i.hashCode();
    }

    /* renamed from: i */
    public C3515a m16814i() {
        C3515a c3515a = new C3515a();
        c3515a.f14364a = this.f14355a;
        c3515a.f14365b = m16811f();
        c3515a.f14366c = m16806b();
        c3515a.f14367d = this.f14358d;
        c3515a.f14368e = this.f14359e != m16801c(this.f14355a) ? this.f14359e : -1;
        c3515a.f14369f.clear();
        c3515a.f14369f.addAll(m16809d());
        c3515a.m16832a(m16810e());
        c3515a.f14371h = m16804a();
        return c3515a;
    }

    /* renamed from: j */
    public List<String> m16815j() {
        return this.f14360f;
    }

    /* renamed from: k */
    public int m16816k() {
        return this.f14359e;
    }

    @Nullable
    /* renamed from: l */
    public String m16817l() {
        if (this.f14361g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m16796a(sb, this.f14361g);
        return sb.toString();
    }

    /* renamed from: m */
    public String m16818m() {
        C3515a m16805a = m16805a("/...");
        m16805a.m16842e("");
        m16805a.m16840c("");
        return m16805a.m16835a().toString();
    }

    /* renamed from: n */
    public String m16819n() {
        return this.f14355a;
    }

    /* renamed from: o */
    public URI m16820o() {
        C3515a m16814i = m16814i();
        m16814i.m16839c();
        String c3515a = m16814i.toString();
        try {
            return new URI(c3515a);
        } catch (URISyntaxException e) {
            try {
                return URI.create(c3515a.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public String toString() {
        return this.f14363i;
    }
}
