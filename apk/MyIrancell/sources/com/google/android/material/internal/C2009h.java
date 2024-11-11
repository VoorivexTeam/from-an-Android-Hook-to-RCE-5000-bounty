package com.google.android.material.internal;

import android.graphics.PorterDuff;
import android.view.View;
import p000.C3107q2;

/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes.dex */
public class C2009h {
    /* renamed from: a */
    public static PorterDuff.Mode m10275a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static boolean m10276a(View view) {
        return C3107q2.m14919k(view) == 1;
    }
}
