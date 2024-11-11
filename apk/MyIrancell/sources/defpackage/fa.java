package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class fa {
    private ByteBuffer b;
    private ea c;
    private final byte[] a = new byte[256];
    private int d = 0;

    private int[] a(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.c.b = 1;
        }
        return iArr;
    }

    private void b(int i) {
        boolean z = false;
        while (!z && !c() && this.c.c <= i) {
            int d = d();
            if (d == 33) {
                int d2 = d();
                if (d2 != 1) {
                    if (d2 == 249) {
                        this.c.d = new da();
                        h();
                    } else if (d2 != 254 && d2 == 255) {
                        f();
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < 11; i2++) {
                            sb.append((char) this.a[i2]);
                        }
                        if (sb.toString().equals("NETSCAPE2.0")) {
                            k();
                        }
                    }
                }
                n();
            } else if (d == 44) {
                ea eaVar = this.c;
                if (eaVar.d == null) {
                    eaVar.d = new da();
                }
                e();
            } else if (d != 59) {
                this.c.b = 1;
            } else {
                z = true;
            }
        }
    }

    private boolean c() {
        return this.c.b != 0;
    }

    private int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    private void e() {
        this.c.d.a = l();
        this.c.d.b = l();
        this.c.d.c = l();
        this.c.d.d = l();
        int d = d();
        boolean z = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d & 7) + 1);
        this.c.d.e = (d & 64) != 0;
        da daVar = this.c.d;
        if (z) {
            daVar.k = a(pow);
        } else {
            daVar.k = null;
        }
        this.c.d.j = this.b.position();
        o();
        if (c()) {
            return;
        }
        ea eaVar = this.c;
        eaVar.c++;
        eaVar.e.add(eaVar.d);
    }

    private void f() {
        int d = d();
        this.d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.d) {
                try {
                    i2 = this.d - i;
                    this.b.get(this.a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        String str = "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.d;
                    }
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    private void g() {
        b(Integer.MAX_VALUE);
    }

    private void h() {
        d();
        int d = d();
        da daVar = this.c.d;
        int i = (d & 28) >> 2;
        daVar.g = i;
        if (i == 0) {
            daVar.g = 1;
        }
        this.c.d.f = (d & 1) != 0;
        int l = l();
        if (l < 2) {
            l = 10;
        }
        da daVar2 = this.c.d;
        daVar2.i = l * 10;
        daVar2.h = d();
        d();
    }

    private void i() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        j();
        if (!this.c.h || c()) {
            return;
        }
        ea eaVar = this.c;
        eaVar.a = a(eaVar.i);
        ea eaVar2 = this.c;
        eaVar2.l = eaVar2.a[eaVar2.j];
    }

    private void j() {
        this.c.f = l();
        this.c.g = l();
        this.c.h = (d() & 128) != 0;
        this.c.i = (int) Math.pow(2.0d, (r0 & 7) + 1);
        this.c.j = d();
        this.c.k = d();
    }

    private void k() {
        do {
            f();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!c());
    }

    private int l() {
        return this.b.getShort();
    }

    private void m() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new ea();
        this.d = 0;
    }

    private void n() {
        int d;
        do {
            d = d();
            this.b.position(Math.min(this.b.position() + d, this.b.limit()));
        } while (d > 0);
    }

    private void o() {
        d();
        n();
    }

    public fa a(ByteBuffer byteBuffer) {
        m();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    public ea b() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (c()) {
            return this.c;
        }
        i();
        if (!c()) {
            g();
            ea eaVar = this.c;
            if (eaVar.c < 0) {
                eaVar.b = 1;
            }
        }
        return this.c;
    }
}
