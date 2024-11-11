package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p000.AbstractC2871ks;
import p000.C0500c0;
import p000.InterfaceC2400ds;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.p */
/* loaded from: classes.dex */
public final class C2113p {

    /* renamed from: a */
    private final Executor f8940a;

    /* renamed from: b */
    @GuardedBy("this")
    private final Map<Pair<String, String>, AbstractC2871ks<InterfaceC2079a>> f8941b = new C0500c0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2113p(Executor executor) {
        this.f8940a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ AbstractC2871ks m10663a(Pair pair, AbstractC2871ks abstractC2871ks) {
        synchronized (this) {
            this.f8941b.remove(pair);
        }
        return abstractC2871ks;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final synchronized AbstractC2871ks<InterfaceC2079a> m10664a(String str, String str2, InterfaceC2117r interfaceC2117r) {
        final Pair pair = new Pair(str, str2);
        AbstractC2871ks<InterfaceC2079a> abstractC2871ks = this.f8941b.get(pair);
        if (abstractC2871ks != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                sb.toString();
            }
            return abstractC2871ks;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            sb2.toString();
        }
        AbstractC2871ks mo11820b = interfaceC2117r.zza().mo11820b(this.f8940a, new InterfaceC2400ds(this, pair) { // from class: com.google.firebase.iid.o

            /* renamed from: a */
            private final C2113p f8937a;

            /* renamed from: b */
            private final Pair f8938b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8937a = this;
                this.f8938b = pair;
            }

            @Override // p000.InterfaceC2400ds
            /* renamed from: a */
            public final Object mo6923a(AbstractC2871ks abstractC2871ks2) {
                this.f8937a.m10663a(this.f8938b, abstractC2871ks2);
                return abstractC2871ks2;
            }
        });
        this.f8941b.put(pair, mo11820b);
        return mo11820b;
    }
}
