package p000;

import android.content.SharedPreferences;

/* renamed from: rw */
/* loaded from: classes.dex */
public enum EnumC3181rw {
    ON,
    AUTO,
    OFF;

    private static EnumC3181rw parse(String str) {
        return str == null ? OFF : valueOf(str);
    }

    public static EnumC3181rw readPref(SharedPreferences sharedPreferences) {
        return parse(sharedPreferences.getString("preferences_front_light_mode", OFF.toString()));
    }
}
