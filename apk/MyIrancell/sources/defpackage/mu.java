package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.a;
import com.google.firebase.c;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class mu implements lu {
    private static volatile lu b;
    private final AppMeasurement a;

    private mu(AppMeasurement appMeasurement) {
        u.a(appMeasurement);
        this.a = appMeasurement;
        new ConcurrentHashMap();
    }

    public static lu a(c cVar, Context context, cv cvVar) {
        u.a(cVar);
        u.a(context);
        u.a(cvVar);
        u.a(context.getApplicationContext());
        if (b == null) {
            synchronized (mu.class) {
                if (b == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.f()) {
                        cvVar.a(a.class, nu.a, ou.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.e());
                    }
                    b = new mu(AppMeasurement.a(context, bundle));
                }
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void a(zu zuVar) {
        boolean z = ((a) zuVar.a()).a;
        synchronized (mu.class) {
            ((mu) b).a.a(z);
        }
    }

    @Override // defpackage.lu
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.a.a(str) && com.google.firebase.analytics.connector.internal.a.a(str2, bundle) && com.google.firebase.analytics.connector.internal.a.a(str, str2, bundle)) {
            this.a.logEventInternal(str, str2, bundle);
        }
    }

    @Override // defpackage.lu
    public void a(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.a.a(str) && com.google.firebase.analytics.connector.internal.a.a(str, str2)) {
            this.a.a(str, str2, obj);
        }
    }
}
