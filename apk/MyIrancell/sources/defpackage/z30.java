package defpackage;

/* loaded from: classes.dex */
public enum z30 {
    OK,
    ERROR;

    public static z30 fromValue(String str) {
        return valueOf(str);
    }

    public final String value() {
        return name();
    }
}
