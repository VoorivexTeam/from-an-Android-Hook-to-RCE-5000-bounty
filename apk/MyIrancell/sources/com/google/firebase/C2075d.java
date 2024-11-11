package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.C1061w;
import com.google.android.gms.common.util.C1110p;

/* renamed from: com.google.firebase.d */
/* loaded from: classes.dex */
public final class C2075d {

    /* renamed from: a */
    private final String f8854a;

    /* renamed from: b */
    private final String f8855b;

    /* renamed from: c */
    private final String f8856c;

    /* renamed from: d */
    private final String f8857d;

    /* renamed from: e */
    private final String f8858e;

    /* renamed from: f */
    private final String f8859f;

    /* renamed from: g */
    private final String f8860g;

    private C2075d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C1057u.m7298b(!C1110p.m7409a(str), "ApplicationId must be set.");
        this.f8855b = str;
        this.f8854a = str2;
        this.f8856c = str3;
        this.f8857d = str4;
        this.f8858e = str5;
        this.f8859f = str6;
        this.f8860g = str7;
    }

    /* renamed from: a */
    public static C2075d m10588a(Context context) {
        C1061w c1061w = new C1061w(context);
        String m7303a = c1061w.m7303a("google_app_id");
        if (TextUtils.isEmpty(m7303a)) {
            return null;
        }
        return new C2075d(m7303a, c1061w.m7303a("google_api_key"), c1061w.m7303a("firebase_database_url"), c1061w.m7303a("ga_trackingId"), c1061w.m7303a("gcm_defaultSenderId"), c1061w.m7303a("google_storage_bucket"), c1061w.m7303a("project_id"));
    }

    /* renamed from: a */
    public String m10589a() {
        return this.f8855b;
    }

    /* renamed from: b */
    public String m10590b() {
        return this.f8858e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2075d)) {
            return false;
        }
        C2075d c2075d = (C2075d) obj;
        return C1050s.m7205a(this.f8855b, c2075d.f8855b) && C1050s.m7205a(this.f8854a, c2075d.f8854a) && C1050s.m7205a(this.f8856c, c2075d.f8856c) && C1050s.m7205a(this.f8857d, c2075d.f8857d) && C1050s.m7205a(this.f8858e, c2075d.f8858e) && C1050s.m7205a(this.f8859f, c2075d.f8859f) && C1050s.m7205a(this.f8860g, c2075d.f8860g);
    }

    public int hashCode() {
        return C1050s.m7203a(this.f8855b, this.f8854a, this.f8856c, this.f8857d, this.f8858e, this.f8859f, this.f8860g);
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("applicationId", this.f8855b);
        m7204a.m7206a("apiKey", this.f8854a);
        m7204a.m7206a("databaseUrl", this.f8856c);
        m7204a.m7206a("gcmSenderId", this.f8858e);
        m7204a.m7206a("storageBucket", this.f8859f);
        m7204a.m7206a("projectId", this.f8860g);
        return m7204a.toString();
    }
}
