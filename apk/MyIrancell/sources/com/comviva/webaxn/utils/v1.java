package com.comviva.webaxn.utils;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public class v1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            String str = null;
            DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
            long longExtra = intent.getLongExtra("extra_download_id", 0L);
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(longExtra);
            Cursor query2 = downloadManager.query(query);
            if (query2.moveToFirst() && 8 == query2.getInt(query2.getColumnIndex("status"))) {
                str = query2.getString(query2.getColumnIndex("local_uri"));
            }
            w a = n.a(context).a(longExtra);
            if (a != null) {
                a.a(str);
                a.c().l().a(longExtra, str);
            }
        }
    }
}
