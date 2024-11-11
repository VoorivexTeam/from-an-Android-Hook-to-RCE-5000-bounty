package p000;

/* renamed from: v7 */
/* loaded from: classes.dex */
public enum EnumC3341v7 {
    JSON(".json"),
    ZIP(".zip");

    public final String extension;

    EnumC3341v7(String str) {
        this.extension = str;
    }

    public static EnumC3341v7 forFile(String str) {
        for (EnumC3341v7 enumC3341v7 : values()) {
            if (str.endsWith(enumC3341v7.extension)) {
                return enumC3341v7;
            }
        }
        C3116q9.m15002b("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}
