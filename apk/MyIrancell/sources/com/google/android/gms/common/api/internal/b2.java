package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b2 {
    public static final Status d = new Status(8, "The connection to Google Play services was lost");
    private static final BasePendingResult<?>[] e = new BasePendingResult[0];
    final Set<BasePendingResult<?>> a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final c2 b = new a2(this);
    private final Map<a.c<?>, a.f> c;

    public b2(Map<a.c<?>, a.f> map) {
        this.c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int i;
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.a.toArray(e);
        int length = basePendingResultArr.length;
        while (i < length) {
            BasePendingResult basePendingResult = basePendingResultArr[i];
            com.google.android.gms.common.api.t tVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            basePendingResult.a((c2) null);
            if (basePendingResult.d() == null) {
                i = basePendingResult.e() ? 0 : i + 1;
            } else {
                basePendingResult.a((com.google.android.gms.common.api.n) null);
                IBinder o = this.c.get(((d) basePendingResult).h()).o();
                if (basePendingResult.c()) {
                    basePendingResult.a(new d2(basePendingResult, objArr4 == true ? 1 : 0, o, objArr3 == true ? 1 : 0));
                } else {
                    if (o == null || !o.isBinderAlive()) {
                        basePendingResult.a((c2) null);
                    } else {
                        d2 d2Var = new d2(basePendingResult, objArr2 == true ? 1 : 0, o, objArr == true ? 1 : 0);
                        basePendingResult.a(d2Var);
                        try {
                            o.linkToDeath(d2Var, 0);
                        } catch (RemoteException unused) {
                        }
                    }
                    basePendingResult.a();
                    tVar.a(basePendingResult.d().intValue());
                }
            }
            this.a.remove(basePendingResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends com.google.android.gms.common.api.m> basePendingResult) {
        this.a.add(basePendingResult);
        basePendingResult.a(this.b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.a.toArray(e)) {
            basePendingResult.b(d);
        }
    }
}
