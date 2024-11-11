package com.comviva.webaxn.utils;

import android.graphics.Paint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class q1 {
    public static String a(float f, Paint paint, List<String> list, String str) {
        list.add(str);
        if (paint.measureText(TextUtils.join("", list)) < f) {
            return null;
        }
        list.remove(list.size() - 1);
        String join = TextUtils.join("", list);
        list.clear();
        list.add(str);
        return join;
    }

    public static ArrayList<String> a(String str, float f, Paint paint) {
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        for (int i2 = 1; i2 <= str.length(); i2++) {
            if (paint.measureText(str.substring(i, i2)) >= f) {
                int i3 = i2 - 1;
                arrayList.add(str.substring(i, i3));
                i = i3;
            }
            if (i2 == str.length()) {
                arrayList.add(str.substring(i, i2));
            }
        }
        return arrayList;
    }
}