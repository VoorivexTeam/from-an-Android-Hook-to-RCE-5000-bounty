package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class oe implements ImageHeaderParser {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    private static final class a implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // oe.c
        public int a(byte[] bArr, int i) {
            int min = Math.min(i, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // oe.c
        public short a() {
            return (short) (c() & 255);
        }

        @Override // oe.c
        public int b() {
            return ((c() << 8) & 65280) | (c() & 255);
        }

        @Override // oe.c
        public int c() {
            if (this.a.remaining() < 1) {
                return -1;
            }
            return this.a.get();
        }

        @Override // oe.c
        public long skip(long j) {
            int min = (int) Math.min(this.a.remaining(), j);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        private final ByteBuffer a;

        b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        private boolean a(int i, int i2) {
            return this.a.remaining() - i >= i2;
        }

        int a() {
            return this.a.remaining();
        }

        short a(int i) {
            if (a(i, 2)) {
                return this.a.getShort(i);
            }
            return (short) -1;
        }

        void a(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }

        int b(int i) {
            if (a(i, 4)) {
                return this.a.getInt(i);
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a(byte[] bArr, int i);

        short a();

        int b();

        int c();

        long skip(long j);
    }

    /* loaded from: classes.dex */
    private static final class d implements c {
        private final InputStream a;

        d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // oe.c
        public int a(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        @Override // oe.c
        public short a() {
            return (short) (this.a.read() & 255);
        }

        @Override // oe.c
        public int b() {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
        }

        @Override // oe.c
        public int c() {
            return this.a.read();
        }

        @Override // oe.c
        public long skip(long j) {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    private static int a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private static int a(b bVar) {
        ByteOrder byteOrder;
        StringBuilder sb;
        String str;
        short a2 = bVar.a(6);
        if (a2 != 18761) {
            if (a2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                String str2 = "Unknown endianness = " + ((int) a2);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.a(byteOrder);
        int b2 = bVar.b(10) + 6;
        short a3 = bVar.a(b2);
        for (int i = 0; i < a3; i++) {
            int a4 = a(b2, i);
            short a5 = bVar.a(a4);
            if (a5 == 274) {
                short a6 = bVar.a(a4 + 2);
                if (a6 >= 1 && a6 <= 12) {
                    int b3 = bVar.b(a4 + 4);
                    if (b3 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            String str3 = "Got tagIndex=" + i + " tagType=" + ((int) a5) + " formatCode=" + ((int) a6) + " componentCount=" + b3;
                        }
                        int i2 = b3 + b[a6];
                        if (i2 <= 4) {
                            int i3 = a4 + 8;
                            if (i3 >= 0 && i3 <= bVar.a()) {
                                if (i2 >= 0 && i2 + i3 <= bVar.a()) {
                                    return bVar.a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb = new StringBuilder();
                                    sb.append("Illegal number of bytes for TI tag data tagType=");
                                    sb.append((int) a5);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                String str4 = "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) a5);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                            sb.append(str);
                            sb.append((int) a6);
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb = new StringBuilder();
                    str = "Got invalid format code = ";
                    sb.append(str);
                    sb.append((int) a6);
                }
                sb.toString();
            }
        }
        return -1;
    }

    private int a(c cVar, bc bcVar) {
        int b2 = cVar.b();
        if (!a(b2)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                String str = "Parser doesn't handle magic number: " + b2;
            }
            return -1;
        }
        int b3 = b(cVar);
        if (b3 == -1) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr = (byte[]) bcVar.b(b3, byte[].class);
        try {
            return a(cVar, bArr, b3);
        } finally {
            bcVar.a((bc) bArr);
        }
    }

    private int a(c cVar, byte[] bArr, int i) {
        int a2 = cVar.a(bArr, i);
        if (a2 == i) {
            if (a(bArr, i)) {
                return a(new b(bArr, i));
            }
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            String str = "Unable to read exif segment data, length: " + i + ", actually read: " + a2;
        }
        return -1;
    }

    private ImageHeaderParser.ImageType a(c cVar) {
        int b2 = cVar.b();
        if (b2 == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int b3 = ((b2 << 16) & (-65536)) | (cVar.b() & 65535);
        if (b3 == -1991225785) {
            cVar.skip(21L);
            return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        }
        if ((b3 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        }
        if (b3 != 1380533830) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        cVar.skip(4L);
        if ((((cVar.b() << 16) & (-65536)) | (cVar.b() & 65535)) != 1464156752) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int b4 = ((cVar.b() << 16) & (-65536)) | (cVar.b() & 65535);
        if ((b4 & (-256)) != 1448097792) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int i = b4 & 255;
        if (i == 88) {
            cVar.skip(4L);
            return (cVar.c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        }
        if (i != 76) {
            return ImageHeaderParser.ImageType.WEBP;
        }
        cVar.skip(4L);
        return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
    }

    private static boolean a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    private boolean a(byte[] bArr, int i) {
        boolean z = bArr != null && i > a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    private int b(c cVar) {
        short a2;
        int b2;
        long j;
        long skip;
        do {
            short a3 = cVar.a();
            if (a3 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    String str = "Unknown segmentId=" + ((int) a3);
                }
                return -1;
            }
            a2 = cVar.a();
            if (a2 == 218) {
                return -1;
            }
            if (a2 == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            b2 = cVar.b() - 2;
            if (a2 == 225) {
                return b2;
            }
            j = b2;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            String str2 = "Unable to skip enough data, type: " + ((int) a2) + ", wanted to skip: " + b2 + ", but actually skipped: " + skip;
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(InputStream inputStream, bc bcVar) {
        ji.a(inputStream);
        d dVar = new d(inputStream);
        ji.a(bcVar);
        return a(dVar, bcVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(InputStream inputStream) {
        ji.a(inputStream);
        return a(new d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        ji.a(byteBuffer);
        return a(new a(byteBuffer));
    }
}
