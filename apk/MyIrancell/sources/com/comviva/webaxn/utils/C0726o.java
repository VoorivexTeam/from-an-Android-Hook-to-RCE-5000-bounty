package com.comviva.webaxn.utils;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.app.C0228f;
import com.comviva.webaxn.p002ui.WebAxnActivity;
import com.comviva.webaxn.transport.NotificationReceiver;
import com.mtni.myirancell.R;
import p000.C3440xj;

/* renamed from: com.comviva.webaxn.utils.o */
/* loaded from: classes.dex */
public class C0726o {

    /* renamed from: e */
    public static boolean f5040e = false;

    /* renamed from: f */
    private static C0726o f5041f;

    /* renamed from: a */
    private Context f5042a;

    /* renamed from: b */
    private NotificationManager f5043b;

    /* renamed from: c */
    private C0228f.d f5044c;

    /* renamed from: d */
    private int f5045d = 1;

    private C0726o(Context context) {
        this.f5042a = context;
        this.f5043b = (NotificationManager) context.getSystemService("notification");
        this.f5044c = new C0228f.d(this.f5042a);
    }

    /* renamed from: a */
    public static C0726o m5922a(Context context) {
        if (f5041f == null) {
            f5041f = new C0726o(context);
        }
        return f5041f;
    }

    /* renamed from: a */
    public void m5923a(int i) {
        String m5641c = C0713j1.m5563a(this.f5042a).m5641c("msg.download");
        if (TextUtils.isEmpty(m5641c)) {
            m5641c = this.f5042a.getString(R.string.download_start);
        }
        Toast.makeText(this.f5042a, m5641c, 0).show();
        String str = i == 1 ? "Downloading OCR library..." : i == 2 ? "Downloading application..." : i == 3 ? "Downloading application update..." : "Downloading";
        C0228f.d dVar = this.f5044c;
        dVar.m1412b(str);
        dVar.m1405a((CharSequence) "Download in progress...");
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f5042a.getResources(), R.drawable.webaxn);
        C0228f.d dVar2 = this.f5044c;
        dVar2.m1418e(R.drawable.downloading);
        dVar2.m1402a(decodeResource);
        this.f5044c.m1398a(100, 0, false);
        this.f5044c.m1407a(true);
        Intent intent = new Intent(this.f5042a, (Class<?>) NotificationReceiver.class);
        intent.setAction(DownloadService.f4581h);
        this.f5044c.m1411b(PendingIntent.getBroadcast(this.f5042a, this.f5045d, intent, 0));
        this.f5043b.notify(this.f5045d, this.f5044c.m1395a());
    }

    /* renamed from: a */
    public void m5924a(int i, int i2, boolean z, String str, String str2) {
        if (i != 100) {
            if (i == -1) {
                C0228f.d dVar = this.f5044c;
                dVar.m1405a((CharSequence) "Download failed.");
                dVar.m1398a(0, 0, false);
            } else {
                this.f5044c.m1398a(100, i, false);
            }
            this.f5043b.notify(this.f5045d, this.f5044c.m1395a());
            return;
        }
        C0228f.d dVar2 = this.f5044c;
        dVar2.m1405a((CharSequence) "Download complete.");
        dVar2.m1398a(0, 0, false);
        this.f5043b.notify(this.f5045d, this.f5044c.m1395a());
        if (i2 == 1) {
            C0713j1.m5563a(this.f5042a).m5662f(true);
            String m5641c = C0713j1.m5563a(this.f5042a).m5641c("msg.OCRComplete");
            if (TextUtils.isEmpty(m5641c)) {
                m5641c = this.f5042a.getString(R.string.ocr_complete);
            }
            Toast.makeText(this.f5042a, m5641c, 0).show();
        } else if ((i2 == 2 || i2 == 3) && z && !TextUtils.isEmpty(str)) {
            C0755x1.m6145a(this.f5042a, str, (String) null, 1510);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m5925a(str2);
    }

    /* renamed from: a */
    public void m5925a(String str) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) C0755x1.f5265w;
        if (webAxnActivity.isFinishing() || webAxnActivity.m4078b().m16298a(str, false, null, null, webAxnActivity.m4078b().m16334k(), webAxnActivity.m4078b().m16343t().m4811e())) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(str, webAxnActivity.m4078b().m16334k().m14145i());
        if (m6134a != null) {
            webAxnActivity.m4078b().m16334k().m14121a(m6134a);
        }
        if (webAxnActivity.m4078b().m16263a(str, false, false, webAxnActivity.m4078b().m16334k(), false, false, null, webAxnActivity.m4078b().m16343t().m4811e()) > 0) {
            webAxnActivity.m4078b().m16258E();
        }
    }
}
