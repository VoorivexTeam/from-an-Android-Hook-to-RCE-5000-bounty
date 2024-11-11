package defpackage;

import okio.ByteString;

/* loaded from: classes.dex */
public final class p90 {
    public static final ByteString d = ByteString.encodeUtf8(":");
    public static final ByteString e = ByteString.encodeUtf8(":status");
    public static final ByteString f = ByteString.encodeUtf8(":method");
    public static final ByteString g = ByteString.encodeUtf8(":path");
    public static final ByteString h = ByteString.encodeUtf8(":scheme");
    public static final ByteString i = ByteString.encodeUtf8(":authority");
    public final ByteString a;
    public final ByteString b;
    final int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(y70 y70Var);
    }

    public p90(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public p90(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public p90(ByteString byteString, ByteString byteString2) {
        this.a = byteString;
        this.b = byteString2;
        this.c = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        return this.a.equals(p90Var.a) && this.b.equals(p90Var.b);
    }

    public int hashCode() {
        return ((527 + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return o80.a("%s: %s", this.a.utf8(), this.b.utf8());
    }
}
