package p000;

import okio.ByteString;

/* loaded from: classes.dex */
public final class p90 {

    /* renamed from: d */
    public static final ByteString f12578d = ByteString.encodeUtf8(":");

    /* renamed from: e */
    public static final ByteString f12579e = ByteString.encodeUtf8(":status");

    /* renamed from: f */
    public static final ByteString f12580f = ByteString.encodeUtf8(":method");

    /* renamed from: g */
    public static final ByteString f12581g = ByteString.encodeUtf8(":path");

    /* renamed from: h */
    public static final ByteString f12582h = ByteString.encodeUtf8(":scheme");

    /* renamed from: i */
    public static final ByteString f12583i = ByteString.encodeUtf8(":authority");

    /* renamed from: a */
    public final ByteString f12584a;

    /* renamed from: b */
    public final ByteString f12585b;

    /* renamed from: c */
    final int f12586c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p90$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3077a {
        /* renamed from: a */
        void m14740a(y70 y70Var);
    }

    public p90(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public p90(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public p90(ByteString byteString, ByteString byteString2) {
        this.f12584a = byteString;
        this.f12585b = byteString2;
        this.f12586c = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        return this.f12584a.equals(p90Var.f12584a) && this.f12585b.equals(p90Var.f12585b);
    }

    public int hashCode() {
        return ((527 + this.f12584a.hashCode()) * 31) + this.f12585b.hashCode();
    }

    public String toString() {
        return o80.m14446a("%s: %s", this.f12584a.utf8(), this.f12585b.utf8());
    }
}
