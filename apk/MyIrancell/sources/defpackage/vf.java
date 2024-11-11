package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class vf implements j<InputStream, of> {
    private final List<ImageHeaderParser> a;
    private final j<ByteBuffer, of> b;
    private final bc c;

    public vf(List<ImageHeaderParser> list, j<ByteBuffer, of> jVar, bc bcVar) {
        this.a = list;
        this.b = jVar;
        this.c = bcVar;
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.j
    public vb<of> a(InputStream inputStream, int i, int i2, i iVar) {
        byte[] a = a(inputStream);
        if (a == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(a), i, i2, iVar);
    }

    @Override // com.bumptech.glide.load.j
    public boolean a(InputStream inputStream, i iVar) {
        return !((Boolean) iVar.a(uf.b)).booleanValue() && f.b(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
