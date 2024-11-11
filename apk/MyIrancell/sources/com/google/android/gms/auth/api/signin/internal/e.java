package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import defpackage.vo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class e implements Runnable {
    private static final vo d = new vo("RevokeAccessOperation", new String[0]);
    private final String b;
    private final com.google.android.gms.common.api.internal.q c;

    private e(String str) {
        com.google.android.gms.common.internal.u.b(str);
        this.b = str;
        this.c = new com.google.android.gms.common.api.internal.q(null);
    }

    public static com.google.android.gms.common.api.h<Status> a(String str) {
        if (str == null) {
            return com.google.android.gms.common.api.i.a(new Status(4), null);
        }
        e eVar = new e(str);
        new Thread(eVar).start();
        return eVar.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.h;
        try {
            String valueOf = String.valueOf(this.b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f;
            } else {
                d.b("Unable to revoke access!", new Object[0]);
            }
            vo voVar = d;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            voVar.a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            vo voVar2 = d;
            String valueOf2 = String.valueOf(e.toString());
            voVar2.b(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            vo voVar3 = d;
            String valueOf3 = String.valueOf(e2.toString());
            voVar3.b(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.c.a((com.google.android.gms.common.api.internal.q) status);
    }
}
