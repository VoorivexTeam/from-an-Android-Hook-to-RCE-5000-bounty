package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import java.lang.reflect.Method;

/* renamed from: com.google.android.material.internal.d */
/* loaded from: classes.dex */
public class C2005d {

    /* renamed from: a */
    private static Method f8539a;

    /* renamed from: b */
    private static boolean f8540b;

    /* renamed from: a */
    public static boolean m10259a(DrawableContainer drawableContainer, Drawable.ConstantState constantState) {
        return m10260b(drawableContainer, constantState);
    }

    /* renamed from: b */
    private static boolean m10260b(DrawableContainer drawableContainer, Drawable.ConstantState constantState) {
        if (!f8540b) {
            try {
                Method declaredMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", DrawableContainer.DrawableContainerState.class);
                f8539a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f8540b = true;
        }
        Method method = f8539a;
        if (method != null) {
            try {
                method.invoke(drawableContainer, constantState);
                return true;
            } catch (Exception unused2) {
            }
        }
        return false;
    }
}
