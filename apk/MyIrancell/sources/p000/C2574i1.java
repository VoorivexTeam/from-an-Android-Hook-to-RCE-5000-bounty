package p000;

import android.util.Base64;
import java.util.List;

/* renamed from: i1 */
/* loaded from: classes.dex */
public final class C2574i1 {

    /* renamed from: a */
    private final String f10542a;

    /* renamed from: b */
    private final String f10543b;

    /* renamed from: c */
    private final String f10544c;

    /* renamed from: d */
    private final List<List<byte[]>> f10545d;

    /* renamed from: e */
    private final int f10546e;

    /* renamed from: f */
    private final String f10547f;

    public C2574i1(String str, String str2, String str3, List<List<byte[]>> list) {
        C3419x1.m16410a(str);
        this.f10542a = str;
        C3419x1.m16410a(str2);
        this.f10543b = str2;
        C3419x1.m16410a(str3);
        this.f10544c = str3;
        C3419x1.m16410a(list);
        this.f10545d = list;
        this.f10546e = 0;
        this.f10547f = this.f10542a + "-" + this.f10543b + "-" + this.f10544c;
    }

    /* renamed from: a */
    public List<List<byte[]>> m12314a() {
        return this.f10545d;
    }

    /* renamed from: b */
    public int m12315b() {
        return this.f10546e;
    }

    /* renamed from: c */
    public String m12316c() {
        return this.f10547f;
    }

    /* renamed from: d */
    public String m12317d() {
        return this.f10542a;
    }

    /* renamed from: e */
    public String m12318e() {
        return this.f10543b;
    }

    /* renamed from: f */
    public String m12319f() {
        return this.f10544c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f10542a + ", mProviderPackage: " + this.f10543b + ", mQuery: " + this.f10544c + ", mCertificates:");
        for (int i = 0; i < this.f10545d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f10545d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f10546e);
        return sb.toString();
    }
}
