package com.google.firebase.components;

import defpackage.iv;

/* loaded from: classes.dex */
public class s<T> implements iv<T> {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile iv<T> b;

    public s(iv<T> ivVar) {
        this.b = ivVar;
    }

    @Override // defpackage.iv
    public T get() {
        T t = (T) this.a;
        if (t == c) {
            synchronized (this) {
                t = (T) this.a;
                if (t == c) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
