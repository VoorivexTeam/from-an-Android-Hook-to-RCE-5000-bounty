package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import defpackage.fp;
import java.util.Map;

/* loaded from: classes.dex */
public interface ob extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(pc pcVar);

    void getAppInstanceId(pc pcVar);

    void getCachedAppInstanceId(pc pcVar);

    void getConditionalUserProperties(String str, String str2, pc pcVar);

    void getCurrentScreenClass(pc pcVar);

    void getCurrentScreenName(pc pcVar);

    void getGmpAppId(pc pcVar);

    void getMaxUserProperties(String str, pc pcVar);

    void getTestFlag(pc pcVar, int i);

    void getUserProperties(String str, String str2, boolean z, pc pcVar);

    void initForTests(Map map);

    void initialize(fp fpVar, zzv zzvVar, long j);

    void isDataCollectionEnabled(pc pcVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, pc pcVar, long j);

    void logHealthData(int i, String str, fp fpVar, fp fpVar2, fp fpVar3);

    void onActivityCreated(fp fpVar, Bundle bundle, long j);

    void onActivityDestroyed(fp fpVar, long j);

    void onActivityPaused(fp fpVar, long j);

    void onActivityResumed(fp fpVar, long j);

    void onActivitySaveInstanceState(fp fpVar, pc pcVar, long j);

    void onActivityStarted(fp fpVar, long j);

    void onActivityStopped(fp fpVar, long j);

    void performAction(Bundle bundle, pc pcVar, long j);

    void registerOnMeasurementEventListener(hd hdVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(fp fpVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setEventInterceptor(hd hdVar);

    void setInstanceIdProvider(id idVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, fp fpVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(hd hdVar);
}
