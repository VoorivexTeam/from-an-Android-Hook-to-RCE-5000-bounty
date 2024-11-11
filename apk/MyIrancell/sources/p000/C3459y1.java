package p000;

import java.io.PrintWriter;

/* renamed from: y1 */
/* loaded from: classes.dex */
public final class C3459y1 {

    /* renamed from: a */
    private static final Object f14090a = new Object();

    /* renamed from: b */
    private static char[] f14091b = new char[24];

    /* renamed from: a */
    private static int m16543a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: a */
    private static int m16544a(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        if (f14091b.length < i) {
            f14091b = new char[i];
        }
        char[] cArr = f14091b;
        if (j2 == 0) {
            int i7 = i - 1;
            while (i7 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i8 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i9 = floor / 60;
            i4 = floor - (i9 * 60);
            i5 = i9;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int m16543a = m16543a(i2, 1, false, 0);
            int m16543a2 = m16543a + m16543a(i3, 1, m16543a > 0, 2);
            int m16543a3 = m16543a2 + m16543a(i5, 1, m16543a2 > 0, 2);
            int m16543a4 = m16543a3 + m16543a(i4, 1, m16543a3 > 0, 2);
            i6 = 0;
            for (int m16543a5 = m16543a4 + m16543a(i8, 2, true, m16543a4 > 0 ? 3 : 0) + 1; m16543a5 < i; m16543a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i10 = i6 + 1;
        boolean z = i != 0;
        int m16545a = m16545a(cArr, i2, 'd', i10, false, 0);
        int m16545a2 = m16545a(cArr, i3, 'h', m16545a, m16545a != i10, z ? 2 : 0);
        int m16545a3 = m16545a(cArr, i5, 'm', m16545a2, m16545a2 != i10, z ? 2 : 0);
        int m16545a4 = m16545a(cArr, i4, 's', m16545a3, m16545a3 != i10, z ? 2 : 0);
        int m16545a5 = m16545a(cArr, i8, 'm', m16545a4, true, (!z || m16545a4 == i10) ? 0 : 3);
        cArr[m16545a5] = 's';
        return m16545a5 + 1;
    }

    /* renamed from: a */
    private static int m16545a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }

    /* renamed from: a */
    public static void m16546a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m16548a(j - j2, printWriter, 0);
        }
    }

    /* renamed from: a */
    public static void m16547a(long j, PrintWriter printWriter) {
        m16548a(j, printWriter, 0);
    }

    /* renamed from: a */
    public static void m16548a(long j, PrintWriter printWriter, int i) {
        synchronized (f14090a) {
            printWriter.print(new String(f14091b, 0, m16544a(j, i)));
        }
    }
}
