package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.e;
import defpackage.ka;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public class qa implements ka<InputStream> {
    static final b h = new a();
    private final hd b;
    private final int c;
    private final b d;
    private HttpURLConnection e;
    private InputStream f;
    private volatile boolean g;

    /* loaded from: classes.dex */
    private static class a implements b {
        a() {
        }

        @Override // qa.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        HttpURLConnection a(URL url);
    }

    public qa(hd hdVar, int i) {
        this(hdVar, i, h);
    }

    qa(hd hdVar, int i, b bVar) {
        this.b = hdVar;
        this.c = i;
        this.d = bVar;
    }

    private InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = ci.a(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                String str = "Got non empty content encoding: " + httpURLConnection.getContentEncoding();
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f = inputStream;
        return this.f;
    }

    private InputStream a(URL url, int i, URL url2, Map<String, String> map) {
        if (i >= 5) {
            throw new e("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new e("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.e = this.d.a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.e.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.e.setConnectTimeout(this.c);
        this.e.setReadTimeout(this.c);
        this.e.setUseCaches(false);
        this.e.setDoInput(true);
        this.e.setInstanceFollowRedirects(false);
        this.e.connect();
        this.f = this.e.getInputStream();
        if (this.g) {
            return null;
        }
        int responseCode = this.e.getResponseCode();
        if (a(responseCode)) {
            return a(this.e);
        }
        if (!b(responseCode)) {
            if (responseCode == -1) {
                throw new e(responseCode);
            }
            throw new e(this.e.getResponseMessage(), responseCode);
        }
        String headerField = this.e.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new e("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        b();
        return a(url3, i + 1, url, map);
    }

    private static boolean a(int i) {
        return i / 100 == 2;
    }

    private static boolean b(int i) {
        return i / 100 == 3;
    }

    @Override // defpackage.ka
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.ka
    public void a(g gVar, ka.a<? super InputStream> aVar) {
        StringBuilder sb;
        long a2 = fi.a();
        try {
            try {
                aVar.a((ka.a<? super InputStream>) a(this.b.c(), 0, null, this.b.b()));
            } catch (IOException e) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.a((Exception) e);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(fi.a(a2));
                sb.toString();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                String str = "Finished http url fetcher fetch in " + fi.a(a2);
            }
            throw th;
        }
    }

    @Override // defpackage.ka
    public void b() {
        InputStream inputStream = this.f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.e = null;
    }

    @Override // defpackage.ka
    public com.bumptech.glide.load.a c() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // defpackage.ka
    public void cancel() {
        this.g = true;
    }
}
