package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p000.AbstractC2871ks;
import p000.C3271tq;
import p000.C3496yq;
import p000.ThreadFactoryC3536zo;

/* renamed from: com.google.firebase.iid.z0 */
/* loaded from: classes.dex */
public final class C2134z0 {

    /* renamed from: e */
    @GuardedBy("MessengerIpcClient.class")
    private static C2134z0 f8989e;

    /* renamed from: a */
    private final Context f8990a;

    /* renamed from: b */
    private final ScheduledExecutorService f8991b;

    /* renamed from: c */
    @GuardedBy("this")
    private ServiceConnectionC2081a1 f8992c = new ServiceConnectionC2081a1(this);

    /* renamed from: d */
    @GuardedBy("this")
    private int f8993d = 1;

    private C2134z0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8991b = scheduledExecutorService;
        this.f8990a = context.getApplicationContext();
    }

    /* renamed from: a */
    private final synchronized int m10731a() {
        int i;
        i = this.f8993d;
        this.f8993d = i + 1;
        return i;
    }

    /* renamed from: a */
    public static synchronized C2134z0 m10733a(Context context) {
        C2134z0 c2134z0;
        synchronized (C2134z0.class) {
            if (f8989e == null) {
                f8989e = new C2134z0(context, C3271tq.m15663a().mo15847a(1, new ThreadFactoryC3536zo("MessengerIpcClient"), C3496yq.f14277a));
            }
            c2134z0 = f8989e;
        }
        return c2134z0;
    }

    /* renamed from: a */
    private final synchronized <T> AbstractC2871ks<T> m10734a(AbstractC2101j<T> abstractC2101j) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(abstractC2101j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            sb.toString();
        }
        if (!this.f8992c.m10634a((AbstractC2101j<?>) abstractC2101j)) {
            ServiceConnectionC2081a1 serviceConnectionC2081a1 = new ServiceConnectionC2081a1(this);
            this.f8992c = serviceConnectionC2081a1;
            serviceConnectionC2081a1.m10634a((AbstractC2101j<?>) abstractC2101j);
        }
        return abstractC2101j.f8915b.m13924a();
    }

    /* renamed from: a */
    public final AbstractC2871ks<Void> m10736a(int i, Bundle bundle) {
        return m10734a(new C2095g(m10731a(), 2, bundle));
    }

    /* renamed from: b */
    public final AbstractC2871ks<Bundle> m10737b(int i, Bundle bundle) {
        return m10734a(new C2105l(m10731a(), 1, bundle));
    }
}
