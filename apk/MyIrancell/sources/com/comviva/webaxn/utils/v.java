package com.comviva.webaxn.utils;

import android.graphics.Typeface;
import com.comviva.webaxn.ui.WebAxnActivity;
import java.util.HashMap;

/* loaded from: classes.dex */
public class v {
    private static HashMap<String, Typeface> a = new HashMap<>();

    public static Typeface a(String str) {
        Typeface typeface = a.get(str);
        if (typeface != null) {
            return typeface;
        }
        try {
            typeface = Typeface.createFromAsset(WebAxnActivity.q, "typeface/" + str);
            a.put(str, typeface);
        } catch (Exception unused) {
        }
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = a.get("Poppins-Regular.ttf");
        if (typeface2 == null) {
            try {
                typeface2 = Typeface.createFromAsset(WebAxnActivity.q, "typeface/Poppins-Regular.ttf");
                a.put("Poppins-Regular.ttf", typeface2);
            } catch (Exception unused2) {
            }
        }
        return typeface2;
    }
}
