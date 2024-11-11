package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC0989t;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.InterfaceC0983n;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.b2 */
/* loaded from: classes.dex */
public final class C0878b2 {

    /* renamed from: d */
    public static final Status f5745d = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: e */
    private static final BasePendingResult<?>[] f5746e = new BasePendingResult[0];

    /* renamed from: a */
    final Set<BasePendingResult<?>> f5747a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final InterfaceC0883c2 f5748b = new C0873a2(this);

    /* renamed from: c */
    private final Map<C0859a.c<?>, C0859a.f> f5749c;

    public C0878b2(Map<C0859a.c<?>, C0859a.f> map) {
        this.f5749c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m6619a() {
        int i;
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f5747a.toArray(f5746e);
        int length = basePendingResultArr.length;
        while (i < length) {
            BasePendingResult basePendingResult = basePendingResultArr[i];
            AbstractC0989t abstractC0989t = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            basePendingResult.m6584a((InterfaceC0883c2) null);
            if (basePendingResult.m6589d() == null) {
                i = basePendingResult.m6590e() ? 0 : i + 1;
            } else {
                basePendingResult.mo6574a((InterfaceC0983n) null);
                IBinder m6522o = this.f5749c.get(((AbstractC0885d) basePendingResult).m6641h()).m6522o();
                if (basePendingResult.m6588c()) {
                    basePendingResult.m6584a(new C0888d2(basePendingResult, objArr4 == true ? 1 : 0, m6522o, objArr3 == true ? 1 : 0));
                } else {
                    if (m6522o == null || !m6522o.isBinderAlive()) {
                        basePendingResult.m6584a((InterfaceC0883c2) null);
                    } else {
                        C0888d2 c0888d2 = new C0888d2(basePendingResult, objArr2 == true ? 1 : 0, m6522o, objArr == true ? 1 : 0);
                        basePendingResult.m6584a(c0888d2);
                        try {
                            m6522o.linkToDeath(c0888d2, 0);
                        } catch (RemoteException unused) {
                        }
                    }
                    basePendingResult.m6583a();
                    abstractC0989t.m6945a(basePendingResult.m6589d().intValue());
                }
            }
            this.f5747a.remove(basePendingResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6620a(BasePendingResult<? extends InterfaceC0982m> basePendingResult) {
        this.f5747a.add(basePendingResult);
        basePendingResult.m6584a(this.f5748b);
    }

    /* renamed from: b */
    public final void m6621b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f5747a.toArray(f5746e)) {
            basePendingResult.m6586b(f5745d);
        }
    }
}
