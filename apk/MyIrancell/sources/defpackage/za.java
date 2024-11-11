package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
class za {
    private static final va f = new va();
    private final va a;
    private final ya b;
    private final bc c;
    private final ContentResolver d;
    private final List<ImageHeaderParser> e;

    za(List<ImageHeaderParser> list, va vaVar, ya yaVar, bc bcVar, ContentResolver contentResolver) {
        this.a = vaVar;
        this.b = yaVar;
        this.c = bcVar;
        this.d = contentResolver;
        this.e = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public za(List<ImageHeaderParser> list, ya yaVar, bc bcVar, ContentResolver contentResolver) {
        this(list, f, yaVar, bcVar, contentResolver);
    }

    private boolean a(File file) {
        return this.a.a(file) && 0 < this.a.b(file);
    }

    private String c(Uri uri) {
        Cursor a = this.b.a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    return a.getString(0);
                }
            } finally {
                if (a != null) {
                    a.close();
                }
            }
        }
        if (a != null) {
            a.close();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.d.openInputStream(uri);
                int a = f.a(this.e, inputStream, this.c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return a;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    String str = "Failed to open uri: " + uri;
                }
                if (inputStream == null) {
                    return -1;
                }
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public InputStream b(Uri uri) {
        String c = c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File a = this.a.a(c);
        if (!a(a)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(a);
        try {
            return this.d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }
}
