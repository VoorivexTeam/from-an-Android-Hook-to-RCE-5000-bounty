package p000;

import android.content.res.AssetManager;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: k3 */
/* loaded from: classes.dex */
public class C2840k3 {

    /* renamed from: A */
    private static final c f11585A;

    /* renamed from: B */
    private static final c[] f11586B;

    /* renamed from: C */
    private static final c[] f11587C;

    /* renamed from: D */
    private static final c[] f11588D;

    /* renamed from: E */
    private static final c[] f11589E;

    /* renamed from: F */
    static final c[][] f11590F;

    /* renamed from: G */
    private static final c[] f11591G;

    /* renamed from: H */
    private static final HashMap<Integer, c>[] f11592H;

    /* renamed from: I */
    private static final HashMap<String, c>[] f11593I;

    /* renamed from: J */
    private static final HashSet<String> f11594J;

    /* renamed from: K */
    private static final HashMap<Integer, Integer> f11595K;

    /* renamed from: L */
    static final Charset f11596L;

    /* renamed from: M */
    static final byte[] f11597M;

    /* renamed from: m */
    public static final int[] f11598m;

    /* renamed from: n */
    public static final int[] f11599n;

    /* renamed from: o */
    static final byte[] f11600o;

    /* renamed from: p */
    private static final byte[] f11601p;

    /* renamed from: q */
    private static final byte[] f11602q;

    /* renamed from: r */
    private static SimpleDateFormat f11603r;

    /* renamed from: s */
    static final String[] f11604s;

    /* renamed from: t */
    static final int[] f11605t;

    /* renamed from: u */
    static final byte[] f11606u;

    /* renamed from: v */
    private static final c[] f11607v;

    /* renamed from: w */
    private static final c[] f11608w;

    /* renamed from: x */
    private static final c[] f11609x;

    /* renamed from: y */
    private static final c[] f11610y;

    /* renamed from: z */
    private static final c[] f11611z;

    /* renamed from: a */
    private final String f11612a;

    /* renamed from: b */
    private final AssetManager.AssetInputStream f11613b;

    /* renamed from: c */
    private int f11614c;

    /* renamed from: d */
    private final HashMap<String, b>[] f11615d = new HashMap[f11590F.length];

    /* renamed from: e */
    private Set<Integer> f11616e = new HashSet(f11590F.length);

    /* renamed from: f */
    private ByteOrder f11617f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g */
    private int f11618g;

    /* renamed from: h */
    private int f11619h;

    /* renamed from: i */
    private int f11620i;

    /* renamed from: j */
    private int f11621j;

    /* renamed from: k */
    private int f11622k;

    /* renamed from: l */
    private int f11623l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k3$a */
    /* loaded from: classes.dex */
    public static class a extends InputStream implements DataInput {

        /* renamed from: f */
        private static final ByteOrder f11624f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g */
        private static final ByteOrder f11625g = ByteOrder.BIG_ENDIAN;

        /* renamed from: b */
        private DataInputStream f11626b;

        /* renamed from: c */
        private ByteOrder f11627c;

        /* renamed from: d */
        final int f11628d;

        /* renamed from: e */
        int f11629e;

        public a(InputStream inputStream) {
            this.f11627c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f11626b = dataInputStream;
            int available = dataInputStream.available();
            this.f11628d = available;
            this.f11629e = 0;
            this.f11626b.mark(available);
        }

        public a(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        /* renamed from: a */
        public long m13575a() {
            return readInt() & 4294967295L;
        }

        /* renamed from: a */
        public void m13576a(long j) {
            int i = this.f11629e;
            if (i > j) {
                this.f11629e = 0;
                this.f11626b.reset();
                this.f11626b.mark(this.f11628d);
            } else {
                j -= i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: a */
        public void m13577a(ByteOrder byteOrder) {
            this.f11627c = byteOrder;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f11626b.available();
        }

        public int peek() {
            return this.f11629e;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f11629e++;
            return this.f11626b.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = this.f11626b.read(bArr, i, i2);
            this.f11629e += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f11629e++;
            return this.f11626b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            int i = this.f11629e + 1;
            this.f11629e = i;
            if (i > this.f11628d) {
                throw new EOFException();
            }
            int read = this.f11626b.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f11629e += 2;
            return this.f11626b.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            int length = this.f11629e + bArr.length;
            this.f11629e = length;
            if (length > this.f11628d) {
                throw new EOFException();
            }
            if (this.f11626b.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            int i3 = this.f11629e + i2;
            this.f11629e = i3;
            if (i3 > this.f11628d) {
                throw new EOFException();
            }
            if (this.f11626b.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() {
            int i = this.f11629e + 4;
            this.f11629e = i;
            if (i > this.f11628d) {
                throw new EOFException();
            }
            int read = this.f11626b.read();
            int read2 = this.f11626b.read();
            int read3 = this.f11626b.read();
            int read4 = this.f11626b.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f11627c;
            if (byteOrder == f11624f) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f11625g) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f11627c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            int i = this.f11629e + 8;
            this.f11629e = i;
            if (i > this.f11628d) {
                throw new EOFException();
            }
            int read = this.f11626b.read();
            int read2 = this.f11626b.read();
            int read3 = this.f11626b.read();
            int read4 = this.f11626b.read();
            int read5 = this.f11626b.read();
            int read6 = this.f11626b.read();
            int read7 = this.f11626b.read();
            int read8 = this.f11626b.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f11627c;
            if (byteOrder == f11624f) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f11625g) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f11627c);
        }

        @Override // java.io.DataInput
        public short readShort() {
            int i = this.f11629e + 2;
            this.f11629e = i;
            if (i > this.f11628d) {
                throw new EOFException();
            }
            int read = this.f11626b.read();
            int read2 = this.f11626b.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f11627c;
            if (byteOrder == f11624f) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f11625g) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f11627c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f11629e += 2;
            return this.f11626b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f11629e++;
            return this.f11626b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            int i = this.f11629e + 2;
            this.f11629e = i;
            if (i > this.f11628d) {
                throw new EOFException();
            }
            int read = this.f11626b.read();
            int read2 = this.f11626b.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f11627c;
            if (byteOrder == f11624f) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f11625g) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f11627c);
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            int min = Math.min(i, this.f11628d - this.f11629e);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f11626b.skipBytes(min - i2);
            }
            this.f11629e += i2;
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k3$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final int f11630a;

        /* renamed from: b */
        public final int f11631b;

        /* renamed from: c */
        public final byte[] f11632c;

        b(int i, int i2, byte[] bArr) {
            this.f11630a = i;
            this.f11631b = i2;
            this.f11632c = bArr;
        }

        /* renamed from: a */
        public static b m13578a(int i, ByteOrder byteOrder) {
            return m13582a(new int[]{i}, byteOrder);
        }

        /* renamed from: a */
        public static b m13579a(long j, ByteOrder byteOrder) {
            return m13583a(new long[]{j}, byteOrder);
        }

        /* renamed from: a */
        public static b m13580a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C2840k3.f11596L);
            return new b(2, bytes.length, bytes);
        }

        /* renamed from: a */
        public static b m13581a(d dVar, ByteOrder byteOrder) {
            return m13584a(new d[]{dVar}, byteOrder);
        }

        /* renamed from: a */
        public static b m13582a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2840k3.f11605t[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new b(3, iArr.length, wrap.array());
        }

        /* renamed from: a */
        public static b m13583a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2840k3.f11605t[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new b(4, jArr.length, wrap.array());
        }

        /* renamed from: a */
        public static b m13584a(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2840k3.f11605t[5] * dVarArr.length]);
            wrap.order(byteOrder);
            for (d dVar : dVarArr) {
                wrap.putInt((int) dVar.f11637a);
                wrap.putInt((int) dVar.f11638b);
            }
            return new b(5, dVarArr.length, wrap.array());
        }

        /* renamed from: a */
        public double m13585a(ByteOrder byteOrder) {
            Object m13588d = m13588d(byteOrder);
            if (m13588d == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (m13588d instanceof String) {
                return Double.parseDouble((String) m13588d);
            }
            if (m13588d instanceof long[]) {
                if (((long[]) m13588d).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m13588d instanceof int[]) {
                if (((int[]) m13588d).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m13588d instanceof double[]) {
                double[] dArr = (double[]) m13588d;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m13588d instanceof d[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            d[] dVarArr = (d[]) m13588d;
            if (dVarArr.length == 1) {
                return dVarArr[0].m13590a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: b */
        public int m13586b(ByteOrder byteOrder) {
            Object m13588d = m13588d(byteOrder);
            if (m13588d == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (m13588d instanceof String) {
                return Integer.parseInt((String) m13588d);
            }
            if (m13588d instanceof long[]) {
                long[] jArr = (long[]) m13588d;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m13588d instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) m13588d;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: c */
        public String m13587c(ByteOrder byteOrder) {
            Object m13588d = m13588d(byteOrder);
            if (m13588d == null) {
                return null;
            }
            if (m13588d instanceof String) {
                return (String) m13588d;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (m13588d instanceof long[]) {
                long[] jArr = (long[]) m13588d;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (m13588d instanceof int[]) {
                int[] iArr = (int[]) m13588d;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (m13588d instanceof double[]) {
                double[] dArr = (double[]) m13588d;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(m13588d instanceof d[])) {
                return null;
            }
            d[] dVarArr = (d[]) m13588d;
            while (i < dVarArr.length) {
                sb.append(dVarArr[i].f11637a);
                sb.append('/');
                sb.append(dVarArr[i].f11638b);
                i++;
                if (i != dVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* renamed from: d */
        Object m13588d(ByteOrder byteOrder) {
            a aVar;
            byte b;
            a aVar2 = null;
            try {
                aVar = new a(this.f11632c);
                try {
                    aVar.m13577a(byteOrder);
                    boolean z = true;
                    int i = 0;
                    switch (this.f11630a) {
                        case 1:
                        case 6:
                            if (this.f11632c.length != 1 || this.f11632c[0] < 0 || this.f11632c[0] > 1) {
                                String str = new String(this.f11632c, C2840k3.f11596L);
                                try {
                                    aVar.close();
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (this.f11632c[0] + 48)});
                            try {
                                aVar.close();
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.f11631b >= C2840k3.f11606u.length) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < C2840k3.f11606u.length) {
                                        if (this.f11632c[i2] != C2840k3.f11606u[i2]) {
                                            z = false;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                if (z) {
                                    i = C2840k3.f11606u.length;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i < this.f11631b && (b = this.f11632c[i]) != 0) {
                                if (b >= 32) {
                                    sb.append((char) b);
                                } else {
                                    sb.append('?');
                                }
                                i++;
                            }
                            String sb2 = sb.toString();
                            try {
                                aVar.close();
                            } catch (IOException unused3) {
                            }
                            return sb2;
                        case 3:
                            int[] iArr = new int[this.f11631b];
                            while (i < this.f11631b) {
                                iArr[i] = aVar.readUnsignedShort();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused4) {
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.f11631b];
                            while (i < this.f11631b) {
                                jArr[i] = aVar.m13575a();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused5) {
                            }
                            return jArr;
                        case 5:
                            d[] dVarArr = new d[this.f11631b];
                            while (i < this.f11631b) {
                                dVarArr[i] = new d(aVar.m13575a(), aVar.m13575a());
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused6) {
                            }
                            return dVarArr;
                        case 8:
                            int[] iArr2 = new int[this.f11631b];
                            while (i < this.f11631b) {
                                iArr2[i] = aVar.readShort();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused7) {
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.f11631b];
                            while (i < this.f11631b) {
                                iArr3[i] = aVar.readInt();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused8) {
                            }
                            return iArr3;
                        case 10:
                            d[] dVarArr2 = new d[this.f11631b];
                            while (i < this.f11631b) {
                                dVarArr2[i] = new d(aVar.readInt(), aVar.readInt());
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused9) {
                            }
                            return dVarArr2;
                        case 11:
                            double[] dArr = new double[this.f11631b];
                            while (i < this.f11631b) {
                                dArr[i] = aVar.readFloat();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused10) {
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.f11631b];
                            while (i < this.f11631b) {
                                dArr2[i] = aVar.readDouble();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused11) {
                            }
                            return dArr2;
                        default:
                            try {
                                aVar.close();
                            } catch (IOException unused12) {
                            }
                            return null;
                    }
                } catch (IOException unused13) {
                    if (aVar != null) {
                        try {
                            aVar.close();
                        } catch (IOException unused14) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    aVar2 = aVar;
                    if (aVar2 != null) {
                        try {
                            aVar2.close();
                        } catch (IOException unused15) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused16) {
                aVar = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public String toString() {
            return "(" + C2840k3.f11604s[this.f11630a] + ", data length:" + this.f11632c.length + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f11633a;

        /* renamed from: b */
        public final String f11634b;

        /* renamed from: c */
        public final int f11635c;

        /* renamed from: d */
        public final int f11636d;

        c(String str, int i, int i2) {
            this.f11634b = str;
            this.f11633a = i;
            this.f11635c = i2;
            this.f11636d = -1;
        }

        c(String str, int i, int i2, int i3) {
            this.f11634b = str;
            this.f11633a = i;
            this.f11635c = i2;
            this.f11636d = i3;
        }

        /* renamed from: a */
        boolean m13589a(int i) {
            int i2;
            int i3 = this.f11635c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f11636d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.f11635c == 9 || this.f11636d == 9) && i == 8) {
                return true;
            }
            return (this.f11635c == 12 || this.f11636d == 12) && i == 11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k3$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final long f11637a;

        /* renamed from: b */
        public final long f11638b;

        d(long j, long j2) {
            if (j2 == 0) {
                this.f11637a = 0L;
                this.f11638b = 1L;
            } else {
                this.f11637a = j;
                this.f11638b = j2;
            }
        }

        /* renamed from: a */
        public double m13590a() {
            double d = this.f11637a;
            double d2 = this.f11638b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            return this.f11637a + "/" + this.f11638b;
        }
    }

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f11598m = new int[]{8, 8, 8};
        f11599n = new int[]{8};
        f11600o = new byte[]{-1, -40, -1};
        f11601p = new byte[]{79, 76, 89, 77, 80, 0};
        f11602q = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f11604s = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
        f11605t = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f11606u = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        f11607v = new c[]{new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        f11608w = new c[]{new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        f11609x = new c[]{new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        f11610y = new c[]{new c("InteroperabilityIndex", 1, 2)};
        f11611z = new c[]{new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        f11585A = new c("StripOffsets", 273, 3);
        f11586B = new c[]{new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
        f11587C = new c[]{new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
        f11588D = new c[]{new c("AspectFrame", 4371, 3)};
        c[] cVarArr = {new c("ColorSpace", 55, 3)};
        f11589E = cVarArr;
        c[] cVarArr2 = f11607v;
        f11590F = new c[][]{cVarArr2, f11608w, f11609x, f11610y, f11611z, cVarArr2, f11586B, f11587C, f11588D, cVarArr};
        f11591G = new c[]{new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        new c("JPEGInterchangeFormat", 513, 4);
        new c("JPEGInterchangeFormatLength", 514, 4);
        c[][] cVarArr3 = f11590F;
        f11592H = new HashMap[cVarArr3.length];
        f11593I = new HashMap[cVarArr3.length];
        f11594J = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f11595K = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f11596L = forName;
        f11597M = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f11603r = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < f11590F.length; i++) {
            f11592H[i] = new HashMap<>();
            f11593I[i] = new HashMap<>();
            for (c cVar : f11590F[i]) {
                f11592H[i].put(Integer.valueOf(cVar.f11633a), cVar);
                f11593I[i].put(cVar.f11634b, cVar);
            }
        }
        f11595K.put(Integer.valueOf(f11591G[0].f11633a), 5);
        f11595K.put(Integer.valueOf(f11591G[1].f11633a), 1);
        f11595K.put(Integer.valueOf(f11591G[2].f11633a), 2);
        f11595K.put(Integer.valueOf(f11591G[3].f11633a), 3);
        f11595K.put(Integer.valueOf(f11591G[4].f11633a), 7);
        f11595K.put(Integer.valueOf(f11591G[5].f11633a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public C2840k3(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null");
        }
        this.f11612a = null;
        this.f11613b = inputStream instanceof AssetManager.AssetInputStream ? (AssetManager.AssetInputStream) inputStream : null;
        m13549a(inputStream);
    }

    /* renamed from: a */
    private int m13546a(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m13556a(bArr)) {
            return 4;
        }
        if (m13567c(bArr)) {
            return 9;
        }
        if (m13564b(bArr)) {
            return 7;
        }
        return m13570d(bArr) ? 10 : 0;
    }

    /* renamed from: a */
    private void m13547a() {
        String m13574a = m13574a("DateTimeOriginal");
        if (m13574a != null && m13574a("DateTime") == null) {
            this.f11615d[0].put("DateTime", b.m13580a(m13574a));
        }
        if (m13574a("ImageWidth") == null) {
            this.f11615d[0].put("ImageWidth", b.m13579a(0L, this.f11617f));
        }
        if (m13574a("ImageLength") == null) {
            this.f11615d[0].put("ImageLength", b.m13579a(0L, this.f11617f));
        }
        if (m13574a("Orientation") == null) {
            this.f11615d[0].put("Orientation", b.m13579a(0L, this.f11617f));
        }
        if (m13574a("LightSource") == null) {
            this.f11615d[1].put("LightSource", b.m13579a(0L, this.f11617f));
        }
    }

    /* renamed from: a */
    private void m13548a(int i, int i2) {
        if (this.f11615d[i].isEmpty() || this.f11615d[i2].isEmpty()) {
            return;
        }
        b bVar = this.f11615d[i].get("ImageLength");
        b bVar2 = this.f11615d[i].get("ImageWidth");
        b bVar3 = this.f11615d[i2].get("ImageLength");
        b bVar4 = this.f11615d[i2].get("ImageWidth");
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int m13586b = bVar.m13586b(this.f11617f);
        int m13586b2 = bVar2.m13586b(this.f11617f);
        int m13586b3 = bVar3.m13586b(this.f11617f);
        int m13586b4 = bVar4.m13586b(this.f11617f);
        if (m13586b >= m13586b3 || m13586b2 >= m13586b4) {
            return;
        }
        HashMap<String, b>[] hashMapArr = this.f11615d;
        HashMap<String, b> hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    /* renamed from: a */
    private void m13549a(InputStream inputStream) {
        for (int i = 0; i < f11590F.length; i++) {
            try {
                this.f11615d[i] = new HashMap<>();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m13547a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f11614c = m13546a(bufferedInputStream);
        a aVar = new a(bufferedInputStream);
        switch (this.f11614c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m13565c(aVar);
                break;
            case 4:
                m13552a(aVar, 0, 0);
                break;
            case 7:
                m13550a(aVar);
                break;
            case 9:
                m13560b(aVar);
                break;
            case 10:
                m13568d(aVar);
                break;
        }
        m13572f(aVar);
        m13547a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m13550a(p000.C2840k3.a r7) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2840k3.m13550a(k3$a):void");
    }

    /* renamed from: a */
    private void m13551a(a aVar, int i) {
        ByteOrder m13571e = m13571e(aVar);
        this.f11617f = m13571e;
        aVar.m13577a(m13571e);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.f11614c;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = aVar.readInt();
        if (readInt < 8 || readInt >= i) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i3 = readInt - 8;
        if (i3 <= 0 || aVar.skipBytes(i3) == i3) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0115, code lost:
    
        r10.m13577a(r9.f11617f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0049. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x004c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0052. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[FALL_THROUGH] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m13552a(p000.C2840k3.a r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2840k3.m13552a(k3$a, int, int):void");
    }

    /* renamed from: a */
    private void m13553a(a aVar, HashMap hashMap) {
        int i;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar == null || bVar2 == null) {
            return;
        }
        int m13586b = bVar.m13586b(this.f11617f);
        int min = Math.min(bVar2.m13586b(this.f11617f), aVar.available() - m13586b);
        int i2 = this.f11614c;
        if (i2 != 4 && i2 != 9 && i2 != 10) {
            if (i2 == 7) {
                i = this.f11620i;
            }
            if (m13586b > 0 || min <= 0 || this.f11612a != null || this.f11613b != null) {
                return;
            }
            aVar.m13576a(m13586b);
            aVar.readFully(new byte[min]);
            return;
        }
        i = this.f11619h;
        m13586b += i;
        if (m13586b > 0) {
        }
    }

    /* renamed from: a */
    private void m13554a(byte[] bArr, int i) {
        a aVar = new a(bArr);
        m13551a(aVar, bArr.length);
        m13561b(aVar, i);
    }

    /* renamed from: a */
    private boolean m13555a(HashMap hashMap) {
        b bVar;
        b bVar2 = (b) hashMap.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.m13588d(this.f11617f);
        if (Arrays.equals(f11598m, iArr)) {
            return true;
        }
        if (this.f11614c != 3 || (bVar = (b) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int m13586b = bVar.m13586b(this.f11617f);
        return (m13586b == 1 && Arrays.equals(iArr, f11599n)) || (m13586b == 6 && Arrays.equals(iArr, f11598m));
    }

    /* renamed from: a */
    private static boolean m13556a(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f11600o;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: a */
    private static long[] m13557a(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* renamed from: b */
    private b m13558b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f11590F.length; i++) {
            b bVar = this.f11615d[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m13559b(InputStream inputStream) {
        m13548a(0, 5);
        m13548a(0, 4);
        m13548a(5, 4);
        b bVar = this.f11615d[1].get("PixelXDimension");
        b bVar2 = this.f11615d[1].get("PixelYDimension");
        if (bVar != null && bVar2 != null) {
            this.f11615d[0].put("ImageWidth", bVar);
            this.f11615d[0].put("ImageLength", bVar2);
        }
        if (this.f11615d[4].isEmpty() && m13563b(this.f11615d[5])) {
            HashMap<String, b>[] hashMapArr = this.f11615d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        m13563b(this.f11615d[4]);
    }

    /* renamed from: b */
    private void m13560b(a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m13552a(aVar, i, 5);
        aVar.m13576a(i2);
        aVar.m13577a(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f11585A.f11633a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b m13578a = b.m13578a((int) readShort, this.f11617f);
                b m13578a2 = b.m13578a((int) readShort2, this.f11617f);
                this.f11615d[0].put("ImageLength", m13578a);
                this.f11615d[0].put("ImageWidth", m13578a2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m13561b(p000.C2840k3.a r25, int r26) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2840k3.m13561b(k3$a, int):void");
    }

    /* renamed from: b */
    private void m13562b(a aVar, HashMap hashMap) {
        b bVar = (b) hashMap.get("StripOffsets");
        b bVar2 = (b) hashMap.get("StripByteCounts");
        if (bVar == null || bVar2 == null) {
            return;
        }
        long[] m13557a = m13557a(bVar.m13588d(this.f11617f));
        long[] m13557a2 = m13557a(bVar2.m13588d(this.f11617f));
        if (m13557a == null || m13557a2 == null) {
            return;
        }
        long j = 0;
        for (long j2 : m13557a2) {
            j += j2;
        }
        byte[] bArr = new byte[(int) j];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < m13557a.length; i3++) {
            int i4 = (int) m13557a[i3];
            int i5 = (int) m13557a2[i3];
            int i6 = i4 - i;
            aVar.m13576a(i6);
            int i7 = i + i6;
            byte[] bArr2 = new byte[i5];
            aVar.read(bArr2);
            i = i7 + i5;
            System.arraycopy(bArr2, 0, bArr, i2, i5);
            i2 += i5;
        }
    }

    /* renamed from: b */
    private boolean m13563b(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.m13586b(this.f11617f) <= 512 && bVar2.m13586b(this.f11617f) <= 512;
    }

    /* renamed from: b */
    private boolean m13564b(byte[] bArr) {
        a aVar = new a(bArr);
        ByteOrder m13571e = m13571e(aVar);
        this.f11617f = m13571e;
        aVar.m13577a(m13571e);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    /* renamed from: c */
    private void m13565c(a aVar) {
        b bVar;
        m13551a(aVar, aVar.available());
        m13561b(aVar, 0);
        m13569d(aVar, 0);
        m13569d(aVar, 5);
        m13569d(aVar, 4);
        m13559b((InputStream) aVar);
        if (this.f11614c != 8 || (bVar = this.f11615d[1].get("MakerNote")) == null) {
            return;
        }
        a aVar2 = new a(bVar.f11632c);
        aVar2.m13577a(this.f11617f);
        aVar2.m13576a(6L);
        m13561b(aVar2, 9);
        b bVar2 = this.f11615d[9].get("ColorSpace");
        if (bVar2 != null) {
            this.f11615d[1].put("ColorSpace", bVar2);
        }
    }

    /* renamed from: c */
    private void m13566c(a aVar, int i) {
        b bVar;
        b bVar2 = this.f11615d[i].get("ImageLength");
        b bVar3 = this.f11615d[i].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f11615d[i].get("JPEGInterchangeFormat")) != null) {
            m13552a(aVar, bVar.m13586b(this.f11617f), i);
        }
    }

    /* renamed from: c */
    private boolean m13567c(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private void m13568d(a aVar) {
        m13565c(aVar);
        if (this.f11615d[0].get("JpgFromRaw") != null) {
            m13552a(aVar, this.f11623l, 5);
        }
        b bVar = this.f11615d[0].get("ISO");
        b bVar2 = this.f11615d[1].get("PhotographicSensitivity");
        if (bVar == null || bVar2 != null) {
            return;
        }
        this.f11615d[1].put("PhotographicSensitivity", bVar);
    }

    /* renamed from: d */
    private void m13569d(a aVar, int i) {
        StringBuilder sb;
        String arrays;
        b m13578a;
        b m13578a2;
        b bVar = this.f11615d[i].get("DefaultCropSize");
        b bVar2 = this.f11615d[i].get("SensorTopBorder");
        b bVar3 = this.f11615d[i].get("SensorLeftBorder");
        b bVar4 = this.f11615d[i].get("SensorBottomBorder");
        b bVar5 = this.f11615d[i].get("SensorRightBorder");
        if (bVar == null) {
            if (bVar2 == null || bVar3 == null || bVar4 == null || bVar5 == null) {
                m13566c(aVar, i);
                return;
            }
            int m13586b = bVar2.m13586b(this.f11617f);
            int m13586b2 = bVar4.m13586b(this.f11617f);
            int m13586b3 = bVar5.m13586b(this.f11617f);
            int m13586b4 = bVar3.m13586b(this.f11617f);
            if (m13586b2 <= m13586b || m13586b3 <= m13586b4) {
                return;
            }
            b m13578a3 = b.m13578a(m13586b2 - m13586b, this.f11617f);
            b m13578a4 = b.m13578a(m13586b3 - m13586b4, this.f11617f);
            this.f11615d[i].put("ImageLength", m13578a3);
            this.f11615d[i].put("ImageWidth", m13578a4);
            return;
        }
        if (bVar.f11630a == 5) {
            d[] dVarArr = (d[]) bVar.m13588d(this.f11617f);
            if (dVarArr != null && dVarArr.length == 2) {
                m13578a = b.m13581a(dVarArr[0], this.f11617f);
                m13578a2 = b.m13581a(dVarArr[1], this.f11617f);
                this.f11615d[i].put("ImageWidth", m13578a);
                this.f11615d[i].put("ImageLength", m13578a2);
                return;
            }
            sb = new StringBuilder();
            sb.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(dVarArr);
            sb.append(arrays);
            sb.toString();
        }
        int[] iArr = (int[]) bVar.m13588d(this.f11617f);
        if (iArr != null && iArr.length == 2) {
            m13578a = b.m13578a(iArr[0], this.f11617f);
            m13578a2 = b.m13578a(iArr[1], this.f11617f);
            this.f11615d[i].put("ImageWidth", m13578a);
            this.f11615d[i].put("ImageLength", m13578a2);
            return;
        }
        sb = new StringBuilder();
        sb.append("Invalid crop size values. cropSize=");
        arrays = Arrays.toString(iArr);
        sb.append(arrays);
        sb.toString();
    }

    /* renamed from: d */
    private boolean m13570d(byte[] bArr) {
        a aVar = new a(bArr);
        ByteOrder m13571e = m13571e(aVar);
        this.f11617f = m13571e;
        aVar.m13577a(m13571e);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    /* renamed from: e */
    private ByteOrder m13571e(a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: f */
    private void m13572f(a aVar) {
        HashMap<String, b> hashMap = this.f11615d[4];
        b bVar = hashMap.get("Compression");
        if (bVar != null) {
            int m13586b = bVar.m13586b(this.f11617f);
            this.f11618g = m13586b;
            if (m13586b != 1) {
                if (m13586b != 6) {
                    if (m13586b != 7) {
                        return;
                    }
                }
            }
            if (m13555a((HashMap) hashMap)) {
                m13562b(aVar, hashMap);
                return;
            }
            return;
        }
        this.f11618g = 6;
        m13553a(aVar, hashMap);
    }

    /* renamed from: a */
    public int m13573a(String str, int i) {
        b m13558b = m13558b(str);
        if (m13558b == null) {
            return i;
        }
        try {
            return m13558b.m13586b(this.f11617f);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public String m13574a(String str) {
        b m13558b = m13558b(str);
        if (m13558b != null) {
            if (!f11594J.contains(str)) {
                return m13558b.m13587c(this.f11617f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = m13558b.f11630a;
                if (i != 5 && i != 10) {
                    String str2 = "GPS Timestamp format is not rational. format=" + m13558b.f11630a;
                    return null;
                }
                d[] dVarArr = (d[]) m13558b.m13588d(this.f11617f);
                if (dVarArr != null && dVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) dVarArr[0].f11637a) / ((float) dVarArr[0].f11638b))), Integer.valueOf((int) (((float) dVarArr[1].f11637a) / ((float) dVarArr[1].f11638b))), Integer.valueOf((int) (((float) dVarArr[2].f11637a) / ((float) dVarArr[2].f11638b))));
                }
                String str3 = "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr);
                return null;
            }
            try {
                return Double.toString(m13558b.m13585a(this.f11617f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
