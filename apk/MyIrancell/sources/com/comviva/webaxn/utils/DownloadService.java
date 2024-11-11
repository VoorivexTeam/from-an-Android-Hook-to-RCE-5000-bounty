package com.comviva.webaxn.utils;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.comviva.webaxn.transport.NotificationReceiver;

/* loaded from: classes.dex */
public class DownloadService extends IntentService {

    /* renamed from: f */
    public static String f4579f;

    /* renamed from: g */
    public static String f4580g;

    /* renamed from: h */
    public static String f4581h;

    /* renamed from: b */
    private String f4582b;

    /* renamed from: c */
    private String f4583c;

    /* renamed from: d */
    private boolean f4584d;

    /* renamed from: e */
    private int f4585e;

    public DownloadService() {
        super(DownloadService.class.getName());
        this.f4584d = false;
        this.f4585e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x01ba, Exception -> 0x01bd, TryCatch #3 {Exception -> 0x01bd, blocks: (B:5:0x0029, B:7:0x0031, B:106:0x004a, B:108:0x0050, B:10:0x0065, B:13:0x0069, B:14:0x0088), top: B:4:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0169 A[Catch: Exception -> 0x01b1, all -> 0x01e2, TryCatch #2 {all -> 0x01e2, blocks: (B:17:0x0091, B:19:0x0095, B:39:0x00c3, B:43:0x00d2, B:44:0x0164, B:46:0x0169, B:48:0x0181, B:50:0x0191, B:56:0x0186, B:57:0x0198, B:59:0x019d, B:60:0x01a6, B:61:0x01a3, B:98:0x01c4, B:100:0x01cb, B:101:0x01d4, B:104:0x01cf, B:65:0x00da, B:66:0x00e2, B:68:0x00e8, B:70:0x00f4, B:72:0x00fa, B:79:0x0106, B:81:0x010c, B:83:0x0125, B:84:0x013f, B:86:0x0146, B:88:0x014a, B:92:0x0151, B:93:0x0159, B:77:0x0161), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0198 A[Catch: Exception -> 0x01b1, all -> 0x01e2, TryCatch #2 {all -> 0x01e2, blocks: (B:17:0x0091, B:19:0x0095, B:39:0x00c3, B:43:0x00d2, B:44:0x0164, B:46:0x0169, B:48:0x0181, B:50:0x0191, B:56:0x0186, B:57:0x0198, B:59:0x019d, B:60:0x01a6, B:61:0x01a3, B:98:0x01c4, B:100:0x01cb, B:101:0x01d4, B:104:0x01cf, B:65:0x00da, B:66:0x00e2, B:68:0x00e8, B:70:0x00f4, B:72:0x00fa, B:79:0x0106, B:81:0x010c, B:83:0x0125, B:84:0x013f, B:86:0x0146, B:88:0x014a, B:92:0x0151, B:93:0x0159, B:77:0x0161), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da A[Catch: Exception -> 0x01b1, all -> 0x01e2, TryCatch #2 {all -> 0x01e2, blocks: (B:17:0x0091, B:19:0x0095, B:39:0x00c3, B:43:0x00d2, B:44:0x0164, B:46:0x0169, B:48:0x0181, B:50:0x0191, B:56:0x0186, B:57:0x0198, B:59:0x019d, B:60:0x01a6, B:61:0x01a3, B:98:0x01c4, B:100:0x01cb, B:101:0x01d4, B:104:0x01cf, B:65:0x00da, B:66:0x00e2, B:68:0x00e8, B:70:0x00f4, B:72:0x00fa, B:79:0x0106, B:81:0x010c, B:83:0x0125, B:84:0x013f, B:86:0x0146, B:88:0x014a, B:92:0x0151, B:93:0x0159, B:77:0x0161), top: B:2:0x001a }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5221a() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.DownloadService.m5221a():void");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        f4579f = getPackageName() + ".download.notification.start";
        f4580g = getPackageName() + ".download.notification.update";
        f4581h = getPackageName() + ".download.notification.DELETE";
        this.f4582b = null;
        if (intent.getExtras() != null) {
            this.f4582b = intent.getExtras().getString("url");
            this.f4583c = intent.getExtras().getString("action");
            this.f4585e = intent.getExtras().getInt("type", 0);
        }
        if (!TextUtils.isEmpty(this.f4582b)) {
            this.f4582b = Uri.decode(this.f4582b);
        }
        if (!TextUtils.isEmpty(this.f4583c)) {
            this.f4584d = true;
        }
        Intent intent2 = new Intent(getApplicationContext(), (Class<?>) NotificationReceiver.class);
        intent2.setAction(f4579f);
        intent2.putExtra("type", this.f4585e);
        sendBroadcast(intent2);
        m5221a();
    }
}
