package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: d6 */
/* loaded from: classes.dex */
public class C2375d6 {

    /* renamed from: a */
    private final List<String> f9711a;

    /* renamed from: b */
    private InterfaceC2418e6 f9712b;

    private C2375d6(C2375d6 c2375d6) {
        this.f9711a = new ArrayList(c2375d6.f9711a);
        this.f9712b = c2375d6.f9712b;
    }

    public C2375d6(String... strArr) {
        this.f9711a = Arrays.asList(strArr);
    }

    /* renamed from: b */
    private boolean m11279b() {
        return this.f9711a.get(r0.size() - 1).equals("**");
    }

    /* renamed from: b */
    private boolean m11280b(String str) {
        return "__container".equals(str);
    }

    /* renamed from: a */
    public C2375d6 m11281a(InterfaceC2418e6 interfaceC2418e6) {
        C2375d6 c2375d6 = new C2375d6(this);
        c2375d6.f9712b = interfaceC2418e6;
        return c2375d6;
    }

    /* renamed from: a */
    public C2375d6 m11282a(String str) {
        C2375d6 c2375d6 = new C2375d6(this);
        c2375d6.f9711a.add(str);
        return c2375d6;
    }

    /* renamed from: a */
    public InterfaceC2418e6 m11283a() {
        return this.f9712b;
    }

    /* renamed from: a */
    public boolean m11284a(String str, int i) {
        if (i >= this.f9711a.size()) {
            return false;
        }
        boolean z = i == this.f9711a.size() - 1;
        String str2 = this.f9711a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f9711a.size() + (-2) && m11279b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f9711a.get(i + 1).equals(str)) {
            return i == this.f9711a.size() + (-2) || (i == this.f9711a.size() + (-3) && m11279b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f9711a.size() - 1) {
            return false;
        }
        return this.f9711a.get(i2).equals(str);
    }

    /* renamed from: b */
    public int m11285b(String str, int i) {
        if (m11280b(str)) {
            return 0;
        }
        if (this.f9711a.get(i).equals("**")) {
            return (i != this.f9711a.size() - 1 && this.f9711a.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: c */
    public boolean m11286c(String str, int i) {
        if (m11280b(str)) {
            return true;
        }
        if (i >= this.f9711a.size()) {
            return false;
        }
        return this.f9711a.get(i).equals(str) || this.f9711a.get(i).equals("**") || this.f9711a.get(i).equals("*");
    }

    /* renamed from: d */
    public boolean m11287d(String str, int i) {
        return "__container".equals(str) || i < this.f9711a.size() - 1 || this.f9711a.get(i).equals("**");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f9711a);
        sb.append(",resolved=");
        sb.append(this.f9712b != null);
        sb.append('}');
        return sb.toString();
    }
}
