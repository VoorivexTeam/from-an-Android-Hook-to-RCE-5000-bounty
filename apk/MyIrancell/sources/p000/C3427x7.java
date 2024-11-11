package p000;

import android.content.Context;
import com.airbnb.lottie.C0538d;
import com.airbnb.lottie.C0539e;
import com.airbnb.lottie.C0546l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

/* renamed from: x7 */
/* loaded from: classes.dex */
public class C3427x7 {

    /* renamed from: a */
    private final Context f13995a;

    /* renamed from: b */
    private final String f13996b;

    /* renamed from: c */
    private final C3387w7 f13997c;

    private C3427x7(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f13995a = applicationContext;
        this.f13996b = str;
        this.f13997c = new C3387w7(applicationContext, str);
    }

    /* renamed from: a */
    public static C0546l<C0538d> m16452a(Context context, String str) {
        return new C3427x7(context, str).m16458a();
    }

    /* renamed from: a */
    private String m16453a(HttpURLConnection httpURLConnection) {
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

    /* renamed from: b */
    private C0538d m16454b() {
        C3231t1<EnumC3341v7, InputStream> m16151a = this.f13997c.m16151a();
        if (m16151a == null) {
            return null;
        }
        EnumC3341v7 enumC3341v7 = m16151a.f13167a;
        InputStream inputStream = m16151a.f13168b;
        C0546l<C0538d> m3746a = enumC3341v7 == EnumC3341v7.ZIP ? C0539e.m3746a(new ZipInputStream(inputStream), this.f13996b) : C0539e.m3760b(inputStream, this.f13996b);
        if (m3746a.m3840b() != null) {
            return m3746a.m3840b();
        }
        return null;
    }

    /* renamed from: b */
    private C0546l<C0538d> m16455b(HttpURLConnection httpURLConnection) {
        EnumC3341v7 enumC3341v7;
        C0546l<C0538d> m3760b;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            C3116q9.m15000a("Handling zip response.");
            enumC3341v7 = EnumC3341v7.ZIP;
            m3760b = C0539e.m3746a(new ZipInputStream(new FileInputStream(this.f13997c.m16150a(httpURLConnection.getInputStream(), enumC3341v7))), this.f13996b);
        } else {
            C3116q9.m15000a("Received json response.");
            enumC3341v7 = EnumC3341v7.JSON;
            m3760b = C0539e.m3760b(new FileInputStream(new File(this.f13997c.m16150a(httpURLConnection.getInputStream(), enumC3341v7).getAbsolutePath())), this.f13996b);
        }
        if (m3760b.m3840b() != null) {
            this.f13997c.m16152a(enumC3341v7);
        }
        return m3760b;
    }

    /* renamed from: c */
    private C0546l<C0538d> m16456c() {
        try {
            return m16457d();
        } catch (IOException e) {
            return new C0546l<>((Throwable) e);
        }
    }

    /* renamed from: d */
    private C0546l m16457d() {
        C3116q9.m15000a("Fetching " + this.f13996b);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f13996b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
                C0546l<C0538d> m16455b = m16455b(httpURLConnection);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(m16455b.m3840b() != null);
                C3116q9.m15000a(sb.toString());
                return m16455b;
            }
            return new C0546l((Throwable) new IllegalArgumentException("Unable to fetch " + this.f13996b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + m16453a(httpURLConnection)));
        } catch (Exception e) {
            return new C0546l((Throwable) e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: a */
    public C0546l<C0538d> m16458a() {
        C0538d m16454b = m16454b();
        if (m16454b != null) {
            return new C0546l<>(m16454b);
        }
        C3116q9.m15000a("Animation for " + this.f13996b + " not found in cache. Fetching from network.");
        return m16456c();
    }
}
