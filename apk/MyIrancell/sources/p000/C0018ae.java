package p000;

import android.net.Uri;
import com.bumptech.glide.load.C0575i;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.InterfaceC3031od;

/* renamed from: ae */
/* loaded from: classes.dex */
public class C0018ae implements InterfaceC3031od<Uri, InputStream> {

    /* renamed from: b */
    private static final Set<String> f97b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    private final InterfaceC3031od<C2549hd, InputStream> f98a;

    /* renamed from: ae$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC3081pd<Uri, InputStream> {
        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Uri, InputStream> mo139a(C3206sd c3206sd) {
            return new C0018ae(c3206sd.m15400a(C2549hd.class, InputStream.class));
        }
    }

    public C0018ae(InterfaceC3031od<C2549hd, InputStream> interfaceC3031od) {
        this.f98a = interfaceC3031od;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<InputStream> mo137a(Uri uri, int i, int i2, C0575i c0575i) {
        return this.f98a.mo137a(new C2549hd(uri.toString()), i, i2, c0575i);
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(Uri uri) {
        return f97b.contains(uri.getScheme());
    }
}
