package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class je implements vb<Bitmap>, rb {
    private final Bitmap b;
    private final ec c;

    public je(Bitmap bitmap, ec ecVar) {
        ji.a(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        ji.a(ecVar, "BitmapPool must not be null");
        this.c = ecVar;
    }

    public static je a(Bitmap bitmap, ec ecVar) {
        if (bitmap == null) {
            return null;
        }
        return new je(bitmap, ecVar);
    }

    @Override // defpackage.rb
    public void a() {
        this.b.prepareToDraw();
    }

    @Override // defpackage.vb
    public void b() {
        this.c.a(this.b);
    }

    @Override // defpackage.vb
    public int c() {
        return ki.a(this.b);
    }

    @Override // defpackage.vb
    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.vb
    public Bitmap get() {
        return this.b;
    }
}
