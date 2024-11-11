package com.comviva.webaxn.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class w1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED")) {
            Bundle extras = intent.getExtras();
            int j = ((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).j();
            if (j != 0) {
                if (j != 15) {
                    return;
                }
                n0 a = n0.a(context);
                if (a.e()) {
                    a.d().a();
                    return;
                }
                return;
            }
            String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            n0 a2 = n0.a(context);
            if (a2.e()) {
                if (a2.b() == null || a2.c() <= 0) {
                    return;
                }
                int indexOf = str.indexOf(a2.b());
                a2.d().a(indexOf != -1 ? str.substring(a2.b().length() + indexOf, indexOf + a2.b().length() + a2.c()).trim() : null);
            }
        }
    }
}
