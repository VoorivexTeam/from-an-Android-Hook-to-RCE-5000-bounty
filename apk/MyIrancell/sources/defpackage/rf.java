package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import com.bumptech.glide.load.l;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class rf implements l<of> {
    private final l<Bitmap> b;

    public rf(l<Bitmap> lVar) {
        ji.a(lVar);
        this.b = lVar;
    }

    @Override // com.bumptech.glide.load.l
    public vb<of> a(Context context, vb<of> vbVar, int i, int i2) {
        of ofVar = vbVar.get();
        vb<Bitmap> jeVar = new je(ofVar.c(), c.b(context).c());
        vb<Bitmap> a = this.b.a(context, jeVar, i, i2);
        if (!jeVar.equals(a)) {
            jeVar.b();
        }
        ofVar.a(this.b, a.get());
        return vbVar;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof rf) {
            return this.b.equals(((rf) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.b.hashCode();
    }
}
