package p000;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C0575i;
import java.io.InputStream;
import p000.InterfaceC3031od;

/* renamed from: bd */
/* loaded from: classes.dex */
public class C0476bd<Data> implements InterfaceC3031od<Uri, Data> {

    /* renamed from: c */
    private static final int f2791c = 22;

    /* renamed from: a */
    private final AssetManager f2792a;

    /* renamed from: b */
    private final a<Data> f2793b;

    /* renamed from: bd$a */
    /* loaded from: classes.dex */
    public interface a<Data> {
        /* renamed from: a */
        InterfaceC2853ka<Data> mo3380a(AssetManager assetManager, String str);
    }

    /* renamed from: bd$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC3081pd<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f2794a;

        public b(AssetManager assetManager) {
            this.f2794a = assetManager;
        }

        @Override // p000.C0476bd.a
        /* renamed from: a */
        public InterfaceC2853ka<ParcelFileDescriptor> mo3380a(AssetManager assetManager, String str) {
            return new C3022oa(assetManager, str);
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Uri, ParcelFileDescriptor> mo139a(C3206sd c3206sd) {
            return new C0476bd(this.f2794a, this);
        }
    }

    /* renamed from: bd$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC3081pd<Uri, InputStream>, a<InputStream> {

        /* renamed from: a */
        private final AssetManager f2795a;

        public c(AssetManager assetManager) {
            this.f2795a = assetManager;
        }

        @Override // p000.C0476bd.a
        /* renamed from: a */
        public InterfaceC2853ka<InputStream> mo3380a(AssetManager assetManager, String str) {
            return new C3254ta(assetManager, str);
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Uri, InputStream> mo139a(C3206sd c3206sd) {
            return new C0476bd(this.f2795a, this);
        }
    }

    public C0476bd(AssetManager assetManager, a<Data> aVar) {
        this.f2792a = assetManager;
        this.f2793b = aVar;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<Data> mo137a(Uri uri, int i, int i2, C0575i c0575i) {
        return new InterfaceC3031od.a<>(new C3529zh(uri), this.f2793b.mo3380a(this.f2792a, uri.toString().substring(f2791c)));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
