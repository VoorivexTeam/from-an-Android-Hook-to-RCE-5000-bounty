package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.b2 */
/* loaded from: classes.dex */
public final class C1209b2 extends AbstractC1529x1<Double> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1209b2(C1239d2 c1239d2, String str, Double d) {
        super(c1239d2, str, d, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1529x1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Double mo7526a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String m8877a = super.m8877a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(m8877a).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(m8877a);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
