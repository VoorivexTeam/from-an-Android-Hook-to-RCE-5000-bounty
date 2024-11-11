package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class k7 extends i7<h7, h7> {
    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static void a2(Object obj, h7 h7Var) {
        ((o4) obj).zzb = h7Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* synthetic */ h7 a() {
        return h7.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* synthetic */ h7 a(Object obj) {
        return ((o4) obj).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* synthetic */ void a(h7 h7Var, int i, long j) {
        h7Var.a(i << 3, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* synthetic */ void a(h7 h7Var, int i, h3 h3Var) {
        h7Var.a((i << 3) | 2, h3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* synthetic */ void a(h7 h7Var, b8 b8Var) {
        h7Var.b(b8Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* bridge */ /* synthetic */ void a(Object obj, h7 h7Var) {
        a2(obj, h7Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final void b(Object obj) {
        ((o4) obj).zzb.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* synthetic */ void b(h7 h7Var, b8 b8Var) {
        h7Var.a(b8Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* synthetic */ void b(Object obj, h7 h7Var) {
        a2(obj, h7Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* synthetic */ int c(h7 h7Var) {
        return h7Var.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* synthetic */ h7 c(h7 h7Var, h7 h7Var2) {
        h7 h7Var3 = h7Var;
        h7 h7Var4 = h7Var2;
        return h7Var4.equals(h7.d()) ? h7Var3 : h7.a(h7Var3, h7Var4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.i7
    public final /* synthetic */ int d(h7 h7Var) {
        return h7Var.c();
    }
}
