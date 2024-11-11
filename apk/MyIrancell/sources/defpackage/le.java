package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class le implements j<ByteBuffer, Bitmap> {
    private final qe a;

    public le(qe qeVar) {
        this.a = qeVar;
    }

    @Override // com.bumptech.glide.load.j
    public vb<Bitmap> a(ByteBuffer byteBuffer, int i, int i2, i iVar) {
        return this.a.a(ai.c(byteBuffer), i, i2, iVar);
    }

    @Override // com.bumptech.glide.load.j
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        return this.a.a(byteBuffer);
    }
}
