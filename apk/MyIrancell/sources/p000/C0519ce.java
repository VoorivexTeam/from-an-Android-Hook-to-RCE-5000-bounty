package p000;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C0575i;
import java.io.InputStream;
import p000.InterfaceC3031od;

/* renamed from: ce */
/* loaded from: classes.dex */
public class C0519ce implements InterfaceC3031od<Uri, InputStream> {

    /* renamed from: a */
    private final Context f3001a;

    /* renamed from: ce$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC3081pd<Uri, InputStream> {

        /* renamed from: a */
        private final Context f3002a;

        public a(Context context) {
            this.f3002a = context;
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Uri, InputStream> mo139a(C3206sd c3206sd) {
            return new C0519ce(this.f3002a);
        }
    }

    public C0519ce(Context context) {
        this.f3001a = context.getApplicationContext();
    }

    /* renamed from: a */
    private boolean m3667a(C0575i c0575i) {
        Long l = (Long) c0575i.m3964a(C0520cf.f3003d);
        return l != null && l.longValue() == -1;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<InputStream> mo137a(Uri uri, int i, int i2, C0575i c0575i) {
        if (C3391wa.m16191a(i, i2) && m3667a(c0575i)) {
            return new InterfaceC3031od.a<>(new C3529zh(uri), C3431xa.m16477b(this.f3001a, uri));
        }
        return null;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(Uri uri) {
        return C3391wa.m16194c(uri);
    }
}
