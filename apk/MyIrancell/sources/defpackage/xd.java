package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.i;
import defpackage.od;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class xd<Data> implements od<Uri, Data> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    private final c<Data> a;

    /* loaded from: classes.dex */
    public static final class a implements pd<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xd.c
        public ka<AssetFileDescriptor> a(Uri uri) {
            return new ha(this.a, uri);
        }

        @Override // defpackage.pd
        public od<Uri, AssetFileDescriptor> a(sd sdVar) {
            return new xd(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements pd<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xd.c
        public ka<ParcelFileDescriptor> a(Uri uri) {
            return new pa(this.a, uri);
        }

        @Override // defpackage.pd
        public od<Uri, ParcelFileDescriptor> a(sd sdVar) {
            return new xd(this);
        }
    }

    /* loaded from: classes.dex */
    public interface c<Data> {
        ka<Data> a(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class d implements pd<Uri, InputStream>, c<InputStream> {
        private final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xd.c
        public ka<InputStream> a(Uri uri) {
            return new ua(this.a, uri);
        }

        @Override // defpackage.pd
        public od<Uri, InputStream> a(sd sdVar) {
            return new xd(this);
        }
    }

    public xd(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // defpackage.od
    public od.a<Data> a(Uri uri, int i, int i2, i iVar) {
        return new od.a<>(new zh(uri), this.a.a(uri));
    }

    @Override // defpackage.od
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
