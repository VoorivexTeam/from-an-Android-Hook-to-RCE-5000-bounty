package com.google.zxing.client.android;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: com.google.zxing.client.android.j */
/* loaded from: classes.dex */
public final class C2261j {

    /* renamed from: a */
    private static final Collection<String> f9139a = new HashSet(Arrays.asList("amzn.to", "bit.ly", "bitly.com", "fb.me", "goo.gl", "is.gd", "j.mp", "lnkd.in", "ow.ly", "R.BEETAGG.COM", "r.beetagg.com", "SCN.BY", "su.pr", "t.co", "tinyurl.com", "tr.im"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.zxing.client.android.j$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9140a;

        static {
            int[] iArr = new int[b.values().length];
            f9140a = iArr;
            try {
                iArr[b.HTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9140a[b.JSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9140a[b.XML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9140a[b.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.google.zxing.client.android.j$b */
    /* loaded from: classes.dex */
    public enum b {
        HTML,
        JSON,
        XML,
        TEXT
    }

    /* renamed from: a */
    private static int m10881a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.connect();
            try {
                return httpURLConnection.getResponseCode();
            } catch (IllegalArgumentException | NullPointerException | StringIndexOutOfBoundsException e) {
                throw new IOException(e);
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NullPointerException | SecurityException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: a */
    public static CharSequence m10882a(String str, b bVar) {
        return m10883a(str, bVar, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static CharSequence m10883a(String str, b bVar, int i) {
        int i2 = a.f9140a[bVar.ordinal()];
        return m10884a(str, i2 != 1 ? i2 != 2 ? i2 != 3 ? "text/*,*/*" : "application/xml,text/*,*/*" : "application/json,text/*,*/*" : "application/xhtml+xml,text/html,text/*,*/*", i);
    }

    /* renamed from: a */
    private static CharSequence m10884a(String str, String str2, int i) {
        int i2 = 0;
        while (i2 < 5) {
            HttpURLConnection m10887a = m10887a(new URL(str));
            m10887a.setInstanceFollowRedirects(true);
            m10887a.setRequestProperty("Accept", str2);
            m10887a.setRequestProperty("Accept-Charset", "utf-8,*");
            m10887a.setRequestProperty("User-Agent", "ZXing (Android)");
            try {
                int m10881a = m10881a(m10887a);
                if (m10881a == 200) {
                    return m10885a(m10887a, i);
                }
                if (m10881a != 302) {
                    throw new IOException("Bad HTTP response: " + m10881a);
                }
                String headerField = m10887a.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("No Location");
                }
                i2++;
                m10887a.disconnect();
                str = headerField;
            } finally {
                m10887a.disconnect();
            }
        }
        throw new IOException("Too many redirects");
    }

    /* renamed from: a */
    private static CharSequence m10885a(URLConnection uRLConnection, int i) {
        int read;
        String m10886a = m10886a(uRLConnection);
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = null;
        try {
            InputStreamReader inputStreamReader2 = new InputStreamReader(uRLConnection.getInputStream(), m10886a);
            try {
                char[] cArr = new char[1024];
                while (sb.length() < i && (read = inputStreamReader2.read(cArr)) > 0) {
                    sb.append(cArr, 0, read);
                }
                try {
                    inputStreamReader2.close();
                } catch (IOException | NullPointerException unused) {
                }
                return sb;
            } catch (Throwable th) {
                th = th;
                inputStreamReader = inputStreamReader2;
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (IOException | NullPointerException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    private static String m10886a(URLConnection uRLConnection) {
        int indexOf;
        String headerField = uRLConnection.getHeaderField("Content-Type");
        return (headerField == null || (indexOf = headerField.indexOf("charset=")) < 0) ? "UTF-8" : headerField.substring(indexOf + 8);
    }

    /* renamed from: a */
    private static HttpURLConnection m10887a(URL url) {
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpURLConnection) {
                return (HttpURLConnection) openConnection;
            }
            throw new IOException();
        } catch (NullPointerException e) {
            String str = "Bad URI? " + url;
            throw new IOException(e);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0030. Please report as an issue. */
    /* renamed from: a */
    public static URI m10888a(URI uri) {
        if (!f9139a.contains(uri.getHost())) {
            return uri;
        }
        HttpURLConnection m10887a = m10887a(uri.toURL());
        m10887a.setInstanceFollowRedirects(false);
        m10887a.setDoInput(false);
        m10887a.setRequestMethod("HEAD");
        m10887a.setRequestProperty("User-Agent", "ZXing (Android)");
        try {
            int m10881a = m10881a(m10887a);
            if (m10881a != 307) {
                switch (m10881a) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return uri;
                }
            }
            String headerField = m10887a.getHeaderField("Location");
            if (headerField != null) {
                try {
                    return new URI(headerField);
                } catch (URISyntaxException unused) {
                }
            }
            return uri;
        } finally {
            m10887a.disconnect();
        }
    }
}
