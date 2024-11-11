package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;

/* loaded from: classes.dex */
public class ge<DataType> implements j<DataType, BitmapDrawable> {
    private final j<DataType, Bitmap> a;
    private final Resources b;

    public ge(Resources resources, j<DataType, Bitmap> jVar) {
        ji.a(resources);
        this.b = resources;
        ji.a(jVar);
        this.a = jVar;
    }

    @Override // com.bumptech.glide.load.j
    public vb<BitmapDrawable> a(DataType datatype, int i, int i2, i iVar) {
        return we.a(this.b, this.a.a(datatype, i, i2, iVar));
    }

    @Override // com.bumptech.glide.load.j
    public boolean a(DataType datatype, i iVar) {
        return this.a.a(datatype, iVar);
    }
}
