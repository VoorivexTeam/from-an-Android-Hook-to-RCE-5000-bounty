package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kd */
/* loaded from: classes.dex */
public final class C2856kd implements InterfaceC2591id {

    /* renamed from: b */
    private final Map<String, List<InterfaceC2811jd>> f11717b;

    /* renamed from: c */
    private volatile Map<String, String> f11718c;

    /* renamed from: kd$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b */
        private static final String f11719b = m13691b();

        /* renamed from: c */
        private static final Map<String, List<InterfaceC2811jd>> f11720c;

        /* renamed from: a */
        private Map<String, List<InterfaceC2811jd>> f11721a = f11720c;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f11719b)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(f11719b)));
            }
            f11720c = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m13691b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    charAt = '?';
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C2856kd m13692a() {
            return new C2856kd(this.f11721a);
        }
    }

    /* renamed from: kd$b */
    /* loaded from: classes.dex */
    static final class b implements InterfaceC2811jd {

        /* renamed from: a */
        private final String f11722a;

        b(String str) {
            this.f11722a = str;
        }

        @Override // p000.InterfaceC2811jd
        /* renamed from: a */
        public String mo13455a() {
            return this.f11722a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f11722a.equals(((b) obj).f11722a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11722a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f11722a + "'}";
        }
    }

    C2856kd(Map<String, List<InterfaceC2811jd>> map) {
        this.f11717b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    private String m13689a(List<InterfaceC2811jd> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String mo13455a = list.get(i).mo13455a();
            if (!TextUtils.isEmpty(mo13455a)) {
                sb.append(mo13455a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private Map<String, String> m13690b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<InterfaceC2811jd>> entry : this.f11717b.entrySet()) {
            String m13689a = m13689a(entry.getValue());
            if (!TextUtils.isEmpty(m13689a)) {
                hashMap.put(entry.getKey(), m13689a);
            }
        }
        return hashMap;
    }

    @Override // p000.InterfaceC2591id
    /* renamed from: a */
    public Map<String, String> mo12447a() {
        if (this.f11718c == null) {
            synchronized (this) {
                if (this.f11718c == null) {
                    this.f11718c = Collections.unmodifiableMap(m13690b());
                }
            }
        }
        return this.f11718c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2856kd) {
            return this.f11717b.equals(((C2856kd) obj).f11717b);
        }
        return false;
    }

    public int hashCode() {
        return this.f11717b.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f11717b + '}';
    }
}
