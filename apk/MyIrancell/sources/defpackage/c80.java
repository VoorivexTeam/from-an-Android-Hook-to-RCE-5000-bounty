package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* loaded from: classes.dex */
public final class c80 extends h80 {
    public static final b80 e = b80.a("multipart/mixed");
    public static final b80 f;
    private static final byte[] g;
    private static final byte[] h;
    private static final byte[] i;
    private final ByteString a;
    private final b80 b;
    private final List<b> c;
    private long d = -1;

    /* loaded from: classes.dex */
    public static final class a {
        private final ByteString a;
        private b80 b;
        private final List<b> c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a(String str) {
            this.b = c80.e;
            this.c = new ArrayList();
            this.a = ByteString.encodeUtf8(str);
        }

        public a a(b80 b80Var) {
            if (b80Var == null) {
                throw new NullPointerException("type == null");
            }
            if (b80Var.b().equals("multipart")) {
                this.b = b80Var;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + b80Var);
        }

        public a a(b bVar) {
            if (bVar == null) {
                throw new NullPointerException("part == null");
            }
            this.c.add(bVar);
            return this;
        }

        public a a(@Nullable y70 y70Var, h80 h80Var) {
            a(b.a(y70Var, h80Var));
            return this;
        }

        public c80 a() {
            if (this.c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new c80(this.a, this.b, this.c);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        @Nullable
        final y70 a;
        final h80 b;

        private b(@Nullable y70 y70Var, h80 h80Var) {
            this.a = y70Var;
            this.b = h80Var;
        }

        public static b a(@Nullable y70 y70Var, h80 h80Var) {
            if (h80Var == null) {
                throw new NullPointerException("body == null");
            }
            if (y70Var != null && y70Var.a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (y70Var == null || y70Var.a("Content-Length") == null) {
                return new b(y70Var, h80Var);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }

    static {
        b80.a("multipart/alternative");
        b80.a("multipart/digest");
        b80.a("multipart/parallel");
        f = b80.a("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    c80(ByteString byteString, b80 b80Var, List<b> list) {
        this.a = byteString;
        this.b = b80.a(b80Var + "; boundary=" + byteString.utf8());
        this.c = o80.a(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long a(@Nullable BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        if (z) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.c.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.c.get(i2);
            y70 y70Var = bVar.a;
            h80 h80Var = bVar.b;
            bufferedSink.write(i);
            bufferedSink.write(this.a);
            bufferedSink.write(h);
            if (y70Var != null) {
                int b2 = y70Var.b();
                for (int i3 = 0; i3 < b2; i3++) {
                    bufferedSink.writeUtf8(y70Var.a(i3)).write(g).writeUtf8(y70Var.b(i3)).write(h);
                }
            }
            b80 b3 = h80Var.b();
            if (b3 != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(b3.toString()).write(h);
            }
            long a2 = h80Var.a();
            if (a2 != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(a2).write(h);
            } else if (z) {
                buffer.clear();
                return -1L;
            }
            bufferedSink.write(h);
            if (z) {
                j += a2;
            } else {
                h80Var.a(bufferedSink);
            }
            bufferedSink.write(h);
        }
        bufferedSink.write(i);
        bufferedSink.write(this.a);
        bufferedSink.write(i);
        bufferedSink.write(h);
        if (!z) {
            return j;
        }
        long size2 = j + buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // defpackage.h80
    public long a() {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long a2 = a((BufferedSink) null, true);
        this.d = a2;
        return a2;
    }

    @Override // defpackage.h80
    public void a(BufferedSink bufferedSink) {
        a(bufferedSink, false);
    }

    @Override // defpackage.h80
    public b80 b() {
        return this.b;
    }
}
