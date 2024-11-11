package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class y70 {

    /* renamed from: a */
    private final String[] f14112a;

    /* renamed from: y70$a */
    /* loaded from: classes.dex */
    public static final class C3476a {

        /* renamed from: a */
        final List<String> f14113a = new ArrayList(20);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C3476a m16598a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                m16602b(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            }
            if (str.startsWith(":")) {
                m16602b("", str.substring(1));
                return this;
            }
            m16602b("", str);
            return this;
        }

        /* renamed from: a */
        public C3476a m16599a(String str, String str2) {
            y70.m16591c(str);
            y70.m16590a(str2, str);
            m16602b(str, str2);
            return this;
        }

        /* renamed from: a */
        public y70 m16600a() {
            return new y70(this);
        }

        /* renamed from: b */
        public C3476a m16601b(String str) {
            int i = 0;
            while (i < this.f14113a.size()) {
                if (str.equalsIgnoreCase(this.f14113a.get(i))) {
                    this.f14113a.remove(i);
                    this.f14113a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public C3476a m16602b(String str, String str2) {
            this.f14113a.add(str);
            this.f14113a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C3476a m16603c(String str, String str2) {
            y70.m16591c(str);
            y70.m16590a(str2, str);
            m16601b(str);
            m16602b(str, str2);
            return this;
        }
    }

    y70(C3476a c3476a) {
        List<String> list = c3476a.f14113a;
        this.f14112a = (String[]) list.toArray(new String[list.size()]);
    }

    private y70(String[] strArr) {
        this.f14112a = strArr;
    }

    /* renamed from: a */
    private static String m16588a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static y70 m16589a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        }
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            if (strArr2[i] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = strArr2[i].trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            m16591c(str);
            m16590a(str2, str);
        }
        return new y70(strArr2);
    }

    /* renamed from: a */
    static void m16590a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new IllegalArgumentException(o80.m14446a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
            }
        }
    }

    /* renamed from: c */
    static void m16591c(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(o80.m14446a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
            }
        }
    }

    /* renamed from: a */
    public String m16592a(int i) {
        return this.f14112a[i * 2];
    }

    @Nullable
    /* renamed from: a */
    public String m16593a(String str) {
        return m16588a(this.f14112a, str);
    }

    /* renamed from: a */
    public C3476a m16594a() {
        C3476a c3476a = new C3476a();
        Collections.addAll(c3476a.f14113a, this.f14112a);
        return c3476a;
    }

    /* renamed from: b */
    public int m16595b() {
        return this.f14112a.length / 2;
    }

    /* renamed from: b */
    public String m16596b(int i) {
        return this.f14112a[(i * 2) + 1];
    }

    /* renamed from: b */
    public List<String> m16597b(String str) {
        int m16595b = m16595b();
        ArrayList arrayList = null;
        for (int i = 0; i < m16595b; i++) {
            if (str.equalsIgnoreCase(m16592a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m16596b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof y70) && Arrays.equals(((y70) obj).f14112a, this.f14112a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f14112a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int m16595b = m16595b();
        for (int i = 0; i < m16595b; i++) {
            sb.append(m16592a(i));
            sb.append(": ");
            sb.append(m16596b(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
