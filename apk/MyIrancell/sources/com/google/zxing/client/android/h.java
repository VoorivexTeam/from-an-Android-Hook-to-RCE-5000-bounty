package com.google.zxing.client.android;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import defpackage.iw;
import defpackage.sv;
import defpackage.wv;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h extends Thread {
    private final CaptureActivity b;
    private final Map<wv, Object> c;
    private Handler d;
    private final CountDownLatch e = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(CaptureActivity captureActivity, Collection<sv> collection, Map<wv, ?> map, String str, iw iwVar) {
        this.b = captureActivity;
        EnumMap enumMap = new EnumMap(wv.class);
        this.c = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(captureActivity);
            collection = EnumSet.noneOf(sv.class);
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_product", true)) {
                collection.addAll(e.b);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_industrial", true)) {
                collection.addAll(e.c);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_QR", true)) {
                collection.addAll(e.e);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Data_Matrix", true)) {
                collection.addAll(e.f);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Aztec", false)) {
                collection.addAll(e.g);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_PDF417", false)) {
                collection.addAll(e.h);
            }
        }
        this.c.put(wv.POSSIBLE_FORMATS, collection);
        if (str != null) {
            this.c.put(wv.CHARACTER_SET, str);
        }
        this.c.put(wv.NEED_RESULT_POINT_CALLBACK, iwVar);
        String str2 = "Hints: " + this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler a() {
        try {
            this.e.await();
        } catch (InterruptedException unused) {
        }
        return this.d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.d = new f(this.b, this.c);
        this.e.countDown();
        Looper.loop();
    }
}
