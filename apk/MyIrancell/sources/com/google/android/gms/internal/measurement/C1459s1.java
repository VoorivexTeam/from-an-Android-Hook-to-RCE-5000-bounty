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

/* renamed from: com.google.android.gms.internal.measurement.s1 */
/* loaded from: classes.dex */
public final class C1459s1 {
    /* renamed from: a */
    public static AbstractC1284g2<C1473t1> m8368a(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        String str3 = Build.HARDWARE;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && ((str3.equals("goldfish") || str3.equals("ranchu") || str3.equals("robolectric")) && (str2.contains("dev-keys") || str2.contains("test-keys")))) {
            z = true;
        }
        if (!z) {
            return AbstractC1284g2.m7847c();
        }
        if (C1268f1.m7815a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        AbstractC1284g2<File> m8370b = m8370b(context);
        return m8370b.mo7789a() ? AbstractC1284g2.m7846a(m8369a(m8370b.mo7790b())) : AbstractC1284g2.m7847c();
    }

    /* renamed from: a */
    private static C1473t1 m8369a(File file) {
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
                        C1473t1 c1473t1 = new C1473t1(hashMap);
                        bufferedReader.close();
                        return c1473t1;
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

    /* renamed from: b */
    private static AbstractC1284g2<File> m8370b(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? AbstractC1284g2.m7846a(file) : AbstractC1284g2.m7847c();
        } catch (RuntimeException unused) {
            return AbstractC1284g2.m7847c();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
