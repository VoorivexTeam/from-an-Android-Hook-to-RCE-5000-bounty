package p000;

import java.io.IOException;
import okio.ByteString;

/* loaded from: classes.dex */
public final class r90 {

    /* renamed from: a */
    static final ByteString f12940a = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f12941b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f12942c = new String[64];

    /* renamed from: d */
    static final String[] f12943d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f12943d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = o80.m14446a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f12942c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            f12942c[i4 | 8] = f12942c[i4] + "|PADDED";
        }
        String[] strArr3 = f12942c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                int i9 = i8 | i6;
                f12942c[i9] = f12942c[i8] + '|' + f12942c[i6];
                f12942c[i9 | 8] = f12942c[i8] + '|' + f12942c[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr4 = f12942c;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f12943d[i];
            }
            i++;
        }
    }

    private r90() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static IllegalArgumentException m15254a(String str, Object... objArr) {
        throw new IllegalArgumentException(o80.m14446a(str, objArr));
    }

    /* renamed from: a */
    static String m15255a(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (b != 2 && b != 3) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : f12943d[b2];
            }
            if (b != 7 && b != 8) {
                String[] strArr = f12942c;
                String str = b2 < strArr.length ? strArr[b2] : f12943d[b2];
                return (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f12943d[b2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m15256a(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f12941b;
        String m14446a = b < strArr.length ? strArr[b] : o80.m14446a("0x%02x", Byte.valueOf(b));
        String m15255a = m15255a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = m14446a;
        objArr[4] = m15255a;
        return o80.m14446a("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static IOException m15257b(String str, Object... objArr) {
        throw new IOException(o80.m14446a(str, objArr));
    }
}
