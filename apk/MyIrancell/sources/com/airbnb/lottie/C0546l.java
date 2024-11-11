package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.l */
/* loaded from: classes.dex */
public final class C0546l<V> {

    /* renamed from: a */
    private final V f3181a;

    /* renamed from: b */
    private final Throwable f3182b;

    public C0546l(V v) {
        this.f3181a = v;
        this.f3182b = null;
    }

    public C0546l(Throwable th) {
        this.f3182b = th;
        this.f3181a = null;
    }

    /* renamed from: a */
    public Throwable m3839a() {
        return this.f3182b;
    }

    /* renamed from: b */
    public V m3840b() {
        return this.f3181a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0546l)) {
            return false;
        }
        C0546l c0546l = (C0546l) obj;
        if (m3840b() != null && m3840b().equals(c0546l.m3840b())) {
            return true;
        }
        if (m3839a() == null || c0546l.m3839a() == null) {
            return false;
        }
        return m3839a().toString().equals(m3839a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m3840b(), m3839a()});
    }
}
