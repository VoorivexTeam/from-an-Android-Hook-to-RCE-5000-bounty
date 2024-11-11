package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.p;

/* loaded from: classes.dex */
public final class d {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        u.b(!p.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static d a(Context context) {
        w wVar = new w(context);
        String a = wVar.a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new d(a, wVar.a("google_api_key"), wVar.a("firebase_database_url"), wVar.a("ga_trackingId"), wVar.a("gcm_defaultSenderId"), wVar.a("google_storage_bucket"), wVar.a("project_id"));
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.a(this.b, dVar.b) && s.a(this.a, dVar.a) && s.a(this.c, dVar.c) && s.a(this.d, dVar.d) && s.a(this.e, dVar.e) && s.a(this.f, dVar.f) && s.a(this.g, dVar.g);
    }

    public int hashCode() {
        return s.a(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        s.a a = s.a(this);
        a.a("applicationId", this.b);
        a.a("apiKey", this.a);
        a.a("databaseUrl", this.c);
        a.a("gcmSenderId", this.e);
        a.a("storageBucket", this.f);
        a.a("projectId", this.g);
        return a.toString();
    }
}
