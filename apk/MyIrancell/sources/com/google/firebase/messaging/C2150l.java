package com.google.firebase.messaging;

import com.google.android.datatransport.cct.C0764a;
import com.google.firebase.C2052c;
import com.google.firebase.components.InterfaceC2057e;
import com.google.firebase.components.InterfaceC2059g;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import p000.C2476fk;
import p000.InterfaceC2863kk;

/* renamed from: com.google.firebase.messaging.l */
/* loaded from: classes.dex */
final /* synthetic */ class C2150l implements InterfaceC2059g {

    /* renamed from: a */
    static final InterfaceC2059g f9026a = new C2150l();

    private C2150l() {
    }

    @Override // com.google.firebase.components.InterfaceC2059g
    /* renamed from: a */
    public final Object mo10488a(InterfaceC2057e interfaceC2057e) {
        C2052c c2052c = (C2052c) interfaceC2057e.mo10516a(C2052c.class);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) interfaceC2057e.mo10516a(FirebaseInstanceId.class);
        InterfaceC2863kk interfaceC2863kk = (InterfaceC2863kk) interfaceC2057e.mo10516a(InterfaceC2863kk.class);
        if (interfaceC2863kk == null || !C0764a.f5354g.mo6251b().contains(C2476fk.m11789a("json"))) {
            interfaceC2863kk = new FirebaseMessagingRegistrar.C2136a();
        }
        return new FirebaseMessaging(c2052c, firebaseInstanceId, interfaceC2863kk);
    }
}
