package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import p000.C2366d0;
import p000.C3369vr;

/* renamed from: com.google.android.gms.common.internal.e */
/* loaded from: classes.dex */
public final class C1022e {

    /* renamed from: a */
    private final Account f6190a;

    /* renamed from: b */
    private final Set<Scope> f6191b;

    /* renamed from: c */
    private final Set<Scope> f6192c;

    /* renamed from: d */
    private final Map<C0859a<?>, b> f6193d;

    /* renamed from: e */
    private final String f6194e;

    /* renamed from: f */
    private final String f6195f;

    /* renamed from: g */
    private final C3369vr f6196g;

    /* renamed from: h */
    private final boolean f6197h;

    /* renamed from: i */
    private Integer f6198i;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Account f6199a;

        /* renamed from: b */
        private C2366d0<Scope> f6200b;

        /* renamed from: c */
        private Map<C0859a<?>, b> f6201c;

        /* renamed from: e */
        private View f6203e;

        /* renamed from: f */
        private String f6204f;

        /* renamed from: g */
        private String f6205g;

        /* renamed from: i */
        private boolean f6207i;

        /* renamed from: d */
        private int f6202d = 0;

        /* renamed from: h */
        private C3369vr f6206h = C3369vr.f13705k;

        /* renamed from: a */
        public final a m7128a(Account account) {
            this.f6199a = account;
            return this;
        }

        /* renamed from: a */
        public final a m7129a(String str) {
            this.f6205g = str;
            return this;
        }

        /* renamed from: a */
        public final a m7130a(Collection<Scope> collection) {
            if (this.f6200b == null) {
                this.f6200b = new C2366d0<>();
            }
            this.f6200b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C1022e m7131a() {
            return new C1022e(this.f6199a, this.f6200b, this.f6201c, this.f6202d, this.f6203e, this.f6204f, this.f6205g, this.f6206h, this.f6207i);
        }

        /* renamed from: b */
        public final a m7132b(String str) {
            this.f6204f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.e$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final Set<Scope> f6208a;
    }

    public C1022e(Account account, Set<Scope> set, Map<C0859a<?>, b> map, int i, View view, String str, String str2, C3369vr c3369vr, boolean z) {
        this.f6190a = account;
        this.f6191b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f6193d = map == null ? Collections.emptyMap() : map;
        this.f6194e = str;
        this.f6195f = str2;
        this.f6196g = c3369vr;
        this.f6197h = z;
        HashSet hashSet = new HashSet(this.f6191b);
        Iterator<b> it = this.f6193d.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f6208a);
        }
        this.f6192c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    /* renamed from: a */
    public final Account m7115a() {
        return this.f6190a;
    }

    /* renamed from: a */
    public final Set<Scope> m7116a(C0859a<?> c0859a) {
        b bVar = this.f6193d.get(c0859a);
        if (bVar == null || bVar.f6208a.isEmpty()) {
            return this.f6191b;
        }
        HashSet hashSet = new HashSet(this.f6191b);
        hashSet.addAll(bVar.f6208a);
        return hashSet;
    }

    /* renamed from: a */
    public final void m7117a(Integer num) {
        this.f6198i = num;
    }

    @Nullable
    @Deprecated
    /* renamed from: b */
    public final String m7118b() {
        Account account = this.f6190a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public final Account m7119c() {
        Account account = this.f6190a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public final Set<Scope> m7120d() {
        return this.f6192c;
    }

    @Nullable
    /* renamed from: e */
    public final Integer m7121e() {
        return this.f6198i;
    }

    /* renamed from: f */
    public final Map<C0859a<?>, b> m7122f() {
        return this.f6193d;
    }

    @Nullable
    /* renamed from: g */
    public final String m7123g() {
        return this.f6195f;
    }

    @Nullable
    /* renamed from: h */
    public final String m7124h() {
        return this.f6194e;
    }

    /* renamed from: i */
    public final Set<Scope> m7125i() {
        return this.f6191b;
    }

    @Nullable
    /* renamed from: j */
    public final C3369vr m7126j() {
        return this.f6196g;
    }

    /* renamed from: k */
    public final boolean m7127k() {
        return this.f6197h;
    }
}
