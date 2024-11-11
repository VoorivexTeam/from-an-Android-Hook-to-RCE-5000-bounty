package ir.tapsell.sdk.networkcacheutils;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.g50;

/* renamed from: ir.tapsell.sdk.networkcacheutils.i */
/* loaded from: classes.dex */
public class C2755i {

    /* renamed from: a */
    private Map<String, Bitmap> f11252a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));

    /* renamed from: b */
    private long f11253b = 0;

    /* renamed from: c */
    private long f11254c = 1000000;

    public C2755i() {
        m13130a(Runtime.getRuntime().maxMemory() / 4);
    }

    /* renamed from: b */
    private void m13126b() {
        try {
            if (this.f11252a == null || this.f11253b <= this.f11254c) {
                return;
            }
            Iterator<Map.Entry<String, Bitmap>> it = this.f11252a.entrySet().iterator();
            while (it.hasNext()) {
                this.f11253b -= m13127a(it.next().getValue());
                it.remove();
                if (this.f11253b <= this.f11254c) {
                    return;
                }
            }
        } catch (Throwable th) {
            g50.m11895a(th);
        }
    }

    /* renamed from: a */
    long m13127a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* renamed from: a */
    public Bitmap m13128a(String str) {
        if (this.f11252a == null) {
            this.f11252a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));
            m13130a(Runtime.getRuntime().maxMemory() / 4);
        }
        try {
            if (this.f11252a.containsKey(str)) {
                return this.f11252a.get(str);
            }
            return null;
        } catch (NullPointerException e) {
            g50.m11895a(e);
            return null;
        }
    }

    /* renamed from: a */
    public void m13129a() {
        try {
            this.f11252a.clear();
            this.f11253b = 0L;
        } catch (Throwable th) {
            g50.m11895a(th);
        }
    }

    /* renamed from: a */
    public void m13130a(long j) {
        this.f11254c = j;
    }

    /* renamed from: a */
    public void m13131a(String str, Bitmap bitmap) {
        try {
            if (this.f11252a.containsKey(str)) {
                this.f11253b -= m13127a(this.f11252a.get(str));
            }
            this.f11252a.put(str, bitmap);
            this.f11253b += m13127a(bitmap);
            m13126b();
        } catch (Throwable th) {
            g50.m11895a(th);
        }
    }

    /* renamed from: b */
    public void m13132b(String str) {
        if (str != null) {
            try {
                if (this.f11252a.containsKey(str)) {
                    this.f11253b -= m13127a(this.f11252a.get(str));
                    this.f11252a.remove(str);
                }
            } catch (Throwable th) {
                g50.m11895a(th);
            }
        }
    }
}
