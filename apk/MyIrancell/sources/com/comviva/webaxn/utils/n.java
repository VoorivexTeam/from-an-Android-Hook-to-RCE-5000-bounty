package com.comviva.webaxn.utils;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import java.util.HashMap;

/* loaded from: classes.dex */
public class n {
    private static n d;
    private HashMap<Long, w> a = new HashMap<>();
    private Context b;
    private DownloadManager c;

    private n(Context context) {
        this.b = context;
        this.c = (DownloadManager) context.getSystemService("download");
    }

    public static n a(Context context) {
        if (d == null) {
            d = new n(context);
        }
        return d;
    }

    public long a(String str) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setDestinationInExternalFilesDir(this.b, "apps", URLUtil.guessFileName(str, null, "application/vnd.android.package-archive"));
        return this.c.enqueue(request);
    }

    public w a(long j) {
        return this.a.get(Long.valueOf(j));
    }

    public void a(long j, w wVar) {
        this.a.put(Long.valueOf(j), wVar);
    }

    public void b(long j) {
        this.a.remove(Long.valueOf(j));
    }
}
