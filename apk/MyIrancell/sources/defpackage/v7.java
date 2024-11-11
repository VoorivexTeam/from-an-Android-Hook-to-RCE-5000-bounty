package defpackage;

/* loaded from: classes.dex */
public enum v7 {
    JSON(".json"),
    ZIP(".zip");

    public final String extension;

    v7(String str) {
        this.extension = str;
    }

    public static v7 forFile(String str) {
        for (v7 v7Var : values()) {
            if (str.endsWith(v7Var.extension)) {
                return v7Var;
            }
        }
        q9.b("Unable to find correct extension for " + str);
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
