package p000;

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

    /* renamed from: a */
    static final p90[] f12745a = {new p90(p90.f12583i, ""), new p90(p90.f12580f, "GET"), new p90(p90.f12580f, "POST"), new p90(p90.f12581g, "/"), new p90(p90.f12581g, "/index.html"), new p90(p90.f12582h, "http"), new p90(p90.f12582h, "https"), new p90(p90.f12579e, "200"), new p90(p90.f12579e, "204"), new p90(p90.f12579e, "206"), new p90(p90.f12579e, "304"), new p90(p90.f12579e, "400"), new p90(p90.f12579e, "404"), new p90(p90.f12579e, "500"), new p90("accept-charset", ""), new p90("accept-encoding", "gzip, deflate"), new p90("accept-language", ""), new p90("accept-ranges", ""), new p90("accept", ""), new p90("access-control-allow-origin", ""), new p90("age", ""), new p90("allow", ""), new p90("authorization", ""), new p90("cache-control", ""), new p90("content-disposition", ""), new p90("content-encoding", ""), new p90("content-language", ""), new p90("content-length", ""), new p90("content-location", ""), new p90("content-range", ""), new p90("content-type", ""), new p90("cookie", ""), new p90("date", ""), new p90("etag", ""), new p90("expect", ""), new p90("expires", ""), new p90("from", ""), new p90("host", ""), new p90("if-match", ""), new p90("if-modified-since", ""), new p90("if-none-match", ""), new p90("if-range", ""), new p90("if-unmodified-since", ""), new p90("last-modified", ""), new p90("link", ""), new p90("location", ""), new p90("max-forwards", ""), new p90("proxy-authenticate", ""), new p90("proxy-authorization", ""), new p90("range", ""), new p90("referer", ""), new p90("refresh", ""), new p90("retry-after", ""), new p90("server", ""), new p90("set-cookie", ""), new p90("strict-transport-security", ""), new p90("transfer-encoding", ""), new p90("user-agent", ""), new p90("vary", ""), new p90("via", ""), new p90("www-authenticate", "")};

    /* renamed from: b */
    static final Map<ByteString, Integer> f12746b = m15004a();

    /* renamed from: q90$a */
    /* loaded from: classes.dex */
    static final class C3117a {

        /* renamed from: a */
        private final List<p90> f12747a;

        /* renamed from: b */
        private final BufferedSource f12748b;

        /* renamed from: c */
        private final int f12749c;

        /* renamed from: d */
        private int f12750d;

        /* renamed from: e */
        p90[] f12751e;

        /* renamed from: f */
        int f12752f;

        /* renamed from: g */
        int f12753g;

        /* renamed from: h */
        int f12754h;

        C3117a(int i, int i2, Source source) {
            this.f12747a = new ArrayList();
            this.f12751e = new p90[8];
            this.f12752f = r0.length - 1;
            this.f12753g = 0;
            this.f12754h = 0;
            this.f12749c = i;
            this.f12750d = i2;
            this.f12748b = Okio.buffer(source);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C3117a(int i, Source source) {
            this(i, i, source);
        }

        /* renamed from: a */
        private int m15006a(int i) {
            return this.f12752f + 1 + i;
        }

        /* renamed from: a */
        private void m15007a(int i, p90 p90Var) {
            this.f12747a.add(p90Var);
            int i2 = p90Var.f12586c;
            if (i != -1) {
                i2 -= this.f12751e[m15006a(i)].f12586c;
            }
            int i3 = this.f12750d;
            if (i2 > i3) {
                m15012e();
                return;
            }
            int m15008b = m15008b((this.f12754h + i2) - i3);
            if (i == -1) {
                int i4 = this.f12753g + 1;
                p90[] p90VarArr = this.f12751e;
                if (i4 > p90VarArr.length) {
                    p90[] p90VarArr2 = new p90[p90VarArr.length * 2];
                    System.arraycopy(p90VarArr, 0, p90VarArr2, p90VarArr.length, p90VarArr.length);
                    this.f12752f = this.f12751e.length - 1;
                    this.f12751e = p90VarArr2;
                }
                int i5 = this.f12752f;
                this.f12752f = i5 - 1;
                this.f12751e[i5] = p90Var;
                this.f12753g++;
            } else {
                this.f12751e[i + m15006a(i) + m15008b] = p90Var;
            }
            this.f12754h += i2;
        }

        /* renamed from: b */
        private int m15008b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f12751e.length;
                while (true) {
                    length--;
                    if (length < this.f12752f || i <= 0) {
                        break;
                    }
                    p90[] p90VarArr = this.f12751e;
                    i -= p90VarArr[length].f12586c;
                    this.f12754h -= p90VarArr[length].f12586c;
                    this.f12753g--;
                    i2++;
                }
                p90[] p90VarArr2 = this.f12751e;
                int i3 = this.f12752f;
                System.arraycopy(p90VarArr2, i3 + 1, p90VarArr2, i3 + 1 + i2, this.f12753g);
                this.f12752f += i2;
            }
            return i2;
        }

        /* renamed from: c */
        private ByteString m15009c(int i) {
            p90 p90Var;
            if (!m15011d(i)) {
                int m15006a = m15006a(i - q90.f12745a.length);
                if (m15006a >= 0) {
                    p90[] p90VarArr = this.f12751e;
                    if (m15006a < p90VarArr.length) {
                        p90Var = p90VarArr[m15006a];
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            p90Var = q90.f12745a[i];
            return p90Var.f12584a;
        }

        /* renamed from: d */
        private void m15010d() {
            int i = this.f12750d;
            int i2 = this.f12754h;
            if (i < i2) {
                if (i == 0) {
                    m15012e();
                } else {
                    m15008b(i2 - i);
                }
            }
        }

        /* renamed from: d */
        private boolean m15011d(int i) {
            return i >= 0 && i <= q90.f12745a.length - 1;
        }

        /* renamed from: e */
        private void m15012e() {
            Arrays.fill(this.f12751e, (Object) null);
            this.f12752f = this.f12751e.length - 1;
            this.f12753g = 0;
            this.f12754h = 0;
        }

        /* renamed from: e */
        private void m15013e(int i) {
            if (m15011d(i)) {
                this.f12747a.add(q90.f12745a[i]);
                return;
            }
            int m15006a = m15006a(i - q90.f12745a.length);
            if (m15006a >= 0) {
                p90[] p90VarArr = this.f12751e;
                if (m15006a < p90VarArr.length) {
                    this.f12747a.add(p90VarArr[m15006a]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: f */
        private int m15014f() {
            return this.f12748b.readByte() & 255;
        }

        /* renamed from: f */
        private void m15015f(int i) {
            m15007a(-1, new p90(m15009c(i), m15021b()));
        }

        /* renamed from: g */
        private void m15016g() {
            ByteString m15021b = m15021b();
            q90.m15005a(m15021b);
            m15007a(-1, new p90(m15021b, m15021b()));
        }

        /* renamed from: g */
        private void m15017g(int i) {
            this.f12747a.add(new p90(m15009c(i), m15021b()));
        }

        /* renamed from: h */
        private void m15018h() {
            ByteString m15021b = m15021b();
            q90.m15005a(m15021b);
            this.f12747a.add(new p90(m15021b, m15021b()));
        }

        /* renamed from: a */
        int m15019a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int m15014f = m15014f();
                if ((m15014f & 128) == 0) {
                    return i2 + (m15014f << i4);
                }
                i2 += (m15014f & 127) << i4;
                i4 += 7;
            }
        }

        /* renamed from: a */
        public List<p90> m15020a() {
            ArrayList arrayList = new ArrayList(this.f12747a);
            this.f12747a.clear();
            return arrayList;
        }

        /* renamed from: b */
        ByteString m15021b() {
            int m15014f = m15014f();
            boolean z = (m15014f & 128) == 128;
            int m15019a = m15019a(m15014f, 127);
            return z ? ByteString.m14632of(x90.m16471b().m16474a(this.f12748b.readByteArray(m15019a))) : this.f12748b.readByteString(m15019a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m15022c() {
            while (!this.f12748b.exhausted()) {
                int readByte = this.f12748b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    m15013e(m15019a(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m15016g();
                } else if ((readByte & 64) == 64) {
                    m15015f(m15019a(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m15019a = m15019a(readByte, 31);
                    this.f12750d = m15019a;
                    if (m15019a < 0 || m15019a > this.f12749c) {
                        throw new IOException("Invalid dynamic table size update " + this.f12750d);
                    }
                    m15010d();
                } else if (readByte == 16 || readByte == 0) {
                    m15018h();
                } else {
                    m15017g(m15019a(readByte, 15) - 1);
                }
            }
        }
    }

    /* renamed from: q90$b */
    /* loaded from: classes.dex */
    static final class C3118b {

        /* renamed from: a */
        private final Buffer f12755a;

        /* renamed from: b */
        private final boolean f12756b;

        /* renamed from: c */
        private int f12757c;

        /* renamed from: d */
        private boolean f12758d;

        /* renamed from: e */
        int f12759e;

        /* renamed from: f */
        p90[] f12760f;

        /* renamed from: g */
        int f12761g;

        /* renamed from: h */
        int f12762h;

        /* renamed from: i */
        int f12763i;

        C3118b(int i, boolean z, Buffer buffer) {
            this.f12757c = Integer.MAX_VALUE;
            this.f12760f = new p90[8];
            this.f12761g = r0.length - 1;
            this.f12762h = 0;
            this.f12763i = 0;
            this.f12759e = i;
            this.f12756b = z;
            this.f12755a = buffer;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C3118b(Buffer buffer) {
            this(4096, true, buffer);
        }

        /* renamed from: a */
        private void m15023a() {
            int i = this.f12759e;
            int i2 = this.f12763i;
            if (i < i2) {
                if (i == 0) {
                    m15026b();
                } else {
                    m15025b(i2 - i);
                }
            }
        }

        /* renamed from: a */
        private void m15024a(p90 p90Var) {
            int i = p90Var.f12586c;
            int i2 = this.f12759e;
            if (i > i2) {
                m15026b();
                return;
            }
            m15025b((this.f12763i + i) - i2);
            int i3 = this.f12762h + 1;
            p90[] p90VarArr = this.f12760f;
            if (i3 > p90VarArr.length) {
                p90[] p90VarArr2 = new p90[p90VarArr.length * 2];
                System.arraycopy(p90VarArr, 0, p90VarArr2, p90VarArr.length, p90VarArr.length);
                this.f12761g = this.f12760f.length - 1;
                this.f12760f = p90VarArr2;
            }
            int i4 = this.f12761g;
            this.f12761g = i4 - 1;
            this.f12760f[i4] = p90Var;
            this.f12762h++;
            this.f12763i += i;
        }

        /* renamed from: b */
        private int m15025b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f12760f.length;
                while (true) {
                    length--;
                    if (length < this.f12761g || i <= 0) {
                        break;
                    }
                    p90[] p90VarArr = this.f12760f;
                    i -= p90VarArr[length].f12586c;
                    this.f12763i -= p90VarArr[length].f12586c;
                    this.f12762h--;
                    i2++;
                }
                p90[] p90VarArr2 = this.f12760f;
                int i3 = this.f12761g;
                System.arraycopy(p90VarArr2, i3 + 1, p90VarArr2, i3 + 1 + i2, this.f12762h);
                p90[] p90VarArr3 = this.f12760f;
                int i4 = this.f12761g;
                Arrays.fill(p90VarArr3, i4 + 1, i4 + 1 + i2, (Object) null);
                this.f12761g += i2;
            }
            return i2;
        }

        /* renamed from: b */
        private void m15026b() {
            Arrays.fill(this.f12760f, (Object) null);
            this.f12761g = this.f12760f.length - 1;
            this.f12762h = 0;
            this.f12763i = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m15027a(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.f12759e;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.f12757c = Math.min(this.f12757c, min);
            }
            this.f12758d = true;
            this.f12759e = min;
            m15023a();
        }

        /* renamed from: a */
        void m15028a(int i, int i2, int i3) {
            int i4;
            Buffer buffer;
            if (i < i2) {
                buffer = this.f12755a;
                i4 = i | i3;
            } else {
                this.f12755a.writeByte(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f12755a.writeByte(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                buffer = this.f12755a;
            }
            buffer.writeByte(i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m15029a(List<p90> list) {
            int i;
            int i2;
            if (this.f12758d) {
                int i3 = this.f12757c;
                if (i3 < this.f12759e) {
                    m15028a(i3, 31, 32);
                }
                this.f12758d = false;
                this.f12757c = Integer.MAX_VALUE;
                m15028a(this.f12759e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                p90 p90Var = list.get(i4);
                ByteString asciiLowercase = p90Var.f12584a.toAsciiLowercase();
                ByteString byteString = p90Var.f12585b;
                Integer num = q90.f12746b.get(asciiLowercase);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (i > 1 && i < 8) {
                        if (o80.m14461a(q90.f12745a[i - 1].f12585b, byteString)) {
                            i2 = i;
                        } else if (o80.m14461a(q90.f12745a[i].f12585b, byteString)) {
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
                    int i5 = this.f12761g + 1;
                    int length = this.f12760f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (o80.m14461a(this.f12760f[i5].f12584a, asciiLowercase)) {
                            if (o80.m14461a(this.f12760f[i5].f12585b, byteString)) {
                                i = q90.f12745a.length + (i5 - this.f12761g);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i5 - this.f12761g) + q90.f12745a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i != -1) {
                    m15028a(i, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.f12755a.writeByte(64);
                        m15030a(asciiLowercase);
                    } else if (!asciiLowercase.startsWith(p90.f12578d) || p90.f12583i.equals(asciiLowercase)) {
                        m15028a(i2, 63, 64);
                    } else {
                        m15028a(i2, 15, 0);
                        m15030a(byteString);
                    }
                    m15030a(byteString);
                    m15024a(p90Var);
                }
            }
        }

        /* renamed from: a */
        void m15030a(ByteString byteString) {
            int size;
            int i;
            if (!this.f12756b || x90.m16471b().m16472a(byteString) >= byteString.size()) {
                size = byteString.size();
                i = 0;
            } else {
                Buffer buffer = new Buffer();
                x90.m16471b().m16473a(byteString, buffer);
                byteString = buffer.readByteString();
                size = byteString.size();
                i = 128;
            }
            m15028a(size, 127, i);
            this.f12755a.write(byteString);
        }
    }

    /* renamed from: a */
    private static Map<ByteString, Integer> m15004a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f12745a.length);
        int i = 0;
        while (true) {
            p90[] p90VarArr = f12745a;
            if (i >= p90VarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(p90VarArr[i].f12584a)) {
                linkedHashMap.put(f12745a[i].f12584a, Integer.valueOf(i));
            }
            i++;
        }
    }

    /* renamed from: a */
    static ByteString m15005a(ByteString byteString) {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            if (b >= 65 && b <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }
}
