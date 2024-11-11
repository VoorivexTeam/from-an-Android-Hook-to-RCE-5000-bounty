package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.q0 */
/* loaded from: classes.dex */
public class C0192q0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1204c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0192q0>> f1205d;

    /* renamed from: a */
    private final Resources f1206a;

    /* renamed from: b */
    private final Resources.Theme f1207b;

    private C0192q0(Context context) {
        super(context);
        if (!C0208y0.m1241b()) {
            this.f1206a = new C0196s0(this, context.getResources());
            this.f1207b = null;
            return;
        }
        C0208y0 c0208y0 = new C0208y0(this, context.getResources());
        this.f1206a = c0208y0;
        Resources.Theme newTheme = c0208y0.newTheme();
        this.f1207b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    private static boolean m1128a(Context context) {
        if ((context instanceof C0192q0) || (context.getResources() instanceof C0196s0) || (context.getResources() instanceof C0208y0)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0208y0.m1241b();
    }

    /* renamed from: b */
    public static Context m1129b(Context context) {
        if (!m1128a(context)) {
            return context;
        }
        synchronized (f1204c) {
            if (f1205d == null) {
                f1205d = new ArrayList<>();
            } else {
                for (int size = f1205d.size() - 1; size >= 0; size--) {
                    WeakReference<C0192q0> weakReference = f1205d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1205d.remove(size);
                    }
                }
                for (int size2 = f1205d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0192q0> weakReference2 = f1205d.get(size2);
                    C0192q0 c0192q0 = weakReference2 != null ? weakReference2.get() : null;
                    if (c0192q0 != null && c0192q0.getBaseContext() == context) {
                        return c0192q0;
                    }
                }
            }
            C0192q0 c0192q02 = new C0192q0(context);
            f1205d.add(new WeakReference<>(c0192q02));
            return c0192q02;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1206a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1206a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1207b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f1207b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
