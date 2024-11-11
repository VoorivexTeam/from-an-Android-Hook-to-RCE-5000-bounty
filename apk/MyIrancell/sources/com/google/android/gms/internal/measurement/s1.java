package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s1 {
    public static g2<t1> a(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        String str3 = Build.HARDWARE;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && ((str3.equals("goldfish") || str3.equals("ranchu") || str3.equals("robolectric")) && (str2.contains("dev-keys") || str2.contains("test-keys")))) {
            z = true;
        }
        if (!z) {
            return g2.c();
        }
        if (f1.a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        g2<File> b = b(context);
        return b.a() ? g2.a(a(b.b())) : g2.c();
    }

    private static t1 a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        String valueOf = String.valueOf(file);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                        sb.append("Parsed ");
                        sb.append(valueOf);
                        sb.toString();
                        t1 t1Var = new t1(hashMap);
                        bufferedReader.close();
                        return t1Var;
                    }
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        String valueOf2 = String.valueOf(readLine);
                        if (valueOf2.length() != 0) {
                            "Invalid: ".concat(valueOf2);
                        } else {
                            new String("Invalid: ");
                        }
                    } else {
                        String str = split[0];
                        String decode = Uri.decode(split[1]);
                        String decode2 = Uri.decode(split[2]);
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new HashMap());
                        }
                        ((Map) hashMap.get(str)).put(decode, decode2);
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static g2<File> b(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? g2.a(file) : g2.c();
        } catch (RuntimeException unused) {
            return g2.c();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
