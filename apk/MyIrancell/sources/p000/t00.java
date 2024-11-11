package p000;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t00 implements InterfaceC2404dw {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static float m15476a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m15477a(C2531gz c2531gz, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int m12052c = c2531gz.m12052c();
        if (i >= m12052c) {
            throw C0438aw.m3194a();
        }
        boolean z = !c2531gz.m12048a(i);
        while (i < m12052c) {
            if (c2531gz.m12048a(i) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            }
            i++;
        }
        if (i2 != length) {
            if (i2 != length - 1 || i != m12052c) {
                throw C0438aw.m3194a();
            }
        }
    }

    /* renamed from: b */
    private C2488fw m15478b(C3320uv c3320uv, Map<EnumC3412wv, ?> map) {
        Map<EnumC3412wv, ?> map2;
        int i;
        Map<EnumC3412wv, ?> map3 = map;
        int m15857c = c3320uv.m15857c();
        int m15856b = c3320uv.m15856b();
        C2531gz c2531gz = new C2531gz(m15857c);
        int i2 = m15856b >> 1;
        char c = 0;
        int i3 = 1;
        boolean z = map3 != null && map3.containsKey(EnumC3412wv.TRY_HARDER);
        int max = Math.max(1, m15856b >> (z ? 8 : 5));
        int i4 = z ? m15856b : 15;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            int i7 = i6 / 2;
            if (!((i5 & 1) == 0)) {
                i7 = -i7;
            }
            int i8 = (i7 * max) + i2;
            if (i8 < 0 || i8 >= m15856b) {
                break;
            }
            try {
                c2531gz = c3320uv.m15854a(i8, c2531gz);
                int i9 = 0;
                while (i9 < 2) {
                    if (i9 == i3) {
                        c2531gz.m12055g();
                        if (map3 != null && map3.containsKey(EnumC3412wv.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap = new EnumMap(EnumC3412wv.class);
                            enumMap.putAll(map3);
                            enumMap.remove(EnumC3412wv.NEED_RESULT_POINT_CALLBACK);
                            map3 = enumMap;
                        }
                    }
                    try {
                        C2488fw mo11530a = mo11530a(i8, c2531gz, map3);
                        if (i9 == i3) {
                            mo11530a.m11836a(EnumC2528gw.ORIENTATION, 180);
                            C2568hw[] m11841d = mo11530a.m11841d();
                            if (m11841d != null) {
                                map2 = map3;
                                float f = m15857c;
                                try {
                                    i = m15857c;
                                } catch (AbstractC2447ew unused) {
                                    i = m15857c;
                                    i9++;
                                    map3 = map2;
                                    m15857c = i;
                                    c = 0;
                                    i3 = 1;
                                }
                                try {
                                    m11841d[0] = new C2568hw((f - m11841d[c].m12248a()) - 1.0f, m11841d[c].m12249b());
                                } catch (AbstractC2447ew unused2) {
                                    i9++;
                                    map3 = map2;
                                    m15857c = i;
                                    c = 0;
                                    i3 = 1;
                                }
                                try {
                                    m11841d[1] = new C2568hw((f - m11841d[1].m12248a()) - 1.0f, m11841d[1].m12249b());
                                } catch (AbstractC2447ew unused3) {
                                    continue;
                                    i9++;
                                    map3 = map2;
                                    m15857c = i;
                                    c = 0;
                                    i3 = 1;
                                }
                            }
                        }
                        return mo11530a;
                    } catch (AbstractC2447ew unused4) {
                        map2 = map3;
                    }
                }
            } catch (C0438aw unused5) {
            }
            i5 = i6;
            m15857c = m15857c;
            c = 0;
            i3 = 1;
        }
        throw C0438aw.m3194a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static void m15479b(C2531gz c2531gz, int i, int[] iArr) {
        int length = iArr.length;
        boolean m12048a = c2531gz.m12048a(i);
        while (i > 0 && length >= 0) {
            i--;
            if (c2531gz.m12048a(i) != m12048a) {
                length--;
                m12048a = !m12048a;
            }
        }
        if (length >= 0) {
            throw C0438aw.m3194a();
        }
        m15477a(c2531gz, i + 1, iArr);
    }

    /* renamed from: a */
    public abstract C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map);

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11487a(C3320uv c3320uv) {
        return mo11488a(c3320uv, null);
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public C2488fw mo11488a(C3320uv c3320uv, Map<EnumC3412wv, ?> map) {
        try {
            return m15478b(c3320uv, map);
        } catch (C0438aw e) {
            if (!(map != null && map.containsKey(EnumC3412wv.TRY_HARDER)) || !c3320uv.m15858d()) {
                throw e;
            }
            c3320uv.m15859e();
            throw null;
        }
    }

    @Override // p000.InterfaceC2404dw
    /* renamed from: a */
    public void mo11489a() {
    }
}
