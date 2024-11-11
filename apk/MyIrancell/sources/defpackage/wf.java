package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class wf implements ag<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a;
    private final int b;

    public wf() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public wf(Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }

    @Override // defpackage.ag
    public vb<byte[]> a(vb<Bitmap> vbVar, i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vbVar.get().compress(this.a, this.b, byteArrayOutputStream);
        vbVar.b();
        return new ef(byteArrayOutputStream.toByteArray());
    }
}
