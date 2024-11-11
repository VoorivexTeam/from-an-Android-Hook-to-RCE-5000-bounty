package p000;

import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSink;
import p000.c80;
import p000.g80;
import p000.w70;
import p000.z70;

/* loaded from: classes.dex */
final class db0 {

    /* renamed from: k */
    private static final char[] f9791k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l */
    private static final Pattern f9792l = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    private final String f9793a;

    /* renamed from: b */
    private final z70 f9794b;

    /* renamed from: c */
    @Nullable
    private String f9795c;

    /* renamed from: d */
    @Nullable
    private z70.C3515a f9796d;

    /* renamed from: e */
    private final g80.C2502a f9797e;

    /* renamed from: f */
    @Nullable
    private b80 f9798f;

    /* renamed from: g */
    private final boolean f9799g;

    /* renamed from: h */
    @Nullable
    private c80.C0509a f9800h;

    /* renamed from: i */
    @Nullable
    private w70.C3388a f9801i;

    /* renamed from: j */
    @Nullable
    private h80 f9802j;

    /* renamed from: db0$a */
    /* loaded from: classes.dex */
    private static class C2383a extends h80 {

        /* renamed from: a */
        private final h80 f9803a;

        /* renamed from: b */
        private final b80 f9804b;

        C2383a(h80 h80Var, b80 b80Var) {
            this.f9803a = h80Var;
            this.f9804b = b80Var;
        }

        @Override // p000.h80
        /* renamed from: a */
        public long mo3610a() {
            return this.f9803a.mo3610a();
        }

        @Override // p000.h80
        /* renamed from: a */
        public void mo3611a(BufferedSink bufferedSink) {
            this.f9803a.mo3611a(bufferedSink);
        }

        @Override // p000.h80
        /* renamed from: b */
        public b80 mo3612b() {
            return this.f9804b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public db0(String str, z70 z70Var, @Nullable String str2, @Nullable y70 y70Var, @Nullable b80 b80Var, boolean z, boolean z2, boolean z3) {
        this.f9793a = str;
        this.f9794b = z70Var;
        this.f9795c = str2;
        g80.C2502a c2502a = new g80.C2502a();
        this.f9797e = c2502a;
        this.f9798f = b80Var;
        this.f9799g = z;
        if (y70Var != null) {
            c2502a.m11930a(y70Var);
        }
        if (z2) {
            this.f9801i = new w70.C3388a();
        } else if (z3) {
            c80.C0509a c0509a = new c80.C0509a();
            this.f9800h = c0509a;
            c0509a.m3613a(c80.f2965f);
        }
    }

    /* renamed from: a */
    private static String m11348a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i);
                m11349a(buffer, str, i, length, z);
                return buffer.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: a */
    private static void m11349a(Buffer buffer, String str, int i, int i2, boolean z) {
        Buffer buffer2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(codePointAt);
                    while (!buffer2.exhausted()) {
                        int readByte = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        buffer.writeByte((int) f9791k[(readByte >> 4) & 15]);
                        buffer.writeByte((int) f9791k[readByte & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public g80.C2502a m11350a() {
        z70 m16807b;
        z70.C3515a c3515a = this.f9796d;
        if (c3515a != null) {
            m16807b = c3515a.m16835a();
        } else {
            m16807b = this.f9794b.m16807b(this.f9795c);
            if (m16807b == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f9794b + ", Relative: " + this.f9795c);
            }
        }
        h80 h80Var = this.f9802j;
        if (h80Var == null) {
            w70.C3388a c3388a = this.f9801i;
            if (c3388a != null) {
                h80Var = c3388a.m16155a();
            } else {
                c80.C0509a c0509a = this.f9800h;
                if (c0509a != null) {
                    h80Var = c0509a.m3616a();
                } else if (this.f9799g) {
                    h80Var = h80.m12147a((b80) null, new byte[0]);
                }
            }
        }
        b80 b80Var = this.f9798f;
        if (b80Var != null) {
            if (h80Var != null) {
                h80Var = new C2383a(h80Var, b80Var);
            } else {
                this.f9797e.m11929a("Content-Type", b80Var.toString());
            }
        }
        g80.C2502a c2502a = this.f9797e;
        c2502a.m11931a(m16807b);
        c2502a.m11928a(this.f9793a, h80Var);
        return c2502a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11351a(c80.C0510b c0510b) {
        this.f9800h.m3614a(c0510b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11352a(h80 h80Var) {
        this.f9802j = h80Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11353a(Object obj) {
        this.f9795c = obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11354a(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f9797e.m11929a(str, str2);
            return;
        }
        try {
            this.f9798f = b80.m3340a(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11355a(String str, String str2, boolean z) {
        if (z) {
            this.f9801i.m16156b(str, str2);
        } else {
            this.f9801i.m16154a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11356a(y70 y70Var, h80 h80Var) {
        this.f9800h.m3615a(y70Var, h80Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m11357b(String str, String str2, boolean z) {
        if (this.f9795c == null) {
            throw new AssertionError();
        }
        String m11348a = m11348a(str2, z);
        String replace = this.f9795c.replace("{" + str + "}", m11348a);
        if (!f9792l.matcher(replace).matches()) {
            this.f9795c = replace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m11358c(String str, @Nullable String str2, boolean z) {
        String str3 = this.f9795c;
        if (str3 != null) {
            z70.C3515a m16805a = this.f9794b.m16805a(str3);
            this.f9796d = m16805a;
            if (m16805a == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f9794b + ", Relative: " + this.f9795c);
            }
            this.f9795c = null;
        }
        if (z) {
            this.f9796d.m16833a(str, str2);
        } else {
            this.f9796d.m16838b(str, str2);
        }
    }
}
