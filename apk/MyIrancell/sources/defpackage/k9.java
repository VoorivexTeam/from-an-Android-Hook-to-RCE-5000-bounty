package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* loaded from: classes.dex */
public abstract class k9 implements Closeable {
    private static final String[] h = new String[128];
    int b;
    int[] c = new int[32];
    String[] d = new String[32];
    int[] e = new int[32];
    boolean f;
    boolean g;

    /* loaded from: classes.dex */
    public static final class a {
        final String[] a;
        final Options b;

        private a(String[] strArr, Options options) {
            this.a = strArr;
            this.b = options;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    k9.b(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.readByteString();
                }
                return new a((String[]) strArr.clone(), Options.of(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static k9 a(BufferedSource bufferedSource) {
        return new m9(bufferedSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(okio.BufferedSink r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = defpackage.k9.h
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.writeUtf8(r8, r4, r3)
        L2e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.writeUtf8(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9.b(okio.BufferedSink, java.lang.String):void");
    }

    public abstract int a(a aVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j9 a(String str) {
        throw new j9(str + " at path " + f());
    }

    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new i9("Nesting too deep at " + f());
            }
            this.c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.d;
            this.d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.e;
            this.e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public final String f() {
        return l9.a(this.b, this.c, this.d, this.e);
    }

    public abstract boolean h();

    public abstract boolean i();

    public abstract double j();

    public abstract int k();

    public abstract String l();

    public abstract String m();

    public abstract void n();

    public abstract void o();

    public abstract b peek();
}
