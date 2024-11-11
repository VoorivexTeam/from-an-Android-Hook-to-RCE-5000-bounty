package defpackage;

import android.content.Context;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e;
import com.airbnb.lottie.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class x7 {
    private final Context a;
    private final String b;
    private final w7 c;

    private x7(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = str;
        this.c = new w7(applicationContext, str);
    }

    public static l<d> a(Context context, String str) {
        return new x7(context, str).a();
    }

    private String a(HttpURLConnection httpURLConnection) {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    private d b() {
        t1<v7, InputStream> a = this.c.a();
        if (a == null) {
            return null;
        }
        v7 v7Var = a.a;
        InputStream inputStream = a.b;
        l<d> a2 = v7Var == v7.ZIP ? e.a(new ZipInputStream(inputStream), this.b) : e.b(inputStream, this.b);
        if (a2.b() != null) {
            return a2.b();
        }
        return null;
    }

    private l<d> b(HttpURLConnection httpURLConnection) {
        v7 v7Var;
        l<d> b;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            q9.a("Handling zip response.");
            v7Var = v7.ZIP;
            b = e.a(new ZipInputStream(new FileInputStream(this.c.a(httpURLConnection.getInputStream(), v7Var))), this.b);
        } else {
            q9.a("Received json response.");
            v7Var = v7.JSON;
            b = e.b(new FileInputStream(new File(this.c.a(httpURLConnection.getInputStream(), v7Var).getAbsolutePath())), this.b);
        }
        if (b.b() != null) {
            this.c.a(v7Var);
        }
        return b;
    }

    private l<d> c() {
        try {
            return d();
        } catch (IOException e) {
            return new l<>((Throwable) e);
        }
    }

    private l d() {
        q9.a("Fetching " + this.b);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
                l<d> b = b(httpURLConnection);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(b.b() != null);
                q9.a(sb.toString());
                return b;
            }
            return new l((Throwable) new IllegalArgumentException("Unable to fetch " + this.b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + a(httpURLConnection)));
        } catch (Exception e) {
            return new l((Throwable) e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public l<d> a() {
        d b = b();
        if (b != null) {
            return new l<>(b);
        }
        q9.a("Animation for " + this.b + " not found in cache. Fetching from network.");
        return c();
    }
}
