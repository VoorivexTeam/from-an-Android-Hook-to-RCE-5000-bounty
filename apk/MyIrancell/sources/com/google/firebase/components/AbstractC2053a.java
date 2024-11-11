package com.google.firebase.components;

import java.util.Set;
import p000.InterfaceC2789iv;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.a */
/* loaded from: classes.dex */
public abstract class AbstractC2053a implements InterfaceC2057e {
    @Override // com.google.firebase.components.InterfaceC2057e
    /* renamed from: a */
    public <T> T mo10516a(Class<T> cls) {
        InterfaceC2789iv<T> mo10543c = mo10543c(cls);
        if (mo10543c == null) {
            return null;
        }
        return mo10543c.get();
    }

    @Override // com.google.firebase.components.InterfaceC2057e
    /* renamed from: b */
    public <T> Set<T> mo10517b(Class<T> cls) {
        return mo10544d(cls).get();
    }
}
