package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import defpackage.br;
import defpackage.cr;
import defpackage.er;
import defpackage.ks;
import defpackage.ns;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class o implements Closeable {
    private final URL b;
    private ks<Bitmap> c;
    private volatile InputStream d;

    private o(URL url) {
        this.b = url;
    }

    public static o a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new o(new URL(str));
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

    private final byte[] d() {
        URLConnection openConnection = this.b.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            this.d = inputStream;
            byte[] a = br.a(br.a(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = a.length;
                String valueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Downloaded ");
                sb.append(length);
                sb.append(" bytes from ");
                sb.append(valueOf);
                sb.toString();
            }
            if (a.length <= 1048576) {
                return a;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    er.a(th, th2);
                }
            }
            throw th;
        }
    }

    public final ks<Bitmap> a() {
        ks<Bitmap> ksVar = this.c;
        u.a(ksVar);
        return ksVar;
    }

    public final void a(Executor executor) {
        this.c = ns.a(executor, new Callable(this) { // from class: com.google.firebase.messaging.n
            private final o a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c();
            }
        });
    }

    public final Bitmap c() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        sb.toString();
        byte[] d = d();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(d, 0, d.length);
        if (decodeByteArray == null) {
            String valueOf2 = String.valueOf(this.b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf3 = String.valueOf(this.b);
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
            cr.a(this.d);
        } catch (NullPointerException unused) {
        }
    }
}
