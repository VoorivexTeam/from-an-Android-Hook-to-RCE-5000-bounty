package p000;

import java.util.List;
import okio.GzipSource;
import okio.Okio;
import p000.a80;
import p000.g80;
import p000.i80;
import p000.y70;

/* loaded from: classes.dex */
public final class b90 implements a80 {

    /* renamed from: a */
    private final s70 f2751a;

    public b90(s70 s70Var) {
        this.f2751a = s70Var;
    }

    /* renamed from: a */
    private String m3345a(List<r70> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            r70 r70Var = list.get(i);
            sb.append(r70Var.m15220a());
            sb.append('=');
            sb.append(r70Var.m15222b());
        }
        return sb.toString();
    }

    @Override // p000.a80
    public i80 intercept(a80.InterfaceC0010a interfaceC0010a) {
        g80 mo99d = interfaceC0010a.mo99d();
        g80.C2502a m11924f = mo99d.m11924f();
        h80 m11918a = mo99d.m11918a();
        if (m11918a != null) {
            b80 mo3612b = m11918a.mo3612b();
            if (mo3612b != null) {
                m11924f.m11933b("Content-Type", mo3612b.toString());
            }
            long mo3610a = m11918a.mo3610a();
            if (mo3610a != -1) {
                m11924f.m11933b("Content-Length", Long.toString(mo3610a));
                m11924f.m11927a("Transfer-Encoding");
            } else {
                m11924f.m11933b("Transfer-Encoding", "chunked");
                m11924f.m11927a("Content-Length");
            }
        }
        boolean z = false;
        if (mo99d.m11919a("Host") == null) {
            m11924f.m11933b("Host", o80.m14447a(mo99d.m11925g(), false));
        }
        if (mo99d.m11919a("Connection") == null) {
            m11924f.m11933b("Connection", "Keep-Alive");
        }
        if (mo99d.m11919a("Accept-Encoding") == null && mo99d.m11919a("Range") == null) {
            z = true;
            m11924f.m11933b("Accept-Encoding", "gzip");
        }
        List<r70> mo15376a = this.f2751a.mo15376a(mo99d.m11925g());
        if (!mo15376a.isEmpty()) {
            m11924f.m11933b("Cookie", m3345a(mo15376a));
        }
        if (mo99d.m11919a("User-Agent") == null) {
            m11924f.m11933b("User-Agent", p80.m14738a());
        }
        i80 mo96a = interfaceC0010a.mo96a(m11924f.m11932a());
        f90.m11718a(this.f2751a, mo99d.m11925g(), mo96a.m12391f());
        i80.C2583a m12394j = mo96a.m12394j();
        m12394j.m12404a(mo99d);
        if (z && "gzip".equalsIgnoreCase(mo96a.m12386a("Content-Encoding")) && f90.m11720b(mo96a)) {
            GzipSource gzipSource = new GzipSource(mo96a.m12385a().mo12418e());
            y70.C3476a m16594a = mo96a.m12391f().m16594a();
            m16594a.m16601b("Content-Encoding");
            m16594a.m16601b("Content-Length");
            m12394j.m12410a(m16594a.m16600a());
            m12394j.m12406a(new i90(mo96a.m12386a("Content-Type"), -1L, Okio.buffer(gzipSource)));
        }
        return m12394j.m12411a();
    }
}
