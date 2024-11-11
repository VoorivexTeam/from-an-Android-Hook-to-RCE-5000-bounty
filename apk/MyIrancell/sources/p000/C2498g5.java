package p000;

import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2538h5;
import p000.C2924m7;

/* renamed from: g5 */
/* loaded from: classes.dex */
public class C2498g5 implements InterfaceC3109q4, AbstractC2538h5.b {

    /* renamed from: a */
    private final String f10212a;

    /* renamed from: b */
    private final boolean f10213b;

    /* renamed from: c */
    private final List<AbstractC2538h5.b> f10214c = new ArrayList();

    /* renamed from: d */
    private final C2924m7.a f10215d;

    /* renamed from: e */
    private final AbstractC2538h5<?, Float> f10216e;

    /* renamed from: f */
    private final AbstractC2538h5<?, Float> f10217f;

    /* renamed from: g */
    private final AbstractC2538h5<?, Float> f10218g;

    public C2498g5(AbstractC2976n7 abstractC2976n7, C2924m7 c2924m7) {
        this.f10212a = c2924m7.m14057b();
        this.f10213b = c2924m7.m14061f();
        this.f10215d = c2924m7.m14060e();
        this.f10216e = c2924m7.m14059d().mo12378a();
        this.f10217f = c2924m7.m14056a().mo12378a();
        this.f10218g = c2924m7.m14058c().mo12378a();
        abstractC2976n7.m14279a(this.f10216e);
        abstractC2976n7.m14279a(this.f10217f);
        abstractC2976n7.m14279a(this.f10218g);
        this.f10216e.m12102a(this);
        this.f10217f.m12102a(this);
        this.f10218g.m12102a(this);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f10212a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11888a(AbstractC2538h5.b bVar) {
        this.f10214c.add(bVar);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        for (int i = 0; i < this.f10214c.size(); i++) {
            this.f10214c.get(i).mo3322b();
        }
    }

    /* renamed from: d */
    public AbstractC2538h5<?, Float> m11889d() {
        return this.f10217f;
    }

    /* renamed from: e */
    public AbstractC2538h5<?, Float> m11890e() {
        return this.f10218g;
    }

    /* renamed from: f */
    public AbstractC2538h5<?, Float> m11891f() {
        return this.f10216e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C2924m7.a m11892g() {
        return this.f10215d;
    }

    /* renamed from: h */
    public boolean m11893h() {
        return this.f10213b;
    }
}
