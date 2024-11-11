package com.bumptech.glide.load;

import defpackage.ji;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h<T> {
    private static final b<Object> e = new a();
    private final T a;
    private final b<T> b;
    private final String c;
    private volatile byte[] d;

    /* loaded from: classes.dex */
    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.h.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private h(String str, T t, b<T> bVar) {
        ji.a(str);
        this.c = str;
        this.a = t;
        ji.a(bVar);
        this.b = bVar;
    }

    public static <T> h<T> a(String str) {
        return new h<>(str, null, b());
    }

    public static <T> h<T> a(String str, T t) {
        return new h<>(str, t, b());
    }

    public static <T> h<T> a(String str, T t, b<T> bVar) {
        return new h<>(str, t, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) e;
    }

    private byte[] c() {
        if (this.d == null) {
            this.d = this.c.getBytes(g.a);
        }
        return this.d;
    }

    public T a() {
        return this.a;
    }

    public void a(T t, MessageDigest messageDigest) {
        this.b.a(c(), t, messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.c.equals(((h) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.c + "'}";
    }
}
