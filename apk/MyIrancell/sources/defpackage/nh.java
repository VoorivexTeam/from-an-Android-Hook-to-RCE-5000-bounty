package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class nh extends ph<Bitmap> {
    public nh(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ph
    public void a(Bitmap bitmap) {
        ((ImageView) this.b).setImageBitmap(bitmap);
    }
}
