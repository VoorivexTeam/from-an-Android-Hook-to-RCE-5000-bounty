package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.y1 */
/* loaded from: classes.dex */
public final class C1543y1 extends AbstractC1529x1<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1543y1(C1239d2 c1239d2, String str, Boolean bool) {
        super(c1239d2, str, bool, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1529x1
    /* renamed from: a */
    final /* synthetic */ Boolean mo7526a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C1253e1.f6583c.matcher(str).matches()) {
                return true;
            }
            if (C1253e1.f6584d.matcher(str).matches()) {
                return false;
            }
        }
        String m8877a = super.m8877a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(m8877a).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(m8877a);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
