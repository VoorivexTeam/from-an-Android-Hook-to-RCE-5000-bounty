package com.airbnb.lottie;

import defpackage.g1;

/* loaded from: classes.dex */
public class c {
    public static boolean a = false;
    private static boolean b = false;
    private static String[] c;
    private static long[] d;
    private static int e;
    private static int f;

    public static void a(String str) {
        if (b) {
            int i = e;
            if (i == 20) {
                f++;
                return;
            }
            c[i] = str;
            d[i] = System.nanoTime();
            g1.a(str);
            e++;
        }
    }

    public static float b(String str) {
        int i = f;
        if (i > 0) {
            f = i - 1;
            return 0.0f;
        }
        if (!b) {
            return 0.0f;
        }
        int i2 = e - 1;
        e = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(c[i2])) {
            g1.a();
            return ((float) (System.nanoTime() - d[e])) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + c[e] + ".");
    }
}
