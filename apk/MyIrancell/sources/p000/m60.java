package p000;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

/* loaded from: classes.dex */
class m60 extends u60 {

    /* renamed from: i */
    private final p60 f12080i;

    /* renamed from: j */
    private final v50 f12081j;

    /* renamed from: k */
    private f60 f12082k;

    public m60(p60 p60Var, v50 v50Var) {
        super(p60Var, v50Var);
        this.f12081j = v50Var;
        this.f12080i = p60Var;
    }

    /* renamed from: a */
    private String m14048a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    private void m14049a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        while (true) {
            int m15733a = m15733a(bArr, j, 8192);
            if (m15733a == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, m15733a);
                j += m15733a;
            }
        }
    }

    /* renamed from: a */
    private boolean m14050a(l60 l60Var) {
        long mo14724a = this.f12080i.mo14724a();
        return (((mo14724a > 0L ? 1 : (mo14724a == 0L ? 0 : -1)) > 0) && l60Var.f11814c && ((float) l60Var.f11813b) > ((float) this.f12081j.mo3599a()) + (((float) mo14724a) * 0.2f)) ? false : true;
    }

    /* renamed from: b */
    private String m14051b(l60 l60Var) {
        String m14727c = this.f12080i.m14727c();
        boolean z = !TextUtils.isEmpty(m14727c);
        long mo3599a = this.f12081j.mo3603d() ? this.f12081j.mo3599a() : this.f12080i.mo14724a();
        boolean z2 = mo3599a >= 0;
        long j = l60Var.f11814c ? mo3599a - l60Var.f11813b : mo3599a;
        boolean z3 = z2 && l60Var.f11814c;
        StringBuilder sb = new StringBuilder();
        sb.append(l60Var.f11814c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z2 ? m14048a("Content-Length: %d\n", Long.valueOf(j)) : "");
        sb.append(z3 ? m14048a("Content-Range: bytes %d-%d/%d\n", Long.valueOf(l60Var.f11813b), Long.valueOf(mo3599a - 1), Long.valueOf(mo3599a)) : "");
        sb.append(z ? m14048a("Content-Type: %s\n", m14727c) : "");
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: b */
    private void m14052b(OutputStream outputStream, long j) {
        p60 p60Var = new p60(this.f12080i);
        try {
            p60Var.mo14725a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int mo14723a = p60Var.mo14723a(bArr);
                if (mo14723a == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, mo14723a);
            }
        } finally {
            p60Var.mo14726b();
        }
    }

    @Override // p000.u60
    /* renamed from: a */
    protected void mo14053a(int i) {
        f60 f60Var = this.f12082k;
        if (f60Var != null) {
            f60Var.mo11692a(this.f12081j.f13620b, this.f12080i.m14728d(), i);
        }
    }

    /* renamed from: a */
    public void m14054a(f60 f60Var) {
        this.f12082k = f60Var;
    }

    /* renamed from: a */
    public void m14055a(l60 l60Var, Socket socket) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(m14051b(l60Var).getBytes("UTF-8"));
        long j = l60Var.f11813b;
        if (m14050a(l60Var)) {
            m14049a(bufferedOutputStream, j);
        } else {
            m14052b(bufferedOutputStream, j);
        }
    }
}
