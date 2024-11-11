package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t7 */
/* loaded from: classes.dex */
final class C1479t7 extends AbstractC1465s7 {
    /* renamed from: a */
    private static int m8487a(byte[] bArr, int i, long j, int i2) {
        int m8211b;
        int m8212b;
        int m8213b;
        if (i2 == 0) {
            m8211b = C1437q7.m8211b(i);
            return m8211b;
        }
        if (i2 == 1) {
            m8212b = C1437q7.m8212b(i, C1409o7.m8115a(bArr, j));
            return m8212b;
        }
        if (i2 != 2) {
            throw new AssertionError();
        }
        m8213b = C1437q7.m8213b(i, C1409o7.m8115a(bArr, j), C1409o7.m8115a(bArr, j + 1));
        return m8213b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0061, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC1465s7
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int mo8320a(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1479t7.mo8320a(int, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1465s7
    /* renamed from: a */
    public final int mo8321a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            C1409o7.m8126a(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 >= c || j4 >= j5) {
                if (charAt3 < 2048 && j4 <= j5 - 2) {
                    long j6 = j4 + j;
                    C1409o7.m8126a(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                    C1409o7.m8126a(bArr, j6, (byte) ((charAt3 & '?') | 128));
                    j2 = j6 + j;
                    j3 = j;
                } else {
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || j4 > j5 - 3) {
                        if (j4 > j5 - 4) {
                            if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                                throw new C1493u7(i4, length);
                            }
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(charAt3);
                            sb2.append(" at index ");
                            sb2.append(j4);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j7 = j4 + 1;
                                C1409o7.m8126a(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j8 = j7 + 1;
                                C1409o7.m8126a(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = j8 + 1;
                                C1409o7.m8126a(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j9 + 1;
                                C1409o7.m8126a(bArr, j9, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C1493u7(i4 - 1, length);
                    }
                    long j10 = j4 + j;
                    C1409o7.m8126a(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                    long j11 = j10 + j;
                    C1409o7.m8126a(bArr, j10, (byte) (((charAt3 >>> 6) & 63) | 128));
                    C1409o7.m8126a(bArr, j11, (byte) ((charAt3 & '?') | 128));
                    j2 = j11 + 1;
                    j3 = 1;
                }
                i4++;
                c = 128;
                long j12 = j3;
                j4 = j2;
                j = j12;
            } else {
                long j13 = j4 + j;
                C1409o7.m8126a(bArr, j4, (byte) charAt3);
                j3 = j;
                j2 = j13;
            }
            i4++;
            c = 128;
            long j122 = j3;
            j4 = j2;
            j = j122;
        }
        return (int) j4;
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
            byte m8115a = C1409o7.m8115a(bArr, i);
            m8194d3 = C1423p7.m8194d(m8115a);
            if (!m8194d3) {
                break;
            }
            i++;
            C1423p7.m8191b(m8115a, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte m8115a2 = C1409o7.m8115a(bArr, i);
            m8194d = C1423p7.m8194d(m8115a2);
            if (m8194d) {
                int i7 = i5 + 1;
                C1423p7.m8191b(m8115a2, cArr, i5);
                while (i6 < i3) {
                    byte m8115a3 = C1409o7.m8115a(bArr, i6);
                    m8194d2 = C1423p7.m8194d(m8115a3);
                    if (!m8194d2) {
                        break;
                    }
                    i6++;
                    C1423p7.m8191b(m8115a3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else {
                m8195e = C1423p7.m8195e(m8115a2);
                if (!m8195e) {
                    m8196f = C1423p7.m8196f(m8115a2);
                    if (m8196f) {
                        if (i6 >= i3 - 1) {
                            throw C1518w4.m8635f();
                        }
                        int i8 = i6 + 1;
                        C1423p7.m8189b(m8115a2, C1409o7.m8115a(bArr, i6), C1409o7.m8115a(bArr, i8), cArr, i5);
                        i = i8 + 1;
                        i5++;
                    } else {
                        if (i6 >= i3 - 2) {
                            throw C1518w4.m8635f();
                        }
                        int i9 = i6 + 1;
                        byte m8115a4 = C1409o7.m8115a(bArr, i6);
                        int i10 = i9 + 1;
                        C1423p7.m8188b(m8115a2, m8115a4, C1409o7.m8115a(bArr, i9), C1409o7.m8115a(bArr, i10), cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    }
                } else {
                    if (i6 >= i3) {
                        throw C1518w4.m8635f();
                    }
                    C1423p7.m8190b(m8115a2, C1409o7.m8115a(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                }
            }
        }
        return new String(cArr, 0, i5);
    }
}
