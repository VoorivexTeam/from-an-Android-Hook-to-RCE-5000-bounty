package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class fc implements ec {
    @Override // defpackage.ec
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ec
    public void a() {
    }

    @Override // defpackage.ec
    public void a(int i) {
    }

    @Override // defpackage.ec
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.ec
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        return a(i, i2, config);
    }
}
