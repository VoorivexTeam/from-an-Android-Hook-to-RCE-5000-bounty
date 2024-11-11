package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.i;

/* loaded from: classes.dex */
public final class yf implements ag<Drawable, byte[]> {
    private final ec a;
    private final ag<Bitmap, byte[]> b;
    private final ag<of, byte[]> c;

    public yf(ec ecVar, ag<Bitmap, byte[]> agVar, ag<of, byte[]> agVar2) {
        this.a = ecVar;
        this.b = agVar;
        this.c = agVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static vb<of> a(vb<Drawable> vbVar) {
        return vbVar;
    }

    @Override // defpackage.ag
    public vb<byte[]> a(vb<Drawable> vbVar, i iVar) {
        Drawable drawable = vbVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(je.a(((BitmapDrawable) drawable).getBitmap(), this.a), iVar);
        }
        if (!(drawable instanceof of)) {
            return null;
        }
        ag<of, byte[]> agVar = this.c;
        a(vbVar);
        return agVar.a(vbVar, iVar);
    }
}
