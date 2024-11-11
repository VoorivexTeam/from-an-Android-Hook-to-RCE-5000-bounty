package com.bumptech.glide.load;

import java.security.MessageDigest;
import p000.C0481bi;
import p000.C0500c0;
import p000.C2573i0;

/* renamed from: com.bumptech.glide.load.i */
/* loaded from: classes.dex */
public final class C0575i implements InterfaceC0573g {

    /* renamed from: b */
    private final C0500c0<C0574h<?>, Object> f3284b = new C0481bi();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> void m3962a(C0574h<T> c0574h, Object obj, MessageDigest messageDigest) {
        c0574h.m3961a((C0574h<T>) obj, messageDigest);
    }

    /* renamed from: a */
    public <T> C0575i m3963a(C0574h<T> c0574h, T t) {
        this.f3284b.put(c0574h, t);
        return this;
    }

    /* renamed from: a */
    public <T> T m3964a(C0574h<T> c0574h) {
        return this.f3284b.containsKey(c0574h) ? (T) this.f3284b.get(c0574h) : c0574h.m3960a();
    }

    /* renamed from: a */
    public void m3965a(C0575i c0575i) {
        this.f3284b.mo3397a((C2573i0<? extends C0574h<?>, ? extends Object>) c0575i.f3284b);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    /* renamed from: a */
    public void mo3954a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f3284b.size(); i++) {
            m3962a(this.f3284b.m12310b(i), this.f3284b.m12311d(i), messageDigest);
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public boolean equals(Object obj) {
        if (obj instanceof C0575i) {
            return this.f3284b.equals(((C0575i) obj).f3284b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public int hashCode() {
        return this.f3284b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f3284b + '}';
    }
}
