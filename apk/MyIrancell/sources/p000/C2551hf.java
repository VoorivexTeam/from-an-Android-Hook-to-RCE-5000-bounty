package p000;

import android.graphics.drawable.Drawable;

/* renamed from: hf */
/* loaded from: classes.dex */
final class C2551hf extends AbstractC2511gf<Drawable> {
    private C2551hf(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC3353vb<Drawable> m12215a(Drawable drawable) {
        if (drawable != null) {
            return new C2551hf(drawable);
        }
        return null;
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: b */
    public void mo3383b() {
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: c */
    public int mo3384c() {
        return Math.max(1, this.f10318b.getIntrinsicWidth() * this.f10318b.getIntrinsicHeight() * 4);
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: d */
    public Class<Drawable> mo3385d() {
        return this.f10318b.getClass();
    }
}
