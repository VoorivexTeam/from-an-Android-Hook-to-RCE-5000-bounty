package p000;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class y00 extends t00 {

    /* renamed from: d */
    static final int[] f14083d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f14084e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[][] f14085f;

    /* renamed from: g */
    static final int[][] f14086g;

    /* renamed from: a */
    private final StringBuilder f14087a = new StringBuilder(20);

    /* renamed from: b */
    private final x00 f14088b = new x00();

    /* renamed from: c */
    private final p00 f14089c = new p00();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f14085f = iArr;
        int[][] iArr2 = new int[20];
        f14086g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f14085f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f14086g[i] = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m16536a(C2531gz c2531gz, int[] iArr, int i, int[][] iArr2) {
        t00.m15477a(c2531gz, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float m15476a = t00.m15476a(iArr, iArr2[i3], 0.7f);
            if (m15476a < f) {
                i2 = i3;
                f = m15476a;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: a */
    static boolean m16537a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C3452xv.m16518a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C3452xv.m16518a();
            }
            i3 += charAt2;
        }
        return i3 % 10 == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int[] m16538a(C2531gz c2531gz) {
        int[] iArr = new int[f14083d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, f14083d.length, 0);
            iArr2 = m16540a(c2531gz, i, false, f14083d, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = c2531gz.m12049a(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int[] m16539a(C2531gz c2531gz, int i, boolean z, int[] iArr) {
        return m16540a(c2531gz, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: a */
    private static int[] m16540a(C2531gz c2531gz, int i, boolean z, int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int m12052c = c2531gz.m12052c();
        int m12053c = z ? c2531gz.m12053c(i) : c2531gz.m12050b(i);
        boolean z2 = z;
        int i2 = 0;
        int i3 = m12053c;
        while (m12053c < m12052c) {
            if (c2531gz.m12048a(m12053c) ^ z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                int i4 = length - 1;
                if (i2 != i4) {
                    i2++;
                } else {
                    if (t00.m15476a(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i3, m12053c};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            m12053c++;
        }
        throw C0438aw.m3194a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo14222a(C2531gz c2531gz, int[] iArr, StringBuilder sb);

    @Override // p000.t00
    /* renamed from: a */
    public C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map) {
        return mo15702a(i, c2531gz, m16538a(c2531gz), map);
    }

    /* renamed from: a */
    public C2488fw mo15702a(int i, C2531gz c2531gz, int[] iArr, Map<EnumC3412wv, ?> map) {
        int i2;
        String m14682a;
        InterfaceC2790iw interfaceC2790iw = map == null ? null : (InterfaceC2790iw) map.get(EnumC3412wv.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (interfaceC2790iw != null) {
            interfaceC2790iw.mo10907a(new C2568hw((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.f14087a;
        sb.setLength(0);
        int mo14222a = mo14222a(c2531gz, iArr, sb);
        if (interfaceC2790iw != null) {
            interfaceC2790iw.mo10907a(new C2568hw(mo14222a, i));
        }
        int[] mo16542a = mo16542a(c2531gz, mo14222a);
        if (interfaceC2790iw != null) {
            interfaceC2790iw.mo10907a(new C2568hw((mo16542a[0] + mo16542a[1]) / 2.0f, i));
        }
        int i3 = mo16542a[1];
        int i4 = (i3 - mo16542a[0]) + i3;
        if (i4 >= c2531gz.m12052c() || !c2531gz.m12049a(i3, i4, false)) {
            throw C0438aw.m3194a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw C3452xv.m16518a();
        }
        if (!mo16541a(sb2)) {
            throw C3373vv.m16057a();
        }
        EnumC3224sv mo14223b = mo14223b();
        float f = i;
        C2488fw c2488fw = new C2488fw(sb2, null, new C2568hw[]{new C2568hw((iArr[1] + iArr[0]) / 2.0f, f), new C2568hw((mo16542a[1] + mo16542a[0]) / 2.0f, f)}, mo14223b);
        try {
            C2488fw m16408a = this.f14088b.m16408a(i, c2531gz, mo16542a[1]);
            c2488fw.m11836a(EnumC2528gw.UPC_EAN_EXTENSION, m16408a.m11842e());
            c2488fw.m11837a(m16408a.m11840c());
            c2488fw.m11838a(m16408a.m11841d());
            i2 = m16408a.m11842e().length();
        } catch (AbstractC2447ew unused) {
            i2 = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(EnumC3412wv.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length = iArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    z = false;
                    break;
                }
                if (i2 == iArr2[i5]) {
                    break;
                }
                i5++;
            }
            if (!z) {
                throw C0438aw.m3194a();
            }
        }
        if ((mo14223b == EnumC3224sv.EAN_13 || mo14223b == EnumC3224sv.UPC_A) && (m14682a = this.f14089c.m14682a(sb2)) != null) {
            c2488fw.m11836a(EnumC2528gw.POSSIBLE_COUNTRY, m14682a);
        }
        return c2488fw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo16541a(String str) {
        return m16537a((CharSequence) str);
    }

    /* renamed from: a */
    int[] mo16542a(C2531gz c2531gz, int i) {
        return m16539a(c2531gz, i, false, f14083d);
    }

    /* renamed from: b */
    abstract EnumC3224sv mo14223b();
}
