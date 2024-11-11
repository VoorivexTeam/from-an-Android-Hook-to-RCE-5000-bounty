package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Map;
import p000.C0500c0;

/* loaded from: classes.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C2157s();

    /* renamed from: b */
    Bundle f8998b;

    /* renamed from: c */
    private Map<String, String> f8999c;

    /* renamed from: d */
    private C2138a f9000d;

    /* renamed from: com.google.firebase.messaging.RemoteMessage$a */
    /* loaded from: classes.dex */
    public static class C2138a {

        /* renamed from: a */
        private final String f9001a;

        /* renamed from: b */
        private final String f9002b;

        /* renamed from: c */
        private final String f9003c;

        /* renamed from: d */
        private final Uri f9004d;

        private C2138a(C2154p c2154p) {
            this.f9001a = c2154p.m10784a("gcm.n.title");
            c2154p.m10792e("gcm.n.title");
            m10751a(c2154p, "gcm.n.title");
            this.f9002b = c2154p.m10784a("gcm.n.body");
            c2154p.m10792e("gcm.n.body");
            m10751a(c2154p, "gcm.n.body");
            c2154p.m10784a("gcm.n.icon");
            c2154p.m10785b();
            c2154p.m10784a("gcm.n.tag");
            c2154p.m10784a("gcm.n.color");
            this.f9003c = c2154p.m10784a("gcm.n.click_action");
            c2154p.m10784a("gcm.n.android_channel_id");
            this.f9004d = c2154p.m10782a();
            c2154p.m10784a("gcm.n.image");
            c2154p.m10784a("gcm.n.ticker");
            c2154p.m10787c("gcm.n.notification_priority");
            c2154p.m10787c("gcm.n.visibility");
            c2154p.m10787c("gcm.n.notification_count");
            c2154p.m10786b("gcm.n.sticky");
            c2154p.m10786b("gcm.n.local_only");
            c2154p.m10786b("gcm.n.default_sound");
            c2154p.m10786b("gcm.n.default_vibrate_timings");
            c2154p.m10786b("gcm.n.default_light_settings");
            c2154p.m10789d("gcm.n.event_time");
            c2154p.m10790d();
            c2154p.m10788c();
        }

        /* renamed from: a */
        private static String[] m10751a(C2154p c2154p, String str) {
            Object[] m10794f = c2154p.m10794f(str);
            if (m10794f == null) {
                return null;
            }
            String[] strArr = new String[m10794f.length];
            for (int i = 0; i < m10794f.length; i++) {
                strArr[i] = String.valueOf(m10794f[i]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String m10752a() {
            return this.f9002b;
        }

        /* renamed from: b */
        public String m10753b() {
            return this.f9003c;
        }

        /* renamed from: c */
        public String m10754c() {
            return this.f9001a;
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f8998b = bundle;
    }

    /* renamed from: j */
    public final Map<String, String> m10748j() {
        if (this.f8999c == null) {
            Bundle bundle = this.f8998b;
            C0500c0 c0500c0 = new C0500c0();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c0500c0.put(str, str2);
                    }
                }
            }
            this.f8999c = c0500c0;
        }
        return this.f8999c;
    }

    /* renamed from: k */
    public final String m10749k() {
        return this.f8998b.getString("from");
    }

    /* renamed from: l */
    public final C2138a m10750l() {
        if (this.f9000d == null && C2154p.m10777a(this.f8998b)) {
            this.f9000d = new C2138a(new C2154p(this.f8998b));
        }
        return this.f9000d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7257a(parcel, 2, this.f8998b, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
