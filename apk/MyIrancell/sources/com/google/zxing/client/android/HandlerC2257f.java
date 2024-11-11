package com.google.zxing.client.android;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import p000.C0495bw;
import p000.C3543zv;
import p000.EnumC3412wv;

/* renamed from: com.google.zxing.client.android.f */
/* loaded from: classes.dex */
final class HandlerC2257f extends Handler {

    /* renamed from: d */
    private static final String f9129d = HandlerC2257f.class.getSimpleName();

    /* renamed from: a */
    private final CaptureActivity f9130a;

    /* renamed from: b */
    private final C3543zv f9131b;

    /* renamed from: c */
    private boolean f9132c = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC2257f(CaptureActivity captureActivity, Map<EnumC3412wv, Object> map) {
        C3543zv c3543zv = new C3543zv();
        this.f9131b = c3543zv;
        c3543zv.m16958a((Map<EnumC3412wv, ?>) map);
        this.f9130a = captureActivity;
    }

    /* renamed from: a */
    private static void m10874a(C0495bw c0495bw, Bundle bundle) {
        int[] m3451h = c0495bw.m3451h();
        int m3450g = c0495bw.m3450g();
        Bitmap createBitmap = Bitmap.createBitmap(m3451h, 0, m3450g, m3450g, c0495bw.m3449f(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray("barcode_bitmap", byteArrayOutputStream.toByteArray());
        bundle.putFloat("barcode_scaled_factor", m3450g / c0495bw.m16666c());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m10875a(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.google.zxing.client.android.CaptureActivity r2 = r6.f9130a
            qw r2 = r2.m10834b()
            bw r7 = r2.m15136a(r7, r8, r9)
            if (r7 == 0) goto L32
            uv r8 = new uv
            pz r9 = new pz
            r9.<init>(r7)
            r8.<init>(r9)
            zv r9 = r6.f9131b     // Catch: java.lang.Throwable -> L26 p000.AbstractC2447ew -> L2d
            fw r8 = r9.m16959b(r8)     // Catch: java.lang.Throwable -> L26 p000.AbstractC2447ew -> L2d
            zv r9 = r6.f9131b
            r9.mo11489a()
            goto L33
        L26:
            r7 = move-exception
            zv r8 = r6.f9131b
            r8.mo11489a()
            throw r7
        L2d:
            zv r8 = r6.f9131b
            r8.mo11489a()
        L32:
            r8 = 0
        L33:
            com.google.zxing.client.android.CaptureActivity r9 = r6.f9130a
            android.os.Handler r9 = r9.m10835c()
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
            m10874a(r7, r9)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.android.HandlerC2257f.m10875a(byte[], int, int):void");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.f9132c) {
            int i = message.what;
            if (i == R$id.decode) {
                m10875a((byte[]) message.obj, message.arg1, message.arg2);
            } else if (i == R$id.quit) {
                this.f9132c = false;
                Looper.myLooper().quit();
            }
        }
    }
}
