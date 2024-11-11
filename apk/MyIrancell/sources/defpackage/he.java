package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.File;

/* loaded from: classes.dex */
public class he implements k<BitmapDrawable> {
    private final ec a;
    private final k<Bitmap> b;

    public he(ec ecVar, k<Bitmap> kVar) {
        this.a = ecVar;
        this.b = kVar;
    }

    @Override // com.bumptech.glide.load.k
    public c a(i iVar) {
        return this.b.a(iVar);
    }

    @Override // com.bumptech.glide.load.d
    public boolean a(vb<BitmapDrawable> vbVar, File file, i iVar) {
        return this.b.a(new je(vbVar.get().getBitmap(), this.a), file, iVar);
    }
}
