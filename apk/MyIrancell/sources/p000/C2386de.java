package p000;

import com.bumptech.glide.load.C0575i;
import java.io.InputStream;
import java.net.URL;
import p000.InterfaceC3031od;

/* renamed from: de */
/* loaded from: classes.dex */
public class C2386de implements InterfaceC3031od<URL, InputStream> {

    /* renamed from: a */
    private final InterfaceC3031od<C2549hd, InputStream> f9806a;

    /* renamed from: de$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC3081pd<URL, InputStream> {
        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<URL, InputStream> mo139a(C3206sd c3206sd) {
            return new C2386de(c3206sd.m15400a(C2549hd.class, InputStream.class));
        }
    }

    public C2386de(InterfaceC3031od<C2549hd, InputStream> interfaceC3031od) {
        this.f9806a = interfaceC3031od;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<InputStream> mo137a(URL url, int i, int i2, C0575i c0575i) {
        return this.f9806a.mo137a(new C2549hd(url), i, i2, c0575i);
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(URL url) {
        return true;
    }
}
