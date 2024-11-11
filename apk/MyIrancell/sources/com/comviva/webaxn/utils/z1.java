package com.comviva.webaxn.utils;

import android.content.Context;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public class z1 {
    public static String g;
    public static String h;
    private final int a;
    private long[] b;
    private int c;
    private String d;
    private String e;
    private String f;

    public z1(int i) {
        this.a = i;
        this.b = new long[i];
    }

    public z1(Context context, int i) {
        this.a = i;
        j1.a(context).r(i);
        this.b = new long[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.comviva.webaxn.utils.z1] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static z1 a(Context context, String str) {
        String[] split;
        ?? length;
        int i;
        String str2;
        z1 z1Var = null;
        try {
            split = str.split("\\.");
            length = split.length;
            i = 0;
        } catch (Exception e) {
            e = e;
        }
        try {
            if (length == 1) {
                z1 z1Var2 = new z1(context, j1.a(context).S());
                str2 = split[0];
                length = z1Var2;
            } else {
                z1 z1Var3 = new z1(context, Integer.parseInt(split[0]));
                int b = z1Var3.b();
                while (i < b) {
                    int i2 = i + 1;
                    z1Var3.a(i, Long.parseLong(split[i2]));
                    i = i2;
                }
                int i3 = i + 1;
                z1Var3.b(Integer.parseInt(split[i3]));
                int i4 = i3 + 1;
                z1Var3.b(split[i4]);
                int i5 = i4 + 1;
                z1Var3.a(split[i5]);
                if (split.length <= i5) {
                    return z1Var3;
                }
                str2 = split[i5 + 1];
                length = z1Var3;
            }
            length.c(str2);
            return length;
        } catch (Exception e2) {
            e = e2;
            z1Var = length;
            System.out.println("XCookie.parseCookie: Exception - " + e + " - " + e.getMessage());
            return z1Var;
        }
    }

    public static void a(Context context) {
        SecureRandom secureRandom = new SecureRandom();
        int S = j1.a(context).S();
        long[] jArr = new long[S];
        for (int i = 0; i < S; i++) {
            jArr[i] = secureRandom.nextLong();
            jArr[i] = 17592186044415L & jArr[i];
        }
        g = g1.a(jArr);
        long[] jArr2 = {secureRandom.nextLong()};
        jArr2[0] = jArr2[0] & 17592186044415L;
        h = g1.a(jArr2);
    }

    public static void d(String str) {
        h = str;
    }

    public static void e(String str) {
        g = str;
    }

    public static String f() {
        return h;
    }

    public static String g() {
        return g;
    }

    public int a() {
        return this.c;
    }

    public long a(int i) {
        return this.b[i];
    }

    public void a(int i, long j) {
        this.b[i] = j;
    }

    public void a(String str) {
        this.e = str;
    }

    public int b() {
        return this.a;
    }

    public void b(int i) {
        this.c = i;
    }

    public void b(String str) {
        this.d = str;
    }

    public String c() {
        return this.e;
    }

    public void c(String str) {
        this.f = str;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.f;
    }

    public String toString() {
        String str = Integer.toString(this.a) + ".";
        for (int i = 0; i < this.b.length; i++) {
            str = str + Long.toString(this.b[i]) + ".";
        }
        return (str + Integer.toString(this.c) + ".") + this.d + "." + this.e + "." + this.f;
    }
}
