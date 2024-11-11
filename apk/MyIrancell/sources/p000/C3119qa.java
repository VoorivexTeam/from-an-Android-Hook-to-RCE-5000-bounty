package p000;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0571e;
import com.bumptech.glide.load.EnumC0567a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p000.InterfaceC2853ka;

/* renamed from: qa */
/* loaded from: classes.dex */
public class C3119qa implements InterfaceC2853ka<InputStream> {

    /* renamed from: h */
    static final b f12764h = new a();

    /* renamed from: b */
    private final C2549hd f12765b;

    /* renamed from: c */
    private final int f12766c;

    /* renamed from: d */
    private final b f12767d;

    /* renamed from: e */
    private HttpURLConnection f12768e;

    /* renamed from: f */
    private InputStream f12769f;

    /* renamed from: g */
    private volatile boolean f12770g;

    /* renamed from: qa$a */
    /* loaded from: classes.dex */
    private static class a implements b {
        a() {
        }

        @Override // p000.C3119qa.b
        /* renamed from: a */
        public HttpURLConnection mo15035a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qa$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        HttpURLConnection mo15035a(URL url);
    }

    public C3119qa(C2549hd c2549hd, int i) {
        this(c2549hd, i, f12764h);
    }

    C3119qa(C2549hd c2549hd, int i, b bVar) {
        this.f12765b = c2549hd;
        this.f12766c = i;
        this.f12767d = bVar;
    }

    /* renamed from: a */
    private InputStream m15031a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = C0523ci.m3681a(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                String str = "Got non empty content encoding: " + httpURLConnection.getContentEncoding();
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f12769f = inputStream;
        return this.f12769f;
    }

    /* renamed from: a */
    private InputStream m15032a(URL url, int i, URL url2, Map<String, String> map) {
        if (i >= 5) {
            throw new C0571e("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C0571e("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f12768e = this.f12767d.mo15035a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f12768e.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f12768e.setConnectTimeout(this.f12766c);
        this.f12768e.setReadTimeout(this.f12766c);
        this.f12768e.setUseCaches(false);
        this.f12768e.setDoInput(true);
        this.f12768e.setInstanceFollowRedirects(false);
        this.f12768e.connect();
        this.f12769f = this.f12768e.getInputStream();
        if (this.f12770g) {
            return null;
        }
        int responseCode = this.f12768e.getResponseCode();
        if (m15033a(responseCode)) {
            return m15031a(this.f12768e);
        }
        if (!m15034b(responseCode)) {
            if (responseCode == -1) {
                throw new C0571e(responseCode);
            }
            throw new C0571e(this.f12768e.getResponseMessage(), responseCode);
        }
        String headerField = this.f12768e.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new C0571e("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        mo3665b();
        return m15032a(url3, i + 1, url, map);
    }

    /* renamed from: a */
    private static boolean m15033a(int i) {
        return i / 100 == 2;
    }

    /* renamed from: b */
    private static boolean m15034b(int i) {
        return i / 100 == 3;
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: a */
    public Class<InputStream> mo3663a() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: a */
    public void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super InputStream> aVar) {
        StringBuilder sb;
        long m11768a = C2474fi.m11768a();
        try {
            try {
                aVar.mo3639a((InterfaceC2853ka.a<? super InputStream>) m15032a(this.f12765b.m12213c(), 0, null, this.f12765b.m12212b()));
            } catch (IOException e) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.mo3638a((Exception) e);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C2474fi.m11767a(m11768a));
                sb.toString();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                String str = "Finished http url fetcher fetch in " + C2474fi.m11767a(m11768a);
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: b */
    public void mo3665b() {
        InputStream inputStream = this.f12769f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f12768e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f12768e = null;
    }

    @Override // p000.InterfaceC2853ka
    /* renamed from: c */
    public EnumC0567a mo3666c() {
        return EnumC0567a.REMOTE;
    }

    @Override // p000.InterfaceC2853ka
    public void cancel() {
        this.f12770g = true;
    }
}
