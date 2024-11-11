package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.i;

/* loaded from: classes.dex */
public class xf implements ag<Bitmap, BitmapDrawable> {
    private final Resources a;

    public xf(Resources resources) {
        ji.a(resources);
        this.a = resources;
    }

    @Override // defpackage.ag
    public vb<BitmapDrawable> a(vb<Bitmap> vbVar, i iVar) {
        return we.a(this.a, vbVar);
    }
}
