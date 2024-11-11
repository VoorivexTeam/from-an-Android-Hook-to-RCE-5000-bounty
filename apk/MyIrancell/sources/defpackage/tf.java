package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;

/* loaded from: classes.dex */
public final class tf implements j<ca, Bitmap> {
    private final ec a;

    public tf(ec ecVar) {
        this.a = ecVar;
    }

    @Override // com.bumptech.glide.load.j
    public vb<Bitmap> a(ca caVar, int i, int i2, i iVar) {
        return je.a(caVar.b(), this.a);
    }

    @Override // com.bumptech.glide.load.j
    public boolean a(ca caVar, i iVar) {
        return true;
    }
}
