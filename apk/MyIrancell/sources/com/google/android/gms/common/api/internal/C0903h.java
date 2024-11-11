package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.C1061w;
import com.google.android.gms.common.internal.C1062w0;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes.dex */
public final class C0903h {

    /* renamed from: d */
    private static final Object f5851d = new Object();

    /* renamed from: e */
    @GuardedBy("sLock")
    private static C0903h f5852e;

    /* renamed from: a */
    private final String f5853a;

    /* renamed from: b */
    private final Status f5854b;

    /* renamed from: c */
    private final boolean f5855c;

    C0903h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            this.f5855c = !(resources.getInteger(identifier) != 0);
        } else {
            this.f5855c = false;
        }
        String m7304a = C1062w0.m7304a(context);
        m7304a = m7304a == null ? new C1061w(context).m7303a("google_app_id") : m7304a;
        if (TextUtils.isEmpty(m7304a)) {
            this.f5854b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f5853a = null;
        } else {
            this.f5853a = m7304a;
            this.f5854b = Status.f5668f;
        }
    }

    /* renamed from: a */
    public static Status m6771a(Context context) {
        Status status;
        C1057u.m7287a(context, "Context must not be null.");
        synchronized (f5851d) {
            if (f5852e == null) {
                f5852e = new C0903h(context);
            }
            status = f5852e.f5854b;
        }
        return status;
    }

    /* renamed from: a */
    private static C0903h m6772a(String str) {
        C0903h c0903h;
        synchronized (f5851d) {
            if (f5852e == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
            c0903h = f5852e;
        }
        return c0903h;
    }

    /* renamed from: a */
    public static String m6773a() {
        return m6772a("getGoogleAppId").f5853a;
    }

    /* renamed from: b */
    public static boolean m6774b() {
        return m6772a("isMeasurementExplicitlyDisabled").f5855c;
    }
}
