package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: oe */
/* loaded from: classes.dex */
public final class C3032oe implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f12457a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f12458b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: oe$a */
    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a */
        private final ByteBuffer f12459a;

        a(ByteBuffer byteBuffer) {
            this.f12459a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p000.C3032oe.c
        /* renamed from: a */
        public int mo14491a(byte[] bArr, int i) {
            int min = Math.min(i, this.f12459a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f12459a.get(bArr, 0, min);
            return min;
        }

        @Override // p000.C3032oe.c
        /* renamed from: a */
        public short mo14492a() {
            return (short) (mo14494c() & 255);
        }

        @Override // p000.C3032oe.c
        /* renamed from: b */
        public int mo14493b() {
            return ((mo14494c() << 8) & 65280) | (mo14494c() & 255);
        }

        @Override // p000.C3032oe.c
        /* renamed from: c */
        public int mo14494c() {
            if (this.f12459a.remaining() < 1) {
                return -1;
            }
            return this.f12459a.get();
        }

        @Override // p000.C3032oe.c
        public long skip(long j) {
            int min = (int) Math.min(this.f12459a.remaining(), j);
            ByteBuffer byteBuffer = this.f12459a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oe$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final ByteBuffer f12460a;

        b(byte[] bArr, int i) {
            this.f12460a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        private boolean m14495a(int i, int i2) {
            return this.f12460a.remaining() - i >= i2;
        }

        /* renamed from: a */
        int m14496a() {
            return this.f12460a.remaining();
        }

        /* renamed from: a */
        short m14497a(int i) {
            if (m14495a(i, 2)) {
                return this.f12460a.getShort(i);
            }
            return (short) -1;
        }

        /* renamed from: a */
        void m14498a(ByteOrder byteOrder) {
            this.f12460a.order(byteOrder);
        }

        /* renamed from: b */
        int m14499b(int i) {
            if (m14495a(i, 4)) {
                return this.f12460a.getInt(i);
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oe$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int mo14491a(byte[] bArr, int i);

        /* renamed from: a */
        short mo14492a();

        /* renamed from: b */
        int mo14493b();

        /* renamed from: c */
        int mo14494c();

        long skip(long j);
    }

    /* renamed from: oe$d */
    /* loaded from: classes.dex */
    private static final class d implements c {

        /* renamed from: a */
        private final InputStream f12461a;

        d(InputStream inputStream) {
            this.f12461a = inputStream;
        }

        @Override // p000.C3032oe.c
        /* renamed from: a */
        public int mo14491a(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f12461a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        @Override // p000.C3032oe.c
        /* renamed from: a */
        public short mo14492a() {
            return (short) (this.f12461a.read() & 255);
        }

        @Override // p000.C3032oe.c
        /* renamed from: b */
        public int mo14493b() {
            return ((this.f12461a.read() << 8) & 65280) | (this.f12461a.read() & 255);
        }

        @Override // p000.C3032oe.c
        /* renamed from: c */
        public int mo14494c() {
            return this.f12461a.read();
        }

        @Override // p000.C3032oe.c
        public long skip(long j) {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f12461a.skip(j2);
                if (skip <= 0) {
                    if (this.f12461a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: a */
    private static int m14483a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: a */
    private static int m14484a(b bVar) {
        ByteOrder byteOrder;
        StringBuilder sb;
        String str;
        short m14497a = bVar.m14497a(6);
        if (m14497a != 18761) {
            if (m14497a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                String str2 = "Unknown endianness = " + ((int) m14497a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.m14498a(byteOrder);
        int m14499b = bVar.m14499b(10) + 6;
        short m14497a2 = bVar.m14497a(m14499b);
        for (int i = 0; i < m14497a2; i++) {
            int m14483a = m14483a(m14499b, i);
            short m14497a3 = bVar.m14497a(m14483a);
            if (m14497a3 == 274) {
                short m14497a4 = bVar.m14497a(m14483a + 2);
                if (m14497a4 >= 1 && m14497a4 <= 12) {
                    int m14499b2 = bVar.m14499b(m14483a + 4);
                    if (m14499b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            String str3 = "Got tagIndex=" + i + " tagType=" + ((int) m14497a3) + " formatCode=" + ((int) m14497a4) + " componentCount=" + m14499b2;
                        }
                        int i2 = m14499b2 + f12458b[m14497a4];
                        if (i2 <= 4) {
                            int i3 = m14483a + 8;
                            if (i3 >= 0 && i3 <= bVar.m14496a()) {
                                if (i2 >= 0 && i2 + i3 <= bVar.m14496a()) {
                                    return bVar.m14497a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb = new StringBuilder();
                                    sb.append("Illegal number of bytes for TI tag data tagType=");
                                    sb.append((int) m14497a3);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                String str4 = "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) m14497a3);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                            sb.append(str);
                            sb.append((int) m14497a4);
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb = new StringBuilder();
                    str = "Got invalid format code = ";
                    sb.append(str);
                    sb.append((int) m14497a4);
                }
                sb.toString();
            }
        }
        return -1;
    }

    /* renamed from: a */
    private int m14485a(c cVar, InterfaceC0475bc interfaceC0475bc) {
        int mo14493b = cVar.mo14493b();
        if (!m14488a(mo14493b)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                String str = "Parser doesn't handle magic number: " + mo14493b;
            }
            return -1;
        }
        int m14490b = m14490b(cVar);
        if (m14490b == -1) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr = (byte[]) interfaceC0475bc.mo3379b(m14490b, byte[].class);
        try {
            return m14486a(cVar, bArr, m14490b);
        } finally {
            interfaceC0475bc.mo3378a((InterfaceC0475bc) bArr);
        }
    }

    /* renamed from: a */
    private int m14486a(c cVar, byte[] bArr, int i) {
        int mo14491a = cVar.mo14491a(bArr, i);
        if (mo14491a == i) {
            if (m14489a(bArr, i)) {
                return m14484a(new b(bArr, i));
            }
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            String str = "Unable to read exif segment data, length: " + i + ", actually read: " + mo14491a;
        }
        return -1;
    }

    /* renamed from: a */
    private ImageHeaderParser.ImageType m14487a(c cVar) {
        int mo14493b = cVar.mo14493b();
        if (mo14493b == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int mo14493b2 = ((mo14493b << 16) & (-65536)) | (cVar.mo14493b() & 65535);
        if (mo14493b2 == -1991225785) {
            cVar.skip(21L);
            return cVar.mo14494c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        }
        if ((mo14493b2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        }
        if (mo14493b2 != 1380533830) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        cVar.skip(4L);
        if ((((cVar.mo14493b() << 16) & (-65536)) | (cVar.mo14493b() & 65535)) != 1464156752) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int mo14493b3 = ((cVar.mo14493b() << 16) & (-65536)) | (cVar.mo14493b() & 65535);
        if ((mo14493b3 & (-256)) != 1448097792) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int i = mo14493b3 & 255;
        if (i == 88) {
            cVar.skip(4L);
            return (cVar.mo14494c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        }
        if (i != 76) {
            return ImageHeaderParser.ImageType.WEBP;
        }
        cVar.skip(4L);
        return (cVar.mo14494c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
    }

    /* renamed from: a */
    private static boolean m14488a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: a */
    private boolean m14489a(byte[] bArr, int i) {
        boolean z = bArr != null && i > f12457a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f12457a;
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

    /* renamed from: b */
    private int m14490b(c cVar) {
        short mo14492a;
        int mo14493b;
        long j;
        long skip;
        do {
            short mo14492a2 = cVar.mo14492a();
            if (mo14492a2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    String str = "Unknown segmentId=" + ((int) mo14492a2);
                }
                return -1;
            }
            mo14492a = cVar.mo14492a();
            if (mo14492a == 218) {
                return -1;
            }
            if (mo14492a == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            mo14493b = cVar.mo14493b() - 2;
            if (mo14492a == 225) {
                return mo14493b;
            }
            j = mo14493b;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            String str2 = "Unable to skip enough data, type: " + ((int) mo14492a) + ", wanted to skip: " + mo14493b + ", but actually skipped: " + skip;
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo3947a(InputStream inputStream, InterfaceC0475bc interfaceC0475bc) {
        C2816ji.m13459a(inputStream);
        d dVar = new d(inputStream);
        C2816ji.m13459a(interfaceC0475bc);
        return m14485a(dVar, interfaceC0475bc);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo3948a(InputStream inputStream) {
        C2816ji.m13459a(inputStream);
        return m14487a(new d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo3949a(ByteBuffer byteBuffer) {
        C2816ji.m13459a(byteBuffer);
        return m14487a(new a(byteBuffer));
    }
}
