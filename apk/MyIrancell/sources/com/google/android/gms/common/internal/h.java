package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h<T extends IInterface> extends d<T> implements a.f, i.a {
    private final e B;
    private final Set<Scope> C;
    private final Account D;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public h(Context context, Looper looper, int i, e eVar, f.b bVar, f.c cVar) {
        this(context, looper, i, eVar, (com.google.android.gms.common.api.internal.f) bVar, (com.google.android.gms.common.api.internal.m) cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.e r13, com.google.android.gms.common.api.internal.f r14, com.google.android.gms.common.api.internal.m r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.j.a(r10)
            com.google.android.gms.common.c r4 = com.google.android.gms.common.c.a()
            com.google.android.gms.common.internal.u.a(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.f r7 = (com.google.android.gms.common.api.internal.f) r7
            com.google.android.gms.common.internal.u.a(r15)
            r8 = r15
            com.google.android.gms.common.api.internal.m r8 = (com.google.android.gms.common.api.internal.m) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.h.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.e, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.m):void");
    }

    protected h(Context context, Looper looper, j jVar, com.google.android.gms.common.c cVar, int i, e eVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.m mVar) {
        super(context, looper, jVar, cVar, i, a(fVar), a(mVar), eVar.g());
        this.B = eVar;
        this.D = eVar.a();
        Set<Scope> d = eVar.d();
        b(d);
        this.C = d;
    }

    private static d.a a(com.google.android.gms.common.api.internal.f fVar) {
        if (fVar == null) {
            return null;
        }
        return new b0(fVar);
    }

    private static d.b a(com.google.android.gms.common.api.internal.m mVar) {
        if (mVar == null) {
            return null;
        }
        return new c0(mVar);
    }

    private final Set<Scope> b(Set<Scope> set) {
        a(set);
        Iterator<Scope> it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final e E() {
        return this.B;
    }

    protected Set<Scope> a(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> f() {
        return n() ? this.C : Collections.emptySet();
    }

    @Override // com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public int i() {
        return super.i();
    }

    @Override // com.google.android.gms.common.internal.d
    public final Account u() {
        return this.D;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final Set<Scope> z() {
        return this.C;
    }
}
