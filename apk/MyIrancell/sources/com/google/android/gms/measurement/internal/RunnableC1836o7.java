package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1057u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o7 */
/* loaded from: classes.dex */
public final class RunnableC1836o7 implements Runnable {

    /* renamed from: b */
    private final URL f7916b;

    /* renamed from: c */
    private final InterfaceC1800l7 f7917c;

    /* renamed from: d */
    private final String f7918d;

    /* renamed from: e */
    private final Map<String, String> f7919e;

    /* renamed from: f */
    private final /* synthetic */ C1812m7 f7920f;

    public RunnableC1836o7(C1812m7 c1812m7, String str, URL url, byte[] bArr, Map<String, String> map, InterfaceC1800l7 interfaceC1800l7) {
        this.f7920f = c1812m7;
        C1057u.m7296b(str);
        C1057u.m7286a(url);
        C1057u.m7286a(interfaceC1800l7);
        this.f7916b = url;
        this.f7917c = interfaceC1800l7;
        this.f7918d = str;
        this.f7919e = null;
    }

    /* renamed from: b */
    private final void m9633b(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f7920f.mo9320g().m9344a(new Runnable(this, i, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.n7

            /* renamed from: b */
            private final RunnableC1836o7 f7789b;

            /* renamed from: c */
            private final int f7790c;

            /* renamed from: d */
            private final Exception f7791d;

            /* renamed from: e */
            private final byte[] f7792e;

            /* renamed from: f */
            private final Map f7793f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f7789b = this;
                this.f7790c = i;
                this.f7791d = exc;
                this.f7792e = bArr;
                this.f7793f = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7789b.m9634a(this.f7790c, this.f7791d, this.f7792e, this.f7793f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m9634a(int i, Exception exc, byte[] bArr, Map map) {
        this.f7917c.mo9468a(this.f7918d, i, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        byte[] m9500a;
        this.f7920f.mo9316b();
        int i = 0;
        try {
            httpURLConnection = this.f7920f.m9501a(this.f7916b);
            try {
                if (this.f7919e != null) {
                    for (Map.Entry<String, String> entry : this.f7919e.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                i = httpURLConnection.getResponseCode();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                try {
                    C1812m7 c1812m7 = this.f7920f;
                    m9500a = C1812m7.m9500a(httpURLConnection);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m9633b(i, null, m9500a, headerFields);
                } catch (IOException e) {
                    map2 = headerFields;
                    e = e;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m9633b(i, e, null, map2);
                } catch (Throwable th) {
                    map = headerFields;
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m9633b(i, null, null, map);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                map2 = null;
            } catch (Throwable th2) {
                th = th2;
                map = null;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }
}
