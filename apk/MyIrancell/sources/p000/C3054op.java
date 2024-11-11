package p000;

import com.google.android.gms.common.Feature;

/* renamed from: op */
/* loaded from: classes.dex */
public final class C3054op {

    /* renamed from: a */
    public static final Feature f12522a = new Feature("sms_code_autofill", 1);

    /* renamed from: b */
    public static final Feature f12523b;

    /* renamed from: c */
    public static final Feature[] f12524c;

    static {
        Feature feature = new Feature("user_consent", 2L);
        f12523b = feature;
        f12524c = new Feature[]{f12522a, feature};
    }
}
