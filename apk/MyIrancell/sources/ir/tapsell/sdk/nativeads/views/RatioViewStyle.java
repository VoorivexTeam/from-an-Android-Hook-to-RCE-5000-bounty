package ir.tapsell.sdk.nativeads.views;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public enum RatioViewStyle implements NoProguard {
    FIXED_WIDTH(0),
    FIXED_HEIGHT(1);


    /* renamed from: id */
    int f11188id;

    RatioViewStyle(int i) {
        this.f11188id = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RatioViewStyle fromId(int i) {
        for (RatioViewStyle ratioViewStyle : values()) {
            if (ratioViewStyle.f11188id == i) {
                return ratioViewStyle;
            }
        }
        return FIXED_WIDTH;
    }
}
