package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p000.InterfaceC3404wn;

/* renamed from: com.google.android.datatransport.runtime.backends.c */
/* loaded from: classes.dex */
final class C0771c extends AbstractC0776h {

    /* renamed from: a */
    private final Context f5377a;

    /* renamed from: b */
    private final InterfaceC3404wn f5378b;

    /* renamed from: c */
    private final InterfaceC3404wn f5379c;

    /* renamed from: d */
    private final String f5380d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0771c(Context context, InterfaceC3404wn interfaceC3404wn, InterfaceC3404wn interfaceC3404wn2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f5377a = context;
        if (interfaceC3404wn == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f5378b = interfaceC3404wn;
        if (interfaceC3404wn2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f5379c = interfaceC3404wn2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f5380d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC0776h
    /* renamed from: a */
    public Context mo6274a() {
        return this.f5377a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC0776h
    /* renamed from: b */
    public String mo6275b() {
        return this.f5380d;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC0776h
    /* renamed from: c */
    public InterfaceC3404wn mo6276c() {
        return this.f5379c;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC0776h
    /* renamed from: d */
    public InterfaceC3404wn mo6277d() {
        return this.f5378b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0776h)) {
            return false;
        }
        AbstractC0776h abstractC0776h = (AbstractC0776h) obj;
        return this.f5377a.equals(abstractC0776h.mo6274a()) && this.f5378b.equals(abstractC0776h.mo6277d()) && this.f5379c.equals(abstractC0776h.mo6276c()) && this.f5380d.equals(abstractC0776h.mo6275b());
    }

    public int hashCode() {
        return ((((((this.f5377a.hashCode() ^ 1000003) * 1000003) ^ this.f5378b.hashCode()) * 1000003) ^ this.f5379c.hashCode()) * 1000003) ^ this.f5380d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f5377a + ", wallClock=" + this.f5378b + ", monotonicClock=" + this.f5379c + ", backendName=" + this.f5380d + "}";
    }
}
