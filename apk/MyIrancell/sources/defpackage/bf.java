package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;

/* loaded from: classes.dex */
public final class bf implements j<Bitmap, Bitmap> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements vb<Bitmap> {
        private final Bitmap b;

        a(Bitmap bitmap) {
            this.b = bitmap;
        }

        @Override // defpackage.vb
        public void b() {
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

    @Override // com.bumptech.glide.load.j
    public vb<Bitmap> a(Bitmap bitmap, int i, int i2, i iVar) {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.j
    public boolean a(Bitmap bitmap, i iVar) {
        return true;
    }
}
