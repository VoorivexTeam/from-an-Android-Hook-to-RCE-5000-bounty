package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public enum rw {
    ON,
    AUTO,
    OFF;

    private static rw parse(String str) {
        return str == null ? OFF : valueOf(str);
    }

    public static rw readPref(SharedPreferences sharedPreferences) {
        return parse(sharedPreferences.getString("preferences_front_light_mode", OFF.toString()));
    }
}
