package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class n70 {

    /* renamed from: b */
    static final Comparator<String> f12265b = new C2977a();

    /* renamed from: c */
    private static final Map<String, n70> f12266c = new LinkedHashMap();

    /* renamed from: d */
    public static final n70 f12267d;

    /* renamed from: e */
    public static final n70 f12268e;

    /* renamed from: f */
    public static final n70 f12269f;

    /* renamed from: g */
    public static final n70 f12270g;

    /* renamed from: h */
    public static final n70 f12271h;

    /* renamed from: i */
    public static final n70 f12272i;

    /* renamed from: j */
    public static final n70 f12273j;

    /* renamed from: k */
    public static final n70 f12274k;

    /* renamed from: l */
    public static final n70 f12275l;

    /* renamed from: m */
    public static final n70 f12276m;

    /* renamed from: n */
    public static final n70 f12277n;

    /* renamed from: o */
    public static final n70 f12278o;

    /* renamed from: p */
    public static final n70 f12279p;

    /* renamed from: q */
    public static final n70 f12280q;

    /* renamed from: r */
    public static final n70 f12281r;

    /* renamed from: s */
    public static final n70 f12282s;

    /* renamed from: t */
    public static final n70 f12283t;

    /* renamed from: u */
    public static final n70 f12284u;

    /* renamed from: a */
    final String f12285a;

    /* renamed from: n70$a */
    /* loaded from: classes.dex */
    class C2977a implements Comparator<String> {
        C2977a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    static {
        m14290a("SSL_RSA_WITH_NULL_MD5", 1);
        m14290a("SSL_RSA_WITH_NULL_SHA", 2);
        m14290a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m14290a("SSL_RSA_WITH_RC4_128_MD5", 4);
        m14290a("SSL_RSA_WITH_RC4_128_SHA", 5);
        m14290a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m14290a("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f12267d = m14290a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        m14290a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m14290a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m14290a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m14290a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m14290a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m14290a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m14290a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m14290a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m14290a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m14290a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m14290a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m14290a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m14290a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m14290a("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m14290a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m14290a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m14290a("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m14290a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m14290a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m14290a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m14290a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f12268e = m14290a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        m14290a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m14290a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m14290a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f12269f = m14290a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        m14290a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m14290a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m14290a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m14290a("TLS_RSA_WITH_NULL_SHA256", 59);
        m14290a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m14290a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m14290a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m14290a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m14290a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m14290a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m14290a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m14290a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m14290a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m14290a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m14290a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m14290a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m14290a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m14290a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m14290a("TLS_PSK_WITH_RC4_128_SHA", 138);
        m14290a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m14290a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m14290a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m14290a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f12270g = m14290a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f12271h = m14290a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        m14290a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m14290a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m14290a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m14290a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m14290a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m14290a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m14290a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        m14290a("TLS_FALLBACK_SCSV", 22016);
        m14290a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m14290a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m14290a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m14290a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m14290a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m14290a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m14290a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m14290a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m14290a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m14290a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m14290a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m14290a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m14290a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m14290a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m14290a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m14290a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m14290a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m14290a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f12272i = m14290a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f12273j = m14290a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        m14290a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m14290a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m14290a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m14290a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m14290a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m14290a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m14290a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m14290a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m14290a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m14290a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m14290a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m14290a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m14290a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f12274k = m14290a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f12275l = m14290a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        m14290a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m14290a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f12276m = m14290a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f12277n = m14290a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        m14290a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m14290a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m14290a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m14290a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f12278o = m14290a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f12279p = m14290a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        m14290a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        m14290a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f12280q = m14290a("TLS_AES_128_GCM_SHA256", 4865);
        f12281r = m14290a("TLS_AES_256_GCM_SHA384", 4866);
        f12282s = m14290a("TLS_CHACHA20_POLY1305_SHA256", 4867);
        f12283t = m14290a("TLS_AES_128_CCM_SHA256", 4868);
        f12284u = m14290a("TLS_AES_256_CCM_8_SHA256", 4869);
    }

    private n70(String str) {
        if (str == null) {
            throw null;
        }
        this.f12285a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<n70> m14288a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m14289a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static synchronized n70 m14289a(String str) {
        n70 n70Var;
        synchronized (n70.class) {
            n70Var = f12266c.get(str);
            if (n70Var == null) {
                n70Var = f12266c.get(m14291b(str));
                if (n70Var == null) {
                    n70Var = new n70(str);
                }
                f12266c.put(str, n70Var);
            }
        }
        return n70Var;
    }

    /* renamed from: a */
    private static n70 m14290a(String str, int i) {
        n70 n70Var = new n70(str);
        f12266c.put(str, n70Var);
        return n70Var;
    }

    /* renamed from: b */
    private static String m14291b(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public String toString() {
        return this.f12285a;
    }
}
