package p000;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ai */
/* loaded from: classes.dex */
public final class C0022ai {

    /* renamed from: ai$a */
    /* loaded from: classes.dex */
    private static class a extends InputStream {

        /* renamed from: b */
        private final ByteBuffer f105b;

        /* renamed from: c */
        private int f106c = -1;

        a(ByteBuffer byteBuffer) {
            this.f105b = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f105b.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f106c = this.f105b.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f105b.hasRemaining()) {
                return this.f105b.get();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (!this.f105b.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.f105b.get(bArr, i, min);
            return min;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            if (this.f106c == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f105b.position(this.f106c);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.f105b.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j, available());
            this.f105b.position((int) (r0.position() + min));
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ai$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f107a;

        /* renamed from: b */
        final int f108b;

        /* renamed from: c */
        final byte[] f109c;

        b(byte[] bArr, int i, int i2) {
            this.f109c = bArr;
            this.f107a = i;
            this.f108b = i2;
        }
    }

    static {
        new AtomicReference();
    }

    /* renamed from: a */
    private static b m155a(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: a */
    public static ByteBuffer m156a(File file) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return load;
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: a */
    public static void m157a(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: b */
    public static byte[] m158b(ByteBuffer byteBuffer) {
        b m155a = m155a(byteBuffer);
        if (m155a != null && m155a.f107a == 0 && m155a.f108b == m155a.f109c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: c */
    public static InputStream m159c(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }
}
