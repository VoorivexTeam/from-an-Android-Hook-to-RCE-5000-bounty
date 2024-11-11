package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import defpackage.dp;
import defpackage.ep;
import java.util.List;

/* loaded from: classes.dex */
public final class y4 {
    final j5 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y4(j5 j5Var) {
        this.a = j5Var;
    }

    private final boolean b() {
        try {
            dp a = ep.a(this.a.l());
            if (a != null) {
                return a.b("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.k().B().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.k().B().a("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(String str, com.google.android.gms.internal.measurement.k2 k2Var) {
        this.a.g().c();
        if (k2Var == null) {
            this.a.k().w().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a = k2Var.a(bundle);
            if (a != null) {
                return a;
            }
            this.a.k().t().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.a.k().t().a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        this.a.i();
        a(this.a.l().getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            this.a.k().x().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.g().c();
        if (!b()) {
            this.a.k().z().a("Install Referrer Reporter is not available");
            return;
        }
        x4 x4Var = new x4(this, str);
        this.a.g().c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.l().getPackageManager();
        if (packageManager == null) {
            this.a.k().x().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.k().z().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !b()) {
                this.a.k().w().a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.a.k().B().a("Install Referrer Service is", com.google.android.gms.common.stats.a.a().a(this.a.l(), new Intent(intent), x4Var, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.a.k().t().a("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }
}
