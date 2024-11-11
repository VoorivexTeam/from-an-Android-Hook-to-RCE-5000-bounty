package com.bumptech.glide.load;

import defpackage.bi;
import defpackage.c0;
import defpackage.i0;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class i implements g {
    private final c0<h<?>, Object> b = new bi();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.a((h<T>) obj, messageDigest);
    }

    public <T> i a(h<T> hVar, T t) {
        this.b.put(hVar, t);
        return this;
    }

    public <T> T a(h<T> hVar) {
        return this.b.containsKey(hVar) ? (T) this.b.get(hVar) : hVar.a();
    }

    public void a(i iVar) {
        this.b.a((i0<? extends h<?>, ? extends Object>) iVar.b);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        for (int i = 0; i < this.b.size(); i++) {
            a(this.b.b(i), this.b.d(i), messageDigest);
        }
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.b.equals(((i) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.b + '}';
    }
}
