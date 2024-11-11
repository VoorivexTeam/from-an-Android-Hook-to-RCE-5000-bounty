package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;

/* loaded from: classes.dex */
public class ye implements j<Uri, Bitmap> {
    private final Cif a;
    private final ec b;

    public ye(Cif cif, ec ecVar) {
        this.a = cif;
        this.b = ecVar;
    }

    @Override // com.bumptech.glide.load.j
    public vb<Bitmap> a(Uri uri, int i, int i2, i iVar) {
        vb<Drawable> a = this.a.a(uri, i, i2, iVar);
        if (a == null) {
            return null;
        }
        return re.a(this.b, a.get(), i, i2);
    }

    @Override // com.bumptech.glide.load.j
    public boolean a(Uri uri, i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
