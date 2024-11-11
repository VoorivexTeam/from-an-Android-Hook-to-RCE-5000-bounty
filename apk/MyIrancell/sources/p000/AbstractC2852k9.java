package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* renamed from: k9 */
/* loaded from: classes.dex */
public abstract class AbstractC2852k9 implements Closeable {

    /* renamed from: h */
    private static final String[] f11665h = new String[128];

    /* renamed from: b */
    int f11666b;

    /* renamed from: c */
    int[] f11667c = new int[32];

    /* renamed from: d */
    String[] f11668d = new String[32];

    /* renamed from: e */
    int[] f11669e = new int[32];

    /* renamed from: f */
    boolean f11670f;

    /* renamed from: g */
    boolean f11671g;

    /* renamed from: k9$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final String[] f11672a;

        /* renamed from: b */
        final Options f11673b;

        private a(String[] strArr, Options options) {
            this.f11672a = strArr;
            this.f11673b = options;
        }

        /* renamed from: a */
        public static a m13650a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    AbstractC2852k9.m13633b(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.readByteString();
                }
                return new a((String[]) strArr.clone(), Options.m14634of(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: k9$b */
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
            f11665h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f11665h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: a */
    public static AbstractC2852k9 m13631a(BufferedSource bufferedSource) {
        return new C2928m9(bufferedSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m13633b(okio.BufferedSink r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = p000.AbstractC2852k9.f11665h
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC2852k9.m13633b(okio.BufferedSink, java.lang.String):void");
    }

    /* renamed from: a */
    public abstract int mo13634a(a aVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2807j9 m13635a(String str) {
        throw new C2807j9(str + " at path " + m13641f());
    }

    /* renamed from: a */
    public abstract void mo13636a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m13637a(int i) {
        int i2 = this.f11666b;
        int[] iArr = this.f11667c;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new C2584i9("Nesting too deep at " + m13641f());
            }
            this.f11667c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f11668d;
            this.f11668d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f11669e;
            this.f11669e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f11667c;
        int i3 = this.f11666b;
        this.f11666b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: c */
    public abstract void mo13638c();

    /* renamed from: d */
    public abstract void mo13639d();

    /* renamed from: e */
    public abstract void mo13640e();

    /* renamed from: f */
    public final String m13641f() {
        return C2889l9.m13832a(this.f11666b, this.f11667c, this.f11668d, this.f11669e);
    }

    /* renamed from: h */
    public abstract boolean mo13642h();

    /* renamed from: i */
    public abstract boolean mo13643i();

    /* renamed from: j */
    public abstract double mo13644j();

    /* renamed from: k */
    public abstract int mo13645k();

    /* renamed from: l */
    public abstract String mo13646l();

    /* renamed from: m */
    public abstract String mo13647m();

    /* renamed from: n */
    public abstract void mo13648n();

    /* renamed from: o */
    public abstract void mo13649o();

    public abstract b peek();
}
