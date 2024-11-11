package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.datatransport.runtime.backends.AbstractC0774f;
import com.google.android.datatransport.runtime.backends.AbstractC0775g;
import com.google.android.datatransport.runtime.backends.InterfaceC0781m;
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
import p000.AbstractC0484bl;
import p000.AbstractC2393dl;
import p000.AbstractC2477fl;
import p000.AbstractC2517gl;
import p000.AbstractC2946mk;
import p000.AbstractC3089pl;
import p000.AbstractC3401wk;
import p000.AbstractC3490yk;
import p000.C0025al;
import p000.C0485bm;
import p000.C2394dm;
import p000.C2476fk;
import p000.C3050ol;
import p000.C3140qu;
import p000.EnumC2992nk;
import p000.InterfaceC3098pu;
import p000.InterfaceC3404wn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes.dex */
public final class C0767d implements InterfaceC0781m {

    /* renamed from: b */
    private final ConnectivityManager f5360b;

    /* renamed from: d */
    private final InterfaceC3404wn f5362d;

    /* renamed from: e */
    private final InterfaceC3404wn f5363e;

    /* renamed from: a */
    private final InterfaceC3098pu f5359a = C0025al.m216a();

    /* renamed from: c */
    final URL f5361c = m6262a(C0764a.f5350c);

    /* renamed from: f */
    private final int f5364f = 40000;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final URL f5365a;

        /* renamed from: b */
        final AbstractC3401wk f5366b;

        /* renamed from: c */
        final String f5367c;

        a(URL url, AbstractC3401wk abstractC3401wk, String str) {
            this.f5365a = url;
            this.f5366b = abstractC3401wk;
            this.f5367c = str;
        }

        /* renamed from: a */
        a m6265a(URL url) {
            return new a(url, this.f5366b, this.f5367c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f5368a;

        /* renamed from: b */
        final URL f5369b;

        /* renamed from: c */
        final long f5370c;

        b(int i, URL url, long j) {
            this.f5368a = i;
            this.f5369b = url;
            this.f5370c = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0767d(Context context, InterfaceC3404wn interfaceC3404wn, InterfaceC3404wn interfaceC3404wn2) {
        this.f5360b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5362d = interfaceC3404wn2;
        this.f5363e = interfaceC3404wn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ a m6259a(a aVar, b bVar) {
        URL url = bVar.f5369b;
        if (url == null) {
            return null;
        }
        C0485bm.m3430a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m6265a(bVar.f5369b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public b m6260a(a aVar) {
        C0485bm.m3430a("CctTransportBackend", "Making request to: %s", aVar.f5365a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f5365a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f5364f);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "2.2.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f5367c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        WritableByteChannel newChannel = Channels.newChannel(httpURLConnection.getOutputStream());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                try {
                    this.f5359a.mo14826a(aVar.f5366b, new OutputStreamWriter(gZIPOutputStream));
                    gZIPOutputStream.close();
                    newChannel.write(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                    int responseCode = httpURLConnection.getResponseCode();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Status Code: ");
                    sb.append(responseCode);
                    C0485bm.m3429a("CctTransportBackend", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Content-Type: ");
                    sb2.append(httpURLConnection.getHeaderField("Content-Type"));
                    C0485bm.m3429a("CctTransportBackend", sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Content-Encoding: ");
                    sb3.append(httpURLConnection.getHeaderField("Content-Encoding"));
                    C0485bm.m3429a("CctTransportBackend", sb3.toString());
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new b(responseCode, null, 0L);
                        }
                        String headerField = httpURLConnection.getHeaderField("Content-Encoding");
                        InputStream inputStream = (headerField == null || !headerField.equals("gzip")) ? httpURLConnection.getInputStream() : new GZIPInputStream(httpURLConnection.getInputStream());
                        try {
                            return new b(responseCode, null, AbstractC2477fl.m11791a(new InputStreamReader(inputStream)).mo11792a());
                        } finally {
                            inputStream.close();
                        }
                    }
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                } finally {
                    gZIPOutputStream.close();
                }
            } catch (IOException | C3140qu e) {
                C0485bm.m3431a("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                return new b(400, null, 0L);
            }
        } finally {
            newChannel.close();
        }
    }

    /* renamed from: a */
    private static URL m6262a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC0781m
    /* renamed from: a */
    public AbstractC0775g mo6263a(AbstractC0774f abstractC0774f) {
        AbstractC0484bl.a m3416a;
        HashMap hashMap = new HashMap();
        for (AbstractC3089pl abstractC3089pl : abstractC0774f.mo6267a()) {
            String mo12482f = abstractC3089pl.mo12482f();
            if (hashMap.containsKey(mo12482f)) {
                ((List) hashMap.get(mo12482f)).add(abstractC3089pl);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC3089pl);
                hashMap.put(mo12482f, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC3089pl abstractC3089pl2 = (AbstractC3089pl) ((List) entry.getValue()).get(0);
            AbstractC2393dl.a m11458a = AbstractC2393dl.m11458a();
            m11458a.mo11463a(EnumC2992nk.zza);
            m11458a.mo11460a(this.f5363e.mo3178a());
            m11458a.mo11467b(this.f5362d.mo3178a());
            AbstractC3490yk.a m16647a = AbstractC3490yk.m16647a();
            m16647a.mo15284a(AbstractC3490yk.b.zzb);
            AbstractC2946mk.a m14160a = AbstractC2946mk.m14160a();
            m14160a.mo14161a(abstractC3089pl2.m14803b("sdk-version"));
            m14160a.mo14167e(abstractC3089pl2.m14802a("model"));
            m14160a.mo14165c(abstractC3089pl2.m14802a("hardware"));
            m14160a.mo14162a(abstractC3089pl2.m14802a("device"));
            m14160a.mo14169g(abstractC3089pl2.m14802a("product"));
            m14160a.mo14168f(abstractC3089pl2.m14802a("os-uild"));
            m14160a.mo14166d(abstractC3089pl2.m14802a("manufacturer"));
            m14160a.mo14164b(abstractC3089pl2.m14802a("fingerprint"));
            m16647a.mo15283a(m14160a.mo14163a());
            m11458a.mo11464a(m16647a.mo15285a());
            try {
                m11458a.m11466b(Integer.valueOf((String) entry.getKey()).intValue());
            } catch (NumberFormatException unused) {
                m11458a.m11468b((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC3089pl abstractC3089pl3 : (List) entry.getValue()) {
                C3050ol mo12480c = abstractC3089pl3.mo12480c();
                C2476fk m14636b = mo12480c.m14636b();
                if (m14636b.equals(C2476fk.m11789a("proto"))) {
                    m3416a = AbstractC0484bl.m3416a(mo12480c.m14635a());
                } else if (m14636b.equals(C2476fk.m11789a("json"))) {
                    m3416a = AbstractC0484bl.m3415a(new String(mo12480c.m14635a(), Charset.forName("UTF-8")));
                } else {
                    C0485bm.m3433b("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m14636b);
                }
                m3416a.mo3421a(abstractC3089pl3.mo12481d());
                m3416a.mo3426b(abstractC3089pl3.mo12483g());
                m3416a.mo3427c(abstractC3089pl3.m14804c("tz-offset"));
                AbstractC2517gl.a m12030a = AbstractC2517gl.m12030a();
                m12030a.mo12032a(AbstractC2517gl.c.zza(abstractC3089pl3.m14803b("net-type")));
                m12030a.mo12031a(AbstractC2517gl.b.zza(abstractC3089pl3.m14803b("mobile-subtype")));
                m3416a.mo3422a(m12030a.mo12033a());
                if (abstractC3089pl3.mo12479b() != null) {
                    m3416a.mo3420a(abstractC3089pl3.mo12479b().intValue());
                }
                arrayList3.add(m3416a.mo3425a());
            }
            m11458a.mo11462a(arrayList3);
            arrayList2.add(m11458a.mo11465a());
        }
        AbstractC3401wk m16380a = AbstractC3401wk.m16380a(arrayList2);
        URL url = this.f5361c;
        if (abstractC0774f.mo6268b() != null) {
            try {
                C0764a m6249a = C0764a.m6249a(abstractC0774f.mo6268b());
                r1 = m6249a.m6254e() != null ? m6249a.m6254e() : null;
                if (m6249a.m6255f() != null) {
                    url = m6262a(m6249a.m6255f());
                }
            } catch (IllegalArgumentException unused2) {
                return AbstractC0775g.m6281c();
            }
        }
        try {
            b bVar = (b) C2394dm.m11469a(5, new a(url, m16380a, r1), C0765b.m6256a(this), C0766c.m6257a());
            if (bVar.f5368a == 200) {
                return AbstractC0775g.m6280a(bVar.f5370c);
            }
            int i = bVar.f5368a;
            if (i < 500 && i != 404) {
                return AbstractC0775g.m6281c();
            }
            return AbstractC0775g.m6282d();
        } catch (IOException e) {
            C0485bm.m3431a("CctTransportBackend", "Could not make request to the backend", (Throwable) e);
            return AbstractC0775g.m6282d();
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC0781m
    /* renamed from: a */
    public AbstractC3089pl mo6264a(AbstractC3089pl abstractC3089pl) {
        int subtype;
        AbstractC2517gl.b bVar;
        NetworkInfo activeNetworkInfo = this.f5360b.getActiveNetworkInfo();
        AbstractC3089pl.a m14806h = abstractC3089pl.m14806h();
        m14806h.m14807a("sdk-version", Build.VERSION.SDK_INT);
        m14806h.m14809a("model", Build.MODEL);
        m14806h.m14809a("hardware", Build.HARDWARE);
        m14806h.m14809a("device", Build.DEVICE);
        m14806h.m14809a("product", Build.PRODUCT);
        m14806h.m14809a("os-uild", Build.ID);
        m14806h.m14809a("manufacturer", Build.MANUFACTURER);
        m14806h.m14809a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        m14806h.m14808a("tz-offset", TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
        m14806h.m14807a("net-type", activeNetworkInfo == null ? AbstractC2517gl.c.zzs.zza() : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            bVar = AbstractC2517gl.b.zza;
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype != -1) {
                if (AbstractC2517gl.b.zza(subtype) == null) {
                    subtype = 0;
                }
                m14806h.m14807a("mobile-subtype", subtype);
                return m14806h.mo12489a();
            }
            bVar = AbstractC2517gl.b.zzu;
        }
        subtype = bVar.zza();
        m14806h.m14807a("mobile-subtype", subtype);
        return m14806h.mo12489a();
    }
}
