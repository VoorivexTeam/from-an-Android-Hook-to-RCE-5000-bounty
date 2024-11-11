package com.google.firebase.messaging;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import defpackage.fk;
import defpackage.kk;

/* loaded from: classes.dex */
final /* synthetic */ class l implements com.google.firebase.components.g {
    static final com.google.firebase.components.g a = new l();

    private l() {
    }

    @Override // com.google.firebase.components.g
    public final Object a(com.google.firebase.components.e eVar) {
        com.google.firebase.c cVar = (com.google.firebase.c) eVar.a(com.google.firebase.c.class);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) eVar.a(FirebaseInstanceId.class);
        kk kkVar = (kk) eVar.a(kk.class);
        if (kkVar == null || !com.google.android.datatransport.cct.a.g.b().contains(fk.a("json"))) {
            kkVar = new FirebaseMessagingRegistrar.a();
        }
        return new FirebaseMessaging(cVar, firebaseInstanceId, kkVar);
    }
}
