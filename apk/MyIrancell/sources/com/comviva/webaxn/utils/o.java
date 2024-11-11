package com.comviva.webaxn.utils;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.app.f;
import com.comviva.webaxn.transport.NotificationReceiver;
import com.comviva.webaxn.ui.WebAxnActivity;
import com.mtni.myirancell.R;
import defpackage.xj;

/* loaded from: classes.dex */
public class o {
    public static boolean e = false;
    private static o f;
    private Context a;
    private NotificationManager b;
    private f.d c;
    private int d = 1;

    private o(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
        this.c = new f.d(this.a);
    }

    public static o a(Context context) {
        if (f == null) {
            f = new o(context);
        }
        return f;
    }

    public void a(int i) {
        String c = j1.a(this.a).c("msg.download");
        if (TextUtils.isEmpty(c)) {
            c = this.a.getString(R.string.download_start);
        }
        Toast.makeText(this.a, c, 0).show();
        String str = i == 1 ? "Downloading OCR library..." : i == 2 ? "Downloading application..." : i == 3 ? "Downloading application update..." : "Downloading";
        f.d dVar = this.c;
        dVar.b(str);
        dVar.a((CharSequence) "Download in progress...");
        Bitmap decodeResource = BitmapFactory.decodeResource(this.a.getResources(), R.drawable.webaxn);
        f.d dVar2 = this.c;
        dVar2.e(R.drawable.downloading);
        dVar2.a(decodeResource);
        this.c.a(100, 0, false);
        this.c.a(true);
        Intent intent = new Intent(this.a, (Class<?>) NotificationReceiver.class);
        intent.setAction(DownloadService.h);
        this.c.b(PendingIntent.getBroadcast(this.a, this.d, intent, 0));
        this.b.notify(this.d, this.c.a());
    }

    public void a(int i, int i2, boolean z, String str, String str2) {
        if (i != 100) {
            if (i == -1) {
                f.d dVar = this.c;
                dVar.a((CharSequence) "Download failed.");
                dVar.a(0, 0, false);
            } else {
                this.c.a(100, i, false);
            }
            this.b.notify(this.d, this.c.a());
            return;
        }
        f.d dVar2 = this.c;
        dVar2.a((CharSequence) "Download complete.");
        dVar2.a(0, 0, false);
        this.b.notify(this.d, this.c.a());
        if (i2 == 1) {
            j1.a(this.a).f(true);
            String c = j1.a(this.a).c("msg.OCRComplete");
            if (TextUtils.isEmpty(c)) {
                c = this.a.getString(R.string.ocr_complete);
            }
            Toast.makeText(this.a, c, 0).show();
        } else if ((i2 == 2 || i2 == 3) && z && !TextUtils.isEmpty(str)) {
            x1.a(this.a, str, (String) null, 1510);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a(str2);
    }

    public void a(String str) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) x1.w;
        if (webAxnActivity.isFinishing() || webAxnActivity.b().a(str, false, null, null, webAxnActivity.b().k(), webAxnActivity.b().t().e())) {
            return;
        }
        xj a = x1.a(str, webAxnActivity.b().k().i());
        if (a != null) {
            webAxnActivity.b().k().a(a);
        }
        if (webAxnActivity.b().a(str, false, false, webAxnActivity.b().k(), false, false, null, webAxnActivity.b().t().e()) > 0) {
            webAxnActivity.b().E();
        }
    }
}
