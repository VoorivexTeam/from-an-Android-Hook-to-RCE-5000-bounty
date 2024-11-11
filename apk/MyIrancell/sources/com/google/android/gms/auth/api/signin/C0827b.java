package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.auth.api.signin.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0827b implements Comparator {

    /* renamed from: b */
    static final Comparator f5623b = new C0827b();

    private C0827b() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareTo;
        compareTo = ((Scope) obj).m6494j().compareTo(((Scope) obj2).m6494j());
        return compareTo;
    }
}
