package p000;

import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class l90 {

    /* renamed from: a */
    public final e80 f11830a;

    /* renamed from: b */
    public final int f11831b;

    /* renamed from: c */
    public final String f11832c;

    public l90(e80 e80Var, int i, String str) {
        this.f11830a = e80Var;
        this.f11831b = i;
        this.f11832c = str;
    }

    /* renamed from: a */
    public static l90 m13833a(String str) {
        e80 e80Var;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                e80Var = e80.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                e80Var = e80.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            e80Var = e80.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i + 4);
            }
            return new l90(e80Var, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11830a == e80.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f11831b);
        if (this.f11832c != null) {
            sb.append(' ');
            sb.append(this.f11832c);
        }
        return sb.toString();
    }
}
