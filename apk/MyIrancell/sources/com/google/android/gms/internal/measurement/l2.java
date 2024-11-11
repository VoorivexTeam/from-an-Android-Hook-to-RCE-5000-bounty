package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class l2 {
    public static <T> m2<T> a(m2<T> m2Var) {
        return ((m2Var instanceof n2) || (m2Var instanceof o2)) ? m2Var : m2Var instanceof Serializable ? new o2(m2Var) : new n2(m2Var);
    }

    public static <T> m2<T> a(@NullableDecl T t) {
        return new q2(t);
    }
}
