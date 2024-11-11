package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d3 */
/* loaded from: classes.dex */
public final class C1240d3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7730a(int i, byte[] bArr, int i2, int i3, C1225c3 c1225c3) {
        if ((i >>> 3) == 0) {
            throw C1518w4.m8632c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m7740b(bArr, i2, c1225c3);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m7738a(bArr, i2, c1225c3) + c1225c3.f6541a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw C1518w4.m8632c();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m7738a(bArr, i2, c1225c3);
            i6 = c1225c3.f6541a;
            if (i6 == i5) {
                break;
            }
            i2 = m7730a(i6, bArr, i2, i3, c1225c3);
        }
        if (i2 > i3 || i6 != i5) {
            throw C1518w4.m8634e();
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7731a(int i, byte[] bArr, int i2, int i3, C1304h7 c1304h7, C1225c3 c1225c3) {
        if ((i >>> 3) == 0) {
            throw C1518w4.m8632c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int m7740b = m7740b(bArr, i2, c1225c3);
            c1304h7.m7889a(i, Long.valueOf(c1225c3.f6542b));
            return m7740b;
        }
        if (i4 == 1) {
            c1304h7.m7889a(i, Long.valueOf(m7741b(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int m7738a = m7738a(bArr, i2, c1225c3);
            int i5 = c1225c3.f6541a;
            if (i5 < 0) {
                throw C1518w4.m8631b();
            }
            if (i5 > bArr.length - m7738a) {
                throw C1518w4.m8630a();
            }
            c1304h7.m7889a(i, i5 == 0 ? AbstractC1300h3.f6635c : AbstractC1300h3.m7869a(bArr, m7738a, i5));
            return m7738a + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw C1518w4.m8632c();
            }
            c1304h7.m7889a(i, Integer.valueOf(m7737a(bArr, i2)));
            return i2 + 4;
        }
        C1304h7 m7887e = C1304h7.m7887e();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int m7738a2 = m7738a(bArr, i2, c1225c3);
            int i8 = c1225c3.f6541a;
            i7 = i8;
            if (i8 == i6) {
                i2 = m7738a2;
                break;
            }
            int m7731a = m7731a(i7, bArr, m7738a2, i3, m7887e, c1225c3);
            i7 = i8;
            i2 = m7731a;
        }
        if (i2 > i3 || i7 != i6) {
            throw C1518w4.m8634e();
        }
        c1304h7.m7889a(i, m7887e);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7732a(int i, byte[] bArr, int i2, int i3, InterfaceC1532x4<?> interfaceC1532x4, C1225c3 c1225c3) {
        C1420p4 c1420p4 = (C1420p4) interfaceC1532x4;
        int m7738a = m7738a(bArr, i2, c1225c3);
        while (true) {
            c1420p4.m8180d(c1225c3.f6541a);
            if (m7738a >= i3) {
                break;
            }
            int m7738a2 = m7738a(bArr, m7738a, c1225c3);
            if (i != c1225c3.f6541a) {
                break;
            }
            m7738a = m7738a(bArr, m7738a2, c1225c3);
        }
        return m7738a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7733a(int i, byte[] bArr, int i2, C1225c3 c1225c3) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                c1225c3.f6541a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            c1225c3.f6541a = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        c1225c3.f6541a = i5 | i4;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7734a(InterfaceC1436q6<?> interfaceC1436q6, int i, byte[] bArr, int i2, int i3, InterfaceC1532x4<?> interfaceC1532x4, C1225c3 c1225c3) {
        int m7736a = m7736a(interfaceC1436q6, bArr, i2, i3, c1225c3);
        while (true) {
            interfaceC1532x4.add(c1225c3.f6543c);
            if (m7736a >= i3) {
                break;
            }
            int m7738a = m7738a(bArr, m7736a, c1225c3);
            if (i != c1225c3.f6541a) {
                break;
            }
            m7736a = m7736a(interfaceC1436q6, bArr, m7738a, i3, c1225c3);
        }
        return m7736a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7735a(InterfaceC1436q6 interfaceC1436q6, byte[] bArr, int i, int i2, int i3, C1225c3 c1225c3) {
        C1213b6 c1213b6 = (C1213b6) interfaceC1436q6;
        Object zza = c1213b6.zza();
        int m7622a = c1213b6.m7622a((C1213b6) zza, bArr, i, i2, i3, c1225c3);
        c1213b6.mo7628c((C1213b6) zza);
        c1225c3.f6543c = zza;
        return m7622a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7736a(InterfaceC1436q6 interfaceC1436q6, byte[] bArr, int i, int i2, C1225c3 c1225c3) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m7733a(i4, bArr, i3, c1225c3);
            i4 = c1225c3.f6541a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw C1518w4.m8630a();
        }
        Object zza = interfaceC1436q6.zza();
        int i6 = i4 + i5;
        interfaceC1436q6.mo7624a(zza, bArr, i5, i6, c1225c3);
        interfaceC1436q6.mo7628c(zza);
        c1225c3.f6543c = zza;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7737a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7738a(byte[] bArr, int i, C1225c3 c1225c3) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m7733a(b, bArr, i2, c1225c3);
        }
        c1225c3.f6541a = b;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7739a(byte[] bArr, int i, InterfaceC1532x4<?> interfaceC1532x4, C1225c3 c1225c3) {
        C1420p4 c1420p4 = (C1420p4) interfaceC1532x4;
        int m7738a = m7738a(bArr, i, c1225c3);
        int i2 = c1225c3.f6541a + m7738a;
        while (m7738a < i2) {
            m7738a = m7738a(bArr, m7738a, c1225c3);
            c1420p4.m8180d(c1225c3.f6541a);
        }
        if (m7738a == i2) {
            return m7738a;
        }
        throw C1518w4.m8630a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m7740b(byte[] bArr, int i, C1225c3 c1225c3) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c1225c3.f6542b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        c1225c3.f6542b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long m7741b(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static double m7742c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m7741b(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m7743c(byte[] bArr, int i, C1225c3 c1225c3) {
        int m7738a = m7738a(bArr, i, c1225c3);
        int i2 = c1225c3.f6541a;
        if (i2 < 0) {
            throw C1518w4.m8631b();
        }
        if (i2 == 0) {
            c1225c3.f6543c = "";
            return m7738a;
        }
        c1225c3.f6543c = new String(bArr, m7738a, i2, C1448r4.f6862a);
        return m7738a + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static float m7744d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m7737a(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m7745d(byte[] bArr, int i, C1225c3 c1225c3) {
        int m7738a = m7738a(bArr, i, c1225c3);
        int i2 = c1225c3.f6541a;
        if (i2 < 0) {
            throw C1518w4.m8631b();
        }
        if (i2 == 0) {
            c1225c3.f6543c = "";
            return m7738a;
        }
        c1225c3.f6543c = C1437q7.m8214b(bArr, m7738a, i2);
        return m7738a + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m7746e(byte[] bArr, int i, C1225c3 c1225c3) {
        int m7738a = m7738a(bArr, i, c1225c3);
        int i2 = c1225c3.f6541a;
        if (i2 < 0) {
            throw C1518w4.m8631b();
        }
        if (i2 > bArr.length - m7738a) {
            throw C1518w4.m8630a();
        }
        if (i2 == 0) {
            c1225c3.f6543c = AbstractC1300h3.f6635c;
            return m7738a;
        }
        c1225c3.f6543c = AbstractC1300h3.m7869a(bArr, m7738a, i2);
        return m7738a + i2;
    }
}
