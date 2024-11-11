package p000;

import java.io.Writer;

/* renamed from: r1 */
/* loaded from: classes.dex */
public class C3148r1 extends Writer {

    /* renamed from: b */
    private final String f12858b;

    /* renamed from: c */
    private StringBuilder f12859c = new StringBuilder(128);

    public C3148r1(String str) {
        this.f12858b = str;
    }

    /* renamed from: a */
    private void m15164a() {
        if (this.f12859c.length() > 0) {
            this.f12859c.toString();
            StringBuilder sb = this.f12859c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m15164a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m15164a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m15164a();
            } else {
                this.f12859c.append(c);
            }
        }
    }
}
