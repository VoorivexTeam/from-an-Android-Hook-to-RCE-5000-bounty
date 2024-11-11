package com.google.zxing.client.android;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p000.EnumC3224sv;
import p000.EnumC3412wv;
import p000.InterfaceC2790iw;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.zxing.client.android.h */
/* loaded from: classes.dex */
public final class C2259h extends Thread {

    /* renamed from: b */
    private final CaptureActivity f9134b;

    /* renamed from: c */
    private final Map<EnumC3412wv, Object> f9135c;

    /* renamed from: d */
    private Handler f9136d;

    /* renamed from: e */
    private final CountDownLatch f9137e = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2259h(CaptureActivity captureActivity, Collection<EnumC3224sv> collection, Map<EnumC3412wv, ?> map, String str, InterfaceC2790iw interfaceC2790iw) {
        this.f9134b = captureActivity;
        EnumMap enumMap = new EnumMap(EnumC3412wv.class);
        this.f9135c = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(captureActivity);
            collection = EnumSet.noneOf(EnumC3224sv.class);
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_product", true)) {
                collection.addAll(C2256e.f9121b);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_industrial", true)) {
                collection.addAll(C2256e.f9122c);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_QR", true)) {
                collection.addAll(C2256e.f9124e);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Data_Matrix", true)) {
                collection.addAll(C2256e.f9125f);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Aztec", false)) {
                collection.addAll(C2256e.f9126g);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_PDF417", false)) {
                collection.addAll(C2256e.f9127h);
            }
        }
        this.f9135c.put(EnumC3412wv.POSSIBLE_FORMATS, collection);
        if (str != null) {
            this.f9135c.put(EnumC3412wv.CHARACTER_SET, str);
        }
        this.f9135c.put(EnumC3412wv.NEED_RESULT_POINT_CALLBACK, interfaceC2790iw);
        String str2 = "Hints: " + this.f9135c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Handler m10879a() {
        try {
            this.f9137e.await();
        } catch (InterruptedException unused) {
        }
        return this.f9136d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f9136d = new HandlerC2257f(this.f9134b, this.f9135c);
        this.f9137e.countDown();
        Looper.loop();
    }
}
