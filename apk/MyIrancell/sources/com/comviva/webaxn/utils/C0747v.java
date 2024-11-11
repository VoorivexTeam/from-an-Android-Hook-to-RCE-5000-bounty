package com.comviva.webaxn.utils;

import android.graphics.Typeface;
import com.comviva.webaxn.p002ui.WebAxnActivity;
import java.util.HashMap;

/* renamed from: com.comviva.webaxn.utils.v */
/* loaded from: classes.dex */
public class C0747v {

    /* renamed from: a */
    private static HashMap<String, Typeface> f5190a = new HashMap<>();

    /* renamed from: a */
    public static Typeface m6081a(String str) {
        Typeface typeface = f5190a.get(str);
        if (typeface != null) {
            return typeface;
        }
        try {
            typeface = Typeface.createFromAsset(WebAxnActivity.f3409q, "typeface/" + str);
            f5190a.put(str, typeface);
        } catch (Exception unused) {
        }
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = f5190a.get("Poppins-Regular.ttf");
        if (typeface2 == null) {
            try {
                typeface2 = Typeface.createFromAsset(WebAxnActivity.f3409q, "typeface/Poppins-Regular.ttf");
                f5190a.put("Poppins-Regular.ttf", typeface2);
            } catch (Exception unused2) {
            }
        }
        return typeface2;
    }
}
