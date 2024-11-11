package com.android.installreferrer.commons;

import android.util.Log;

/* loaded from: classes.dex */
public final class InstallReferrerCommons {
    public static void logVerbose(String str, String str2) {
        Log.isLoggable(str, 2);
    }

    public static void logWarn(String str, String str2) {
        Log.isLoggable(str, 5);
    }
}
