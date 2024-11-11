package com.comviva.webaxn.utils;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public class v0 {
    private static v0 b;
    private HashMap<String, String> a;

    private v0(Context context) {
    }

    public static v0 a(Context context) {
        if (b == null) {
            b = new v0(context);
        }
        return b;
    }

    public void a() {
        if (b != null) {
            b = null;
        }
        HashMap<String, String> hashMap = this.a;
        if (hashMap != null) {
            hashMap.clear();
            this.a = null;
        }
    }
}
