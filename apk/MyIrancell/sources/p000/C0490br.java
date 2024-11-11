package p000;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: br */
/* loaded from: classes.dex */
public final class C0490br {
    static {
        new C0433ar();
    }

    /* renamed from: a */
    public static InputStream m3438a(InputStream inputStream, long j) {
        return new C2399dr(inputStream, 1048577L);
    }

    /* renamed from: a */
    public static byte[] m3439a(InputStream inputStream) {
        C3538zq.m16954a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, 2147483639 - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m3440a(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            i = C2483fr.m11797a(i, 2);
        }
        if (inputStream.read() == -1) {
            return m3440a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: a */
    private static byte[] m3440a(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i2, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
