package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* loaded from: classes.dex */
public final class c80 extends h80 {

    /* renamed from: e */
    public static final b80 f2964e = b80.m3340a("multipart/mixed");

    /* renamed from: f */
    public static final b80 f2965f;

    /* renamed from: g */
    private static final byte[] f2966g;

    /* renamed from: h */
    private static final byte[] f2967h;

    /* renamed from: i */
    private static final byte[] f2968i;

    /* renamed from: a */
    private final ByteString f2969a;

    /* renamed from: b */
    private final b80 f2970b;

    /* renamed from: c */
    private final List<C0510b> f2971c;

    /* renamed from: d */
    private long f2972d = -1;

    /* renamed from: c80$a */
    /* loaded from: classes.dex */
    public static final class C0509a {

        /* renamed from: a */
        private final ByteString f2973a;

        /* renamed from: b */
        private b80 f2974b;

        /* renamed from: c */
        private final List<C0510b> f2975c;

        public C0509a() {
            this(UUID.randomUUID().toString());
        }

        public C0509a(String str) {
            this.f2974b = c80.f2964e;
            this.f2975c = new ArrayList();
            this.f2973a = ByteString.encodeUtf8(str);
        }

        /* renamed from: a */
        public C0509a m3613a(b80 b80Var) {
            if (b80Var == null) {
                throw new NullPointerException("type == null");
            }
            if (b80Var.m3344b().equals("multipart")) {
                this.f2974b = b80Var;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + b80Var);
        }

        /* renamed from: a */
        public C0509a m3614a(C0510b c0510b) {
            if (c0510b == null) {
                throw new NullPointerException("part == null");
            }
            this.f2975c.add(c0510b);
            return this;
        }

        /* renamed from: a */
        public C0509a m3615a(@Nullable y70 y70Var, h80 h80Var) {
            m3614a(C0510b.m3617a(y70Var, h80Var));
            return this;
        }

        /* renamed from: a */
        public c80 m3616a() {
            if (this.f2975c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new c80(this.f2973a, this.f2974b, this.f2975c);
        }
    }

    /* renamed from: c80$b */
    /* loaded from: classes.dex */
    public static final class C0510b {

        /* renamed from: a */
        @Nullable
        final y70 f2976a;

        /* renamed from: b */
        final h80 f2977b;

        private C0510b(@Nullable y70 y70Var, h80 h80Var) {
            this.f2976a = y70Var;
            this.f2977b = h80Var;
        }

        /* renamed from: a */
        public static C0510b m3617a(@Nullable y70 y70Var, h80 h80Var) {
            if (h80Var == null) {
                throw new NullPointerException("body == null");
            }
            if (y70Var != null && y70Var.m16593a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (y70Var == null || y70Var.m16593a("Content-Length") == null) {
                return new C0510b(y70Var, h80Var);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }

    static {
        b80.m3340a("multipart/alternative");
        b80.m3340a("multipart/digest");
        b80.m3340a("multipart/parallel");
        f2965f = b80.m3340a("multipart/form-data");
        f2966g = new byte[]{58, 32};
        f2967h = new byte[]{13, 10};
        f2968i = new byte[]{45, 45};
    }

    c80(ByteString byteString, b80 b80Var, List<C0510b> list) {
        this.f2969a = byteString;
        this.f2970b = b80.m3340a(b80Var + "; boundary=" + byteString.utf8());
        this.f2971c = o80.m14451a(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private long m3609a(@Nullable BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        if (z) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f2971c.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C0510b c0510b = this.f2971c.get(i);
            y70 y70Var = c0510b.f2976a;
            h80 h80Var = c0510b.f2977b;
            bufferedSink.write(f2968i);
            bufferedSink.write(this.f2969a);
            bufferedSink.write(f2967h);
            if (y70Var != null) {
                int m16595b = y70Var.m16595b();
                for (int i2 = 0; i2 < m16595b; i2++) {
                    bufferedSink.writeUtf8(y70Var.m16592a(i2)).write(f2966g).writeUtf8(y70Var.m16596b(i2)).write(f2967h);
                }
            }
            b80 mo3612b = h80Var.mo3612b();
            if (mo3612b != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(mo3612b.toString()).write(f2967h);
            }
            long mo3610a = h80Var.mo3610a();
            if (mo3610a != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(mo3610a).write(f2967h);
            } else if (z) {
                buffer.clear();
                return -1L;
            }
            bufferedSink.write(f2967h);
            if (z) {
                j += mo3610a;
            } else {
                h80Var.mo3611a(bufferedSink);
            }
            bufferedSink.write(f2967h);
        }
        bufferedSink.write(f2968i);
        bufferedSink.write(this.f2969a);
        bufferedSink.write(f2968i);
        bufferedSink.write(f2967h);
        if (!z) {
            return j;
        }
        long size2 = j + buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p000.h80
    /* renamed from: a */
    public long mo3610a() {
        long j = this.f2972d;
        if (j != -1) {
            return j;
        }
        long m3609a = m3609a((BufferedSink) null, true);
        this.f2972d = m3609a;
        return m3609a;
    }

    @Override // p000.h80
    /* renamed from: a */
    public void mo3611a(BufferedSink bufferedSink) {
        m3609a(bufferedSink, false);
    }

    @Override // p000.h80
    /* renamed from: b */
    public b80 mo3612b() {
        return this.f2970b;
    }
}
