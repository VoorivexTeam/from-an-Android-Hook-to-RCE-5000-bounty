package p000;

import java.io.ByteArrayOutputStream;
import okio.BufferedSink;
import okio.ByteString;

/* loaded from: classes.dex */
class x90 {

    /* renamed from: b */
    private static final int[] f14006b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: c */
    private static final byte[] f14007c = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};

    /* renamed from: d */
    private static final x90 f14008d = new x90();

    /* renamed from: a */
    private final C3430a f14009a = new C3430a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x90$a */
    /* loaded from: classes.dex */
    public static final class C3430a {

        /* renamed from: a */
        final C3430a[] f14010a;

        /* renamed from: b */
        final int f14011b;

        /* renamed from: c */
        final int f14012c;

        C3430a() {
            this.f14010a = new C3430a[256];
            this.f14011b = 0;
            this.f14012c = 0;
        }

        C3430a(int i, int i2) {
            this.f14010a = null;
            this.f14011b = i;
            int i3 = i2 & 7;
            this.f14012c = i3 == 0 ? 8 : i3;
        }
    }

    private x90() {
        m16469a();
    }

    /* renamed from: a */
    private void m16469a() {
        int i = 0;
        while (true) {
            byte[] bArr = f14007c;
            if (i >= bArr.length) {
                return;
            }
            m16470a(i, f14006b[i], bArr[i]);
            i++;
        }
    }

    /* renamed from: a */
    private void m16470a(int i, int i2, byte b) {
        C3430a c3430a = new C3430a(i, b);
        C3430a c3430a2 = this.f14009a;
        while (b > 8) {
            b = (byte) (b - 8);
            int i3 = (i2 >>> b) & 255;
            C3430a[] c3430aArr = c3430a2.f14010a;
            if (c3430aArr == null) {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
            if (c3430aArr[i3] == null) {
                c3430aArr[i3] = new C3430a();
            }
            c3430a2 = c3430a2.f14010a[i3];
        }
        int i4 = 8 - b;
        int i5 = (i2 << i4) & 255;
        int i6 = 1 << i4;
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            c3430a2.f14010a[i7] = c3430a;
        }
    }

    /* renamed from: b */
    public static x90 m16471b() {
        return f14008d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m16472a(ByteString byteString) {
        long j = 0;
        for (int i = 0; i < byteString.size(); i++) {
            j += f14007c[byteString.getByte(i) & 255];
        }
        return (int) ((j + 7) >> 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16473a(ByteString byteString, BufferedSink bufferedSink) {
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < byteString.size(); i2++) {
            int i3 = byteString.getByte(i2) & 255;
            int i4 = f14006b[i3];
            byte b = f14007c[i3];
            j = (j << b) | i4;
            i += b;
            while (i >= 8) {
                i -= 8;
                bufferedSink.writeByte((int) (j >> i));
            }
        }
        if (i > 0) {
            bufferedSink.writeByte((int) ((255 >>> i) | (j << (8 - i))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m16474a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C3430a c3430a = this.f14009a;
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            i = (i << 8) | (b & 255);
            i2 += 8;
            while (i2 >= 8) {
                c3430a = c3430a.f14010a[(i >>> (i2 - 8)) & 255];
                if (c3430a.f14010a == null) {
                    byteArrayOutputStream.write(c3430a.f14011b);
                    i2 -= c3430a.f14012c;
                    c3430a = this.f14009a;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            C3430a c3430a2 = c3430a.f14010a[(i << (8 - i2)) & 255];
            if (c3430a2.f14010a != null || c3430a2.f14012c > i2) {
                break;
            }
            byteArrayOutputStream.write(c3430a2.f14011b);
            i2 -= c3430a2.f14012c;
            c3430a = this.f14009a;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
