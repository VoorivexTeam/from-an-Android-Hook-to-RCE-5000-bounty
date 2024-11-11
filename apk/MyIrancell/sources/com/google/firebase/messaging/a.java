package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.internal.u;
import defpackage.ru;
import defpackage.su;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a {
    private final String a;
    private final Intent b;

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0053a implements ru<a> {
        @Override // defpackage.ru
        public final /* synthetic */ void a(Object obj, Object obj2) {
            a aVar = (a) obj;
            su suVar = (su) obj2;
            Intent a = aVar.a();
            suVar.a("ttl", q.f(a));
            suVar.a("event", aVar.b());
            suVar.a("instanceId", q.c());
            suVar.a("priority", q.m(a));
            suVar.a("packageName", q.b());
            suVar.a("sdkPlatform", "ANDROID");
            suVar.a("messageType", q.k(a));
            String j = q.j(a);
            if (j != null) {
                suVar.a("messageId", j);
            }
            String l = q.l(a);
            if (l != null) {
                suVar.a("topic", l);
            }
            String g = q.g(a);
            if (g != null) {
                suVar.a("collapseKey", g);
            }
            if (q.i(a) != null) {
                suVar.a("analyticsLabel", q.i(a));
            }
            if (q.h(a) != null) {
                suVar.a("composerLabel", q.h(a));
            }
            String d = q.d();
            if (d != null) {
                suVar.a("projectNumber", d);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b implements ru<c> {
        @Override // defpackage.ru
        public final /* synthetic */ void a(Object obj, Object obj2) {
            ((su) obj2).a("messaging_client_event", ((c) obj).a());
        }
    }

    /* loaded from: classes.dex */
    static final class c {
        private final a a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(a aVar) {
            u.a(aVar);
            this.a = aVar;
        }

        final a a() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, Intent intent) {
        u.a(str, (Object) "evenType must be non-null");
        this.a = str;
        u.a(intent, "intent must be non-null");
        this.b = intent;
    }

    final Intent a() {
        return this.b;
    }

    final String b() {
        return this.a;
    }
}
