package androidx.lifecycle;

import androidx.lifecycle.AbstractC0299e;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements InterfaceC0298d {

    /* renamed from: a */
    private final InterfaceC0297c[] f1877a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(InterfaceC0297c[] interfaceC0297cArr) {
        this.f1877a = interfaceC0297cArr;
    }

    @Override // androidx.lifecycle.InterfaceC0298d
    /* renamed from: a */
    public void mo2004a(InterfaceC0301g interfaceC0301g, AbstractC0299e.a aVar) {
        C0305k c0305k = new C0305k();
        for (InterfaceC0297c interfaceC0297c : this.f1877a) {
            interfaceC0297c.m2034a(interfaceC0301g, aVar, false, c0305k);
        }
        for (InterfaceC0297c interfaceC0297c2 : this.f1877a) {
            interfaceC0297c2.m2034a(interfaceC0301g, aVar, true, c0305k);
        }
    }
}
