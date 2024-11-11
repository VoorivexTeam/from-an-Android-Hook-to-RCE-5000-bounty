package p000;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ku */
/* loaded from: classes.dex */
public final class C2873ku {

    /* renamed from: ku$a */
    /* loaded from: classes.dex */
    static class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C2828ju.m13517a(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C2828ju.m13517a(bArr);
        }
    }

    static {
        new a();
    }

    /* renamed from: a */
    public static long m13749a(InputStream inputStream, OutputStream outputStream) {
        C2828ju.m13517a(inputStream);
        C2828ju.m13517a(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* renamed from: a */
    public static byte[] m13750a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m13749a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
