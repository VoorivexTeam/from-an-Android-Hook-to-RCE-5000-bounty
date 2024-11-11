package com.comviva.webaxn.transport;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.comviva.webaxn.utils.C0726o;
import com.comviva.webaxn.utils.C0755x1;
import com.comviva.webaxn.utils.DownloadService;

/* loaded from: classes.dex */
public class NotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null) {
            if (intent.getAction().equals("com.notification.DELETE")) {
                int i = C0755x1.f5237A;
                if (i > 0) {
                    C0755x1.f5237A = i - 1;
                    return;
                }
                return;
            }
            if (intent.getAction().equals(DownloadService.f4579f)) {
                C0726o.m5922a(context).m5923a(intent.getIntExtra("type", 0));
                return;
            }
            if (intent.getAction().equals(DownloadService.f4581h)) {
                if (C0726o.f5040e) {
                    C0726o.f5040e = false;
                }
            } else {
                if (!intent.getAction().equals(DownloadService.f4580g) || intent.getExtras() == null) {
                    return;
                }
                C0726o.m5922a(context).m5924a(intent.getIntExtra("pro_key", -1), intent.getIntExtra("type", 0), intent.getBooleanExtra("install", false), intent.getStringExtra("dpath"), intent.getStringExtra("action"));
            }
        }
    }
}
