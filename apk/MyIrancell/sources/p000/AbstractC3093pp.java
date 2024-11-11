package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0943r;
import com.google.android.gms.common.api.internal.C0947s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pp */
/* loaded from: classes.dex */
public abstract class AbstractC3093pp extends AbstractC0943r<C3446xp, Void> {

    /* renamed from: c */
    private C2908ls<Void> f12632c;

    private AbstractC3093pp() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC3093pp(C3495yp c3495yp) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m14815a(Status status) {
        C0947s.m6876a(status, this.f12632c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC0943r
    /* renamed from: a */
    public /* synthetic */ void mo6848a(C3446xp c3446xp, C2908ls<Void> c2908ls) {
        this.f12632c = c2908ls;
        mo14816a((InterfaceC3270tp) c3446xp.m7070A());
    }

    /* renamed from: a */
    protected abstract void mo14816a(InterfaceC3270tp interfaceC3270tp);
}
