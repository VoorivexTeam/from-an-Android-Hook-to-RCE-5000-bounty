package com.comviva.webaxn.utils;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.comviva.webaxn.utils.g1 */
/* loaded from: classes.dex */
public class C0704g1 {

    /* renamed from: a */
    private static final long f4811a = m5474a(16);

    /* renamed from: a */
    private static long m5474a(int i) {
        long j = 1;
        for (int i2 = 2; i2 <= i; i2++) {
            j *= i2;
        }
        return j;
    }

    /* renamed from: a */
    private static String m5475a(long j) {
        long j2 = f4811a;
        List<String> m5477a = m5477a();
        String str = "";
        for (int i = 0; i < 16; i++) {
            j2 /= 16 - i;
            int i2 = (int) (j / j2);
            str = str + m5477a.get(i2);
            m5477a.remove(i2);
            j %= j2;
        }
        return str;
    }

    /* renamed from: a */
    public static String m5476a(long[] jArr) {
        String str = "";
        for (long j : jArr) {
            str = str + m5475a(j);
        }
        return str;
    }

    /* renamed from: a */
    private static List<String> m5477a() {
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
