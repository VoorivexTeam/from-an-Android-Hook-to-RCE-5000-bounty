package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class we implements vb<BitmapDrawable>, rb {
    private final Resources b;
    private final vb<Bitmap> c;

    private we(Resources resources, vb<Bitmap> vbVar) {
        ji.a(resources);
        this.b = resources;
        ji.a(vbVar);
        this.c = vbVar;
    }

    public static vb<BitmapDrawable> a(Resources resources, vb<Bitmap> vbVar) {
        if (vbVar == null) {
            return null;
        }
        return new we(resources, vbVar);
    }

    @Override // defpackage.rb
    public void a() {
        vb<Bitmap> vbVar = this.c;
        if (vbVar instanceof rb) {
            ((rb) vbVar).a();
        }
    }

    @Override // defpackage.vb
    public void b() {
        this.c.b();
    }

    @Override // defpackage.vb
    public int c() {
        return this.c.c();
    }

    @Override // defpackage.vb
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.vb
    public BitmapDrawable get() {
        return new BitmapDrawable(this.b, this.c.get());
    }
}
