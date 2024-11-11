package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.fp;

/* loaded from: classes.dex */
public abstract class na extends j1 implements ob {
    public na() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static ob asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof ob ? (ob) queryLocalInterface : new ed(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.j1
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        pc fdVar;
        pc pcVar = null;
        pc pcVar2 = null;
        pc pcVar3 = null;
        hd hdVar = null;
        hd hdVar2 = null;
        hd hdVar3 = null;
        pc pcVar4 = null;
        pc pcVar5 = null;
        pc pcVar6 = null;
        pc pcVar7 = null;
        pc pcVar8 = null;
        pc pcVar9 = null;
        id idVar = null;
        pc pcVar10 = null;
        pc pcVar11 = null;
        pc pcVar12 = null;
        pc pcVar13 = null;
        switch (i) {
            case 1:
                initialize(fp.a.a(parcel.readStrongBinder()), (zzv) r.a(parcel, zzv.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) r.a(parcel, Bundle.CREATOR), r.a(parcel), r.a(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) r.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    fdVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fdVar = queryLocalInterface instanceof pc ? (pc) queryLocalInterface : new fd(readStrongBinder);
                }
                logEventAndBundle(readString, readString2, bundle, fdVar, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), fp.a.a(parcel.readStrongBinder()), r.a(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean a = r.a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar = queryLocalInterface2 instanceof pc ? (pc) queryLocalInterface2 : new fd(readStrongBinder2);
                }
                getUserProperties(readString3, readString4, a, pcVar);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar13 = queryLocalInterface3 instanceof pc ? (pc) queryLocalInterface3 : new fd(readStrongBinder3);
                }
                getMaxUserProperties(readString5, pcVar13);
                parcel2.writeNoException();
                return true;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 8:
                setConditionalUserProperty((Bundle) r.a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) r.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar12 = queryLocalInterface4 instanceof pc ? (pc) queryLocalInterface4 : new fd(readStrongBinder4);
                }
                getConditionalUserProperties(readString6, readString7, pcVar12);
                parcel2.writeNoException();
                return true;
            case 11:
                setMeasurementEnabled(r.a(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 12:
                resetAnalyticsData(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 15:
                setCurrentScreen(fp.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar11 = queryLocalInterface5 instanceof pc ? (pc) queryLocalInterface5 : new fd(readStrongBinder5);
                }
                getCurrentScreenName(pcVar11);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar10 = queryLocalInterface6 instanceof pc ? (pc) queryLocalInterface6 : new fd(readStrongBinder6);
                }
                getCurrentScreenClass(pcVar10);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    idVar = queryLocalInterface7 instanceof id ? (id) queryLocalInterface7 : new kd(readStrongBinder7);
                }
                setInstanceIdProvider(idVar);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar9 = queryLocalInterface8 instanceof pc ? (pc) queryLocalInterface8 : new fd(readStrongBinder8);
                }
                getCachedAppInstanceId(pcVar9);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar8 = queryLocalInterface9 instanceof pc ? (pc) queryLocalInterface9 : new fd(readStrongBinder9);
                }
                getAppInstanceId(pcVar8);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar7 = queryLocalInterface10 instanceof pc ? (pc) queryLocalInterface10 : new fd(readStrongBinder10);
                }
                getGmpAppId(pcVar7);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar6 = queryLocalInterface11 instanceof pc ? (pc) queryLocalInterface11 : new fd(readStrongBinder11);
                }
                generateEventId(pcVar6);
                parcel2.writeNoException();
                return true;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                onActivityStarted(fp.a.a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 26:
                onActivityStopped(fp.a.a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 27:
                onActivityCreated(fp.a.a(parcel.readStrongBinder()), (Bundle) r.a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 28:
                onActivityDestroyed(fp.a.a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 29:
                onActivityPaused(fp.a.a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 30:
                onActivityResumed(fp.a.a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 31:
                fp a2 = fp.a.a(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar5 = queryLocalInterface12 instanceof pc ? (pc) queryLocalInterface12 : new fd(readStrongBinder12);
                }
                onActivitySaveInstanceState(a2, pcVar5, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 32:
                Bundle bundle2 = (Bundle) r.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar4 = queryLocalInterface13 instanceof pc ? (pc) queryLocalInterface13 : new fd(readStrongBinder13);
                }
                performAction(bundle2, pcVar4, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), fp.a.a(parcel.readStrongBinder()), fp.a.a(parcel.readStrongBinder()), fp.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    hdVar3 = queryLocalInterface14 instanceof hd ? (hd) queryLocalInterface14 : new jd(readStrongBinder14);
                }
                setEventInterceptor(hdVar3);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    hdVar2 = queryLocalInterface15 instanceof hd ? (hd) queryLocalInterface15 : new jd(readStrongBinder15);
                }
                registerOnMeasurementEventListener(hdVar2);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    hdVar = queryLocalInterface16 instanceof hd ? (hd) queryLocalInterface16 : new jd(readStrongBinder16);
                }
                unregisterOnMeasurementEventListener(hdVar);
                parcel2.writeNoException();
                return true;
            case 37:
                initForTests(r.b(parcel));
                parcel2.writeNoException();
                return true;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar3 = queryLocalInterface17 instanceof pc ? (pc) queryLocalInterface17 : new fd(readStrongBinder17);
                }
                getTestFlag(pcVar3, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 39:
                setDataCollectionEnabled(r.a(parcel));
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pcVar2 = queryLocalInterface18 instanceof pc ? (pc) queryLocalInterface18 : new fd(readStrongBinder18);
                }
                isDataCollectionEnabled(pcVar2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
