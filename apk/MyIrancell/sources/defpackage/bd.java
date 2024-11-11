package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.i;
import defpackage.od;
import java.io.InputStream;

/* loaded from: classes.dex */
public class bd<Data> implements od<Uri, Data> {
    private static final int c = 22;
    private final AssetManager a;
    private final a<Data> b;

    /* loaded from: classes.dex */
    public interface a<Data> {
        ka<Data> a(AssetManager assetManager, String str);
    }

    /* loaded from: classes.dex */
    public static class b implements pd<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // bd.a
        public ka<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new oa(assetManager, str);
        }

        @Override // defpackage.pd
        public od<Uri, ParcelFileDescriptor> a(sd sdVar) {
            return new bd(this.a, this);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements pd<Uri, InputStream>, a<InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // bd.a
        public ka<InputStream> a(AssetManager assetManager, String str) {
            return new ta(assetManager, str);
        }

        @Override // defpackage.pd
        public od<Uri, InputStream> a(sd sdVar) {
            return new bd(this.a, this);
        }
    }

    public bd(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    @Override // defpackage.od
    public od.a<Data> a(Uri uri, int i, int i2, i iVar) {
        return new od.a<>(new zh(uri), this.b.a(this.a, uri.toString().substring(c)));
    }

    @Override // defpackage.od
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
