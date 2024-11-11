package com.comviva.webaxn.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.C0611a;
import com.comviva.webaxn.p002ui.SurfaceHolderCallbackC0634h1;
import com.comviva.webaxn.p002ui.WebAxnActivity;

/* renamed from: com.comviva.webaxn.utils.u1 */
/* loaded from: classes.dex */
public class C0746u1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        WebAxnActivity webAxnActivity;
        if (intent.getAction().equals("android.intent.action.PHONE_STATE")) {
            C0755x1.f5263u = true;
            C0713j1.m5563a(context).m5638b(true);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("state");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                if (string.equals(TelephonyManager.EXTRA_STATE_RINGING) || string.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                    webAxnActivity = (WebAxnActivity) C0755x1.f5265w;
                    if (webAxnActivity.m4078b() == null || webAxnActivity.m4078b().m16343t() == null || webAxnActivity.m4078b().m16343t().m4814h() == null) {
                        return;
                    }
                    if (!(webAxnActivity.m4078b().m16343t().m4814h() instanceof C0611a)) {
                        if (!(webAxnActivity.m4078b().m16343t().m4814h() instanceof SurfaceHolderCallbackC0634h1)) {
                            return;
                        }
                        ((SurfaceHolderCallbackC0634h1) webAxnActivity.m4078b().m16343t().m4814h()).m4452m();
                        return;
                    }
                    ((C0611a) webAxnActivity.m4078b().m16343t().m4814h()).m4153m();
                }
                if (string.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                    webAxnActivity = (WebAxnActivity) C0755x1.f5265w;
                    if (webAxnActivity.m4078b() == null || webAxnActivity.m4078b().m16343t() == null || webAxnActivity.m4078b().m16343t().m4814h() == null) {
                        return;
                    }
                    if (!(webAxnActivity.m4078b().m16343t().m4814h() instanceof C0611a)) {
                        if (!(webAxnActivity.m4078b().m16343t().m4814h() instanceof SurfaceHolderCallbackC0634h1)) {
                            return;
                        }
                        ((SurfaceHolderCallbackC0634h1) webAxnActivity.m4078b().m16343t().m4814h()).m4452m();
                        return;
                    }
                    ((C0611a) webAxnActivity.m4078b().m16343t().m4814h()).m4153m();
                }
            }
        }
    }
}
