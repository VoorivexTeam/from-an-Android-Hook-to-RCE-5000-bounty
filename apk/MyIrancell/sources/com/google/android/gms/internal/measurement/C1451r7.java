package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r7 */
/* loaded from: classes.dex */
final class C1451r7 extends AbstractC1465s7 {
    @Override // com.google.android.gms.internal.measurement.AbstractC1465s7
    /* renamed from: a */
    final int mo8320a(int i, byte[] bArr, int i2, int i3) {
        int m8216d;
        int m8216d2;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i4 >= i3 - 2) {
                        m8216d2 = C1437q7.m8216d(bArr, i4, i3);
                        return m8216d2;
                    }
                    int i5 = i4 + 1;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i4 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i4 >= i3 - 1) {
                    m8216d = C1437q7.m8216d(bArr, i4, i3);
                    return m8216d;
                }
                int i7 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    i2 = i7 + 1;
                    if (bArr[i7] > -65) {
                    }
                }
                return -1;
            }
            i2 = i4;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC1465s7
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo8321a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1451r7.mo8321a(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1465s7
    /* renamed from: a */
    public final String mo8322a(byte[] bArr, int i, int i2) {
        boolean m8194d;
        boolean m8194d2;
        boolean m8195e;
        boolean m8196f;
        boolean m8194d3;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            m8194d3 = C1423p7.m8194d(b);
            if (!m8194d3) {
                break;
            }
            i++;
            C1423p7.m8191b(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            m8194d = C1423p7.m8194d(b2);
            if (m8194d) {
                int i7 = i5 + 1;
                C1423p7.m8191b(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = bArr[i6];
                    m8194d2 = C1423p7.m8194d(b3);
                    if (!m8194d2) {
                        break;
                    }
                    i6++;
                    C1423p7.m8191b(b3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else {
                m8195e = C1423p7.m8195e(b2);
                if (!m8195e) {
                    m8196f = C1423p7.m8196f(b2);
                    if (m8196f) {
                        if (i6 >= i3 - 1) {
                            throw C1518w4.m8635f();
                        }
                        int i8 = i6 + 1;
                        C1423p7.m8189b(b2, bArr[i6], bArr[i8], cArr, i5);
                        i = i8 + 1;
                        i5++;
                    } else {
                        if (i6 >= i3 - 2) {
                            throw C1518w4.m8635f();
                        }
                        int i9 = i6 + 1;
                        byte b4 = bArr[i6];
                        int i10 = i9 + 1;
                        C1423p7.m8188b(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    }
                } else {
                    if (i6 >= i3) {
                        throw C1518w4.m8635f();
                    }
                    C1423p7.m8190b(b2, bArr[i6], cArr, i5);
                    i = i6 + 1;
                    i5++;
                }
            }
        }
        return new String(cArr, 0, i5);
    }
}
