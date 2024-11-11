package defpackage;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t00 implements dw {
    /* JADX INFO: Access modifiers changed from: protected */
    public static float a(int[] iArr, int[] iArr2, float f) {
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
    public static void a(gz gzVar, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int c = gzVar.c();
        if (i >= c) {
            throw aw.a();
        }
        boolean z = !gzVar.a(i);
        while (i < c) {
            if (gzVar.a(i) ^ z) {
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
            if (i2 != length - 1 || i != c) {
                throw aw.a();
            }
        }
    }

    private fw b(uv uvVar, Map<wv, ?> map) {
        Map<wv, ?> map2;
        int i;
        Map<wv, ?> map3 = map;
        int c = uvVar.c();
        int b = uvVar.b();
        gz gzVar = new gz(c);
        int i2 = b >> 1;
        char c2 = 0;
        int i3 = 1;
        boolean z = map3 != null && map3.containsKey(wv.TRY_HARDER);
        int max = Math.max(1, b >> (z ? 8 : 5));
        int i4 = z ? b : 15;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            int i7 = i6 / 2;
            if (!((i5 & 1) == 0)) {
                i7 = -i7;
            }
            int i8 = (i7 * max) + i2;
            if (i8 < 0 || i8 >= b) {
                break;
            }
            try {
                gzVar = uvVar.a(i8, gzVar);
                int i9 = 0;
                while (i9 < 2) {
                    if (i9 == i3) {
                        gzVar.g();
                        if (map3 != null && map3.containsKey(wv.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap = new EnumMap(wv.class);
                            enumMap.putAll(map3);
                            enumMap.remove(wv.NEED_RESULT_POINT_CALLBACK);
                            map3 = enumMap;
                        }
                    }
                    try {
                        fw a = a(i8, gzVar, map3);
                        if (i9 == i3) {
                            a.a(gw.ORIENTATION, 180);
                            hw[] d = a.d();
                            if (d != null) {
                                map2 = map3;
                                float f = c;
                                try {
                                    i = c;
                                } catch (ew unused) {
                                    i = c;
                                    i9++;
                                    map3 = map2;
                                    c = i;
                                    c2 = 0;
                                    i3 = 1;
                                }
                                try {
                                    d[0] = new hw((f - d[c2].a()) - 1.0f, d[c2].b());
                                } catch (ew unused2) {
                                    i9++;
                                    map3 = map2;
                                    c = i;
                                    c2 = 0;
                                    i3 = 1;
                                }
                                try {
                                    d[1] = new hw((f - d[1].a()) - 1.0f, d[1].b());
                                } catch (ew unused3) {
                                    continue;
                                    i9++;
                                    map3 = map2;
                                    c = i;
                                    c2 = 0;
                                    i3 = 1;
                                }
                            }
                        }
                        return a;
                    } catch (ew unused4) {
                        map2 = map3;
                    }
                }
            } catch (aw unused5) {
            }
            i5 = i6;
            c = c;
            c2 = 0;
            i3 = 1;
        }
        throw aw.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(gz gzVar, int i, int[] iArr) {
        int length = iArr.length;
        boolean a = gzVar.a(i);
        while (i > 0 && length >= 0) {
            i--;
            if (gzVar.a(i) != a) {
                length--;
                a = !a;
            }
        }
        if (length >= 0) {
            throw aw.a();
        }
        a(gzVar, i + 1, iArr);
    }

    public abstract fw a(int i, gz gzVar, Map<wv, ?> map);

    @Override // defpackage.dw
    public fw a(uv uvVar) {
        return a(uvVar, null);
    }

    @Override // defpackage.dw
    public fw a(uv uvVar, Map<wv, ?> map) {
        try {
            return b(uvVar, map);
        } catch (aw e) {
            if (!(map != null && map.containsKey(wv.TRY_HARDER)) || !uvVar.d()) {
                throw e;
            }
            uvVar.e();
            throw null;
        }
    }

    @Override // defpackage.dw
    public void a() {
    }
}
