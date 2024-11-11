package p000;

import com.bumptech.glide.load.C0574h;
import com.bumptech.glide.load.C0575i;
import java.io.InputStream;
import p000.InterfaceC3031od;

/* renamed from: zd */
/* loaded from: classes.dex */
public class C3525zd implements InterfaceC3031od<C2549hd, InputStream> {

    /* renamed from: b */
    public static final C0574h<Integer> f14443b = C0574h.m3956a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    private final C2985nd<C2549hd, C2549hd> f14444a;

    /* renamed from: zd$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC3081pd<C2549hd, InputStream> {

        /* renamed from: a */
        private final C2985nd<C2549hd, C2549hd> f14445a = new C2985nd<>(500);

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<C2549hd, InputStream> mo139a(C3206sd c3206sd) {
            return new C3525zd(this.f14445a);
        }
    }

    public C3525zd(C2985nd<C2549hd, C2549hd> c2985nd) {
        this.f14444a = c2985nd;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<InputStream> mo137a(C2549hd c2549hd, int i, int i2, C0575i c0575i) {
        C2985nd<C2549hd, C2549hd> c2985nd = this.f14444a;
        if (c2985nd != null) {
            C2549hd m14317a = c2985nd.m14317a(c2549hd, 0, 0);
            if (m14317a == null) {
                this.f14444a.m14318a(c2549hd, 0, 0, c2549hd);
            } else {
                c2549hd = m14317a;
            }
        }
        return new InterfaceC3031od.a<>(c2549hd, new C3119qa(c2549hd, ((Integer) c0575i.m3964a(f14443b)).intValue()));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(C2549hd c2549hd) {
        return true;
    }
}
