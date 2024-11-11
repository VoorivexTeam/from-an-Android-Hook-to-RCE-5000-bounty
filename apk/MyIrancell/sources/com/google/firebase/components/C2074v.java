package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.InterfaceC0494bv;
import p000.InterfaceC2789iv;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.v */
/* loaded from: classes.dex */
public final class C2074v extends AbstractC2053a {

    /* renamed from: a */
    private final Set<Class<?>> f8848a;

    /* renamed from: b */
    private final Set<Class<?>> f8849b;

    /* renamed from: c */
    private final Set<Class<?>> f8850c;

    /* renamed from: d */
    private final Set<Class<?>> f8851d;

    /* renamed from: e */
    private final Set<Class<?>> f8852e;

    /* renamed from: f */
    private final InterfaceC2057e f8853f;

    /* renamed from: com.google.firebase.components.v$a */
    /* loaded from: classes.dex */
    private static class a implements InterfaceC0494bv {
        public a(Set<Class<?>> set, InterfaceC0494bv interfaceC0494bv) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2074v(C2056d<?> c2056d, InterfaceC2057e interfaceC2057e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C2066n c2066n : c2056d.m10527a()) {
            if (c2066n.m10574b()) {
                boolean m10576d = c2066n.m10576d();
                Class<?> m10573a = c2066n.m10573a();
                if (m10576d) {
                    hashSet3.add(m10573a);
                } else {
                    hashSet.add(m10573a);
                }
            } else {
                boolean m10576d2 = c2066n.m10576d();
                Class<?> m10573a2 = c2066n.m10573a();
                if (m10576d2) {
                    hashSet4.add(m10573a2);
                } else {
                    hashSet2.add(m10573a2);
                }
            }
        }
        if (!c2056d.m10530d().isEmpty()) {
            hashSet.add(InterfaceC0494bv.class);
        }
        this.f8848a = Collections.unmodifiableSet(hashSet);
        this.f8849b = Collections.unmodifiableSet(hashSet2);
        this.f8850c = Collections.unmodifiableSet(hashSet3);
        this.f8851d = Collections.unmodifiableSet(hashSet4);
        this.f8852e = c2056d.m10530d();
        this.f8853f = interfaceC2057e;
    }

    @Override // com.google.firebase.components.AbstractC2053a, com.google.firebase.components.InterfaceC2057e
    /* renamed from: a */
    public <T> T mo10516a(Class<T> cls) {
        if (!this.f8848a.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f8853f.mo10516a(cls);
        return !cls.equals(InterfaceC0494bv.class) ? t : (T) new a(this.f8852e, (InterfaceC0494bv) t);
    }

    @Override // com.google.firebase.components.AbstractC2053a, com.google.firebase.components.InterfaceC2057e
    /* renamed from: b */
    public <T> Set<T> mo10517b(Class<T> cls) {
        if (this.f8850c.contains(cls)) {
            return this.f8853f.mo10517b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.InterfaceC2057e
    /* renamed from: c */
    public <T> InterfaceC2789iv<T> mo10543c(Class<T> cls) {
        if (this.f8849b.contains(cls)) {
            return this.f8853f.mo10543c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.InterfaceC2057e
    /* renamed from: d */
    public <T> InterfaceC2789iv<Set<T>> mo10544d(Class<T> cls) {
        if (this.f8851d.contains(cls)) {
            return this.f8853f.mo10544d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
