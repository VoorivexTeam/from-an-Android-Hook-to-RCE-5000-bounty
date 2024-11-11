package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.g;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class hd implements g {
    private final id b;
    private final URL c;
    private final String d;
    private String e;
    private URL f;
    private volatile byte[] g;
    private int h;

    public hd(String str) {
        this(str, id.a);
    }

    public hd(String str, id idVar) {
        this.c = null;
        ji.a(str);
        this.d = str;
        ji.a(idVar);
        this.b = idVar;
    }

    public hd(URL url) {
        this(url, id.a);
    }

    public hd(URL url, id idVar) {
        ji.a(url);
        this.c = url;
        this.d = null;
        ji.a(idVar);
        this.b = idVar;
    }

    private byte[] d() {
        if (this.g == null) {
            this.g = a().getBytes(g.a);
        }
        return this.g;
    }

    private String e() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.c;
                ji.a(url);
                str = url.toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    private URL f() {
        if (this.f == null) {
            this.f = new URL(e());
        }
        return this.f;
    }

    public String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        ji.a(url);
        return url.toString();
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public Map<String, String> b() {
        return this.b.a();
    }

    public URL c() {
        return f();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        return a().equals(hdVar.a()) && this.b.equals(hdVar.b);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.h == 0) {
            int hashCode = a().hashCode();
            this.h = hashCode;
            this.h = (hashCode * 31) + this.b.hashCode();
        }
        return this.h;
    }

    public String toString() {
        return a();
    }
}
