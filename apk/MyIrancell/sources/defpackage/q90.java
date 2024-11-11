package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q90 {
    static final p90[] a = {new p90(p90.i, ""), new p90(p90.f, "GET"), new p90(p90.f, "POST"), new p90(p90.g, "/"), new p90(p90.g, "/index.html"), new p90(p90.h, "http"), new p90(p90.h, "https"), new p90(p90.e, "200"), new p90(p90.e, "204"), new p90(p90.e, "206"), new p90(p90.e, "304"), new p90(p90.e, "400"), new p90(p90.e, "404"), new p90(p90.e, "500"), new p90("accept-charset", ""), new p90("accept-encoding", "gzip, deflate"), new p90("accept-language", ""), new p90("accept-ranges", ""), new p90("accept", ""), new p90("access-control-allow-origin", ""), new p90("age", ""), new p90("allow", ""), new p90("authorization", ""), new p90("cache-control", ""), new p90("content-disposition", ""), new p90("content-encoding", ""), new p90("content-language", ""), new p90("content-length", ""), new p90("content-location", ""), new p90("content-range", ""), new p90("content-type", ""), new p90("cookie", ""), new p90("date", ""), new p90("etag", ""), new p90("expect", ""), new p90("expires", ""), new p90("from", ""), new p90("host", ""), new p90("if-match", ""), new p90("if-modified-since", ""), new p90("if-none-match", ""), new p90("if-range", ""), new p90("if-unmodified-since", ""), new p90("last-modified", ""), new p90("link", ""), new p90("location", ""), new p90("max-forwards", ""), new p90("proxy-authenticate", ""), new p90("proxy-authorization", ""), new p90("range", ""), new p90("referer", ""), new p90("refresh", ""), new p90("retry-after", ""), new p90("server", ""), new p90("set-cookie", ""), new p90("strict-transport-security", ""), new p90("transfer-encoding", ""), new p90("user-agent", ""), new p90("vary", ""), new p90("via", ""), new p90("www-authenticate", "")};
    static final Map<ByteString, Integer> b = a();

    /* loaded from: classes.dex */
    static final class a {
        private final List<p90> a;
        private final BufferedSource b;
        private final int c;
        private int d;
        p90[] e;
        int f;
        int g;
        int h;

        a(int i, int i2, Source source) {
            this.a = new ArrayList();
            this.e = new p90[8];
            this.f = r0.length - 1;
            this.g = 0;
            this.h = 0;
            this.c = i;
            this.d = i2;
            this.b = Okio.buffer(source);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i, Source source) {
            this(i, i, source);
        }

        private int a(int i) {
            return this.f + 1 + i;
        }

        private void a(int i, p90 p90Var) {
            this.a.add(p90Var);
            int i2 = p90Var.c;
            if (i != -1) {
                i2 -= this.e[a(i)].c;
            }
            int i3 = this.d;
            if (i2 > i3) {
                e();
                return;
            }
            int b = b((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                p90[] p90VarArr = this.e;
                if (i4 > p90VarArr.length) {
                    p90[] p90VarArr2 = new p90[p90VarArr.length * 2];
                    System.arraycopy(p90VarArr, 0, p90VarArr2, p90VarArr.length, p90VarArr.length);
                    this.f = this.e.length - 1;
                    this.e = p90VarArr2;
                }
                int i5 = this.f;
                this.f = i5 - 1;
                this.e[i5] = p90Var;
                this.g++;
            } else {
                this.e[i + a(i) + b] = p90Var;
            }
            this.h += i2;
        }

        private int b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    if (length < this.f || i <= 0) {
                        break;
                    }
                    p90[] p90VarArr = this.e;
                    i -= p90VarArr[length].c;
                    this.h -= p90VarArr[length].c;
                    this.g--;
                    i2++;
                }
                p90[] p90VarArr2 = this.e;
                int i3 = this.f;
                System.arraycopy(p90VarArr2, i3 + 1, p90VarArr2, i3 + 1 + i2, this.g);
                this.f += i2;
            }
            return i2;
        }

        private ByteString c(int i) {
            p90 p90Var;
            if (!d(i)) {
                int a = a(i - q90.a.length);
                if (a >= 0) {
                    p90[] p90VarArr = this.e;
                    if (a < p90VarArr.length) {
                        p90Var = p90VarArr[a];
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            p90Var = q90.a[i];
            return p90Var.a;
        }

        private void d() {
            int i = this.d;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    e();
                } else {
                    b(i2 - i);
                }
            }
        }

        private boolean d(int i) {
            return i >= 0 && i <= q90.a.length - 1;
        }

        private void e() {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private void e(int i) {
            if (d(i)) {
                this.a.add(q90.a[i]);
                return;
            }
            int a = a(i - q90.a.length);
            if (a >= 0) {
                p90[] p90VarArr = this.e;
                if (a < p90VarArr.length) {
                    this.a.add(p90VarArr[a]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private int f() {
            return this.b.readByte() & 255;
        }

        private void f(int i) {
            a(-1, new p90(c(i), b()));
        }

        private void g() {
            ByteString b = b();
            q90.a(b);
            a(-1, new p90(b, b()));
        }

        private void g(int i) {
            this.a.add(new p90(c(i), b()));
        }

        private void h() {
            ByteString b = b();
            q90.a(b);
            this.a.add(new p90(b, b()));
        }

        int a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int f = f();
                if ((f & 128) == 0) {
                    return i2 + (f << i4);
                }
                i2 += (f & 127) << i4;
                i4 += 7;
            }
        }

        public List<p90> a() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        ByteString b() {
            int f = f();
            boolean z = (f & 128) == 128;
            int a = a(f, 127);
            return z ? ByteString.of(x90.b().a(this.b.readByteArray(a))) : this.b.readByteString(a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            while (!this.b.exhausted()) {
                int readByte = this.b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    e(a(readByte, 127) - 1);
                } else if (readByte == 64) {
                    g();
                } else if ((readByte & 64) == 64) {
                    f(a(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int a = a(readByte, 31);
                    this.d = a;
                    if (a < 0 || a > this.c) {
                        throw new IOException("Invalid dynamic table size update " + this.d);
                    }
                    d();
                } else if (readByte == 16 || readByte == 0) {
                    h();
                } else {
                    g(a(readByte, 15) - 1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b {
        private final Buffer a;
        private final boolean b;
        private int c;
        private boolean d;
        int e;
        p90[] f;
        int g;
        int h;
        int i;

        b(int i, boolean z, Buffer buffer) {
            this.c = Integer.MAX_VALUE;
            this.f = new p90[8];
            this.g = r0.length - 1;
            this.h = 0;
            this.i = 0;
            this.e = i;
            this.b = z;
            this.a = buffer;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Buffer buffer) {
            this(4096, true, buffer);
        }

        private void a() {
            int i = this.e;
            int i2 = this.i;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    b(i2 - i);
                }
            }
        }

        private void a(p90 p90Var) {
            int i = p90Var.c;
            int i2 = this.e;
            if (i > i2) {
                b();
                return;
            }
            b((this.i + i) - i2);
            int i3 = this.h + 1;
            p90[] p90VarArr = this.f;
            if (i3 > p90VarArr.length) {
                p90[] p90VarArr2 = new p90[p90VarArr.length * 2];
                System.arraycopy(p90VarArr, 0, p90VarArr2, p90VarArr.length, p90VarArr.length);
                this.g = this.f.length - 1;
                this.f = p90VarArr2;
            }
            int i4 = this.g;
            this.g = i4 - 1;
            this.f[i4] = p90Var;
            this.h++;
            this.i += i;
        }

        private int b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f.length;
                while (true) {
                    length--;
                    if (length < this.g || i <= 0) {
                        break;
                    }
                    p90[] p90VarArr = this.f;
                    i -= p90VarArr[length].c;
                    this.i -= p90VarArr[length].c;
                    this.h--;
                    i2++;
                }
                p90[] p90VarArr2 = this.f;
                int i3 = this.g;
                System.arraycopy(p90VarArr2, i3 + 1, p90VarArr2, i3 + 1 + i2, this.h);
                p90[] p90VarArr3 = this.f;
                int i4 = this.g;
                Arrays.fill(p90VarArr3, i4 + 1, i4 + 1 + i2, (Object) null);
                this.g += i2;
            }
            return i2;
        }

        private void b() {
            Arrays.fill(this.f, (Object) null);
            this.g = this.f.length - 1;
            this.h = 0;
            this.i = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.e;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.c = Math.min(this.c, min);
            }
            this.d = true;
            this.e = min;
            a();
        }

        void a(int i, int i2, int i3) {
            int i4;
            Buffer buffer;
            if (i < i2) {
                buffer = this.a;
                i4 = i | i3;
            } else {
                this.a.writeByte(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.a.writeByte(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                buffer = this.a;
            }
            buffer.writeByte(i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(List<p90> list) {
            int i;
            int i2;
            if (this.d) {
                int i3 = this.c;
                if (i3 < this.e) {
                    a(i3, 31, 32);
                }
                this.d = false;
                this.c = Integer.MAX_VALUE;
                a(this.e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                p90 p90Var = list.get(i4);
                ByteString asciiLowercase = p90Var.a.toAsciiLowercase();
                ByteString byteString = p90Var.b;
                Integer num = q90.b.get(asciiLowercase);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (i > 1 && i < 8) {
                        if (o80.a(q90.a[i - 1].b, byteString)) {
                            i2 = i;
                        } else if (o80.a(q90.a[i].b, byteString)) {
                            i2 = i;
                            i++;
                        }
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i == -1) {
                    int i5 = this.g + 1;
                    int length = this.f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (o80.a(this.f[i5].a, asciiLowercase)) {
                            if (o80.a(this.f[i5].b, byteString)) {
                                i = q90.a.length + (i5 - this.g);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i5 - this.g) + q90.a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i != -1) {
                    a(i, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.a.writeByte(64);
                        a(asciiLowercase);
                    } else if (!asciiLowercase.startsWith(p90.d) || p90.i.equals(asciiLowercase)) {
                        a(i2, 63, 64);
                    } else {
                        a(i2, 15, 0);
                        a(byteString);
                    }
                    a(byteString);
                    a(p90Var);
                }
            }
        }

        void a(ByteString byteString) {
            int size;
            int i;
            if (!this.b || x90.b().a(byteString) >= byteString.size()) {
                size = byteString.size();
                i = 0;
            } else {
                Buffer buffer = new Buffer();
                x90.b().a(byteString, buffer);
                byteString = buffer.readByteString();
                size = byteString.size();
                i = 128;
            }
            a(size, 127, i);
            this.a.write(byteString);
        }
    }

    private static Map<ByteString, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        int i = 0;
        while (true) {
            p90[] p90VarArr = a;
            if (i >= p90VarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(p90VarArr[i].a)) {
                linkedHashMap.put(a[i].a, Integer.valueOf(i));
            }
            i++;
        }
    }

    static ByteString a(ByteString byteString) {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b2 = byteString.getByte(i);
            if (b2 >= 65 && b2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }
}
