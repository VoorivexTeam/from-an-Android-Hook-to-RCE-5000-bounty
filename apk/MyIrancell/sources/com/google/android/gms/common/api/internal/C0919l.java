package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.common.internal.C1057u;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* loaded from: classes.dex */
public class C0919l {

    /* renamed from: a */
    private final Set<C0915k<?>> f5886a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static <L> C0915k.a<L> m6797a(L l, String str) {
        C1057u.m7287a(l, "Listener must not be null");
        C1057u.m7287a(str, (Object) "Listener type must not be null");
        C1057u.m7288a(str, (Object) "Listener type must not be empty");
        return new C0915k.a<>(l, str);
    }

    /* renamed from: a */
    public static <L> C0915k<L> m6798a(L l, Looper looper, String str) {
        C1057u.m7287a(l, "Listener must not be null");
        C1057u.m7287a(looper, "Looper must not be null");
        C1057u.m7287a(str, (Object) "Listener type must not be null");
        return new C0915k<>(looper, l, str);
    }

    /* renamed from: a */
    public final void m6799a() {
        Iterator<C0915k<?>> it = this.f5886a.iterator();
        while (it.hasNext()) {
            it.next().m6787a();
        }
        this.f5886a.clear();
    }
}
