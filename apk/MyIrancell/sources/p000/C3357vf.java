package p000;

import android.util.Log;
import com.bumptech.glide.load.C0572f;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC0576j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: vf */
/* loaded from: classes.dex */
public class C3357vf implements InterfaceC0576j<InputStream, C3033of> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f13684a;

    /* renamed from: b */
    private final InterfaceC0576j<ByteBuffer, C3033of> f13685b;

    /* renamed from: c */
    private final InterfaceC0475bc f13686c;

    public C3357vf(List<ImageHeaderParser> list, InterfaceC0576j<ByteBuffer, C3033of> interfaceC0576j, InterfaceC0475bc interfaceC0475bc) {
        this.f13684a = list;
        this.f13685b = interfaceC0576j;
        this.f13686c = interfaceC0475bc;
    }

    /* renamed from: a */
    private static byte[] m16015a(InputStream inputStream) {
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

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3353vb<C3033of> mo3381a(InputStream inputStream, int i, int i2, C0575i c0575i) {
        byte[] m16015a = m16015a(inputStream);
        if (m16015a == null) {
            return null;
        }
        return this.f13685b.mo3381a(ByteBuffer.wrap(m16015a), i, i2, c0575i);
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo3382a(InputStream inputStream, C0575i c0575i) {
        return !((Boolean) c0575i.m3964a(C3304uf.f13467b)).booleanValue() && C0572f.m3953b(this.f13684a, inputStream, this.f13686c) == ImageHeaderParser.ImageType.GIF;
    }
}
