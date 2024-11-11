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

/* loaded from: classes.dex */
public final class j {
    private static final Collection<String> a = new HashSet(Arrays.asList("amzn.to", "bit.ly", "bitly.com", "fb.me", "goo.gl", "is.gd", "j.mp", "lnkd.in", "ow.ly", "R.BEETAGG.COM", "r.beetagg.com", "SCN.BY", "su.pr", "t.co", "tinyurl.com", "tr.im"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.HTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.JSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.XML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        HTML,
        JSON,
        XML,
        TEXT
    }

    private static int a(HttpURLConnection httpURLConnection) {
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

    public static CharSequence a(String str, b bVar) {
        return a(str, bVar, Integer.MAX_VALUE);
    }

    public static CharSequence a(String str, b bVar, int i) {
        int i2 = a.a[bVar.ordinal()];
        return a(str, i2 != 1 ? i2 != 2 ? i2 != 3 ? "text/*,*/*" : "application/xml,text/*,*/*" : "application/json,text/*,*/*" : "application/xhtml+xml,text/html,text/*,*/*", i);
    }

    private static CharSequence a(String str, String str2, int i) {
        int i2 = 0;
        while (i2 < 5) {
            HttpURLConnection a2 = a(new URL(str));
            a2.setInstanceFollowRedirects(true);
            a2.setRequestProperty("Accept", str2);
            a2.setRequestProperty("Accept-Charset", "utf-8,*");
            a2.setRequestProperty("User-Agent", "ZXing (Android)");
            try {
                int a3 = a(a2);
                if (a3 == 200) {
                    return a(a2, i);
                }
                if (a3 != 302) {
                    throw new IOException("Bad HTTP response: " + a3);
                }
                String headerField = a2.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("No Location");
                }
                i2++;
                a2.disconnect();
                str = headerField;
            } finally {
                a2.disconnect();
            }
        }
        throw new IOException("Too many redirects");
    }

    private static CharSequence a(URLConnection uRLConnection, int i) {
        int read;
        String a2 = a(uRLConnection);
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = null;
        try {
            InputStreamReader inputStreamReader2 = new InputStreamReader(uRLConnection.getInputStream(), a2);
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

    private static String a(URLConnection uRLConnection) {
        int indexOf;
        String headerField = uRLConnection.getHeaderField("Content-Type");
        return (headerField == null || (indexOf = headerField.indexOf("charset=")) < 0) ? "UTF-8" : headerField.substring(indexOf + 8);
    }

    private static HttpURLConnection a(URL url) {
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
    public static URI a(URI uri) {
        if (!a.contains(uri.getHost())) {
            return uri;
        }
        HttpURLConnection a2 = a(uri.toURL());
        a2.setInstanceFollowRedirects(false);
        a2.setDoInput(false);
        a2.setRequestMethod("HEAD");
        a2.setRequestProperty("User-Agent", "ZXing (Android)");
        try {
            int a3 = a(a2);
            if (a3 != 307) {
                switch (a3) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return uri;
                }
            }
            String headerField = a2.getHeaderField("Location");
            if (headerField != null) {
                try {
                    return new URI(headerField);
                } catch (URISyntaxException unused) {
                }
            }
            return uri;
        } finally {
            a2.disconnect();
        }
    }
}
