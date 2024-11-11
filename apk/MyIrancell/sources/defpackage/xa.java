package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.g;
import defpackage.ka;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class xa implements ka<InputStream> {
    private final Uri b;
    private final za c;
    private InputStream d;

    /* loaded from: classes.dex */
    static class a implements ya {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.ya
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* loaded from: classes.dex */
    static class b implements ya {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.ya
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    xa(Uri uri, za zaVar) {
        this.b = uri;
        this.c = zaVar;
    }

    public static xa a(Context context, Uri uri) {
        return a(context, uri, new a(context.getContentResolver()));
    }

    private static xa a(Context context, Uri uri, ya yaVar) {
        return new xa(uri, new za(c.b(context).g().a(), yaVar, c.b(context).b(), context.getContentResolver()));
    }

    public static xa b(Context context, Uri uri) {
        return a(context, uri, new b(context.getContentResolver()));
    }

    private InputStream d() {
        InputStream b2 = this.c.b(this.b);
        int a2 = b2 != null ? this.c.a(this.b) : -1;
        return a2 != -1 ? new na(b2, a2) : b2;
    }

    @Override // defpackage.ka
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.ka
    public void a(g gVar, ka.a<? super InputStream> aVar) {
        try {
            InputStream d = d();
            this.d = d;
            aVar.a((ka.a<? super InputStream>) d);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.a((Exception) e);
        }
    }

    @Override // defpackage.ka
    public void b() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.ka
    public com.bumptech.glide.load.a c() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // defpackage.ka
    public void cancel() {
    }
}
