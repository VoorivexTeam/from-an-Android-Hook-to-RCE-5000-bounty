package com.comviva.webaxn.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.comviva.webaxn.ui.WebAxnActivity;

/* loaded from: classes.dex */
public class u1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        WebAxnActivity webAxnActivity;
        if (intent.getAction().equals("android.intent.action.PHONE_STATE")) {
            x1.u = true;
            j1.a(context).b(true);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("state");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                if (string.equals(TelephonyManager.EXTRA_STATE_RINGING) || string.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                    webAxnActivity = (WebAxnActivity) x1.w;
                    if (webAxnActivity.b() == null || webAxnActivity.b().t() == null || webAxnActivity.b().t().h() == null) {
                        return;
                    }
                    if (!(webAxnActivity.b().t().h() instanceof com.comviva.webaxn.ui.a)) {
                        if (!(webAxnActivity.b().t().h() instanceof com.comviva.webaxn.ui.h1)) {
                            return;
                        }
                        ((com.comviva.webaxn.ui.h1) webAxnActivity.b().t().h()).m();
                        return;
                    }
                    ((com.comviva.webaxn.ui.a) webAxnActivity.b().t().h()).m();
                }
                if (string.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                    webAxnActivity = (WebAxnActivity) x1.w;
                    if (webAxnActivity.b() == null || webAxnActivity.b().t() == null || webAxnActivity.b().t().h() == null) {
                        return;
                    }
                    if (!(webAxnActivity.b().t().h() instanceof com.comviva.webaxn.ui.a)) {
                        if (!(webAxnActivity.b().t().h() instanceof com.comviva.webaxn.ui.h1)) {
                            return;
                        }
                        ((com.comviva.webaxn.ui.h1) webAxnActivity.b().t().h()).m();
                        return;
                    }
                    ((com.comviva.webaxn.ui.a) webAxnActivity.b().t().h()).m();
                }
            }
        }
    }
}
