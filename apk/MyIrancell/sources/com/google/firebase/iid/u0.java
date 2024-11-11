package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import defpackage.er;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u0 {
    private final w0 a(Context context, String str, w0 w0Var, boolean z) {
        long j;
        Log.isLoggable("FirebaseInstanceId", 3);
        Properties properties = new Properties();
        properties.setProperty("id", w0Var.a());
        j = w0Var.b;
        properties.setProperty("cre", String.valueOf(j));
        File e = e(context, str);
        try {
            e.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(e, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.lock();
                    if (z && channel.size() > 0) {
                        try {
                            channel.position(0L);
                            w0 a = a(channel);
                            if (channel != null) {
                                channel.close();
                            }
                            randomAccessFile.close();
                            return a;
                        } catch (x0 | IOException e2) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf = String.valueOf(e2);
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
                    return w0Var;
                } finally {
                }
            } finally {
            }
        } catch (IOException e3) {
            String valueOf2 = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            sb2.append("Failed to write key: ");
            sb2.append(valueOf2);
            sb2.toString();
            return null;
        }
    }

    private static w0 a(SharedPreferences sharedPreferences, String str) {
        long b = b(sharedPreferences, str);
        String string = sharedPreferences.getString(v.a(str, "id"), null);
        if (string == null) {
            String string2 = sharedPreferences.getString(v.a(str, "|P|"), null);
            if (string2 == null) {
                return null;
            }
            string = k.a(a(string2));
        }
        return new w0(string, b);
    }

    private final w0 a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                channel.lock(0L, Long.MAX_VALUE, true);
                w0 a = a(channel);
                if (channel != null) {
                    channel.close();
                }
                fileInputStream.close();
                return a;
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                er.a(th, th2);
            }
            throw th;
        }
    }

    private static w0 a(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        try {
            long parseLong = Long.parseLong(properties.getProperty("cre"));
            String property = properties.getProperty("id");
            if (property == null) {
                String property2 = properties.getProperty("pub");
                if (property2 == null) {
                    throw new x0("Invalid properties file");
                }
                property = k.a(a(property2));
            }
            return new w0(property, parseLong);
        } catch (NumberFormatException e) {
            throw new x0(e);
        }
    }

    private static PublicKey a(String str) {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                sb.toString();
                throw new x0(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new x0(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        for (File file : b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private final void a(Context context, String str, w0 w0Var) {
        long j;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (w0Var.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (x0 unused) {
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(v.a(str, "id"), w0Var.a());
        String a = v.a(str, "cre");
        j = w0Var.b;
        edit.putString(a, String.valueOf(j));
        edit.commit();
    }

    private static long b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(v.a(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private static File b(Context context) {
        File c = androidx.core.content.b.c(context);
        return (c == null || !c.isDirectory()) ? context.getFilesDir() : c;
    }

    private final w0 c(Context context, String str) {
        w0 d;
        try {
            d = d(context, str);
        } catch (x0 e) {
            e = e;
        }
        if (d != null) {
            a(context, str, d);
            return d;
        }
        e = null;
        try {
            w0 a = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (a != null) {
                a(context, str, a, false);
                return a;
            }
        } catch (x0 e2) {
            e = e2;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    private final w0 d(Context context, String str) {
        File e = e(context, str);
        if (!e.exists()) {
            return null;
        }
        try {
            return a(e);
        } catch (x0 | IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Failed to read ID from file, retrying: ");
                sb.append(valueOf);
                sb.toString();
            }
            try {
                return a(e);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                sb2.toString();
                throw new x0(e3);
            }
        }
    }

    private static File e(Context context, String str) {
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
        return new File(b(context), sb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w0 a(Context context, String str) {
        w0 c = c(context, str);
        return c != null ? c : b(context, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w0 b(Context context, String str) {
        w0 w0Var = new w0(k.a(c0.a().getPublic()), System.currentTimeMillis());
        w0 a = a(context, str, w0Var, true);
        if (a != null && !a.equals(w0Var)) {
            Log.isLoggable("FirebaseInstanceId", 3);
            return a;
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        a(context, str, w0Var);
        return w0Var;
    }
}
