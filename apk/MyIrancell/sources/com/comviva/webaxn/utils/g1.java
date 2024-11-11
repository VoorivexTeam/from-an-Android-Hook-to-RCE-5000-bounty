package com.comviva.webaxn.utils;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g1 {
    private static final long a = a(16);

    private static long a(int i) {
        long j = 1;
        for (int i2 = 2; i2 <= i; i2++) {
            j *= i2;
        }
        return j;
    }

    private static String a(long j) {
        long j2 = a;
        List<String> a2 = a();
        String str = "";
        for (int i = 0; i < 16; i++) {
            j2 /= 16 - i;
            int i2 = (int) (j / j2);
            str = str + a2.get(i2);
            a2.remove(i2);
            j %= j2;
        }
        return str;
    }

    public static String a(long[] jArr) {
        String str = "";
        for (long j : jArr) {
            str = str + a(j);
        }
        return str;
    }

    private static List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Character.toString((char) (i + 48)));
        }
        for (int i2 = 10; i2 < 16; i2++) {
            arrayList.add(Character.toString((char) ((i2 + 97) - 10)));
        }
        return arrayList;
    }
}
