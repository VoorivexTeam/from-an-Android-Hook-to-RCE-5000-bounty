package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o7 implements Runnable {
    private final URL b;
    private final l7 c;
    private final String d;
    private final Map<String, String> e;
    private final /* synthetic */ m7 f;

    public o7(m7 m7Var, String str, URL url, byte[] bArr, Map<String, String> map, l7 l7Var) {
        this.f = m7Var;
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.a(url);
        com.google.android.gms.common.internal.u.a(l7Var);
        this.b = url;
        this.c = l7Var;
        this.d = str;
        this.e = null;
    }

    private final void b(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f.g().a(new Runnable(this, i, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.n7
            private final o7 b;
            private final int c;
            private final Exception d;
            private final byte[] e;
            private final Map f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = this;
                this.c = i;
                this.d = exc;
                this.e = bArr;
                this.f = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.a(this.c, this.d, this.e, this.f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.c.a(this.d, i, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        byte[] a;
        this.f.b();
        int i = 0;
        try {
            httpURLConnection = this.f.a(this.b);
            try {
                if (this.e != null) {
                    for (Map.Entry<String, String> entry : this.e.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                i = httpURLConnection.getResponseCode();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                try {
                    m7 m7Var = this.f;
                    a = m7.a(httpURLConnection);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i, null, a, headerFields);
                } catch (IOException e) {
                    map2 = headerFields;
                    e = e;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i, e, null, map2);
                } catch (Throwable th) {
                    map = headerFields;
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i, null, null, map);
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
