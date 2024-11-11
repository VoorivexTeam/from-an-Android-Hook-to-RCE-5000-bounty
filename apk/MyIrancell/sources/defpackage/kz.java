package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class kz {
    private final byte[] a;
    private final String b;
    private final List<byte[]> c;
    private final String d;
    private Object e;
    private final int f;
    private final int g;

    public kz(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public kz(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.a = bArr;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.f = i2;
        this.g = i;
    }

    public List<byte[]> a() {
        return this.c;
    }

    public void a(Integer num) {
    }

    public void a(Object obj) {
        this.e = obj;
    }

    public String b() {
        return this.d;
    }

    public void b(Integer num) {
    }

    public Object c() {
        return this.e;
    }

    public byte[] d() {
        return this.a;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public String g() {
        return this.b;
    }

    public boolean h() {
        return this.f >= 0 && this.g >= 0;
    }
}
