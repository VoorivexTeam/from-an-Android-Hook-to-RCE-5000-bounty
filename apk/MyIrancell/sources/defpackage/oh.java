package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class oh extends ph<Drawable> {
    public oh(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ph
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(Drawable drawable) {
        ((ImageView) this.b).setImageDrawable(drawable);
    }
}
