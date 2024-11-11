package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.stats.C1088a;
import com.google.android.gms.internal.measurement.InterfaceC1344k2;
import java.util.List;
import p000.C2397dp;
import p000.C2440ep;

/* renamed from: com.google.android.gms.measurement.internal.y4 */
/* loaded from: classes.dex */
public final class C1943y4 {

    /* renamed from: a */
    final C1774j5 f8185a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1943y4(C1774j5 c1774j5) {
        this.f8185a = c1774j5;
    }

    /* renamed from: b */
    private final boolean m9887b() {
        try {
            C2397dp m11628a = C2440ep.m11628a(this.f8185a.mo9325l());
            if (m11628a != null) {
                return m11628a.m11480b("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f8185a.mo9324k().m9304B().m9365a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f8185a.mo9324k().m9304B().m9366a("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle m9888a(String str, InterfaceC1344k2 interfaceC1344k2) {
        this.f8185a.mo9320g().mo9194c();
        if (interfaceC1344k2 == null) {
            this.f8185a.mo9324k().m9312w().m9365a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle mo7937a = interfaceC1344k2.mo7937a(bundle);
            if (mo7937a != null) {
                return mo7937a;
            }
            this.f8185a.mo9324k().m9309t().m9365a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f8185a.mo9324k().m9309t().m9366a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9889a() {
        this.f8185a.m9414i();
        m9890a(this.f8185a.mo9325l().getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9890a(String str) {
        if (str == null || str.isEmpty()) {
            this.f8185a.mo9324k().m9313x().m9365a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f8185a.mo9320g().mo9194c();
        if (!m9887b()) {
            this.f8185a.mo9324k().m9315z().m9365a("Install Referrer Reporter is not available");
            return;
        }
        ServiceConnectionC1932x4 serviceConnectionC1932x4 = new ServiceConnectionC1932x4(this, str);
        this.f8185a.mo9320g().mo9194c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f8185a.mo9325l().getPackageManager();
        if (packageManager == null) {
            this.f8185a.mo9324k().m9313x().m9365a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f8185a.mo9324k().m9315z().m9365a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !m9887b()) {
                this.f8185a.mo9324k().m9312w().m9365a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.f8185a.mo9324k().m9304B().m9366a("Install Referrer Service is", C1088a.m7348a().m7350a(this.f8185a.mo9325l(), new Intent(intent), serviceConnectionC1932x4, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.f8185a.mo9324k().m9309t().m9366a("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }
}
