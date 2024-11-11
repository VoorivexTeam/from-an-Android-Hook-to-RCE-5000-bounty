package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.C2047a;
import com.google.firebase.C2052c;
import com.google.firebase.analytics.connector.internal.C2049a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: mu */
/* loaded from: classes.dex */
public class C2956mu implements InterfaceC2910lu {

    /* renamed from: b */
    private static volatile InterfaceC2910lu f12181b;

    /* renamed from: a */
    private final AppMeasurement f12182a;

    private C2956mu(AppMeasurement appMeasurement) {
        C1057u.m7286a(appMeasurement);
        this.f12182a = appMeasurement;
        new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static InterfaceC2910lu m14179a(C2052c c2052c, Context context, InterfaceC2360cv interfaceC2360cv) {
        C1057u.m7286a(c2052c);
        C1057u.m7286a(context);
        C1057u.m7286a(interfaceC2360cv);
        C1057u.m7286a(context.getApplicationContext());
        if (f12181b == null) {
            synchronized (C2956mu.class) {
                if (f12181b == null) {
                    Bundle bundle = new Bundle(1);
                    if (c2052c.m10509f()) {
                        interfaceC2360cv.mo10582a(C2047a.class, ExecutorC3002nu.f12356a, C3059ou.f12529a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", c2052c.m10508e());
                    }
                    f12181b = new C2956mu(AppMeasurement.m9069a(context, bundle));
                }
            }
        }
        return f12181b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final /* synthetic */ void m14180a(C3542zu c3542zu) {
        boolean z = ((C2047a) c3542zu.m16955a()).f8777a;
        synchronized (C2956mu.class) {
            ((C2956mu) f12181b).f12182a.m9073a(z);
        }
    }

    @Override // p000.InterfaceC2910lu
    /* renamed from: a */
    public void mo13931a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C2049a.m10484a(str) && C2049a.m10485a(str2, bundle) && C2049a.m10487a(str, str2, bundle)) {
            this.f12182a.logEventInternal(str, str2, bundle);
        }
    }

    @Override // p000.InterfaceC2910lu
    /* renamed from: a */
    public void mo13932a(String str, String str2, Object obj) {
        if (C2049a.m10484a(str) && C2049a.m10486a(str, str2)) {
            this.f12182a.m9072a(str, str2, obj);
        }
    }
}
