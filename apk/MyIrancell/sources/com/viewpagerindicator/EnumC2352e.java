package com.viewpagerindicator;

/* renamed from: com.viewpagerindicator.e */
/* loaded from: classes.dex */
public enum EnumC2352e {
    None(0),
    Triangle(1),
    Underline(2);

    public final int value;

    EnumC2352e(int i) {
        this.value = i;
    }

    public static EnumC2352e fromValue(int i) {
        for (EnumC2352e enumC2352e : values()) {
            if (enumC2352e.value == i) {
                return enumC2352e;
            }
        }
        return null;
    }
}
