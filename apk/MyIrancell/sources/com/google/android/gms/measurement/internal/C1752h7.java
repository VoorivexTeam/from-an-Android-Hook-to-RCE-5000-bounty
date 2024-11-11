package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1308hb;
import com.google.android.gms.internal.measurement.C1440qa;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.h7 */
/* loaded from: classes.dex */
public final class C1752h7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    private final /* synthetic */ C1846p6 f7597b;

    private C1752h7(C1846p6 c1846p6) {
        this.f7597b = c1846p6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1752h7(C1846p6 c1846p6, RunnableC1868r6 runnableC1868r6) {
        this(c1846p6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009c A[Catch: Exception -> 0x01a7, TRY_ENTER, TryCatch #0 {Exception -> 0x01a7, blocks: (B:3:0x0006, B:6:0x0020, B:8:0x002e, B:14:0x009c, B:16:0x00aa, B:18:0x00bd, B:21:0x00c5, B:23:0x00cb, B:24:0x00de, B:25:0x00e5, B:28:0x00f5, B:31:0x0105, B:34:0x010d, B:36:0x0113, B:37:0x011e, B:41:0x0125, B:45:0x0146, B:46:0x015b, B:48:0x014c, B:49:0x0162, B:51:0x0168, B:53:0x016e, B:55:0x0174, B:57:0x017a, B:59:0x0182, B:63:0x018d, B:65:0x019b, B:67:0x01a1, B:71:0x003f, B:74:0x004c, B:76:0x0052, B:78:0x0058, B:80:0x005e, B:82:0x0064, B:83:0x0070, B:85:0x007c, B:86:0x0087, B:88:0x0091, B:89:0x0081), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5 A[Catch: Exception -> 0x01a7, TRY_ENTER, TryCatch #0 {Exception -> 0x01a7, blocks: (B:3:0x0006, B:6:0x0020, B:8:0x002e, B:14:0x009c, B:16:0x00aa, B:18:0x00bd, B:21:0x00c5, B:23:0x00cb, B:24:0x00de, B:25:0x00e5, B:28:0x00f5, B:31:0x0105, B:34:0x010d, B:36:0x0113, B:37:0x011e, B:41:0x0125, B:45:0x0146, B:46:0x015b, B:48:0x014c, B:49:0x0162, B:51:0x0168, B:53:0x016e, B:55:0x0174, B:57:0x017a, B:59:0x0182, B:63:0x018d, B:65:0x019b, B:67:0x01a1, B:71:0x003f, B:74:0x004c, B:76:0x0052, B:78:0x0058, B:80:0x005e, B:82:0x0064, B:83:0x0070, B:85:0x007c, B:86:0x0087, B:88:0x0091, B:89:0x0081), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125 A[Catch: Exception -> 0x01a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a7, blocks: (B:3:0x0006, B:6:0x0020, B:8:0x002e, B:14:0x009c, B:16:0x00aa, B:18:0x00bd, B:21:0x00c5, B:23:0x00cb, B:24:0x00de, B:25:0x00e5, B:28:0x00f5, B:31:0x0105, B:34:0x010d, B:36:0x0113, B:37:0x011e, B:41:0x0125, B:45:0x0146, B:46:0x015b, B:48:0x014c, B:49:0x0162, B:51:0x0168, B:53:0x016e, B:55:0x0174, B:57:0x017a, B:59:0x0182, B:63:0x018d, B:65:0x019b, B:67:0x01a1, B:71:0x003f, B:74:0x004c, B:76:0x0052, B:78:0x0058, B:80:0x005e, B:82:0x0064, B:83:0x0070, B:85:0x007c, B:86:0x0087, B:88:0x0091, B:89:0x0081), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9370a(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1752h7.m9370a(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                this.f7597b.mo9324k().m9304B().m9365a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    this.f7597b.m9322i();
                    String str = C1959z9.m9912a(intent) ? "gs" : "auto";
                    String queryParameter = data.getQueryParameter("referrer");
                    boolean z = bundle == null;
                    if (C1308hb.m7895a() && C1828o.f7803C0.m9875a(null).booleanValue()) {
                        this.f7597b.mo9320g().m9344a(new RunnableC1788k7(this, z, data, str, queryParameter));
                    } else {
                        m9370a(z, data, str, queryParameter);
                    }
                }
            } catch (Exception e) {
                this.f7597b.mo9324k().m9309t().m9366a("Throwable caught in onActivityCreated", e);
            }
        } finally {
            this.f7597b.m9200s().m9770a(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f7597b.m9200s().m9775c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f7597b.m9200s().m9773b(activity);
        C1936x8 u = this.f7597b.m9202u();
        u.mo9320g().m9344a(new RunnableC1958z8(u, u.mo9321h().mo7376b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (C1440qa.m8253a() && C1828o.f7840V.m9875a(null).booleanValue()) {
            this.f7597b.m9202u().m9885B();
            this.f7597b.m9200s().m9769a(activity);
        } else {
            this.f7597b.m9200s().m9769a(activity);
            this.f7597b.m9202u().m9885B();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f7597b.m9200s().m9774b(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
