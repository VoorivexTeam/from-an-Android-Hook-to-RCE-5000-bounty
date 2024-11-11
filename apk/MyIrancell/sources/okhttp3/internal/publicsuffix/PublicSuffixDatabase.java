package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import p000.ga0;
import p000.o80;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    private static final byte[] f12499e = {42};

    /* renamed from: f */
    private static final String[] f12500f = new String[0];

    /* renamed from: g */
    private static final String[] f12501g = {"*"};

    /* renamed from: h */
    private static final PublicSuffixDatabase f12502h = new PublicSuffixDatabase();

    /* renamed from: a */
    private final AtomicBoolean f12503a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f12504b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f12505c;

    /* renamed from: d */
    private byte[] f12506d;

    /* renamed from: a */
    private static String m14625a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, o80.f12435i);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    /* renamed from: a */
    public static PublicSuffixDatabase m14626a() {
        return f12502h;
    }

    /* renamed from: a */
    private String[] m14627a(String[] strArr) {
        String str;
        String str2;
        String str3;
        int i = 0;
        if (this.f12503a.get() || !this.f12503a.compareAndSet(false, true)) {
            try {
                this.f12504b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m14629c();
        }
        synchronized (this) {
            if (this.f12505c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(o80.f12435i);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = m14625a(this.f12505c, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = f12499e;
                str3 = m14625a(this.f12505c, bArr2, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String m14625a = m14625a(this.f12506d, bArr, i);
                if (m14625a != null) {
                    str = m14625a;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return f12501g;
        }
        String[] split = str2 != null ? str2.split("\\.") : f12500f;
        String[] split2 = str3 != null ? str3.split("\\.") : f12500f;
        return split.length > split2.length ? split : split2;
    }

    /* renamed from: b */
    private void m14628b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        BufferedSource buffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
        try {
            byte[] bArr = new byte[buffer.readInt()];
            buffer.readFully(bArr);
            byte[] bArr2 = new byte[buffer.readInt()];
            buffer.readFully(bArr2);
            synchronized (this) {
                this.f12505c = bArr;
                this.f12506d = bArr2;
            }
            this.f12504b.countDown();
        } finally {
            o80.m14457a(buffer);
        }
    }

    /* renamed from: c */
    private void m14629c() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m14628b();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    ga0.m11953c().mo3355a(5, "Failed to read public suffix list", e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    public String m14630a(String str) {
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] m14627a = m14627a(split);
        if (split.length == m14627a.length && m14627a[0].charAt(0) != '!') {
            return null;
        }
        char charAt = m14627a[0].charAt(0);
        int length = split.length;
        int length2 = m14627a.length;
        if (charAt != '!') {
            length2++;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i = length - length2; i < split2.length; i++) {
            sb.append(split2[i]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
