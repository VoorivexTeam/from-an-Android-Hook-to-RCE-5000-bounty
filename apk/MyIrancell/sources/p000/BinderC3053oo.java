package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0890e;

/* renamed from: oo */
/* loaded from: classes.dex */
final class BinderC3053oo extends BinderC2602io {

    /* renamed from: a */
    private final InterfaceC0890e<Status> f12521a;

    public BinderC3053oo(InterfaceC0890e<Status> interfaceC0890e) {
        this.f12521a = interfaceC0890e;
    }

    @Override // p000.InterfaceC3217so
    /* renamed from: e */
    public final void mo14647e(int i) {
        this.f12521a.mo6636a(new Status(i));
    }
}
