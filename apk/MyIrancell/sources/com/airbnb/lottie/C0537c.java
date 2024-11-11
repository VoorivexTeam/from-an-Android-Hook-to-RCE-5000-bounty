package com.airbnb.lottie;

import p000.C2494g1;

/* renamed from: com.airbnb.lottie.c */
/* loaded from: classes.dex */
public class C0537c {

    /* renamed from: a */
    public static boolean f3061a = false;

    /* renamed from: b */
    private static boolean f3062b = false;

    /* renamed from: c */
    private static String[] f3063c;

    /* renamed from: d */
    private static long[] f3064d;

    /* renamed from: e */
    private static int f3065e;

    /* renamed from: f */
    private static int f3066f;

    /* renamed from: a */
    public static void m3721a(String str) {
        if (f3062b) {
            int i = f3065e;
            if (i == 20) {
                f3066f++;
                return;
            }
            f3063c[i] = str;
            f3064d[i] = System.nanoTime();
            C2494g1.m11864a(str);
            f3065e++;
        }
    }

    /* renamed from: b */
    public static float m3722b(String str) {
        int i = f3066f;
        if (i > 0) {
            f3066f = i - 1;
            return 0.0f;
        }
        if (!f3062b) {
            return 0.0f;
        }
        int i2 = f3065e - 1;
        f3065e = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f3063c[i2])) {
            C2494g1.m11863a();
            return ((float) (System.nanoTime() - f3064d[f3065e])) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f3063c[f3065e] + ".");
    }
}
