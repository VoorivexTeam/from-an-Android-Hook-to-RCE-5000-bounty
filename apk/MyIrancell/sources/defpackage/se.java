package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import com.bumptech.glide.load.l;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class se implements l<Drawable> {
    private final l<Bitmap> b;
    private final boolean c;

    public se(l<Bitmap> lVar, boolean z) {
        this.b = lVar;
        this.c = z;
    }

    private vb<Drawable> a(Context context, vb<Bitmap> vbVar) {
        return we.a(context.getResources(), vbVar);
    }

    public l<BitmapDrawable> a() {
        return this;
    }

    @Override // com.bumptech.glide.load.l
    public vb<Drawable> a(Context context, vb<Drawable> vbVar, int i, int i2) {
        ec c = c.b(context).c();
        Drawable drawable = vbVar.get();
        vb<Bitmap> a = re.a(c, drawable, i, i2);
        if (a != null) {
            vb<Bitmap> a2 = this.b.a(context, a, i, i2);
            if (!a2.equals(a)) {
                return a(context, a2);
            }
            a2.b();
            return vbVar;
        }
        if (!this.c) {
            return vbVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof se) {
            return this.b.equals(((se) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.b.hashCode();
    }
}
