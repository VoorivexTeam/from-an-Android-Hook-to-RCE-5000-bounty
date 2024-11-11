package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX WARN: Incorrect field signature: TK; */
/* renamed from: com.google.android.gms.internal.measurement.a7 */
/* loaded from: classes.dex */
public final class C1199a7<K, V> implements Comparable<C1199a7>, Map.Entry<K, V> {

    /* renamed from: b */
    private final Comparable f6494b;

    /* renamed from: c */
    private V f6495c;

    /* renamed from: d */
    private final /* synthetic */ C1450r6 f6496d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public C1199a7(C1450r6 c1450r6, K k, V v) {
        this.f6496d = c1450r6;
        this.f6494b = k;
        this.f6495c = v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1199a7(C1450r6 c1450r6, Map.Entry<K, V> entry) {
        this(c1450r6, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m7538a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C1199a7 c1199a7) {
        return ((Comparable) getKey()).compareTo((Comparable) c1199a7.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m7538a(this.f6494b, entry.getKey()) && m7538a(this.f6495c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f6494b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f6495c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f6494b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f6495c;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f6496d.m8311f();
        V v2 = this.f6495c;
        this.f6495c = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6494b);
        String valueOf2 = String.valueOf(this.f6495c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
