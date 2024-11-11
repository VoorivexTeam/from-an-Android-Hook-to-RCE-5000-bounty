package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.InterfaceC0573g;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: hd */
/* loaded from: classes.dex */
public class C2549hd implements InterfaceC0573g {

    /* renamed from: b */
    private final InterfaceC2591id f10472b;

    /* renamed from: c */
    private final URL f10473c;

    /* renamed from: d */
    private final String f10474d;

    /* renamed from: e */
    private String f10475e;

    /* renamed from: f */
    private URL f10476f;

    /* renamed from: g */
    private volatile byte[] f10477g;

    /* renamed from: h */
    private int f10478h;

    public C2549hd(String str) {
        this(str, InterfaceC2591id.f10621a);
    }

    public C2549hd(String str, InterfaceC2591id interfaceC2591id) {
        this.f10473c = null;
        C2816ji.m13461a(str);
        this.f10474d = str;
        C2816ji.m13459a(interfaceC2591id);
        this.f10472b = interfaceC2591id;
    }

    public C2549hd(URL url) {
        this(url, InterfaceC2591id.f10621a);
    }

    public C2549hd(URL url, InterfaceC2591id interfaceC2591id) {
        C2816ji.m13459a(url);
        this.f10473c = url;
        this.f10474d = null;
        C2816ji.m13459a(interfaceC2591id);
        this.f10472b = interfaceC2591id;
    }

    /* renamed from: d */
    private byte[] m12208d() {
        if (this.f10477g == null) {
            this.f10477g = m12211a().getBytes(InterfaceC0573g.f3278a);
        }
        return this.f10477g;
    }

    /* renamed from: e */
    private String m12209e() {
        if (TextUtils.isEmpty(this.f10475e)) {
            String str = this.f10474d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f10473c;
                C2816ji.m13459a(url);
                str = url.toString();
            }
            this.f10475e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f10475e;
    }

    /* renamed from: f */
    private URL m12210f() {
        if (this.f10476f == null) {
            this.f10476f = new URL(m12209e());
        }
        return this.f10476f;
    }

    /* renamed from: a */
    public String m12211a() {
        String str = this.f10474d;
        if (str != null) {
            return str;
        }
        URL url = this.f10473c;
        C2816ji.m13459a(url);
        return url.toString();
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    /* renamed from: a */
    public void mo3954a(MessageDigest messageDigest) {
        messageDigest.update(m12208d());
    }

    /* renamed from: b */
    public Map<String, String> m12212b() {
        return this.f10472b.mo12447a();
    }

    /* renamed from: c */
    public URL m12213c() {
        return m12210f();
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public boolean equals(Object obj) {
        if (!(obj instanceof C2549hd)) {
            return false;
        }
        C2549hd c2549hd = (C2549hd) obj;
        return m12211a().equals(c2549hd.m12211a()) && this.f10472b.equals(c2549hd.f10472b);
    }

    @Override // com.bumptech.glide.load.InterfaceC0573g
    public int hashCode() {
        if (this.f10478h == 0) {
            int hashCode = m12211a().hashCode();
            this.f10478h = hashCode;
            this.f10478h = (hashCode * 31) + this.f10472b.hashCode();
        }
        return this.f10478h;
    }

    public String toString() {
        return m12211a();
    }
}
