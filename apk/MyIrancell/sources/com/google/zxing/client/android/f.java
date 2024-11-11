package com.google.zxing.client.android;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.bw;
import defpackage.wv;
import defpackage.zv;
import java.io.ByteArrayOutputStream;
import java.util.Map;

/* loaded from: classes.dex */
final class f extends Handler {
    private static final String d = f.class.getSimpleName();
    private final CaptureActivity a;
    private final zv b;
    private boolean c = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(CaptureActivity captureActivity, Map<wv, Object> map) {
        zv zvVar = new zv();
        this.b = zvVar;
        zvVar.a((Map<wv, ?>) map);
        this.a = captureActivity;
    }

    private static void a(bw bwVar, Bundle bundle) {
        int[] h = bwVar.h();
        int g = bwVar.g();
        Bitmap createBitmap = Bitmap.createBitmap(h, 0, g, g, bwVar.f(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray("barcode_bitmap", byteArrayOutputStream.toByteArray());
        bundle.putFloat("barcode_scaled_factor", g / bwVar.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.google.zxing.client.android.CaptureActivity r2 = r6.a
            qw r2 = r2.b()
            bw r7 = r2.a(r7, r8, r9)
            if (r7 == 0) goto L32
            uv r8 = new uv
            pz r9 = new pz
            r9.<init>(r7)
            r8.<init>(r9)
            zv r9 = r6.b     // Catch: java.lang.Throwable -> L26 defpackage.ew -> L2d
            fw r8 = r9.b(r8)     // Catch: java.lang.Throwable -> L26 defpackage.ew -> L2d
            zv r9 = r6.b
            r9.a()
            goto L33
        L26:
            r7 = move-exception
            zv r8 = r6.b
            r8.a()
            throw r7
        L2d:
            zv r8 = r6.b
            r8.a()
        L32:
            r8 = 0
        L33:
            com.google.zxing.client.android.CaptureActivity r9 = r6.a
            android.os.Handler r9 = r9.c()
            if (r8 == 0) goto L6c
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Found barcode in "
            r4.append(r5)
            long r2 = r2 - r0
            r4.append(r2)
            java.lang.String r0 = " ms"
            r4.append(r0)
            r4.toString()
            if (r9 == 0) goto L77
            int r0 = com.google.zxing.client.android.R$id.decode_succeeded
            android.os.Message r8 = android.os.Message.obtain(r9, r0, r8)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            a(r7, r9)
            r8.setData(r9)
            r8.sendToTarget()
            goto L77
        L6c:
            if (r9 == 0) goto L77
            int r7 = com.google.zxing.client.android.R$id.decode_failed
            android.os.Message r7 = android.os.Message.obtain(r9, r7)
            r7.sendToTarget()
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.android.f.a(byte[], int, int):void");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.c) {
            int i = message.what;
            if (i == R$id.decode) {
                a((byte[]) message.obj, message.arg1, message.arg2);
            } else if (i == R$id.quit) {
                this.c = false;
                Looper.myLooper().quit();
            }
        }
    }
}
