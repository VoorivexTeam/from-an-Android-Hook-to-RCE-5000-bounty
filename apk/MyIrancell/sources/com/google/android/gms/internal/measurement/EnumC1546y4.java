package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y4 */
/* loaded from: classes.dex */
public enum EnumC1546y4 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(AbstractC1300h3.class, AbstractC1300h3.class, AbstractC1300h3.f6635c),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);

    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    EnumC1546y4(Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
