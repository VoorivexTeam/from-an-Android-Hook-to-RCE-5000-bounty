package com.comviva.webaxn.utils;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;

@SuppressLint({"InlinedApi"})
/* renamed from: com.comviva.webaxn.utils.v1 */
/* loaded from: classes.dex */
public class C0749v1 extends BroadcastReceiver {
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
            C0750w m5890a = C0723n.m5888a(context).m5890a(longExtra);
            if (m5890a != null) {
                m5890a.m6088a(str);
                m5890a.m6091c().m4818l().mo4834a(longExtra, str);
            }
        }
    }
}
