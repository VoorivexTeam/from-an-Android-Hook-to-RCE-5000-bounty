package com.google.android.gms.common.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000.C2366d0;

/* renamed from: com.google.android.gms.common.util.f */
/* loaded from: classes.dex */
public final class C1100f {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m7378a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m7379a(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m7380a(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : m7379a(tArr[0]) : m7378a();
    }

    /* renamed from: a */
    private static <T> Set<T> m7381a(int i, boolean z) {
        return i <= (z ? 128 : 256) ? new C2366d0(i) : new HashSet(i, z ? 0.75f : 1.0f);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Set<T> m7382a(T t, T t2, T t3) {
        Set m7381a = m7381a(3, false);
        m7381a.add(t);
        m7381a.add(t2);
        m7381a.add(t3);
        return Collections.unmodifiableSet(m7381a);
    }
}
