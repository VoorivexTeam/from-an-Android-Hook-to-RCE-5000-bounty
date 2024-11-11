package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import defpackage.vr;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class e {
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;
    private final Map<com.google.android.gms.common.api.a<?>, b> d;
    private final String e;
    private final String f;
    private final vr g;
    private final boolean h;
    private Integer i;

    /* loaded from: classes.dex */
    public static final class a {
        private Account a;
        private defpackage.d0<Scope> b;
        private Map<com.google.android.gms.common.api.a<?>, b> c;
        private View e;
        private String f;
        private String g;
        private boolean i;
        private int d = 0;
        private vr h = vr.k;

        public final a a(Account account) {
            this.a = account;
            return this;
        }

        public final a a(String str) {
            this.g = str;
            return this;
        }

        public final a a(Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new defpackage.d0<>();
            }
            this.b.addAll(collection);
            return this;
        }

        public final e a() {
            return new e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final a b(String str) {
            this.f = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final Set<Scope> a;
    }

    public e(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i, View view, String str, String str2, vr vrVar, boolean z) {
        this.a = account;
        this.b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.d = map == null ? Collections.emptyMap() : map;
        this.e = str;
        this.f = str2;
        this.g = vrVar;
        this.h = z;
        HashSet hashSet = new HashSet(this.b);
        Iterator<b> it = this.d.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    public final Account a() {
        return this.a;
    }

    public final Set<Scope> a(com.google.android.gms.common.api.a<?> aVar) {
        b bVar = this.d.get(aVar);
        if (bVar == null || bVar.a.isEmpty()) {
            return this.b;
        }
        HashSet hashSet = new HashSet(this.b);
        hashSet.addAll(bVar.a);
        return hashSet;
    }

    public final void a(Integer num) {
        this.i = num;
    }

    @Nullable
    @Deprecated
    public final String b() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public final Account c() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public final Set<Scope> d() {
        return this.c;
    }

    @Nullable
    public final Integer e() {
        return this.i;
    }

    public final Map<com.google.android.gms.common.api.a<?>, b> f() {
        return this.d;
    }

    @Nullable
    public final String g() {
        return this.f;
    }

    @Nullable
    public final String h() {
        return this.e;
    }

    public final Set<Scope> i() {
        return this.b;
    }

    @Nullable
    public final vr j() {
        return this.g;
    }

    public final boolean k() {
        return this.h;
    }
}
