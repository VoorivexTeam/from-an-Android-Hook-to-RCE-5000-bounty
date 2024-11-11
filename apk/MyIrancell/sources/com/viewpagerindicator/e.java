package com.viewpagerindicator;

/* loaded from: classes.dex */
public enum e {
    None(0),
    Triangle(1),
    Underline(2);

    public final int value;

    e(int i) {
        this.value = i;
    }

    public static e fromValue(int i) {
        for (e eVar : values()) {
            if (eVar.value == i) {
                return eVar;
            }
        }
        return null;
    }
}
