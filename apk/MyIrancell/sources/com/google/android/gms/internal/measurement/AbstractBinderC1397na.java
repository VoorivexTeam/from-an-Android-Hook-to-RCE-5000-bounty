package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000.InterfaceC2481fp;

/* renamed from: com.google.android.gms.internal.measurement.na */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1397na extends BinderC1328j1 implements InterfaceC1413ob {
    public AbstractBinderC1397na() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC1413ob asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof InterfaceC1413ob ? (InterfaceC1413ob) queryLocalInterface : new C1265ed(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.BinderC1328j1
    /* renamed from: a */
    protected final boolean mo7857a(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC1428pc c1280fd;
        InterfaceC1428pc interfaceC1428pc = null;
        InterfaceC1428pc interfaceC1428pc2 = null;
        InterfaceC1428pc interfaceC1428pc3 = null;
        InterfaceC1310hd interfaceC1310hd = null;
        InterfaceC1310hd interfaceC1310hd2 = null;
        InterfaceC1310hd interfaceC1310hd3 = null;
        InterfaceC1428pc interfaceC1428pc4 = null;
        InterfaceC1428pc interfaceC1428pc5 = null;
        InterfaceC1428pc interfaceC1428pc6 = null;
        InterfaceC1428pc interfaceC1428pc7 = null;
        InterfaceC1428pc interfaceC1428pc8 = null;
        InterfaceC1428pc interfaceC1428pc9 = null;
        InterfaceC1325id interfaceC1325id = null;
        InterfaceC1428pc interfaceC1428pc10 = null;
        InterfaceC1428pc interfaceC1428pc11 = null;
        InterfaceC1428pc interfaceC1428pc12 = null;
        InterfaceC1428pc interfaceC1428pc13 = null;
        switch (i) {
            case 1:
                initialize(InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), (zzv) C1443r.m8258a(parcel, zzv.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) C1443r.m8258a(parcel, Bundle.CREATOR), C1443r.m8262a(parcel), C1443r.m8262a(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) C1443r.m8258a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c1280fd = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1280fd = queryLocalInterface instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface : new C1280fd(readStrongBinder);
                }
                logEventAndBundle(readString, readString2, bundle, c1280fd, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), C1443r.m8262a(parcel), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean m8262a = C1443r.m8262a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc = queryLocalInterface2 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface2 : new C1280fd(readStrongBinder2);
                }
                getUserProperties(readString3, readString4, m8262a, interfaceC1428pc);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc13 = queryLocalInterface3 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface3 : new C1280fd(readStrongBinder3);
                }
                getMaxUserProperties(readString5, interfaceC1428pc13);
                parcel2.writeNoException();
                return true;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 8:
                setConditionalUserProperty((Bundle) C1443r.m8258a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) C1443r.m8258a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc12 = queryLocalInterface4 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface4 : new C1280fd(readStrongBinder4);
                }
                getConditionalUserProperties(readString6, readString7, interfaceC1428pc12);
                parcel2.writeNoException();
                return true;
            case 11:
                setMeasurementEnabled(C1443r.m8262a(parcel), parcel.readLong());
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
                setCurrentScreen(InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc11 = queryLocalInterface5 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface5 : new C1280fd(readStrongBinder5);
                }
                getCurrentScreenName(interfaceC1428pc11);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc10 = queryLocalInterface6 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface6 : new C1280fd(readStrongBinder6);
                }
                getCurrentScreenClass(interfaceC1428pc10);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    interfaceC1325id = queryLocalInterface7 instanceof InterfaceC1325id ? (InterfaceC1325id) queryLocalInterface7 : new C1355kd(readStrongBinder7);
                }
                setInstanceIdProvider(interfaceC1325id);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc9 = queryLocalInterface8 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface8 : new C1280fd(readStrongBinder8);
                }
                getCachedAppInstanceId(interfaceC1428pc9);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc8 = queryLocalInterface9 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface9 : new C1280fd(readStrongBinder9);
                }
                getAppInstanceId(interfaceC1428pc8);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc7 = queryLocalInterface10 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface10 : new C1280fd(readStrongBinder10);
                }
                getGmpAppId(interfaceC1428pc7);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc6 = queryLocalInterface11 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface11 : new C1280fd(readStrongBinder11);
                }
                generateEventId(interfaceC1428pc6);
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
                onActivityStarted(InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 26:
                onActivityStopped(InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 27:
                onActivityCreated(InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), (Bundle) C1443r.m8258a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 28:
                onActivityDestroyed(InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 29:
                onActivityPaused(InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 30:
                onActivityResumed(InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC2481fp m11796a = InterfaceC2481fp.a.m11796a(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc5 = queryLocalInterface12 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface12 : new C1280fd(readStrongBinder12);
                }
                onActivitySaveInstanceState(m11796a, interfaceC1428pc5, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 32:
                Bundle bundle2 = (Bundle) C1443r.m8258a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc4 = queryLocalInterface13 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface13 : new C1280fd(readStrongBinder13);
                }
                performAction(bundle2, interfaceC1428pc4, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()), InterfaceC2481fp.a.m11796a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC1310hd3 = queryLocalInterface14 instanceof InterfaceC1310hd ? (InterfaceC1310hd) queryLocalInterface14 : new C1340jd(readStrongBinder14);
                }
                setEventInterceptor(interfaceC1310hd3);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC1310hd2 = queryLocalInterface15 instanceof InterfaceC1310hd ? (InterfaceC1310hd) queryLocalInterface15 : new C1340jd(readStrongBinder15);
                }
                registerOnMeasurementEventListener(interfaceC1310hd2);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC1310hd = queryLocalInterface16 instanceof InterfaceC1310hd ? (InterfaceC1310hd) queryLocalInterface16 : new C1340jd(readStrongBinder16);
                }
                unregisterOnMeasurementEventListener(interfaceC1310hd);
                parcel2.writeNoException();
                return true;
            case 37:
                initForTests(C1443r.m8263b(parcel));
                parcel2.writeNoException();
                return true;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc3 = queryLocalInterface17 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface17 : new C1280fd(readStrongBinder17);
                }
                getTestFlag(interfaceC1428pc3, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 39:
                setDataCollectionEnabled(C1443r.m8262a(parcel));
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1428pc2 = queryLocalInterface18 instanceof InterfaceC1428pc ? (InterfaceC1428pc) queryLocalInterface18 : new C1280fd(readStrongBinder18);
                }
                isDataCollectionEnabled(interfaceC1428pc2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
