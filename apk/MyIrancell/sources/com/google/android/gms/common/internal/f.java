package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.base.R$string;
import defpackage.ep;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class f {

    @GuardedBy("sCache")
    private static final defpackage.i0<String, String> a = new defpackage.i0<>();

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return ep.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String a(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? R.string.ok : R$string.common_google_play_services_enable_button : R$string.common_google_play_services_update_button : R$string.common_google_play_services_install_button);
    }

    private static String a(Context context, String str) {
        synchronized (a) {
            String str2 = a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources d = com.google.android.gms.common.g.d(context);
            if (d == null) {
                return null;
            }
            int identifier = d.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing resource: ".concat(valueOf);
                } else {
                    new String("Missing resource: ");
                }
                return null;
            }
            String string = d.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                a.put(str, string);
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

    private static String a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a2 = a(context, str);
        if (a2 == null) {
            a2 = resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a2, str2);
    }

    public static String b(Context context) {
        return context.getResources().getString(R$string.common_google_play_services_notification_channel_name);
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(R$string.common_google_play_services_install_text, a2);
        }
        if (i == 2) {
            return com.google.android.gms.common.util.i.b(context) ? resources.getString(R$string.common_google_play_services_wear_update_text) : resources.getString(R$string.common_google_play_services_update_text, a2);
        }
        if (i == 3) {
            return resources.getString(R$string.common_google_play_services_enable_text, a2);
        }
        if (i == 5) {
            return a(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i == 7) {
            return a(context, "common_google_play_services_network_error_text", a2);
        }
        if (i == 9) {
            return resources.getString(R$string.common_google_play_services_unsupported_text, a2);
        }
        if (i == 20) {
            return a(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i) {
            case 16:
                return a(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return a(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(R$string.common_google_play_services_updating_text, a2);
            default:
                return resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue, a2);
        }
    }

    public static String c(Context context, int i) {
        return (i == 6 || i == 19) ? a(context, "common_google_play_services_resolution_required_text", a(context)) : b(context, i);
    }

    public static String d(Context context, int i) {
        String a2 = i == 6 ? a(context, "common_google_play_services_resolution_required_title") : e(context, i);
        return a2 == null ? context.getResources().getString(R$string.common_google_play_services_notification_ticker) : a2;
    }

    public static String e(Context context, int i) {
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
                return a(context, "common_google_play_services_invalid_account_title");
            case 7:
                return a(context, "common_google_play_services_network_error_title");
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
                return a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return a(context, "common_google_play_services_restricted_profile_title");
        }
    }
}
