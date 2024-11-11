package ir.tapsell.sdk.networkcacheutils;

import android.graphics.Bitmap;
import defpackage.g50;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i {
    private Map<String, Bitmap> a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));
    private long b = 0;
    private long c = 1000000;

    public i() {
        a(Runtime.getRuntime().maxMemory() / 4);
    }

    private void b() {
        try {
            if (this.a == null || this.b <= this.c) {
                return;
            }
            Iterator<Map.Entry<String, Bitmap>> it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                this.b -= a(it.next().getValue());
                it.remove();
                if (this.b <= this.c) {
                    return;
                }
            }
        } catch (Throwable th) {
            g50.a(th);
        }
    }

    long a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public Bitmap a(String str) {
        if (this.a == null) {
            this.a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));
            a(Runtime.getRuntime().maxMemory() / 4);
        }
        try {
            if (this.a.containsKey(str)) {
                return this.a.get(str);
            }
            return null;
        } catch (NullPointerException e) {
            g50.a(e);
            return null;
        }
    }

    public void a() {
        try {
            this.a.clear();
            this.b = 0L;
        } catch (Throwable th) {
            g50.a(th);
        }
    }

    public void a(long j) {
        this.c = j;
    }

    public void a(String str, Bitmap bitmap) {
        try {
            if (this.a.containsKey(str)) {
                this.b -= a(this.a.get(str));
            }
            this.a.put(str, bitmap);
            this.b += a(bitmap);
            b();
        } catch (Throwable th) {
            g50.a(th);
        }
    }

    public void b(String str) {
        if (str != null) {
            try {
                if (this.a.containsKey(str)) {
                    this.b -= a(this.a.get(str));
                    this.a.remove(str);
                }
            } catch (Throwable th) {
                g50.a(th);
            }
        }
    }
}
