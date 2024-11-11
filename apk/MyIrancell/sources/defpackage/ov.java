package defpackage;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class ov {
    public static String a() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
