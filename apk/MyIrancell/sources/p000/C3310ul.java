package p000;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ul */
/* loaded from: classes.dex */
public final class C3310ul implements InterfaceC2863kk {

    /* renamed from: a */
    private final Set<C2476fk> f13496a;

    /* renamed from: b */
    private final AbstractC3266tl f13497b;

    /* renamed from: c */
    private final InterfaceC3442xl f13498c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3310ul(Set<C2476fk> set, AbstractC3266tl abstractC3266tl, InterfaceC3442xl interfaceC3442xl) {
        this.f13496a = set;
        this.f13497b = abstractC3266tl;
        this.f13498c = interfaceC3442xl;
    }

    @Override // p000.InterfaceC2863kk
    /* renamed from: a */
    public <T> InterfaceC2818jk<T> mo10740a(String str, Class<T> cls, C2476fk c2476fk, InterfaceC2598ik<T, byte[]> interfaceC2598ik) {
        if (this.f13496a.contains(c2476fk)) {
            return new C3402wl(this.f13497b, str, c2476fk, interfaceC2598ik, this.f13498c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c2476fk, this.f13496a));
    }
}
