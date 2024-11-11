package com.google.zxing.client.android;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import defpackage.fw;
import defpackage.qw;
import defpackage.sv;
import defpackage.wv;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends Handler {
    private static final String e = c.class.getSimpleName();
    private final CaptureActivity a;
    private final h b;
    private a c;
    private final qw d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(CaptureActivity captureActivity, Collection<sv> collection, Map<wv, ?> map, String str, qw qwVar) {
        this.a = captureActivity;
        h hVar = new h(captureActivity, collection, map, str, new o(captureActivity.d()));
        this.b = hVar;
        hVar.start();
        this.c = a.SUCCESS;
        this.d = qwVar;
        qwVar.e();
        b();
    }

    private void b() {
        if (this.c == a.SUCCESS) {
            this.c = a.PREVIEW;
            this.d.a(this.b.a(), R$id.decode);
            this.a.a();
        }
    }

    public void a() {
        this.c = a.DONE;
        this.d.f();
        Message.obtain(this.b.a(), R$id.quit).sendToTarget();
        try {
            this.b.join(500L);
        } catch (InterruptedException unused) {
        }
        removeMessages(R$id.decode_succeeded);
        removeMessages(R$id.decode_failed);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ActivityInfo activityInfo;
        int i = message.what;
        if (i == R$id.restart_preview) {
            b();
            return;
        }
        String str = null;
        Bitmap bitmap = null;
        str = null;
        if (i == R$id.decode_succeeded) {
            this.c = a.SUCCESS;
            Bundle data = message.getData();
            float f = 1.0f;
            if (data != null) {
                byte[] byteArray = data.getByteArray("barcode_bitmap");
                bitmap = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null).copy(Bitmap.Config.ARGB_8888, true) : null;
                f = data.getFloat("barcode_scaled_factor");
            }
            this.a.a((fw) message.obj, bitmap, f);
            return;
        }
        if (i == R$id.decode_failed) {
            this.c = a.PREVIEW;
            this.d.a(this.b.a(), R$id.decode);
            return;
        }
        if (i == R$id.return_scan_result) {
            this.a.setResult(-1, (Intent) message.obj);
            this.a.finish();
            return;
        }
        if (i == R$id.launch_product_query) {
            String str2 = (String) message.obj;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(524288);
            intent.setData(Uri.parse(str2));
            ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
                str = activityInfo.packageName;
                String str3 = "Using browser in package " + str;
            }
            if ("com.android.browser".equals(str) || "com.android.chrome".equals(str)) {
                intent.setPackage(str);
                intent.addFlags(268435456);
                intent.putExtra("com.android.browser.application_id", str);
            }
            try {
                this.a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                String str4 = "Can't find anything to handle VIEW of URI " + str2;
            }
        }
    }
}
