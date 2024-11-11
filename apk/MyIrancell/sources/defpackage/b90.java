package defpackage;

import defpackage.a80;
import defpackage.g80;
import defpackage.i80;
import defpackage.y70;
import java.util.List;
import okio.GzipSource;
import okio.Okio;

/* loaded from: classes.dex */
public final class b90 implements a80 {
    private final s70 a;

    public b90(s70 s70Var) {
        this.a = s70Var;
    }

    private String a(List<r70> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            r70 r70Var = list.get(i);
            sb.append(r70Var.a());
            sb.append('=');
            sb.append(r70Var.b());
        }
        return sb.toString();
    }

    @Override // defpackage.a80
    public i80 intercept(a80.a aVar) {
        g80 d = aVar.d();
        g80.a f = d.f();
        h80 a = d.a();
        if (a != null) {
            b80 b = a.b();
            if (b != null) {
                f.b("Content-Type", b.toString());
            }
            long a2 = a.a();
            if (a2 != -1) {
                f.b("Content-Length", Long.toString(a2));
                f.a("Transfer-Encoding");
            } else {
                f.b("Transfer-Encoding", "chunked");
                f.a("Content-Length");
            }
        }
        boolean z = false;
        if (d.a("Host") == null) {
            f.b("Host", o80.a(d.g(), false));
        }
        if (d.a("Connection") == null) {
            f.b("Connection", "Keep-Alive");
        }
        if (d.a("Accept-Encoding") == null && d.a("Range") == null) {
            z = true;
            f.b("Accept-Encoding", "gzip");
        }
        List<r70> a3 = this.a.a(d.g());
        if (!a3.isEmpty()) {
            f.b("Cookie", a(a3));
        }
        if (d.a("User-Agent") == null) {
            f.b("User-Agent", p80.a());
        }
        i80 a4 = aVar.a(f.a());
        f90.a(this.a, d.g(), a4.f());
        i80.a j = a4.j();
        j.a(d);
        if (z && "gzip".equalsIgnoreCase(a4.a("Content-Encoding")) && f90.b(a4)) {
            GzipSource gzipSource = new GzipSource(a4.a().e());
            y70.a a5 = a4.f().a();
            a5.b("Content-Encoding");
            a5.b("Content-Length");
            j.a(a5.a());
            j.a(new i90(a4.a("Content-Type"), -1L, Okio.buffer(gzipSource)));
        }
        return j.a();
    }
}
