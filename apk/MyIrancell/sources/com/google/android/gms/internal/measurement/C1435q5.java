package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q5 */
/* loaded from: classes.dex */
final class C1435q5 implements InterfaceC1547y5 {

    /* renamed from: a */
    private InterfaceC1547y5[] f6845a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1435q5(InterfaceC1547y5... interfaceC1547y5Arr) {
        this.f6845a = interfaceC1547y5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1547y5
    /* renamed from: a */
    public final boolean mo8022a(Class<?> cls) {
        for (InterfaceC1547y5 interfaceC1547y5 : this.f6845a) {
            if (interfaceC1547y5.mo8022a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1547y5
    /* renamed from: b */
    public final InterfaceC1505v5 mo8023b(Class<?> cls) {
        for (InterfaceC1547y5 interfaceC1547y5 : this.f6845a) {
            if (interfaceC1547y5.mo8022a(cls)) {
                return interfaceC1547y5.mo8023b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
