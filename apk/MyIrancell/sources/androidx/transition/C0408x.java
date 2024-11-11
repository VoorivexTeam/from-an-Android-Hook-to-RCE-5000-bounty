package androidx.transition;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.x */
/* loaded from: classes.dex */
class C0408x {

    /* renamed from: a */
    private static LayoutTransition f2532a;

    /* renamed from: b */
    private static Field f2533b;

    /* renamed from: c */
    private static boolean f2534c;

    /* renamed from: d */
    private static Method f2535d;

    /* renamed from: e */
    private static boolean f2536e;

    /* renamed from: androidx.transition.x$a */
    /* loaded from: classes.dex */
    static class a extends LayoutTransition {
        a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    /* renamed from: a */
    private static void m3060a(LayoutTransition layoutTransition) {
        if (!f2536e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f2535d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2536e = true;
        }
        Method method = f2535d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3061a(ViewGroup viewGroup, boolean z) {
        LayoutTransition layoutTransition;
        boolean z2 = false;
        if (f2532a == null) {
            a aVar = new a();
            f2532a = aVar;
            aVar.setAnimator(2, null);
            f2532a.setAnimator(0, null);
            f2532a.setAnimator(1, null);
            f2532a.setAnimator(3, null);
            f2532a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition2 = viewGroup.getLayoutTransition();
            if (layoutTransition2 != null) {
                if (layoutTransition2.isRunning()) {
                    m3060a(layoutTransition2);
                }
                if (layoutTransition2 != f2532a) {
                    viewGroup.setTag(R$id.transition_layout_save, layoutTransition2);
                }
            }
            layoutTransition = f2532a;
        } else {
            viewGroup.setLayoutTransition(null);
            if (!f2534c) {
                try {
                    Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                    f2533b = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f2534c = true;
            }
            Field field = f2533b;
            if (field != null) {
                try {
                    boolean z3 = field.getBoolean(viewGroup);
                    if (z3) {
                        try {
                            f2533b.setBoolean(viewGroup, false);
                        } catch (IllegalAccessException unused2) {
                        }
                    }
                    z2 = z3;
                } catch (IllegalAccessException unused3) {
                }
            }
            if (z2) {
                viewGroup.requestLayout();
            }
            layoutTransition = (LayoutTransition) viewGroup.getTag(R$id.transition_layout_save);
            if (layoutTransition == null) {
                return;
            } else {
                viewGroup.setTag(R$id.transition_layout_save, null);
            }
        }
        viewGroup.setLayoutTransition(layoutTransition);
    }
}
