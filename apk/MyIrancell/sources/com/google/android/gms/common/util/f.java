package com.google.android.gms.common.util;

import defpackage.d0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class f {
    @Deprecated
    public static <T> List<T> a() {
        return Collections.emptyList();
    }

    @Deprecated
    public static <T> List<T> a(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    public static <T> List<T> a(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : a(tArr[0]) : a();
    }

    private static <T> Set<T> a(int i, boolean z) {
        return i <= (z ? 128 : 256) ? new d0(i) : new HashSet(i, z ? 0.75f : 1.0f);
    }

    @Deprecated
    public static <T> Set<T> a(T t, T t2, T t3) {
        Set a = a(3, false);
        a.add(t);
        a.add(t2);
        a.add(t3);
        return Collections.unmodifiableSet(a);
    }
}
