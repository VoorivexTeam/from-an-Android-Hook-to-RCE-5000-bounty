package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;

/* renamed from: vi */
/* loaded from: classes.dex */
public class C3360vi {

    /* renamed from: a */
    private int f13689a = 0;

    /* renamed from: b */
    private byte f13690b = 1;

    /* renamed from: c */
    private int f13691c = 1;

    /* renamed from: d */
    private int f13692d = -1;

    /* renamed from: e */
    private int f13693e = 106;

    /* renamed from: f */
    private ByteArrayOutputStream f13694f = new ByteArrayOutputStream();

    /* renamed from: g */
    private C3211si f13695g = new C3211si();

    /* renamed from: a */
    private void m16020a(ByteArrayOutputStream byteArrayOutputStream) {
        int size = this.f13694f.size();
        m16021a(byteArrayOutputStream, size);
        if (size > 0) {
            try {
                byteArrayOutputStream.write(this.f13694f.toByteArray());
            } catch (IOException unused) {
                throw new C3399wi(13, "Unable to write string table");
            }
        }
    }

    /* renamed from: a */
    private static void m16021a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byte[] bArr = new byte[5];
        int i2 = 0;
        while (i > 0) {
            bArr[i2] = (byte) (i & 127);
            if (i2 != 0) {
                bArr[i2] = (byte) (bArr[i2] | 128);
            }
            i2++;
            i >>= 7;
        }
        if (i2 <= 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteArrayOutputStream.write(bArr[(i2 - i3) - 1]);
        }
    }

    /* renamed from: a */
    private static void m16022a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(str.getBytes());
        byteArrayOutputStream.write(0);
    }

    /* renamed from: a */
    private void m16023a(ByteArrayOutputStream byteArrayOutputStream, C3128qi c3128qi) {
        m16026a(byteArrayOutputStream, (AbstractC3488yi) c3128qi);
        byteArrayOutputStream.write(c3128qi.m15101b());
        Vector<C3167ri> m15103d = c3128qi.m15103d();
        if (m15103d != null) {
            for (int i = 0; i < m15103d.size(); i++) {
                m16024a(byteArrayOutputStream, m15103d.elementAt(i));
            }
        }
    }

    /* renamed from: a */
    private void m16024a(ByteArrayOutputStream byteArrayOutputStream, C3167ri c3167ri) {
        m16026a(byteArrayOutputStream, (AbstractC3488yi) c3167ri);
        if (c3167ri.m15278d() == 0) {
            byteArrayOutputStream.write(c3167ri.m15277c());
        } else {
            try {
                m16022a(byteArrayOutputStream, c3167ri.m15276b());
            } catch (IOException unused) {
                throw new C3399wi(13, "Unable to write attribute value");
            }
        }
    }

    /* renamed from: a */
    private void m16025a(ByteArrayOutputStream byteArrayOutputStream, C3307ui c3307ui) {
        m16026a(byteArrayOutputStream, (AbstractC3488yi) c3307ui);
        int m15824f = c3307ui.m15824f();
        if (m15824f != 0) {
            if (m15824f == 1) {
                try {
                    m16022a(byteArrayOutputStream, c3307ui.m15826h());
                    return;
                } catch (IOException unused) {
                    throw new C3399wi(13, "Unable to write string element");
                }
            } else {
                if (m15824f == 5) {
                    try {
                        byteArrayOutputStream.write(195);
                        if (c3307ui.m15825g() != null) {
                            m16021a(byteArrayOutputStream, c3307ui.m15825g().length);
                            byteArrayOutputStream.write(c3307ui.m15825g());
                        } else {
                            m16021a(byteArrayOutputStream, 0);
                        }
                        return;
                    } catch (IOException unused2) {
                        throw new C3399wi(13, "Unable to write opaque data");
                    }
                }
                return;
            }
        }
        int m15828j = c3307ui.m15828j();
        if (c3307ui.m15822e() > 0) {
            m15828j |= 128;
        }
        if (c3307ui.m15827i() > 0) {
            m15828j |= 64;
        }
        byteArrayOutputStream.write(m15828j);
        for (int i = 0; i < c3307ui.m15822e(); i++) {
            m16023a(byteArrayOutputStream, c3307ui.m15816b(i));
        }
        if ((m15828j & 128) != 0) {
            byteArrayOutputStream.write(1);
        }
        for (int i2 = 0; i2 < c3307ui.m15827i(); i2++) {
            m16025a(byteArrayOutputStream, c3307ui.m15821d(i2));
        }
        if ((m15828j & 64) != 0) {
            byteArrayOutputStream.write(1);
        }
    }

    /* renamed from: a */
    private void m16026a(ByteArrayOutputStream byteArrayOutputStream, AbstractC3488yi abstractC3488yi) {
        if (this.f13689a != abstractC3488yi.m16630a()) {
            this.f13689a = abstractC3488yi.m16630a();
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(this.f13689a);
        }
    }

    /* renamed from: b */
    private void m16027b(ByteArrayOutputStream byteArrayOutputStream) {
        m16025a(byteArrayOutputStream, this.f13695g.m15435a());
    }

    /* renamed from: c */
    private void m16028c(ByteArrayOutputStream byteArrayOutputStream) {
        int i = this.f13691c;
        if (i == 0) {
            byteArrayOutputStream.write(0);
            i = this.f13692d;
        }
        m16021a(byteArrayOutputStream, i);
    }

    /* renamed from: a */
    public C3128qi m16029a(C3307ui c3307ui, int i, int i2) {
        C3128qi c3128qi = new C3128qi(i2);
        c3128qi.m15097a(i);
        c3307ui.m15812a(c3128qi);
        return c3128qi;
    }

    /* renamed from: a */
    public C3307ui m16030a(C3307ui c3307ui, int i) {
        if (c3307ui == null) {
            throw new C3399wi(9, "Element without tagID cannot be the root element");
        }
        C3307ui c3307ui2 = new C3307ui(i);
        c3307ui.m15813a(c3307ui2);
        return c3307ui2;
    }

    /* renamed from: a */
    public void m16031a(C3128qi c3128qi, String str, int i) {
        c3128qi.m15100a(str, i);
    }

    /* renamed from: a */
    public byte[] m16032a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.f13690b);
        m16028c(byteArrayOutputStream);
        m16021a(byteArrayOutputStream, this.f13693e);
        m16020a(byteArrayOutputStream);
        m16027b(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public C3307ui m16033b(C3307ui c3307ui, int i, int i2) {
        C3307ui c3307ui2 = new C3307ui(i2);
        c3307ui2.m15823e(i);
        if (c3307ui == null) {
            this.f13695g.m15437a(c3307ui2);
        } else {
            c3307ui.m15813a(c3307ui2);
        }
        return c3307ui2;
    }
}
