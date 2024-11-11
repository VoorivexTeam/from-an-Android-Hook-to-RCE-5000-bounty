package defpackage;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

/* loaded from: classes.dex */
class m60 extends u60 {
    private final p60 i;
    private final v50 j;
    private f60 k;

    public m60(p60 p60Var, v50 v50Var) {
        super(p60Var, v50Var);
        this.j = v50Var;
        this.i = p60Var;
    }

    private String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    private void a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        while (true) {
            int a = a(bArr, j, 8192);
            if (a == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, a);
                j += a;
            }
        }
    }

    private boolean a(l60 l60Var) {
        long a = this.i.a();
        return (((a > 0L ? 1 : (a == 0L ? 0 : -1)) > 0) && l60Var.c && ((float) l60Var.b) > ((float) this.j.a()) + (((float) a) * 0.2f)) ? false : true;
    }

    private String b(l60 l60Var) {
        String c = this.i.c();
        boolean z = !TextUtils.isEmpty(c);
        long a = this.j.d() ? this.j.a() : this.i.a();
        boolean z2 = a >= 0;
        long j = l60Var.c ? a - l60Var.b : a;
        boolean z3 = z2 && l60Var.c;
        StringBuilder sb = new StringBuilder();
        sb.append(l60Var.c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z2 ? a("Content-Length: %d\n", Long.valueOf(j)) : "");
        sb.append(z3 ? a("Content-Range: bytes %d-%d/%d\n", Long.valueOf(l60Var.b), Long.valueOf(a - 1), Long.valueOf(a)) : "");
        sb.append(z ? a("Content-Type: %s\n", c) : "");
        sb.append("\n");
        return sb.toString();
    }

    private void b(OutputStream outputStream, long j) {
        p60 p60Var = new p60(this.i);
        try {
            p60Var.a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int a = p60Var.a(bArr);
                if (a == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, a);
            }
        } finally {
            p60Var.b();
        }
    }

    @Override // defpackage.u60
    protected void a(int i) {
        f60 f60Var = this.k;
        if (f60Var != null) {
            f60Var.a(this.j.b, this.i.d(), i);
        }
    }

    public void a(f60 f60Var) {
        this.k = f60Var;
    }

    public void a(l60 l60Var, Socket socket) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(b(l60Var).getBytes("UTF-8"));
        long j = l60Var.b;
        if (a(l60Var)) {
            a(bufferedOutputStream, j);
        } else {
            b(bufferedOutputStream, j);
        }
    }
}
