package com.comviva.webaxn.utils;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

/* loaded from: classes.dex */
public class l0 {
    private static l0 a;

    public static l0 b() {
        if (a == null) {
            a = new l0();
        }
        return a;
    }

    public String a(Context context, int i, Intent intent) {
        return new StringBuilder().toString();
    }

    public void a() {
        if (a != null) {
            a = null;
        }
    }

    public void a(Context context, HashMap<String, String> hashMap) {
    }
}
