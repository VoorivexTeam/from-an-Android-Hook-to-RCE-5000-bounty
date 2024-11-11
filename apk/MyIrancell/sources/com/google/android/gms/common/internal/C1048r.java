package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.internal.r */
/* loaded from: classes.dex */
public class C1048r {

    /* renamed from: b */
    private static final C1034k f6259b = new C1034k("LibraryVersion", "");

    /* renamed from: c */
    private static C1048r f6260c = new C1048r();

    /* renamed from: a */
    private ConcurrentHashMap<String, String> f6261a = new ConcurrentHashMap<>();

    protected C1048r() {
    }

    /* renamed from: a */
    public static C1048r m7201a() {
        return f6260c;
    }

    /* renamed from: a */
    public String m7202a(String str) {
        C1057u.m7288a(str, (Object) "Please provide a valid libraryName");
        if (this.f6261a.containsKey(str)) {
            return this.f6261a.get(str);
        }
        Properties properties = new Properties();
        String str2 = null;
        try {
            InputStream resourceAsStream = C1048r.class.getResourceAsStream(String.format("/%s.properties", str));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str2 = properties.getProperty("version", null);
                C1034k c1034k = f6259b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str2);
                c1034k.m7170b("LibraryVersion", sb.toString());
            } else {
                C1034k c1034k2 = f6259b;
                String valueOf = String.valueOf(str);
                c1034k2.m7171c("LibraryVersion", valueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "));
            }
        } catch (IOException e) {
            C1034k c1034k3 = f6259b;
            String valueOf2 = String.valueOf(str);
            c1034k3.m7168a("LibraryVersion", valueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf2) : new String("Failed to get app version for libraryName: "), e);
        }
        if (str2 == null) {
            f6259b.m7167a("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str2 = "UNKNOWN";
        }
        this.f6261a.put(str, str2);
        return str2;
    }
}
