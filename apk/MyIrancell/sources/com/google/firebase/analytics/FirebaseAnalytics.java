package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.internal.measurement.C1370ld;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.C1774j5;
import com.google.android.gms.measurement.internal.C1791ka;
import com.google.android.gms.measurement.internal.InterfaceC1776j7;
import com.google.firebase.iid.FirebaseInstanceId;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: d */
    private static volatile FirebaseAnalytics f8778d;

    /* renamed from: a */
    private final C1774j5 f8779a;

    /* renamed from: b */
    private final C1370ld f8780b;

    /* renamed from: c */
    private final boolean f8781c;

    private FirebaseAnalytics(C1370ld c1370ld) {
        C1057u.m7286a(c1370ld);
        this.f8779a = null;
        this.f8780b = c1370ld;
        this.f8781c = true;
    }

    private FirebaseAnalytics(C1774j5 c1774j5) {
        C1057u.m7286a(c1774j5);
        this.f8779a = c1774j5;
        this.f8780b = null;
        this.f8781c = false;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f8778d == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f8778d == null) {
                    f8778d = C1370ld.m7987b(context) ? new FirebaseAnalytics(C1370ld.m7973a(context)) : new FirebaseAnalytics(C1774j5.m9389a(context, (zzv) null));
                }
            }
        }
        return f8778d;
    }

    @Keep
    public static InterfaceC1776j7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C1370ld m7974a;
        if (C1370ld.m7987b(context) && (m7974a = C1370ld.m7974a(context, (String) null, (String) null, (String) null, bundle)) != null) {
            return new C2048a(m7974a);
        }
        return null;
    }

    /* renamed from: a */
    public final void m10481a(String str) {
        if (this.f8781c) {
            this.f8780b.m8005a(str);
        } else {
            this.f8779a.m9425v().m9742a("app", "_id", (Object) str, true);
        }
    }

    /* renamed from: a */
    public final void m10482a(String str, Bundle bundle) {
        if (this.f8781c) {
            this.f8780b.m8006a(str, bundle);
        } else {
            this.f8779a.m9425v().m9739a("app", str, bundle, true);
        }
    }

    /* renamed from: a */
    public final void m10483a(String str, String str2) {
        if (this.f8781c) {
            this.f8780b.m8007a(str, str2);
        } else {
            this.f8779a.m9425v().m9742a("app", str, (Object) str2, false);
        }
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.m10599i().m10604a();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.f8781c) {
            this.f8780b.m8003a(activity, str, str2);
        } else if (C1791ka.m9464a()) {
            this.f8779a.m9400E().m9771a(activity, str, str2);
        } else {
            this.f8779a.mo9324k().m9312w().m9365a("setCurrentScreen must be called from the main thread");
        }
    }
}
