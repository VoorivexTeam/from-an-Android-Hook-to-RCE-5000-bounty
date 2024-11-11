package p000;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.InterfaceC0573g;
import p000.InterfaceC3354vc;

/* renamed from: uc */
/* loaded from: classes.dex */
public class C3301uc extends C2514gi<InterfaceC0573g, InterfaceC3353vb<?>> implements InterfaceC3354vc {

    /* renamed from: d */
    private InterfaceC3354vc.a f13463d;

    public C3301uc(long j) {
        super(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.C2514gi
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int mo12005b(InterfaceC3353vb<?> interfaceC3353vb) {
        return interfaceC3353vb == null ? super.mo12005b(null) : interfaceC3353vb.mo3384c();
    }

    @Override // p000.InterfaceC3354vc
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC3353vb mo15790a(InterfaceC0573g interfaceC0573g) {
        return (InterfaceC3353vb) super.m12008c(interfaceC0573g);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.InterfaceC3354vc
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC3353vb mo15791a(InterfaceC0573g interfaceC0573g, InterfaceC3353vb interfaceC3353vb) {
        return (InterfaceC3353vb) super.m12007b((C3301uc) interfaceC0573g, (InterfaceC0573g) interfaceC3353vb);
    }

    @Override // p000.InterfaceC3354vc
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo15792a(int i) {
        if (i >= 40) {
            m12002a();
        } else if (i >= 20 || i == 15) {
            m12003a(m12006b() / 2);
        }
    }

    @Override // p000.InterfaceC3354vc
    /* renamed from: a */
    public void mo15793a(InterfaceC3354vc.a aVar) {
        this.f13463d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.C2514gi
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo12004a(InterfaceC0573g interfaceC0573g, InterfaceC3353vb<?> interfaceC3353vb) {
        InterfaceC3354vc.a aVar = this.f13463d;
        if (aVar == null || interfaceC3353vb == null) {
            return;
        }
        aVar.mo13669a(interfaceC3353vb);
    }
}
