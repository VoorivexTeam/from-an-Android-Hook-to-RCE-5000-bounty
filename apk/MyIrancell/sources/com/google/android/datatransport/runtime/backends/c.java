package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import defpackage.wn;

/* loaded from: classes.dex */
final class c extends h {
    private final Context a;
    private final wn b;
    private final wn c;
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, wn wnVar, wn wnVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (wnVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = wnVar;
        if (wnVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = wnVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public Context a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public String b() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public wn c() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public wn d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.a()) && this.b.equals(hVar.d()) && this.c.equals(hVar.c()) && this.d.equals(hVar.b());
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.d + "}";
    }
}
