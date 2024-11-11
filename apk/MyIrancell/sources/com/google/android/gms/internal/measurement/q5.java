package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class q5 implements y5 {
    private y5[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q5(y5... y5VarArr) {
        this.a = y5VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final boolean a(Class<?> cls) {
        for (y5 y5Var : this.a) {
            if (y5Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final v5 b(Class<?> cls) {
        for (y5 y5Var : this.a) {
            if (y5Var.a(cls)) {
                return y5Var.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
