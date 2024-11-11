package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0576j;

/* renamed from: bf */
/* loaded from: classes.dex */
public final class C0478bf implements InterfaceC0576j<Bitmap, Bitmap> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bf$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3353vb<Bitmap> {

        /* renamed from: b */
        private final Bitmap f2798b;

        a(Bitmap bitmap) {
            this.f2798b = bitmap;
        }

        @Override // p000.InterfaceC3353vb
        /* renamed from: b */
        public void mo3383b() {
        }

        @Override // p000.InterfaceC3353vb
        /* renamed from: c */
        public int mo3384c() {
            return C2861ki.m13721a(this.f2798b);
        }

        @Override // p000.InterfaceC3353vb
        /* renamed from: d */
        public Class<Bitmap> mo3385d() {
            return Bitmap.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.InterfaceC3353vb
        public Bitmap get() {
            return this.f2798b;
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3353vb<Bitmap> mo3381a(Bitmap bitmap, int i, int i2, C0575i c0575i) {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.InterfaceC0576j
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo3382a(Bitmap bitmap, C0575i c0575i) {
        return true;
    }
}
