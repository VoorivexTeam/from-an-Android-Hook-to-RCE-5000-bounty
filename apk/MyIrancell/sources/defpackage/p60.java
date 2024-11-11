package defpackage;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public class p60 implements x60 {
    private final i60 a;
    private final e60 b;
    private y60 c;
    private HttpURLConnection d;
    private InputStream e;

    public p60(String str) {
        this(str, j60.a());
    }

    public p60(String str, i60 i60Var) {
        this(str, i60Var, new d60());
    }

    public p60(String str, i60 i60Var, e60 e60Var) {
        t60.a(i60Var);
        this.a = i60Var;
        t60.a(e60Var);
        this.b = e60Var;
        y60 a = i60Var.a(str);
        this.c = a == null ? new y60(str, -2147483648L, w60.a(str)) : a;
    }

    public p60(p60 p60Var) {
        this.c = p60Var.c;
        this.a = p60Var.a;
        this.b = p60Var.b;
    }

    private long a(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    private long a(HttpURLConnection httpURLConnection, long j, int i) {
        long a = a(httpURLConnection);
        return i == 200 ? a : i == 206 ? a + j : this.c.b;
    }

    private HttpURLConnection a(long j, int i) {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z;
        String str2 = this.c.a;
        int i2 = 0;
        do {
            StringBuilder sb = new StringBuilder();
            sb.append("Open connection ");
            if (j > 0) {
                str = " with offset " + j;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" to ");
            sb.append(str2);
            i50.d(sb.toString());
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            a(httpURLConnection, str2);
            if (j > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-");
            }
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                str2 = httpURLConnection.getHeaderField("Location");
                i2++;
                httpURLConnection.disconnect();
            }
            if (i2 > 5) {
                throw new v60("Too many redirects: " + i2);
            }
        } while (z);
        return httpURLConnection;
    }

    private void a(HttpURLConnection httpURLConnection, String str) {
        for (Map.Entry<String, String> entry : this.b.a(str).entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0087, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0084, code lost:
    
        r0.disconnect();
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Read content info from "
            r0.append(r1)
            y60 r1 = r7.c
            java.lang.String r1 = r1.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.i50.d(r0)
            r0 = 0
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 0
            java.net.HttpURLConnection r0 = r7.a(r0, r2)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            long r1 = r7.a(r0)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            java.lang.String r4 = r0.getContentType()     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            y60 r5 = new y60     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            y60 r6 = r7.c     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            java.lang.String r6 = r6.a     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r5.<init>(r6, r1, r4)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r7.c = r5     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            i60 r1 = r7.a     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            java.lang.String r2 = r5.a     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r1.a(r2, r5)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            java.lang.String r2 = "Source info fetched: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            y60 r2 = r7.c     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r1.append(r2)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            defpackage.i50.d(r1)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            defpackage.w60.a(r3)
            if (r0 == 0) goto L87
            goto L84
        L5b:
            r1 = move-exception
            goto L88
        L5d:
            r1 = move-exception
            goto L64
        L5f:
            r1 = move-exception
            r0 = r3
            goto L88
        L62:
            r1 = move-exception
            r0 = r3
        L64:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "Error fetching info from "
            r2.append(r4)     // Catch: java.lang.Throwable -> L5b
            y60 r4 = r7.c     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r4.a     // Catch: java.lang.Throwable -> L5b
            r2.append(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5b
            defpackage.i50.a(r2)     // Catch: java.lang.Throwable -> L5b
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L5b
            defpackage.w60.a(r3)
            if (r0 == 0) goto L87
        L84:
            r0.disconnect()
        L87:
            return
        L88:
            defpackage.w60.a(r3)
            if (r0 == 0) goto L90
            r0.disconnect()
        L90:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p60.e():void");
    }

    @Override // defpackage.x60
    public int a(byte[] bArr) {
        InputStream inputStream = this.e;
        if (inputStream == null) {
            throw new v60("Error reading data from " + this.c.a + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            throw new r60("Reading source " + this.c.a + " is interrupted", e);
        } catch (IOException e2) {
            throw new v60("Error reading data from " + this.c.a, e2);
        }
    }

    @Override // defpackage.x60
    public synchronized long a() {
        if (this.c.b == -2147483648L) {
            e();
        }
        return this.c.b;
    }

    @Override // defpackage.x60
    public void a(long j) {
        try {
            HttpURLConnection a = a(j, -1);
            this.d = a;
            String contentType = a.getContentType();
            this.e = new BufferedInputStream(this.d.getInputStream(), 8192);
            y60 y60Var = new y60(this.c.a, a(this.d, j, this.d.getResponseCode()), contentType);
            this.c = y60Var;
            this.a.a(y60Var.a, y60Var);
        } catch (IOException e) {
            throw new v60("Error opening connection for " + this.c.a + " with offset " + j, e);
        }
    }

    @Override // defpackage.x60
    public void b() {
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e) {
                i50.a("Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue :(");
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (NullPointerException e3) {
                e = e3;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    public synchronized String c() {
        if (TextUtils.isEmpty(this.c.c)) {
            e();
        }
        return this.c.c;
    }

    public String d() {
        return this.c.a;
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.c + "}";
    }
}
