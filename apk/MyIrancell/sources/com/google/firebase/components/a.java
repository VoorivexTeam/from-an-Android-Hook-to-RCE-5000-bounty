package com.google.firebase.components;

import defpackage.iv;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a implements e {
    @Override // com.google.firebase.components.e
    public <T> T a(Class<T> cls) {
        iv<T> c = c(cls);
        if (c == null) {
            return null;
        }
        return c.get();
    }

    @Override // com.google.firebase.components.e
    public <T> Set<T> b(Class<T> cls) {
        return d(cls).get();
    }
}
