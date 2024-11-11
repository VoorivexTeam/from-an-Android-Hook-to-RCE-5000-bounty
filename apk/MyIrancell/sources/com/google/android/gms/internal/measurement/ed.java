package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.fp;
import java.util.Map;

/* loaded from: classes.dex */
public final class ed extends a implements ob {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ed(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void beginAdUnitExposure(String str, long j) {
        Parcel a = a();
        a.writeString(str);
        a.writeLong(j);
        b(23, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        r.a(a, bundle);
        b(9, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void endAdUnitExposure(String str, long j) {
        Parcel a = a();
        a.writeString(str);
        a.writeLong(j);
        b(24, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void generateEventId(pc pcVar) {
        Parcel a = a();
        r.a(a, pcVar);
        b(22, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void getAppInstanceId(pc pcVar) {
        Parcel a = a();
        r.a(a, pcVar);
        b(20, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void getCachedAppInstanceId(pc pcVar) {
        Parcel a = a();
        r.a(a, pcVar);
        b(19, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void getConditionalUserProperties(String str, String str2, pc pcVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        r.a(a, pcVar);
        b(10, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void getCurrentScreenClass(pc pcVar) {
        Parcel a = a();
        r.a(a, pcVar);
        b(17, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void getCurrentScreenName(pc pcVar) {
        Parcel a = a();
        r.a(a, pcVar);
        b(16, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void getGmpAppId(pc pcVar) {
        Parcel a = a();
        r.a(a, pcVar);
        b(21, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void getMaxUserProperties(String str, pc pcVar) {
        Parcel a = a();
        a.writeString(str);
        r.a(a, pcVar);
        b(6, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void getTestFlag(pc pcVar, int i) {
        Parcel a = a();
        r.a(a, pcVar);
        a.writeInt(i);
        b(38, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void getUserProperties(String str, String str2, boolean z, pc pcVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        r.a(a, z);
        r.a(a, pcVar);
        b(5, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void initForTests(Map map) {
        Parcel a = a();
        a.writeMap(map);
        b(37, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void initialize(fp fpVar, zzv zzvVar, long j) {
        Parcel a = a();
        r.a(a, fpVar);
        r.a(a, zzvVar);
        a.writeLong(j);
        b(1, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void isDataCollectionEnabled(pc pcVar) {
        Parcel a = a();
        r.a(a, pcVar);
        b(40, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        r.a(a, bundle);
        r.a(a, z);
        r.a(a, z2);
        a.writeLong(j);
        b(2, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void logEventAndBundle(String str, String str2, Bundle bundle, pc pcVar, long j) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        r.a(a, bundle);
        r.a(a, pcVar);
        a.writeLong(j);
        b(3, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void logHealthData(int i, String str, fp fpVar, fp fpVar2, fp fpVar3) {
        Parcel a = a();
        a.writeInt(i);
        a.writeString(str);
        r.a(a, fpVar);
        r.a(a, fpVar2);
        r.a(a, fpVar3);
        b(33, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void onActivityCreated(fp fpVar, Bundle bundle, long j) {
        Parcel a = a();
        r.a(a, fpVar);
        r.a(a, bundle);
        a.writeLong(j);
        b(27, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void onActivityDestroyed(fp fpVar, long j) {
        Parcel a = a();
        r.a(a, fpVar);
        a.writeLong(j);
        b(28, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void onActivityPaused(fp fpVar, long j) {
        Parcel a = a();
        r.a(a, fpVar);
        a.writeLong(j);
        b(29, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void onActivityResumed(fp fpVar, long j) {
        Parcel a = a();
        r.a(a, fpVar);
        a.writeLong(j);
        b(30, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void onActivitySaveInstanceState(fp fpVar, pc pcVar, long j) {
        Parcel a = a();
        r.a(a, fpVar);
        r.a(a, pcVar);
        a.writeLong(j);
        b(31, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void onActivityStarted(fp fpVar, long j) {
        Parcel a = a();
        r.a(a, fpVar);
        a.writeLong(j);
        b(25, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void onActivityStopped(fp fpVar, long j) {
        Parcel a = a();
        r.a(a, fpVar);
        a.writeLong(j);
        b(26, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void performAction(Bundle bundle, pc pcVar, long j) {
        Parcel a = a();
        r.a(a, bundle);
        r.a(a, pcVar);
        a.writeLong(j);
        b(32, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void registerOnMeasurementEventListener(hd hdVar) {
        Parcel a = a();
        r.a(a, hdVar);
        b(35, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void resetAnalyticsData(long j) {
        Parcel a = a();
        a.writeLong(j);
        b(12, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel a = a();
        r.a(a, bundle);
        a.writeLong(j);
        b(8, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void setCurrentScreen(fp fpVar, String str, String str2, long j) {
        Parcel a = a();
        r.a(a, fpVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeLong(j);
        b(15, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void setDataCollectionEnabled(boolean z) {
        Parcel a = a();
        r.a(a, z);
        b(39, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void setEventInterceptor(hd hdVar) {
        Parcel a = a();
        r.a(a, hdVar);
        b(34, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void setInstanceIdProvider(id idVar) {
        Parcel a = a();
        r.a(a, idVar);
        b(18, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel a = a();
        r.a(a, z);
        a.writeLong(j);
        b(11, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void setMinimumSessionDuration(long j) {
        Parcel a = a();
        a.writeLong(j);
        b(13, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void setSessionTimeoutDuration(long j) {
        Parcel a = a();
        a.writeLong(j);
        b(14, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void setUserId(String str, long j) {
        Parcel a = a();
        a.writeString(str);
        a.writeLong(j);
        b(7, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void setUserProperty(String str, String str2, fp fpVar, boolean z, long j) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        r.a(a, fpVar);
        r.a(a, z);
        a.writeLong(j);
        b(4, a);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final void unregisterOnMeasurementEventListener(hd hdVar) {
        Parcel a = a();
        r.a(a, hdVar);
        b(36, a);
    }
}
