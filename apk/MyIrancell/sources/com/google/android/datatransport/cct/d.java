package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import defpackage.al;
import defpackage.bl;
import defpackage.bm;
import defpackage.dl;
import defpackage.dm;
import defpackage.fk;
import defpackage.fl;
import defpackage.gl;
import defpackage.mk;
import defpackage.nk;
import defpackage.ol;
import defpackage.pl;
import defpackage.pu;
import defpackage.qu;
import defpackage.wk;
import defpackage.wn;
import defpackage.yk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements m {
    private final ConnectivityManager b;
    private final wn d;
    private final wn e;
    private final pu a = al.a();
    final URL c = a(com.google.android.datatransport.cct.a.c);
    private final int f = 40000;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        final URL a;
        final wk b;
        final String c;

        a(URL url, wk wkVar, String str) {
            this.a = url;
            this.b = wkVar;
            this.c = str;
        }

        a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {
        final int a;
        final URL b;
        final long c;

        b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, wn wnVar, wn wnVar2) {
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = wnVar2;
        this.e = wnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ a a(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        bm.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b a(a aVar) {
        bm.a("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "2.2.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        WritableByteChannel newChannel = Channels.newChannel(httpURLConnection.getOutputStream());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                try {
                    this.a.a(aVar.b, new OutputStreamWriter(gZIPOutputStream));
                    gZIPOutputStream.close();
                    newChannel.write(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                    int responseCode = httpURLConnection.getResponseCode();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Status Code: ");
                    sb.append(responseCode);
                    bm.a("CctTransportBackend", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Content-Type: ");
                    sb2.append(httpURLConnection.getHeaderField("Content-Type"));
                    bm.a("CctTransportBackend", sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Content-Encoding: ");
                    sb3.append(httpURLConnection.getHeaderField("Content-Encoding"));
                    bm.a("CctTransportBackend", sb3.toString());
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new b(responseCode, null, 0L);
                        }
                        String headerField = httpURLConnection.getHeaderField("Content-Encoding");
                        InputStream inputStream = (headerField == null || !headerField.equals("gzip")) ? httpURLConnection.getInputStream() : new GZIPInputStream(httpURLConnection.getInputStream());
                        try {
                            return new b(responseCode, null, fl.a(new InputStreamReader(inputStream)).a());
                        } finally {
                            inputStream.close();
                        }
                    }
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                } finally {
                    gZIPOutputStream.close();
                }
            } catch (IOException | qu e) {
                bm.a("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                return new b(400, null, 0L);
            }
        } finally {
            newChannel.close();
        }
    }

    private static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public g a(f fVar) {
        bl.a a2;
        HashMap hashMap = new HashMap();
        for (pl plVar : fVar.a()) {
            String f = plVar.f();
            if (hashMap.containsKey(f)) {
                ((List) hashMap.get(f)).add(plVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(plVar);
                hashMap.put(f, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            pl plVar2 = (pl) ((List) entry.getValue()).get(0);
            dl.a a3 = dl.a();
            a3.a(nk.zza);
            a3.a(this.e.a());
            a3.b(this.d.a());
            yk.a a4 = yk.a();
            a4.a(yk.b.zzb);
            mk.a a5 = mk.a();
            a5.a(plVar2.b("sdk-version"));
            a5.e(plVar2.a("model"));
            a5.c(plVar2.a("hardware"));
            a5.a(plVar2.a("device"));
            a5.g(plVar2.a("product"));
            a5.f(plVar2.a("os-uild"));
            a5.d(plVar2.a("manufacturer"));
            a5.b(plVar2.a("fingerprint"));
            a4.a(a5.a());
            a3.a(a4.a());
            try {
                a3.b(Integer.valueOf((String) entry.getKey()).intValue());
            } catch (NumberFormatException unused) {
                a3.b((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (pl plVar3 : (List) entry.getValue()) {
                ol c = plVar3.c();
                fk b2 = c.b();
                if (b2.equals(fk.a("proto"))) {
                    a2 = bl.a(c.a());
                } else if (b2.equals(fk.a("json"))) {
                    a2 = bl.a(new String(c.a(), Charset.forName("UTF-8")));
                } else {
                    bm.b("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                a2.a(plVar3.d());
                a2.b(plVar3.g());
                a2.c(plVar3.c("tz-offset"));
                gl.a a6 = gl.a();
                a6.a(gl.c.zza(plVar3.b("net-type")));
                a6.a(gl.b.zza(plVar3.b("mobile-subtype")));
                a2.a(a6.a());
                if (plVar3.b() != null) {
                    a2.a(plVar3.b().intValue());
                }
                arrayList3.add(a2.a());
            }
            a3.a(arrayList3);
            arrayList2.add(a3.a());
        }
        wk a7 = wk.a(arrayList2);
        URL url = this.c;
        if (fVar.b() != null) {
            try {
                com.google.android.datatransport.cct.a a8 = com.google.android.datatransport.cct.a.a(fVar.b());
                r1 = a8.e() != null ? a8.e() : null;
                if (a8.f() != null) {
                    url = a(a8.f());
                }
            } catch (IllegalArgumentException unused2) {
                return g.c();
            }
        }
        try {
            b bVar = (b) dm.a(5, new a(url, a7, r1), com.google.android.datatransport.cct.b.a(this), c.a());
            if (bVar.a == 200) {
                return g.a(bVar.c);
            }
            int i = bVar.a;
            if (i < 500 && i != 404) {
                return g.c();
            }
            return g.d();
        } catch (IOException e) {
            bm.a("CctTransportBackend", "Could not make request to the backend", (Throwable) e);
            return g.d();
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public pl a(pl plVar) {
        int subtype;
        gl.b bVar;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        pl.a h = plVar.h();
        h.a("sdk-version", Build.VERSION.SDK_INT);
        h.a("model", Build.MODEL);
        h.a("hardware", Build.HARDWARE);
        h.a("device", Build.DEVICE);
        h.a("product", Build.PRODUCT);
        h.a("os-uild", Build.ID);
        h.a("manufacturer", Build.MANUFACTURER);
        h.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        h.a("tz-offset", TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
        h.a("net-type", activeNetworkInfo == null ? gl.c.zzs.zza() : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            bVar = gl.b.zza;
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype != -1) {
                if (gl.b.zza(subtype) == null) {
                    subtype = 0;
                }
                h.a("mobile-subtype", subtype);
                return h.a();
            }
            bVar = gl.b.zzu;
        }
        subtype = bVar.zza();
        h.a("mobile-subtype", subtype);
        return h.a();
    }
}
