package p000;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C0575i;
import java.io.InputStream;
import p000.InterfaceC3031od;

/* renamed from: be */
/* loaded from: classes.dex */
public class C0477be implements InterfaceC3031od<Uri, InputStream> {

    /* renamed from: a */
    private final Context f2796a;

    /* renamed from: be$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC3081pd<Uri, InputStream> {

        /* renamed from: a */
        private final Context f2797a;

        public a(Context context) {
            this.f2797a = context;
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Uri, InputStream> mo139a(C3206sd c3206sd) {
            return new C0477be(this.f2797a);
        }
    }

    public C0477be(Context context) {
        this.f2796a = context.getApplicationContext();
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<InputStream> mo137a(Uri uri, int i, int i2, C0575i c0575i) {
        if (C3391wa.m16191a(i, i2)) {
            return new InterfaceC3031od.a<>(new C3529zh(uri), C3431xa.m16475a(this.f2796a, uri));
        }
        return null;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(Uri uri) {
        return C3391wa.m16192a(uri);
    }
}
