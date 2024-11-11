package com.comviva.webaxn.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class SyncAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getExtras() != null) {
            String string = intent.getExtras().getString("url");
            int i = intent.getExtras().getInt("type", -1);
            Intent intent2 = new Intent(context, (Class<?>) DataSyncService.class);
            intent2.putExtra("url", string);
            intent2.putExtra("type", i);
            context.startService(intent2);
        }
    }
}
