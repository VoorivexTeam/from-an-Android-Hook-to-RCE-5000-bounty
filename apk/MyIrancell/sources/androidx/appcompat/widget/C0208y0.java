package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.y0 */
/* loaded from: classes.dex */
public class C0208y0 extends Resources {

    /* renamed from: b */
    private static boolean f1317b = false;

    /* renamed from: a */
    private final WeakReference<Context> f1318a;

    public C0208y0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1318a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1240a() {
        return f1317b;
    }

    /* renamed from: b */
    public static boolean m1241b() {
        return m1240a() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable m1242a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f1318a.get();
        return context != null ? C0175i.m1020a().m1041a(context, this, i) : super.getDrawable(i);
    }
}
