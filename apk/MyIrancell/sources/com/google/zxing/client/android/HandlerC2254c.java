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
import java.util.Collection;
import java.util.Map;
import p000.C2488fw;
import p000.C3142qw;
import p000.EnumC3224sv;
import p000.EnumC3412wv;

/* renamed from: com.google.zxing.client.android.c */
/* loaded from: classes.dex */
public final class HandlerC2254c extends Handler {

    /* renamed from: e */
    private static final String f9111e = HandlerC2254c.class.getSimpleName();

    /* renamed from: a */
    private final CaptureActivity f9112a;

    /* renamed from: b */
    private final C2259h f9113b;

    /* renamed from: c */
    private a f9114c;

    /* renamed from: d */
    private final C3142qw f9115d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.zxing.client.android.c$a */
    /* loaded from: classes.dex */
    public enum a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC2254c(CaptureActivity captureActivity, Collection<EnumC3224sv> collection, Map<EnumC3412wv, ?> map, String str, C3142qw c3142qw) {
        this.f9112a = captureActivity;
        C2259h c2259h = new C2259h(captureActivity, collection, map, str, new C2266o(captureActivity.m10836d()));
        this.f9113b = c2259h;
        c2259h.start();
        this.f9114c = a.SUCCESS;
        this.f9115d = c3142qw;
        c3142qw.m15147e();
        m10869b();
    }

    /* renamed from: b */
    private void m10869b() {
        if (this.f9114c == a.SUCCESS) {
            this.f9114c = a.PREVIEW;
            this.f9115d.m15140a(this.f9113b.m10879a(), R$id.decode);
            this.f9112a.m10831a();
        }
    }

    /* renamed from: a */
    public void m10870a() {
        this.f9114c = a.DONE;
        this.f9115d.m15148f();
        Message.obtain(this.f9113b.m10879a(), R$id.quit).sendToTarget();
        try {
            this.f9113b.join(500L);
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
            m10869b();
            return;
        }
        String str = null;
        Bitmap bitmap = null;
        str = null;
        if (i == R$id.decode_succeeded) {
            this.f9114c = a.SUCCESS;
            Bundle data = message.getData();
            float f = 1.0f;
            if (data != null) {
                byte[] byteArray = data.getByteArray("barcode_bitmap");
                bitmap = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null).copy(Bitmap.Config.ARGB_8888, true) : null;
                f = data.getFloat("barcode_scaled_factor");
            }
            this.f9112a.m10833a((C2488fw) message.obj, bitmap, f);
            return;
        }
        if (i == R$id.decode_failed) {
            this.f9114c = a.PREVIEW;
            this.f9115d.m15140a(this.f9113b.m10879a(), R$id.decode);
            return;
        }
        if (i == R$id.return_scan_result) {
            this.f9112a.setResult(-1, (Intent) message.obj);
            this.f9112a.finish();
            return;
        }
        if (i == R$id.launch_product_query) {
            String str2 = (String) message.obj;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(524288);
            intent.setData(Uri.parse(str2));
            ResolveInfo resolveActivity = this.f9112a.getPackageManager().resolveActivity(intent, 65536);
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
                this.f9112a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                String str4 = "Can't find anything to handle VIEW of URI " + str2;
            }
        }
    }
}
