package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.z1 */
/* loaded from: classes.dex */
public final class C1557z1 extends AbstractC1529x1<Long> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1557z1(C1239d2 c1239d2, String str, Long l) {
        super(c1239d2, str, l, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1529x1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long mo7526a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String m8877a = super.m8877a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(m8877a).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(m8877a);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
