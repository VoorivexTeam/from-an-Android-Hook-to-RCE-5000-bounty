package androidx.media;

import java.util.Arrays;

/* renamed from: androidx.media.c */
/* loaded from: classes.dex */
class C0316c implements InterfaceC0314a {

    /* renamed from: a */
    int f1928a = 0;

    /* renamed from: b */
    int f1929b = 0;

    /* renamed from: c */
    int f1930c = 0;

    /* renamed from: d */
    int f1931d = -1;

    /* renamed from: a */
    public int m2077a() {
        return this.f1929b;
    }

    /* renamed from: b */
    public int m2078b() {
        int i = this.f1930c;
        int m2079c = m2079c();
        if (m2079c == 6) {
            i |= 4;
        } else if (m2079c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int m2079c() {
        int i = this.f1931d;
        return i != -1 ? i : AudioAttributesCompat.m2075a(false, this.f1930c, this.f1928a);
    }

    /* renamed from: d */
    public int m2080d() {
        return this.f1928a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0316c)) {
            return false;
        }
        C0316c c0316c = (C0316c) obj;
        return this.f1929b == c0316c.m2077a() && this.f1930c == c0316c.m2078b() && this.f1928a == c0316c.m2080d() && this.f1931d == c0316c.f1931d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1929b), Integer.valueOf(this.f1930c), Integer.valueOf(this.f1928a), Integer.valueOf(this.f1931d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1931d != -1) {
            sb.append(" stream=");
            sb.append(this.f1931d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m2076a(this.f1928a));
        sb.append(" content=");
        sb.append(this.f1929b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1930c).toUpperCase());
        return sb.toString();
    }
}
