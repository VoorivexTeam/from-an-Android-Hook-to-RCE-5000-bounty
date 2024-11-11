package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0575i;
import java.io.ByteArrayOutputStream;

/* renamed from: wf */
/* loaded from: classes.dex */
public class C3396wf implements InterfaceC0020ag<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f13836a;

    /* renamed from: b */
    private final int f13837b;

    public C3396wf() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C3396wf(Bitmap.CompressFormat compressFormat, int i) {
        this.f13836a = compressFormat;
        this.f13837b = i;
    }

    @Override // p000.InterfaceC0020ag
    /* renamed from: a */
    public InterfaceC3353vb<byte[]> mo152a(InterfaceC3353vb<Bitmap> interfaceC3353vb, C0575i c0575i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC3353vb.get().compress(this.f13836a, this.f13837b, byteArrayOutputStream);
        interfaceC3353vb.mo3383b();
        return new C2430ef(byteArrayOutputStream.toByteArray());
    }
}
