package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ka;
import defpackage.od;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class ld implements od<Uri, File> {
    private final Context a;

    /* loaded from: classes.dex */
    public static final class a implements pd<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.pd
        public od<Uri, File> a(sd sdVar) {
            return new ld(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements ka<File> {
        private static final String[] d = {"_data"};
        private final Context b;
        private final Uri c;

        b(Context context, Uri uri) {
            this.b = context;
            this.c = uri;
        }

        @Override // defpackage.ka
        public Class<File> a() {
            return File.class;
        }

        @Override // defpackage.ka
        public void a(g gVar, ka.a<? super File> aVar) {
            Cursor query = this.b.getContentResolver().query(this.c, d, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.a((ka.a<? super File>) new File(r0));
                return;
            }
            aVar.a((Exception) new FileNotFoundException("Failed to find file path for: " + this.c));
        }

        @Override // defpackage.ka
        public void b() {
        }

        @Override // defpackage.ka
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // defpackage.ka
        public void cancel() {
        }
    }

    public ld(Context context) {
        this.a = context;
    }

    @Override // defpackage.od
    public od.a<File> a(Uri uri, int i, int i2, i iVar) {
        return new od.a<>(new zh(uri), new b(this.a, uri));
    }

    @Override // defpackage.od
    public boolean a(Uri uri) {
        return wa.b(uri);
    }
}
