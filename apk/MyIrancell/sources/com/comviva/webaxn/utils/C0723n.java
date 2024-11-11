package com.comviva.webaxn.utils;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import java.util.HashMap;

/* renamed from: com.comviva.webaxn.utils.n */
/* loaded from: classes.dex */
public class C0723n {

    /* renamed from: d */
    private static C0723n f5011d;

    /* renamed from: a */
    private HashMap<Long, C0750w> f5012a = new HashMap<>();

    /* renamed from: b */
    private Context f5013b;

    /* renamed from: c */
    private DownloadManager f5014c;

    private C0723n(Context context) {
        this.f5013b = context;
        this.f5014c = (DownloadManager) context.getSystemService("download");
    }

    /* renamed from: a */
    public static C0723n m5888a(Context context) {
        if (f5011d == null) {
            f5011d = new C0723n(context);
        }
        return f5011d;
    }

    /* renamed from: a */
    public long m5889a(String str) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setDestinationInExternalFilesDir(this.f5013b, "apps", URLUtil.guessFileName(str, null, "application/vnd.android.package-archive"));
        return this.f5014c.enqueue(request);
    }

    /* renamed from: a */
    public C0750w m5890a(long j) {
        return this.f5012a.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public void m5891a(long j, C0750w c0750w) {
        this.f5012a.put(Long.valueOf(j), c0750w);
    }

    /* renamed from: b */
    public void m5892b(long j) {
        this.f5012a.remove(Long.valueOf(j));
    }
}
