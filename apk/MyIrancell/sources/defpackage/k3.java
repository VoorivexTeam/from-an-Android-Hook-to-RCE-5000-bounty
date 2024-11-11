package defpackage;

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

/* loaded from: classes.dex */
public class k3 {
    private static final c A;
    private static final c[] B;
    private static final c[] C;
    private static final c[] D;
    private static final c[] E;
    static final c[][] F;
    private static final c[] G;
    private static final HashMap<Integer, c>[] H;
    private static final HashMap<String, c>[] I;
    private static final HashSet<String> J;
    private static final HashMap<Integer, Integer> K;
    static final Charset L;
    static final byte[] M;
    public static final int[] m;
    public static final int[] n;
    static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static SimpleDateFormat r;
    static final String[] s;
    static final int[] t;
    static final byte[] u;
    private static final c[] v;
    private static final c[] w;
    private static final c[] x;
    private static final c[] y;
    private static final c[] z;
    private final String a;
    private final AssetManager.AssetInputStream b;
    private int c;
    private final HashMap<String, b>[] d = new HashMap[F.length];
    private Set<Integer> e = new HashSet(F.length);
    private ByteOrder f = ByteOrder.BIG_ENDIAN;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends InputStream implements DataInput {
        private static final ByteOrder f = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder g = ByteOrder.BIG_ENDIAN;
        private DataInputStream b;
        private ByteOrder c;
        final int d;
        int e;

        public a(InputStream inputStream) {
            this.c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.b = dataInputStream;
            int available = dataInputStream.available();
            this.d = available;
            this.e = 0;
            this.b.mark(available);
        }

        public a(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        public long a() {
            return readInt() & 4294967295L;
        }

        public void a(long j) {
            int i = this.e;
            if (i > j) {
                this.e = 0;
                this.b.reset();
                this.b.mark(this.d);
            } else {
                j -= i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void a(ByteOrder byteOrder) {
            this.c = byteOrder;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.b.available();
        }

        public int peek() {
            return this.e;
        }

        @Override // java.io.InputStream
        public int read() {
            this.e++;
            return this.b.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = this.b.read(bArr, i, i2);
            this.e += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.e++;
            return this.b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            int i = this.e + 1;
            this.e = i;
            if (i > this.d) {
                throw new EOFException();
            }
            int read = this.b.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.e += 2;
            return this.b.readChar();
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
            int length = this.e + bArr.length;
            this.e = length;
            if (length > this.d) {
                throw new EOFException();
            }
            if (this.b.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            int i3 = this.e + i2;
            this.e = i3;
            if (i3 > this.d) {
                throw new EOFException();
            }
            if (this.b.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() {
            int i = this.e + 4;
            this.e = i;
            if (i > this.d) {
                throw new EOFException();
            }
            int read = this.b.read();
            int read2 = this.b.read();
            int read3 = this.b.read();
            int read4 = this.b.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == f) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == g) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            int i = this.e + 8;
            this.e = i;
            if (i > this.d) {
                throw new EOFException();
            }
            int read = this.b.read();
            int read2 = this.b.read();
            int read3 = this.b.read();
            int read4 = this.b.read();
            int read5 = this.b.read();
            int read6 = this.b.read();
            int read7 = this.b.read();
            int read8 = this.b.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == f) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == g) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.c);
        }

        @Override // java.io.DataInput
        public short readShort() {
            int i = this.e + 2;
            this.e = i;
            if (i > this.d) {
                throw new EOFException();
            }
            int read = this.b.read();
            int read2 = this.b.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == f) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == g) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.e += 2;
            return this.b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.e++;
            return this.b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            int i = this.e + 2;
            this.e = i;
            if (i > this.d) {
                throw new EOFException();
            }
            int read = this.b.read();
            int read2 = this.b.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == f) {
                return (read2 << 8) + read;
            }
            if (byteOrder == g) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.c);
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            int min = Math.min(i, this.d - this.e);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.b.skipBytes(min - i2);
            }
            this.e += i2;
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final int b;
        public final byte[] c;

        b(int i, int i2, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }

        public static b a(int i, ByteOrder byteOrder) {
            return a(new int[]{i}, byteOrder);
        }

        public static b a(long j, ByteOrder byteOrder) {
            return a(new long[]{j}, byteOrder);
        }

        public static b a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(k3.L);
            return new b(2, bytes.length, bytes);
        }

        public static b a(d dVar, ByteOrder byteOrder) {
            return a(new d[]{dVar}, byteOrder);
        }

        public static b a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[k3.t[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new b(3, iArr.length, wrap.array());
        }

        public static b a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[k3.t[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new b(4, jArr.length, wrap.array());
        }

        public static b a(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[k3.t[5] * dVarArr.length]);
            wrap.order(byteOrder);
            for (d dVar : dVarArr) {
                wrap.putInt((int) dVar.a);
                wrap.putInt((int) dVar.b);
            }
            return new b(5, dVarArr.length, wrap.array());
        }

        public double a(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (d instanceof String) {
                return Double.parseDouble((String) d);
            }
            if (d instanceof long[]) {
                if (((long[]) d).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (d instanceof int[]) {
                if (((int[]) d).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (d instanceof double[]) {
                double[] dArr = (double[]) d;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(d instanceof d[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            d[] dVarArr = (d[]) d;
            if (dVarArr.length == 1) {
                return dVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int b(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (d instanceof String) {
                return Integer.parseInt((String) d);
            }
            if (d instanceof long[]) {
                long[] jArr = (long[]) d;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(d instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) d;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String c(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                return null;
            }
            if (d instanceof String) {
                return (String) d;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (d instanceof long[]) {
                long[] jArr = (long[]) d;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (d instanceof int[]) {
                int[] iArr = (int[]) d;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (d instanceof double[]) {
                double[] dArr = (double[]) d;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(d instanceof d[])) {
                return null;
            }
            d[] dVarArr = (d[]) d;
            while (i < dVarArr.length) {
                sb.append(dVarArr[i].a);
                sb.append('/');
                sb.append(dVarArr[i].b);
                i++;
                if (i != dVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        Object d(ByteOrder byteOrder) {
            a aVar;
            byte b;
            a aVar2 = null;
            try {
                aVar = new a(this.c);
                try {
                    aVar.a(byteOrder);
                    boolean z = true;
                    int i = 0;
                    switch (this.a) {
                        case 1:
                        case 6:
                            if (this.c.length != 1 || this.c[0] < 0 || this.c[0] > 1) {
                                String str = new String(this.c, k3.L);
                                try {
                                    aVar.close();
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (this.c[0] + 48)});
                            try {
                                aVar.close();
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.b >= k3.u.length) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < k3.u.length) {
                                        if (this.c[i2] != k3.u[i2]) {
                                            z = false;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                if (z) {
                                    i = k3.u.length;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i < this.b && (b = this.c[i]) != 0) {
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
                            int[] iArr = new int[this.b];
                            while (i < this.b) {
                                iArr[i] = aVar.readUnsignedShort();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused4) {
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.b];
                            while (i < this.b) {
                                jArr[i] = aVar.a();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused5) {
                            }
                            return jArr;
                        case 5:
                            d[] dVarArr = new d[this.b];
                            while (i < this.b) {
                                dVarArr[i] = new d(aVar.a(), aVar.a());
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused6) {
                            }
                            return dVarArr;
                        case 8:
                            int[] iArr2 = new int[this.b];
                            while (i < this.b) {
                                iArr2[i] = aVar.readShort();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused7) {
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.b];
                            while (i < this.b) {
                                iArr3[i] = aVar.readInt();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused8) {
                            }
                            return iArr3;
                        case 10:
                            d[] dVarArr2 = new d[this.b];
                            while (i < this.b) {
                                dVarArr2[i] = new d(aVar.readInt(), aVar.readInt());
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused9) {
                            }
                            return dVarArr2;
                        case 11:
                            double[] dArr = new double[this.b];
                            while (i < this.b) {
                                dArr[i] = aVar.readFloat();
                                i++;
                            }
                            try {
                                aVar.close();
                            } catch (IOException unused10) {
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.b];
                            while (i < this.b) {
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
            return "(" + k3.s[this.a] + ", data length:" + this.c.length + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        c(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        c(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }

        boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.c == 9 || this.d == 9) && i == 8) {
                return true;
            }
            return (this.c == 12 || this.d == 12) && i == 11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {
        public final long a;
        public final long b;

        d(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
            } else {
                this.a = j;
                this.b = j2;
            }
        }

        public double a() {
            double d = this.a;
            double d2 = this.b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        m = new int[]{8, 8, 8};
        n = new int[]{8};
        o = new byte[]{-1, -40, -1};
        p = new byte[]{79, 76, 89, 77, 80, 0};
        q = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        s = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
        t = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        u = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        v = new c[]{new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        w = new c[]{new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        x = new c[]{new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        y = new c[]{new c("InteroperabilityIndex", 1, 2)};
        z = new c[]{new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        A = new c("StripOffsets", 273, 3);
        B = new c[]{new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
        C = new c[]{new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
        D = new c[]{new c("AspectFrame", 4371, 3)};
        c[] cVarArr = {new c("ColorSpace", 55, 3)};
        E = cVarArr;
        c[] cVarArr2 = v;
        F = new c[][]{cVarArr2, w, x, y, z, cVarArr2, B, C, D, cVarArr};
        G = new c[]{new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        new c("JPEGInterchangeFormat", 513, 4);
        new c("JPEGInterchangeFormatLength", 514, 4);
        c[][] cVarArr3 = F;
        H = new HashMap[cVarArr3.length];
        I = new HashMap[cVarArr3.length];
        J = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        K = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        L = forName;
        M = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        r = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < F.length; i++) {
            H[i] = new HashMap<>();
            I[i] = new HashMap<>();
            for (c cVar : F[i]) {
                H[i].put(Integer.valueOf(cVar.a), cVar);
                I[i].put(cVar.b, cVar);
            }
        }
        K.put(Integer.valueOf(G[0].a), 5);
        K.put(Integer.valueOf(G[1].a), 1);
        K.put(Integer.valueOf(G[2].a), 2);
        K.put(Integer.valueOf(G[3].a), 3);
        K.put(Integer.valueOf(G[4].a), 7);
        K.put(Integer.valueOf(G[5].a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public k3(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null");
        }
        this.a = null;
        this.b = inputStream instanceof AssetManager.AssetInputStream ? (AssetManager.AssetInputStream) inputStream : null;
        a(inputStream);
    }

    private int a(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (a(bArr)) {
            return 4;
        }
        if (c(bArr)) {
            return 9;
        }
        if (b(bArr)) {
            return 7;
        }
        return d(bArr) ? 10 : 0;
    }

    private void a() {
        String a2 = a("DateTimeOriginal");
        if (a2 != null && a("DateTime") == null) {
            this.d[0].put("DateTime", b.a(a2));
        }
        if (a("ImageWidth") == null) {
            this.d[0].put("ImageWidth", b.a(0L, this.f));
        }
        if (a("ImageLength") == null) {
            this.d[0].put("ImageLength", b.a(0L, this.f));
        }
        if (a("Orientation") == null) {
            this.d[0].put("Orientation", b.a(0L, this.f));
        }
        if (a("LightSource") == null) {
            this.d[1].put("LightSource", b.a(0L, this.f));
        }
    }

    private void a(int i, int i2) {
        if (this.d[i].isEmpty() || this.d[i2].isEmpty()) {
            return;
        }
        b bVar = this.d[i].get("ImageLength");
        b bVar2 = this.d[i].get("ImageWidth");
        b bVar3 = this.d[i2].get("ImageLength");
        b bVar4 = this.d[i2].get("ImageWidth");
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int b2 = bVar.b(this.f);
        int b3 = bVar2.b(this.f);
        int b4 = bVar3.b(this.f);
        int b5 = bVar4.b(this.f);
        if (b2 >= b4 || b3 >= b5) {
            return;
        }
        HashMap<String, b>[] hashMapArr = this.d;
        HashMap<String, b> hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    private void a(InputStream inputStream) {
        for (int i = 0; i < F.length; i++) {
            try {
                this.d[i] = new HashMap<>();
            } catch (IOException unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.c = a(bufferedInputStream);
        a aVar = new a(bufferedInputStream);
        switch (this.c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                c(aVar);
                break;
            case 4:
                a(aVar, 0, 0);
                break;
            case 7:
                a(aVar);
                break;
            case 9:
                b(aVar);
                break;
            case 10:
                d(aVar);
                break;
        }
        f(aVar);
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(k3.a r7) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3.a(k3$a):void");
    }

    private void a(a aVar, int i) {
        ByteOrder e = e(aVar);
        this.f = e;
        aVar.a(e);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.c;
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
    
        r10.a(r9.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0049. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x004c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0052. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(k3.a r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3.a(k3$a, int, int):void");
    }

    private void a(a aVar, HashMap hashMap) {
        int i;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar == null || bVar2 == null) {
            return;
        }
        int b2 = bVar.b(this.f);
        int min = Math.min(bVar2.b(this.f), aVar.available() - b2);
        int i2 = this.c;
        if (i2 != 4 && i2 != 9 && i2 != 10) {
            if (i2 == 7) {
                i = this.i;
            }
            if (b2 > 0 || min <= 0 || this.a != null || this.b != null) {
                return;
            }
            aVar.a(b2);
            aVar.readFully(new byte[min]);
            return;
        }
        i = this.h;
        b2 += i;
        if (b2 > 0) {
        }
    }

    private void a(byte[] bArr, int i) {
        a aVar = new a(bArr);
        a(aVar, bArr.length);
        b(aVar, i);
    }

    private boolean a(HashMap hashMap) {
        b bVar;
        b bVar2 = (b) hashMap.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.d(this.f);
        if (Arrays.equals(m, iArr)) {
            return true;
        }
        if (this.c != 3 || (bVar = (b) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int b2 = bVar.b(this.f);
        return (b2 == 1 && Arrays.equals(iArr, n)) || (b2 == 6 && Arrays.equals(iArr, m));
    }

    private static boolean a(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = o;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private static long[] a(Object obj) {
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

    private b b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < F.length; i++) {
            b bVar = this.d[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    private void b(InputStream inputStream) {
        a(0, 5);
        a(0, 4);
        a(5, 4);
        b bVar = this.d[1].get("PixelXDimension");
        b bVar2 = this.d[1].get("PixelYDimension");
        if (bVar != null && bVar2 != null) {
            this.d[0].put("ImageWidth", bVar);
            this.d[0].put("ImageLength", bVar2);
        }
        if (this.d[4].isEmpty() && b(this.d[5])) {
            HashMap<String, b>[] hashMapArr = this.d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        b(this.d[4]);
    }

    private void b(a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        a(aVar, i, 5);
        aVar.a(i2);
        aVar.a(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == A.a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b a2 = b.a((int) readShort, this.f);
                b a3 = b.a((int) readShort2, this.f);
                this.d[0].put("ImageLength", a2);
                this.d[0].put("ImageWidth", a3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(k3.a r25, int r26) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3.b(k3$a, int):void");
    }

    private void b(a aVar, HashMap hashMap) {
        b bVar = (b) hashMap.get("StripOffsets");
        b bVar2 = (b) hashMap.get("StripByteCounts");
        if (bVar == null || bVar2 == null) {
            return;
        }
        long[] a2 = a(bVar.d(this.f));
        long[] a3 = a(bVar2.d(this.f));
        if (a2 == null || a3 == null) {
            return;
        }
        long j = 0;
        for (long j2 : a3) {
            j += j2;
        }
        byte[] bArr = new byte[(int) j];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < a2.length; i3++) {
            int i4 = (int) a2[i3];
            int i5 = (int) a3[i3];
            int i6 = i4 - i;
            aVar.a(i6);
            int i7 = i + i6;
            byte[] bArr2 = new byte[i5];
            aVar.read(bArr2);
            i = i7 + i5;
            System.arraycopy(bArr2, 0, bArr, i2, i5);
            i2 += i5;
        }
    }

    private boolean b(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.b(this.f) <= 512 && bVar2.b(this.f) <= 512;
    }

    private boolean b(byte[] bArr) {
        a aVar = new a(bArr);
        ByteOrder e = e(aVar);
        this.f = e;
        aVar.a(e);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    private void c(a aVar) {
        b bVar;
        a(aVar, aVar.available());
        b(aVar, 0);
        d(aVar, 0);
        d(aVar, 5);
        d(aVar, 4);
        b((InputStream) aVar);
        if (this.c != 8 || (bVar = this.d[1].get("MakerNote")) == null) {
            return;
        }
        a aVar2 = new a(bVar.c);
        aVar2.a(this.f);
        aVar2.a(6L);
        b(aVar2, 9);
        b bVar2 = this.d[9].get("ColorSpace");
        if (bVar2 != null) {
            this.d[1].put("ColorSpace", bVar2);
        }
    }

    private void c(a aVar, int i) {
        b bVar;
        b bVar2 = this.d[i].get("ImageLength");
        b bVar3 = this.d[i].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.d[i].get("JPEGInterchangeFormat")) != null) {
            a(aVar, bVar.b(this.f), i);
        }
    }

    private boolean c(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    private void d(a aVar) {
        c(aVar);
        if (this.d[0].get("JpgFromRaw") != null) {
            a(aVar, this.l, 5);
        }
        b bVar = this.d[0].get("ISO");
        b bVar2 = this.d[1].get("PhotographicSensitivity");
        if (bVar == null || bVar2 != null) {
            return;
        }
        this.d[1].put("PhotographicSensitivity", bVar);
    }

    private void d(a aVar, int i) {
        StringBuilder sb;
        String arrays;
        b a2;
        b a3;
        b bVar = this.d[i].get("DefaultCropSize");
        b bVar2 = this.d[i].get("SensorTopBorder");
        b bVar3 = this.d[i].get("SensorLeftBorder");
        b bVar4 = this.d[i].get("SensorBottomBorder");
        b bVar5 = this.d[i].get("SensorRightBorder");
        if (bVar == null) {
            if (bVar2 == null || bVar3 == null || bVar4 == null || bVar5 == null) {
                c(aVar, i);
                return;
            }
            int b2 = bVar2.b(this.f);
            int b3 = bVar4.b(this.f);
            int b4 = bVar5.b(this.f);
            int b5 = bVar3.b(this.f);
            if (b3 <= b2 || b4 <= b5) {
                return;
            }
            b a4 = b.a(b3 - b2, this.f);
            b a5 = b.a(b4 - b5, this.f);
            this.d[i].put("ImageLength", a4);
            this.d[i].put("ImageWidth", a5);
            return;
        }
        if (bVar.a == 5) {
            d[] dVarArr = (d[]) bVar.d(this.f);
            if (dVarArr != null && dVarArr.length == 2) {
                a2 = b.a(dVarArr[0], this.f);
                a3 = b.a(dVarArr[1], this.f);
                this.d[i].put("ImageWidth", a2);
                this.d[i].put("ImageLength", a3);
                return;
            }
            sb = new StringBuilder();
            sb.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(dVarArr);
            sb.append(arrays);
            sb.toString();
        }
        int[] iArr = (int[]) bVar.d(this.f);
        if (iArr != null && iArr.length == 2) {
            a2 = b.a(iArr[0], this.f);
            a3 = b.a(iArr[1], this.f);
            this.d[i].put("ImageWidth", a2);
            this.d[i].put("ImageLength", a3);
            return;
        }
        sb = new StringBuilder();
        sb.append("Invalid crop size values. cropSize=");
        arrays = Arrays.toString(iArr);
        sb.append(arrays);
        sb.toString();
    }

    private boolean d(byte[] bArr) {
        a aVar = new a(bArr);
        ByteOrder e = e(aVar);
        this.f = e;
        aVar.a(e);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    private ByteOrder e(a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void f(a aVar) {
        HashMap<String, b> hashMap = this.d[4];
        b bVar = hashMap.get("Compression");
        if (bVar != null) {
            int b2 = bVar.b(this.f);
            this.g = b2;
            if (b2 != 1) {
                if (b2 != 6) {
                    if (b2 != 7) {
                        return;
                    }
                }
            }
            if (a((HashMap) hashMap)) {
                b(aVar, hashMap);
                return;
            }
            return;
        }
        this.g = 6;
        a(aVar, hashMap);
    }

    public int a(String str, int i) {
        b b2 = b(str);
        if (b2 == null) {
            return i;
        }
        try {
            return b2.b(this.f);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public String a(String str) {
        b b2 = b(str);
        if (b2 != null) {
            if (!J.contains(str)) {
                return b2.c(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = b2.a;
                if (i != 5 && i != 10) {
                    String str2 = "GPS Timestamp format is not rational. format=" + b2.a;
                    return null;
                }
                d[] dVarArr = (d[]) b2.d(this.f);
                if (dVarArr != null && dVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].b))));
                }
                String str3 = "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr);
                return null;
            }
            try {
                return Double.toString(b2.a(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
