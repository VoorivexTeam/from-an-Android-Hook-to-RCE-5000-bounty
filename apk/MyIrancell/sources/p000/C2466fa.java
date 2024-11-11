package p000;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: fa */
/* loaded from: classes.dex */
public class C2466fa {

    /* renamed from: b */
    private ByteBuffer f10109b;

    /* renamed from: c */
    private C2423ea f10110c;

    /* renamed from: a */
    private final byte[] f10108a = new byte[256];

    /* renamed from: d */
    private int f10111d = 0;

    /* renamed from: a */
    private int[] m11721a(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f10109b.get(bArr);
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
            this.f10110c.f9952b = 1;
        }
        return iArr;
    }

    /* renamed from: b */
    private void m11722b(int i) {
        boolean z = false;
        while (!z && !m11723c() && this.f10110c.f9953c <= i) {
            int m11724d = m11724d();
            if (m11724d == 33) {
                int m11724d2 = m11724d();
                if (m11724d2 != 1) {
                    if (m11724d2 == 249) {
                        this.f10110c.f9954d = new C2381da();
                        m11728h();
                    } else if (m11724d2 != 254 && m11724d2 == 255) {
                        m11726f();
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < 11; i2++) {
                            sb.append((char) this.f10108a[i2]);
                        }
                        if (sb.toString().equals("NETSCAPE2.0")) {
                            m11731k();
                        }
                    }
                }
                m11734n();
            } else if (m11724d == 44) {
                C2423ea c2423ea = this.f10110c;
                if (c2423ea.f9954d == null) {
                    c2423ea.f9954d = new C2381da();
                }
                m11725e();
            } else if (m11724d != 59) {
                this.f10110c.f9952b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: c */
    private boolean m11723c() {
        return this.f10110c.f9952b != 0;
    }

    /* renamed from: d */
    private int m11724d() {
        try {
            return this.f10109b.get() & 255;
        } catch (Exception unused) {
            this.f10110c.f9952b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m11725e() {
        this.f10110c.f9954d.f9776a = m11732l();
        this.f10110c.f9954d.f9777b = m11732l();
        this.f10110c.f9954d.f9778c = m11732l();
        this.f10110c.f9954d.f9779d = m11732l();
        int m11724d = m11724d();
        boolean z = (m11724d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (m11724d & 7) + 1);
        this.f10110c.f9954d.f9780e = (m11724d & 64) != 0;
        C2381da c2381da = this.f10110c.f9954d;
        if (z) {
            c2381da.f9786k = m11721a(pow);
        } else {
            c2381da.f9786k = null;
        }
        this.f10110c.f9954d.f9785j = this.f10109b.position();
        m11735o();
        if (m11723c()) {
            return;
        }
        C2423ea c2423ea = this.f10110c;
        c2423ea.f9953c++;
        c2423ea.f9955e.add(c2423ea.f9954d);
    }

    /* renamed from: f */
    private void m11726f() {
        int m11724d = m11724d();
        this.f10111d = m11724d;
        if (m11724d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f10111d) {
                try {
                    i2 = this.f10111d - i;
                    this.f10109b.get(this.f10108a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        String str = "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f10111d;
                    }
                    this.f10110c.f9952b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m11727g() {
        m11722b(Integer.MAX_VALUE);
    }

    /* renamed from: h */
    private void m11728h() {
        m11724d();
        int m11724d = m11724d();
        C2381da c2381da = this.f10110c.f9954d;
        int i = (m11724d & 28) >> 2;
        c2381da.f9782g = i;
        if (i == 0) {
            c2381da.f9782g = 1;
        }
        this.f10110c.f9954d.f9781f = (m11724d & 1) != 0;
        int m11732l = m11732l();
        if (m11732l < 2) {
            m11732l = 10;
        }
        C2381da c2381da2 = this.f10110c.f9954d;
        c2381da2.f9784i = m11732l * 10;
        c2381da2.f9783h = m11724d();
        m11724d();
    }

    /* renamed from: i */
    private void m11729i() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m11724d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f10110c.f9952b = 1;
            return;
        }
        m11730j();
        if (!this.f10110c.f9958h || m11723c()) {
            return;
        }
        C2423ea c2423ea = this.f10110c;
        c2423ea.f9951a = m11721a(c2423ea.f9959i);
        C2423ea c2423ea2 = this.f10110c;
        c2423ea2.f9962l = c2423ea2.f9951a[c2423ea2.f9960j];
    }

    /* renamed from: j */
    private void m11730j() {
        this.f10110c.f9956f = m11732l();
        this.f10110c.f9957g = m11732l();
        this.f10110c.f9958h = (m11724d() & 128) != 0;
        this.f10110c.f9959i = (int) Math.pow(2.0d, (r0 & 7) + 1);
        this.f10110c.f9960j = m11724d();
        this.f10110c.f9961k = m11724d();
    }

    /* renamed from: k */
    private void m11731k() {
        do {
            m11726f();
            byte[] bArr = this.f10108a;
            if (bArr[0] == 1) {
                this.f10110c.f9963m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f10111d <= 0) {
                return;
            }
        } while (!m11723c());
    }

    /* renamed from: l */
    private int m11732l() {
        return this.f10109b.getShort();
    }

    /* renamed from: m */
    private void m11733m() {
        this.f10109b = null;
        Arrays.fill(this.f10108a, (byte) 0);
        this.f10110c = new C2423ea();
        this.f10111d = 0;
    }

    /* renamed from: n */
    private void m11734n() {
        int m11724d;
        do {
            m11724d = m11724d();
            this.f10109b.position(Math.min(this.f10109b.position() + m11724d, this.f10109b.limit()));
        } while (m11724d > 0);
    }

    /* renamed from: o */
    private void m11735o() {
        m11724d();
        m11734n();
    }

    /* renamed from: a */
    public C2466fa m11736a(ByteBuffer byteBuffer) {
        m11733m();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f10109b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f10109b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: a */
    public void m11737a() {
        this.f10109b = null;
        this.f10110c = null;
    }

    /* renamed from: b */
    public C2423ea m11738b() {
        if (this.f10109b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m11723c()) {
            return this.f10110c;
        }
        m11729i();
        if (!m11723c()) {
            m11727g();
            C2423ea c2423ea = this.f10110c;
            if (c2423ea.f9953c < 0) {
                c2423ea.f9952b = 1;
            }
        }
        return this.f10110c;
    }
}
