package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class op {
    public static final Feature a = new Feature("sms_code_autofill", 1);
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("user_consent", 2L);
        b = feature;
        c = new Feature[]{a, feature};
    }
}
