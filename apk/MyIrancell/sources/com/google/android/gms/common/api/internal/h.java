package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.api.Status;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* loaded from: classes.dex */
public final class h {
    private static final Object d = new Object();

    @GuardedBy("sLock")
    private static h e;
    private final String a;
    private final Status b;
    private final boolean c;

    h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            this.c = !(resources.getInteger(identifier) != 0);
        } else {
            this.c = false;
        }
        String a = com.google.android.gms.common.internal.w0.a(context);
        a = a == null ? new com.google.android.gms.common.internal.w(context).a("google_app_id") : a;
        if (TextUtils.isEmpty(a)) {
            this.b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
        } else {
            this.a = a;
            this.b = Status.f;
        }
    }

    public static Status a(Context context) {
        Status status;
        com.google.android.gms.common.internal.u.a(context, "Context must not be null.");
        synchronized (d) {
            if (e == null) {
                e = new h(context);
            }
            status = e.b;
        }
        return status;
    }

    private static h a(String str) {
        h hVar;
        synchronized (d) {
            if (e == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
            hVar = e;
        }
        return hVar;
    }

    public static String a() {
        return a("getGoogleAppId").a;
    }

    public static boolean b() {
        return a("isMeasurementExplicitlyDisabled").c;
    }
}
