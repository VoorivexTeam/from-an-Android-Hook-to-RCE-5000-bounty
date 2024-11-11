package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C1088a;
import com.google.android.gms.internal.measurement.C1523w9;
import com.google.android.gms.internal.measurement.InterfaceC1344k2;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
/* loaded from: classes.dex */
final class RunnableC1666a5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ InterfaceC1344k2 f7362b;

    /* renamed from: c */
    private final /* synthetic */ ServiceConnection f7363c;

    /* renamed from: d */
    private final /* synthetic */ ServiceConnectionC1932x4 f7364d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1666a5(ServiceConnectionC1932x4 serviceConnectionC1932x4, InterfaceC1344k2 interfaceC1344k2, ServiceConnection serviceConnection) {
        this.f7364d = serviceConnectionC1932x4;
        this.f7362b = interfaceC1344k2;
        this.f7363c = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C1749h4 m9309t;
        String str2;
        ServiceConnectionC1932x4 serviceConnectionC1932x4 = this.f7364d;
        C1943y4 c1943y4 = serviceConnectionC1932x4.f8167b;
        str = serviceConnectionC1932x4.f8166a;
        InterfaceC1344k2 interfaceC1344k2 = this.f7362b;
        ServiceConnection serviceConnection = this.f7363c;
        Bundle m9888a = c1943y4.m9888a(str, interfaceC1344k2);
        c1943y4.f8185a.mo9320g().mo9194c();
        if (m9888a != null) {
            long j = m9888a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                m9309t = c1943y4.f8185a.mo9324k().m9309t();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = m9888a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    m9309t = c1943y4.f8185a.mo9324k().m9309t();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    c1943y4.f8185a.mo9324k().m9304B().m9366a("InstallReferrer API result", string);
                    C1959z9 m9426w = c1943y4.f8185a.m9426w();
                    String valueOf = String.valueOf(string);
                    Bundle m9933a = m9426w.m9933a(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (m9933a == null) {
                        m9309t = c1943y4.f8185a.mo9324k().m9309t();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = m9933a.getString("medium");
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j2 = m9888a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                m9309t = c1943y4.f8185a.mo9324k().m9309t();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                m9933a.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == c1943y4.f8185a.m9420q().f8029k.m9792a()) {
                            c1943y4.f8185a.mo9317d();
                            m9309t = c1943y4.f8185a.mo9324k().m9304B();
                            str2 = "Install Referrer campaign has already been logged";
                        } else if (!C1523w9.m8639a() || !c1943y4.f8185a.m9419p().m9480a(C1828o.f7843W0) || c1943y4.f8185a.m9411c()) {
                            c1943y4.f8185a.m9420q().f8029k.m9793a(j);
                            c1943y4.f8185a.mo9317d();
                            c1943y4.f8185a.mo9324k().m9304B().m9366a("Logging Install Referrer campaign from sdk with ", "referrer API");
                            m9933a.putString("_cis", "referrer API");
                            c1943y4.f8185a.m9425v().m9738a("auto", "_cmp", m9933a);
                        }
                    }
                }
            }
            m9309t.m9365a(str2);
        }
        if (serviceConnection != null) {
            C1088a.m7348a().m7349a(c1943y4.f8185a.mo9325l(), serviceConnection);
        }
    }
}
