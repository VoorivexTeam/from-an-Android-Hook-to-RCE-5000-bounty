package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class r {
    private static final k b = new k("LibraryVersion", "");
    private static r c = new r();
    private ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();

    protected r() {
    }

    public static r a() {
        return c;
    }

    public String a(String str) {
        u.a(str, (Object) "Please provide a valid libraryName");
        if (this.a.containsKey(str)) {
            return this.a.get(str);
        }
        Properties properties = new Properties();
        String str2 = null;
        try {
            InputStream resourceAsStream = r.class.getResourceAsStream(String.format("/%s.properties", str));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str2 = properties.getProperty("version", null);
                k kVar = b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str2);
                kVar.b("LibraryVersion", sb.toString());
            } else {
                k kVar2 = b;
                String valueOf = String.valueOf(str);
                kVar2.c("LibraryVersion", valueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "));
            }
        } catch (IOException e) {
            k kVar3 = b;
            String valueOf2 = String.valueOf(str);
            kVar3.a("LibraryVersion", valueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf2) : new String("Failed to get app version for libraryName: "), e);
        }
        if (str2 == null) {
            b.a("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str2 = "UNKNOWN";
        }
        this.a.put(str, str2);
        return str2;
    }
}
