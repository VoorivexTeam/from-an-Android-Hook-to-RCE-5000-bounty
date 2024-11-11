package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.C1005g;
import com.google.android.gms.common.util.C1103i;
import javax.annotation.concurrent.GuardedBy;
import p000.C2440ep;
import p000.C2573i0;

/* renamed from: com.google.android.gms.common.internal.f */
/* loaded from: classes.dex */
public final class C1024f {

    /* renamed from: a */
    @GuardedBy("sCache")
    private static final C2573i0<String, String> f6210a = new C2573i0<>();

    /* renamed from: a */
    public static String m7134a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C2440ep.m11628a(context).m11481b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    public static String m7135a(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? R.string.ok : R$string.common_google_play_services_enable_button : R$string.common_google_play_services_update_button : R$string.common_google_play_services_install_button);
    }

    /* renamed from: a */
    private static String m7136a(Context context, String str) {
        synchronized (f6210a) {
            String str2 = f6210a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources m6992d = C1005g.m6992d(context);
            if (m6992d == null) {
                return null;
            }
            int identifier = m6992d.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing resource: ".concat(valueOf);
                } else {
                    new String("Missing resource: ");
                }
                return null;
            }
            String string = m6992d.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                f6210a.put(str, string);
                return string;
            }
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                "Got empty resource: ".concat(valueOf2);
            } else {
                new String("Got empty resource: ");
            }
            return null;
        }
    }

    /* renamed from: a */
    private static String m7137a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m7136a = m7136a(context, str);
        if (m7136a == null) {
            m7136a = resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m7136a, str2);
    }

    /* renamed from: b */
    public static String m7138b(Context context) {
        return context.getResources().getString(R$string.common_google_play_services_notification_channel_name);
    }

    /* renamed from: b */
    public static String m7139b(Context context, int i) {
        Resources resources = context.getResources();
        String m7134a = m7134a(context);
        if (i == 1) {
            return resources.getString(R$string.common_google_play_services_install_text, m7134a);
        }
        if (i == 2) {
            return C1103i.m7388b(context) ? resources.getString(R$string.common_google_play_services_wear_update_text) : resources.getString(R$string.common_google_play_services_update_text, m7134a);
        }
        if (i == 3) {
            return resources.getString(R$string.common_google_play_services_enable_text, m7134a);
        }
        if (i == 5) {
            return m7137a(context, "common_google_play_services_invalid_account_text", m7134a);
        }
        if (i == 7) {
            return m7137a(context, "common_google_play_services_network_error_text", m7134a);
        }
        if (i == 9) {
            return resources.getString(R$string.common_google_play_services_unsupported_text, m7134a);
        }
        if (i == 20) {
            return m7137a(context, "common_google_play_services_restricted_profile_text", m7134a);
        }
        switch (i) {
            case 16:
                return m7137a(context, "common_google_play_services_api_unavailable_text", m7134a);
            case 17:
                return m7137a(context, "common_google_play_services_sign_in_failed_text", m7134a);
            case 18:
                return resources.getString(R$string.common_google_play_services_updating_text, m7134a);
            default:
                return resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue, m7134a);
        }
    }

    /* renamed from: c */
    public static String m7140c(Context context, int i) {
        return (i == 6 || i == 19) ? m7137a(context, "common_google_play_services_resolution_required_text", m7134a(context)) : m7139b(context, i);
    }

    /* renamed from: d */
    public static String m7141d(Context context, int i) {
        String m7136a = i == 6 ? m7136a(context, "common_google_play_services_resolution_required_title") : m7142e(context, i);
        return m7136a == null ? context.getResources().getString(R$string.common_google_play_services_notification_ticker) : m7136a;
    }

    /* renamed from: e */
    public static String m7142e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R$string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R$string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R$string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return m7136a(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m7136a(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                sb.toString();
                return null;
            case 17:
                return m7136a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m7136a(context, "common_google_play_services_restricted_profile_title");
        }
    }
}
