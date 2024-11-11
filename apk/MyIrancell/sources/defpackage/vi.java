package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;

/* loaded from: classes.dex */
public class vi {
    private int a = 0;
    private byte b = 1;
    private int c = 1;
    private int d = -1;
    private int e = 106;
    private ByteArrayOutputStream f = new ByteArrayOutputStream();
    private si g = new si();

    private void a(ByteArrayOutputStream byteArrayOutputStream) {
        int size = this.f.size();
        a(byteArrayOutputStream, size);
        if (size > 0) {
            try {
                byteArrayOutputStream.write(this.f.toByteArray());
            } catch (IOException unused) {
                throw new wi(13, "Unable to write string table");
            }
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, int i) {
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

    private static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(str.getBytes());
        byteArrayOutputStream.write(0);
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, qi qiVar) {
        a(byteArrayOutputStream, (yi) qiVar);
        byteArrayOutputStream.write(qiVar.b());
        Vector<ri> d = qiVar.d();
        if (d != null) {
            for (int i = 0; i < d.size(); i++) {
                a(byteArrayOutputStream, d.elementAt(i));
            }
        }
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, ri riVar) {
        a(byteArrayOutputStream, (yi) riVar);
        if (riVar.d() == 0) {
            byteArrayOutputStream.write(riVar.c());
        } else {
            try {
                a(byteArrayOutputStream, riVar.b());
            } catch (IOException unused) {
                throw new wi(13, "Unable to write attribute value");
            }
        }
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, ui uiVar) {
        a(byteArrayOutputStream, (yi) uiVar);
        int f = uiVar.f();
        if (f != 0) {
            if (f == 1) {
                try {
                    a(byteArrayOutputStream, uiVar.h());
                    return;
                } catch (IOException unused) {
                    throw new wi(13, "Unable to write string element");
                }
            } else {
                if (f == 5) {
                    try {
                        byteArrayOutputStream.write(195);
                        if (uiVar.g() != null) {
                            a(byteArrayOutputStream, uiVar.g().length);
                            byteArrayOutputStream.write(uiVar.g());
                        } else {
                            a(byteArrayOutputStream, 0);
                        }
                        return;
                    } catch (IOException unused2) {
                        throw new wi(13, "Unable to write opaque data");
                    }
                }
                return;
            }
        }
        int j = uiVar.j();
        if (uiVar.e() > 0) {
            j |= 128;
        }
        if (uiVar.i() > 0) {
            j |= 64;
        }
        byteArrayOutputStream.write(j);
        for (int i = 0; i < uiVar.e(); i++) {
            a(byteArrayOutputStream, uiVar.b(i));
        }
        if ((j & 128) != 0) {
            byteArrayOutputStream.write(1);
        }
        for (int i2 = 0; i2 < uiVar.i(); i2++) {
            a(byteArrayOutputStream, uiVar.d(i2));
        }
        if ((j & 64) != 0) {
            byteArrayOutputStream.write(1);
        }
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, yi yiVar) {
        if (this.a != yiVar.a()) {
            this.a = yiVar.a();
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(this.a);
        }
    }

    private void b(ByteArrayOutputStream byteArrayOutputStream) {
        a(byteArrayOutputStream, this.g.a());
    }

    private void c(ByteArrayOutputStream byteArrayOutputStream) {
        int i = this.c;
        if (i == 0) {
            byteArrayOutputStream.write(0);
            i = this.d;
        }
        a(byteArrayOutputStream, i);
    }

    public qi a(ui uiVar, int i, int i2) {
        qi qiVar = new qi(i2);
        qiVar.a(i);
        uiVar.a(qiVar);
        return qiVar;
    }

    public ui a(ui uiVar, int i) {
        if (uiVar == null) {
            throw new wi(9, "Element without tagID cannot be the root element");
        }
        ui uiVar2 = new ui(i);
        uiVar.a(uiVar2);
        return uiVar2;
    }

    public void a(qi qiVar, String str, int i) {
        qiVar.a(str, i);
    }

    public byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.b);
        c(byteArrayOutputStream);
        a(byteArrayOutputStream, this.e);
        a(byteArrayOutputStream);
        b(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public ui b(ui uiVar, int i, int i2) {
        ui uiVar2 = new ui(i2);
        uiVar2.e(i);
        if (uiVar == null) {
            this.g.a(uiVar2);
        } else {
            uiVar.a(uiVar2);
        }
        return uiVar2;
    }
}
