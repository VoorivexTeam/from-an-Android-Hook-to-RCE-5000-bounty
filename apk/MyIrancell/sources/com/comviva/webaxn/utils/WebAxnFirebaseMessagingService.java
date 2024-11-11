package com.comviva.webaxn.utils;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import p000.C3530zi;

/* loaded from: classes.dex */
public class WebAxnFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: a */
    public void mo5308a(RemoteMessage remoteMessage) {
        Context applicationContext;
        String str = "From: " + remoteMessage.m10749k();
        if (C3530zi.f14456C == 2) {
            return;
        }
        if (remoteMessage.m10750l() != null) {
            String str2 = "Message Notification Body: " + remoteMessage.m10750l().m10752a();
            PushData pushData = new PushData();
            pushData.m5245k("not");
            pushData.m5243j(remoteMessage.m10750l().m10754c());
            pushData.m5229c(remoteMessage.m10750l().m10752a());
            pushData.m5235f(remoteMessage.m10750l().m10753b());
            Intent intent = new Intent();
            intent.setAction("com.notify.action");
            C0755x1.m6170b(getApplicationContext(), pushData, intent);
        }
        if (remoteMessage.m10748j().size() > 0) {
            String str3 = "Message data payload: " + remoteMessage.m10748j();
            PushData pushData2 = new PushData();
            String str4 = remoteMessage.m10748j().get("message");
            if (TextUtils.isEmpty(str4)) {
                pushData2.m5245k(remoteMessage.m10748j().get("type"));
                if (TextUtils.isEmpty(pushData2.m5247m())) {
                    return;
                }
                pushData2.m5237g(remoteMessage.m10748j().get("port"));
                pushData2.m5243j(remoteMessage.m10748j().get("title"));
                pushData2.m5229c(remoteMessage.m10748j().get("description"));
                pushData2.m5225a(remoteMessage.m10748j().get("action"));
                pushData2.m5227b(remoteMessage.m10748j().get("badge"));
                pushData2.m5231d(remoteMessage.m10748j().get("imageurl"));
                if (!pushData2.m5247m().equals("actnot")) {
                    pushData2.m5247m().equals("dlg");
                }
                pushData2.m5233e(remoteMessage.m10748j().get("lsk"));
                pushData2.m5239h(remoteMessage.m10748j().get("rsk"));
                pushData2.m5235f(remoteMessage.m10748j().get("lskaction"));
                pushData2.m5241i(remoteMessage.m10748j().get("rskaction"));
                applicationContext = getApplicationContext();
                str4 = null;
            } else {
                applicationContext = getApplicationContext();
            }
            C0755x1.m6144a(applicationContext, str4, pushData2);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: b */
    public void mo5309b(String str) {
        String str2 = "Refreshed token: " + str;
        int i = C3530zi.f14456C;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0713j1.m5563a(getApplicationContext()).m5732u(str);
        C0713j1.m5563a(getApplicationContext()).m5694l(C0713j1.m5563a(getApplicationContext()).m5571A() + "|" + str);
        C0713j1.m5563a(getApplicationContext()).m5645c(true);
    }
}
