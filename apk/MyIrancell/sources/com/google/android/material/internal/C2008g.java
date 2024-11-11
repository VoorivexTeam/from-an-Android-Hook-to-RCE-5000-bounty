package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0198t0;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;

/* renamed from: com.google.android.material.internal.g */
/* loaded from: classes.dex */
public final class C2008g {

    /* renamed from: a */
    private static final int[] f8554a = {R$attr.colorPrimary};

    /* renamed from: b */
    private static final int[] f8555b = {R$attr.colorSecondary};

    /* renamed from: a */
    public static void m10266a(Context context) {
        m10269a(context, f8554a, "Theme.AppCompat");
    }

    /* renamed from: a */
    private static void m10267a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            m10271b(context);
        }
        m10266a(context);
    }

    /* renamed from: a */
    private static void m10268a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z = obtainStyledAttributes.getResourceId(R$styleable.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            z = m10272b(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: a */
    private static void m10269a(Context context, int[] iArr, String str) {
        if (m10270a(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: a */
    private static boolean m10270a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    /* renamed from: b */
    public static void m10271b(Context context) {
        m10269a(context, f8555b, "Theme.MaterialComponents");
    }

    /* renamed from: b */
    private static boolean m10272b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    public static TypedArray m10273c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m10267a(context, attributeSet, i, i2);
        m10268a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    public static C0198t0 m10274d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m10267a(context, attributeSet, i, i2);
        m10268a(context, attributeSet, iArr, i, i2, iArr2);
        return C0198t0.m1133a(context, attributeSet, iArr, i, i2);
    }
}
