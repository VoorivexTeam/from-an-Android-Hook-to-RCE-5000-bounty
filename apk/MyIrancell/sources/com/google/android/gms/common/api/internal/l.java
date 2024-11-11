package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.k;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class l {
    private final Set<k<?>> a = Collections.newSetFromMap(new WeakHashMap());

    public static <L> k.a<L> a(L l, String str) {
        com.google.android.gms.common.internal.u.a(l, "Listener must not be null");
        com.google.android.gms.common.internal.u.a(str, (Object) "Listener type must not be null");
        com.google.android.gms.common.internal.u.a(str, (Object) "Listener type must not be empty");
        return new k.a<>(l, str);
    }

    public static <L> k<L> a(L l, Looper looper, String str) {
        com.google.android.gms.common.internal.u.a(l, "Listener must not be null");
        com.google.android.gms.common.internal.u.a(looper, "Looper must not be null");
        com.google.android.gms.common.internal.u.a(str, (Object) "Listener type must not be null");
        return new k<>(looper, l, str);
    }

    public final void a() {
        Iterator<k<?>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.a.clear();
    }
}
