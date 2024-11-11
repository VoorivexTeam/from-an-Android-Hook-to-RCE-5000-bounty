package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y1 extends x1<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public y1(d2 d2Var, String str, Boolean bool) {
        super(d2Var, str, bool, null);
    }

    @Override // com.google.android.gms.internal.measurement.x1
    final /* synthetic */ Boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (e1.c.matcher(str).matches()) {
                return true;
            }
            if (e1.d.matcher(str).matches()) {
                return false;
            }
        }
        String a = super.a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
