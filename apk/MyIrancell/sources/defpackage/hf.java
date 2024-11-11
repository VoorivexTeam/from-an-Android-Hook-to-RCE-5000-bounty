package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class hf extends gf<Drawable> {
    private hf(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vb<Drawable> a(Drawable drawable) {
        if (drawable != null) {
            return new hf(drawable);
        }
        return null;
    }

    @Override // defpackage.vb
    public void b() {
    }

    @Override // defpackage.vb
    public int c() {
        return Math.max(1, this.b.getIntrinsicWidth() * this.b.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.vb
    public Class<Drawable> d() {
        return this.b.getClass();
    }
}
