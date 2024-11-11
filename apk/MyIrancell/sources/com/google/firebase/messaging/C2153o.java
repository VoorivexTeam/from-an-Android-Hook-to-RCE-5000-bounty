package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1057u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p000.AbstractC2871ks;
import p000.C0490br;
import p000.C2356cr;
import p000.C2442er;
import p000.C3000ns;

/* renamed from: com.google.firebase.messaging.o */
/* loaded from: classes.dex */
final class C2153o implements Closeable {

    /* renamed from: b */
    private final URL f9029b;

    /* renamed from: c */
    private AbstractC2871ks<Bitmap> f9030c;

    /* renamed from: d */
    private volatile InputStream f9031d;

    private C2153o(URL url) {
        this.f9029b = url;
    }

    /* renamed from: a */
    public static C2153o m10772a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C2153o(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Not downloading image, bad URL: ".concat(valueOf);
            } else {
                new String("Not downloading image, bad URL: ");
            }
            return null;
        }
    }

    /* renamed from: d */
    private final byte[] m10773d() {
        URLConnection openConnection = this.f9029b.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            this.f9031d = inputStream;
            byte[] m3439a = C0490br.m3439a(C0490br.m3438a(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = m3439a.length;
                String valueOf = String.valueOf(this.f9029b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Downloaded ");
                sb.append(length);
                sb.append(" bytes from ");
                sb.append(valueOf);
                sb.toString();
            }
            if (m3439a.length <= 1048576) {
                return m3439a;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    C2442er.m11632a(th, th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final AbstractC2871ks<Bitmap> m10774a() {
        AbstractC2871ks<Bitmap> abstractC2871ks = this.f9030c;
        C1057u.m7286a(abstractC2871ks);
        return abstractC2871ks;
    }

    /* renamed from: a */
    public final void m10775a(Executor executor) {
        this.f9030c = C3000ns.m14386a(executor, new Callable(this) { // from class: com.google.firebase.messaging.n

            /* renamed from: a */
            private final C2153o f9028a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9028a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9028a.m10776c();
            }
        });
    }

    /* renamed from: c */
    public final Bitmap m10776c() {
        String valueOf = String.valueOf(this.f9029b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        sb.toString();
        byte[] m10773d = m10773d();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m10773d, 0, m10773d.length);
        if (decodeByteArray == null) {
            String valueOf2 = String.valueOf(this.f9029b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf3 = String.valueOf(this.f9029b);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(valueOf3);
            sb3.toString();
        }
        return decodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            C2356cr.m11210a(this.f9031d);
        } catch (NullPointerException unused) {
        }
    }
}
