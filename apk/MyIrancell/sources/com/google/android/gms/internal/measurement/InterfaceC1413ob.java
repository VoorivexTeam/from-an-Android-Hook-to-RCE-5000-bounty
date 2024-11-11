package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p000.InterfaceC2481fp;

/* renamed from: com.google.android.gms.internal.measurement.ob */
/* loaded from: classes.dex */
public interface InterfaceC1413ob extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(InterfaceC1428pc interfaceC1428pc);

    void getAppInstanceId(InterfaceC1428pc interfaceC1428pc);

    void getCachedAppInstanceId(InterfaceC1428pc interfaceC1428pc);

    void getConditionalUserProperties(String str, String str2, InterfaceC1428pc interfaceC1428pc);

    void getCurrentScreenClass(InterfaceC1428pc interfaceC1428pc);

    void getCurrentScreenName(InterfaceC1428pc interfaceC1428pc);

    void getGmpAppId(InterfaceC1428pc interfaceC1428pc);

    void getMaxUserProperties(String str, InterfaceC1428pc interfaceC1428pc);

    void getTestFlag(InterfaceC1428pc interfaceC1428pc, int i);

    void getUserProperties(String str, String str2, boolean z, InterfaceC1428pc interfaceC1428pc);

    void initForTests(Map map);

    void initialize(InterfaceC2481fp interfaceC2481fp, zzv zzvVar, long j);

    void isDataCollectionEnabled(InterfaceC1428pc interfaceC1428pc);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1428pc interfaceC1428pc, long j);

    void logHealthData(int i, String str, InterfaceC2481fp interfaceC2481fp, InterfaceC2481fp interfaceC2481fp2, InterfaceC2481fp interfaceC2481fp3);

    void onActivityCreated(InterfaceC2481fp interfaceC2481fp, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC2481fp interfaceC2481fp, long j);

    void onActivityPaused(InterfaceC2481fp interfaceC2481fp, long j);

    void onActivityResumed(InterfaceC2481fp interfaceC2481fp, long j);

    void onActivitySaveInstanceState(InterfaceC2481fp interfaceC2481fp, InterfaceC1428pc interfaceC1428pc, long j);

    void onActivityStarted(InterfaceC2481fp interfaceC2481fp, long j);

    void onActivityStopped(InterfaceC2481fp interfaceC2481fp, long j);

    void performAction(Bundle bundle, InterfaceC1428pc interfaceC1428pc, long j);

    void registerOnMeasurementEventListener(InterfaceC1310hd interfaceC1310hd);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC2481fp interfaceC2481fp, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setEventInterceptor(InterfaceC1310hd interfaceC1310hd);

    void setInstanceIdProvider(InterfaceC1325id interfaceC1325id);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC2481fp interfaceC2481fp, boolean z, long j);

    void unregisterOnMeasurementEventListener(InterfaceC1310hd interfaceC1310hd);
}
