package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0237b;

/* renamed from: ff */
/* loaded from: classes.dex */
public final class C2471ff {

    /* renamed from: a */
    private static volatile boolean f10124a = true;

    /* renamed from: a */
    public static Drawable m11762a(Context context, int i, Resources.Theme theme) {
        return m11764a(context, context, i, theme);
    }

    /* renamed from: a */
    public static Drawable m11763a(Context context, Context context2, int i) {
        return m11764a(context, context2, i, null);
    }

    /* renamed from: a */
    private static Drawable m11764a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f10124a) {
                return m11766c(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return C0237b.m1466c(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f10124a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m11765b(context2, i, theme);
    }

    /* renamed from: b */
    private static Drawable m11765b(Context context, int i, Resources.Theme theme) {
        return C3066p0.m14677a(context.getResources(), i, theme);
    }

    /* renamed from: c */
    private static Drawable m11766c(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new C2794j(context, theme);
        }
        return C0000a.m4c(context, i);
    }
}
