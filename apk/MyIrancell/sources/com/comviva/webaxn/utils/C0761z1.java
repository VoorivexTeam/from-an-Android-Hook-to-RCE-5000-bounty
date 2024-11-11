package com.comviva.webaxn.utils;

import android.content.Context;
import java.security.SecureRandom;

/* renamed from: com.comviva.webaxn.utils.z1 */
/* loaded from: classes.dex */
public class C0761z1 {

    /* renamed from: g */
    public static String f5342g;

    /* renamed from: h */
    public static String f5343h;

    /* renamed from: a */
    private final int f5344a;

    /* renamed from: b */
    private long[] f5345b;

    /* renamed from: c */
    private int f5346c;

    /* renamed from: d */
    private String f5347d;

    /* renamed from: e */
    private String f5348e;

    /* renamed from: f */
    private String f5349f;

    public C0761z1(int i) {
        this.f5344a = i;
        this.f5345b = new long[i];
    }

    public C0761z1(Context context, int i) {
        this.f5344a = i;
        C0713j1.m5563a(context).m5719r(i);
        this.f5345b = new long[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.comviva.webaxn.utils.z1] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: a */
    public static C0761z1 m6232a(Context context, String str) {
        String[] split;
        ?? length;
        int i;
        String str2;
        C0761z1 c0761z1 = null;
        try {
            split = str.split("\\.");
            length = split.length;
            i = 0;
        } catch (Exception e) {
            e = e;
        }
        try {
            if (length == 1) {
                C0761z1 c0761z12 = new C0761z1(context, C0713j1.m5563a(context).m5614S());
                str2 = split[0];
                length = c0761z12;
            } else {
                C0761z1 c0761z13 = new C0761z1(context, Integer.parseInt(split[0]));
                int m6242b = c0761z13.m6242b();
                while (i < m6242b) {
                    int i2 = i + 1;
                    c0761z13.m6240a(i, Long.parseLong(split[i2]));
                    i = i2;
                }
                int i3 = i + 1;
                c0761z13.m6243b(Integer.parseInt(split[i3]));
                int i4 = i3 + 1;
                c0761z13.m6244b(split[i4]);
                int i5 = i4 + 1;
                c0761z13.m6241a(split[i5]);
                if (split.length <= i5) {
                    return c0761z13;
                }
                str2 = split[i5 + 1];
                length = c0761z13;
            }
            length.m6246c(str2);
            return length;
        } catch (Exception e2) {
            e = e2;
            c0761z1 = length;
            System.out.println("XCookie.parseCookie: Exception - " + e + " - " + e.getMessage());
            return c0761z1;
        }
    }

    /* renamed from: a */
    public static void m6233a(Context context) {
        SecureRandom secureRandom = new SecureRandom();
        int m5614S = C0713j1.m5563a(context).m5614S();
        long[] jArr = new long[m5614S];
        for (int i = 0; i < m5614S; i++) {
            jArr[i] = secureRandom.nextLong();
            jArr[i] = 17592186044415L & jArr[i];
        }
        f5342g = C0704g1.m5476a(jArr);
        long[] jArr2 = {secureRandom.nextLong()};
        jArr2[0] = jArr2[0] & 17592186044415L;
        f5343h = C0704g1.m5476a(jArr2);
    }

    /* renamed from: d */
    public static void m6234d(String str) {
        f5343h = str;
    }

    /* renamed from: e */
    public static void m6235e(String str) {
        f5342g = str;
    }

    /* renamed from: f */
    public static String m6236f() {
        return f5343h;
    }

    /* renamed from: g */
    public static String m6237g() {
        return f5342g;
    }

    /* renamed from: a */
    public int m6238a() {
        return this.f5346c;
    }

    /* renamed from: a */
    public long m6239a(int i) {
        return this.f5345b[i];
    }

    /* renamed from: a */
    public void m6240a(int i, long j) {
        this.f5345b[i] = j;
    }

    /* renamed from: a */
    public void m6241a(String str) {
        this.f5348e = str;
    }

    /* renamed from: b */
    public int m6242b() {
        return this.f5344a;
    }

    /* renamed from: b */
    public void m6243b(int i) {
        this.f5346c = i;
    }

    /* renamed from: b */
    public void m6244b(String str) {
        this.f5347d = str;
    }

    /* renamed from: c */
    public String m6245c() {
        return this.f5348e;
    }

    /* renamed from: c */
    public void m6246c(String str) {
        this.f5349f = str;
    }

    /* renamed from: d */
    public String m6247d() {
        return this.f5347d;
    }

    /* renamed from: e */
    public String m6248e() {
        return this.f5349f;
    }

    public String toString() {
        String str = Integer.toString(this.f5344a) + ".";
        for (int i = 0; i < this.f5345b.length; i++) {
            str = str + Long.toString(this.f5345b[i]) + ".";
        }
        return (str + Integer.toString(this.f5346c) + ".") + this.f5347d + "." + this.f5348e + "." + this.f5349f;
    }
}
