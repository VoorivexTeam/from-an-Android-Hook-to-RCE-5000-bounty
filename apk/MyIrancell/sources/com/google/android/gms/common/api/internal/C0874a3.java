package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC0866h;
import com.google.android.gms.common.api.C0860b;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p000.C2908ls;

/* renamed from: com.google.android.gms.common.api.internal.a3 */
/* loaded from: classes.dex */
public final class C0874a3 {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f5737a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C2908ls<?>, Boolean> f5738b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    private final void m6608a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f5737a) {
            hashMap = new HashMap(this.f5737a);
        }
        synchronized (this.f5738b) {
            hashMap2 = new HashMap(this.f5738b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m6586b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C2908ls) entry2.getKey()).m13927b((Exception) new C0860b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6610a(BasePendingResult<? extends InterfaceC0982m> basePendingResult, boolean z) {
        this.f5737a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo6573a((AbstractC0866h.a) new C0963w(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final <TResult> void m6611a(C2908ls<TResult> c2908ls, boolean z) {
        this.f5738b.put(c2908ls, Boolean.valueOf(z));
        c2908ls.m13924a().mo11808a(new C0959v(this, c2908ls));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m6612a() {
        return (this.f5737a.isEmpty() && this.f5738b.isEmpty()) ? false : true;
    }

    /* renamed from: b */
    public final void m6613b() {
        m6608a(false, C0899g.f5806n);
    }

    /* renamed from: c */
    public final void m6614c() {
        m6608a(true, C0878b2.f5745d);
    }
}
