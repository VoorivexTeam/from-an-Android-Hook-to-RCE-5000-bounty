package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.util.o */
/* loaded from: classes.dex */
public class C1109o {

    /* renamed from: a */
    private static String f6358a;

    /* renamed from: b */
    private static int f6359b;

    /* renamed from: a */
    private static BufferedReader m7406a(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m7407a() {
        if (f6358a == null) {
            if (f6359b == 0) {
                f6359b = Process.myPid();
            }
            f6358a = m7408a(f6359b);
        }
        return f6358a;
    }

    @Nullable
    /* renamed from: a */
    private static String m7408a(int i) {
        Throwable th;
        BufferedReader bufferedReader;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = m7406a(sb.toString());
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            str = bufferedReader.readLine().trim();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
            C1105k.m7392a(bufferedReader);
            throw th;
        }
        C1105k.m7392a(bufferedReader);
        return str;
    }
}
