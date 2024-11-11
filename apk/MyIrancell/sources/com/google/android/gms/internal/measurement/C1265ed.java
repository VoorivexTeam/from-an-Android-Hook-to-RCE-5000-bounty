package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;
import p000.InterfaceC2481fp;

/* renamed from: com.google.android.gms.internal.measurement.ed */
/* loaded from: classes.dex */
public final class C1265ed extends C1191a implements InterfaceC1413ob {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1265ed(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void beginAdUnitExposure(String str, long j) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeLong(j);
        m7505b(23, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        C1443r.m8260a(m7503a, bundle);
        m7505b(9, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void endAdUnitExposure(String str, long j) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeLong(j);
        m7505b(24, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void generateEventId(InterfaceC1428pc interfaceC1428pc) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7505b(22, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void getAppInstanceId(InterfaceC1428pc interfaceC1428pc) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7505b(20, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void getCachedAppInstanceId(InterfaceC1428pc interfaceC1428pc) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7505b(19, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void getConditionalUserProperties(String str, String str2, InterfaceC1428pc interfaceC1428pc) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7505b(10, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void getCurrentScreenClass(InterfaceC1428pc interfaceC1428pc) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7505b(17, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void getCurrentScreenName(InterfaceC1428pc interfaceC1428pc) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7505b(16, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void getGmpAppId(InterfaceC1428pc interfaceC1428pc) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7505b(21, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void getMaxUserProperties(String str, InterfaceC1428pc interfaceC1428pc) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7505b(6, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void getTestFlag(InterfaceC1428pc interfaceC1428pc, int i) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7503a.writeInt(i);
        m7505b(38, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC1428pc interfaceC1428pc) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        C1443r.m8261a(m7503a, z);
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7505b(5, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void initForTests(Map map) {
        Parcel m7503a = m7503a();
        m7503a.writeMap(map);
        m7505b(37, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void initialize(InterfaceC2481fp interfaceC2481fp, zzv zzvVar, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC2481fp);
        C1443r.m8260a(m7503a, zzvVar);
        m7503a.writeLong(j);
        m7505b(1, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void isDataCollectionEnabled(InterfaceC1428pc interfaceC1428pc) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7505b(40, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        C1443r.m8260a(m7503a, bundle);
        C1443r.m8261a(m7503a, z);
        C1443r.m8261a(m7503a, z2);
        m7503a.writeLong(j);
        m7505b(2, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1428pc interfaceC1428pc, long j) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        C1443r.m8260a(m7503a, bundle);
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7503a.writeLong(j);
        m7505b(3, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void logHealthData(int i, String str, InterfaceC2481fp interfaceC2481fp, InterfaceC2481fp interfaceC2481fp2, InterfaceC2481fp interfaceC2481fp3) {
        Parcel m7503a = m7503a();
        m7503a.writeInt(i);
        m7503a.writeString(str);
        C1443r.m8259a(m7503a, interfaceC2481fp);
        C1443r.m8259a(m7503a, interfaceC2481fp2);
        C1443r.m8259a(m7503a, interfaceC2481fp3);
        m7505b(33, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void onActivityCreated(InterfaceC2481fp interfaceC2481fp, Bundle bundle, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC2481fp);
        C1443r.m8260a(m7503a, bundle);
        m7503a.writeLong(j);
        m7505b(27, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void onActivityDestroyed(InterfaceC2481fp interfaceC2481fp, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC2481fp);
        m7503a.writeLong(j);
        m7505b(28, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void onActivityPaused(InterfaceC2481fp interfaceC2481fp, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC2481fp);
        m7503a.writeLong(j);
        m7505b(29, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void onActivityResumed(InterfaceC2481fp interfaceC2481fp, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC2481fp);
        m7503a.writeLong(j);
        m7505b(30, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void onActivitySaveInstanceState(InterfaceC2481fp interfaceC2481fp, InterfaceC1428pc interfaceC1428pc, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC2481fp);
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7503a.writeLong(j);
        m7505b(31, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void onActivityStarted(InterfaceC2481fp interfaceC2481fp, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC2481fp);
        m7503a.writeLong(j);
        m7505b(25, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void onActivityStopped(InterfaceC2481fp interfaceC2481fp, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC2481fp);
        m7503a.writeLong(j);
        m7505b(26, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void performAction(Bundle bundle, InterfaceC1428pc interfaceC1428pc, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, bundle);
        C1443r.m8259a(m7503a, interfaceC1428pc);
        m7503a.writeLong(j);
        m7505b(32, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void registerOnMeasurementEventListener(InterfaceC1310hd interfaceC1310hd) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1310hd);
        m7505b(35, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void resetAnalyticsData(long j) {
        Parcel m7503a = m7503a();
        m7503a.writeLong(j);
        m7505b(12, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, bundle);
        m7503a.writeLong(j);
        m7505b(8, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void setCurrentScreen(InterfaceC2481fp interfaceC2481fp, String str, String str2, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC2481fp);
        m7503a.writeString(str);
        m7503a.writeString(str2);
        m7503a.writeLong(j);
        m7505b(15, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void setDataCollectionEnabled(boolean z) {
        Parcel m7503a = m7503a();
        C1443r.m8261a(m7503a, z);
        m7505b(39, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void setEventInterceptor(InterfaceC1310hd interfaceC1310hd) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1310hd);
        m7505b(34, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void setInstanceIdProvider(InterfaceC1325id interfaceC1325id) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1325id);
        m7505b(18, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel m7503a = m7503a();
        C1443r.m8261a(m7503a, z);
        m7503a.writeLong(j);
        m7505b(11, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void setMinimumSessionDuration(long j) {
        Parcel m7503a = m7503a();
        m7503a.writeLong(j);
        m7505b(13, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void setSessionTimeoutDuration(long j) {
        Parcel m7503a = m7503a();
        m7503a.writeLong(j);
        m7505b(14, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void setUserId(String str, long j) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeLong(j);
        m7505b(7, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void setUserProperty(String str, String str2, InterfaceC2481fp interfaceC2481fp, boolean z, long j) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        C1443r.m8259a(m7503a, interfaceC2481fp);
        C1443r.m8261a(m7503a, z);
        m7503a.writeLong(j);
        m7505b(4, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public final void unregisterOnMeasurementEventListener(InterfaceC1310hd interfaceC1310hd) {
        Parcel m7503a = m7503a();
        C1443r.m8259a(m7503a, interfaceC1310hd);
        m7505b(36, m7503a);
    }
}
