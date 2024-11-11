package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.AbstractC0866h;
import com.google.android.gms.common.api.C0867i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0939q;
import com.google.android.gms.common.internal.C1057u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p000.C3366vo;

/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
/* loaded from: classes.dex */
public final class RunnableC0837e implements Runnable {

    /* renamed from: d */
    private static final C3366vo f5642d = new C3366vo("RevokeAccessOperation", new String[0]);

    /* renamed from: b */
    private final String f5643b;

    /* renamed from: c */
    private final C0939q f5644c;

    private RunnableC0837e(String str) {
        C1057u.m7296b(str);
        this.f5643b = str;
        this.f5644c = new C0939q(null);
    }

    /* renamed from: a */
    public static AbstractC0866h<Status> m6456a(String str) {
        if (str == null) {
            return C0867i.m6576a(new Status(4), null);
        }
        RunnableC0837e runnableC0837e = new RunnableC0837e(str);
        new Thread(runnableC0837e).start();
        return runnableC0837e.f5644c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f5670h;
        try {
            String valueOf = String.valueOf(this.f5643b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f5668f;
            } else {
                f5642d.m16042b("Unable to revoke access!", new Object[0]);
            }
            C3366vo c3366vo = f5642d;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            c3366vo.m16040a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            C3366vo c3366vo2 = f5642d;
            String valueOf2 = String.valueOf(e.toString());
            c3366vo2.m16042b(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            C3366vo c3366vo3 = f5642d;
            String valueOf3 = String.valueOf(e2.toString());
            c3366vo3.m16042b(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f5644c.m6585a((C0939q) status);
    }
}
