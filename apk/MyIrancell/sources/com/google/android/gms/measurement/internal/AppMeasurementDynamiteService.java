package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC1397na;
import com.google.android.gms.internal.measurement.InterfaceC1310hd;
import com.google.android.gms.internal.measurement.InterfaceC1325id;
import com.google.android.gms.internal.measurement.InterfaceC1428pc;
import java.util.Map;
import p000.BinderC2521gp;
import p000.C0500c0;
import p000.InterfaceC2481fp;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC1397na {

    /* renamed from: a */
    C1774j5 f7346a = null;

    /* renamed from: b */
    private Map<Integer, InterfaceC1823n6> f7347b = new C0500c0();

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    /* loaded from: classes.dex */
    class C1658a implements InterfaceC1787k6 {

        /* renamed from: a */
        private InterfaceC1310hd f7348a;

        C1658a(InterfaceC1310hd interfaceC1310hd) {
            this.f7348a = interfaceC1310hd;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC1787k6
        /* renamed from: a */
        public final void mo9084a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f7348a.mo7910a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f7346a.mo9324k().m9312w().m9366a("Event interceptor threw exception", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    /* loaded from: classes.dex */
    class C1659b implements InterfaceC1823n6 {

        /* renamed from: a */
        private InterfaceC1310hd f7350a;

        C1659b(InterfaceC1310hd interfaceC1310hd) {
            this.f7350a = interfaceC1310hd;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC1823n6
        /* renamed from: a */
        public final void mo9085a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f7350a.mo7910a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f7346a.mo9324k().m9312w().m9366a("Event listener threw exception", e);
            }
        }
    }

    /* renamed from: a */
    private final void m9083a(InterfaceC1428pc interfaceC1428pc, String str) {
        this.f7346a.m9426w().m9945a(interfaceC1428pc, str);
    }

    private final void zza() {
        if (this.f7346a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void beginAdUnitExposure(String str, long j) {
        zza();
        this.f7346a.m9404I().m9901a(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zza();
        this.f7346a.m9425v().m9752c(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void endAdUnitExposure(String str, long j) {
        zza();
        this.f7346a.m9404I().m9902b(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void generateEventId(InterfaceC1428pc interfaceC1428pc) {
        zza();
        this.f7346a.m9426w().m9943a(interfaceC1428pc, this.f7346a.m9426w().m9961t());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void getAppInstanceId(InterfaceC1428pc interfaceC1428pc) {
        zza();
        this.f7346a.mo9320g().m9344a(new RunnableC1704d7(this, interfaceC1428pc));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void getCachedAppInstanceId(InterfaceC1428pc interfaceC1428pc) {
        zza();
        m9083a(interfaceC1428pc, this.f7346a.m9425v().m9721H());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void getConditionalUserProperties(String str, String str2, InterfaceC1428pc interfaceC1428pc) {
        zza();
        this.f7346a.mo9320g().m9344a(new RunnableC1705d8(this, interfaceC1428pc, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void getCurrentScreenClass(InterfaceC1428pc interfaceC1428pc) {
        zza();
        m9083a(interfaceC1428pc, this.f7346a.m9425v().m9724K());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void getCurrentScreenName(InterfaceC1428pc interfaceC1428pc) {
        zza();
        m9083a(interfaceC1428pc, this.f7346a.m9425v().m9723J());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void getGmpAppId(InterfaceC1428pc interfaceC1428pc) {
        zza();
        m9083a(interfaceC1428pc, this.f7346a.m9425v().m9725L());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void getMaxUserProperties(String str, InterfaceC1428pc interfaceC1428pc) {
        zza();
        this.f7346a.m9425v();
        C1057u.m7296b(str);
        this.f7346a.m9426w().m9942a(interfaceC1428pc, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void getTestFlag(InterfaceC1428pc interfaceC1428pc, int i) {
        zza();
        if (i == 0) {
            this.f7346a.m9426w().m9945a(interfaceC1428pc, this.f7346a.m9425v().m9717D());
            return;
        }
        if (i == 1) {
            this.f7346a.m9426w().m9943a(interfaceC1428pc, this.f7346a.m9425v().m9718E().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.f7346a.m9426w().m9942a(interfaceC1428pc, this.f7346a.m9425v().m9719F().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.f7346a.m9426w().m9947a(interfaceC1428pc, this.f7346a.m9425v().m9716C().booleanValue());
                return;
            }
        }
        C1959z9 m9426w = this.f7346a.m9426w();
        double doubleValue = this.f7346a.m9425v().m9720G().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            interfaceC1428pc.mo7833a(bundle);
        } catch (RemoteException e) {
            m9426w.f7550a.mo9324k().m9312w().m9366a("Error returning double value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void getUserProperties(String str, String str2, boolean z, InterfaceC1428pc interfaceC1428pc) {
        zza();
        this.f7346a.mo9320g().m9344a(new RunnableC1718e9(this, interfaceC1428pc, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void initForTests(Map map) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void initialize(InterfaceC2481fp interfaceC2481fp, com.google.android.gms.internal.measurement.zzv zzvVar, long j) {
        Context context = (Context) BinderC2521gp.m12037a(interfaceC2481fp);
        C1774j5 c1774j5 = this.f7346a;
        if (c1774j5 == null) {
            this.f7346a = C1774j5.m9389a(context, zzvVar);
        } else {
            c1774j5.mo9324k().m9312w().m9365a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void isDataCollectionEnabled(InterfaceC1428pc interfaceC1428pc) {
        zza();
        this.f7346a.mo9320g().m9344a(new RunnableC1683ba(this, interfaceC1428pc));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zza();
        this.f7346a.m9425v().m9740a(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1428pc interfaceC1428pc, long j) {
        zza();
        C1057u.m7296b(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f7346a.mo9320g().m9344a(new RunnableC1715e6(this, interfaceC1428pc, new zzan(str2, new zzam(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void logHealthData(int i, String str, InterfaceC2481fp interfaceC2481fp, InterfaceC2481fp interfaceC2481fp2, InterfaceC2481fp interfaceC2481fp3) {
        zza();
        this.f7346a.mo9324k().m9307a(i, true, false, str, interfaceC2481fp == null ? null : BinderC2521gp.m12037a(interfaceC2481fp), interfaceC2481fp2 == null ? null : BinderC2521gp.m12037a(interfaceC2481fp2), interfaceC2481fp3 != null ? BinderC2521gp.m12037a(interfaceC2481fp3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void onActivityCreated(InterfaceC2481fp interfaceC2481fp, Bundle bundle, long j) {
        zza();
        C1752h7 c1752h7 = this.f7346a.m9425v().f7963c;
        if (c1752h7 != null) {
            this.f7346a.m9425v().m9715B();
            c1752h7.onActivityCreated((Activity) BinderC2521gp.m12037a(interfaceC2481fp), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void onActivityDestroyed(InterfaceC2481fp interfaceC2481fp, long j) {
        zza();
        C1752h7 c1752h7 = this.f7346a.m9425v().f7963c;
        if (c1752h7 != null) {
            this.f7346a.m9425v().m9715B();
            c1752h7.onActivityDestroyed((Activity) BinderC2521gp.m12037a(interfaceC2481fp));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void onActivityPaused(InterfaceC2481fp interfaceC2481fp, long j) {
        zza();
        C1752h7 c1752h7 = this.f7346a.m9425v().f7963c;
        if (c1752h7 != null) {
            this.f7346a.m9425v().m9715B();
            c1752h7.onActivityPaused((Activity) BinderC2521gp.m12037a(interfaceC2481fp));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void onActivityResumed(InterfaceC2481fp interfaceC2481fp, long j) {
        zza();
        C1752h7 c1752h7 = this.f7346a.m9425v().f7963c;
        if (c1752h7 != null) {
            this.f7346a.m9425v().m9715B();
            c1752h7.onActivityResumed((Activity) BinderC2521gp.m12037a(interfaceC2481fp));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void onActivitySaveInstanceState(InterfaceC2481fp interfaceC2481fp, InterfaceC1428pc interfaceC1428pc, long j) {
        zza();
        C1752h7 c1752h7 = this.f7346a.m9425v().f7963c;
        Bundle bundle = new Bundle();
        if (c1752h7 != null) {
            this.f7346a.m9425v().m9715B();
            c1752h7.onActivitySaveInstanceState((Activity) BinderC2521gp.m12037a(interfaceC2481fp), bundle);
        }
        try {
            interfaceC1428pc.mo7833a(bundle);
        } catch (RemoteException e) {
            this.f7346a.mo9324k().m9312w().m9366a("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void onActivityStarted(InterfaceC2481fp interfaceC2481fp, long j) {
        zza();
        C1752h7 c1752h7 = this.f7346a.m9425v().f7963c;
        if (c1752h7 != null) {
            this.f7346a.m9425v().m9715B();
            c1752h7.onActivityStarted((Activity) BinderC2521gp.m12037a(interfaceC2481fp));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void onActivityStopped(InterfaceC2481fp interfaceC2481fp, long j) {
        zza();
        C1752h7 c1752h7 = this.f7346a.m9425v().f7963c;
        if (c1752h7 != null) {
            this.f7346a.m9425v().m9715B();
            c1752h7.onActivityStopped((Activity) BinderC2521gp.m12037a(interfaceC2481fp));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void performAction(Bundle bundle, InterfaceC1428pc interfaceC1428pc, long j) {
        zza();
        interfaceC1428pc.mo7833a(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void registerOnMeasurementEventListener(InterfaceC1310hd interfaceC1310hd) {
        zza();
        InterfaceC1823n6 interfaceC1823n6 = this.f7347b.get(Integer.valueOf(interfaceC1310hd.zza()));
        if (interfaceC1823n6 == null) {
            interfaceC1823n6 = new C1659b(interfaceC1310hd);
            this.f7347b.put(Integer.valueOf(interfaceC1310hd.zza()), interfaceC1823n6);
        }
        this.f7346a.m9425v().m9734a(interfaceC1823n6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void resetAnalyticsData(long j) {
        zza();
        this.f7346a.m9425v().m9751c(j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void setConditionalUserProperty(Bundle bundle, long j) {
        zza();
        if (bundle == null) {
            this.f7346a.mo9324k().m9309t().m9365a("Conditional user property must not be null");
        } else {
            this.f7346a.m9425v().m9732a(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void setCurrentScreen(InterfaceC2481fp interfaceC2481fp, String str, String str2, long j) {
        zza();
        this.f7346a.m9400E().m9771a((Activity) BinderC2521gp.m12037a(interfaceC2481fp), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void setDataCollectionEnabled(boolean z) {
        zza();
        this.f7346a.m9425v().m9750b(z);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void setEventInterceptor(InterfaceC1310hd interfaceC1310hd) {
        zza();
        C1846p6 m9425v = this.f7346a.m9425v();
        C1658a c1658a = new C1658a(interfaceC1310hd);
        m9425v.mo9193a();
        m9425v.m9110x();
        m9425v.mo9320g().m9344a(new RunnableC1912v6(m9425v, c1658a));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void setInstanceIdProvider(InterfaceC1325id interfaceC1325id) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void setMeasurementEnabled(boolean z, long j) {
        zza();
        this.f7346a.m9425v().m9745a(z);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void setMinimumSessionDuration(long j) {
        zza();
        this.f7346a.m9425v().m9730a(j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void setSessionTimeoutDuration(long j) {
        zza();
        this.f7346a.m9425v().m9746b(j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void setUserId(String str, long j) {
        zza();
        this.f7346a.m9425v().m9743a(null, "_id", str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void setUserProperty(String str, String str2, InterfaceC2481fp interfaceC2481fp, boolean z, long j) {
        zza();
        this.f7346a.m9425v().m9743a(str, str2, BinderC2521gp.m12037a(interfaceC2481fp), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1413ob
    public void unregisterOnMeasurementEventListener(InterfaceC1310hd interfaceC1310hd) {
        zza();
        InterfaceC1823n6 remove = this.f7347b.remove(Integer.valueOf(interfaceC1310hd.zza()));
        if (remove == null) {
            remove = new C1659b(interfaceC1310hd);
        }
        this.f7346a.m9425v().m9748b(remove);
    }
}
