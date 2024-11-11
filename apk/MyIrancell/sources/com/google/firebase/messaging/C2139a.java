package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.internal.C1057u;
import p000.InterfaceC3179ru;
import p000.InterfaceC3223su;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes.dex */
public final class C2139a {

    /* renamed from: a */
    private final String f9005a;

    /* renamed from: b */
    private final Intent f9006b;

    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes.dex */
    static class a implements InterfaceC3179ru<C2139a> {
        @Override // p000.InterfaceC3179ru
        /* renamed from: a */
        public final /* synthetic */ void mo3695a(Object obj, Object obj2) {
            C2139a c2139a = (C2139a) obj;
            InterfaceC3223su interfaceC3223su = (InterfaceC3223su) obj2;
            Intent m10755a = c2139a.m10755a();
            interfaceC3223su.mo15455a("ttl", C2155q.m10806f(m10755a));
            interfaceC3223su.mo15457a("event", c2139a.m10756b());
            interfaceC3223su.mo15457a("instanceId", C2155q.m10801c());
            interfaceC3223su.mo15455a("priority", C2155q.m10813m(m10755a));
            interfaceC3223su.mo15457a("packageName", C2155q.m10799b());
            interfaceC3223su.mo15457a("sdkPlatform", "ANDROID");
            interfaceC3223su.mo15457a("messageType", C2155q.m10811k(m10755a));
            String m10810j = C2155q.m10810j(m10755a);
            if (m10810j != null) {
                interfaceC3223su.mo15457a("messageId", m10810j);
            }
            String m10812l = C2155q.m10812l(m10755a);
            if (m10812l != null) {
                interfaceC3223su.mo15457a("topic", m10812l);
            }
            String m10807g = C2155q.m10807g(m10755a);
            if (m10807g != null) {
                interfaceC3223su.mo15457a("collapseKey", m10807g);
            }
            if (C2155q.m10809i(m10755a) != null) {
                interfaceC3223su.mo15457a("analyticsLabel", C2155q.m10809i(m10755a));
            }
            if (C2155q.m10808h(m10755a) != null) {
                interfaceC3223su.mo15457a("composerLabel", C2155q.m10808h(m10755a));
            }
            String m10803d = C2155q.m10803d();
            if (m10803d != null) {
                interfaceC3223su.mo15457a("projectNumber", m10803d);
            }
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    /* loaded from: classes.dex */
    static final class b implements InterfaceC3179ru<c> {
        @Override // p000.InterfaceC3179ru
        /* renamed from: a */
        public final /* synthetic */ void mo3695a(Object obj, Object obj2) {
            ((InterfaceC3223su) obj2).mo15457a("messaging_client_event", ((c) obj).m10757a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    /* loaded from: classes.dex */
    static final class c {

        /* renamed from: a */
        private final C2139a f9007a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(C2139a c2139a) {
            C1057u.m7286a(c2139a);
            this.f9007a = c2139a;
        }

        /* renamed from: a */
        final C2139a m10757a() {
            return this.f9007a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2139a(String str, Intent intent) {
        C1057u.m7288a(str, (Object) "evenType must be non-null");
        this.f9005a = str;
        C1057u.m7287a(intent, "intent must be non-null");
        this.f9006b = intent;
    }

    /* renamed from: a */
    final Intent m10755a() {
        return this.f9006b;
    }

    /* renamed from: b */
    final String m10756b() {
        return this.f9005a;
    }
}
