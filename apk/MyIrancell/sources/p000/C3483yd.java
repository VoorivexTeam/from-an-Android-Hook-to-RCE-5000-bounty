package p000;

import android.net.Uri;
import com.bumptech.glide.load.C0575i;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.InterfaceC3031od;

/* renamed from: yd */
/* loaded from: classes.dex */
public class C3483yd<Data> implements InterfaceC3031od<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f14134b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    private final InterfaceC3031od<C2549hd, Data> f14135a;

    /* renamed from: yd$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC3081pd<Uri, InputStream> {
        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Uri, InputStream> mo139a(C3206sd c3206sd) {
            return new C3483yd(c3206sd.m15400a(C2549hd.class, InputStream.class));
        }
    }

    public C3483yd(InterfaceC3031od<C2549hd, Data> interfaceC3031od) {
        this.f14135a = interfaceC3031od;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<Data> mo137a(Uri uri, int i, int i2, C0575i c0575i) {
        return this.f14135a.mo137a(new C2549hd(uri.toString()), i, i2, c0575i);
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(Uri uri) {
        return f14134b.contains(uri.getScheme());
    }
}
