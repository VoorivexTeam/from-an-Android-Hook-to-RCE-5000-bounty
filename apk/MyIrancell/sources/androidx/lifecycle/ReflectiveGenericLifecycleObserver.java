package androidx.lifecycle;

import androidx.lifecycle.AbstractC0299e;
import androidx.lifecycle.C0295a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0298d {

    /* renamed from: a */
    private final Object f1897a;

    /* renamed from: b */
    private final C0295a.a f1898b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1897a = obj;
        this.f1898b = C0295a.f1900c.m2023a(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0298d
    /* renamed from: a */
    public void mo2004a(InterfaceC0301g interfaceC0301g, AbstractC0299e.a aVar) {
        this.f1898b.m2026a(interfaceC0301g, aVar, this.f1897a);
    }
}
