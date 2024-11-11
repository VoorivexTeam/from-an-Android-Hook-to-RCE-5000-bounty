package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.C0237b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
import p000.C2442er;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.u0 */
/* loaded from: classes.dex */
public final class C2124u0 {
    /* renamed from: a */
    private final C2128w0 m10693a(Context context, String str, C2128w0 c2128w0, boolean z) {
        long j;
        Log.isLoggable("FirebaseInstanceId", 3);
        Properties properties = new Properties();
        properties.setProperty("id", c2128w0.m10719a());
        j = c2128w0.f8977b;
        properties.setProperty("cre", String.valueOf(j));
        File m10704e = m10704e(context, str);
        try {
            m10704e.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(m10704e, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.lock();
                    if (z && channel.size() > 0) {
                        try {
                            channel.position(0L);
                            C2128w0 m10696a = m10696a(channel);
                            if (channel != null) {
                                channel.close();
                            }
                            randomAccessFile.close();
                            return m10696a;
                        } catch (C2130x0 | IOException e) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
                                sb.append("Tried reading ID before writing new one, but failed with: ");
                                sb.append(valueOf);
                                sb.toString();
                            }
                        }
                    }
                    channel.truncate(0L);
                    properties.store(Channels.newOutputStream(channel), (String) null);
                    if (channel != null) {
                        channel.close();
                    }
                    randomAccessFile.close();
                    return c2128w0;
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            sb2.append("Failed to write key: ");
            sb2.append(valueOf2);
            sb2.toString();
            return null;
        }
    }

    /* renamed from: a */
    private static C2128w0 m10694a(SharedPreferences sharedPreferences, String str) {
        long m10700b = m10700b(sharedPreferences, str);
        String string = sharedPreferences.getString(C2125v.m10707a(str, "id"), null);
        if (string == null) {
            String string2 = sharedPreferences.getString(C2125v.m10707a(str, "|P|"), null);
            if (string2 == null) {
                return null;
            }
            string = C2103k.m10656a(m10697a(string2));
        }
        return new C2128w0(string, m10700b);
    }

    /* renamed from: a */
    private final C2128w0 m10695a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                channel.lock(0L, Long.MAX_VALUE, true);
                C2128w0 m10696a = m10696a(channel);
                if (channel != null) {
                    channel.close();
                }
                fileInputStream.close();
                return m10696a;
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C2442er.m11632a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static C2128w0 m10696a(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        try {
            long parseLong = Long.parseLong(properties.getProperty("cre"));
            String property = properties.getProperty("id");
            if (property == null) {
                String property2 = properties.getProperty("pub");
                if (property2 == null) {
                    throw new C2130x0("Invalid properties file");
                }
                property = C2103k.m10656a(m10697a(property2));
            }
            return new C2128w0(property, parseLong);
        } catch (NumberFormatException e) {
            throw new C2130x0(e);
        }
    }

    /* renamed from: a */
    private static PublicKey m10697a(String str) {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                sb.toString();
                throw new C2130x0(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C2130x0(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10698a(Context context) {
        for (File file : m10701b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private final void m10699a(Context context, String str, C2128w0 c2128w0) {
        long j;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (c2128w0.equals(m10694a(sharedPreferences, str))) {
                return;
            }
        } catch (C2130x0 unused) {
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C2125v.m10707a(str, "id"), c2128w0.m10719a());
        String m10707a = C2125v.m10707a(str, "cre");
        j = c2128w0.f8977b;
        edit.putString(m10707a, String.valueOf(j));
        edit.commit();
    }

    /* renamed from: b */
    private static long m10700b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C2125v.m10707a(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: b */
    private static File m10701b(Context context) {
        File m1467c = C0237b.m1467c(context);
        return (m1467c == null || !m1467c.isDirectory()) ? context.getFilesDir() : m1467c;
    }

    /* renamed from: c */
    private final C2128w0 m10702c(Context context, String str) {
        C2128w0 m10703d;
        try {
            m10703d = m10703d(context, str);
        } catch (C2130x0 e) {
            e = e;
        }
        if (m10703d != null) {
            m10699a(context, str, m10703d);
            return m10703d;
        }
        e = null;
        try {
            C2128w0 m10694a = m10694a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (m10694a != null) {
                m10693a(context, str, m10694a, false);
                return m10694a;
            }
        } catch (C2130x0 e2) {
            e = e2;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    /* renamed from: d */
    private final C2128w0 m10703d(Context context, String str) {
        File m10704e = m10704e(context, str);
        if (!m10704e.exists()) {
            return null;
        }
        try {
            return m10695a(m10704e);
        } catch (C2130x0 | IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Failed to read ID from file, retrying: ");
                sb.append(valueOf);
                sb.toString();
            }
            try {
                return m10695a(m10704e);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                sb2.toString();
                throw new C2130x0(e2);
            }
        }
    }

    /* renamed from: e */
    private static File m10704e(Context context, String str) {
        String sb;
        if (TextUtils.isEmpty(str)) {
            sb = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb2 = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb2.append("com.google.InstanceId_");
                sb2.append(encodeToString);
                sb2.append(".properties");
                sb = sb2.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m10701b(context), sb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2128w0 m10705a(Context context, String str) {
        C2128w0 m10702c = m10702c(context, str);
        return m10702c != null ? m10702c : m10706b(context, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2128w0 m10706b(Context context, String str) {
        C2128w0 c2128w0 = new C2128w0(C2103k.m10656a(C2086c0.m10642a().getPublic()), System.currentTimeMillis());
        C2128w0 m10693a = m10693a(context, str, c2128w0, true);
        if (m10693a != null && !m10693a.equals(c2128w0)) {
            Log.isLoggable("FirebaseInstanceId", 3);
            return m10693a;
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        m10699a(context, str, c2128w0);
        return c2128w0;
    }
}
