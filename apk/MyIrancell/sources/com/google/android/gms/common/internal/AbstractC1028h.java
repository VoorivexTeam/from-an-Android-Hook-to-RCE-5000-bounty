package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C0993c;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC0895f;
import com.google.android.gms.common.api.internal.InterfaceC0923m;
import com.google.android.gms.common.internal.AbstractC1020d;
import com.google.android.gms.common.internal.C1030i;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.h */
/* loaded from: classes.dex */
public abstract class AbstractC1028h<T extends IInterface> extends AbstractC1020d<T> implements C0859a.f, C1030i.a {

    /* renamed from: B */
    private final C1022e f6215B;

    /* renamed from: C */
    private final Set<Scope> f6216C;

    /* renamed from: D */
    private final Account f6217D;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public AbstractC1028h(Context context, Looper looper, int i, C1022e c1022e, AbstractC0864f.b bVar, AbstractC0864f.c cVar) {
        this(context, looper, i, c1022e, (InterfaceC0895f) bVar, (InterfaceC0923m) cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1028h(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C1022e r13, com.google.android.gms.common.api.internal.InterfaceC0895f r14, com.google.android.gms.common.api.internal.InterfaceC0923m r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.AbstractC1032j.m7158a(r10)
            com.google.android.gms.common.c r4 = com.google.android.gms.common.C0993c.m6949a()
            com.google.android.gms.common.internal.C1057u.m7286a(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.f r7 = (com.google.android.gms.common.api.internal.InterfaceC0895f) r7
            com.google.android.gms.common.internal.C1057u.m7286a(r15)
            r8 = r15
            com.google.android.gms.common.api.internal.m r8 = (com.google.android.gms.common.api.internal.InterfaceC0923m) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC1028h.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.e, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.m):void");
    }

    protected AbstractC1028h(Context context, Looper looper, AbstractC1032j abstractC1032j, C0993c c0993c, int i, C1022e c1022e, InterfaceC0895f interfaceC0895f, InterfaceC0923m interfaceC0923m) {
        super(context, looper, abstractC1032j, c0993c, i, m7145a(interfaceC0895f), m7146a(interfaceC0923m), c1022e.m7123g());
        this.f6215B = c1022e;
        this.f6217D = c1022e.m7115a();
        Set<Scope> m7120d = c1022e.m7120d();
        m7147b(m7120d);
        this.f6216C = m7120d;
    }

    /* renamed from: a */
    private static AbstractC1020d.a m7145a(InterfaceC0895f interfaceC0895f) {
        if (interfaceC0895f == null) {
            return null;
        }
        return new C1017b0(interfaceC0895f);
    }

    /* renamed from: a */
    private static AbstractC1020d.b m7146a(InterfaceC0923m interfaceC0923m) {
        if (interfaceC0923m == null) {
            return null;
        }
        return new C1019c0(interfaceC0923m);
    }

    /* renamed from: b */
    private final Set<Scope> m7147b(Set<Scope> set) {
        m7149a(set);
        Iterator<Scope> it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final C1022e m7148E() {
        return this.f6215B;
    }

    /* renamed from: a */
    protected Set<Scope> m7149a(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.api.C0859a.f
    /* renamed from: f */
    public Set<Scope> mo6516f() {
        return mo6521n() ? this.f6216C : Collections.emptySet();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: i */
    public int mo6465i() {
        return super.mo6465i();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: u */
    public final Account mo7096u() {
        return this.f6217D;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: z */
    protected final Set<Scope> mo7101z() {
        return this.f6216C;
    }
}
