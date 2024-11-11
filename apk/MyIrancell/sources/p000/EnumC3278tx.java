package p000;

/* renamed from: tx */
/* loaded from: classes.dex */
enum EnumC3278tx {
    WEP,
    WPA,
    NO_PASSWORD;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static EnumC3278tx forIntentValue(String str) {
        if (str == null) {
            return NO_PASSWORD;
        }
        if ("WPA".equals(str)) {
            return WPA;
        }
        if ("WEP".equals(str)) {
            return WEP;
        }
        if ("nopass".equals(str)) {
            return NO_PASSWORD;
        }
        throw new IllegalArgumentException(str);
    }
}
