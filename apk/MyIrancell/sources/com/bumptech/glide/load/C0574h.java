package com.bumptech.glide.load;

import java.security.MessageDigest;
import p000.C2816ji;

/* renamed from: com.bumptech.glide.load.h */
/* loaded from: classes.dex */
public final class C0574h<T> {

    /* renamed from: e */
    private static final b<Object> f3279e = new a();

    /* renamed from: a */
    private final T f3280a;

    /* renamed from: b */
    private final b<T> f3281b;

    /* renamed from: c */
    private final String f3282c;

    /* renamed from: d */
    private volatile byte[] f3283d;

    /* renamed from: com.bumptech.glide.load.h$a */
    /* loaded from: classes.dex */
    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.C0574h.b
        /* renamed from: a */
        public void mo3673a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.bumptech.glide.load.h$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        /* renamed from: a */
        void mo3673a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C0574h(String str, T t, b<T> bVar) {
        C2816ji.m13461a(str);
        this.f3282c = str;
        this.f3280a = t;
        C2816ji.m13459a(bVar);
        this.f3281b = bVar;
    }

    /* renamed from: a */
    public static <T> C0574h<T> m3955a(String str) {
        return new C0574h<>(str, null, m3958b());
    }

    /* renamed from: a */
    public static <T> C0574h<T> m3956a(String str, T t) {
        return new C0574h<>(str, t, m3958b());
    }

    /* renamed from: a */
    public static <T> C0574h<T> m3957a(String str, T t, b<T> bVar) {
        return new C0574h<>(str, t, bVar);
    }

    /* renamed from: b */
    private static <T> b<T> m3958b() {
        return (b<T>) f3279e;
    }

    /* renamed from: c */
    private byte[] m3959c() {
        if (this.f3283d == null) {
            this.f3283d = this.f3282c.getBytes(InterfaceC0573g.f3278a);
        }
        return this.f3283d;
    }

    /* renamed from: a */
    public T m3960a() {
        return this.f3280a;
    }

    /* renamed from: a */
    public void m3961a(T t, MessageDigest messageDigest) {
        this.f3281b.mo3673a(m3959c(), t, messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0574h) {
            return this.f3282c.equals(((C0574h) obj).f3282c);
        }
        return false;
    }

    public int hashCode() {
        return this.f3282c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f3282c + "'}";
    }
}
