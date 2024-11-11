package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: classes.dex */
class C0196s0 extends C0178j0 {

    /* renamed from: b */
    private final WeakReference<Context> f1215b;

    public C0196s0(Context context, Resources resources) {
        super(resources);
        this.f1215b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.C0178j0, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f1215b.get();
        if (drawable != null && context != null) {
            C0175i.m1020a();
            C0175i.m1026a(context, i, drawable);
        }
        return drawable;
    }
}
