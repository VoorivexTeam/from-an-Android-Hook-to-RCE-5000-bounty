package defpackage;

import defpackage.c80;
import defpackage.g80;
import defpackage.w70;
import defpackage.z70;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSink;

/* loaded from: classes.dex */
final class db0 {
    private static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern l = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private final String a;
    private final z70 b;

    @Nullable
    private String c;

    @Nullable
    private z70.a d;
    private final g80.a e;

    @Nullable
    private b80 f;
    private final boolean g;

    @Nullable
    private c80.a h;

    @Nullable
    private w70.a i;

    @Nullable
    private h80 j;

    /* loaded from: classes.dex */
    private static class a extends h80 {
        private final h80 a;
        private final b80 b;

        a(h80 h80Var, b80 b80Var) {
            this.a = h80Var;
            this.b = b80Var;
        }

        @Override // defpackage.h80
        public long a() {
            return this.a.a();
        }

        @Override // defpackage.h80
        public void a(BufferedSink bufferedSink) {
            this.a.a(bufferedSink);
        }

        @Override // defpackage.h80
        public b80 b() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public db0(String str, z70 z70Var, @Nullable String str2, @Nullable y70 y70Var, @Nullable b80 b80Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z70Var;
        this.c = str2;
        g80.a aVar = new g80.a();
        this.e = aVar;
        this.f = b80Var;
        this.g = z;
        if (y70Var != null) {
            aVar.a(y70Var);
        }
        if (z2) {
            this.i = new w70.a();
        } else if (z3) {
            c80.a aVar2 = new c80.a();
            this.h = aVar2;
            aVar2.a(c80.f);
        }
    }

    private static String a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i);
                a(buffer, str, i, length, z);
                return buffer.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void a(Buffer buffer, String str, int i, int i2, boolean z) {
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
                        buffer.writeByte((int) k[(readByte >> 4) & 15]);
                        buffer.writeByte((int) k[readByte & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g80.a a() {
        z70 b;
        z70.a aVar = this.d;
        if (aVar != null) {
            b = aVar.a();
        } else {
            b = this.b.b(this.c);
            if (b == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
        }
        h80 h80Var = this.j;
        if (h80Var == null) {
            w70.a aVar2 = this.i;
            if (aVar2 != null) {
                h80Var = aVar2.a();
            } else {
                c80.a aVar3 = this.h;
                if (aVar3 != null) {
                    h80Var = aVar3.a();
                } else if (this.g) {
                    h80Var = h80.a((b80) null, new byte[0]);
                }
            }
        }
        b80 b80Var = this.f;
        if (b80Var != null) {
            if (h80Var != null) {
                h80Var = new a(h80Var, b80Var);
            } else {
                this.e.a("Content-Type", b80Var.toString());
            }
        }
        g80.a aVar4 = this.e;
        aVar4.a(b);
        aVar4.a(this.a, h80Var);
        return aVar4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c80.b bVar) {
        this.h.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(h80 h80Var) {
        this.j = h80Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Object obj) {
        this.c = obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.e.a(str, str2);
            return;
        }
        try {
            this.f = b80.a(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z) {
        if (z) {
            this.i.b(str, str2);
        } else {
            this.i.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(y70 y70Var, h80 h80Var) {
        this.h.a(y70Var, h80Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, String str2, boolean z) {
        if (this.c == null) {
            throw new AssertionError();
        }
        String a2 = a(str2, z);
        String replace = this.c.replace("{" + str + "}", a2);
        if (!l.matcher(replace).matches()) {
            this.c = replace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str, @Nullable String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            z70.a a2 = this.b.a(str3);
            this.d = a2;
            if (a2 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
            this.c = null;
        }
        if (z) {
            this.d.a(str, str2);
        } else {
            this.d.b(str, str2);
        }
    }
}
